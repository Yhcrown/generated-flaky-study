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
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_MAX_NUMBER_PER_FETCH = "";
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.DIRECT_MODE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "direct.mode" + "'", str0, "direct.mode");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        int int0 = java.lang.Thread.MAX_PRIORITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        com.aliyun.openservices.log.flink.util.Consts.READONLY_SHARD_STATUS = "";
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        int int0 = com.aliyun.openservices.log.flink.internal.ProducerConfig.DEFAULT_IO_THREAD_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        java.lang.String[] strArray4 = new java.lang.String[] { "direct.mode", "", "direct.mode" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        com.aliyun.openservices.log.flink.model.LogDeserializationSchema<java.lang.Object> objLogDeserializationSchema7 = null;
        java.util.Properties properties8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.FlinkLogConsumer<java.lang.Object> objFlinkLogConsumer9 = new com.aliyun.openservices.log.flink.FlinkLogConsumer<java.lang.Object>("direct.mode", (java.util.List<java.lang.String>) strList5, objLogDeserializationSchema7, properties8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        long long0 = com.aliyun.openservices.log.flink.util.Consts.DEFAULT_MAX_RETRY_BACKOFF_TIME_MS;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 5000L + "'", long0 == 5000L);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_LOGSTORE = "";
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.STOP_TIME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "stop.time" + "'", str0, "stop.time");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        java.util.regex.Pattern pattern1 = null;
        com.aliyun.openservices.log.flink.model.LogDeserializationSchema<java.util.List<com.aliyun.openservices.log.common.TagContent>> tagContentListLogDeserializationSchema2 = null;
        java.util.Properties properties3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.FlinkLogConsumer<java.util.List<com.aliyun.openservices.log.common.TagContent>> tagContentListFlinkLogConsumer4 = new com.aliyun.openservices.log.flink.FlinkLogConsumer<java.util.List<com.aliyun.openservices.log.common.TagContent>>("", pattern1, tagContentListLogDeserializationSchema2, properties3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.aliyun.openservices.log.flink.model.LogDeserializationSchema<java.io.Serializable> serializableLogDeserializationSchema2 = null;
        java.util.Properties properties3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.FlinkLogConsumer<java.io.Serializable> serializableFlinkLogConsumer4 = new com.aliyun.openservices.log.flink.FlinkLogConsumer<java.io.Serializable>("stop.time", "stop.time", serializableLogDeserializationSchema2, properties3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.LOG_ENDPOINT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ENDPOINT" + "'", str0, "ENDPOINT");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.BUCKETS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "producer.buckets" + "'", str0, "producer.buckets");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.MAX_RETRY_BACKOFF_TIME_MS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "max.retry.backoff.time.ms" + "'", str0, "max.retry.backoff.time.ms");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.LOG_FETCH_DATA_INTERVAL_MILLIS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "FETCH_DATA_INTERVAL_MILLIS" + "'", str0, "FETCH_DATA_INTERVAL_MILLIS");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_MAX_NUMBER_PER_FETCH = "stop.time";
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.aliyun.openservices.log.flink.util.Consts.READONLY_SHARD_STATUS = "ENDPOINT";
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        int int0 = java.lang.Thread.NORM_PRIORITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        int int0 = com.aliyun.openservices.log.flink.util.Consts.DEFAULT_MAX_RETRIES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.aliyun.openservices.log.flink.util.Consts consts0 = new com.aliyun.openservices.log.flink.util.Consts();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        com.aliyun.openservices.log.flink.util.Consts.DEFAULT_COMMIT_INTERVAL_MILLIS = (short) 10;
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.LOG_USER_AGENT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "USER_AGENT" + "'", str0, "USER_AGENT");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.aliyun.openservices.log.flink.util.Consts.READWRITE_SHARD_STATUS = "producer.buckets";
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.aliyun.openservices.log.flink.internal.LogGroupHolder logGroupHolder0 = null;
        com.aliyun.openservices.log.flink.internal.ProducerEvent producerEvent1 = com.aliyun.openservices.log.flink.internal.ProducerEvent.makeEvent(logGroupHolder0);
        boolean boolean2 = producerEvent1.isPoisonPill();
        org.junit.Assert.assertNotNull(producerEvent1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        int int0 = com.aliyun.openservices.log.flink.util.Consts.DEFAULT_NUMBER_PER_FETCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.LOG_GROUP_MAX_LINES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "logGroup.max.lines" + "'", str0, "logGroup.max.lines");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        int int0 = com.aliyun.openservices.log.flink.internal.ProducerConfig.DEFAULT_LOG_GROUP_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3145728 + "'", int0 == 3145728);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_COMMIT_INTERVAL_MILLIS = "ENDPOINT";
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.aliyun.openservices.log.flink.util.Consts.DEFAULT_FETCH_INTERVAL_MILLIS = (byte) 100;
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_PROJECT = "";
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_SHARDS_DISCOVERY_INTERVAL_MILLIS = "USER_AGENT";
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.aliyun.openservices.log.flink.data.RawLogGroup rawLogGroup0 = new com.aliyun.openservices.log.flink.data.RawLogGroup();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        rawLogGroup0.setTags(strMap1);
        // The following exception was thrown during execution in test generation
        try {
            rawLogGroup0.addTag("ENDPOINT", "USER_AGENT");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_COMMIT_INTERVAL_MILLIS = "producer.buckets";
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = null;
        com.aliyun.openservices.log.flink.util.RetryPolicy retryPolicy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.internal.ProducerImpl producerImpl2 = new com.aliyun.openservices.log.flink.internal.ProducerImpl(producerConfig0, retryPolicy1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.aliyun.openservices.log.flink.util.Consts.LOG_END_CURSOR = "";
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_ACCESSKEY = "logGroup.max.lines";
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.aliyun.openservices.log.flink.data.FastLogGroupDeserializer fastLogGroupDeserializer0 = new com.aliyun.openservices.log.flink.data.FastLogGroupDeserializer();
        org.apache.flink.api.common.typeinfo.TypeInformation<com.aliyun.openservices.log.flink.data.FastLogGroupList> fastLogGroupListTypeInformation1 = fastLogGroupDeserializer0.getProducedType();
        com.aliyun.openservices.log.flink.model.PullLogsResult pullLogsResult2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.data.FastLogGroupList fastLogGroupList3 = fastLogGroupDeserializer0.deserialize(pullLogsResult2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastLogGroupListTypeInformation1);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        com.aliyun.openservices.log.flink.internal.ProducerEvent producerEvent1 = new com.aliyun.openservices.log.flink.internal.ProducerEvent(true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.BASE_RETRY_BACKOFF_TIME_MS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "base.retry.backoff.time.ms" + "'", str0, "base.retry.backoff.time.ms");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.lang.String str0 = com.aliyun.openservices.log.flink.util.Consts.READWRITE_SHARD_STATUS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "producer.buckets" + "'", str0, "producer.buckets");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.aliyun.openservices.log.flink.model.LogDeserializationSchema<com.aliyun.openservices.log.flink.model.DefaultShardAssigner> defaultShardAssignerLogDeserializationSchema0 = null;
        java.util.Properties properties1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.FlinkLogConsumer<com.aliyun.openservices.log.flink.model.DefaultShardAssigner> defaultShardAssignerFlinkLogConsumer2 = new com.aliyun.openservices.log.flink.FlinkLogConsumer<com.aliyun.openservices.log.flink.model.DefaultShardAssigner>(defaultShardAssignerLogDeserializationSchema0, properties1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        int int0 = java.lang.Thread.MIN_PRIORITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        com.aliyun.openservices.log.flink.util.Consts.READONLY_SHARD_STATUS = "FETCH_DATA_INTERVAL_MILLIS";
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        boolean boolean0 = com.aliyun.openservices.log.flink.internal.ProducerConfig.DEFAULT_ADJUST_SHARD_HASH;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.LOG_CONSUMERGROUP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "CONSUMER_GROUP" + "'", str0, "CONSUMER_GROUP");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        com.aliyun.openservices.log.flink.util.Consts.LOG_FROM_CHECKPOINT = "base.retry.backoff.time.ms";
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_FETCH_DATA_INTERVAL_MILLIS = "USER_AGENT";
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        int int0 = com.aliyun.openservices.log.flink.internal.ProducerConfig.DEFAULT_PRODUCER_QUEUE_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        com.aliyun.openservices.log.flink.data.FastLogGroupDeserializer fastLogGroupDeserializer0 = new com.aliyun.openservices.log.flink.data.FastLogGroupDeserializer();
        com.aliyun.openservices.log.flink.model.PullLogsResult pullLogsResult1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.data.FastLogGroupList fastLogGroupList2 = fastLogGroupDeserializer0.deserialize(pullLogsResult1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.aliyun.openservices.log.flink.ConfigConstants configConstants0 = new com.aliyun.openservices.log.flink.ConfigConstants();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_ACCESSKEYID = "base.retry.backoff.time.ms";
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        com.aliyun.openservices.log.common.TagContent[] tagContentArray3 = new com.aliyun.openservices.log.common.TagContent[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.TagContent> tagContentList4 = new java.util.ArrayList<com.aliyun.openservices.log.common.TagContent>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.TagContent>) tagContentList4, tagContentArray3);
        com.aliyun.openservices.log.flink.internal.LogGroupKey logGroupKey6 = new com.aliyun.openservices.log.flink.internal.LogGroupKey("CONSUMER_GROUP", "producer.buckets", "USER_AGENT", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList4);
        org.junit.Assert.assertNotNull(tagContentArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_USER_AGENT = "CONSUMER_GROUP";
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.util.Properties properties0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = com.aliyun.openservices.log.flink.util.LogUtil.getNumberPerFetch(properties0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.aliyun.openservices.log.flink.model.DefaultShardAssigner defaultShardAssigner0 = new com.aliyun.openservices.log.flink.model.DefaultShardAssigner();
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = defaultShardAssigner0.assign(logstoreShardMeta1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        long long0 = com.aliyun.openservices.log.flink.util.Consts.DEFAULT_COMMIT_INTERVAL_MILLIS;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 10L + "'", long0 == 10L);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.LOG_GROUP_MAX_SIZE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "logGroup.max.size" + "'", str0, "logGroup.max.size");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        java.util.Properties properties0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.aliyun.openservices.log.flink.util.LogUtil.getDiscoveryIntervalMs(properties0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        int int0 = com.aliyun.openservices.log.flink.internal.ProducerConfig.MAX_LOG_GROUP_LINES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 40960 + "'", int0 == 40960);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        com.aliyun.openservices.log.flink.util.Consts.LOG_BEGIN_CURSOR = "producer.buckets";
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta0 = null;
        com.aliyun.openservices.log.flink.model.LogstoreShardState logstoreShardState2 = new com.aliyun.openservices.log.flink.model.LogstoreShardState(logstoreShardMeta0, "FETCH_DATA_INTERVAL_MILLIS");
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta3 = null;
        logstoreShardState2.setShardMeta(logstoreShardMeta3);
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta5 = null;
        logstoreShardState2.setShardMeta(logstoreShardMeta5);
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta7 = null;
        logstoreShardState2.setShardMeta(logstoreShardMeta7);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_COMMIT_INTERVAL_MILLIS = "logGroup.max.size";
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        java.lang.String str3 = com.aliyun.openservices.log.flink.internal.ShardHashAdjuster.padEnd("CONSUMER_GROUP", (int) (byte) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CONSUMER_GROUP" + "'", str3, "CONSUMER_GROUP");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        int int0 = com.aliyun.openservices.log.flink.util.Consts.DEFAULT_MAX_RETRIES_FOR_RETRYABLE_ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 60 + "'", int0 == 60);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.aliyun.openservices.log.flink.model.LogSerializationSchema<com.aliyun.openservices.log.flink.data.RawLog> rawLogLogSerializationSchema0 = null;
        java.util.Properties properties1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.FlinkLogProducer<com.aliyun.openservices.log.flink.data.RawLog> rawLogFlinkLogProducer2 = new com.aliyun.openservices.log.flink.FlinkLogProducer<com.aliyun.openservices.log.flink.data.RawLog>(rawLogLogSerializationSchema0, properties1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: schema cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_ACCESSKEY = "stop.time";
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.aliyun.openservices.log.common.TagContent[] tagContentArray3 = new com.aliyun.openservices.log.common.TagContent[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.TagContent> tagContentList4 = new java.util.ArrayList<com.aliyun.openservices.log.common.TagContent>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.TagContent>) tagContentList4, tagContentArray3);
        com.aliyun.openservices.log.flink.internal.LogGroupKey logGroupKey6 = new com.aliyun.openservices.log.flink.internal.LogGroupKey("hi!", "", "stop.time", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList4);
        java.lang.String str7 = logGroupKey6.getKey();
        org.junit.Assert.assertNotNull(tagContentArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!$$stop.time" + "'", str7, "hi!$$stop.time");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        com.aliyun.openservices.log.flink.model.LogSerializationSchema<java.util.Map<java.lang.String, java.lang.String>> strMapLogSerializationSchema0 = null;
        java.util.Properties properties1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.FlinkLogProducer<java.util.Map<java.lang.String, java.lang.String>> strMapFlinkLogProducer2 = new com.aliyun.openservices.log.flink.FlinkLogProducer<java.util.Map<java.lang.String, java.lang.String>>(strMapLogSerializationSchema0, properties1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: schema cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.aliyun.openservices.log.flink.data.FastLogGroupDeserializer fastLogGroupDeserializer0 = new com.aliyun.openservices.log.flink.data.FastLogGroupDeserializer();
        org.apache.flink.api.common.typeinfo.TypeInformation<com.aliyun.openservices.log.flink.data.FastLogGroupList> fastLogGroupListTypeInformation1 = fastLogGroupDeserializer0.getProducedType();
        com.aliyun.openservices.log.flink.model.PullLogsResult pullLogsResult2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.data.FastLogGroupList fastLogGroupList3 = fastLogGroupDeserializer0.deserialize(pullLogsResult2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastLogGroupListTypeInformation1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.aliyun.openservices.log.flink.util.Consts.DEFAULT_FETCH_INTERVAL_MILLIS = (byte) 0;
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.aliyun.openservices.log.flink.data.RawLog rawLog0 = new com.aliyun.openservices.log.flink.data.RawLog();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = rawLog0.getContents();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = rawLog0.getContents();
        java.lang.String str3 = rawLog0.toString();
        int int4 = rawLog0.getTime();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "RawLog{time=0, contents={}, tags={}}" + "'", str3, "RawLog{time=0, contents={}, tags={}}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_ACCESSKEYID = "ENDPOINT";
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        com.aliyun.openservices.log.flink.util.RetryPolicy retryPolicy0 = new com.aliyun.openservices.log.flink.util.RetryPolicy();
        long long1 = retryPolicy0.getBaseRetryBackoff();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.aliyun.openservices.log.flink.data.RawLog rawLog0 = new com.aliyun.openservices.log.flink.data.RawLog();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = rawLog0.getContents();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = rawLog0.getContents();
        rawLog0.setTime((int) 'a');
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.PRODUCER_ADJUST_SHARD_HASH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "producer.adjust.shard.hash" + "'", str0, "producer.adjust.shard.hash");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        // The following exception was thrown during execution in test generation
        try {
            producerConfig0.setFlushInterval((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: flushInterval must be > 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.LOG_PROJECT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.aliyun.openservices.log.flink.data.FastLogGroupDeserializer fastLogGroupDeserializer0 = new com.aliyun.openservices.log.flink.data.FastLogGroupDeserializer();
        org.apache.flink.api.common.typeinfo.TypeInformation<com.aliyun.openservices.log.flink.data.FastLogGroupList> fastLogGroupListTypeInformation1 = fastLogGroupDeserializer0.getProducedType();
        org.apache.flink.api.common.typeinfo.TypeInformation<com.aliyun.openservices.log.flink.data.FastLogGroupList> fastLogGroupListTypeInformation2 = fastLogGroupDeserializer0.getProducedType();
        org.junit.Assert.assertNotNull(fastLogGroupListTypeInformation1);
        org.junit.Assert.assertNotNull(fastLogGroupListTypeInformation2);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.model.CheckpointMode checkpointMode1 = com.aliyun.openservices.log.flink.model.CheckpointMode.fromString("RawLog{time=0, contents={}, tags={}}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal checkpoint mode: RawLog{time=0, contents={}, tags={}}");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.aliyun.openservices.log.flink.internal.ProducerEvent producerEvent1 = new com.aliyun.openservices.log.flink.internal.ProducerEvent(false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.LOG_COMMIT_INTERVAL_MILLIS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "logGroup.max.size" + "'", str0, "logGroup.max.size");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_CHECKPOINT_MODE = "ENDPOINT";
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.aliyun.openservices.log.flink.util.Consts.LOG_BEGIN_CURSOR = "logGroup.max.size";
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_SHARDS_DISCOVERY_INTERVAL_MILLIS = "";
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_COMMIT_INTERVAL_MILLIS = "base.retry.backoff.time.ms";
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.aliyun.openservices.log.flink.util.Consts.READONLY_SHARD_STATUS = "USER_AGENT";
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_ACCESSKEY = "max.retry.backoff.time.ms";
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        com.aliyun.openservices.log.flink.model.LogDeserializationSchema<java.lang.Object> objLogDeserializationSchema2 = null;
        java.util.Properties properties3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.FlinkLogConsumer<java.lang.Object> objFlinkLogConsumer4 = new com.aliyun.openservices.log.flink.FlinkLogConsumer<java.lang.Object>("logGroup.max.lines", "RawLogGroup{source='null', topic='', tags={}, logs=[]}", objLogDeserializationSchema2, properties3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        java.lang.String str0 = com.aliyun.openservices.log.flink.util.Consts.LOG_BEGIN_CURSOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "logGroup.max.size" + "'", str0, "logGroup.max.size");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_LOGSTORE = "FETCH_DATA_INTERVAL_MILLIS";
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        java.lang.String str1 = producerConfig0.toString();
        // The following exception was thrown during execution in test generation
        try {
            producerConfig0.setFlushInterval(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: flushInterval must be > 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}" + "'", str1, "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.aliyun.openservices.log.flink.data.RawLog rawLog0 = new com.aliyun.openservices.log.flink.data.RawLog();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = rawLog0.getContents();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = rawLog0.getContents();
        java.lang.String str3 = rawLog0.toString();
        rawLog0.setTime((int) (short) -1);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "RawLog{time=0, contents={}, tags={}}" + "'", str3, "RawLog{time=0, contents={}, tags={}}");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        java.util.regex.Pattern pattern1 = null;
        com.aliyun.openservices.log.flink.model.LogDeserializationSchema<com.aliyun.openservices.log.flink.model.LogstoreShardState> logstoreShardStateLogDeserializationSchema2 = null;
        java.util.Properties properties3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.FlinkLogConsumer<com.aliyun.openservices.log.flink.model.LogstoreShardState> logstoreShardStateFlinkLogConsumer4 = new com.aliyun.openservices.log.flink.FlinkLogConsumer<com.aliyun.openservices.log.flink.model.LogstoreShardState>("USER_AGENT", pattern1, logstoreShardStateLogDeserializationSchema2, properties3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_ACCESSKEYID = "logGroup.max.size";
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.LOG_LOGSTORE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "FETCH_DATA_INTERVAL_MILLIS" + "'", str0, "FETCH_DATA_INTERVAL_MILLIS");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_CHECKPOINT_MODE = "producer.buckets";
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.aliyun.openservices.log.flink.data.RawLogGroup rawLogGroup0 = new com.aliyun.openservices.log.flink.data.RawLogGroup();
        java.lang.String str1 = rawLogGroup0.toString();
        rawLogGroup0.setSource("producer.buckets");
        java.lang.String str4 = rawLogGroup0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RawLogGroup{source='null', topic='', tags={}, logs=[]}" + "'", str1, "RawLogGroup{source='null', topic='', tags={}, logs=[]}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RawLogGroup{source='producer.buckets', topic='', tags={}, logs=[]}" + "'", str4, "RawLogGroup{source='producer.buckets', topic='', tags={}, logs=[]}");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.LOG_CHECKPOINT_MODE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "producer.buckets" + "'", str0, "producer.buckets");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        int int0 = com.aliyun.openservices.log.flink.internal.ProducerConfig.DEFAULT_MAX_LOG_GROUP_LINES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5000 + "'", int0 == 5000);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        int int1 = producerConfig0.getBuckets();
        int int2 = producerConfig0.getTotalSizeInBytes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta0 = null;
        com.aliyun.openservices.log.flink.model.LogstoreShardState logstoreShardState2 = new com.aliyun.openservices.log.flink.model.LogstoreShardState(logstoreShardMeta0, "FETCH_DATA_INTERVAL_MILLIS");
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta3 = null;
        logstoreShardState2.setShardMeta(logstoreShardMeta3);
        logstoreShardState2.setOffset("direct.mode");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = logstoreShardState2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        java.util.regex.Pattern pattern1 = null;
        com.aliyun.openservices.log.flink.model.LogDeserializationSchema<java.util.Map<java.lang.String, java.lang.String>> strMapLogDeserializationSchema2 = null;
        java.util.Properties properties3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.FlinkLogConsumer<java.util.Map<java.lang.String, java.lang.String>> strMapFlinkLogConsumer4 = new com.aliyun.openservices.log.flink.FlinkLogConsumer<java.util.Map<java.lang.String, java.lang.String>>("hi!", pattern1, strMapLogDeserializationSchema2, properties3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.LOG_SHARDS_DISCOVERY_INTERVAL_MILLIS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.aliyun.openservices.log.flink.data.RawLogGroup rawLogGroup0 = new com.aliyun.openservices.log.flink.data.RawLogGroup();
        java.lang.String str1 = rawLogGroup0.toString();
        rawLogGroup0.setSource("producer.buckets");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = rawLogGroup0.getTags();
        java.lang.String str5 = rawLogGroup0.getTopic();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RawLogGroup{source='null', topic='', tags={}, logs=[]}" + "'", str1, "RawLogGroup{source='null', topic='', tags={}, logs=[]}");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.util.Properties properties0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.model.CheckpointMode checkpointMode1 = com.aliyun.openservices.log.flink.util.LogUtil.parseCheckpointMode(properties0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.aliyun.openservices.log.flink.util.Consts.READWRITE_SHARD_STATUS = "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT";
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_PROJECT = "logGroup.max.lines";
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.aliyun.openservices.log.common.FastLogGroup[] fastLogGroupArray0 = new com.aliyun.openservices.log.common.FastLogGroup[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.FastLogGroup> fastLogGroupList1 = new java.util.ArrayList<com.aliyun.openservices.log.common.FastLogGroup>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.FastLogGroup>) fastLogGroupList1, fastLogGroupArray0);
        com.aliyun.openservices.log.flink.data.FastLogGroupList fastLogGroupList3 = new com.aliyun.openservices.log.flink.data.FastLogGroupList((java.util.List<com.aliyun.openservices.log.common.FastLogGroup>) fastLogGroupList1);
        com.aliyun.openservices.log.common.FastLogGroup fastLogGroup4 = null;
        fastLogGroupList3.addLogGroup(fastLogGroup4);
        org.junit.Assert.assertNotNull(fastLogGroupArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.lang.String str3 = com.aliyun.openservices.log.flink.internal.ShardHashAdjuster.padStart("direct.mode", (int) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "direct.mode" + "'", str3, "direct.mode");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        int int0 = com.aliyun.openservices.log.flink.internal.ProducerConfig.DEFAULT_BUCKETS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        long long0 = com.aliyun.openservices.log.flink.util.Consts.DEFAULT_BASE_RETRY_BACKOFF_TIME_MS;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 200L + "'", long0 == 200L);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        org.apache.flink.streaming.api.functions.source.SourceFunction.SourceContext<java.util.RandomAccess> randomAccessSourceContext0 = null;
        org.apache.flink.api.common.functions.RuntimeContext runtimeContext1 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}", "stop.time", "producer.adjust.shard.hash", "logGroup.max.size", "RawLogGroup{source='null', topic='', tags={}, logs=[]}", "RawLogGroup{source='producer.buckets', topic='', tags={}, logs=[]}", "hi!", "ENDPOINT", "RawLogGroup{source='producer.buckets', topic='', tags={}, logs=[]}", "RawLogGroup{source='producer.buckets', topic='', tags={}, logs=[]}", "", "CONSUMER_GROUP", "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.regex.Pattern pattern19 = null;
        java.util.Properties properties20 = null;
        com.aliyun.openservices.log.flink.model.LogDeserializationSchema<java.util.RandomAccess> randomAccessLogDeserializationSchema21 = null;
        com.aliyun.openservices.log.flink.util.LogClientProxy logClientProxy22 = null;
        com.aliyun.openservices.log.flink.model.CheckpointMode checkpointMode23 = com.aliyun.openservices.log.flink.model.CheckpointMode.PERIODIC;
        com.aliyun.openservices.log.flink.ShardAssigner shardAssigner24 = com.aliyun.openservices.log.flink.model.LogDataFetcher.DEFAULT_SHARD_ASSIGNER;
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.model.LogDataFetcher<java.util.RandomAccess> randomAccessLogDataFetcher25 = new com.aliyun.openservices.log.flink.model.LogDataFetcher<java.util.RandomAccess>(randomAccessSourceContext0, runtimeContext1, "RawLogGroup{source='producer.buckets', topic='', tags={}, logs=[]}", (java.util.List<java.lang.String>) strList17, pattern19, properties20, randomAccessLogDeserializationSchema21, logClientProxy22, checkpointMode23, shardAssigner24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + checkpointMode23 + "' != '" + com.aliyun.openservices.log.flink.model.CheckpointMode.PERIODIC + "'", checkpointMode23.equals(com.aliyun.openservices.log.flink.model.CheckpointMode.PERIODIC));
        org.junit.Assert.assertNotNull(shardAssigner24);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_ACCESSKEYID = "FETCH_DATA_INTERVAL_MILLIS";
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        int int0 = com.aliyun.openservices.log.flink.internal.ProducerConfig.MAX_LOG_GROUP_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8388608 + "'", int0 == 8388608);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.MAX_RETRIES_FOR_RETRYABLE_ERROR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "max.retries.for.retryable.error" + "'", str0, "max.retries.for.retryable.error");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_LOGSTORE = "stop.time";
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta3 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        logstoreShardMeta3.setEndCursor("base.retry.backoff.time.ms");
        logstoreShardMeta3.setShardStatus("direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT");
        boolean boolean8 = logstoreShardMeta3.isReadWrite();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.LOG_CONSUMER_DEFAULT_POSITION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "CONSUMER_DEFAULT_POSITION" + "'", str0, "CONSUMER_DEFAULT_POSITION");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.aliyun.openservices.log.flink.data.RawLogGroup rawLogGroup0 = new com.aliyun.openservices.log.flink.data.RawLogGroup();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        rawLogGroup0.setTags(strMap1);
        com.aliyun.openservices.log.flink.data.RawLog rawLog3 = new com.aliyun.openservices.log.flink.data.RawLog();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = rawLog3.getContents();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = rawLog3.getContents();
        rawLogGroup0.addLog(rawLog3);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = rawLog3.getTags();
        com.aliyun.openservices.log.flink.data.RawLog rawLog8 = new com.aliyun.openservices.log.flink.data.RawLog();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = rawLog8.getContents();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = rawLog8.getContents();
        java.lang.String str11 = rawLog8.toString();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = rawLog8.getContents();
        rawLog3.setTags(strMap12);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RawLog{time=0, contents={}, tags={}}" + "'", str11, "RawLog{time=0, contents={}, tags={}}");
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        producerConfig0.setEndpoint("hi!");
        // The following exception was thrown during execution in test generation
        try {
            producerConfig0.setFlushInterval((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: flushInterval must be > 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.aliyun.openservices.log.flink.data.RawLog rawLog0 = new com.aliyun.openservices.log.flink.data.RawLog();
        rawLog0.addContent("USER_AGENT", "hi!");
        rawLog0.setTime(0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.lang.String[] strArray10 = new java.lang.String[] { "RawLogGroup{source='producer.buckets', topic='', tags={}, logs=[]}", "max.retry.backoff.time.ms", "RawLog{time=0, contents={}, tags={}}", "max.retries.for.retryable.error", "CONSUMER_DEFAULT_POSITION", "stop.time", "USER_AGENT", "CONSUMER_DEFAULT_POSITION", "direct.mode" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        com.aliyun.openservices.log.flink.model.LogDeserializationSchema<org.apache.flink.api.common.typeinfo.TypeInformation<com.aliyun.openservices.log.flink.data.FastLogGroupList>> fastLogGroupListTypeInformationLogDeserializationSchema13 = null;
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.FlinkLogConsumer<org.apache.flink.api.common.typeinfo.TypeInformation<com.aliyun.openservices.log.flink.data.FastLogGroupList>> fastLogGroupListTypeInformationFlinkLogConsumer15 = new com.aliyun.openservices.log.flink.FlinkLogConsumer<org.apache.flink.api.common.typeinfo.TypeInformation<com.aliyun.openservices.log.flink.data.FastLogGroupList>>("USER_AGENT", (java.util.List<java.lang.String>) strList11, fastLogGroupListTypeInformationLogDeserializationSchema13, properties14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta0 = null;
        com.aliyun.openservices.log.flink.model.LogstoreShardState logstoreShardState2 = new com.aliyun.openservices.log.flink.model.LogstoreShardState(logstoreShardMeta0, "FETCH_DATA_INTERVAL_MILLIS");
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta3 = null;
        logstoreShardState2.setShardMeta(logstoreShardMeta3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = logstoreShardState2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.aliyun.openservices.log.flink.data.RawLogGroup rawLogGroup0 = new com.aliyun.openservices.log.flink.data.RawLogGroup();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        rawLogGroup0.setTags(strMap1);
        java.lang.String str3 = rawLogGroup0.getTopic();
        java.util.List<com.aliyun.openservices.log.flink.data.RawLog> rawLogList4 = rawLogGroup0.getLogs();
        java.lang.String str5 = rawLogGroup0.getTopic();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(rawLogList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.LOG_ACCESSKEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "max.retry.backoff.time.ms" + "'", str0, "max.retry.backoff.time.ms");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.PRODUCER_QUEUE_SIZE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "producer.queue.size" + "'", str0, "producer.queue.size");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        int int0 = com.aliyun.openservices.log.flink.internal.ProducerConfig.DEFAULT_TOTAL_SIZE_IN_BYTES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 209715200 + "'", int0 == 209715200);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.aliyun.openservices.log.flink.data.RawLogGroupList rawLogGroupList0 = new com.aliyun.openservices.log.flink.data.RawLogGroupList();
        com.aliyun.openservices.log.flink.data.RawLogGroup rawLogGroup1 = new com.aliyun.openservices.log.flink.data.RawLogGroup();
        java.util.List<com.aliyun.openservices.log.flink.data.RawLog> rawLogList2 = rawLogGroup1.getLogs();
        rawLogGroupList0.add(rawLogGroup1);
        org.junit.Assert.assertNotNull(rawLogList2);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.aliyun.openservices.log.common.LogGroupData[] logGroupDataArray0 = new com.aliyun.openservices.log.common.LogGroupData[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData> logGroupDataList1 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList1, logGroupDataArray0);
        com.aliyun.openservices.log.flink.model.PullLogsResult pullLogsResult6 = new com.aliyun.openservices.log.flink.model.PullLogsResult((java.util.List<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList1, (-1), "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT", "direct.mode");
        java.lang.String str7 = pullLogsResult6.getNextCursor();
        pullLogsResult6.setNextCursor("FETCH_DATA_INTERVAL_MILLIS");
        java.lang.String str10 = pullLogsResult6.getCursor();
        java.lang.String str11 = pullLogsResult6.getCursor();
        pullLogsResult6.setNextCursor("base.retry.backoff.time.ms");
        pullLogsResult6.setCursor("producer.queue.size");
        org.junit.Assert.assertNotNull(logGroupDataArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "direct.mode" + "'", str7, "direct.mode");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT" + "'", str10, "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT" + "'", str11, "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        int int1 = producerConfig0.getBuckets();
        producerConfig0.setIoThreadNum((int) (byte) 10);
        java.lang.String str4 = producerConfig0.getAccessKeySecret();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        java.lang.String str1 = producerConfig0.toString();
        java.lang.String str2 = producerConfig0.toString();
        producerConfig0.setProducerQueueSize(40960);
        int int5 = producerConfig0.getIoThreadNum();
        int int6 = producerConfig0.getLogGroupSize();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}" + "'", str1, "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}" + "'", str2, "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.util.Properties properties0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.aliyun.openservices.log.flink.util.LogUtil.getDefaultPosition(properties0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        producerConfig0.setEndpoint("hi!");
        java.lang.String str3 = producerConfig0.getEndpoint();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        java.lang.String str0 = com.aliyun.openservices.log.flink.util.Consts.LOG_FROM_CHECKPOINT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "base.retry.backoff.time.ms" + "'", str0, "base.retry.backoff.time.ms");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.aliyun.openservices.log.common.LogGroupData[] logGroupDataArray0 = new com.aliyun.openservices.log.common.LogGroupData[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData> logGroupDataList1 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList1, logGroupDataArray0);
        com.aliyun.openservices.log.flink.model.PullLogsResult pullLogsResult6 = new com.aliyun.openservices.log.flink.model.PullLogsResult((java.util.List<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList1, (-1), "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT", "direct.mode");
        java.lang.String str7 = pullLogsResult6.getNextCursor();
        pullLogsResult6.setNextCursor("FETCH_DATA_INTERVAL_MILLIS");
        java.lang.String str10 = pullLogsResult6.getCursor();
        java.lang.String str11 = pullLogsResult6.getCursor();
        pullLogsResult6.setNextCursor("direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT");
        org.junit.Assert.assertNotNull(logGroupDataArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "direct.mode" + "'", str7, "direct.mode");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT" + "'", str10, "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT" + "'", str11, "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.aliyun.openservices.log.flink.util.Consts.LOG_END_CURSOR = "USER_AGENT";
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        java.util.Properties properties0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.aliyun.openservices.log.flink.util.LogUtil.getCommitIntervalMs(properties0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        com.aliyun.openservices.log.flink.data.RawLogGroup rawLogGroup0 = new com.aliyun.openservices.log.flink.data.RawLogGroup();
        java.lang.String str1 = rawLogGroup0.toString();
        rawLogGroup0.addTag("direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT", "producer.buckets");
        java.lang.String str5 = rawLogGroup0.getSource();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = rawLogGroup0.getTags();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RawLogGroup{source='null', topic='', tags={}, logs=[]}" + "'", str1, "RawLogGroup{source='null', topic='', tags={}, logs=[]}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_USER_AGENT = "";
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.aliyun.openservices.log.flink.util.Consts.DEFAULT_NUMBER_PER_FETCH = (byte) 10;
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_USER_AGENT = "ENDPOINT";
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        java.lang.String str0 = com.aliyun.openservices.log.flink.util.Consts.FLINK_CONNECTOR_VERSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "0.1.32" + "'", str0, "0.1.32");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.MAX_RETRIES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "max.retries" + "'", str0, "max.retries");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.aliyun.openservices.log.flink.util.Consts.DEFAULT_FETCH_INTERVAL_MILLIS = 'a';
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        org.apache.flink.streaming.api.functions.source.SourceFunction.SourceContext<com.aliyun.openservices.log.flink.data.RawLog> rawLogSourceContext0 = null;
        org.apache.flink.api.common.functions.RuntimeContext runtimeContext1 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "CONSUMER_GROUP", "max.retries", "max.retries", "hi!$$stop.time", "RawLogGroup{source='producer.buckets', topic='', tags={}, logs=[]}", "max.retries.for.retryable.error", "USER_AGENT", "producer.queue.size", "ENDPOINT", "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}", "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT", "direct.mode", "hi!$$stop.time", "producer.queue.size", "ENDPOINT" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.regex.Pattern pattern21 = null;
        java.util.Properties properties22 = null;
        com.aliyun.openservices.log.flink.model.LogDeserializationSchema<com.aliyun.openservices.log.flink.data.RawLog> rawLogLogDeserializationSchema23 = null;
        com.aliyun.openservices.log.flink.util.LogClientProxy logClientProxy24 = null;
        com.aliyun.openservices.log.flink.model.CheckpointMode checkpointMode25 = com.aliyun.openservices.log.flink.model.CheckpointMode.DISABLED;
        com.aliyun.openservices.log.flink.ShardAssigner shardAssigner26 = com.aliyun.openservices.log.flink.model.LogDataFetcher.DEFAULT_SHARD_ASSIGNER;
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.model.LogDataFetcher<com.aliyun.openservices.log.flink.data.RawLog> rawLogLogDataFetcher27 = new com.aliyun.openservices.log.flink.model.LogDataFetcher<com.aliyun.openservices.log.flink.data.RawLog>(rawLogSourceContext0, runtimeContext1, "hi!$$stop.time", (java.util.List<java.lang.String>) strList19, pattern21, properties22, rawLogLogDeserializationSchema23, logClientProxy24, checkpointMode25, shardAssigner26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + checkpointMode25 + "' != '" + com.aliyun.openservices.log.flink.model.CheckpointMode.DISABLED + "'", checkpointMode25.equals(com.aliyun.openservices.log.flink.model.CheckpointMode.DISABLED));
        org.junit.Assert.assertNotNull(shardAssigner26);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.aliyun.openservices.log.common.TagContent[] tagContentArray3 = new com.aliyun.openservices.log.common.TagContent[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.TagContent> tagContentList4 = new java.util.ArrayList<com.aliyun.openservices.log.common.TagContent>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.TagContent>) tagContentList4, tagContentArray3);
        com.aliyun.openservices.log.common.TagContent[] tagContentArray12 = new com.aliyun.openservices.log.common.TagContent[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.TagContent> tagContentList13 = new java.util.ArrayList<com.aliyun.openservices.log.common.TagContent>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.TagContent>) tagContentList13, tagContentArray12);
        com.aliyun.openservices.log.flink.internal.LogGroupKey logGroupKey15 = new com.aliyun.openservices.log.flink.internal.LogGroupKey("logGroup.max.size", "hi!", "", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList13);
        com.aliyun.openservices.log.common.TagContent[] tagContentArray22 = new com.aliyun.openservices.log.common.TagContent[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.TagContent> tagContentList23 = new java.util.ArrayList<com.aliyun.openservices.log.common.TagContent>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.TagContent>) tagContentList23, tagContentArray22);
        com.aliyun.openservices.log.flink.internal.LogGroupKey logGroupKey25 = new com.aliyun.openservices.log.flink.internal.LogGroupKey("logGroup.max.size", "hi!", "", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList23);
        com.aliyun.openservices.log.common.LogItem[] logItemArray26 = new com.aliyun.openservices.log.common.LogItem[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogItem> logItemList27 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogItem>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogItem>) logItemList27, logItemArray26);
        com.aliyun.openservices.log.flink.internal.LogGroupHolder logGroupHolder30 = new com.aliyun.openservices.log.flink.internal.LogGroupHolder("CONSUMER_GROUP", "base.retry.backoff.time.ms", "max.retry.backoff.time.ms", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList23, (java.util.List<com.aliyun.openservices.log.common.LogItem>) logItemList27, (int) (short) 100);
        com.aliyun.openservices.log.flink.internal.LogGroupHolder logGroupHolder32 = new com.aliyun.openservices.log.flink.internal.LogGroupHolder("logGroup.max.lines", "direct.mode", "RawLog{time=0, contents={}, tags={}}", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList13, (java.util.List<com.aliyun.openservices.log.common.LogItem>) logItemList27, (int) (short) 0);
        com.aliyun.openservices.log.flink.internal.LogGroupHolder logGroupHolder34 = new com.aliyun.openservices.log.flink.internal.LogGroupHolder("RawLogGroup{source='null', topic='', tags={}, logs=[]}", "CONSUMER_GROUP", "producer.queue.size", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList4, (java.util.List<com.aliyun.openservices.log.common.LogItem>) logItemList27, (int) (short) 0);
        org.junit.Assert.assertNotNull(tagContentArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tagContentArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tagContentArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(logItemArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_MAX_NUMBER_PER_FETCH = "CONSUMER_DEFAULT_POSITION";
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        java.lang.String str3 = com.aliyun.openservices.log.flink.internal.ShardHashAdjuster.padEnd("stop.time", (int) (short) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "stop.time4" + "'", str3, "stop.time4");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.aliyun.openservices.log.common.TagContent[] tagContentArray6 = new com.aliyun.openservices.log.common.TagContent[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.TagContent> tagContentList7 = new java.util.ArrayList<com.aliyun.openservices.log.common.TagContent>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.TagContent>) tagContentList7, tagContentArray6);
        com.aliyun.openservices.log.flink.internal.LogGroupKey logGroupKey9 = new com.aliyun.openservices.log.flink.internal.LogGroupKey("logGroup.max.size", "hi!", "", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList7);
        com.aliyun.openservices.log.common.LogItem[] logItemArray10 = new com.aliyun.openservices.log.common.LogItem[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogItem> logItemList11 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogItem>) logItemList11, logItemArray10);
        com.aliyun.openservices.log.flink.internal.LogGroupHolder logGroupHolder14 = new com.aliyun.openservices.log.flink.internal.LogGroupHolder("CONSUMER_GROUP", "base.retry.backoff.time.ms", "max.retry.backoff.time.ms", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList7, (java.util.List<com.aliyun.openservices.log.common.LogItem>) logItemList11, (int) (short) 100);
        java.lang.String str15 = logGroupHolder14.getSource();
        com.aliyun.openservices.log.flink.internal.ProducerEvent producerEvent16 = new com.aliyun.openservices.log.flink.internal.ProducerEvent(logGroupHolder14);
        com.aliyun.openservices.log.flink.internal.LogGroupHolder logGroupHolder17 = producerEvent16.getLogGroup();
        com.aliyun.openservices.log.flink.internal.ProducerEvent producerEvent18 = com.aliyun.openservices.log.flink.internal.ProducerEvent.makeEvent(logGroupHolder17);
        org.junit.Assert.assertNotNull(tagContentArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(logItemArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CONSUMER_GROUP" + "'", str15, "CONSUMER_GROUP");
        org.junit.Assert.assertNotNull(logGroupHolder17);
        org.junit.Assert.assertNotNull(producerEvent18);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta0 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        producerConfig0.setEndpoint("hi!");
        producerConfig0.setEndpoint("USER_AGENT");
        producerConfig0.setTotalSizeInBytes((int) (byte) 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        producerConfig0.setEndpoint("hi!");
        int int3 = producerConfig0.getBuckets();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.aliyun.openservices.log.flink.util.Consts.DEFAULT_COMMIT_INTERVAL_MILLIS = 3145728;
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        com.aliyun.openservices.log.flink.data.RawLogGroup rawLogGroup0 = new com.aliyun.openservices.log.flink.data.RawLogGroup();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        rawLogGroup0.setTags(strMap1);
        java.lang.String str3 = rawLogGroup0.getTopic();
        java.util.List<com.aliyun.openservices.log.flink.data.RawLog> rawLogList4 = rawLogGroup0.getLogs();
        com.aliyun.openservices.log.flink.data.RawLog rawLog5 = new com.aliyun.openservices.log.flink.data.RawLog();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = rawLog5.getContents();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = rawLog5.getContents();
        java.lang.String str8 = rawLog5.toString();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = rawLog5.getContents();
        rawLogGroup0.setTags(strMap9);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = rawLogGroup0.getTags();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(rawLogList4);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RawLog{time=0, contents={}, tags={}}" + "'", str8, "RawLog{time=0, contents={}, tags={}}");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        long long0 = com.aliyun.openservices.log.flink.internal.ProducerConfig.DEFAULT_LINGER_MS;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 3000L + "'", long0 == 3000L);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.aliyun.openservices.log.flink.util.Consts.LOG_BEGIN_CURSOR = "";
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.aliyun.openservices.log.flink.data.RawLogGroup rawLogGroup0 = new com.aliyun.openservices.log.flink.data.RawLogGroup();
        java.util.List<com.aliyun.openservices.log.flink.data.RawLog> rawLogList1 = rawLogGroup0.getLogs();
        com.aliyun.openservices.log.flink.data.RawLog rawLog2 = new com.aliyun.openservices.log.flink.data.RawLog();
        rawLog2.setTime(10);
        rawLogGroup0.addLog(rawLog2);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = rawLogGroup0.getTags();
        org.junit.Assert.assertNotNull(rawLogList1);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        long long0 = com.aliyun.openservices.log.flink.util.Consts.DEFAULT_FETCH_INTERVAL_MILLIS;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 97L + "'", long0 == 97L);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.aliyun.openservices.log.flink.util.Consts.READWRITE_SHARD_STATUS = "RawLogGroup{source='null', topic='', tags={}, logs=[]}";
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_LOGSTORE = "max.retries.for.retryable.error";
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.aliyun.openservices.log.common.TagContent[] tagContentArray6 = new com.aliyun.openservices.log.common.TagContent[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.TagContent> tagContentList7 = new java.util.ArrayList<com.aliyun.openservices.log.common.TagContent>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.TagContent>) tagContentList7, tagContentArray6);
        com.aliyun.openservices.log.flink.internal.LogGroupKey logGroupKey9 = new com.aliyun.openservices.log.flink.internal.LogGroupKey("logGroup.max.size", "hi!", "", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList7);
        com.aliyun.openservices.log.common.LogItem[] logItemArray10 = new com.aliyun.openservices.log.common.LogItem[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogItem> logItemList11 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogItem>) logItemList11, logItemArray10);
        com.aliyun.openservices.log.flink.internal.LogGroupHolder logGroupHolder14 = new com.aliyun.openservices.log.flink.internal.LogGroupHolder("CONSUMER_GROUP", "base.retry.backoff.time.ms", "max.retry.backoff.time.ms", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList7, (java.util.List<com.aliyun.openservices.log.common.LogItem>) logItemList11, (int) (short) 100);
        java.lang.String str15 = logGroupHolder14.getSource();
        com.aliyun.openservices.log.flink.internal.ProducerEvent producerEvent16 = new com.aliyun.openservices.log.flink.internal.ProducerEvent(logGroupHolder14);
        com.aliyun.openservices.log.flink.internal.ProducerEvent producerEvent17 = com.aliyun.openservices.log.flink.internal.ProducerEvent.makeEvent(logGroupHolder14);
        org.junit.Assert.assertNotNull(tagContentArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(logItemArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CONSUMER_GROUP" + "'", str15, "CONSUMER_GROUP");
        org.junit.Assert.assertNotNull(producerEvent17);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta3 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        boolean boolean4 = logstoreShardMeta3.isReadWrite();
        java.lang.String str5 = logstoreShardMeta3.getLogstore();
        int int6 = logstoreShardMeta3.getShardId();
        java.lang.String str7 = logstoreShardMeta3.getEndCursor();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CONSUMER_GROUP" + "'", str5, "CONSUMER_GROUP");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.aliyun.openservices.log.flink.util.Consts.DEFAULT_NUMBER_PER_FETCH = 0;
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder0 = com.aliyun.openservices.log.flink.util.RetryPolicy.builder();
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder2 = retryPolicyBuilder0.maxRetries(100);
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder4 = retryPolicyBuilder2.maxRetries((int) 'a');
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder6 = retryPolicyBuilder2.maxRetryBackoff(5000L);
        org.junit.Assert.assertNotNull(retryPolicyBuilder0);
        org.junit.Assert.assertNotNull(retryPolicyBuilder2);
        org.junit.Assert.assertNotNull(retryPolicyBuilder4);
        org.junit.Assert.assertNotNull(retryPolicyBuilder6);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.aliyun.openservices.log.common.LogGroupData[] logGroupDataArray0 = new com.aliyun.openservices.log.common.LogGroupData[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData> logGroupDataList1 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList1, logGroupDataArray0);
        com.aliyun.openservices.log.flink.model.PullLogsResult pullLogsResult6 = new com.aliyun.openservices.log.flink.model.PullLogsResult((java.util.List<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList1, (-1), "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT", "direct.mode");
        java.lang.String str7 = pullLogsResult6.getNextCursor();
        pullLogsResult6.setNextCursor("FETCH_DATA_INTERVAL_MILLIS");
        java.lang.String str10 = pullLogsResult6.getCursor();
        java.lang.String str11 = pullLogsResult6.getCursor();
        pullLogsResult6.setNextCursor("base.retry.backoff.time.ms");
        pullLogsResult6.setNextCursor("RawLogGroup{source='null', topic='', tags={}, logs=[]}");
        java.lang.String str16 = pullLogsResult6.getCursor();
        pullLogsResult6.setShard(4096);
        org.junit.Assert.assertNotNull(logGroupDataArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "direct.mode" + "'", str7, "direct.mode");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT" + "'", str10, "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT" + "'", str11, "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT" + "'", str16, "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        org.apache.flink.streaming.api.functions.source.SourceFunction.SourceContext<com.aliyun.openservices.log.flink.model.LogDeserializationSchema<com.aliyun.openservices.log.flink.data.FastLogGroupList>> fastLogGroupListLogDeserializationSchemaSourceContext0 = null;
        org.apache.flink.api.common.functions.RuntimeContext runtimeContext1 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "stop.time4", "hi!", "direct.mode", "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT", "RawLogGroup{source='null', topic='', tags={}, logs=[]}", "max.retries", "producer.queue.size", "direct.mode", "max.retries.for.retryable.error", "base.retry.backoff.time.ms" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.regex.Pattern pattern16 = null;
        java.util.Properties properties17 = null;
        com.aliyun.openservices.log.flink.model.LogDeserializationSchema<com.aliyun.openservices.log.flink.model.LogDeserializationSchema<com.aliyun.openservices.log.flink.data.FastLogGroupList>> fastLogGroupListLogDeserializationSchemaLogDeserializationSchema18 = null;
        com.aliyun.openservices.log.flink.util.LogClientProxy logClientProxy19 = null;
        com.aliyun.openservices.log.flink.model.CheckpointMode checkpointMode20 = com.aliyun.openservices.log.flink.model.CheckpointMode.ON_CHECKPOINTS;
        com.aliyun.openservices.log.flink.model.DefaultShardAssigner defaultShardAssigner21 = new com.aliyun.openservices.log.flink.model.DefaultShardAssigner();
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.model.LogDataFetcher<com.aliyun.openservices.log.flink.model.LogDeserializationSchema<com.aliyun.openservices.log.flink.data.FastLogGroupList>> fastLogGroupListLogDeserializationSchemaLogDataFetcher22 = new com.aliyun.openservices.log.flink.model.LogDataFetcher<com.aliyun.openservices.log.flink.model.LogDeserializationSchema<com.aliyun.openservices.log.flink.data.FastLogGroupList>>(fastLogGroupListLogDeserializationSchemaSourceContext0, runtimeContext1, "direct.mode", (java.util.List<java.lang.String>) strList14, pattern16, properties17, fastLogGroupListLogDeserializationSchemaLogDeserializationSchema18, logClientProxy19, checkpointMode20, (com.aliyun.openservices.log.flink.ShardAssigner) defaultShardAssigner21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + checkpointMode20 + "' != '" + com.aliyun.openservices.log.flink.model.CheckpointMode.ON_CHECKPOINTS + "'", checkpointMode20.equals(com.aliyun.openservices.log.flink.model.CheckpointMode.ON_CHECKPOINTS));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.aliyun.openservices.log.common.LogGroupData[] logGroupDataArray0 = new com.aliyun.openservices.log.common.LogGroupData[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData> logGroupDataList1 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList1, logGroupDataArray0);
        com.aliyun.openservices.log.flink.model.PullLogsResult pullLogsResult6 = new com.aliyun.openservices.log.flink.model.PullLogsResult((java.util.List<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList1, (-1), "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT", "direct.mode");
        java.lang.String str7 = pullLogsResult6.getNextCursor();
        pullLogsResult6.setNextCursor("FETCH_DATA_INTERVAL_MILLIS");
        java.lang.String str10 = pullLogsResult6.getCursor();
        java.lang.String str11 = pullLogsResult6.getCursor();
        pullLogsResult6.setNextCursor("stop.time");
        pullLogsResult6.setNextCursor("RawLogGroup{source='producer.buckets', topic='', tags={}, logs=[]}");
        org.junit.Assert.assertNotNull(logGroupDataArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "direct.mode" + "'", str7, "direct.mode");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT" + "'", str10, "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT" + "'", str11, "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.aliyun.openservices.log.common.FastLogGroup[] fastLogGroupArray0 = new com.aliyun.openservices.log.common.FastLogGroup[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.FastLogGroup> fastLogGroupList1 = new java.util.ArrayList<com.aliyun.openservices.log.common.FastLogGroup>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.FastLogGroup>) fastLogGroupList1, fastLogGroupArray0);
        com.aliyun.openservices.log.flink.data.FastLogGroupList fastLogGroupList3 = new com.aliyun.openservices.log.flink.data.FastLogGroupList((java.util.List<com.aliyun.openservices.log.common.FastLogGroup>) fastLogGroupList1);
        com.aliyun.openservices.log.flink.data.FastLogGroupList fastLogGroupList4 = new com.aliyun.openservices.log.flink.data.FastLogGroupList((java.util.List<com.aliyun.openservices.log.common.FastLogGroup>) fastLogGroupList1);
        org.junit.Assert.assertNotNull(fastLogGroupArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.aliyun.openservices.log.flink.util.Consts.DEFAULT_COMMIT_INTERVAL_MILLIS = 4096;
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta3 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        boolean boolean4 = logstoreShardMeta3.isReadWrite();
        com.aliyun.openservices.log.flink.model.LogstoreShardState logstoreShardState6 = new com.aliyun.openservices.log.flink.model.LogstoreShardState(logstoreShardMeta3, "CONSUMER_GROUP");
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta7 = logstoreShardState6.getShardMeta();
        java.lang.String str8 = logstoreShardState6.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(logstoreShardMeta7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LogstoreShardState{shardMeta=LogstoreShardMeta{logstore='CONSUMER_GROUP', shardId=32, shardStatus='CONSUMER_GROUP', endCursor='null'}, offset='CONSUMER_GROUP'}" + "'", str8, "LogstoreShardState{shardMeta=LogstoreShardMeta{logstore='CONSUMER_GROUP', shardId=32, shardStatus='CONSUMER_GROUP', endCursor='null'}, offset='CONSUMER_GROUP'}");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.aliyun.openservices.log.flink.model.DefaultShardAssigner defaultShardAssigner0 = new com.aliyun.openservices.log.flink.model.DefaultShardAssigner();
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta4 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        boolean boolean5 = logstoreShardMeta4.isReadWrite();
        int int7 = defaultShardAssigner0.assign(logstoreShardMeta4, 60);
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta11 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        int int13 = defaultShardAssigner0.assign(logstoreShardMeta11, (int) (byte) 1);
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = defaultShardAssigner0.assign(logstoreShardMeta14, 209715200);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.util.Properties properties0 = null;
        com.aliyun.openservices.log.flink.internal.ConfigParser configParser1 = new com.aliyun.openservices.log.flink.internal.ConfigParser(properties0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = configParser1.getString("RawLogGroup{source='null', topic='', tags={}, logs=[]}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.aliyun.openservices.log.flink.model.DefaultShardAssigner defaultShardAssigner0 = new com.aliyun.openservices.log.flink.model.DefaultShardAssigner();
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta4 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        int int6 = defaultShardAssigner0.assign(logstoreShardMeta4, (int) (byte) 100);
        java.lang.String str7 = logstoreShardMeta4.getLogstore();
        com.aliyun.openservices.log.flink.model.LogstoreShardState logstoreShardState9 = new com.aliyun.openservices.log.flink.model.LogstoreShardState(logstoreShardMeta4, "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CONSUMER_GROUP" + "'", str7, "CONSUMER_GROUP");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_PROJECT = "CONSUMER_GROUP";
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        java.lang.String str1 = producerConfig0.getAccessKeyId();
        java.lang.Class<?> wildcardClass2 = producerConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta3 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        boolean boolean4 = logstoreShardMeta3.isReadWrite();
        com.aliyun.openservices.log.flink.model.LogstoreShardState logstoreShardState6 = new com.aliyun.openservices.log.flink.model.LogstoreShardState(logstoreShardMeta3, "CONSUMER_GROUP");
        java.lang.String str7 = logstoreShardMeta3.getLogstore();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CONSUMER_GROUP" + "'", str7, "CONSUMER_GROUP");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta0 = null;
        com.aliyun.openservices.log.flink.model.LogstoreShardState logstoreShardState2 = new com.aliyun.openservices.log.flink.model.LogstoreShardState(logstoreShardMeta0, "FETCH_DATA_INTERVAL_MILLIS");
        java.lang.String str3 = logstoreShardState2.getOffset();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FETCH_DATA_INTERVAL_MILLIS" + "'", str3, "FETCH_DATA_INTERVAL_MILLIS");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        com.aliyun.openservices.log.common.LogGroupData[] logGroupDataArray0 = new com.aliyun.openservices.log.common.LogGroupData[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData> logGroupDataList1 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList1, logGroupDataArray0);
        com.aliyun.openservices.log.flink.model.PullLogsResult pullLogsResult6 = new com.aliyun.openservices.log.flink.model.PullLogsResult((java.util.List<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList1, (-1), "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT", "direct.mode");
        com.aliyun.openservices.log.flink.model.PullLogsResult pullLogsResult10 = new com.aliyun.openservices.log.flink.model.PullLogsResult((java.util.List<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList1, (int) ' ', "RawLog{time=0, contents={}, tags={}}", "FETCH_DATA_INTERVAL_MILLIS");
        java.lang.Class<?> wildcardClass11 = logGroupDataList1.getClass();
        org.junit.Assert.assertNotNull(logGroupDataArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        int int1 = producerConfig0.getBuckets();
        producerConfig0.setIoThreadNum((int) (byte) 10);
        producerConfig0.setIoThreadNum((int) 'a');
        boolean boolean6 = producerConfig0.isAdjustShardHash();
        producerConfig0.setProject("max.retries.for.retryable.error");
        int int9 = producerConfig0.getProducerQueueSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.aliyun.openservices.log.flink.util.Consts.DEFAULT_NUMBER_PER_FETCH = 5000;
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.aliyun.openservices.log.flink.model.LogDeserializationSchema<java.lang.reflect.AnnotatedElement> annotatedElementLogDeserializationSchema0 = null;
        java.util.Properties properties1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.FlinkLogConsumer<java.lang.reflect.AnnotatedElement> annotatedElementFlinkLogConsumer2 = new com.aliyun.openservices.log.flink.FlinkLogConsumer<java.lang.reflect.AnnotatedElement>(annotatedElementLogDeserializationSchema0, properties1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_ENDPOINT = "USER_AGENT";
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.aliyun.openservices.log.flink.data.RawLog rawLog0 = new com.aliyun.openservices.log.flink.data.RawLog();
        rawLog0.addContent("USER_AGENT", "hi!");
        rawLog0.addContent("stop.time", "hi!");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.aliyun.openservices.log.flink.data.RawLogGroup rawLogGroup0 = new com.aliyun.openservices.log.flink.data.RawLogGroup();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        rawLogGroup0.setTags(strMap1);
        java.lang.String str3 = rawLogGroup0.getTopic();
        rawLogGroup0.setSource("CONSUMER_DEFAULT_POSITION");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder0 = com.aliyun.openservices.log.flink.util.RetryPolicy.builder();
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder2 = retryPolicyBuilder0.maxRetries(100);
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder4 = retryPolicyBuilder0.maxRetries((int) (byte) 1);
        org.junit.Assert.assertNotNull(retryPolicyBuilder0);
        org.junit.Assert.assertNotNull(retryPolicyBuilder2);
        org.junit.Assert.assertNotNull(retryPolicyBuilder4);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.LOG_MAX_NUMBER_PER_FETCH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "CONSUMER_DEFAULT_POSITION" + "'", str0, "CONSUMER_DEFAULT_POSITION");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        java.util.Properties properties0 = null;
        com.aliyun.openservices.log.flink.internal.ConfigParser configParser1 = new com.aliyun.openservices.log.flink.internal.ConfigParser(properties0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = configParser1.getBool("producer.buckets", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.aliyun.openservices.log.flink.model.LogSerializationSchema<java.util.AbstractCollection<com.aliyun.openservices.log.common.TagContent>> tagContentCollectionLogSerializationSchema0 = null;
        java.util.Properties properties1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.FlinkLogProducer<java.util.AbstractCollection<com.aliyun.openservices.log.common.TagContent>> tagContentCollectionFlinkLogProducer2 = new com.aliyun.openservices.log.flink.FlinkLogProducer<java.util.AbstractCollection<com.aliyun.openservices.log.common.TagContent>>(tagContentCollectionLogSerializationSchema0, properties1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: schema cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.aliyun.openservices.log.flink.data.RawLogGroupListDeserializer rawLogGroupListDeserializer0 = new com.aliyun.openservices.log.flink.data.RawLogGroupListDeserializer();
        rawLogGroupListDeserializer0.setSequenceNumberKey("base.retry.backoff.time.ms");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta3 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("hi!$$stop.time", (int) ' ', "CONSUMER_DEFAULT_POSITION");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_CONSUMERGROUP = "RawLogGroup{source='producer.buckets', topic='', tags={}, logs=[]}";
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.aliyun.openservices.log.flink.data.RawLogGroupListDeserializer rawLogGroupListDeserializer0 = new com.aliyun.openservices.log.flink.data.RawLogGroupListDeserializer();
        org.apache.flink.api.common.typeinfo.TypeInformation<com.aliyun.openservices.log.flink.data.RawLogGroupList> rawLogGroupListTypeInformation1 = rawLogGroupListDeserializer0.getProducedType();
        com.aliyun.openservices.log.common.LogGroupData[] logGroupDataArray2 = new com.aliyun.openservices.log.common.LogGroupData[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData> logGroupDataList3 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList3, logGroupDataArray2);
        com.aliyun.openservices.log.flink.model.PullLogsResult pullLogsResult8 = new com.aliyun.openservices.log.flink.model.PullLogsResult((java.util.List<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList3, (-1), "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT", "direct.mode");
        java.lang.String str9 = pullLogsResult8.getNextCursor();
        pullLogsResult8.setNextCursor("FETCH_DATA_INTERVAL_MILLIS");
        java.lang.String str12 = pullLogsResult8.getCursor();
        java.lang.String str13 = pullLogsResult8.getCursor();
        pullLogsResult8.setNextCursor("max.retries.for.retryable.error");
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.data.RawLogGroupList rawLogGroupList16 = rawLogGroupListDeserializer0.deserialize(pullLogsResult8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal base64 character 2e");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rawLogGroupListTypeInformation1);
        org.junit.Assert.assertNotNull(logGroupDataArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "direct.mode" + "'", str9, "direct.mode");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT" + "'", str12, "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT" + "'", str13, "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        java.lang.String str0 = com.aliyun.openservices.log.flink.util.Consts.LOG_END_CURSOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "USER_AGENT" + "'", str0, "USER_AGENT");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.aliyun.openservices.log.flink.model.LogDeserializationSchema<java.util.ArrayList<com.aliyun.openservices.log.common.TagContent>> tagContentListLogDeserializationSchema0 = null;
        java.util.Properties properties1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.FlinkLogConsumer<java.util.ArrayList<com.aliyun.openservices.log.common.TagContent>> tagContentListFlinkLogConsumer2 = new com.aliyun.openservices.log.flink.FlinkLogConsumer<java.util.ArrayList<com.aliyun.openservices.log.common.TagContent>>(tagContentListLogDeserializationSchema0, properties1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        java.lang.String str0 = com.aliyun.openservices.log.flink.util.Consts.READONLY_SHARD_STATUS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "USER_AGENT" + "'", str0, "USER_AGENT");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.aliyun.openservices.log.flink.data.FastLogGroupDeserializer fastLogGroupDeserializer0 = new com.aliyun.openservices.log.flink.data.FastLogGroupDeserializer();
        org.apache.flink.api.common.typeinfo.TypeInformation<com.aliyun.openservices.log.flink.data.FastLogGroupList> fastLogGroupListTypeInformation1 = fastLogGroupDeserializer0.getProducedType();
        org.apache.flink.api.common.typeinfo.TypeInformation<com.aliyun.openservices.log.flink.data.FastLogGroupList> fastLogGroupListTypeInformation2 = fastLogGroupDeserializer0.getProducedType();
        org.junit.Assert.assertNotNull(fastLogGroupListTypeInformation1);
        org.junit.Assert.assertNotNull(fastLogGroupListTypeInformation2);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_ACCESSKEY = "CONSUMER_GROUP";
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        java.lang.String str1 = producerConfig0.toString();
        producerConfig0.setAccessKeySecret("USER_AGENT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}" + "'", str1, "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.aliyun.openservices.log.flink.util.Consts.LOG_BEGIN_CURSOR = "stop.time";
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta3 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        logstoreShardMeta3.setEndCursor("base.retry.backoff.time.ms");
        logstoreShardMeta3.setShardStatus("base.retry.backoff.time.ms");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.aliyun.openservices.log.flink.data.FastLogGroupDeserializer fastLogGroupDeserializer0 = new com.aliyun.openservices.log.flink.data.FastLogGroupDeserializer();
        com.aliyun.openservices.log.flink.model.PullLogsResult pullLogsResult1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.data.FastLogGroupList fastLogGroupList2 = fastLogGroupDeserializer0.deserialize(pullLogsResult1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        producerConfig0.setEndpoint("hi!");
        producerConfig0.setTotalSizeInBytes((int) ' ');
        java.lang.Class<?> wildcardClass5 = producerConfig0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder0 = com.aliyun.openservices.log.flink.util.RetryPolicy.builder();
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder2 = retryPolicyBuilder0.maxRetries(100);
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder4 = retryPolicyBuilder2.baseRetryBackoff((long) 3145728);
        org.junit.Assert.assertNotNull(retryPolicyBuilder0);
        org.junit.Assert.assertNotNull(retryPolicyBuilder2);
        org.junit.Assert.assertNotNull(retryPolicyBuilder4);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        java.lang.String str1 = producerConfig0.toString();
        java.lang.String str2 = producerConfig0.toString();
        producerConfig0.setFlushInterval(3000L);
        long long5 = producerConfig0.getFlushInterval();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}" + "'", str1, "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}" + "'", str2, "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3000L + "'", long5 == 3000L);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        com.aliyun.openservices.log.common.TagContent[] tagContentArray9 = new com.aliyun.openservices.log.common.TagContent[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.TagContent> tagContentList10 = new java.util.ArrayList<com.aliyun.openservices.log.common.TagContent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.TagContent>) tagContentList10, tagContentArray9);
        com.aliyun.openservices.log.flink.internal.LogGroupKey logGroupKey12 = new com.aliyun.openservices.log.flink.internal.LogGroupKey("logGroup.max.size", "hi!", "", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList10);
        com.aliyun.openservices.log.common.LogItem[] logItemArray13 = new com.aliyun.openservices.log.common.LogItem[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogItem> logItemList14 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogItem>) logItemList14, logItemArray13);
        com.aliyun.openservices.log.flink.internal.LogGroupHolder logGroupHolder17 = new com.aliyun.openservices.log.flink.internal.LogGroupHolder("CONSUMER_GROUP", "base.retry.backoff.time.ms", "max.retry.backoff.time.ms", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList10, (java.util.List<com.aliyun.openservices.log.common.LogItem>) logItemList14, (int) (short) 100);
        java.util.List<com.aliyun.openservices.log.common.TagContent> tagContentList18 = logGroupHolder17.getTags();
        com.aliyun.openservices.log.flink.internal.LogGroupKey logGroupKey19 = new com.aliyun.openservices.log.flink.internal.LogGroupKey("LogstoreShardState{shardMeta=LogstoreShardMeta{logstore='CONSUMER_GROUP', shardId=32, shardStatus='CONSUMER_GROUP', endCursor='null'}, offset='CONSUMER_GROUP'}", "ENDPOINT", "RawLogGroup{source='null', topic='', tags={}, logs=[]}", tagContentList18);
        org.junit.Assert.assertNotNull(tagContentArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(logItemArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tagContentList18);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.aliyun.openservices.log.common.TagContent[] tagContentArray6 = new com.aliyun.openservices.log.common.TagContent[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.TagContent> tagContentList7 = new java.util.ArrayList<com.aliyun.openservices.log.common.TagContent>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.TagContent>) tagContentList7, tagContentArray6);
        com.aliyun.openservices.log.flink.internal.LogGroupKey logGroupKey9 = new com.aliyun.openservices.log.flink.internal.LogGroupKey("logGroup.max.size", "hi!", "", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList7);
        com.aliyun.openservices.log.common.LogItem[] logItemArray10 = new com.aliyun.openservices.log.common.LogItem[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogItem> logItemList11 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogItem>) logItemList11, logItemArray10);
        com.aliyun.openservices.log.flink.internal.LogGroupHolder logGroupHolder14 = new com.aliyun.openservices.log.flink.internal.LogGroupHolder("CONSUMER_GROUP", "base.retry.backoff.time.ms", "max.retry.backoff.time.ms", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList7, (java.util.List<com.aliyun.openservices.log.common.LogItem>) logItemList11, (int) (short) 100);
        java.lang.String str15 = logGroupHolder14.getSource();
        java.util.List<com.aliyun.openservices.log.common.LogItem> logItemList16 = logGroupHolder14.getLogs();
        com.aliyun.openservices.log.flink.internal.ProducerEvent producerEvent17 = com.aliyun.openservices.log.flink.internal.ProducerEvent.makeEvent(logGroupHolder14);
        org.junit.Assert.assertNotNull(tagContentArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(logItemArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CONSUMER_GROUP" + "'", str15, "CONSUMER_GROUP");
        org.junit.Assert.assertNotNull(logItemList16);
        org.junit.Assert.assertNotNull(producerEvent17);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        int int1 = producerConfig0.getBuckets();
        producerConfig0.setProducerQueueSize(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.aliyun.openservices.log.flink.util.RetryPolicy retryPolicy0 = new com.aliyun.openservices.log.flink.util.RetryPolicy();
        int int1 = retryPolicy0.getMaxRetriesForRetryableError();
        int int2 = retryPolicy0.getMaxRetries();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_COMMIT_INTERVAL_MILLIS = "stop.time4";
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.aliyun.openservices.log.common.TagContent[] tagContentArray6 = new com.aliyun.openservices.log.common.TagContent[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.TagContent> tagContentList7 = new java.util.ArrayList<com.aliyun.openservices.log.common.TagContent>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.TagContent>) tagContentList7, tagContentArray6);
        com.aliyun.openservices.log.flink.internal.LogGroupKey logGroupKey9 = new com.aliyun.openservices.log.flink.internal.LogGroupKey("logGroup.max.size", "hi!", "", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList7);
        com.aliyun.openservices.log.common.LogItem[] logItemArray10 = new com.aliyun.openservices.log.common.LogItem[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogItem> logItemList11 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogItem>) logItemList11, logItemArray10);
        com.aliyun.openservices.log.flink.internal.LogGroupHolder logGroupHolder14 = new com.aliyun.openservices.log.flink.internal.LogGroupHolder("CONSUMER_GROUP", "base.retry.backoff.time.ms", "max.retry.backoff.time.ms", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList7, (java.util.List<com.aliyun.openservices.log.common.LogItem>) logItemList11, (int) (short) 100);
        java.lang.String str15 = logGroupHolder14.getSource();
        java.lang.String str16 = logGroupHolder14.getHashKey();
        java.util.List<com.aliyun.openservices.log.common.LogItem> logItemList17 = null;
        // The following exception was thrown during execution in test generation
        try {
            logGroupHolder14.addLogs(logItemList17, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tagContentArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(logItemArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CONSUMER_GROUP" + "'", str15, "CONSUMER_GROUP");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "max.retry.backoff.time.ms" + "'", str16, "max.retry.backoff.time.ms");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        java.util.Properties properties0 = null;
        com.aliyun.openservices.log.flink.internal.ConfigParser configParser1 = new com.aliyun.openservices.log.flink.internal.ConfigParser(properties0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = configParser1.getBool("stop.time4", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder0 = com.aliyun.openservices.log.flink.util.RetryPolicy.builder();
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder2 = retryPolicyBuilder0.baseRetryBackoff(5000L);
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder4 = retryPolicyBuilder2.maxRetriesForRetryableError(10);
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder6 = retryPolicyBuilder4.baseRetryBackoff(3000L);
        org.junit.Assert.assertNotNull(retryPolicyBuilder0);
        org.junit.Assert.assertNotNull(retryPolicyBuilder2);
        org.junit.Assert.assertNotNull(retryPolicyBuilder4);
        org.junit.Assert.assertNotNull(retryPolicyBuilder6);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta3 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("RawLogGroup{source='null', topic='', tags={}, logs=[]}", 100, "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.aliyun.openservices.log.flink.internal.ProducerEvent producerEvent0 = com.aliyun.openservices.log.flink.internal.ProducerEvent.makePoisonPill();
        org.junit.Assert.assertNotNull(producerEvent0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        producerConfig0.setAccessKeyId("LogstoreShardState{shardMeta=LogstoreShardMeta{logstore='CONSUMER_GROUP', shardId=32, shardStatus='CONSUMER_GROUP', endCursor='null'}, offset='CONSUMER_GROUP'}");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        java.lang.String[] strArray17 = new java.lang.String[] { "max.retry.backoff.time.ms", "max.retries.for.retryable.error", "stop.time", "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}", "max.retries.for.retryable.error", "max.retries", "max.retries.for.retryable.error", "stop.time4", "RawLog{time=0, contents={}, tags={}}", "hi!", "producer.buckets", "hi!", "hi!", "logGroup.max.size", "producer.buckets", "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        com.aliyun.openservices.log.flink.model.LogDeserializationSchema<java.lang.Runnable> runnableLogDeserializationSchema20 = null;
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.FlinkLogConsumer<java.lang.Runnable> runnableFlinkLogConsumer22 = new com.aliyun.openservices.log.flink.FlinkLogConsumer<java.lang.Runnable>("RawLogGroup{source='producer.buckets', topic='', tags={}, logs=[]}", (java.util.List<java.lang.String>) strList18, runnableLogDeserializationSchema20, properties21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        int int1 = producerConfig0.getBuckets();
        producerConfig0.setIoThreadNum((int) (byte) 10);
        producerConfig0.setIoThreadNum((int) 'a');
        int int6 = producerConfig0.getLogGroupMaxLines();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta3 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        boolean boolean4 = logstoreShardMeta3.isReadWrite();
        java.lang.String str5 = logstoreShardMeta3.getLogstore();
        java.lang.String str6 = logstoreShardMeta3.toString();
        logstoreShardMeta3.setShardStatus("producer.adjust.shard.hash");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CONSUMER_GROUP" + "'", str5, "CONSUMER_GROUP");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "LogstoreShardMeta{logstore='CONSUMER_GROUP', shardId=32, shardStatus='CONSUMER_GROUP', endCursor='null'}" + "'", str6, "LogstoreShardMeta{logstore='CONSUMER_GROUP', shardId=32, shardStatus='CONSUMER_GROUP', endCursor='null'}");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.aliyun.openservices.log.flink.data.RawLogGroup rawLogGroup0 = new com.aliyun.openservices.log.flink.data.RawLogGroup();
        java.util.List<com.aliyun.openservices.log.flink.data.RawLog> rawLogList1 = rawLogGroup0.getLogs();
        java.util.List<com.aliyun.openservices.log.flink.data.RawLog> rawLogList2 = rawLogGroup0.getLogs();
        java.lang.String str3 = rawLogGroup0.getTopic();
        com.aliyun.openservices.log.flink.data.RawLogGroup rawLogGroup4 = new com.aliyun.openservices.log.flink.data.RawLogGroup();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        rawLogGroup4.setTags(strMap5);
        java.lang.String str7 = rawLogGroup4.getTopic();
        java.util.List<com.aliyun.openservices.log.flink.data.RawLog> rawLogList8 = rawLogGroup4.getLogs();
        rawLogGroup0.setLogs(rawLogList8);
        org.junit.Assert.assertNotNull(rawLogList1);
        org.junit.Assert.assertNotNull(rawLogList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(rawLogList8);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.IO_THREAD_NUM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "io.thread.num" + "'", str0, "io.thread.num");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.aliyun.openservices.log.flink.model.LogDeserializationSchema<java.util.Collection<com.aliyun.openservices.log.common.TagContent>> tagContentCollectionLogDeserializationSchema2 = null;
        java.util.Properties properties3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.FlinkLogConsumer<java.util.Collection<com.aliyun.openservices.log.common.TagContent>> tagContentCollectionFlinkLogConsumer4 = new com.aliyun.openservices.log.flink.FlinkLogConsumer<java.util.Collection<com.aliyun.openservices.log.common.TagContent>>("RawLog{time=0, contents={}, tags={}}", "CONSUMER_DEFAULT_POSITION", tagContentCollectionLogDeserializationSchema2, properties3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        java.util.concurrent.BlockingQueue<com.aliyun.openservices.log.flink.internal.ProducerEvent> producerEventQueue0 = null;
        com.aliyun.openservices.log.flink.util.LogClientProxy logClientProxy1 = null;
        java.util.concurrent.Semaphore semaphore4 = null;
        com.aliyun.openservices.log.flink.internal.ProducerWorker producerWorker5 = new com.aliyun.openservices.log.flink.internal.ProducerWorker(producerEventQueue0, logClientProxy1, "base.retry.backoff.time.ms", "CONSUMER_GROUP", semaphore4);
        producerWorker5.stop();
        producerWorker5.run();
        producerWorker5.stop();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        int int1 = producerConfig0.getBuckets();
        producerConfig0.setIoThreadNum((int) (byte) 10);
        producerConfig0.setLogstore("FETCH_DATA_INTERVAL_MILLIS");
        boolean boolean6 = producerConfig0.isAdjustShardHash();
        producerConfig0.setProducerQueueSize(1);
        producerConfig0.setAccessKeySecret("producer.adjust.shard.hash");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.LOG_ACCESSKEYID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "FETCH_DATA_INTERVAL_MILLIS" + "'", str0, "FETCH_DATA_INTERVAL_MILLIS");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.aliyun.openservices.log.flink.internal.ShardHashAdjuster shardHashAdjuster1 = new com.aliyun.openservices.log.flink.internal.ShardHashAdjuster((int) (short) 0);
        java.lang.String str3 = shardHashAdjuster1.adjust("logGroup.max.lines");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "16fa2bec000000000000000000000000" + "'", str3, "16fa2bec000000000000000000000000");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.aliyun.openservices.log.common.TagContent[] tagContentArray6 = new com.aliyun.openservices.log.common.TagContent[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.TagContent> tagContentList7 = new java.util.ArrayList<com.aliyun.openservices.log.common.TagContent>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.TagContent>) tagContentList7, tagContentArray6);
        com.aliyun.openservices.log.flink.internal.LogGroupKey logGroupKey9 = new com.aliyun.openservices.log.flink.internal.LogGroupKey("logGroup.max.size", "hi!", "", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList7);
        com.aliyun.openservices.log.common.LogItem[] logItemArray10 = new com.aliyun.openservices.log.common.LogItem[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogItem> logItemList11 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogItem>) logItemList11, logItemArray10);
        com.aliyun.openservices.log.flink.internal.LogGroupHolder logGroupHolder14 = new com.aliyun.openservices.log.flink.internal.LogGroupHolder("CONSUMER_GROUP", "base.retry.backoff.time.ms", "max.retry.backoff.time.ms", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList7, (java.util.List<com.aliyun.openservices.log.common.LogItem>) logItemList11, (int) (short) 100);
        java.lang.String str15 = logGroupHolder14.getSource();
        com.aliyun.openservices.log.flink.internal.ProducerEvent producerEvent16 = new com.aliyun.openservices.log.flink.internal.ProducerEvent(logGroupHolder14);
        java.lang.String str17 = logGroupHolder14.getTopic();
        java.util.List<com.aliyun.openservices.log.common.TagContent> tagContentList18 = logGroupHolder14.getTags();
        org.junit.Assert.assertNotNull(tagContentArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(logItemArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CONSUMER_GROUP" + "'", str15, "CONSUMER_GROUP");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "base.retry.backoff.time.ms" + "'", str17, "base.retry.backoff.time.ms");
        org.junit.Assert.assertNotNull(tagContentList18);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        org.apache.flink.streaming.api.functions.source.SourceFunction.SourceContext<org.apache.flink.api.common.typeinfo.TypeInformation<com.aliyun.openservices.log.flink.data.FastLogGroupList>> fastLogGroupListTypeInformationSourceContext0 = null;
        org.apache.flink.api.common.functions.RuntimeContext runtimeContext1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "0.1.32", "stop.time4", "producer.buckets", "RawLogGroup{source='null', topic='', tags={}, logs=[]}" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.regex.Pattern pattern10 = null;
        java.util.Properties properties11 = null;
        com.aliyun.openservices.log.flink.model.LogDeserializationSchema<org.apache.flink.api.common.typeinfo.TypeInformation<com.aliyun.openservices.log.flink.data.FastLogGroupList>> fastLogGroupListTypeInformationLogDeserializationSchema12 = null;
        com.aliyun.openservices.log.flink.util.LogClientProxy logClientProxy13 = null;
        com.aliyun.openservices.log.flink.model.CheckpointMode checkpointMode14 = com.aliyun.openservices.log.flink.model.CheckpointMode.DISABLED;
        com.aliyun.openservices.log.flink.model.DefaultShardAssigner defaultShardAssigner15 = new com.aliyun.openservices.log.flink.model.DefaultShardAssigner();
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta19 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        boolean boolean20 = logstoreShardMeta19.isReadWrite();
        int int22 = defaultShardAssigner15.assign(logstoreShardMeta19, 60);
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.model.LogDataFetcher<org.apache.flink.api.common.typeinfo.TypeInformation<com.aliyun.openservices.log.flink.data.FastLogGroupList>> fastLogGroupListTypeInformationLogDataFetcher23 = new com.aliyun.openservices.log.flink.model.LogDataFetcher<org.apache.flink.api.common.typeinfo.TypeInformation<com.aliyun.openservices.log.flink.data.FastLogGroupList>>(fastLogGroupListTypeInformationSourceContext0, runtimeContext1, "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}", (java.util.List<java.lang.String>) strList8, pattern10, properties11, fastLogGroupListTypeInformationLogDeserializationSchema12, logClientProxy13, checkpointMode14, (com.aliyun.openservices.log.flink.ShardAssigner) defaultShardAssigner15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + checkpointMode14 + "' != '" + com.aliyun.openservices.log.flink.model.CheckpointMode.DISABLED + "'", checkpointMode14.equals(com.aliyun.openservices.log.flink.model.CheckpointMode.DISABLED));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        int int1 = producerConfig0.getBuckets();
        producerConfig0.setAccessKeyId("CONSUMER_DEFAULT_POSITION");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.aliyun.openservices.log.flink.data.RawLog rawLog0 = new com.aliyun.openservices.log.flink.data.RawLog();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = rawLog0.getContents();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = rawLog0.getContents();
        java.lang.String str3 = rawLog0.toString();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = rawLog0.getContents();
        rawLog0.addContent("", "hi!$$stop.time");
        int int8 = rawLog0.getTime();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "RawLog{time=0, contents={}, tags={}}" + "'", str3, "RawLog{time=0, contents={}, tags={}}");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.aliyun.openservices.log.flink.model.DefaultShardAssigner defaultShardAssigner0 = new com.aliyun.openservices.log.flink.model.DefaultShardAssigner();
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta4 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        int int6 = defaultShardAssigner0.assign(logstoreShardMeta4, (int) (byte) 100);
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = defaultShardAssigner0.assign(logstoreShardMeta7, 60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        java.util.concurrent.BlockingQueue<com.aliyun.openservices.log.flink.internal.ProducerEvent> producerEventQueue0 = null;
        com.aliyun.openservices.log.flink.util.LogClientProxy logClientProxy1 = null;
        java.util.concurrent.Semaphore semaphore4 = null;
        com.aliyun.openservices.log.flink.internal.ProducerWorker producerWorker5 = new com.aliyun.openservices.log.flink.internal.ProducerWorker(producerEventQueue0, logClientProxy1, "direct.mode", "logGroup.max.size", semaphore4);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.aliyun.openservices.log.flink.util.Consts.LOG_BEGIN_CURSOR = "FETCH_DATA_INTERVAL_MILLIS";
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        com.aliyun.openservices.log.flink.model.DefaultShardAssigner defaultShardAssigner0 = new com.aliyun.openservices.log.flink.model.DefaultShardAssigner();
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta4 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        int int6 = defaultShardAssigner0.assign(logstoreShardMeta4, (int) (byte) 100);
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta10 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        boolean boolean11 = logstoreShardMeta10.isReadWrite();
        com.aliyun.openservices.log.flink.model.LogstoreShardState logstoreShardState13 = new com.aliyun.openservices.log.flink.model.LogstoreShardState(logstoreShardMeta10, "CONSUMER_GROUP");
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta14 = logstoreShardState13.getShardMeta();
        int int16 = defaultShardAssigner0.assign(logstoreShardMeta14, 4);
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta20 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        boolean boolean21 = logstoreShardMeta20.isReadWrite();
        java.lang.String str22 = logstoreShardMeta20.getLogstore();
        java.lang.String str23 = logstoreShardMeta20.toString();
        boolean boolean24 = logstoreShardMeta14.equals((java.lang.Object) str23);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(logstoreShardMeta14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CONSUMER_GROUP" + "'", str22, "CONSUMER_GROUP");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "LogstoreShardMeta{logstore='CONSUMER_GROUP', shardId=32, shardStatus='CONSUMER_GROUP', endCursor='null'}" + "'", str23, "LogstoreShardMeta{logstore='CONSUMER_GROUP', shardId=32, shardStatus='CONSUMER_GROUP', endCursor='null'}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.aliyun.openservices.log.flink.model.DefaultShardAssigner defaultShardAssigner0 = new com.aliyun.openservices.log.flink.model.DefaultShardAssigner();
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta4 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        int int6 = defaultShardAssigner0.assign(logstoreShardMeta4, (int) (byte) 100);
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta10 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        boolean boolean11 = logstoreShardMeta10.isReadWrite();
        com.aliyun.openservices.log.flink.model.LogstoreShardState logstoreShardState13 = new com.aliyun.openservices.log.flink.model.LogstoreShardState(logstoreShardMeta10, "CONSUMER_GROUP");
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta14 = logstoreShardState13.getShardMeta();
        int int16 = defaultShardAssigner0.assign(logstoreShardMeta14, 4);
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta20 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        logstoreShardMeta20.setEndCursor("base.retry.backoff.time.ms");
        logstoreShardMeta20.setShardStatus("direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT");
        boolean boolean25 = logstoreShardMeta20.isReadOnly();
        boolean boolean26 = logstoreShardMeta20.isReadOnly();
        java.lang.String str27 = logstoreShardMeta20.getEndCursor();
        // The following exception was thrown during execution in test generation
        try {
            int int29 = defaultShardAssigner0.assign(logstoreShardMeta20, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(logstoreShardMeta14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "base.retry.backoff.time.ms" + "'", str27, "base.retry.backoff.time.ms");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        java.util.Properties properties0 = null;
        com.aliyun.openservices.log.flink.internal.ConfigParser configParser1 = new com.aliyun.openservices.log.flink.internal.ConfigParser(properties0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = configParser1.getInt("ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}", 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.aliyun.openservices.log.common.TagContent[] tagContentArray6 = new com.aliyun.openservices.log.common.TagContent[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.TagContent> tagContentList7 = new java.util.ArrayList<com.aliyun.openservices.log.common.TagContent>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.TagContent>) tagContentList7, tagContentArray6);
        com.aliyun.openservices.log.flink.internal.LogGroupKey logGroupKey9 = new com.aliyun.openservices.log.flink.internal.LogGroupKey("logGroup.max.size", "hi!", "", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList7);
        com.aliyun.openservices.log.common.LogItem[] logItemArray10 = new com.aliyun.openservices.log.common.LogItem[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogItem> logItemList11 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogItem>) logItemList11, logItemArray10);
        com.aliyun.openservices.log.flink.internal.LogGroupHolder logGroupHolder14 = new com.aliyun.openservices.log.flink.internal.LogGroupHolder("CONSUMER_GROUP", "base.retry.backoff.time.ms", "max.retry.backoff.time.ms", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList7, (java.util.List<com.aliyun.openservices.log.common.LogItem>) logItemList11, (int) (short) 100);
        java.lang.String str15 = logGroupHolder14.getSource();
        int int16 = logGroupHolder14.getSizeInBytes();
        org.junit.Assert.assertNotNull(tagContentArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(logItemArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CONSUMER_GROUP" + "'", str15, "CONSUMER_GROUP");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        int int1 = producerConfig0.getBuckets();
        producerConfig0.setIoThreadNum((int) (byte) 10);
        int int4 = producerConfig0.getTotalSizeInBytes();
        producerConfig0.setAccessKeyId("producer.queue.size");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        com.aliyun.openservices.log.common.LogGroupData[] logGroupDataArray0 = new com.aliyun.openservices.log.common.LogGroupData[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData> logGroupDataList1 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList1, logGroupDataArray0);
        com.aliyun.openservices.log.flink.model.PullLogsResult pullLogsResult6 = new com.aliyun.openservices.log.flink.model.PullLogsResult((java.util.List<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList1, (-1), "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT", "direct.mode");
        java.lang.String str7 = pullLogsResult6.getNextCursor();
        pullLogsResult6.setNextCursor("FETCH_DATA_INTERVAL_MILLIS");
        com.aliyun.openservices.log.common.LogGroupData[] logGroupDataArray10 = new com.aliyun.openservices.log.common.LogGroupData[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData> logGroupDataList11 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList11, logGroupDataArray10);
        com.aliyun.openservices.log.flink.model.PullLogsResult pullLogsResult16 = new com.aliyun.openservices.log.flink.model.PullLogsResult((java.util.List<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList11, (-1), "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT", "direct.mode");
        com.aliyun.openservices.log.flink.model.PullLogsResult pullLogsResult20 = new com.aliyun.openservices.log.flink.model.PullLogsResult((java.util.List<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList11, (int) ' ', "RawLog{time=0, contents={}, tags={}}", "FETCH_DATA_INTERVAL_MILLIS");
        pullLogsResult6.setLogGroupList((java.util.List<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList11);
        org.junit.Assert.assertNotNull(logGroupDataArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "direct.mode" + "'", str7, "direct.mode");
        org.junit.Assert.assertNotNull(logGroupDataArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_PROJECT = "hi!";
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.aliyun.openservices.log.common.LogGroupData[] logGroupDataArray0 = new com.aliyun.openservices.log.common.LogGroupData[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData> logGroupDataList1 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList1, logGroupDataArray0);
        com.aliyun.openservices.log.flink.model.PullLogsResult pullLogsResult6 = new com.aliyun.openservices.log.flink.model.PullLogsResult((java.util.List<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList1, (int) (byte) 100, "USER_AGENT", "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT");
        org.junit.Assert.assertNotNull(logGroupDataArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        java.util.Properties properties0 = null;
        com.aliyun.openservices.log.flink.internal.ConfigParser configParser1 = new com.aliyun.openservices.log.flink.internal.ConfigParser(properties0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = configParser1.getLong("direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT", (long) 8388608);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.aliyun.openservices.log.flink.data.RawLogGroupList rawLogGroupList0 = new com.aliyun.openservices.log.flink.data.RawLogGroupList();
        java.util.List<com.aliyun.openservices.log.flink.data.RawLogGroup> rawLogGroupList1 = rawLogGroupList0.getRawLogGroups();
        java.util.List<com.aliyun.openservices.log.flink.data.RawLogGroup> rawLogGroupList2 = rawLogGroupList0.getRawLogGroups();
        com.aliyun.openservices.log.flink.data.RawLogGroupList rawLogGroupList3 = new com.aliyun.openservices.log.flink.data.RawLogGroupList();
        java.util.List<com.aliyun.openservices.log.flink.data.RawLogGroup> rawLogGroupList4 = rawLogGroupList3.getRawLogGroups();
        java.util.List<com.aliyun.openservices.log.flink.data.RawLogGroup> rawLogGroupList5 = rawLogGroupList3.getRawLogGroups();
        rawLogGroupList0.setRawLogGroups(rawLogGroupList5);
        org.junit.Assert.assertNotNull(rawLogGroupList1);
        org.junit.Assert.assertNotNull(rawLogGroupList2);
        org.junit.Assert.assertNotNull(rawLogGroupList4);
        org.junit.Assert.assertNotNull(rawLogGroupList5);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        com.aliyun.openservices.log.common.TagContent[] tagContentArray3 = new com.aliyun.openservices.log.common.TagContent[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.TagContent> tagContentList4 = new java.util.ArrayList<com.aliyun.openservices.log.common.TagContent>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.TagContent>) tagContentList4, tagContentArray3);
        com.aliyun.openservices.log.flink.internal.LogGroupKey logGroupKey6 = new com.aliyun.openservices.log.flink.internal.LogGroupKey("direct.mode", "FETCH_DATA_INTERVAL_MILLIS", "USER_AGENT", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList4);
        java.lang.String str7 = logGroupKey6.getKey();
        java.lang.String str8 = logGroupKey6.getKey();
        org.junit.Assert.assertNotNull(tagContentArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT" + "'", str7, "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT" + "'", str8, "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.aliyun.openservices.log.flink.util.Consts.DEFAULT_COMMIT_INTERVAL_MILLIS = 64;
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        java.lang.String[] strArray25 = new java.lang.String[] { "io.thread.num", "hi!$$stop.time", "producer.queue.size", "io.thread.num", "RawLogGroup{source='producer.buckets', topic='', tags={}, logs=[]}", "logGroup.max.size", "LogstoreShardState{shardMeta=LogstoreShardMeta{logstore='CONSUMER_GROUP', shardId=32, shardStatus='CONSUMER_GROUP', endCursor='null'}, offset='CONSUMER_GROUP'}", "LogstoreShardMeta{logstore='CONSUMER_GROUP', shardId=32, shardStatus='CONSUMER_GROUP', endCursor='null'}", "max.retries.for.retryable.error", "stop.time4", "hi!$$stop.time", "ENDPOINT", "FETCH_DATA_INTERVAL_MILLIS", "RawLogGroup{source='null', topic='', tags={}, logs=[]}", "logGroup.max.size", "LogstoreShardState{shardMeta=LogstoreShardMeta{logstore='CONSUMER_GROUP', shardId=32, shardStatus='CONSUMER_GROUP', endCursor='null'}, offset='CONSUMER_GROUP'}", "max.retries", "producer.buckets", "LogstoreShardState{shardMeta=LogstoreShardMeta{logstore='CONSUMER_GROUP', shardId=32, shardStatus='CONSUMER_GROUP', endCursor='null'}, offset='CONSUMER_GROUP'}", "producer.adjust.shard.hash", "CONSUMER_GROUP", "CONSUMER_GROUP", "CONSUMER_GROUP", "max.retries.for.retryable.error" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        com.aliyun.openservices.log.flink.model.LogDeserializationSchema<java.util.List<com.aliyun.openservices.log.common.TagContent>> tagContentListLogDeserializationSchema28 = null;
        java.util.Properties properties29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.FlinkLogConsumer<java.util.List<com.aliyun.openservices.log.common.TagContent>> tagContentListFlinkLogConsumer30 = new com.aliyun.openservices.log.flink.FlinkLogConsumer<java.util.List<com.aliyun.openservices.log.common.TagContent>>("ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}", (java.util.List<java.lang.String>) strList26, tagContentListLogDeserializationSchema28, properties29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder0 = com.aliyun.openservices.log.flink.util.RetryPolicy.builder();
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder2 = retryPolicyBuilder0.baseRetryBackoff(5000L);
        com.aliyun.openservices.log.flink.util.RetryPolicy retryPolicy3 = retryPolicyBuilder0.build();
        org.junit.Assert.assertNotNull(retryPolicyBuilder0);
        org.junit.Assert.assertNotNull(retryPolicyBuilder2);
        org.junit.Assert.assertNotNull(retryPolicy3);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.model.CheckpointMode checkpointMode1 = com.aliyun.openservices.log.flink.model.CheckpointMode.fromString("ENDPOINT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal checkpoint mode: ENDPOINT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.aliyun.openservices.log.flink.data.RawLogGroup rawLogGroup0 = new com.aliyun.openservices.log.flink.data.RawLogGroup();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        rawLogGroup0.setTags(strMap1);
        com.aliyun.openservices.log.flink.data.RawLog rawLog3 = new com.aliyun.openservices.log.flink.data.RawLog();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = rawLog3.getContents();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = rawLog3.getContents();
        rawLogGroup0.addLog(rawLog3);
        java.lang.String str7 = rawLogGroup0.getTopic();
        java.lang.String str8 = rawLogGroup0.toString();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RawLogGroup{source='null', topic='', tags=null, logs=[,RawLog{time=0, contents={}, tags=null}]}" + "'", str8, "RawLogGroup{source='null', topic='', tags=null, logs=[,RawLog{time=0, contents={}, tags=null}]}");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        producerConfig0.setEndpoint("hi!");
        int int3 = producerConfig0.getProducerQueueSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.aliyun.openservices.log.flink.model.DefaultShardAssigner defaultShardAssigner0 = new com.aliyun.openservices.log.flink.model.DefaultShardAssigner();
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta4 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        boolean boolean5 = logstoreShardMeta4.isReadWrite();
        int int7 = defaultShardAssigner0.assign(logstoreShardMeta4, 60);
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta11 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        int int13 = defaultShardAssigner0.assign(logstoreShardMeta11, (int) (byte) 1);
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta17 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        logstoreShardMeta17.setEndCursor("base.retry.backoff.time.ms");
        int int21 = defaultShardAssigner0.assign(logstoreShardMeta17, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        int int1 = producerConfig0.getBuckets();
        java.lang.String str2 = producerConfig0.toString();
        long long3 = producerConfig0.getFlushInterval();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}" + "'", str2, "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_ACCESSKEYID = "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}";
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.aliyun.openservices.log.flink.internal.LogGroupHolder logGroupHolder0 = null;
        com.aliyun.openservices.log.flink.internal.ProducerEvent producerEvent1 = new com.aliyun.openservices.log.flink.internal.ProducerEvent(logGroupHolder0);
        boolean boolean2 = producerEvent1.isPoisonPill();
        com.aliyun.openservices.log.common.TagContent[] tagContentArray9 = new com.aliyun.openservices.log.common.TagContent[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.TagContent> tagContentList10 = new java.util.ArrayList<com.aliyun.openservices.log.common.TagContent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.TagContent>) tagContentList10, tagContentArray9);
        com.aliyun.openservices.log.flink.internal.LogGroupKey logGroupKey12 = new com.aliyun.openservices.log.flink.internal.LogGroupKey("logGroup.max.size", "hi!", "", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList10);
        com.aliyun.openservices.log.common.LogItem[] logItemArray13 = new com.aliyun.openservices.log.common.LogItem[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogItem> logItemList14 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogItem>) logItemList14, logItemArray13);
        com.aliyun.openservices.log.flink.internal.LogGroupHolder logGroupHolder17 = new com.aliyun.openservices.log.flink.internal.LogGroupHolder("CONSUMER_GROUP", "base.retry.backoff.time.ms", "max.retry.backoff.time.ms", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList10, (java.util.List<com.aliyun.openservices.log.common.LogItem>) logItemList14, (int) (short) 100);
        java.util.List<com.aliyun.openservices.log.common.TagContent> tagContentList18 = logGroupHolder17.getTags();
        producerEvent1.setLogGroup(logGroupHolder17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tagContentArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(logItemArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tagContentList18);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        java.lang.String str1 = producerConfig0.toString();
        int int2 = producerConfig0.getIoThreadNum();
        java.lang.String str3 = producerConfig0.getProject();
        java.lang.String str4 = producerConfig0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}" + "'", str1, "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}" + "'", str4, "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        java.lang.String str3 = com.aliyun.openservices.log.flink.internal.ShardHashAdjuster.padStart("direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT", 64, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT" + "'", str3, "444444444444444direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder0 = com.aliyun.openservices.log.flink.util.RetryPolicy.builder();
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder2 = retryPolicyBuilder0.maxRetries(100);
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder4 = retryPolicyBuilder0.maxRetriesForRetryableError((int) (short) 1);
        com.aliyun.openservices.log.flink.util.RetryPolicy retryPolicy5 = retryPolicyBuilder4.build();
        org.junit.Assert.assertNotNull(retryPolicyBuilder0);
        org.junit.Assert.assertNotNull(retryPolicyBuilder2);
        org.junit.Assert.assertNotNull(retryPolicyBuilder4);
        org.junit.Assert.assertNotNull(retryPolicy5);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        com.aliyun.openservices.log.flink.data.FastLogGroupDeserializer fastLogGroupDeserializer0 = new com.aliyun.openservices.log.flink.data.FastLogGroupDeserializer();
        org.apache.flink.api.common.typeinfo.TypeInformation<com.aliyun.openservices.log.flink.data.FastLogGroupList> fastLogGroupListTypeInformation1 = fastLogGroupDeserializer0.getProducedType();
        org.apache.flink.api.common.typeinfo.TypeInformation<com.aliyun.openservices.log.flink.data.FastLogGroupList> fastLogGroupListTypeInformation2 = fastLogGroupDeserializer0.getProducedType();
        com.aliyun.openservices.log.common.LogGroupData[] logGroupDataArray3 = new com.aliyun.openservices.log.common.LogGroupData[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData> logGroupDataList4 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList4, logGroupDataArray3);
        com.aliyun.openservices.log.flink.model.PullLogsResult pullLogsResult9 = new com.aliyun.openservices.log.flink.model.PullLogsResult((java.util.List<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList4, (-1), "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT", "direct.mode");
        int int10 = pullLogsResult9.getShard();
        com.aliyun.openservices.log.flink.data.FastLogGroupList fastLogGroupList11 = fastLogGroupDeserializer0.deserialize(pullLogsResult9);
        org.junit.Assert.assertNotNull(fastLogGroupListTypeInformation1);
        org.junit.Assert.assertNotNull(fastLogGroupListTypeInformation2);
        org.junit.Assert.assertNotNull(logGroupDataArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fastLogGroupList11);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_FETCH_DATA_INTERVAL_MILLIS = "logGroup.max.size";
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_PROJECT = "stop.time4";
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        int int1 = producerConfig0.getBuckets();
        producerConfig0.setIoThreadNum((int) (byte) 10);
        int int4 = producerConfig0.getTotalSizeInBytes();
        producerConfig0.setTotalSizeInBytes((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        com.aliyun.openservices.log.common.TagContent[] tagContentArray6 = new com.aliyun.openservices.log.common.TagContent[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.TagContent> tagContentList7 = new java.util.ArrayList<com.aliyun.openservices.log.common.TagContent>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.TagContent>) tagContentList7, tagContentArray6);
        com.aliyun.openservices.log.flink.internal.LogGroupKey logGroupKey9 = new com.aliyun.openservices.log.flink.internal.LogGroupKey("logGroup.max.size", "hi!", "", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList7);
        com.aliyun.openservices.log.common.LogItem[] logItemArray10 = new com.aliyun.openservices.log.common.LogItem[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogItem> logItemList11 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogItem>) logItemList11, logItemArray10);
        com.aliyun.openservices.log.flink.internal.LogGroupHolder logGroupHolder14 = new com.aliyun.openservices.log.flink.internal.LogGroupHolder("CONSUMER_GROUP", "base.retry.backoff.time.ms", "max.retry.backoff.time.ms", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList7, (java.util.List<com.aliyun.openservices.log.common.LogItem>) logItemList11, (int) (short) 100);
        java.lang.String str15 = logGroupHolder14.getSource();
        com.aliyun.openservices.log.flink.internal.ProducerEvent producerEvent16 = new com.aliyun.openservices.log.flink.internal.ProducerEvent(logGroupHolder14);
        int int17 = logGroupHolder14.getSizeInBytes();
        java.util.List<com.aliyun.openservices.log.common.TagContent> tagContentList18 = logGroupHolder14.getTags();
        java.util.List<com.aliyun.openservices.log.common.TagContent> tagContentList19 = logGroupHolder14.getTags();
        java.lang.String str20 = logGroupHolder14.getTopic();
        org.junit.Assert.assertNotNull(tagContentArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(logItemArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CONSUMER_GROUP" + "'", str15, "CONSUMER_GROUP");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(tagContentList18);
        org.junit.Assert.assertNotNull(tagContentList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "base.retry.backoff.time.ms" + "'", str20, "base.retry.backoff.time.ms");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        java.lang.String str1 = producerConfig0.toString();
        java.lang.String str2 = producerConfig0.toString();
        producerConfig0.setFlushInterval(3000L);
        java.lang.String str5 = producerConfig0.getAccessKeyId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}" + "'", str1, "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}" + "'", str2, "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        producerConfig0.setEndpoint("hi!");
        int int3 = producerConfig0.getLogGroupSize();
        // The following exception was thrown during execution in test generation
        try {
            producerConfig0.setFlushInterval((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: flushInterval must be > 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_FETCH_DATA_INTERVAL_MILLIS = "io.thread.num";
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder0 = com.aliyun.openservices.log.flink.util.RetryPolicy.builder();
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder2 = retryPolicyBuilder0.maxRetries(4096);
        org.junit.Assert.assertNotNull(retryPolicyBuilder0);
        org.junit.Assert.assertNotNull(retryPolicyBuilder2);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        long long0 = com.aliyun.openservices.log.flink.util.Consts.DEFAULT_SHARDS_DISCOVERY_INTERVAL_MILLIS;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 60000L + "'", long0 == 60000L);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        com.aliyun.openservices.log.common.TagContent[] tagContentArray9 = new com.aliyun.openservices.log.common.TagContent[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.TagContent> tagContentList10 = new java.util.ArrayList<com.aliyun.openservices.log.common.TagContent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.TagContent>) tagContentList10, tagContentArray9);
        com.aliyun.openservices.log.flink.internal.LogGroupKey logGroupKey12 = new com.aliyun.openservices.log.flink.internal.LogGroupKey("logGroup.max.size", "hi!", "", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList10);
        com.aliyun.openservices.log.common.TagContent[] tagContentArray19 = new com.aliyun.openservices.log.common.TagContent[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.TagContent> tagContentList20 = new java.util.ArrayList<com.aliyun.openservices.log.common.TagContent>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.TagContent>) tagContentList20, tagContentArray19);
        com.aliyun.openservices.log.flink.internal.LogGroupKey logGroupKey22 = new com.aliyun.openservices.log.flink.internal.LogGroupKey("logGroup.max.size", "hi!", "", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList20);
        com.aliyun.openservices.log.common.LogItem[] logItemArray23 = new com.aliyun.openservices.log.common.LogItem[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogItem> logItemList24 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogItem>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogItem>) logItemList24, logItemArray23);
        com.aliyun.openservices.log.flink.internal.LogGroupHolder logGroupHolder27 = new com.aliyun.openservices.log.flink.internal.LogGroupHolder("CONSUMER_GROUP", "base.retry.backoff.time.ms", "max.retry.backoff.time.ms", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList20, (java.util.List<com.aliyun.openservices.log.common.LogItem>) logItemList24, (int) (short) 100);
        com.aliyun.openservices.log.flink.internal.LogGroupHolder logGroupHolder29 = new com.aliyun.openservices.log.flink.internal.LogGroupHolder("logGroup.max.lines", "direct.mode", "RawLog{time=0, contents={}, tags={}}", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList10, (java.util.List<com.aliyun.openservices.log.common.LogItem>) logItemList24, (int) (short) 0);
        com.aliyun.openservices.log.common.TagContent[] tagContentArray36 = new com.aliyun.openservices.log.common.TagContent[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.TagContent> tagContentList37 = new java.util.ArrayList<com.aliyun.openservices.log.common.TagContent>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.TagContent>) tagContentList37, tagContentArray36);
        com.aliyun.openservices.log.flink.internal.LogGroupKey logGroupKey39 = new com.aliyun.openservices.log.flink.internal.LogGroupKey("logGroup.max.size", "hi!", "", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList37);
        com.aliyun.openservices.log.common.LogItem[] logItemArray40 = new com.aliyun.openservices.log.common.LogItem[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogItem> logItemList41 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogItem>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogItem>) logItemList41, logItemArray40);
        com.aliyun.openservices.log.flink.internal.LogGroupHolder logGroupHolder44 = new com.aliyun.openservices.log.flink.internal.LogGroupHolder("CONSUMER_GROUP", "base.retry.backoff.time.ms", "max.retry.backoff.time.ms", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList37, (java.util.List<com.aliyun.openservices.log.common.LogItem>) logItemList41, (int) (short) 100);
        java.lang.String str45 = logGroupHolder44.getSource();
        java.util.List<com.aliyun.openservices.log.common.LogItem> logItemList46 = logGroupHolder44.getLogs();
        com.aliyun.openservices.log.flink.internal.LogGroupHolder logGroupHolder48 = new com.aliyun.openservices.log.flink.internal.LogGroupHolder("producer.queue.size", "RawLog{time=0, contents={}, tags={}}", "ENDPOINT", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList10, logItemList46, (int) (byte) 100);
        org.junit.Assert.assertNotNull(tagContentArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tagContentArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(logItemArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(tagContentArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(logItemArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "CONSUMER_GROUP" + "'", str45, "CONSUMER_GROUP");
        org.junit.Assert.assertNotNull(logItemList46);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        com.aliyun.openservices.log.common.TagContent[] tagContentArray6 = new com.aliyun.openservices.log.common.TagContent[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.TagContent> tagContentList7 = new java.util.ArrayList<com.aliyun.openservices.log.common.TagContent>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.TagContent>) tagContentList7, tagContentArray6);
        com.aliyun.openservices.log.flink.internal.LogGroupKey logGroupKey9 = new com.aliyun.openservices.log.flink.internal.LogGroupKey("logGroup.max.size", "hi!", "", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList7);
        com.aliyun.openservices.log.common.LogItem[] logItemArray10 = new com.aliyun.openservices.log.common.LogItem[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogItem> logItemList11 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogItem>) logItemList11, logItemArray10);
        com.aliyun.openservices.log.flink.internal.LogGroupHolder logGroupHolder14 = new com.aliyun.openservices.log.flink.internal.LogGroupHolder("CONSUMER_GROUP", "base.retry.backoff.time.ms", "max.retry.backoff.time.ms", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList7, (java.util.List<com.aliyun.openservices.log.common.LogItem>) logItemList11, (int) (short) 100);
        java.lang.String str15 = logGroupHolder14.getSource();
        com.aliyun.openservices.log.flink.internal.ProducerEvent producerEvent16 = new com.aliyun.openservices.log.flink.internal.ProducerEvent(logGroupHolder14);
        java.lang.String str17 = logGroupHolder14.getTopic();
        int int18 = logGroupHolder14.getSizeInBytes();
        java.lang.String str19 = logGroupHolder14.getSource();
        org.junit.Assert.assertNotNull(tagContentArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(logItemArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CONSUMER_GROUP" + "'", str15, "CONSUMER_GROUP");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "base.retry.backoff.time.ms" + "'", str17, "base.retry.backoff.time.ms");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CONSUMER_GROUP" + "'", str19, "CONSUMER_GROUP");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        com.aliyun.openservices.log.flink.data.RawLog rawLog0 = new com.aliyun.openservices.log.flink.data.RawLog();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = rawLog0.getContents();
        rawLog0.addTags("RawLog{time=0, contents={}, tags={}}", "logGroup.max.lines");
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        java.util.concurrent.BlockingQueue<com.aliyun.openservices.log.flink.internal.ProducerEvent> producerEventQueue0 = null;
        com.aliyun.openservices.log.flink.util.LogClientProxy logClientProxy1 = null;
        java.util.concurrent.Semaphore semaphore4 = null;
        com.aliyun.openservices.log.flink.internal.ProducerWorker producerWorker5 = new com.aliyun.openservices.log.flink.internal.ProducerWorker(producerEventQueue0, logClientProxy1, "logGroup.max.size", "logGroup.max.lines", semaphore4);
        producerWorker5.stop();
        producerWorker5.run();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.TOTAL_SIZE_IN_BYTES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "total.size.in.bytes" + "'", str0, "total.size.in.bytes");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        java.lang.String str1 = producerConfig0.toString();
        java.lang.String str2 = producerConfig0.toString();
        producerConfig0.setProducerQueueSize(40960);
        int int5 = producerConfig0.getIoThreadNum();
        producerConfig0.setAccessKeyId("stop.time");
        java.lang.String str8 = producerConfig0.getEndpoint();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}" + "'", str1, "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}" + "'", str2, "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        com.aliyun.openservices.log.flink.data.FastLogGroupList fastLogGroupList1 = new com.aliyun.openservices.log.flink.data.FastLogGroupList((int) (short) 100);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        com.aliyun.openservices.log.flink.util.Consts.DEFAULT_FETCH_INTERVAL_MILLIS = 8388608;
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        com.aliyun.openservices.log.flink.data.RawLogGroup rawLogGroup0 = new com.aliyun.openservices.log.flink.data.RawLogGroup();
        java.lang.String str1 = rawLogGroup0.toString();
        com.aliyun.openservices.log.flink.data.RawLog rawLog2 = new com.aliyun.openservices.log.flink.data.RawLog();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = rawLog2.getContents();
        int int4 = rawLog2.getTime();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = rawLog2.getTags();
        rawLogGroup0.setTags(strMap5);
        java.lang.String str7 = rawLogGroup0.getTopic();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RawLogGroup{source='null', topic='', tags={}, logs=[]}" + "'", str1, "RawLogGroup{source='null', topic='', tags={}, logs=[]}");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        java.lang.String str1 = producerConfig0.toString();
        java.lang.String str2 = producerConfig0.getProject();
        producerConfig0.setAccessKeySecret("hi!$$stop.time");
        java.lang.String str5 = producerConfig0.getEndpoint();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}" + "'", str1, "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta3 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        boolean boolean4 = logstoreShardMeta3.isReadWrite();
        com.aliyun.openservices.log.flink.model.LogstoreShardState logstoreShardState6 = new com.aliyun.openservices.log.flink.model.LogstoreShardState(logstoreShardMeta3, "CONSUMER_GROUP");
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta7 = logstoreShardState6.getShardMeta();
        java.lang.String str8 = logstoreShardMeta7.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(logstoreShardMeta7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LogstoreShardMeta{logstore='CONSUMER_GROUP', shardId=32, shardStatus='CONSUMER_GROUP', endCursor='null'}" + "'", str8, "LogstoreShardMeta{logstore='CONSUMER_GROUP', shardId=32, shardStatus='CONSUMER_GROUP', endCursor='null'}");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        com.aliyun.openservices.log.flink.data.FastLogGroupDeserializer fastLogGroupDeserializer0 = new com.aliyun.openservices.log.flink.data.FastLogGroupDeserializer();
        com.aliyun.openservices.log.common.LogGroupData[] logGroupDataArray1 = new com.aliyun.openservices.log.common.LogGroupData[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData> logGroupDataList2 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList2, logGroupDataArray1);
        com.aliyun.openservices.log.flink.model.PullLogsResult pullLogsResult7 = new com.aliyun.openservices.log.flink.model.PullLogsResult((java.util.List<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList2, (-1), "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT", "direct.mode");
        int int8 = pullLogsResult7.getShard();
        com.aliyun.openservices.log.flink.data.FastLogGroupList fastLogGroupList9 = fastLogGroupDeserializer0.deserialize(pullLogsResult7);
        java.lang.String str10 = pullLogsResult7.getNextCursor();
        java.lang.String str11 = pullLogsResult7.getNextCursor();
        int int12 = pullLogsResult7.getShard();
        org.junit.Assert.assertNotNull(logGroupDataArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fastLogGroupList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "direct.mode" + "'", str10, "direct.mode");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "direct.mode" + "'", str11, "direct.mode");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        com.aliyun.openservices.log.flink.util.Consts.READWRITE_SHARD_STATUS = "producer.adjust.shard.hash";
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta3 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        logstoreShardMeta3.setEndCursor("base.retry.backoff.time.ms");
        logstoreShardMeta3.setShardStatus("direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT");
        logstoreShardMeta3.setEndCursor("producer.buckets");
        logstoreShardMeta3.setLogstore("RawLogGroup{source='producer.buckets', topic='', tags={}, logs=[]}");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        com.aliyun.openservices.log.flink.model.DefaultShardAssigner defaultShardAssigner0 = new com.aliyun.openservices.log.flink.model.DefaultShardAssigner();
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta4 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        boolean boolean5 = logstoreShardMeta4.isReadWrite();
        int int7 = defaultShardAssigner0.assign(logstoreShardMeta4, 60);
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta11 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        int int13 = defaultShardAssigner0.assign(logstoreShardMeta11, (int) 'a');
        logstoreShardMeta11.setShardStatus("RawLogGroup{source='null', topic='', tags={}, logs=[]}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        java.util.Properties properties0 = null;
        com.aliyun.openservices.log.flink.internal.ConfigParser configParser1 = new com.aliyun.openservices.log.flink.internal.ConfigParser(properties0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = configParser1.getLong("FETCH_DATA_INTERVAL_MILLIS", (long) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        java.lang.String str1 = producerConfig0.toString();
        java.lang.String str2 = producerConfig0.getLogstore();
        java.lang.String str3 = producerConfig0.getLogstore();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}" + "'", str1, "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        java.lang.String str1 = producerConfig0.toString();
        java.lang.String str2 = producerConfig0.toString();
        producerConfig0.setProducerQueueSize(40960);
        int int5 = producerConfig0.getTotalSizeInBytes();
        java.lang.String str6 = producerConfig0.getAccessKeyId();
        java.lang.String str7 = producerConfig0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}" + "'", str1, "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}" + "'", str2, "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}" + "'", str7, "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        com.aliyun.openservices.log.common.TagContent[] tagContentArray6 = new com.aliyun.openservices.log.common.TagContent[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.TagContent> tagContentList7 = new java.util.ArrayList<com.aliyun.openservices.log.common.TagContent>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.TagContent>) tagContentList7, tagContentArray6);
        com.aliyun.openservices.log.flink.internal.LogGroupKey logGroupKey9 = new com.aliyun.openservices.log.flink.internal.LogGroupKey("logGroup.max.size", "hi!", "", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList7);
        com.aliyun.openservices.log.common.LogItem[] logItemArray10 = new com.aliyun.openservices.log.common.LogItem[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogItem> logItemList11 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogItem>) logItemList11, logItemArray10);
        com.aliyun.openservices.log.flink.internal.LogGroupHolder logGroupHolder14 = new com.aliyun.openservices.log.flink.internal.LogGroupHolder("CONSUMER_GROUP", "base.retry.backoff.time.ms", "max.retry.backoff.time.ms", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList7, (java.util.List<com.aliyun.openservices.log.common.LogItem>) logItemList11, (int) (short) 100);
        java.lang.String str15 = logGroupHolder14.getSource();
        com.aliyun.openservices.log.flink.internal.ProducerEvent producerEvent16 = new com.aliyun.openservices.log.flink.internal.ProducerEvent(logGroupHolder14);
        int int17 = logGroupHolder14.getSizeInBytes();
        int int18 = logGroupHolder14.getSizeInBytes();
        org.junit.Assert.assertNotNull(tagContentArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(logItemArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CONSUMER_GROUP" + "'", str15, "CONSUMER_GROUP");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        com.aliyun.openservices.log.flink.model.LogSerializationSchema<com.aliyun.openservices.log.flink.ShardAssigner> shardAssignerLogSerializationSchema0 = null;
        java.util.Properties properties1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.FlinkLogProducer<com.aliyun.openservices.log.flink.ShardAssigner> shardAssignerFlinkLogProducer2 = new com.aliyun.openservices.log.flink.FlinkLogProducer<com.aliyun.openservices.log.flink.ShardAssigner>(shardAssignerLogSerializationSchema0, properties1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: schema cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        com.aliyun.openservices.log.flink.data.RawLogGroup rawLogGroup0 = new com.aliyun.openservices.log.flink.data.RawLogGroup();
        java.lang.String str1 = rawLogGroup0.toString();
        com.aliyun.openservices.log.flink.data.RawLog rawLog2 = new com.aliyun.openservices.log.flink.data.RawLog();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = rawLog2.getContents();
        int int4 = rawLog2.getTime();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = rawLog2.getTags();
        rawLogGroup0.setTags(strMap5);
        java.lang.String str7 = rawLogGroup0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RawLogGroup{source='null', topic='', tags={}, logs=[]}" + "'", str1, "RawLogGroup{source='null', topic='', tags={}, logs=[]}");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RawLogGroup{source='null', topic='', tags={}, logs=[]}" + "'", str7, "RawLogGroup{source='null', topic='', tags={}, logs=[]}");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        java.lang.String str1 = producerConfig0.toString();
        java.lang.String str2 = producerConfig0.toString();
        producerConfig0.setProducerQueueSize(40960);
        int int5 = producerConfig0.getIoThreadNum();
        producerConfig0.setAccessKeySecret("FETCH_DATA_INTERVAL_MILLIS");
        producerConfig0.setAdjustShardHash(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}" + "'", str1, "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}" + "'", str2, "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder0 = com.aliyun.openservices.log.flink.util.RetryPolicy.builder();
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder2 = retryPolicyBuilder0.maxRetries(100);
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder4 = retryPolicyBuilder2.maxRetries((int) 'a');
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder6 = retryPolicyBuilder4.maxRetriesForRetryableError((int) (short) 0);
        org.junit.Assert.assertNotNull(retryPolicyBuilder0);
        org.junit.Assert.assertNotNull(retryPolicyBuilder2);
        org.junit.Assert.assertNotNull(retryPolicyBuilder4);
        org.junit.Assert.assertNotNull(retryPolicyBuilder6);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        com.aliyun.openservices.log.flink.data.FastLogGroupDeserializer fastLogGroupDeserializer0 = new com.aliyun.openservices.log.flink.data.FastLogGroupDeserializer();
        com.aliyun.openservices.log.common.LogGroupData[] logGroupDataArray1 = new com.aliyun.openservices.log.common.LogGroupData[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData> logGroupDataList2 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList2, logGroupDataArray1);
        com.aliyun.openservices.log.flink.model.PullLogsResult pullLogsResult7 = new com.aliyun.openservices.log.flink.model.PullLogsResult((java.util.List<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList2, (-1), "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT", "direct.mode");
        int int8 = pullLogsResult7.getShard();
        com.aliyun.openservices.log.flink.data.FastLogGroupList fastLogGroupList9 = fastLogGroupDeserializer0.deserialize(pullLogsResult7);
        com.aliyun.openservices.log.flink.data.FastLogGroupDeserializer fastLogGroupDeserializer10 = new com.aliyun.openservices.log.flink.data.FastLogGroupDeserializer();
        org.apache.flink.api.common.typeinfo.TypeInformation<com.aliyun.openservices.log.flink.data.FastLogGroupList> fastLogGroupListTypeInformation11 = fastLogGroupDeserializer10.getProducedType();
        org.apache.flink.api.common.typeinfo.TypeInformation<com.aliyun.openservices.log.flink.data.FastLogGroupList> fastLogGroupListTypeInformation12 = fastLogGroupDeserializer10.getProducedType();
        com.aliyun.openservices.log.common.LogGroupData[] logGroupDataArray13 = new com.aliyun.openservices.log.common.LogGroupData[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData> logGroupDataList14 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList14, logGroupDataArray13);
        com.aliyun.openservices.log.flink.model.PullLogsResult pullLogsResult19 = new com.aliyun.openservices.log.flink.model.PullLogsResult((java.util.List<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList14, (-1), "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT", "direct.mode");
        com.aliyun.openservices.log.flink.model.PullLogsResult pullLogsResult23 = new com.aliyun.openservices.log.flink.model.PullLogsResult((java.util.List<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList14, (int) ' ', "RawLog{time=0, contents={}, tags={}}", "FETCH_DATA_INTERVAL_MILLIS");
        com.aliyun.openservices.log.flink.data.FastLogGroupList fastLogGroupList24 = fastLogGroupDeserializer10.deserialize(pullLogsResult23);
        com.aliyun.openservices.log.flink.data.FastLogGroupList fastLogGroupList25 = fastLogGroupDeserializer0.deserialize(pullLogsResult23);
        com.aliyun.openservices.log.common.LogGroupData[] logGroupDataArray26 = new com.aliyun.openservices.log.common.LogGroupData[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData> logGroupDataList27 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList27, logGroupDataArray26);
        com.aliyun.openservices.log.flink.model.PullLogsResult pullLogsResult32 = new com.aliyun.openservices.log.flink.model.PullLogsResult((java.util.List<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList27, (-1), "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT", "direct.mode");
        com.aliyun.openservices.log.flink.model.PullLogsResult pullLogsResult36 = new com.aliyun.openservices.log.flink.model.PullLogsResult((java.util.List<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList27, (int) ' ', "RawLog{time=0, contents={}, tags={}}", "FETCH_DATA_INTERVAL_MILLIS");
        java.lang.String str37 = pullLogsResult36.getCursor();
        com.aliyun.openservices.log.flink.data.FastLogGroupList fastLogGroupList38 = fastLogGroupDeserializer0.deserialize(pullLogsResult36);
        org.junit.Assert.assertNotNull(logGroupDataArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fastLogGroupList9);
        org.junit.Assert.assertNotNull(fastLogGroupListTypeInformation11);
        org.junit.Assert.assertNotNull(fastLogGroupListTypeInformation12);
        org.junit.Assert.assertNotNull(logGroupDataArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(fastLogGroupList24);
        org.junit.Assert.assertNotNull(fastLogGroupList25);
        org.junit.Assert.assertNotNull(logGroupDataArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "RawLog{time=0, contents={}, tags={}}" + "'", str37, "RawLog{time=0, contents={}, tags={}}");
        org.junit.Assert.assertNotNull(fastLogGroupList38);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta3 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        com.aliyun.openservices.log.common.TagContent[] tagContentArray10 = new com.aliyun.openservices.log.common.TagContent[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.TagContent> tagContentList11 = new java.util.ArrayList<com.aliyun.openservices.log.common.TagContent>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.TagContent>) tagContentList11, tagContentArray10);
        com.aliyun.openservices.log.flink.internal.LogGroupKey logGroupKey13 = new com.aliyun.openservices.log.flink.internal.LogGroupKey("logGroup.max.size", "hi!", "", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList11);
        com.aliyun.openservices.log.common.LogItem[] logItemArray14 = new com.aliyun.openservices.log.common.LogItem[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogItem> logItemList15 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogItem>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogItem>) logItemList15, logItemArray14);
        com.aliyun.openservices.log.flink.internal.LogGroupHolder logGroupHolder18 = new com.aliyun.openservices.log.flink.internal.LogGroupHolder("CONSUMER_GROUP", "base.retry.backoff.time.ms", "max.retry.backoff.time.ms", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList11, (java.util.List<com.aliyun.openservices.log.common.LogItem>) logItemList15, (int) (short) 100);
        java.util.List<com.aliyun.openservices.log.common.TagContent> tagContentList19 = logGroupHolder18.getTags();
        boolean boolean20 = logstoreShardMeta3.equals((java.lang.Object) tagContentList19);
        com.aliyun.openservices.log.flink.model.LogstoreShardState logstoreShardState22 = new com.aliyun.openservices.log.flink.model.LogstoreShardState(logstoreShardMeta3, "RawLogGroup{source='null', topic='', tags={}, logs=[]}");
        com.aliyun.openservices.log.flink.model.LogstoreShardState logstoreShardState24 = new com.aliyun.openservices.log.flink.model.LogstoreShardState(logstoreShardMeta3, "total.size.in.bytes");
        org.junit.Assert.assertNotNull(tagContentArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(logItemArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tagContentList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        com.aliyun.openservices.log.flink.data.RawLogGroup rawLogGroup0 = new com.aliyun.openservices.log.flink.data.RawLogGroup();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        rawLogGroup0.setTags(strMap1);
        java.lang.String str3 = rawLogGroup0.getTopic();
        java.util.List<com.aliyun.openservices.log.flink.data.RawLog> rawLogList4 = rawLogGroup0.getLogs();
        java.lang.String str5 = rawLogGroup0.getSource();
        com.aliyun.openservices.log.flink.data.RawLogGroup rawLogGroup6 = new com.aliyun.openservices.log.flink.data.RawLogGroup();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        rawLogGroup6.setTags(strMap7);
        com.aliyun.openservices.log.flink.data.RawLog rawLog9 = new com.aliyun.openservices.log.flink.data.RawLog();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = rawLog9.getContents();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = rawLog9.getContents();
        rawLogGroup6.addLog(rawLog9);
        com.aliyun.openservices.log.flink.data.RawLog rawLog13 = new com.aliyun.openservices.log.flink.data.RawLog();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = rawLog13.getContents();
        rawLog9.setContents(strMap14);
        com.aliyun.openservices.log.flink.data.RawLogGroup rawLogGroup16 = new com.aliyun.openservices.log.flink.data.RawLogGroup();
        java.lang.String str17 = rawLogGroup16.toString();
        rawLogGroup16.addTag("direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT", "producer.buckets");
        com.aliyun.openservices.log.flink.data.RawLog rawLog21 = new com.aliyun.openservices.log.flink.data.RawLog();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = rawLog21.getContents();
        rawLogGroup16.setTags(strMap22);
        rawLog9.setContents(strMap22);
        rawLogGroup0.setTags(strMap22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(rawLogList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "RawLogGroup{source='null', topic='', tags={}, logs=[]}" + "'", str17, "RawLogGroup{source='null', topic='', tags={}, logs=[]}");
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        com.aliyun.openservices.log.flink.data.RawLogGroupList rawLogGroupList0 = new com.aliyun.openservices.log.flink.data.RawLogGroupList();
        java.util.List<com.aliyun.openservices.log.flink.data.RawLogGroup> rawLogGroupList1 = rawLogGroupList0.getRawLogGroups();
        com.aliyun.openservices.log.flink.data.RawLogGroup rawLogGroup2 = null;
        rawLogGroupList0.add(rawLogGroup2);
        com.aliyun.openservices.log.flink.data.RawLogGroup rawLogGroup4 = new com.aliyun.openservices.log.flink.data.RawLogGroup();
        rawLogGroupList0.add(rawLogGroup4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        rawLogGroup4.setTags(strMap6);
        org.junit.Assert.assertNotNull(rawLogGroupList1);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        com.aliyun.openservices.log.common.LogGroupData[] logGroupDataArray0 = new com.aliyun.openservices.log.common.LogGroupData[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData> logGroupDataList1 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList1, logGroupDataArray0);
        com.aliyun.openservices.log.flink.model.PullLogsResult pullLogsResult6 = new com.aliyun.openservices.log.flink.model.PullLogsResult((java.util.List<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList1, (-1), "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT", "direct.mode");
        java.lang.String str7 = pullLogsResult6.getNextCursor();
        pullLogsResult6.setNextCursor("FETCH_DATA_INTERVAL_MILLIS");
        pullLogsResult6.setShard((int) '#');
        pullLogsResult6.setShard((int) (short) -1);
        pullLogsResult6.setNextCursor("RawLogGroup{source='null', topic='', tags={}, logs=[]}");
        org.junit.Assert.assertNotNull(logGroupDataArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "direct.mode" + "'", str7, "direct.mode");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta3 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        boolean boolean4 = logstoreShardMeta3.isReadWrite();
        boolean boolean5 = logstoreShardMeta3.isReadWrite();
        java.lang.String str6 = logstoreShardMeta3.getEndCursor();
        boolean boolean8 = logstoreShardMeta3.equals((java.lang.Object) "CONSUMER_GROUP");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig9 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        producerConfig9.setEndpoint("hi!");
        boolean boolean12 = logstoreShardMeta3.equals((java.lang.Object) producerConfig9);
        int int13 = logstoreShardMeta3.getShardId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.data.FastLogGroupList fastLogGroupList1 = new com.aliyun.openservices.log.flink.data.FastLogGroupList((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        com.aliyun.openservices.log.common.TagContent[] tagContentArray9 = new com.aliyun.openservices.log.common.TagContent[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.TagContent> tagContentList10 = new java.util.ArrayList<com.aliyun.openservices.log.common.TagContent>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.TagContent>) tagContentList10, tagContentArray9);
        com.aliyun.openservices.log.flink.internal.LogGroupKey logGroupKey12 = new com.aliyun.openservices.log.flink.internal.LogGroupKey("logGroup.max.size", "hi!", "", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList10);
        com.aliyun.openservices.log.common.LogItem[] logItemArray13 = new com.aliyun.openservices.log.common.LogItem[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogItem> logItemList14 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogItem>) logItemList14, logItemArray13);
        com.aliyun.openservices.log.flink.internal.LogGroupHolder logGroupHolder17 = new com.aliyun.openservices.log.flink.internal.LogGroupHolder("CONSUMER_GROUP", "base.retry.backoff.time.ms", "max.retry.backoff.time.ms", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList10, (java.util.List<com.aliyun.openservices.log.common.LogItem>) logItemList14, (int) (short) 100);
        java.util.List<com.aliyun.openservices.log.common.TagContent> tagContentList18 = logGroupHolder17.getTags();
        com.aliyun.openservices.log.flink.internal.LogGroupKey logGroupKey19 = new com.aliyun.openservices.log.flink.internal.LogGroupKey("stop.time4", "io.thread.num", "LogstoreShardState{shardMeta=LogstoreShardMeta{logstore='CONSUMER_GROUP', shardId=32, shardStatus='CONSUMER_GROUP', endCursor='null'}, offset='CONSUMER_GROUP'}", tagContentList18);
        java.lang.String str20 = logGroupKey19.getKey();
        org.junit.Assert.assertNotNull(tagContentArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(logItemArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tagContentList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "stop.time4$io.thread.num$LogstoreShardState{shardMeta=LogstoreShardMeta{logstore='CONSUMER_GROUP', shardId=32, shardStatus='CONSUMER_GROUP', endCursor='null'}, offset='CONSUMER_GROUP'}" + "'", str20, "stop.time4$io.thread.num$LogstoreShardState{shardMeta=LogstoreShardMeta{logstore='CONSUMER_GROUP', shardId=32, shardStatus='CONSUMER_GROUP', endCursor='null'}, offset='CONSUMER_GROUP'}");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        java.lang.String str1 = producerConfig0.toString();
        int int2 = producerConfig0.getIoThreadNum();
        int int3 = producerConfig0.getTotalSizeInBytes();
        long long4 = producerConfig0.getFlushInterval();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}" + "'", str1, "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        com.aliyun.openservices.log.flink.model.LogSerializationSchema<com.aliyun.openservices.log.flink.model.CheckpointMode> checkpointModeLogSerializationSchema0 = null;
        java.util.Properties properties1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.FlinkLogProducer<com.aliyun.openservices.log.flink.model.CheckpointMode> checkpointModeFlinkLogProducer2 = new com.aliyun.openservices.log.flink.FlinkLogProducer<com.aliyun.openservices.log.flink.model.CheckpointMode>(checkpointModeLogSerializationSchema0, properties1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: schema cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_ENDPOINT = "";
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        com.aliyun.openservices.log.flink.data.RawLog rawLog0 = new com.aliyun.openservices.log.flink.data.RawLog();
        rawLog0.setTime(10);
        com.aliyun.openservices.log.flink.data.RawLog rawLog3 = new com.aliyun.openservices.log.flink.data.RawLog();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = rawLog3.getContents();
        rawLog0.setContents(strMap4);
        rawLog0.addTags("hi!", "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = rawLog0.getContents();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder0 = com.aliyun.openservices.log.flink.util.RetryPolicy.builder();
        com.aliyun.openservices.log.flink.util.RetryPolicy.RetryPolicyBuilder retryPolicyBuilder2 = retryPolicyBuilder0.baseRetryBackoff(5000L);
        com.aliyun.openservices.log.flink.util.RetryPolicy retryPolicy3 = retryPolicyBuilder2.build();
        int int4 = retryPolicy3.getMaxRetriesForRetryableError();
        org.junit.Assert.assertNotNull(retryPolicyBuilder0);
        org.junit.Assert.assertNotNull(retryPolicyBuilder2);
        org.junit.Assert.assertNotNull(retryPolicy3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        producerConfig0.setEndpoint("hi!");
        producerConfig0.setTotalSizeInBytes((int) ' ');
        producerConfig0.setProject("16fa2bec000000000000000000000000");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        com.aliyun.openservices.log.flink.data.RawLog rawLog0 = new com.aliyun.openservices.log.flink.data.RawLog();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = rawLog0.getContents();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = rawLog0.getContents();
        int int3 = rawLog0.getTime();
        rawLog0.addTags("max.retries", "FETCH_DATA_INTERVAL_MILLIS");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_CONSUMER_DEFAULT_POSITION = "producer.buckets";
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        org.apache.flink.streaming.api.functions.source.SourceFunction.SourceContext<com.aliyun.openservices.log.flink.internal.ProducerConfig> producerConfigSourceContext0 = null;
        org.apache.flink.api.common.functions.RuntimeContext runtimeContext1 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "LogstoreShardState{shardMeta=LogstoreShardMeta{logstore='CONSUMER_GROUP', shardId=32, shardStatus='CONSUMER_GROUP', endCursor='null'}, offset='CONSUMER_GROUP'}", "base.retry.backoff.time.ms", "hi!", "ENDPOINT", "RawLogGroup{source='null', topic='', tags=null, logs=[,RawLog{time=0, contents={}, tags=null}]}", "16fa2bec000000000000000000000000", "", "producer.adjust.shard.hash", "hi!$$stop.time", "producer.queue.size", "producer.buckets", "max.retry.backoff.time.ms", "hi!", "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT", "16fa2bec000000000000000000000000", "io.thread.num" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.regex.Pattern pattern22 = null;
        java.util.Properties properties23 = null;
        com.aliyun.openservices.log.flink.model.LogDeserializationSchema<com.aliyun.openservices.log.flink.internal.ProducerConfig> producerConfigLogDeserializationSchema24 = null;
        com.aliyun.openservices.log.flink.util.LogClientProxy logClientProxy25 = null;
        com.aliyun.openservices.log.flink.model.CheckpointMode checkpointMode26 = com.aliyun.openservices.log.flink.model.CheckpointMode.PERIODIC;
        com.aliyun.openservices.log.flink.model.DefaultShardAssigner defaultShardAssigner27 = new com.aliyun.openservices.log.flink.model.DefaultShardAssigner();
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta31 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        boolean boolean32 = logstoreShardMeta31.isReadWrite();
        int int34 = defaultShardAssigner27.assign(logstoreShardMeta31, 60);
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.model.LogDataFetcher<com.aliyun.openservices.log.flink.internal.ProducerConfig> producerConfigLogDataFetcher35 = new com.aliyun.openservices.log.flink.model.LogDataFetcher<com.aliyun.openservices.log.flink.internal.ProducerConfig>(producerConfigSourceContext0, runtimeContext1, "producer.queue.size", (java.util.List<java.lang.String>) strList20, pattern22, properties23, producerConfigLogDeserializationSchema24, logClientProxy25, checkpointMode26, (com.aliyun.openservices.log.flink.ShardAssigner) defaultShardAssigner27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + checkpointMode26 + "' != '" + com.aliyun.openservices.log.flink.model.CheckpointMode.PERIODIC + "'", checkpointMode26.equals(com.aliyun.openservices.log.flink.model.CheckpointMode.PERIODIC));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        com.aliyun.openservices.log.flink.model.DefaultShardAssigner defaultShardAssigner0 = new com.aliyun.openservices.log.flink.model.DefaultShardAssigner();
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta4 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        int int6 = defaultShardAssigner0.assign(logstoreShardMeta4, (int) (byte) 100);
        com.aliyun.openservices.log.flink.model.LogstoreShardState logstoreShardState8 = new com.aliyun.openservices.log.flink.model.LogstoreShardState(logstoreShardMeta4, "ENDPOINT");
        java.lang.String str9 = logstoreShardState8.toString();
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta10 = logstoreShardState8.getShardMeta();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LogstoreShardState{shardMeta=LogstoreShardMeta{logstore='CONSUMER_GROUP', shardId=32, shardStatus='CONSUMER_GROUP', endCursor='null'}, offset='ENDPOINT'}" + "'", str9, "LogstoreShardState{shardMeta=LogstoreShardMeta{logstore='CONSUMER_GROUP', shardId=32, shardStatus='CONSUMER_GROUP', endCursor='null'}, offset='ENDPOINT'}");
        org.junit.Assert.assertNotNull(logstoreShardMeta10);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        producerConfig0.setEndpoint("hi!");
        int int3 = producerConfig0.getTotalSizeInBytes();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta3 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        boolean boolean4 = logstoreShardMeta3.isReadWrite();
        java.lang.String str5 = logstoreShardMeta3.getLogstore();
        java.lang.String str6 = logstoreShardMeta3.toString();
        com.aliyun.openservices.log.flink.model.LogstoreShardState logstoreShardState8 = new com.aliyun.openservices.log.flink.model.LogstoreShardState(logstoreShardMeta3, "CONSUMER_GROUP");
        com.aliyun.openservices.log.flink.model.LogstoreShardMeta logstoreShardMeta12 = new com.aliyun.openservices.log.flink.model.LogstoreShardMeta("CONSUMER_GROUP", (int) ' ', "CONSUMER_GROUP");
        logstoreShardMeta12.setEndCursor("base.retry.backoff.time.ms");
        logstoreShardMeta12.setShardStatus("direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT");
        boolean boolean17 = logstoreShardMeta12.isReadOnly();
        boolean boolean18 = logstoreShardMeta12.isReadOnly();
        logstoreShardState8.setShardMeta(logstoreShardMeta12);
        java.lang.String str20 = logstoreShardState8.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CONSUMER_GROUP" + "'", str5, "CONSUMER_GROUP");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "LogstoreShardMeta{logstore='CONSUMER_GROUP', shardId=32, shardStatus='CONSUMER_GROUP', endCursor='null'}" + "'", str6, "LogstoreShardMeta{logstore='CONSUMER_GROUP', shardId=32, shardStatus='CONSUMER_GROUP', endCursor='null'}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "LogstoreShardState{shardMeta=LogstoreShardMeta{logstore='CONSUMER_GROUP', shardId=32, shardStatus='direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT', endCursor='base.retry.backoff.time.ms'}, offset='CONSUMER_GROUP'}" + "'", str20, "LogstoreShardState{shardMeta=LogstoreShardMeta{logstore='CONSUMER_GROUP', shardId=32, shardStatus='direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT', endCursor='base.retry.backoff.time.ms'}, offset='CONSUMER_GROUP'}");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        com.aliyun.openservices.log.flink.data.RawLog rawLog0 = new com.aliyun.openservices.log.flink.data.RawLog();
        rawLog0.addContent("USER_AGENT", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = rawLog0.getContents();
        int int5 = rawLog0.getTime();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        com.aliyun.openservices.log.flink.data.RawLogGroup rawLogGroup0 = new com.aliyun.openservices.log.flink.data.RawLogGroup();
        java.lang.String str1 = rawLogGroup0.toString();
        rawLogGroup0.addTag("direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT", "producer.buckets");
        rawLogGroup0.setSource("producer.adjust.shard.hash");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RawLogGroup{source='null', topic='', tags={}, logs=[]}" + "'", str1, "RawLogGroup{source='null', topic='', tags={}, logs=[]}");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        com.aliyun.openservices.log.flink.data.RawLog rawLog0 = new com.aliyun.openservices.log.flink.data.RawLog();
        rawLog0.addContent("USER_AGENT", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = rawLog0.getContents();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = rawLog0.getContents();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        java.lang.String str0 = com.aliyun.openservices.log.flink.ConfigConstants.LOG_CONSUMER_BEGIN_POSITION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "CONSUMER_BEGIN_POSITION" + "'", str0, "CONSUMER_BEGIN_POSITION");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        // The following exception was thrown during execution in test generation
        try {
            com.aliyun.openservices.log.flink.model.CheckpointMode checkpointMode1 = com.aliyun.openservices.log.flink.model.CheckpointMode.fromString("CONSUMER_GROUP");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal checkpoint mode: CONSUMER_GROUP");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        java.lang.String str1 = producerConfig0.toString();
        java.lang.String str2 = producerConfig0.toString();
        producerConfig0.setProducerQueueSize(40960);
        int int5 = producerConfig0.getIoThreadNum();
        producerConfig0.setAccessKeyId("stop.time");
        producerConfig0.setAccessKeyId("444444444444444direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}" + "'", str1, "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}" + "'", str2, "ProducerConfig{totalSizeInBytes=0, logGroupSize=0, ioThreadNum=0, logGroupMaxLines=0, flushInterval=0, endpoint='null', project='null', logstore='null'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        com.aliyun.openservices.log.flink.data.RawLogGroupListDeserializer rawLogGroupListDeserializer0 = new com.aliyun.openservices.log.flink.data.RawLogGroupListDeserializer();
        org.apache.flink.api.common.typeinfo.TypeInformation<com.aliyun.openservices.log.flink.data.RawLogGroupList> rawLogGroupListTypeInformation1 = rawLogGroupListDeserializer0.getProducedType();
        org.apache.flink.api.common.typeinfo.TypeInformation<com.aliyun.openservices.log.flink.data.RawLogGroupList> rawLogGroupListTypeInformation2 = rawLogGroupListDeserializer0.getProducedType();
        java.lang.String str3 = rawLogGroupListDeserializer0.getSequenceNumberKey();
        java.lang.String str4 = rawLogGroupListDeserializer0.getSequenceNumberKey();
        org.junit.Assert.assertNotNull(rawLogGroupListTypeInformation1);
        org.junit.Assert.assertNotNull(rawLogGroupListTypeInformation2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        com.aliyun.openservices.log.flink.util.Consts.READONLY_SHARD_STATUS = "CONSUMER_GROUP";
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        com.aliyun.openservices.log.flink.data.RawLog rawLog0 = new com.aliyun.openservices.log.flink.data.RawLog();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = rawLog0.getContents();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = rawLog0.getContents();
        int int3 = rawLog0.getTime();
        rawLog0.addContent("16fa2bec000000000000000000000000", "producer.adjust.shard.hash");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        com.aliyun.openservices.log.flink.ConfigConstants.LOG_LOGSTORE = "ENDPOINT";
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        java.util.Properties properties0 = null;
        com.aliyun.openservices.log.flink.internal.ConfigParser configParser1 = new com.aliyun.openservices.log.flink.internal.ConfigParser(properties0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = configParser1.getString("total.size.in.bytes");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        com.aliyun.openservices.log.common.TagContent[] tagContentArray6 = new com.aliyun.openservices.log.common.TagContent[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.TagContent> tagContentList7 = new java.util.ArrayList<com.aliyun.openservices.log.common.TagContent>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.TagContent>) tagContentList7, tagContentArray6);
        com.aliyun.openservices.log.flink.internal.LogGroupKey logGroupKey9 = new com.aliyun.openservices.log.flink.internal.LogGroupKey("logGroup.max.size", "hi!", "", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList7);
        com.aliyun.openservices.log.common.LogItem[] logItemArray10 = new com.aliyun.openservices.log.common.LogItem[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogItem> logItemList11 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogItem>) logItemList11, logItemArray10);
        com.aliyun.openservices.log.flink.internal.LogGroupHolder logGroupHolder14 = new com.aliyun.openservices.log.flink.internal.LogGroupHolder("CONSUMER_GROUP", "base.retry.backoff.time.ms", "max.retry.backoff.time.ms", (java.util.List<com.aliyun.openservices.log.common.TagContent>) tagContentList7, (java.util.List<com.aliyun.openservices.log.common.LogItem>) logItemList11, (int) (short) 100);
        java.lang.String str15 = logGroupHolder14.getSource();
        com.aliyun.openservices.log.flink.internal.ProducerEvent producerEvent16 = new com.aliyun.openservices.log.flink.internal.ProducerEvent(logGroupHolder14);
        com.aliyun.openservices.log.flink.internal.LogGroupHolder logGroupHolder17 = producerEvent16.getLogGroup();
        com.aliyun.openservices.log.flink.internal.LogGroupHolder logGroupHolder18 = producerEvent16.getLogGroup();
        boolean boolean19 = producerEvent16.isPoisonPill();
        org.junit.Assert.assertNotNull(tagContentArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(logItemArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CONSUMER_GROUP" + "'", str15, "CONSUMER_GROUP");
        org.junit.Assert.assertNotNull(logGroupHolder17);
        org.junit.Assert.assertNotNull(logGroupHolder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        com.aliyun.openservices.log.common.LogGroupData[] logGroupDataArray0 = new com.aliyun.openservices.log.common.LogGroupData[] {};
        java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData> logGroupDataList1 = new java.util.ArrayList<com.aliyun.openservices.log.common.LogGroupData>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList1, logGroupDataArray0);
        com.aliyun.openservices.log.flink.model.PullLogsResult pullLogsResult6 = new com.aliyun.openservices.log.flink.model.PullLogsResult((java.util.List<com.aliyun.openservices.log.common.LogGroupData>) logGroupDataList1, (-1), "direct.mode$FETCH_DATA_INTERVAL_MILLIS$USER_AGENT", "direct.mode");
        java.lang.String str7 = pullLogsResult6.getNextCursor();
        pullLogsResult6.setNextCursor("FETCH_DATA_INTERVAL_MILLIS");
        pullLogsResult6.setShard((int) '#');
        pullLogsResult6.setShard((int) (short) -1);
        int int14 = pullLogsResult6.getShard();
        org.junit.Assert.assertNotNull(logGroupDataArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "direct.mode" + "'", str7, "direct.mode");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        com.aliyun.openservices.log.flink.internal.ProducerConfig producerConfig0 = new com.aliyun.openservices.log.flink.internal.ProducerConfig();
        producerConfig0.setEndpoint("hi!");
        producerConfig0.setEndpoint("USER_AGENT");
        // The following exception was thrown during execution in test generation
        try {
            producerConfig0.setLogGroupMaxLines(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: logGroupMaxLines must be within range (0, 40960]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

