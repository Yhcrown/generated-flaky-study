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
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx0 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str1 = metricsManagerJmx0.getJmxDomainName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = metricsManagerJmx0.persist();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx0 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str1 = metricsManagerJmx0.getJmxDomainName();
        java.lang.String str2 = metricsManagerJmx0.getJmxBeanName();
        metricsManagerJmx0.setJmxDomainName("=");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray5 = metricsManagerJmx0.getJmxFolderNames();
        java.lang.String str6 = metricsManagerJmx0.getJmxBeanName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = metricsManagerJmx0.persist();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx0 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.File file1 = textFileMetricsPersisterJmx0.getOutputDirectory();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher0 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fileMetricsPublisher0.initialize();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        metricsPersisterJob0.destroy();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        metricsPersisterJob0.join();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.j256.simplemetrics.persister.TextFileMetricsPersister textFileMetricsPersister0 = new com.j256.simplemetrics.persister.TextFileMetricsPersister();
        boolean boolean1 = textFileMetricsPersister0.isShowDescription();
        java.lang.String str2 = textFileMetricsPersister0.getLastDumpTimeMillisString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        textFileMetricsPersister0.cleanMetricFilesOlderThanMillis((long) (short) 100);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.j256.simplemetrics.manager.MetricsManager metricsManager0 = new com.j256.simplemetrics.manager.MetricsManager();
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx1 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str2 = metricsManagerJmx1.getJmxDomainName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        metricsManagerJmx1.setJmxFolderNames(strArray5);
        metricsManager0.registerRegisterListener((com.j256.simplemetrics.manager.MetricsRegisterListener) metricsManagerJmx1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray8 = metricsManagerJmx1.getMetricValues();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.j256.simplemetrics.persister.MetricsPersisterJob metricsPersisterJob0 = new com.j256.simplemetrics.persister.MetricsPersisterJob();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        metricsPersisterJob0.destroy();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        metricsPersisterJob0.destroyAndJoin();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx0 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str1 = metricsManagerJmx0.getJmxBeanName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray2 = metricsManagerJmx0.getMetricValues();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.j256.simplemetrics.persister.MetricsPersisterJob metricsPersisterJob0 = new com.j256.simplemetrics.persister.MetricsPersisterJob();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        metricsPersisterJob0.run();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.j256.simplemetrics.utils.FileMetricsPublisherJmx fileMetricsPublisherJmx0 = new com.j256.simplemetrics.utils.FileMetricsPublisherJmx();
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher1 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.utils.FileMetric[] fileMetricArray2 = new com.j256.simplemetrics.utils.FileMetric[] {};
        fileMetricsPublisher1.setFileMetrics(fileMetricArray2);
        java.lang.String[] strArray4 = fileMetricsPublisher1.getMetricsValues();
        fileMetricsPublisherJmx0.setJmxFolderNames(strArray4);
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray6 = fileMetricsPublisherJmx0.getJmxFolderNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fileMetricsPublisherJmx0.updateMetrics();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx0 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str1 = metricsManagerJmx0.getJmxDomainName();
        java.lang.String str2 = metricsManagerJmx0.getJmxBeanName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = metricsManagerJmx0.persist();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx0 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = textFileMetricsPersisterJmx0.getLastDumpTimeMillisString();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.j256.simplemetrics.utils.SystemMetricsPublisher systemMetricsPublisher0 = new com.j256.simplemetrics.utils.SystemMetricsPublisher();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        systemMetricsPublisher0.initialize();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx0 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str1 = metricsManagerJmx0.getJmxDomainName();
        java.lang.String str2 = metricsManagerJmx0.getJmxBeanName();
        metricsManagerJmx0.setJmxDomainName("=");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = metricsManagerJmx0.persist();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx0 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str1 = metricsManagerJmx0.getJmxDomainName();
        java.lang.String str2 = metricsManagerJmx0.getJmxBeanName();
        metricsManagerJmx0.setJmxDomainName("=");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray5 = metricsManagerJmx0.getJmxFolderNames();
        java.lang.String str6 = metricsManagerJmx0.getJmxBeanName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray7 = metricsManagerJmx0.getMetricValues();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx0 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx();
        java.lang.String str1 = textFileMetricsPersisterJmx0.getJmxDomainName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = textFileMetricsPersisterJmx0.getLogFileNamePrefix();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx0 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray1 = textFileMetricsPersisterJmx0.getJmxFolderNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = textFileMetricsPersisterJmx0.getLastDumpTimeMillisString();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.j256.simplemetrics.utils.FileMetricsPublisher fileMetricsPublisher0 = new com.j256.simplemetrics.utils.FileMetricsPublisher();
        com.j256.simplemetrics.utils.FileMetric[] fileMetricArray1 = new com.j256.simplemetrics.utils.FileMetric[] {};
        fileMetricsPublisher0.setFileMetrics(fileMetricArray1);
        java.lang.String[] strArray3 = fileMetricsPublisher0.getMetricsValues();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fileMetricsPublisher0.initialize();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx0 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = textFileMetricsPersisterJmx0.getLogFileNamePrefix();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.j256.simplemetrics.utils.FileMetricsPublisherJmx fileMetricsPublisherJmx0 = new com.j256.simplemetrics.utils.FileMetricsPublisherJmx();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray1 = fileMetricsPublisherJmx0.getMetricsValues();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.j256.simplemetrics.manager.MetricsManagerJmx metricsManagerJmx0 = new com.j256.simplemetrics.manager.MetricsManagerJmx();
        java.lang.String str1 = metricsManagerJmx0.getJmxBeanName();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray2 = metricsManagerJmx0.getJmxFolderNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray3 = metricsManagerJmx0.getMetricValues();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        metricsManagerJmx9.updateMetrics();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        systemMetricsPublisher0.initialize();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx0 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx();
        java.lang.String str1 = textFileMetricsPersisterJmx0.getJmxDomainName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = textFileMetricsPersisterJmx0.isShowDescription();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx textFileMetricsPersisterJmx0 = new com.j256.simplemetrics.persister.TextFileMetricsPersisterJmx();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray1 = textFileMetricsPersisterJmx0.getJmxFolderNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = textFileMetricsPersisterJmx0.isShowDescription();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.j256.simplemetrics.utils.FileMetricsPublisherJmx fileMetricsPublisherJmx0 = new com.j256.simplemetrics.utils.FileMetricsPublisherJmx();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray1 = fileMetricsPublisherJmx0.getJmxFolderNames();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray2 = fileMetricsPublisherJmx0.getJmxFolderNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long3 = fileMetricsPublisherJmx0.getFailedUpdateCount();
    }
}

