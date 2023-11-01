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
        java.lang.String str0 = io.teknek.daemon.TeknekDaemon.GRAPHITE_CLUSTER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "teknek.graphite.cluster" + "'", str0, "teknek.graphite.cluster");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap7 = io.teknek.util.PropertiesUtil.copyOnlyWantedProperties(strMap0, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        io.teknek.feed.FeedPartition feedPartition0 = null;
        io.teknek.plan.Plan plan1 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        io.teknek.zookeeper.ZookeeperOffsetStorage zookeeperOffsetStorage3 = new io.teknek.zookeeper.ZookeeperOffsetStorage(feedPartition0, plan1, strMap2);
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.offsetstorage.Offset offset4 = zookeeperOffsetStorage3.findLatestPersistedOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap6 = io.teknek.util.PropertiesUtil.copyOnlyWantedProperties(strMap0, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        io.teknek.feed.FeedPartition feedPartition0 = null;
        io.teknek.plan.Plan plan1 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        io.teknek.zookeeper.ZookeeperOffsetStorage zookeeperOffsetStorage3 = new io.teknek.zookeeper.ZookeeperOffsetStorage(feedPartition0, plan1, strMap2);
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.offsetstorage.Offset offset4 = zookeeperOffsetStorage3.findLatestPersistedOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        io.teknek.daemon.TeknekDaemon teknekDaemon3 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerDao2.createEphemeralNodeForDaemon(teknekDaemon3);
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        org.apache.zookeeper.ZooKeeper zooKeeper3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.plan.OperatorDesc operatorDesc6 = workerDao2.loadSavedOperatorDesc(zooKeeper3, "", "teknek.graphite.cluster");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "teknek.graphite.cluster", "teknek.graphite.cluster", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap8 = io.teknek.util.PropertiesUtil.copyOnlyWantedProperties(strMap0, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.plan.OperatorDesc operatorDesc3 = io.teknek.datalayer.WorkerDao.deserializeOperatorDesc(byteArray2);
            org.junit.Assert.fail("Expected exception of type org.codehaus.jackson.JsonParseException; message: Unexpected character ('d' (code 100)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: [B@32cfd722; line: 2, column: 2]");
        } catch (org.codehaus.jackson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 100]");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        java.lang.Throwable throwable2 = null;
        io.teknek.datalayer.WorkerDaoException workerDaoException3 = new io.teknek.datalayer.WorkerDaoException("", throwable2);
        io.teknek.datalayer.WorkerDaoException workerDaoException6 = new io.teknek.datalayer.WorkerDaoException("hi!", throwable2, false, true);
        java.lang.Class<?> wildcardClass7 = workerDaoException6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        java.lang.String str0 = io.teknek.zookeeper.ZookeeperOffsetStorage.TEKNEK_ROOT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/teknek" + "'", str0, "/teknek");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.String str0 = io.teknek.daemon.TeknekDaemon.MAX_WORKERS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "teknek.max.workers" + "'", str0, "teknek.max.workers");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        io.teknek.plan.OperatorDesc operatorDesc0 = null;
        com.codahale.metrics.MetricRegistry metricRegistry1 = null;
        io.teknek.feed.FeedPartition feedPartition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.model.Operator operator4 = io.teknek.driver.DriverFactory.buildOperator(operatorDesc0, metricRegistry1, "hi!", feedPartition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        java.lang.String str3 = workerDao2.SAVED_ZK;
        org.apache.zookeeper.ZooKeeper zooKeeper4 = null;
        io.teknek.plan.Bundle bundle5 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerDao2.saveBundle(zooKeeper4, bundle5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "teknek.graphite.cluster/saved" + "'", str3, "teknek.graphite.cluster/saved");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        org.apache.zookeeper.ZooKeeper zooKeeper3 = null;
        io.teknek.plan.Bundle bundle4 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerDao2.saveBundle(zooKeeper3, bundle4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        java.lang.String str0 = io.teknek.daemon.TeknekDaemon.ZK_BASE_DIR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "zk.base.dir" + "'", str0, "zk.base.dir");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        io.teknek.feed.FeedPartition feedPartition0 = null;
        groovy.lang.Closure closure1 = null;
        io.teknek.model.GroovyOperator groovyOperator2 = new io.teknek.model.GroovyOperator(closure1);
        java.lang.String str3 = groovyOperator2.getPath();
        java.lang.String str4 = groovyOperator2.getPath();
        io.teknek.feed.FeedPartition feedPartition5 = null;
        io.teknek.plan.Plan plan6 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        io.teknek.zookeeper.ZookeeperOffsetStorage zookeeperOffsetStorage8 = new io.teknek.zookeeper.ZookeeperOffsetStorage(feedPartition5, plan6, strMap7);
        io.teknek.collector.CollectorProcessor collectorProcessor9 = null;
        com.codahale.metrics.MetricRegistry metricRegistry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.driver.Driver driver13 = new io.teknek.driver.Driver(feedPartition0, (io.teknek.model.Operator) groovyOperator2, (io.teknek.offsetstorage.OffsetStorage) zookeeperOffsetStorage8, collectorProcessor9, 0, metricRegistry11, "zk.base.dir");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.plan.Plan plan4 = workerDao2.findPlanByName("teknek.max.workers");
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        io.teknek.feed.FeedPartition feedPartition0 = null;
        io.teknek.plan.Plan plan1 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        io.teknek.zookeeper.ZookeeperOffsetStorage zookeeperOffsetStorage3 = new io.teknek.zookeeper.ZookeeperOffsetStorage(feedPartition0, plan1, strMap2);
        io.teknek.offsetstorage.Offset offset4 = null;
        // The following exception was thrown during execution in test generation
        try {
            zookeeperOffsetStorage3.persistOffset(offset4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        java.lang.String str3 = workerDao2.SAVED_ZK;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList4 = workerDao2.finalAllPlanNames();
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "teknek.graphite.cluster/saved" + "'", str3, "teknek.graphite.cluster/saved");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "teknek.graphite.cluster/saved", "/teknek", "/teknek", "zk.base.dir" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap6 = io.teknek.util.PropertiesUtil.copyOnlyWantedProperties(strMap0, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        io.teknek.plan.Plan plan3 = null;
        com.codahale.metrics.MetricRegistry metricRegistry4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.driver.Driver driver5 = io.teknek.driver.DriverFactory.createDriver((io.teknek.feed.FeedPartition) feedPartitionAdapter2, plan3, metricRegistry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        java.lang.String str0 = io.teknek.operator.SimplePipeOperator.OUTPUT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "simple.pipe.operator.output.field" + "'", str0, "simple.pipe.operator.output.field");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        java.lang.String str0 = io.teknek.operator.PipeOperator.PIPE_OPERATOR_COMMAND;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pipe.operator.command.and.arguments" + "'", str0, "pipe.operator.command.and.arguments");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.lang.String str3 = groovyOperator1.getPath();
        java.lang.String str4 = groovyOperator1.getPartitionId();
        io.teknek.model.ITuple iTuple5 = null;
        // The following exception was thrown during execution in test generation
        try {
            groovyOperator1.handleTuple(iTuple5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        io.teknek.feed.FeedPartition feedPartition0 = null;
        io.teknek.plan.Plan plan1 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        io.teknek.zookeeper.ZookeeperOffsetStorage zookeeperOffsetStorage3 = new io.teknek.zookeeper.ZookeeperOffsetStorage(feedPartition0, plan1, strMap2);
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.offsetstorage.Offset offset4 = zookeeperOffsetStorage3.getCurrentOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.lang.String str0 = io.teknek.operator.SimplePipeOperator.INPUT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "simple.pipe.operator.input.field" + "'", str0, "simple.pipe.operator.input.field");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.plan.Bundle bundle1 = io.teknek.datalayer.WorkerDao.getBundleFromUrl(uRL0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        feedPartitionAdapter2.setOffset("teknek.graphite.cluster/saved");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        java.lang.String str0 = io.teknek.daemon.TeknekDaemon.GRAPHITE_HOST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "teknek.graphite.host" + "'", str0, "teknek.graphite.host");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        io.teknek.feed.FeedPartition feedPartition0 = null;
        io.teknek.plan.Plan plan1 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        io.teknek.zookeeper.ZookeeperOffsetStorage zookeeperOffsetStorage3 = new io.teknek.zookeeper.ZookeeperOffsetStorage(feedPartition0, plan1, strMap2);
        io.teknek.offsetstorage.Offset offset4 = null;
        // The following exception was thrown during execution in test generation
        try {
            zookeeperOffsetStorage3.persistOffset(offset4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        io.teknek.zookeeper.DummyWatcher dummyWatcher0 = new io.teknek.zookeeper.DummyWatcher();
        org.apache.zookeeper.WatchedEvent watchedEvent1 = null;
        // The following exception was thrown during execution in test generation
        try {
            dummyWatcher0.process(watchedEvent1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        io.teknek.util.PropertiesUtil propertiesUtil0 = new io.teknek.util.PropertiesUtil();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        io.teknek.feed.FeedPartition feedPartition0 = null;
        io.teknek.plan.Plan plan1 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        io.teknek.zookeeper.ZookeeperOffsetStorage zookeeperOffsetStorage3 = new io.teknek.zookeeper.ZookeeperOffsetStorage(feedPartition0, plan1, strMap2);
        // The following exception was thrown during execution in test generation
        try {
            zookeeperOffsetStorage3.createZookeeperBase();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.plan.Plan plan1 = io.teknek.datalayer.WorkerDao.deserializePlan(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        java.lang.String str3 = workerDao2.SAVED_ZK;
        java.lang.String str4 = workerDao2.PLANS_ZK;
        org.apache.zookeeper.ZooKeeper zooKeeper5 = null;
        io.teknek.plan.OperatorDesc operatorDesc6 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerDao2.saveOperatorDesc(zooKeeper5, operatorDesc6, "teknek.graphite.cluster/plans", "teknek.graphite.cluster/saved");
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "teknek.graphite.cluster/saved" + "'", str3, "teknek.graphite.cluster/saved");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "teknek.graphite.cluster/plans" + "'", str4, "teknek.graphite.cluster/plans");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = groovyOperator1.getProperties();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        groovyOperator1.setProperties(strMap4);
        io.teknek.model.ITuple iTuple6 = null;
        // The following exception was thrown during execution in test generation
        try {
            groovyOperator1.handleTuple(iTuple6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strMap3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        io.teknek.feed.FeedPartition feedPartition0 = null;
        io.teknek.plan.Plan plan1 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        io.teknek.zookeeper.ZookeeperOffsetStorage zookeeperOffsetStorage3 = new io.teknek.zookeeper.ZookeeperOffsetStorage(feedPartition0, plan1, strMap2);
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.offsetstorage.Offset offset4 = zookeeperOffsetStorage3.getCurrentOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        org.apache.zookeeper.ZooKeeper zooKeeper3 = null;
        io.teknek.plan.FeedDesc feedDesc4 = new io.teknek.plan.FeedDesc();
        java.util.Map map5 = null;
        feedDesc4.setProperties(map5);
        // The following exception was thrown during execution in test generation
        try {
            workerDao2.saveFeedDesc(zooKeeper3, feedDesc4, "", "teknek.graphite.cluster");
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        java.lang.String str3 = workerDao2.SAVED_ZK;
        java.lang.String str4 = workerDao2.PLANS_ZK;
        io.teknek.plan.Plan plan5 = new io.teknek.plan.Plan();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList6 = workerDao2.findWorkersWorkingOnPlan(plan5);
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "teknek.graphite.cluster/saved" + "'", str3, "teknek.graphite.cluster/saved");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "teknek.graphite.cluster/plans" + "'", str4, "teknek.graphite.cluster/plans");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper0 = null;
        io.teknek.datalayer.WorkerDao workerDao1 = new io.teknek.datalayer.WorkerDao(restablishingKeeper0);
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.plan.Plan plan3 = workerDao1.findPlanByName("/teknek");
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        java.lang.String str0 = io.teknek.zookeeper.ZookeeperOffsetStorage.ENCODING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "UTF-8" + "'", str0, "UTF-8");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("hi!", restablishingKeeper1);
        io.teknek.plan.Plan plan3 = new io.teknek.plan.Plan();
        // The following exception was thrown during execution in test generation
        try {
            workerDao2.maybeCreatePlanLockDir(plan3);
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        io.teknek.plan.Plan plan3 = new io.teknek.plan.Plan();
        java.lang.String[] strArray9 = new java.lang.String[] { "simple.pipe.operator.output.field", "simple.pipe.operator.output.field", "pipe.operator.command.and.arguments", "teknek.max.workers", "pipe.operator.command.and.arguments" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.teknek.daemon.WorkerStatus> workerStatusList12 = workerDao2.findAllWorkerStatusForPlan(plan3, (java.util.List<java.lang.String>) strList10);
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper0 = null;
        io.teknek.datalayer.WorkerDao workerDao1 = new io.teknek.datalayer.WorkerDao(restablishingKeeper0);
        io.teknek.daemon.TeknekDaemon teknekDaemon2 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerDao1.createEphemeralNodeForDaemon(teknekDaemon2);
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        java.lang.String str0 = io.teknek.datalayer.WorkerDao.ENCODING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "UTF-8" + "'", str0, "UTF-8");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.lang.String str3 = groovyOperator1.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        groovyOperator1.setProperties(strMap4);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        boolean boolean3 = feedPartitionAdapter2.supportsOffsetManagement();
        boolean boolean4 = feedPartitionAdapter2.supportsOffsetManagement();
        feedPartitionAdapter2.initialize();
        io.teknek.plan.Plan plan6 = new io.teknek.plan.Plan();
        com.codahale.metrics.MetricRegistry metricRegistry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.driver.Driver driver8 = io.teknek.driver.DriverFactory.createDriver((io.teknek.feed.FeedPartition) feedPartitionAdapter2, plan6, metricRegistry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        io.teknek.datalayer.WorkerDaoException workerDaoException2 = new io.teknek.datalayer.WorkerDaoException("teknek.graphite.cluster");
        io.teknek.datalayer.WorkerDaoException workerDaoException3 = new io.teknek.datalayer.WorkerDaoException("zk.base.dir", (java.lang.Throwable) workerDaoException2);
        java.lang.String str4 = workerDaoException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "io.teknek.datalayer.WorkerDaoException: zk.base.dir" + "'", str4, "io.teknek.datalayer.WorkerDaoException: zk.base.dir");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        io.teknek.plan.Plan plan3 = new io.teknek.plan.Plan();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc4 = plan3.getOffsetStorageDesc();
        // The following exception was thrown during execution in test generation
        try {
            workerDao2.deletePlan(plan3);
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(offsetStorageDesc4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        io.teknek.plan.Plan plan3 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc4 = plan3.getRootOperator();
        com.codahale.metrics.MetricRegistry metricRegistry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.driver.Driver driver6 = io.teknek.driver.DriverFactory.createDriver((io.teknek.feed.FeedPartition) feedPartitionAdapter2, plan3, metricRegistry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(operatorDesc4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        io.teknek.collector.Collector collector0 = new io.teknek.collector.Collector();
        io.teknek.model.ITuple iTuple1 = null;
        // The following exception was thrown during execution in test generation
        try {
            collector0.emit(iTuple1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        io.teknek.collector.Collector collector0 = new io.teknek.collector.Collector();
        io.teknek.model.ITuple iTuple1 = collector0.peek();
        int int2 = collector0.size();
        org.junit.Assert.assertNull(iTuple1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.lang.String str0 = io.teknek.daemon.TeknekDaemon.ZK_SERVER_LIST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "teknek.zk.servers" + "'", str0, "teknek.zk.servers");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        boolean boolean2 = plan0.equals((java.lang.Object) 1.0f);
        plan0.setMaxWorkersPerNode(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        java.lang.String[] strArray8 = new java.lang.String[] { "teknek.graphite.host", "simple.pipe.operator.input.field", "teknek.graphite.cluster/plans", "hi!", "/teknek", "teknek.max.workers", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        io.teknek.daemon.TeknekDaemon teknekDaemon11 = null;
        io.teknek.daemon.Worker worker12 = new io.teknek.daemon.Worker(plan0, (java.util.List<java.lang.String>) strList9, teknekDaemon11);
        org.apache.zookeeper.WatchedEvent watchedEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            worker12.process(watchedEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = groovyOperator1.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc4 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator1);
        groovyOperator1.setPath("simple.pipe.operator.input.field");
        io.teknek.model.ITuple iTuple7 = null;
        // The following exception was thrown during execution in test generation
        try {
            groovyOperator1.handleTuple(iTuple7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strMap3);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        io.teknek.plan.FeedDesc feedDesc0 = new io.teknek.plan.FeedDesc();
        java.util.Map map1 = null;
        io.teknek.plan.FeedDesc feedDesc2 = feedDesc0.withProperties(map1);
        feedDesc2.setSpec("simple.pipe.operator.output.field");
        org.junit.Assert.assertNotNull(feedDesc2);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        io.teknek.daemon.WorkerStartException workerStartException0 = new io.teknek.daemon.WorkerStartException();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        java.lang.String str3 = feedPartitionAdapter2.getOffset();
        java.lang.String str4 = feedPartitionAdapter2.getOffset();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        io.teknek.feed.Feed feed3 = feedPartitionAdapter2.getFeed();
        java.lang.String str4 = feedPartitionAdapter2.getPartitionId();
        org.junit.Assert.assertNull(feed3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/teknek" + "'", str4, "/teknek");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        io.teknek.daemon.WorkerStatus workerStatus3 = new io.teknek.daemon.WorkerStatus("io.teknek.datalayer.WorkerDaoException: zk.base.dir", "", "teknek.graphite.cluster/saved");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        io.teknek.datalayer.WorkerDaoException workerDaoException1 = new io.teknek.datalayer.WorkerDaoException("/teknek");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        io.teknek.driver.DriverFactory driverFactory0 = new io.teknek.driver.DriverFactory();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.lang.Throwable throwable3 = null;
        io.teknek.datalayer.WorkerDaoException workerDaoException4 = new io.teknek.datalayer.WorkerDaoException("", throwable3);
        io.teknek.datalayer.WorkerDaoException workerDaoException7 = new io.teknek.datalayer.WorkerDaoException("hi!", throwable3, false, true);
        io.teknek.daemon.WorkerStartException workerStartException8 = new io.teknek.daemon.WorkerStartException("", throwable3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        java.lang.String str3 = workerDao2.SAVED_ZK;
        java.lang.String str4 = workerDao2.PLANS_ZK;
        java.lang.String str5 = workerDao2.WORKERS_ZK;
        java.lang.String str6 = workerDao2.BASE_ZK;
        io.teknek.daemon.TeknekDaemon teknekDaemon7 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerDao2.createEphemeralNodeForDaemon(teknekDaemon7);
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "teknek.graphite.cluster/saved" + "'", str3, "teknek.graphite.cluster/saved");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "teknek.graphite.cluster/plans" + "'", str4, "teknek.graphite.cluster/plans");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "teknek.graphite.cluster/workers" + "'", str5, "teknek.graphite.cluster/workers");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "teknek.graphite.cluster" + "'", str6, "teknek.graphite.cluster");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        io.teknek.daemon.WorkerStartException workerStartException1 = new io.teknek.daemon.WorkerStartException("teknek.graphite.host");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        io.teknek.plan.FeedDesc feedDesc0 = new io.teknek.plan.FeedDesc();
        java.util.Map map1 = null;
        feedDesc0.setProperties(map1);
        java.util.Map map3 = null;
        feedDesc0.setProperties(map3);
        io.teknek.plan.FeedDesc feedDesc6 = feedDesc0.withFeedClass("teknek.graphite.cluster/plans");
        java.lang.String str7 = feedDesc6.getSpec();
        org.junit.Assert.assertNotNull(feedDesc6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        boolean boolean3 = feedPartitionAdapter2.supportsOffsetManagement();
        boolean boolean4 = feedPartitionAdapter2.supportsOffsetManagement();
        feedPartitionAdapter2.initialize();
        feedPartitionAdapter2.initialize();
        groovy.lang.Closure closure7 = null;
        io.teknek.model.GroovyOperator groovyOperator8 = new io.teknek.model.GroovyOperator(closure7);
        java.lang.String str9 = groovyOperator8.getPath();
        java.lang.String str10 = groovyOperator8.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = groovyOperator8.getProperties();
        io.teknek.feed.FeedPartition feedPartition12 = null;
        io.teknek.plan.Plan plan13 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        io.teknek.zookeeper.ZookeeperOffsetStorage zookeeperOffsetStorage15 = new io.teknek.zookeeper.ZookeeperOffsetStorage(feedPartition12, plan13, strMap14);
        io.teknek.collector.CollectorProcessor collectorProcessor16 = null;
        com.codahale.metrics.MetricRegistry metricRegistry18 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.driver.Driver driver20 = new io.teknek.driver.Driver((io.teknek.feed.FeedPartition) feedPartitionAdapter2, (io.teknek.model.Operator) groovyOperator8, (io.teknek.offsetstorage.OffsetStorage) zookeeperOffsetStorage15, collectorProcessor16, 1, metricRegistry18, "UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        java.lang.String str3 = workerDao2.SAVED_ZK;
        java.lang.String str4 = workerDao2.PLANS_ZK;
        java.lang.String str5 = workerDao2.WORKERS_ZK;
        io.teknek.plan.Plan plan6 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc7 = plan6.getRootOperator();
        io.teknek.plan.Plan plan9 = plan6.withName("");
        plan6.setDisabled(false);
        io.teknek.plan.Plan plan13 = plan6.withTupleRetry((int) (short) 0);
        java.lang.String[] strArray30 = new java.lang.String[] { "teknek.graphite.cluster/plans", "pipe.operator.command.and.arguments", "hi!", "teknek.zk.servers", "teknek.graphite.cluster/locks", "zk.base.dir", "io.teknek.datalayer.WorkerDaoException: zk.base.dir", "teknek.graphite.cluster/workers", "teknek.max.workers", "io.teknek.datalayer.WorkerDaoException: zk.base.dir", "UTF-8", "hi!", "UTF-8", "UTF-8", "", "teknek.graphite.cluster/workers" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.teknek.daemon.WorkerStatus> workerStatusList33 = workerDao2.findAllWorkerStatusForPlan(plan13, (java.util.List<java.lang.String>) strList31);
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "teknek.graphite.cluster/saved" + "'", str3, "teknek.graphite.cluster/saved");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "teknek.graphite.cluster/plans" + "'", str4, "teknek.graphite.cluster/plans");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "teknek.graphite.cluster/workers" + "'", str5, "teknek.graphite.cluster/workers");
        org.junit.Assert.assertNull(operatorDesc7);
        org.junit.Assert.assertNotNull(plan9);
        org.junit.Assert.assertNotNull(plan13);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        java.lang.String str3 = workerDao2.SAVED_ZK;
        java.lang.String str4 = workerDao2.PLANS_ZK;
        java.lang.String str5 = workerDao2.WORKERS_ZK;
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.plan.FeedDesc feedDesc8 = workerDao2.loadSavedFeedDesc("UTF-8", "teknek.graphite.cluster/saved");
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "teknek.graphite.cluster/saved" + "'", str3, "teknek.graphite.cluster/saved");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "teknek.graphite.cluster/plans" + "'", str4, "teknek.graphite.cluster/plans");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "teknek.graphite.cluster/workers" + "'", str5, "teknek.graphite.cluster/workers");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        int int0 = io.teknek.collector.Collector.DEFAULT_QUEUE_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4000 + "'", int0 == 4000);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        io.teknek.datalayer.WorkerDaoException workerDaoException4 = new io.teknek.datalayer.WorkerDaoException("teknek.graphite.cluster");
        io.teknek.datalayer.WorkerDaoException workerDaoException5 = new io.teknek.datalayer.WorkerDaoException("zk.base.dir", (java.lang.Throwable) workerDaoException4);
        io.teknek.daemon.WorkerStartException workerStartException8 = new io.teknek.daemon.WorkerStartException("simple.pipe.operator.output.field", (java.lang.Throwable) workerDaoException5, false, false);
        io.teknek.datalayer.WorkerDaoException workerDaoException9 = new io.teknek.datalayer.WorkerDaoException("UTF-8", (java.lang.Throwable) workerStartException8);
        io.teknek.datalayer.WorkerDaoException workerDaoException10 = new io.teknek.datalayer.WorkerDaoException((java.lang.Throwable) workerStartException8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        io.teknek.plan.FeedDesc feedDesc0 = new io.teknek.plan.FeedDesc();
        java.util.Map map1 = null;
        feedDesc0.setProperties(map1);
        java.util.Map map3 = null;
        feedDesc0.setProperties(map3);
        io.teknek.plan.FeedDesc feedDesc6 = feedDesc0.withFeedClass("teknek.graphite.cluster/plans");
        java.lang.String str7 = feedDesc0.getName();
        org.junit.Assert.assertNotNull(feedDesc6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.lang.String str0 = io.teknek.zookeeper.ZookeeperOffsetStorage.TEKNEK_OFFSET;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/teknek/offset" + "'", str0, "/teknek/offset");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        io.teknek.plan.FeedDesc feedDesc0 = new io.teknek.plan.FeedDesc();
        java.lang.String str1 = feedDesc0.getSpec();
        io.teknek.plan.FeedDesc feedDesc3 = feedDesc0.withFeedClass("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(feedDesc3);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        io.teknek.daemon.WorkerStatus workerStatus3 = new io.teknek.daemon.WorkerStatus("hi!", "teknek.graphite.cluster", "hi!");
        workerStatus3.setFeedPartitionId("/teknek");
        java.lang.String str6 = workerStatus3.getWorkerUuid();
        workerStatus3.setWorkerUuid("teknek.max.workers");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("hi!", restablishingKeeper1);
        io.teknek.plan.Plan plan3 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc4 = plan3.getRootOperator();
        io.teknek.plan.Plan plan6 = plan3.withName("");
        // The following exception was thrown during execution in test generation
        try {
            workerDao2.maybeCreatePlanLockDir(plan6);
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(operatorDesc4);
        org.junit.Assert.assertNotNull(plan6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        java.lang.String[] strArray8 = new java.lang.String[] { "teknek.graphite.host", "simple.pipe.operator.input.field", "teknek.graphite.cluster/plans", "hi!", "/teknek", "teknek.max.workers", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        io.teknek.daemon.TeknekDaemon teknekDaemon11 = null;
        io.teknek.daemon.Worker worker12 = new io.teknek.daemon.Worker(plan0, (java.util.List<java.lang.String>) strList9, teknekDaemon11);
        worker12.start();
        // The following exception was thrown during execution in test generation
        try {
            worker12.init();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("hi!", restablishingKeeper1);
        java.lang.String str3 = workerDao2.SAVED_ZK;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!/saved" + "'", str3, "hi!/saved");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        io.teknek.feed.Feed feed3 = feedPartitionAdapter2.getFeed();
        io.teknek.feed.Feed feed4 = feedPartitionAdapter2.getFeed();
        com.codahale.metrics.MetricRegistry metricRegistry5 = feedPartitionAdapter2.getMetricRegistry();
        org.junit.Assert.assertNull(feed3);
        org.junit.Assert.assertNull(feed4);
        org.junit.Assert.assertNull(metricRegistry5);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.lang.String str3 = groovyOperator1.getPath();
        com.codahale.metrics.MetricRegistry metricRegistry4 = groovyOperator1.getMetricRegistry();
        com.codahale.metrics.MetricRegistry metricRegistry5 = null;
        groovyOperator1.setMetricRegistry(metricRegistry5);
        io.teknek.collector.CollectorProcessor collectorProcessor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.driver.DriverNode driverNode8 = new io.teknek.driver.DriverNode((io.teknek.model.Operator) groovyOperator1, collectorProcessor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(metricRegistry4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        boolean boolean3 = feedPartitionAdapter2.supportsOffsetManagement();
        io.teknek.feed.Feed feed4 = feedPartitionAdapter2.getFeed();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(feed4);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        java.lang.String[] strArray8 = new java.lang.String[] { "teknek.graphite.host", "simple.pipe.operator.input.field", "teknek.graphite.cluster/plans", "hi!", "/teknek", "teknek.max.workers", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        io.teknek.daemon.TeknekDaemon teknekDaemon11 = null;
        io.teknek.daemon.Worker worker12 = new io.teknek.daemon.Worker(plan0, (java.util.List<java.lang.String>) strList9, teknekDaemon11);
        plan0.setTupleRetry((int) ' ');
        plan0.setOffsetCommitInterval((int) (byte) 1);
        io.teknek.plan.FeedDesc feedDesc17 = plan0.getFeedDesc();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(feedDesc17);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.lang.String str3 = groovyOperator1.getPath();
        groovyOperator1.commit();
        groovyOperator1.setPath("teknek.max.workers");
        com.codahale.metrics.MetricRegistry metricRegistry7 = null;
        groovyOperator1.setMetricRegistry(metricRegistry7);
        io.teknek.collector.Collector collector9 = new io.teknek.collector.Collector();
        groovyOperator1.setCollector((io.teknek.model.ICollector) collector9);
        io.teknek.model.ITuple iTuple11 = null;
        // The following exception was thrown during execution in test generation
        try {
            collector9.emit(iTuple11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        java.lang.String str0 = io.teknek.daemon.TeknekDaemon.GRAPHITE_PORT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "teknek.graphite.port" + "'", str0, "teknek.graphite.port");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        io.teknek.daemon.WorkerStartException workerStartException1 = new io.teknek.daemon.WorkerStartException("hi!/saved");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        io.teknek.datalayer.WorkerDaoException workerDaoException4 = new io.teknek.datalayer.WorkerDaoException("teknek.graphite.cluster");
        io.teknek.datalayer.WorkerDaoException workerDaoException5 = new io.teknek.datalayer.WorkerDaoException("zk.base.dir", (java.lang.Throwable) workerDaoException4);
        io.teknek.daemon.WorkerStartException workerStartException8 = new io.teknek.daemon.WorkerStartException("simple.pipe.operator.output.field", (java.lang.Throwable) workerDaoException5, false, false);
        io.teknek.datalayer.WorkerDaoException workerDaoException11 = new io.teknek.datalayer.WorkerDaoException("simple.pipe.operator.input.field", (java.lang.Throwable) workerStartException8, false, false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        java.lang.String str3 = workerDao2.SAVED_ZK;
        java.lang.String str4 = workerDao2.PLANS_ZK;
        java.lang.String str5 = workerDao2.WORKERS_ZK;
        java.lang.String str6 = workerDao2.BASE_ZK;
        org.apache.zookeeper.ZooKeeper zooKeeper7 = null;
        io.teknek.plan.FeedDesc feedDesc8 = new io.teknek.plan.FeedDesc();
        java.lang.String str9 = feedDesc8.getSpec();
        java.lang.String str10 = feedDesc8.getName();
        io.teknek.plan.FeedDesc feedDesc12 = feedDesc8.withName("io.teknek.datalayer.WorkerDaoException: zk.base.dir");
        // The following exception was thrown during execution in test generation
        try {
            workerDao2.saveFeedDesc(zooKeeper7, feedDesc8, "hi!", "teknek.graphite.cluster/saved");
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "teknek.graphite.cluster/saved" + "'", str3, "teknek.graphite.cluster/saved");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "teknek.graphite.cluster/plans" + "'", str4, "teknek.graphite.cluster/plans");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "teknek.graphite.cluster/workers" + "'", str5, "teknek.graphite.cluster/workers");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "teknek.graphite.cluster" + "'", str6, "teknek.graphite.cluster");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(feedDesc12);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        boolean boolean2 = plan0.equals((java.lang.Object) 1.0f);
        boolean boolean4 = plan0.equals((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc1 = plan0.getRootOperator();
        java.lang.String str2 = plan0.getName();
        org.junit.Assert.assertNull(operatorDesc1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        io.teknek.util.MapBuilder mapBuilder0 = new io.teknek.util.MapBuilder();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        io.teknek.operator.SimplePipeOperator simplePipeOperator0 = new io.teknek.operator.SimplePipeOperator();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc4 = new io.teknek.plan.OffsetStorageDesc("", strMap3);
        offsetStorageDesc4.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        offsetStorageDesc4.setParameters(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc11 = new io.teknek.plan.OffsetStorageDesc("", strMap10);
        offsetStorageDesc11.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        offsetStorageDesc11.setParameters(strMap14);
        groovy.lang.Closure closure16 = null;
        io.teknek.model.GroovyOperator groovyOperator17 = new io.teknek.model.GroovyOperator(closure16);
        java.lang.String str18 = groovyOperator17.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = groovyOperator17.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc20 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator17);
        groovy.lang.Closure closure21 = null;
        io.teknek.model.GroovyOperator groovyOperator22 = new io.teknek.model.GroovyOperator(closure21);
        java.lang.String str23 = groovyOperator22.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = groovyOperator22.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc25 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator22);
        io.teknek.plan.OperatorDesc operatorDesc26 = operatorDesc20.withNextOperator(operatorDesc25);
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = operatorDesc25.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc28 = offsetStorageDesc11.withParameters(strMap27);
        offsetStorageDesc4.setParameters(strMap27);
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc30 = new io.teknek.plan.OffsetStorageDesc("teknek.graphite.cluster/locks", strMap27);
        // The following exception was thrown during execution in test generation
        try {
            simplePipeOperator0.setProperties(strMap27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNotNull(operatorDesc26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(offsetStorageDesc28);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("hi!", restablishingKeeper1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList3 = workerDao2.findAllWorkers();
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = groovyOperator1.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc4 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator1);
        io.teknek.plan.OperatorDesc operatorDesc6 = operatorDesc4.withOperatorClass("teknek.graphite.cluster/plans");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(operatorDesc6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc1 = plan0.getRootOperator();
        io.teknek.plan.Plan plan3 = plan0.withName("");
        plan3.setTupleRetry((int) '4');
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc8 = new io.teknek.plan.OffsetStorageDesc("", strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc11 = new io.teknek.plan.OffsetStorageDesc("", strMap10);
        offsetStorageDesc11.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        offsetStorageDesc11.setParameters(strMap14);
        groovy.lang.Closure closure16 = null;
        io.teknek.model.GroovyOperator groovyOperator17 = new io.teknek.model.GroovyOperator(closure16);
        java.lang.String str18 = groovyOperator17.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = groovyOperator17.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc20 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator17);
        groovy.lang.Closure closure21 = null;
        io.teknek.model.GroovyOperator groovyOperator22 = new io.teknek.model.GroovyOperator(closure21);
        java.lang.String str23 = groovyOperator22.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = groovyOperator22.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc25 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator22);
        io.teknek.plan.OperatorDesc operatorDesc26 = operatorDesc20.withNextOperator(operatorDesc25);
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = operatorDesc25.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc28 = offsetStorageDesc11.withParameters(strMap27);
        offsetStorageDesc8.setParameters(strMap27);
        plan3.setOffsetStorageDesc(offsetStorageDesc8);
        org.junit.Assert.assertNull(operatorDesc1);
        org.junit.Assert.assertNotNull(plan3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNotNull(operatorDesc26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(offsetStorageDesc28);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc1 = plan0.getRootOperator();
        io.teknek.plan.Plan plan3 = plan0.withName("");
        java.lang.String str4 = plan3.getName();
        org.junit.Assert.assertNull(operatorDesc1);
        org.junit.Assert.assertNotNull(plan3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        io.teknek.plan.OperatorDesc operatorDesc0 = null;
        byte[] byteArray1 = io.teknek.datalayer.WorkerDao.serializeOperatorDesc(operatorDesc0);
        io.teknek.plan.Plan plan2 = io.teknek.datalayer.WorkerDao.deserializePlan(byteArray1);
        io.teknek.plan.Plan plan3 = io.teknek.datalayer.WorkerDao.deserializePlan(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[110, 117, 108, 108]");
        org.junit.Assert.assertNull(plan2);
        org.junit.Assert.assertNull(plan3);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc1 = plan0.getRootOperator();
        io.teknek.plan.Plan plan3 = plan0.withName("");
        plan0.setDisabled(false);
        io.teknek.plan.Plan plan7 = plan0.withMaxWorkers(0);
        plan7.setTupleRetry((int) (short) -1);
        org.junit.Assert.assertNull(operatorDesc1);
        org.junit.Assert.assertNotNull(plan3);
        org.junit.Assert.assertNotNull(plan7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        boolean boolean3 = feedPartitionAdapter2.supportsOffsetManagement();
        boolean boolean4 = feedPartitionAdapter2.supportsOffsetManagement();
        feedPartitionAdapter2.initialize();
        java.lang.String str6 = feedPartitionAdapter2.getOffset();
        feedPartitionAdapter2.close();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "simple.pipe.operator.input.field");
        feedPartitionAdapter2.initialize();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        io.teknek.feed.Feed feed3 = feedPartitionAdapter2.getFeed();
        io.teknek.feed.Feed feed4 = feedPartitionAdapter2.getFeed();
        groovy.lang.Closure closure5 = null;
        io.teknek.model.GroovyOperator groovyOperator6 = new io.teknek.model.GroovyOperator(closure5);
        java.lang.String str7 = groovyOperator6.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = groovyOperator6.getProperties();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        groovyOperator6.setProperties(strMap9);
        io.teknek.feed.FeedPartition feedPartition11 = null;
        io.teknek.plan.Plan plan12 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        io.teknek.zookeeper.ZookeeperOffsetStorage zookeeperOffsetStorage14 = new io.teknek.zookeeper.ZookeeperOffsetStorage(feedPartition11, plan12, strMap13);
        io.teknek.collector.CollectorProcessor collectorProcessor15 = null;
        com.codahale.metrics.MetricRegistry metricRegistry17 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.driver.Driver driver19 = new io.teknek.driver.Driver((io.teknek.feed.FeedPartition) feedPartitionAdapter2, (io.teknek.model.Operator) groovyOperator6, (io.teknek.offsetstorage.OffsetStorage) zookeeperOffsetStorage14, collectorProcessor15, (int) 'a', metricRegistry17, "/teknek/offset");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(feed3);
        org.junit.Assert.assertNull(feed4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        org.apache.zookeeper.ZooKeeper zooKeeper3 = null;
        io.teknek.plan.Plan plan4 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc5 = plan4.getRootOperator();
        io.teknek.plan.Plan plan7 = plan4.withName("");
        plan4.setDisabled(false);
        io.teknek.plan.Plan plan11 = plan4.withMaxWorkers(0);
        io.teknek.plan.Plan plan13 = plan11.withTupleRetry((int) (byte) -1);
        io.teknek.daemon.WorkerStatus workerStatus17 = new io.teknek.daemon.WorkerStatus("", "teknek.graphite.cluster", "teknek.graphite.cluster");
        java.lang.String str18 = workerStatus17.getTeknekDaemonId();
        java.lang.String str19 = workerStatus17.getTeknekDaemonId();
        // The following exception was thrown during execution in test generation
        try {
            workerDao2.registerWorkerStatus(zooKeeper3, plan13, workerStatus17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(operatorDesc5);
        org.junit.Assert.assertNotNull(plan7);
        org.junit.Assert.assertNotNull(plan11);
        org.junit.Assert.assertNotNull(plan13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "teknek.graphite.cluster" + "'", str18, "teknek.graphite.cluster");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "teknek.graphite.cluster" + "'", str19, "teknek.graphite.cluster");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        io.teknek.collector.Collector collector0 = new io.teknek.collector.Collector();
        int int1 = collector0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        io.teknek.collector.Collector collector0 = new io.teknek.collector.Collector();
        io.teknek.model.ITuple iTuple1 = collector0.peek();
        io.teknek.model.ITuple iTuple2 = null;
        // The following exception was thrown during execution in test generation
        try {
            collector0.emit(iTuple2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(iTuple1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.lang.String str3 = groovyOperator1.getPath();
        groovyOperator1.commit();
        groovyOperator1.setPath("teknek.max.workers");
        com.codahale.metrics.MetricRegistry metricRegistry7 = null;
        groovyOperator1.setMetricRegistry(metricRegistry7);
        io.teknek.collector.Collector collector9 = new io.teknek.collector.Collector();
        groovyOperator1.setCollector((io.teknek.model.ICollector) collector9);
        groovyOperator1.close();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        io.teknek.operator.SimplePipeOperator simplePipeOperator0 = new io.teknek.operator.SimplePipeOperator();
        io.teknek.model.ITuple iTuple1 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplePipeOperator0.handleTuple(iTuple1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        java.lang.String str3 = workerDao2.SAVED_ZK;
        java.lang.String str4 = workerDao2.LOCKS_ZK;
        java.lang.String str5 = workerDao2.PLAN_WORKERS_ZK;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "teknek.graphite.cluster/saved" + "'", str3, "teknek.graphite.cluster/saved");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "teknek.graphite.cluster/locks" + "'", str4, "teknek.graphite.cluster/locks");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "teknek.graphite.cluster/plan-workers" + "'", str5, "teknek.graphite.cluster/plan-workers");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        boolean boolean3 = feedPartitionAdapter2.supportsOffsetManagement();
        feedPartitionAdapter2.initialize();
        groovy.lang.Closure closure5 = null;
        io.teknek.model.GroovyOperator groovyOperator6 = new io.teknek.model.GroovyOperator(closure5);
        java.lang.String str7 = groovyOperator6.getPath();
        java.lang.String str8 = groovyOperator6.getPath();
        io.teknek.feed.FeedPartition feedPartition9 = null;
        io.teknek.plan.Plan plan10 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        io.teknek.zookeeper.ZookeeperOffsetStorage zookeeperOffsetStorage12 = new io.teknek.zookeeper.ZookeeperOffsetStorage(feedPartition9, plan10, strMap11);
        io.teknek.collector.CollectorProcessor collectorProcessor13 = null;
        com.codahale.metrics.MetricRegistry metricRegistry15 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.driver.Driver driver17 = new io.teknek.driver.Driver((io.teknek.feed.FeedPartition) feedPartitionAdapter2, (io.teknek.model.Operator) groovyOperator6, (io.teknek.offsetstorage.OffsetStorage) zookeeperOffsetStorage12, collectorProcessor13, (int) (short) 100, metricRegistry15, "simple.pipe.operator.input.field");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        io.teknek.daemon.WorkerStatus workerStatus3 = new io.teknek.daemon.WorkerStatus("hi!", "teknek.graphite.cluster", "hi!");
        workerStatus3.setFeedPartitionId("/teknek");
        java.lang.String str6 = workerStatus3.getFeedPartitionId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/teknek" + "'", str6, "/teknek");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        boolean boolean3 = feedPartitionAdapter2.supportsOffsetManagement();
        feedPartitionAdapter2.initialize();
        feedPartitionAdapter2.setOffset("teknek.graphite.cluster/saved");
        io.teknek.model.ITuple iTuple7 = null;
        boolean boolean8 = feedPartitionAdapter2.next(iTuple7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.lang.String str3 = groovyOperator1.getPath();
        groovyOperator1.commit();
        groovyOperator1.setPath("teknek.max.workers");
        com.codahale.metrics.MetricRegistry metricRegistry7 = null;
        groovyOperator1.setMetricRegistry(metricRegistry7);
        io.teknek.collector.Collector collector9 = new io.teknek.collector.Collector();
        groovyOperator1.setCollector((io.teknek.model.ICollector) collector9);
        io.teknek.model.ITuple iTuple11 = null;
        // The following exception was thrown during execution in test generation
        try {
            collector9.emit(iTuple11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        io.teknek.plan.FeedDesc feedDesc1 = new io.teknek.plan.FeedDesc();
        java.util.Map map2 = null;
        feedDesc1.setProperties(map2);
        java.util.Map map4 = null;
        feedDesc1.setProperties(map4);
        io.teknek.plan.FeedDesc feedDesc7 = feedDesc1.withFeedClass("teknek.graphite.cluster/plans");
        plan0.setFeedDesc(feedDesc1);
        org.junit.Assert.assertNotNull(feedDesc7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.lang.String str3 = groovyOperator1.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = groovyOperator1.getProperties();
        java.lang.String str5 = groovyOperator1.getPartitionId();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        java.lang.String[] strArray8 = new java.lang.String[] { "teknek.graphite.host", "simple.pipe.operator.input.field", "teknek.graphite.cluster/plans", "hi!", "/teknek", "teknek.max.workers", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        io.teknek.daemon.TeknekDaemon teknekDaemon11 = null;
        io.teknek.daemon.Worker worker12 = new io.teknek.daemon.Worker(plan0, (java.util.List<java.lang.String>) strList9, teknekDaemon11);
        worker12.start();
        org.apache.zookeeper.WatchedEvent watchedEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            worker12.process(watchedEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc1 = plan0.getRootOperator();
        io.teknek.plan.Plan plan3 = plan0.withName("");
        groovy.lang.Closure closure4 = null;
        io.teknek.model.GroovyOperator groovyOperator5 = new io.teknek.model.GroovyOperator(closure4);
        java.lang.String str6 = groovyOperator5.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = groovyOperator5.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc8 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator5);
        groovy.lang.Closure closure9 = null;
        io.teknek.model.GroovyOperator groovyOperator10 = new io.teknek.model.GroovyOperator(closure9);
        java.lang.String str11 = groovyOperator10.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = groovyOperator10.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc13 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator10);
        io.teknek.plan.OperatorDesc operatorDesc14 = operatorDesc8.withNextOperator(operatorDesc13);
        operatorDesc8.setName("pipe.operator.command.and.arguments");
        operatorDesc8.setTheClass("hi!");
        groovy.lang.Closure closure19 = null;
        io.teknek.model.GroovyOperator groovyOperator20 = new io.teknek.model.GroovyOperator(closure19);
        java.lang.String str21 = groovyOperator20.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = groovyOperator20.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc23 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator20);
        io.teknek.plan.OperatorDesc operatorDesc24 = operatorDesc8.withNextOperator(operatorDesc23);
        plan0.setRootOperator(operatorDesc24);
        org.junit.Assert.assertNull(operatorDesc1);
        org.junit.Assert.assertNotNull(plan3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNotNull(operatorDesc14);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(strMap22);
        org.junit.Assert.assertNotNull(operatorDesc24);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.lang.String str0 = io.teknek.daemon.TeknekDaemon.DAEMON_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "teknek.daemon.id" + "'", str0, "teknek.daemon.id");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc1 = plan0.getRootOperator();
        io.teknek.plan.Plan plan3 = plan0.withName("");
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc4 = plan3.getOffsetStorageDesc();
        org.junit.Assert.assertNull(operatorDesc1);
        org.junit.Assert.assertNotNull(plan3);
        org.junit.Assert.assertNull(offsetStorageDesc4);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster/locks", restablishingKeeper1);
        // The following exception was thrown during execution in test generation
        try {
            workerDao2.createZookeeperBase();
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        io.teknek.operator.SimplePipeOperator simplePipeOperator0 = new io.teknek.operator.SimplePipeOperator();
        com.codahale.metrics.MetricRegistry metricRegistry1 = null;
        simplePipeOperator0.setMetricRegistry(metricRegistry1);
        io.teknek.model.ITuple iTuple3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplePipeOperator0.handleTuple(iTuple3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        groovyOperator1.setPath("teknek.graphite.cluster");
        groovyOperator1.setPath("zk.base.dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = groovyOperator1.getProperties();
        io.teknek.model.ITuple iTuple7 = null;
        // The following exception was thrown during execution in test generation
        try {
            groovyOperator1.handleTuple(iTuple7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        io.teknek.plan.FeedDesc feedDesc0 = new io.teknek.plan.FeedDesc();
        java.util.Map map1 = null;
        io.teknek.plan.FeedDesc feedDesc2 = feedDesc0.withProperties(map1);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc5 = new io.teknek.plan.OffsetStorageDesc("", strMap4);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc8 = new io.teknek.plan.OffsetStorageDesc("", strMap7);
        offsetStorageDesc8.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        offsetStorageDesc8.setParameters(strMap11);
        groovy.lang.Closure closure13 = null;
        io.teknek.model.GroovyOperator groovyOperator14 = new io.teknek.model.GroovyOperator(closure13);
        java.lang.String str15 = groovyOperator14.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = groovyOperator14.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc17 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator14);
        groovy.lang.Closure closure18 = null;
        io.teknek.model.GroovyOperator groovyOperator19 = new io.teknek.model.GroovyOperator(closure18);
        java.lang.String str20 = groovyOperator19.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = groovyOperator19.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc22 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator19);
        io.teknek.plan.OperatorDesc operatorDesc23 = operatorDesc17.withNextOperator(operatorDesc22);
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = operatorDesc22.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc25 = offsetStorageDesc8.withParameters(strMap24);
        offsetStorageDesc5.setParameters(strMap24);
        io.teknek.plan.FeedDesc feedDesc27 = feedDesc0.withProperties((java.util.Map) strMap24);
        feedDesc27.setScript("teknek.graphite.cluster/saved");
        org.junit.Assert.assertNotNull(feedDesc2);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNotNull(operatorDesc23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(offsetStorageDesc25);
        org.junit.Assert.assertNotNull(feedDesc27);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        java.lang.String str3 = workerDao2.SAVED_ZK;
        java.lang.String str4 = workerDao2.LOCKS_ZK;
        // The following exception was thrown during execution in test generation
        try {
            workerDao2.createZookeeperBase();
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "teknek.graphite.cluster/saved" + "'", str3, "teknek.graphite.cluster/saved");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "teknek.graphite.cluster/locks" + "'", str4, "teknek.graphite.cluster/locks");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        java.lang.String str3 = workerDao2.SAVED_ZK;
        java.lang.String str4 = workerDao2.LOCKS_ZK;
        org.apache.zookeeper.ZooKeeper zooKeeper5 = null;
        io.teknek.plan.FeedDesc feedDesc6 = new io.teknek.plan.FeedDesc();
        java.util.Map map7 = null;
        io.teknek.plan.FeedDesc feedDesc8 = feedDesc6.withProperties(map7);
        // The following exception was thrown during execution in test generation
        try {
            workerDao2.saveFeedDesc(zooKeeper5, feedDesc6, "teknek.graphite.cluster/locks", "/teknek");
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "teknek.graphite.cluster/saved" + "'", str3, "teknek.graphite.cluster/saved");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "teknek.graphite.cluster/locks" + "'", str4, "teknek.graphite.cluster/locks");
        org.junit.Assert.assertNotNull(feedDesc8);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        io.teknek.feed.FeedPartition feedPartition0 = null;
        io.teknek.plan.Plan plan1 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc2 = plan1.getRootOperator();
        groovy.lang.Closure closure3 = null;
        io.teknek.model.GroovyOperator groovyOperator4 = new io.teknek.model.GroovyOperator(closure3);
        java.lang.String str5 = groovyOperator4.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = groovyOperator4.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc7 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator4);
        plan1.setRootOperator(operatorDesc7);
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc9 = plan1.getOffsetStorageDesc();
        io.teknek.plan.Plan plan10 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc11 = plan10.getRootOperator();
        io.teknek.plan.Plan plan13 = plan10.withName("");
        plan10.setDisabled(false);
        io.teknek.plan.Plan plan17 = plan10.withMaxWorkers(0);
        io.teknek.plan.Plan plan19 = plan17.withTupleRetry((int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc22 = new io.teknek.plan.OffsetStorageDesc("", strMap21);
        plan19.setOffsetStorageDesc(offsetStorageDesc22);
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.offsetstorage.OffsetStorage offsetStorage24 = io.teknek.driver.DriverFactory.buildOffsetStorage(feedPartition0, plan1, offsetStorageDesc22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(operatorDesc2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(offsetStorageDesc9);
        org.junit.Assert.assertNull(operatorDesc11);
        org.junit.Assert.assertNotNull(plan13);
        org.junit.Assert.assertNotNull(plan17);
        org.junit.Assert.assertNotNull(plan19);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc1 = plan0.getRootOperator();
        io.teknek.plan.Plan plan3 = plan0.withName("");
        plan0.setDisabled(false);
        plan0.setTupleRetry((int) (byte) 100);
        java.lang.String[] strArray14 = new java.lang.String[] { "zk.base.dir", "UTF-8", "simple.pipe.operator.input.field", "io.teknek.datalayer.WorkerDaoException: zk.base.dir", "zk.base.dir", "pipe.operator.command.and.arguments" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        io.teknek.daemon.TeknekDaemon teknekDaemon17 = null;
        io.teknek.daemon.Worker worker18 = new io.teknek.daemon.Worker(plan0, (java.util.List<java.lang.String>) strList15, teknekDaemon17);
        org.apache.zookeeper.WatchedEvent watchedEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            worker18.process(watchedEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(operatorDesc1);
        org.junit.Assert.assertNotNull(plan3);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        boolean boolean3 = feedPartitionAdapter2.supportsOffsetManagement();
        boolean boolean4 = feedPartitionAdapter2.supportsOffsetManagement();
        feedPartitionAdapter2.close();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        io.teknek.plan.FeedDesc feedDesc0 = new io.teknek.plan.FeedDesc();
        java.util.Map map1 = null;
        io.teknek.plan.FeedDesc feedDesc2 = feedDesc0.withProperties(map1);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc5 = new io.teknek.plan.OffsetStorageDesc("", strMap4);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc8 = new io.teknek.plan.OffsetStorageDesc("", strMap7);
        offsetStorageDesc8.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        offsetStorageDesc8.setParameters(strMap11);
        groovy.lang.Closure closure13 = null;
        io.teknek.model.GroovyOperator groovyOperator14 = new io.teknek.model.GroovyOperator(closure13);
        java.lang.String str15 = groovyOperator14.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = groovyOperator14.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc17 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator14);
        groovy.lang.Closure closure18 = null;
        io.teknek.model.GroovyOperator groovyOperator19 = new io.teknek.model.GroovyOperator(closure18);
        java.lang.String str20 = groovyOperator19.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = groovyOperator19.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc22 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator19);
        io.teknek.plan.OperatorDesc operatorDesc23 = operatorDesc17.withNextOperator(operatorDesc22);
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = operatorDesc22.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc25 = offsetStorageDesc8.withParameters(strMap24);
        offsetStorageDesc5.setParameters(strMap24);
        io.teknek.plan.FeedDesc feedDesc27 = feedDesc0.withProperties((java.util.Map) strMap24);
        byte[] byteArray28 = io.teknek.datalayer.WorkerDao.serializeFeedDesc(feedDesc0);
        org.junit.Assert.assertNotNull(feedDesc2);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNotNull(operatorDesc23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(offsetStorageDesc25);
        org.junit.Assert.assertNotNull(feedDesc27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[123, 34, 115, 112, 101, 99, 34, 58, 110, 117, 108, 108, 44, 34, 115, 99, 114, 105, 112, 116, 34, 58, 110, 117, 108, 108, 44, 34, 116, 104, 101, 67, 108, 97, 115, 115, 34, 58, 110, 117, 108, 108, 44, 34, 112, 114, 111, 112, 101, 114, 116, 105, 101, 115, 34, 58, 123, 125, 44, 34, 110, 97, 109, 101, 34, 58, 110, 117, 108, 108, 125]");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc1 = plan0.getRootOperator();
        io.teknek.plan.Plan plan3 = plan0.withName("");
        plan0.setDisabled(false);
        plan0.setTupleRetry((int) (byte) 100);
        plan0.setName("pipe.operator.command.and.arguments");
        org.junit.Assert.assertNull(operatorDesc1);
        org.junit.Assert.assertNotNull(plan3);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        io.teknek.operator.SimplePipeOperator simplePipeOperator0 = new io.teknek.operator.SimplePipeOperator();
        com.codahale.metrics.MetricRegistry metricRegistry1 = null;
        simplePipeOperator0.setMetricRegistry(metricRegistry1);
        io.teknek.model.ITuple iTuple3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplePipeOperator0.handleTuple(iTuple3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        io.teknek.feed.Feed feed3 = feedPartitionAdapter2.getFeed();
        com.codahale.metrics.MetricRegistry metricRegistry4 = feedPartitionAdapter2.getMetricRegistry();
        org.junit.Assert.assertNull(feed3);
        org.junit.Assert.assertNull(metricRegistry4);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        io.teknek.datalayer.WorkerDaoException workerDaoException5 = new io.teknek.datalayer.WorkerDaoException("teknek.graphite.cluster");
        io.teknek.datalayer.WorkerDaoException workerDaoException6 = new io.teknek.datalayer.WorkerDaoException("zk.base.dir", (java.lang.Throwable) workerDaoException5);
        io.teknek.daemon.WorkerStartException workerStartException9 = new io.teknek.daemon.WorkerStartException("simple.pipe.operator.output.field", (java.lang.Throwable) workerDaoException6, false, false);
        io.teknek.datalayer.WorkerDaoException workerDaoException10 = new io.teknek.datalayer.WorkerDaoException("UTF-8", (java.lang.Throwable) workerStartException9);
        io.teknek.datalayer.WorkerDaoException workerDaoException11 = new io.teknek.datalayer.WorkerDaoException("teknek.graphite.cluster/workers", (java.lang.Throwable) workerDaoException10);
        io.teknek.datalayer.WorkerDaoException workerDaoException12 = new io.teknek.datalayer.WorkerDaoException((java.lang.Throwable) workerDaoException10);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        io.teknek.plan.FeedDesc feedDesc0 = new io.teknek.plan.FeedDesc();
        java.util.Map map1 = null;
        feedDesc0.setProperties(map1);
        java.util.Map map3 = null;
        feedDesc0.setProperties(map3);
        feedDesc0.setName("zk.base.dir");
        io.teknek.plan.FeedDesc feedDesc8 = feedDesc0.withName("simple.pipe.operator.input.field");
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc11 = new io.teknek.plan.OffsetStorageDesc("", strMap10);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc14 = new io.teknek.plan.OffsetStorageDesc("", strMap13);
        offsetStorageDesc14.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        offsetStorageDesc14.setParameters(strMap17);
        groovy.lang.Closure closure19 = null;
        io.teknek.model.GroovyOperator groovyOperator20 = new io.teknek.model.GroovyOperator(closure19);
        java.lang.String str21 = groovyOperator20.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = groovyOperator20.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc23 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator20);
        groovy.lang.Closure closure24 = null;
        io.teknek.model.GroovyOperator groovyOperator25 = new io.teknek.model.GroovyOperator(closure24);
        java.lang.String str26 = groovyOperator25.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = groovyOperator25.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc28 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator25);
        io.teknek.plan.OperatorDesc operatorDesc29 = operatorDesc23.withNextOperator(operatorDesc28);
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = operatorDesc28.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc31 = offsetStorageDesc14.withParameters(strMap30);
        offsetStorageDesc11.setParameters(strMap30);
        feedDesc8.setProperties((java.util.Map) strMap30);
        org.junit.Assert.assertNotNull(feedDesc8);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(strMap22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(strMap27);
        org.junit.Assert.assertNotNull(operatorDesc29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(offsetStorageDesc31);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        java.lang.Throwable throwable1 = null;
        io.teknek.datalayer.WorkerDaoException workerDaoException4 = new io.teknek.datalayer.WorkerDaoException("teknek.graphite.cluster/plan-workers", throwable1, true, true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        io.teknek.plan.FeedDesc feedDesc0 = new io.teknek.plan.FeedDesc();
        java.lang.String str1 = feedDesc0.getSpec();
        groovy.lang.Closure closure2 = null;
        io.teknek.model.GroovyOperator groovyOperator3 = new io.teknek.model.GroovyOperator(closure2);
        java.lang.String str4 = groovyOperator3.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = groovyOperator3.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc6 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator3);
        groovy.lang.Closure closure7 = null;
        io.teknek.model.GroovyOperator groovyOperator8 = new io.teknek.model.GroovyOperator(closure7);
        java.lang.String str9 = groovyOperator8.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = groovyOperator8.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc11 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator8);
        io.teknek.plan.OperatorDesc operatorDesc12 = operatorDesc6.withNextOperator(operatorDesc11);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = operatorDesc11.getParameters();
        io.teknek.plan.FeedDesc feedDesc14 = feedDesc0.withProperties((java.util.Map) strMap13);
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.feed.Feed feed15 = io.teknek.driver.DriverFactory.buildFeed(feedDesc0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNotNull(operatorDesc12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(feedDesc14);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = groovyOperator1.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc4 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator1);
        groovy.lang.Closure closure5 = null;
        io.teknek.model.GroovyOperator groovyOperator6 = new io.teknek.model.GroovyOperator(closure5);
        java.lang.String str7 = groovyOperator6.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = groovyOperator6.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc9 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator6);
        io.teknek.plan.OperatorDesc operatorDesc10 = operatorDesc4.withNextOperator(operatorDesc9);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = operatorDesc9.getParameters();
        operatorDesc9.setTheClass("hi!/saved");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(operatorDesc10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = groovyOperator1.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc4 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator1);
        groovy.lang.Closure closure5 = null;
        io.teknek.model.GroovyOperator groovyOperator6 = new io.teknek.model.GroovyOperator(closure5);
        java.lang.String str7 = groovyOperator6.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = groovyOperator6.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc9 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator6);
        io.teknek.plan.OperatorDesc operatorDesc10 = operatorDesc4.withNextOperator(operatorDesc9);
        java.lang.String str11 = operatorDesc9.getName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(operatorDesc10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc1 = plan0.getRootOperator();
        io.teknek.plan.Plan plan3 = plan0.withName("");
        plan0.setDisabled(false);
        plan0.setTupleRetry((int) (byte) 100);
        io.teknek.plan.Plan plan9 = plan0.withName("pipe.operator.command.and.arguments");
        plan0.setDisabled(false);
        org.junit.Assert.assertNull(operatorDesc1);
        org.junit.Assert.assertNotNull(plan3);
        org.junit.Assert.assertNotNull(plan9);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.lang.String str3 = groovyOperator1.getPath();
        java.lang.String str4 = groovyOperator1.getPartitionId();
        groovyOperator1.commit();
        com.codahale.metrics.MetricRegistry metricRegistry6 = groovyOperator1.getMetricRegistry();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(metricRegistry6);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc2 = new io.teknek.plan.OffsetStorageDesc("", strMap1);
        offsetStorageDesc2.setOperatorClass("teknek.graphite.cluster/workers");
        groovy.lang.Closure closure5 = null;
        io.teknek.model.GroovyOperator groovyOperator6 = new io.teknek.model.GroovyOperator(closure5);
        java.lang.String str7 = groovyOperator6.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = groovyOperator6.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc9 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator6);
        groovy.lang.Closure closure10 = null;
        io.teknek.model.GroovyOperator groovyOperator11 = new io.teknek.model.GroovyOperator(closure10);
        java.lang.String str12 = groovyOperator11.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = groovyOperator11.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc14 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator11);
        io.teknek.plan.OperatorDesc operatorDesc15 = operatorDesc9.withNextOperator(operatorDesc14);
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = operatorDesc14.getParameters();
        offsetStorageDesc2.setParameters(strMap16);
        java.lang.Class<?> wildcardClass18 = offsetStorageDesc2.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNotNull(operatorDesc15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        io.teknek.daemon.WorkerStatus workerStatus3 = new io.teknek.daemon.WorkerStatus("hi!", "teknek.graphite.cluster", "hi!");
        java.lang.String str4 = workerStatus3.getWorkerUuid();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        java.lang.String str3 = workerDao2.SAVED_ZK;
        java.lang.String str4 = workerDao2.PLANS_ZK;
        java.lang.String str5 = workerDao2.WORKERS_ZK;
        java.lang.String str6 = workerDao2.BASE_ZK;
        org.apache.zookeeper.ZooKeeper zooKeeper7 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.plan.OperatorDesc operatorDesc10 = workerDao2.loadSavedOperatorDesc(zooKeeper7, "teknek.graphite.cluster/workers", "teknek.graphite.port");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "teknek.graphite.cluster/saved" + "'", str3, "teknek.graphite.cluster/saved");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "teknek.graphite.cluster/plans" + "'", str4, "teknek.graphite.cluster/plans");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "teknek.graphite.cluster/workers" + "'", str5, "teknek.graphite.cluster/workers");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "teknek.graphite.cluster" + "'", str6, "teknek.graphite.cluster");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        io.teknek.datalayer.WorkerDaoException workerDaoException2 = new io.teknek.datalayer.WorkerDaoException("");
        io.teknek.datalayer.WorkerDaoException workerDaoException3 = new io.teknek.datalayer.WorkerDaoException("teknek.daemon.id", (java.lang.Throwable) workerDaoException2);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc2 = new io.teknek.plan.OffsetStorageDesc("hi!/saved", strMap1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        boolean boolean3 = feedPartitionAdapter2.supportsOffsetManagement();
        feedPartitionAdapter2.initialize();
        feedPartitionAdapter2.setOffset("teknek.graphite.cluster/saved");
        boolean boolean7 = feedPartitionAdapter2.supportsOffsetManagement();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        io.teknek.model.ITuple iTuple3 = null;
        boolean boolean4 = feedPartitionAdapter2.next(iTuple3);
        java.lang.String str5 = feedPartitionAdapter2.getPath();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        java.lang.String str3 = feedPartitionAdapter2.getOffset();
        java.lang.String str4 = feedPartitionAdapter2.getOffset();
        io.teknek.plan.Plan plan5 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc6 = plan5.getRootOperator();
        io.teknek.plan.Plan plan8 = plan5.withName("");
        plan8.setTupleRetry((int) '4');
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc13 = new io.teknek.plan.OffsetStorageDesc("", strMap12);
        offsetStorageDesc13.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        offsetStorageDesc13.setParameters(strMap16);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc20 = new io.teknek.plan.OffsetStorageDesc("", strMap19);
        offsetStorageDesc20.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = null;
        offsetStorageDesc20.setParameters(strMap23);
        groovy.lang.Closure closure25 = null;
        io.teknek.model.GroovyOperator groovyOperator26 = new io.teknek.model.GroovyOperator(closure25);
        java.lang.String str27 = groovyOperator26.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = groovyOperator26.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc29 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator26);
        groovy.lang.Closure closure30 = null;
        io.teknek.model.GroovyOperator groovyOperator31 = new io.teknek.model.GroovyOperator(closure30);
        java.lang.String str32 = groovyOperator31.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = groovyOperator31.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc34 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator31);
        io.teknek.plan.OperatorDesc operatorDesc35 = operatorDesc29.withNextOperator(operatorDesc34);
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = operatorDesc34.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc37 = offsetStorageDesc20.withParameters(strMap36);
        offsetStorageDesc13.setParameters(strMap36);
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.offsetstorage.OffsetStorage offsetStorage39 = io.teknek.driver.DriverFactory.buildOffsetStorage((io.teknek.feed.FeedPartition) feedPartitionAdapter2, plan8, offsetStorageDesc13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(operatorDesc6);
        org.junit.Assert.assertNotNull(plan8);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(strMap28);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(strMap33);
        org.junit.Assert.assertNotNull(operatorDesc35);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(offsetStorageDesc37);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.lang.String str3 = groovyOperator1.getPath();
        com.codahale.metrics.MetricRegistry metricRegistry4 = groovyOperator1.getMetricRegistry();
        com.codahale.metrics.MetricRegistry metricRegistry5 = null;
        groovyOperator1.setMetricRegistry(metricRegistry5);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = groovyOperator1.getProperties();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(metricRegistry4);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        java.lang.String str3 = workerDao2.SAVED_ZK;
        java.lang.String str4 = workerDao2.PLANS_ZK;
        java.lang.String str5 = workerDao2.SAVED_ZK;
        java.lang.String str6 = workerDao2.PLANS_ZK;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "teknek.graphite.cluster/saved" + "'", str3, "teknek.graphite.cluster/saved");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "teknek.graphite.cluster/plans" + "'", str4, "teknek.graphite.cluster/plans");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "teknek.graphite.cluster/saved" + "'", str5, "teknek.graphite.cluster/saved");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "teknek.graphite.cluster/plans" + "'", str6, "teknek.graphite.cluster/plans");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        boolean boolean3 = feedPartitionAdapter2.supportsOffsetManagement();
        boolean boolean4 = feedPartitionAdapter2.supportsOffsetManagement();
        feedPartitionAdapter2.initialize();
        java.lang.String str6 = feedPartitionAdapter2.getPartitionId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/teknek" + "'", str6, "/teknek");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        io.teknek.plan.Plan plan3 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc4 = plan3.getRootOperator();
        io.teknek.plan.Plan plan6 = plan3.withName("");
        // The following exception was thrown during execution in test generation
        try {
            workerDao2.maybeCreatePlanLockDir(plan3);
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(operatorDesc4);
        org.junit.Assert.assertNotNull(plan6);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.lang.String str3 = groovyOperator1.getPath();
        groovyOperator1.commit();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc7 = new io.teknek.plan.OffsetStorageDesc("", strMap6);
        offsetStorageDesc7.setOperatorClass("teknek.graphite.cluster/workers");
        groovy.lang.Closure closure10 = null;
        io.teknek.model.GroovyOperator groovyOperator11 = new io.teknek.model.GroovyOperator(closure10);
        java.lang.String str12 = groovyOperator11.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = groovyOperator11.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc14 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator11);
        groovy.lang.Closure closure15 = null;
        io.teknek.model.GroovyOperator groovyOperator16 = new io.teknek.model.GroovyOperator(closure15);
        java.lang.String str17 = groovyOperator16.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = groovyOperator16.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc19 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator16);
        io.teknek.plan.OperatorDesc operatorDesc20 = operatorDesc14.withNextOperator(operatorDesc19);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = operatorDesc19.getParameters();
        offsetStorageDesc7.setParameters(strMap21);
        groovyOperator1.setProperties(strMap21);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNotNull(operatorDesc20);
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = groovyOperator1.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc4 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator1);
        groovy.lang.Closure closure5 = null;
        io.teknek.model.GroovyOperator groovyOperator6 = new io.teknek.model.GroovyOperator(closure5);
        java.lang.String str7 = groovyOperator6.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = groovyOperator6.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc9 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator6);
        io.teknek.plan.OperatorDesc operatorDesc10 = operatorDesc4.withNextOperator(operatorDesc9);
        io.teknek.plan.OperatorDesc operatorDesc12 = operatorDesc10.withOperatorClass("teknek.max.workers");
        java.lang.String str13 = operatorDesc12.getName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(operatorDesc10);
        org.junit.Assert.assertNotNull(operatorDesc12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        io.teknek.plan.OperatorDesc operatorDesc0 = new io.teknek.plan.OperatorDesc();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        io.teknek.plan.FeedDesc feedDesc0 = new io.teknek.plan.FeedDesc();
        java.util.Map map1 = null;
        feedDesc0.setProperties(map1);
        io.teknek.plan.FeedDesc feedDesc4 = feedDesc0.withFeedClass("pipe.operator.command.and.arguments");
        org.junit.Assert.assertNotNull(feedDesc4);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc1 = plan0.getRootOperator();
        io.teknek.plan.Plan plan3 = plan0.withName("");
        plan0.setDisabled(false);
        io.teknek.plan.Plan plan7 = plan0.withTupleRetry((int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc10 = new io.teknek.plan.OffsetStorageDesc("", strMap9);
        offsetStorageDesc10.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        offsetStorageDesc10.setParameters(strMap13);
        groovy.lang.Closure closure15 = null;
        io.teknek.model.GroovyOperator groovyOperator16 = new io.teknek.model.GroovyOperator(closure15);
        java.lang.String str17 = groovyOperator16.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = groovyOperator16.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc19 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator16);
        groovy.lang.Closure closure20 = null;
        io.teknek.model.GroovyOperator groovyOperator21 = new io.teknek.model.GroovyOperator(closure20);
        java.lang.String str22 = groovyOperator21.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = groovyOperator21.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc24 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator21);
        io.teknek.plan.OperatorDesc operatorDesc25 = operatorDesc19.withNextOperator(operatorDesc24);
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = operatorDesc24.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc27 = offsetStorageDesc10.withParameters(strMap26);
        plan7.setOffsetStorageDesc(offsetStorageDesc10);
        int int29 = plan7.getMaxWorkersPerNode();
        java.lang.String str30 = plan7.toString();
        org.junit.Assert.assertNull(operatorDesc1);
        org.junit.Assert.assertNotNull(plan3);
        org.junit.Assert.assertNotNull(plan7);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(strMap23);
        org.junit.Assert.assertNotNull(operatorDesc25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(offsetStorageDesc27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Plan [name=]" + "'", str30, "Plan [name=]");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        io.teknek.plan.FeedDesc feedDesc0 = new io.teknek.plan.FeedDesc();
        java.util.Map map1 = null;
        io.teknek.plan.FeedDesc feedDesc2 = feedDesc0.withProperties(map1);
        java.util.Map map3 = feedDesc2.getProperties();
        io.teknek.plan.FeedDesc feedDesc4 = new io.teknek.plan.FeedDesc();
        java.util.Map map5 = null;
        io.teknek.plan.FeedDesc feedDesc6 = feedDesc4.withProperties(map5);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc9 = new io.teknek.plan.OffsetStorageDesc("", strMap8);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc12 = new io.teknek.plan.OffsetStorageDesc("", strMap11);
        offsetStorageDesc12.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        offsetStorageDesc12.setParameters(strMap15);
        groovy.lang.Closure closure17 = null;
        io.teknek.model.GroovyOperator groovyOperator18 = new io.teknek.model.GroovyOperator(closure17);
        java.lang.String str19 = groovyOperator18.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = groovyOperator18.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc21 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator18);
        groovy.lang.Closure closure22 = null;
        io.teknek.model.GroovyOperator groovyOperator23 = new io.teknek.model.GroovyOperator(closure22);
        java.lang.String str24 = groovyOperator23.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = groovyOperator23.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc26 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator23);
        io.teknek.plan.OperatorDesc operatorDesc27 = operatorDesc21.withNextOperator(operatorDesc26);
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = operatorDesc26.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc29 = offsetStorageDesc12.withParameters(strMap28);
        offsetStorageDesc9.setParameters(strMap28);
        io.teknek.plan.FeedDesc feedDesc31 = feedDesc4.withProperties((java.util.Map) strMap28);
        io.teknek.plan.FeedDesc feedDesc32 = feedDesc2.withProperties((java.util.Map) strMap28);
        org.junit.Assert.assertNotNull(feedDesc2);
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNotNull(feedDesc6);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(strMap25);
        org.junit.Assert.assertNotNull(operatorDesc27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(offsetStorageDesc29);
        org.junit.Assert.assertNotNull(feedDesc31);
        org.junit.Assert.assertNotNull(feedDesc32);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        io.teknek.datalayer.WorkerDaoException workerDaoException1 = new io.teknek.datalayer.WorkerDaoException("teknek.graphite.cluster/saved");
        java.lang.Throwable[] throwableArray2 = workerDaoException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        io.teknek.daemon.WorkerStatus workerStatus3 = new io.teknek.daemon.WorkerStatus("teknek.graphite.cluster/locks", "", "zk.base.dir");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc1 = plan0.getRootOperator();
        io.teknek.plan.Plan plan3 = plan0.withName("");
        plan0.setDisabled(false);
        int int6 = plan0.getTupleRetry();
        io.teknek.plan.Plan plan8 = plan0.withName("teknek.graphite.cluster/saved");
        plan0.setMaxWorkers((int) (short) 0);
        io.teknek.plan.OperatorDesc operatorDesc11 = plan0.getRootOperator();
        io.teknek.plan.FeedDesc feedDesc12 = new io.teknek.plan.FeedDesc();
        java.lang.String str13 = feedDesc12.getSpec();
        groovy.lang.Closure closure14 = null;
        io.teknek.model.GroovyOperator groovyOperator15 = new io.teknek.model.GroovyOperator(closure14);
        java.lang.String str16 = groovyOperator15.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = groovyOperator15.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc18 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator15);
        groovy.lang.Closure closure19 = null;
        io.teknek.model.GroovyOperator groovyOperator20 = new io.teknek.model.GroovyOperator(closure19);
        java.lang.String str21 = groovyOperator20.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = groovyOperator20.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc23 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator20);
        io.teknek.plan.OperatorDesc operatorDesc24 = operatorDesc18.withNextOperator(operatorDesc23);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = operatorDesc23.getParameters();
        io.teknek.plan.FeedDesc feedDesc26 = feedDesc12.withProperties((java.util.Map) strMap25);
        plan0.setFeedDesc(feedDesc26);
        org.junit.Assert.assertNull(operatorDesc1);
        org.junit.Assert.assertNotNull(plan3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(plan8);
        org.junit.Assert.assertNull(operatorDesc11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strMap17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(strMap22);
        org.junit.Assert.assertNotNull(operatorDesc24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(feedDesc26);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc1 = plan0.getRootOperator();
        io.teknek.plan.Plan plan3 = plan0.withName("");
        plan0.setDisabled(false);
        plan0.setTupleRetry((int) (byte) 100);
        java.lang.String[] strArray14 = new java.lang.String[] { "zk.base.dir", "UTF-8", "simple.pipe.operator.input.field", "io.teknek.datalayer.WorkerDaoException: zk.base.dir", "zk.base.dir", "pipe.operator.command.and.arguments" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        io.teknek.daemon.TeknekDaemon teknekDaemon17 = null;
        io.teknek.daemon.Worker worker18 = new io.teknek.daemon.Worker(plan0, (java.util.List<java.lang.String>) strList15, teknekDaemon17);
        worker18.start();
        org.junit.Assert.assertNull(operatorDesc1);
        org.junit.Assert.assertNotNull(plan3);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.lang.String str3 = groovyOperator1.getPath();
        groovyOperator1.commit();
        groovyOperator1.setPath("teknek.max.workers");
        com.codahale.metrics.MetricRegistry metricRegistry7 = null;
        groovyOperator1.setMetricRegistry(metricRegistry7);
        io.teknek.collector.Collector collector9 = new io.teknek.collector.Collector();
        groovyOperator1.setCollector((io.teknek.model.ICollector) collector9);
        io.teknek.model.ITuple iTuple11 = collector9.peek();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(iTuple11);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc1 = plan0.getRootOperator();
        io.teknek.plan.Plan plan3 = plan0.withName("");
        plan0.setDisabled(false);
        int int6 = plan0.getTupleRetry();
        io.teknek.plan.Plan plan8 = plan0.withName("teknek.graphite.cluster/saved");
        plan0.setMaxWorkers((int) (short) 0);
        io.teknek.plan.OperatorDesc operatorDesc11 = plan0.getRootOperator();
        plan0.setMaxWorkersPerNode((int) 'a');
        org.junit.Assert.assertNull(operatorDesc1);
        org.junit.Assert.assertNotNull(plan3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(plan8);
        org.junit.Assert.assertNull(operatorDesc11);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        java.lang.String str3 = workerDao2.SAVED_ZK;
        java.lang.String str4 = workerDao2.LOCKS_ZK;
        java.lang.String str5 = workerDao2.LOCKS_ZK;
        io.teknek.plan.Plan plan6 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc7 = plan6.getRootOperator();
        io.teknek.plan.Plan plan9 = plan6.withName("");
        plan6.setDisabled(false);
        io.teknek.plan.Plan plan13 = plan6.withTupleRetry((int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc16 = new io.teknek.plan.OffsetStorageDesc("", strMap15);
        offsetStorageDesc16.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        offsetStorageDesc16.setParameters(strMap19);
        groovy.lang.Closure closure21 = null;
        io.teknek.model.GroovyOperator groovyOperator22 = new io.teknek.model.GroovyOperator(closure21);
        java.lang.String str23 = groovyOperator22.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = groovyOperator22.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc25 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator22);
        groovy.lang.Closure closure26 = null;
        io.teknek.model.GroovyOperator groovyOperator27 = new io.teknek.model.GroovyOperator(closure26);
        java.lang.String str28 = groovyOperator27.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = groovyOperator27.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc30 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator27);
        io.teknek.plan.OperatorDesc operatorDesc31 = operatorDesc25.withNextOperator(operatorDesc30);
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = operatorDesc30.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc33 = offsetStorageDesc16.withParameters(strMap32);
        plan13.setOffsetStorageDesc(offsetStorageDesc16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList35 = workerDao2.findWorkersWorkingOnPlan(plan13);
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "teknek.graphite.cluster/saved" + "'", str3, "teknek.graphite.cluster/saved");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "teknek.graphite.cluster/locks" + "'", str4, "teknek.graphite.cluster/locks");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "teknek.graphite.cluster/locks" + "'", str5, "teknek.graphite.cluster/locks");
        org.junit.Assert.assertNull(operatorDesc7);
        org.junit.Assert.assertNotNull(plan9);
        org.junit.Assert.assertNotNull(plan13);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(strMap29);
        org.junit.Assert.assertNotNull(operatorDesc31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(offsetStorageDesc33);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        io.teknek.plan.FeedDesc feedDesc0 = new io.teknek.plan.FeedDesc();
        java.lang.String str1 = feedDesc0.getSpec();
        java.lang.String str2 = feedDesc0.getName();
        io.teknek.plan.FeedDesc feedDesc4 = feedDesc0.withName("io.teknek.datalayer.WorkerDaoException: zk.base.dir");
        java.lang.String str5 = feedDesc4.getScript();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(feedDesc4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        io.teknek.zookeeper.DummyWatcher dummyWatcher0 = new io.teknek.zookeeper.DummyWatcher();
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = dummyWatcher0.connectOrThrow((long) (short) -1, timeUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        java.lang.Object[] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map map1 = io.teknek.util.MapBuilder.makeMap(objArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        java.lang.String str3 = workerDao2.SAVED_ZK;
        java.lang.String str4 = workerDao2.LOCKS_ZK;
        org.apache.zookeeper.ZooKeeper zooKeeper5 = null;
        io.teknek.plan.FeedDesc feedDesc6 = new io.teknek.plan.FeedDesc();
        java.lang.String str7 = feedDesc6.getSpec();
        groovy.lang.Closure closure8 = null;
        io.teknek.model.GroovyOperator groovyOperator9 = new io.teknek.model.GroovyOperator(closure8);
        java.lang.String str10 = groovyOperator9.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = groovyOperator9.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc12 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator9);
        groovy.lang.Closure closure13 = null;
        io.teknek.model.GroovyOperator groovyOperator14 = new io.teknek.model.GroovyOperator(closure13);
        java.lang.String str15 = groovyOperator14.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = groovyOperator14.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc17 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator14);
        io.teknek.plan.OperatorDesc operatorDesc18 = operatorDesc12.withNextOperator(operatorDesc17);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = operatorDesc17.getParameters();
        io.teknek.plan.FeedDesc feedDesc20 = feedDesc6.withProperties((java.util.Map) strMap19);
        feedDesc6.setScript("teknek.graphite.cluster/locks");
        // The following exception was thrown during execution in test generation
        try {
            workerDao2.saveFeedDesc(zooKeeper5, feedDesc6, "/teknek/offset", "/teknek/offset");
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "teknek.graphite.cluster/saved" + "'", str3, "teknek.graphite.cluster/saved");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "teknek.graphite.cluster/locks" + "'", str4, "teknek.graphite.cluster/locks");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNotNull(operatorDesc18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(feedDesc20);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc1 = plan0.getRootOperator();
        io.teknek.plan.Plan plan3 = plan0.withName("");
        int int4 = plan3.getTupleRetry();
        org.junit.Assert.assertNull(operatorDesc1);
        org.junit.Assert.assertNotNull(plan3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        io.teknek.datalayer.WorkerDaoException workerDaoException1 = new io.teknek.datalayer.WorkerDaoException("/teknek/offset");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        io.teknek.plan.Plan plan0 = null;
        byte[] byteArray1 = io.teknek.datalayer.WorkerDao.serializePlan(plan0);
        io.teknek.plan.Plan plan2 = io.teknek.datalayer.WorkerDao.deserializePlan(byteArray1);
        io.teknek.plan.Plan plan3 = io.teknek.datalayer.WorkerDao.deserializePlan(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[110, 117, 108, 108]");
        org.junit.Assert.assertNull(plan2);
        org.junit.Assert.assertNull(plan3);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        io.teknek.daemon.WorkerStatus workerStatus3 = new io.teknek.daemon.WorkerStatus("", "teknek.graphite.cluster", "teknek.graphite.cluster");
        workerStatus3.setTeknekDaemonId("/teknek/offset");
        java.lang.String str6 = workerStatus3.getFeedPartitionId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "teknek.graphite.cluster" + "'", str6, "teknek.graphite.cluster");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        io.teknek.model.Tuple tuple0 = new io.teknek.model.Tuple();
        groovy.lang.Closure closure2 = null;
        io.teknek.model.GroovyOperator groovyOperator3 = new io.teknek.model.GroovyOperator(closure2);
        java.lang.String str4 = groovyOperator3.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = groovyOperator3.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc6 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator3);
        groovy.lang.Closure closure7 = null;
        io.teknek.model.GroovyOperator groovyOperator8 = new io.teknek.model.GroovyOperator(closure7);
        java.lang.String str9 = groovyOperator8.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = groovyOperator8.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc11 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator8);
        io.teknek.plan.OperatorDesc operatorDesc12 = operatorDesc6.withNextOperator(operatorDesc11);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc15 = new io.teknek.plan.OffsetStorageDesc("", strMap14);
        offsetStorageDesc15.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        offsetStorageDesc15.setParameters(strMap18);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc22 = new io.teknek.plan.OffsetStorageDesc("", strMap21);
        offsetStorageDesc22.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = null;
        offsetStorageDesc22.setParameters(strMap25);
        groovy.lang.Closure closure27 = null;
        io.teknek.model.GroovyOperator groovyOperator28 = new io.teknek.model.GroovyOperator(closure27);
        java.lang.String str29 = groovyOperator28.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = groovyOperator28.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc31 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator28);
        groovy.lang.Closure closure32 = null;
        io.teknek.model.GroovyOperator groovyOperator33 = new io.teknek.model.GroovyOperator(closure32);
        java.lang.String str34 = groovyOperator33.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = groovyOperator33.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc36 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator33);
        io.teknek.plan.OperatorDesc operatorDesc37 = operatorDesc31.withNextOperator(operatorDesc36);
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = operatorDesc36.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc39 = offsetStorageDesc22.withParameters(strMap38);
        offsetStorageDesc15.setParameters(strMap38);
        operatorDesc11.setParameters(strMap38);
        io.teknek.model.ITuple iTuple42 = tuple0.withField("", (java.lang.Object) operatorDesc11);
        java.lang.Object obj44 = tuple0.getField("/teknek");
        java.util.Set<java.lang.String> strSet45 = tuple0.listFields();
        tuple0.clearFields();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNotNull(operatorDesc12);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(strMap35);
        org.junit.Assert.assertNotNull(operatorDesc37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(offsetStorageDesc39);
        org.junit.Assert.assertNotNull(iTuple42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(strSet45);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        java.lang.String str3 = feedPartitionAdapter2.getOffset();
        java.lang.String str4 = feedPartitionAdapter2.getOffset();
        com.codahale.metrics.MetricRegistry metricRegistry5 = feedPartitionAdapter2.getMetricRegistry();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(metricRegistry5);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        io.teknek.operator.SimplePipeOperator simplePipeOperator0 = new io.teknek.operator.SimplePipeOperator();
        io.teknek.model.Tuple tuple1 = new io.teknek.model.Tuple();
        groovy.lang.Closure closure3 = null;
        io.teknek.model.GroovyOperator groovyOperator4 = new io.teknek.model.GroovyOperator(closure3);
        java.lang.String str5 = groovyOperator4.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = groovyOperator4.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc7 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator4);
        groovy.lang.Closure closure8 = null;
        io.teknek.model.GroovyOperator groovyOperator9 = new io.teknek.model.GroovyOperator(closure8);
        java.lang.String str10 = groovyOperator9.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = groovyOperator9.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc12 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator9);
        io.teknek.plan.OperatorDesc operatorDesc13 = operatorDesc7.withNextOperator(operatorDesc12);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc16 = new io.teknek.plan.OffsetStorageDesc("", strMap15);
        offsetStorageDesc16.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        offsetStorageDesc16.setParameters(strMap19);
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc23 = new io.teknek.plan.OffsetStorageDesc("", strMap22);
        offsetStorageDesc23.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = null;
        offsetStorageDesc23.setParameters(strMap26);
        groovy.lang.Closure closure28 = null;
        io.teknek.model.GroovyOperator groovyOperator29 = new io.teknek.model.GroovyOperator(closure28);
        java.lang.String str30 = groovyOperator29.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = groovyOperator29.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc32 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator29);
        groovy.lang.Closure closure33 = null;
        io.teknek.model.GroovyOperator groovyOperator34 = new io.teknek.model.GroovyOperator(closure33);
        java.lang.String str35 = groovyOperator34.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = groovyOperator34.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc37 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator34);
        io.teknek.plan.OperatorDesc operatorDesc38 = operatorDesc32.withNextOperator(operatorDesc37);
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = operatorDesc37.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc40 = offsetStorageDesc23.withParameters(strMap39);
        offsetStorageDesc16.setParameters(strMap39);
        operatorDesc12.setParameters(strMap39);
        io.teknek.model.ITuple iTuple43 = tuple1.withField("", (java.lang.Object) operatorDesc12);
        java.lang.Object obj45 = tuple1.getField("/teknek");
        java.util.Set<java.lang.String> strSet46 = tuple1.listFields();
        // The following exception was thrown during execution in test generation
        try {
            simplePipeOperator0.handleTuple((io.teknek.model.ITuple) tuple1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNotNull(operatorDesc13);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(strMap31);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(strMap36);
        org.junit.Assert.assertNotNull(operatorDesc38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(offsetStorageDesc40);
        org.junit.Assert.assertNotNull(iTuple43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(strSet46);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = groovyOperator1.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc4 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator1);
        groovy.lang.Closure closure5 = null;
        io.teknek.model.GroovyOperator groovyOperator6 = new io.teknek.model.GroovyOperator(closure5);
        java.lang.String str7 = groovyOperator6.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = groovyOperator6.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc9 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator6);
        io.teknek.plan.OperatorDesc operatorDesc10 = operatorDesc4.withNextOperator(operatorDesc9);
        io.teknek.plan.OperatorDesc operatorDesc12 = operatorDesc9.withOperatorClass("/teknek/offset");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(operatorDesc10);
        org.junit.Assert.assertNotNull(operatorDesc12);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        io.teknek.plan.OperatorDesc operatorDesc0 = null;
        byte[] byteArray1 = io.teknek.datalayer.WorkerDao.serializeOperatorDesc(operatorDesc0);
        io.teknek.plan.Plan plan2 = io.teknek.datalayer.WorkerDao.deserializePlan(byteArray1);
        io.teknek.plan.FeedDesc feedDesc3 = io.teknek.datalayer.WorkerDao.deserializeFeedDesc(byteArray1);
        io.teknek.plan.Plan plan4 = io.teknek.datalayer.WorkerDao.deserializePlan(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[110, 117, 108, 108]");
        org.junit.Assert.assertNull(plan2);
        org.junit.Assert.assertNull(feedDesc3);
        org.junit.Assert.assertNull(plan4);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "simple.pipe.operator.input.field");
        groovy.lang.Closure closure3 = null;
        io.teknek.model.GroovyOperator groovyOperator4 = new io.teknek.model.GroovyOperator(closure3);
        java.lang.String str5 = groovyOperator4.getPath();
        java.lang.String str6 = groovyOperator4.getPath();
        java.lang.String str7 = groovyOperator4.getPartitionId();
        io.teknek.feed.Feed feed8 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter10 = new io.teknek.feed.FeedPartitionAdapter(feed8, "pipe.operator.command.and.arguments");
        io.teknek.plan.Plan plan11 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc12 = plan11.getRootOperator();
        io.teknek.plan.Plan plan14 = plan11.withName("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        io.teknek.zookeeper.ZookeeperOffsetStorage zookeeperOffsetStorage16 = new io.teknek.zookeeper.ZookeeperOffsetStorage((io.teknek.feed.FeedPartition) feedPartitionAdapter10, plan11, strMap15);
        io.teknek.collector.CollectorProcessor collectorProcessor17 = null;
        com.codahale.metrics.MetricRegistry metricRegistry19 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.driver.Driver driver21 = new io.teknek.driver.Driver((io.teknek.feed.FeedPartition) feedPartitionAdapter2, (io.teknek.model.Operator) groovyOperator4, (io.teknek.offsetstorage.OffsetStorage) zookeeperOffsetStorage16, collectorProcessor17, (int) (short) -1, metricRegistry19, "teknek.graphite.cluster/locks");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(operatorDesc12);
        org.junit.Assert.assertNotNull(plan14);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        java.lang.String str3 = workerDao2.SAVED_ZK;
        java.lang.String str4 = workerDao2.PLANS_ZK;
        java.lang.String str5 = workerDao2.SAVED_ZK;
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.plan.Plan plan7 = workerDao2.findPlanByName("teknek.max.workers");
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "teknek.graphite.cluster/saved" + "'", str3, "teknek.graphite.cluster/saved");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "teknek.graphite.cluster/plans" + "'", str4, "teknek.graphite.cluster/plans");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "teknek.graphite.cluster/saved" + "'", str5, "teknek.graphite.cluster/saved");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "pipe.operator.command.and.arguments");
        io.teknek.plan.Plan plan3 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc4 = plan3.getRootOperator();
        io.teknek.plan.Plan plan6 = plan3.withName("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        io.teknek.zookeeper.ZookeeperOffsetStorage zookeeperOffsetStorage8 = new io.teknek.zookeeper.ZookeeperOffsetStorage((io.teknek.feed.FeedPartition) feedPartitionAdapter2, plan3, strMap7);
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.offsetstorage.Offset offset9 = zookeeperOffsetStorage8.getCurrentOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(operatorDesc4);
        org.junit.Assert.assertNotNull(plan6);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        io.teknek.plan.FeedDesc feedDesc0 = new io.teknek.plan.FeedDesc();
        java.util.Map map1 = null;
        feedDesc0.setProperties(map1);
        java.util.Map map3 = null;
        feedDesc0.setProperties(map3);
        feedDesc0.setName("zk.base.dir");
        io.teknek.plan.FeedDesc feedDesc8 = feedDesc0.withName("simple.pipe.operator.output.field");
        feedDesc8.setName("teknek.graphite.cluster/plans");
        feedDesc8.setTheClass("/teknek/offset");
        java.lang.String str13 = feedDesc8.getName();
        org.junit.Assert.assertNotNull(feedDesc8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "teknek.graphite.cluster/plans" + "'", str13, "teknek.graphite.cluster/plans");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        boolean boolean3 = feedPartitionAdapter2.supportsOffsetManagement();
        boolean boolean4 = feedPartitionAdapter2.supportsOffsetManagement();
        feedPartitionAdapter2.setOffset("teknek.graphite.cluster");
        boolean boolean7 = feedPartitionAdapter2.supportsOffsetManagement();
        com.codahale.metrics.MetricRegistry metricRegistry8 = feedPartitionAdapter2.getMetricRegistry();
        io.teknek.plan.Plan plan9 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc10 = plan9.getRootOperator();
        plan9.setMaxWorkersPerNode((int) (short) 1);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Throwable throwable17 = null;
        io.teknek.datalayer.WorkerDaoException workerDaoException18 = new io.teknek.datalayer.WorkerDaoException("", throwable17);
        io.teknek.datalayer.WorkerDaoException workerDaoException21 = new io.teknek.datalayer.WorkerDaoException("hi!", throwable17, false, true);
        io.teknek.daemon.WorkerStartException workerStartException22 = new io.teknek.daemon.WorkerStartException("teknek.graphite.cluster", (java.lang.Throwable) workerDaoException21);
        io.teknek.daemon.WorkerStatus workerStatus26 = new io.teknek.daemon.WorkerStatus("", "teknek.graphite.cluster", "teknek.graphite.cluster");
        io.teknek.feed.Feed feed27 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter29 = new io.teknek.feed.FeedPartitionAdapter(feed27, "/teknek");
        boolean boolean30 = feedPartitionAdapter29.supportsOffsetManagement();
        io.teknek.feed.Feed feed31 = feedPartitionAdapter29.getFeed();
        java.lang.Object[] objArray32 = new java.lang.Object[] { obj13, "teknek.graphite.cluster", "teknek.graphite.cluster", feed31 };
        java.util.Map map33 = io.teknek.util.MapBuilder.makeMap(objArray32);
        io.teknek.zookeeper.ZookeeperOffsetStorage zookeeperOffsetStorage34 = new io.teknek.zookeeper.ZookeeperOffsetStorage((io.teknek.feed.FeedPartition) feedPartitionAdapter2, plan9, (java.util.Map<java.lang.String, java.lang.String>) map33);
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.offsetstorage.Offset offset35 = zookeeperOffsetStorage34.getCurrentOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(metricRegistry8);
        org.junit.Assert.assertNull(operatorDesc10);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(feed31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "pipe.operator.command.and.arguments");
        io.teknek.plan.Plan plan3 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc4 = plan3.getRootOperator();
        io.teknek.plan.Plan plan6 = plan3.withName("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        io.teknek.zookeeper.ZookeeperOffsetStorage zookeeperOffsetStorage8 = new io.teknek.zookeeper.ZookeeperOffsetStorage((io.teknek.feed.FeedPartition) feedPartitionAdapter2, plan3, strMap7);
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.offsetstorage.Offset offset9 = zookeeperOffsetStorage8.findLatestPersistedOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(operatorDesc4);
        org.junit.Assert.assertNotNull(plan6);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        io.teknek.model.Tuple tuple0 = new io.teknek.model.Tuple();
        groovy.lang.Closure closure2 = null;
        io.teknek.model.GroovyOperator groovyOperator3 = new io.teknek.model.GroovyOperator(closure2);
        java.lang.String str4 = groovyOperator3.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = groovyOperator3.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc6 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator3);
        groovy.lang.Closure closure7 = null;
        io.teknek.model.GroovyOperator groovyOperator8 = new io.teknek.model.GroovyOperator(closure7);
        java.lang.String str9 = groovyOperator8.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = groovyOperator8.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc11 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator8);
        io.teknek.plan.OperatorDesc operatorDesc12 = operatorDesc6.withNextOperator(operatorDesc11);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc15 = new io.teknek.plan.OffsetStorageDesc("", strMap14);
        offsetStorageDesc15.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        offsetStorageDesc15.setParameters(strMap18);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc22 = new io.teknek.plan.OffsetStorageDesc("", strMap21);
        offsetStorageDesc22.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = null;
        offsetStorageDesc22.setParameters(strMap25);
        groovy.lang.Closure closure27 = null;
        io.teknek.model.GroovyOperator groovyOperator28 = new io.teknek.model.GroovyOperator(closure27);
        java.lang.String str29 = groovyOperator28.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = groovyOperator28.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc31 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator28);
        groovy.lang.Closure closure32 = null;
        io.teknek.model.GroovyOperator groovyOperator33 = new io.teknek.model.GroovyOperator(closure32);
        java.lang.String str34 = groovyOperator33.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = groovyOperator33.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc36 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator33);
        io.teknek.plan.OperatorDesc operatorDesc37 = operatorDesc31.withNextOperator(operatorDesc36);
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = operatorDesc36.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc39 = offsetStorageDesc22.withParameters(strMap38);
        offsetStorageDesc15.setParameters(strMap38);
        operatorDesc11.setParameters(strMap38);
        io.teknek.model.ITuple iTuple42 = tuple0.withField("", (java.lang.Object) operatorDesc11);
        java.lang.Object obj44 = tuple0.getField("/teknek");
        tuple0.setField("/teknek", (java.lang.Object) 10);
        tuple0.clearFields();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNotNull(operatorDesc12);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(strMap35);
        org.junit.Assert.assertNotNull(operatorDesc37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(offsetStorageDesc39);
        org.junit.Assert.assertNotNull(iTuple42);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        io.teknek.zookeeper.DummyWatcher dummyWatcher0 = new io.teknek.zookeeper.DummyWatcher();
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = dummyWatcher0.connectOrThrow((long) 10, timeUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        java.lang.String str3 = workerDao2.SAVED_ZK;
        java.lang.String str4 = workerDao2.LOCKS_ZK;
        java.lang.String str5 = workerDao2.LOCKS_ZK;
        java.lang.String str6 = workerDao2.PLANS_ZK;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "teknek.graphite.cluster/saved" + "'", str3, "teknek.graphite.cluster/saved");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "teknek.graphite.cluster/locks" + "'", str4, "teknek.graphite.cluster/locks");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "teknek.graphite.cluster/locks" + "'", str5, "teknek.graphite.cluster/locks");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "teknek.graphite.cluster/plans" + "'", str6, "teknek.graphite.cluster/plans");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        java.lang.String str3 = workerDao2.SAVED_ZK;
        java.lang.String str4 = workerDao2.LOCKS_ZK;
        java.lang.String str5 = workerDao2.WORKERS_ZK;
        io.teknek.plan.Plan plan6 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc7 = plan6.getRootOperator();
        io.teknek.plan.Plan plan9 = plan6.withName("");
        plan6.setDisabled(false);
        io.teknek.plan.Plan plan13 = plan6.withTupleRetry((int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc16 = new io.teknek.plan.OffsetStorageDesc("", strMap15);
        offsetStorageDesc16.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        offsetStorageDesc16.setParameters(strMap19);
        groovy.lang.Closure closure21 = null;
        io.teknek.model.GroovyOperator groovyOperator22 = new io.teknek.model.GroovyOperator(closure21);
        java.lang.String str23 = groovyOperator22.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = groovyOperator22.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc25 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator22);
        groovy.lang.Closure closure26 = null;
        io.teknek.model.GroovyOperator groovyOperator27 = new io.teknek.model.GroovyOperator(closure26);
        java.lang.String str28 = groovyOperator27.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = groovyOperator27.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc30 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator27);
        io.teknek.plan.OperatorDesc operatorDesc31 = operatorDesc25.withNextOperator(operatorDesc30);
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = operatorDesc30.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc33 = offsetStorageDesc16.withParameters(strMap32);
        plan13.setOffsetStorageDesc(offsetStorageDesc16);
        // The following exception was thrown during execution in test generation
        try {
            workerDao2.deletePlan(plan13);
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "teknek.graphite.cluster/saved" + "'", str3, "teknek.graphite.cluster/saved");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "teknek.graphite.cluster/locks" + "'", str4, "teknek.graphite.cluster/locks");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "teknek.graphite.cluster/workers" + "'", str5, "teknek.graphite.cluster/workers");
        org.junit.Assert.assertNull(operatorDesc7);
        org.junit.Assert.assertNotNull(plan9);
        org.junit.Assert.assertNotNull(plan13);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(strMap29);
        org.junit.Assert.assertNotNull(operatorDesc31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(offsetStorageDesc33);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("simple.pipe.operator.output.field", restablishingKeeper1);
        io.teknek.plan.Plan plan3 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc4 = plan3.getRootOperator();
        io.teknek.plan.Plan plan6 = plan3.withName("");
        plan6.setTupleRetry((int) '4');
        io.teknek.plan.Plan plan10 = plan6.withMaxWorkers((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList11 = workerDao2.findWorkersWorkingOnPlan(plan10);
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(operatorDesc4);
        org.junit.Assert.assertNotNull(plan6);
        org.junit.Assert.assertNotNull(plan10);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        io.teknek.operator.SimplePipeOperator simplePipeOperator0 = new io.teknek.operator.SimplePipeOperator();
        com.codahale.metrics.MetricRegistry metricRegistry1 = simplePipeOperator0.getMetricRegistry();
        org.junit.Assert.assertNull(metricRegistry1);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        io.teknek.plan.FeedDesc feedDesc0 = new io.teknek.plan.FeedDesc();
        java.util.Map map1 = null;
        feedDesc0.setProperties(map1);
        java.util.Map map3 = null;
        feedDesc0.setProperties(map3);
        feedDesc0.setName("zk.base.dir");
        io.teknek.plan.FeedDesc feedDesc8 = feedDesc0.withName("simple.pipe.operator.output.field");
        feedDesc0.setName("pipe.operator.command.and.arguments");
        java.lang.Class<?> wildcardClass11 = feedDesc0.getClass();
        org.junit.Assert.assertNotNull(feedDesc8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        boolean boolean3 = feedPartitionAdapter2.supportsOffsetManagement();
        boolean boolean4 = feedPartitionAdapter2.supportsOffsetManagement();
        feedPartitionAdapter2.initialize();
        feedPartitionAdapter2.initialize();
        boolean boolean7 = feedPartitionAdapter2.supportsOffsetManagement();
        feedPartitionAdapter2.close();
        java.lang.String str9 = feedPartitionAdapter2.getPath();
        feedPartitionAdapter2.setOffset("hi!/saved");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper0 = null;
        io.teknek.datalayer.WorkerDao workerDao1 = new io.teknek.datalayer.WorkerDao(restablishingKeeper0);
        io.teknek.plan.Plan plan2 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc3 = plan2.getRootOperator();
        io.teknek.plan.Plan plan5 = plan2.withName("");
        plan2.setDisabled(false);
        plan2.setTupleRetry((int) (byte) 100);
        io.teknek.plan.Plan plan11 = plan2.withName("pipe.operator.command.and.arguments");
        io.teknek.plan.FeedDesc feedDesc12 = plan11.getFeedDesc();
        // The following exception was thrown during execution in test generation
        try {
            workerDao1.deletePlan(plan11);
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(operatorDesc3);
        org.junit.Assert.assertNotNull(plan5);
        org.junit.Assert.assertNotNull(plan11);
        org.junit.Assert.assertNull(feedDesc12);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc1 = plan0.getRootOperator();
        io.teknek.plan.Plan plan3 = plan0.withName("");
        plan3.setTupleRetry((int) '4');
        io.teknek.plan.Plan plan7 = plan3.withMaxWorkers((-1));
        io.teknek.plan.OperatorDesc operatorDesc8 = plan3.getRootOperator();
        org.junit.Assert.assertNull(operatorDesc1);
        org.junit.Assert.assertNotNull(plan3);
        org.junit.Assert.assertNotNull(plan7);
        org.junit.Assert.assertNull(operatorDesc8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        io.teknek.feed.FeedPartition feedPartition0 = null;
        io.teknek.plan.Plan plan1 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc2 = plan1.getRootOperator();
        io.teknek.plan.Plan plan4 = plan1.withName("");
        plan1.setDisabled(false);
        plan1.setTupleRetry((int) (byte) 100);
        java.lang.String[] strArray15 = new java.lang.String[] { "zk.base.dir", "UTF-8", "simple.pipe.operator.input.field", "io.teknek.datalayer.WorkerDaoException: zk.base.dir", "zk.base.dir", "pipe.operator.command.and.arguments" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        io.teknek.daemon.TeknekDaemon teknekDaemon18 = null;
        io.teknek.daemon.Worker worker19 = new io.teknek.daemon.Worker(plan1, (java.util.List<java.lang.String>) strList16, teknekDaemon18);
        io.teknek.plan.OperatorDesc operatorDesc20 = plan1.getRootOperator();
        com.codahale.metrics.MetricRegistry metricRegistry21 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.driver.Driver driver22 = io.teknek.driver.DriverFactory.createDriver(feedPartition0, plan1, metricRegistry21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(operatorDesc2);
        org.junit.Assert.assertNotNull(plan4);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(operatorDesc20);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        boolean boolean3 = feedPartitionAdapter2.supportsOffsetManagement();
        boolean boolean4 = feedPartitionAdapter2.supportsOffsetManagement();
        feedPartitionAdapter2.initialize();
        io.teknek.model.ITuple iTuple6 = null;
        boolean boolean7 = feedPartitionAdapter2.next(iTuple6);
        feedPartitionAdapter2.initialize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        boolean boolean3 = feedPartitionAdapter2.supportsOffsetManagement();
        boolean boolean4 = feedPartitionAdapter2.supportsOffsetManagement();
        feedPartitionAdapter2.setOffset("teknek.graphite.cluster");
        boolean boolean7 = feedPartitionAdapter2.supportsOffsetManagement();
        com.codahale.metrics.MetricRegistry metricRegistry8 = feedPartitionAdapter2.getMetricRegistry();
        io.teknek.plan.Plan plan9 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc10 = plan9.getRootOperator();
        plan9.setMaxWorkersPerNode((int) (short) 1);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Throwable throwable17 = null;
        io.teknek.datalayer.WorkerDaoException workerDaoException18 = new io.teknek.datalayer.WorkerDaoException("", throwable17);
        io.teknek.datalayer.WorkerDaoException workerDaoException21 = new io.teknek.datalayer.WorkerDaoException("hi!", throwable17, false, true);
        io.teknek.daemon.WorkerStartException workerStartException22 = new io.teknek.daemon.WorkerStartException("teknek.graphite.cluster", (java.lang.Throwable) workerDaoException21);
        io.teknek.daemon.WorkerStatus workerStatus26 = new io.teknek.daemon.WorkerStatus("", "teknek.graphite.cluster", "teknek.graphite.cluster");
        io.teknek.feed.Feed feed27 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter29 = new io.teknek.feed.FeedPartitionAdapter(feed27, "/teknek");
        boolean boolean30 = feedPartitionAdapter29.supportsOffsetManagement();
        io.teknek.feed.Feed feed31 = feedPartitionAdapter29.getFeed();
        java.lang.Object[] objArray32 = new java.lang.Object[] { obj13, "teknek.graphite.cluster", "teknek.graphite.cluster", feed31 };
        java.util.Map map33 = io.teknek.util.MapBuilder.makeMap(objArray32);
        io.teknek.zookeeper.ZookeeperOffsetStorage zookeeperOffsetStorage34 = new io.teknek.zookeeper.ZookeeperOffsetStorage((io.teknek.feed.FeedPartition) feedPartitionAdapter2, plan9, (java.util.Map<java.lang.String, java.lang.String>) map33);
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.offsetstorage.Offset offset35 = zookeeperOffsetStorage34.getCurrentOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(metricRegistry8);
        org.junit.Assert.assertNull(operatorDesc10);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(feed31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        io.teknek.operator.SimplePipeOperator simplePipeOperator0 = new io.teknek.operator.SimplePipeOperator();
        com.codahale.metrics.MetricRegistry metricRegistry1 = null;
        simplePipeOperator0.setMetricRegistry(metricRegistry1);
        io.teknek.model.Tuple tuple3 = new io.teknek.model.Tuple();
        groovy.lang.Closure closure5 = null;
        io.teknek.model.GroovyOperator groovyOperator6 = new io.teknek.model.GroovyOperator(closure5);
        java.lang.String str7 = groovyOperator6.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = groovyOperator6.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc9 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator6);
        groovy.lang.Closure closure10 = null;
        io.teknek.model.GroovyOperator groovyOperator11 = new io.teknek.model.GroovyOperator(closure10);
        java.lang.String str12 = groovyOperator11.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = groovyOperator11.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc14 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator11);
        io.teknek.plan.OperatorDesc operatorDesc15 = operatorDesc9.withNextOperator(operatorDesc14);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc18 = new io.teknek.plan.OffsetStorageDesc("", strMap17);
        offsetStorageDesc18.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        offsetStorageDesc18.setParameters(strMap21);
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc25 = new io.teknek.plan.OffsetStorageDesc("", strMap24);
        offsetStorageDesc25.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = null;
        offsetStorageDesc25.setParameters(strMap28);
        groovy.lang.Closure closure30 = null;
        io.teknek.model.GroovyOperator groovyOperator31 = new io.teknek.model.GroovyOperator(closure30);
        java.lang.String str32 = groovyOperator31.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = groovyOperator31.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc34 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator31);
        groovy.lang.Closure closure35 = null;
        io.teknek.model.GroovyOperator groovyOperator36 = new io.teknek.model.GroovyOperator(closure35);
        java.lang.String str37 = groovyOperator36.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = groovyOperator36.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc39 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator36);
        io.teknek.plan.OperatorDesc operatorDesc40 = operatorDesc34.withNextOperator(operatorDesc39);
        java.util.Map<java.lang.String, java.lang.Object> strMap41 = operatorDesc39.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc42 = offsetStorageDesc25.withParameters(strMap41);
        offsetStorageDesc18.setParameters(strMap41);
        operatorDesc14.setParameters(strMap41);
        io.teknek.model.ITuple iTuple45 = tuple3.withField("", (java.lang.Object) operatorDesc14);
        // The following exception was thrown during execution in test generation
        try {
            simplePipeOperator0.handleTuple((io.teknek.model.ITuple) tuple3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNotNull(operatorDesc15);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(strMap33);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(strMap38);
        org.junit.Assert.assertNotNull(operatorDesc40);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(offsetStorageDesc42);
        org.junit.Assert.assertNotNull(iTuple45);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        java.lang.String str3 = workerDao2.SAVED_ZK;
        java.lang.String str4 = workerDao2.LOCKS_ZK;
        java.lang.String str5 = workerDao2.LOCKS_ZK;
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.plan.Plan plan7 = workerDao2.findPlanByName("teknek.graphite.cluster/saved");
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "teknek.graphite.cluster/saved" + "'", str3, "teknek.graphite.cluster/saved");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "teknek.graphite.cluster/locks" + "'", str4, "teknek.graphite.cluster/locks");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "teknek.graphite.cluster/locks" + "'", str5, "teknek.graphite.cluster/locks");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPartitionId();
        io.teknek.model.ICollector iCollector3 = groovyOperator1.getCollector();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(iCollector3);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        io.teknek.operator.SimplePipeOperator simplePipeOperator0 = new io.teknek.operator.SimplePipeOperator();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc3 = new io.teknek.plan.OffsetStorageDesc("", strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc6 = new io.teknek.plan.OffsetStorageDesc("", strMap5);
        offsetStorageDesc6.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        offsetStorageDesc6.setParameters(strMap9);
        groovy.lang.Closure closure11 = null;
        io.teknek.model.GroovyOperator groovyOperator12 = new io.teknek.model.GroovyOperator(closure11);
        java.lang.String str13 = groovyOperator12.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = groovyOperator12.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc15 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator12);
        groovy.lang.Closure closure16 = null;
        io.teknek.model.GroovyOperator groovyOperator17 = new io.teknek.model.GroovyOperator(closure16);
        java.lang.String str18 = groovyOperator17.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = groovyOperator17.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc20 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator17);
        io.teknek.plan.OperatorDesc operatorDesc21 = operatorDesc15.withNextOperator(operatorDesc20);
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = operatorDesc20.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc23 = offsetStorageDesc6.withParameters(strMap22);
        offsetStorageDesc3.setParameters(strMap22);
        // The following exception was thrown during execution in test generation
        try {
            simplePipeOperator0.setProperties(strMap22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNotNull(operatorDesc21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(offsetStorageDesc23);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = groovyOperator1.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc4 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator1);
        groovyOperator1.setPath("simple.pipe.operator.input.field");
        io.teknek.plan.OperatorDesc operatorDesc7 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator1);
        com.codahale.metrics.MetricRegistry metricRegistry8 = null;
        io.teknek.feed.Feed feed10 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter12 = new io.teknek.feed.FeedPartitionAdapter(feed10, "/teknek");
        boolean boolean13 = feedPartitionAdapter12.supportsOffsetManagement();
        boolean boolean14 = feedPartitionAdapter12.supportsOffsetManagement();
        feedPartitionAdapter12.initialize();
        feedPartitionAdapter12.initialize();
        boolean boolean17 = feedPartitionAdapter12.supportsOffsetManagement();
        java.lang.String str18 = feedPartitionAdapter12.getOffset();
        java.lang.String str19 = feedPartitionAdapter12.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.model.Operator operator20 = io.teknek.driver.DriverFactory.buildOperator(operatorDesc7, metricRegistry8, "teknek.graphite.cluster/locks", (io.teknek.feed.FeedPartition) feedPartitionAdapter12);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: io.teknek.nit.NitException: java.lang.InstantiationException: io.teknek.model.GroovyOperator");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc1 = plan0.getRootOperator();
        io.teknek.plan.Plan plan3 = plan0.withName("");
        plan0.setDisabled(false);
        io.teknek.plan.Plan plan7 = plan0.withMaxWorkers(0);
        plan0.setDisabled(false);
        org.junit.Assert.assertNull(operatorDesc1);
        org.junit.Assert.assertNotNull(plan3);
        org.junit.Assert.assertNotNull(plan7);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc1 = plan0.getRootOperator();
        groovy.lang.Closure closure2 = null;
        io.teknek.model.GroovyOperator groovyOperator3 = new io.teknek.model.GroovyOperator(closure2);
        java.lang.String str4 = groovyOperator3.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = groovyOperator3.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc6 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator3);
        plan0.setRootOperator(operatorDesc6);
        operatorDesc6.setName("io.teknek.model.GroovyOperator");
        org.junit.Assert.assertNull(operatorDesc1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        io.teknek.daemon.WorkerStatus workerStatus3 = new io.teknek.daemon.WorkerStatus("hi!", "teknek.graphite.cluster", "hi!");
        java.lang.String str4 = workerStatus3.getTeknekDaemonId();
        workerStatus3.setWorkerUuid("zk.base.dir");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        io.teknek.plan.FeedDesc feedDesc0 = new io.teknek.plan.FeedDesc();
        java.util.Map map1 = null;
        feedDesc0.setProperties(map1);
        java.util.Map map3 = null;
        feedDesc0.setProperties(map3);
        java.lang.String str5 = feedDesc0.getTheClass();
        java.lang.String str6 = feedDesc0.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc1 = plan0.getRootOperator();
        io.teknek.plan.Plan plan3 = plan0.withName("");
        plan3.setTupleRetry((int) '4');
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc6 = new io.teknek.plan.OffsetStorageDesc();
        io.teknek.plan.FeedDesc feedDesc7 = new io.teknek.plan.FeedDesc();
        java.lang.String str8 = feedDesc7.getSpec();
        groovy.lang.Closure closure9 = null;
        io.teknek.model.GroovyOperator groovyOperator10 = new io.teknek.model.GroovyOperator(closure9);
        java.lang.String str11 = groovyOperator10.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = groovyOperator10.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc13 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator10);
        groovy.lang.Closure closure14 = null;
        io.teknek.model.GroovyOperator groovyOperator15 = new io.teknek.model.GroovyOperator(closure14);
        java.lang.String str16 = groovyOperator15.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = groovyOperator15.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc18 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator15);
        io.teknek.plan.OperatorDesc operatorDesc19 = operatorDesc13.withNextOperator(operatorDesc18);
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = operatorDesc18.getParameters();
        io.teknek.plan.FeedDesc feedDesc21 = feedDesc7.withProperties((java.util.Map) strMap20);
        offsetStorageDesc6.setParameters(strMap20);
        io.teknek.plan.Plan plan23 = plan3.withOffsetStorageDesc(offsetStorageDesc6);
        org.junit.Assert.assertNull(operatorDesc1);
        org.junit.Assert.assertNotNull(plan3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strMap17);
        org.junit.Assert.assertNotNull(operatorDesc19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(feedDesc21);
        org.junit.Assert.assertNotNull(plan23);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        java.lang.Throwable throwable0 = null;
        io.teknek.datalayer.WorkerDaoException workerDaoException1 = new io.teknek.datalayer.WorkerDaoException(throwable0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        io.teknek.model.Tuple tuple0 = new io.teknek.model.Tuple();
        groovy.lang.Closure closure2 = null;
        io.teknek.model.GroovyOperator groovyOperator3 = new io.teknek.model.GroovyOperator(closure2);
        java.lang.String str4 = groovyOperator3.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = groovyOperator3.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc6 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator3);
        groovy.lang.Closure closure7 = null;
        io.teknek.model.GroovyOperator groovyOperator8 = new io.teknek.model.GroovyOperator(closure7);
        java.lang.String str9 = groovyOperator8.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = groovyOperator8.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc11 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator8);
        io.teknek.plan.OperatorDesc operatorDesc12 = operatorDesc6.withNextOperator(operatorDesc11);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc15 = new io.teknek.plan.OffsetStorageDesc("", strMap14);
        offsetStorageDesc15.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        offsetStorageDesc15.setParameters(strMap18);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc22 = new io.teknek.plan.OffsetStorageDesc("", strMap21);
        offsetStorageDesc22.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = null;
        offsetStorageDesc22.setParameters(strMap25);
        groovy.lang.Closure closure27 = null;
        io.teknek.model.GroovyOperator groovyOperator28 = new io.teknek.model.GroovyOperator(closure27);
        java.lang.String str29 = groovyOperator28.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = groovyOperator28.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc31 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator28);
        groovy.lang.Closure closure32 = null;
        io.teknek.model.GroovyOperator groovyOperator33 = new io.teknek.model.GroovyOperator(closure32);
        java.lang.String str34 = groovyOperator33.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = groovyOperator33.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc36 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator33);
        io.teknek.plan.OperatorDesc operatorDesc37 = operatorDesc31.withNextOperator(operatorDesc36);
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = operatorDesc36.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc39 = offsetStorageDesc22.withParameters(strMap38);
        offsetStorageDesc15.setParameters(strMap38);
        operatorDesc11.setParameters(strMap38);
        io.teknek.model.ITuple iTuple42 = tuple0.withField("", (java.lang.Object) operatorDesc11);
        java.lang.Object obj44 = tuple0.getField("/teknek");
        tuple0.clearFields();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNotNull(operatorDesc12);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(strMap35);
        org.junit.Assert.assertNotNull(operatorDesc37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(offsetStorageDesc39);
        org.junit.Assert.assertNotNull(iTuple42);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc1 = plan0.getRootOperator();
        plan0.setOffsetCommitInterval((int) (short) 10);
        plan0.setMaxWorkersPerNode(10);
        org.junit.Assert.assertNull(operatorDesc1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc1 = plan0.getRootOperator();
        io.teknek.plan.Plan plan3 = plan0.withName("");
        plan0.setDisabled(false);
        plan0.setTupleRetry((int) (byte) 100);
        io.teknek.plan.Plan plan9 = plan0.withName("pipe.operator.command.and.arguments");
        boolean boolean10 = plan0.isDisabled();
        org.junit.Assert.assertNull(operatorDesc1);
        org.junit.Assert.assertNotNull(plan3);
        org.junit.Assert.assertNotNull(plan9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.plan.OperatorDesc operatorDesc5 = io.teknek.datalayer.WorkerDao.deserializeOperatorDesc(byteArray4);
            org.junit.Assert.fail("Expected exception of type org.codehaus.jackson.JsonParseException; message: Unexpected character ('y?' (code 255)): expected a valid value (number, String, array, object, 'true', 'false' or 'null')? at [Source: [B@486d48d6; line: 1, column: 2]");
        } catch (org.codehaus.jackson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 10, 10, 100]");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        java.util.Properties properties0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.daemon.TeknekDaemon teknekDaemon1 = new io.teknek.daemon.TeknekDaemon(properties0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        io.teknek.model.ITuple iTuple3 = null;
        boolean boolean4 = feedPartitionAdapter2.next(iTuple3);
        io.teknek.model.ITuple iTuple5 = null;
        boolean boolean6 = feedPartitionAdapter2.next(iTuple5);
        feedPartitionAdapter2.setOffset("teknek.graphite.host");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc1 = plan0.getRootOperator();
        io.teknek.plan.Plan plan3 = plan0.withName("");
        plan0.setDisabled(false);
        io.teknek.plan.Plan plan7 = plan0.withMaxWorkers(0);
        io.teknek.plan.Plan plan9 = plan7.withTupleRetry((int) (byte) -1);
        plan9.setDisabled(false);
        org.junit.Assert.assertNull(operatorDesc1);
        org.junit.Assert.assertNotNull(plan3);
        org.junit.Assert.assertNotNull(plan7);
        org.junit.Assert.assertNotNull(plan9);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        java.lang.String str3 = workerDao2.SAVED_ZK;
        java.lang.String str4 = workerDao2.LOCKS_ZK;
        java.lang.String str5 = workerDao2.SAVED_ZK;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "teknek.graphite.cluster/saved" + "'", str3, "teknek.graphite.cluster/saved");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "teknek.graphite.cluster/locks" + "'", str4, "teknek.graphite.cluster/locks");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "teknek.graphite.cluster/saved" + "'", str5, "teknek.graphite.cluster/saved");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.lang.String str3 = groovyOperator1.getPath();
        java.lang.String str4 = groovyOperator1.getPartitionId();
        groovyOperator1.commit();
        groovyOperator1.close();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        io.teknek.model.IdentityOperator identityOperator0 = new io.teknek.model.IdentityOperator();
        io.teknek.model.Tuple tuple1 = new io.teknek.model.Tuple();
        groovy.lang.Closure closure3 = null;
        io.teknek.model.GroovyOperator groovyOperator4 = new io.teknek.model.GroovyOperator(closure3);
        java.lang.String str5 = groovyOperator4.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = groovyOperator4.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc7 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator4);
        groovy.lang.Closure closure8 = null;
        io.teknek.model.GroovyOperator groovyOperator9 = new io.teknek.model.GroovyOperator(closure8);
        java.lang.String str10 = groovyOperator9.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = groovyOperator9.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc12 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator9);
        io.teknek.plan.OperatorDesc operatorDesc13 = operatorDesc7.withNextOperator(operatorDesc12);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc16 = new io.teknek.plan.OffsetStorageDesc("", strMap15);
        offsetStorageDesc16.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        offsetStorageDesc16.setParameters(strMap19);
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc23 = new io.teknek.plan.OffsetStorageDesc("", strMap22);
        offsetStorageDesc23.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = null;
        offsetStorageDesc23.setParameters(strMap26);
        groovy.lang.Closure closure28 = null;
        io.teknek.model.GroovyOperator groovyOperator29 = new io.teknek.model.GroovyOperator(closure28);
        java.lang.String str30 = groovyOperator29.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = groovyOperator29.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc32 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator29);
        groovy.lang.Closure closure33 = null;
        io.teknek.model.GroovyOperator groovyOperator34 = new io.teknek.model.GroovyOperator(closure33);
        java.lang.String str35 = groovyOperator34.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = groovyOperator34.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc37 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator34);
        io.teknek.plan.OperatorDesc operatorDesc38 = operatorDesc32.withNextOperator(operatorDesc37);
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = operatorDesc37.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc40 = offsetStorageDesc23.withParameters(strMap39);
        offsetStorageDesc16.setParameters(strMap39);
        operatorDesc12.setParameters(strMap39);
        io.teknek.model.ITuple iTuple43 = tuple1.withField("", (java.lang.Object) operatorDesc12);
        java.lang.Object obj45 = tuple1.getField("/teknek");
        java.util.Set<java.lang.String> strSet46 = tuple1.listFields();
        // The following exception was thrown during execution in test generation
        try {
            identityOperator0.handleTuple((io.teknek.model.ITuple) tuple1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNotNull(operatorDesc13);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(strMap31);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(strMap36);
        org.junit.Assert.assertNotNull(operatorDesc38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(offsetStorageDesc40);
        org.junit.Assert.assertNotNull(iTuple43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(strSet46);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        io.teknek.plan.Bundle bundle0 = new io.teknek.plan.Bundle();
        groovy.lang.Closure closure1 = null;
        io.teknek.model.GroovyOperator groovyOperator2 = new io.teknek.model.GroovyOperator(closure1);
        java.lang.String str3 = groovyOperator2.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = groovyOperator2.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc5 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator2);
        groovy.lang.Closure closure6 = null;
        io.teknek.model.GroovyOperator groovyOperator7 = new io.teknek.model.GroovyOperator(closure6);
        java.lang.String str8 = groovyOperator7.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = groovyOperator7.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc10 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator7);
        io.teknek.plan.OperatorDesc operatorDesc11 = operatorDesc5.withNextOperator(operatorDesc10);
        groovy.lang.Closure closure12 = null;
        io.teknek.model.GroovyOperator groovyOperator13 = new io.teknek.model.GroovyOperator(closure12);
        java.lang.String str14 = groovyOperator13.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = groovyOperator13.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc16 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator13);
        groovy.lang.Closure closure17 = null;
        io.teknek.model.GroovyOperator groovyOperator18 = new io.teknek.model.GroovyOperator(closure17);
        java.lang.String str19 = groovyOperator18.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = groovyOperator18.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc21 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator18);
        io.teknek.plan.OperatorDesc operatorDesc22 = operatorDesc16.withNextOperator(operatorDesc21);
        groovy.lang.Closure closure23 = null;
        io.teknek.model.GroovyOperator groovyOperator24 = new io.teknek.model.GroovyOperator(closure23);
        java.lang.String str25 = groovyOperator24.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = groovyOperator24.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc27 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator24);
        groovy.lang.Closure closure28 = null;
        io.teknek.model.GroovyOperator groovyOperator29 = new io.teknek.model.GroovyOperator(closure28);
        java.lang.String str30 = groovyOperator29.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = groovyOperator29.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc32 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator29);
        io.teknek.plan.OperatorDesc operatorDesc33 = operatorDesc27.withNextOperator(operatorDesc32);
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = operatorDesc32.getParameters();
        groovy.lang.Closure closure35 = null;
        io.teknek.model.GroovyOperator groovyOperator36 = new io.teknek.model.GroovyOperator(closure35);
        java.lang.String str37 = groovyOperator36.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = groovyOperator36.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc39 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator36);
        groovy.lang.Closure closure40 = null;
        io.teknek.model.GroovyOperator groovyOperator41 = new io.teknek.model.GroovyOperator(closure40);
        java.lang.String str42 = groovyOperator41.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = groovyOperator41.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc44 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator41);
        io.teknek.plan.OperatorDesc operatorDesc45 = operatorDesc39.withNextOperator(operatorDesc44);
        io.teknek.plan.OperatorDesc[] operatorDescArray46 = new io.teknek.plan.OperatorDesc[] { operatorDesc22, operatorDesc32, operatorDesc45 };
        java.util.ArrayList<io.teknek.plan.OperatorDesc> operatorDescList47 = new java.util.ArrayList<io.teknek.plan.OperatorDesc>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<io.teknek.plan.OperatorDesc>) operatorDescList47, operatorDescArray46);
        operatorDesc11.setChildren((java.util.List<io.teknek.plan.OperatorDesc>) operatorDescList47);
        bundle0.setOperatorList((java.util.List<io.teknek.plan.OperatorDesc>) operatorDescList47);
        java.lang.String str51 = bundle0.getPackageName();
        bundle0.setPackageName("teknek.graphite.cluster");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(operatorDesc11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertNotNull(operatorDesc22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(strMap26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(strMap31);
        org.junit.Assert.assertNotNull(operatorDesc33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(strMap38);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(strMap43);
        org.junit.Assert.assertNotNull(operatorDesc45);
        org.junit.Assert.assertNotNull(operatorDescArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = groovyOperator1.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc4 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator1);
        groovy.lang.Closure closure5 = null;
        io.teknek.model.GroovyOperator groovyOperator6 = new io.teknek.model.GroovyOperator(closure5);
        java.lang.String str7 = groovyOperator6.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = groovyOperator6.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc9 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator6);
        io.teknek.plan.OperatorDesc operatorDesc10 = operatorDesc4.withNextOperator(operatorDesc9);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = operatorDesc9.getParameters();
        groovy.lang.Closure closure12 = null;
        io.teknek.model.GroovyOperator groovyOperator13 = new io.teknek.model.GroovyOperator(closure12);
        java.lang.String str14 = groovyOperator13.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = groovyOperator13.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc16 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator13);
        groovy.lang.Closure closure17 = null;
        io.teknek.model.GroovyOperator groovyOperator18 = new io.teknek.model.GroovyOperator(closure17);
        java.lang.String str19 = groovyOperator18.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = groovyOperator18.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc21 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator18);
        io.teknek.plan.OperatorDesc operatorDesc22 = operatorDesc16.withNextOperator(operatorDesc21);
        operatorDesc16.setName("pipe.operator.command.and.arguments");
        operatorDesc16.setTheClass("hi!");
        io.teknek.plan.OperatorDesc operatorDesc27 = operatorDesc9.withNextOperator(operatorDesc16);
        groovy.lang.Closure closure28 = null;
        io.teknek.model.GroovyOperator groovyOperator29 = new io.teknek.model.GroovyOperator(closure28);
        java.lang.String str30 = groovyOperator29.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = groovyOperator29.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc32 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator29);
        groovy.lang.Closure closure33 = null;
        io.teknek.model.GroovyOperator groovyOperator34 = new io.teknek.model.GroovyOperator(closure33);
        java.lang.String str35 = groovyOperator34.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = groovyOperator34.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc37 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator34);
        io.teknek.plan.OperatorDesc operatorDesc38 = operatorDesc32.withNextOperator(operatorDesc37);
        java.lang.String str39 = operatorDesc37.getSpec();
        io.teknek.plan.OperatorDesc operatorDesc40 = operatorDesc16.withNextOperator(operatorDesc37);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(operatorDesc10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertNotNull(operatorDesc22);
        org.junit.Assert.assertNotNull(operatorDesc27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(strMap31);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(strMap36);
        org.junit.Assert.assertNotNull(operatorDesc38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(operatorDesc40);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        io.teknek.model.Tuple tuple0 = new io.teknek.model.Tuple();
        groovy.lang.Closure closure2 = null;
        io.teknek.model.GroovyOperator groovyOperator3 = new io.teknek.model.GroovyOperator(closure2);
        java.lang.String str4 = groovyOperator3.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = groovyOperator3.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc6 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator3);
        groovy.lang.Closure closure7 = null;
        io.teknek.model.GroovyOperator groovyOperator8 = new io.teknek.model.GroovyOperator(closure7);
        java.lang.String str9 = groovyOperator8.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = groovyOperator8.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc11 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator8);
        io.teknek.plan.OperatorDesc operatorDesc12 = operatorDesc6.withNextOperator(operatorDesc11);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc15 = new io.teknek.plan.OffsetStorageDesc("", strMap14);
        offsetStorageDesc15.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        offsetStorageDesc15.setParameters(strMap18);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc22 = new io.teknek.plan.OffsetStorageDesc("", strMap21);
        offsetStorageDesc22.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = null;
        offsetStorageDesc22.setParameters(strMap25);
        groovy.lang.Closure closure27 = null;
        io.teknek.model.GroovyOperator groovyOperator28 = new io.teknek.model.GroovyOperator(closure27);
        java.lang.String str29 = groovyOperator28.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = groovyOperator28.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc31 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator28);
        groovy.lang.Closure closure32 = null;
        io.teknek.model.GroovyOperator groovyOperator33 = new io.teknek.model.GroovyOperator(closure32);
        java.lang.String str34 = groovyOperator33.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = groovyOperator33.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc36 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator33);
        io.teknek.plan.OperatorDesc operatorDesc37 = operatorDesc31.withNextOperator(operatorDesc36);
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = operatorDesc36.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc39 = offsetStorageDesc22.withParameters(strMap38);
        offsetStorageDesc15.setParameters(strMap38);
        operatorDesc11.setParameters(strMap38);
        io.teknek.model.ITuple iTuple42 = tuple0.withField("", (java.lang.Object) operatorDesc11);
        groovy.lang.Closure closure44 = null;
        io.teknek.model.GroovyOperator groovyOperator45 = new io.teknek.model.GroovyOperator(closure44);
        java.lang.String str46 = groovyOperator45.getPath();
        java.lang.String str47 = groovyOperator45.getPath();
        com.codahale.metrics.MetricRegistry metricRegistry48 = groovyOperator45.getMetricRegistry();
        com.codahale.metrics.MetricRegistry metricRegistry49 = null;
        groovyOperator45.setMetricRegistry(metricRegistry49);
        groovyOperator45.commit();
        io.teknek.model.ITuple iTuple52 = tuple0.withField("/teknek", (java.lang.Object) groovyOperator45);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNotNull(operatorDesc12);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(strMap35);
        org.junit.Assert.assertNotNull(operatorDesc37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(offsetStorageDesc39);
        org.junit.Assert.assertNotNull(iTuple42);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(metricRegistry48);
        org.junit.Assert.assertNotNull(iTuple52);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        io.teknek.daemon.WorkerStatus workerStatus3 = new io.teknek.daemon.WorkerStatus("", "teknek.graphite.cluster", "teknek.graphite.cluster");
        java.lang.String str4 = workerStatus3.getTeknekDaemonId();
        java.lang.String str5 = workerStatus3.getTeknekDaemonId();
        java.lang.String str6 = workerStatus3.getFeedPartitionId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "teknek.graphite.cluster" + "'", str4, "teknek.graphite.cluster");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "teknek.graphite.cluster" + "'", str5, "teknek.graphite.cluster");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "teknek.graphite.cluster" + "'", str6, "teknek.graphite.cluster");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        boolean boolean3 = feedPartitionAdapter2.supportsOffsetManagement();
        boolean boolean4 = feedPartitionAdapter2.supportsOffsetManagement();
        feedPartitionAdapter2.setOffset("teknek.graphite.cluster");
        boolean boolean7 = feedPartitionAdapter2.supportsOffsetManagement();
        com.codahale.metrics.MetricRegistry metricRegistry8 = feedPartitionAdapter2.getMetricRegistry();
        io.teknek.plan.Plan plan9 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc10 = plan9.getRootOperator();
        plan9.setMaxWorkersPerNode((int) (short) 1);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Throwable throwable17 = null;
        io.teknek.datalayer.WorkerDaoException workerDaoException18 = new io.teknek.datalayer.WorkerDaoException("", throwable17);
        io.teknek.datalayer.WorkerDaoException workerDaoException21 = new io.teknek.datalayer.WorkerDaoException("hi!", throwable17, false, true);
        io.teknek.daemon.WorkerStartException workerStartException22 = new io.teknek.daemon.WorkerStartException("teknek.graphite.cluster", (java.lang.Throwable) workerDaoException21);
        io.teknek.daemon.WorkerStatus workerStatus26 = new io.teknek.daemon.WorkerStatus("", "teknek.graphite.cluster", "teknek.graphite.cluster");
        io.teknek.feed.Feed feed27 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter29 = new io.teknek.feed.FeedPartitionAdapter(feed27, "/teknek");
        boolean boolean30 = feedPartitionAdapter29.supportsOffsetManagement();
        io.teknek.feed.Feed feed31 = feedPartitionAdapter29.getFeed();
        java.lang.Object[] objArray32 = new java.lang.Object[] { obj13, "teknek.graphite.cluster", "teknek.graphite.cluster", feed31 };
        java.util.Map map33 = io.teknek.util.MapBuilder.makeMap(objArray32);
        io.teknek.zookeeper.ZookeeperOffsetStorage zookeeperOffsetStorage34 = new io.teknek.zookeeper.ZookeeperOffsetStorage((io.teknek.feed.FeedPartition) feedPartitionAdapter2, plan9, (java.util.Map<java.lang.String, java.lang.String>) map33);
        io.teknek.offsetstorage.Offset offset35 = null;
        // The following exception was thrown during execution in test generation
        try {
            zookeeperOffsetStorage34.persistOffset(offset35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(metricRegistry8);
        org.junit.Assert.assertNull(operatorDesc10);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(feed31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc1 = plan0.getRootOperator();
        io.teknek.plan.Plan plan3 = plan0.withName("");
        plan0.setDisabled(false);
        io.teknek.plan.Plan plan7 = plan0.withTupleRetry((int) (short) 0);
        plan7.setOffsetCommitInterval((int) '4');
        org.junit.Assert.assertNull(operatorDesc1);
        org.junit.Assert.assertNotNull(plan3);
        org.junit.Assert.assertNotNull(plan7);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        io.teknek.model.Operator operator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.plan.OperatorDesc operatorDesc1 = new io.teknek.plan.OperatorDesc(operator0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        java.lang.String str3 = workerDao2.SAVED_ZK;
        java.lang.String str4 = workerDao2.LOCKS_ZK;
        java.lang.String str5 = workerDao2.LOCKS_ZK;
        org.apache.zookeeper.ZooKeeper zooKeeper6 = null;
        io.teknek.plan.Plan plan7 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc8 = plan7.getRootOperator();
        io.teknek.plan.Plan plan10 = plan7.withName("");
        plan7.setDisabled(false);
        io.teknek.plan.Plan plan14 = plan7.withTupleRetry((int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc17 = new io.teknek.plan.OffsetStorageDesc("", strMap16);
        offsetStorageDesc17.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
        offsetStorageDesc17.setParameters(strMap20);
        groovy.lang.Closure closure22 = null;
        io.teknek.model.GroovyOperator groovyOperator23 = new io.teknek.model.GroovyOperator(closure22);
        java.lang.String str24 = groovyOperator23.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = groovyOperator23.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc26 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator23);
        groovy.lang.Closure closure27 = null;
        io.teknek.model.GroovyOperator groovyOperator28 = new io.teknek.model.GroovyOperator(closure27);
        java.lang.String str29 = groovyOperator28.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = groovyOperator28.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc31 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator28);
        io.teknek.plan.OperatorDesc operatorDesc32 = operatorDesc26.withNextOperator(operatorDesc31);
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = operatorDesc31.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc34 = offsetStorageDesc17.withParameters(strMap33);
        plan14.setOffsetStorageDesc(offsetStorageDesc17);
        io.teknek.daemon.WorkerStatus workerStatus39 = new io.teknek.daemon.WorkerStatus("teknek.graphite.cluster/workers", "teknek.graphite.cluster/saved", "teknek.graphite.port");
        // The following exception was thrown during execution in test generation
        try {
            workerDao2.registerWorkerStatus(zooKeeper6, plan14, workerStatus39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "teknek.graphite.cluster/saved" + "'", str3, "teknek.graphite.cluster/saved");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "teknek.graphite.cluster/locks" + "'", str4, "teknek.graphite.cluster/locks");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "teknek.graphite.cluster/locks" + "'", str5, "teknek.graphite.cluster/locks");
        org.junit.Assert.assertNull(operatorDesc8);
        org.junit.Assert.assertNotNull(plan10);
        org.junit.Assert.assertNotNull(plan14);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(strMap25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNotNull(operatorDesc32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(offsetStorageDesc34);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = groovyOperator1.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc4 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator1);
        groovyOperator1.setPath("simple.pipe.operator.input.field");
        io.teknek.plan.OperatorDesc operatorDesc7 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator1);
        java.util.List<io.teknek.plan.OperatorDesc> operatorDescList8 = operatorDesc7.getChildren();
        io.teknek.plan.FeedDesc feedDesc9 = new io.teknek.plan.FeedDesc();
        java.lang.String str10 = feedDesc9.getSpec();
        java.lang.String str11 = feedDesc9.getName();
        io.teknek.plan.FeedDesc feedDesc13 = feedDesc9.withName("io.teknek.datalayer.WorkerDaoException: zk.base.dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc17 = new io.teknek.plan.OffsetStorageDesc("", strMap16);
        offsetStorageDesc17.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
        offsetStorageDesc17.setParameters(strMap20);
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc24 = new io.teknek.plan.OffsetStorageDesc("", strMap23);
        offsetStorageDesc24.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = null;
        offsetStorageDesc24.setParameters(strMap27);
        groovy.lang.Closure closure29 = null;
        io.teknek.model.GroovyOperator groovyOperator30 = new io.teknek.model.GroovyOperator(closure29);
        java.lang.String str31 = groovyOperator30.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = groovyOperator30.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc33 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator30);
        groovy.lang.Closure closure34 = null;
        io.teknek.model.GroovyOperator groovyOperator35 = new io.teknek.model.GroovyOperator(closure34);
        java.lang.String str36 = groovyOperator35.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap37 = groovyOperator35.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc38 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator35);
        io.teknek.plan.OperatorDesc operatorDesc39 = operatorDesc33.withNextOperator(operatorDesc38);
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = operatorDesc38.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc41 = offsetStorageDesc24.withParameters(strMap40);
        offsetStorageDesc17.setParameters(strMap40);
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc43 = new io.teknek.plan.OffsetStorageDesc("teknek.graphite.cluster/locks", strMap40);
        io.teknek.plan.FeedDesc feedDesc44 = feedDesc9.withProperties((java.util.Map) strMap40);
        operatorDesc7.setParameters(strMap40);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(operatorDescList8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(feedDesc13);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(strMap32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(strMap37);
        org.junit.Assert.assertNotNull(operatorDesc39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(offsetStorageDesc41);
        org.junit.Assert.assertNotNull(feedDesc44);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        boolean boolean3 = feedPartitionAdapter2.supportsOffsetManagement();
        boolean boolean4 = feedPartitionAdapter2.supportsOffsetManagement();
        feedPartitionAdapter2.setOffset("teknek.graphite.cluster");
        boolean boolean7 = feedPartitionAdapter2.supportsOffsetManagement();
        java.lang.String str8 = feedPartitionAdapter2.getPartitionId();
        feedPartitionAdapter2.setOffset("teknek.zk.servers");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/teknek" + "'", str8, "/teknek");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        boolean boolean3 = feedPartitionAdapter2.supportsOffsetManagement();
        boolean boolean4 = feedPartitionAdapter2.supportsOffsetManagement();
        feedPartitionAdapter2.setOffset("teknek.graphite.cluster");
        boolean boolean7 = feedPartitionAdapter2.supportsOffsetManagement();
        java.lang.String str8 = feedPartitionAdapter2.getPartitionId();
        io.teknek.plan.Plan plan9 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc10 = plan9.getRootOperator();
        io.teknek.plan.Plan plan12 = plan9.withName("");
        plan9.setDisabled(false);
        io.teknek.plan.Plan plan16 = plan9.withMaxWorkers(0);
        io.teknek.plan.Plan plan18 = plan16.withOffsetCommitInterval((int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc21 = new io.teknek.plan.OffsetStorageDesc("", strMap20);
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.offsetstorage.OffsetStorage offsetStorage22 = io.teknek.driver.DriverFactory.buildOffsetStorage((io.teknek.feed.FeedPartition) feedPartitionAdapter2, plan16, offsetStorageDesc21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/teknek" + "'", str8, "/teknek");
        org.junit.Assert.assertNull(operatorDesc10);
        org.junit.Assert.assertNotNull(plan12);
        org.junit.Assert.assertNotNull(plan16);
        org.junit.Assert.assertNotNull(plan18);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Throwable throwable4 = null;
        io.teknek.datalayer.WorkerDaoException workerDaoException5 = new io.teknek.datalayer.WorkerDaoException("", throwable4);
        io.teknek.datalayer.WorkerDaoException workerDaoException8 = new io.teknek.datalayer.WorkerDaoException("hi!", throwable4, false, true);
        io.teknek.daemon.WorkerStartException workerStartException9 = new io.teknek.daemon.WorkerStartException("teknek.graphite.cluster", (java.lang.Throwable) workerDaoException8);
        io.teknek.daemon.WorkerStatus workerStatus13 = new io.teknek.daemon.WorkerStatus("", "teknek.graphite.cluster", "teknek.graphite.cluster");
        io.teknek.feed.Feed feed14 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter16 = new io.teknek.feed.FeedPartitionAdapter(feed14, "/teknek");
        boolean boolean17 = feedPartitionAdapter16.supportsOffsetManagement();
        io.teknek.feed.Feed feed18 = feedPartitionAdapter16.getFeed();
        java.lang.Object[] objArray19 = new java.lang.Object[] { obj0, "teknek.graphite.cluster", "teknek.graphite.cluster", feed18 };
        java.util.Map map20 = io.teknek.util.MapBuilder.makeMap(objArray19);
        java.lang.Class<?> wildcardClass21 = map20.getClass();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(feed18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        groovyOperator1.setPath("teknek.graphite.cluster");
        groovyOperator1.setPath("zk.base.dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = groovyOperator1.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc7 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator1);
        java.lang.String str8 = operatorDesc7.getName();
        groovy.lang.Closure closure9 = null;
        io.teknek.model.GroovyOperator groovyOperator10 = new io.teknek.model.GroovyOperator(closure9);
        groovyOperator10.setPath("teknek.graphite.cluster");
        groovyOperator10.setPath("zk.base.dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = groovyOperator10.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc16 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator10);
        java.lang.String str17 = operatorDesc16.getName();
        java.util.List<io.teknek.plan.OperatorDesc> operatorDescList18 = operatorDesc16.getChildren();
        io.teknek.plan.OperatorDesc operatorDesc19 = operatorDesc7.withNextOperator(operatorDesc16);
        io.teknek.plan.OperatorDesc operatorDesc21 = operatorDesc16.withOperatorClass("teknek.graphite.cluster");
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(operatorDescList18);
        org.junit.Assert.assertNotNull(operatorDesc19);
        org.junit.Assert.assertNotNull(operatorDesc21);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        boolean boolean3 = feedPartitionAdapter2.supportsOffsetManagement();
        boolean boolean4 = feedPartitionAdapter2.supportsOffsetManagement();
        feedPartitionAdapter2.setOffset("teknek.graphite.cluster");
        boolean boolean7 = feedPartitionAdapter2.supportsOffsetManagement();
        com.codahale.metrics.MetricRegistry metricRegistry8 = feedPartitionAdapter2.getMetricRegistry();
        io.teknek.model.Tuple tuple9 = new io.teknek.model.Tuple();
        boolean boolean10 = feedPartitionAdapter2.next((io.teknek.model.ITuple) tuple9);
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc12 = new io.teknek.plan.OffsetStorageDesc();
        io.teknek.plan.FeedDesc feedDesc13 = new io.teknek.plan.FeedDesc();
        java.lang.String str14 = feedDesc13.getSpec();
        groovy.lang.Closure closure15 = null;
        io.teknek.model.GroovyOperator groovyOperator16 = new io.teknek.model.GroovyOperator(closure15);
        java.lang.String str17 = groovyOperator16.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = groovyOperator16.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc19 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator16);
        groovy.lang.Closure closure20 = null;
        io.teknek.model.GroovyOperator groovyOperator21 = new io.teknek.model.GroovyOperator(closure20);
        java.lang.String str22 = groovyOperator21.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = groovyOperator21.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc24 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator21);
        io.teknek.plan.OperatorDesc operatorDesc25 = operatorDesc19.withNextOperator(operatorDesc24);
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = operatorDesc24.getParameters();
        io.teknek.plan.FeedDesc feedDesc27 = feedDesc13.withProperties((java.util.Map) strMap26);
        offsetStorageDesc12.setParameters(strMap26);
        tuple9.setField("teknek.graphite.cluster", (java.lang.Object) offsetStorageDesc12);
        boolean boolean31 = tuple9.hasField("pipe.operator.command.and.arguments");
        boolean boolean33 = tuple9.equals((java.lang.Object) "teknek.zk.servers");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(metricRegistry8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(strMap23);
        org.junit.Assert.assertNotNull(operatorDesc25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(feedDesc27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("hi!", restablishingKeeper1);
        io.teknek.plan.Plan plan3 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc4 = plan3.getRootOperator();
        io.teknek.plan.Plan plan6 = plan3.withName("");
        plan3.setDisabled(false);
        plan3.setTupleRetry((int) (byte) 100);
        io.teknek.plan.Plan plan12 = plan3.withName("pipe.operator.command.and.arguments");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList13 = workerDao2.findWorkersWorkingOnPlan(plan12);
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(operatorDesc4);
        org.junit.Assert.assertNotNull(plan6);
        org.junit.Assert.assertNotNull(plan12);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper0 = null;
        io.teknek.datalayer.WorkerDao workerDao1 = new io.teknek.datalayer.WorkerDao(restablishingKeeper0);
        org.apache.zookeeper.ZooKeeper zooKeeper2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.plan.OperatorDesc operatorDesc5 = workerDao1.loadSavedOperatorDesc(zooKeeper2, "", "Plan [name=]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        java.lang.String[] strArray8 = new java.lang.String[] { "teknek.graphite.host", "simple.pipe.operator.input.field", "teknek.graphite.cluster/plans", "hi!", "/teknek", "teknek.max.workers", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        io.teknek.daemon.TeknekDaemon teknekDaemon11 = null;
        io.teknek.daemon.Worker worker12 = new io.teknek.daemon.Worker(plan0, (java.util.List<java.lang.String>) strList9, teknekDaemon11);
        plan0.setTupleRetry((int) ' ');
        plan0.setOffsetCommitInterval((int) (byte) 1);
        int int17 = plan0.getMaxWorkers();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        java.lang.String str3 = workerDao2.SAVED_ZK;
        java.lang.String str4 = workerDao2.PLANS_ZK;
        java.lang.String str5 = workerDao2.WORKERS_ZK;
        java.lang.String str6 = workerDao2.BASE_ZK;
        java.lang.String str7 = workerDao2.SAVED_ZK;
        java.lang.String str8 = workerDao2.WORKERS_ZK;
        io.teknek.daemon.TeknekDaemon teknekDaemon9 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerDao2.createEphemeralNodeForDaemon(teknekDaemon9);
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "teknek.graphite.cluster/saved" + "'", str3, "teknek.graphite.cluster/saved");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "teknek.graphite.cluster/plans" + "'", str4, "teknek.graphite.cluster/plans");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "teknek.graphite.cluster/workers" + "'", str5, "teknek.graphite.cluster/workers");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "teknek.graphite.cluster" + "'", str6, "teknek.graphite.cluster");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "teknek.graphite.cluster/saved" + "'", str7, "teknek.graphite.cluster/saved");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "teknek.graphite.cluster/workers" + "'", str8, "teknek.graphite.cluster/workers");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        java.lang.String str3 = feedPartitionAdapter2.getOffset();
        java.lang.String str4 = feedPartitionAdapter2.getOffset();
        java.lang.String str5 = feedPartitionAdapter2.getPartitionId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/teknek" + "'", str5, "/teknek");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        io.teknek.operator.SimplePipeOperator simplePipeOperator0 = new io.teknek.operator.SimplePipeOperator();
        com.codahale.metrics.MetricRegistry metricRegistry1 = null;
        simplePipeOperator0.setMetricRegistry(metricRegistry1);
        // The following exception was thrown during execution in test generation
        try {
            simplePipeOperator0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Instance is not started. Can not shutdown.");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = groovyOperator1.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc4 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator1);
        groovyOperator1.setPath("simple.pipe.operator.input.field");
        io.teknek.plan.OperatorDesc operatorDesc7 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator1);
        java.util.List<io.teknek.plan.OperatorDesc> operatorDescList8 = operatorDesc7.getChildren();
        java.lang.String str9 = operatorDesc7.getName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(operatorDescList8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        java.lang.String str3 = workerDao2.SAVED_ZK;
        java.lang.String str4 = workerDao2.PLANS_ZK;
        java.lang.String str5 = workerDao2.BASE_ZK;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "teknek.graphite.cluster/saved" + "'", str3, "teknek.graphite.cluster/saved");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "teknek.graphite.cluster/plans" + "'", str4, "teknek.graphite.cluster/plans");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "teknek.graphite.cluster" + "'", str5, "teknek.graphite.cluster");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        java.lang.String[] strArray8 = new java.lang.String[] { "teknek.graphite.host", "simple.pipe.operator.input.field", "teknek.graphite.cluster/plans", "hi!", "/teknek", "teknek.max.workers", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        io.teknek.daemon.TeknekDaemon teknekDaemon11 = null;
        io.teknek.daemon.Worker worker12 = new io.teknek.daemon.Worker(plan0, (java.util.List<java.lang.String>) strList9, teknekDaemon11);
        plan0.setTupleRetry((int) ' ');
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc17 = new io.teknek.plan.OffsetStorageDesc("", strMap16);
        offsetStorageDesc17.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
        offsetStorageDesc17.setParameters(strMap20);
        groovy.lang.Closure closure22 = null;
        io.teknek.model.GroovyOperator groovyOperator23 = new io.teknek.model.GroovyOperator(closure22);
        java.lang.String str24 = groovyOperator23.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = groovyOperator23.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc26 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator23);
        groovy.lang.Closure closure27 = null;
        io.teknek.model.GroovyOperator groovyOperator28 = new io.teknek.model.GroovyOperator(closure27);
        java.lang.String str29 = groovyOperator28.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = groovyOperator28.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc31 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator28);
        io.teknek.plan.OperatorDesc operatorDesc32 = operatorDesc26.withNextOperator(operatorDesc31);
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = operatorDesc31.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc34 = offsetStorageDesc17.withParameters(strMap33);
        plan0.setOffsetStorageDesc(offsetStorageDesc34);
        int int36 = plan0.getOffsetCommitInterval();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(strMap25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNotNull(operatorDesc32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(offsetStorageDesc34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("hi!", restablishingKeeper1);
        io.teknek.plan.Plan plan3 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc4 = plan3.getRootOperator();
        io.teknek.plan.Plan plan6 = plan3.withName("");
        plan3.setDisabled(false);
        int int9 = plan3.getTupleRetry();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList10 = workerDao2.findWorkersWorkingOnPlan(plan3);
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(operatorDesc4);
        org.junit.Assert.assertNotNull(plan6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "simple.pipe.operator.input.field");
        java.lang.String str3 = feedPartitionAdapter2.getPath();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        boolean boolean3 = feedPartitionAdapter2.supportsOffsetManagement();
        boolean boolean4 = feedPartitionAdapter2.supportsOffsetManagement();
        feedPartitionAdapter2.setOffset("teknek.graphite.cluster");
        boolean boolean7 = feedPartitionAdapter2.supportsOffsetManagement();
        io.teknek.plan.Plan plan8 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        io.teknek.zookeeper.ZookeeperOffsetStorage zookeeperOffsetStorage10 = new io.teknek.zookeeper.ZookeeperOffsetStorage((io.teknek.feed.FeedPartition) feedPartitionAdapter2, plan8, strMap9);
        com.codahale.metrics.MetricRegistry metricRegistry11 = null;
        feedPartitionAdapter2.setMetricRegistry(metricRegistry11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        io.teknek.plan.Bundle bundle0 = new io.teknek.plan.Bundle();
        groovy.lang.Closure closure1 = null;
        io.teknek.model.GroovyOperator groovyOperator2 = new io.teknek.model.GroovyOperator(closure1);
        java.lang.String str3 = groovyOperator2.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = groovyOperator2.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc5 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator2);
        groovy.lang.Closure closure6 = null;
        io.teknek.model.GroovyOperator groovyOperator7 = new io.teknek.model.GroovyOperator(closure6);
        java.lang.String str8 = groovyOperator7.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = groovyOperator7.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc10 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator7);
        io.teknek.plan.OperatorDesc operatorDesc11 = operatorDesc5.withNextOperator(operatorDesc10);
        groovy.lang.Closure closure12 = null;
        io.teknek.model.GroovyOperator groovyOperator13 = new io.teknek.model.GroovyOperator(closure12);
        java.lang.String str14 = groovyOperator13.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = groovyOperator13.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc16 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator13);
        groovy.lang.Closure closure17 = null;
        io.teknek.model.GroovyOperator groovyOperator18 = new io.teknek.model.GroovyOperator(closure17);
        java.lang.String str19 = groovyOperator18.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = groovyOperator18.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc21 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator18);
        io.teknek.plan.OperatorDesc operatorDesc22 = operatorDesc16.withNextOperator(operatorDesc21);
        groovy.lang.Closure closure23 = null;
        io.teknek.model.GroovyOperator groovyOperator24 = new io.teknek.model.GroovyOperator(closure23);
        java.lang.String str25 = groovyOperator24.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = groovyOperator24.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc27 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator24);
        groovy.lang.Closure closure28 = null;
        io.teknek.model.GroovyOperator groovyOperator29 = new io.teknek.model.GroovyOperator(closure28);
        java.lang.String str30 = groovyOperator29.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = groovyOperator29.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc32 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator29);
        io.teknek.plan.OperatorDesc operatorDesc33 = operatorDesc27.withNextOperator(operatorDesc32);
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = operatorDesc32.getParameters();
        groovy.lang.Closure closure35 = null;
        io.teknek.model.GroovyOperator groovyOperator36 = new io.teknek.model.GroovyOperator(closure35);
        java.lang.String str37 = groovyOperator36.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = groovyOperator36.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc39 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator36);
        groovy.lang.Closure closure40 = null;
        io.teknek.model.GroovyOperator groovyOperator41 = new io.teknek.model.GroovyOperator(closure40);
        java.lang.String str42 = groovyOperator41.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = groovyOperator41.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc44 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator41);
        io.teknek.plan.OperatorDesc operatorDesc45 = operatorDesc39.withNextOperator(operatorDesc44);
        io.teknek.plan.OperatorDesc[] operatorDescArray46 = new io.teknek.plan.OperatorDesc[] { operatorDesc22, operatorDesc32, operatorDesc45 };
        java.util.ArrayList<io.teknek.plan.OperatorDesc> operatorDescList47 = new java.util.ArrayList<io.teknek.plan.OperatorDesc>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<io.teknek.plan.OperatorDesc>) operatorDescList47, operatorDescArray46);
        operatorDesc11.setChildren((java.util.List<io.teknek.plan.OperatorDesc>) operatorDescList47);
        bundle0.setOperatorList((java.util.List<io.teknek.plan.OperatorDesc>) operatorDescList47);
        java.util.List<io.teknek.plan.OperatorDesc> operatorDescList51 = bundle0.getOperatorList();
        bundle0.setBundleName("pipe.operator.command.and.arguments");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(operatorDesc11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertNotNull(operatorDesc22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(strMap26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(strMap31);
        org.junit.Assert.assertNotNull(operatorDesc33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(strMap38);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(strMap43);
        org.junit.Assert.assertNotNull(operatorDesc45);
        org.junit.Assert.assertNotNull(operatorDescArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(operatorDescList51);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        io.teknek.plan.FeedDesc feedDesc0 = new io.teknek.plan.FeedDesc();
        java.lang.String str1 = feedDesc0.getSpec();
        java.lang.String str2 = feedDesc0.getName();
        io.teknek.plan.FeedDesc feedDesc4 = feedDesc0.withName("io.teknek.datalayer.WorkerDaoException: zk.base.dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc8 = new io.teknek.plan.OffsetStorageDesc("", strMap7);
        offsetStorageDesc8.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        offsetStorageDesc8.setParameters(strMap11);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc15 = new io.teknek.plan.OffsetStorageDesc("", strMap14);
        offsetStorageDesc15.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        offsetStorageDesc15.setParameters(strMap18);
        groovy.lang.Closure closure20 = null;
        io.teknek.model.GroovyOperator groovyOperator21 = new io.teknek.model.GroovyOperator(closure20);
        java.lang.String str22 = groovyOperator21.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = groovyOperator21.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc24 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator21);
        groovy.lang.Closure closure25 = null;
        io.teknek.model.GroovyOperator groovyOperator26 = new io.teknek.model.GroovyOperator(closure25);
        java.lang.String str27 = groovyOperator26.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = groovyOperator26.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc29 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator26);
        io.teknek.plan.OperatorDesc operatorDesc30 = operatorDesc24.withNextOperator(operatorDesc29);
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = operatorDesc29.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc32 = offsetStorageDesc15.withParameters(strMap31);
        offsetStorageDesc8.setParameters(strMap31);
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc34 = new io.teknek.plan.OffsetStorageDesc("teknek.graphite.cluster/locks", strMap31);
        io.teknek.plan.FeedDesc feedDesc35 = feedDesc0.withProperties((java.util.Map) strMap31);
        io.teknek.plan.FeedDesc feedDesc37 = feedDesc35.withName("teknek.graphite.cluster/workers");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(feedDesc4);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(strMap23);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(strMap28);
        org.junit.Assert.assertNotNull(operatorDesc30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(offsetStorageDesc32);
        org.junit.Assert.assertNotNull(feedDesc35);
        org.junit.Assert.assertNotNull(feedDesc37);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        io.teknek.plan.FeedDesc feedDesc0 = new io.teknek.plan.FeedDesc();
        java.util.Map map1 = null;
        io.teknek.plan.FeedDesc feedDesc2 = feedDesc0.withProperties(map1);
        java.util.Map map3 = feedDesc2.getProperties();
        io.teknek.plan.FeedDesc feedDesc5 = feedDesc2.withFeedClass("pipe.operator.command.and.arguments");
        org.junit.Assert.assertNotNull(feedDesc2);
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNotNull(feedDesc5);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        io.teknek.datalayer.WorkerDaoException workerDaoException5 = new io.teknek.datalayer.WorkerDaoException("teknek.graphite.cluster");
        io.teknek.datalayer.WorkerDaoException workerDaoException6 = new io.teknek.datalayer.WorkerDaoException("zk.base.dir", (java.lang.Throwable) workerDaoException5);
        io.teknek.daemon.WorkerStartException workerStartException9 = new io.teknek.daemon.WorkerStartException("simple.pipe.operator.output.field", (java.lang.Throwable) workerDaoException6, false, false);
        io.teknek.datalayer.WorkerDaoException workerDaoException10 = new io.teknek.datalayer.WorkerDaoException("UTF-8", (java.lang.Throwable) workerStartException9);
        io.teknek.datalayer.WorkerDaoException workerDaoException11 = new io.teknek.datalayer.WorkerDaoException("teknek.graphite.cluster/workers", (java.lang.Throwable) workerDaoException10);
        java.lang.Throwable throwable13 = null;
        io.teknek.datalayer.WorkerDaoException workerDaoException14 = new io.teknek.datalayer.WorkerDaoException("", throwable13);
        workerDaoException11.addSuppressed((java.lang.Throwable) workerDaoException14);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = groovyOperator1.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc4 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator1);
        groovy.lang.Closure closure5 = null;
        io.teknek.model.GroovyOperator groovyOperator6 = new io.teknek.model.GroovyOperator(closure5);
        java.lang.String str7 = groovyOperator6.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = groovyOperator6.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc9 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator6);
        io.teknek.plan.OperatorDesc operatorDesc10 = operatorDesc4.withNextOperator(operatorDesc9);
        operatorDesc4.setName("pipe.operator.command.and.arguments");
        io.teknek.plan.OperatorDesc operatorDesc14 = operatorDesc4.withOperatorClass("io.teknek.model.GroovyOperator");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(operatorDesc10);
        org.junit.Assert.assertNotNull(operatorDesc14);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = groovyOperator1.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc4 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator1);
        groovyOperator1.setPath("simple.pipe.operator.input.field");
        io.teknek.plan.OperatorDesc operatorDesc7 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator1);
        java.util.List<io.teknek.plan.OperatorDesc> operatorDescList8 = operatorDesc7.getChildren();
        com.codahale.metrics.MetricRegistry metricRegistry9 = null;
        io.teknek.feed.Feed feed11 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter13 = new io.teknek.feed.FeedPartitionAdapter(feed11, "/teknek");
        io.teknek.model.ITuple iTuple14 = null;
        boolean boolean15 = feedPartitionAdapter13.next(iTuple14);
        io.teknek.feed.Feed feed16 = feedPartitionAdapter13.getFeed();
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.model.Operator operator17 = io.teknek.driver.DriverFactory.buildOperator(operatorDesc7, metricRegistry9, "teknek.graphite.cluster", (io.teknek.feed.FeedPartition) feedPartitionAdapter13);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: io.teknek.nit.NitException: java.lang.InstantiationException: io.teknek.model.GroovyOperator");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(operatorDescList8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(feed16);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        io.teknek.model.Tuple tuple0 = new io.teknek.model.Tuple();
        groovy.lang.Closure closure2 = null;
        io.teknek.model.GroovyOperator groovyOperator3 = new io.teknek.model.GroovyOperator(closure2);
        java.lang.String str4 = groovyOperator3.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = groovyOperator3.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc6 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator3);
        groovy.lang.Closure closure7 = null;
        io.teknek.model.GroovyOperator groovyOperator8 = new io.teknek.model.GroovyOperator(closure7);
        java.lang.String str9 = groovyOperator8.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = groovyOperator8.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc11 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator8);
        io.teknek.plan.OperatorDesc operatorDesc12 = operatorDesc6.withNextOperator(operatorDesc11);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc15 = new io.teknek.plan.OffsetStorageDesc("", strMap14);
        offsetStorageDesc15.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        offsetStorageDesc15.setParameters(strMap18);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc22 = new io.teknek.plan.OffsetStorageDesc("", strMap21);
        offsetStorageDesc22.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = null;
        offsetStorageDesc22.setParameters(strMap25);
        groovy.lang.Closure closure27 = null;
        io.teknek.model.GroovyOperator groovyOperator28 = new io.teknek.model.GroovyOperator(closure27);
        java.lang.String str29 = groovyOperator28.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = groovyOperator28.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc31 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator28);
        groovy.lang.Closure closure32 = null;
        io.teknek.model.GroovyOperator groovyOperator33 = new io.teknek.model.GroovyOperator(closure32);
        java.lang.String str34 = groovyOperator33.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = groovyOperator33.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc36 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator33);
        io.teknek.plan.OperatorDesc operatorDesc37 = operatorDesc31.withNextOperator(operatorDesc36);
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = operatorDesc36.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc39 = offsetStorageDesc22.withParameters(strMap38);
        offsetStorageDesc15.setParameters(strMap38);
        operatorDesc11.setParameters(strMap38);
        io.teknek.model.ITuple iTuple42 = tuple0.withField("", (java.lang.Object) operatorDesc11);
        java.lang.Object obj44 = tuple0.getField("/teknek");
        io.teknek.plan.FeedDesc feedDesc46 = new io.teknek.plan.FeedDesc();
        java.lang.String str47 = feedDesc46.getSpec();
        tuple0.setField("teknek.graphite.cluster", (java.lang.Object) str47);
        boolean boolean50 = tuple0.equals((java.lang.Object) 4000);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNotNull(operatorDesc12);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(strMap35);
        org.junit.Assert.assertNotNull(operatorDesc37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(offsetStorageDesc39);
        org.junit.Assert.assertNotNull(iTuple42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        io.teknek.model.Tuple tuple0 = new io.teknek.model.Tuple();
        groovy.lang.Closure closure2 = null;
        io.teknek.model.GroovyOperator groovyOperator3 = new io.teknek.model.GroovyOperator(closure2);
        java.lang.String str4 = groovyOperator3.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = groovyOperator3.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc6 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator3);
        groovy.lang.Closure closure7 = null;
        io.teknek.model.GroovyOperator groovyOperator8 = new io.teknek.model.GroovyOperator(closure7);
        java.lang.String str9 = groovyOperator8.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = groovyOperator8.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc11 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator8);
        io.teknek.plan.OperatorDesc operatorDesc12 = operatorDesc6.withNextOperator(operatorDesc11);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc15 = new io.teknek.plan.OffsetStorageDesc("", strMap14);
        offsetStorageDesc15.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        offsetStorageDesc15.setParameters(strMap18);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc22 = new io.teknek.plan.OffsetStorageDesc("", strMap21);
        offsetStorageDesc22.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = null;
        offsetStorageDesc22.setParameters(strMap25);
        groovy.lang.Closure closure27 = null;
        io.teknek.model.GroovyOperator groovyOperator28 = new io.teknek.model.GroovyOperator(closure27);
        java.lang.String str29 = groovyOperator28.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = groovyOperator28.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc31 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator28);
        groovy.lang.Closure closure32 = null;
        io.teknek.model.GroovyOperator groovyOperator33 = new io.teknek.model.GroovyOperator(closure32);
        java.lang.String str34 = groovyOperator33.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = groovyOperator33.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc36 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator33);
        io.teknek.plan.OperatorDesc operatorDesc37 = operatorDesc31.withNextOperator(operatorDesc36);
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = operatorDesc36.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc39 = offsetStorageDesc22.withParameters(strMap38);
        offsetStorageDesc15.setParameters(strMap38);
        operatorDesc11.setParameters(strMap38);
        io.teknek.model.ITuple iTuple42 = tuple0.withField("", (java.lang.Object) operatorDesc11);
        java.lang.Object obj44 = tuple0.getField("/teknek");
        java.util.Set<java.lang.String> strSet45 = tuple0.listFields();
        java.util.Set<java.lang.String> strSet46 = tuple0.listFields();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNotNull(operatorDesc12);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(strMap35);
        org.junit.Assert.assertNotNull(operatorDesc37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(offsetStorageDesc39);
        org.junit.Assert.assertNotNull(iTuple42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(strSet46);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster", restablishingKeeper1);
        java.lang.String str3 = workerDao2.SAVED_ZK;
        java.lang.String str4 = workerDao2.PLANS_ZK;
        java.lang.String str5 = workerDao2.WORKERS_ZK;
        java.lang.String str6 = workerDao2.BASE_ZK;
        java.lang.String str7 = workerDao2.SAVED_ZK;
        java.lang.String str8 = workerDao2.WORKERS_ZK;
        io.teknek.plan.Plan plan9 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc10 = plan9.getRootOperator();
        io.teknek.plan.Plan plan12 = plan9.withName("");
        plan9.setDisabled(false);
        io.teknek.plan.Plan plan16 = plan9.withMaxWorkers(100);
        io.teknek.plan.Plan plan18 = plan9.withMaxWorkersPerNode(4000);
        io.teknek.plan.Plan plan19 = new io.teknek.plan.Plan();
        java.lang.String[] strArray27 = new java.lang.String[] { "teknek.graphite.host", "simple.pipe.operator.input.field", "teknek.graphite.cluster/plans", "hi!", "/teknek", "teknek.max.workers", "" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        io.teknek.daemon.TeknekDaemon teknekDaemon30 = null;
        io.teknek.daemon.Worker worker31 = new io.teknek.daemon.Worker(plan19, (java.util.List<java.lang.String>) strList28, teknekDaemon30);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.teknek.daemon.WorkerStatus> workerStatusList32 = workerDao2.findAllWorkerStatusForPlan(plan9, (java.util.List<java.lang.String>) strList28);
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "teknek.graphite.cluster/saved" + "'", str3, "teknek.graphite.cluster/saved");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "teknek.graphite.cluster/plans" + "'", str4, "teknek.graphite.cluster/plans");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "teknek.graphite.cluster/workers" + "'", str5, "teknek.graphite.cluster/workers");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "teknek.graphite.cluster" + "'", str6, "teknek.graphite.cluster");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "teknek.graphite.cluster/saved" + "'", str7, "teknek.graphite.cluster/saved");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "teknek.graphite.cluster/workers" + "'", str8, "teknek.graphite.cluster/workers");
        org.junit.Assert.assertNull(operatorDesc10);
        org.junit.Assert.assertNotNull(plan12);
        org.junit.Assert.assertNotNull(plan16);
        org.junit.Assert.assertNotNull(plan18);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc1 = plan0.getRootOperator();
        io.teknek.plan.Plan plan3 = plan0.withName("");
        plan0.setDisabled(false);
        io.teknek.plan.Plan plan7 = plan0.withMaxWorkers(0);
        io.teknek.plan.Plan plan9 = plan7.withTupleRetry((int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc12 = new io.teknek.plan.OffsetStorageDesc("", strMap11);
        plan9.setOffsetStorageDesc(offsetStorageDesc12);
        java.lang.String str14 = plan9.toString();
        boolean boolean16 = plan9.equals((java.lang.Object) true);
        org.junit.Assert.assertNull(operatorDesc1);
        org.junit.Assert.assertNotNull(plan3);
        org.junit.Assert.assertNotNull(plan7);
        org.junit.Assert.assertNotNull(plan9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Plan [name=]" + "'", str14, "Plan [name=]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.lang.String str3 = groovyOperator1.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = groovyOperator1.getProperties();
        io.teknek.model.ICollector iCollector5 = groovyOperator1.getCollector();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc8 = new io.teknek.plan.OffsetStorageDesc();
        io.teknek.plan.FeedDesc feedDesc9 = new io.teknek.plan.FeedDesc();
        java.lang.String str10 = feedDesc9.getSpec();
        groovy.lang.Closure closure11 = null;
        io.teknek.model.GroovyOperator groovyOperator12 = new io.teknek.model.GroovyOperator(closure11);
        java.lang.String str13 = groovyOperator12.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = groovyOperator12.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc15 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator12);
        groovy.lang.Closure closure16 = null;
        io.teknek.model.GroovyOperator groovyOperator17 = new io.teknek.model.GroovyOperator(closure16);
        java.lang.String str18 = groovyOperator17.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = groovyOperator17.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc20 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator17);
        io.teknek.plan.OperatorDesc operatorDesc21 = operatorDesc15.withNextOperator(operatorDesc20);
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = operatorDesc20.getParameters();
        io.teknek.plan.FeedDesc feedDesc23 = feedDesc9.withProperties((java.util.Map) strMap22);
        offsetStorageDesc8.setParameters(strMap22);
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc25 = new io.teknek.plan.OffsetStorageDesc("teknek.zk.servers", strMap22);
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc26 = new io.teknek.plan.OffsetStorageDesc("", strMap22);
        groovyOperator1.setProperties(strMap22);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(iCollector5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNotNull(operatorDesc21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(feedDesc23);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        groovyOperator1.setPath("teknek.graphite.cluster");
        groovyOperator1.setPath("zk.base.dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = groovyOperator1.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc7 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator1);
        io.teknek.model.ICollector iCollector8 = groovyOperator1.getCollector();
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(iCollector8);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc1 = plan0.getRootOperator();
        groovy.lang.Closure closure2 = null;
        io.teknek.model.GroovyOperator groovyOperator3 = new io.teknek.model.GroovyOperator(closure2);
        java.lang.String str4 = groovyOperator3.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = groovyOperator3.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc6 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator3);
        plan0.setRootOperator(operatorDesc6);
        com.codahale.metrics.MetricRegistry metricRegistry8 = null;
        io.teknek.feed.Feed feed10 = null;
        io.teknek.feed.PipedFeed pipedFeed12 = new io.teknek.feed.PipedFeed(feed10, "simple.pipe.operator.output.field");
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.model.Operator operator13 = io.teknek.driver.DriverFactory.buildOperator(operatorDesc6, metricRegistry8, "/teknek/offset", (io.teknek.feed.FeedPartition) pipedFeed12);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: io.teknek.nit.NitException: java.lang.InstantiationException: io.teknek.model.GroovyOperator");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(operatorDesc1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        groovyOperator1.setPath("teknek.graphite.cluster");
        groovyOperator1.setPath("zk.base.dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = groovyOperator1.getProperties();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = groovyOperator1.getProperties();
        io.teknek.feed.Feed feed8 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter10 = new io.teknek.feed.FeedPartitionAdapter(feed8, "/teknek");
        io.teknek.model.ITuple iTuple11 = null;
        boolean boolean12 = feedPartitionAdapter10.next(iTuple11);
        io.teknek.model.ITuple iTuple13 = null;
        boolean boolean14 = feedPartitionAdapter10.next(iTuple13);
        io.teknek.model.Tuple tuple15 = new io.teknek.model.Tuple();
        groovy.lang.Closure closure17 = null;
        io.teknek.model.GroovyOperator groovyOperator18 = new io.teknek.model.GroovyOperator(closure17);
        java.lang.String str19 = groovyOperator18.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = groovyOperator18.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc21 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator18);
        groovy.lang.Closure closure22 = null;
        io.teknek.model.GroovyOperator groovyOperator23 = new io.teknek.model.GroovyOperator(closure22);
        java.lang.String str24 = groovyOperator23.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = groovyOperator23.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc26 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator23);
        io.teknek.plan.OperatorDesc operatorDesc27 = operatorDesc21.withNextOperator(operatorDesc26);
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc30 = new io.teknek.plan.OffsetStorageDesc("", strMap29);
        offsetStorageDesc30.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = null;
        offsetStorageDesc30.setParameters(strMap33);
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc37 = new io.teknek.plan.OffsetStorageDesc("", strMap36);
        offsetStorageDesc37.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = null;
        offsetStorageDesc37.setParameters(strMap40);
        groovy.lang.Closure closure42 = null;
        io.teknek.model.GroovyOperator groovyOperator43 = new io.teknek.model.GroovyOperator(closure42);
        java.lang.String str44 = groovyOperator43.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = groovyOperator43.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc46 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator43);
        groovy.lang.Closure closure47 = null;
        io.teknek.model.GroovyOperator groovyOperator48 = new io.teknek.model.GroovyOperator(closure47);
        java.lang.String str49 = groovyOperator48.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap50 = groovyOperator48.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc51 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator48);
        io.teknek.plan.OperatorDesc operatorDesc52 = operatorDesc46.withNextOperator(operatorDesc51);
        java.util.Map<java.lang.String, java.lang.Object> strMap53 = operatorDesc51.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc54 = offsetStorageDesc37.withParameters(strMap53);
        offsetStorageDesc30.setParameters(strMap53);
        operatorDesc26.setParameters(strMap53);
        io.teknek.model.ITuple iTuple57 = tuple15.withField("", (java.lang.Object) operatorDesc26);
        java.lang.Object obj59 = tuple15.getField("/teknek");
        java.util.Set<java.lang.String> strSet60 = tuple15.listFields();
        boolean boolean61 = feedPartitionAdapter10.next((io.teknek.model.ITuple) tuple15);
        boolean boolean63 = tuple15.hasField("");
        // The following exception was thrown during execution in test generation
        try {
            groovyOperator1.handleTuple((io.teknek.model.ITuple) tuple15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(strMap25);
        org.junit.Assert.assertNotNull(operatorDesc27);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(strMap45);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(strMap50);
        org.junit.Assert.assertNotNull(operatorDesc52);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNotNull(offsetStorageDesc54);
        org.junit.Assert.assertNotNull(iTuple57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        io.teknek.datalayer.WorkerDaoException workerDaoException1 = new io.teknek.datalayer.WorkerDaoException("teknek.graphite.cluster/locks");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        boolean boolean3 = feedPartitionAdapter2.supportsOffsetManagement();
        boolean boolean4 = feedPartitionAdapter2.supportsOffsetManagement();
        feedPartitionAdapter2.setOffset("teknek.graphite.cluster");
        boolean boolean7 = feedPartitionAdapter2.supportsOffsetManagement();
        io.teknek.plan.Plan plan8 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        io.teknek.zookeeper.ZookeeperOffsetStorage zookeeperOffsetStorage10 = new io.teknek.zookeeper.ZookeeperOffsetStorage((io.teknek.feed.FeedPartition) feedPartitionAdapter2, plan8, strMap9);
        // The following exception was thrown during execution in test generation
        try {
            io.teknek.offsetstorage.Offset offset11 = zookeeperOffsetStorage10.getCurrentOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        plan0.setMaxWorkersPerNode((int) (short) -1);
        groovy.lang.Closure closure3 = null;
        io.teknek.model.GroovyOperator groovyOperator4 = new io.teknek.model.GroovyOperator(closure3);
        groovyOperator4.setPath("teknek.graphite.cluster");
        groovyOperator4.setPath("zk.base.dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = groovyOperator4.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc10 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator4);
        java.lang.String str11 = operatorDesc10.getName();
        groovy.lang.Closure closure12 = null;
        io.teknek.model.GroovyOperator groovyOperator13 = new io.teknek.model.GroovyOperator(closure12);
        groovyOperator13.setPath("teknek.graphite.cluster");
        groovyOperator13.setPath("zk.base.dir");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = groovyOperator13.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc19 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator13);
        java.lang.String str20 = operatorDesc19.getName();
        java.util.List<io.teknek.plan.OperatorDesc> operatorDescList21 = operatorDesc19.getChildren();
        io.teknek.plan.OperatorDesc operatorDesc22 = operatorDesc10.withNextOperator(operatorDesc19);
        operatorDesc10.setName("");
        plan0.setRootOperator(operatorDesc10);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(operatorDescList21);
        org.junit.Assert.assertNotNull(operatorDesc22);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        io.teknek.operator.SimplePipeOperator simplePipeOperator0 = new io.teknek.operator.SimplePipeOperator();
        io.teknek.model.Tuple tuple1 = new io.teknek.model.Tuple();
        groovy.lang.Closure closure3 = null;
        io.teknek.model.GroovyOperator groovyOperator4 = new io.teknek.model.GroovyOperator(closure3);
        java.lang.String str5 = groovyOperator4.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = groovyOperator4.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc7 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator4);
        groovy.lang.Closure closure8 = null;
        io.teknek.model.GroovyOperator groovyOperator9 = new io.teknek.model.GroovyOperator(closure8);
        java.lang.String str10 = groovyOperator9.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = groovyOperator9.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc12 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator9);
        io.teknek.plan.OperatorDesc operatorDesc13 = operatorDesc7.withNextOperator(operatorDesc12);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc16 = new io.teknek.plan.OffsetStorageDesc("", strMap15);
        offsetStorageDesc16.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        offsetStorageDesc16.setParameters(strMap19);
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc23 = new io.teknek.plan.OffsetStorageDesc("", strMap22);
        offsetStorageDesc23.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = null;
        offsetStorageDesc23.setParameters(strMap26);
        groovy.lang.Closure closure28 = null;
        io.teknek.model.GroovyOperator groovyOperator29 = new io.teknek.model.GroovyOperator(closure28);
        java.lang.String str30 = groovyOperator29.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = groovyOperator29.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc32 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator29);
        groovy.lang.Closure closure33 = null;
        io.teknek.model.GroovyOperator groovyOperator34 = new io.teknek.model.GroovyOperator(closure33);
        java.lang.String str35 = groovyOperator34.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = groovyOperator34.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc37 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator34);
        io.teknek.plan.OperatorDesc operatorDesc38 = operatorDesc32.withNextOperator(operatorDesc37);
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = operatorDesc37.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc40 = offsetStorageDesc23.withParameters(strMap39);
        offsetStorageDesc16.setParameters(strMap39);
        operatorDesc12.setParameters(strMap39);
        io.teknek.model.ITuple iTuple43 = tuple1.withField("", (java.lang.Object) operatorDesc12);
        java.lang.Object obj45 = tuple1.getField("/teknek");
        // The following exception was thrown during execution in test generation
        try {
            simplePipeOperator0.handleTuple((io.teknek.model.ITuple) tuple1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNotNull(operatorDesc13);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(strMap31);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(strMap36);
        org.junit.Assert.assertNotNull(operatorDesc38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(offsetStorageDesc40);
        org.junit.Assert.assertNotNull(iTuple43);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        boolean boolean3 = feedPartitionAdapter2.supportsOffsetManagement();
        boolean boolean4 = feedPartitionAdapter2.supportsOffsetManagement();
        java.lang.String str5 = feedPartitionAdapter2.getOffset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        io.teknek.plan.Bundle bundle0 = new io.teknek.plan.Bundle();
        groovy.lang.Closure closure1 = null;
        io.teknek.model.GroovyOperator groovyOperator2 = new io.teknek.model.GroovyOperator(closure1);
        java.lang.String str3 = groovyOperator2.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = groovyOperator2.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc5 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator2);
        groovy.lang.Closure closure6 = null;
        io.teknek.model.GroovyOperator groovyOperator7 = new io.teknek.model.GroovyOperator(closure6);
        java.lang.String str8 = groovyOperator7.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = groovyOperator7.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc10 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator7);
        io.teknek.plan.OperatorDesc operatorDesc11 = operatorDesc5.withNextOperator(operatorDesc10);
        groovy.lang.Closure closure12 = null;
        io.teknek.model.GroovyOperator groovyOperator13 = new io.teknek.model.GroovyOperator(closure12);
        java.lang.String str14 = groovyOperator13.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = groovyOperator13.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc16 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator13);
        groovy.lang.Closure closure17 = null;
        io.teknek.model.GroovyOperator groovyOperator18 = new io.teknek.model.GroovyOperator(closure17);
        java.lang.String str19 = groovyOperator18.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = groovyOperator18.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc21 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator18);
        io.teknek.plan.OperatorDesc operatorDesc22 = operatorDesc16.withNextOperator(operatorDesc21);
        groovy.lang.Closure closure23 = null;
        io.teknek.model.GroovyOperator groovyOperator24 = new io.teknek.model.GroovyOperator(closure23);
        java.lang.String str25 = groovyOperator24.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = groovyOperator24.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc27 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator24);
        groovy.lang.Closure closure28 = null;
        io.teknek.model.GroovyOperator groovyOperator29 = new io.teknek.model.GroovyOperator(closure28);
        java.lang.String str30 = groovyOperator29.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = groovyOperator29.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc32 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator29);
        io.teknek.plan.OperatorDesc operatorDesc33 = operatorDesc27.withNextOperator(operatorDesc32);
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = operatorDesc32.getParameters();
        groovy.lang.Closure closure35 = null;
        io.teknek.model.GroovyOperator groovyOperator36 = new io.teknek.model.GroovyOperator(closure35);
        java.lang.String str37 = groovyOperator36.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = groovyOperator36.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc39 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator36);
        groovy.lang.Closure closure40 = null;
        io.teknek.model.GroovyOperator groovyOperator41 = new io.teknek.model.GroovyOperator(closure40);
        java.lang.String str42 = groovyOperator41.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = groovyOperator41.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc44 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator41);
        io.teknek.plan.OperatorDesc operatorDesc45 = operatorDesc39.withNextOperator(operatorDesc44);
        io.teknek.plan.OperatorDesc[] operatorDescArray46 = new io.teknek.plan.OperatorDesc[] { operatorDesc22, operatorDesc32, operatorDesc45 };
        java.util.ArrayList<io.teknek.plan.OperatorDesc> operatorDescList47 = new java.util.ArrayList<io.teknek.plan.OperatorDesc>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<io.teknek.plan.OperatorDesc>) operatorDescList47, operatorDescArray46);
        operatorDesc11.setChildren((java.util.List<io.teknek.plan.OperatorDesc>) operatorDescList47);
        bundle0.setOperatorList((java.util.List<io.teknek.plan.OperatorDesc>) operatorDescList47);
        java.lang.String str51 = bundle0.getPackageName();
        java.util.List<io.teknek.plan.FeedDesc> feedDescList52 = bundle0.getFeedDescList();
        java.util.List<io.teknek.plan.FeedDesc> feedDescList53 = bundle0.getFeedDescList();
        java.lang.String str54 = bundle0.getBundleName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(operatorDesc11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertNotNull(operatorDesc22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(strMap26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(strMap31);
        org.junit.Assert.assertNotNull(operatorDesc33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(strMap38);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(strMap43);
        org.junit.Assert.assertNotNull(operatorDesc45);
        org.junit.Assert.assertNotNull(operatorDescArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(feedDescList52);
        org.junit.Assert.assertNotNull(feedDescList53);
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        io.teknek.plan.OperatorDesc operatorDesc0 = null;
        byte[] byteArray1 = io.teknek.datalayer.WorkerDao.serializeOperatorDesc(operatorDesc0);
        io.teknek.plan.OperatorDesc operatorDesc2 = io.teknek.datalayer.WorkerDao.deserializeOperatorDesc(byteArray1);
        io.teknek.plan.Plan plan3 = io.teknek.datalayer.WorkerDao.deserializePlan(byteArray1);
        io.teknek.plan.OperatorDesc operatorDesc4 = io.teknek.datalayer.WorkerDao.deserializeOperatorDesc(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[110, 117, 108, 108]");
        org.junit.Assert.assertNull(operatorDesc2);
        org.junit.Assert.assertNull(plan3);
        org.junit.Assert.assertNull(operatorDesc4);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        io.teknek.datalayer.WorkerDaoException workerDaoException2 = new io.teknek.datalayer.WorkerDaoException("simple.pipe.operator.input.field");
        io.teknek.datalayer.WorkerDaoException workerDaoException3 = new io.teknek.datalayer.WorkerDaoException("teknek.graphite.cluster/plans", (java.lang.Throwable) workerDaoException2);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        java.lang.String str2 = groovyOperator1.getPath();
        java.lang.String str3 = groovyOperator1.getPath();
        java.lang.String str4 = groovyOperator1.getPartitionId();
        io.teknek.model.ICollector iCollector5 = groovyOperator1.getCollector();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc7 = new io.teknek.plan.OffsetStorageDesc();
        io.teknek.plan.FeedDesc feedDesc8 = new io.teknek.plan.FeedDesc();
        java.lang.String str9 = feedDesc8.getSpec();
        groovy.lang.Closure closure10 = null;
        io.teknek.model.GroovyOperator groovyOperator11 = new io.teknek.model.GroovyOperator(closure10);
        java.lang.String str12 = groovyOperator11.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = groovyOperator11.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc14 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator11);
        groovy.lang.Closure closure15 = null;
        io.teknek.model.GroovyOperator groovyOperator16 = new io.teknek.model.GroovyOperator(closure15);
        java.lang.String str17 = groovyOperator16.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = groovyOperator16.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc19 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator16);
        io.teknek.plan.OperatorDesc operatorDesc20 = operatorDesc14.withNextOperator(operatorDesc19);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = operatorDesc19.getParameters();
        io.teknek.plan.FeedDesc feedDesc22 = feedDesc8.withProperties((java.util.Map) strMap21);
        offsetStorageDesc7.setParameters(strMap21);
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc24 = new io.teknek.plan.OffsetStorageDesc("teknek.zk.servers", strMap21);
        groovyOperator1.setProperties(strMap21);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(iCollector5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNotNull(operatorDesc20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(feedDesc22);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.graphite.cluster/locks", restablishingKeeper1);
        io.teknek.daemon.TeknekDaemon teknekDaemon3 = null;
        // The following exception was thrown during execution in test generation
        try {
            workerDao2.createEphemeralNodeForDaemon(teknekDaemon3);
            org.junit.Assert.fail("Expected exception of type io.teknek.datalayer.WorkerDaoException; message: java.lang.NullPointerException");
        } catch (io.teknek.datalayer.WorkerDaoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        io.teknek.plan.Plan plan0 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc1 = plan0.getRootOperator();
        io.teknek.plan.Plan plan3 = plan0.withName("");
        plan0.setDisabled(false);
        io.teknek.plan.Plan plan7 = plan0.withMaxWorkers(0);
        io.teknek.plan.Plan plan9 = plan7.withTupleRetry((int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc12 = new io.teknek.plan.OffsetStorageDesc("", strMap11);
        plan9.setOffsetStorageDesc(offsetStorageDesc12);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = offsetStorageDesc12.getParameters();
        org.junit.Assert.assertNull(operatorDesc1);
        org.junit.Assert.assertNotNull(plan3);
        org.junit.Assert.assertNotNull(plan7);
        org.junit.Assert.assertNotNull(plan9);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        java.lang.Throwable throwable4 = null;
        io.teknek.datalayer.WorkerDaoException workerDaoException5 = new io.teknek.datalayer.WorkerDaoException("", throwable4);
        io.teknek.datalayer.WorkerDaoException workerDaoException8 = new io.teknek.datalayer.WorkerDaoException("hi!", throwable4, false, true);
        io.teknek.daemon.WorkerStartException workerStartException9 = new io.teknek.daemon.WorkerStartException("teknek.graphite.cluster", (java.lang.Throwable) workerDaoException8);
        io.teknek.datalayer.WorkerDaoException workerDaoException10 = new io.teknek.datalayer.WorkerDaoException((java.lang.Throwable) workerStartException9);
        io.teknek.daemon.WorkerStartException workerStartException13 = new io.teknek.daemon.WorkerStartException("teknek.graphite.cluster/plans", (java.lang.Throwable) workerDaoException10, true, true);
        io.teknek.datalayer.WorkerDaoException workerDaoException19 = new io.teknek.datalayer.WorkerDaoException("teknek.graphite.cluster");
        io.teknek.datalayer.WorkerDaoException workerDaoException20 = new io.teknek.datalayer.WorkerDaoException("zk.base.dir", (java.lang.Throwable) workerDaoException19);
        io.teknek.daemon.WorkerStartException workerStartException23 = new io.teknek.daemon.WorkerStartException("simple.pipe.operator.output.field", (java.lang.Throwable) workerDaoException20, false, false);
        io.teknek.datalayer.WorkerDaoException workerDaoException24 = new io.teknek.datalayer.WorkerDaoException("UTF-8", (java.lang.Throwable) workerStartException23);
        io.teknek.datalayer.WorkerDaoException workerDaoException25 = new io.teknek.datalayer.WorkerDaoException("teknek.graphite.cluster/workers", (java.lang.Throwable) workerDaoException24);
        workerDaoException10.addSuppressed((java.lang.Throwable) workerDaoException25);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        io.teknek.plan.FeedDesc feedDesc0 = new io.teknek.plan.FeedDesc();
        java.util.Map map1 = null;
        feedDesc0.setProperties(map1);
        java.util.Map map3 = null;
        feedDesc0.setProperties(map3);
        feedDesc0.setName("zk.base.dir");
        io.teknek.plan.FeedDesc feedDesc8 = feedDesc0.withName("simple.pipe.operator.output.field");
        feedDesc8.setName("teknek.graphite.cluster/plans");
        java.lang.String str11 = feedDesc8.getScript();
        groovy.lang.Closure closure13 = null;
        io.teknek.model.GroovyOperator groovyOperator14 = new io.teknek.model.GroovyOperator(closure13);
        java.lang.String str15 = groovyOperator14.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = groovyOperator14.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc17 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator14);
        groovy.lang.Closure closure18 = null;
        io.teknek.model.GroovyOperator groovyOperator19 = new io.teknek.model.GroovyOperator(closure18);
        java.lang.String str20 = groovyOperator19.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = groovyOperator19.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc22 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator19);
        io.teknek.plan.OperatorDesc operatorDesc23 = operatorDesc17.withNextOperator(operatorDesc22);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc26 = new io.teknek.plan.OffsetStorageDesc("", strMap25);
        offsetStorageDesc26.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = null;
        offsetStorageDesc26.setParameters(strMap29);
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc33 = new io.teknek.plan.OffsetStorageDesc("", strMap32);
        offsetStorageDesc33.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = null;
        offsetStorageDesc33.setParameters(strMap36);
        groovy.lang.Closure closure38 = null;
        io.teknek.model.GroovyOperator groovyOperator39 = new io.teknek.model.GroovyOperator(closure38);
        java.lang.String str40 = groovyOperator39.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap41 = groovyOperator39.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc42 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator39);
        groovy.lang.Closure closure43 = null;
        io.teknek.model.GroovyOperator groovyOperator44 = new io.teknek.model.GroovyOperator(closure43);
        java.lang.String str45 = groovyOperator44.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap46 = groovyOperator44.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc47 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator44);
        io.teknek.plan.OperatorDesc operatorDesc48 = operatorDesc42.withNextOperator(operatorDesc47);
        java.util.Map<java.lang.String, java.lang.Object> strMap49 = operatorDesc47.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc50 = offsetStorageDesc33.withParameters(strMap49);
        offsetStorageDesc26.setParameters(strMap49);
        operatorDesc22.setParameters(strMap49);
        io.teknek.plan.FeedDesc feedDesc53 = new io.teknek.plan.FeedDesc();
        java.util.Map map54 = null;
        io.teknek.plan.FeedDesc feedDesc55 = feedDesc53.withProperties(map54);
        java.util.Map<java.lang.String, java.lang.Object> strMap57 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc58 = new io.teknek.plan.OffsetStorageDesc("", strMap57);
        java.util.Map<java.lang.String, java.lang.Object> strMap60 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc61 = new io.teknek.plan.OffsetStorageDesc("", strMap60);
        offsetStorageDesc61.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap64 = null;
        offsetStorageDesc61.setParameters(strMap64);
        groovy.lang.Closure closure66 = null;
        io.teknek.model.GroovyOperator groovyOperator67 = new io.teknek.model.GroovyOperator(closure66);
        java.lang.String str68 = groovyOperator67.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap69 = groovyOperator67.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc70 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator67);
        groovy.lang.Closure closure71 = null;
        io.teknek.model.GroovyOperator groovyOperator72 = new io.teknek.model.GroovyOperator(closure71);
        java.lang.String str73 = groovyOperator72.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap74 = groovyOperator72.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc75 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator72);
        io.teknek.plan.OperatorDesc operatorDesc76 = operatorDesc70.withNextOperator(operatorDesc75);
        java.util.Map<java.lang.String, java.lang.Object> strMap77 = operatorDesc75.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc78 = offsetStorageDesc61.withParameters(strMap77);
        offsetStorageDesc58.setParameters(strMap77);
        io.teknek.plan.FeedDesc feedDesc80 = feedDesc53.withProperties((java.util.Map) strMap77);
        operatorDesc22.setParameters(strMap77);
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc82 = new io.teknek.plan.OffsetStorageDesc("hi!/saved", strMap77);
        io.teknek.plan.FeedDesc feedDesc83 = feedDesc8.withProperties((java.util.Map) strMap77);
        org.junit.Assert.assertNotNull(feedDesc8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNotNull(operatorDesc23);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(strMap41);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(strMap46);
        org.junit.Assert.assertNotNull(operatorDesc48);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertNotNull(offsetStorageDesc50);
        org.junit.Assert.assertNotNull(feedDesc55);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNull(strMap69);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNull(strMap74);
        org.junit.Assert.assertNotNull(operatorDesc76);
        org.junit.Assert.assertNotNull(strMap77);
        org.junit.Assert.assertNotNull(offsetStorageDesc78);
        org.junit.Assert.assertNotNull(feedDesc80);
        org.junit.Assert.assertNotNull(feedDesc83);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        groovy.lang.Closure closure0 = null;
        io.teknek.model.GroovyOperator groovyOperator1 = new io.teknek.model.GroovyOperator(closure0);
        groovyOperator1.setPath("teknek.graphite.cluster");
        com.codahale.metrics.MetricRegistry metricRegistry4 = null;
        groovyOperator1.setMetricRegistry(metricRegistry4);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        io.teknek.datalayer.WorkerDaoException workerDaoException0 = new io.teknek.datalayer.WorkerDaoException();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc3 = new io.teknek.plan.OffsetStorageDesc("", strMap2);
        offsetStorageDesc3.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        offsetStorageDesc3.setParameters(strMap6);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc10 = new io.teknek.plan.OffsetStorageDesc("", strMap9);
        offsetStorageDesc10.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        offsetStorageDesc10.setParameters(strMap13);
        groovy.lang.Closure closure15 = null;
        io.teknek.model.GroovyOperator groovyOperator16 = new io.teknek.model.GroovyOperator(closure15);
        java.lang.String str17 = groovyOperator16.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = groovyOperator16.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc19 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator16);
        groovy.lang.Closure closure20 = null;
        io.teknek.model.GroovyOperator groovyOperator21 = new io.teknek.model.GroovyOperator(closure20);
        java.lang.String str22 = groovyOperator21.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = groovyOperator21.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc24 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator21);
        io.teknek.plan.OperatorDesc operatorDesc25 = operatorDesc19.withNextOperator(operatorDesc24);
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = operatorDesc24.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc27 = offsetStorageDesc10.withParameters(strMap26);
        offsetStorageDesc3.setParameters(strMap26);
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc29 = new io.teknek.plan.OffsetStorageDesc("teknek.graphite.host", strMap26);
        offsetStorageDesc29.setOperatorClass("");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(strMap23);
        org.junit.Assert.assertNotNull(operatorDesc25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(offsetStorageDesc27);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        io.teknek.collector.CollectorProcessor collectorProcessor0 = new io.teknek.collector.CollectorProcessor();
        collectorProcessor0.setGoOn(true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        io.teknek.zookeeper.RestablishingKeeper restablishingKeeper1 = null;
        io.teknek.datalayer.WorkerDao workerDao2 = new io.teknek.datalayer.WorkerDao("teknek.daemon.id", restablishingKeeper1);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        io.teknek.model.ITuple iTuple3 = null;
        boolean boolean4 = feedPartitionAdapter2.next(iTuple3);
        io.teknek.model.ITuple iTuple5 = null;
        boolean boolean6 = feedPartitionAdapter2.next(iTuple5);
        io.teknek.model.Tuple tuple7 = new io.teknek.model.Tuple();
        groovy.lang.Closure closure9 = null;
        io.teknek.model.GroovyOperator groovyOperator10 = new io.teknek.model.GroovyOperator(closure9);
        java.lang.String str11 = groovyOperator10.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = groovyOperator10.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc13 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator10);
        groovy.lang.Closure closure14 = null;
        io.teknek.model.GroovyOperator groovyOperator15 = new io.teknek.model.GroovyOperator(closure14);
        java.lang.String str16 = groovyOperator15.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = groovyOperator15.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc18 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator15);
        io.teknek.plan.OperatorDesc operatorDesc19 = operatorDesc13.withNextOperator(operatorDesc18);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc22 = new io.teknek.plan.OffsetStorageDesc("", strMap21);
        offsetStorageDesc22.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = null;
        offsetStorageDesc22.setParameters(strMap25);
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = null;
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc29 = new io.teknek.plan.OffsetStorageDesc("", strMap28);
        offsetStorageDesc29.setOperatorClass("teknek.graphite.cluster/workers");
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = null;
        offsetStorageDesc29.setParameters(strMap32);
        groovy.lang.Closure closure34 = null;
        io.teknek.model.GroovyOperator groovyOperator35 = new io.teknek.model.GroovyOperator(closure34);
        java.lang.String str36 = groovyOperator35.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap37 = groovyOperator35.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc38 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator35);
        groovy.lang.Closure closure39 = null;
        io.teknek.model.GroovyOperator groovyOperator40 = new io.teknek.model.GroovyOperator(closure39);
        java.lang.String str41 = groovyOperator40.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = groovyOperator40.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc43 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator40);
        io.teknek.plan.OperatorDesc operatorDesc44 = operatorDesc38.withNextOperator(operatorDesc43);
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = operatorDesc43.getParameters();
        io.teknek.plan.OffsetStorageDesc offsetStorageDesc46 = offsetStorageDesc29.withParameters(strMap45);
        offsetStorageDesc22.setParameters(strMap45);
        operatorDesc18.setParameters(strMap45);
        io.teknek.model.ITuple iTuple49 = tuple7.withField("", (java.lang.Object) operatorDesc18);
        java.lang.Object obj51 = tuple7.getField("/teknek");
        java.util.Set<java.lang.String> strSet52 = tuple7.listFields();
        boolean boolean53 = feedPartitionAdapter2.next((io.teknek.model.ITuple) tuple7);
        io.teknek.plan.Plan plan55 = new io.teknek.plan.Plan();
        io.teknek.plan.OperatorDesc operatorDesc56 = plan55.getRootOperator();
        io.teknek.plan.Plan plan58 = plan55.withName("");
        plan55.setDisabled(false);
        io.teknek.plan.Plan plan62 = plan55.withMaxWorkers(0);
        plan62.setMaxWorkersPerNode((int) '4');
        io.teknek.plan.Plan plan66 = plan62.withTupleRetry(100);
        groovy.lang.Closure closure67 = null;
        io.teknek.model.GroovyOperator groovyOperator68 = new io.teknek.model.GroovyOperator(closure67);
        java.lang.String str69 = groovyOperator68.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap70 = groovyOperator68.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc71 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator68);
        groovy.lang.Closure closure72 = null;
        io.teknek.model.GroovyOperator groovyOperator73 = new io.teknek.model.GroovyOperator(closure72);
        java.lang.String str74 = groovyOperator73.getPath();
        java.util.Map<java.lang.String, java.lang.Object> strMap75 = groovyOperator73.getProperties();
        io.teknek.plan.OperatorDesc operatorDesc76 = new io.teknek.plan.OperatorDesc((io.teknek.model.Operator) groovyOperator73);
        io.teknek.plan.OperatorDesc operatorDesc77 = operatorDesc71.withNextOperator(operatorDesc76);
        operatorDesc71.setName("pipe.operator.command.and.arguments");
        java.lang.String str80 = operatorDesc71.getTheClass();
        io.teknek.plan.Plan plan81 = plan62.withRootOperator(operatorDesc71);
        tuple7.setField("teknek.graphite.cluster/plan-workers", (java.lang.Object) plan62);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strMap17);
        org.junit.Assert.assertNotNull(operatorDesc19);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(strMap37);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(strMap42);
        org.junit.Assert.assertNotNull(operatorDesc44);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(offsetStorageDesc46);
        org.junit.Assert.assertNotNull(iTuple49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(operatorDesc56);
        org.junit.Assert.assertNotNull(plan58);
        org.junit.Assert.assertNotNull(plan62);
        org.junit.Assert.assertNotNull(plan66);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(strMap70);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNull(strMap75);
        org.junit.Assert.assertNotNull(operatorDesc77);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "io.teknek.model.GroovyOperator" + "'", str80, "io.teknek.model.GroovyOperator");
        org.junit.Assert.assertNotNull(plan81);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        java.lang.Throwable throwable1 = null;
        io.teknek.daemon.WorkerStartException workerStartException2 = new io.teknek.daemon.WorkerStartException("", throwable1);
        java.lang.String str3 = workerStartException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "io.teknek.daemon.WorkerStartException: " + "'", str3, "io.teknek.daemon.WorkerStartException: ");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        io.teknek.feed.Feed feed0 = null;
        io.teknek.feed.FeedPartitionAdapter feedPartitionAdapter2 = new io.teknek.feed.FeedPartitionAdapter(feed0, "/teknek");
        boolean boolean3 = feedPartitionAdapter2.supportsOffsetManagement();
        boolean boolean4 = feedPartitionAdapter2.supportsOffsetManagement();
        feedPartitionAdapter2.setOffset("teknek.graphite.cluster/saved");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }
}

