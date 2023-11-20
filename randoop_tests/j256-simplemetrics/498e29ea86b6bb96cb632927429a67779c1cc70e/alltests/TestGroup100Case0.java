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
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplemetrics.metric.ControlledMetricTimer controlledMetricTimer4 = new com.j256.simplemetrics.metric.ControlledMetricTimer("", "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name cannot be an empty or blank string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "", "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name cannot be an empty or blank string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        com.j256.simplemetrics.metric.ControlledMetric.AggregationType aggregationType0 = com.j256.simplemetrics.metric.ControlledMetric.AggregationType.AVERAGE;
        org.junit.Assert.assertTrue("'" + aggregationType0 + "' != '" + com.j256.simplemetrics.metric.ControlledMetric.AggregationType.AVERAGE + "'", aggregationType0.equals(com.j256.simplemetrics.metric.ControlledMetric.AggregationType.AVERAGE));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.lang.String str1 = com.j256.simplemetrics.utils.MiscUtils.capitalize("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = null;
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx1 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx(textFileMetricsPersister0);
        java.lang.String str2 = textFileMetricsPersisterJmx1.getJmxBeanName();
        // The following exception was thrown during execution in test generation
        try {
            long long3 = textFileMetricsPersisterJmx1.getDumpLogCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.j256.simplemetrics.utils.FileMetric.FileMetricOperation fileMetricOperation0 = com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.SUBTRACT;
        org.junit.Assert.assertTrue("'" + fileMetricOperation0 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.SUBTRACT + "'", fileMetricOperation0.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.SUBTRACT));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio5 = new com.j256.simplemetrics.metric.ControlledMetricRatio("hi!", "hi!", "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name cannot be an empty or blank string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = null;
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx1 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx(textFileMetricsPersister0);
        java.lang.String str2 = textFileMetricsPersisterJmx1.getJmxBeanName();
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister3 = null;
        textFileMetricsPersisterJmx1.setMetricsPersister(textFileMetricsPersister3);
        // The following exception was thrown during execution in test generation
        try {
            textFileMetricsPersisterJmx1.setShowDescription(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.lang.String str0 = com.j256.simplemetrics.persister.TextFileMetricsPersister.DEFAULT_SEPARATING_STRING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "=" + "'", str0, "=");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        boolean boolean1 = com.j256.simplemetrics.utils.MiscUtils.isBlank((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.j256.simplemetrics.utils.MiscUtils miscUtils0 = new com.j256.simplemetrics.utils.MiscUtils();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = null;
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx1 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx(textFileMetricsPersister0);
        java.lang.Class<?> wildcardClass2 = textFileMetricsPersisterJmx1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.io.Closeable closeable0 = null;
        com.j256.simplemetrics.utils.MiscUtils.closeQuietly(closeable0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        com.j256.simplemetrics.manager.MetricsManager metricsManager0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplemetrics.utils.SystemMetricsPublisher systemMetricsPublisher1 = new com.j256.simplemetrics.utils.SystemMetricsPublisher(metricsManager0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        com.j256.simplemetrics.persister.SystemOutMetricsPersister systemOutMetricsPersister0 = new com.j256.simplemetrics.persister.SystemOutMetricsPersister();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = null;
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx1 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx(textFileMetricsPersister0);
        // The following exception was thrown during execution in test generation
        try {
            textFileMetricsPersisterJmx1.setAppendSysTimeMillis(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.io.File file4 = null;
        com.j256.simplemetrics.utils.FileMetric.FileMetricKind fileMetricKind5 = com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR;
        com.j256.simplemetrics.utils.FileMetric fileMetric9 = new com.j256.simplemetrics.utils.FileMetric("=", "", "", "", file4, fileMetricKind5, (int) 'a', "=", "com.j256");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = fileMetric9.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + fileMetricKind5 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR + "'", fileMetricKind5.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = null;
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx1 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx(textFileMetricsPersister0);
        java.lang.String str2 = textFileMetricsPersisterJmx1.getJmxBeanName();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray3 = textFileMetricsPersisterJmx1.getJmxFolderNames();
        textFileMetricsPersisterJmx1.setJmxDomainName("hi!");
        textFileMetricsPersisterJmx1.setJmxDomainName("com.j256");
        // The following exception was thrown during execution in test generation
        try {
            long long8 = textFileMetricsPersisterJmx1.getCleanupLogCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jmxFolderNameArray3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        boolean boolean1 = com.j256.simplemetrics.utils.MiscUtils.isBlank((java.lang.CharSequence) "=");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.j256.simplemetrics.utils.FileMetric.FileMetricKind fileMetricKind0 = com.j256.simplemetrics.utils.FileMetric.FileMetricKind.FILE_VALUE;
        org.junit.Assert.assertTrue("'" + fileMetricKind0 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricKind.FILE_VALUE + "'", fileMetricKind0.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricKind.FILE_VALUE));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue0 = com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue.createInitialValue();
        java.lang.Number number1 = accumValue0.getMin();
        int int2 = accumValue0.getNumSamples();
        org.junit.Assert.assertNotNull(accumValue0);
        org.junit.Assert.assertEquals("'" + number1 + "' != '" + 0L + "'", number1, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("com.j256", "=", "=", "", "com.j256");
        java.lang.String str6 = controlledMetricValue5.getName();
        java.lang.String str7 = controlledMetricValue5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = null;
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx1 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx(textFileMetricsPersister0);
        java.lang.String str2 = textFileMetricsPersisterJmx1.getJmxBeanName();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray3 = textFileMetricsPersisterJmx1.getJmxFolderNames();
        textFileMetricsPersisterJmx1.setJmxDomainName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = textFileMetricsPersisterJmx1.isShowDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jmxFolderNameArray3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue0 = com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue.createInitialValue();
        java.lang.Number number1 = accumValue0.getMin();
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue2 = accumValue0.makePersisted();
        java.lang.Number number3 = accumValue2.getValue();
        org.junit.Assert.assertNotNull(accumValue0);
        org.junit.Assert.assertEquals("'" + number1 + "' != '" + 0L + "'", number1, 0L);
        org.junit.Assert.assertNotNull(accumValue2);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0L + "'", number3, 0L);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplemetrics.metric.ControlledMetricTimer controlledMetricTimer4 = new com.j256.simplemetrics.metric.ControlledMetricTimer("hi!", "com.j256.=.=", "", "com.j256");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name cannot be an empty or blank string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.j256.simplemetrics.persister.CloudWatchMetricsPersister cloudWatchMetricsPersister3 = new com.j256.simplemetrics.persister.CloudWatchMetricsPersister(aWSCredentials0, "com.j256", true);
        com.amazonaws.services.cloudwatch.AmazonCloudWatch amazonCloudWatch4 = null;
        cloudWatchMetricsPersister3.setCloudWatchClient(amazonCloudWatch4);
        cloudWatchMetricsPersister3.initialize();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails6 = controlledMetricValue5.getValueDetails();
        java.lang.Number number7 = metricValueDetails6.getMin();
        java.lang.String str8 = metricValueDetails6.toString();
        org.junit.Assert.assertNotNull(metricValueDetails6);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0.0d + "'", number7, 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MetricValueDetails [value=0, numSamples=0, min=0.0, max=0.0]" + "'", str8, "MetricValueDetails [value=0, numSamples=0, min=0.0, max=0.0]");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = null;
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx1 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx(textFileMetricsPersister0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = textFileMetricsPersisterJmx1.getLastDumpTimeMillisString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = new com.j256.simplemetrics.persister.TextFileMetricsPersister();
        textFileMetricsPersister0.setSeparatingString("=");
        textFileMetricsPersister0.setLogFileNamePrefix("=");
        boolean boolean5 = textFileMetricsPersister0.isShowDescription();
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            textFileMetricsPersister0.setOutputDirectory(file6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.j256.simplemetrics.utils.FileMetricsPublisherJmx fileMetricsPublisherJmx0 = new com.j256.simplemetrics.utils.FileMetricsPublisherJmx();
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher1 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.utils.FileMetric[] fileMetricArray2 = new com.j256.simplemetrics.utils.FileMetric[] {};
        fileMetricsPublisher1.setFileMetrics(fileMetricArray2);
        java.lang.String[] strArray4 = fileMetricsPublisher1.getMetricsValues();
        fileMetricsPublisherJmx0.setJmxFolderNames(strArray4);
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray6 = fileMetricsPublisherJmx0.getJmxFolderNames();
        org.junit.Assert.assertNotNull(fileMetricArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(jmxFolderNameArray6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.j256.simplemetrics.utils.FileMetric.FileMetricOperation fileMetricOperation0 = com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.DIVIDE;
        org.junit.Assert.assertTrue("'" + fileMetricOperation0 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.DIVIDE + "'", fileMetricOperation0.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.DIVIDE));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = null;
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx1 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx(textFileMetricsPersister0);
        java.lang.String str2 = textFileMetricsPersisterJmx1.getJmxBeanName();
        // The following exception was thrown during execution in test generation
        try {
            long long3 = textFileMetricsPersisterJmx1.getCleanupLogCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        controlledMetricAccum5.adjustValue((long) ' ');
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum13 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        java.lang.String str14 = controlledMetricAccum13.getUnit();
        boolean boolean15 = controlledMetricAccum5.equals((java.lang.Object) controlledMetricAccum13);
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails16 = controlledMetricAccum13.getValueDetailsToPersist();
        controlledMetricAccum13.adjustValue((java.lang.Number) (byte) 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.j256" + "'", str14, "com.j256");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(metricValueDetails16);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails6 = controlledMetricValue5.getValueDetails();
        java.lang.Number number7 = controlledMetricValue5.getValue();
        java.lang.String str8 = controlledMetricValue5.getName();
        java.lang.Number number9 = controlledMetricValue5.getValue();
        org.junit.Assert.assertNotNull(metricValueDetails6);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0.0d + "'", number7, 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.j256" + "'", str8, "com.j256");
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 0.0d + "'", number9, 0.0d);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue0 = com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue.createInitialValue();
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue2 = accumValue0.makeAdjusted((java.lang.Long) 0L);
        int int3 = accumValue2.getNumSamples();
        java.lang.Number number4 = accumValue2.getMin();
        org.junit.Assert.assertNotNull(accumValue0);
        org.junit.Assert.assertNotNull(accumValue2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0L + "'", number4, 0L);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        java.lang.String str6 = controlledMetricAccum5.getUnit();
        java.lang.String str7 = controlledMetricAccum5.getAggregationTypeName();
        controlledMetricAccum5.adjustValue((java.lang.Number) (-1.0f));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.j256" + "'", str6, "com.j256");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUM" + "'", str7, "SUM");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = null;
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx1 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx(textFileMetricsPersister0);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file2 = textFileMetricsPersisterJmx1.getOutputDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = null;
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx1 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx(textFileMetricsPersister0);
        java.lang.String str2 = textFileMetricsPersisterJmx1.getJmxBeanName();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray3 = textFileMetricsPersisterJmx1.getJmxFolderNames();
        textFileMetricsPersisterJmx1.setJmxDomainName("hi!");
        textFileMetricsPersisterJmx1.setJmxDomainName("com.j256");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = textFileMetricsPersisterJmx1.isShowDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jmxFolderNameArray3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.io.File file4 = null;
        com.j256.simplemetrics.utils.FileMetric.FileMetricKind fileMetricKind5 = com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR;
        com.j256.simplemetrics.utils.FileMetric fileMetric9 = new com.j256.simplemetrics.utils.FileMetric("=", "", "", "", file4, fileMetricKind5, (int) 'a', "=", "com.j256");
        com.j256.simplemetrics.utils.FileMetric.FileMetricOperation fileMetricOperation10 = com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY;
        fileMetric9.setAdjustmentOperation(fileMetricOperation10);
        fileMetric9.setPrefix("MetricValueDetails [value=0, numSamples=0, min=0.0, max=0.0]");
        org.junit.Assert.assertTrue("'" + fileMetricKind5 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR + "'", fileMetricKind5.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR));
        org.junit.Assert.assertTrue("'" + fileMetricOperation10 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY + "'", fileMetricOperation10.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.io.File file4 = null;
        com.j256.simplemetrics.utils.FileMetric.FileMetricKind fileMetricKind5 = com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR;
        com.j256.simplemetrics.utils.FileMetric fileMetric9 = new com.j256.simplemetrics.utils.FileMetric("com.j256.=.=", "=", "=", "", file4, fileMetricKind5, 100, "com.j256", "hi!");
        fileMetric9.setUnit("");
        // The following exception was thrown during execution in test generation
        try {
            fileMetric9.updateValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + fileMetricKind5 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR + "'", fileMetricKind5.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        java.net.Socket socket0 = null;
        com.j256.simplemetrics.utils.MiscUtils.closeQuietly(socket0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio5 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.lang.Number number6 = controlledMetricRatio5.getValueToPersist();
        java.lang.Number number7 = controlledMetricRatio5.getValue();
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio13 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.lang.Number number14 = controlledMetricRatio13.getValueToPersist();
        int int15 = controlledMetricRatio5.compareTo((com.j256.simplemetrics.metric.BaseControlledMetric<com.j256.simplemetrics.metric.ControlledMetricRatio.NumeratorDenominator, com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue>) controlledMetricRatio13);
        controlledMetricRatio13.adjustValue((java.lang.Number) (byte) 100, (java.lang.Number) 1);
        controlledMetricRatio13.adjustValue((java.lang.Number) 100L);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 0L + "'", number6, 0L);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0.0d + "'", number7, 0.0d);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 0L + "'", number14, 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        com.j256.simplemetrics.manager.MetricsManager metricsManager0 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister1 = new com.j256.simplemetrics.persister.TextFileMetricsPersister();
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister2 = new com.j256.simplemetrics.persister.TextFileMetricsPersister();
        textFileMetricsPersister2.setSeparatingString("=");
        com.j256.simplemetrics.persister.MetricValuesPersister[] metricValuesPersisterArray5 = new com.j256.simplemetrics.persister.MetricValuesPersister[] { textFileMetricsPersister1, textFileMetricsPersister2 };
        metricsManager0.setMetricValuesPersisters(metricValuesPersisterArray5);
        int int7 = metricsManager0.getPersistCount();
        org.junit.Assert.assertNotNull(metricValuesPersisterArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("", "", "com.j256.=.=", "AVERAGE", "never");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Component cannot be an empty or blank string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = null;
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx1 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx(textFileMetricsPersister0);
        java.lang.String str2 = textFileMetricsPersisterJmx1.getJmxBeanName();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray3 = textFileMetricsPersisterJmx1.getJmxFolderNames();
        textFileMetricsPersisterJmx1.setJmxDomainName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            textFileMetricsPersisterJmx1.setShowDescription(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jmxFolderNameArray3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio5 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.lang.Number number6 = controlledMetricRatio5.getValueToPersist();
        java.lang.String str7 = controlledMetricRatio5.getUnit();
        controlledMetricRatio5.adjustValue((java.lang.Number) (byte) 0);
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails10 = controlledMetricRatio5.getValueDetailsToPersist();
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 0L + "'", number6, 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(metricValueDetails10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = null;
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx1 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx(textFileMetricsPersister0);
        java.lang.String str2 = textFileMetricsPersisterJmx1.getJmxBeanName();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray3 = textFileMetricsPersisterJmx1.getJmxFolderNames();
        textFileMetricsPersisterJmx1.setJmxDomainName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            textFileMetricsPersisterJmx1.setAppendSysTimeMillis(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jmxFolderNameArray3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx0 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        com.j256.simplemetrics.manager.MetricsManager metricsManager1 = new com.j256.simplemetrics.manager.MetricsManager();
        metricsManagerJmx0.setMetricsManager(metricsManager1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue0 = com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue.createInitialValue();
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue2 = accumValue0.makeAdjusted((java.lang.Long) 0L);
        int int3 = accumValue2.getNumSamples();
        java.lang.Number number4 = accumValue2.getValue();
        org.junit.Assert.assertNotNull(accumValue0);
        org.junit.Assert.assertNotNull(accumValue2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0L + "'", number4, 0L);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        java.io.File file4 = null;
        com.j256.simplemetrics.utils.FileMetric.FileMetricKind fileMetricKind5 = com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR;
        com.j256.simplemetrics.utils.FileMetric fileMetric9 = new com.j256.simplemetrics.utils.FileMetric("com.j256.=.=", "=", "=", "", file4, fileMetricKind5, 100, "com.j256", "hi!");
        fileMetric9.initialize();
        org.junit.Assert.assertTrue("'" + fileMetricKind5 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR + "'", fileMetricKind5.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        java.io.File file4 = null;
        com.j256.simplemetrics.utils.FileMetric.FileMetricKind fileMetricKind5 = com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR;
        com.j256.simplemetrics.utils.FileMetric fileMetric9 = new com.j256.simplemetrics.utils.FileMetric("=", "", "", "", file4, fileMetricKind5, (int) 'a', "=", "com.j256");
        fileMetric9.setLinePattern("com.j256");
        fileMetric9.initialize();
        fileMetric9.setMetricName("com.j256");
        org.junit.Assert.assertTrue("'" + fileMetricKind5 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR + "'", fileMetricKind5.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue0 = com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue.createInitialValue();
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue1 = accumValue0.makePersisted();
        java.lang.Number number2 = accumValue0.getMin();
        java.lang.Number number3 = accumValue0.getMin();
        org.junit.Assert.assertNotNull(accumValue0);
        org.junit.Assert.assertNotNull(accumValue1);
        org.junit.Assert.assertEquals("'" + number2 + "' != '" + 0L + "'", number2, 0L);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0L + "'", number3, 0L);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue0 = com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue.createInitialValue();
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue1 = accumValue0.makePersisted();
        int int2 = accumValue0.getNumSamples();
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue3 = accumValue0.makePersisted();
        int int4 = accumValue0.getNumSamples();
        org.junit.Assert.assertNotNull(accumValue0);
        org.junit.Assert.assertNotNull(accumValue1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(accumValue3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("", "", "AVERAGE", "never", "com.j256");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Component cannot be an empty or blank string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio5 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.lang.Number number6 = controlledMetricRatio5.getValueToPersist();
        java.lang.String str7 = controlledMetricRatio5.getUnit();
        controlledMetricRatio5.adjustValue((long) 0);
        controlledMetricRatio5.adjustValue((java.lang.Number) (short) 0, (java.lang.Number) 0.0d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 0L + "'", number6, 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue0 = com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue.createInitialValue();
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue1 = accumValue0.makePersisted();
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue2 = accumValue0.makePersisted();
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue4 = accumValue2.makeAdjusted((java.lang.Long) 100L);
        java.lang.Number number5 = accumValue2.getMax();
        org.junit.Assert.assertNotNull(accumValue0);
        org.junit.Assert.assertNotNull(accumValue1);
        org.junit.Assert.assertNotNull(accumValue2);
        org.junit.Assert.assertNotNull(accumValue4);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 0L + "'", number5, 0L);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue0 = com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue.createInitialValue();
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue1 = accumValue0.makePersisted();
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue2 = accumValue0.makePersisted();
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue4 = accumValue2.makeAdjusted((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(accumValue0);
        org.junit.Assert.assertNotNull(accumValue1);
        org.junit.Assert.assertNotNull(accumValue2);
        org.junit.Assert.assertNotNull(accumValue4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = new com.j256.simplemetrics.persister.TextFileMetricsPersister();
        textFileMetricsPersister0.setSeparatingString("=");
        java.io.File file3 = textFileMetricsPersister0.getOutputDirectory();
        long long4 = textFileMetricsPersister0.getCleanupLogCount();
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider0 = null;
        com.j256.simplemetrics.persister.CloudWatchMetricsPersister cloudWatchMetricsPersister3 = new com.j256.simplemetrics.persister.CloudWatchMetricsPersister(aWSCredentialsProvider0, "=", false);
        cloudWatchMetricsPersister3.initialize();
        cloudWatchMetricsPersister3.initialize();
        com.amazonaws.auth.AWSCredentials aWSCredentials6 = null;
        cloudWatchMetricsPersister3.setAwsCredentials(aWSCredentials6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx0 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray1 = textFileMetricsPersisterJmx0.getJmxFolderNames();
        org.junit.Assert.assertNotNull(jmxFolderNameArray1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio5 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.io.File file10 = null;
        com.j256.simplemetrics.utils.FileMetric.FileMetricKind fileMetricKind11 = com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR;
        com.j256.simplemetrics.utils.FileMetric fileMetric15 = new com.j256.simplemetrics.utils.FileMetric("com.j256.=.=", "=", "=", "", file10, fileMetricKind11, 100, "com.j256", "hi!");
        boolean boolean16 = controlledMetricRatio5.equals((java.lang.Object) fileMetricKind11);
        controlledMetricRatio5.adjustValue((java.lang.Number) (-38), (java.lang.Number) (short) -1);
        org.junit.Assert.assertTrue("'" + fileMetricKind11 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR + "'", fileMetricKind11.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        controlledMetricValue5.adjustValue((java.lang.Number) 1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.j256.simplemetrics.manager.MetricsManager metricsManager0 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx1 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str2 = metricsManagerJmx1.getJmxDomainName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx1.setJmxFolderNames(strArray5);
        metricsManager0.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx1);
        java.util.Collection<com.j256.simplemetrics.metric.ControlledMetric<?, ?>> wildcardControlledMetricCollection8 = metricsManager0.getMetrics();
        com.j256.simplemetrics.persister.MetricsPersisterJob metricsPersisterJob12 = new com.j256.simplemetrics.persister.MetricsPersisterJob(metricsManager0, (-1L), (long) (short) 0, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.j256" + "'", str2, "com.j256");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardControlledMetricCollection8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue ratioValue0 = com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue.createInitialValue();
        java.lang.Number number1 = ratioValue0.getMin();
        java.lang.Number number2 = ratioValue0.getMin();
        org.junit.Assert.assertNotNull(ratioValue0);
        org.junit.Assert.assertEquals("'" + number1 + "' != '" + 0.0d + "'", number1, 0.0d);
        org.junit.Assert.assertEquals("'" + number2 + "' != '" + 0.0d + "'", number2, 0.0d);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("com.j256", "=", "=", "", "com.j256");
        java.lang.String str6 = controlledMetricValue5.getName();
        java.lang.String str7 = controlledMetricValue5.getUnit();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.j256" + "'", str7, "com.j256");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("com.j256", "=", "=", "", "com.j256");
        controlledMetricValue5.adjustValue((long) 10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.j256.simplemetrics.manager.MetricsManager metricsManager0 = new com.j256.simplemetrics.manager.MetricsManager();
        metricsManager0.persist();
        java.util.Map<com.j256.simplemetrics.metric.ControlledMetric<?, ?>, com.j256.simplemetrics.metric.MetricValueDetails> wildcardControlledMetricMap2 = metricsManager0.getMetricValueDetailsMap();
        org.junit.Assert.assertNotNull(wildcardControlledMetricMap2);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails6 = controlledMetricValue5.getValueDetails();
        java.lang.Number number7 = controlledMetricValue5.getValue();
        java.lang.String str8 = controlledMetricValue5.getDescription();
        java.lang.Number number9 = controlledMetricValue5.getValueToPersist();
        org.junit.Assert.assertNotNull(metricValueDetails6);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0.0d + "'", number7, 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "=" + "'", str8, "=");
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 0L + "'", number9, 0L);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = null;
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx1 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx(textFileMetricsPersister0);
        java.lang.String str2 = textFileMetricsPersisterJmx1.getJmxBeanName();
        // The following exception was thrown during execution in test generation
        try {
            textFileMetricsPersisterJmx1.setAppendSysTimeMillis(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        controlledMetricAccum5.adjustValue((long) ' ');
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum13 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        java.lang.String str14 = controlledMetricAccum13.getUnit();
        boolean boolean15 = controlledMetricAccum5.equals((java.lang.Object) controlledMetricAccum13);
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails16 = controlledMetricAccum13.getValueDetailsToPersist();
        java.lang.String str17 = controlledMetricAccum13.getAggregationTypeName();
        com.j256.simplemetrics.metric.ControlledMetric.AggregationType aggregationType18 = controlledMetricAccum13.getAggregationType();
        long long19 = controlledMetricAccum13.increment();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.j256" + "'", str14, "com.j256");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(metricValueDetails16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "SUM" + "'", str17, "SUM");
        org.junit.Assert.assertTrue("'" + aggregationType18 + "' != '" + com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM + "'", aggregationType18.equals(com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.j256.simplemetrics.metric.ControlledMetricValue.ValueCount valueCount0 = com.j256.simplemetrics.metric.ControlledMetricValue.ValueCount.createInitialValue();
        com.j256.simplemetrics.metric.ControlledMetricValue.ValueCount valueCount2 = valueCount0.makeAdjusted((java.lang.Double) 0.0d);
        com.j256.simplemetrics.metric.ControlledMetricValue.ValueCount valueCount3 = valueCount2.makePersisted();
        com.j256.simplemetrics.metric.ControlledMetricValue.ValueCount valueCount5 = valueCount3.makeAdjusted((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(valueCount0);
        org.junit.Assert.assertNotNull(valueCount2);
        org.junit.Assert.assertNotNull(valueCount3);
        org.junit.Assert.assertNotNull(valueCount5);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue0 = com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue.createInitialValue();
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue1 = accumValue0.makePersisted();
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue2 = accumValue0.makePersisted();
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue4 = accumValue2.makeAdjusted((java.lang.Long) 100L);
        java.lang.Number number5 = accumValue2.getMin();
        org.junit.Assert.assertNotNull(accumValue0);
        org.junit.Assert.assertNotNull(accumValue1);
        org.junit.Assert.assertNotNull(accumValue2);
        org.junit.Assert.assertNotNull(accumValue4);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 0L + "'", number5, 0L);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("never", "never", "com.j256.=.=", "com.j256.=.=", "never");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = null;
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx1 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx(textFileMetricsPersister0);
        java.lang.String str2 = textFileMetricsPersisterJmx1.getJmxBeanName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = textFileMetricsPersisterJmx1.isShowDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = com.j256.simplemetrics.utils.MiscUtils.isBlank(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx0 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str1 = metricsManagerJmx0.getJmxBeanName();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray2 = metricsManagerJmx0.getJmxFolderNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(jmxFolderNameArray2);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = new com.j256.simplemetrics.persister.TextFileMetricsPersister();
        textFileMetricsPersister0.setSeparatingString("=");
        java.io.File file3 = textFileMetricsPersister0.getOutputDirectory();
        textFileMetricsPersister0.setShowDescription(true);
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            textFileMetricsPersister0.setOutputDirectory(file6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(file3);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.j256.simplemetrics.manager.MetricsManager metricsManager0 = null;
        com.j256.simplemetrics.persister.MetricsPersisterJob metricsPersisterJob4 = new com.j256.simplemetrics.persister.MetricsPersisterJob(metricsManager0, 1L, (long) (short) -1, true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails6 = controlledMetricValue5.getValueDetails();
        java.lang.Number number7 = controlledMetricValue5.getValue();
        java.lang.String str8 = controlledMetricValue5.getName();
        java.lang.String str9 = controlledMetricValue5.getUnit();
        java.lang.String str10 = controlledMetricValue5.getName();
        org.junit.Assert.assertNotNull(metricValueDetails6);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0.0d + "'", number7, 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.j256" + "'", str8, "com.j256");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.j256" + "'", str9, "com.j256");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.j256" + "'", str10, "com.j256");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.j256.simplemetrics.manager.MetricsManager metricsManager0 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher1 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.utils.FileMetric[] fileMetricArray2 = new com.j256.simplemetrics.utils.FileMetric[] {};
        fileMetricsPublisher1.setFileMetrics(fileMetricArray2);
        java.lang.String[] strArray4 = fileMetricsPublisher1.getMetricsValues();
        metricsManager0.registerUpdater((com.j256.simplemetrics.manager.MetricsUpdater) fileMetricsPublisher1);
        long long6 = fileMetricsPublisher1.getFailedUpdateCount();
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher7 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.manager.MetricsManager metricsManager8 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx9 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str10 = metricsManagerJmx9.getJmxDomainName();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx9.setJmxFolderNames(strArray13);
        metricsManager8.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx9);
        fileMetricsPublisher7.setMetricsManager(metricsManager8);
        fileMetricsPublisher1.setMetricsManager(metricsManager8);
        org.junit.Assert.assertNotNull(fileMetricArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.j256" + "'", str10, "com.j256");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx0 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx();
        java.lang.String str1 = textFileMetricsPersisterJmx0.getJmxDomainName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.j256" + "'", str1, "com.j256");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.j256.simplemetrics.persister.MetricsPersisterJob metricsPersisterJob0 = new com.j256.simplemetrics.persister.MetricsPersisterJob();
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher1 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.manager.MetricsManager metricsManager2 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx3 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str4 = metricsManagerJmx3.getJmxDomainName();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx3.setJmxFolderNames(strArray7);
        metricsManager2.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx3);
        fileMetricsPublisher1.setMetricsManager(metricsManager2);
        metricsPersisterJob0.setMetricsManager(metricsManager2);
        metricsPersisterJob0.initialize();
        metricsPersisterJob0.destroyAndJoin();
        metricsPersisterJob0.setDelayTimeMillis((long) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.j256" + "'", str4, "com.j256");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("", "com.j256", "", "AVERAGE", "MetricValueDetails [value=0, numSamples=0, min=0.0, max=0.0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name cannot be an empty or blank string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.j256.simplemetrics.persister.CloudWatchMetricsPersister cloudWatchMetricsPersister3 = new com.j256.simplemetrics.persister.CloudWatchMetricsPersister(aWSCredentials0, "com.j256", true);
        cloudWatchMetricsPersister3.setAddInstanceData(true);
        com.amazonaws.services.cloudwatch.AmazonCloudWatch amazonCloudWatch6 = null;
        cloudWatchMetricsPersister3.setCloudWatchClient(amazonCloudWatch6);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.j256.simplemetrics.metric.ControlledMetric.AggregationType aggregationType0 = com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM;
        org.junit.Assert.assertTrue("'" + aggregationType0 + "' != '" + com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM + "'", aggregationType0.equals(com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio5 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.lang.Number number6 = controlledMetricRatio5.getValueToPersist();
        java.lang.Number number7 = controlledMetricRatio5.getValue();
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio13 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.lang.Number number14 = controlledMetricRatio13.getValueToPersist();
        int int15 = controlledMetricRatio5.compareTo((com.j256.simplemetrics.metric.BaseControlledMetric<com.j256.simplemetrics.metric.ControlledMetricRatio.NumeratorDenominator, com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue>) controlledMetricRatio13);
        java.lang.Number number16 = controlledMetricRatio5.getValueToPersist();
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio22 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.lang.Number number23 = controlledMetricRatio22.getValueToPersist();
        java.lang.String str24 = controlledMetricRatio22.getUnit();
        int int25 = controlledMetricRatio5.compareTo((com.j256.simplemetrics.metric.BaseControlledMetric<com.j256.simplemetrics.metric.ControlledMetricRatio.NumeratorDenominator, com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue>) controlledMetricRatio22);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 0L + "'", number6, 0L);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0.0d + "'", number7, 0.0d);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 0L + "'", number14, 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 0L + "'", number16, 0L);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 0L + "'", number23, 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = null;
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx1 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx(textFileMetricsPersister0);
        // The following exception was thrown during execution in test generation
        try {
            long long2 = textFileMetricsPersisterJmx1.getDumpLogCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = null;
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx1 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx(textFileMetricsPersister0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = textFileMetricsPersisterJmx1.isShowDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        controlledMetricAccum5.adjustValue(1L);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider0 = null;
        com.j256.simplemetrics.persister.CloudWatchMetricsPersister cloudWatchMetricsPersister3 = new com.j256.simplemetrics.persister.CloudWatchMetricsPersister(aWSCredentialsProvider0, "=", false);
        cloudWatchMetricsPersister3.initialize();
        cloudWatchMetricsPersister3.initialize();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider6 = null;
        cloudWatchMetricsPersister3.setAwsCredentialsProvider(aWSCredentialsProvider6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails6 = controlledMetricValue5.getValueDetails();
        java.lang.Number number7 = metricValueDetails6.getMin();
        int int8 = metricValueDetails6.getNumSamples();
        org.junit.Assert.assertNotNull(metricValueDetails6);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0.0d + "'", number7, 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("com.j256", "=", "=", "", "com.j256");
        java.lang.String str6 = controlledMetricValue5.getName();
        java.lang.String str7 = controlledMetricValue5.getComponent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.j256" + "'", str7, "com.j256");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.j256.simplemetrics.utils.FileMetric fileMetric0 = new com.j256.simplemetrics.utils.FileMetric();
        boolean boolean1 = fileMetric0.isInitialized();
        boolean boolean2 = fileMetric0.isInitialized();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        java.io.File file4 = null;
        com.j256.simplemetrics.utils.FileMetric.FileMetricKind fileMetricKind5 = com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR;
        com.j256.simplemetrics.utils.FileMetric fileMetric9 = new com.j256.simplemetrics.utils.FileMetric("=", "", "", "", file4, fileMetricKind5, (int) 'a', "=", "com.j256");
        com.j256.simplemetrics.utils.FileMetric.FileMetricOperation fileMetricOperation10 = com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY;
        fileMetric9.setAdjustmentOperation(fileMetricOperation10);
        fileMetric9.setMetricModule("com.j256");
        fileMetric9.setMetricName("com.j256");
        fileMetric9.setColumn((int) ' ');
        fileMetric9.setMetricModule("com.j256");
        org.junit.Assert.assertTrue("'" + fileMetricKind5 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR + "'", fileMetricKind5.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR));
        org.junit.Assert.assertTrue("'" + fileMetricOperation10 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY + "'", fileMetricOperation10.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        controlledMetricAccum5.adjustValue((long) ' ');
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum13 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        java.lang.String str14 = controlledMetricAccum13.getUnit();
        boolean boolean15 = controlledMetricAccum5.equals((java.lang.Object) controlledMetricAccum13);
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails16 = controlledMetricAccum13.getValueDetailsToPersist();
        java.lang.String str17 = controlledMetricAccum13.getAggregationTypeName();
        com.j256.simplemetrics.metric.ControlledMetric.AggregationType aggregationType18 = controlledMetricAccum13.getAggregationType();
        java.lang.String str19 = controlledMetricAccum13.getName();
        controlledMetricAccum13.adjustValue((long) 'a');
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails22 = controlledMetricAccum13.getValueDetailsToPersist();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.j256" + "'", str14, "com.j256");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(metricValueDetails16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "SUM" + "'", str17, "SUM");
        org.junit.Assert.assertTrue("'" + aggregationType18 + "' != '" + com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM + "'", aggregationType18.equals(com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "com.j256" + "'", str19, "com.j256");
        org.junit.Assert.assertNotNull(metricValueDetails22);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.j256.simplemetrics.manager.MetricsManager metricsManager0 = new com.j256.simplemetrics.manager.MetricsManager();
        metricsManager0.persist();
        metricsManager0.persist();
        metricsManager0.persist();
        metricsManager0.updateMetrics();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue ratioValue0 = com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue.createInitialValue();
        com.j256.simplemetrics.metric.ControlledMetricRatio.NumeratorDenominator numeratorDenominator3 = new com.j256.simplemetrics.metric.ControlledMetricRatio.NumeratorDenominator((double) '#', (double) (-1.0f));
        com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue ratioValue4 = ratioValue0.makeAdjusted(numeratorDenominator3);
        int int5 = ratioValue0.getNumSamples();
        com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue ratioValue6 = ratioValue0.makePersisted();
        int int7 = ratioValue0.getNumSamples();
        org.junit.Assert.assertNotNull(ratioValue0);
        org.junit.Assert.assertNotNull(ratioValue4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(ratioValue6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = new com.j256.simplemetrics.persister.TextFileMetricsPersister();
        boolean boolean1 = textFileMetricsPersister0.isShowDescription();
        boolean boolean2 = textFileMetricsPersister0.isAppendSysTimeMillis();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue0 = com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue.createInitialValue();
        java.lang.Number number1 = accumValue0.getMin();
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue2 = accumValue0.makePersisted();
        java.lang.Number number3 = accumValue0.getMin();
        int int4 = accumValue0.getNumSamples();
        java.lang.Number number5 = accumValue0.getValue();
        int int6 = accumValue0.getNumSamples();
        java.lang.Number number7 = accumValue0.getMax();
        org.junit.Assert.assertNotNull(accumValue0);
        org.junit.Assert.assertEquals("'" + number1 + "' != '" + 0L + "'", number1, 0L);
        org.junit.Assert.assertNotNull(accumValue2);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0L + "'", number3, 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 0L + "'", number5, 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0L + "'", number7, 0L);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        java.io.File file4 = null;
        com.j256.simplemetrics.utils.FileMetric.FileMetricKind fileMetricKind5 = com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR;
        com.j256.simplemetrics.utils.FileMetric fileMetric9 = new com.j256.simplemetrics.utils.FileMetric("=", "", "", "", file4, fileMetricKind5, (int) 'a', "=", "com.j256");
        com.j256.simplemetrics.utils.FileMetric.FileMetricOperation fileMetricOperation10 = com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY;
        fileMetric9.setAdjustmentOperation(fileMetricOperation10);
        fileMetric9.setMetricComponent("");
        fileMetric9.setPrefix("MetricValueDetails [value=0, numSamples=0, min=0.0, max=0.0]");
        fileMetric9.setPrefix("SUM");
        org.junit.Assert.assertTrue("'" + fileMetricKind5 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR + "'", fileMetricKind5.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR));
        org.junit.Assert.assertTrue("'" + fileMetricOperation10 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY + "'", fileMetricOperation10.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher0 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.manager.MetricsManager metricsManager1 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx2 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str3 = metricsManagerJmx2.getJmxDomainName();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx2.setJmxFolderNames(strArray6);
        metricsManager1.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx2);
        fileMetricsPublisher0.setMetricsManager(metricsManager1);
        java.lang.String[] strArray10 = metricsManager1.getMetricValues();
        java.util.Map<com.j256.simplemetrics.metric.ControlledMetric<?, ?>, com.j256.simplemetrics.metric.MetricValueDetails> wildcardControlledMetricMap11 = metricsManager1.getMetricValueDetailsMap();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.j256" + "'", str3, "com.j256");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardControlledMetricMap11);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        java.io.File file4 = null;
        com.j256.simplemetrics.utils.FileMetric.FileMetricKind fileMetricKind5 = com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR;
        com.j256.simplemetrics.utils.FileMetric fileMetric9 = new com.j256.simplemetrics.utils.FileMetric("=", "", "", "", file4, fileMetricKind5, (int) 'a', "=", "com.j256");
        fileMetric9.setLinePattern("com.j256");
        fileMetric9.initialize();
        com.j256.simplemetrics.utils.FileMetric.FileMetricOperation fileMetricOperation13 = com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.ADD;
        fileMetric9.setAdjustmentOperation(fileMetricOperation13);
        fileMetric9.setRequired(true);
        org.junit.Assert.assertTrue("'" + fileMetricKind5 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR + "'", fileMetricKind5.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR));
        org.junit.Assert.assertTrue("'" + fileMetricOperation13 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.ADD + "'", fileMetricOperation13.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.ADD));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        controlledMetricAccum5.adjustValue((long) ' ');
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum13 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        java.lang.String str14 = controlledMetricAccum13.getUnit();
        boolean boolean15 = controlledMetricAccum5.equals((java.lang.Object) controlledMetricAccum13);
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails16 = controlledMetricAccum13.getValueDetailsToPersist();
        java.lang.String str17 = controlledMetricAccum13.getAggregationTypeName();
        com.j256.simplemetrics.metric.ControlledMetric.AggregationType aggregationType18 = controlledMetricAccum13.getAggregationType();
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails19 = controlledMetricAccum13.getValueDetailsToPersist();
        java.lang.Object obj20 = null;
        boolean boolean21 = controlledMetricAccum13.equals(obj20);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.j256" + "'", str14, "com.j256");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(metricValueDetails16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "SUM" + "'", str17, "SUM");
        org.junit.Assert.assertTrue("'" + aggregationType18 + "' != '" + com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM + "'", aggregationType18.equals(com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM));
        org.junit.Assert.assertNotNull(metricValueDetails19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio5 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.lang.Number number6 = controlledMetricRatio5.getValueToPersist();
        java.lang.String str7 = controlledMetricRatio5.getUnit();
        controlledMetricRatio5.adjustValue((java.lang.Number) (byte) 0);
        controlledMetricRatio5.adjustValue(1L);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 0L + "'", number6, 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio5 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.lang.Number number6 = controlledMetricRatio5.getValueToPersist();
        java.lang.Number number7 = controlledMetricRatio5.getValue();
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio13 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.lang.Number number14 = controlledMetricRatio13.getValueToPersist();
        int int15 = controlledMetricRatio5.compareTo((com.j256.simplemetrics.metric.BaseControlledMetric<com.j256.simplemetrics.metric.ControlledMetricRatio.NumeratorDenominator, com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue>) controlledMetricRatio13);
        java.lang.String str16 = controlledMetricRatio5.getModule();
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 0L + "'", number6, 0L);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0.0d + "'", number7, 0.0d);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 0L + "'", number14, 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        controlledMetricAccum5.adjustValue((long) ' ');
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum13 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        java.lang.String str14 = controlledMetricAccum13.getUnit();
        boolean boolean15 = controlledMetricAccum5.equals((java.lang.Object) controlledMetricAccum13);
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails16 = controlledMetricAccum13.getValueDetailsToPersist();
        java.lang.String str17 = controlledMetricAccum13.getAggregationTypeName();
        com.j256.simplemetrics.metric.ControlledMetric.AggregationType aggregationType18 = controlledMetricAccum13.getAggregationType();
        java.lang.String str19 = controlledMetricAccum13.getAggregationTypeName();
        controlledMetricAccum13.adjustValue((java.lang.Number) 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.j256" + "'", str14, "com.j256");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(metricValueDetails16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "SUM" + "'", str17, "SUM");
        org.junit.Assert.assertTrue("'" + aggregationType18 + "' != '" + com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM + "'", aggregationType18.equals(com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "SUM" + "'", str19, "SUM");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider0 = null;
        com.j256.simplemetrics.persister.CloudWatchMetricsPersister cloudWatchMetricsPersister3 = new com.j256.simplemetrics.persister.CloudWatchMetricsPersister(aWSCredentialsProvider0, "=", false);
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider4 = null;
        cloudWatchMetricsPersister3.setAwsCredentialsProvider(aWSCredentialsProvider4);
        com.amazonaws.auth.AWSCredentials aWSCredentials6 = null;
        cloudWatchMetricsPersister3.setAwsCredentials(aWSCredentials6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        com.j256.simplemetrics.metric.ControlledMetric.AggregationType aggregationType6 = controlledMetricValue5.getAggregationType();
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails7 = controlledMetricValue5.getValueDetails();
        org.junit.Assert.assertTrue("'" + aggregationType6 + "' != '" + com.j256.simplemetrics.metric.ControlledMetric.AggregationType.AVERAGE + "'", aggregationType6.equals(com.j256.simplemetrics.metric.ControlledMetric.AggregationType.AVERAGE));
        org.junit.Assert.assertNotNull(metricValueDetails7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        controlledMetricAccum5.adjustValue((long) ' ');
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum13 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        java.lang.String str14 = controlledMetricAccum13.getUnit();
        boolean boolean15 = controlledMetricAccum5.equals((java.lang.Object) controlledMetricAccum13);
        java.lang.String str16 = controlledMetricAccum13.getUnit();
        controlledMetricAccum13.adjustValue((long) (byte) 100);
        java.lang.String str19 = controlledMetricAccum13.getDescription();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.j256" + "'", str14, "com.j256");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.j256" + "'", str16, "com.j256");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.j256.simplemetrics.persister.LoggingMetricsPersister loggingMetricsPersister0 = new com.j256.simplemetrics.persister.LoggingMetricsPersister();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails6 = controlledMetricValue5.getValueDetails();
        java.lang.Number number7 = controlledMetricValue5.getValue();
        java.lang.String str8 = controlledMetricValue5.getName();
        java.lang.Number number9 = controlledMetricValue5.getValueToPersist();
        java.lang.Number number10 = controlledMetricValue5.getValueToPersist();
        org.junit.Assert.assertNotNull(metricValueDetails6);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0.0d + "'", number7, 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.j256" + "'", str8, "com.j256");
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 0L + "'", number9, 0L);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 0L + "'", number10, 0L);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        controlledMetricAccum5.adjustValue((long) ' ');
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum13 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        java.lang.String str14 = controlledMetricAccum13.getUnit();
        boolean boolean15 = controlledMetricAccum5.equals((java.lang.Object) controlledMetricAccum13);
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails16 = controlledMetricAccum13.getValueDetailsToPersist();
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue22 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        controlledMetricValue22.adjustValue((java.lang.Number) (-1.0d));
        java.lang.String str25 = controlledMetricValue22.getAggregationTypeName();
        boolean boolean26 = controlledMetricAccum13.equals((java.lang.Object) str25);
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum32 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        java.lang.String str33 = controlledMetricAccum32.getUnit();
        java.lang.String str34 = controlledMetricAccum32.getModule();
        int int35 = controlledMetricAccum13.compareTo((com.j256.simplemetrics.metric.BaseControlledMetric<java.lang.Long, com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue>) controlledMetricAccum32);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.j256" + "'", str14, "com.j256");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(metricValueDetails16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "AVERAGE" + "'", str25, "AVERAGE");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "com.j256" + "'", str33, "com.j256");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "com.j256" + "'", str34, "com.j256");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        controlledMetricAccum5.adjustValue((long) ' ');
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum13 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        java.lang.String str14 = controlledMetricAccum13.getUnit();
        boolean boolean15 = controlledMetricAccum5.equals((java.lang.Object) controlledMetricAccum13);
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails16 = controlledMetricAccum13.getValueDetailsToPersist();
        java.lang.String str17 = controlledMetricAccum13.getAggregationTypeName();
        com.j256.simplemetrics.metric.ControlledMetric.AggregationType aggregationType18 = controlledMetricAccum13.getAggregationType();
        java.lang.String str19 = controlledMetricAccum13.getName();
        java.lang.String str20 = controlledMetricAccum13.getUnit();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.j256" + "'", str14, "com.j256");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(metricValueDetails16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "SUM" + "'", str17, "SUM");
        org.junit.Assert.assertTrue("'" + aggregationType18 + "' != '" + com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM + "'", aggregationType18.equals(com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "com.j256" + "'", str19, "com.j256");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "com.j256" + "'", str20, "com.j256");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher0 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.utils.FileMetric[] fileMetricArray1 = new com.j256.simplemetrics.utils.FileMetric[] {};
        fileMetricsPublisher0.setFileMetrics(fileMetricArray1);
        com.j256.simplemetrics.manager.MetricsManager metricsManager3 = new com.j256.simplemetrics.manager.MetricsManager();
        metricsManager3.persist();
        fileMetricsPublisher0.setMetricsManager(metricsManager3);
        metricsManager3.persistValuesOnly();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider7 = null;
        com.j256.simplemetrics.persister.CloudWatchMetricsPersister cloudWatchMetricsPersister10 = new com.j256.simplemetrics.persister.CloudWatchMetricsPersister(aWSCredentialsProvider7, "=", false);
        cloudWatchMetricsPersister10.initialize();
        cloudWatchMetricsPersister10.initialize();
        com.amazonaws.auth.AWSCredentials aWSCredentials13 = null;
        cloudWatchMetricsPersister10.setAwsCredentials(aWSCredentials13);
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider15 = null;
        com.j256.simplemetrics.persister.CloudWatchMetricsPersister cloudWatchMetricsPersister18 = new com.j256.simplemetrics.persister.CloudWatchMetricsPersister(aWSCredentialsProvider15, "=", false);
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider19 = null;
        cloudWatchMetricsPersister18.setAwsCredentialsProvider(aWSCredentialsProvider19);
        com.amazonaws.auth.AWSCredentials aWSCredentials21 = null;
        cloudWatchMetricsPersister18.setAwsCredentials(aWSCredentials21);
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider23 = null;
        com.j256.simplemetrics.persister.CloudWatchMetricsPersister cloudWatchMetricsPersister26 = new com.j256.simplemetrics.persister.CloudWatchMetricsPersister(aWSCredentialsProvider23, "=", false);
        cloudWatchMetricsPersister26.initialize();
        com.j256.simplemetrics.persister.MetricDetailsPersister[] metricDetailsPersisterArray28 = new com.j256.simplemetrics.persister.MetricDetailsPersister[] { cloudWatchMetricsPersister10, cloudWatchMetricsPersister18, cloudWatchMetricsPersister26 };
        metricsManager3.setMetricDetailsPersisters(metricDetailsPersisterArray28);
        org.junit.Assert.assertNotNull(fileMetricArray1);
        org.junit.Assert.assertNotNull(metricDetailsPersisterArray28);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        com.j256.simplemetrics.metric.ControlledMetric.AggregationType aggregationType6 = controlledMetricValue5.getAggregationType();
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails7 = controlledMetricValue5.getValueDetailsToPersist();
        java.lang.String str8 = metricValueDetails7.toString();
        java.lang.Number number9 = metricValueDetails7.getMin();
        org.junit.Assert.assertTrue("'" + aggregationType6 + "' != '" + com.j256.simplemetrics.metric.ControlledMetric.AggregationType.AVERAGE + "'", aggregationType6.equals(com.j256.simplemetrics.metric.ControlledMetric.AggregationType.AVERAGE));
        org.junit.Assert.assertNotNull(metricValueDetails7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MetricValueDetails [value=0, numSamples=0, min=0.0, max=0.0]" + "'", str8, "MetricValueDetails [value=0, numSamples=0, min=0.0, max=0.0]");
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 0.0d + "'", number9, 0.0d);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = null;
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx1 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx(textFileMetricsPersister0);
        java.lang.String str2 = textFileMetricsPersisterJmx1.getJmxBeanName();
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister3 = null;
        textFileMetricsPersisterJmx1.setMetricsPersister(textFileMetricsPersister3);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = textFileMetricsPersisterJmx1.getDumpLogCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.j256.simplemetrics.utils.FileMetricsPublisherJmx fileMetricsPublisherJmx0 = new com.j256.simplemetrics.utils.FileMetricsPublisherJmx();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray1 = fileMetricsPublisherJmx0.getJmxFolderNames();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray2 = fileMetricsPublisherJmx0.getJmxFolderNames();
        com.j256.simplemetrics.utils.FileMetricsPublisherJmx fileMetricsPublisherJmx3 = new com.j256.simplemetrics.utils.FileMetricsPublisherJmx();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray4 = fileMetricsPublisherJmx3.getJmxFolderNames();
        java.lang.String[] strArray11 = new java.lang.String[] { "com.j256", "hi!", "AVERAGE", "never", "=", "=.hi!" };
        fileMetricsPublisherJmx3.setJmxFolderNames(strArray11);
        fileMetricsPublisherJmx0.setJmxFolderNames(strArray11);
        org.junit.Assert.assertNotNull(jmxFolderNameArray1);
        org.junit.Assert.assertNotNull(jmxFolderNameArray2);
        org.junit.Assert.assertNotNull(jmxFolderNameArray4);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider0 = null;
        com.j256.simplemetrics.persister.CloudWatchMetricsPersister cloudWatchMetricsPersister3 = new com.j256.simplemetrics.persister.CloudWatchMetricsPersister(aWSCredentialsProvider0, "hi!", true);
        cloudWatchMetricsPersister3.setAddInstanceData(true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        java.lang.String str1 = com.j256.simplemetrics.utils.MiscUtils.capitalize("=");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.j256.simplemetrics.manager.MetricsManager metricsManager0 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher1 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.utils.FileMetric[] fileMetricArray2 = new com.j256.simplemetrics.utils.FileMetric[] {};
        fileMetricsPublisher1.setFileMetrics(fileMetricArray2);
        java.lang.String[] strArray4 = fileMetricsPublisher1.getMetricsValues();
        metricsManager0.registerUpdater((com.j256.simplemetrics.manager.MetricsUpdater) fileMetricsPublisher1);
        long long6 = fileMetricsPublisher1.getFailedUpdateCount();
        com.j256.simplemetrics.manager.MetricsManager metricsManager7 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx8 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str9 = metricsManagerJmx8.getJmxDomainName();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx8.setJmxFolderNames(strArray12);
        metricsManager7.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx8);
        java.util.Collection<com.j256.simplemetrics.metric.ControlledMetric<?, ?>> wildcardControlledMetricCollection15 = metricsManager7.getMetrics();
        fileMetricsPublisher1.setMetricsManager(metricsManager7);
        metricsManager7.persist();
        org.junit.Assert.assertNotNull(fileMetricArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.j256" + "'", str9, "com.j256");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardControlledMetricCollection15);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.j256.simplemetrics.utils.FileMetric fileMetric0 = new com.j256.simplemetrics.utils.FileMetric();
        fileMetric0.setAdjustmentValue((long) '4');
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.io.File file4 = null;
        com.j256.simplemetrics.utils.FileMetric.FileMetricKind fileMetricKind5 = null;
        com.j256.simplemetrics.utils.FileMetric fileMetric9 = new com.j256.simplemetrics.utils.FileMetric("com.j256.=.=", "never", "hi!", "", file4, fileMetricKind5, (int) (byte) 100, "com.j256", "");
        fileMetric9.setUnit("MetricValueDetails [value=0, numSamples=0, min=0.0, max=0.0]");
        fileMetric9.setLinePattern("never");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio5 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.lang.Number number6 = controlledMetricRatio5.getValueToPersist();
        java.lang.Number number7 = controlledMetricRatio5.getValue();
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio13 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.lang.Number number14 = controlledMetricRatio13.getValueToPersist();
        int int15 = controlledMetricRatio5.compareTo((com.j256.simplemetrics.metric.BaseControlledMetric<com.j256.simplemetrics.metric.ControlledMetricRatio.NumeratorDenominator, com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue>) controlledMetricRatio13);
        java.lang.Number number16 = controlledMetricRatio5.getValueToPersist();
        java.lang.String str17 = controlledMetricRatio5.toString();
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 0L + "'", number6, 0L);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0.0d + "'", number7, 0.0d);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 0L + "'", number14, 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 0L + "'", number16, 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "=.hi!" + "'", str17, "=.hi!");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        java.io.File file4 = null;
        com.j256.simplemetrics.utils.FileMetric.FileMetricKind fileMetricKind5 = com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR;
        com.j256.simplemetrics.utils.FileMetric fileMetric9 = new com.j256.simplemetrics.utils.FileMetric("=", "", "", "", file4, fileMetricKind5, (int) 'a', "=", "com.j256");
        com.j256.simplemetrics.utils.FileMetric.FileMetricOperation fileMetricOperation10 = com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY;
        fileMetric9.setAdjustmentOperation(fileMetricOperation10);
        fileMetric9.setMetricComponent("");
        com.j256.simplemetrics.metric.ControlledMetric<?, ?> wildcardControlledMetric14 = fileMetric9.getMetric();
        org.junit.Assert.assertTrue("'" + fileMetricKind5 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR + "'", fileMetricKind5.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR));
        org.junit.Assert.assertTrue("'" + fileMetricOperation10 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY + "'", fileMetricOperation10.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY));
        org.junit.Assert.assertNull(wildcardControlledMetric14);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        controlledMetricValue5.adjustValue((java.lang.Number) (-1.0d));
        java.lang.String str8 = controlledMetricValue5.getAggregationTypeName();
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails9 = controlledMetricValue5.getValueDetails();
        java.lang.String str10 = controlledMetricValue5.getName();
        java.lang.Number number11 = controlledMetricValue5.getValue();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AVERAGE" + "'", str8, "AVERAGE");
        org.junit.Assert.assertNotNull(metricValueDetails9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.j256" + "'", str10, "com.j256");
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (-1.0d) + "'", number11, (-1.0d));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue ratioValue0 = com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue.createInitialValue();
        com.j256.simplemetrics.metric.ControlledMetricRatio.NumeratorDenominator numeratorDenominator3 = new com.j256.simplemetrics.metric.ControlledMetricRatio.NumeratorDenominator((double) '#', (double) (-1.0f));
        com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue ratioValue4 = ratioValue0.makeAdjusted(numeratorDenominator3);
        int int5 = ratioValue0.getNumSamples();
        com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue ratioValue6 = ratioValue0.makePersisted();
        int int7 = ratioValue6.getNumSamples();
        org.junit.Assert.assertNotNull(ratioValue0);
        org.junit.Assert.assertNotNull(ratioValue4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(ratioValue6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.j256.simplemetrics.manager.MetricsManager metricsManager0 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher1 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.utils.FileMetric[] fileMetricArray2 = new com.j256.simplemetrics.utils.FileMetric[] {};
        fileMetricsPublisher1.setFileMetrics(fileMetricArray2);
        java.lang.String[] strArray4 = fileMetricsPublisher1.getMetricsValues();
        metricsManager0.registerUpdater((com.j256.simplemetrics.manager.MetricsUpdater) fileMetricsPublisher1);
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider6 = null;
        com.j256.simplemetrics.persister.CloudWatchMetricsPersister cloudWatchMetricsPersister9 = new com.j256.simplemetrics.persister.CloudWatchMetricsPersister(aWSCredentialsProvider6, "=", false);
        cloudWatchMetricsPersister9.setAddInstanceData(false);
        cloudWatchMetricsPersister9.setApplicationName("AVERAGE");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider14 = null;
        com.j256.simplemetrics.persister.CloudWatchMetricsPersister cloudWatchMetricsPersister17 = new com.j256.simplemetrics.persister.CloudWatchMetricsPersister(aWSCredentialsProvider14, "=", false);
        cloudWatchMetricsPersister17.setAddInstanceData(false);
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider20 = null;
        com.j256.simplemetrics.persister.CloudWatchMetricsPersister cloudWatchMetricsPersister23 = new com.j256.simplemetrics.persister.CloudWatchMetricsPersister(aWSCredentialsProvider20, "=", false);
        cloudWatchMetricsPersister23.initialize();
        cloudWatchMetricsPersister23.initialize();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider26 = null;
        com.j256.simplemetrics.persister.CloudWatchMetricsPersister cloudWatchMetricsPersister29 = new com.j256.simplemetrics.persister.CloudWatchMetricsPersister(aWSCredentialsProvider26, "=", false);
        cloudWatchMetricsPersister29.initialize();
        cloudWatchMetricsPersister29.initialize();
        com.amazonaws.auth.AWSCredentials aWSCredentials32 = null;
        cloudWatchMetricsPersister29.setAwsCredentials(aWSCredentials32);
        com.j256.simplemetrics.persister.MetricDetailsPersister[] metricDetailsPersisterArray34 = new com.j256.simplemetrics.persister.MetricDetailsPersister[] { cloudWatchMetricsPersister9, cloudWatchMetricsPersister17, cloudWatchMetricsPersister23, cloudWatchMetricsPersister29 };
        metricsManager0.setMetricDetailsPersisters(metricDetailsPersisterArray34);
        metricsManager0.persist();
        org.junit.Assert.assertNotNull(fileMetricArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(metricDetailsPersisterArray34);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.j256.simplemetrics.metric.ControlledMetricValue.ValueCount valueCount0 = com.j256.simplemetrics.metric.ControlledMetricValue.ValueCount.createInitialValue();
        com.j256.simplemetrics.metric.ControlledMetricValue.ValueCount valueCount2 = valueCount0.makeAdjusted((java.lang.Double) 0.0d);
        com.j256.simplemetrics.metric.ControlledMetricValue.ValueCount valueCount3 = valueCount2.makePersisted();
        int int4 = valueCount2.getNumSamples();
        org.junit.Assert.assertNotNull(valueCount0);
        org.junit.Assert.assertNotNull(valueCount2);
        org.junit.Assert.assertNotNull(valueCount3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue ratioValue0 = com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue.createInitialValue();
        com.j256.simplemetrics.metric.ControlledMetricRatio.NumeratorDenominator numeratorDenominator3 = new com.j256.simplemetrics.metric.ControlledMetricRatio.NumeratorDenominator((double) '#', (double) (-1.0f));
        com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue ratioValue4 = ratioValue0.makeAdjusted(numeratorDenominator3);
        java.lang.Number number5 = ratioValue0.getMax();
        org.junit.Assert.assertNotNull(ratioValue0);
        org.junit.Assert.assertNotNull(ratioValue4);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 0.0d + "'", number5, 0.0d);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue0 = com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue.createInitialValue();
        java.lang.Number number1 = accumValue0.getMin();
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue2 = accumValue0.makePersisted();
        java.lang.Number number3 = accumValue0.getMin();
        int int4 = accumValue0.getNumSamples();
        java.lang.Number number5 = accumValue0.getValue();
        org.junit.Assert.assertNotNull(accumValue0);
        org.junit.Assert.assertEquals("'" + number1 + "' != '" + 0L + "'", number1, 0L);
        org.junit.Assert.assertNotNull(accumValue2);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0L + "'", number3, 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 0L + "'", number5, 0L);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio5 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.lang.Number number6 = controlledMetricRatio5.getValueToPersist();
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails7 = controlledMetricRatio5.getValueDetails();
        java.lang.String str8 = controlledMetricRatio5.getName();
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 0L + "'", number6, 0L);
        org.junit.Assert.assertNotNull(metricValueDetails7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio5 = new com.j256.simplemetrics.metric.ControlledMetricRatio("never", "com.j256", "hi!", "hi!", "com.j256");
        java.lang.String str6 = controlledMetricRatio5.getAggregationTypeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AVERAGE" + "'", str6, "AVERAGE");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        com.j256.simplemetrics.metric.ControlledMetric.AggregationType aggregationType6 = controlledMetricValue5.getAggregationType();
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails7 = controlledMetricValue5.getValueDetailsToPersist();
        java.lang.String str8 = controlledMetricValue5.getUnit();
        org.junit.Assert.assertTrue("'" + aggregationType6 + "' != '" + com.j256.simplemetrics.metric.ControlledMetric.AggregationType.AVERAGE + "'", aggregationType6.equals(com.j256.simplemetrics.metric.ControlledMetric.AggregationType.AVERAGE));
        org.junit.Assert.assertNotNull(metricValueDetails7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.j256" + "'", str8, "com.j256");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.j256.simplemetrics.manager.MetricsManager metricsManager0 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx1 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str2 = metricsManagerJmx1.getJmxDomainName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx1.setJmxFolderNames(strArray5);
        metricsManager0.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx1);
        java.util.Collection<com.j256.simplemetrics.metric.ControlledMetric<?, ?>> wildcardControlledMetricCollection8 = metricsManager0.getMetrics();
        java.util.Map<com.j256.simplemetrics.metric.ControlledMetric<?, ?>, java.lang.Number> wildcardControlledMetricMap9 = metricsManager0.getMetricValuesMap();
        metricsManager0.persistValuesOnly();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.j256" + "'", str2, "com.j256");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardControlledMetricCollection8);
        org.junit.Assert.assertNotNull(wildcardControlledMetricMap9);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio5 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.lang.Number number6 = controlledMetricRatio5.getValueToPersist();
        java.lang.Number number7 = controlledMetricRatio5.getValue();
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio13 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.lang.Number number14 = controlledMetricRatio13.getValueToPersist();
        int int15 = controlledMetricRatio5.compareTo((com.j256.simplemetrics.metric.BaseControlledMetric<com.j256.simplemetrics.metric.ControlledMetricRatio.NumeratorDenominator, com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue>) controlledMetricRatio13);
        com.j256.simplemetrics.metric.ControlledMetricRatio.NumeratorDenominator numeratorDenominator17 = controlledMetricRatio13.makeValueFromLong((long) (-38));
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 0L + "'", number6, 0L);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0.0d + "'", number7, 0.0d);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 0L + "'", number14, 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(numeratorDenominator17);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.j256.simplemetrics.manager.MetricsManager metricsManager0 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx1 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str2 = metricsManagerJmx1.getJmxDomainName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx1.setJmxFolderNames(strArray5);
        metricsManager0.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx1);
        java.util.Collection<com.j256.simplemetrics.metric.ControlledMetric<?, ?>> wildcardControlledMetricCollection8 = metricsManager0.getMetrics();
        java.util.Map<com.j256.simplemetrics.metric.ControlledMetric<?, ?>, java.lang.Number> wildcardControlledMetricMap9 = metricsManager0.getMetricValuesMap();
        com.j256.simplemetrics.manager.MetricsManager metricsManager10 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher11 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.utils.FileMetric[] fileMetricArray12 = new com.j256.simplemetrics.utils.FileMetric[] {};
        fileMetricsPublisher11.setFileMetrics(fileMetricArray12);
        java.lang.String[] strArray14 = fileMetricsPublisher11.getMetricsValues();
        metricsManager10.registerUpdater((com.j256.simplemetrics.manager.MetricsUpdater) fileMetricsPublisher11);
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider16 = null;
        com.j256.simplemetrics.persister.CloudWatchMetricsPersister cloudWatchMetricsPersister19 = new com.j256.simplemetrics.persister.CloudWatchMetricsPersister(aWSCredentialsProvider16, "=", false);
        cloudWatchMetricsPersister19.setAddInstanceData(false);
        cloudWatchMetricsPersister19.setApplicationName("AVERAGE");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider24 = null;
        com.j256.simplemetrics.persister.CloudWatchMetricsPersister cloudWatchMetricsPersister27 = new com.j256.simplemetrics.persister.CloudWatchMetricsPersister(aWSCredentialsProvider24, "=", false);
        cloudWatchMetricsPersister27.setAddInstanceData(false);
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider30 = null;
        com.j256.simplemetrics.persister.CloudWatchMetricsPersister cloudWatchMetricsPersister33 = new com.j256.simplemetrics.persister.CloudWatchMetricsPersister(aWSCredentialsProvider30, "=", false);
        cloudWatchMetricsPersister33.initialize();
        cloudWatchMetricsPersister33.initialize();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider36 = null;
        com.j256.simplemetrics.persister.CloudWatchMetricsPersister cloudWatchMetricsPersister39 = new com.j256.simplemetrics.persister.CloudWatchMetricsPersister(aWSCredentialsProvider36, "=", false);
        cloudWatchMetricsPersister39.initialize();
        cloudWatchMetricsPersister39.initialize();
        com.amazonaws.auth.AWSCredentials aWSCredentials42 = null;
        cloudWatchMetricsPersister39.setAwsCredentials(aWSCredentials42);
        com.j256.simplemetrics.persister.MetricDetailsPersister[] metricDetailsPersisterArray44 = new com.j256.simplemetrics.persister.MetricDetailsPersister[] { cloudWatchMetricsPersister19, cloudWatchMetricsPersister27, cloudWatchMetricsPersister33, cloudWatchMetricsPersister39 };
        metricsManager10.setMetricDetailsPersisters(metricDetailsPersisterArray44);
        metricsManager0.setMetricDetailsPersisters(metricDetailsPersisterArray44);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.j256" + "'", str2, "com.j256");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardControlledMetricCollection8);
        org.junit.Assert.assertNotNull(wildcardControlledMetricMap9);
        org.junit.Assert.assertNotNull(fileMetricArray12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(metricDetailsPersisterArray44);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue0 = com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue.createInitialValue();
        java.lang.Number number1 = accumValue0.getMin();
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue2 = accumValue0.makePersisted();
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue4 = accumValue2.makeAdjusted((java.lang.Long) (-1L));
        int int5 = accumValue4.getNumSamples();
        org.junit.Assert.assertNotNull(accumValue0);
        org.junit.Assert.assertEquals("'" + number1 + "' != '" + 0L + "'", number1, 0L);
        org.junit.Assert.assertNotNull(accumValue2);
        org.junit.Assert.assertNotNull(accumValue4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        com.amazonaws.auth.AWSCredentials aWSCredentials0 = null;
        com.j256.simplemetrics.persister.CloudWatchMetricsPersister cloudWatchMetricsPersister3 = new com.j256.simplemetrics.persister.CloudWatchMetricsPersister(aWSCredentials0, "com.j256", true);
        com.amazonaws.services.cloudwatch.AmazonCloudWatch amazonCloudWatch4 = null;
        cloudWatchMetricsPersister3.setCloudWatchClient(amazonCloudWatch4);
        com.amazonaws.services.cloudwatch.AmazonCloudWatch amazonCloudWatch6 = null;
        cloudWatchMetricsPersister3.setCloudWatchClient(amazonCloudWatch6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.j256.simplemetrics.metric.ControlledMetricValue.ValueCount valueCount0 = com.j256.simplemetrics.metric.ControlledMetricValue.ValueCount.createInitialValue();
        int int1 = valueCount0.getNumSamples();
        org.junit.Assert.assertNotNull(valueCount0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = null;
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx1 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx(textFileMetricsPersister0);
        java.lang.String str2 = textFileMetricsPersisterJmx1.getJmxBeanName();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray3 = textFileMetricsPersisterJmx1.getJmxFolderNames();
        com.j256.simplemetrics.utils.FileMetricsPublisherJmx fileMetricsPublisherJmx4 = new com.j256.simplemetrics.utils.FileMetricsPublisherJmx();
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher5 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.utils.FileMetric[] fileMetricArray6 = new com.j256.simplemetrics.utils.FileMetric[] {};
        fileMetricsPublisher5.setFileMetrics(fileMetricArray6);
        java.lang.String[] strArray8 = fileMetricsPublisher5.getMetricsValues();
        fileMetricsPublisherJmx4.setJmxFolderNames(strArray8);
        textFileMetricsPersisterJmx1.setJmxFolderNames(strArray8);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jmxFolderNameArray3);
        org.junit.Assert.assertNotNull(fileMetricArray6);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.j256.simplemetrics.manager.MetricsManager metricsManager0 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher1 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.utils.FileMetric[] fileMetricArray2 = new com.j256.simplemetrics.utils.FileMetric[] {};
        fileMetricsPublisher1.setFileMetrics(fileMetricArray2);
        java.lang.String[] strArray4 = fileMetricsPublisher1.getMetricsValues();
        metricsManager0.registerUpdater((com.j256.simplemetrics.manager.MetricsUpdater) fileMetricsPublisher1);
        long long6 = fileMetricsPublisher1.getFailedUpdateCount();
        com.j256.simplemetrics.manager.MetricsManager metricsManager7 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx8 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str9 = metricsManagerJmx8.getJmxDomainName();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx8.setJmxFolderNames(strArray12);
        metricsManager7.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx8);
        java.util.Collection<com.j256.simplemetrics.metric.ControlledMetric<?, ?>> wildcardControlledMetricCollection15 = metricsManager7.getMetrics();
        fileMetricsPublisher1.setMetricsManager(metricsManager7);
        metricsManager7.updateMetrics();
        org.junit.Assert.assertNotNull(fileMetricArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.j256" + "'", str9, "com.j256");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardControlledMetricCollection15);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue ratioValue0 = com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue.createInitialValue();
        com.j256.simplemetrics.metric.ControlledMetricRatio.NumeratorDenominator numeratorDenominator3 = new com.j256.simplemetrics.metric.ControlledMetricRatio.NumeratorDenominator((double) '#', (double) (-1.0f));
        com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue ratioValue4 = ratioValue0.makeAdjusted(numeratorDenominator3);
        int int5 = ratioValue0.getNumSamples();
        com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue ratioValue6 = ratioValue0.makePersisted();
        java.lang.Number number7 = ratioValue6.getMax();
        org.junit.Assert.assertNotNull(ratioValue0);
        org.junit.Assert.assertNotNull(ratioValue4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(ratioValue6);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0.0d + "'", number7, 0.0d);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        controlledMetricAccum5.adjustValue((long) ' ');
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum13 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        java.lang.String str14 = controlledMetricAccum13.getUnit();
        boolean boolean15 = controlledMetricAccum5.equals((java.lang.Object) controlledMetricAccum13);
        controlledMetricAccum13.adjustValue((java.lang.Number) (short) -1);
        java.lang.Object obj18 = null;
        boolean boolean19 = controlledMetricAccum13.equals(obj18);
        java.lang.String str20 = controlledMetricAccum13.getAggregationTypeName();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.j256" + "'", str14, "com.j256");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "SUM" + "'", str20, "SUM");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        java.lang.String str6 = controlledMetricValue5.getAggregationTypeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AVERAGE" + "'", str6, "AVERAGE");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher0 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.utils.FileMetric[] fileMetricArray1 = new com.j256.simplemetrics.utils.FileMetric[] {};
        fileMetricsPublisher0.setFileMetrics(fileMetricArray1);
        java.lang.String[] strArray3 = fileMetricsPublisher0.getMetricsValues();
        long long4 = fileMetricsPublisher0.getFailedUpdateCount();
        org.junit.Assert.assertNotNull(fileMetricArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx0 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str1 = metricsManagerJmx0.getJmxDomainName();
        java.lang.String str2 = metricsManagerJmx0.getJmxBeanName();
        metricsManagerJmx0.setJmxDomainName("=");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray5 = metricsManagerJmx0.getJmxFolderNames();
        java.lang.String str6 = metricsManagerJmx0.getJmxBeanName();
        com.j256.simplejmx.server.JmxServer jmxServer7 = null;
        metricsManagerJmx0.setJmxServer(jmxServer7);
        java.lang.String str9 = metricsManagerJmx0.getJmxBeanName();
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx10 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str11 = metricsManagerJmx10.getJmxDomainName();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx10.setJmxFolderNames(strArray14);
        metricsManagerJmx0.setJmxFolderNames(strArray14);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.j256" + "'", str1, "com.j256");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jmxFolderNameArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.j256" + "'", str11, "com.j256");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        com.j256.simplemetrics.utils.FileMetric.FileMetricKind fileMetricKind0 = com.j256.simplemetrics.utils.FileMetric.FileMetricKind.FILE_ACCUM;
        org.junit.Assert.assertTrue("'" + fileMetricKind0 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricKind.FILE_ACCUM + "'", fileMetricKind0.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricKind.FILE_ACCUM));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx0 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str1 = metricsManagerJmx0.getJmxDomainName();
        metricsManagerJmx0.setJmxDomainName("MetricValueDetails [value=0, numSamples=0, min=0.0, max=0.0]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.j256" + "'", str1, "com.j256");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        controlledMetricAccum5.adjustValue((long) ' ');
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum13 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        java.lang.String str14 = controlledMetricAccum13.getUnit();
        boolean boolean15 = controlledMetricAccum5.equals((java.lang.Object) controlledMetricAccum13);
        controlledMetricAccum13.adjustValue((java.lang.Number) (short) -1);
        java.lang.Object obj18 = null;
        boolean boolean19 = controlledMetricAccum13.equals(obj18);
        long long21 = controlledMetricAccum13.add((long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.j256" + "'", str14, "com.j256");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9L + "'", long21 == 9L);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.j256.simplemetrics.persister.MetricsPersisterJob metricsPersisterJob0 = new com.j256.simplemetrics.persister.MetricsPersisterJob();
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher1 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.manager.MetricsManager metricsManager2 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx3 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str4 = metricsManagerJmx3.getJmxDomainName();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx3.setJmxFolderNames(strArray7);
        metricsManager2.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx3);
        fileMetricsPublisher1.setMetricsManager(metricsManager2);
        metricsPersisterJob0.setMetricsManager(metricsManager2);
        metricsPersisterJob0.initialize();
        metricsPersisterJob0.setPeriodTimeMillis((-1L));
        metricsPersisterJob0.setDelayTimeMillis((long) (byte) 10);
        java.lang.Class<?> wildcardClass17 = metricsPersisterJob0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.j256" + "'", str4, "com.j256");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio5 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.lang.Number number6 = controlledMetricRatio5.getValueToPersist();
        java.lang.Number number7 = controlledMetricRatio5.getValue();
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio13 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.lang.Number number14 = controlledMetricRatio13.getValueToPersist();
        int int15 = controlledMetricRatio5.compareTo((com.j256.simplemetrics.metric.BaseControlledMetric<com.j256.simplemetrics.metric.ControlledMetricRatio.NumeratorDenominator, com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue>) controlledMetricRatio13);
        java.lang.Number number16 = controlledMetricRatio5.getValueToPersist();
        com.j256.simplemetrics.metric.ControlledMetricRatio.NumeratorDenominator numeratorDenominator18 = controlledMetricRatio5.makeValueFromLong((long) (short) 1);
        controlledMetricRatio5.adjustValue((long) '4');
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 0L + "'", number6, 0L);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0.0d + "'", number7, 0.0d);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 0L + "'", number14, 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 0L + "'", number16, 0L);
        org.junit.Assert.assertNotNull(numeratorDenominator18);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio5 = new com.j256.simplemetrics.metric.ControlledMetricRatio("never", "com.j256", "hi!", "hi!", "com.j256");
        java.lang.Number number6 = controlledMetricRatio5.getValue();
        controlledMetricRatio5.adjustValue((long) (byte) 10);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 0.0d + "'", number6, 0.0d);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue0 = com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue.createInitialValue();
        java.lang.Number number1 = accumValue0.getMin();
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue2 = accumValue0.makePersisted();
        int int3 = accumValue2.getNumSamples();
        org.junit.Assert.assertNotNull(accumValue0);
        org.junit.Assert.assertEquals("'" + number1 + "' != '" + 0L + "'", number1, 0L);
        org.junit.Assert.assertNotNull(accumValue2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = new com.j256.simplemetrics.persister.TextFileMetricsPersister();
        textFileMetricsPersister0.setSeparatingString("=");
        textFileMetricsPersister0.setLogFileNamePrefix("never");
        long long5 = textFileMetricsPersister0.getCleanupLogCount();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails6 = controlledMetricValue5.getValueDetails();
        java.lang.Number number7 = controlledMetricValue5.getValue();
        java.lang.Number number8 = controlledMetricValue5.getValue();
        java.lang.String str9 = controlledMetricValue5.getDescription();
        org.junit.Assert.assertNotNull(metricValueDetails6);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0.0d + "'", number7, 0.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 0.0d + "'", number8, 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "=" + "'", str9, "=");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue0 = com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue.createInitialValue();
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue2 = accumValue0.makeAdjusted((java.lang.Long) 0L);
        java.lang.Number number3 = accumValue2.getMin();
        java.lang.Number number4 = accumValue2.getMin();
        org.junit.Assert.assertNotNull(accumValue0);
        org.junit.Assert.assertNotNull(accumValue2);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0L + "'", number3, 0L);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0L + "'", number4, 0L);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.j256.simplemetrics.persister.MetricsPersisterJob metricsPersisterJob0 = new com.j256.simplemetrics.persister.MetricsPersisterJob();
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher1 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.manager.MetricsManager metricsManager2 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx3 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str4 = metricsManagerJmx3.getJmxDomainName();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx3.setJmxFolderNames(strArray7);
        metricsManager2.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx3);
        fileMetricsPublisher1.setMetricsManager(metricsManager2);
        metricsPersisterJob0.setMetricsManager(metricsManager2);
        metricsPersisterJob0.initialize();
        metricsPersisterJob0.setPeriodTimeMillis((-1L));
        metricsPersisterJob0.setDaemonThread(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.j256" + "'", str4, "com.j256");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio5 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.lang.Number number6 = controlledMetricRatio5.getValueToPersist();
        java.lang.Number number7 = controlledMetricRatio5.getValue();
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails8 = controlledMetricRatio5.getValueDetails();
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio14 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.lang.Number number15 = controlledMetricRatio14.getValueToPersist();
        java.lang.Number number16 = controlledMetricRatio14.getValue();
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio22 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.lang.Number number23 = controlledMetricRatio22.getValueToPersist();
        int int24 = controlledMetricRatio14.compareTo((com.j256.simplemetrics.metric.BaseControlledMetric<com.j256.simplemetrics.metric.ControlledMetricRatio.NumeratorDenominator, com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue>) controlledMetricRatio22);
        controlledMetricRatio22.adjustValue((java.lang.Number) (byte) 100, (java.lang.Number) 1);
        int int28 = controlledMetricRatio5.compareTo((com.j256.simplemetrics.metric.BaseControlledMetric<com.j256.simplemetrics.metric.ControlledMetricRatio.NumeratorDenominator, com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue>) controlledMetricRatio22);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 0L + "'", number6, 0L);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0.0d + "'", number7, 0.0d);
        org.junit.Assert.assertNotNull(metricValueDetails8);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 0L + "'", number15, 0L);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 0.0d + "'", number16, 0.0d);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 0L + "'", number23, 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher0 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.manager.MetricsManager metricsManager1 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx2 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str3 = metricsManagerJmx2.getJmxDomainName();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx2.setJmxFolderNames(strArray6);
        metricsManager1.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx2);
        fileMetricsPublisher0.setMetricsManager(metricsManager1);
        com.j256.simplejmx.server.JmxServer jmxServer10 = null;
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx11 = new com.j256.simplemetrics.manager.MetricsManagerJmx(metricsManager1, jmxServer10);
        metricsManagerJmx11.setJmxDomainName("=.com.j256.com.j256");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.j256" + "'", str3, "com.j256");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.j256.simplemetrics.manager.MetricsManager metricsManager0 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx1 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str2 = metricsManagerJmx1.getJmxDomainName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx1.setJmxFolderNames(strArray5);
        metricsManager0.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx1);
        java.util.Collection<com.j256.simplemetrics.metric.ControlledMetric<?, ?>> wildcardControlledMetricCollection8 = metricsManager0.getMetrics();
        java.util.Map<com.j256.simplemetrics.metric.ControlledMetric<?, ?>, java.lang.Number> wildcardControlledMetricMap9 = metricsManager0.getMetricValuesMap();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider10 = null;
        com.j256.simplemetrics.persister.CloudWatchMetricsPersister cloudWatchMetricsPersister13 = new com.j256.simplemetrics.persister.CloudWatchMetricsPersister(aWSCredentialsProvider10, "=", false);
        cloudWatchMetricsPersister13.setAddInstanceData(false);
        cloudWatchMetricsPersister13.setApplicationName("AVERAGE");
        com.j256.simplemetrics.persister.MetricDetailsPersister[] metricDetailsPersisterArray18 = new com.j256.simplemetrics.persister.MetricDetailsPersister[] { cloudWatchMetricsPersister13 };
        metricsManager0.setMetricDetailsPersisters(metricDetailsPersisterArray18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.j256" + "'", str2, "com.j256");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardControlledMetricCollection8);
        org.junit.Assert.assertNotNull(wildcardControlledMetricMap9);
        org.junit.Assert.assertNotNull(metricDetailsPersisterArray18);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        controlledMetricAccum5.adjustValue((long) ' ');
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum13 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        java.lang.String str14 = controlledMetricAccum13.getUnit();
        boolean boolean15 = controlledMetricAccum5.equals((java.lang.Object) controlledMetricAccum13);
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails16 = controlledMetricAccum13.getValueDetailsToPersist();
        java.lang.String str17 = controlledMetricAccum13.getAggregationTypeName();
        com.j256.simplemetrics.metric.ControlledMetric.AggregationType aggregationType18 = controlledMetricAccum13.getAggregationType();
        java.lang.String str19 = controlledMetricAccum13.getAggregationTypeName();
        com.j256.simplemetrics.metric.ControlledMetric.AggregationType aggregationType20 = controlledMetricAccum13.getAggregationType();
        java.lang.Number number21 = controlledMetricAccum13.getValueToPersist();
        long long23 = controlledMetricAccum13.add((long) 38);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.j256" + "'", str14, "com.j256");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(metricValueDetails16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "SUM" + "'", str17, "SUM");
        org.junit.Assert.assertTrue("'" + aggregationType18 + "' != '" + com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM + "'", aggregationType18.equals(com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "SUM" + "'", str19, "SUM");
        org.junit.Assert.assertTrue("'" + aggregationType20 + "' != '" + com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM + "'", aggregationType20.equals(com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM));
        org.junit.Assert.assertEquals("'" + number21 + "' != '" + 0L + "'", number21, 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 38L + "'", long23 == 38L);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        controlledMetricAccum5.adjustValue((long) ' ');
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum13 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        java.lang.String str14 = controlledMetricAccum13.getUnit();
        boolean boolean15 = controlledMetricAccum5.equals((java.lang.Object) controlledMetricAccum13);
        java.lang.String str16 = controlledMetricAccum5.getModule();
        java.lang.String str17 = controlledMetricAccum5.getModule();
        java.lang.String str18 = controlledMetricAccum5.getModule();
        long long19 = controlledMetricAccum5.increment();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.j256" + "'", str14, "com.j256");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.j256" + "'", str16, "com.j256");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "com.j256" + "'", str17, "com.j256");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "com.j256" + "'", str18, "com.j256");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 33L + "'", long19 == 33L);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.j256.simplemetrics.metric.ControlledMetricValue.ValueCount valueCount0 = com.j256.simplemetrics.metric.ControlledMetricValue.ValueCount.createInitialValue();
        java.lang.Number number1 = valueCount0.getMin();
        java.lang.Number number2 = valueCount0.getMin();
        org.junit.Assert.assertNotNull(valueCount0);
        org.junit.Assert.assertEquals("'" + number1 + "' != '" + 0.0d + "'", number1, 0.0d);
        org.junit.Assert.assertEquals("'" + number2 + "' != '" + 0.0d + "'", number2, 0.0d);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        java.io.File file4 = null;
        java.io.File file9 = null;
        com.j256.simplemetrics.utils.FileMetric.FileMetricKind fileMetricKind10 = com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR;
        com.j256.simplemetrics.utils.FileMetric fileMetric14 = new com.j256.simplemetrics.utils.FileMetric("=", "", "", "", file9, fileMetricKind10, (int) 'a', "=", "com.j256");
        com.j256.simplemetrics.utils.FileMetric.FileMetricOperation fileMetricOperation15 = com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY;
        fileMetric14.setAdjustmentOperation(fileMetricOperation15);
        fileMetric14.setMetricModule("com.j256");
        fileMetric14.setMetricName("com.j256");
        fileMetric14.setColumn((int) ' ');
        com.j256.simplemetrics.utils.FileMetric.FileMetricOperation fileMetricOperation23 = null;
        fileMetric14.setAdjustmentOperation(fileMetricOperation23);
        fileMetric14.setMetricModule("SUM");
        com.j256.simplemetrics.utils.FileMetric.FileMetricKind fileMetricKind27 = com.j256.simplemetrics.utils.FileMetric.FileMetricKind.FILE_ACCUM_DIFF;
        fileMetric14.setKind(fileMetricKind27);
        com.j256.simplemetrics.utils.FileMetric fileMetric32 = new com.j256.simplemetrics.utils.FileMetric("MetricValueDetails [value=0, numSamples=0, min=0.0, max=0.0]", "", "=.com.j256.com.j256", "=.com.j256.com.j256", file4, fileMetricKind27, (int) 'a', "", "com.j256.=.=");
        org.junit.Assert.assertTrue("'" + fileMetricKind10 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR + "'", fileMetricKind10.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR));
        org.junit.Assert.assertTrue("'" + fileMetricOperation15 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY + "'", fileMetricOperation15.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY));
        org.junit.Assert.assertTrue("'" + fileMetricKind27 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricKind.FILE_ACCUM_DIFF + "'", fileMetricKind27.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricKind.FILE_ACCUM_DIFF));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        controlledMetricAccum5.adjustValue((long) ' ');
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum13 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        java.lang.String str14 = controlledMetricAccum13.getUnit();
        boolean boolean15 = controlledMetricAccum5.equals((java.lang.Object) controlledMetricAccum13);
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails16 = controlledMetricAccum13.getValueDetailsToPersist();
        java.lang.String str17 = controlledMetricAccum13.getAggregationTypeName();
        com.j256.simplemetrics.metric.ControlledMetric.AggregationType aggregationType18 = controlledMetricAccum13.getAggregationType();
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails19 = controlledMetricAccum13.getValueDetailsToPersist();
        com.j256.simplemetrics.metric.ControlledMetric.AggregationType aggregationType20 = controlledMetricAccum13.getAggregationType();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.j256" + "'", str14, "com.j256");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(metricValueDetails16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "SUM" + "'", str17, "SUM");
        org.junit.Assert.assertTrue("'" + aggregationType18 + "' != '" + com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM + "'", aggregationType18.equals(com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM));
        org.junit.Assert.assertNotNull(metricValueDetails19);
        org.junit.Assert.assertTrue("'" + aggregationType20 + "' != '" + com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM + "'", aggregationType20.equals(com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.j256.simplemetrics.metric.ControlledMetricTimer controlledMetricTimer4 = new com.j256.simplemetrics.metric.ControlledMetricTimer("hi!", "never", "hi!", "com.j256");
        long long6 = controlledMetricTimer4.stop((long) (byte) 10);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700471538023L + "'", long6 == 1700471538023L);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("com.j256", "=", "=", "", "com.j256");
        java.lang.String str6 = controlledMetricValue5.getName();
        controlledMetricValue5.adjustValue((java.lang.Number) 0.0d);
        com.j256.simplemetrics.metric.ControlledMetric.AggregationType aggregationType9 = controlledMetricValue5.getAggregationType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertTrue("'" + aggregationType9 + "' != '" + com.j256.simplemetrics.metric.ControlledMetric.AggregationType.AVERAGE + "'", aggregationType9.equals(com.j256.simplemetrics.metric.ControlledMetric.AggregationType.AVERAGE));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.j256.simplemetrics.manager.MetricsManager metricsManager0 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher1 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.utils.FileMetric[] fileMetricArray2 = new com.j256.simplemetrics.utils.FileMetric[] {};
        fileMetricsPublisher1.setFileMetrics(fileMetricArray2);
        java.lang.String[] strArray4 = fileMetricsPublisher1.getMetricsValues();
        metricsManager0.registerUpdater((com.j256.simplemetrics.manager.MetricsUpdater) fileMetricsPublisher1);
        long long6 = fileMetricsPublisher1.getFailedUpdateCount();
        com.j256.simplemetrics.manager.MetricsManager metricsManager7 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx8 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str9 = metricsManagerJmx8.getJmxDomainName();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx8.setJmxFolderNames(strArray12);
        metricsManager7.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx8);
        java.util.Collection<com.j256.simplemetrics.metric.ControlledMetric<?, ?>> wildcardControlledMetricCollection15 = metricsManager7.getMetrics();
        fileMetricsPublisher1.setMetricsManager(metricsManager7);
        fileMetricsPublisher1.updateMetrics();
        org.junit.Assert.assertNotNull(fileMetricArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.j256" + "'", str9, "com.j256");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardControlledMetricCollection15);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.j256.simplemetrics.manager.MetricsManager metricsManager0 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx1 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str2 = metricsManagerJmx1.getJmxDomainName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx1.setJmxFolderNames(strArray5);
        metricsManager0.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx1);
        metricsManager0.persist();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.j256" + "'", str2, "com.j256");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio5 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.lang.Number number6 = controlledMetricRatio5.getValueToPersist();
        java.lang.Number number7 = controlledMetricRatio5.getValue();
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio13 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.lang.Number number14 = controlledMetricRatio13.getValueToPersist();
        int int15 = controlledMetricRatio5.compareTo((com.j256.simplemetrics.metric.BaseControlledMetric<com.j256.simplemetrics.metric.ControlledMetricRatio.NumeratorDenominator, com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue>) controlledMetricRatio13);
        java.lang.Number number16 = controlledMetricRatio5.getValueToPersist();
        com.j256.simplemetrics.metric.ControlledMetricRatio.NumeratorDenominator numeratorDenominator18 = controlledMetricRatio5.makeValueFromLong((long) (short) 1);
        java.lang.String str19 = controlledMetricRatio5.toString();
        java.lang.String str20 = controlledMetricRatio5.getName();
        controlledMetricRatio5.adjustValue(9L);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 0L + "'", number6, 0L);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0.0d + "'", number7, 0.0d);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + 0L + "'", number14, 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 0L + "'", number16, 0L);
        org.junit.Assert.assertNotNull(numeratorDenominator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "=.hi!" + "'", str19, "=.hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        java.io.File file4 = null;
        com.j256.simplemetrics.utils.FileMetric.FileMetricKind fileMetricKind5 = com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR;
        com.j256.simplemetrics.utils.FileMetric fileMetric9 = new com.j256.simplemetrics.utils.FileMetric("=", "", "", "", file4, fileMetricKind5, (int) 'a', "=", "com.j256");
        fileMetric9.setLineSplit("hi!");
        org.junit.Assert.assertTrue("'" + fileMetricKind5 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR + "'", fileMetricKind5.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        java.lang.Number number6 = controlledMetricValue5.getValueToPersist();
        java.lang.Number number7 = controlledMetricValue5.getValueToPersist();
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 0L + "'", number6, 0L);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0L + "'", number7, 0L);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.j256.simplemetrics.utils.FileMetricsPublisherJmx fileMetricsPublisherJmx0 = new com.j256.simplemetrics.utils.FileMetricsPublisherJmx();
        com.j256.simplemetrics.manager.MetricsManager metricsManager1 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher2 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.utils.FileMetric[] fileMetricArray3 = new com.j256.simplemetrics.utils.FileMetric[] {};
        fileMetricsPublisher2.setFileMetrics(fileMetricArray3);
        java.lang.String[] strArray5 = fileMetricsPublisher2.getMetricsValues();
        metricsManager1.registerUpdater((com.j256.simplemetrics.manager.MetricsUpdater) fileMetricsPublisher2);
        long long7 = fileMetricsPublisher2.getFailedUpdateCount();
        fileMetricsPublisherJmx0.setMetricsPublisher(fileMetricsPublisher2);
        java.lang.String str9 = fileMetricsPublisherJmx0.getJmxBeanName();
        org.junit.Assert.assertNotNull(fileMetricArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        controlledMetricAccum5.adjustValue((long) ' ');
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum13 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        java.lang.String str14 = controlledMetricAccum13.getUnit();
        boolean boolean15 = controlledMetricAccum5.equals((java.lang.Object) controlledMetricAccum13);
        java.lang.String str16 = controlledMetricAccum5.getModule();
        java.lang.String str17 = controlledMetricAccum5.getModule();
        java.lang.String str18 = controlledMetricAccum5.getDescription();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.j256" + "'", str14, "com.j256");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.j256" + "'", str16, "com.j256");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "com.j256" + "'", str17, "com.j256");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.j256.simplemetrics.persister.MetricsPersisterJob metricsPersisterJob0 = new com.j256.simplemetrics.persister.MetricsPersisterJob();
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher1 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.manager.MetricsManager metricsManager2 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx3 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str4 = metricsManagerJmx3.getJmxDomainName();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx3.setJmxFolderNames(strArray7);
        metricsManager2.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx3);
        fileMetricsPublisher1.setMetricsManager(metricsManager2);
        metricsPersisterJob0.setMetricsManager(metricsManager2);
        metricsPersisterJob0.initialize();
        metricsPersisterJob0.setPeriodTimeMillis((-1L));
        metricsPersisterJob0.initialize();
        metricsPersisterJob0.initialize();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.j256" + "'", str4, "com.j256");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        controlledMetricAccum5.adjustValue((long) ' ');
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum13 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        java.lang.String str14 = controlledMetricAccum13.getUnit();
        boolean boolean15 = controlledMetricAccum5.equals((java.lang.Object) controlledMetricAccum13);
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails16 = controlledMetricAccum13.getValueDetailsToPersist();
        java.lang.String str17 = controlledMetricAccum13.getAggregationTypeName();
        com.j256.simplemetrics.metric.ControlledMetric.AggregationType aggregationType18 = controlledMetricAccum13.getAggregationType();
        java.lang.String str19 = controlledMetricAccum13.getAggregationTypeName();
        com.j256.simplemetrics.metric.ControlledMetric.AggregationType aggregationType20 = controlledMetricAccum13.getAggregationType();
        java.lang.Number number21 = controlledMetricAccum13.getValueToPersist();
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum27 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        controlledMetricAccum27.adjustValue((long) ' ');
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum35 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        java.lang.String str36 = controlledMetricAccum35.getUnit();
        boolean boolean37 = controlledMetricAccum27.equals((java.lang.Object) controlledMetricAccum35);
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails38 = controlledMetricAccum35.getValueDetailsToPersist();
        java.lang.String str39 = controlledMetricAccum35.getAggregationTypeName();
        com.j256.simplemetrics.metric.ControlledMetric.AggregationType aggregationType40 = controlledMetricAccum35.getAggregationType();
        java.lang.String str41 = controlledMetricAccum35.getAggregationTypeName();
        java.lang.String str42 = controlledMetricAccum35.getName();
        int int43 = controlledMetricAccum13.compareTo((com.j256.simplemetrics.metric.BaseControlledMetric<java.lang.Long, com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue>) controlledMetricAccum35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.j256" + "'", str14, "com.j256");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(metricValueDetails16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "SUM" + "'", str17, "SUM");
        org.junit.Assert.assertTrue("'" + aggregationType18 + "' != '" + com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM + "'", aggregationType18.equals(com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "SUM" + "'", str19, "SUM");
        org.junit.Assert.assertTrue("'" + aggregationType20 + "' != '" + com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM + "'", aggregationType20.equals(com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM));
        org.junit.Assert.assertEquals("'" + number21 + "' != '" + 0L + "'", number21, 0L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "com.j256" + "'", str36, "com.j256");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(metricValueDetails38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "SUM" + "'", str39, "SUM");
        org.junit.Assert.assertTrue("'" + aggregationType40 + "' != '" + com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM + "'", aggregationType40.equals(com.j256.simplemetrics.metric.ControlledMetric.AggregationType.SUM));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "SUM" + "'", str41, "SUM");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "com.j256" + "'", str42, "com.j256");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        controlledMetricAccum5.adjustValue((long) ' ');
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum13 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        java.lang.String str14 = controlledMetricAccum13.getUnit();
        boolean boolean15 = controlledMetricAccum5.equals((java.lang.Object) controlledMetricAccum13);
        controlledMetricAccum13.adjustValue((java.lang.Number) (short) -1);
        java.lang.Number number18 = controlledMetricAccum13.getValue();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.j256" + "'", str14, "com.j256");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0L + "'", number18, 0L);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        controlledMetricValue5.adjustValue((java.lang.Number) (-1.0d));
        java.lang.String str8 = controlledMetricValue5.getAggregationTypeName();
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails9 = controlledMetricValue5.getValueDetails();
        java.lang.String str10 = controlledMetricValue5.getName();
        java.lang.Number number11 = controlledMetricValue5.getValueToPersist();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AVERAGE" + "'", str8, "AVERAGE");
        org.junit.Assert.assertNotNull(metricValueDetails9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.j256" + "'", str10, "com.j256");
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (-1L) + "'", number11, (-1L));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.j256.simplemetrics.utils.SystemMetricsPublisher systemMetricsPublisher0 = new com.j256.simplemetrics.utils.SystemMetricsPublisher();
        com.j256.simplemetrics.manager.MetricsManager metricsManager1 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher2 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.utils.FileMetric[] fileMetricArray3 = new com.j256.simplemetrics.utils.FileMetric[] {};
        fileMetricsPublisher2.setFileMetrics(fileMetricArray3);
        java.lang.String[] strArray5 = fileMetricsPublisher2.getMetricsValues();
        metricsManager1.registerUpdater((com.j256.simplemetrics.manager.MetricsUpdater) fileMetricsPublisher2);
        long long7 = fileMetricsPublisher2.getFailedUpdateCount();
        com.j256.simplemetrics.manager.MetricsManager metricsManager8 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx9 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str10 = metricsManagerJmx9.getJmxDomainName();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx9.setJmxFolderNames(strArray13);
        metricsManager8.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx9);
        java.util.Collection<com.j256.simplemetrics.metric.ControlledMetric<?, ?>> wildcardControlledMetricCollection16 = metricsManager8.getMetrics();
        fileMetricsPublisher2.setMetricsManager(metricsManager8);
        systemMetricsPublisher0.setMetricsManager(metricsManager8);
        com.j256.simplemetrics.persister.MetricDetailsPersister[] metricDetailsPersisterArray19 = null;
        metricsManager8.setMetricDetailsPersisters(metricDetailsPersisterArray19);
        java.lang.String[] strArray21 = metricsManager8.getMetricValues();
        org.junit.Assert.assertNotNull(fileMetricArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.j256" + "'", str10, "com.j256");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardControlledMetricCollection16);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue ratioValue0 = com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue.createInitialValue();
        java.lang.Number number1 = ratioValue0.getMin();
        java.lang.Number number2 = ratioValue0.getMax();
        com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue ratioValue3 = com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue.createInitialValue();
        com.j256.simplemetrics.metric.ControlledMetricRatio.NumeratorDenominator numeratorDenominator6 = new com.j256.simplemetrics.metric.ControlledMetricRatio.NumeratorDenominator((double) '#', (double) (-1.0f));
        com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue ratioValue7 = ratioValue3.makeAdjusted(numeratorDenominator6);
        com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue ratioValue8 = ratioValue0.makeAdjusted(numeratorDenominator6);
        com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue ratioValue9 = ratioValue8.makePersisted();
        java.lang.Number number10 = ratioValue8.getMin();
        org.junit.Assert.assertNotNull(ratioValue0);
        org.junit.Assert.assertEquals("'" + number1 + "' != '" + 0.0d + "'", number1, 0.0d);
        org.junit.Assert.assertEquals("'" + number2 + "' != '" + 0.0d + "'", number2, 0.0d);
        org.junit.Assert.assertNotNull(ratioValue3);
        org.junit.Assert.assertNotNull(ratioValue7);
        org.junit.Assert.assertNotNull(ratioValue8);
        org.junit.Assert.assertNotNull(ratioValue9);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + (-35.0d) + "'", number10, (-35.0d));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue0 = com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue.createInitialValue();
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue1 = accumValue0.makePersisted();
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue2 = accumValue0.makePersisted();
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue4 = accumValue0.makeAdjusted((java.lang.Long) 33L);
        org.junit.Assert.assertNotNull(accumValue0);
        org.junit.Assert.assertNotNull(accumValue1);
        org.junit.Assert.assertNotNull(accumValue2);
        org.junit.Assert.assertNotNull(accumValue4);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        java.io.File file4 = null;
        com.j256.simplemetrics.utils.FileMetric.FileMetricKind fileMetricKind5 = com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR;
        com.j256.simplemetrics.utils.FileMetric fileMetric9 = new com.j256.simplemetrics.utils.FileMetric("=", "", "", "", file4, fileMetricKind5, (int) 'a', "=", "com.j256");
        com.j256.simplemetrics.utils.FileMetric.FileMetricOperation fileMetricOperation10 = com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY;
        fileMetric9.setAdjustmentOperation(fileMetricOperation10);
        fileMetric9.setAdjustmentValue((long) (short) 1);
        fileMetric9.setRequired(false);
        fileMetric9.setPrefix("");
        org.junit.Assert.assertTrue("'" + fileMetricKind5 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR + "'", fileMetricKind5.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR));
        org.junit.Assert.assertTrue("'" + fileMetricOperation10 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY + "'", fileMetricOperation10.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        com.j256.simplemetrics.metric.ControlledMetric.AggregationType aggregationType6 = controlledMetricValue5.getAggregationType();
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails7 = controlledMetricValue5.getValueDetailsToPersist();
        controlledMetricValue5.adjustValue((long) (short) 1);
        java.lang.String str10 = controlledMetricValue5.getDescription();
        org.junit.Assert.assertTrue("'" + aggregationType6 + "' != '" + com.j256.simplemetrics.metric.ControlledMetric.AggregationType.AVERAGE + "'", aggregationType6.equals(com.j256.simplemetrics.metric.ControlledMetric.AggregationType.AVERAGE));
        org.junit.Assert.assertNotNull(metricValueDetails7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "=" + "'", str10, "=");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        java.lang.String str6 = controlledMetricValue5.getComponent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = new com.j256.simplemetrics.persister.TextFileMetricsPersister();
        textFileMetricsPersister0.setSeparatingString("=");
        java.lang.String str3 = textFileMetricsPersister0.getLastDumpTimeMillisString();
        java.lang.String str4 = textFileMetricsPersister0.getLogFileNamePrefix();
        java.io.File file5 = textFileMetricsPersister0.getOutputDirectory();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "never" + "'", str3, "never");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(file5);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx0 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str1 = metricsManagerJmx0.getJmxDomainName();
        com.j256.simplemetrics.manager.MetricsManager metricsManager2 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx3 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str4 = metricsManagerJmx3.getJmxDomainName();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx3.setJmxFolderNames(strArray7);
        metricsManager2.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx3);
        java.util.Collection<com.j256.simplemetrics.metric.ControlledMetric<?, ?>> wildcardControlledMetricCollection10 = metricsManager2.getMetrics();
        metricsManagerJmx0.setMetricsManager(metricsManager2);
        java.lang.String str12 = metricsManagerJmx0.getJmxDomainName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.j256" + "'", str1, "com.j256");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.j256" + "'", str4, "com.j256");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardControlledMetricCollection10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.j256" + "'", str12, "com.j256");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio5 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=.com.j256.com.j256", "AVERAGE", "MetricValueDetails [value=0, numSamples=0, min=0.0, max=0.0]", "hi!", "com.j256.=.=");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.j256.simplemetrics.persister.CloudWatchMetricsPersister cloudWatchMetricsPersister0 = new com.j256.simplemetrics.persister.CloudWatchMetricsPersister();
        com.amazonaws.services.cloudwatch.AmazonCloudWatch amazonCloudWatch1 = null;
        cloudWatchMetricsPersister0.setCloudWatchClient(amazonCloudWatch1);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue0 = com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue.createInitialValue();
        java.lang.Number number1 = accumValue0.getMin();
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue2 = accumValue0.makePersisted();
        java.lang.Number number3 = accumValue0.getMin();
        int int4 = accumValue0.getNumSamples();
        int int5 = accumValue0.getNumSamples();
        org.junit.Assert.assertNotNull(accumValue0);
        org.junit.Assert.assertEquals("'" + number1 + "' != '" + 0L + "'", number1, 0L);
        org.junit.Assert.assertNotNull(accumValue2);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0L + "'", number3, 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        com.j256.simplemetrics.metric.ControlledMetric.AggregationType aggregationType6 = controlledMetricValue5.getAggregationType();
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails7 = controlledMetricValue5.getValueDetailsToPersist();
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails8 = controlledMetricValue5.getValueDetails();
        org.junit.Assert.assertTrue("'" + aggregationType6 + "' != '" + com.j256.simplemetrics.metric.ControlledMetric.AggregationType.AVERAGE + "'", aggregationType6.equals(com.j256.simplemetrics.metric.ControlledMetric.AggregationType.AVERAGE));
        org.junit.Assert.assertNotNull(metricValueDetails7);
        org.junit.Assert.assertNotNull(metricValueDetails8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.j256.simplemetrics.manager.MetricsManager metricsManager0 = new com.j256.simplemetrics.manager.MetricsManager();
        metricsManager0.persist();
        metricsManager0.persist();
        java.util.Map<com.j256.simplemetrics.metric.ControlledMetric<?, ?>, java.lang.Number> wildcardControlledMetricMap3 = metricsManager0.getMetricValuesMap();
        com.j256.simplemetrics.persister.MetricsPersisterJob metricsPersisterJob7 = new com.j256.simplemetrics.persister.MetricsPersisterJob(metricsManager0, (long) '#', (long) (byte) -1, true);
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher8 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.manager.MetricsManager metricsManager9 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx10 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str11 = metricsManagerJmx10.getJmxDomainName();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx10.setJmxFolderNames(strArray14);
        metricsManager9.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx10);
        fileMetricsPublisher8.setMetricsManager(metricsManager9);
        com.j256.simplejmx.server.JmxServer jmxServer18 = null;
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx19 = new com.j256.simplemetrics.manager.MetricsManagerJmx(metricsManager9, jmxServer18);
        metricsManager0.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx19);
        org.junit.Assert.assertNotNull(wildcardControlledMetricMap3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.j256" + "'", str11, "com.j256");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = new com.j256.simplemetrics.persister.TextFileMetricsPersister();
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx1 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx(textFileMetricsPersister0);
        java.lang.String str2 = textFileMetricsPersisterJmx1.getJmxBeanName();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.j256.simplemetrics.manager.MetricsManager metricsManager0 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx1 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str2 = metricsManagerJmx1.getJmxDomainName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx1.setJmxFolderNames(strArray5);
        metricsManager0.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx1);
        java.lang.String str8 = metricsManagerJmx1.getJmxBeanName();
        java.lang.String[] strArray15 = new java.lang.String[] { "AVERAGE", "MetricValueDetails [value=0, numSamples=0, min=0.0, max=0.0]", "SUM", "com.j256.=.=", "=.com.j256.com.j256", "MetricValueDetails [value=0, numSamples=0, min=0.0, max=0.0]" };
        metricsManagerJmx1.setJmxFolderNames(strArray15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.j256" + "'", str2, "com.j256");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        com.j256.simplemetrics.metric.ControlledMetric.AggregationType aggregationType6 = controlledMetricValue5.getAggregationType();
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails7 = controlledMetricValue5.getValueDetailsToPersist();
        controlledMetricValue5.adjustValue((long) (short) 1);
        java.lang.String str10 = controlledMetricValue5.getComponent();
        org.junit.Assert.assertTrue("'" + aggregationType6 + "' != '" + com.j256.simplemetrics.metric.ControlledMetric.AggregationType.AVERAGE + "'", aggregationType6.equals(com.j256.simplemetrics.metric.ControlledMetric.AggregationType.AVERAGE));
        org.junit.Assert.assertNotNull(metricValueDetails7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "=" + "'", str10, "=");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio5 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.lang.Number number6 = controlledMetricRatio5.getValueToPersist();
        com.j256.simplemetrics.metric.ControlledMetricRatio.NumeratorDenominator numeratorDenominator8 = controlledMetricRatio5.makeValueFromLong(1L);
        java.lang.Number number9 = controlledMetricRatio5.getValueToPersist();
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 0L + "'", number6, 0L);
        org.junit.Assert.assertNotNull(numeratorDenominator8);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 0L + "'", number9, 0L);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio5 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.lang.Number number6 = controlledMetricRatio5.getValueToPersist();
        com.j256.simplemetrics.metric.ControlledMetricRatio.RatioValue ratioValue7 = controlledMetricRatio5.createInitialValue();
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 0L + "'", number6, 0L);
        org.junit.Assert.assertNotNull(ratioValue7);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = null;
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx1 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx(textFileMetricsPersister0);
        java.lang.String str2 = textFileMetricsPersisterJmx1.getJmxBeanName();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray3 = textFileMetricsPersisterJmx1.getJmxFolderNames();
        textFileMetricsPersisterJmx1.setJmxDomainName("hi!");
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx6 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str7 = metricsManagerJmx6.getJmxDomainName();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx6.setJmxFolderNames(strArray10);
        textFileMetricsPersisterJmx1.setJmxFolderNames(strArray10);
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray13 = textFileMetricsPersisterJmx1.getJmxFolderNames();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file14 = textFileMetricsPersisterJmx1.getOutputDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jmxFolderNameArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.j256" + "'", str7, "com.j256");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(jmxFolderNameArray13);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = new com.j256.simplemetrics.persister.TextFileMetricsPersister();
        textFileMetricsPersister0.setSeparatingString("=");
        textFileMetricsPersister0.setLogFileNamePrefix("=");
        boolean boolean5 = textFileMetricsPersister0.isShowDescription();
        java.lang.String str6 = textFileMetricsPersister0.getLastDumpTimeMillisString();
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            textFileMetricsPersister0.setOutputDirectory(file7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "never" + "'", str6, "never");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails6 = controlledMetricValue5.getValueDetails();
        java.lang.Number number7 = controlledMetricValue5.getValue();
        java.lang.Number number8 = controlledMetricValue5.getValue();
        java.lang.String str9 = controlledMetricValue5.getName();
        java.lang.Number number10 = controlledMetricValue5.getValueToPersist();
        org.junit.Assert.assertNotNull(metricValueDetails6);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0.0d + "'", number7, 0.0d);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 0.0d + "'", number8, 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.j256" + "'", str9, "com.j256");
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + 0L + "'", number10, 0L);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        java.io.File file4 = null;
        com.j256.simplemetrics.utils.FileMetric.FileMetricKind fileMetricKind5 = com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR;
        com.j256.simplemetrics.utils.FileMetric fileMetric9 = new com.j256.simplemetrics.utils.FileMetric("=", "", "", "", file4, fileMetricKind5, (int) 'a', "=", "com.j256");
        com.j256.simplemetrics.utils.FileMetric.FileMetricOperation fileMetricOperation10 = com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY;
        fileMetric9.setAdjustmentOperation(fileMetricOperation10);
        fileMetric9.setMetricComponent("");
        fileMetric9.setMetricModule("AVERAGE");
        fileMetric9.setAdjustmentValue((long) (-1));
        fileMetric9.setMetricFile("com.j256.=.=");
        org.junit.Assert.assertTrue("'" + fileMetricKind5 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR + "'", fileMetricKind5.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR));
        org.junit.Assert.assertTrue("'" + fileMetricOperation10 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY + "'", fileMetricOperation10.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        controlledMetricAccum5.adjustValue((long) ' ');
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue8 = controlledMetricAccum5.createInitialValue();
        com.j256.simplemetrics.metric.ControlledMetricAccum.AccumValue accumValue9 = accumValue8.makePersisted();
        org.junit.Assert.assertNotNull(accumValue8);
        org.junit.Assert.assertNotNull(accumValue9);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        java.io.File file4 = null;
        com.j256.simplemetrics.utils.FileMetric.FileMetricKind fileMetricKind5 = null;
        com.j256.simplemetrics.utils.FileMetric fileMetric9 = new com.j256.simplemetrics.utils.FileMetric("com.j256.=.=", "never", "hi!", "", file4, fileMetricKind5, (int) (byte) 100, "com.j256", "");
        fileMetric9.setUnit("MetricValueDetails [value=0, numSamples=0, min=0.0, max=0.0]");
        fileMetric9.setAdjustmentValue((double) (short) 100);
        fileMetric9.setMetricFile("com.j256.=.=");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.io.File file4 = null;
        com.j256.simplemetrics.utils.FileMetric.FileMetricKind fileMetricKind5 = com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR;
        com.j256.simplemetrics.utils.FileMetric fileMetric9 = new com.j256.simplemetrics.utils.FileMetric("=", "", "", "", file4, fileMetricKind5, (int) 'a', "=", "com.j256");
        com.j256.simplemetrics.utils.FileMetric.FileMetricOperation fileMetricOperation10 = com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY;
        fileMetric9.setAdjustmentOperation(fileMetricOperation10);
        fileMetric9.setMetricModule("com.j256");
        fileMetric9.setMetricName("com.j256");
        fileMetric9.setColumn((int) ' ');
        com.j256.simplemetrics.utils.FileMetric.FileMetricOperation fileMetricOperation18 = null;
        fileMetric9.setAdjustmentOperation(fileMetricOperation18);
        fileMetric9.setMetricComponent("=.hi!");
        org.junit.Assert.assertTrue("'" + fileMetricKind5 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR + "'", fileMetricKind5.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR));
        org.junit.Assert.assertTrue("'" + fileMetricOperation10 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY + "'", fileMetricOperation10.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.j256.simplemetrics.metric.ControlledMetricValue.ValueCount valueCount0 = com.j256.simplemetrics.metric.ControlledMetricValue.ValueCount.createInitialValue();
        java.lang.Number number1 = valueCount0.getMin();
        com.j256.simplemetrics.metric.ControlledMetricValue.ValueCount valueCount3 = valueCount0.makeAdjusted((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(valueCount0);
        org.junit.Assert.assertEquals("'" + number1 + "' != '" + 0.0d + "'", number1, 0.0d);
        org.junit.Assert.assertNotNull(valueCount3);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = new com.j256.simplemetrics.persister.TextFileMetricsPersister();
        textFileMetricsPersister0.setSeparatingString("=");
        textFileMetricsPersister0.setLogFileNamePrefix("never");
        textFileMetricsPersister0.setSeparatingString("=.com.j256.com.j256");
        textFileMetricsPersister0.setSeparatingString("");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio5 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.lang.Number number6 = controlledMetricRatio5.getValueToPersist();
        java.lang.Number number7 = controlledMetricRatio5.getValue();
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails8 = controlledMetricRatio5.getValueDetails();
        java.lang.Object obj9 = null;
        boolean boolean10 = controlledMetricRatio5.equals(obj9);
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails11 = controlledMetricRatio5.getValueDetailsToPersist();
        java.lang.Number number12 = controlledMetricRatio5.getValue();
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 0L + "'", number6, 0L);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0.0d + "'", number7, 0.0d);
        org.junit.Assert.assertNotNull(metricValueDetails8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(metricValueDetails11);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 0.0d + "'", number12, 0.0d);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        controlledMetricAccum5.adjustValue((long) ' ');
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum13 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        java.lang.String str14 = controlledMetricAccum13.getUnit();
        boolean boolean15 = controlledMetricAccum5.equals((java.lang.Object) controlledMetricAccum13);
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails16 = controlledMetricAccum13.getValueDetailsToPersist();
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue22 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        controlledMetricValue22.adjustValue((java.lang.Number) (-1.0d));
        java.lang.String str25 = controlledMetricValue22.getAggregationTypeName();
        boolean boolean26 = controlledMetricAccum13.equals((java.lang.Object) str25);
        java.lang.String str27 = controlledMetricAccum13.getUnit();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.j256" + "'", str14, "com.j256");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(metricValueDetails16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "AVERAGE" + "'", str25, "AVERAGE");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "com.j256" + "'", str27, "com.j256");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.j256.simplemetrics.metric.ControlledMetricTimer controlledMetricTimer4 = new com.j256.simplemetrics.metric.ControlledMetricTimer("hi!", "never", "hi!", "com.j256");
        long long6 = controlledMetricTimer4.stop((long) 100);
        long long7 = controlledMetricTimer4.start();
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700471540565L + "'", long6 == 1700471540565L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700471540665L + "'", long7 == 1700471540665L);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher0 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.utils.FileMetric[] fileMetricArray1 = new com.j256.simplemetrics.utils.FileMetric[] {};
        fileMetricsPublisher0.setFileMetrics(fileMetricArray1);
        com.j256.simplemetrics.manager.MetricsManager metricsManager3 = new com.j256.simplemetrics.manager.MetricsManager();
        metricsManager3.persist();
        fileMetricsPublisher0.setMetricsManager(metricsManager3);
        metricsManager3.persistValuesOnly();
        java.lang.String[] strArray7 = metricsManager3.getMetricValues();
        com.j256.simplemetrics.manager.MetricsManager metricsManager8 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx9 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str10 = metricsManagerJmx9.getJmxDomainName();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx9.setJmxFolderNames(strArray13);
        metricsManager8.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx9);
        java.lang.String str16 = metricsManagerJmx9.getJmxBeanName();
        metricsManager3.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx9);
        metricsManagerJmx9.setJmxDomainName("never");
        org.junit.Assert.assertNotNull(fileMetricArray1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.j256" + "'", str10, "com.j256");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.j256.simplemetrics.metric.ControlledMetricValue.ValueCount valueCount0 = com.j256.simplemetrics.metric.ControlledMetricValue.ValueCount.createInitialValue();
        com.j256.simplemetrics.metric.ControlledMetricValue.ValueCount valueCount2 = valueCount0.makeAdjusted((java.lang.Double) 0.0d);
        com.j256.simplemetrics.metric.ControlledMetricValue.ValueCount valueCount3 = valueCount2.makePersisted();
        java.lang.Number number4 = valueCount2.getMin();
        org.junit.Assert.assertNotNull(valueCount0);
        org.junit.Assert.assertNotNull(valueCount2);
        org.junit.Assert.assertNotNull(valueCount3);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 0.0d + "'", number4, 0.0d);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = null;
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx1 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx(textFileMetricsPersister0);
        java.lang.String str2 = textFileMetricsPersisterJmx1.getJmxBeanName();
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister3 = null;
        textFileMetricsPersisterJmx1.setMetricsPersister(textFileMetricsPersister3);
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister5 = new com.j256.simplemetrics.persister.TextFileMetricsPersister();
        textFileMetricsPersisterJmx1.setMetricsPersister(textFileMetricsPersister5);
        java.lang.String str7 = textFileMetricsPersisterJmx1.getLogFileNamePrefix();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = new com.j256.simplemetrics.persister.TextFileMetricsPersister();
        boolean boolean1 = textFileMetricsPersister0.isShowDescription();
        java.lang.String str2 = textFileMetricsPersister0.getLastDumpTimeMillisString();
        textFileMetricsPersister0.setShowDescription(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "never" + "'", str2, "never");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        controlledMetricAccum5.adjustValue((long) ' ');
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum13 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        java.lang.String str14 = controlledMetricAccum13.getUnit();
        boolean boolean15 = controlledMetricAccum5.equals((java.lang.Object) controlledMetricAccum13);
        java.lang.String str16 = controlledMetricAccum13.getUnit();
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue22 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        controlledMetricValue22.adjustValue((java.lang.Number) (-1.0d));
        java.lang.String str25 = controlledMetricValue22.getAggregationTypeName();
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails26 = controlledMetricValue22.getValueDetails();
        java.lang.String str27 = controlledMetricValue22.getName();
        boolean boolean28 = controlledMetricAccum13.equals((java.lang.Object) str27);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.j256" + "'", str14, "com.j256");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.j256" + "'", str16, "com.j256");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "AVERAGE" + "'", str25, "AVERAGE");
        org.junit.Assert.assertNotNull(metricValueDetails26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "com.j256" + "'", str27, "com.j256");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.j256.simplemetrics.manager.MetricsManager metricsManager0 = new com.j256.simplemetrics.manager.MetricsManager();
        metricsManager0.persist();
        metricsManager0.persist();
        java.util.Map<com.j256.simplemetrics.metric.ControlledMetric<?, ?>, java.lang.Number> wildcardControlledMetricMap3 = metricsManager0.getMetricValuesMap();
        com.j256.simplemetrics.persister.MetricsPersisterJob metricsPersisterJob7 = new com.j256.simplemetrics.persister.MetricsPersisterJob(metricsManager0, (long) '#', (long) (byte) -1, true);
        java.util.Collection<com.j256.simplemetrics.metric.ControlledMetric<?, ?>> wildcardControlledMetricCollection8 = metricsManager0.getMetrics();
        org.junit.Assert.assertNotNull(wildcardControlledMetricMap3);
        org.junit.Assert.assertNotNull(wildcardControlledMetricCollection8);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        controlledMetricAccum5.adjustValue((long) ' ');
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum13 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        java.lang.String str14 = controlledMetricAccum13.getUnit();
        boolean boolean15 = controlledMetricAccum5.equals((java.lang.Object) controlledMetricAccum13);
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails16 = controlledMetricAccum13.getValueDetailsToPersist();
        controlledMetricAccum13.adjustValue((long) (short) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.j256" + "'", str14, "com.j256");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(metricValueDetails16);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.j256.simplemetrics.persister.CloudWatchMetricsPersister cloudWatchMetricsPersister0 = new com.j256.simplemetrics.persister.CloudWatchMetricsPersister();
        cloudWatchMetricsPersister0.setApplicationName("AVERAGE");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        com.j256.simplemetrics.manager.MetricsManager metricsManager0 = new com.j256.simplemetrics.manager.MetricsManager();
        metricsManager0.persist();
        metricsManager0.persist();
        com.j256.simplemetrics.manager.MetricsRegisterListener metricsRegisterListener3 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricsManager0.registerRegisterListener(metricsRegisterListener3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.j256.simplemetrics.persister.MetricsPersisterJob metricsPersisterJob0 = new com.j256.simplemetrics.persister.MetricsPersisterJob();
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher1 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.manager.MetricsManager metricsManager2 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx3 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str4 = metricsManagerJmx3.getJmxDomainName();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx3.setJmxFolderNames(strArray7);
        metricsManager2.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx3);
        fileMetricsPublisher1.setMetricsManager(metricsManager2);
        metricsPersisterJob0.setMetricsManager(metricsManager2);
        metricsPersisterJob0.initialize();
        metricsPersisterJob0.setPeriodTimeMillis((-1L));
        metricsPersisterJob0.setDelayTimeMillis((long) (byte) 10);
        metricsPersisterJob0.initialize();
        com.j256.simplemetrics.manager.MetricsManager metricsManager18 = null;
        metricsPersisterJob0.setMetricsManager(metricsManager18);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.j256" + "'", str4, "com.j256");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        com.j256.simplemetrics.metric.ControlledMetric.AggregationType aggregationType6 = controlledMetricValue5.getAggregationType();
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails7 = controlledMetricValue5.getValueDetailsToPersist();
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue13 = new com.j256.simplemetrics.metric.ControlledMetricValue("com.j256", "=", "=", "", "com.j256");
        java.lang.String str14 = controlledMetricValue13.getName();
        int int15 = controlledMetricValue5.compareTo((com.j256.simplemetrics.metric.BaseControlledMetric<java.lang.Double, com.j256.simplemetrics.metric.ControlledMetricValue.ValueCount>) controlledMetricValue13);
        org.junit.Assert.assertTrue("'" + aggregationType6 + "' != '" + com.j256.simplemetrics.metric.ControlledMetric.AggregationType.AVERAGE + "'", aggregationType6.equals(com.j256.simplemetrics.metric.ControlledMetric.AggregationType.AVERAGE));
        org.junit.Assert.assertNotNull(metricValueDetails7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "=" + "'", str14, "=");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-38) + "'", int15 == (-38));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        com.j256.simplemetrics.metric.ControlledMetric.AggregationType aggregationType6 = controlledMetricValue5.getAggregationType();
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails7 = controlledMetricValue5.getValueDetailsToPersist();
        java.lang.String str8 = metricValueDetails7.toString();
        int int9 = metricValueDetails7.getNumSamples();
        org.junit.Assert.assertTrue("'" + aggregationType6 + "' != '" + com.j256.simplemetrics.metric.ControlledMetric.AggregationType.AVERAGE + "'", aggregationType6.equals(com.j256.simplemetrics.metric.ControlledMetric.AggregationType.AVERAGE));
        org.junit.Assert.assertNotNull(metricValueDetails7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MetricValueDetails [value=0, numSamples=0, min=0.0, max=0.0]" + "'", str8, "MetricValueDetails [value=0, numSamples=0, min=0.0, max=0.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider0 = null;
        com.j256.simplemetrics.persister.CloudWatchMetricsPersister cloudWatchMetricsPersister3 = new com.j256.simplemetrics.persister.CloudWatchMetricsPersister(aWSCredentialsProvider0, "=", false);
        cloudWatchMetricsPersister3.setAddInstanceData(false);
        cloudWatchMetricsPersister3.setApplicationName("AVERAGE");
        cloudWatchMetricsPersister3.setNameSpacePrefix("com.j256");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        java.io.File file4 = null;
        com.j256.simplemetrics.utils.FileMetric.FileMetricKind fileMetricKind5 = com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR;
        com.j256.simplemetrics.utils.FileMetric fileMetric9 = new com.j256.simplemetrics.utils.FileMetric("=", "", "", "", file4, fileMetricKind5, (int) 'a', "=", "com.j256");
        com.j256.simplemetrics.utils.FileMetric.FileMetricOperation fileMetricOperation10 = com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY;
        fileMetric9.setAdjustmentOperation(fileMetricOperation10);
        fileMetric9.setMetricComponent("");
        fileMetric9.setMetricModule("AVERAGE");
        fileMetric9.setAdjustmentValue((long) (-1));
        fileMetric9.setAdjustmentValue((-1L));
        org.junit.Assert.assertTrue("'" + fileMetricKind5 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR + "'", fileMetricKind5.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR));
        org.junit.Assert.assertTrue("'" + fileMetricOperation10 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY + "'", fileMetricOperation10.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricOperation.MULTIPLY));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx0 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx();
        java.lang.String str1 = textFileMetricsPersisterJmx0.getJmxBeanName();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.j256.simplemetrics.manager.MetricsManager metricsManager0 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister1 = new com.j256.simplemetrics.persister.TextFileMetricsPersister();
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister2 = new com.j256.simplemetrics.persister.TextFileMetricsPersister();
        textFileMetricsPersister2.setSeparatingString("=");
        com.j256.simplemetrics.persister.MetricValuesPersister[] metricValuesPersisterArray5 = new com.j256.simplemetrics.persister.MetricValuesPersister[] { textFileMetricsPersister1, textFileMetricsPersister2 };
        metricsManager0.setMetricValuesPersisters(metricValuesPersisterArray5);
        com.j256.simplejmx.server.JmxServer jmxServer7 = null;
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx8 = new com.j256.simplemetrics.manager.MetricsManagerJmx(metricsManager0, jmxServer7);
        org.junit.Assert.assertNotNull(metricValuesPersisterArray5);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = null;
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx1 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx(textFileMetricsPersister0);
        java.lang.String str2 = textFileMetricsPersisterJmx1.getJmxBeanName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = textFileMetricsPersisterJmx1.getLastDumpTimeMillisString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        controlledMetricValue5.adjustValue((java.lang.Number) (-1.0d));
        java.lang.String str8 = controlledMetricValue5.getAggregationTypeName();
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails9 = controlledMetricValue5.getValueDetails();
        int int10 = metricValueDetails9.getNumSamples();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AVERAGE" + "'", str8, "AVERAGE");
        org.junit.Assert.assertNotNull(metricValueDetails9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        controlledMetricAccum5.adjustValue((long) ' ');
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum13 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        java.lang.String str14 = controlledMetricAccum13.getUnit();
        boolean boolean15 = controlledMetricAccum5.equals((java.lang.Object) controlledMetricAccum13);
        com.j256.simplemetrics.persister.MetricsPersisterJob metricsPersisterJob16 = new com.j256.simplemetrics.persister.MetricsPersisterJob();
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher17 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.manager.MetricsManager metricsManager18 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx19 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str20 = metricsManagerJmx19.getJmxDomainName();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx19.setJmxFolderNames(strArray23);
        metricsManager18.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx19);
        fileMetricsPublisher17.setMetricsManager(metricsManager18);
        metricsPersisterJob16.setMetricsManager(metricsManager18);
        metricsPersisterJob16.initialize();
        metricsPersisterJob16.setPeriodTimeMillis((-1L));
        metricsPersisterJob16.initialize();
        boolean boolean32 = controlledMetricAccum5.equals((java.lang.Object) metricsPersisterJob16);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.j256" + "'", str14, "com.j256");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "com.j256" + "'", str20, "com.j256");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.j256.simplemetrics.manager.MetricsManager metricsManager0 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx1 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str2 = metricsManagerJmx1.getJmxDomainName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx1.setJmxFolderNames(strArray5);
        metricsManager0.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx1);
        java.lang.String str8 = metricsManagerJmx1.getJmxBeanName();
        java.lang.String str9 = metricsManagerJmx1.getJmxDomainName();
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher10 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.utils.FileMetric[] fileMetricArray11 = new com.j256.simplemetrics.utils.FileMetric[] {};
        fileMetricsPublisher10.setFileMetrics(fileMetricArray11);
        com.j256.simplemetrics.manager.MetricsManager metricsManager13 = new com.j256.simplemetrics.manager.MetricsManager();
        metricsManager13.persist();
        fileMetricsPublisher10.setMetricsManager(metricsManager13);
        java.util.Map<com.j256.simplemetrics.metric.ControlledMetric<?, ?>, java.lang.Number> wildcardControlledMetricMap16 = metricsManager13.getMetricValuesMap();
        com.j256.simplemetrics.manager.MetricsManager metricsManager17 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher18 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.utils.FileMetric[] fileMetricArray19 = new com.j256.simplemetrics.utils.FileMetric[] {};
        fileMetricsPublisher18.setFileMetrics(fileMetricArray19);
        java.lang.String[] strArray21 = fileMetricsPublisher18.getMetricsValues();
        metricsManager17.registerUpdater((com.j256.simplemetrics.manager.MetricsUpdater) fileMetricsPublisher18);
        long long23 = fileMetricsPublisher18.getFailedUpdateCount();
        com.j256.simplemetrics.manager.MetricsManager metricsManager24 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx25 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str26 = metricsManagerJmx25.getJmxDomainName();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx25.setJmxFolderNames(strArray29);
        metricsManager24.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx25);
        java.util.Collection<com.j256.simplemetrics.metric.ControlledMetric<?, ?>> wildcardControlledMetricCollection32 = metricsManager24.getMetrics();
        fileMetricsPublisher18.setMetricsManager(metricsManager24);
        metricsManager13.registerUpdater((com.j256.simplemetrics.manager.MetricsUpdater) fileMetricsPublisher18);
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx35 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str36 = metricsManagerJmx35.getJmxDomainName();
        java.lang.String str37 = metricsManagerJmx35.getJmxBeanName();
        metricsManagerJmx35.setJmxDomainName("=");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray40 = metricsManagerJmx35.getJmxFolderNames();
        java.lang.String str41 = metricsManagerJmx35.getJmxBeanName();
        com.j256.simplejmx.server.JmxServer jmxServer42 = null;
        metricsManagerJmx35.setJmxServer(jmxServer42);
        java.lang.String str44 = metricsManagerJmx35.getJmxBeanName();
        metricsManager13.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx35);
        metricsManagerJmx1.setMetricsManager(metricsManager13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.j256" + "'", str2, "com.j256");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.j256" + "'", str9, "com.j256");
        org.junit.Assert.assertNotNull(fileMetricArray11);
        org.junit.Assert.assertNotNull(wildcardControlledMetricMap16);
        org.junit.Assert.assertNotNull(fileMetricArray19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "com.j256" + "'", str26, "com.j256");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(wildcardControlledMetricCollection32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "com.j256" + "'", str36, "com.j256");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(jmxFolderNameArray40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = null;
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx1 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx(textFileMetricsPersister0);
        textFileMetricsPersisterJmx1.setJmxDomainName("MetricValueDetails [value=0, numSamples=0, min=0.0, max=0.0]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = textFileMetricsPersisterJmx1.getLastDumpTimeMillisString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        controlledMetricAccum5.adjustValue((long) ' ');
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum13 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        java.lang.String str14 = controlledMetricAccum13.getUnit();
        boolean boolean15 = controlledMetricAccum5.equals((java.lang.Object) controlledMetricAccum13);
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails16 = controlledMetricAccum13.getValueDetailsToPersist();
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue22 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        controlledMetricValue22.adjustValue((java.lang.Number) (-1.0d));
        java.lang.String str25 = controlledMetricValue22.getAggregationTypeName();
        boolean boolean26 = controlledMetricAccum13.equals((java.lang.Object) str25);
        java.lang.String str27 = controlledMetricAccum13.getComponent();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.j256" + "'", str14, "com.j256");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(metricValueDetails16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "AVERAGE" + "'", str25, "AVERAGE");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher0 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.utils.FileMetric[] fileMetricArray1 = new com.j256.simplemetrics.utils.FileMetric[] {};
        fileMetricsPublisher0.setFileMetrics(fileMetricArray1);
        long long3 = fileMetricsPublisher0.getFailedUpdateCount();
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher4 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.utils.FileMetric[] fileMetricArray5 = new com.j256.simplemetrics.utils.FileMetric[] {};
        fileMetricsPublisher4.setFileMetrics(fileMetricArray5);
        com.j256.simplemetrics.manager.MetricsManager metricsManager7 = new com.j256.simplemetrics.manager.MetricsManager();
        metricsManager7.persist();
        fileMetricsPublisher4.setMetricsManager(metricsManager7);
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher10 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.utils.FileMetric[] fileMetricArray11 = new com.j256.simplemetrics.utils.FileMetric[] {};
        fileMetricsPublisher10.setFileMetrics(fileMetricArray11);
        fileMetricsPublisher4.setFileMetrics(fileMetricArray11);
        fileMetricsPublisher0.setFileMetrics(fileMetricArray11);
        long long15 = fileMetricsPublisher0.getFailedUpdateCount();
        org.junit.Assert.assertNotNull(fileMetricArray1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(fileMetricArray5);
        org.junit.Assert.assertNotNull(fileMetricArray11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.j256.simplemetrics.metric.ControlledMetricValue controlledMetricValue5 = new com.j256.simplemetrics.metric.ControlledMetricValue("=", "com.j256", "com.j256", "=", "com.j256");
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails6 = controlledMetricValue5.getValueDetails();
        java.lang.Number number7 = controlledMetricValue5.getValue();
        java.lang.String str8 = controlledMetricValue5.getName();
        java.lang.String str9 = controlledMetricValue5.getUnit();
        controlledMetricValue5.adjustValue((java.lang.Number) 1L);
        org.junit.Assert.assertNotNull(metricValueDetails6);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0.0d + "'", number7, 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.j256" + "'", str8, "com.j256");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.j256" + "'", str9, "com.j256");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        com.j256.simplemetrics.utils.FileMetric.FileMetricKind fileMetricKind0 = com.j256.simplemetrics.utils.FileMetric.FileMetricKind.FILE_VALUE_DIFF;
        org.junit.Assert.assertTrue("'" + fileMetricKind0 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricKind.FILE_VALUE_DIFF + "'", fileMetricKind0.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricKind.FILE_VALUE_DIFF));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        controlledMetricAccum5.adjustValue((long) ' ');
        controlledMetricAccum5.adjustValue(10L);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("hi!", "com.j256", "com.j256", "", "com.j256");
        java.lang.String str6 = controlledMetricAccum5.getUnit();
        java.lang.Number number7 = null;
        // The following exception was thrown during execution in test generation
        try {
            controlledMetricAccum5.adjustValue(number7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.j256" + "'", str6, "com.j256");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher0 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.utils.FileMetric[] fileMetricArray1 = new com.j256.simplemetrics.utils.FileMetric[] {};
        fileMetricsPublisher0.setFileMetrics(fileMetricArray1);
        com.j256.simplemetrics.manager.MetricsManager metricsManager3 = new com.j256.simplemetrics.manager.MetricsManager();
        metricsManager3.persist();
        fileMetricsPublisher0.setMetricsManager(metricsManager3);
        fileMetricsPublisher0.updateMetrics();
        com.j256.simplemetrics.manager.MetricsManager metricsManager7 = null;
        fileMetricsPublisher0.setMetricsManager(metricsManager7);
        java.io.File file13 = null;
        com.j256.simplemetrics.utils.FileMetric.FileMetricKind fileMetricKind14 = com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR;
        com.j256.simplemetrics.utils.FileMetric fileMetric18 = new com.j256.simplemetrics.utils.FileMetric("=", "", "", "", file13, fileMetricKind14, (int) 'a', "=", "com.j256");
        fileMetric18.setLinePattern("com.j256");
        fileMetric18.initialize();
        fileMetric18.setMetricName("com.j256");
        com.j256.simplemetrics.utils.FileMetric[] fileMetricArray24 = new com.j256.simplemetrics.utils.FileMetric[] { fileMetric18 };
        fileMetricsPublisher0.setFileMetrics(fileMetricArray24);
        org.junit.Assert.assertNotNull(fileMetricArray1);
        org.junit.Assert.assertTrue("'" + fileMetricKind14 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR + "'", fileMetricKind14.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR));
        org.junit.Assert.assertNotNull(fileMetricArray24);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = null;
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx1 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx(textFileMetricsPersister0);
        java.lang.String str2 = textFileMetricsPersisterJmx1.getJmxBeanName();
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister3 = null;
        textFileMetricsPersisterJmx1.setMetricsPersister(textFileMetricsPersister3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = textFileMetricsPersisterJmx1.getLogFileNamePrefix();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        com.j256.simplemetrics.metric.ControlledMetricRatio controlledMetricRatio5 = new com.j256.simplemetrics.metric.ControlledMetricRatio("=", "", "hi!", "com.j256", "hi!");
        java.io.File file10 = null;
        com.j256.simplemetrics.utils.FileMetric.FileMetricKind fileMetricKind11 = com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR;
        com.j256.simplemetrics.utils.FileMetric fileMetric15 = new com.j256.simplemetrics.utils.FileMetric("com.j256.=.=", "=", "=", "", file10, fileMetricKind11, 100, "com.j256", "hi!");
        boolean boolean16 = controlledMetricRatio5.equals((java.lang.Object) fileMetricKind11);
        controlledMetricRatio5.adjustValue((java.lang.Number) 38L, (java.lang.Number) 10.0f);
        org.junit.Assert.assertTrue("'" + fileMetricKind11 + "' != '" + com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR + "'", fileMetricKind11.equals(com.j256.simplemetrics.utils.FileMetric.FileMetricKind.DIR));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.j256.simplemetrics.metric.ControlledMetricValue.ValueCount valueCount0 = com.j256.simplemetrics.metric.ControlledMetricValue.ValueCount.createInitialValue();
        com.j256.simplemetrics.metric.ControlledMetricValue.ValueCount valueCount2 = valueCount0.makeAdjusted((java.lang.Double) 0.0d);
        java.lang.Number number3 = valueCount2.getMin();
        com.j256.simplemetrics.metric.ControlledMetricValue.ValueCount valueCount5 = valueCount2.makeAdjusted((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(valueCount0);
        org.junit.Assert.assertNotNull(valueCount2);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 0.0d + "'", number3, 0.0d);
        org.junit.Assert.assertNotNull(valueCount5);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.j256.simplemetrics.metric.ControlledMetricAccum controlledMetricAccum5 = new com.j256.simplemetrics.metric.ControlledMetricAccum("SUM", "=.hi!", "com.j256", "hi!", "");
        java.lang.String str6 = controlledMetricAccum5.getName();
        com.j256.simplemetrics.metric.MetricValueDetails metricValueDetails7 = controlledMetricAccum5.getValueDetailsToPersist();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.j256" + "'", str6, "com.j256");
        org.junit.Assert.assertNotNull(metricValueDetails7);
    }
}
