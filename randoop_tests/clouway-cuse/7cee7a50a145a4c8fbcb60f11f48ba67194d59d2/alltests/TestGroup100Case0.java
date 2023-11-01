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
        com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer idFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer();
        java.lang.reflect.Field field2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = idFieldIndexer0.index("", field2, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.lang.String str1 = com.clouway.cuse.spi.EscapeUtil.escape("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.util.Date date0 = null;
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.lessThanOrEqualTo(date0);
        org.junit.Assert.assertNotNull(searchFilter1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        com.clouway.cuse.gae.filedindexing.dateindex.DateFieldCriteria dateFieldCriteria0 = new com.clouway.cuse.gae.filedindexing.dateindex.DateFieldCriteria();
        java.lang.reflect.Field field1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = dateFieldCriteria0.match(field1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        com.clouway.cuse.gae.FieldNotAccessibleException fieldNotAccessibleException0 = new com.clouway.cuse.gae.FieldNotAccessibleException();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer fullWordSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer fullWordSearchFieldIndexer3 = new com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = fullWordSearchFieldIndexer0.index("hi!", field2, (java.lang.Object) fullWordSearchFieldIndexer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        // The following exception was thrown during execution in test generation
        try {
            com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.is("");
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.EmptySearchFilterException; message: null");
        } catch (com.clouway.cuse.spi.EmptySearchFilterException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer fullWordSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.SortType sortType3 = com.clouway.cuse.spi.SortType.NUMERIC;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = fullWordSearchFieldIndexer0.index("hi!", field2, (java.lang.Object) sortType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + sortType3 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType3.equals(com.clouway.cuse.spi.SortType.NUMERIC));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.equalTo(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.IdConverterCatalog idConverterCatalog1 = null;
        com.clouway.cuse.spi.SearchEngine searchEngine2 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, idConverterCatalog1);
        java.util.List<java.lang.Long> longList4 = null;
        // The following exception was thrown during execution in test generation
        try {
            searchEngine2.delete("hi!", longList4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchEngine2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.clouway.cuse.gae.filedindexing.dateindex.DateFieldCriteria dateFieldCriteria0 = new com.clouway.cuse.gae.filedindexing.dateindex.DateFieldCriteria();
        java.lang.reflect.Field field1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = dateFieldCriteria0.match(field1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.String str1 = com.clouway.cuse.spi.EscapeUtil.escape("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldCriteria fullWordSearchFieldCriteria0 = new com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldCriteria();
        java.lang.reflect.Field field1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = fullWordSearchFieldCriteria0.match(field1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder gaeSearchApiMatchedIdObjectFinder0 = new com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        com.clouway.cuse.spi.SortOrder sortOrder10 = null;
        com.clouway.cuse.spi.SortType sortType11 = com.clouway.cuse.spi.SortType.TEXT;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList12 = gaeSearchApiMatchedIdObjectFinder0.find("", (java.util.List<java.lang.String>) strList5, (int) (short) 0, (int) (byte) 100, "hi!", sortOrder10, sortType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + sortType11 + "' != '" + com.clouway.cuse.spi.SortType.TEXT + "'", sortType11.equals(com.clouway.cuse.spi.SortType.TEXT));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer idFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList5 = idFieldIndexer0.index("", field2, (java.lang.Object) searchFilter4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer idFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer();
        java.lang.reflect.Field field2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        com.clouway.cuse.spi.filters.SearchFilter searchFilter7 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList8 = idFieldIndexer0.index("hi!", field2, (java.lang.Object) strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(searchFilter7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str2 = longIdConverter0.convertFrom((java.lang.Object) (short) 100);
        java.lang.String[] strArray6 = new java.lang.String[] { "0:0 ", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList9 = longIdConverter0.convert((java.util.List<java.lang.String>) strList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0:0 \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.util.Date date0 = null;
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.lessThan(date0);
        org.junit.Assert.assertNotNull(searchFilter1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.is("0: 0: ");
        org.junit.Assert.assertNotNull(searchFilter1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer atomicFiledIndexer0 = new com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer();
        java.lang.reflect.Field field2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = atomicFiledIndexer0.index("0", field2, (java.lang.Object) ":( OR )");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder gaeSearchApiMatchedIdObjectFinder0 = new com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter3 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.lang.String str9 = searchFilter3.getValue((java.util.List<java.lang.String>) strList7);
        java.lang.String[] strArray12 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.lang.String str15 = searchFilter3.getValue((java.util.List<java.lang.String>) strList13);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter16 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList13);
        com.clouway.cuse.spi.SortOrder sortOrder20 = com.clouway.cuse.spi.SortOrder.ASCENDING;
        com.clouway.cuse.spi.SortType sortType21 = com.clouway.cuse.spi.SortType.TEXT;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList22 = gaeSearchApiMatchedIdObjectFinder0.find("", (java.util.List<java.lang.String>) strList13, (int) '4', (int) 'a', "", sortOrder20, sortType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index name null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0:0 " + "'", str15, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter16);
        org.junit.Assert.assertTrue("'" + sortOrder20 + "' != '" + com.clouway.cuse.spi.SortOrder.ASCENDING + "'", sortOrder20.equals(com.clouway.cuse.spi.SortOrder.ASCENDING));
        org.junit.Assert.assertTrue("'" + sortType21 + "' != '" + com.clouway.cuse.spi.SortType.TEXT + "'", sortType21.equals(com.clouway.cuse.spi.SortType.TEXT));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.clouway.cuse.gae.filedindexing.atomic.AtomicFieldCriteria atomicFieldCriteria0 = new com.clouway.cuse.gae.filedindexing.atomic.AtomicFieldCriteria();
        java.lang.reflect.Field field1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = atomicFieldCriteria0.match(field1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException1 = new com.clouway.cuse.spi.IndexCreationFailureException("");
        com.clouway.cuse.spi.NotConfiguredIndexingStrategyException notConfiguredIndexingStrategyException2 = new com.clouway.cuse.spi.NotConfiguredIndexingStrategyException();
        indexCreationFailureException1.addSuppressed((java.lang.Throwable) notConfiguredIndexingStrategyException2);
        java.lang.String str4 = indexCreationFailureException1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.clouway.cuse.spi.IndexCreationFailureException: " + "'", str4, "com.clouway.cuse.spi.IndexCreationFailureException: ");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.clouway.cuse.spi.SearchEngineFactory searchEngineFactory0 = new com.clouway.cuse.spi.SearchEngineFactory();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(searchFilter1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldCriteria fullWordSearchFieldCriteria0 = new com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldCriteria();
        java.lang.reflect.Field field1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = fullWordSearchFieldCriteria0.match(field1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer fullWordSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = fullWordSearchFieldIndexer0.index("hi!", field2, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.IdConverterCatalog idConverterCatalog1 = null;
        com.clouway.cuse.spi.SearchEngine searchEngine2 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, idConverterCatalog1);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        java.lang.String[] strArray13 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.lang.String str16 = searchFilter4.getValue((java.util.List<java.lang.String>) strList14);
        // The following exception was thrown during execution in test generation
        try {
            searchEngine2.registerAll((java.util.List<java.lang.String>) strList14);
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.SearchIndexMissingException; message: null");
        } catch (com.clouway.cuse.spi.SearchIndexMissingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchEngine2);
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0:0 " + "'", str16, "0:0 ");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(searchFilter1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.clouway.cuse.spi.SearchLimitExceededException searchLimitExceededException0 = new com.clouway.cuse.spi.SearchLimitExceededException();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer idFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.NotConfiguredIdConvertorException notConfiguredIdConvertorException3 = new com.clouway.cuse.spi.NotConfiguredIdConvertorException();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = idFieldIndexer0.index("0:0 ", field2, (java.lang.Object) notConfiguredIdConvertorException3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: 0:0 ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.IdConverterCatalog idConverterCatalog1 = null;
        com.clouway.cuse.spi.SearchEngine searchEngine2 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, idConverterCatalog1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 0L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // The following exception was thrown during execution in test generation
        try {
            searchEngine2.delete("0:0 ", (java.util.List<java.lang.Long>) longList8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index name must be ASCII visible printable: 0:0 ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchEngine2);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        java.lang.String str1 = com.clouway.cuse.spi.EscapeUtil.escape("com.clouway.cuse.spi.IndexCreationFailureException: ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.clouway.cuse.spi.IndexCreationFailureException\\: " + "'", str1, "com.clouway.cuse.spi.IndexCreationFailureException\\: ");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer atomicFiledIndexer0 = new com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer();
        java.lang.reflect.Field field2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = atomicFiledIndexer0.index("0", field2, (java.lang.Object) ":0 OR :0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer idFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder gaeSearchApiMatchedIdObjectFinder3 = new com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = idFieldIndexer0.index("0", field2, (java.lang.Object) gaeSearchApiMatchedIdObjectFinder3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(searchFilter1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.clouway.cuse.spi.NotConfiguredIndexingStrategyException notConfiguredIndexingStrategyException0 = new com.clouway.cuse.spi.NotConfiguredIndexingStrategyException();
        java.lang.String str1 = notConfiguredIndexingStrategyException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException" + "'", str1, "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.is("com.clouway.cuse.spi.IndexCreationFailureException: ");
        org.junit.Assert.assertNotNull(searchFilter1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.IdConverterCatalog idConverterCatalog1 = null;
        com.clouway.cuse.spi.SearchEngine searchEngine2 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, idConverterCatalog1);
        // The following exception was thrown during execution in test generation
        try {
            searchEngine2.register((java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.NotConfiguredIndexingStrategyException; message: null");
        } catch (com.clouway.cuse.spi.NotConfiguredIndexingStrategyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchEngine2);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer atomicFiledIndexer0 = new com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer();
        java.lang.reflect.Field field2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = atomicFiledIndexer0.index("0:0 ", field2, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: 0:0 ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.is("0:0 ");
        org.junit.Assert.assertNotNull(searchFilter1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer fullWordSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException3 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass4 = searchIndexMissmatchException3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList5 = fullWordSearchFieldIndexer0.index("hi!", field2, (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException1 = new com.clouway.cuse.spi.IndexCreationFailureException("0: 0: ");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer idFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.gae.filters.SearchFilters searchFilters3 = new com.clouway.cuse.gae.filters.SearchFilters();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = idFieldIndexer0.index("com.clouway.cuse.spi.IndexCreationFailureException\\: ", field2, (java.lang.Object) searchFilters3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: com.clouway.cuse.spi.IndexCreationFailureException\\: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.clouway.cuse.gae.filedindexing.dateindex.DateFieldIndexer dateFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.dateindex.DateFieldIndexer();
        java.lang.reflect.Field field2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = dateFieldIndexer0.index("com.clouway.cuse.spi.IndexCreationFailureException: ", field2, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to java.util.Date");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder gaeSearchApiMatchedIdObjectFinder0 = new com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder();
        com.clouway.cuse.spi.LongIdConverter longIdConverter2 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        java.lang.String[] strArray13 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.lang.String str16 = searchFilter4.getValue((java.util.List<java.lang.String>) strList14);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter17 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList14);
        java.util.List<java.lang.Long> longList18 = longIdConverter2.convert((java.util.List<java.lang.String>) strList14);
        com.clouway.cuse.spi.SortOrder sortOrder22 = com.clouway.cuse.spi.SortOrder.ASCENDING;
        com.clouway.cuse.spi.SortType sortType23 = com.clouway.cuse.spi.SortType.TEXT;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList24 = gaeSearchApiMatchedIdObjectFinder0.find("", (java.util.List<java.lang.String>) strList14, (int) (short) 100, (int) '#', "0:0 ", sortOrder22, sortType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse sort expression '0:0 ': parse error at line 1 position 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0:0 " + "'", str16, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter17);
        org.junit.Assert.assertNotNull(longList18);
        org.junit.Assert.assertTrue("'" + sortOrder22 + "' != '" + com.clouway.cuse.spi.SortOrder.ASCENDING + "'", sortOrder22.equals(com.clouway.cuse.spi.SortOrder.ASCENDING));
        org.junit.Assert.assertTrue("'" + sortType23 + "' != '" + com.clouway.cuse.spi.SortType.TEXT + "'", sortType23.equals(com.clouway.cuse.spi.SortType.TEXT));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.clouway.cuse.gae.filedindexing.idindexer.IdFieldCriteria idFieldCriteria0 = new com.clouway.cuse.gae.filedindexing.idindexer.IdFieldCriteria();
        java.lang.reflect.Field field1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = idFieldCriteria0.match(field1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.IdConverterCatalog idConverterCatalog1 = null;
        com.clouway.cuse.spi.SearchEngine searchEngine2 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, idConverterCatalog1);
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            searchEngine2.register(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchEngine2);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        java.util.Date date0 = null;
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.greaterThan(date0);
        org.junit.Assert.assertNotNull(searchFilter1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.clouway.cuse.gae.filedindexing.fulltextindex.FullTextSearchFieldIndexer fullTextSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.fulltextindex.FullTextSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        com.clouway.cuse.spi.filters.SearchFilter searchFilter7 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray6);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter8 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList9 = fullTextSearchFieldIndexer0.index("com.clouway.cuse.spi.IndexCreationFailureException: ", field2, (java.lang.Object) searchFilter8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: com.clouway.cuse.spi.IndexCreationFailureException: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(searchFilter7);
        org.junit.Assert.assertNotNull(searchFilter8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(searchFilter1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer idFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer();
        java.lang.reflect.Field field2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = idFieldIndexer0.index("0", field2, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.clouway.cuse.gae.filedindexing.fulltextindex.FullTextSearchFieldCriteria fullTextSearchFieldCriteria0 = new com.clouway.cuse.gae.filedindexing.fulltextindex.FullTextSearchFieldCriteria();
        java.lang.reflect.Field field1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = fullTextSearchFieldCriteria0.match(field1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.is(":0 OR :0");
        org.junit.Assert.assertNotNull(searchFilter1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        java.lang.String str1 = com.clouway.cuse.spi.EscapeUtil.escape("0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.IdConverterCatalog idConverterCatalog1 = null;
        com.clouway.cuse.spi.SearchEngine searchEngine2 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, idConverterCatalog1);
        java.lang.String[] strArray11 = new java.lang.String[] { "0:0 ", "0:0 ", "com.clouway.cuse.spi.IndexCreationFailureException: ", "0: 0: ", "", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0", "0: 0: " };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            searchEngine2.registerAll((java.util.List<java.lang.String>) strList12);
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.SearchIndexMissingException; message: null");
        } catch (com.clouway.cuse.spi.SearchIndexMissingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchEngine2);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        java.lang.String str1 = com.clouway.cuse.spi.EscapeUtil.escape("com.clouway.cuse.spi.NotConfiguredIndexingStrategyException");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException" + "'", str1, "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        com.clouway.cuse.spi.StringIdConverter stringIdConverter0 = new com.clouway.cuse.spi.StringIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter2 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 100);
        java.lang.String str3 = stringIdConverter0.convertFrom((java.lang.Object) 100);
        java.lang.Object obj4 = null;
        java.lang.String str5 = stringIdConverter0.convertFrom(obj4);
        org.junit.Assert.assertNotNull(searchFilter2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        com.clouway.cuse.gae.filedindexing.searchindex.SimpleSearchFieldIndexer simpleSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.searchindex.SimpleSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList5 = simpleSearchFieldIndexer0.index(":( OR )", field2, (java.lang.Object) searchFilter4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: :( OR )");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        com.clouway.cuse.gae.filedindexing.dateindex.DateFieldIndexer dateFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.dateindex.DateFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer atomicFiledIndexer3 = new com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = dateFieldIndexer0.index(":( OR )", field2, (java.lang.Object) atomicFiledIndexer3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer cannot be cast to java.util.Date");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder gaeSearchApiMatchedIdObjectFinder0 = new com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter3 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.lang.String str9 = searchFilter3.getValue((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter10 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter11 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter12 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter14 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String str20 = searchFilter14.getValue((java.util.List<java.lang.String>) strList18);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter21 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList18);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter22 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList18);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter23 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList18);
        java.lang.String str24 = orSearchFilter12.getValue((java.util.List<java.lang.String>) strList18);
        com.clouway.cuse.spi.SortOrder sortOrder28 = com.clouway.cuse.spi.SortOrder.DESCENDING;
        com.clouway.cuse.spi.SortType sortType29 = com.clouway.cuse.spi.SortType.TEXT;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList30 = gaeSearchApiMatchedIdObjectFinder0.find("com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", (java.util.List<java.lang.String>) strList18, (-1), (int) (byte) 0, "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", sortOrder28, sortType29);
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.NegativeSearchLimitException; message: null");
        } catch (com.clouway.cuse.spi.NegativeSearchLimitException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(searchFilter14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertNotNull(searchFilter23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ":( OR )" + "'", str24, ":( OR )");
        org.junit.Assert.assertTrue("'" + sortOrder28 + "' != '" + com.clouway.cuse.spi.SortOrder.DESCENDING + "'", sortOrder28.equals(com.clouway.cuse.spi.SortOrder.DESCENDING));
        org.junit.Assert.assertTrue("'" + sortType29 + "' != '" + com.clouway.cuse.spi.SortType.TEXT + "'", sortType29.equals(com.clouway.cuse.spi.SortType.TEXT));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter2 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.lang.String str8 = searchFilter2.getValue((java.util.List<java.lang.String>) strList6);
        java.lang.String[] strArray11 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.lang.String str14 = searchFilter2.getValue((java.util.List<java.lang.String>) strList12);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter15 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList12);
        java.util.List<java.lang.Long> longList16 = longIdConverter0.convert((java.util.List<java.lang.String>) strList12);
        java.util.List<java.lang.String> strList17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList18 = longIdConverter0.convert(strList17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:0 " + "'", str14, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter15);
        org.junit.Assert.assertNotNull(longList16);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder gaeSearchApiMatchedIdObjectFinder0 = new com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter3 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.lang.String str9 = searchFilter3.getValue((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter10 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter11 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter12 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.spi.SortOrder sortOrder16 = com.clouway.cuse.spi.SortOrder.ASCENDING;
        com.clouway.cuse.spi.SortType sortType17 = com.clouway.cuse.spi.SortType.NUMERIC;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList18 = gaeSearchApiMatchedIdObjectFinder0.find("hi!", (java.util.List<java.lang.String>) strList7, (int) (short) 1, 0, "0:( OR )", sortOrder16, sortType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse sort expression '0:( OR )': parse error at line 1 position 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertTrue("'" + sortOrder16 + "' != '" + com.clouway.cuse.spi.SortOrder.ASCENDING + "'", sortOrder16.equals(com.clouway.cuse.spi.SortOrder.ASCENDING));
        org.junit.Assert.assertTrue("'" + sortType17 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType17.equals(com.clouway.cuse.spi.SortType.NUMERIC));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.clouway.cuse.gae.filedindexing.dateindex.DateFieldIndexer dateFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.dateindex.DateFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.SortType sortType3 = com.clouway.cuse.spi.SortType.TEXT;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = dateFieldIndexer0.index("com.clouway.cuse.spi.IndexCreationFailureException\\: ", field2, (java.lang.Object) sortType3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.clouway.cuse.spi.SortType cannot be cast to java.util.Date");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + sortType3 + "' != '" + com.clouway.cuse.spi.SortType.TEXT + "'", sortType3.equals(com.clouway.cuse.spi.SortType.TEXT));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder gaeSearchApiMatchedIdObjectFinder0 = new com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter3 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.lang.String str9 = searchFilter3.getValue((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter10 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter11 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter12 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter14 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String str20 = searchFilter14.getValue((java.util.List<java.lang.String>) strList18);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter21 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList18);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter22 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList18);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter23 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList18);
        java.lang.String str24 = orSearchFilter12.getValue((java.util.List<java.lang.String>) strList18);
        com.clouway.cuse.spi.SortOrder sortOrder28 = com.clouway.cuse.spi.SortOrder.DESCENDING;
        com.clouway.cuse.spi.SortType sortType29 = com.clouway.cuse.spi.SortType.TEXT;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList30 = gaeSearchApiMatchedIdObjectFinder0.find("com.clouway.cuse.spi.IndexCreationFailureException\\: ", (java.util.List<java.lang.String>) strList18, (-1), (int) (byte) 1, "0:( OR )", sortOrder28, sortType29);
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.NegativeSearchLimitException; message: null");
        } catch (com.clouway.cuse.spi.NegativeSearchLimitException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(searchFilter14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertNotNull(searchFilter23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ":( OR )" + "'", str24, ":( OR )");
        org.junit.Assert.assertTrue("'" + sortOrder28 + "' != '" + com.clouway.cuse.spi.SortOrder.DESCENDING + "'", sortOrder28.equals(com.clouway.cuse.spi.SortOrder.DESCENDING));
        org.junit.Assert.assertTrue("'" + sortType29 + "' != '" + com.clouway.cuse.spi.SortType.TEXT + "'", sortType29.equals(com.clouway.cuse.spi.SortType.TEXT));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException0 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Throwable[] throwableArray1 = searchIndexMissmatchException0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.is("hi!");
        org.junit.Assert.assertNotNull(searchFilter1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.IdConverterCatalog idConverterCatalog1 = null;
        com.clouway.cuse.spi.SearchEngine searchEngine2 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, idConverterCatalog1);
        com.clouway.cuse.spi.LongIdConverter longIdConverter4 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter6 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.lang.String str12 = searchFilter6.getValue((java.util.List<java.lang.String>) strList10);
        java.lang.String[] strArray15 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.lang.String str18 = searchFilter6.getValue((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter19 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList16);
        java.util.List<java.lang.Long> longList20 = longIdConverter4.convert((java.util.List<java.lang.String>) strList16);
        // The following exception was thrown during execution in test generation
        try {
            searchEngine2.delete("hi!", longList20);
            org.junit.Assert.fail("Expected exception of type com.google.apphosting.api.ApiProxy.CallNotFoundException; message: Can't make API call search.DeleteDocument in a thread that is neither the original request thread nor a thread created by ThreadManager");
        } catch (com.google.apphosting.api.ApiProxy.CallNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchEngine2);
        org.junit.Assert.assertNotNull(searchFilter6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0:0 " + "'", str18, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter19);
        org.junit.Assert.assertNotNull(longList20);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.IdConverterCatalog idConverterCatalog1 = null;
        com.clouway.cuse.spi.SearchEngine searchEngine2 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, idConverterCatalog1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 0L, 1L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // The following exception was thrown during execution in test generation
        try {
            searchEngine2.delete("0:( OR )", (java.util.List<java.lang.Long>) longList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index name must be ASCII visible printable: 0:( OR )");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchEngine2);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer idFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter12 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter14 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String str20 = searchFilter14.getValue((java.util.List<java.lang.String>) strList18);
        java.lang.String[] strArray23 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.lang.String str26 = searchFilter14.getValue((java.util.List<java.lang.String>) strList24);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter27 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList24);
        java.lang.String str28 = equalitySearchFilter12.getValue((java.util.List<java.lang.String>) strList24);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList29 = idFieldIndexer0.index("0: 0: ", field2, (java.lang.Object) equalitySearchFilter12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: 0: 0: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(searchFilter14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0:0 " + "'", str26, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0: 0: " + "'", str28, "0: 0: ");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter13 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.lang.String str19 = searchFilter13.getValue((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter20 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList17);
        java.lang.String str21 = orSearchFilter11.getValue((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy22 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.registerAll((java.util.List<java.lang.String>) strList17, indexingStrategy22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(searchFilter13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":( OR )" + "'", str21, ":( OR )");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer fullWordSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter12 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter14 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String str20 = searchFilter14.getValue((java.util.List<java.lang.String>) strList18);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter21 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList18);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter23 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.lang.String str29 = searchFilter23.getValue((java.util.List<java.lang.String>) strList27);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter30 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList27);
        java.lang.String str31 = orSearchFilter21.getValue((java.util.List<java.lang.String>) strList27);
        java.lang.String str32 = equalitySearchFilter12.getValue((java.util.List<java.lang.String>) strList27);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter34 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter36 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.lang.String str42 = searchFilter36.getValue((java.util.List<java.lang.String>) strList40);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter43 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList40);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter44 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList40);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter45 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList40);
        java.lang.String str46 = multiFieldValueFilter34.getValue((java.util.List<java.lang.String>) strList40);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter47 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList40);
        java.lang.String str48 = equalitySearchFilter12.getValue((java.util.List<java.lang.String>) strList40);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList49 = fullWordSearchFieldIndexer0.index("hi!", field2, (java.lang.Object) equalitySearchFilter12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(searchFilter14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertNotNull(searchFilter23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ":( OR )" + "'", str31, ":( OR )");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(searchFilter36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0" + "'", str42, "0");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + ":0 OR :0" + "'", str46, ":0 OR :0");
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer fullWordSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter13 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.lang.String str19 = searchFilter13.getValue((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter20 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList17);
        java.lang.String str21 = orSearchFilter11.getValue((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter22 = com.clouway.cuse.gae.filters.SearchFilters.is((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter23 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter24 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList25 = fullWordSearchFieldIndexer0.index(":0 OR :0", field2, (java.lang.Object) strList17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: :0 OR :0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(searchFilter13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":( OR )" + "'", str21, ":( OR )");
        org.junit.Assert.assertNotNull(searchFilter22);
        org.junit.Assert.assertNotNull(searchFilter24);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        java.lang.String[] strArray6 = new java.lang.String[] { ":( OR )", "hi!", "com.clouway.cuse.spi.IndexCreationFailureException: " };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter9 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy10 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.registerAll((java.util.List<java.lang.String>) strList7, indexingStrategy10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(searchFilter9);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.delete("com.clouway.cuse.spi.IndexCreationFailureException\\: ", (java.util.List<java.lang.Long>) longList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.delete("0:( OR )", (java.util.List<java.lang.Long>) longList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.clouway.cuse.gae.filedindexing.fulltextindex.FullTextSearchFieldIndexer fullTextSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.fulltextindex.FullTextSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = fullTextSearchFieldIndexer0.index("hi!", field2, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder gaeSearchApiMatchedIdObjectFinder0 = new com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter3 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.lang.String str9 = searchFilter3.getValue((java.util.List<java.lang.String>) strList7);
        java.lang.String[] strArray12 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.lang.String str15 = searchFilter3.getValue((java.util.List<java.lang.String>) strList13);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter16 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList13);
        com.clouway.cuse.spi.SortOrder sortOrder20 = com.clouway.cuse.spi.SortOrder.DESCENDING;
        com.clouway.cuse.spi.SortType sortType21 = com.clouway.cuse.spi.SortType.TEXT;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList22 = gaeSearchApiMatchedIdObjectFinder0.find("0:( OR )", (java.util.List<java.lang.String>) strList13, (int) (short) 0, (int) (short) 100, "", sortOrder20, sortType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index name must be ASCII visible printable: 0:( OR )");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0:0 " + "'", str15, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter16);
        org.junit.Assert.assertTrue("'" + sortOrder20 + "' != '" + com.clouway.cuse.spi.SortOrder.DESCENDING + "'", sortOrder20.equals(com.clouway.cuse.spi.SortOrder.DESCENDING));
        org.junit.Assert.assertTrue("'" + sortType21 + "' != '" + com.clouway.cuse.spi.SortType.TEXT + "'", sortType21.equals(com.clouway.cuse.spi.SortType.TEXT));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer fullWordSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = fullWordSearchFieldIndexer0.index(":0 OR :0", field2, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: :0 OR :0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer atomicFiledIndexer0 = new com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer();
        java.lang.reflect.Field field2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "com.clouway.cuse.spi.IndexCreationFailureException: ", "com.clouway.cuse.spi.IndexCreationFailureException\\: ", "0", "0: 0: ", "", ":0 OR :0" };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter10 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray9);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter11 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList12 = atomicFiledIndexer0.index("hi!", field2, (java.lang.Object) strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(searchFilter11);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter13 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.lang.String str19 = searchFilter13.getValue((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter20 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList17);
        java.lang.String str21 = orSearchFilter11.getValue((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy22 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.registerAll((java.util.List<java.lang.String>) strList17, indexingStrategy22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(searchFilter13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":( OR )" + "'", str21, ":( OR )");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer atomicFiledIndexer0 = new com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer();
        java.lang.reflect.Field field2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = atomicFiledIndexer0.index(":0 OR :0", field2, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: :0 OR :0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog1 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException2 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass3 = searchIndexMissmatchException2.getClass();
        com.clouway.cuse.spi.IdConverter idConverter4 = defaultIdConverterCatalog1.getConverter((java.lang.Class) wildcardClass3);
        com.clouway.cuse.spi.SearchEngine searchEngine5 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog1);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter7 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.lang.String str13 = searchFilter7.getValue((java.util.List<java.lang.String>) strList11);
        java.lang.String[] strArray16 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.lang.String str19 = searchFilter7.getValue((java.util.List<java.lang.String>) strList17);
        // The following exception was thrown during execution in test generation
        try {
            searchEngine5.registerAll((java.util.List<java.lang.String>) strList17);
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.SearchIndexMissingException; message: null");
        } catch (com.clouway.cuse.spi.SearchIndexMissingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(idConverter4);
        org.junit.Assert.assertNotNull(searchEngine5);
        org.junit.Assert.assertNotNull(searchFilter7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0:0 " + "'", str19, "0:0 ");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.clouway.cuse.gae.filedindexing.searchindex.SimpleSearchFieldIndexer simpleSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.searchindex.SimpleSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.LongIdConverter longIdConverter3 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str5 = longIdConverter3.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str7 = longIdConverter3.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter8 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter10 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.lang.String str16 = searchFilter10.getValue((java.util.List<java.lang.String>) strList14);
        java.lang.String[] strArray19 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.lang.String str22 = searchFilter10.getValue((java.util.List<java.lang.String>) strList20);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter23 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList20);
        java.util.List<java.lang.Long> longList24 = longIdConverter8.convert((java.util.List<java.lang.String>) strList20);
        java.util.List<java.lang.Long> longList25 = longIdConverter3.convert((java.util.List<java.lang.String>) strList20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList26 = simpleSearchFieldIndexer0.index("0:0 ", field2, (java.lang.Object) longIdConverter3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: 0:0 ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(searchFilter10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0:0 " + "'", str22, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter23);
        org.junit.Assert.assertNotNull(longList24);
        org.junit.Assert.assertNotNull(longList25);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.delete(":0 OR :0", (java.util.List<java.lang.Long>) longList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer idFieldIndexer3 = new com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer();
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy4 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.register((java.lang.Object) idFieldIndexer3, indexingStrategy4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        java.lang.String[] strArray6 = new java.lang.String[] { ":( OR )", "hi!", "com.clouway.cuse.spi.IndexCreationFailureException: " };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter9 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter10 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy11 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.registerAll((java.util.List<java.lang.String>) strList7, indexingStrategy11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(searchFilter9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        com.clouway.cuse.gae.filedindexing.atomic.AtomicFieldCriteria atomicFieldCriteria0 = new com.clouway.cuse.gae.filedindexing.atomic.AtomicFieldCriteria();
        java.lang.reflect.Field field1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = atomicFieldCriteria0.match(field1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.is("0:( OR )");
        org.junit.Assert.assertNotNull(searchFilter1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.gae.filedindexing.dateindex.DateFieldCriteria dateFieldCriteria3 = new com.clouway.cuse.gae.filedindexing.dateindex.DateFieldCriteria();
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy4 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.register((java.lang.Object) dateFieldCriteria3, indexingStrategy4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.IdConverterCatalog idConverterCatalog1 = null;
        com.clouway.cuse.spi.SearchEngine searchEngine2 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, idConverterCatalog1);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter12 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter13 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        // The following exception was thrown during execution in test generation
        try {
            searchEngine2.registerAll((java.util.List<java.lang.String>) strList8);
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.SearchIndexMissingException; message: null");
        } catch (com.clouway.cuse.spi.SearchIndexMissingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchEngine2);
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.clouway.cuse.spi.EmptySearchFilterException emptySearchFilterException0 = new com.clouway.cuse.spi.EmptySearchFilterException();
        com.clouway.cuse.spi.NotConfiguredIndexingStrategyException notConfiguredIndexingStrategyException1 = new com.clouway.cuse.spi.NotConfiguredIndexingStrategyException();
        com.clouway.cuse.spi.EmptySearchFilterException emptySearchFilterException2 = new com.clouway.cuse.spi.EmptySearchFilterException();
        notConfiguredIndexingStrategyException1.addSuppressed((java.lang.Throwable) emptySearchFilterException2);
        emptySearchFilterException0.addSuppressed((java.lang.Throwable) notConfiguredIndexingStrategyException1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 10L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.delete("", (java.util.List<java.lang.Long>) longList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter1 = new com.clouway.cuse.gae.filters.EqualitySearchFilter("");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.clouway.cuse.gae.filedindexing.searchindex.SimpleSearchFieldIndexer simpleSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.searchindex.SimpleSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = simpleSearchFieldIndexer0.index("hi!", field2, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(searchFilter1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer fullWordSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter12 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter14 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String str20 = searchFilter14.getValue((java.util.List<java.lang.String>) strList18);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter21 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList18);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter23 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.lang.String str29 = searchFilter23.getValue((java.util.List<java.lang.String>) strList27);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter30 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList27);
        java.lang.String str31 = orSearchFilter21.getValue((java.util.List<java.lang.String>) strList27);
        java.lang.String str32 = equalitySearchFilter12.getValue((java.util.List<java.lang.String>) strList27);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList33 = fullWordSearchFieldIndexer0.index("0:( OR )", field2, (java.lang.Object) str32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: 0:( OR )");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(searchFilter14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertNotNull(searchFilter23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ":( OR )" + "'", str31, ":( OR )");
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.IdConverterCatalog idConverterCatalog1 = null;
        com.clouway.cuse.spi.SearchEngine searchEngine2 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, idConverterCatalog1);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        // The following exception was thrown during execution in test generation
        try {
            searchEngine2.registerAll((java.util.List<java.lang.String>) strList8);
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.SearchIndexMissingException; message: null");
        } catch (com.clouway.cuse.spi.SearchIndexMissingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchEngine2);
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.IdConverterCatalog idConverterCatalog1 = null;
        com.clouway.cuse.spi.SearchEngine searchEngine2 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, idConverterCatalog1);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException4 = new com.clouway.cuse.spi.IndexCreationFailureException("");
        com.clouway.cuse.spi.NotConfiguredIndexingStrategyException notConfiguredIndexingStrategyException5 = new com.clouway.cuse.spi.NotConfiguredIndexingStrategyException();
        indexCreationFailureException4.addSuppressed((java.lang.Throwable) notConfiguredIndexingStrategyException5);
        // The following exception was thrown during execution in test generation
        try {
            searchEngine2.register((java.lang.Object) notConfiguredIndexingStrategyException5);
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.NotConfiguredIndexingStrategyException; message: null");
        } catch (com.clouway.cuse.spi.NotConfiguredIndexingStrategyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchEngine2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.clouway.cuse.gae.filedindexing.fulltextindex.FullTextSearchFieldIndexer fullTextSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.fulltextindex.FullTextSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = fullTextSearchFieldIndexer0.index("0:hi! OR 0:hi!", field2, obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: 0:hi! OR 0:hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        com.clouway.cuse.gae.filedindexing.fulltextindex.FullTextSearchFieldIndexer fullTextSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.fulltextindex.FullTextSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.EscapeUtil escapeUtil3 = new com.clouway.cuse.spi.EscapeUtil();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = fullTextSearchFieldIndexer0.index("0:0 ", field2, (java.lang.Object) escapeUtil3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: 0:0 ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter2 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.lang.String str8 = searchFilter2.getValue((java.util.List<java.lang.String>) strList6);
        java.lang.String[] strArray11 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.lang.String str14 = searchFilter2.getValue((java.util.List<java.lang.String>) strList12);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter15 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList12);
        java.util.List<java.lang.Long> longList16 = longIdConverter0.convert((java.util.List<java.lang.String>) strList12);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException18 = new com.clouway.cuse.spi.IndexCreationFailureException(":( OR )");
        java.lang.String str19 = longIdConverter0.convertFrom((java.lang.Object) ":( OR )");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter21 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.lang.String str27 = searchFilter21.getValue((java.util.List<java.lang.String>) strList25);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter28 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList25);
        java.lang.String[] strArray39 = new java.lang.String[] { "0:( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: ", "com.clouway.cuse.spi.IndexCreationFailureException: ", "0: 0: ", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", ":( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: " };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.lang.String str42 = orSearchFilter28.getValue((java.util.List<java.lang.String>) strList40);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter43 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList40);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList44 = longIdConverter0.convert((java.util.List<java.lang.String>) strList40);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0:( OR )\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:0 " + "'", str14, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter15);
        org.junit.Assert.assertNotNull(longList16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(searchFilter21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0:( OR ):( OR )" + "'", str42, "0:( OR ):( OR )");
        org.junit.Assert.assertNotNull(searchFilter43);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder gaeSearchApiMatchedIdObjectFinder0 = new com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder();
        com.clouway.cuse.spi.LongIdConverter longIdConverter2 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str4 = longIdConverter2.convertFrom((java.lang.Object) 10.0d);
        com.clouway.cuse.spi.LongIdConverter longIdConverter5 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter7 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.lang.String str13 = searchFilter7.getValue((java.util.List<java.lang.String>) strList11);
        java.lang.String[] strArray16 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.lang.String str19 = searchFilter7.getValue((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter20 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList17);
        java.util.List<java.lang.Long> longList21 = longIdConverter5.convert((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter22 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList17);
        java.util.List<java.lang.Long> longList23 = longIdConverter2.convert((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.spi.SortOrder sortOrder27 = com.clouway.cuse.spi.SortOrder.DESCENDING;
        com.clouway.cuse.spi.SortType sortType28 = com.clouway.cuse.spi.SortType.TEXT;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList29 = gaeSearchApiMatchedIdObjectFinder0.find("0", (java.util.List<java.lang.String>) strList17, (int) (byte) -1, (int) (byte) 100, "hi!", sortOrder27, sortType28);
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.NegativeSearchLimitException; message: null");
        } catch (com.clouway.cuse.spi.NegativeSearchLimitException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(searchFilter7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0:0 " + "'", str19, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter20);
        org.junit.Assert.assertNotNull(longList21);
        org.junit.Assert.assertNotNull(longList23);
        org.junit.Assert.assertTrue("'" + sortOrder27 + "' != '" + com.clouway.cuse.spi.SortOrder.DESCENDING + "'", sortOrder27.equals(com.clouway.cuse.spi.SortOrder.DESCENDING));
        org.junit.Assert.assertTrue("'" + sortType28 + "' != '" + com.clouway.cuse.spi.SortType.TEXT + "'", sortType28.equals(com.clouway.cuse.spi.SortType.TEXT));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.anyIs("0: 0: ");
        org.junit.Assert.assertNotNull(searchFilter1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.anyIs(":( OR )");
        org.junit.Assert.assertNotNull(searchFilter1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.clouway.cuse.spi.IndexWriter indexWriter0 = new com.clouway.cuse.spi.IndexWriter();
        java.lang.String[] strArray7 = new java.lang.String[] { "com.clouway.cuse.spi.IndexCreationFailureException: ", "com.clouway.cuse.spi.IndexCreationFailureException\\: ", "0", "0: 0: ", "", ":0 OR :0" };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter8 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray7);
        java.util.Set<java.lang.String> strSet9 = indexWriter0.createIndex(strArray7);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "" };
        com.clouway.cuse.spi.filters.SearchFilter searchFilter14 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray13);
        java.util.Set<java.lang.String> strSet15 = indexWriter0.createIndex(strArray13);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(searchFilter14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.LongIdConverter longIdConverter4 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str6 = longIdConverter4.convertFrom((java.lang.Object) 10.0d);
        com.clouway.cuse.spi.LongIdConverter longIdConverter7 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter9 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.lang.String str15 = searchFilter9.getValue((java.util.List<java.lang.String>) strList13);
        java.lang.String[] strArray18 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.lang.String str21 = searchFilter9.getValue((java.util.List<java.lang.String>) strList19);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter22 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList19);
        java.util.List<java.lang.Long> longList23 = longIdConverter7.convert((java.util.List<java.lang.String>) strList19);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter24 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList19);
        java.util.List<java.lang.Long> longList25 = longIdConverter4.convert((java.util.List<java.lang.String>) strList19);
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.delete("0:( OR )", longList25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(searchFilter9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0:0 " + "'", str21, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter22);
        org.junit.Assert.assertNotNull(longList23);
        org.junit.Assert.assertNotNull(longList25);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer fullWordSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.gae.filedindexing.idindexer.IdFieldCriteria idFieldCriteria3 = new com.clouway.cuse.gae.filedindexing.idindexer.IdFieldCriteria();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = fullWordSearchFieldIndexer0.index("0:0 ", field2, (java.lang.Object) idFieldCriteria3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: 0:0 ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer fullWordSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter12 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList13 = fullWordSearchFieldIndexer0.index("com.clouway.cuse.spi.IndexCreationFailureException\\: ", field2, (java.lang.Object) equalitySearchFilter12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: com.clouway.cuse.spi.IndexCreationFailureException\\: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.clouway.cuse.gae.filedindexing.searchindex.SimpleSearchFieldCriteria simpleSearchFieldCriteria0 = new com.clouway.cuse.gae.filedindexing.searchindex.SimpleSearchFieldCriteria();
        java.lang.reflect.Field field1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = simpleSearchFieldCriteria0.match(field1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter12 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy13 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.registerAll((java.util.List<java.lang.String>) strList8, indexingStrategy13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(searchFilter1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog1 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException2 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass3 = searchIndexMissmatchException2.getClass();
        com.clouway.cuse.spi.IdConverter idConverter4 = defaultIdConverterCatalog1.getConverter((java.lang.Class) wildcardClass3);
        com.clouway.cuse.spi.SearchEngine searchEngine5 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog1);
        com.clouway.cuse.spi.LongIdConverter longIdConverter6 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter8 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.lang.String str14 = searchFilter8.getValue((java.util.List<java.lang.String>) strList12);
        java.lang.String[] strArray17 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String str20 = searchFilter8.getValue((java.util.List<java.lang.String>) strList18);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter21 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList18);
        java.util.List<java.lang.Long> longList22 = longIdConverter6.convert((java.util.List<java.lang.String>) strList18);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException24 = new com.clouway.cuse.spi.IndexCreationFailureException(":( OR )");
        java.lang.String str25 = longIdConverter6.convertFrom((java.lang.Object) ":( OR )");
        com.clouway.cuse.spi.LongIdConverter longIdConverter26 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str28 = longIdConverter26.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str30 = longIdConverter26.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter31 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter33 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        java.lang.String str39 = searchFilter33.getValue((java.util.List<java.lang.String>) strList37);
        java.lang.String[] strArray42 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.lang.String str45 = searchFilter33.getValue((java.util.List<java.lang.String>) strList43);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter46 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList43);
        java.util.List<java.lang.Long> longList47 = longIdConverter31.convert((java.util.List<java.lang.String>) strList43);
        java.util.List<java.lang.Long> longList48 = longIdConverter26.convert((java.util.List<java.lang.String>) strList43);
        java.util.List<java.lang.Long> longList49 = longIdConverter6.convert((java.util.List<java.lang.String>) strList43);
        // The following exception was thrown during execution in test generation
        try {
            searchEngine5.register((java.lang.Object) longList49);
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.NotConfiguredIndexingStrategyException; message: null");
        } catch (com.clouway.cuse.spi.NotConfiguredIndexingStrategyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(idConverter4);
        org.junit.Assert.assertNotNull(searchEngine5);
        org.junit.Assert.assertNotNull(searchFilter8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0:0 " + "'", str20, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter21);
        org.junit.Assert.assertNotNull(longList22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(searchFilter33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "0" + "'", str39, "0");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "0:0 " + "'", str45, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter46);
        org.junit.Assert.assertNotNull(longList47);
        org.junit.Assert.assertNotNull(longList48);
        org.junit.Assert.assertNotNull(longList49);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        java.lang.String[] strArray13 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.lang.String str16 = searchFilter4.getValue((java.util.List<java.lang.String>) strList14);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter17 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList14);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy18 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.registerAll((java.util.List<java.lang.String>) strList14, indexingStrategy18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0:0 " + "'", str16, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter17);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.LongIdConverter longIdConverter4 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter6 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.lang.String str12 = searchFilter6.getValue((java.util.List<java.lang.String>) strList10);
        java.lang.String[] strArray15 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.lang.String str18 = searchFilter6.getValue((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter19 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList16);
        java.util.List<java.lang.Long> longList20 = longIdConverter4.convert((java.util.List<java.lang.String>) strList16);
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.delete("com.clouway.cuse.spi.IndexCreationFailureException\\: ", longList20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0:0 " + "'", str18, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter19);
        org.junit.Assert.assertNotNull(longList20);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.util.List<java.lang.String> strList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter1 = new com.clouway.cuse.gae.filters.OrSearchFilter(strList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer atomicFiledIndexer0 = new com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter12 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter13 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList14 = atomicFiledIndexer0.index("com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", field2, (java.lang.Object) strList8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: com.clouway.cuse.spi.NotConfiguredIndexingStrategyException");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy12 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.register((java.lang.Object) strList8, indexingStrategy12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter2 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.lang.String str8 = searchFilter2.getValue((java.util.List<java.lang.String>) strList6);
        java.lang.String[] strArray11 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.lang.String str14 = searchFilter2.getValue((java.util.List<java.lang.String>) strList12);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter15 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList12);
        java.util.List<java.lang.Long> longList16 = longIdConverter0.convert((java.util.List<java.lang.String>) strList12);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter18 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.lang.String str24 = searchFilter18.getValue((java.util.List<java.lang.String>) strList22);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter25 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList22);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter26 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList22);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter28 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.lang.String str34 = searchFilter28.getValue((java.util.List<java.lang.String>) strList32);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter35 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList32);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter37 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.lang.String str43 = searchFilter37.getValue((java.util.List<java.lang.String>) strList41);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter44 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList41);
        java.lang.String str45 = orSearchFilter35.getValue((java.util.List<java.lang.String>) strList41);
        java.lang.String str46 = equalitySearchFilter26.getValue((java.util.List<java.lang.String>) strList41);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter48 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter50 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray53 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        java.lang.String str56 = searchFilter50.getValue((java.util.List<java.lang.String>) strList54);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter57 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList54);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter58 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList54);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter59 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList54);
        java.lang.String str60 = multiFieldValueFilter48.getValue((java.util.List<java.lang.String>) strList54);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter61 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList54);
        java.lang.String str62 = equalitySearchFilter26.getValue((java.util.List<java.lang.String>) strList54);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList63 = longIdConverter0.convert((java.util.List<java.lang.String>) strList54);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:0 " + "'", str14, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter15);
        org.junit.Assert.assertNotNull(longList16);
        org.junit.Assert.assertNotNull(searchFilter18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0" + "'", str24, "0");
        org.junit.Assert.assertNotNull(searchFilter28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0" + "'", str34, "0");
        org.junit.Assert.assertNotNull(searchFilter37);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0" + "'", str43, "0");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + ":( OR )" + "'", str45, ":( OR )");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(searchFilter50);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "0" + "'", str56, "0");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + ":0 OR :0" + "'", str60, ":0 OR :0");
        org.junit.Assert.assertNull(str62);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.clouway.cuse.gae.filedindexing.fulltextindex.FullTextSearchFieldIndexer fullTextSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.fulltextindex.FullTextSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter4 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter6 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.lang.String str12 = searchFilter6.getValue((java.util.List<java.lang.String>) strList10);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter13 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList10);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter15 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.lang.String str21 = searchFilter15.getValue((java.util.List<java.lang.String>) strList19);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter22 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList19);
        java.lang.String str23 = orSearchFilter13.getValue((java.util.List<java.lang.String>) strList19);
        com.clouway.cuse.spi.LongIdConverter longIdConverter24 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str26 = longIdConverter24.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str28 = longIdConverter24.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter29 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter31 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.lang.String str37 = searchFilter31.getValue((java.util.List<java.lang.String>) strList35);
        java.lang.String[] strArray40 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.lang.String str43 = searchFilter31.getValue((java.util.List<java.lang.String>) strList41);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter44 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList41);
        java.util.List<java.lang.Long> longList45 = longIdConverter29.convert((java.util.List<java.lang.String>) strList41);
        java.util.List<java.lang.Long> longList46 = longIdConverter24.convert((java.util.List<java.lang.String>) strList41);
        java.lang.String str47 = orSearchFilter13.getValue((java.util.List<java.lang.String>) strList41);
        java.lang.String str48 = multiFieldValueFilter4.getValue((java.util.List<java.lang.String>) strList41);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList49 = fullTextSearchFieldIndexer0.index(":( OR )", field2, (java.lang.Object) multiFieldValueFilter4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: :( OR )");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(searchFilter15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ":( OR )" + "'", str23, ":( OR )");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(searchFilter31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0" + "'", str37, "0");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0:0 " + "'", str43, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter44);
        org.junit.Assert.assertNotNull(longList45);
        org.junit.Assert.assertNotNull(longList46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "0:( OR )" + "'", str47, "0:( OR )");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "0:0 OR 0:0" + "'", str48, "0:0 OR 0:0");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException1 = new com.clouway.cuse.spi.IndexCreationFailureException("");
        com.clouway.cuse.spi.NotConfiguredIndexingStrategyException notConfiguredIndexingStrategyException2 = new com.clouway.cuse.spi.NotConfiguredIndexingStrategyException();
        indexCreationFailureException1.addSuppressed((java.lang.Throwable) notConfiguredIndexingStrategyException2);
        com.clouway.cuse.spi.NotConfiguredIdConvertorException notConfiguredIdConvertorException4 = new com.clouway.cuse.spi.NotConfiguredIdConvertorException();
        notConfiguredIndexingStrategyException2.addSuppressed((java.lang.Throwable) notConfiguredIdConvertorException4);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException7 = new com.clouway.cuse.spi.IndexCreationFailureException("");
        notConfiguredIdConvertorException4.addSuppressed((java.lang.Throwable) indexCreationFailureException7);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException10 = new com.clouway.cuse.spi.IndexCreationFailureException(":( OR )");
        indexCreationFailureException7.addSuppressed((java.lang.Throwable) indexCreationFailureException10);
        java.lang.String str12 = indexCreationFailureException10.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.clouway.cuse.spi.IndexCreationFailureException: :( OR )" + "'", str12, "com.clouway.cuse.spi.IndexCreationFailureException: :( OR )");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str2 = longIdConverter0.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str4 = longIdConverter0.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter5 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter7 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.lang.String str13 = searchFilter7.getValue((java.util.List<java.lang.String>) strList11);
        java.lang.String[] strArray16 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.lang.String str19 = searchFilter7.getValue((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter20 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList17);
        java.util.List<java.lang.Long> longList21 = longIdConverter5.convert((java.util.List<java.lang.String>) strList17);
        java.util.List<java.lang.Long> longList22 = longIdConverter0.convert((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter24 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter26 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.lang.String str32 = searchFilter26.getValue((java.util.List<java.lang.String>) strList30);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter33 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList30);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter34 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList30);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter35 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList30);
        java.lang.String str36 = multiFieldValueFilter24.getValue((java.util.List<java.lang.String>) strList30);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter37 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList30);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter38 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList30);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList39 = longIdConverter0.convert((java.util.List<java.lang.String>) strList30);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(searchFilter7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0:0 " + "'", str19, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter20);
        org.junit.Assert.assertNotNull(longList21);
        org.junit.Assert.assertNotNull(longList22);
        org.junit.Assert.assertNotNull(searchFilter26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0" + "'", str32, "0");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ":0 OR :0" + "'", str36, ":0 OR :0");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter2 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.lang.String str8 = searchFilter2.getValue((java.util.List<java.lang.String>) strList6);
        java.lang.String[] strArray11 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.lang.String str14 = searchFilter2.getValue((java.util.List<java.lang.String>) strList12);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter15 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList12);
        java.util.List<java.lang.Long> longList16 = longIdConverter0.convert((java.util.List<java.lang.String>) strList12);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException18 = new com.clouway.cuse.spi.IndexCreationFailureException(":( OR )");
        java.lang.String str19 = longIdConverter0.convertFrom((java.lang.Object) ":( OR )");
        com.clouway.cuse.spi.LongIdConverter longIdConverter20 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str22 = longIdConverter20.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str24 = longIdConverter20.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter25 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter27 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.lang.String str33 = searchFilter27.getValue((java.util.List<java.lang.String>) strList31);
        java.lang.String[] strArray36 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        java.lang.String str39 = searchFilter27.getValue((java.util.List<java.lang.String>) strList37);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter40 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList37);
        java.util.List<java.lang.Long> longList41 = longIdConverter25.convert((java.util.List<java.lang.String>) strList37);
        java.util.List<java.lang.Long> longList42 = longIdConverter20.convert((java.util.List<java.lang.String>) strList37);
        java.util.List<java.lang.Long> longList43 = longIdConverter0.convert((java.util.List<java.lang.String>) strList37);
        com.clouway.cuse.spi.NotConfiguredIdConvertorException notConfiguredIdConvertorException44 = new com.clouway.cuse.spi.NotConfiguredIdConvertorException();
        com.clouway.cuse.spi.NotConfiguredIndexingStrategyException notConfiguredIndexingStrategyException45 = new com.clouway.cuse.spi.NotConfiguredIndexingStrategyException();
        java.lang.Throwable[] throwableArray46 = notConfiguredIndexingStrategyException45.getSuppressed();
        notConfiguredIdConvertorException44.addSuppressed((java.lang.Throwable) notConfiguredIndexingStrategyException45);
        java.lang.String str48 = longIdConverter0.convertFrom((java.lang.Object) notConfiguredIdConvertorException44);
        org.junit.Assert.assertNotNull(searchFilter2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:0 " + "'", str14, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter15);
        org.junit.Assert.assertNotNull(longList16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(searchFilter27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0" + "'", str33, "0");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "0:0 " + "'", str39, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter40);
        org.junit.Assert.assertNotNull(longList41);
        org.junit.Assert.assertNotNull(longList42);
        org.junit.Assert.assertNotNull(longList43);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.clouway.cuse.gae.filedindexing.dateindex.DateFieldIndexer dateFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.dateindex.DateFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter4 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("hi!");
        com.clouway.cuse.spi.LongIdConverter longIdConverter5 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter7 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.lang.String str13 = searchFilter7.getValue((java.util.List<java.lang.String>) strList11);
        java.lang.String[] strArray16 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.lang.String str19 = searchFilter7.getValue((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter20 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList17);
        java.util.List<java.lang.Long> longList21 = longIdConverter5.convert((java.util.List<java.lang.String>) strList17);
        java.lang.String str22 = multiFieldValueFilter4.getValue((java.util.List<java.lang.String>) strList17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList23 = dateFieldIndexer0.index("0:0 OR 0:0", field2, (java.lang.Object) str22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.util.Date");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0:0 " + "'", str19, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter20);
        org.junit.Assert.assertNotNull(longList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0:hi! OR 0:hi!" + "'", str22, "0:hi! OR 0:hi!");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.EntityLoader entityLoader1 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog2 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException3 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass4 = searchIndexMissmatchException3.getClass();
        com.clouway.cuse.spi.IdConverter idConverter5 = defaultIdConverterCatalog2.getConverter((java.lang.Class) wildcardClass4);
        com.clouway.cuse.spi.SearchEngine searchEngine6 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader1, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog2);
        com.clouway.cuse.spi.SortType sortType7 = com.clouway.cuse.spi.SortType.NUMERIC;
        java.lang.Class<?> wildcardClass8 = sortType7.getClass();
        com.clouway.cuse.spi.IdConverter idConverter9 = defaultIdConverterCatalog2.getConverter((java.lang.Class) wildcardClass8);
        java.lang.Class class10 = null;
        com.clouway.cuse.spi.IdConverter idConverter11 = defaultIdConverterCatalog2.getConverter(class10);
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException12 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass13 = searchIndexMissmatchException12.getClass();
        com.clouway.cuse.spi.StringIdConverter stringIdConverter14 = new com.clouway.cuse.spi.StringIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter16 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 100);
        java.lang.String str17 = stringIdConverter14.convertFrom((java.lang.Object) 100);
        defaultIdConverterCatalog2.addIdConverter((java.lang.Class) wildcardClass13, (com.clouway.cuse.spi.IdConverter) stringIdConverter14);
        com.clouway.cuse.spi.SearchEngine searchEngine19 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog2);
        java.lang.String[] strArray23 = new java.lang.String[] { ":( OR )", "hi!", "com.clouway.cuse.spi.IndexCreationFailureException: " };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter26 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList24);
        // The following exception was thrown during execution in test generation
        try {
            searchEngine19.register((java.lang.Object) strList24);
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.NotConfiguredIndexingStrategyException; message: null");
        } catch (com.clouway.cuse.spi.NotConfiguredIndexingStrategyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(idConverter5);
        org.junit.Assert.assertNotNull(searchEngine6);
        org.junit.Assert.assertTrue("'" + sortType7 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType7.equals(com.clouway.cuse.spi.SortType.NUMERIC));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(idConverter9);
        org.junit.Assert.assertNull(idConverter11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(searchFilter16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(searchEngine19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(searchFilter26);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        com.clouway.cuse.gae.filedindexing.searchindex.SimpleSearchFieldIndexer simpleSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.searchindex.SimpleSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.LongIdConverter longIdConverter3 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str5 = longIdConverter3.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str7 = longIdConverter3.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter8 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter10 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.lang.String str16 = searchFilter10.getValue((java.util.List<java.lang.String>) strList14);
        java.lang.String[] strArray19 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.lang.String str22 = searchFilter10.getValue((java.util.List<java.lang.String>) strList20);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter23 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList20);
        java.util.List<java.lang.Long> longList24 = longIdConverter8.convert((java.util.List<java.lang.String>) strList20);
        java.util.List<java.lang.Long> longList25 = longIdConverter3.convert((java.util.List<java.lang.String>) strList20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList26 = simpleSearchFieldIndexer0.index("hi!", field2, (java.lang.Object) strList20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(searchFilter10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0:0 " + "'", str22, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter23);
        org.junit.Assert.assertNotNull(longList24);
        org.junit.Assert.assertNotNull(longList25);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder gaeSearchApiMatchedIdObjectFinder0 = new com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter3 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.lang.String str9 = searchFilter3.getValue((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter10 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter12 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.lang.String str18 = searchFilter12.getValue((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter19 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter20 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter21 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter23 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.lang.String str29 = searchFilter23.getValue((java.util.List<java.lang.String>) strList27);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter30 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList27);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter31 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList27);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter32 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList27);
        java.lang.String str33 = orSearchFilter21.getValue((java.util.List<java.lang.String>) strList27);
        java.lang.String str34 = orSearchFilter10.getValue((java.util.List<java.lang.String>) strList27);
        com.clouway.cuse.spi.SortOrder sortOrder38 = com.clouway.cuse.spi.SortOrder.DESCENDING;
        com.clouway.cuse.spi.SortType sortType39 = com.clouway.cuse.spi.SortType.NUMERIC;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList40 = gaeSearchApiMatchedIdObjectFinder0.find("com.clouway.cuse.spi.IndexCreationFailureException: ", (java.util.List<java.lang.String>) strList27, (int) (byte) 100, (int) 'a', "0:0 OR 0:0", sortOrder38, sortType39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse sort expression '0:0 OR 0:0': parse error at line 1 position 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(searchFilter12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
        org.junit.Assert.assertNotNull(searchFilter23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertNotNull(searchFilter32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + ":( OR )" + "'", str33, ":( OR )");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ":( OR )" + "'", str34, ":( OR )");
        org.junit.Assert.assertTrue("'" + sortOrder38 + "' != '" + com.clouway.cuse.spi.SortOrder.DESCENDING + "'", sortOrder38.equals(com.clouway.cuse.spi.SortOrder.DESCENDING));
        org.junit.Assert.assertTrue("'" + sortType39 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType39.equals(com.clouway.cuse.spi.SortType.NUMERIC));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.clouway.cuse.gae.filedindexing.dateindex.DateFieldIndexer dateFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.dateindex.DateFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.anyIs("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList5 = dateFieldIndexer0.index("com.clouway.cuse.spi.IndexCreationFailureException: ", field2, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.util.Date");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        java.lang.String str1 = com.clouway.cuse.spi.EscapeUtil.escape("0:hi! OR 0:hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0\\:hi! OR 0\\:hi!" + "'", str1, "0\\:hi! OR 0\\:hi!");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer fullWordSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException4 = new com.clouway.cuse.spi.IndexCreationFailureException("");
        java.lang.Throwable[] throwableArray5 = indexCreationFailureException4.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList6 = fullWordSearchFieldIndexer0.index(":( OR )", field2, (java.lang.Object) indexCreationFailureException4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: :( OR )");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.IdConverterCatalog idConverterCatalog1 = null;
        com.clouway.cuse.spi.SearchEngine searchEngine2 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, idConverterCatalog1);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        java.lang.String[] strArray22 = new java.lang.String[] { "0:( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: ", "com.clouway.cuse.spi.IndexCreationFailureException: ", "0: 0: ", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", ":( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: " };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.lang.String str25 = orSearchFilter11.getValue((java.util.List<java.lang.String>) strList23);
        // The following exception was thrown during execution in test generation
        try {
            searchEngine2.registerAll((java.util.List<java.lang.String>) strList23);
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.SearchIndexMissingException; message: null");
        } catch (com.clouway.cuse.spi.SearchIndexMissingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchEngine2);
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0:( OR ):( OR )" + "'", str25, "0:( OR ):( OR )");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException1 = new com.clouway.cuse.spi.IndexCreationFailureException("");
        com.clouway.cuse.spi.NotConfiguredIndexingStrategyException notConfiguredIndexingStrategyException2 = new com.clouway.cuse.spi.NotConfiguredIndexingStrategyException();
        indexCreationFailureException1.addSuppressed((java.lang.Throwable) notConfiguredIndexingStrategyException2);
        com.clouway.cuse.spi.NotConfiguredIdConvertorException notConfiguredIdConvertorException4 = new com.clouway.cuse.spi.NotConfiguredIdConvertorException();
        notConfiguredIndexingStrategyException2.addSuppressed((java.lang.Throwable) notConfiguredIdConvertorException4);
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            notConfiguredIdConvertorException4.addSuppressed(throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder gaeSearchApiMatchedIdObjectFinder0 = new com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter3 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.lang.String str9 = searchFilter3.getValue((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter10 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter12 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.lang.String str18 = searchFilter12.getValue((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter19 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter20 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter21 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter23 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.lang.String str29 = searchFilter23.getValue((java.util.List<java.lang.String>) strList27);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter30 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList27);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter31 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList27);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter32 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList27);
        java.lang.String str33 = orSearchFilter21.getValue((java.util.List<java.lang.String>) strList27);
        java.lang.String str34 = orSearchFilter10.getValue((java.util.List<java.lang.String>) strList27);
        com.clouway.cuse.spi.SortOrder sortOrder38 = com.clouway.cuse.spi.SortOrder.ASCENDING;
        com.clouway.cuse.spi.SortType sortType39 = com.clouway.cuse.spi.SortType.NUMERIC;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList40 = gaeSearchApiMatchedIdObjectFinder0.find("", (java.util.List<java.lang.String>) strList27, 100, (int) (short) 10, "com.clouway.cuse.spi.IndexCreationFailureException\\: ", sortOrder38, sortType39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index name null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(searchFilter12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
        org.junit.Assert.assertNotNull(searchFilter23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertNotNull(searchFilter32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + ":( OR )" + "'", str33, ":( OR )");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ":( OR )" + "'", str34, ":( OR )");
        org.junit.Assert.assertTrue("'" + sortOrder38 + "' != '" + com.clouway.cuse.spi.SortOrder.ASCENDING + "'", sortOrder38.equals(com.clouway.cuse.spi.SortOrder.ASCENDING));
        org.junit.Assert.assertTrue("'" + sortType39 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType39.equals(com.clouway.cuse.spi.SortType.NUMERIC));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.SortOrder sortOrder3 = com.clouway.cuse.spi.SortOrder.ASCENDING;
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy4 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.register((java.lang.Object) sortOrder3, indexingStrategy4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + sortOrder3 + "' != '" + com.clouway.cuse.spi.SortOrder.ASCENDING + "'", sortOrder3.equals(com.clouway.cuse.spi.SortOrder.ASCENDING));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog0 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter2 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.lang.String str8 = searchFilter2.getValue((java.util.List<java.lang.String>) strList6);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter9 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList6);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter11 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.lang.String str17 = searchFilter11.getValue((java.util.List<java.lang.String>) strList15);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter18 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList15);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter19 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList15);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter20 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList15);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter22 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.lang.String str28 = searchFilter22.getValue((java.util.List<java.lang.String>) strList26);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter29 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList26);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter30 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList26);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter31 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList26);
        java.lang.String str32 = orSearchFilter20.getValue((java.util.List<java.lang.String>) strList26);
        java.lang.String str33 = orSearchFilter9.getValue((java.util.List<java.lang.String>) strList26);
        java.lang.Class<?> wildcardClass34 = orSearchFilter9.getClass();
        com.clouway.cuse.spi.IdConverter idConverter35 = defaultIdConverterCatalog0.getConverter((java.lang.Class) wildcardClass34);
        org.junit.Assert.assertNotNull(searchFilter2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(searchFilter11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertNotNull(searchFilter22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0" + "'", str28, "0");
        org.junit.Assert.assertNotNull(searchFilter31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + ":( OR )" + "'", str32, ":( OR )");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + ":( OR )" + "'", str33, ":( OR )");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNull(idConverter35);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog1 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException2 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass3 = searchIndexMissmatchException2.getClass();
        com.clouway.cuse.spi.IdConverter idConverter4 = defaultIdConverterCatalog1.getConverter((java.lang.Class) wildcardClass3);
        com.clouway.cuse.spi.SearchEngine searchEngine5 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog1);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter7 = com.clouway.cuse.gae.filters.SearchFilters.anyIs("0");
        // The following exception was thrown during execution in test generation
        try {
            searchEngine5.register((java.lang.Object) "0");
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.NotConfiguredIndexingStrategyException; message: null");
        } catch (com.clouway.cuse.spi.NotConfiguredIndexingStrategyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(idConverter4);
        org.junit.Assert.assertNotNull(searchEngine5);
        org.junit.Assert.assertNotNull(searchFilter7);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.LongIdConverter longIdConverter4 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str6 = longIdConverter4.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str8 = longIdConverter4.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter9 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter11 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.lang.String str17 = searchFilter11.getValue((java.util.List<java.lang.String>) strList15);
        java.lang.String[] strArray20 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.lang.String str23 = searchFilter11.getValue((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter24 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList21);
        java.util.List<java.lang.Long> longList25 = longIdConverter9.convert((java.util.List<java.lang.String>) strList21);
        java.util.List<java.lang.Long> longList26 = longIdConverter4.convert((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter28 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter30 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.lang.String str36 = searchFilter30.getValue((java.util.List<java.lang.String>) strList34);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter37 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList34);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter38 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList34);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter39 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList34);
        java.lang.String str40 = multiFieldValueFilter28.getValue((java.util.List<java.lang.String>) strList34);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter42 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.lang.String str48 = searchFilter42.getValue((java.util.List<java.lang.String>) strList46);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter49 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList46);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter50 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList46);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter52 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray55 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        java.lang.String str58 = searchFilter52.getValue((java.util.List<java.lang.String>) strList56);
        java.lang.String[] strArray61 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        java.lang.String str64 = searchFilter52.getValue((java.util.List<java.lang.String>) strList62);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter65 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList62);
        java.lang.String str66 = equalitySearchFilter50.getValue((java.util.List<java.lang.String>) strList62);
        java.lang.String str67 = multiFieldValueFilter28.getValue((java.util.List<java.lang.String>) strList62);
        java.util.List<java.lang.Long> longList68 = longIdConverter4.convert((java.util.List<java.lang.String>) strList62);
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.delete("0:hi! OR 0:hi!", longList68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(searchFilter11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0:0 " + "'", str23, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter24);
        org.junit.Assert.assertNotNull(longList25);
        org.junit.Assert.assertNotNull(longList26);
        org.junit.Assert.assertNotNull(searchFilter30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0" + "'", str36, "0");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ":0 OR :0" + "'", str40, ":0 OR :0");
        org.junit.Assert.assertNotNull(searchFilter42);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "0" + "'", str48, "0");
        org.junit.Assert.assertNotNull(searchFilter52);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "0" + "'", str58, "0");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "0:0 " + "'", str64, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "0: 0: " + "'", str66, "0: 0: ");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "0:0 OR 0:0" + "'", str67, "0:0 OR 0:0");
        org.junit.Assert.assertNotNull(longList68);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.LongIdConverter longIdConverter4 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str6 = longIdConverter4.convertFrom((java.lang.Object) 10.0d);
        com.clouway.cuse.spi.LongIdConverter longIdConverter7 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter9 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.lang.String str15 = searchFilter9.getValue((java.util.List<java.lang.String>) strList13);
        java.lang.String[] strArray18 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.lang.String str21 = searchFilter9.getValue((java.util.List<java.lang.String>) strList19);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter22 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList19);
        java.util.List<java.lang.Long> longList23 = longIdConverter7.convert((java.util.List<java.lang.String>) strList19);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter24 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList19);
        java.util.List<java.lang.Long> longList25 = longIdConverter4.convert((java.util.List<java.lang.String>) strList19);
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.delete("0:( OR )", longList25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(searchFilter9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0:0 " + "'", str21, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter22);
        org.junit.Assert.assertNotNull(longList23);
        org.junit.Assert.assertNotNull(longList25);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog0 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException1 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass2 = searchIndexMissmatchException1.getClass();
        com.clouway.cuse.spi.LongIdConverter longIdConverter3 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str5 = longIdConverter3.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str7 = longIdConverter3.convertFrom((java.lang.Object) 100.0f);
        defaultIdConverterCatalog0.addIdConverter((java.lang.Class) wildcardClass2, (com.clouway.cuse.spi.IdConverter) longIdConverter3);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter10 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.lang.String str16 = searchFilter10.getValue((java.util.List<java.lang.String>) strList14);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter17 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList14);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter18 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList14);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter19 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList20 = longIdConverter3.convert((java.util.List<java.lang.String>) strList14);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(searchFilter10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(searchFilter19);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.clouway.cuse.gae.filedindexing.fulltextindex.FullTextSearchFieldIndexer fullTextSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.fulltextindex.FullTextSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = fullTextSearchFieldIndexer0.index("com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", field2, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: com.clouway.cuse.spi.NotConfiguredIndexingStrategyException");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.IdConverterCatalog idConverterCatalog1 = null;
        com.clouway.cuse.spi.SearchEngine searchEngine2 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, idConverterCatalog1);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter12 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        // The following exception was thrown during execution in test generation
        try {
            searchEngine2.registerAll((java.util.List<java.lang.String>) strList8);
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.SearchIndexMissingException; message: null");
        } catch (com.clouway.cuse.spi.SearchIndexMissingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchEngine2);
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.SearchEngine searchEngine1 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter3 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.lang.String str9 = searchFilter3.getValue((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter10 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter11 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter13 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.lang.String str19 = searchFilter13.getValue((java.util.List<java.lang.String>) strList17);
        java.lang.String[] strArray22 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.lang.String str25 = searchFilter13.getValue((java.util.List<java.lang.String>) strList23);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter26 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList23);
        java.lang.String str27 = equalitySearchFilter11.getValue((java.util.List<java.lang.String>) strList23);
        // The following exception was thrown during execution in test generation
        try {
            searchEngine1.registerAll((java.util.List<java.lang.String>) strList23);
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.SearchIndexMissingException; message: null");
        } catch (com.clouway.cuse.spi.SearchIndexMissingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchEngine1);
        org.junit.Assert.assertNotNull(searchFilter3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(searchFilter13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0:0 " + "'", str25, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0: 0: " + "'", str27, "0: 0: ");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        java.util.Date date1 = null;
        com.clouway.cuse.spi.filters.SearchFilter searchFilter2 = com.clouway.cuse.gae.filters.SearchFilters.greaterThanOrEqualTo(date1);
        java.lang.String str3 = longIdConverter0.convertFrom((java.lang.Object) date1);
        com.clouway.cuse.spi.IndexWriter indexWriter4 = new com.clouway.cuse.spi.IndexWriter();
        java.lang.String[] strArray11 = new java.lang.String[] { "com.clouway.cuse.spi.IndexCreationFailureException: ", "com.clouway.cuse.spi.IndexCreationFailureException\\: ", "0", "0: 0: ", "", ":0 OR :0" };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter12 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray11);
        java.util.Set<java.lang.String> strSet13 = indexWriter4.createIndex(strArray11);
        java.lang.String[] strArray20 = new java.lang.String[] { "com.clouway.cuse.spi.IndexCreationFailureException: ", "com.clouway.cuse.spi.IndexCreationFailureException\\: ", "0", "0: 0: ", "", ":0 OR :0" };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter21 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray20);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter22 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray20);
        java.util.Set<java.lang.String> strSet23 = indexWriter4.createIndex(strArray20);
        java.lang.String str24 = longIdConverter0.convertFrom((java.lang.Object) indexWriter4);
        com.clouway.cuse.spi.IndexWriter indexWriter25 = new com.clouway.cuse.spi.IndexWriter();
        java.lang.String[] strArray32 = new java.lang.String[] { "com.clouway.cuse.spi.IndexCreationFailureException: ", "com.clouway.cuse.spi.IndexCreationFailureException\\: ", "0", "0: 0: ", "", ":0 OR :0" };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter33 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray32);
        java.util.Set<java.lang.String> strSet34 = indexWriter25.createIndex(strArray32);
        java.util.Set<java.lang.String> strSet35 = indexWriter4.createIndex(strArray32);
        org.junit.Assert.assertNotNull(searchFilter2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(searchFilter22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(strSet35);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L, 10L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.delete("", (java.util.List<java.lang.Long>) longList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.clouway.cuse.spi.SearchIndexMissingException searchIndexMissingException0 = new com.clouway.cuse.spi.SearchIndexMissingException();
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException2 = new com.clouway.cuse.spi.IndexCreationFailureException("0:0 ");
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException4 = new com.clouway.cuse.spi.IndexCreationFailureException("");
        com.clouway.cuse.spi.NotConfiguredIndexingStrategyException notConfiguredIndexingStrategyException5 = new com.clouway.cuse.spi.NotConfiguredIndexingStrategyException();
        indexCreationFailureException4.addSuppressed((java.lang.Throwable) notConfiguredIndexingStrategyException5);
        com.clouway.cuse.spi.NotConfiguredIdConvertorException notConfiguredIdConvertorException7 = new com.clouway.cuse.spi.NotConfiguredIdConvertorException();
        notConfiguredIndexingStrategyException5.addSuppressed((java.lang.Throwable) notConfiguredIdConvertorException7);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException10 = new com.clouway.cuse.spi.IndexCreationFailureException("");
        notConfiguredIdConvertorException7.addSuppressed((java.lang.Throwable) indexCreationFailureException10);
        indexCreationFailureException2.addSuppressed((java.lang.Throwable) notConfiguredIdConvertorException7);
        searchIndexMissingException0.addSuppressed((java.lang.Throwable) indexCreationFailureException2);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer idFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.IndexWriter indexWriter3 = new com.clouway.cuse.spi.IndexWriter();
        java.lang.String[] strArray10 = new java.lang.String[] { "com.clouway.cuse.spi.IndexCreationFailureException: ", "com.clouway.cuse.spi.IndexCreationFailureException\\: ", "0", "0: 0: ", "", ":0 OR :0" };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray10);
        java.util.Set<java.lang.String> strSet12 = indexWriter3.createIndex(strArray10);
        java.lang.String[] strArray19 = new java.lang.String[] { "com.clouway.cuse.spi.IndexCreationFailureException: ", "com.clouway.cuse.spi.IndexCreationFailureException\\: ", "0", "0: 0: ", "", ":0 OR :0" };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter20 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray19);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter21 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray19);
        java.util.Set<java.lang.String> strSet22 = indexWriter3.createIndex(strArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList23 = idFieldIndexer0.index("com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", field2, (java.lang.Object) strSet22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: com.clouway.cuse.spi.NotConfiguredIndexingStrategyException");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(searchFilter21);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        java.util.List<java.lang.Long> longList4 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.delete("0\\:hi! OR 0\\:hi!", longList4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.clouway.cuse.gae.filedindexing.searchindex.SimpleSearchFieldIndexer simpleSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.searchindex.SimpleSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter4 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("hi!");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter6 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.lang.String str12 = searchFilter6.getValue((java.util.List<java.lang.String>) strList10);
        java.lang.String[] strArray15 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.lang.String str18 = searchFilter6.getValue((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter19 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList16);
        java.lang.String str20 = multiFieldValueFilter4.getValue((java.util.List<java.lang.String>) strList16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList21 = simpleSearchFieldIndexer0.index("com.clouway.cuse.spi.IndexCreationFailureException: :( OR )", field2, (java.lang.Object) strList16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: com.clouway.cuse.spi.IndexCreationFailureException: :( OR )");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0:0 " + "'", str18, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0:hi! OR 0:hi!" + "'", str20, "0:hi! OR 0:hi!");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.clouway.cuse.spi.NegativeSearchLimitException negativeSearchLimitException0 = new com.clouway.cuse.spi.NegativeSearchLimitException();
        com.clouway.cuse.spi.EmptySearchFilterException emptySearchFilterException1 = new com.clouway.cuse.spi.EmptySearchFilterException();
        negativeSearchLimitException0.addSuppressed((java.lang.Throwable) emptySearchFilterException1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException1 = new com.clouway.cuse.spi.IndexCreationFailureException("0:0 ");
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException3 = new com.clouway.cuse.spi.IndexCreationFailureException("");
        com.clouway.cuse.spi.NotConfiguredIndexingStrategyException notConfiguredIndexingStrategyException4 = new com.clouway.cuse.spi.NotConfiguredIndexingStrategyException();
        indexCreationFailureException3.addSuppressed((java.lang.Throwable) notConfiguredIndexingStrategyException4);
        com.clouway.cuse.spi.NotConfiguredIdConvertorException notConfiguredIdConvertorException6 = new com.clouway.cuse.spi.NotConfiguredIdConvertorException();
        notConfiguredIndexingStrategyException4.addSuppressed((java.lang.Throwable) notConfiguredIdConvertorException6);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException9 = new com.clouway.cuse.spi.IndexCreationFailureException("");
        notConfiguredIdConvertorException6.addSuppressed((java.lang.Throwable) indexCreationFailureException9);
        indexCreationFailureException1.addSuppressed((java.lang.Throwable) notConfiguredIdConvertorException6);
        com.clouway.cuse.spi.NotConfiguredIndexingStrategyException notConfiguredIndexingStrategyException12 = new com.clouway.cuse.spi.NotConfiguredIndexingStrategyException();
        com.clouway.cuse.spi.EmptySearchFilterException emptySearchFilterException13 = new com.clouway.cuse.spi.EmptySearchFilterException();
        notConfiguredIndexingStrategyException12.addSuppressed((java.lang.Throwable) emptySearchFilterException13);
        notConfiguredIdConvertorException6.addSuppressed((java.lang.Throwable) emptySearchFilterException13);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog1 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException2 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass3 = searchIndexMissmatchException2.getClass();
        com.clouway.cuse.spi.IdConverter idConverter4 = defaultIdConverterCatalog1.getConverter((java.lang.Class) wildcardClass3);
        com.clouway.cuse.spi.SearchEngine searchEngine5 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog1);
        com.clouway.cuse.spi.SortType sortType6 = com.clouway.cuse.spi.SortType.NUMERIC;
        java.lang.Class<?> wildcardClass7 = sortType6.getClass();
        com.clouway.cuse.spi.IdConverter idConverter8 = defaultIdConverterCatalog1.getConverter((java.lang.Class) wildcardClass7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = idConverter8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(idConverter4);
        org.junit.Assert.assertNotNull(searchEngine5);
        org.junit.Assert.assertTrue("'" + sortType6 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType6.equals(com.clouway.cuse.spi.SortType.NUMERIC));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(idConverter8);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        java.lang.String[] strArray1 = new java.lang.String[] { "com.clouway.cuse.spi.IndexCreationFailureException\\: " };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter2 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray1);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter3 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(searchFilter3);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException1 = new com.clouway.cuse.spi.IndexCreationFailureException("");
        com.clouway.cuse.spi.NotConfiguredIndexingStrategyException notConfiguredIndexingStrategyException2 = new com.clouway.cuse.spi.NotConfiguredIndexingStrategyException();
        indexCreationFailureException1.addSuppressed((java.lang.Throwable) notConfiguredIndexingStrategyException2);
        com.clouway.cuse.spi.NotConfiguredIdConvertorException notConfiguredIdConvertorException4 = new com.clouway.cuse.spi.NotConfiguredIdConvertorException();
        notConfiguredIndexingStrategyException2.addSuppressed((java.lang.Throwable) notConfiguredIdConvertorException4);
        java.lang.String str6 = notConfiguredIdConvertorException4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.clouway.cuse.spi.NotConfiguredIdConvertorException" + "'", str6, "com.clouway.cuse.spi.NotConfiguredIdConvertorException");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.LongIdConverter longIdConverter3 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str5 = longIdConverter3.convertFrom((java.lang.Object) 10.0d);
        com.clouway.cuse.spi.LongIdConverter longIdConverter6 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter8 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.lang.String str14 = searchFilter8.getValue((java.util.List<java.lang.String>) strList12);
        java.lang.String[] strArray17 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String str20 = searchFilter8.getValue((java.util.List<java.lang.String>) strList18);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter21 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList18);
        java.util.List<java.lang.Long> longList22 = longIdConverter6.convert((java.util.List<java.lang.String>) strList18);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter23 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList18);
        java.util.List<java.lang.Long> longList24 = longIdConverter3.convert((java.util.List<java.lang.String>) strList18);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy25 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.registerAll((java.util.List<java.lang.String>) strList18, indexingStrategy25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(searchFilter8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0:0 " + "'", str20, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter21);
        org.junit.Assert.assertNotNull(longList22);
        org.junit.Assert.assertNotNull(longList24);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer atomicFiledIndexer0 = new com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer();
        java.lang.reflect.Field field2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = atomicFiledIndexer0.index("0:(0:0  OR com.clouway.cuse.spi.IndexCreationFailureException:  OR 0 OR hi! OR com.clouway.cuse.spi.IndexCreationFailureException\\:  OR com.clouway.cuse.spi.IndexCreationFailureException\\: )", field2, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: 0:(0:0  OR com.clouway.cuse.spi.IndexCreationFailureException:  OR 0 OR hi! OR com.clouway.cuse.spi.IndexCreationFailureException\\:  OR com.clouway.cuse.spi.IndexCreationFailureException\\: )");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer atomicFiledIndexer0 = new com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter13 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.lang.String str19 = searchFilter13.getValue((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter20 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList17);
        java.lang.String str21 = orSearchFilter11.getValue((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter22 = com.clouway.cuse.gae.filters.SearchFilters.is((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter23 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList24 = atomicFiledIndexer0.index("0", field2, (java.lang.Object) orSearchFilter23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(searchFilter13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":( OR )" + "'", str21, ":( OR )");
        org.junit.Assert.assertNotNull(searchFilter22);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        java.util.Date date1 = null;
        com.clouway.cuse.spi.filters.SearchFilter searchFilter2 = com.clouway.cuse.gae.filters.SearchFilters.greaterThanOrEqualTo(date1);
        java.lang.String str3 = longIdConverter0.convertFrom((java.lang.Object) date1);
        com.clouway.cuse.spi.IndexWriter indexWriter4 = new com.clouway.cuse.spi.IndexWriter();
        java.lang.String[] strArray11 = new java.lang.String[] { "com.clouway.cuse.spi.IndexCreationFailureException: ", "com.clouway.cuse.spi.IndexCreationFailureException\\: ", "0", "0: 0: ", "", ":0 OR :0" };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter12 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray11);
        java.util.Set<java.lang.String> strSet13 = indexWriter4.createIndex(strArray11);
        java.lang.String[] strArray20 = new java.lang.String[] { "com.clouway.cuse.spi.IndexCreationFailureException: ", "com.clouway.cuse.spi.IndexCreationFailureException\\: ", "0", "0: 0: ", "", ":0 OR :0" };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter21 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray20);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter22 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray20);
        java.util.Set<java.lang.String> strSet23 = indexWriter4.createIndex(strArray20);
        java.lang.String str24 = longIdConverter0.convertFrom((java.lang.Object) indexWriter4);
        java.lang.String[] strArray25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet26 = indexWriter4.createIndex(strArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(searchFilter22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        java.lang.String str1 = com.clouway.cuse.spi.EscapeUtil.escape("0\\:hi! OR 0\\:hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0\\\\:hi! OR 0\\\\:hi!" + "'", str1, "0\\\\:hi! OR 0\\\\:hi!");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer fullWordSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is("com.clouway.cuse.spi.NotConfiguredIndexingStrategyException");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList5 = fullWordSearchFieldIndexer0.index("0:( OR ):( OR )", field2, (java.lang.Object) "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: 0:( OR ):( OR )");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        java.lang.Object obj3 = null;
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy4 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.register(obj3, indexingStrategy4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.clouway.cuse.gae.filedindexing.fulltextindex.FullTextSearchFieldCriteria fullTextSearchFieldCriteria0 = new com.clouway.cuse.gae.filedindexing.fulltextindex.FullTextSearchFieldCriteria();
        java.lang.reflect.Field field1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = fullTextSearchFieldCriteria0.match(field1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.clouway.cuse.gae.filedindexing.dateindex.DateFieldIndexer dateFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.dateindex.DateFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter12 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter14 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String str20 = searchFilter14.getValue((java.util.List<java.lang.String>) strList18);
        java.lang.String[] strArray23 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.lang.String str26 = searchFilter14.getValue((java.util.List<java.lang.String>) strList24);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter27 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList24);
        java.lang.String str28 = equalitySearchFilter12.getValue((java.util.List<java.lang.String>) strList24);
        com.clouway.cuse.spi.LongIdConverter longIdConverter29 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter31 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.lang.String str37 = searchFilter31.getValue((java.util.List<java.lang.String>) strList35);
        java.lang.String[] strArray40 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.lang.String str43 = searchFilter31.getValue((java.util.List<java.lang.String>) strList41);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter44 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList41);
        java.util.List<java.lang.Long> longList45 = longIdConverter29.convert((java.util.List<java.lang.String>) strList41);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException47 = new com.clouway.cuse.spi.IndexCreationFailureException(":( OR )");
        java.lang.String str48 = longIdConverter29.convertFrom((java.lang.Object) ":( OR )");
        com.clouway.cuse.spi.LongIdConverter longIdConverter49 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str51 = longIdConverter49.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str53 = longIdConverter49.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter54 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter56 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray59 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        java.lang.String str62 = searchFilter56.getValue((java.util.List<java.lang.String>) strList60);
        java.lang.String[] strArray65 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        java.lang.String str68 = searchFilter56.getValue((java.util.List<java.lang.String>) strList66);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter69 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList66);
        java.util.List<java.lang.Long> longList70 = longIdConverter54.convert((java.util.List<java.lang.String>) strList66);
        java.util.List<java.lang.Long> longList71 = longIdConverter49.convert((java.util.List<java.lang.String>) strList66);
        java.util.List<java.lang.Long> longList72 = longIdConverter29.convert((java.util.List<java.lang.String>) strList66);
        java.lang.String str73 = equalitySearchFilter12.getValue((java.util.List<java.lang.String>) strList66);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList74 = dateFieldIndexer0.index(":0 OR :0", field2, (java.lang.Object) equalitySearchFilter12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.clouway.cuse.gae.filters.EqualitySearchFilter cannot be cast to java.util.Date");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(searchFilter14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0:0 " + "'", str26, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0: 0: " + "'", str28, "0: 0: ");
        org.junit.Assert.assertNotNull(searchFilter31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0" + "'", str37, "0");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0:0 " + "'", str43, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter44);
        org.junit.Assert.assertNotNull(longList45);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(searchFilter56);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "0" + "'", str62, "0");
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "0:0 " + "'", str68, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter69);
        org.junit.Assert.assertNotNull(longList70);
        org.junit.Assert.assertNotNull(longList71);
        org.junit.Assert.assertNotNull(longList72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "0: 0: " + "'", str73, "0: 0: ");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.EntityLoader entityLoader3 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog4 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException5 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass6 = searchIndexMissmatchException5.getClass();
        com.clouway.cuse.spi.IdConverter idConverter7 = defaultIdConverterCatalog4.getConverter((java.lang.Class) wildcardClass6);
        com.clouway.cuse.spi.SearchEngine searchEngine8 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader3, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog4);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy9 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.register((java.lang.Object) defaultIdConverterCatalog4, indexingStrategy9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(idConverter7);
        org.junit.Assert.assertNotNull(searchEngine8);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.SearchEngine searchEngine1 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0);
        com.clouway.cuse.gae.filedindexing.dateindex.DateFieldCriteria dateFieldCriteria2 = new com.clouway.cuse.gae.filedindexing.dateindex.DateFieldCriteria();
        // The following exception was thrown during execution in test generation
        try {
            searchEngine1.register((java.lang.Object) dateFieldCriteria2);
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.NotConfiguredIndexingStrategyException; message: null");
        } catch (com.clouway.cuse.spi.NotConfiguredIndexingStrategyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchEngine1);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.clouway.cuse.gae.filedindexing.searchindex.SimpleSearchFieldIndexer simpleSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.searchindex.SimpleSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter13 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.lang.String str19 = searchFilter13.getValue((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter20 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList17);
        java.lang.String str21 = orSearchFilter11.getValue((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter22 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList23 = simpleSearchFieldIndexer0.index("0", field2, (java.lang.Object) strList17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(searchFilter13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":( OR )" + "'", str21, ":( OR )");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer atomicFiledIndexer0 = new com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        java.lang.String[] strArray22 = new java.lang.String[] { "0:( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: ", "com.clouway.cuse.spi.IndexCreationFailureException: ", "0: 0: ", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", ":( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: " };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.lang.String str25 = orSearchFilter11.getValue((java.util.List<java.lang.String>) strList23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList26 = atomicFiledIndexer0.index("com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", field2, (java.lang.Object) strList23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: com.clouway.cuse.spi.NotConfiguredIndexingStrategyException");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0:( OR ):( OR )" + "'", str25, "0:( OR ):( OR )");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.IdConverterCatalog idConverterCatalog1 = null;
        com.clouway.cuse.spi.SearchEngine searchEngine2 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, idConverterCatalog1);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter12 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter14 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String str20 = searchFilter14.getValue((java.util.List<java.lang.String>) strList18);
        java.lang.String[] strArray23 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.lang.String str26 = searchFilter14.getValue((java.util.List<java.lang.String>) strList24);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter27 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList24);
        java.lang.String str28 = equalitySearchFilter12.getValue((java.util.List<java.lang.String>) strList24);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter29 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList24);
        // The following exception was thrown during execution in test generation
        try {
            searchEngine2.registerAll((java.util.List<java.lang.String>) strList24);
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.SearchIndexMissingException; message: null");
        } catch (com.clouway.cuse.spi.SearchIndexMissingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchEngine2);
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(searchFilter14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0:0 " + "'", str26, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0: 0: " + "'", str28, "0: 0: ");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder gaeSearchApiMatchedIdObjectFinder0 = new com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter3 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.lang.String str9 = searchFilter3.getValue((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter10 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter11 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter13 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.lang.String str19 = searchFilter13.getValue((java.util.List<java.lang.String>) strList17);
        java.lang.String[] strArray22 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.lang.String str25 = searchFilter13.getValue((java.util.List<java.lang.String>) strList23);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter26 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList23);
        java.lang.String str27 = equalitySearchFilter11.getValue((java.util.List<java.lang.String>) strList23);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter28 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList23);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter29 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList23);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter31 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.lang.String str37 = searchFilter31.getValue((java.util.List<java.lang.String>) strList35);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter38 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList35);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter40 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.lang.String str46 = searchFilter40.getValue((java.util.List<java.lang.String>) strList44);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter47 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList44);
        java.lang.String str48 = orSearchFilter38.getValue((java.util.List<java.lang.String>) strList44);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter49 = com.clouway.cuse.gae.filters.SearchFilters.is((java.util.List<java.lang.String>) strList44);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter50 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList44);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter51 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList44);
        java.lang.String str52 = orSearchFilter29.getValue((java.util.List<java.lang.String>) strList44);
        com.clouway.cuse.spi.SortOrder sortOrder56 = com.clouway.cuse.spi.SortOrder.DESCENDING;
        com.clouway.cuse.spi.SortType sortType57 = com.clouway.cuse.spi.SortType.NUMERIC;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList58 = gaeSearchApiMatchedIdObjectFinder0.find("com.clouway.cuse.spi.IndexCreationFailureException: ", (java.util.List<java.lang.String>) strList44, 10, 0, ":( OR )", sortOrder56, sortType57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse sort expression ':( OR )': parse error at line 1 position 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(searchFilter13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0:0 " + "'", str25, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0: 0: " + "'", str27, "0: 0: ");
        org.junit.Assert.assertNotNull(searchFilter31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0" + "'", str37, "0");
        org.junit.Assert.assertNotNull(searchFilter40);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "0" + "'", str46, "0");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + ":( OR )" + "'", str48, ":( OR )");
        org.junit.Assert.assertNotNull(searchFilter49);
        org.junit.Assert.assertNotNull(searchFilter51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + ":(0 OR 0)" + "'", str52, ":(0 OR 0)");
        org.junit.Assert.assertTrue("'" + sortOrder56 + "' != '" + com.clouway.cuse.spi.SortOrder.DESCENDING + "'", sortOrder56.equals(com.clouway.cuse.spi.SortOrder.DESCENDING));
        org.junit.Assert.assertTrue("'" + sortType57 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType57.equals(com.clouway.cuse.spi.SortType.NUMERIC));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer fullWordSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = fullWordSearchFieldIndexer0.index(":0 OR :0", field2, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: :0 OR :0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer atomicFiledIndexer0 = new com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.IndexWriter indexWriter3 = new com.clouway.cuse.spi.IndexWriter();
        java.lang.String[] strArray10 = new java.lang.String[] { "com.clouway.cuse.spi.IndexCreationFailureException: ", "com.clouway.cuse.spi.IndexCreationFailureException\\: ", "0", "0: 0: ", "", ":0 OR :0" };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray10);
        java.util.Set<java.lang.String> strSet12 = indexWriter3.createIndex(strArray10);
        java.lang.String[] strArray19 = new java.lang.String[] { "com.clouway.cuse.spi.IndexCreationFailureException: ", "com.clouway.cuse.spi.IndexCreationFailureException\\: ", "0", "0: 0: ", "", ":0 OR :0" };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter20 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray19);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter21 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray19);
        java.util.Set<java.lang.String> strSet22 = indexWriter3.createIndex(strArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList23 = atomicFiledIndexer0.index("0:hi! OR 0:hi!", field2, (java.lang.Object) strSet22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: 0:hi! OR 0:hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(searchFilter21);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        java.util.Date date1 = null;
        com.clouway.cuse.spi.filters.SearchFilter searchFilter2 = com.clouway.cuse.gae.filters.SearchFilters.greaterThanOrEqualTo(date1);
        java.lang.String str3 = longIdConverter0.convertFrom((java.lang.Object) date1);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter5 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.lang.String str11 = searchFilter5.getValue((java.util.List<java.lang.String>) strList9);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter12 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList9);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter13 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList9);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter14 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList15 = longIdConverter0.convert((java.util.List<java.lang.String>) strList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(searchFilter5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter12 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter14 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String str20 = searchFilter14.getValue((java.util.List<java.lang.String>) strList18);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter21 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList18);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter23 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.lang.String str29 = searchFilter23.getValue((java.util.List<java.lang.String>) strList27);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter30 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList27);
        java.lang.String str31 = orSearchFilter21.getValue((java.util.List<java.lang.String>) strList27);
        java.lang.String str32 = equalitySearchFilter12.getValue((java.util.List<java.lang.String>) strList27);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy33 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.registerAll((java.util.List<java.lang.String>) strList27, indexingStrategy33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(searchFilter14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertNotNull(searchFilter23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ":( OR )" + "'", str31, ":( OR )");
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str2 = longIdConverter0.convertFrom((java.lang.Object) (short) 100);
        java.lang.Object obj3 = null;
        java.lang.String str4 = longIdConverter0.convertFrom(obj3);
        com.clouway.cuse.spi.IndexWriter indexWriter5 = new com.clouway.cuse.spi.IndexWriter();
        java.lang.String[] strArray12 = new java.lang.String[] { "com.clouway.cuse.spi.IndexCreationFailureException: ", "com.clouway.cuse.spi.IndexCreationFailureException\\: ", "0", "0: 0: ", "", ":0 OR :0" };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter13 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray12);
        java.util.Set<java.lang.String> strSet14 = indexWriter5.createIndex(strArray12);
        java.lang.String[] strArray21 = new java.lang.String[] { "com.clouway.cuse.spi.IndexCreationFailureException: ", "com.clouway.cuse.spi.IndexCreationFailureException\\: ", "0", "0: 0: ", "", ":0 OR :0" };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter22 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray21);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter23 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray21);
        java.util.Set<java.lang.String> strSet24 = indexWriter5.createIndex(strArray21);
        java.lang.String str25 = longIdConverter0.convertFrom((java.lang.Object) strArray21);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter26 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray21);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(searchFilter23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(searchFilter26);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException1 = new com.clouway.cuse.spi.IndexCreationFailureException("0:0 ");
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException3 = new com.clouway.cuse.spi.IndexCreationFailureException("");
        com.clouway.cuse.spi.NotConfiguredIndexingStrategyException notConfiguredIndexingStrategyException4 = new com.clouway.cuse.spi.NotConfiguredIndexingStrategyException();
        indexCreationFailureException3.addSuppressed((java.lang.Throwable) notConfiguredIndexingStrategyException4);
        com.clouway.cuse.spi.NotConfiguredIdConvertorException notConfiguredIdConvertorException6 = new com.clouway.cuse.spi.NotConfiguredIdConvertorException();
        notConfiguredIndexingStrategyException4.addSuppressed((java.lang.Throwable) notConfiguredIdConvertorException6);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException9 = new com.clouway.cuse.spi.IndexCreationFailureException("");
        notConfiguredIdConvertorException6.addSuppressed((java.lang.Throwable) indexCreationFailureException9);
        indexCreationFailureException1.addSuppressed((java.lang.Throwable) notConfiguredIdConvertorException6);
        java.lang.Class<?> wildcardClass12 = notConfiguredIdConvertorException6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        java.lang.String[] strArray9 = new java.lang.String[] { "com.clouway.cuse.spi.IndexCreationFailureException: ", "com.clouway.cuse.spi.IndexCreationFailureException\\: ", "0", "0: 0: ", "", ":0 OR :0" };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter10 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray9);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy11 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.register((java.lang.Object) strArray9, indexingStrategy11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException1 = new com.clouway.cuse.spi.IndexCreationFailureException("0:0 ");
        java.lang.String str2 = indexCreationFailureException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.clouway.cuse.spi.IndexCreationFailureException: 0:0 " + "'", str2, "com.clouway.cuse.spi.IndexCreationFailureException: 0:0 ");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer fullWordSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.anyIs("com.clouway.cuse.spi.IndexCreationFailureException: ");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList5 = fullWordSearchFieldIndexer0.index("", field2, (java.lang.Object) searchFilter4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.LongIdConverter longIdConverter3 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter5 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.lang.String str11 = searchFilter5.getValue((java.util.List<java.lang.String>) strList9);
        java.lang.String[] strArray14 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.lang.String str17 = searchFilter5.getValue((java.util.List<java.lang.String>) strList15);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter18 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.Long> longList19 = longIdConverter3.convert((java.util.List<java.lang.String>) strList15);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException21 = new com.clouway.cuse.spi.IndexCreationFailureException(":( OR )");
        java.lang.String str22 = longIdConverter3.convertFrom((java.lang.Object) ":( OR )");
        com.clouway.cuse.spi.LongIdConverter longIdConverter23 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str25 = longIdConverter23.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str27 = longIdConverter23.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter28 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter30 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.lang.String str36 = searchFilter30.getValue((java.util.List<java.lang.String>) strList34);
        java.lang.String[] strArray39 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.lang.String str42 = searchFilter30.getValue((java.util.List<java.lang.String>) strList40);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter43 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList40);
        java.util.List<java.lang.Long> longList44 = longIdConverter28.convert((java.util.List<java.lang.String>) strList40);
        java.util.List<java.lang.Long> longList45 = longIdConverter23.convert((java.util.List<java.lang.String>) strList40);
        java.util.List<java.lang.Long> longList46 = longIdConverter3.convert((java.util.List<java.lang.String>) strList40);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter48 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0:0 ");
        java.lang.String str49 = longIdConverter3.convertFrom((java.lang.Object) "0:0 ");
        com.clouway.cuse.spi.LongIdConverter longIdConverter50 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str52 = longIdConverter50.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str54 = longIdConverter50.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter55 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter57 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray60 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        java.lang.String str63 = searchFilter57.getValue((java.util.List<java.lang.String>) strList61);
        java.lang.String[] strArray66 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        java.lang.String str69 = searchFilter57.getValue((java.util.List<java.lang.String>) strList67);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter70 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList67);
        java.util.List<java.lang.Long> longList71 = longIdConverter55.convert((java.util.List<java.lang.String>) strList67);
        java.util.List<java.lang.Long> longList72 = longIdConverter50.convert((java.util.List<java.lang.String>) strList67);
        com.clouway.cuse.spi.LongIdConverter longIdConverter73 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str75 = longIdConverter73.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str77 = longIdConverter73.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter78 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter80 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray83 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList84 = new java.util.ArrayList<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList84, strArray83);
        java.lang.String str86 = searchFilter80.getValue((java.util.List<java.lang.String>) strList84);
        java.lang.String[] strArray89 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList90 = new java.util.ArrayList<java.lang.String>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList90, strArray89);
        java.lang.String str92 = searchFilter80.getValue((java.util.List<java.lang.String>) strList90);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter93 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList90);
        java.util.List<java.lang.Long> longList94 = longIdConverter78.convert((java.util.List<java.lang.String>) strList90);
        java.util.List<java.lang.Long> longList95 = longIdConverter73.convert((java.util.List<java.lang.String>) strList90);
        java.lang.String str96 = longIdConverter50.convertFrom((java.lang.Object) strList90);
        java.util.List<java.lang.Long> longList97 = longIdConverter3.convert((java.util.List<java.lang.String>) strList90);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy98 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.registerAll((java.util.List<java.lang.String>) strList90, indexingStrategy98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0:0 " + "'", str17, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter18);
        org.junit.Assert.assertNotNull(longList19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(searchFilter30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0" + "'", str36, "0");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0:0 " + "'", str42, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter43);
        org.junit.Assert.assertNotNull(longList44);
        org.junit.Assert.assertNotNull(longList45);
        org.junit.Assert.assertNotNull(longList46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(searchFilter57);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "0" + "'", str63, "0");
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "0:0 " + "'", str69, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter70);
        org.junit.Assert.assertNotNull(longList71);
        org.junit.Assert.assertNotNull(longList72);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(searchFilter80);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "0" + "'", str86, "0");
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "0:0 " + "'", str92, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter93);
        org.junit.Assert.assertNotNull(longList94);
        org.junit.Assert.assertNotNull(longList95);
        org.junit.Assert.assertNull(str96);
        org.junit.Assert.assertNotNull(longList97);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter1 = new com.clouway.cuse.gae.filters.EqualitySearchFilter(":0 OR :0");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog1 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException2 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass3 = searchIndexMissmatchException2.getClass();
        com.clouway.cuse.spi.IdConverter idConverter4 = defaultIdConverterCatalog1.getConverter((java.lang.Class) wildcardClass3);
        com.clouway.cuse.spi.SearchEngine searchEngine5 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog1);
        // The following exception was thrown during execution in test generation
        try {
            searchEngine5.register((java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.NotConfiguredIndexingStrategyException; message: null");
        } catch (com.clouway.cuse.spi.NotConfiguredIndexingStrategyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(idConverter4);
        org.junit.Assert.assertNotNull(searchEngine5);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        java.lang.String[] strArray22 = new java.lang.String[] { "0:( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: ", "com.clouway.cuse.spi.IndexCreationFailureException: ", "0: 0: ", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", ":( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: " };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.lang.String str25 = orSearchFilter11.getValue((java.util.List<java.lang.String>) strList23);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter27 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.lang.String str33 = searchFilter27.getValue((java.util.List<java.lang.String>) strList31);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter34 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList31);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter35 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList31);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter36 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList31);
        java.lang.String str37 = orSearchFilter11.getValue((java.util.List<java.lang.String>) strList31);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter39 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter41 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.lang.String str47 = searchFilter41.getValue((java.util.List<java.lang.String>) strList45);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter48 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList45);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter49 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList45);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter50 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList45);
        java.lang.String str51 = multiFieldValueFilter39.getValue((java.util.List<java.lang.String>) strList45);
        java.lang.String str52 = orSearchFilter11.getValue((java.util.List<java.lang.String>) strList45);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy53 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.register((java.lang.Object) str52, indexingStrategy53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0:( OR ):( OR )" + "'", str25, "0:( OR ):( OR )");
        org.junit.Assert.assertNotNull(searchFilter27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0" + "'", str33, "0");
        org.junit.Assert.assertNotNull(searchFilter36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ":( OR )" + "'", str37, ":( OR )");
        org.junit.Assert.assertNotNull(searchFilter41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "0" + "'", str47, "0");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + ":0 OR :0" + "'", str51, ":0 OR :0");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + ":( OR )" + "'", str52, ":( OR )");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer atomicFiledIndexer0 = new com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer atomicFiledIndexer3 = new com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = atomicFiledIndexer0.index("com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", field2, (java.lang.Object) atomicFiledIndexer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: com.clouway.cuse.spi.NotConfiguredIndexingStrategyException");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer idFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.NegativeSearchLimitException negativeSearchLimitException3 = new com.clouway.cuse.spi.NegativeSearchLimitException();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = idFieldIndexer0.index(":(hi! OR  OR )", field2, (java.lang.Object) negativeSearchLimitException3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: :(hi! OR  OR )");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.clouway.cuse.spi.StringIdConverter stringIdConverter0 = new com.clouway.cuse.spi.StringIdConverter();
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter2 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter12 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter13 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        java.lang.String str14 = multiFieldValueFilter2.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter15 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter16 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.spi.LongIdConverter longIdConverter17 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str19 = longIdConverter17.convertFrom((java.lang.Object) 10.0d);
        com.clouway.cuse.spi.LongIdConverter longIdConverter20 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter22 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.lang.String str28 = searchFilter22.getValue((java.util.List<java.lang.String>) strList26);
        java.lang.String[] strArray31 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.lang.String str34 = searchFilter22.getValue((java.util.List<java.lang.String>) strList32);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter35 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList32);
        java.util.List<java.lang.Long> longList36 = longIdConverter20.convert((java.util.List<java.lang.String>) strList32);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter37 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList32);
        java.util.List<java.lang.Long> longList38 = longIdConverter17.convert((java.util.List<java.lang.String>) strList32);
        java.lang.String str39 = equalitySearchFilter16.getValue((java.util.List<java.lang.String>) strList32);
        java.util.List<java.lang.String> strList40 = stringIdConverter0.convert((java.util.List<java.lang.String>) strList32);
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":0 OR :0" + "'", str14, ":0 OR :0");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(searchFilter22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0" + "'", str28, "0");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0:0 " + "'", str34, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter35);
        org.junit.Assert.assertNotNull(longList36);
        org.junit.Assert.assertNotNull(longList38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "0: 0: " + "'", str39, "0: 0: ");
        org.junit.Assert.assertNotNull(strList40);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.SortOrder sortOrder3 = com.clouway.cuse.spi.SortOrder.ASCENDING;
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy4 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.register((java.lang.Object) sortOrder3, indexingStrategy4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + sortOrder3 + "' != '" + com.clouway.cuse.spi.SortOrder.ASCENDING + "'", sortOrder3.equals(com.clouway.cuse.spi.SortOrder.ASCENDING));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog1 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException2 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass3 = searchIndexMissmatchException2.getClass();
        com.clouway.cuse.spi.IdConverter idConverter4 = defaultIdConverterCatalog1.getConverter((java.lang.Class) wildcardClass3);
        com.clouway.cuse.spi.SearchEngine searchEngine5 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog1);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter7 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.lang.String str13 = searchFilter7.getValue((java.util.List<java.lang.String>) strList11);
        java.lang.String[] strArray16 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.lang.String str19 = searchFilter7.getValue((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter20 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList17);
        // The following exception was thrown during execution in test generation
        try {
            searchEngine5.registerAll((java.util.List<java.lang.String>) strList17);
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.SearchIndexMissingException; message: null");
        } catch (com.clouway.cuse.spi.SearchIndexMissingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(idConverter4);
        org.junit.Assert.assertNotNull(searchEngine5);
        org.junit.Assert.assertNotNull(searchFilter7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0:0 " + "'", str19, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter20);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.IdConverterCatalog idConverterCatalog1 = null;
        com.clouway.cuse.spi.SearchEngine searchEngine2 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, idConverterCatalog1);
        com.clouway.cuse.spi.LongIdConverter longIdConverter3 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter5 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.lang.String str11 = searchFilter5.getValue((java.util.List<java.lang.String>) strList9);
        java.lang.String[] strArray14 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.lang.String str17 = searchFilter5.getValue((java.util.List<java.lang.String>) strList15);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter18 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.Long> longList19 = longIdConverter3.convert((java.util.List<java.lang.String>) strList15);
        // The following exception was thrown during execution in test generation
        try {
            searchEngine2.register((java.lang.Object) strList15);
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.NotConfiguredIndexingStrategyException; message: null");
        } catch (com.clouway.cuse.spi.NotConfiguredIndexingStrategyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchEngine2);
        org.junit.Assert.assertNotNull(searchFilter5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0:0 " + "'", str17, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter18);
        org.junit.Assert.assertNotNull(longList19);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str2 = longIdConverter0.convertFrom((java.lang.Object) 10.0d);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        com.clouway.cuse.spi.filters.SearchFilter searchFilter7 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray6);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter8 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray6);
        java.lang.String str9 = longIdConverter0.convertFrom((java.lang.Object) strArray6);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException11 = new com.clouway.cuse.spi.IndexCreationFailureException("");
        java.lang.Throwable[] throwableArray12 = indexCreationFailureException11.getSuppressed();
        java.lang.String str13 = longIdConverter0.convertFrom((java.lang.Object) indexCreationFailureException11);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter15 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.lang.String str21 = searchFilter15.getValue((java.util.List<java.lang.String>) strList19);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter22 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList19);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter23 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList19);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter25 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.lang.String str31 = searchFilter25.getValue((java.util.List<java.lang.String>) strList29);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter32 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList29);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter34 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.lang.String str40 = searchFilter34.getValue((java.util.List<java.lang.String>) strList38);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter41 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList38);
        java.lang.String str42 = orSearchFilter32.getValue((java.util.List<java.lang.String>) strList38);
        java.lang.String str43 = equalitySearchFilter23.getValue((java.util.List<java.lang.String>) strList38);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter45 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter47 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray50 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        java.lang.String str53 = searchFilter47.getValue((java.util.List<java.lang.String>) strList51);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter54 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList51);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter55 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList51);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter56 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList51);
        java.lang.String str57 = multiFieldValueFilter45.getValue((java.util.List<java.lang.String>) strList51);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter58 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList51);
        java.lang.String str59 = equalitySearchFilter23.getValue((java.util.List<java.lang.String>) strList51);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter60 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList51);
        java.lang.String str61 = longIdConverter0.convertFrom((java.lang.Object) orSearchFilter60);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(searchFilter7);
        org.junit.Assert.assertNotNull(searchFilter8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(searchFilter15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNotNull(searchFilter25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0" + "'", str31, "0");
        org.junit.Assert.assertNotNull(searchFilter34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0" + "'", str40, "0");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + ":( OR )" + "'", str42, ":( OR )");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(searchFilter47);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "0" + "'", str53, "0");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + ":0 OR :0" + "'", str57, ":0 OR :0");
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str61);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.lang.String str7 = searchFilter1.getValue((java.util.List<java.lang.String>) strList5);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter8 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList5);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter9 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList5);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter11 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.lang.String str17 = searchFilter11.getValue((java.util.List<java.lang.String>) strList15);
        java.lang.String[] strArray20 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.lang.String str23 = searchFilter11.getValue((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter24 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList21);
        java.lang.String str25 = equalitySearchFilter9.getValue((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter26 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter28 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.lang.String str34 = searchFilter28.getValue((java.util.List<java.lang.String>) strList32);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter35 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList32);
        java.lang.String[] strArray46 = new java.lang.String[] { "0:( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: ", "com.clouway.cuse.spi.IndexCreationFailureException: ", "0: 0: ", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", ":( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: " };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        java.lang.String str49 = orSearchFilter35.getValue((java.util.List<java.lang.String>) strList47);
        com.clouway.cuse.spi.LongIdConverter longIdConverter50 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter52 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray55 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        java.lang.String str58 = searchFilter52.getValue((java.util.List<java.lang.String>) strList56);
        java.lang.String[] strArray61 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        java.lang.String str64 = searchFilter52.getValue((java.util.List<java.lang.String>) strList62);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter65 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList62);
        java.util.List<java.lang.Long> longList66 = longIdConverter50.convert((java.util.List<java.lang.String>) strList62);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter67 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList62);
        java.lang.String str68 = orSearchFilter35.getValue((java.util.List<java.lang.String>) strList62);
        java.lang.String str69 = equalitySearchFilter26.getValue((java.util.List<java.lang.String>) strList62);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter71 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray74 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        java.lang.String str77 = searchFilter71.getValue((java.util.List<java.lang.String>) strList75);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter78 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList75);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter79 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList75);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter81 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray84 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList85, strArray84);
        java.lang.String str87 = searchFilter81.getValue((java.util.List<java.lang.String>) strList85);
        java.lang.String[] strArray90 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList91 = new java.util.ArrayList<java.lang.String>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList91, strArray90);
        java.lang.String str93 = searchFilter81.getValue((java.util.List<java.lang.String>) strList91);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter94 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList91);
        java.lang.String str95 = equalitySearchFilter79.getValue((java.util.List<java.lang.String>) strList91);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter96 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList91);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter97 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList91);
        java.lang.String str98 = equalitySearchFilter26.getValue((java.util.List<java.lang.String>) strList91);
        org.junit.Assert.assertNotNull(searchFilter1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(searchFilter11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0:0 " + "'", str23, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0: 0: " + "'", str25, "0: 0: ");
        org.junit.Assert.assertNotNull(searchFilter28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0" + "'", str34, "0");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "0:( OR ):( OR )" + "'", str49, "0:( OR ):( OR )");
        org.junit.Assert.assertNotNull(searchFilter52);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "0" + "'", str58, "0");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "0:0 " + "'", str64, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter65);
        org.junit.Assert.assertNotNull(longList66);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "0:( OR )" + "'", str68, "0:( OR )");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "0:0 0:0 " + "'", str69, "0:0 0:0 ");
        org.junit.Assert.assertNotNull(searchFilter71);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "0" + "'", str77, "0");
        org.junit.Assert.assertNotNull(searchFilter81);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "0" + "'", str87, "0");
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "0:0 " + "'", str93, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "0: 0: " + "'", str95, "0: 0: ");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "0:0 0:0 " + "'", str98, "0:0 0:0 ");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        java.util.List<java.lang.String> strList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList2 = longIdConverter0.convert(strList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.clouway.cuse.gae.filedindexing.dateindex.DateFieldIndexer dateFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.dateindex.DateFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter4 = new com.clouway.cuse.gae.filters.EqualitySearchFilter("com.clouway.cuse.spi.IndexCreationFailureException\\: ");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList5 = dateFieldIndexer0.index("0:(0:0  OR com.clouway.cuse.spi.IndexCreationFailureException:  OR 0 OR hi! OR com.clouway.cuse.spi.IndexCreationFailureException\\:  OR com.clouway.cuse.spi.IndexCreationFailureException\\: )", field2, (java.lang.Object) "com.clouway.cuse.spi.IndexCreationFailureException\\: ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.util.Date");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.lang.String str7 = searchFilter1.getValue((java.util.List<java.lang.String>) strList5);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter8 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList5);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter9 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList5);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter10 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList5);
        org.junit.Assert.assertNotNull(searchFilter1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(searchFilter10);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter1 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0:(0:0  OR com.clouway.cuse.spi.IndexCreationFailureException:  OR 0 OR hi! OR com.clouway.cuse.spi.IndexCreationFailureException\\:  OR com.clouway.cuse.spi.IndexCreationFailureException\\: )");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "" };
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray3);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter5 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray3);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter6 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray3);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter7 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(searchFilter5);
        org.junit.Assert.assertNotNull(searchFilter7);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        java.lang.String str1 = com.clouway.cuse.spi.EscapeUtil.escape("0:(0:0  OR com.clouway.cuse.spi.IndexCreationFailureException:  OR 0 OR hi! OR com.clouway.cuse.spi.IndexCreationFailureException\\:  OR com.clouway.cuse.spi.IndexCreationFailureException\\: )");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0\\:(0\\:0  OR com.clouway.cuse.spi.IndexCreationFailureException\\:  OR 0 OR hi! OR com.clouway.cuse.spi.IndexCreationFailureException\\\\:  OR com.clouway.cuse.spi.IndexCreationFailureException\\\\: )" + "'", str1, "0\\:(0\\:0  OR com.clouway.cuse.spi.IndexCreationFailureException\\:  OR 0 OR hi! OR com.clouway.cuse.spi.IndexCreationFailureException\\\\:  OR com.clouway.cuse.spi.IndexCreationFailureException\\\\: )");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer atomicFiledIndexer0 = new com.clouway.cuse.gae.filedindexing.atomic.AtomicFiledIndexer();
        java.lang.reflect.Field field2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "0:0 ", "com.clouway.cuse.spi.IndexCreationFailureException: ", "0", "hi!", "com.clouway.cuse.spi.IndexCreationFailureException\\: ", "com.clouway.cuse.spi.IndexCreationFailureException\\: " };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter10 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray9);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter12 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.lang.String str18 = searchFilter12.getValue((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter19 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter20 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter22 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.lang.String str28 = searchFilter22.getValue((java.util.List<java.lang.String>) strList26);
        java.lang.String[] strArray31 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.lang.String str34 = searchFilter22.getValue((java.util.List<java.lang.String>) strList32);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter35 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList32);
        java.lang.String str36 = equalitySearchFilter20.getValue((java.util.List<java.lang.String>) strList32);
        com.clouway.cuse.spi.LongIdConverter longIdConverter37 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter39 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.lang.String str45 = searchFilter39.getValue((java.util.List<java.lang.String>) strList43);
        java.lang.String[] strArray48 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        java.lang.String str51 = searchFilter39.getValue((java.util.List<java.lang.String>) strList49);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter52 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList49);
        java.util.List<java.lang.Long> longList53 = longIdConverter37.convert((java.util.List<java.lang.String>) strList49);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException55 = new com.clouway.cuse.spi.IndexCreationFailureException(":( OR )");
        java.lang.String str56 = longIdConverter37.convertFrom((java.lang.Object) ":( OR )");
        com.clouway.cuse.spi.LongIdConverter longIdConverter57 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str59 = longIdConverter57.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str61 = longIdConverter57.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter62 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter64 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray67 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        java.lang.String str70 = searchFilter64.getValue((java.util.List<java.lang.String>) strList68);
        java.lang.String[] strArray73 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        java.lang.String str76 = searchFilter64.getValue((java.util.List<java.lang.String>) strList74);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter77 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList74);
        java.util.List<java.lang.Long> longList78 = longIdConverter62.convert((java.util.List<java.lang.String>) strList74);
        java.util.List<java.lang.Long> longList79 = longIdConverter57.convert((java.util.List<java.lang.String>) strList74);
        java.util.List<java.lang.Long> longList80 = longIdConverter37.convert((java.util.List<java.lang.String>) strList74);
        java.lang.String str81 = equalitySearchFilter20.getValue((java.util.List<java.lang.String>) strList74);
        java.lang.String str82 = orSearchFilter10.getValue((java.util.List<java.lang.String>) strList74);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter83 = com.clouway.cuse.gae.filters.SearchFilters.is((java.util.List<java.lang.String>) strList74);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList84 = atomicFiledIndexer0.index("", field2, (java.lang.Object) strList74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(searchFilter12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
        org.junit.Assert.assertNotNull(searchFilter22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0" + "'", str28, "0");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0:0 " + "'", str34, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0: 0: " + "'", str36, "0: 0: ");
        org.junit.Assert.assertNotNull(searchFilter39);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "0" + "'", str45, "0");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "0:0 " + "'", str51, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter52);
        org.junit.Assert.assertNotNull(longList53);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(searchFilter64);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "0" + "'", str70, "0");
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "0:0 " + "'", str76, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter77);
        org.junit.Assert.assertNotNull(longList78);
        org.junit.Assert.assertNotNull(longList79);
        org.junit.Assert.assertNotNull(longList80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "0: 0: " + "'", str81, "0: 0: ");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "0:(0:0  OR com.clouway.cuse.spi.IndexCreationFailureException:  OR 0 OR hi! OR com.clouway.cuse.spi.IndexCreationFailureException\\:  OR com.clouway.cuse.spi.IndexCreationFailureException\\: )" + "'", str82, "0:(0:0  OR com.clouway.cuse.spi.IndexCreationFailureException:  OR 0 OR hi! OR com.clouway.cuse.spi.IndexCreationFailureException\\:  OR com.clouway.cuse.spi.IndexCreationFailureException\\: )");
        org.junit.Assert.assertNotNull(searchFilter83);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.IdConverterCatalog idConverterCatalog1 = null;
        com.clouway.cuse.spi.SearchEngine searchEngine2 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, idConverterCatalog1);
        com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldCriteria fullWordSearchFieldCriteria3 = new com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldCriteria();
        // The following exception was thrown during execution in test generation
        try {
            searchEngine2.register((java.lang.Object) fullWordSearchFieldCriteria3);
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.NotConfiguredIndexingStrategyException; message: null");
        } catch (com.clouway.cuse.spi.NotConfiguredIndexingStrategyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchEngine2);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.LongIdConverter longIdConverter3 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter5 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.lang.String str11 = searchFilter5.getValue((java.util.List<java.lang.String>) strList9);
        java.lang.String[] strArray14 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.lang.String str17 = searchFilter5.getValue((java.util.List<java.lang.String>) strList15);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter18 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.Long> longList19 = longIdConverter3.convert((java.util.List<java.lang.String>) strList15);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy20 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.register((java.lang.Object) longIdConverter3, indexingStrategy20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0:0 " + "'", str17, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter18);
        org.junit.Assert.assertNotNull(longList19);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.IdConverterCatalog idConverterCatalog1 = null;
        com.clouway.cuse.spi.SearchEngine searchEngine2 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, idConverterCatalog1);
        com.clouway.cuse.spi.LongIdConverter longIdConverter4 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter6 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.lang.String str12 = searchFilter6.getValue((java.util.List<java.lang.String>) strList10);
        java.lang.String[] strArray15 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.lang.String str18 = searchFilter6.getValue((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter19 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList16);
        java.util.List<java.lang.Long> longList20 = longIdConverter4.convert((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException22 = new com.clouway.cuse.spi.IndexCreationFailureException(":( OR )");
        java.lang.String str23 = longIdConverter4.convertFrom((java.lang.Object) ":( OR )");
        com.clouway.cuse.spi.LongIdConverter longIdConverter24 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str26 = longIdConverter24.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str28 = longIdConverter24.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter29 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter31 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.lang.String str37 = searchFilter31.getValue((java.util.List<java.lang.String>) strList35);
        java.lang.String[] strArray40 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.lang.String str43 = searchFilter31.getValue((java.util.List<java.lang.String>) strList41);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter44 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList41);
        java.util.List<java.lang.Long> longList45 = longIdConverter29.convert((java.util.List<java.lang.String>) strList41);
        java.util.List<java.lang.Long> longList46 = longIdConverter24.convert((java.util.List<java.lang.String>) strList41);
        java.util.List<java.lang.Long> longList47 = longIdConverter4.convert((java.util.List<java.lang.String>) strList41);
        // The following exception was thrown during execution in test generation
        try {
            searchEngine2.delete("0:( OR ):(com.clouway.cuse.spi.IndexCreationFailureException\\: )", longList47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index name must be ASCII visible printable: 0:( OR ):(com.clouway.cuse.spi.IndexCreationFailureException\\: )");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchEngine2);
        org.junit.Assert.assertNotNull(searchFilter6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0:0 " + "'", str18, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter19);
        org.junit.Assert.assertNotNull(longList20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(searchFilter31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0" + "'", str37, "0");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0:0 " + "'", str43, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter44);
        org.junit.Assert.assertNotNull(longList45);
        org.junit.Assert.assertNotNull(longList46);
        org.junit.Assert.assertNotNull(longList47);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str2 = longIdConverter0.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str4 = longIdConverter0.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter5 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter7 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.lang.String str13 = searchFilter7.getValue((java.util.List<java.lang.String>) strList11);
        java.lang.String[] strArray16 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.lang.String str19 = searchFilter7.getValue((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter20 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList17);
        java.util.List<java.lang.Long> longList21 = longIdConverter5.convert((java.util.List<java.lang.String>) strList17);
        java.util.List<java.lang.Long> longList22 = longIdConverter0.convert((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.spi.LongIdConverter longIdConverter23 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str25 = longIdConverter23.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str27 = longIdConverter23.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter28 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter30 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.lang.String str36 = searchFilter30.getValue((java.util.List<java.lang.String>) strList34);
        java.lang.String[] strArray39 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.lang.String str42 = searchFilter30.getValue((java.util.List<java.lang.String>) strList40);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter43 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList40);
        java.util.List<java.lang.Long> longList44 = longIdConverter28.convert((java.util.List<java.lang.String>) strList40);
        java.util.List<java.lang.Long> longList45 = longIdConverter23.convert((java.util.List<java.lang.String>) strList40);
        java.lang.String str46 = longIdConverter0.convertFrom((java.lang.Object) strList40);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter48 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.lang.String str54 = searchFilter48.getValue((java.util.List<java.lang.String>) strList52);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter55 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList52);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter56 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList52);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter57 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList52);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter59 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray62 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        java.lang.String str65 = searchFilter59.getValue((java.util.List<java.lang.String>) strList63);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter66 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList63);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter67 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList63);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter68 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList63);
        java.lang.String str69 = orSearchFilter57.getValue((java.util.List<java.lang.String>) strList63);
        java.lang.String str70 = longIdConverter0.convertFrom((java.lang.Object) str69);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(searchFilter7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0:0 " + "'", str19, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter20);
        org.junit.Assert.assertNotNull(longList21);
        org.junit.Assert.assertNotNull(longList22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(searchFilter30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0" + "'", str36, "0");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0:0 " + "'", str42, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter43);
        org.junit.Assert.assertNotNull(longList44);
        org.junit.Assert.assertNotNull(longList45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(searchFilter48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "0" + "'", str54, "0");
        org.junit.Assert.assertNotNull(searchFilter59);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "0" + "'", str65, "0");
        org.junit.Assert.assertNotNull(searchFilter68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + ":( OR )" + "'", str69, ":( OR )");
        org.junit.Assert.assertNull(str70);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter4 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter6 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.lang.String str12 = searchFilter6.getValue((java.util.List<java.lang.String>) strList10);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter13 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList10);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter14 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList10);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter15 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList10);
        java.lang.String str16 = multiFieldValueFilter4.getValue((java.util.List<java.lang.String>) strList10);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy17 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.register((java.lang.Object) strList10, indexingStrategy17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ":0 OR :0" + "'", str16, ":0 OR :0");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        com.clouway.cuse.gae.filedindexing.dateindex.DateFieldIndexer dateFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.dateindex.DateFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.LongIdConverter longIdConverter3 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter5 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.lang.String str11 = searchFilter5.getValue((java.util.List<java.lang.String>) strList9);
        java.lang.String[] strArray14 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.lang.String str17 = searchFilter5.getValue((java.util.List<java.lang.String>) strList15);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter18 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.Long> longList19 = longIdConverter3.convert((java.util.List<java.lang.String>) strList15);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException21 = new com.clouway.cuse.spi.IndexCreationFailureException(":( OR )");
        java.lang.String str22 = longIdConverter3.convertFrom((java.lang.Object) ":( OR )");
        com.clouway.cuse.spi.LongIdConverter longIdConverter23 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str25 = longIdConverter23.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str27 = longIdConverter23.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter28 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter30 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.lang.String str36 = searchFilter30.getValue((java.util.List<java.lang.String>) strList34);
        java.lang.String[] strArray39 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.lang.String str42 = searchFilter30.getValue((java.util.List<java.lang.String>) strList40);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter43 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList40);
        java.util.List<java.lang.Long> longList44 = longIdConverter28.convert((java.util.List<java.lang.String>) strList40);
        java.util.List<java.lang.Long> longList45 = longIdConverter23.convert((java.util.List<java.lang.String>) strList40);
        java.util.List<java.lang.Long> longList46 = longIdConverter3.convert((java.util.List<java.lang.String>) strList40);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList47 = dateFieldIndexer0.index(":( OR )", field2, (java.lang.Object) longIdConverter3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.clouway.cuse.spi.LongIdConverter cannot be cast to java.util.Date");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0:0 " + "'", str17, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter18);
        org.junit.Assert.assertNotNull(longList19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(searchFilter30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0" + "'", str36, "0");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0:0 " + "'", str42, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter43);
        org.junit.Assert.assertNotNull(longList44);
        org.junit.Assert.assertNotNull(longList45);
        org.junit.Assert.assertNotNull(longList46);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str2 = longIdConverter0.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str4 = longIdConverter0.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter5 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter7 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.lang.String str13 = searchFilter7.getValue((java.util.List<java.lang.String>) strList11);
        java.lang.String[] strArray16 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.lang.String str19 = searchFilter7.getValue((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter20 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList17);
        java.util.List<java.lang.Long> longList21 = longIdConverter5.convert((java.util.List<java.lang.String>) strList17);
        java.util.List<java.lang.Long> longList22 = longIdConverter0.convert((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.spi.LongIdConverter longIdConverter23 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str25 = longIdConverter23.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str27 = longIdConverter23.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter28 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter30 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.lang.String str36 = searchFilter30.getValue((java.util.List<java.lang.String>) strList34);
        java.lang.String[] strArray39 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.lang.String str42 = searchFilter30.getValue((java.util.List<java.lang.String>) strList40);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter43 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList40);
        java.util.List<java.lang.Long> longList44 = longIdConverter28.convert((java.util.List<java.lang.String>) strList40);
        java.util.List<java.lang.Long> longList45 = longIdConverter23.convert((java.util.List<java.lang.String>) strList40);
        java.lang.String str46 = longIdConverter0.convertFrom((java.lang.Object) strList40);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter48 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("hi!");
        com.clouway.cuse.spi.LongIdConverter longIdConverter49 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter51 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        java.lang.String str57 = searchFilter51.getValue((java.util.List<java.lang.String>) strList55);
        java.lang.String[] strArray60 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        java.lang.String str63 = searchFilter51.getValue((java.util.List<java.lang.String>) strList61);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter64 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList61);
        java.util.List<java.lang.Long> longList65 = longIdConverter49.convert((java.util.List<java.lang.String>) strList61);
        java.lang.String str66 = multiFieldValueFilter48.getValue((java.util.List<java.lang.String>) strList61);
        java.util.List<java.lang.Long> longList67 = longIdConverter0.convert((java.util.List<java.lang.String>) strList61);
        java.util.List<java.lang.String> strList68 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList69 = longIdConverter0.convert(strList68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(searchFilter7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0:0 " + "'", str19, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter20);
        org.junit.Assert.assertNotNull(longList21);
        org.junit.Assert.assertNotNull(longList22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(searchFilter30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0" + "'", str36, "0");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0:0 " + "'", str42, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter43);
        org.junit.Assert.assertNotNull(longList44);
        org.junit.Assert.assertNotNull(longList45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(searchFilter51);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "0" + "'", str57, "0");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "0:0 " + "'", str63, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter64);
        org.junit.Assert.assertNotNull(longList65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "0:hi! OR 0:hi!" + "'", str66, "0:hi! OR 0:hi!");
        org.junit.Assert.assertNotNull(longList67);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        java.lang.String str1 = com.clouway.cuse.spi.EscapeUtil.escape("0:0 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0\\:0 " + "'", str1, "0\\:0 ");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        java.lang.String[] strArray22 = new java.lang.String[] { "0:( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: ", "com.clouway.cuse.spi.IndexCreationFailureException: ", "0: 0: ", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", ":( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: " };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.lang.String str25 = orSearchFilter11.getValue((java.util.List<java.lang.String>) strList23);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter27 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.lang.String str33 = searchFilter27.getValue((java.util.List<java.lang.String>) strList31);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter34 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList31);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter35 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList31);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter36 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList31);
        java.lang.String str37 = orSearchFilter11.getValue((java.util.List<java.lang.String>) strList31);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter39 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter41 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.lang.String str47 = searchFilter41.getValue((java.util.List<java.lang.String>) strList45);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter48 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList45);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter49 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList45);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter50 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList45);
        java.lang.String str51 = multiFieldValueFilter39.getValue((java.util.List<java.lang.String>) strList45);
        java.lang.String str52 = orSearchFilter11.getValue((java.util.List<java.lang.String>) strList45);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy53 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.register((java.lang.Object) strList45, indexingStrategy53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0:( OR ):( OR )" + "'", str25, "0:( OR ):( OR )");
        org.junit.Assert.assertNotNull(searchFilter27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0" + "'", str33, "0");
        org.junit.Assert.assertNotNull(searchFilter36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ":( OR )" + "'", str37, ":( OR )");
        org.junit.Assert.assertNotNull(searchFilter41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "0" + "'", str47, "0");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + ":0 OR :0" + "'", str51, ":0 OR :0");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + ":( OR )" + "'", str52, ":( OR )");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.clouway.cuse.gae.filedindexing.fulltextindex.FullTextSearchFieldIndexer fullTextSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.fulltextindex.FullTextSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = fullTextSearchFieldIndexer0.index("0:0 ", field2, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: 0:0 ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str2 = longIdConverter0.convertFrom((java.lang.Object) 10.0d);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        com.clouway.cuse.spi.filters.SearchFilter searchFilter7 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray6);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter8 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray6);
        java.lang.String str9 = longIdConverter0.convertFrom((java.lang.Object) strArray6);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException11 = new com.clouway.cuse.spi.IndexCreationFailureException("");
        java.lang.Throwable[] throwableArray12 = indexCreationFailureException11.getSuppressed();
        java.lang.String str13 = longIdConverter0.convertFrom((java.lang.Object) indexCreationFailureException11);
        java.lang.String str14 = indexCreationFailureException11.toString();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(searchFilter7);
        org.junit.Assert.assertNotNull(searchFilter8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.clouway.cuse.spi.IndexCreationFailureException: " + "'", str14, "com.clouway.cuse.spi.IndexCreationFailureException: ");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str2 = longIdConverter0.convertFrom((java.lang.Object) 10.0d);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        com.clouway.cuse.spi.filters.SearchFilter searchFilter7 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray6);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter8 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray6);
        java.lang.String str9 = longIdConverter0.convertFrom((java.lang.Object) strArray6);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter10 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray6);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray6);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(searchFilter7);
        org.junit.Assert.assertNotNull(searchFilter8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.clouway.cuse.gae.filedindexing.dateindex.DateFieldIndexer dateFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.dateindex.DateFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.LongIdConverter longIdConverter3 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str5 = longIdConverter3.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str7 = longIdConverter3.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter8 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter10 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.lang.String str16 = searchFilter10.getValue((java.util.List<java.lang.String>) strList14);
        java.lang.String[] strArray19 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.lang.String str22 = searchFilter10.getValue((java.util.List<java.lang.String>) strList20);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter23 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList20);
        java.util.List<java.lang.Long> longList24 = longIdConverter8.convert((java.util.List<java.lang.String>) strList20);
        java.util.List<java.lang.Long> longList25 = longIdConverter3.convert((java.util.List<java.lang.String>) strList20);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException27 = new com.clouway.cuse.spi.IndexCreationFailureException("0:( OR )");
        java.lang.String str28 = longIdConverter3.convertFrom((java.lang.Object) indexCreationFailureException27);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList29 = dateFieldIndexer0.index(":(0 OR 0)", field2, (java.lang.Object) indexCreationFailureException27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.clouway.cuse.spi.IndexCreationFailureException cannot be cast to java.util.Date");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(searchFilter10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0:0 " + "'", str22, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter23);
        org.junit.Assert.assertNotNull(longList24);
        org.junit.Assert.assertNotNull(longList25);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.clouway.cuse.gae.filedindexing.searchindex.SimpleSearchFieldIndexer simpleSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.searchindex.SimpleSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter4 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("com.clouway.cuse.spi.IndexCreationFailureException: ");
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter6 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter8 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.lang.String str14 = searchFilter8.getValue((java.util.List<java.lang.String>) strList12);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter15 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList12);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter16 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList12);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter18 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.lang.String str24 = searchFilter18.getValue((java.util.List<java.lang.String>) strList22);
        java.lang.String[] strArray27 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.lang.String str30 = searchFilter18.getValue((java.util.List<java.lang.String>) strList28);
        java.lang.String str31 = orSearchFilter16.getValue((java.util.List<java.lang.String>) strList28);
        java.lang.String str32 = multiFieldValueFilter6.getValue((java.util.List<java.lang.String>) strList28);
        java.lang.String str33 = multiFieldValueFilter4.getValue((java.util.List<java.lang.String>) strList28);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList34 = simpleSearchFieldIndexer0.index("0:hi! OR 0:hi!", field2, (java.lang.Object) strList28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: 0:hi! OR 0:hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertNotNull(searchFilter18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0" + "'", str24, "0");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0:0 " + "'", str30, "0:0 ");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0:( OR )" + "'", str31, "0:( OR )");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0:0 OR 0:0" + "'", str32, "0:0 OR 0:0");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0:com.clouway.cuse.spi.IndexCreationFailureException:  OR 0:com.clouway.cuse.spi.IndexCreationFailureException: " + "'", str33, "0:com.clouway.cuse.spi.IndexCreationFailureException:  OR 0:com.clouway.cuse.spi.IndexCreationFailureException: ");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.clouway.cuse.spi.NotConfiguredIndexingStrategyException notConfiguredIndexingStrategyException0 = new com.clouway.cuse.spi.NotConfiguredIndexingStrategyException();
        com.clouway.cuse.spi.EmptySearchFilterException emptySearchFilterException1 = new com.clouway.cuse.spi.EmptySearchFilterException();
        notConfiguredIndexingStrategyException0.addSuppressed((java.lang.Throwable) emptySearchFilterException1);
        java.lang.String str3 = notConfiguredIndexingStrategyException0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException" + "'", str3, "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.EntityLoader entityLoader1 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog2 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException3 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass4 = searchIndexMissmatchException3.getClass();
        com.clouway.cuse.spi.IdConverter idConverter5 = defaultIdConverterCatalog2.getConverter((java.lang.Class) wildcardClass4);
        com.clouway.cuse.spi.SearchEngine searchEngine6 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader1, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog2);
        com.clouway.cuse.spi.SortType sortType7 = com.clouway.cuse.spi.SortType.NUMERIC;
        java.lang.Class<?> wildcardClass8 = sortType7.getClass();
        com.clouway.cuse.spi.IdConverter idConverter9 = defaultIdConverterCatalog2.getConverter((java.lang.Class) wildcardClass8);
        java.lang.Class class10 = null;
        com.clouway.cuse.spi.IdConverter idConverter11 = defaultIdConverterCatalog2.getConverter(class10);
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException12 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass13 = searchIndexMissmatchException12.getClass();
        com.clouway.cuse.spi.StringIdConverter stringIdConverter14 = new com.clouway.cuse.spi.StringIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter16 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 100);
        java.lang.String str17 = stringIdConverter14.convertFrom((java.lang.Object) 100);
        defaultIdConverterCatalog2.addIdConverter((java.lang.Class) wildcardClass13, (com.clouway.cuse.spi.IdConverter) stringIdConverter14);
        com.clouway.cuse.spi.SearchEngine searchEngine19 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog2);
        com.clouway.cuse.spi.LongIdConverter longIdConverter21 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str23 = longIdConverter21.convertFrom((java.lang.Object) 10.0d);
        com.clouway.cuse.spi.LongIdConverter longIdConverter24 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter26 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.lang.String str32 = searchFilter26.getValue((java.util.List<java.lang.String>) strList30);
        java.lang.String[] strArray35 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String str38 = searchFilter26.getValue((java.util.List<java.lang.String>) strList36);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter39 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList36);
        java.util.List<java.lang.Long> longList40 = longIdConverter24.convert((java.util.List<java.lang.String>) strList36);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter41 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList36);
        java.util.List<java.lang.Long> longList42 = longIdConverter21.convert((java.util.List<java.lang.String>) strList36);
        // The following exception was thrown during execution in test generation
        try {
            searchEngine19.delete("com.clouway.cuse.spi.IndexCreationFailureException: ", longList42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index name must be ASCII visible printable: com.clouway.cuse.spi.IndexCreationFailureException: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(idConverter5);
        org.junit.Assert.assertNotNull(searchEngine6);
        org.junit.Assert.assertTrue("'" + sortType7 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType7.equals(com.clouway.cuse.spi.SortType.NUMERIC));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(idConverter9);
        org.junit.Assert.assertNull(idConverter11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(searchFilter16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(searchEngine19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(searchFilter26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0" + "'", str32, "0");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0:0 " + "'", str38, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter39);
        org.junit.Assert.assertNotNull(longList40);
        org.junit.Assert.assertNotNull(longList42);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter1 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter3 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.lang.String str9 = searchFilter3.getValue((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter10 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter11 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter12 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList7);
        java.lang.String str13 = multiFieldValueFilter1.getValue((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter14 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter16 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.lang.String str22 = searchFilter16.getValue((java.util.List<java.lang.String>) strList20);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter23 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList20);
        java.lang.String[] strArray34 = new java.lang.String[] { "0:( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: ", "com.clouway.cuse.spi.IndexCreationFailureException: ", "0: 0: ", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", ":( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: " };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.lang.String str37 = orSearchFilter23.getValue((java.util.List<java.lang.String>) strList35);
        com.clouway.cuse.spi.LongIdConverter longIdConverter38 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter40 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.lang.String str46 = searchFilter40.getValue((java.util.List<java.lang.String>) strList44);
        java.lang.String[] strArray49 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        java.lang.String str52 = searchFilter40.getValue((java.util.List<java.lang.String>) strList50);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter53 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList50);
        java.util.List<java.lang.Long> longList54 = longIdConverter38.convert((java.util.List<java.lang.String>) strList50);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter55 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList50);
        java.lang.String str56 = orSearchFilter23.getValue((java.util.List<java.lang.String>) strList50);
        java.lang.String str57 = equalitySearchFilter14.getValue((java.util.List<java.lang.String>) strList50);
        org.junit.Assert.assertNotNull(searchFilter3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":0 OR :0" + "'", str13, ":0 OR :0");
        org.junit.Assert.assertNotNull(searchFilter16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0:( OR ):( OR )" + "'", str37, "0:( OR ):( OR )");
        org.junit.Assert.assertNotNull(searchFilter40);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "0" + "'", str46, "0");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "0:0 " + "'", str52, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter53);
        org.junit.Assert.assertNotNull(longList54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "0:( OR )" + "'", str56, "0:( OR )");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "0: 0: " + "'", str57, "0: 0: ");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder gaeSearchApiMatchedIdObjectFinder0 = new com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder();
        com.clouway.cuse.spi.LongIdConverter longIdConverter2 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str4 = longIdConverter2.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str6 = longIdConverter2.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter7 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter9 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.lang.String str15 = searchFilter9.getValue((java.util.List<java.lang.String>) strList13);
        java.lang.String[] strArray18 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.lang.String str21 = searchFilter9.getValue((java.util.List<java.lang.String>) strList19);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter22 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList19);
        java.util.List<java.lang.Long> longList23 = longIdConverter7.convert((java.util.List<java.lang.String>) strList19);
        java.util.List<java.lang.Long> longList24 = longIdConverter2.convert((java.util.List<java.lang.String>) strList19);
        com.clouway.cuse.spi.LongIdConverter longIdConverter25 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str27 = longIdConverter25.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str29 = longIdConverter25.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter30 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter32 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String str38 = searchFilter32.getValue((java.util.List<java.lang.String>) strList36);
        java.lang.String[] strArray41 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.lang.String str44 = searchFilter32.getValue((java.util.List<java.lang.String>) strList42);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter45 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList42);
        java.util.List<java.lang.Long> longList46 = longIdConverter30.convert((java.util.List<java.lang.String>) strList42);
        java.util.List<java.lang.Long> longList47 = longIdConverter25.convert((java.util.List<java.lang.String>) strList42);
        java.lang.String str48 = longIdConverter2.convertFrom((java.lang.Object) strList42);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter50 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("hi!");
        com.clouway.cuse.spi.LongIdConverter longIdConverter51 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter53 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray56 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        java.lang.String str59 = searchFilter53.getValue((java.util.List<java.lang.String>) strList57);
        java.lang.String[] strArray62 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        java.lang.String str65 = searchFilter53.getValue((java.util.List<java.lang.String>) strList63);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter66 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList63);
        java.util.List<java.lang.Long> longList67 = longIdConverter51.convert((java.util.List<java.lang.String>) strList63);
        java.lang.String str68 = multiFieldValueFilter50.getValue((java.util.List<java.lang.String>) strList63);
        java.util.List<java.lang.Long> longList69 = longIdConverter2.convert((java.util.List<java.lang.String>) strList63);
        com.clouway.cuse.spi.SortOrder sortOrder73 = com.clouway.cuse.spi.SortOrder.ASCENDING;
        com.clouway.cuse.spi.SortType sortType74 = com.clouway.cuse.spi.SortType.TEXT;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList75 = gaeSearchApiMatchedIdObjectFinder0.find(":0 OR :0", (java.util.List<java.lang.String>) strList63, (int) (short) 0, (int) 'a', "0:( OR )", sortOrder73, sortType74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse sort expression '0:( OR )': parse error at line 1 position 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(searchFilter9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0:0 " + "'", str21, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter22);
        org.junit.Assert.assertNotNull(longList23);
        org.junit.Assert.assertNotNull(longList24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(searchFilter32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0" + "'", str38, "0");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "0:0 " + "'", str44, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter45);
        org.junit.Assert.assertNotNull(longList46);
        org.junit.Assert.assertNotNull(longList47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(searchFilter53);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "0" + "'", str59, "0");
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "0:0 " + "'", str65, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter66);
        org.junit.Assert.assertNotNull(longList67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "0:hi! OR 0:hi!" + "'", str68, "0:hi! OR 0:hi!");
        org.junit.Assert.assertNotNull(longList69);
        org.junit.Assert.assertTrue("'" + sortOrder73 + "' != '" + com.clouway.cuse.spi.SortOrder.ASCENDING + "'", sortOrder73.equals(com.clouway.cuse.spi.SortOrder.ASCENDING));
        org.junit.Assert.assertTrue("'" + sortType74 + "' != '" + com.clouway.cuse.spi.SortType.TEXT + "'", sortType74.equals(com.clouway.cuse.spi.SortType.TEXT));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        java.lang.String str1 = com.clouway.cuse.spi.EscapeUtil.escape("0\\:(0\\:0  OR com.clouway.cuse.spi.IndexCreationFailureException\\:  OR 0 OR hi! OR com.clouway.cuse.spi.IndexCreationFailureException\\\\:  OR com.clouway.cuse.spi.IndexCreationFailureException\\\\: )");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0\\\\:(0\\\\:0  OR com.clouway.cuse.spi.IndexCreationFailureException\\\\:  OR 0 OR hi! OR com.clouway.cuse.spi.IndexCreationFailureException\\\\\\:  OR com.clouway.cuse.spi.IndexCreationFailureException\\\\\\: )" + "'", str1, "0\\\\:(0\\\\:0  OR com.clouway.cuse.spi.IndexCreationFailureException\\\\:  OR 0 OR hi! OR com.clouway.cuse.spi.IndexCreationFailureException\\\\\\:  OR com.clouway.cuse.spi.IndexCreationFailureException\\\\\\: )");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str2 = longIdConverter0.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str4 = longIdConverter0.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter5 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter7 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.lang.String str13 = searchFilter7.getValue((java.util.List<java.lang.String>) strList11);
        java.lang.String[] strArray16 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.lang.String str19 = searchFilter7.getValue((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter20 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList17);
        java.util.List<java.lang.Long> longList21 = longIdConverter5.convert((java.util.List<java.lang.String>) strList17);
        java.util.List<java.lang.Long> longList22 = longIdConverter0.convert((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.spi.LongIdConverter longIdConverter23 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str25 = longIdConverter23.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str27 = longIdConverter23.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter28 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter30 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.lang.String str36 = searchFilter30.getValue((java.util.List<java.lang.String>) strList34);
        java.lang.String[] strArray39 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.lang.String str42 = searchFilter30.getValue((java.util.List<java.lang.String>) strList40);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter43 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList40);
        java.util.List<java.lang.Long> longList44 = longIdConverter28.convert((java.util.List<java.lang.String>) strList40);
        java.util.List<java.lang.Long> longList45 = longIdConverter23.convert((java.util.List<java.lang.String>) strList40);
        java.lang.String str46 = longIdConverter0.convertFrom((java.lang.Object) strList40);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter48 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("hi!");
        com.clouway.cuse.spi.LongIdConverter longIdConverter49 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter51 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        java.lang.String str57 = searchFilter51.getValue((java.util.List<java.lang.String>) strList55);
        java.lang.String[] strArray60 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        java.lang.String str63 = searchFilter51.getValue((java.util.List<java.lang.String>) strList61);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter64 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList61);
        java.util.List<java.lang.Long> longList65 = longIdConverter49.convert((java.util.List<java.lang.String>) strList61);
        java.lang.String str66 = multiFieldValueFilter48.getValue((java.util.List<java.lang.String>) strList61);
        java.util.List<java.lang.Long> longList67 = longIdConverter0.convert((java.util.List<java.lang.String>) strList61);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter68 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList61);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(searchFilter7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0:0 " + "'", str19, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter20);
        org.junit.Assert.assertNotNull(longList21);
        org.junit.Assert.assertNotNull(longList22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(searchFilter30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0" + "'", str36, "0");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0:0 " + "'", str42, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter43);
        org.junit.Assert.assertNotNull(longList44);
        org.junit.Assert.assertNotNull(longList45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(searchFilter51);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "0" + "'", str57, "0");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "0:0 " + "'", str63, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter64);
        org.junit.Assert.assertNotNull(longList65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "0:hi! OR 0:hi!" + "'", str66, "0:hi! OR 0:hi!");
        org.junit.Assert.assertNotNull(longList67);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        java.lang.String[] strArray22 = new java.lang.String[] { "0:( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: ", "com.clouway.cuse.spi.IndexCreationFailureException: ", "0: 0: ", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", ":( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: " };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.lang.String str25 = orSearchFilter11.getValue((java.util.List<java.lang.String>) strList23);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter27 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.lang.String str33 = searchFilter27.getValue((java.util.List<java.lang.String>) strList31);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter34 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList31);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter35 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList31);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter36 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList31);
        java.lang.String str37 = orSearchFilter11.getValue((java.util.List<java.lang.String>) strList31);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter39 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter41 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.lang.String str47 = searchFilter41.getValue((java.util.List<java.lang.String>) strList45);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter48 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList45);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter49 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList45);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter50 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList45);
        java.lang.String str51 = multiFieldValueFilter39.getValue((java.util.List<java.lang.String>) strList45);
        java.lang.String str52 = orSearchFilter11.getValue((java.util.List<java.lang.String>) strList45);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter54 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray57 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        java.lang.String str60 = searchFilter54.getValue((java.util.List<java.lang.String>) strList58);
        java.lang.String str61 = orSearchFilter11.getValue((java.util.List<java.lang.String>) strList58);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy62 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.registerAll((java.util.List<java.lang.String>) strList58, indexingStrategy62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0:( OR ):( OR )" + "'", str25, "0:( OR ):( OR )");
        org.junit.Assert.assertNotNull(searchFilter27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0" + "'", str33, "0");
        org.junit.Assert.assertNotNull(searchFilter36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ":( OR )" + "'", str37, ":( OR )");
        org.junit.Assert.assertNotNull(searchFilter41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "0" + "'", str47, "0");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + ":0 OR :0" + "'", str51, ":0 OR :0");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + ":( OR )" + "'", str52, ":( OR )");
        org.junit.Assert.assertNotNull(searchFilter54);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "0" + "'", str60, "0");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + ":( OR )" + "'", str61, ":( OR )");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter2 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.lang.String str8 = searchFilter2.getValue((java.util.List<java.lang.String>) strList6);
        java.lang.String[] strArray11 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.lang.String str14 = searchFilter2.getValue((java.util.List<java.lang.String>) strList12);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter15 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList12);
        java.util.List<java.lang.Long> longList16 = longIdConverter0.convert((java.util.List<java.lang.String>) strList12);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException18 = new com.clouway.cuse.spi.IndexCreationFailureException(":( OR )");
        java.lang.String str19 = longIdConverter0.convertFrom((java.lang.Object) ":( OR )");
        com.clouway.cuse.spi.LongIdConverter longIdConverter20 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str22 = longIdConverter20.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str24 = longIdConverter20.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter25 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter27 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.lang.String str33 = searchFilter27.getValue((java.util.List<java.lang.String>) strList31);
        java.lang.String[] strArray36 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        java.lang.String str39 = searchFilter27.getValue((java.util.List<java.lang.String>) strList37);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter40 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList37);
        java.util.List<java.lang.Long> longList41 = longIdConverter25.convert((java.util.List<java.lang.String>) strList37);
        java.util.List<java.lang.Long> longList42 = longIdConverter20.convert((java.util.List<java.lang.String>) strList37);
        java.util.List<java.lang.Long> longList43 = longIdConverter0.convert((java.util.List<java.lang.String>) strList37);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter45 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0:0 ");
        java.lang.String str46 = longIdConverter0.convertFrom((java.lang.Object) "0:0 ");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter48 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.lang.String str54 = searchFilter48.getValue((java.util.List<java.lang.String>) strList52);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter55 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList52);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter56 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList52);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter58 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        java.lang.String str64 = searchFilter58.getValue((java.util.List<java.lang.String>) strList62);
        java.lang.String[] strArray67 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        java.lang.String str70 = searchFilter58.getValue((java.util.List<java.lang.String>) strList68);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter71 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList68);
        java.lang.String str72 = equalitySearchFilter56.getValue((java.util.List<java.lang.String>) strList68);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter73 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList68);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter74 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList68);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter76 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray79 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList80 = new java.util.ArrayList<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList80, strArray79);
        java.lang.String str82 = searchFilter76.getValue((java.util.List<java.lang.String>) strList80);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter83 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList80);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter85 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray88 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList89 = new java.util.ArrayList<java.lang.String>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList89, strArray88);
        java.lang.String str91 = searchFilter85.getValue((java.util.List<java.lang.String>) strList89);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter92 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList89);
        java.lang.String str93 = orSearchFilter83.getValue((java.util.List<java.lang.String>) strList89);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter94 = com.clouway.cuse.gae.filters.SearchFilters.is((java.util.List<java.lang.String>) strList89);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter95 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList89);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter96 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList89);
        java.lang.String str97 = orSearchFilter74.getValue((java.util.List<java.lang.String>) strList89);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList98 = longIdConverter0.convert((java.util.List<java.lang.String>) strList89);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:0 " + "'", str14, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter15);
        org.junit.Assert.assertNotNull(longList16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(searchFilter27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0" + "'", str33, "0");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "0:0 " + "'", str39, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter40);
        org.junit.Assert.assertNotNull(longList41);
        org.junit.Assert.assertNotNull(longList42);
        org.junit.Assert.assertNotNull(longList43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(searchFilter48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "0" + "'", str54, "0");
        org.junit.Assert.assertNotNull(searchFilter58);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "0" + "'", str64, "0");
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "0:0 " + "'", str70, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "0: 0: " + "'", str72, "0: 0: ");
        org.junit.Assert.assertNotNull(searchFilter76);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "0" + "'", str82, "0");
        org.junit.Assert.assertNotNull(searchFilter85);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "0" + "'", str91, "0");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + ":( OR )" + "'", str93, ":( OR )");
        org.junit.Assert.assertNotNull(searchFilter94);
        org.junit.Assert.assertNotNull(searchFilter96);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + ":(0 OR 0)" + "'", str97, ":(0 OR 0)");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.lang.String str7 = searchFilter1.getValue((java.util.List<java.lang.String>) strList5);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter8 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList5);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter9 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList5);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter11 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.lang.String str17 = searchFilter11.getValue((java.util.List<java.lang.String>) strList15);
        java.lang.String[] strArray20 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.lang.String str23 = searchFilter11.getValue((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter24 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList21);
        java.lang.String str25 = equalitySearchFilter9.getValue((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter26 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter27 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter28 = com.clouway.cuse.gae.filters.SearchFilters.is((java.util.List<java.lang.String>) strList21);
        org.junit.Assert.assertNotNull(searchFilter1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(searchFilter11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0:0 " + "'", str23, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0: 0: " + "'", str25, "0: 0: ");
        org.junit.Assert.assertNotNull(searchFilter28);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter1 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.LongIdConverter longIdConverter4 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter6 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.lang.String str12 = searchFilter6.getValue((java.util.List<java.lang.String>) strList10);
        java.lang.String[] strArray15 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.lang.String str18 = searchFilter6.getValue((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter19 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList16);
        java.util.List<java.lang.Long> longList20 = longIdConverter4.convert((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException22 = new com.clouway.cuse.spi.IndexCreationFailureException(":( OR )");
        java.lang.String str23 = longIdConverter4.convertFrom((java.lang.Object) ":( OR )");
        com.clouway.cuse.spi.LongIdConverter longIdConverter24 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str26 = longIdConverter24.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str28 = longIdConverter24.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter29 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter31 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.lang.String str37 = searchFilter31.getValue((java.util.List<java.lang.String>) strList35);
        java.lang.String[] strArray40 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.lang.String str43 = searchFilter31.getValue((java.util.List<java.lang.String>) strList41);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter44 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList41);
        java.util.List<java.lang.Long> longList45 = longIdConverter29.convert((java.util.List<java.lang.String>) strList41);
        java.util.List<java.lang.Long> longList46 = longIdConverter24.convert((java.util.List<java.lang.String>) strList41);
        java.util.List<java.lang.Long> longList47 = longIdConverter4.convert((java.util.List<java.lang.String>) strList41);
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.delete("", longList47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0:0 " + "'", str18, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter19);
        org.junit.Assert.assertNotNull(longList20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(searchFilter31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0" + "'", str37, "0");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0:0 " + "'", str43, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter44);
        org.junit.Assert.assertNotNull(longList45);
        org.junit.Assert.assertNotNull(longList46);
        org.junit.Assert.assertNotNull(longList47);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.lang.String str7 = searchFilter1.getValue((java.util.List<java.lang.String>) strList5);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter8 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList5);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter10 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.lang.String str16 = searchFilter10.getValue((java.util.List<java.lang.String>) strList14);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter17 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList14);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter18 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList14);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter19 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList14);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter21 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.lang.String str27 = searchFilter21.getValue((java.util.List<java.lang.String>) strList25);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter28 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList25);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter29 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList25);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter30 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList25);
        java.lang.String str31 = orSearchFilter19.getValue((java.util.List<java.lang.String>) strList25);
        java.lang.String str32 = orSearchFilter8.getValue((java.util.List<java.lang.String>) strList25);
        com.clouway.cuse.spi.LongIdConverter longIdConverter33 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str35 = longIdConverter33.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str37 = longIdConverter33.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter38 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter40 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.lang.String str46 = searchFilter40.getValue((java.util.List<java.lang.String>) strList44);
        java.lang.String[] strArray49 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        java.lang.String str52 = searchFilter40.getValue((java.util.List<java.lang.String>) strList50);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter53 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList50);
        java.util.List<java.lang.Long> longList54 = longIdConverter38.convert((java.util.List<java.lang.String>) strList50);
        java.util.List<java.lang.Long> longList55 = longIdConverter33.convert((java.util.List<java.lang.String>) strList50);
        com.clouway.cuse.spi.LongIdConverter longIdConverter56 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str58 = longIdConverter56.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str60 = longIdConverter56.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter61 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter63 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray66 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        java.lang.String str69 = searchFilter63.getValue((java.util.List<java.lang.String>) strList67);
        java.lang.String[] strArray72 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList73 = new java.util.ArrayList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        java.lang.String str75 = searchFilter63.getValue((java.util.List<java.lang.String>) strList73);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter76 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList73);
        java.util.List<java.lang.Long> longList77 = longIdConverter61.convert((java.util.List<java.lang.String>) strList73);
        java.util.List<java.lang.Long> longList78 = longIdConverter56.convert((java.util.List<java.lang.String>) strList73);
        java.lang.String str79 = longIdConverter33.convertFrom((java.lang.Object) strList73);
        java.lang.String str80 = orSearchFilter8.getValue((java.util.List<java.lang.String>) strList73);
        org.junit.Assert.assertNotNull(searchFilter1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(searchFilter10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(searchFilter21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
        org.junit.Assert.assertNotNull(searchFilter30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ":( OR )" + "'", str31, ":( OR )");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + ":( OR )" + "'", str32, ":( OR )");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(searchFilter40);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "0" + "'", str46, "0");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "0:0 " + "'", str52, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter53);
        org.junit.Assert.assertNotNull(longList54);
        org.junit.Assert.assertNotNull(longList55);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(searchFilter63);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "0" + "'", str69, "0");
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "0:0 " + "'", str75, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter76);
        org.junit.Assert.assertNotNull(longList77);
        org.junit.Assert.assertNotNull(longList78);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "0:( OR )" + "'", str80, "0:( OR )");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.anyIs("0\\\\:hi! OR 0\\\\:hi!");
        org.junit.Assert.assertNotNull(searchFilter1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str2 = longIdConverter0.convertFrom((java.lang.Object) 10.0d);
        com.clouway.cuse.spi.LongIdConverter longIdConverter3 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter5 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.lang.String str11 = searchFilter5.getValue((java.util.List<java.lang.String>) strList9);
        java.lang.String[] strArray14 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.lang.String str17 = searchFilter5.getValue((java.util.List<java.lang.String>) strList15);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter18 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.Long> longList19 = longIdConverter3.convert((java.util.List<java.lang.String>) strList15);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter20 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.Long> longList21 = longIdConverter0.convert((java.util.List<java.lang.String>) strList15);
        java.lang.String str23 = longIdConverter0.convertFrom((java.lang.Object) ":(hi! OR  OR )");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(searchFilter5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0:0 " + "'", str17, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter18);
        org.junit.Assert.assertNotNull(longList19);
        org.junit.Assert.assertNotNull(longList21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.EntityLoader entityLoader1 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog2 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException3 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass4 = searchIndexMissmatchException3.getClass();
        com.clouway.cuse.spi.IdConverter idConverter5 = defaultIdConverterCatalog2.getConverter((java.lang.Class) wildcardClass4);
        com.clouway.cuse.spi.SearchEngine searchEngine6 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader1, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog2);
        com.clouway.cuse.spi.SortType sortType7 = com.clouway.cuse.spi.SortType.NUMERIC;
        java.lang.Class<?> wildcardClass8 = sortType7.getClass();
        com.clouway.cuse.spi.IdConverter idConverter9 = defaultIdConverterCatalog2.getConverter((java.lang.Class) wildcardClass8);
        java.lang.Class class10 = null;
        com.clouway.cuse.spi.IdConverter idConverter11 = defaultIdConverterCatalog2.getConverter(class10);
        com.clouway.cuse.spi.EntityLoader entityLoader12 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog13 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException14 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass15 = searchIndexMissmatchException14.getClass();
        com.clouway.cuse.spi.IdConverter idConverter16 = defaultIdConverterCatalog13.getConverter((java.lang.Class) wildcardClass15);
        com.clouway.cuse.spi.SearchEngine searchEngine17 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader12, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog13);
        com.clouway.cuse.spi.SortType sortType18 = com.clouway.cuse.spi.SortType.NUMERIC;
        java.lang.Class<?> wildcardClass19 = sortType18.getClass();
        com.clouway.cuse.spi.IdConverter idConverter20 = defaultIdConverterCatalog13.getConverter((java.lang.Class) wildcardClass19);
        com.clouway.cuse.spi.IdConverter idConverter21 = defaultIdConverterCatalog2.getConverter((java.lang.Class) wildcardClass19);
        com.clouway.cuse.spi.SortType sortType22 = com.clouway.cuse.spi.SortType.NUMERIC;
        java.lang.Class<?> wildcardClass23 = sortType22.getClass();
        com.clouway.cuse.spi.IdConverter idConverter24 = defaultIdConverterCatalog2.getConverter((java.lang.Class) wildcardClass23);
        com.clouway.cuse.spi.EntityLoader entityLoader25 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog26 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException27 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass28 = searchIndexMissmatchException27.getClass();
        com.clouway.cuse.spi.IdConverter idConverter29 = defaultIdConverterCatalog26.getConverter((java.lang.Class) wildcardClass28);
        com.clouway.cuse.spi.SearchEngine searchEngine30 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader25, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog26);
        com.clouway.cuse.spi.SortType sortType31 = com.clouway.cuse.spi.SortType.NUMERIC;
        java.lang.Class<?> wildcardClass32 = sortType31.getClass();
        com.clouway.cuse.spi.IdConverter idConverter33 = defaultIdConverterCatalog26.getConverter((java.lang.Class) wildcardClass32);
        java.lang.Class class34 = null;
        com.clouway.cuse.spi.IdConverter idConverter35 = defaultIdConverterCatalog26.getConverter(class34);
        com.clouway.cuse.spi.EntityLoader entityLoader36 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog37 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException38 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass39 = searchIndexMissmatchException38.getClass();
        com.clouway.cuse.spi.IdConverter idConverter40 = defaultIdConverterCatalog37.getConverter((java.lang.Class) wildcardClass39);
        com.clouway.cuse.spi.SearchEngine searchEngine41 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader36, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog37);
        com.clouway.cuse.spi.SortType sortType42 = com.clouway.cuse.spi.SortType.NUMERIC;
        java.lang.Class<?> wildcardClass43 = sortType42.getClass();
        com.clouway.cuse.spi.IdConverter idConverter44 = defaultIdConverterCatalog37.getConverter((java.lang.Class) wildcardClass43);
        com.clouway.cuse.spi.IdConverter idConverter45 = defaultIdConverterCatalog26.getConverter((java.lang.Class) wildcardClass43);
        com.clouway.cuse.spi.SortType sortType46 = com.clouway.cuse.spi.SortType.NUMERIC;
        java.lang.Class<?> wildcardClass47 = sortType46.getClass();
        com.clouway.cuse.spi.IdConverter idConverter48 = defaultIdConverterCatalog26.getConverter((java.lang.Class) wildcardClass47);
        com.clouway.cuse.spi.IdConverter idConverter49 = defaultIdConverterCatalog2.getConverter((java.lang.Class) wildcardClass47);
        com.clouway.cuse.spi.SearchEngine searchEngine50 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog2);
        // The following exception was thrown during execution in test generation
        try {
            searchEngine50.register((java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.NotConfiguredIndexingStrategyException; message: null");
        } catch (com.clouway.cuse.spi.NotConfiguredIndexingStrategyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(idConverter5);
        org.junit.Assert.assertNotNull(searchEngine6);
        org.junit.Assert.assertTrue("'" + sortType7 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType7.equals(com.clouway.cuse.spi.SortType.NUMERIC));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(idConverter9);
        org.junit.Assert.assertNull(idConverter11);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(idConverter16);
        org.junit.Assert.assertNotNull(searchEngine17);
        org.junit.Assert.assertTrue("'" + sortType18 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType18.equals(com.clouway.cuse.spi.SortType.NUMERIC));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(idConverter20);
        org.junit.Assert.assertNull(idConverter21);
        org.junit.Assert.assertTrue("'" + sortType22 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType22.equals(com.clouway.cuse.spi.SortType.NUMERIC));
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(idConverter24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(idConverter29);
        org.junit.Assert.assertNotNull(searchEngine30);
        org.junit.Assert.assertTrue("'" + sortType31 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType31.equals(com.clouway.cuse.spi.SortType.NUMERIC));
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNull(idConverter33);
        org.junit.Assert.assertNull(idConverter35);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNull(idConverter40);
        org.junit.Assert.assertNotNull(searchEngine41);
        org.junit.Assert.assertTrue("'" + sortType42 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType42.equals(com.clouway.cuse.spi.SortType.NUMERIC));
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNull(idConverter44);
        org.junit.Assert.assertNull(idConverter45);
        org.junit.Assert.assertTrue("'" + sortType46 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType46.equals(com.clouway.cuse.spi.SortType.NUMERIC));
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNull(idConverter48);
        org.junit.Assert.assertNull(idConverter49);
        org.junit.Assert.assertNotNull(searchEngine50);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter2 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.lang.String str8 = searchFilter2.getValue((java.util.List<java.lang.String>) strList6);
        java.lang.String[] strArray11 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.lang.String str14 = searchFilter2.getValue((java.util.List<java.lang.String>) strList12);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter15 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList12);
        java.util.List<java.lang.Long> longList16 = longIdConverter0.convert((java.util.List<java.lang.String>) strList12);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter17 = com.clouway.cuse.gae.filters.SearchFilters.is((java.util.List<java.lang.String>) strList12);
        org.junit.Assert.assertNotNull(searchFilter2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:0 " + "'", str14, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter15);
        org.junit.Assert.assertNotNull(longList16);
        org.junit.Assert.assertNotNull(searchFilter17);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.lang.String str7 = searchFilter1.getValue((java.util.List<java.lang.String>) strList5);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter8 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList5);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter9 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList5);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter11 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.lang.String str17 = searchFilter11.getValue((java.util.List<java.lang.String>) strList15);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter18 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList15);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter20 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.lang.String str26 = searchFilter20.getValue((java.util.List<java.lang.String>) strList24);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter27 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList24);
        java.lang.String str28 = orSearchFilter18.getValue((java.util.List<java.lang.String>) strList24);
        java.lang.String str29 = equalitySearchFilter9.getValue((java.util.List<java.lang.String>) strList24);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter31 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter33 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        java.lang.String str39 = searchFilter33.getValue((java.util.List<java.lang.String>) strList37);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter40 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList37);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter41 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList37);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter42 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList37);
        java.lang.String str43 = multiFieldValueFilter31.getValue((java.util.List<java.lang.String>) strList37);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter44 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList37);
        java.lang.String str45 = equalitySearchFilter9.getValue((java.util.List<java.lang.String>) strList37);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter46 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList37);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "", "" };
        com.clouway.cuse.spi.filters.SearchFilter searchFilter51 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray50);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter52 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray50);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter53 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray50);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter55 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray58 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        java.lang.String str61 = searchFilter55.getValue((java.util.List<java.lang.String>) strList59);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter62 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList59);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter64 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray67 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        java.lang.String str70 = searchFilter64.getValue((java.util.List<java.lang.String>) strList68);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter71 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList68);
        java.lang.String str72 = orSearchFilter62.getValue((java.util.List<java.lang.String>) strList68);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter73 = com.clouway.cuse.gae.filters.SearchFilters.is((java.util.List<java.lang.String>) strList68);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter74 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList68);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter75 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList68);
        java.lang.String str76 = orSearchFilter53.getValue((java.util.List<java.lang.String>) strList68);
        java.lang.String str77 = equalitySearchFilter46.getValue((java.util.List<java.lang.String>) strList68);
        org.junit.Assert.assertNotNull(searchFilter1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(searchFilter11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertNotNull(searchFilter20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ":( OR )" + "'", str28, ":( OR )");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(searchFilter33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "0" + "'", str39, "0");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + ":0 OR :0" + "'", str43, ":0 OR :0");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(searchFilter51);
        org.junit.Assert.assertNotNull(searchFilter52);
        org.junit.Assert.assertNotNull(searchFilter55);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "0" + "'", str61, "0");
        org.junit.Assert.assertNotNull(searchFilter64);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "0" + "'", str70, "0");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + ":( OR )" + "'", str72, ":( OR )");
        org.junit.Assert.assertNotNull(searchFilter73);
        org.junit.Assert.assertNotNull(searchFilter75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + ":(hi! OR  OR )" + "'", str76, ":(hi! OR  OR )");
        org.junit.Assert.assertNull(str77);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.LongIdConverter longIdConverter4 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter6 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.lang.String str12 = searchFilter6.getValue((java.util.List<java.lang.String>) strList10);
        java.lang.String[] strArray15 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.lang.String str18 = searchFilter6.getValue((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter19 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList16);
        java.util.List<java.lang.Long> longList20 = longIdConverter4.convert((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException22 = new com.clouway.cuse.spi.IndexCreationFailureException(":( OR )");
        java.lang.String str23 = longIdConverter4.convertFrom((java.lang.Object) ":( OR )");
        com.clouway.cuse.spi.LongIdConverter longIdConverter24 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str26 = longIdConverter24.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str28 = longIdConverter24.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter29 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter31 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.lang.String str37 = searchFilter31.getValue((java.util.List<java.lang.String>) strList35);
        java.lang.String[] strArray40 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.lang.String str43 = searchFilter31.getValue((java.util.List<java.lang.String>) strList41);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter44 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList41);
        java.util.List<java.lang.Long> longList45 = longIdConverter29.convert((java.util.List<java.lang.String>) strList41);
        java.util.List<java.lang.Long> longList46 = longIdConverter24.convert((java.util.List<java.lang.String>) strList41);
        java.util.List<java.lang.Long> longList47 = longIdConverter4.convert((java.util.List<java.lang.String>) strList41);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter49 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0:0 ");
        java.lang.String str50 = longIdConverter4.convertFrom((java.lang.Object) "0:0 ");
        com.clouway.cuse.spi.LongIdConverter longIdConverter51 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str53 = longIdConverter51.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str55 = longIdConverter51.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter56 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter58 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        java.lang.String str64 = searchFilter58.getValue((java.util.List<java.lang.String>) strList62);
        java.lang.String[] strArray67 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        java.lang.String str70 = searchFilter58.getValue((java.util.List<java.lang.String>) strList68);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter71 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList68);
        java.util.List<java.lang.Long> longList72 = longIdConverter56.convert((java.util.List<java.lang.String>) strList68);
        java.util.List<java.lang.Long> longList73 = longIdConverter51.convert((java.util.List<java.lang.String>) strList68);
        com.clouway.cuse.spi.LongIdConverter longIdConverter74 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str76 = longIdConverter74.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str78 = longIdConverter74.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter79 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter81 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray84 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList85, strArray84);
        java.lang.String str87 = searchFilter81.getValue((java.util.List<java.lang.String>) strList85);
        java.lang.String[] strArray90 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList91 = new java.util.ArrayList<java.lang.String>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList91, strArray90);
        java.lang.String str93 = searchFilter81.getValue((java.util.List<java.lang.String>) strList91);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter94 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList91);
        java.util.List<java.lang.Long> longList95 = longIdConverter79.convert((java.util.List<java.lang.String>) strList91);
        java.util.List<java.lang.Long> longList96 = longIdConverter74.convert((java.util.List<java.lang.String>) strList91);
        java.lang.String str97 = longIdConverter51.convertFrom((java.lang.Object) strList91);
        java.util.List<java.lang.Long> longList98 = longIdConverter4.convert((java.util.List<java.lang.String>) strList91);
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.delete("0:(0:0  OR com.clouway.cuse.spi.IndexCreationFailureException:  OR 0 OR hi! OR com.clouway.cuse.spi.IndexCreationFailureException\\:  OR com.clouway.cuse.spi.IndexCreationFailureException\\: )", longList98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0:0 " + "'", str18, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter19);
        org.junit.Assert.assertNotNull(longList20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(searchFilter31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0" + "'", str37, "0");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0:0 " + "'", str43, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter44);
        org.junit.Assert.assertNotNull(longList45);
        org.junit.Assert.assertNotNull(longList46);
        org.junit.Assert.assertNotNull(longList47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(searchFilter58);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "0" + "'", str64, "0");
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "0:0 " + "'", str70, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter71);
        org.junit.Assert.assertNotNull(longList72);
        org.junit.Assert.assertNotNull(longList73);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNotNull(searchFilter81);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "0" + "'", str87, "0");
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "0:0 " + "'", str93, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter94);
        org.junit.Assert.assertNotNull(longList95);
        org.junit.Assert.assertNotNull(longList96);
        org.junit.Assert.assertNull(str97);
        org.junit.Assert.assertNotNull(longList98);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.SearchEngine searchEngine1 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter3 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.lang.String str9 = searchFilter3.getValue((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter10 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList7);
        java.lang.String[] strArray21 = new java.lang.String[] { "0:( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: ", "com.clouway.cuse.spi.IndexCreationFailureException: ", "0: 0: ", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", ":( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: " };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.lang.String str24 = orSearchFilter10.getValue((java.util.List<java.lang.String>) strList22);
        com.clouway.cuse.spi.LongIdConverter longIdConverter25 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter27 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.lang.String str33 = searchFilter27.getValue((java.util.List<java.lang.String>) strList31);
        java.lang.String[] strArray36 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        java.lang.String str39 = searchFilter27.getValue((java.util.List<java.lang.String>) strList37);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter40 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList37);
        java.util.List<java.lang.Long> longList41 = longIdConverter25.convert((java.util.List<java.lang.String>) strList37);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter42 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList37);
        java.lang.String str43 = orSearchFilter10.getValue((java.util.List<java.lang.String>) strList37);
        // The following exception was thrown during execution in test generation
        try {
            searchEngine1.register((java.lang.Object) str43);
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.NotConfiguredIndexingStrategyException; message: null");
        } catch (com.clouway.cuse.spi.NotConfiguredIndexingStrategyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchEngine1);
        org.junit.Assert.assertNotNull(searchFilter3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0:( OR ):( OR )" + "'", str24, "0:( OR ):( OR )");
        org.junit.Assert.assertNotNull(searchFilter27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0" + "'", str33, "0");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "0:0 " + "'", str39, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter40);
        org.junit.Assert.assertNotNull(longList41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0:( OR )" + "'", str43, "0:( OR )");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder gaeSearchApiMatchedIdObjectFinder0 = new com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter3 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.lang.String str9 = searchFilter3.getValue((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter10 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter12 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.lang.String str18 = searchFilter12.getValue((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter19 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList16);
        java.lang.String str20 = orSearchFilter10.getValue((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter21 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter22 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.spi.SortOrder sortOrder26 = com.clouway.cuse.spi.SortOrder.DESCENDING;
        com.clouway.cuse.spi.SortType sortType27 = com.clouway.cuse.spi.SortType.TEXT;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList28 = gaeSearchApiMatchedIdObjectFinder0.find("com.clouway.cuse.spi.NotConfiguredIdConvertorException", (java.util.List<java.lang.String>) strList16, (int) '#', 0, "0\\\\:(0\\\\:0  OR com.clouway.cuse.spi.IndexCreationFailureException\\\\:  OR 0 OR hi! OR com.clouway.cuse.spi.IndexCreationFailureException\\\\\\:  OR com.clouway.cuse.spi.IndexCreationFailureException\\\\\\: )", sortOrder26, sortType27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse sort expression '0\\\\:(0\\\\:0  OR com.clouway.cuse.spi.IndexCreationFailureException\\\\:  OR 0 OR hi! OR com.clouway.cuse.spi.IndexCreationFailureException\\\\\\:  OR com.clouway.cuse.spi.IndexCreationFailureException\\\\\\: )': parse error at line 1 position 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(searchFilter12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ":( OR )" + "'", str20, ":( OR )");
        org.junit.Assert.assertTrue("'" + sortOrder26 + "' != '" + com.clouway.cuse.spi.SortOrder.DESCENDING + "'", sortOrder26.equals(com.clouway.cuse.spi.SortOrder.DESCENDING));
        org.junit.Assert.assertTrue("'" + sortType27 + "' != '" + com.clouway.cuse.spi.SortType.TEXT + "'", sortType27.equals(com.clouway.cuse.spi.SortType.TEXT));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException1 = new com.clouway.cuse.spi.IndexCreationFailureException("");
        java.lang.String str2 = indexCreationFailureException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.clouway.cuse.spi.IndexCreationFailureException: " + "'", str2, "com.clouway.cuse.spi.IndexCreationFailureException: ");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy4 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.register((java.lang.Object) 10, indexingStrategy4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.lang.String str7 = searchFilter1.getValue((java.util.List<java.lang.String>) strList5);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter8 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList5);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter9 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList5);
        java.lang.String[] strArray16 = new java.lang.String[] { "0:0 ", "com.clouway.cuse.spi.IndexCreationFailureException: ", "0", "hi!", "com.clouway.cuse.spi.IndexCreationFailureException\\: ", "com.clouway.cuse.spi.IndexCreationFailureException\\: " };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter17 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray16);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter19 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.lang.String str25 = searchFilter19.getValue((java.util.List<java.lang.String>) strList23);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter26 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList23);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter27 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList23);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter29 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.lang.String str35 = searchFilter29.getValue((java.util.List<java.lang.String>) strList33);
        java.lang.String[] strArray38 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.lang.String str41 = searchFilter29.getValue((java.util.List<java.lang.String>) strList39);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter42 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList39);
        java.lang.String str43 = equalitySearchFilter27.getValue((java.util.List<java.lang.String>) strList39);
        com.clouway.cuse.spi.LongIdConverter longIdConverter44 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter46 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray49 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        java.lang.String str52 = searchFilter46.getValue((java.util.List<java.lang.String>) strList50);
        java.lang.String[] strArray55 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        java.lang.String str58 = searchFilter46.getValue((java.util.List<java.lang.String>) strList56);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter59 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList56);
        java.util.List<java.lang.Long> longList60 = longIdConverter44.convert((java.util.List<java.lang.String>) strList56);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException62 = new com.clouway.cuse.spi.IndexCreationFailureException(":( OR )");
        java.lang.String str63 = longIdConverter44.convertFrom((java.lang.Object) ":( OR )");
        com.clouway.cuse.spi.LongIdConverter longIdConverter64 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str66 = longIdConverter64.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str68 = longIdConverter64.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter69 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter71 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray74 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        java.lang.String str77 = searchFilter71.getValue((java.util.List<java.lang.String>) strList75);
        java.lang.String[] strArray80 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        java.lang.String str83 = searchFilter71.getValue((java.util.List<java.lang.String>) strList81);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter84 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList81);
        java.util.List<java.lang.Long> longList85 = longIdConverter69.convert((java.util.List<java.lang.String>) strList81);
        java.util.List<java.lang.Long> longList86 = longIdConverter64.convert((java.util.List<java.lang.String>) strList81);
        java.util.List<java.lang.Long> longList87 = longIdConverter44.convert((java.util.List<java.lang.String>) strList81);
        java.lang.String str88 = equalitySearchFilter27.getValue((java.util.List<java.lang.String>) strList81);
        java.lang.String str89 = orSearchFilter17.getValue((java.util.List<java.lang.String>) strList81);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter90 = com.clouway.cuse.gae.filters.SearchFilters.is((java.util.List<java.lang.String>) strList81);
        java.lang.String str91 = orSearchFilter9.getValue((java.util.List<java.lang.String>) strList81);
        org.junit.Assert.assertNotNull(searchFilter1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(searchFilter19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0" + "'", str25, "0");
        org.junit.Assert.assertNotNull(searchFilter29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0" + "'", str35, "0");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0:0 " + "'", str41, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0: 0: " + "'", str43, "0: 0: ");
        org.junit.Assert.assertNotNull(searchFilter46);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "0" + "'", str52, "0");
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "0:0 " + "'", str58, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter59);
        org.junit.Assert.assertNotNull(longList60);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(searchFilter71);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "0" + "'", str77, "0");
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "0:0 " + "'", str83, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter84);
        org.junit.Assert.assertNotNull(longList85);
        org.junit.Assert.assertNotNull(longList86);
        org.junit.Assert.assertNotNull(longList87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "0: 0: " + "'", str88, "0: 0: ");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "0:(0:0  OR com.clouway.cuse.spi.IndexCreationFailureException:  OR 0 OR hi! OR com.clouway.cuse.spi.IndexCreationFailureException\\:  OR com.clouway.cuse.spi.IndexCreationFailureException\\: )" + "'", str89, "0:(0:0  OR com.clouway.cuse.spi.IndexCreationFailureException:  OR 0 OR hi! OR com.clouway.cuse.spi.IndexCreationFailureException\\:  OR com.clouway.cuse.spi.IndexCreationFailureException\\: )");
        org.junit.Assert.assertNotNull(searchFilter90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "0:( OR )" + "'", str91, "0:( OR )");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog1 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException2 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass3 = searchIndexMissmatchException2.getClass();
        com.clouway.cuse.spi.IdConverter idConverter4 = defaultIdConverterCatalog1.getConverter((java.lang.Class) wildcardClass3);
        com.clouway.cuse.spi.SearchEngine searchEngine5 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog1);
        com.clouway.cuse.spi.EntityLoader entityLoader6 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog7 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException8 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass9 = searchIndexMissmatchException8.getClass();
        com.clouway.cuse.spi.IdConverter idConverter10 = defaultIdConverterCatalog7.getConverter((java.lang.Class) wildcardClass9);
        com.clouway.cuse.spi.SearchEngine searchEngine11 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader6, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog7);
        com.clouway.cuse.spi.SortType sortType12 = com.clouway.cuse.spi.SortType.NUMERIC;
        java.lang.Class<?> wildcardClass13 = sortType12.getClass();
        com.clouway.cuse.spi.IdConverter idConverter14 = defaultIdConverterCatalog7.getConverter((java.lang.Class) wildcardClass13);
        java.lang.Class class15 = null;
        com.clouway.cuse.spi.IdConverter idConverter16 = defaultIdConverterCatalog7.getConverter(class15);
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException17 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass18 = searchIndexMissmatchException17.getClass();
        com.clouway.cuse.spi.StringIdConverter stringIdConverter19 = new com.clouway.cuse.spi.StringIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter21 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 100);
        java.lang.String str22 = stringIdConverter19.convertFrom((java.lang.Object) 100);
        defaultIdConverterCatalog7.addIdConverter((java.lang.Class) wildcardClass18, (com.clouway.cuse.spi.IdConverter) stringIdConverter19);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter25 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.lang.String str31 = searchFilter25.getValue((java.util.List<java.lang.String>) strList29);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter32 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList29);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter34 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.lang.String str40 = searchFilter34.getValue((java.util.List<java.lang.String>) strList38);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter41 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList38);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter42 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList38);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter43 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList38);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter45 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray48 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        java.lang.String str51 = searchFilter45.getValue((java.util.List<java.lang.String>) strList49);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter52 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList49);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter53 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList49);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter54 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList49);
        java.lang.String str55 = orSearchFilter43.getValue((java.util.List<java.lang.String>) strList49);
        java.lang.String str56 = orSearchFilter32.getValue((java.util.List<java.lang.String>) strList49);
        java.lang.Class<?> wildcardClass57 = orSearchFilter32.getClass();
        com.clouway.cuse.spi.IdConverter idConverter58 = defaultIdConverterCatalog7.getConverter((java.lang.Class) wildcardClass57);
        com.clouway.cuse.spi.IdConverter idConverter59 = defaultIdConverterCatalog1.getConverter((java.lang.Class) wildcardClass57);
        com.clouway.cuse.spi.EntityLoader entityLoader60 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog61 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException62 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass63 = searchIndexMissmatchException62.getClass();
        com.clouway.cuse.spi.IdConverter idConverter64 = defaultIdConverterCatalog61.getConverter((java.lang.Class) wildcardClass63);
        com.clouway.cuse.spi.SearchEngine searchEngine65 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader60, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog61);
        com.clouway.cuse.spi.SortType sortType66 = com.clouway.cuse.spi.SortType.NUMERIC;
        java.lang.Class<?> wildcardClass67 = sortType66.getClass();
        com.clouway.cuse.spi.IdConverter idConverter68 = defaultIdConverterCatalog61.getConverter((java.lang.Class) wildcardClass67);
        java.lang.Class class69 = null;
        com.clouway.cuse.spi.IdConverter idConverter70 = defaultIdConverterCatalog61.getConverter(class69);
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException71 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass72 = searchIndexMissmatchException71.getClass();
        com.clouway.cuse.spi.StringIdConverter stringIdConverter73 = new com.clouway.cuse.spi.StringIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter75 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 100);
        java.lang.String str76 = stringIdConverter73.convertFrom((java.lang.Object) 100);
        defaultIdConverterCatalog61.addIdConverter((java.lang.Class) wildcardClass72, (com.clouway.cuse.spi.IdConverter) stringIdConverter73);
        com.clouway.cuse.spi.IdConverter idConverter78 = defaultIdConverterCatalog1.getConverter((java.lang.Class) wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(idConverter4);
        org.junit.Assert.assertNotNull(searchEngine5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(idConverter10);
        org.junit.Assert.assertNotNull(searchEngine11);
        org.junit.Assert.assertTrue("'" + sortType12 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType12.equals(com.clouway.cuse.spi.SortType.NUMERIC));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(idConverter14);
        org.junit.Assert.assertNull(idConverter16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(searchFilter21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(searchFilter25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0" + "'", str31, "0");
        org.junit.Assert.assertNotNull(searchFilter34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0" + "'", str40, "0");
        org.junit.Assert.assertNotNull(searchFilter45);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "0" + "'", str51, "0");
        org.junit.Assert.assertNotNull(searchFilter54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + ":( OR )" + "'", str55, ":( OR )");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + ":( OR )" + "'", str56, ":( OR )");
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNull(idConverter58);
        org.junit.Assert.assertNull(idConverter59);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNull(idConverter64);
        org.junit.Assert.assertNotNull(searchEngine65);
        org.junit.Assert.assertTrue("'" + sortType66 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType66.equals(com.clouway.cuse.spi.SortType.NUMERIC));
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNull(idConverter68);
        org.junit.Assert.assertNull(idConverter70);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(searchFilter75);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNull(idConverter78);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.lang.String str7 = searchFilter1.getValue((java.util.List<java.lang.String>) strList5);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter8 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList5);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter9 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList5);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter11 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.lang.String str17 = searchFilter11.getValue((java.util.List<java.lang.String>) strList15);
        java.lang.String[] strArray20 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.lang.String str23 = searchFilter11.getValue((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter24 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList21);
        java.lang.String str25 = equalitySearchFilter9.getValue((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter26 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter27 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter29 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.lang.String str35 = searchFilter29.getValue((java.util.List<java.lang.String>) strList33);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter36 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList33);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter38 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.lang.String str44 = searchFilter38.getValue((java.util.List<java.lang.String>) strList42);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter45 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList42);
        java.lang.String str46 = orSearchFilter36.getValue((java.util.List<java.lang.String>) strList42);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter47 = com.clouway.cuse.gae.filters.SearchFilters.is((java.util.List<java.lang.String>) strList42);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter48 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList42);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter49 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList42);
        java.lang.String str50 = orSearchFilter27.getValue((java.util.List<java.lang.String>) strList42);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter51 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList42);
        org.junit.Assert.assertNotNull(searchFilter1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(searchFilter11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0:0 " + "'", str23, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0: 0: " + "'", str25, "0: 0: ");
        org.junit.Assert.assertNotNull(searchFilter29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0" + "'", str35, "0");
        org.junit.Assert.assertNotNull(searchFilter38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "0" + "'", str44, "0");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + ":( OR )" + "'", str46, ":( OR )");
        org.junit.Assert.assertNotNull(searchFilter47);
        org.junit.Assert.assertNotNull(searchFilter49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + ":(0 OR 0)" + "'", str50, ":(0 OR 0)");
        org.junit.Assert.assertNotNull(searchFilter51);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter13 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.lang.String str19 = searchFilter13.getValue((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter20 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList17);
        java.lang.String str21 = orSearchFilter11.getValue((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.spi.LongIdConverter longIdConverter22 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str24 = longIdConverter22.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str26 = longIdConverter22.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter27 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter29 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.lang.String str35 = searchFilter29.getValue((java.util.List<java.lang.String>) strList33);
        java.lang.String[] strArray38 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.lang.String str41 = searchFilter29.getValue((java.util.List<java.lang.String>) strList39);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter42 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList39);
        java.util.List<java.lang.Long> longList43 = longIdConverter27.convert((java.util.List<java.lang.String>) strList39);
        java.util.List<java.lang.Long> longList44 = longIdConverter22.convert((java.util.List<java.lang.String>) strList39);
        java.lang.String str45 = orSearchFilter11.getValue((java.util.List<java.lang.String>) strList39);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy46 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.registerAll((java.util.List<java.lang.String>) strList39, indexingStrategy46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(searchFilter13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":( OR )" + "'", str21, ":( OR )");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(searchFilter29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0" + "'", str35, "0");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0:0 " + "'", str41, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter42);
        org.junit.Assert.assertNotNull(longList43);
        org.junit.Assert.assertNotNull(longList44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "0:( OR )" + "'", str45, "0:( OR )");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter2 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.lang.String str8 = searchFilter2.getValue((java.util.List<java.lang.String>) strList6);
        java.lang.String[] strArray11 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.lang.String str14 = searchFilter2.getValue((java.util.List<java.lang.String>) strList12);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter15 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList12);
        java.util.List<java.lang.Long> longList16 = longIdConverter0.convert((java.util.List<java.lang.String>) strList12);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException18 = new com.clouway.cuse.spi.IndexCreationFailureException(":( OR )");
        java.lang.String str19 = longIdConverter0.convertFrom((java.lang.Object) ":( OR )");
        com.clouway.cuse.spi.LongIdConverter longIdConverter20 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str22 = longIdConverter20.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str24 = longIdConverter20.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter25 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter27 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.lang.String str33 = searchFilter27.getValue((java.util.List<java.lang.String>) strList31);
        java.lang.String[] strArray36 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        java.lang.String str39 = searchFilter27.getValue((java.util.List<java.lang.String>) strList37);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter40 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList37);
        java.util.List<java.lang.Long> longList41 = longIdConverter25.convert((java.util.List<java.lang.String>) strList37);
        java.util.List<java.lang.Long> longList42 = longIdConverter20.convert((java.util.List<java.lang.String>) strList37);
        java.util.List<java.lang.Long> longList43 = longIdConverter0.convert((java.util.List<java.lang.String>) strList37);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter45 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0:0 ");
        java.lang.String str46 = longIdConverter0.convertFrom((java.lang.Object) "0:0 ");
        java.lang.String[] strArray53 = new java.lang.String[] { "0:0 ", "com.clouway.cuse.spi.IndexCreationFailureException: ", "0", "hi!", "com.clouway.cuse.spi.IndexCreationFailureException\\: ", "com.clouway.cuse.spi.IndexCreationFailureException\\: " };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter54 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray53);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter56 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("com.clouway.cuse.spi.IndexCreationFailureException: ");
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter58 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter60 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray63 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        java.lang.String str66 = searchFilter60.getValue((java.util.List<java.lang.String>) strList64);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter67 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList64);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter68 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList64);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter70 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray73 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        java.lang.String str76 = searchFilter70.getValue((java.util.List<java.lang.String>) strList74);
        java.lang.String[] strArray79 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList80 = new java.util.ArrayList<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList80, strArray79);
        java.lang.String str82 = searchFilter70.getValue((java.util.List<java.lang.String>) strList80);
        java.lang.String str83 = orSearchFilter68.getValue((java.util.List<java.lang.String>) strList80);
        java.lang.String str84 = multiFieldValueFilter58.getValue((java.util.List<java.lang.String>) strList80);
        java.lang.String str85 = multiFieldValueFilter56.getValue((java.util.List<java.lang.String>) strList80);
        java.lang.String str86 = orSearchFilter54.getValue((java.util.List<java.lang.String>) strList80);
        java.util.List<java.lang.Long> longList87 = longIdConverter0.convert((java.util.List<java.lang.String>) strList80);
        org.junit.Assert.assertNotNull(searchFilter2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:0 " + "'", str14, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter15);
        org.junit.Assert.assertNotNull(longList16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(searchFilter27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0" + "'", str33, "0");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "0:0 " + "'", str39, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter40);
        org.junit.Assert.assertNotNull(longList41);
        org.junit.Assert.assertNotNull(longList42);
        org.junit.Assert.assertNotNull(longList43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(searchFilter60);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "0" + "'", str66, "0");
        org.junit.Assert.assertNotNull(searchFilter70);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "0" + "'", str76, "0");
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "0:0 " + "'", str82, "0:0 ");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "0:( OR )" + "'", str83, "0:( OR )");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "0:0 OR 0:0" + "'", str84, "0:0 OR 0:0");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "0:com.clouway.cuse.spi.IndexCreationFailureException:  OR 0:com.clouway.cuse.spi.IndexCreationFailureException: " + "'", str85, "0:com.clouway.cuse.spi.IndexCreationFailureException:  OR 0:com.clouway.cuse.spi.IndexCreationFailureException: ");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "0:(0:0  OR com.clouway.cuse.spi.IndexCreationFailureException:  OR 0 OR hi! OR com.clouway.cuse.spi.IndexCreationFailureException\\:  OR com.clouway.cuse.spi.IndexCreationFailureException\\: )" + "'", str86, "0:(0:0  OR com.clouway.cuse.spi.IndexCreationFailureException:  OR 0 OR hi! OR com.clouway.cuse.spi.IndexCreationFailureException\\:  OR com.clouway.cuse.spi.IndexCreationFailureException\\: )");
        org.junit.Assert.assertNotNull(longList87);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder gaeSearchApiMatchedIdObjectFinder0 = new com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder();
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter3 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter5 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.lang.String str11 = searchFilter5.getValue((java.util.List<java.lang.String>) strList9);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter12 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList9);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter13 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList9);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter14 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList9);
        java.lang.String str15 = multiFieldValueFilter3.getValue((java.util.List<java.lang.String>) strList9);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter17 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.lang.String str23 = searchFilter17.getValue((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter24 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter25 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter26 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter28 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.lang.String str34 = searchFilter28.getValue((java.util.List<java.lang.String>) strList32);
        java.lang.String[] strArray37 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.lang.String str40 = searchFilter28.getValue((java.util.List<java.lang.String>) strList38);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter41 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList38);
        java.lang.String str42 = orSearchFilter26.getValue((java.util.List<java.lang.String>) strList38);
        java.lang.String str43 = multiFieldValueFilter3.getValue((java.util.List<java.lang.String>) strList38);
        com.clouway.cuse.spi.SortOrder sortOrder47 = null;
        com.clouway.cuse.spi.SortType sortType48 = com.clouway.cuse.spi.SortType.NUMERIC;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList49 = gaeSearchApiMatchedIdObjectFinder0.find(":(hi! OR  OR )", (java.util.List<java.lang.String>) strList38, (int) (byte) 1, (-1), "0:0 OR 0:0", sortOrder47, sortType48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The offset -1 must be between 0 and 1000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":0 OR :0" + "'", str15, ":0 OR :0");
        org.junit.Assert.assertNotNull(searchFilter17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(searchFilter28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0" + "'", str34, "0");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0:0 " + "'", str40, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0:( OR )" + "'", str42, "0:( OR )");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0:0 OR 0:0" + "'", str43, "0:0 OR 0:0");
        org.junit.Assert.assertTrue("'" + sortType48 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType48.equals(com.clouway.cuse.spi.SortType.NUMERIC));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        java.lang.String[] strArray4 = new java.lang.String[] { "com.clouway.cuse.spi.IndexCreationFailureException\\: " };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter5 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray4);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter7 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.lang.String str13 = searchFilter7.getValue((java.util.List<java.lang.String>) strList11);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter14 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList11);
        java.lang.String[] strArray25 = new java.lang.String[] { "0:( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: ", "com.clouway.cuse.spi.IndexCreationFailureException: ", "0: 0: ", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", ":( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: " };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.lang.String str28 = orSearchFilter14.getValue((java.util.List<java.lang.String>) strList26);
        java.lang.String str29 = orSearchFilter5.getValue((java.util.List<java.lang.String>) strList26);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy30 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.registerAll((java.util.List<java.lang.String>) strList26, indexingStrategy30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(searchFilter7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0:( OR ):( OR )" + "'", str28, "0:( OR ):( OR )");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0:( OR ):(com.clouway.cuse.spi.IndexCreationFailureException\\: )" + "'", str29, "0:( OR ):(com.clouway.cuse.spi.IndexCreationFailureException\\: )");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.is("com.clouway.cuse.spi.IndexCreationFailureException\\: ");
        org.junit.Assert.assertNotNull(searchFilter1);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter1 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter3 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.lang.String str9 = searchFilter3.getValue((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter10 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter11 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter12 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList7);
        java.lang.String str13 = multiFieldValueFilter1.getValue((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter15 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.lang.String str21 = searchFilter15.getValue((java.util.List<java.lang.String>) strList19);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter22 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList19);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter23 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList19);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter25 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.lang.String str31 = searchFilter25.getValue((java.util.List<java.lang.String>) strList29);
        java.lang.String[] strArray34 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.lang.String str37 = searchFilter25.getValue((java.util.List<java.lang.String>) strList35);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter38 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList35);
        java.lang.String str39 = equalitySearchFilter23.getValue((java.util.List<java.lang.String>) strList35);
        java.lang.String str40 = multiFieldValueFilter1.getValue((java.util.List<java.lang.String>) strList35);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter42 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter44 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        java.lang.String str50 = searchFilter44.getValue((java.util.List<java.lang.String>) strList48);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter51 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList48);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter52 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList48);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter54 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray57 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        java.lang.String str60 = searchFilter54.getValue((java.util.List<java.lang.String>) strList58);
        java.lang.String[] strArray63 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        java.lang.String str66 = searchFilter54.getValue((java.util.List<java.lang.String>) strList64);
        java.lang.String str67 = orSearchFilter52.getValue((java.util.List<java.lang.String>) strList64);
        java.lang.String str68 = multiFieldValueFilter42.getValue((java.util.List<java.lang.String>) strList64);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter70 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray73 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        java.lang.String str76 = searchFilter70.getValue((java.util.List<java.lang.String>) strList74);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter77 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList74);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter78 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList74);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter79 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList74);
        java.lang.String str80 = multiFieldValueFilter42.getValue((java.util.List<java.lang.String>) strList74);
        java.lang.String str81 = multiFieldValueFilter1.getValue((java.util.List<java.lang.String>) strList74);
        org.junit.Assert.assertNotNull(searchFilter3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":0 OR :0" + "'", str13, ":0 OR :0");
        org.junit.Assert.assertNotNull(searchFilter15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNotNull(searchFilter25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0" + "'", str31, "0");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0:0 " + "'", str37, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "0: 0: " + "'", str39, "0: 0: ");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0:0 OR 0:0" + "'", str40, "0:0 OR 0:0");
        org.junit.Assert.assertNotNull(searchFilter44);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "0" + "'", str50, "0");
        org.junit.Assert.assertNotNull(searchFilter54);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "0" + "'", str60, "0");
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "0:0 " + "'", str66, "0:0 ");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "0:( OR )" + "'", str67, "0:( OR )");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "0:0 OR 0:0" + "'", str68, "0:0 OR 0:0");
        org.junit.Assert.assertNotNull(searchFilter70);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "0" + "'", str76, "0");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + ":0 OR :0" + "'", str80, ":0 OR :0");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + ":0 OR :0" + "'", str81, ":0 OR :0");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.clouway.cuse.spi.IndexWriter indexWriter0 = new com.clouway.cuse.spi.IndexWriter();
        java.lang.String[] strArray7 = new java.lang.String[] { "com.clouway.cuse.spi.IndexCreationFailureException: ", "com.clouway.cuse.spi.IndexCreationFailureException\\: ", "0", "0: 0: ", "", ":0 OR :0" };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter8 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray7);
        java.util.Set<java.lang.String> strSet9 = indexWriter0.createIndex(strArray7);
        com.clouway.cuse.spi.IndexWriter indexWriter10 = new com.clouway.cuse.spi.IndexWriter();
        java.lang.String[] strArray17 = new java.lang.String[] { "com.clouway.cuse.spi.IndexCreationFailureException: ", "com.clouway.cuse.spi.IndexCreationFailureException\\: ", "0", "0: 0: ", "", ":0 OR :0" };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter18 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray17);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter19 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray17);
        java.util.Set<java.lang.String> strSet20 = indexWriter10.createIndex(strArray17);
        java.util.Set<java.lang.String> strSet21 = indexWriter0.createIndex(strArray17);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(searchFilter19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter1 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter3 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.lang.String str9 = searchFilter3.getValue((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter10 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter11 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter12 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList7);
        java.lang.String str13 = multiFieldValueFilter1.getValue((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter15 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.lang.String str21 = searchFilter15.getValue((java.util.List<java.lang.String>) strList19);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter22 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList19);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter23 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList19);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter24 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList19);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter26 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.lang.String str32 = searchFilter26.getValue((java.util.List<java.lang.String>) strList30);
        java.lang.String[] strArray35 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String str38 = searchFilter26.getValue((java.util.List<java.lang.String>) strList36);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter39 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList36);
        java.lang.String str40 = orSearchFilter24.getValue((java.util.List<java.lang.String>) strList36);
        java.lang.String str41 = multiFieldValueFilter1.getValue((java.util.List<java.lang.String>) strList36);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter43 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        java.lang.String str49 = searchFilter43.getValue((java.util.List<java.lang.String>) strList47);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter50 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList47);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter52 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray55 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        java.lang.String str58 = searchFilter52.getValue((java.util.List<java.lang.String>) strList56);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter59 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList56);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter60 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList56);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter61 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList56);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter63 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray66 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        java.lang.String str69 = searchFilter63.getValue((java.util.List<java.lang.String>) strList67);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter70 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList67);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter71 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList67);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter72 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList67);
        java.lang.String str73 = orSearchFilter61.getValue((java.util.List<java.lang.String>) strList67);
        java.lang.String str74 = orSearchFilter50.getValue((java.util.List<java.lang.String>) strList67);
        java.lang.String str75 = multiFieldValueFilter1.getValue((java.util.List<java.lang.String>) strList67);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter76 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList67);
        org.junit.Assert.assertNotNull(searchFilter3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":0 OR :0" + "'", str13, ":0 OR :0");
        org.junit.Assert.assertNotNull(searchFilter15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNotNull(searchFilter26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0" + "'", str32, "0");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0:0 " + "'", str38, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0:( OR )" + "'", str40, "0:( OR )");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0:0 OR 0:0" + "'", str41, "0:0 OR 0:0");
        org.junit.Assert.assertNotNull(searchFilter43);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "0" + "'", str49, "0");
        org.junit.Assert.assertNotNull(searchFilter52);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "0" + "'", str58, "0");
        org.junit.Assert.assertNotNull(searchFilter63);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "0" + "'", str69, "0");
        org.junit.Assert.assertNotNull(searchFilter72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + ":( OR )" + "'", str73, ":( OR )");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + ":( OR )" + "'", str74, ":( OR )");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + ":0 OR :0" + "'", str75, ":0 OR :0");
        org.junit.Assert.assertNotNull(searchFilter76);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.EntityLoader entityLoader1 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog2 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException3 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass4 = searchIndexMissmatchException3.getClass();
        com.clouway.cuse.spi.IdConverter idConverter5 = defaultIdConverterCatalog2.getConverter((java.lang.Class) wildcardClass4);
        com.clouway.cuse.spi.SearchEngine searchEngine6 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader1, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog2);
        com.clouway.cuse.spi.SortType sortType7 = com.clouway.cuse.spi.SortType.NUMERIC;
        java.lang.Class<?> wildcardClass8 = sortType7.getClass();
        com.clouway.cuse.spi.IdConverter idConverter9 = defaultIdConverterCatalog2.getConverter((java.lang.Class) wildcardClass8);
        java.lang.Class class10 = null;
        com.clouway.cuse.spi.IdConverter idConverter11 = defaultIdConverterCatalog2.getConverter(class10);
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException12 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass13 = searchIndexMissmatchException12.getClass();
        com.clouway.cuse.spi.StringIdConverter stringIdConverter14 = new com.clouway.cuse.spi.StringIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter16 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 100);
        java.lang.String str17 = stringIdConverter14.convertFrom((java.lang.Object) 100);
        defaultIdConverterCatalog2.addIdConverter((java.lang.Class) wildcardClass13, (com.clouway.cuse.spi.IdConverter) stringIdConverter14);
        com.clouway.cuse.spi.SearchEngine searchEngine19 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog2);
        java.lang.String[] strArray21 = new java.lang.String[] { "com.clouway.cuse.spi.IndexCreationFailureException\\: " };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter22 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray21);
        // The following exception was thrown during execution in test generation
        try {
            searchEngine19.register((java.lang.Object) strArray21);
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.NotConfiguredIndexingStrategyException; message: null");
        } catch (com.clouway.cuse.spi.NotConfiguredIndexingStrategyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(idConverter5);
        org.junit.Assert.assertNotNull(searchEngine6);
        org.junit.Assert.assertTrue("'" + sortType7 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType7.equals(com.clouway.cuse.spi.SortType.NUMERIC));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(idConverter9);
        org.junit.Assert.assertNull(idConverter11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(searchFilter16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(searchEngine19);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter1 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter3 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.lang.String str9 = searchFilter3.getValue((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter10 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter11 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter12 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList7);
        java.lang.String str13 = multiFieldValueFilter1.getValue((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter14 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter15 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.spi.LongIdConverter longIdConverter16 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str18 = longIdConverter16.convertFrom((java.lang.Object) 10.0d);
        com.clouway.cuse.spi.LongIdConverter longIdConverter19 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter21 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.lang.String str27 = searchFilter21.getValue((java.util.List<java.lang.String>) strList25);
        java.lang.String[] strArray30 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.lang.String str33 = searchFilter21.getValue((java.util.List<java.lang.String>) strList31);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter34 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList31);
        java.util.List<java.lang.Long> longList35 = longIdConverter19.convert((java.util.List<java.lang.String>) strList31);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter36 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList31);
        java.util.List<java.lang.Long> longList37 = longIdConverter16.convert((java.util.List<java.lang.String>) strList31);
        java.lang.String str38 = equalitySearchFilter15.getValue((java.util.List<java.lang.String>) strList31);
        com.clouway.cuse.spi.LongIdConverter longIdConverter39 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter41 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.lang.String str47 = searchFilter41.getValue((java.util.List<java.lang.String>) strList45);
        java.lang.String[] strArray50 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        java.lang.String str53 = searchFilter41.getValue((java.util.List<java.lang.String>) strList51);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter54 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList51);
        java.util.List<java.lang.Long> longList55 = longIdConverter39.convert((java.util.List<java.lang.String>) strList51);
        java.lang.String str56 = equalitySearchFilter15.getValue((java.util.List<java.lang.String>) strList51);
        org.junit.Assert.assertNotNull(searchFilter3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":0 OR :0" + "'", str13, ":0 OR :0");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(searchFilter21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0:0 " + "'", str33, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter34);
        org.junit.Assert.assertNotNull(longList35);
        org.junit.Assert.assertNotNull(longList37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0: 0: " + "'", str38, "0: 0: ");
        org.junit.Assert.assertNotNull(searchFilter41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "0" + "'", str47, "0");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "0:0 " + "'", str53, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter54);
        org.junit.Assert.assertNotNull(longList55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "0: 0: " + "'", str56, "0: 0: ");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException4 = new com.clouway.cuse.spi.IndexCreationFailureException("0:0 ");
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException6 = new com.clouway.cuse.spi.IndexCreationFailureException("");
        com.clouway.cuse.spi.NotConfiguredIndexingStrategyException notConfiguredIndexingStrategyException7 = new com.clouway.cuse.spi.NotConfiguredIndexingStrategyException();
        indexCreationFailureException6.addSuppressed((java.lang.Throwable) notConfiguredIndexingStrategyException7);
        com.clouway.cuse.spi.NotConfiguredIdConvertorException notConfiguredIdConvertorException9 = new com.clouway.cuse.spi.NotConfiguredIdConvertorException();
        notConfiguredIndexingStrategyException7.addSuppressed((java.lang.Throwable) notConfiguredIdConvertorException9);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException12 = new com.clouway.cuse.spi.IndexCreationFailureException("");
        notConfiguredIdConvertorException9.addSuppressed((java.lang.Throwable) indexCreationFailureException12);
        indexCreationFailureException4.addSuppressed((java.lang.Throwable) notConfiguredIdConvertorException9);
        java.lang.Throwable[] throwableArray15 = notConfiguredIdConvertorException9.getSuppressed();
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy16 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.register((java.lang.Object) throwableArray15, indexingStrategy16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog1 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException2 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass3 = searchIndexMissmatchException2.getClass();
        com.clouway.cuse.spi.IdConverter idConverter4 = defaultIdConverterCatalog1.getConverter((java.lang.Class) wildcardClass3);
        com.clouway.cuse.spi.SearchEngine searchEngine5 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog1);
        com.clouway.cuse.spi.EntityLoader entityLoader6 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog7 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException8 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass9 = searchIndexMissmatchException8.getClass();
        com.clouway.cuse.spi.IdConverter idConverter10 = defaultIdConverterCatalog7.getConverter((java.lang.Class) wildcardClass9);
        com.clouway.cuse.spi.SearchEngine searchEngine11 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader6, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog7);
        com.clouway.cuse.spi.SortType sortType12 = com.clouway.cuse.spi.SortType.NUMERIC;
        java.lang.Class<?> wildcardClass13 = sortType12.getClass();
        com.clouway.cuse.spi.IdConverter idConverter14 = defaultIdConverterCatalog7.getConverter((java.lang.Class) wildcardClass13);
        java.lang.Class class15 = null;
        com.clouway.cuse.spi.IdConverter idConverter16 = defaultIdConverterCatalog7.getConverter(class15);
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException17 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass18 = searchIndexMissmatchException17.getClass();
        com.clouway.cuse.spi.StringIdConverter stringIdConverter19 = new com.clouway.cuse.spi.StringIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter21 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 100);
        java.lang.String str22 = stringIdConverter19.convertFrom((java.lang.Object) 100);
        defaultIdConverterCatalog7.addIdConverter((java.lang.Class) wildcardClass18, (com.clouway.cuse.spi.IdConverter) stringIdConverter19);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter25 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.lang.String str31 = searchFilter25.getValue((java.util.List<java.lang.String>) strList29);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter32 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList29);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter34 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.lang.String str40 = searchFilter34.getValue((java.util.List<java.lang.String>) strList38);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter41 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList38);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter42 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList38);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter43 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList38);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter45 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray48 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        java.lang.String str51 = searchFilter45.getValue((java.util.List<java.lang.String>) strList49);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter52 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList49);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter53 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList49);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter54 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList49);
        java.lang.String str55 = orSearchFilter43.getValue((java.util.List<java.lang.String>) strList49);
        java.lang.String str56 = orSearchFilter32.getValue((java.util.List<java.lang.String>) strList49);
        java.lang.Class<?> wildcardClass57 = orSearchFilter32.getClass();
        com.clouway.cuse.spi.IdConverter idConverter58 = defaultIdConverterCatalog7.getConverter((java.lang.Class) wildcardClass57);
        com.clouway.cuse.spi.IdConverter idConverter59 = defaultIdConverterCatalog1.getConverter((java.lang.Class) wildcardClass57);
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog60 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException61 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass62 = searchIndexMissmatchException61.getClass();
        com.clouway.cuse.spi.LongIdConverter longIdConverter63 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str65 = longIdConverter63.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str67 = longIdConverter63.convertFrom((java.lang.Object) 100.0f);
        defaultIdConverterCatalog60.addIdConverter((java.lang.Class) wildcardClass62, (com.clouway.cuse.spi.IdConverter) longIdConverter63);
        com.clouway.cuse.spi.IdConverter idConverter69 = defaultIdConverterCatalog1.getConverter((java.lang.Class) wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(idConverter4);
        org.junit.Assert.assertNotNull(searchEngine5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(idConverter10);
        org.junit.Assert.assertNotNull(searchEngine11);
        org.junit.Assert.assertTrue("'" + sortType12 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType12.equals(com.clouway.cuse.spi.SortType.NUMERIC));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(idConverter14);
        org.junit.Assert.assertNull(idConverter16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(searchFilter21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(searchFilter25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0" + "'", str31, "0");
        org.junit.Assert.assertNotNull(searchFilter34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0" + "'", str40, "0");
        org.junit.Assert.assertNotNull(searchFilter45);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "0" + "'", str51, "0");
        org.junit.Assert.assertNotNull(searchFilter54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + ":( OR )" + "'", str55, ":( OR )");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + ":( OR )" + "'", str56, ":( OR )");
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNull(idConverter58);
        org.junit.Assert.assertNull(idConverter59);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(idConverter69);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.anyIs("0:( OR )");
        org.junit.Assert.assertNotNull(searchFilter1);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.EntityLoader entityLoader1 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog2 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException3 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass4 = searchIndexMissmatchException3.getClass();
        com.clouway.cuse.spi.IdConverter idConverter5 = defaultIdConverterCatalog2.getConverter((java.lang.Class) wildcardClass4);
        com.clouway.cuse.spi.SearchEngine searchEngine6 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader1, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog2);
        com.clouway.cuse.spi.SortType sortType7 = com.clouway.cuse.spi.SortType.NUMERIC;
        java.lang.Class<?> wildcardClass8 = sortType7.getClass();
        com.clouway.cuse.spi.IdConverter idConverter9 = defaultIdConverterCatalog2.getConverter((java.lang.Class) wildcardClass8);
        com.clouway.cuse.spi.SearchEngine searchEngine10 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog2);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter12 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.lang.String str18 = searchFilter12.getValue((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter19 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList16);
        java.lang.String[] strArray30 = new java.lang.String[] { "0:( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: ", "com.clouway.cuse.spi.IndexCreationFailureException: ", "0: 0: ", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", ":( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: " };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.lang.String str33 = orSearchFilter19.getValue((java.util.List<java.lang.String>) strList31);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter35 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.lang.String str41 = searchFilter35.getValue((java.util.List<java.lang.String>) strList39);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter42 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList39);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter43 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList39);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter44 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList39);
        java.lang.String str45 = orSearchFilter19.getValue((java.util.List<java.lang.String>) strList39);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter46 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList39);
        // The following exception was thrown during execution in test generation
        try {
            searchEngine10.registerAll((java.util.List<java.lang.String>) strList39);
            org.junit.Assert.fail("Expected exception of type com.clouway.cuse.spi.SearchIndexMissingException; message: null");
        } catch (com.clouway.cuse.spi.SearchIndexMissingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(idConverter5);
        org.junit.Assert.assertNotNull(searchEngine6);
        org.junit.Assert.assertTrue("'" + sortType7 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType7.equals(com.clouway.cuse.spi.SortType.NUMERIC));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(idConverter9);
        org.junit.Assert.assertNotNull(searchEngine10);
        org.junit.Assert.assertNotNull(searchFilter12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0:( OR ):( OR )" + "'", str33, "0:( OR ):( OR )");
        org.junit.Assert.assertNotNull(searchFilter35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0" + "'", str41, "0");
        org.junit.Assert.assertNotNull(searchFilter44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + ":( OR )" + "'", str45, ":( OR )");
        org.junit.Assert.assertNotNull(searchFilter46);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str2 = longIdConverter0.convertFrom((java.lang.Object) 10.0d);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        com.clouway.cuse.spi.filters.SearchFilter searchFilter7 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray6);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter8 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray6);
        java.lang.String str9 = longIdConverter0.convertFrom((java.lang.Object) strArray6);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter10 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray6);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray6);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(searchFilter7);
        org.junit.Assert.assertNotNull(searchFilter8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(searchFilter10);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer fullWordSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = fullWordSearchFieldIndexer0.index("", field2, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.LongIdConverter longIdConverter4 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str6 = longIdConverter4.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str8 = longIdConverter4.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter9 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter11 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.lang.String str17 = searchFilter11.getValue((java.util.List<java.lang.String>) strList15);
        java.lang.String[] strArray20 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.lang.String str23 = searchFilter11.getValue((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter24 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList21);
        java.util.List<java.lang.Long> longList25 = longIdConverter9.convert((java.util.List<java.lang.String>) strList21);
        java.util.List<java.lang.Long> longList26 = longIdConverter4.convert((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter28 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter30 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.lang.String str36 = searchFilter30.getValue((java.util.List<java.lang.String>) strList34);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter37 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList34);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter38 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList34);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter39 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList34);
        java.lang.String str40 = multiFieldValueFilter28.getValue((java.util.List<java.lang.String>) strList34);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter42 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.lang.String str48 = searchFilter42.getValue((java.util.List<java.lang.String>) strList46);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter49 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList46);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter50 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList46);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter52 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray55 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        java.lang.String str58 = searchFilter52.getValue((java.util.List<java.lang.String>) strList56);
        java.lang.String[] strArray61 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        java.lang.String str64 = searchFilter52.getValue((java.util.List<java.lang.String>) strList62);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter65 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList62);
        java.lang.String str66 = equalitySearchFilter50.getValue((java.util.List<java.lang.String>) strList62);
        java.lang.String str67 = multiFieldValueFilter28.getValue((java.util.List<java.lang.String>) strList62);
        java.util.List<java.lang.Long> longList68 = longIdConverter4.convert((java.util.List<java.lang.String>) strList62);
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.delete("0:( OR )", longList68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(searchFilter11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0:0 " + "'", str23, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter24);
        org.junit.Assert.assertNotNull(longList25);
        org.junit.Assert.assertNotNull(longList26);
        org.junit.Assert.assertNotNull(searchFilter30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0" + "'", str36, "0");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ":0 OR :0" + "'", str40, ":0 OR :0");
        org.junit.Assert.assertNotNull(searchFilter42);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "0" + "'", str48, "0");
        org.junit.Assert.assertNotNull(searchFilter52);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "0" + "'", str58, "0");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "0:0 " + "'", str64, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "0: 0: " + "'", str66, "0: 0: ");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "0:0 OR 0:0" + "'", str67, "0:0 OR 0:0");
        org.junit.Assert.assertNotNull(longList68);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str2 = longIdConverter0.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str4 = longIdConverter0.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter6 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.lang.String str12 = searchFilter6.getValue((java.util.List<java.lang.String>) strList10);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter13 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList10);
        java.lang.String[] strArray24 = new java.lang.String[] { "0:( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: ", "com.clouway.cuse.spi.IndexCreationFailureException: ", "0: 0: ", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", ":( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: " };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.lang.String str27 = orSearchFilter13.getValue((java.util.List<java.lang.String>) strList25);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter29 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.lang.String str35 = searchFilter29.getValue((java.util.List<java.lang.String>) strList33);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter36 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList33);
        java.lang.String[] strArray47 = new java.lang.String[] { "0:( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: ", "com.clouway.cuse.spi.IndexCreationFailureException: ", "0: 0: ", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", ":( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: " };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        java.lang.String str50 = orSearchFilter36.getValue((java.util.List<java.lang.String>) strList48);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter52 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray55 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        java.lang.String str58 = searchFilter52.getValue((java.util.List<java.lang.String>) strList56);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter59 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList56);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter60 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList56);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter61 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList56);
        java.lang.String str62 = orSearchFilter36.getValue((java.util.List<java.lang.String>) strList56);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter63 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList56);
        java.lang.String str64 = orSearchFilter13.getValue((java.util.List<java.lang.String>) strList56);
        java.lang.String str65 = longIdConverter0.convertFrom((java.lang.Object) orSearchFilter13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(searchFilter6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0:( OR ):( OR )" + "'", str27, "0:( OR ):( OR )");
        org.junit.Assert.assertNotNull(searchFilter29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0" + "'", str35, "0");
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "0:( OR ):( OR )" + "'", str50, "0:( OR ):( OR )");
        org.junit.Assert.assertNotNull(searchFilter52);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "0" + "'", str58, "0");
        org.junit.Assert.assertNotNull(searchFilter61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + ":( OR )" + "'", str62, ":( OR )");
        org.junit.Assert.assertNotNull(searchFilter63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + ":( OR )" + "'", str64, ":( OR )");
        org.junit.Assert.assertNull(str65);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter12 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter14 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String str20 = searchFilter14.getValue((java.util.List<java.lang.String>) strList18);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter21 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList18);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter23 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.lang.String str29 = searchFilter23.getValue((java.util.List<java.lang.String>) strList27);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter30 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList27);
        java.lang.String str31 = orSearchFilter21.getValue((java.util.List<java.lang.String>) strList27);
        java.lang.String str32 = equalitySearchFilter12.getValue((java.util.List<java.lang.String>) strList27);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter34 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.lang.String str40 = searchFilter34.getValue((java.util.List<java.lang.String>) strList38);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter41 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList38);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter43 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        java.lang.String str49 = searchFilter43.getValue((java.util.List<java.lang.String>) strList47);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter50 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList47);
        java.lang.String str51 = orSearchFilter41.getValue((java.util.List<java.lang.String>) strList47);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter52 = com.clouway.cuse.gae.filters.SearchFilters.is((java.util.List<java.lang.String>) strList47);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter53 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList47);
        java.lang.String str54 = equalitySearchFilter12.getValue((java.util.List<java.lang.String>) strList47);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy55 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.registerAll((java.util.List<java.lang.String>) strList47, indexingStrategy55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(searchFilter14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertNotNull(searchFilter23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ":( OR )" + "'", str31, ":( OR )");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(searchFilter34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0" + "'", str40, "0");
        org.junit.Assert.assertNotNull(searchFilter43);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "0" + "'", str49, "0");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + ":( OR )" + "'", str51, ":( OR )");
        org.junit.Assert.assertNotNull(searchFilter52);
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.LongIdConverter longIdConverter4 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter6 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.lang.String str12 = searchFilter6.getValue((java.util.List<java.lang.String>) strList10);
        java.lang.String[] strArray15 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.lang.String str18 = searchFilter6.getValue((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter19 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList16);
        java.util.List<java.lang.Long> longList20 = longIdConverter4.convert((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException22 = new com.clouway.cuse.spi.IndexCreationFailureException(":( OR )");
        java.lang.String str23 = longIdConverter4.convertFrom((java.lang.Object) ":( OR )");
        com.clouway.cuse.spi.LongIdConverter longIdConverter24 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str26 = longIdConverter24.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str28 = longIdConverter24.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter29 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter31 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.lang.String str37 = searchFilter31.getValue((java.util.List<java.lang.String>) strList35);
        java.lang.String[] strArray40 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.lang.String str43 = searchFilter31.getValue((java.util.List<java.lang.String>) strList41);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter44 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList41);
        java.util.List<java.lang.Long> longList45 = longIdConverter29.convert((java.util.List<java.lang.String>) strList41);
        java.util.List<java.lang.Long> longList46 = longIdConverter24.convert((java.util.List<java.lang.String>) strList41);
        java.util.List<java.lang.Long> longList47 = longIdConverter4.convert((java.util.List<java.lang.String>) strList41);
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.delete("0:0 OR 0:0", longList47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0:0 " + "'", str18, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter19);
        org.junit.Assert.assertNotNull(longList20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(searchFilter31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0" + "'", str37, "0");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0:0 " + "'", str43, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter44);
        org.junit.Assert.assertNotNull(longList45);
        org.junit.Assert.assertNotNull(longList46);
        org.junit.Assert.assertNotNull(longList47);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException1 = new com.clouway.cuse.spi.IndexCreationFailureException("");
        com.clouway.cuse.spi.NotConfiguredIndexingStrategyException notConfiguredIndexingStrategyException2 = new com.clouway.cuse.spi.NotConfiguredIndexingStrategyException();
        indexCreationFailureException1.addSuppressed((java.lang.Throwable) notConfiguredIndexingStrategyException2);
        com.clouway.cuse.spi.NotConfiguredIdConvertorException notConfiguredIdConvertorException4 = new com.clouway.cuse.spi.NotConfiguredIdConvertorException();
        notConfiguredIndexingStrategyException2.addSuppressed((java.lang.Throwable) notConfiguredIdConvertorException4);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException7 = new com.clouway.cuse.spi.IndexCreationFailureException("");
        notConfiguredIdConvertorException4.addSuppressed((java.lang.Throwable) indexCreationFailureException7);
        java.lang.Throwable[] throwableArray9 = indexCreationFailureException7.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer idFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer();
        java.lang.reflect.Field field2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = idFieldIndexer0.index("", field2, (java.lang.Object) "0:0 0:0 ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog1 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException2 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass3 = searchIndexMissmatchException2.getClass();
        com.clouway.cuse.spi.IdConverter idConverter4 = defaultIdConverterCatalog1.getConverter((java.lang.Class) wildcardClass3);
        com.clouway.cuse.spi.SearchEngine searchEngine5 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog1);
        com.clouway.cuse.spi.SortType sortType6 = com.clouway.cuse.spi.SortType.NUMERIC;
        java.lang.Class<?> wildcardClass7 = sortType6.getClass();
        com.clouway.cuse.spi.IdConverter idConverter8 = defaultIdConverterCatalog1.getConverter((java.lang.Class) wildcardClass7);
        java.lang.Class class9 = null;
        com.clouway.cuse.spi.IdConverter idConverter10 = defaultIdConverterCatalog1.getConverter(class9);
        com.clouway.cuse.spi.EntityLoader entityLoader11 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog12 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException13 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass14 = searchIndexMissmatchException13.getClass();
        com.clouway.cuse.spi.IdConverter idConverter15 = defaultIdConverterCatalog12.getConverter((java.lang.Class) wildcardClass14);
        com.clouway.cuse.spi.SearchEngine searchEngine16 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader11, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog12);
        com.clouway.cuse.spi.SortType sortType17 = com.clouway.cuse.spi.SortType.NUMERIC;
        java.lang.Class<?> wildcardClass18 = sortType17.getClass();
        com.clouway.cuse.spi.IdConverter idConverter19 = defaultIdConverterCatalog12.getConverter((java.lang.Class) wildcardClass18);
        com.clouway.cuse.spi.IdConverter idConverter20 = defaultIdConverterCatalog1.getConverter((java.lang.Class) wildcardClass18);
        com.clouway.cuse.spi.SortType sortType21 = com.clouway.cuse.spi.SortType.NUMERIC;
        java.lang.Class<?> wildcardClass22 = sortType21.getClass();
        com.clouway.cuse.spi.IdConverter idConverter23 = defaultIdConverterCatalog1.getConverter((java.lang.Class) wildcardClass22);
        com.clouway.cuse.spi.EntityLoader entityLoader24 = null;
        com.clouway.cuse.spi.EntityLoader entityLoader25 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog26 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException27 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass28 = searchIndexMissmatchException27.getClass();
        com.clouway.cuse.spi.IdConverter idConverter29 = defaultIdConverterCatalog26.getConverter((java.lang.Class) wildcardClass28);
        com.clouway.cuse.spi.SearchEngine searchEngine30 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader25, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog26);
        com.clouway.cuse.spi.SortType sortType31 = com.clouway.cuse.spi.SortType.NUMERIC;
        java.lang.Class<?> wildcardClass32 = sortType31.getClass();
        com.clouway.cuse.spi.IdConverter idConverter33 = defaultIdConverterCatalog26.getConverter((java.lang.Class) wildcardClass32);
        java.lang.Class class34 = null;
        com.clouway.cuse.spi.IdConverter idConverter35 = defaultIdConverterCatalog26.getConverter(class34);
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException36 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass37 = searchIndexMissmatchException36.getClass();
        com.clouway.cuse.spi.StringIdConverter stringIdConverter38 = new com.clouway.cuse.spi.StringIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter40 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 100);
        java.lang.String str41 = stringIdConverter38.convertFrom((java.lang.Object) 100);
        defaultIdConverterCatalog26.addIdConverter((java.lang.Class) wildcardClass37, (com.clouway.cuse.spi.IdConverter) stringIdConverter38);
        com.clouway.cuse.spi.SearchEngine searchEngine43 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader24, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog26);
        com.clouway.cuse.spi.EntityLoader entityLoader44 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog45 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException46 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass47 = searchIndexMissmatchException46.getClass();
        com.clouway.cuse.spi.IdConverter idConverter48 = defaultIdConverterCatalog45.getConverter((java.lang.Class) wildcardClass47);
        com.clouway.cuse.spi.SearchEngine searchEngine49 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader44, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog45);
        com.clouway.cuse.spi.SortType sortType50 = com.clouway.cuse.spi.SortType.NUMERIC;
        java.lang.Class<?> wildcardClass51 = sortType50.getClass();
        com.clouway.cuse.spi.IdConverter idConverter52 = defaultIdConverterCatalog45.getConverter((java.lang.Class) wildcardClass51);
        java.lang.Class class53 = null;
        com.clouway.cuse.spi.IdConverter idConverter54 = defaultIdConverterCatalog45.getConverter(class53);
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException55 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass56 = searchIndexMissmatchException55.getClass();
        com.clouway.cuse.spi.StringIdConverter stringIdConverter57 = new com.clouway.cuse.spi.StringIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter59 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 100);
        java.lang.String str60 = stringIdConverter57.convertFrom((java.lang.Object) 100);
        defaultIdConverterCatalog45.addIdConverter((java.lang.Class) wildcardClass56, (com.clouway.cuse.spi.IdConverter) stringIdConverter57);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter63 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray66 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        java.lang.String str69 = searchFilter63.getValue((java.util.List<java.lang.String>) strList67);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter70 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList67);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter72 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray75 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList76 = new java.util.ArrayList<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList76, strArray75);
        java.lang.String str78 = searchFilter72.getValue((java.util.List<java.lang.String>) strList76);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter79 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList76);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter80 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList76);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter81 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList76);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter83 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray86 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList87 = new java.util.ArrayList<java.lang.String>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList87, strArray86);
        java.lang.String str89 = searchFilter83.getValue((java.util.List<java.lang.String>) strList87);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter90 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList87);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter91 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList87);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter92 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList87);
        java.lang.String str93 = orSearchFilter81.getValue((java.util.List<java.lang.String>) strList87);
        java.lang.String str94 = orSearchFilter70.getValue((java.util.List<java.lang.String>) strList87);
        java.lang.Class<?> wildcardClass95 = orSearchFilter70.getClass();
        com.clouway.cuse.spi.IdConverter idConverter96 = defaultIdConverterCatalog45.getConverter((java.lang.Class) wildcardClass95);
        com.clouway.cuse.spi.IdConverter idConverter97 = defaultIdConverterCatalog26.getConverter((java.lang.Class) wildcardClass95);
        com.clouway.cuse.spi.IdConverter idConverter98 = defaultIdConverterCatalog1.getConverter((java.lang.Class) wildcardClass95);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(idConverter4);
        org.junit.Assert.assertNotNull(searchEngine5);
        org.junit.Assert.assertTrue("'" + sortType6 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType6.equals(com.clouway.cuse.spi.SortType.NUMERIC));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(idConverter8);
        org.junit.Assert.assertNull(idConverter10);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(idConverter15);
        org.junit.Assert.assertNotNull(searchEngine16);
        org.junit.Assert.assertTrue("'" + sortType17 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType17.equals(com.clouway.cuse.spi.SortType.NUMERIC));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(idConverter19);
        org.junit.Assert.assertNull(idConverter20);
        org.junit.Assert.assertTrue("'" + sortType21 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType21.equals(com.clouway.cuse.spi.SortType.NUMERIC));
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNull(idConverter23);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(idConverter29);
        org.junit.Assert.assertNotNull(searchEngine30);
        org.junit.Assert.assertTrue("'" + sortType31 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType31.equals(com.clouway.cuse.spi.SortType.NUMERIC));
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNull(idConverter33);
        org.junit.Assert.assertNull(idConverter35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(searchFilter40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(searchEngine43);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNull(idConverter48);
        org.junit.Assert.assertNotNull(searchEngine49);
        org.junit.Assert.assertTrue("'" + sortType50 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType50.equals(com.clouway.cuse.spi.SortType.NUMERIC));
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNull(idConverter52);
        org.junit.Assert.assertNull(idConverter54);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(searchFilter59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(searchFilter63);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "0" + "'", str69, "0");
        org.junit.Assert.assertNotNull(searchFilter72);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "0" + "'", str78, "0");
        org.junit.Assert.assertNotNull(searchFilter83);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "0" + "'", str89, "0");
        org.junit.Assert.assertNotNull(searchFilter92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + ":( OR )" + "'", str93, ":( OR )");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + ":( OR )" + "'", str94, ":( OR )");
        org.junit.Assert.assertNotNull(wildcardClass95);
        org.junit.Assert.assertNull(idConverter96);
        org.junit.Assert.assertNull(idConverter97);
        org.junit.Assert.assertNull(idConverter98);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter4 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter6 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.lang.String str12 = searchFilter6.getValue((java.util.List<java.lang.String>) strList10);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter13 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList10);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter14 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList10);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter15 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList10);
        java.lang.String str16 = multiFieldValueFilter4.getValue((java.util.List<java.lang.String>) strList10);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter18 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.lang.String str24 = searchFilter18.getValue((java.util.List<java.lang.String>) strList22);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter25 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList22);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter26 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList22);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter27 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList22);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter29 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.lang.String str35 = searchFilter29.getValue((java.util.List<java.lang.String>) strList33);
        java.lang.String[] strArray38 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.lang.String str41 = searchFilter29.getValue((java.util.List<java.lang.String>) strList39);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter42 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList39);
        java.lang.String str43 = orSearchFilter27.getValue((java.util.List<java.lang.String>) strList39);
        java.lang.String str44 = multiFieldValueFilter4.getValue((java.util.List<java.lang.String>) strList39);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy45 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.registerAll((java.util.List<java.lang.String>) strList39, indexingStrategy45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ":0 OR :0" + "'", str16, ":0 OR :0");
        org.junit.Assert.assertNotNull(searchFilter18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0" + "'", str24, "0");
        org.junit.Assert.assertNotNull(searchFilter29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0" + "'", str35, "0");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0:0 " + "'", str41, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0:( OR )" + "'", str43, "0:( OR )");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "0:0 OR 0:0" + "'", str44, "0:0 OR 0:0");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer fullWordSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.EntityLoader entityLoader3 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog4 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException5 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass6 = searchIndexMissmatchException5.getClass();
        com.clouway.cuse.spi.IdConverter idConverter7 = defaultIdConverterCatalog4.getConverter((java.lang.Class) wildcardClass6);
        com.clouway.cuse.spi.SearchEngine searchEngine8 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader3, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog4);
        com.clouway.cuse.spi.EntityLoader entityLoader9 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog10 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException11 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass12 = searchIndexMissmatchException11.getClass();
        com.clouway.cuse.spi.IdConverter idConverter13 = defaultIdConverterCatalog10.getConverter((java.lang.Class) wildcardClass12);
        com.clouway.cuse.spi.SearchEngine searchEngine14 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader9, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog10);
        com.clouway.cuse.spi.SortType sortType15 = com.clouway.cuse.spi.SortType.NUMERIC;
        java.lang.Class<?> wildcardClass16 = sortType15.getClass();
        com.clouway.cuse.spi.IdConverter idConverter17 = defaultIdConverterCatalog10.getConverter((java.lang.Class) wildcardClass16);
        java.lang.Class class18 = null;
        com.clouway.cuse.spi.IdConverter idConverter19 = defaultIdConverterCatalog10.getConverter(class18);
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException20 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass21 = searchIndexMissmatchException20.getClass();
        com.clouway.cuse.spi.StringIdConverter stringIdConverter22 = new com.clouway.cuse.spi.StringIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter24 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 100);
        java.lang.String str25 = stringIdConverter22.convertFrom((java.lang.Object) 100);
        defaultIdConverterCatalog10.addIdConverter((java.lang.Class) wildcardClass21, (com.clouway.cuse.spi.IdConverter) stringIdConverter22);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter28 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.lang.String str34 = searchFilter28.getValue((java.util.List<java.lang.String>) strList32);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter35 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList32);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter37 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.lang.String str43 = searchFilter37.getValue((java.util.List<java.lang.String>) strList41);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter44 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList41);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter45 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList41);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter46 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList41);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter48 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.lang.String str54 = searchFilter48.getValue((java.util.List<java.lang.String>) strList52);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter55 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList52);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter56 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList52);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter57 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList52);
        java.lang.String str58 = orSearchFilter46.getValue((java.util.List<java.lang.String>) strList52);
        java.lang.String str59 = orSearchFilter35.getValue((java.util.List<java.lang.String>) strList52);
        java.lang.Class<?> wildcardClass60 = orSearchFilter35.getClass();
        com.clouway.cuse.spi.IdConverter idConverter61 = defaultIdConverterCatalog10.getConverter((java.lang.Class) wildcardClass60);
        com.clouway.cuse.spi.IdConverter idConverter62 = defaultIdConverterCatalog4.getConverter((java.lang.Class) wildcardClass60);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList63 = fullWordSearchFieldIndexer0.index("0:( OR )", field2, (java.lang.Object) idConverter62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: 0:( OR )");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(idConverter7);
        org.junit.Assert.assertNotNull(searchEngine8);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(idConverter13);
        org.junit.Assert.assertNotNull(searchEngine14);
        org.junit.Assert.assertTrue("'" + sortType15 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType15.equals(com.clouway.cuse.spi.SortType.NUMERIC));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(idConverter17);
        org.junit.Assert.assertNull(idConverter19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(searchFilter24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(searchFilter28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0" + "'", str34, "0");
        org.junit.Assert.assertNotNull(searchFilter37);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0" + "'", str43, "0");
        org.junit.Assert.assertNotNull(searchFilter48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "0" + "'", str54, "0");
        org.junit.Assert.assertNotNull(searchFilter57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + ":( OR )" + "'", str58, ":( OR )");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + ":( OR )" + "'", str59, ":( OR )");
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNull(idConverter61);
        org.junit.Assert.assertNull(idConverter62);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "" };
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray3);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter5 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray3);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter6 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray3);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter8 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.lang.String str14 = searchFilter8.getValue((java.util.List<java.lang.String>) strList12);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter15 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList12);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter17 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.lang.String str23 = searchFilter17.getValue((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter24 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList21);
        java.lang.String str25 = orSearchFilter15.getValue((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter26 = com.clouway.cuse.gae.filters.SearchFilters.is((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter27 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter28 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList21);
        java.lang.String str29 = orSearchFilter6.getValue((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter30 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList21);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(searchFilter5);
        org.junit.Assert.assertNotNull(searchFilter8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertNotNull(searchFilter17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ":( OR )" + "'", str25, ":( OR )");
        org.junit.Assert.assertNotNull(searchFilter26);
        org.junit.Assert.assertNotNull(searchFilter28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ":(hi! OR  OR )" + "'", str29, ":(hi! OR  OR )");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        com.clouway.cuse.gae.filedindexing.dateindex.DateFieldIndexer dateFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.dateindex.DateFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.StringIdConverter stringIdConverter3 = new com.clouway.cuse.spi.StringIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter5 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.lang.String str11 = searchFilter5.getValue((java.util.List<java.lang.String>) strList9);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter12 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList9);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter13 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList9);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter15 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.lang.String str21 = searchFilter15.getValue((java.util.List<java.lang.String>) strList19);
        java.lang.String[] strArray24 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.lang.String str27 = searchFilter15.getValue((java.util.List<java.lang.String>) strList25);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter28 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList25);
        java.lang.String str29 = equalitySearchFilter13.getValue((java.util.List<java.lang.String>) strList25);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter30 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList25);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter31 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList25);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter33 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        java.lang.String str39 = searchFilter33.getValue((java.util.List<java.lang.String>) strList37);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter40 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList37);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter42 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.lang.String str48 = searchFilter42.getValue((java.util.List<java.lang.String>) strList46);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter49 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList46);
        java.lang.String str50 = orSearchFilter40.getValue((java.util.List<java.lang.String>) strList46);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter51 = com.clouway.cuse.gae.filters.SearchFilters.is((java.util.List<java.lang.String>) strList46);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter52 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList46);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter53 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList46);
        java.lang.String str54 = orSearchFilter31.getValue((java.util.List<java.lang.String>) strList46);
        java.lang.String str55 = stringIdConverter3.convertFrom((java.lang.Object) str54);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter57 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray60 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        java.lang.String str63 = searchFilter57.getValue((java.util.List<java.lang.String>) strList61);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter64 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList61);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter65 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList61);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter67 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray70 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        java.lang.String str73 = searchFilter67.getValue((java.util.List<java.lang.String>) strList71);
        java.lang.String[] strArray76 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList77 = new java.util.ArrayList<java.lang.String>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList77, strArray76);
        java.lang.String str79 = searchFilter67.getValue((java.util.List<java.lang.String>) strList77);
        java.lang.String str80 = orSearchFilter65.getValue((java.util.List<java.lang.String>) strList77);
        java.util.List<java.lang.String> strList81 = stringIdConverter3.convert((java.util.List<java.lang.String>) strList77);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList82 = dateFieldIndexer0.index("com.clouway.cuse.spi.IndexCreationFailureException: 0:0 ", field2, (java.lang.Object) strList81);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.ArrayList cannot be cast to java.util.Date");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertNotNull(searchFilter15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0:0 " + "'", str27, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0: 0: " + "'", str29, "0: 0: ");
        org.junit.Assert.assertNotNull(searchFilter33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "0" + "'", str39, "0");
        org.junit.Assert.assertNotNull(searchFilter42);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "0" + "'", str48, "0");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + ":( OR )" + "'", str50, ":( OR )");
        org.junit.Assert.assertNotNull(searchFilter51);
        org.junit.Assert.assertNotNull(searchFilter53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + ":(0 OR 0)" + "'", str54, ":(0 OR 0)");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + ":(0 OR 0)" + "'", str55, ":(0 OR 0)");
        org.junit.Assert.assertNotNull(searchFilter57);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "0" + "'", str63, "0");
        org.junit.Assert.assertNotNull(searchFilter67);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "0" + "'", str73, "0");
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "0:0 " + "'", str79, "0:0 ");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "0:( OR )" + "'", str80, "0:( OR )");
        org.junit.Assert.assertNotNull(strList81);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer idFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException4 = new com.clouway.cuse.spi.IndexCreationFailureException(":(hi! OR  OR )");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList5 = idFieldIndexer0.index("0\\\\:hi! OR 0\\\\:hi!", field2, (java.lang.Object) ":(hi! OR  OR )");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: 0\\\\:hi! OR 0\\\\:hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.LongIdConverter longIdConverter4 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter6 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.lang.String str12 = searchFilter6.getValue((java.util.List<java.lang.String>) strList10);
        java.lang.String[] strArray15 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.lang.String str18 = searchFilter6.getValue((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter19 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList16);
        java.util.List<java.lang.Long> longList20 = longIdConverter4.convert((java.util.List<java.lang.String>) strList16);
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.delete("0\\\\:(0\\\\:0  OR com.clouway.cuse.spi.IndexCreationFailureException\\\\:  OR 0 OR hi! OR com.clouway.cuse.spi.IndexCreationFailureException\\\\\\:  OR com.clouway.cuse.spi.IndexCreationFailureException\\\\\\: )", longList20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0:0 " + "'", str18, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter19);
        org.junit.Assert.assertNotNull(longList20);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy4 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.register((java.lang.Object) (byte) -1, indexingStrategy4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter1 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter3 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.lang.String str9 = searchFilter3.getValue((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter10 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter11 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter12 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList7);
        java.lang.String str13 = multiFieldValueFilter1.getValue((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter15 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.lang.String str21 = searchFilter15.getValue((java.util.List<java.lang.String>) strList19);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter22 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList19);
        java.lang.String[] strArray33 = new java.lang.String[] { "0:( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: ", "com.clouway.cuse.spi.IndexCreationFailureException: ", "0: 0: ", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", ":( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: " };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.lang.String str36 = orSearchFilter22.getValue((java.util.List<java.lang.String>) strList34);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter38 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.lang.String str44 = searchFilter38.getValue((java.util.List<java.lang.String>) strList42);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter45 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList42);
        java.lang.String[] strArray56 = new java.lang.String[] { "0:( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: ", "com.clouway.cuse.spi.IndexCreationFailureException: ", "0: 0: ", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", ":( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: " };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        java.lang.String str59 = orSearchFilter45.getValue((java.util.List<java.lang.String>) strList57);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter61 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray64 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        java.lang.String str67 = searchFilter61.getValue((java.util.List<java.lang.String>) strList65);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter68 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList65);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter69 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList65);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter70 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList65);
        java.lang.String str71 = orSearchFilter45.getValue((java.util.List<java.lang.String>) strList65);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter72 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList65);
        java.lang.String str73 = orSearchFilter22.getValue((java.util.List<java.lang.String>) strList65);
        java.lang.String str74 = multiFieldValueFilter1.getValue((java.util.List<java.lang.String>) strList65);
        org.junit.Assert.assertNotNull(searchFilter3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":0 OR :0" + "'", str13, ":0 OR :0");
        org.junit.Assert.assertNotNull(searchFilter15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0:( OR ):( OR )" + "'", str36, "0:( OR ):( OR )");
        org.junit.Assert.assertNotNull(searchFilter38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "0" + "'", str44, "0");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "0:( OR ):( OR )" + "'", str59, "0:( OR ):( OR )");
        org.junit.Assert.assertNotNull(searchFilter61);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "0" + "'", str67, "0");
        org.junit.Assert.assertNotNull(searchFilter70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + ":( OR )" + "'", str71, ":( OR )");
        org.junit.Assert.assertNotNull(searchFilter72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + ":( OR )" + "'", str73, ":( OR )");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + ":0 OR :0" + "'", str74, ":0 OR :0");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder gaeSearchApiMatchedIdObjectFinder0 = new com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter3 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.lang.String str9 = searchFilter3.getValue((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter10 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter11 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter12 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList7);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter14 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String str20 = searchFilter14.getValue((java.util.List<java.lang.String>) strList18);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter21 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList18);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter22 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList18);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter23 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList18);
        java.lang.String str24 = orSearchFilter12.getValue((java.util.List<java.lang.String>) strList18);
        com.clouway.cuse.spi.SortOrder sortOrder28 = com.clouway.cuse.spi.SortOrder.ASCENDING;
        com.clouway.cuse.spi.SortType sortType29 = com.clouway.cuse.spi.SortType.TEXT;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList30 = gaeSearchApiMatchedIdObjectFinder0.find("0\\:hi! OR 0\\:hi!", (java.util.List<java.lang.String>) strList18, (int) 'a', (int) (short) 10, "0:0 OR 0:0", sortOrder28, sortType29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse sort expression '0:0 OR 0:0': parse error at line 1 position 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(searchFilter14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertNotNull(searchFilter23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ":( OR )" + "'", str24, ":( OR )");
        org.junit.Assert.assertTrue("'" + sortOrder28 + "' != '" + com.clouway.cuse.spi.SortOrder.ASCENDING + "'", sortOrder28.equals(com.clouway.cuse.spi.SortOrder.ASCENDING));
        org.junit.Assert.assertTrue("'" + sortType29 + "' != '" + com.clouway.cuse.spi.SortType.TEXT + "'", sortType29.equals(com.clouway.cuse.spi.SortType.TEXT));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str2 = longIdConverter0.convertFrom((java.lang.Object) (short) 100);
        java.lang.Object obj3 = null;
        java.lang.String str4 = longIdConverter0.convertFrom(obj3);
        com.clouway.cuse.spi.IndexWriter indexWriter5 = new com.clouway.cuse.spi.IndexWriter();
        java.lang.String[] strArray12 = new java.lang.String[] { "com.clouway.cuse.spi.IndexCreationFailureException: ", "com.clouway.cuse.spi.IndexCreationFailureException\\: ", "0", "0: 0: ", "", ":0 OR :0" };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter13 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray12);
        java.util.Set<java.lang.String> strSet14 = indexWriter5.createIndex(strArray12);
        java.lang.String[] strArray21 = new java.lang.String[] { "com.clouway.cuse.spi.IndexCreationFailureException: ", "com.clouway.cuse.spi.IndexCreationFailureException\\: ", "0", "0: 0: ", "", ":0 OR :0" };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter22 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray21);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter23 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray21);
        java.util.Set<java.lang.String> strSet24 = indexWriter5.createIndex(strArray21);
        java.lang.String str25 = longIdConverter0.convertFrom((java.lang.Object) strArray21);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter27 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.lang.String str33 = searchFilter27.getValue((java.util.List<java.lang.String>) strList31);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter34 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList31);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter35 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList31);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter36 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList31);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter38 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.lang.String str44 = searchFilter38.getValue((java.util.List<java.lang.String>) strList42);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter45 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList42);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter46 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList42);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter47 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList42);
        java.lang.String str48 = orSearchFilter36.getValue((java.util.List<java.lang.String>) strList42);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList49 = longIdConverter0.convert((java.util.List<java.lang.String>) strList42);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(searchFilter23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(searchFilter27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0" + "'", str33, "0");
        org.junit.Assert.assertNotNull(searchFilter38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "0" + "'", str44, "0");
        org.junit.Assert.assertNotNull(searchFilter47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + ":( OR )" + "'", str48, ":( OR )");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter1 = new com.clouway.cuse.gae.filters.EqualitySearchFilter("0: 0: ");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter1 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("hi!");
        com.clouway.cuse.spi.LongIdConverter longIdConverter2 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        java.lang.String[] strArray13 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.lang.String str16 = searchFilter4.getValue((java.util.List<java.lang.String>) strList14);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter17 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList14);
        java.util.List<java.lang.Long> longList18 = longIdConverter2.convert((java.util.List<java.lang.String>) strList14);
        java.lang.String str19 = multiFieldValueFilter1.getValue((java.util.List<java.lang.String>) strList14);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter21 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter23 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.lang.String str29 = searchFilter23.getValue((java.util.List<java.lang.String>) strList27);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter30 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList27);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter31 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList27);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter32 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList27);
        java.lang.String str33 = multiFieldValueFilter21.getValue((java.util.List<java.lang.String>) strList27);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter35 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.lang.String str41 = searchFilter35.getValue((java.util.List<java.lang.String>) strList39);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter42 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList39);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter43 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList39);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter45 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray48 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        java.lang.String str51 = searchFilter45.getValue((java.util.List<java.lang.String>) strList49);
        java.lang.String[] strArray54 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        java.lang.String str57 = searchFilter45.getValue((java.util.List<java.lang.String>) strList55);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter58 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList55);
        java.lang.String str59 = equalitySearchFilter43.getValue((java.util.List<java.lang.String>) strList55);
        java.lang.String str60 = multiFieldValueFilter21.getValue((java.util.List<java.lang.String>) strList55);
        java.lang.String str61 = multiFieldValueFilter1.getValue((java.util.List<java.lang.String>) strList55);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter62 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList55);
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0:0 " + "'", str16, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter17);
        org.junit.Assert.assertNotNull(longList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0:hi! OR 0:hi!" + "'", str19, "0:hi! OR 0:hi!");
        org.junit.Assert.assertNotNull(searchFilter23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + ":0 OR :0" + "'", str33, ":0 OR :0");
        org.junit.Assert.assertNotNull(searchFilter35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0" + "'", str41, "0");
        org.junit.Assert.assertNotNull(searchFilter45);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "0" + "'", str51, "0");
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "0:0 " + "'", str57, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "0: 0: " + "'", str59, "0: 0: ");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "0:0 OR 0:0" + "'", str60, "0:0 OR 0:0");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "0:hi! OR 0:hi!" + "'", str61, "0:hi! OR 0:hi!");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer fullWordSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.fullwordindex.FullWordSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.LongIdConverter longIdConverter3 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str5 = longIdConverter3.convertFrom((java.lang.Object) (short) 100);
        java.lang.Object obj6 = null;
        java.lang.String str7 = longIdConverter3.convertFrom(obj6);
        com.clouway.cuse.spi.IndexWriter indexWriter8 = new com.clouway.cuse.spi.IndexWriter();
        java.lang.String[] strArray15 = new java.lang.String[] { "com.clouway.cuse.spi.IndexCreationFailureException: ", "com.clouway.cuse.spi.IndexCreationFailureException\\: ", "0", "0: 0: ", "", ":0 OR :0" };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter16 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray15);
        java.util.Set<java.lang.String> strSet17 = indexWriter8.createIndex(strArray15);
        java.lang.String[] strArray24 = new java.lang.String[] { "com.clouway.cuse.spi.IndexCreationFailureException: ", "com.clouway.cuse.spi.IndexCreationFailureException\\: ", "0", "0: 0: ", "", ":0 OR :0" };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter25 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray24);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter26 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray24);
        java.util.Set<java.lang.String> strSet27 = indexWriter8.createIndex(strArray24);
        java.lang.String str28 = longIdConverter3.convertFrom((java.lang.Object) strArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList29 = fullWordSearchFieldIndexer0.index("0\\:0 ", field2, (java.lang.Object) strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: 0\\:0 ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(searchFilter26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog1 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException2 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass3 = searchIndexMissmatchException2.getClass();
        com.clouway.cuse.spi.IdConverter idConverter4 = defaultIdConverterCatalog1.getConverter((java.lang.Class) wildcardClass3);
        com.clouway.cuse.spi.SearchEngine searchEngine5 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog1);
        com.clouway.cuse.spi.SortType sortType6 = com.clouway.cuse.spi.SortType.NUMERIC;
        java.lang.Class<?> wildcardClass7 = sortType6.getClass();
        com.clouway.cuse.spi.IdConverter idConverter8 = defaultIdConverterCatalog1.getConverter((java.lang.Class) wildcardClass7);
        java.lang.Class class9 = null;
        com.clouway.cuse.spi.IdConverter idConverter10 = defaultIdConverterCatalog1.getConverter(class9);
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException11 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass12 = searchIndexMissmatchException11.getClass();
        com.clouway.cuse.spi.StringIdConverter stringIdConverter13 = new com.clouway.cuse.spi.StringIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter15 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 100);
        java.lang.String str16 = stringIdConverter13.convertFrom((java.lang.Object) 100);
        defaultIdConverterCatalog1.addIdConverter((java.lang.Class) wildcardClass12, (com.clouway.cuse.spi.IdConverter) stringIdConverter13);
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog18 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException19 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass20 = searchIndexMissmatchException19.getClass();
        com.clouway.cuse.spi.LongIdConverter longIdConverter21 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str23 = longIdConverter21.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str25 = longIdConverter21.convertFrom((java.lang.Object) 100.0f);
        defaultIdConverterCatalog18.addIdConverter((java.lang.Class) wildcardClass20, (com.clouway.cuse.spi.IdConverter) longIdConverter21);
        com.clouway.cuse.spi.EntityLoader entityLoader27 = null;
        com.clouway.cuse.spi.EntityLoader entityLoader28 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog29 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException30 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass31 = searchIndexMissmatchException30.getClass();
        com.clouway.cuse.spi.IdConverter idConverter32 = defaultIdConverterCatalog29.getConverter((java.lang.Class) wildcardClass31);
        com.clouway.cuse.spi.SearchEngine searchEngine33 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader28, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog29);
        com.clouway.cuse.spi.SortType sortType34 = com.clouway.cuse.spi.SortType.NUMERIC;
        java.lang.Class<?> wildcardClass35 = sortType34.getClass();
        com.clouway.cuse.spi.IdConverter idConverter36 = defaultIdConverterCatalog29.getConverter((java.lang.Class) wildcardClass35);
        java.lang.Class class37 = null;
        com.clouway.cuse.spi.IdConverter idConverter38 = defaultIdConverterCatalog29.getConverter(class37);
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException39 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass40 = searchIndexMissmatchException39.getClass();
        com.clouway.cuse.spi.StringIdConverter stringIdConverter41 = new com.clouway.cuse.spi.StringIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter43 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 100);
        java.lang.String str44 = stringIdConverter41.convertFrom((java.lang.Object) 100);
        defaultIdConverterCatalog29.addIdConverter((java.lang.Class) wildcardClass40, (com.clouway.cuse.spi.IdConverter) stringIdConverter41);
        com.clouway.cuse.spi.SearchEngine searchEngine46 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader27, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog29);
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog47 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException48 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass49 = searchIndexMissmatchException48.getClass();
        com.clouway.cuse.spi.IdConverter idConverter50 = defaultIdConverterCatalog47.getConverter((java.lang.Class) wildcardClass49);
        com.clouway.cuse.spi.IdConverter idConverter51 = defaultIdConverterCatalog29.getConverter((java.lang.Class) wildcardClass49);
        defaultIdConverterCatalog1.addIdConverter((java.lang.Class) wildcardClass20, idConverter51);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(idConverter4);
        org.junit.Assert.assertNotNull(searchEngine5);
        org.junit.Assert.assertTrue("'" + sortType6 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType6.equals(com.clouway.cuse.spi.SortType.NUMERIC));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(idConverter8);
        org.junit.Assert.assertNull(idConverter10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(searchFilter15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNull(idConverter32);
        org.junit.Assert.assertNotNull(searchEngine33);
        org.junit.Assert.assertTrue("'" + sortType34 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType34.equals(com.clouway.cuse.spi.SortType.NUMERIC));
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(idConverter36);
        org.junit.Assert.assertNull(idConverter38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(searchFilter43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(searchEngine46);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNull(idConverter50);
        org.junit.Assert.assertNotNull(idConverter51);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer idFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter12 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter14 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String str20 = searchFilter14.getValue((java.util.List<java.lang.String>) strList18);
        java.lang.String[] strArray23 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.lang.String str26 = searchFilter14.getValue((java.util.List<java.lang.String>) strList24);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter27 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList24);
        java.lang.String str28 = equalitySearchFilter12.getValue((java.util.List<java.lang.String>) strList24);
        com.clouway.cuse.spi.LongIdConverter longIdConverter29 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter31 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.lang.String str37 = searchFilter31.getValue((java.util.List<java.lang.String>) strList35);
        java.lang.String[] strArray40 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.lang.String str43 = searchFilter31.getValue((java.util.List<java.lang.String>) strList41);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter44 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList41);
        java.util.List<java.lang.Long> longList45 = longIdConverter29.convert((java.util.List<java.lang.String>) strList41);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException47 = new com.clouway.cuse.spi.IndexCreationFailureException(":( OR )");
        java.lang.String str48 = longIdConverter29.convertFrom((java.lang.Object) ":( OR )");
        com.clouway.cuse.spi.LongIdConverter longIdConverter49 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str51 = longIdConverter49.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str53 = longIdConverter49.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter54 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter56 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray59 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        java.lang.String str62 = searchFilter56.getValue((java.util.List<java.lang.String>) strList60);
        java.lang.String[] strArray65 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        java.lang.String str68 = searchFilter56.getValue((java.util.List<java.lang.String>) strList66);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter69 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList66);
        java.util.List<java.lang.Long> longList70 = longIdConverter54.convert((java.util.List<java.lang.String>) strList66);
        java.util.List<java.lang.Long> longList71 = longIdConverter49.convert((java.util.List<java.lang.String>) strList66);
        java.util.List<java.lang.Long> longList72 = longIdConverter29.convert((java.util.List<java.lang.String>) strList66);
        java.lang.String str73 = equalitySearchFilter12.getValue((java.util.List<java.lang.String>) strList66);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList74 = idFieldIndexer0.index("0:( OR ):( OR )", field2, (java.lang.Object) str73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: 0:( OR ):( OR )");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(searchFilter14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0:0 " + "'", str26, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0: 0: " + "'", str28, "0: 0: ");
        org.junit.Assert.assertNotNull(searchFilter31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0" + "'", str37, "0");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0:0 " + "'", str43, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter44);
        org.junit.Assert.assertNotNull(longList45);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(searchFilter56);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "0" + "'", str62, "0");
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "0:0 " + "'", str68, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter69);
        org.junit.Assert.assertNotNull(longList70);
        org.junit.Assert.assertNotNull(longList71);
        org.junit.Assert.assertNotNull(longList72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "0: 0: " + "'", str73, "0: 0: ");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        com.clouway.cuse.gae.filedindexing.searchindex.SimpleSearchFieldCriteria simpleSearchFieldCriteria0 = new com.clouway.cuse.gae.filedindexing.searchindex.SimpleSearchFieldCriteria();
        java.lang.reflect.Field field1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = simpleSearchFieldCriteria0.match(field1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog1 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException2 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass3 = searchIndexMissmatchException2.getClass();
        com.clouway.cuse.spi.IdConverter idConverter4 = defaultIdConverterCatalog1.getConverter((java.lang.Class) wildcardClass3);
        com.clouway.cuse.spi.SearchEngine searchEngine5 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog1);
        com.clouway.cuse.spi.SortType sortType6 = com.clouway.cuse.spi.SortType.NUMERIC;
        java.lang.Class<?> wildcardClass7 = sortType6.getClass();
        com.clouway.cuse.spi.IdConverter idConverter8 = defaultIdConverterCatalog1.getConverter((java.lang.Class) wildcardClass7);
        java.lang.Class class9 = null;
        com.clouway.cuse.spi.IdConverter idConverter10 = defaultIdConverterCatalog1.getConverter(class9);
        com.clouway.cuse.spi.EntityLoader entityLoader11 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog12 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException13 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass14 = searchIndexMissmatchException13.getClass();
        com.clouway.cuse.spi.IdConverter idConverter15 = defaultIdConverterCatalog12.getConverter((java.lang.Class) wildcardClass14);
        com.clouway.cuse.spi.SearchEngine searchEngine16 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader11, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog12);
        com.clouway.cuse.spi.SortType sortType17 = com.clouway.cuse.spi.SortType.NUMERIC;
        java.lang.Class<?> wildcardClass18 = sortType17.getClass();
        com.clouway.cuse.spi.IdConverter idConverter19 = defaultIdConverterCatalog12.getConverter((java.lang.Class) wildcardClass18);
        com.clouway.cuse.spi.IdConverter idConverter20 = defaultIdConverterCatalog1.getConverter((java.lang.Class) wildcardClass18);
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException21 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass22 = searchIndexMissmatchException21.getClass();
        com.clouway.cuse.spi.LongIdConverter longIdConverter23 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str25 = longIdConverter23.convertFrom((java.lang.Object) (short) 100);
        defaultIdConverterCatalog1.addIdConverter((java.lang.Class) wildcardClass22, (com.clouway.cuse.spi.IdConverter) longIdConverter23);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(idConverter4);
        org.junit.Assert.assertNotNull(searchEngine5);
        org.junit.Assert.assertTrue("'" + sortType6 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType6.equals(com.clouway.cuse.spi.SortType.NUMERIC));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(idConverter8);
        org.junit.Assert.assertNull(idConverter10);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(idConverter15);
        org.junit.Assert.assertNotNull(searchEngine16);
        org.junit.Assert.assertTrue("'" + sortType17 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType17.equals(com.clouway.cuse.spi.SortType.NUMERIC));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(idConverter19);
        org.junit.Assert.assertNull(idConverter20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        java.lang.String[] strArray6 = new java.lang.String[] { "0:0 ", "com.clouway.cuse.spi.IndexCreationFailureException: ", "0", "hi!", "com.clouway.cuse.spi.IndexCreationFailureException\\: ", "com.clouway.cuse.spi.IndexCreationFailureException\\: " };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter7 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray6);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter9 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("com.clouway.cuse.spi.IndexCreationFailureException: ");
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter11 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter13 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.lang.String str19 = searchFilter13.getValue((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter20 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter21 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter23 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.lang.String str29 = searchFilter23.getValue((java.util.List<java.lang.String>) strList27);
        java.lang.String[] strArray32 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.lang.String str35 = searchFilter23.getValue((java.util.List<java.lang.String>) strList33);
        java.lang.String str36 = orSearchFilter21.getValue((java.util.List<java.lang.String>) strList33);
        java.lang.String str37 = multiFieldValueFilter11.getValue((java.util.List<java.lang.String>) strList33);
        java.lang.String str38 = multiFieldValueFilter9.getValue((java.util.List<java.lang.String>) strList33);
        java.lang.String str39 = orSearchFilter7.getValue((java.util.List<java.lang.String>) strList33);
        java.lang.Class<?> wildcardClass40 = strList33.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(searchFilter13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
        org.junit.Assert.assertNotNull(searchFilter23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0:0 " + "'", str35, "0:0 ");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0:( OR )" + "'", str36, "0:( OR )");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0:0 OR 0:0" + "'", str37, "0:0 OR 0:0");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0:com.clouway.cuse.spi.IndexCreationFailureException:  OR 0:com.clouway.cuse.spi.IndexCreationFailureException: " + "'", str38, "0:com.clouway.cuse.spi.IndexCreationFailureException:  OR 0:com.clouway.cuse.spi.IndexCreationFailureException: ");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "0:(0:0  OR com.clouway.cuse.spi.IndexCreationFailureException:  OR 0 OR hi! OR com.clouway.cuse.spi.IndexCreationFailureException\\:  OR com.clouway.cuse.spi.IndexCreationFailureException\\: )" + "'", str39, "0:(0:0  OR com.clouway.cuse.spi.IndexCreationFailureException:  OR 0 OR hi! OR com.clouway.cuse.spi.IndexCreationFailureException\\:  OR com.clouway.cuse.spi.IndexCreationFailureException\\: )");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        java.lang.String str1 = com.clouway.cuse.spi.EscapeUtil.escape("com.clouway.cuse.spi.IndexCreationFailureException: 0:0 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.clouway.cuse.spi.IndexCreationFailureException\\: 0\\:0 " + "'", str1, "com.clouway.cuse.spi.IndexCreationFailureException\\: 0\\:0 ");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str2 = longIdConverter0.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str4 = longIdConverter0.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter5 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter7 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.lang.String str13 = searchFilter7.getValue((java.util.List<java.lang.String>) strList11);
        java.lang.String[] strArray16 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.lang.String str19 = searchFilter7.getValue((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter20 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList17);
        java.util.List<java.lang.Long> longList21 = longIdConverter5.convert((java.util.List<java.lang.String>) strList17);
        java.util.List<java.lang.Long> longList22 = longIdConverter0.convert((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter24 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        java.lang.String str25 = longIdConverter0.convertFrom((java.lang.Object) "0");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(searchFilter7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0:0 " + "'", str19, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter20);
        org.junit.Assert.assertNotNull(longList21);
        org.junit.Assert.assertNotNull(longList22);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        com.clouway.cuse.spi.StringIdConverter stringIdConverter0 = new com.clouway.cuse.spi.StringIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter2 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 100);
        java.lang.String str3 = stringIdConverter0.convertFrom((java.lang.Object) 100);
        java.lang.String[] strArray7 = new java.lang.String[] { ":( OR )", "hi!", "com.clouway.cuse.spi.IndexCreationFailureException: " };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter10 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter11 = com.clouway.cuse.gae.filters.SearchFilters.is((java.util.List<java.lang.String>) strList8);
        java.util.List<java.lang.String> strList12 = stringIdConverter0.convert((java.util.List<java.lang.String>) strList8);
        org.junit.Assert.assertNotNull(searchFilter2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(searchFilter10);
        org.junit.Assert.assertNotNull(searchFilter11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(searchFilter1);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter12 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter14 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String str20 = searchFilter14.getValue((java.util.List<java.lang.String>) strList18);
        java.lang.String[] strArray23 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.lang.String str26 = searchFilter14.getValue((java.util.List<java.lang.String>) strList24);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter27 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList24);
        java.lang.String str28 = equalitySearchFilter12.getValue((java.util.List<java.lang.String>) strList24);
        com.clouway.cuse.spi.LongIdConverter longIdConverter29 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter31 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.lang.String str37 = searchFilter31.getValue((java.util.List<java.lang.String>) strList35);
        java.lang.String[] strArray40 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.lang.String str43 = searchFilter31.getValue((java.util.List<java.lang.String>) strList41);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter44 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList41);
        java.util.List<java.lang.Long> longList45 = longIdConverter29.convert((java.util.List<java.lang.String>) strList41);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException47 = new com.clouway.cuse.spi.IndexCreationFailureException(":( OR )");
        java.lang.String str48 = longIdConverter29.convertFrom((java.lang.Object) ":( OR )");
        com.clouway.cuse.spi.LongIdConverter longIdConverter49 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str51 = longIdConverter49.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str53 = longIdConverter49.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter54 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter56 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray59 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        java.lang.String str62 = searchFilter56.getValue((java.util.List<java.lang.String>) strList60);
        java.lang.String[] strArray65 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        java.lang.String str68 = searchFilter56.getValue((java.util.List<java.lang.String>) strList66);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter69 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList66);
        java.util.List<java.lang.Long> longList70 = longIdConverter54.convert((java.util.List<java.lang.String>) strList66);
        java.util.List<java.lang.Long> longList71 = longIdConverter49.convert((java.util.List<java.lang.String>) strList66);
        java.util.List<java.lang.Long> longList72 = longIdConverter29.convert((java.util.List<java.lang.String>) strList66);
        java.lang.String str73 = equalitySearchFilter12.getValue((java.util.List<java.lang.String>) strList66);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy74 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.registerAll((java.util.List<java.lang.String>) strList66, indexingStrategy74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(searchFilter14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0:0 " + "'", str26, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0: 0: " + "'", str28, "0: 0: ");
        org.junit.Assert.assertNotNull(searchFilter31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0" + "'", str37, "0");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0:0 " + "'", str43, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter44);
        org.junit.Assert.assertNotNull(longList45);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(searchFilter56);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "0" + "'", str62, "0");
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "0:0 " + "'", str68, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter69);
        org.junit.Assert.assertNotNull(longList70);
        org.junit.Assert.assertNotNull(longList71);
        org.junit.Assert.assertNotNull(longList72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "0: 0: " + "'", str73, "0: 0: ");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer idFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer();
        java.lang.reflect.Field field2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { ":( OR )", "hi!", "com.clouway.cuse.spi.IndexCreationFailureException: " };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter9 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList10 = idFieldIndexer0.index("com.clouway.cuse.spi.IndexCreationFailureException\\: 0\\:0 ", field2, (java.lang.Object) strList7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: com.clouway.cuse.spi.IndexCreationFailureException\\: 0\\:0 ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(searchFilter9);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.lang.String str7 = searchFilter1.getValue((java.util.List<java.lang.String>) strList5);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter8 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList5);
        java.lang.String[] strArray19 = new java.lang.String[] { "0:( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: ", "com.clouway.cuse.spi.IndexCreationFailureException: ", "0: 0: ", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", ":( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: " };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.lang.String str22 = orSearchFilter8.getValue((java.util.List<java.lang.String>) strList20);
        com.clouway.cuse.spi.LongIdConverter longIdConverter23 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter25 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.lang.String str31 = searchFilter25.getValue((java.util.List<java.lang.String>) strList29);
        java.lang.String[] strArray34 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.lang.String str37 = searchFilter25.getValue((java.util.List<java.lang.String>) strList35);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter38 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList35);
        java.util.List<java.lang.Long> longList39 = longIdConverter23.convert((java.util.List<java.lang.String>) strList35);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter40 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList35);
        java.lang.String str41 = orSearchFilter8.getValue((java.util.List<java.lang.String>) strList35);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter43 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        java.lang.String str49 = searchFilter43.getValue((java.util.List<java.lang.String>) strList47);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter50 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList47);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter52 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray55 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        java.lang.String str58 = searchFilter52.getValue((java.util.List<java.lang.String>) strList56);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter59 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList56);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter60 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList56);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter61 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList56);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter63 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray66 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        java.lang.String str69 = searchFilter63.getValue((java.util.List<java.lang.String>) strList67);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter70 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList67);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter71 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList67);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter72 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList67);
        java.lang.String str73 = orSearchFilter61.getValue((java.util.List<java.lang.String>) strList67);
        java.lang.String str74 = orSearchFilter50.getValue((java.util.List<java.lang.String>) strList67);
        java.lang.String str75 = orSearchFilter8.getValue((java.util.List<java.lang.String>) strList67);
        org.junit.Assert.assertNotNull(searchFilter1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0:( OR ):( OR )" + "'", str22, "0:( OR ):( OR )");
        org.junit.Assert.assertNotNull(searchFilter25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0" + "'", str31, "0");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0:0 " + "'", str37, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter38);
        org.junit.Assert.assertNotNull(longList39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0:( OR )" + "'", str41, "0:( OR )");
        org.junit.Assert.assertNotNull(searchFilter43);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "0" + "'", str49, "0");
        org.junit.Assert.assertNotNull(searchFilter52);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "0" + "'", str58, "0");
        org.junit.Assert.assertNotNull(searchFilter63);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "0" + "'", str69, "0");
        org.junit.Assert.assertNotNull(searchFilter72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + ":( OR )" + "'", str73, ":( OR )");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + ":( OR )" + "'", str74, ":( OR )");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + ":( OR )" + "'", str75, ":( OR )");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy4 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.register((java.lang.Object) "com.clouway.cuse.spi.IndexCreationFailureException: :( OR )", indexingStrategy4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.anyIs("hi!");
        org.junit.Assert.assertNotNull(searchFilter1);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException1 = new com.clouway.cuse.spi.IndexCreationFailureException("0:0 0:0 ");
        java.lang.Throwable[] throwableArray2 = indexCreationFailureException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.is("0:com.clouway.cuse.spi.IndexCreationFailureException:  OR 0:com.clouway.cuse.spi.IndexCreationFailureException: ");
        org.junit.Assert.assertNotNull(searchFilter1);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        com.clouway.cuse.gae.filedindexing.fulltextindex.FullTextSearchFieldIndexer fullTextSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.fulltextindex.FullTextSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException4 = new com.clouway.cuse.spi.IndexCreationFailureException("0:( OR )");
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException6 = new com.clouway.cuse.spi.IndexCreationFailureException("0:0 0:0 ");
        indexCreationFailureException4.addSuppressed((java.lang.Throwable) indexCreationFailureException6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList8 = fullTextSearchFieldIndexer0.index("0:(0:0  OR com.clouway.cuse.spi.IndexCreationFailureException:  OR 0 OR hi! OR com.clouway.cuse.spi.IndexCreationFailureException\\:  OR com.clouway.cuse.spi.IndexCreationFailureException\\: )", field2, (java.lang.Object) indexCreationFailureException6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: 0:(0:0  OR com.clouway.cuse.spi.IndexCreationFailureException:  OR 0 OR hi! OR com.clouway.cuse.spi.IndexCreationFailureException\\:  OR com.clouway.cuse.spi.IndexCreationFailureException\\: )");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter2 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.lang.String str8 = searchFilter2.getValue((java.util.List<java.lang.String>) strList6);
        java.lang.String[] strArray11 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.lang.String str14 = searchFilter2.getValue((java.util.List<java.lang.String>) strList12);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter15 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList12);
        java.util.List<java.lang.Long> longList16 = longIdConverter0.convert((java.util.List<java.lang.String>) strList12);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException18 = new com.clouway.cuse.spi.IndexCreationFailureException(":( OR )");
        java.lang.String str19 = longIdConverter0.convertFrom((java.lang.Object) ":( OR )");
        com.clouway.cuse.spi.LongIdConverter longIdConverter20 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str22 = longIdConverter20.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str24 = longIdConverter20.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter25 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter27 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.lang.String str33 = searchFilter27.getValue((java.util.List<java.lang.String>) strList31);
        java.lang.String[] strArray36 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        java.lang.String str39 = searchFilter27.getValue((java.util.List<java.lang.String>) strList37);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter40 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList37);
        java.util.List<java.lang.Long> longList41 = longIdConverter25.convert((java.util.List<java.lang.String>) strList37);
        java.util.List<java.lang.Long> longList42 = longIdConverter20.convert((java.util.List<java.lang.String>) strList37);
        java.util.List<java.lang.Long> longList43 = longIdConverter0.convert((java.util.List<java.lang.String>) strList37);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter44 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList37);
        org.junit.Assert.assertNotNull(searchFilter2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:0 " + "'", str14, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter15);
        org.junit.Assert.assertNotNull(longList16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(searchFilter27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0" + "'", str33, "0");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "0:0 " + "'", str39, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter40);
        org.junit.Assert.assertNotNull(longList41);
        org.junit.Assert.assertNotNull(longList42);
        org.junit.Assert.assertNotNull(longList43);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        java.lang.String str1 = com.clouway.cuse.spi.EscapeUtil.escape("0:( OR ):(com.clouway.cuse.spi.IndexCreationFailureException\\: )");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0\\:( OR )\\:(com.clouway.cuse.spi.IndexCreationFailureException\\\\: )" + "'", str1, "0\\:( OR )\\:(com.clouway.cuse.spi.IndexCreationFailureException\\\\: )");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder gaeSearchApiMatchedIdObjectFinder0 = new com.clouway.cuse.gae.GaeSearchApiMatchedIdObjectFinder();
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter3 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter5 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.lang.String str11 = searchFilter5.getValue((java.util.List<java.lang.String>) strList9);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter12 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList9);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter13 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList9);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter14 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList9);
        java.lang.String str15 = multiFieldValueFilter3.getValue((java.util.List<java.lang.String>) strList9);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter16 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList9);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter17 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList9);
        com.clouway.cuse.spi.LongIdConverter longIdConverter18 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str20 = longIdConverter18.convertFrom((java.lang.Object) 10.0d);
        com.clouway.cuse.spi.LongIdConverter longIdConverter21 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter23 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.lang.String str29 = searchFilter23.getValue((java.util.List<java.lang.String>) strList27);
        java.lang.String[] strArray32 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.lang.String str35 = searchFilter23.getValue((java.util.List<java.lang.String>) strList33);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter36 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList33);
        java.util.List<java.lang.Long> longList37 = longIdConverter21.convert((java.util.List<java.lang.String>) strList33);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter38 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList33);
        java.util.List<java.lang.Long> longList39 = longIdConverter18.convert((java.util.List<java.lang.String>) strList33);
        java.lang.String str40 = equalitySearchFilter17.getValue((java.util.List<java.lang.String>) strList33);
        com.clouway.cuse.spi.SortOrder sortOrder44 = null;
        com.clouway.cuse.spi.SortType sortType45 = com.clouway.cuse.spi.SortType.NUMERIC;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList46 = gaeSearchApiMatchedIdObjectFinder0.find("0:0 OR 0:0", (java.util.List<java.lang.String>) strList33, (int) (short) 0, (int) (short) 100, "0:(0:0  OR com.clouway.cuse.spi.IndexCreationFailureException:  OR 0 OR hi! OR com.clouway.cuse.spi.IndexCreationFailureException\\:  OR com.clouway.cuse.spi.IndexCreationFailureException\\: )", sortOrder44, sortType45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to parse sort expression '0:(0:0  OR com.clouway.cuse.spi.IndexCreationFailureException:  OR 0 OR hi! OR com.clouway.cuse.spi.IndexCreationFailureException\\:  OR com.clouway.cuse.spi.IndexCreationFailureException\\: )': parse error at line 1 position 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":0 OR :0" + "'", str15, ":0 OR :0");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(searchFilter23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0:0 " + "'", str35, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter36);
        org.junit.Assert.assertNotNull(longList37);
        org.junit.Assert.assertNotNull(longList39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0: 0: " + "'", str40, "0: 0: ");
        org.junit.Assert.assertTrue("'" + sortType45 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType45.equals(com.clouway.cuse.spi.SortType.NUMERIC));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        java.lang.String str1 = com.clouway.cuse.spi.EscapeUtil.escape(":(hi! OR  OR )");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\:(hi! OR  OR )" + "'", str1, "\\:(hi! OR  OR )");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.lang.String str7 = searchFilter1.getValue((java.util.List<java.lang.String>) strList5);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter8 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList5);
        java.lang.String[] strArray19 = new java.lang.String[] { "0:( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: ", "com.clouway.cuse.spi.IndexCreationFailureException: ", "0: 0: ", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", ":( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: " };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.lang.String str22 = orSearchFilter8.getValue((java.util.List<java.lang.String>) strList20);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter24 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.lang.String str30 = searchFilter24.getValue((java.util.List<java.lang.String>) strList28);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter31 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList28);
        java.lang.String[] strArray42 = new java.lang.String[] { "0:( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: ", "com.clouway.cuse.spi.IndexCreationFailureException: ", "0: 0: ", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", ":( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: " };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.lang.String str45 = orSearchFilter31.getValue((java.util.List<java.lang.String>) strList43);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter47 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray50 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        java.lang.String str53 = searchFilter47.getValue((java.util.List<java.lang.String>) strList51);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter54 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList51);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter55 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList51);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter56 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList51);
        java.lang.String str57 = orSearchFilter31.getValue((java.util.List<java.lang.String>) strList51);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter58 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList51);
        java.lang.String str59 = orSearchFilter8.getValue((java.util.List<java.lang.String>) strList51);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter61 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray64 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        java.lang.String str67 = searchFilter61.getValue((java.util.List<java.lang.String>) strList65);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter68 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList65);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter69 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList65);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter70 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList65);
        java.lang.String str71 = orSearchFilter8.getValue((java.util.List<java.lang.String>) strList65);
        org.junit.Assert.assertNotNull(searchFilter1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0:( OR ):( OR )" + "'", str22, "0:( OR ):( OR )");
        org.junit.Assert.assertNotNull(searchFilter24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "0:( OR ):( OR )" + "'", str45, "0:( OR ):( OR )");
        org.junit.Assert.assertNotNull(searchFilter47);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "0" + "'", str53, "0");
        org.junit.Assert.assertNotNull(searchFilter56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + ":( OR )" + "'", str57, ":( OR )");
        org.junit.Assert.assertNotNull(searchFilter58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + ":( OR )" + "'", str59, ":( OR )");
        org.junit.Assert.assertNotNull(searchFilter61);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "0" + "'", str67, "0");
        org.junit.Assert.assertNotNull(searchFilter70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + ":( OR )" + "'", str71, ":( OR )");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        com.clouway.cuse.gae.NoFieldOfASpecifiedNameException noFieldOfASpecifiedNameException0 = new com.clouway.cuse.gae.NoFieldOfASpecifiedNameException();
        java.lang.Throwable[] throwableArray1 = noFieldOfASpecifiedNameException0.getSuppressed();
        com.clouway.cuse.spi.EmptySearchFilterException emptySearchFilterException2 = new com.clouway.cuse.spi.EmptySearchFilterException();
        java.lang.Throwable[] throwableArray3 = emptySearchFilterException2.getSuppressed();
        noFieldOfASpecifiedNameException0.addSuppressed((java.lang.Throwable) emptySearchFilterException2);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException6 = new com.clouway.cuse.spi.IndexCreationFailureException("");
        com.clouway.cuse.spi.NotConfiguredIndexingStrategyException notConfiguredIndexingStrategyException7 = new com.clouway.cuse.spi.NotConfiguredIndexingStrategyException();
        indexCreationFailureException6.addSuppressed((java.lang.Throwable) notConfiguredIndexingStrategyException7);
        emptySearchFilterException2.addSuppressed((java.lang.Throwable) indexCreationFailureException6);
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter4 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("hi!");
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy5 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.register((java.lang.Object) "hi!", indexingStrategy5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        com.clouway.cuse.spi.IndexWriter indexWriter0 = new com.clouway.cuse.spi.IndexWriter();
        java.lang.String[] strArray7 = new java.lang.String[] { "com.clouway.cuse.spi.IndexCreationFailureException: ", "com.clouway.cuse.spi.IndexCreationFailureException\\: ", "0", "0: 0: ", "", ":0 OR :0" };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter8 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray7);
        java.util.Set<java.lang.String> strSet9 = indexWriter0.createIndex(strArray7);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter10 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str2 = longIdConverter0.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str4 = longIdConverter0.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter5 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter7 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.lang.String str13 = searchFilter7.getValue((java.util.List<java.lang.String>) strList11);
        java.lang.String[] strArray16 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.lang.String str19 = searchFilter7.getValue((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter20 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList17);
        java.util.List<java.lang.Long> longList21 = longIdConverter5.convert((java.util.List<java.lang.String>) strList17);
        java.util.List<java.lang.Long> longList22 = longIdConverter0.convert((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException24 = new com.clouway.cuse.spi.IndexCreationFailureException("0:( OR )");
        java.lang.String str25 = longIdConverter0.convertFrom((java.lang.Object) indexCreationFailureException24);
        java.lang.Throwable[] throwableArray26 = indexCreationFailureException24.getSuppressed();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(searchFilter7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0:0 " + "'", str19, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter20);
        org.junit.Assert.assertNotNull(longList21);
        org.junit.Assert.assertNotNull(longList22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(throwableArray26);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog0 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException1 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass2 = searchIndexMissmatchException1.getClass();
        com.clouway.cuse.spi.LongIdConverter longIdConverter3 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str5 = longIdConverter3.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str7 = longIdConverter3.convertFrom((java.lang.Object) 100.0f);
        defaultIdConverterCatalog0.addIdConverter((java.lang.Class) wildcardClass2, (com.clouway.cuse.spi.IdConverter) longIdConverter3);
        com.clouway.cuse.spi.EntityLoader entityLoader9 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog10 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException11 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass12 = searchIndexMissmatchException11.getClass();
        com.clouway.cuse.spi.IdConverter idConverter13 = defaultIdConverterCatalog10.getConverter((java.lang.Class) wildcardClass12);
        com.clouway.cuse.spi.SearchEngine searchEngine14 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader9, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog10);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter16 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.lang.String str22 = searchFilter16.getValue((java.util.List<java.lang.String>) strList20);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter23 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList20);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter25 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.lang.String str31 = searchFilter25.getValue((java.util.List<java.lang.String>) strList29);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter32 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList29);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter33 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList29);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter34 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList29);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter36 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.lang.String str42 = searchFilter36.getValue((java.util.List<java.lang.String>) strList40);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter43 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList40);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter44 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList40);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter45 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList40);
        java.lang.String str46 = orSearchFilter34.getValue((java.util.List<java.lang.String>) strList40);
        java.lang.String str47 = orSearchFilter23.getValue((java.util.List<java.lang.String>) strList40);
        java.lang.Class<?> wildcardClass48 = orSearchFilter23.getClass();
        com.clouway.cuse.spi.IdConverter idConverter49 = defaultIdConverterCatalog10.getConverter((java.lang.Class) wildcardClass48);
        com.clouway.cuse.spi.IdConverter idConverter50 = defaultIdConverterCatalog0.getConverter((java.lang.Class) wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(idConverter13);
        org.junit.Assert.assertNotNull(searchEngine14);
        org.junit.Assert.assertNotNull(searchFilter16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertNotNull(searchFilter25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0" + "'", str31, "0");
        org.junit.Assert.assertNotNull(searchFilter36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0" + "'", str42, "0");
        org.junit.Assert.assertNotNull(searchFilter45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + ":( OR )" + "'", str46, ":( OR )");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + ":( OR )" + "'", str47, ":( OR )");
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNull(idConverter49);
        org.junit.Assert.assertNull(idConverter50);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy4 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.register((java.lang.Object) 0L, indexingStrategy4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        com.clouway.cuse.spi.LongIdConverter longIdConverter0 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str2 = longIdConverter0.convertFrom((java.lang.Object) 10.0d);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        com.clouway.cuse.spi.filters.SearchFilter searchFilter7 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray6);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter8 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray6);
        java.lang.String str9 = longIdConverter0.convertFrom((java.lang.Object) strArray6);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter10 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf(strArray6);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter12 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.lang.String str18 = searchFilter12.getValue((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter19 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter20 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList16);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter22 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.lang.String str28 = searchFilter22.getValue((java.util.List<java.lang.String>) strList26);
        java.lang.String[] strArray31 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.lang.String str34 = searchFilter22.getValue((java.util.List<java.lang.String>) strList32);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter35 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList32);
        java.lang.String str36 = equalitySearchFilter20.getValue((java.util.List<java.lang.String>) strList32);
        com.clouway.cuse.spi.LongIdConverter longIdConverter37 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter39 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.lang.String str45 = searchFilter39.getValue((java.util.List<java.lang.String>) strList43);
        java.lang.String[] strArray48 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        java.lang.String str51 = searchFilter39.getValue((java.util.List<java.lang.String>) strList49);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter52 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList49);
        java.util.List<java.lang.Long> longList53 = longIdConverter37.convert((java.util.List<java.lang.String>) strList49);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException55 = new com.clouway.cuse.spi.IndexCreationFailureException(":( OR )");
        java.lang.String str56 = longIdConverter37.convertFrom((java.lang.Object) ":( OR )");
        com.clouway.cuse.spi.LongIdConverter longIdConverter57 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str59 = longIdConverter57.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str61 = longIdConverter57.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter62 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter64 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray67 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        java.lang.String str70 = searchFilter64.getValue((java.util.List<java.lang.String>) strList68);
        java.lang.String[] strArray73 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        java.lang.String str76 = searchFilter64.getValue((java.util.List<java.lang.String>) strList74);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter77 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList74);
        java.util.List<java.lang.Long> longList78 = longIdConverter62.convert((java.util.List<java.lang.String>) strList74);
        java.util.List<java.lang.Long> longList79 = longIdConverter57.convert((java.util.List<java.lang.String>) strList74);
        java.util.List<java.lang.Long> longList80 = longIdConverter37.convert((java.util.List<java.lang.String>) strList74);
        java.lang.String str81 = equalitySearchFilter20.getValue((java.util.List<java.lang.String>) strList74);
        java.lang.String str82 = searchFilter10.getValue((java.util.List<java.lang.String>) strList74);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(searchFilter7);
        org.junit.Assert.assertNotNull(searchFilter8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(searchFilter10);
        org.junit.Assert.assertNotNull(searchFilter12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
        org.junit.Assert.assertNotNull(searchFilter22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0" + "'", str28, "0");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0:0 " + "'", str34, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0: 0: " + "'", str36, "0: 0: ");
        org.junit.Assert.assertNotNull(searchFilter39);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "0" + "'", str45, "0");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "0:0 " + "'", str51, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter52);
        org.junit.Assert.assertNotNull(longList53);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(searchFilter64);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "0" + "'", str70, "0");
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "0:0 " + "'", str76, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter77);
        org.junit.Assert.assertNotNull(longList78);
        org.junit.Assert.assertNotNull(longList79);
        org.junit.Assert.assertNotNull(longList80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "0: 0: " + "'", str81, "0: 0: ");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "0:(hi! OR  OR )" + "'", str82, "0:(hi! OR  OR )");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter1 = new com.clouway.cuse.gae.filters.EqualitySearchFilter("hi!");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        com.clouway.cuse.gae.filedindexing.searchindex.SimpleSearchFieldIndexer simpleSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.searchindex.SimpleSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        java.lang.String[] strArray22 = new java.lang.String[] { "0:( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: ", "com.clouway.cuse.spi.IndexCreationFailureException: ", "0: 0: ", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", ":( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: " };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.lang.String str25 = orSearchFilter11.getValue((java.util.List<java.lang.String>) strList23);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter26 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList27 = simpleSearchFieldIndexer0.index("hi!", field2, (java.lang.Object) strList23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0:( OR ):( OR )" + "'", str25, "0:( OR ):( OR )");
        org.junit.Assert.assertNotNull(searchFilter26);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.lang.String str7 = searchFilter1.getValue((java.util.List<java.lang.String>) strList5);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter8 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList5);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter9 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList5);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter11 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.lang.String str17 = searchFilter11.getValue((java.util.List<java.lang.String>) strList15);
        java.lang.String[] strArray20 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.lang.String str23 = searchFilter11.getValue((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter24 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList21);
        java.lang.String str25 = equalitySearchFilter9.getValue((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter26 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList21);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter28 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.lang.String str34 = searchFilter28.getValue((java.util.List<java.lang.String>) strList32);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter35 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList32);
        java.lang.String[] strArray46 = new java.lang.String[] { "0:( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: ", "com.clouway.cuse.spi.IndexCreationFailureException: ", "0: 0: ", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", ":( OR )", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "com.clouway.cuse.spi.NotConfiguredIndexingStrategyException", "0: 0: " };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        java.lang.String str49 = orSearchFilter35.getValue((java.util.List<java.lang.String>) strList47);
        com.clouway.cuse.spi.LongIdConverter longIdConverter50 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter52 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray55 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        java.lang.String str58 = searchFilter52.getValue((java.util.List<java.lang.String>) strList56);
        java.lang.String[] strArray61 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        java.lang.String str64 = searchFilter52.getValue((java.util.List<java.lang.String>) strList62);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter65 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList62);
        java.util.List<java.lang.Long> longList66 = longIdConverter50.convert((java.util.List<java.lang.String>) strList62);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter67 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList62);
        java.lang.String str68 = orSearchFilter35.getValue((java.util.List<java.lang.String>) strList62);
        java.lang.String str69 = equalitySearchFilter26.getValue((java.util.List<java.lang.String>) strList62);
        java.lang.String[] strArray73 = new java.lang.String[] { ":( OR )", "hi!", "com.clouway.cuse.spi.IndexCreationFailureException: " };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter76 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList74);
        java.lang.String str77 = equalitySearchFilter26.getValue((java.util.List<java.lang.String>) strList74);
        org.junit.Assert.assertNotNull(searchFilter1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(searchFilter11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0:0 " + "'", str23, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0: 0: " + "'", str25, "0: 0: ");
        org.junit.Assert.assertNotNull(searchFilter28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0" + "'", str34, "0");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "0:( OR ):( OR )" + "'", str49, "0:( OR ):( OR )");
        org.junit.Assert.assertNotNull(searchFilter52);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "0" + "'", str58, "0");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "0:0 " + "'", str64, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter65);
        org.junit.Assert.assertNotNull(longList66);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "0:( OR )" + "'", str68, "0:( OR )");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "0:0 0:0 " + "'", str69, "0:0 0:0 ");
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(searchFilter76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + ":( OR ):0 :( OR ):0 " + "'", str77, ":( OR ):0 :( OR ):0 ");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter4 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("hi!");
        com.clouway.cuse.spi.LongIdConverter longIdConverter5 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter7 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.lang.String str13 = searchFilter7.getValue((java.util.List<java.lang.String>) strList11);
        java.lang.String[] strArray16 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.lang.String str19 = searchFilter7.getValue((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter20 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList17);
        java.util.List<java.lang.Long> longList21 = longIdConverter5.convert((java.util.List<java.lang.String>) strList17);
        java.lang.String str22 = multiFieldValueFilter4.getValue((java.util.List<java.lang.String>) strList17);
        com.clouway.cuse.gae.filters.MultiFieldValueFilter multiFieldValueFilter24 = new com.clouway.cuse.gae.filters.MultiFieldValueFilter("0");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter26 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.lang.String str32 = searchFilter26.getValue((java.util.List<java.lang.String>) strList30);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter33 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList30);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter34 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList30);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter35 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList30);
        java.lang.String str36 = multiFieldValueFilter24.getValue((java.util.List<java.lang.String>) strList30);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter38 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.lang.String str44 = searchFilter38.getValue((java.util.List<java.lang.String>) strList42);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter45 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList42);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter46 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList42);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter48 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.lang.String str54 = searchFilter48.getValue((java.util.List<java.lang.String>) strList52);
        java.lang.String[] strArray57 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        java.lang.String str60 = searchFilter48.getValue((java.util.List<java.lang.String>) strList58);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter61 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList58);
        java.lang.String str62 = equalitySearchFilter46.getValue((java.util.List<java.lang.String>) strList58);
        java.lang.String str63 = multiFieldValueFilter24.getValue((java.util.List<java.lang.String>) strList58);
        java.lang.String str64 = multiFieldValueFilter4.getValue((java.util.List<java.lang.String>) strList58);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy65 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.register((java.lang.Object) strList58, indexingStrategy65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0:0 " + "'", str19, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter20);
        org.junit.Assert.assertNotNull(longList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0:hi! OR 0:hi!" + "'", str22, "0:hi! OR 0:hi!");
        org.junit.Assert.assertNotNull(searchFilter26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0" + "'", str32, "0");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ":0 OR :0" + "'", str36, ":0 OR :0");
        org.junit.Assert.assertNotNull(searchFilter38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "0" + "'", str44, "0");
        org.junit.Assert.assertNotNull(searchFilter48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "0" + "'", str54, "0");
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "0:0 " + "'", str60, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "0: 0: " + "'", str62, "0: 0: ");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "0:0 OR 0:0" + "'", str63, "0:0 OR 0:0");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "0:hi! OR 0:hi!" + "'", str64, "0:hi! OR 0:hi!");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter1 = new com.clouway.cuse.gae.filters.EqualitySearchFilter("com.clouway.cuse.spi.IndexCreationFailureException\\: 0\\:0 ");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        java.util.Map<com.clouway.cuse.gae.filedindexing.FieldCriteria, com.clouway.cuse.gae.filedindexing.FieldIndexer> fieldCriteriaMap0 = null;
        com.google.inject.Provider<com.google.appengine.api.search.SearchService> searchServiceProvider1 = null;
        com.clouway.cuse.gae.GaeIndexRegistry gaeIndexRegistry2 = new com.clouway.cuse.gae.GaeIndexRegistry(fieldCriteriaMap0, searchServiceProvider1);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter4 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = searchFilter4.getValue((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter11 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter12 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList8);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter14 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.lang.String str20 = searchFilter14.getValue((java.util.List<java.lang.String>) strList18);
        java.lang.String[] strArray23 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.lang.String str26 = searchFilter14.getValue((java.util.List<java.lang.String>) strList24);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter27 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList24);
        java.lang.String str28 = equalitySearchFilter12.getValue((java.util.List<java.lang.String>) strList24);
        com.clouway.cuse.spi.LongIdConverter longIdConverter29 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter31 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.lang.String str37 = searchFilter31.getValue((java.util.List<java.lang.String>) strList35);
        java.lang.String[] strArray40 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.lang.String str43 = searchFilter31.getValue((java.util.List<java.lang.String>) strList41);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter44 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList41);
        java.util.List<java.lang.Long> longList45 = longIdConverter29.convert((java.util.List<java.lang.String>) strList41);
        com.clouway.cuse.spi.IndexCreationFailureException indexCreationFailureException47 = new com.clouway.cuse.spi.IndexCreationFailureException(":( OR )");
        java.lang.String str48 = longIdConverter29.convertFrom((java.lang.Object) ":( OR )");
        com.clouway.cuse.spi.LongIdConverter longIdConverter49 = new com.clouway.cuse.spi.LongIdConverter();
        java.lang.String str51 = longIdConverter49.convertFrom((java.lang.Object) (short) 100);
        java.lang.String str53 = longIdConverter49.convertFrom((java.lang.Object) 100.0f);
        com.clouway.cuse.spi.LongIdConverter longIdConverter54 = new com.clouway.cuse.spi.LongIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter56 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray59 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        java.lang.String str62 = searchFilter56.getValue((java.util.List<java.lang.String>) strList60);
        java.lang.String[] strArray65 = new java.lang.String[] { "0", "0" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        java.lang.String str68 = searchFilter56.getValue((java.util.List<java.lang.String>) strList66);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter69 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList66);
        java.util.List<java.lang.Long> longList70 = longIdConverter54.convert((java.util.List<java.lang.String>) strList66);
        java.util.List<java.lang.Long> longList71 = longIdConverter49.convert((java.util.List<java.lang.String>) strList66);
        java.util.List<java.lang.Long> longList72 = longIdConverter29.convert((java.util.List<java.lang.String>) strList66);
        java.lang.String str73 = equalitySearchFilter12.getValue((java.util.List<java.lang.String>) strList66);
        com.clouway.cuse.spi.IndexingStrategy indexingStrategy74 = null;
        // The following exception was thrown during execution in test generation
        try {
            gaeIndexRegistry2.registerAll((java.util.List<java.lang.String>) strList66, indexingStrategy74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchFilter4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(searchFilter14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0:0 " + "'", str26, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0: 0: " + "'", str28, "0: 0: ");
        org.junit.Assert.assertNotNull(searchFilter31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0" + "'", str37, "0");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0:0 " + "'", str43, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter44);
        org.junit.Assert.assertNotNull(longList45);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(searchFilter56);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "0" + "'", str62, "0");
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "0:0 " + "'", str68, "0:0 ");
        org.junit.Assert.assertNotNull(searchFilter69);
        org.junit.Assert.assertNotNull(longList70);
        org.junit.Assert.assertNotNull(longList71);
        org.junit.Assert.assertNotNull(longList72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "0: 0: " + "'", str73, "0: 0: ");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        com.clouway.cuse.spi.filters.SearchFilter searchFilter1 = com.clouway.cuse.gae.filters.SearchFilters.anyIs("0:( OR ):(com.clouway.cuse.spi.IndexCreationFailureException\\: )");
        org.junit.Assert.assertNotNull(searchFilter1);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer idFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.idindexer.IdFieldIndexer();
        java.lang.reflect.Field field2 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = idFieldIndexer0.index("0\\\\:hi! OR 0\\\\:hi!", field2, obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: 0\\\\:hi! OR 0\\\\:hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.EntityLoader entityLoader1 = null;
        com.clouway.cuse.spi.EntityLoader entityLoader2 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog3 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException4 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass5 = searchIndexMissmatchException4.getClass();
        com.clouway.cuse.spi.IdConverter idConverter6 = defaultIdConverterCatalog3.getConverter((java.lang.Class) wildcardClass5);
        com.clouway.cuse.spi.SearchEngine searchEngine7 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader2, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog3);
        com.clouway.cuse.spi.SearchEngine searchEngine8 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader1, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog3);
        com.clouway.cuse.spi.EntityLoader entityLoader9 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog10 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException11 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass12 = searchIndexMissmatchException11.getClass();
        com.clouway.cuse.spi.IdConverter idConverter13 = defaultIdConverterCatalog10.getConverter((java.lang.Class) wildcardClass12);
        com.clouway.cuse.spi.SearchEngine searchEngine14 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader9, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog10);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter16 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.lang.String str22 = searchFilter16.getValue((java.util.List<java.lang.String>) strList20);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter23 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList20);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter25 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.lang.String str31 = searchFilter25.getValue((java.util.List<java.lang.String>) strList29);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter32 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList29);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter33 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList29);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter34 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList29);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter36 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.lang.String str42 = searchFilter36.getValue((java.util.List<java.lang.String>) strList40);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter43 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList40);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter44 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList40);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter45 = com.clouway.cuse.gae.filters.SearchFilters.isAnyOf((java.util.List<java.lang.String>) strList40);
        java.lang.String str46 = orSearchFilter34.getValue((java.util.List<java.lang.String>) strList40);
        java.lang.String str47 = orSearchFilter23.getValue((java.util.List<java.lang.String>) strList40);
        java.lang.Class<?> wildcardClass48 = orSearchFilter23.getClass();
        com.clouway.cuse.spi.IdConverter idConverter49 = defaultIdConverterCatalog10.getConverter((java.lang.Class) wildcardClass48);
        com.clouway.cuse.spi.IdConverter idConverter50 = defaultIdConverterCatalog3.getConverter((java.lang.Class) wildcardClass48);
        com.clouway.cuse.spi.SearchEngine searchEngine51 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(idConverter6);
        org.junit.Assert.assertNotNull(searchEngine7);
        org.junit.Assert.assertNotNull(searchEngine8);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(idConverter13);
        org.junit.Assert.assertNotNull(searchEngine14);
        org.junit.Assert.assertNotNull(searchFilter16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertNotNull(searchFilter25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0" + "'", str31, "0");
        org.junit.Assert.assertNotNull(searchFilter36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0" + "'", str42, "0");
        org.junit.Assert.assertNotNull(searchFilter45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + ":( OR )" + "'", str46, ":( OR )");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + ":( OR )" + "'", str47, ":( OR )");
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNull(idConverter49);
        org.junit.Assert.assertNull(idConverter50);
        org.junit.Assert.assertNotNull(searchEngine51);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        com.clouway.cuse.gae.filedindexing.searchindex.SimpleSearchFieldIndexer simpleSearchFieldIndexer0 = new com.clouway.cuse.gae.filedindexing.searchindex.SimpleSearchFieldIndexer();
        java.lang.reflect.Field field2 = null;
        com.clouway.cuse.spi.EscapeUtil escapeUtil3 = new com.clouway.cuse.spi.EscapeUtil();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.appengine.api.search.Field> fieldList4 = simpleSearchFieldIndexer0.index("hi!", field2, (java.lang.Object) escapeUtil3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field name should match pattern ^[A-Za-z][A-Za-z0-9_]*$: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        com.clouway.cuse.spi.EntityLoader entityLoader0 = null;
        com.clouway.cuse.spi.DefaultIdConverterCatalog defaultIdConverterCatalog1 = new com.clouway.cuse.spi.DefaultIdConverterCatalog();
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException2 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass3 = searchIndexMissmatchException2.getClass();
        com.clouway.cuse.spi.IdConverter idConverter4 = defaultIdConverterCatalog1.getConverter((java.lang.Class) wildcardClass3);
        com.clouway.cuse.spi.SearchEngine searchEngine5 = com.clouway.cuse.spi.SearchEngineFactory.create(entityLoader0, (com.clouway.cuse.spi.IdConverterCatalog) defaultIdConverterCatalog1);
        com.clouway.cuse.spi.SortType sortType6 = com.clouway.cuse.spi.SortType.NUMERIC;
        java.lang.Class<?> wildcardClass7 = sortType6.getClass();
        com.clouway.cuse.spi.IdConverter idConverter8 = defaultIdConverterCatalog1.getConverter((java.lang.Class) wildcardClass7);
        java.lang.Class class9 = null;
        com.clouway.cuse.spi.IdConverter idConverter10 = defaultIdConverterCatalog1.getConverter(class9);
        com.clouway.cuse.spi.SearchIndexMissmatchException searchIndexMissmatchException11 = new com.clouway.cuse.spi.SearchIndexMissmatchException();
        java.lang.Class<?> wildcardClass12 = searchIndexMissmatchException11.getClass();
        com.clouway.cuse.spi.StringIdConverter stringIdConverter13 = new com.clouway.cuse.spi.StringIdConverter();
        com.clouway.cuse.spi.filters.SearchFilter searchFilter15 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 100);
        java.lang.String str16 = stringIdConverter13.convertFrom((java.lang.Object) 100);
        defaultIdConverterCatalog1.addIdConverter((java.lang.Class) wildcardClass12, (com.clouway.cuse.spi.IdConverter) stringIdConverter13);
        com.clouway.cuse.spi.filters.SearchFilter searchFilter19 = com.clouway.cuse.gae.filters.SearchFilters.is((java.lang.Integer) 0);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.lang.String str25 = searchFilter19.getValue((java.util.List<java.lang.String>) strList23);
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter26 = new com.clouway.cuse.gae.filters.OrSearchFilter((java.util.List<java.lang.String>) strList23);
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter27 = new com.clouway.cuse.gae.filters.EqualitySearchFilter((java.util.List<java.lang.String>) strList23);
        java.util.List<java.lang.String> strList28 = stringIdConverter13.convert((java.util.List<java.lang.String>) strList23);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(idConverter4);
        org.junit.Assert.assertNotNull(searchEngine5);
        org.junit.Assert.assertTrue("'" + sortType6 + "' != '" + com.clouway.cuse.spi.SortType.NUMERIC + "'", sortType6.equals(com.clouway.cuse.spi.SortType.NUMERIC));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(idConverter8);
        org.junit.Assert.assertNull(idConverter10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(searchFilter15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(searchFilter19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0" + "'", str25, "0");
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        com.clouway.cuse.gae.filters.EqualitySearchFilter equalitySearchFilter1 = new com.clouway.cuse.gae.filters.EqualitySearchFilter("com.clouway.cuse.spi.IndexCreationFailureException: 0:0 ");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        java.lang.String[] strArray2 = new java.lang.String[] { "com.clouway.cuse.spi.IndexCreationFailureException: 0:0 ", ":0 OR :0" };
        com.clouway.cuse.gae.filters.OrSearchFilter orSearchFilter3 = new com.clouway.cuse.gae.filters.OrSearchFilter(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
    }
}

