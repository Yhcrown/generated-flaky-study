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
        com.lightstep.tracer.grpc.MetricPoint metricPoint0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.MetricPoint.Builder builder1 = com.lightstep.tracer.grpc.MetricPoint.newBuilder(metricPoint0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.metrics.OkHttpSender okHttpSender5 = new com.lightstep.tracer.metrics.OkHttpSender("hi!", "", "hi!", "hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.net.MalformedURLException: no protocol: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        com.lightstep.tracer.grpc.IngestResponse ingestResponse0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.IngestResponse.Builder builder1 = com.lightstep.tracer.grpc.IngestResponse.newBuilder(ingestResponse0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.lightstep.tracer.grpc.Reporter.getDescriptor();
        org.junit.Assert.assertNotNull(descriptor0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        com.google.protobuf.Descriptors.FileDescriptor fileDescriptor0 = com.lightstep.tracer.grpc.Collector.getDescriptor();
        org.junit.Assert.assertNotNull(fileDescriptor0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.lightstep.tracer.grpc.KeyValue.ValueCase valueCase0 = com.lightstep.tracer.grpc.KeyValue.ValueCase.VALUE_NOT_SET;
        org.junit.Assert.assertTrue("'" + valueCase0 + "' != '" + com.lightstep.tracer.grpc.KeyValue.ValueCase.VALUE_NOT_SET + "'", valueCase0.equals(com.lightstep.tracer.grpc.KeyValue.ValueCase.VALUE_NOT_SET));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        com.lightstep.tracer.grpc.KeyValue.ValueCase valueCase0 = com.lightstep.tracer.grpc.KeyValue.ValueCase.INT_VALUE;
        org.junit.Assert.assertTrue("'" + valueCase0 + "' != '" + com.lightstep.tracer.grpc.KeyValue.ValueCase.INT_VALUE + "'", valueCase0.equals(com.lightstep.tracer.grpc.KeyValue.ValueCase.INT_VALUE));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        com.google.protobuf.ByteString byteString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValue keyValue1 = com.lightstep.tracer.grpc.KeyValue.parseFrom(byteString0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        com.google.protobuf.ByteString byteString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.IngestRequest ingestRequest1 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        java.nio.ByteBuffer byteBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.MetricPoint metricPoint1 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteBuffer0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.lightstep.tracer.grpc.IngestRequest.getDescriptor();
        org.junit.Assert.assertNotNull(descriptor0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.IngestRequest ingestRequest2 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(inputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.nio.ByteBuffer byteBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.Reporter reporter1 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteBuffer0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.lang.String str0 = com.lightstep.tracer.metrics.LightStepConstants.MetaEvents.ExtractOperation;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "lightstep.extract_span" + "'", str0, "lightstep.extract_span");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValue keyValue1 = com.lightstep.tracer.grpc.KeyValue.parseDelimitedFrom(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.lightstep.tracer.grpc.IngestRequest ingestRequest0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.IngestRequest.Builder builder1 = com.lightstep.tracer.grpc.IngestRequest.newBuilder(ingestRequest0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.google.protobuf.ByteString byteString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteString0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 10, (byte) 100, (byte) 0 };
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValue keyValue8 = com.lightstep.tracer.grpc.KeyValue.parseFrom(byteArray6, extensionRegistryLite7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, -1, 10, 100, 0]");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        int int0 = com.lightstep.tracer.grpc.IngestRequest.IDEMPOTENCY_KEY_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.lightstep.tracer.grpc.IngestRequest.Builder builder0 = com.lightstep.tracer.grpc.IngestRequest.newBuilder();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = builder0.getRepeatedFieldCount(fieldDescriptor1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        com.lightstep.tracer.grpc.KeyValue.ValueCase valueCase0 = com.lightstep.tracer.grpc.KeyValue.ValueCase.DOUBLE_VALUE;
        int int1 = valueCase0.getNumber();
        org.junit.Assert.assertTrue("'" + valueCase0 + "' != '" + com.lightstep.tracer.grpc.KeyValue.ValueCase.DOUBLE_VALUE + "'", valueCase0.equals(com.lightstep.tracer.grpc.KeyValue.ValueCase.DOUBLE_VALUE));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.Reporter reporter2 = com.lightstep.tracer.grpc.Reporter.parseDelimitedFrom(inputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.google.protobuf.Parser<com.lightstep.tracer.grpc.Reporter> reporterParser0 = com.lightstep.tracer.grpc.Reporter.parser();
        org.junit.Assert.assertNotNull(reporterParser0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.google.protobuf.ByteString byteString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.Reporter reporter1 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 100 };
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.IngestResponse ingestResponse6 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray4, extensionRegistryLite5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 1, 100]");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.lightstep.tracer.grpc.IngestResponse.getDescriptor();
        org.junit.Assert.assertNotNull(descriptor0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(inputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.lightstep.tracer.grpc.MetricKind metricKind0 = com.lightstep.tracer.grpc.MetricKind.UNRECOGNIZED;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = metricKind0.getNumber();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can't get the number of an unknown enum value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + metricKind0 + "' != '" + com.lightstep.tracer.grpc.MetricKind.UNRECOGNIZED + "'", metricKind0.equals(com.lightstep.tracer.grpc.MetricKind.UNRECOGNIZED));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.google.protobuf.CodedInputStream codedInputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValue keyValue1 = com.lightstep.tracer.grpc.KeyValue.parseFrom(codedInputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.MetricPoint metricPoint7 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray6);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException; message: Protocol message tag had invalid wire type.");
        } catch (com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 0, 10, 1, 10]");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.lightstep.tracer.grpc.MetricKind metricKind0 = com.lightstep.tracer.grpc.MetricKind.COUNTER;
        org.junit.Assert.assertTrue("'" + metricKind0 + "' != '" + com.lightstep.tracer.grpc.MetricKind.COUNTER + "'", metricKind0.equals(com.lightstep.tracer.grpc.MetricKind.COUNTER));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        int int0 = com.lightstep.tracer.grpc.Reporter.TAGS_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.google.protobuf.ExtensionRegistry extensionRegistry0 = null;
        com.lightstep.tracer.grpc.Collector.registerAllExtensions(extensionRegistry0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        int int0 = com.lightstep.tracer.grpc.MetricPoint.LABELS_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.IngestRequest ingestRequest2 = com.lightstep.tracer.grpc.IngestRequest.parseDelimitedFrom(inputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        com.google.protobuf.Parser<com.lightstep.tracer.grpc.MetricPoint> metricPointParser0 = com.lightstep.tracer.grpc.MetricPoint.parser();
        org.junit.Assert.assertNotNull(metricPointParser0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        int int0 = com.lightstep.tracer.grpc.MetricPoint.START_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.Reporter reporter5 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteArray3, extensionRegistryLite4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 100]");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.lang.String str0 = com.lightstep.tracer.metrics.LightStepConstants.MetaEvents.TraceIdKey;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "lightstep.trace_id" + "'", str0, "lightstep.trace_id");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        com.lightstep.tracer.grpc.IngestRequest.Builder builder0 = com.lightstep.tracer.grpc.IngestRequest.newBuilder();
        java.lang.String str1 = builder0.getIdempotencyKey();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.lightstep.tracer.grpc.KeyValue keyValue3 = keyValue0.getDefaultInstanceForType();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = keyValue3.hasField(fieldDescriptor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(keyValue3);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        java.lang.String str0 = com.lightstep.tracer.metrics.LightStepConstants.Tags.COMPONENT_NAME_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "lightstep.component_name" + "'", str0, "lightstep.component_name");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        com.lightstep.tracer.grpc.MetricPoint.ValueCase valueCase0 = com.lightstep.tracer.grpc.MetricPoint.ValueCase.VALUE_NOT_SET;
        org.junit.Assert.assertTrue("'" + valueCase0 + "' != '" + com.lightstep.tracer.grpc.MetricPoint.ValueCase.VALUE_NOT_SET + "'", valueCase0.equals(com.lightstep.tracer.grpc.MetricPoint.ValueCase.VALUE_NOT_SET));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.Reporter reporter1 = com.lightstep.tracer.grpc.Reporter.parseDelimitedFrom(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        int int0 = java.lang.Thread.MAX_PRIORITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteArray2, extensionRegistryLite3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValue keyValue2 = com.lightstep.tracer.grpc.KeyValue.parseDelimitedFrom(inputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        java.lang.String str0 = com.lightstep.tracer.metrics.LightStepConstants.MetaEvents.SpanStartOperation;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "lightstep.span_start" + "'", str0, "lightstep.span_start");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        com.google.protobuf.Parser<com.lightstep.tracer.grpc.IngestResponse> ingestResponseParser0 = com.lightstep.tracer.grpc.IngestResponse.parser();
        org.junit.Assert.assertNotNull(ingestResponseParser0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        int int2 = keyValue0.getSerializedSize();
        java.lang.String str3 = keyValue0.getInitializationErrorString();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 1, (byte) 0 };
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValue keyValue7 = com.lightstep.tracer.grpc.KeyValue.parseFrom(byteArray5, extensionRegistryLite6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, -1, 100, 1, 0]");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.nio.ByteBuffer byteBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValue keyValue1 = com.lightstep.tracer.grpc.KeyValue.parseFrom(byteBuffer0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.google.protobuf.ExtensionRegistry extensionRegistry0 = null;
        com.lightstep.tracer.grpc.Metrics.registerAllExtensions(extensionRegistry0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        com.lightstep.tracer.grpc.KeyValue.ValueCase valueCase0 = com.lightstep.tracer.grpc.KeyValue.ValueCase.STRING_VALUE;
        org.junit.Assert.assertTrue("'" + valueCase0 + "' != '" + com.lightstep.tracer.grpc.KeyValue.ValueCase.STRING_VALUE + "'", valueCase0.equals(com.lightstep.tracer.grpc.KeyValue.ValueCase.STRING_VALUE));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        int int0 = com.lightstep.tracer.grpc.MetricPoint.DOUBLE_VALUE_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        int int0 = java.lang.Thread.MIN_PRIORITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        int int0 = com.lightstep.tracer.grpc.KeyValue.DOUBLE_VALUE_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        double double2 = keyValue0.getDoubleValue();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        com.lightstep.tracer.grpc.MetricPoint.Builder builder0 = com.lightstep.tracer.grpc.MetricPoint.newBuilder();
        com.google.protobuf.ByteString byteString1 = builder0.getMetricNameBytes();
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.Reporter reporter3 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString1, extensionRegistryLite2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(byteString1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.lang.String str0 = com.lightstep.tracer.metrics.LightStepConstants.Collector.PROTOCOL_HTTPS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "https" + "'", str0, "https");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.Reporter reporter2 = com.lightstep.tracer.grpc.Reporter.parseFrom(inputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.IngestResponse ingestResponse5 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteString3, extensionRegistryLite4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.lightstep.tracer.grpc.KeyValue.ValueCase valueCase0 = com.lightstep.tracer.grpc.KeyValue.ValueCase.JSON_VALUE;
        int int1 = valueCase0.getNumber();
        org.junit.Assert.assertTrue("'" + valueCase0 + "' != '" + com.lightstep.tracer.grpc.KeyValue.ValueCase.JSON_VALUE + "'", valueCase0.equals(com.lightstep.tracer.grpc.KeyValue.ValueCase.JSON_VALUE));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.lightstep.tracer.grpc.MetricPoint.Builder builder0 = com.lightstep.tracer.grpc.MetricPoint.newBuilder();
        int int1 = builder0.getKindValue();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.lang.String str0 = com.lightstep.tracer.metrics.LightStepConstants.MetaEvents.TracerGuidKey;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "lightstep.tracer_guid" + "'", str0, "lightstep.tracer_guid");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.CodedOutputStream codedOutputStream3 = null;
        keyValue0.writeTo(codedOutputStream3);
        com.google.protobuf.Descriptors.OneofDescriptor oneofDescriptor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor6 = keyValue0.getOneofFieldDescriptor(oneofDescriptor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        int int2 = keyValue0.getSerializedSize();
        com.google.protobuf.Descriptors.OneofDescriptor oneofDescriptor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = keyValue0.hasOneof(oneofDescriptor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        com.lightstep.tracer.grpc.MetricPoint.ValueCase valueCase1 = com.lightstep.tracer.grpc.MetricPoint.ValueCase.forNumber((int) (short) 1);
        org.junit.Assert.assertNull(valueCase1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.lightstep.tracer.grpc.MetricPoint.getDescriptor();
        org.junit.Assert.assertNotNull(descriptor0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.lang.String str0 = com.lightstep.tracer.metrics.LightStepConstants.MetaEvents.SpanFinishOperation;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "lightstep.span_finish" + "'", str0, "lightstep.span_finish");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.lightstep.tracer.grpc.MetricPoint.ValueCase valueCase0 = com.lightstep.tracer.grpc.MetricPoint.ValueCase.UINT64_VALUE;
        org.junit.Assert.assertTrue("'" + valueCase0 + "' != '" + com.lightstep.tracer.grpc.MetricPoint.ValueCase.UINT64_VALUE + "'", valueCase0.equals(com.lightstep.tracer.grpc.MetricPoint.ValueCase.UINT64_VALUE));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        com.lightstep.tracer.grpc.IngestRequest.Builder builder0 = com.lightstep.tracer.grpc.IngestRequest.newBuilder();
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.MetricPoint metricPoint2 = builder0.getPoints((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        com.google.protobuf.ByteString byteString1 = keyValue0.getJsonValueBytes();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = keyValue0.getRepeatedField(fieldDescriptor2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertNotNull(byteString1);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.IngestRequest ingestRequest3 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteArray0, extensionRegistryLite2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.lang.String str0 = com.lightstep.tracer.metrics.LightStepConstants.Collector.PROTOCOL_HTTP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http" + "'", str0, "http");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.Reporter reporter2 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteArray1);
            org.junit.Assert.fail("Expected exception of type com.google.protobuf.InvalidProtocolBufferException; message: Protocol message contained an invalid tag (zero).");
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        int int0 = com.lightstep.tracer.grpc.IngestRequest.REPORTER_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.IngestRequest ingestRequest1 = com.lightstep.tracer.grpc.IngestRequest.parseDelimitedFrom(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        java.nio.ByteBuffer byteBuffer0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValue keyValue2 = com.lightstep.tracer.grpc.KeyValue.parseFrom(byteBuffer0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.lightstep.tracer.grpc.MetricPoint.Builder builder0 = com.lightstep.tracer.grpc.MetricPoint.newBuilder();
        java.util.List<? extends com.lightstep.tracer.grpc.KeyValueOrBuilder> wildcardList1 = builder0.getLabelsOrBuilderList();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(wildcardList1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        byte[] byteArray0 = new byte[] {};
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.IngestResponse ingestResponse2 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.google.protobuf.Descriptors.Descriptor descriptor2 = ingestResponse1.getDescriptorForType();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(descriptor2);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.lightstep.tracer.grpc.KeyValue.ValueCase valueCase1 = com.lightstep.tracer.grpc.KeyValue.ValueCase.forNumber((int) (byte) -1);
        org.junit.Assert.assertNull(valueCase1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        int int5 = reporter4.getTagsCount();
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValue keyValue7 = reporter4.getTags((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.lightstep.tracer.grpc.MetricKind metricKind0 = com.lightstep.tracer.grpc.MetricKind.UNRECOGNIZED;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.Descriptors.EnumValueDescriptor enumValueDescriptor1 = metricKind0.getValueDescriptor();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + metricKind0 + "' != '" + com.lightstep.tracer.grpc.MetricKind.UNRECOGNIZED + "'", metricKind0.equals(com.lightstep.tracer.grpc.MetricKind.UNRECOGNIZED));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.lightstep.tracer.grpc.MetricPoint.Builder builder0 = com.lightstep.tracer.grpc.MetricPoint.newBuilder();
        com.google.protobuf.ByteString byteString1 = builder0.getMetricNameBytes();
        com.google.protobuf.Timestamp timestamp2 = builder0.getStart();
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValue keyValue4 = builder0.getLabels(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(byteString1);
        org.junit.Assert.assertNotNull(timestamp2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.IngestResponse ingestResponse2 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(inputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.IngestResponse ingestResponse2 = com.lightstep.tracer.grpc.IngestResponse.parseDelimitedFrom(inputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        int int0 = com.lightstep.tracer.grpc.KeyValue.INT_VALUE_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.google.protobuf.Descriptors.EnumDescriptor enumDescriptor0 = com.lightstep.tracer.grpc.MetricKind.getDescriptor();
        org.junit.Assert.assertNotNull(enumDescriptor0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.google.protobuf.Parser<com.lightstep.tracer.grpc.IngestRequest> ingestRequestParser0 = com.lightstep.tracer.grpc.IngestRequest.parser();
        org.junit.Assert.assertNotNull(ingestRequestParser0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.CodedOutputStream codedOutputStream3 = null;
        keyValue0.writeTo(codedOutputStream3);
        com.google.protobuf.Descriptors.OneofDescriptor oneofDescriptor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = keyValue0.hasOneof(oneofDescriptor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.lightstep.tracer.grpc.MetricPoint.Builder builder0 = com.lightstep.tracer.grpc.MetricPoint.newBuilder();
        com.google.protobuf.ByteString byteString1 = builder0.getMetricNameBytes();
        com.google.protobuf.Timestamp timestamp2 = builder0.getStart();
        java.util.List<? extends com.lightstep.tracer.grpc.KeyValueOrBuilder> wildcardList3 = builder0.getLabelsOrBuilderList();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(byteString1);
        org.junit.Assert.assertNotNull(timestamp2);
        org.junit.Assert.assertNotNull(wildcardList3);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        java.nio.ByteBuffer byteBuffer0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.IngestRequest ingestRequest2 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteBuffer0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        int int0 = com.lightstep.tracer.grpc.MetricPoint.UINT64_VALUE_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.google.protobuf.CodedInputStream codedInputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.Reporter reporter1 = com.lightstep.tracer.grpc.Reporter.parseFrom(codedInputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.io.InputStream inputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValue keyValue2 = com.lightstep.tracer.grpc.KeyValue.parseFrom(inputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        boolean boolean1 = keyValue0.getBoolValue();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.google.protobuf.UnknownFieldSet unknownFieldSet4 = keyValue0.getUnknownFields();
        java.lang.Class<?> wildcardClass5 = keyValue0.getClass();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(unknownFieldSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        com.lightstep.tracer.grpc.IngestRequest ingestRequest5 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString3);
        int int6 = ingestRequest5.getSerializedSize();
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.MetricPoint metricPoint8 = ingestRequest5.getPoints(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertNotNull(ingestRequest5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.retry.LinearDelayRetryPolicy linearDelayRetryPolicy4 = new com.lightstep.tracer.retry.LinearDelayRetryPolicy(0, (int) 'a', true, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxRetries (0) must be a positive value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        int int0 = com.lightstep.tracer.grpc.Reporter.REPORTER_ID_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.google.protobuf.Descriptors.FileDescriptor fileDescriptor0 = com.lightstep.tracer.grpc.Metrics.getDescriptor();
        org.junit.Assert.assertNotNull(fileDescriptor0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.google.protobuf.UnknownFieldSet unknownFieldSet4 = keyValue0.getUnknownFields();
        boolean boolean5 = keyValue0.isInitialized();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(unknownFieldSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.google.protobuf.CodedInputStream codedInputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(codedInputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        boolean boolean3 = ingestResponse1.equals((java.lang.Object) 1);
        int int4 = ingestResponse1.getSerializedSize();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        com.lightstep.tracer.grpc.IngestRequest ingestRequest5 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString3);
        java.util.List<java.lang.String> strList6 = ingestRequest5.findInitializationErrors();
        com.lightstep.tracer.grpc.IngestRequest.Builder builder7 = ingestRequest5.newBuilderForType();
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.MetricPoint metricPoint9 = ingestRequest5.getPoints((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertNotNull(ingestRequest5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        java.lang.String str0 = com.lightstep.tracer.metrics.LightStepConstants.MetaEvents.TracerCreateOperation;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "lightstep.tracer_create" + "'", str0, "lightstep.tracer_create");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.google.protobuf.Internal.EnumLiteMap<com.lightstep.tracer.grpc.MetricKind> metricKindEnumLiteMap0 = com.lightstep.tracer.grpc.MetricKind.internalGetValueMap();
        org.junit.Assert.assertNotNull(metricKindEnumLiteMap0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        java.nio.ByteBuffer byteBuffer0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteBuffer0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        java.nio.ByteBuffer byteBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteBuffer0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.Reporter reporter2 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteArray0);
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValueOrBuilder keyValueOrBuilder4 = reporter2.getTagsOrBuilder(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(reporter2);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        int int0 = com.lightstep.tracer.grpc.MetricPoint.DURATION_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.lightstep.tracer.grpc.KeyValue keyValue3 = keyValue0.getDefaultInstanceForType();
        com.lightstep.tracer.grpc.KeyValue.Builder builder4 = keyValue3.toBuilder();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = keyValue3.getField(fieldDescriptor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(keyValue3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        com.lightstep.tracer.grpc.KeyValue.Builder builder0 = com.lightstep.tracer.grpc.KeyValue.newBuilder();
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.lightstep.tracer.grpc.KeyValue.ValueCase valueCase0 = com.lightstep.tracer.grpc.KeyValue.ValueCase.BOOL_VALUE;
        org.junit.Assert.assertTrue("'" + valueCase0 + "' != '" + com.lightstep.tracer.grpc.KeyValue.ValueCase.BOOL_VALUE + "'", valueCase0.equals(com.lightstep.tracer.grpc.KeyValue.ValueCase.BOOL_VALUE));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        com.lightstep.tracer.grpc.IngestRequest ingestRequest5 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString3);
        int int6 = ingestRequest5.getSerializedSize();
        java.util.List<? extends com.lightstep.tracer.grpc.MetricPointOrBuilder> wildcardList7 = ingestRequest5.getPointsOrBuilderList();
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.MetricPoint metricPoint9 = ingestRequest5.getPoints((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertNotNull(ingestRequest5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardList7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.Reporter reporter2 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteArray0);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.IngestRequest ingestRequest4 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteArray0, extensionRegistryLite3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(reporter2);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        java.nio.ByteBuffer byteBuffer0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.Reporter reporter2 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteBuffer0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.lightstep.tracer.retry.RetryException retryException1 = new com.lightstep.tracer.retry.RetryException("");
        com.lightstep.tracer.retry.RetryException retryException2 = new com.lightstep.tracer.retry.RetryException();
        retryException1.addSuppressed((java.lang.Throwable) retryException2);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        int int5 = reporter4.getTagsCount();
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValueOrBuilder keyValueOrBuilder7 = reporter4.getTagsOrBuilder((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        com.google.protobuf.CodedOutputStream codedOutputStream3 = null;
        metricPoint2.writeTo(codedOutputStream3);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        java.lang.String str0 = com.lightstep.tracer.metrics.LightStepConstants.Tags.LEGACY_COMPONENT_NAME_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "component_name" + "'", str0, "component_name");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        int int0 = com.lightstep.tracer.grpc.KeyValue.BOOL_VALUE_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        int int0 = com.lightstep.tracer.grpc.MetricPoint.KIND_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        java.lang.String str3 = keyValue0.getStringValue();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        java.lang.String str0 = com.lightstep.tracer.metrics.LightStepConstants.Tags.GUID_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "lightstep.guid" + "'", str0, "lightstep.guid");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        java.lang.String str3 = keyValue0.toString();
        com.lightstep.tracer.grpc.KeyValue keyValue4 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str5 = keyValue4.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder6 = keyValue4.newBuilderForType();
        com.google.protobuf.ByteString byteString7 = keyValue4.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter8 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString7);
        com.lightstep.tracer.grpc.IngestRequest ingestRequest9 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString7);
        java.util.List<java.lang.String> strList10 = ingestRequest9.findInitializationErrors();
        com.google.protobuf.UnknownFieldSet unknownFieldSet11 = ingestRequest9.getUnknownFields();
        boolean boolean12 = keyValue0.equals((java.lang.Object) unknownFieldSet11);
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(keyValue4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(byteString7);
        org.junit.Assert.assertNotNull(reporter8);
        org.junit.Assert.assertNotNull(ingestRequest9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(unknownFieldSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.google.protobuf.CodedInputStream codedInputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.IngestRequest ingestRequest2 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(codedInputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        int int3 = metricPoint2.getKindValue();
        java.util.List<? extends com.lightstep.tracer.grpc.KeyValueOrBuilder> wildcardList4 = metricPoint2.getLabelsOrBuilderList();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardList4);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        com.lightstep.tracer.grpc.MetricPoint.ValueCase valueCase1 = com.lightstep.tracer.grpc.MetricPoint.ValueCase.forNumber(0);
        org.junit.Assert.assertTrue("'" + valueCase1 + "' != '" + com.lightstep.tracer.grpc.MetricPoint.ValueCase.VALUE_NOT_SET + "'", valueCase1.equals(com.lightstep.tracer.grpc.MetricPoint.ValueCase.VALUE_NOT_SET));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.KeyValue.ValueCase valueCase4 = keyValue0.getValueCase();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertTrue("'" + valueCase4 + "' != '" + com.lightstep.tracer.grpc.KeyValue.ValueCase.VALUE_NOT_SET + "'", valueCase4.equals(com.lightstep.tracer.grpc.KeyValue.ValueCase.VALUE_NOT_SET));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        java.lang.Throwable throwable1 = null;
        com.lightstep.tracer.retry.RetryException retryException4 = new com.lightstep.tracer.retry.RetryException("", throwable1, false, true);
        java.lang.Throwable throwable6 = null;
        com.lightstep.tracer.retry.RetryException retryException9 = new com.lightstep.tracer.retry.RetryException("", throwable6, false, true);
        retryException4.addSuppressed((java.lang.Throwable) retryException9);
        java.lang.Throwable[] throwableArray11 = retryException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        java.lang.String str0 = com.lightstep.tracer.metrics.LightStepConstants.Tags.SERVICE_VERSION_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "service.version" + "'", str0, "service.version");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.io.InputStream inputStream0 = null;
        com.lightstep.tracer.grpc.Reporter reporter1 = com.lightstep.tracer.grpc.Reporter.parseFrom(inputStream0);
        long long2 = reporter1.getReporterId();
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValueOrBuilder keyValueOrBuilder4 = reporter1.getTagsOrBuilder((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reporter1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.toBuilder();
        com.lightstep.tracer.grpc.KeyValue.ValueCase valueCase3 = builder2.getValueCase();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = builder2.getRepeatedFieldCount(fieldDescriptor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + valueCase3 + "' != '" + com.lightstep.tracer.grpc.KeyValue.ValueCase.VALUE_NOT_SET + "'", valueCase3.equals(com.lightstep.tracer.grpc.KeyValue.ValueCase.VALUE_NOT_SET));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        com.google.protobuf.UnknownFieldSet unknownFieldSet3 = metricPoint2.getUnknownFields();
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValueOrBuilder keyValueOrBuilder5 = metricPoint2.getLabelsOrBuilder((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertNotNull(unknownFieldSet3);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.lightstep.tracer.grpc.KeyValue keyValue3 = keyValue0.getDefaultInstanceForType();
        com.google.protobuf.Descriptors.OneofDescriptor oneofDescriptor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = keyValue3.hasOneof(oneofDescriptor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(keyValue3);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        boolean boolean3 = ingestResponse1.equals((java.lang.Object) 1);
        com.lightstep.tracer.grpc.IngestResponse.Builder builder4 = com.lightstep.tracer.grpc.IngestResponse.newBuilder(ingestResponse1);
        com.google.protobuf.Parser<com.lightstep.tracer.grpc.IngestResponse> ingestResponseParser5 = ingestResponse1.getParserForType();
        com.lightstep.tracer.grpc.IngestResponse.Builder builder6 = ingestResponse1.newBuilderForType();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(ingestResponseParser5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.IngestResponse.Builder builder2 = ingestResponse1.newBuilderForType();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        int int5 = reporter4.getTagsCount();
        int int6 = reporter4.getSerializedSize();
        java.util.List<? extends com.lightstep.tracer.grpc.KeyValueOrBuilder> wildcardList7 = reporter4.getTagsOrBuilderList();
        com.lightstep.tracer.grpc.Reporter.Builder builder8 = reporter4.newBuilderForType();
        com.lightstep.tracer.grpc.Reporter.Builder builder9 = reporter4.toBuilder();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardList7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.Reporter reporter2 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteArray0);
        com.google.protobuf.UnknownFieldSet unknownFieldSet3 = reporter2.getUnknownFields();
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValue keyValue5 = reporter2.getTags(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(reporter2);
        org.junit.Assert.assertNotNull(unknownFieldSet3);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        boolean boolean3 = ingestResponse1.equals((java.lang.Object) 1);
        com.lightstep.tracer.grpc.IngestResponse.Builder builder4 = com.lightstep.tracer.grpc.IngestResponse.newBuilder(ingestResponse1);
        com.google.protobuf.Parser<com.lightstep.tracer.grpc.IngestResponse> ingestResponseParser5 = ingestResponse1.getParserForType();
        int int6 = ingestResponse1.getSerializedSize();
        java.lang.String str7 = ingestResponse1.getInitializationErrorString();
        com.google.protobuf.UnknownFieldSet unknownFieldSet8 = ingestResponse1.getUnknownFields();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(ingestResponseParser5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(unknownFieldSet8);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        boolean boolean2 = ingestResponse1.isInitialized();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = ingestResponse1.getRepeatedFieldCount(fieldDescriptor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        com.lightstep.tracer.grpc.IngestRequest ingestRequest5 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString3);
        java.util.List<java.lang.String> strList6 = ingestRequest5.findInitializationErrors();
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.MetricPoint metricPoint8 = ingestRequest5.getPoints(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertNotNull(ingestRequest5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.lightstep.tracer.grpc.MetricKind metricKind1 = com.lightstep.tracer.grpc.MetricKind.forNumber((int) (short) 0);
        org.junit.Assert.assertTrue("'" + metricKind1 + "' != '" + com.lightstep.tracer.grpc.MetricKind.INVALID_METRIC_KIND + "'", metricKind1.equals(com.lightstep.tracer.grpc.MetricKind.INVALID_METRIC_KIND));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        com.google.protobuf.ByteString byteString1 = keyValue0.getJsonValueBytes();
        com.google.protobuf.CodedOutputStream codedOutputStream2 = null;
        keyValue0.writeTo(codedOutputStream2);
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertNotNull(byteString1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.lightstep.tracer.grpc.KeyValue keyValue3 = keyValue0.getDefaultInstanceForType();
        com.lightstep.tracer.grpc.KeyValue.Builder builder4 = keyValue3.toBuilder();
        com.google.protobuf.UnknownFieldSet unknownFieldSet5 = builder4.getUnknownFields();
        com.google.protobuf.ByteString byteString6 = builder4.getJsonValueBytes();
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.Reporter reporter8 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString6, extensionRegistryLite7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(keyValue3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(unknownFieldSet5);
        org.junit.Assert.assertNotNull(byteString6);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        com.lightstep.tracer.grpc.IngestRequest ingestRequest5 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString3);
        java.util.List<java.lang.String> strList6 = ingestRequest5.findInitializationErrors();
        com.google.protobuf.UnknownFieldSet unknownFieldSet7 = ingestRequest5.getUnknownFields();
        int int8 = ingestRequest5.getPointsCount();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertNotNull(ingestRequest5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(unknownFieldSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        com.lightstep.tracer.grpc.IngestRequest ingestRequest5 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString3);
        int int6 = ingestRequest5.getSerializedSize();
        int int7 = ingestRequest5.getPointsCount();
        java.util.List<java.lang.String> strList8 = ingestRequest5.findInitializationErrors();
        boolean boolean9 = ingestRequest5.hasReporter();
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.MetricPoint metricPoint11 = ingestRequest5.getPoints((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertNotNull(ingestRequest5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        java.lang.String str3 = keyValue0.toString();
        com.google.protobuf.UnknownFieldSet unknownFieldSet4 = keyValue0.getUnknownFields();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(unknownFieldSet4);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.toBuilder();
        long long3 = keyValue0.getIntValue();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        java.io.InputStream inputStream0 = null;
        com.lightstep.tracer.grpc.IngestRequest ingestRequest1 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(inputStream0);
        com.google.protobuf.CodedOutputStream codedOutputStream2 = null;
        ingestRequest1.writeTo(codedOutputStream2);
        org.junit.Assert.assertNotNull(ingestRequest1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        com.lightstep.tracer.grpc.IngestResponse.Builder builder0 = com.lightstep.tracer.grpc.IngestResponse.newBuilder();
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.CodedOutputStream codedOutputStream3 = null;
        keyValue0.writeTo(codedOutputStream3);
        boolean boolean5 = keyValue0.isInitialized();
        com.lightstep.tracer.grpc.KeyValue.Builder builder6 = keyValue0.toBuilder();
        java.lang.String str7 = builder6.getKey();
        com.lightstep.tracer.grpc.KeyValue.ValueCase valueCase8 = builder6.getValueCase();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + valueCase8 + "' != '" + com.lightstep.tracer.grpc.KeyValue.ValueCase.VALUE_NOT_SET + "'", valueCase8.equals(com.lightstep.tracer.grpc.KeyValue.ValueCase.VALUE_NOT_SET));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.lightstep.tracer.grpc.MetricPoint.Builder builder0 = com.lightstep.tracer.grpc.MetricPoint.newBuilder();
        com.google.protobuf.ByteString byteString1 = builder0.getMetricNameBytes();
        com.google.protobuf.Timestamp timestamp2 = builder0.getStart();
        long long3 = builder0.getUint64Value();
        java.util.List<? extends com.lightstep.tracer.grpc.KeyValueOrBuilder> wildcardList4 = builder0.getLabelsOrBuilderList();
        java.util.List<com.lightstep.tracer.grpc.KeyValue> keyValueList5 = builder0.getLabelsList();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(byteString1);
        org.junit.Assert.assertNotNull(timestamp2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardList4);
        org.junit.Assert.assertNotNull(keyValueList5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        java.lang.String str3 = keyValue0.getStringValue();
        java.lang.String str4 = keyValue0.getKey();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = keyValue0.hasField(fieldDescriptor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.lightstep.tracer.grpc.MetricPoint.Builder builder0 = com.lightstep.tracer.grpc.MetricPoint.newBuilder();
        com.google.protobuf.ByteString byteString1 = builder0.getMetricNameBytes();
        com.lightstep.tracer.grpc.IngestRequest ingestRequest2 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString1);
        java.util.List<? extends com.lightstep.tracer.grpc.MetricPointOrBuilder> wildcardList3 = ingestRequest2.getPointsOrBuilderList();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(byteString1);
        org.junit.Assert.assertNotNull(ingestRequest2);
        org.junit.Assert.assertNotNull(wildcardList3);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.IngestResponse ingestResponse2 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.Reporter reporter3 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(ingestResponse2);
        org.junit.Assert.assertNotNull(reporter3);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint3 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.IngestResponse ingestResponse4 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertNotNull(metricPoint3);
        org.junit.Assert.assertNotNull(ingestResponse4);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.google.protobuf.Parser<com.lightstep.tracer.grpc.KeyValue> keyValueParser0 = com.lightstep.tracer.grpc.KeyValue.parser();
        org.junit.Assert.assertNotNull(keyValueParser0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.lightstep.tracer.grpc.MetricPoint.Builder builder0 = com.lightstep.tracer.grpc.MetricPoint.newBuilder();
        com.google.protobuf.ByteString byteString1 = builder0.getMetricNameBytes();
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValue keyValue3 = com.lightstep.tracer.grpc.KeyValue.parseFrom(byteString1, extensionRegistryLite2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(byteString1);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.IngestResponse.Builder builder2 = ingestResponse1.toBuilder();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.lightstep.tracer.grpc.MetricPoint.Builder builder0 = com.lightstep.tracer.grpc.MetricPoint.newBuilder();
        com.google.protobuf.ByteString byteString1 = builder0.getMetricNameBytes();
        com.lightstep.tracer.grpc.IngestRequest ingestRequest2 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString1);
        com.google.protobuf.Descriptors.OneofDescriptor oneofDescriptor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = ingestRequest2.hasOneof(oneofDescriptor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(byteString1);
        org.junit.Assert.assertNotNull(ingestRequest2);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        java.io.InputStream inputStream0 = null;
        com.lightstep.tracer.grpc.KeyValue keyValue1 = com.lightstep.tracer.grpc.KeyValue.parseFrom(inputStream0);
        com.lightstep.tracer.grpc.KeyValue.ValueCase valueCase2 = keyValue1.getValueCase();
        org.junit.Assert.assertNotNull(keyValue1);
        org.junit.Assert.assertTrue("'" + valueCase2 + "' != '" + com.lightstep.tracer.grpc.KeyValue.ValueCase.VALUE_NOT_SET + "'", valueCase2.equals(com.lightstep.tracer.grpc.KeyValue.ValueCase.VALUE_NOT_SET));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        com.lightstep.tracer.grpc.IngestRequest ingestRequest5 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString3);
        int int6 = ingestRequest5.getSerializedSize();
        int int7 = ingestRequest5.getPointsCount();
        java.util.List<java.lang.String> strList8 = ingestRequest5.findInitializationErrors();
        com.lightstep.tracer.grpc.Reporter reporter9 = ingestRequest5.getReporter();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertNotNull(ingestRequest5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(reporter9);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        int int3 = metricPoint2.getKindValue();
        com.google.protobuf.Duration duration4 = metricPoint2.getDuration();
        java.util.List<com.lightstep.tracer.grpc.KeyValue> keyValueList5 = metricPoint2.getLabelsList();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(keyValueList5);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        java.nio.ByteBuffer byteBuffer0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.IngestResponse ingestResponse2 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteBuffer0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.lightstep.tracer.grpc.IngestRequest ingestRequest0 = com.lightstep.tracer.grpc.IngestRequest.getDefaultInstance();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = ingestRequest0.getRepeatedField(fieldDescriptor1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ingestRequest0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        com.google.protobuf.ByteString byteString1 = keyValue0.getJsonValueBytes();
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.MetricPoint metricPoint3 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteString1, extensionRegistryLite2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertNotNull(byteString1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        int int3 = metricPoint2.getKindValue();
        com.google.protobuf.Duration duration4 = metricPoint2.getDuration();
        int int5 = metricPoint2.getKindValue();
        com.google.protobuf.Timestamp timestamp6 = metricPoint2.getStart();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = timestamp6.getField(fieldDescriptor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timestamp6);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.lightstep.tracer.retry.RetryException retryException0 = new com.lightstep.tracer.retry.RetryException();
        com.lightstep.tracer.retry.RetryException retryException1 = new com.lightstep.tracer.retry.RetryException((java.lang.Throwable) retryException0);
        java.lang.Throwable throwable3 = null;
        com.lightstep.tracer.retry.RetryException retryException6 = new com.lightstep.tracer.retry.RetryException("", throwable3, false, true);
        java.lang.Throwable throwable8 = null;
        com.lightstep.tracer.retry.RetryException retryException11 = new com.lightstep.tracer.retry.RetryException("", throwable8, false, true);
        retryException6.addSuppressed((java.lang.Throwable) retryException11);
        retryException1.addSuppressed((java.lang.Throwable) retryException11);
        java.lang.Throwable[] throwableArray14 = retryException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.google.protobuf.CodedInputStream codedInputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(codedInputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.google.protobuf.CodedInputStream codedInputStream0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValue keyValue2 = com.lightstep.tracer.grpc.KeyValue.parseFrom(codedInputStream0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        int int3 = metricPoint2.getKindValue();
        com.google.protobuf.Duration duration4 = metricPoint2.getDuration();
        int int5 = metricPoint2.getKindValue();
        java.util.List<? extends com.lightstep.tracer.grpc.KeyValueOrBuilder> wildcardList6 = metricPoint2.getLabelsOrBuilderList();
        long long7 = metricPoint2.getUint64Value();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        com.lightstep.tracer.grpc.IngestRequest ingestRequest5 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString3);
        boolean boolean6 = ingestRequest5.hasReporter();
        com.lightstep.tracer.grpc.IngestRequest.Builder builder7 = com.lightstep.tracer.grpc.IngestRequest.newBuilder(ingestRequest5);
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertNotNull(ingestRequest5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        int int0 = com.lightstep.tracer.grpc.MetricPoint.METRIC_NAME_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        java.util.List<java.lang.String> strList2 = keyValue0.findInitializationErrors();
        com.google.protobuf.Message message3 = keyValue0.getDefaultInstanceForType();
        com.google.protobuf.Descriptors.Descriptor descriptor4 = message3.getDescriptorForType();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(message3);
        org.junit.Assert.assertNotNull(descriptor4);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.lightstep.tracer.retry.RetryException retryException1 = new com.lightstep.tracer.retry.RetryException();
        com.lightstep.tracer.retry.RetryException retryException2 = new com.lightstep.tracer.retry.RetryException((java.lang.Throwable) retryException1);
        java.lang.Throwable throwable4 = null;
        com.lightstep.tracer.retry.RetryException retryException7 = new com.lightstep.tracer.retry.RetryException("", throwable4, false, true);
        java.lang.Throwable throwable9 = null;
        com.lightstep.tracer.retry.RetryException retryException12 = new com.lightstep.tracer.retry.RetryException("", throwable9, false, true);
        retryException7.addSuppressed((java.lang.Throwable) retryException12);
        retryException2.addSuppressed((java.lang.Throwable) retryException12);
        com.lightstep.tracer.retry.RetryException retryException17 = new com.lightstep.tracer.retry.RetryException("service.version", (java.lang.Throwable) retryException12, false, false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        com.lightstep.tracer.grpc.IngestRequest ingestRequest5 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString3);
        int int6 = ingestRequest5.getSerializedSize();
        int int7 = ingestRequest5.getPointsCount();
        java.util.List<java.lang.String> strList8 = ingestRequest5.findInitializationErrors();
        boolean boolean9 = ingestRequest5.hasReporter();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = ingestRequest5.hasField(fieldDescriptor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertNotNull(ingestRequest5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.lightstep.tracer.grpc.KeyValue.ValueCase valueCase1 = com.lightstep.tracer.grpc.KeyValue.ValueCase.forNumber((int) (byte) 10);
        org.junit.Assert.assertNull(valueCase1);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.lightstep.tracer.retry.RetryFailureException retryFailureException2 = new com.lightstep.tracer.retry.RetryFailureException((int) (short) -1, (long) 6);
        int int3 = retryFailureException2.getAttemptNo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        java.util.List<java.lang.String> strList2 = keyValue0.findInitializationErrors();
        com.lightstep.tracer.grpc.KeyValue.Builder builder3 = keyValue0.toBuilder();
        int int4 = keyValue0.getSerializedSize();
        java.lang.String str5 = keyValue0.toString();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.lightstep.tracer.grpc.IngestRequest.Builder builder0 = com.lightstep.tracer.grpc.IngestRequest.newBuilder();
        com.lightstep.tracer.grpc.ReporterOrBuilder reporterOrBuilder1 = builder0.getReporterOrBuilder();
        com.lightstep.tracer.grpc.ReporterOrBuilder reporterOrBuilder2 = builder0.getReporterOrBuilder();
        com.lightstep.tracer.grpc.Reporter reporter3 = builder0.getReporter();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = reporter3.hasField(fieldDescriptor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(reporterOrBuilder1);
        org.junit.Assert.assertNotNull(reporterOrBuilder2);
        org.junit.Assert.assertNotNull(reporter3);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        java.io.InputStream inputStream0 = null;
        com.lightstep.tracer.grpc.Reporter reporter1 = com.lightstep.tracer.grpc.Reporter.parseFrom(inputStream0);
        long long2 = reporter1.getReporterId();
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValue keyValue4 = reporter1.getTags((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reporter1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.IngestResponse ingestResponse3 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.Reporter reporter5 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteArray0, extensionRegistryLite4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertNotNull(ingestResponse3);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.lightstep.tracer.grpc.IngestRequest ingestRequest0 = com.lightstep.tracer.grpc.IngestRequest.getDefaultInstance();
        com.lightstep.tracer.grpc.Reporter reporter1 = ingestRequest0.getReporter();
        org.junit.Assert.assertNotNull(ingestRequest0);
        org.junit.Assert.assertNotNull(reporter1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        int int3 = metricPoint2.getKindValue();
        com.lightstep.tracer.grpc.MetricPoint.ValueCase valueCase4 = metricPoint2.getValueCase();
        com.google.protobuf.ByteString byteString5 = metricPoint2.getMetricNameBytes();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + valueCase4 + "' != '" + com.lightstep.tracer.grpc.MetricPoint.ValueCase.VALUE_NOT_SET + "'", valueCase4.equals(com.lightstep.tracer.grpc.MetricPoint.ValueCase.VALUE_NOT_SET));
        org.junit.Assert.assertNotNull(byteString5);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.lightstep.tracer.grpc.IngestRequest.Builder builder0 = com.lightstep.tracer.grpc.IngestRequest.newBuilder();
        com.lightstep.tracer.grpc.ReporterOrBuilder reporterOrBuilder1 = builder0.getReporterOrBuilder();
        java.util.List<com.lightstep.tracer.grpc.MetricPoint> metricPointList2 = builder0.getPointsList();
        int int3 = builder0.getPointsCount();
        com.google.protobuf.ByteString byteString4 = builder0.getIdempotencyKeyBytes();
        java.util.List<com.lightstep.tracer.grpc.MetricPoint> metricPointList5 = builder0.getPointsList();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(reporterOrBuilder1);
        org.junit.Assert.assertNotNull(metricPointList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteString4);
        org.junit.Assert.assertNotNull(metricPointList5);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.lightstep.tracer.grpc.MetricPoint.Builder builder0 = com.lightstep.tracer.grpc.MetricPoint.newBuilder();
        com.google.protobuf.ByteString byteString1 = builder0.getMetricNameBytes();
        com.google.protobuf.Timestamp timestamp2 = builder0.getStart();
        long long3 = builder0.getUint64Value();
        com.google.protobuf.DurationOrBuilder durationOrBuilder4 = builder0.getDurationOrBuilder();
        double double5 = builder0.getDoubleValue();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(byteString1);
        org.junit.Assert.assertNotNull(timestamp2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationOrBuilder4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        int int0 = com.lightstep.tracer.grpc.KeyValue.STRING_VALUE_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.lightstep.tracer.grpc.Reporter.Builder builder0 = com.lightstep.tracer.grpc.Reporter.newBuilder();
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        com.lightstep.tracer.grpc.IngestRequest ingestRequest5 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString3);
        java.util.List<java.lang.String> strList6 = ingestRequest5.findInitializationErrors();
        com.lightstep.tracer.grpc.IngestRequest.Builder builder7 = ingestRequest5.newBuilderForType();
        com.google.protobuf.ByteString byteString8 = ingestRequest5.getIdempotencyKeyBytes();
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.IngestRequest ingestRequest10 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString8, extensionRegistryLite9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertNotNull(ingestRequest5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(byteString8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        int int0 = com.lightstep.tracer.grpc.KeyValue.JSON_VALUE_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.lightstep.tracer.retry.RetryException retryException1 = new com.lightstep.tracer.retry.RetryException("");
        com.lightstep.tracer.retry.RetryException retryException2 = new com.lightstep.tracer.retry.RetryException((java.lang.Throwable) retryException1);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        int int3 = metricPoint2.getKindValue();
        com.google.protobuf.Duration duration4 = metricPoint2.getDuration();
        int int5 = metricPoint2.getKindValue();
        com.google.protobuf.Descriptors.OneofDescriptor oneofDescriptor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor7 = metricPoint2.getOneofFieldDescriptor(oneofDescriptor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        boolean boolean5 = reporter4.isInitialized();
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValueOrBuilder keyValueOrBuilder7 = reporter4.getTagsOrBuilder(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.lightstep.tracer.grpc.KeyValue keyValue3 = keyValue0.getDefaultInstanceForType();
        com.lightstep.tracer.grpc.KeyValue.Builder builder4 = keyValue3.toBuilder();
        com.google.protobuf.UnknownFieldSet unknownFieldSet5 = builder4.getUnknownFields();
        com.google.protobuf.ByteString byteString6 = builder4.getJsonValueBytes();
        com.google.protobuf.ByteString byteString7 = builder4.getJsonValueBytes();
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.IngestRequest ingestRequest9 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString7, extensionRegistryLite8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(keyValue3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(unknownFieldSet5);
        org.junit.Assert.assertNotNull(byteString6);
        org.junit.Assert.assertNotNull(byteString7);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        long long3 = metricPoint2.getUint64Value();
        com.lightstep.tracer.grpc.MetricPoint.Builder builder4 = com.lightstep.tracer.grpc.MetricPoint.newBuilder();
        com.google.protobuf.Duration duration5 = builder4.getDuration();
        boolean boolean6 = metricPoint2.equals((java.lang.Object) builder4);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        java.nio.ByteBuffer byteBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.IngestRequest ingestRequest1 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteBuffer0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        java.io.InputStream inputStream0 = null;
        com.lightstep.tracer.grpc.MetricPoint metricPoint1 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValue keyValue3 = metricPoint1.getLabels((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricPoint1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        com.google.protobuf.CodedInputStream codedInputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.IngestRequest ingestRequest1 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(codedInputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.lightstep.tracer.grpc.MetricPoint.Builder builder0 = com.lightstep.tracer.grpc.MetricPoint.newBuilder();
        com.google.protobuf.ByteString byteString1 = builder0.getMetricNameBytes();
        com.google.protobuf.ByteString byteString2 = builder0.getMetricNameBytes();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(byteString1);
        org.junit.Assert.assertNotNull(byteString2);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        int int3 = metricPoint2.getKindValue();
        com.lightstep.tracer.grpc.MetricPoint.ValueCase valueCase4 = metricPoint2.getValueCase();
        boolean boolean5 = metricPoint2.hasDuration();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + valueCase4 + "' != '" + com.lightstep.tracer.grpc.MetricPoint.ValueCase.VALUE_NOT_SET + "'", valueCase4.equals(com.lightstep.tracer.grpc.MetricPoint.ValueCase.VALUE_NOT_SET));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.IngestResponse ingestResponse3 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.MetricPoint metricPoint5 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0, extensionRegistryLite4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertNotNull(ingestResponse3);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValue keyValue6 = reporter4.getTags((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        com.lightstep.tracer.grpc.IngestRequest ingestRequest5 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString3);
        boolean boolean6 = ingestRequest5.hasReporter();
        com.lightstep.tracer.grpc.Reporter reporter7 = ingestRequest5.getReporter();
        long long8 = reporter7.getReporterId();
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValue keyValue10 = reporter7.getTags(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertNotNull(ingestRequest5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reporter7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.lightstep.tracer.grpc.IngestRequest.Builder builder0 = com.lightstep.tracer.grpc.IngestRequest.newBuilder();
        com.lightstep.tracer.grpc.ReporterOrBuilder reporterOrBuilder1 = builder0.getReporterOrBuilder();
        java.util.List<com.lightstep.tracer.grpc.MetricPoint> metricPointList2 = builder0.getPointsList();
        int int3 = builder0.getPointsCount();
        java.util.List<? extends com.lightstep.tracer.grpc.MetricPointOrBuilder> wildcardList4 = builder0.getPointsOrBuilderList();
        java.util.List<com.lightstep.tracer.grpc.MetricPoint> metricPointList5 = builder0.getPointsList();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(reporterOrBuilder1);
        org.junit.Assert.assertNotNull(metricPointList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardList4);
        org.junit.Assert.assertNotNull(metricPointList5);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.lightstep.tracer.grpc.MetricPoint.Builder builder0 = com.lightstep.tracer.grpc.MetricPoint.newBuilder();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = builder0.getRepeatedFieldCount(fieldDescriptor1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        java.io.InputStream inputStream0 = null;
        com.lightstep.tracer.grpc.MetricPoint metricPoint1 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(inputStream0);
        java.lang.String str2 = metricPoint1.getMetricName();
        org.junit.Assert.assertNotNull(metricPoint1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        boolean boolean3 = ingestResponse1.equals((java.lang.Object) 1);
        com.google.protobuf.UnknownFieldSet unknownFieldSet4 = ingestResponse1.getUnknownFields();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(unknownFieldSet4);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        java.lang.String str0 = com.lightstep.tracer.metrics.LightStepConstants.MetaEvents.SpanIdKey;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "lightstep.span_id" + "'", str0, "lightstep.span_id");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.google.protobuf.ByteString byteString0 = null;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteString0, extensionRegistryLite1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        com.lightstep.tracer.grpc.IngestRequest ingestRequest5 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString3);
        java.util.List<java.lang.String> strList6 = ingestRequest5.findInitializationErrors();
        com.lightstep.tracer.grpc.IngestRequest.Builder builder7 = ingestRequest5.newBuilderForType();
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.MetricPointOrBuilder metricPointOrBuilder9 = ingestRequest5.getPointsOrBuilder(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertNotNull(ingestRequest5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.Reporter reporter6 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3, extensionRegistryLite5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.MetricPoint metricPoint1 = com.lightstep.tracer.grpc.MetricPoint.parseDelimitedFrom(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.Reporter reporter2 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteArray0);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.MetricPoint metricPoint4 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0, extensionRegistryLite3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(reporter2);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.lightstep.tracer.grpc.MetricPoint.Builder builder0 = com.lightstep.tracer.grpc.MetricPoint.newBuilder();
        com.google.protobuf.ByteString byteString1 = builder0.getMetricNameBytes();
        com.lightstep.tracer.grpc.IngestRequest ingestRequest2 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString1);
        com.google.protobuf.UnknownFieldSet unknownFieldSet3 = ingestRequest2.getUnknownFields();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(byteString1);
        org.junit.Assert.assertNotNull(ingestRequest2);
        org.junit.Assert.assertNotNull(unknownFieldSet3);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        boolean boolean3 = ingestResponse1.equals((java.lang.Object) 1);
        com.lightstep.tracer.grpc.IngestResponse.Builder builder4 = com.lightstep.tracer.grpc.IngestResponse.newBuilder(ingestResponse1);
        com.lightstep.tracer.grpc.IngestResponse.Builder builder5 = com.lightstep.tracer.grpc.IngestResponse.newBuilder(ingestResponse1);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.CodedOutputStream codedOutputStream3 = null;
        keyValue0.writeTo(codedOutputStream3);
        boolean boolean5 = keyValue0.isInitialized();
        java.lang.String str6 = keyValue0.getStringValue();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        long long3 = keyValue0.getIntValue();
        com.lightstep.tracer.grpc.KeyValue.Builder builder4 = keyValue0.toBuilder();
        java.lang.String str5 = keyValue0.getJsonValue();
        com.lightstep.tracer.grpc.KeyValue.Builder builder6 = keyValue0.toBuilder();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.lightstep.tracer.grpc.IngestRequest.Builder builder0 = com.lightstep.tracer.grpc.IngestRequest.newBuilder();
        com.lightstep.tracer.grpc.ReporterOrBuilder reporterOrBuilder1 = builder0.getReporterOrBuilder();
        com.lightstep.tracer.grpc.ReporterOrBuilder reporterOrBuilder2 = builder0.getReporterOrBuilder();
        com.lightstep.tracer.grpc.Reporter reporter3 = builder0.getReporter();
        com.lightstep.tracer.grpc.Reporter.Builder builder4 = com.lightstep.tracer.grpc.Reporter.newBuilder(reporter3);
        java.util.List<? extends com.lightstep.tracer.grpc.KeyValueOrBuilder> wildcardList5 = builder4.getTagsOrBuilderList();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(reporterOrBuilder1);
        org.junit.Assert.assertNotNull(reporterOrBuilder2);
        org.junit.Assert.assertNotNull(reporter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardList5);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.lightstep.tracer.grpc.KeyValue.ValueCase valueCase1 = com.lightstep.tracer.grpc.KeyValue.ValueCase.forNumber(5);
        org.junit.Assert.assertTrue("'" + valueCase1 + "' != '" + com.lightstep.tracer.grpc.KeyValue.ValueCase.BOOL_VALUE + "'", valueCase1.equals(com.lightstep.tracer.grpc.KeyValue.ValueCase.BOOL_VALUE));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        com.lightstep.tracer.grpc.IngestRequest ingestRequest5 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString3);
        int int6 = ingestRequest5.getSerializedSize();
        int int7 = ingestRequest5.getPointsCount();
        java.util.List<java.lang.String> strList8 = ingestRequest5.findInitializationErrors();
        boolean boolean9 = ingestRequest5.hasReporter();
        java.util.List<? extends com.lightstep.tracer.grpc.MetricPointOrBuilder> wildcardList10 = ingestRequest5.getPointsOrBuilderList();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertNotNull(ingestRequest5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardList10);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint3 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint4 = metricPoint3.getDefaultInstanceForType();
        double double5 = metricPoint4.getDoubleValue();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertNotNull(metricPoint3);
        org.junit.Assert.assertNotNull(metricPoint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.lightstep.tracer.grpc.KeyValue keyValue3 = keyValue0.getDefaultInstanceForType();
        com.lightstep.tracer.grpc.KeyValue.Builder builder4 = keyValue3.toBuilder();
        java.lang.String str5 = keyValue3.getStringValue();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(keyValue3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        int int3 = metricPoint2.getKindValue();
        com.lightstep.tracer.grpc.MetricPoint.ValueCase valueCase4 = metricPoint2.getValueCase();
        com.lightstep.tracer.grpc.KeyValue keyValue5 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str6 = keyValue5.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder7 = keyValue5.newBuilderForType();
        com.google.protobuf.ByteString byteString8 = keyValue5.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter9 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString8);
        int int10 = reporter9.getTagsCount();
        int int11 = reporter9.getSerializedSize();
        java.util.List<? extends com.lightstep.tracer.grpc.KeyValueOrBuilder> wildcardList12 = reporter9.getTagsOrBuilderList();
        int int13 = reporter9.getTagsCount();
        boolean boolean14 = metricPoint2.equals((java.lang.Object) int13);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + valueCase4 + "' != '" + com.lightstep.tracer.grpc.MetricPoint.ValueCase.VALUE_NOT_SET + "'", valueCase4.equals(com.lightstep.tracer.grpc.MetricPoint.ValueCase.VALUE_NOT_SET));
        org.junit.Assert.assertNotNull(keyValue5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(byteString8);
        org.junit.Assert.assertNotNull(reporter9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.lightstep.tracer.grpc.MetricPoint.Builder builder0 = com.lightstep.tracer.grpc.MetricPoint.newBuilder();
        com.google.protobuf.ByteString byteString1 = builder0.getMetricNameBytes();
        com.google.protobuf.Timestamp timestamp2 = builder0.getStart();
        long long3 = builder0.getUint64Value();
        com.google.protobuf.DurationOrBuilder durationOrBuilder4 = builder0.getDurationOrBuilder();
        com.google.protobuf.DurationOrBuilder durationOrBuilder5 = builder0.getDurationOrBuilder();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(byteString1);
        org.junit.Assert.assertNotNull(timestamp2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationOrBuilder4);
        org.junit.Assert.assertNotNull(durationOrBuilder5);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.google.protobuf.Descriptors.Descriptor descriptor0 = com.lightstep.tracer.grpc.KeyValue.getDescriptor();
        org.junit.Assert.assertNotNull(descriptor0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint3 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.IngestRequest ingestRequest4 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertNotNull(metricPoint3);
        org.junit.Assert.assertNotNull(ingestRequest4);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.lightstep.tracer.retry.RetryException retryException0 = new com.lightstep.tracer.retry.RetryException();
        com.lightstep.tracer.retry.RetryException retryException1 = new com.lightstep.tracer.retry.RetryException((java.lang.Throwable) retryException0);
        java.lang.Throwable throwable4 = null;
        com.lightstep.tracer.retry.RetryException retryException7 = new com.lightstep.tracer.retry.RetryException("", throwable4, false, true);
        java.lang.Throwable[] throwableArray8 = retryException7.getSuppressed();
        com.lightstep.tracer.retry.RetryException retryException11 = new com.lightstep.tracer.retry.RetryException("", (java.lang.Throwable) retryException7, true, true);
        retryException1.addSuppressed((java.lang.Throwable) retryException7);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        java.lang.Throwable throwable3 = null;
        com.lightstep.tracer.retry.RetryException retryException6 = new com.lightstep.tracer.retry.RetryException("", throwable3, false, true);
        java.lang.Throwable throwable8 = null;
        com.lightstep.tracer.retry.RetryException retryException11 = new com.lightstep.tracer.retry.RetryException("", throwable8, false, true);
        retryException6.addSuppressed((java.lang.Throwable) retryException11);
        com.lightstep.tracer.retry.RetryException retryException15 = new com.lightstep.tracer.retry.RetryException("lightstep.span_start", (java.lang.Throwable) retryException6, false, true);
        com.lightstep.tracer.retry.RetryException retryException18 = new com.lightstep.tracer.retry.RetryException("hi!", (java.lang.Throwable) retryException6, true, true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.google.protobuf.UnknownFieldSet unknownFieldSet4 = keyValue0.getUnknownFields();
        com.lightstep.tracer.grpc.KeyValue.Builder builder5 = com.lightstep.tracer.grpc.KeyValue.newBuilder(keyValue0);
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(unknownFieldSet4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.lightstep.tracer.grpc.MetricPoint.Builder builder0 = com.lightstep.tracer.grpc.MetricPoint.newBuilder();
        com.google.protobuf.ByteString byteString1 = builder0.getMetricNameBytes();
        com.lightstep.tracer.grpc.IngestRequest ingestRequest2 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString1);
        java.util.List<? extends com.lightstep.tracer.grpc.MetricPointOrBuilder> wildcardList3 = ingestRequest2.getPointsOrBuilderList();
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.MetricPointOrBuilder metricPointOrBuilder5 = ingestRequest2.getPointsOrBuilder((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(byteString1);
        org.junit.Assert.assertNotNull(ingestRequest2);
        org.junit.Assert.assertNotNull(wildcardList3);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        java.io.InputStream inputStream0 = null;
        com.lightstep.tracer.grpc.Reporter reporter1 = com.lightstep.tracer.grpc.Reporter.parseFrom(inputStream0);
        com.google.protobuf.UnknownFieldSet unknownFieldSet2 = reporter1.getUnknownFields();
        com.lightstep.tracer.grpc.Reporter.Builder builder3 = reporter1.newBuilderForType();
        org.junit.Assert.assertNotNull(reporter1);
        org.junit.Assert.assertNotNull(unknownFieldSet2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.lightstep.tracer.grpc.KeyValue keyValue3 = keyValue0.getDefaultInstanceForType();
        com.lightstep.tracer.grpc.KeyValue.Builder builder4 = keyValue3.toBuilder();
        com.google.protobuf.UnknownFieldSet unknownFieldSet5 = builder4.getUnknownFields();
        com.google.protobuf.ByteString byteString6 = builder4.getJsonValueBytes();
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValue keyValue8 = com.lightstep.tracer.grpc.KeyValue.parseFrom(byteString6, extensionRegistryLite7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(keyValue3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(unknownFieldSet5);
        org.junit.Assert.assertNotNull(byteString6);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        com.lightstep.tracer.grpc.IngestRequest ingestRequest5 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString3);
        java.util.List<java.lang.String> strList6 = ingestRequest5.findInitializationErrors();
        com.lightstep.tracer.grpc.IngestRequest.Builder builder7 = ingestRequest5.newBuilderForType();
        com.google.protobuf.ByteString byteString8 = ingestRequest5.getIdempotencyKeyBytes();
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.MetricPoint metricPoint10 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteString8, extensionRegistryLite9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertNotNull(ingestRequest5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(byteString8);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        com.lightstep.tracer.grpc.MetricPoint.ValueCase valueCase0 = com.lightstep.tracer.grpc.MetricPoint.ValueCase.DOUBLE_VALUE;
        org.junit.Assert.assertTrue("'" + valueCase0 + "' != '" + com.lightstep.tracer.grpc.MetricPoint.ValueCase.DOUBLE_VALUE + "'", valueCase0.equals(com.lightstep.tracer.grpc.MetricPoint.ValueCase.DOUBLE_VALUE));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        long long3 = metricPoint2.getUint64Value();
        com.google.protobuf.Timestamp timestamp4 = metricPoint2.getStart();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(timestamp4);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        java.lang.String str2 = keyValue0.getJsonValue();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = keyValue0.getRepeatedField(fieldDescriptor3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        com.lightstep.tracer.grpc.MetricPoint.ValueCase valueCase1 = com.lightstep.tracer.grpc.MetricPoint.ValueCase.forNumber((int) 'a');
        org.junit.Assert.assertNull(valueCase1);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.lightstep.tracer.grpc.MetricPoint.Builder builder0 = com.lightstep.tracer.grpc.MetricPoint.newBuilder();
        com.google.protobuf.ByteString byteString1 = builder0.getMetricNameBytes();
        com.lightstep.tracer.grpc.IngestRequest ingestRequest2 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString1);
        com.google.protobuf.ByteString byteString3 = ingestRequest2.getIdempotencyKeyBytes();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(byteString1);
        org.junit.Assert.assertNotNull(ingestRequest2);
        org.junit.Assert.assertNotNull(byteString3);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        long long3 = metricPoint2.getUint64Value();
        com.google.protobuf.Descriptors.Descriptor descriptor4 = metricPoint2.getDescriptorForType();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(descriptor4);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        int int3 = metricPoint2.getKindValue();
        int int4 = metricPoint2.getSerializedSize();
        com.google.protobuf.Parser<com.lightstep.tracer.grpc.MetricPoint> metricPointParser5 = metricPoint2.getParserForType();
        long long6 = metricPoint2.getUint64Value();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(metricPointParser5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        boolean boolean2 = ingestResponse1.isInitialized();
        com.google.protobuf.UnknownFieldSet unknownFieldSet3 = ingestResponse1.getUnknownFields();
        int int4 = ingestResponse1.getSerializedSize();
        com.lightstep.tracer.grpc.IngestResponse.Builder builder5 = ingestResponse1.newBuilderForType();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(unknownFieldSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        com.lightstep.tracer.grpc.IngestRequest ingestRequest5 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString3);
        int int6 = ingestRequest5.getSerializedSize();
        int int7 = ingestRequest5.getPointsCount();
        java.util.List<java.lang.String> strList8 = ingestRequest5.findInitializationErrors();
        java.lang.String str9 = ingestRequest5.toString();
        com.lightstep.tracer.grpc.ReporterOrBuilder reporterOrBuilder10 = ingestRequest5.getReporterOrBuilder();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertNotNull(ingestRequest5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(reporterOrBuilder10);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        java.io.InputStream inputStream0 = null;
        com.lightstep.tracer.grpc.Reporter reporter1 = com.lightstep.tracer.grpc.Reporter.parseFrom(inputStream0);
        com.google.protobuf.UnknownFieldSet unknownFieldSet2 = reporter1.getUnknownFields();
        int int3 = reporter1.getTagsCount();
        org.junit.Assert.assertNotNull(reporter1);
        org.junit.Assert.assertNotNull(unknownFieldSet2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.lightstep.tracer.grpc.Reporter reporter0 = com.lightstep.tracer.grpc.Reporter.getDefaultInstance();
        org.junit.Assert.assertNotNull(reporter0);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.google.protobuf.CodedInputStream codedInputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.MetricPoint metricPoint1 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(codedInputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        com.lightstep.tracer.grpc.IngestRequest ingestRequest5 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString3);
        int int6 = ingestRequest5.getSerializedSize();
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.MetricPoint metricPoint8 = ingestRequest5.getPoints((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertNotNull(ingestRequest5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        int int5 = reporter4.getTagsCount();
        java.util.List<com.lightstep.tracer.grpc.KeyValue> keyValueList6 = reporter4.getTagsList();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(keyValueList6);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        int int0 = java.lang.Thread.NORM_PRIORITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.lightstep.tracer.grpc.IngestRequest.Builder builder0 = com.lightstep.tracer.grpc.IngestRequest.newBuilder();
        com.lightstep.tracer.grpc.ReporterOrBuilder reporterOrBuilder1 = builder0.getReporterOrBuilder();
        com.lightstep.tracer.grpc.ReporterOrBuilder reporterOrBuilder2 = builder0.getReporterOrBuilder();
        com.lightstep.tracer.grpc.ReporterOrBuilder reporterOrBuilder3 = builder0.getReporterOrBuilder();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(reporterOrBuilder1);
        org.junit.Assert.assertNotNull(reporterOrBuilder2);
        org.junit.Assert.assertNotNull(reporterOrBuilder3);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        com.google.protobuf.UnknownFieldSet unknownFieldSet3 = metricPoint2.getUnknownFields();
        java.lang.String str4 = metricPoint2.getMetricName();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertNotNull(unknownFieldSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        int int3 = metricPoint2.getKindValue();
        com.google.protobuf.Duration duration4 = metricPoint2.getDuration();
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValueOrBuilder keyValueOrBuilder6 = metricPoint2.getLabelsOrBuilder(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        long long1 = keyValue0.getIntValue();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        int int3 = metricPoint2.getKindValue();
        com.google.protobuf.Duration duration4 = metricPoint2.getDuration();
        int int5 = metricPoint2.getKindValue();
        com.google.protobuf.ByteString byteString6 = metricPoint2.getMetricNameBytes();
        com.lightstep.tracer.grpc.KeyValue keyValue7 = com.lightstep.tracer.grpc.KeyValue.parseFrom(byteString6);
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.IngestRequest ingestRequest9 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString6, extensionRegistryLite8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteString6);
        org.junit.Assert.assertNotNull(keyValue7);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        int int3 = metricPoint2.getKindValue();
        com.google.protobuf.Duration duration4 = metricPoint2.getDuration();
        int int5 = metricPoint2.getKindValue();
        com.google.protobuf.ByteString byteString6 = metricPoint2.getMetricNameBytes();
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.MetricPoint metricPoint8 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteString6, extensionRegistryLite7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteString6);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        boolean boolean3 = ingestResponse1.equals((java.lang.Object) 1);
        com.lightstep.tracer.grpc.IngestResponse.Builder builder4 = com.lightstep.tracer.grpc.IngestResponse.newBuilder(ingestResponse1);
        com.google.protobuf.Parser<com.lightstep.tracer.grpc.IngestResponse> ingestResponseParser5 = ingestResponse1.getParserForType();
        com.lightstep.tracer.grpc.IngestResponse ingestResponse6 = ingestResponse1.getDefaultInstanceForType();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(ingestResponseParser5);
        org.junit.Assert.assertNotNull(ingestResponse6);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        com.google.protobuf.UnknownFieldSet unknownFieldSet3 = metricPoint2.getUnknownFields();
        long long4 = metricPoint2.getUint64Value();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertNotNull(unknownFieldSet3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        java.util.List<java.lang.String> strList2 = keyValue0.findInitializationErrors();
        com.lightstep.tracer.grpc.KeyValue.Builder builder3 = keyValue0.toBuilder();
        long long4 = keyValue0.getIntValue();
        int int5 = keyValue0.getSerializedSize();
        double double6 = keyValue0.getDoubleValue();
        long long7 = keyValue0.getIntValue();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        java.io.InputStream inputStream0 = null;
        com.lightstep.tracer.grpc.Reporter reporter1 = com.lightstep.tracer.grpc.Reporter.parseFrom(inputStream0);
        com.google.protobuf.CodedOutputStream codedOutputStream2 = null;
        reporter1.writeTo(codedOutputStream2);
        long long4 = reporter1.getReporterId();
        com.lightstep.tracer.grpc.Reporter.Builder builder5 = reporter1.newBuilderForType();
        org.junit.Assert.assertNotNull(reporter1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        boolean boolean5 = reporter4.isInitialized();
        java.util.List<com.lightstep.tracer.grpc.KeyValue> keyValueList6 = reporter4.getTagsList();
        int int7 = reporter4.getSerializedSize();
        java.util.List<? extends com.lightstep.tracer.grpc.KeyValueOrBuilder> wildcardList8 = reporter4.getTagsOrBuilderList();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(keyValueList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardList8);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        java.io.InputStream inputStream0 = null;
        com.lightstep.tracer.grpc.MetricPoint metricPoint1 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(inputStream0);
        boolean boolean2 = metricPoint1.isInitialized();
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = metricPoint1.hasField(fieldDescriptor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricPoint1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        java.util.List<java.lang.String> strList2 = keyValue0.findInitializationErrors();
        com.lightstep.tracer.grpc.KeyValue.Builder builder3 = keyValue0.toBuilder();
        int int4 = keyValue0.getSerializedSize();
        com.google.protobuf.CodedOutputStream codedOutputStream5 = null;
        keyValue0.writeTo(codedOutputStream5);
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        com.lightstep.tracer.grpc.MetricPoint.Builder builder0 = com.lightstep.tracer.grpc.MetricPoint.newBuilder();
        com.google.protobuf.ByteString byteString1 = builder0.getMetricNameBytes();
        com.lightstep.tracer.grpc.IngestRequest ingestRequest2 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString1);
        java.util.List<? extends com.lightstep.tracer.grpc.MetricPointOrBuilder> wildcardList3 = ingestRequest2.getPointsOrBuilderList();
        boolean boolean4 = ingestRequest2.isInitialized();
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.MetricPointOrBuilder metricPointOrBuilder6 = ingestRequest2.getPointsOrBuilder((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(byteString1);
        org.junit.Assert.assertNotNull(ingestRequest2);
        org.junit.Assert.assertNotNull(wildcardList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        com.lightstep.tracer.grpc.IngestRequest.Builder builder0 = com.lightstep.tracer.grpc.IngestRequest.newBuilder();
        com.lightstep.tracer.grpc.ReporterOrBuilder reporterOrBuilder1 = builder0.getReporterOrBuilder();
        boolean boolean2 = builder0.hasReporter();
        com.google.protobuf.Message message3 = builder0.getDefaultInstanceForType();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(reporterOrBuilder1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(message3);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        java.lang.String str0 = com.lightstep.tracer.metrics.LightStepConstants.MetaEvents.MetaEventKey;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "lightstep.meta_event" + "'", str0, "lightstep.meta_event");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        com.google.protobuf.ByteString byteString1 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.IngestRequest ingestRequest2 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString1);
        com.lightstep.tracer.grpc.ReporterOrBuilder reporterOrBuilder3 = ingestRequest2.getReporterOrBuilder();
        int int4 = ingestRequest2.getSerializedSize();
        com.lightstep.tracer.grpc.KeyValue keyValue5 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str6 = keyValue5.getKey();
        java.util.List<java.lang.String> strList7 = keyValue5.findInitializationErrors();
        com.google.protobuf.Message message8 = keyValue5.getDefaultInstanceForType();
        boolean boolean9 = ingestRequest2.equals((java.lang.Object) message8);
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertNotNull(byteString1);
        org.junit.Assert.assertNotNull(ingestRequest2);
        org.junit.Assert.assertNotNull(reporterOrBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(keyValue5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(message8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        com.lightstep.tracer.grpc.MetricKind metricKind0 = com.lightstep.tracer.grpc.MetricKind.GAUGE;
        com.google.protobuf.Descriptors.EnumValueDescriptor enumValueDescriptor1 = metricKind0.getValueDescriptor();
        com.google.protobuf.Descriptors.EnumValueDescriptor enumValueDescriptor2 = metricKind0.getValueDescriptor();
        org.junit.Assert.assertTrue("'" + metricKind0 + "' != '" + com.lightstep.tracer.grpc.MetricKind.GAUGE + "'", metricKind0.equals(com.lightstep.tracer.grpc.MetricKind.GAUGE));
        org.junit.Assert.assertNotNull(enumValueDescriptor1);
        org.junit.Assert.assertNotNull(enumValueDescriptor2);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        int int3 = metricPoint2.getKindValue();
        com.google.protobuf.Duration duration4 = metricPoint2.getDuration();
        int int5 = metricPoint2.getKindValue();
        java.util.List<? extends com.lightstep.tracer.grpc.KeyValueOrBuilder> wildcardList6 = metricPoint2.getLabelsOrBuilderList();
        java.lang.String str7 = metricPoint2.getMetricName();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        com.lightstep.tracer.grpc.MetricPoint.Builder builder0 = com.lightstep.tracer.grpc.MetricPoint.newBuilder();
        com.google.protobuf.ByteString byteString1 = builder0.getMetricNameBytes();
        com.google.protobuf.Timestamp timestamp2 = builder0.getStart();
        long long3 = builder0.getUint64Value();
        com.google.protobuf.DurationOrBuilder durationOrBuilder4 = builder0.getDurationOrBuilder();
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValueOrBuilder keyValueOrBuilder6 = builder0.getLabelsOrBuilder(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(byteString1);
        org.junit.Assert.assertNotNull(timestamp2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(durationOrBuilder4);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        java.io.InputStream inputStream0 = null;
        com.lightstep.tracer.grpc.IngestRequest ingestRequest1 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(inputStream0);
        com.lightstep.tracer.grpc.IngestRequest ingestRequest2 = ingestRequest1.getDefaultInstanceForType();
        int int3 = ingestRequest2.getSerializedSize();
        org.junit.Assert.assertNotNull(ingestRequest1);
        org.junit.Assert.assertNotNull(ingestRequest2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        java.io.InputStream inputStream0 = null;
        com.lightstep.tracer.grpc.MetricPoint metricPoint1 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(inputStream0);
        boolean boolean2 = metricPoint1.isInitialized();
        java.lang.String str3 = metricPoint1.getMetricName();
        java.util.List<? extends com.lightstep.tracer.grpc.KeyValueOrBuilder> wildcardList4 = metricPoint1.getLabelsOrBuilderList();
        org.junit.Assert.assertNotNull(metricPoint1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardList4);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        com.lightstep.tracer.grpc.MetricPoint.Builder builder0 = com.lightstep.tracer.grpc.MetricPoint.newBuilder();
        com.google.protobuf.ByteString byteString1 = builder0.getMetricNameBytes();
        com.google.protobuf.Timestamp timestamp2 = builder0.getStart();
        long long3 = builder0.getUint64Value();
        java.util.List<? extends com.lightstep.tracer.grpc.KeyValueOrBuilder> wildcardList4 = builder0.getLabelsOrBuilderList();
        java.lang.String str5 = builder0.getMetricName();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(byteString1);
        org.junit.Assert.assertNotNull(timestamp2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        boolean boolean5 = reporter4.isInitialized();
        java.util.List<com.lightstep.tracer.grpc.KeyValue> keyValueList6 = reporter4.getTagsList();
        int int7 = reporter4.getSerializedSize();
        java.util.List<com.lightstep.tracer.grpc.KeyValue> keyValueList8 = reporter4.getTagsList();
        com.lightstep.tracer.grpc.Reporter.Builder builder9 = reporter4.toBuilder();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(keyValueList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(keyValueList8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        com.lightstep.tracer.retry.RetryFailureException retryFailureException2 = new com.lightstep.tracer.retry.RetryFailureException((int) '4', (long) (short) 100);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        int int3 = metricPoint2.getKindValue();
        com.google.protobuf.Duration duration4 = metricPoint2.getDuration();
        int int5 = metricPoint2.getKindValue();
        com.google.protobuf.Timestamp timestamp6 = metricPoint2.getStart();
        com.google.protobuf.ByteString byteString7 = metricPoint2.getMetricNameBytes();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timestamp6);
        org.junit.Assert.assertNotNull(byteString7);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        com.lightstep.tracer.grpc.IngestRequest ingestRequest5 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString3);
        java.util.List<java.lang.String> strList6 = ingestRequest5.findInitializationErrors();
        com.lightstep.tracer.grpc.IngestRequest.Builder builder7 = ingestRequest5.newBuilderForType();
        com.google.protobuf.ByteString byteString8 = ingestRequest5.getIdempotencyKeyBytes();
        com.lightstep.tracer.grpc.Reporter reporter9 = ingestRequest5.getReporter();
        com.lightstep.tracer.grpc.IngestRequest.Builder builder10 = ingestRequest5.toBuilder();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertNotNull(ingestRequest5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(byteString8);
        org.junit.Assert.assertNotNull(reporter9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        int int5 = reporter4.getTagsCount();
        int int6 = reporter4.getSerializedSize();
        java.util.List<? extends com.lightstep.tracer.grpc.KeyValueOrBuilder> wildcardList7 = reporter4.getTagsOrBuilderList();
        int int8 = reporter4.getSerializedSize();
        java.util.List<? extends com.lightstep.tracer.grpc.KeyValueOrBuilder> wildcardList9 = reporter4.getTagsOrBuilderList();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardList9);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        com.lightstep.tracer.grpc.IngestRequest ingestRequest5 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString3);
        java.util.List<java.lang.String> strList6 = ingestRequest5.findInitializationErrors();
        com.lightstep.tracer.grpc.IngestRequest.Builder builder7 = ingestRequest5.newBuilderForType();
        com.google.protobuf.ByteString byteString8 = ingestRequest5.getIdempotencyKeyBytes();
        com.lightstep.tracer.grpc.Reporter reporter9 = ingestRequest5.getReporter();
        com.lightstep.tracer.grpc.IngestRequest.Builder builder10 = ingestRequest5.newBuilderForType();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertNotNull(ingestRequest5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(byteString8);
        org.junit.Assert.assertNotNull(reporter9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint3 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint4 = metricPoint3.getDefaultInstanceForType();
        com.lightstep.tracer.grpc.MetricPoint.ValueCase valueCase5 = metricPoint4.getValueCase();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertNotNull(metricPoint3);
        org.junit.Assert.assertNotNull(metricPoint4);
        org.junit.Assert.assertTrue("'" + valueCase5 + "' != '" + com.lightstep.tracer.grpc.MetricPoint.ValueCase.VALUE_NOT_SET + "'", valueCase5.equals(com.lightstep.tracer.grpc.MetricPoint.ValueCase.VALUE_NOT_SET));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        com.google.protobuf.ByteString byteString1 = keyValue0.getJsonValueBytes();
        com.google.protobuf.ByteString byteString2 = keyValue0.getKeyBytes();
        long long3 = keyValue0.getIntValue();
        boolean boolean4 = keyValue0.isInitialized();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertNotNull(byteString1);
        org.junit.Assert.assertNotNull(byteString2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        java.io.InputStream inputStream0 = null;
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(inputStream0);
        com.google.protobuf.Descriptors.FieldDescriptor fieldDescriptor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = ingestResponse1.getRepeatedField(fieldDescriptor2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ingestResponse1);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.Reporter reporter2 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteArray0);
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValue keyValue4 = reporter2.getTags((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(reporter2);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        com.lightstep.tracer.grpc.IngestRequest ingestRequest5 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString3);
        int int6 = ingestRequest5.getSerializedSize();
        int int7 = ingestRequest5.getPointsCount();
        java.util.List<java.lang.String> strList8 = ingestRequest5.findInitializationErrors();
        java.lang.String str9 = ingestRequest5.getIdempotencyKey();
        java.util.Map<com.google.protobuf.Descriptors.FieldDescriptor, java.lang.Object> fieldDescriptorMap10 = ingestRequest5.getAllFields();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertNotNull(ingestRequest5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(fieldDescriptorMap10);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        com.lightstep.tracer.grpc.MetricPoint.Builder builder0 = com.lightstep.tracer.grpc.MetricPoint.newBuilder();
        com.google.protobuf.ByteString byteString1 = builder0.getMetricNameBytes();
        com.google.protobuf.Timestamp timestamp2 = builder0.getStart();
        long long3 = builder0.getUint64Value();
        com.google.protobuf.TimestampOrBuilder timestampOrBuilder4 = builder0.getStartOrBuilder();
        int int5 = builder0.getKindValue();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(byteString1);
        org.junit.Assert.assertNotNull(timestamp2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(timestampOrBuilder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.google.protobuf.ByteString byteString2 = keyValue0.getKeyBytes();
        boolean boolean3 = keyValue0.getBoolValue();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(byteString2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        com.lightstep.tracer.grpc.MetricPoint.Builder builder0 = com.lightstep.tracer.grpc.MetricPoint.newBuilder();
        com.google.protobuf.ByteString byteString1 = builder0.getMetricNameBytes();
        java.lang.String str2 = builder0.getMetricName();
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValueOrBuilder keyValueOrBuilder4 = builder0.getLabelsOrBuilder((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(byteString1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        com.lightstep.tracer.grpc.MetricKind metricKind1 = com.lightstep.tracer.grpc.MetricKind.forNumber((int) (byte) 1);
        com.google.protobuf.Descriptors.EnumValueDescriptor enumValueDescriptor2 = metricKind1.getValueDescriptor();
        com.google.protobuf.Descriptors.EnumValueDescriptor enumValueDescriptor3 = metricKind1.getValueDescriptor();
        com.google.protobuf.Descriptors.EnumDescriptor enumDescriptor4 = metricKind1.getDescriptorForType();
        org.junit.Assert.assertTrue("'" + metricKind1 + "' != '" + com.lightstep.tracer.grpc.MetricKind.COUNTER + "'", metricKind1.equals(com.lightstep.tracer.grpc.MetricKind.COUNTER));
        org.junit.Assert.assertNotNull(enumValueDescriptor2);
        org.junit.Assert.assertNotNull(enumValueDescriptor3);
        org.junit.Assert.assertNotNull(enumDescriptor4);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        com.lightstep.tracer.grpc.IngestRequest ingestRequest5 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString3);
        boolean boolean6 = ingestRequest5.hasReporter();
        com.lightstep.tracer.grpc.Reporter reporter7 = ingestRequest5.getReporter();
        boolean boolean8 = reporter7.isInitialized();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertNotNull(ingestRequest5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reporter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        java.util.List<java.lang.String> strList2 = keyValue0.findInitializationErrors();
        com.lightstep.tracer.grpc.KeyValue.Builder builder3 = keyValue0.toBuilder();
        long long4 = keyValue0.getIntValue();
        java.lang.String str5 = keyValue0.getStringValue();
        com.google.protobuf.ByteString byteString6 = keyValue0.getStringValueBytes();
        com.google.protobuf.Parser<com.lightstep.tracer.grpc.KeyValue> keyValueParser7 = keyValue0.getParserForType();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(byteString6);
        org.junit.Assert.assertNotNull(keyValueParser7);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        java.util.List<java.lang.String> strList2 = keyValue0.findInitializationErrors();
        com.lightstep.tracer.grpc.KeyValue.Builder builder3 = keyValue0.toBuilder();
        long long4 = keyValue0.getIntValue();
        int int5 = keyValue0.getSerializedSize();
        double double6 = keyValue0.getDoubleValue();
        java.lang.String str7 = keyValue0.getKey();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        java.lang.String str3 = keyValue0.getStringValue();
        java.lang.String str4 = keyValue0.getKey();
        com.google.protobuf.Message message5 = keyValue0.getDefaultInstanceForType();
        java.lang.String str6 = keyValue0.getStringValue();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(message5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        com.lightstep.tracer.grpc.MetricPoint.Builder builder0 = com.lightstep.tracer.grpc.MetricPoint.newBuilder();
        com.google.protobuf.ByteString byteString1 = builder0.getMetricNameBytes();
        com.google.protobuf.Timestamp timestamp2 = builder0.getStart();
        long long3 = builder0.getUint64Value();
        java.util.List<? extends com.lightstep.tracer.grpc.KeyValueOrBuilder> wildcardList4 = builder0.getLabelsOrBuilderList();
        com.google.protobuf.Duration duration5 = builder0.getDuration();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(byteString1);
        org.junit.Assert.assertNotNull(timestamp2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardList4);
        org.junit.Assert.assertNotNull(duration5);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        com.google.protobuf.UnknownFieldSet unknownFieldSet3 = metricPoint2.getUnknownFields();
        int int4 = metricPoint2.getLabelsCount();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertNotNull(unknownFieldSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        java.io.InputStream inputStream0 = null;
        com.lightstep.tracer.grpc.MetricPoint metricPoint1 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(inputStream0);
        boolean boolean2 = metricPoint1.isInitialized();
        java.util.List<java.lang.String> strList3 = metricPoint1.findInitializationErrors();
        org.junit.Assert.assertNotNull(metricPoint1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        boolean boolean2 = ingestResponse1.isInitialized();
        com.google.protobuf.UnknownFieldSet unknownFieldSet3 = ingestResponse1.getUnknownFields();
        com.google.protobuf.CodedOutputStream codedOutputStream4 = null;
        ingestResponse1.writeTo(codedOutputStream4);
        com.lightstep.tracer.grpc.KeyValue keyValue6 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        com.google.protobuf.ByteString byteString7 = keyValue6.getJsonValueBytes();
        com.lightstep.tracer.grpc.IngestRequest ingestRequest8 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString7);
        boolean boolean9 = ingestResponse1.equals((java.lang.Object) ingestRequest8);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(unknownFieldSet3);
        org.junit.Assert.assertNotNull(keyValue6);
        org.junit.Assert.assertNotNull(byteString7);
        org.junit.Assert.assertNotNull(ingestRequest8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        com.lightstep.tracer.grpc.MetricPoint.Builder builder0 = com.lightstep.tracer.grpc.MetricPoint.newBuilder();
        com.google.protobuf.ByteString byteString1 = builder0.getMetricNameBytes();
        com.lightstep.tracer.grpc.IngestRequest ingestRequest2 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString1);
        java.util.List<? extends com.lightstep.tracer.grpc.MetricPointOrBuilder> wildcardList3 = ingestRequest2.getPointsOrBuilderList();
        boolean boolean4 = ingestRequest2.hasReporter();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(byteString1);
        org.junit.Assert.assertNotNull(ingestRequest2);
        org.junit.Assert.assertNotNull(wildcardList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.google.protobuf.UnknownFieldSet unknownFieldSet4 = keyValue0.getUnknownFields();
        com.lightstep.tracer.grpc.KeyValue.ValueCase valueCase5 = keyValue0.getValueCase();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(unknownFieldSet4);
        org.junit.Assert.assertTrue("'" + valueCase5 + "' != '" + com.lightstep.tracer.grpc.KeyValue.ValueCase.VALUE_NOT_SET + "'", valueCase5.equals(com.lightstep.tracer.grpc.KeyValue.ValueCase.VALUE_NOT_SET));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        long long3 = metricPoint2.getUint64Value();
        com.lightstep.tracer.grpc.MetricPoint.ValueCase valueCase4 = metricPoint2.getValueCase();
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValue keyValue6 = metricPoint2.getLabels(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + valueCase4 + "' != '" + com.lightstep.tracer.grpc.MetricPoint.ValueCase.VALUE_NOT_SET + "'", valueCase4.equals(com.lightstep.tracer.grpc.MetricPoint.ValueCase.VALUE_NOT_SET));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        com.lightstep.tracer.grpc.MetricPoint metricPoint0 = com.lightstep.tracer.grpc.MetricPoint.getDefaultInstance();
        org.junit.Assert.assertNotNull(metricPoint0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        int int0 = com.lightstep.tracer.grpc.KeyValue.KEY_FIELD_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.lightstep.tracer.grpc.KeyValue keyValue3 = keyValue0.getDefaultInstanceForType();
        com.lightstep.tracer.grpc.KeyValue.Builder builder4 = keyValue3.toBuilder();
        com.google.protobuf.UnknownFieldSet unknownFieldSet5 = builder4.getUnknownFields();
        com.google.protobuf.ByteString byteString6 = builder4.getJsonValueBytes();
        com.lightstep.tracer.grpc.MetricPoint metricPoint7 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteString6);
        com.lightstep.tracer.grpc.MetricKind metricKind8 = metricPoint7.getKind();
        com.google.protobuf.Descriptors.EnumDescriptor enumDescriptor9 = metricKind8.getDescriptorForType();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(keyValue3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(unknownFieldSet5);
        org.junit.Assert.assertNotNull(byteString6);
        org.junit.Assert.assertNotNull(metricPoint7);
        org.junit.Assert.assertTrue("'" + metricKind8 + "' != '" + com.lightstep.tracer.grpc.MetricKind.INVALID_METRIC_KIND + "'", metricKind8.equals(com.lightstep.tracer.grpc.MetricKind.INVALID_METRIC_KIND));
        org.junit.Assert.assertNotNull(enumDescriptor9);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        java.lang.Throwable throwable3 = null;
        com.lightstep.tracer.retry.RetryException retryException6 = new com.lightstep.tracer.retry.RetryException("", throwable3, false, true);
        java.lang.Throwable[] throwableArray7 = retryException6.getSuppressed();
        com.lightstep.tracer.retry.RetryException retryException8 = new com.lightstep.tracer.retry.RetryException("hi!", (java.lang.Throwable) retryException6);
        com.lightstep.tracer.retry.RetryException retryException11 = new com.lightstep.tracer.retry.RetryException("lightstep.span_finish", (java.lang.Throwable) retryException8, true, false);
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        int int3 = metricPoint2.getKindValue();
        com.google.protobuf.UnknownFieldSet unknownFieldSet4 = metricPoint2.getUnknownFields();
        com.lightstep.tracer.grpc.MetricKind metricKind5 = metricPoint2.getKind();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(unknownFieldSet4);
        org.junit.Assert.assertTrue("'" + metricKind5 + "' != '" + com.lightstep.tracer.grpc.MetricKind.INVALID_METRIC_KIND + "'", metricKind5.equals(com.lightstep.tracer.grpc.MetricKind.INVALID_METRIC_KIND));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        int int5 = reporter4.getTagsCount();
        com.lightstep.tracer.grpc.Reporter.Builder builder6 = com.lightstep.tracer.grpc.Reporter.newBuilder(reporter4);
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        com.lightstep.tracer.grpc.IngestRequest ingestRequest5 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString3);
        java.util.List<java.lang.String> strList6 = ingestRequest5.findInitializationErrors();
        com.lightstep.tracer.grpc.IngestRequest.Builder builder7 = ingestRequest5.newBuilderForType();
        com.google.protobuf.ByteString byteString8 = ingestRequest5.getIdempotencyKeyBytes();
        com.lightstep.tracer.grpc.Reporter reporter9 = ingestRequest5.getReporter();
        java.lang.String str10 = reporter9.getInitializationErrorString();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertNotNull(ingestRequest5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(byteString8);
        org.junit.Assert.assertNotNull(reporter9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        com.lightstep.tracer.retry.RetryFailureException retryFailureException2 = new com.lightstep.tracer.retry.RetryFailureException((int) (byte) 100, (long) 6);
        long long3 = retryFailureException2.getDelayMs();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 6L + "'", long3 == 6L);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        com.lightstep.tracer.grpc.IngestRequest ingestRequest5 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString3);
        int int6 = ingestRequest5.getSerializedSize();
        int int7 = ingestRequest5.getPointsCount();
        java.util.List<java.lang.String> strList8 = ingestRequest5.findInitializationErrors();
        com.lightstep.tracer.grpc.Reporter reporter9 = ingestRequest5.getReporter();
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.MetricPointOrBuilder metricPointOrBuilder11 = ingestRequest5.getPointsOrBuilder(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertNotNull(ingestRequest5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(reporter9);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        java.lang.Throwable throwable2 = null;
        com.lightstep.tracer.retry.RetryException retryException5 = new com.lightstep.tracer.retry.RetryException("", throwable2, false, true);
        java.lang.Throwable[] throwableArray6 = retryException5.getSuppressed();
        com.lightstep.tracer.retry.RetryException retryException9 = new com.lightstep.tracer.retry.RetryException("lightstep.component_name", (java.lang.Throwable) retryException5, true, false);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        com.google.protobuf.UnknownFieldSet unknownFieldSet3 = metricPoint2.getUnknownFields();
        com.lightstep.tracer.grpc.MetricKind metricKind4 = metricPoint2.getKind();
        int int5 = metricPoint2.getLabelsCount();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertNotNull(unknownFieldSet3);
        org.junit.Assert.assertTrue("'" + metricKind4 + "' != '" + com.lightstep.tracer.grpc.MetricKind.INVALID_METRIC_KIND + "'", metricKind4.equals(com.lightstep.tracer.grpc.MetricKind.INVALID_METRIC_KIND));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        boolean boolean3 = ingestResponse1.equals((java.lang.Object) 1);
        com.lightstep.tracer.grpc.IngestResponse.Builder builder4 = com.lightstep.tracer.grpc.IngestResponse.newBuilder(ingestResponse1);
        com.google.protobuf.Parser<com.lightstep.tracer.grpc.IngestResponse> ingestResponseParser5 = ingestResponse1.getParserForType();
        int int6 = ingestResponse1.getSerializedSize();
        java.lang.String str7 = ingestResponse1.getInitializationErrorString();
        com.lightstep.tracer.grpc.IngestResponse ingestResponse8 = ingestResponse1.getDefaultInstanceForType();
        com.google.protobuf.Parser<com.lightstep.tracer.grpc.IngestResponse> ingestResponseParser9 = ingestResponse1.getParserForType();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(ingestResponseParser5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(ingestResponse8);
        org.junit.Assert.assertNotNull(ingestResponseParser9);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        long long3 = metricPoint2.getUint64Value();
        java.util.List<com.lightstep.tracer.grpc.KeyValue> keyValueList4 = metricPoint2.getLabelsList();
        com.lightstep.tracer.grpc.MetricPoint metricPoint5 = metricPoint2.getDefaultInstanceForType();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(keyValueList4);
        org.junit.Assert.assertNotNull(metricPoint5);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint3 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint4 = metricPoint3.getDefaultInstanceForType();
        java.lang.String str5 = metricPoint3.getInitializationErrorString();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertNotNull(metricPoint3);
        org.junit.Assert.assertNotNull(metricPoint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        int int3 = metricPoint2.getKindValue();
        com.lightstep.tracer.grpc.MetricPoint.ValueCase valueCase4 = metricPoint2.getValueCase();
        com.lightstep.tracer.grpc.MetricPoint.ValueCase valueCase5 = metricPoint2.getValueCase();
        com.lightstep.tracer.grpc.MetricPoint.Builder builder6 = com.lightstep.tracer.grpc.MetricPoint.newBuilder(metricPoint2);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + valueCase4 + "' != '" + com.lightstep.tracer.grpc.MetricPoint.ValueCase.VALUE_NOT_SET + "'", valueCase4.equals(com.lightstep.tracer.grpc.MetricPoint.ValueCase.VALUE_NOT_SET));
        org.junit.Assert.assertTrue("'" + valueCase5 + "' != '" + com.lightstep.tracer.grpc.MetricPoint.ValueCase.VALUE_NOT_SET + "'", valueCase5.equals(com.lightstep.tracer.grpc.MetricPoint.ValueCase.VALUE_NOT_SET));
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        java.io.InputStream inputStream0 = null;
        com.lightstep.tracer.grpc.Reporter reporter1 = com.lightstep.tracer.grpc.Reporter.parseFrom(inputStream0);
        com.google.protobuf.CodedOutputStream codedOutputStream2 = null;
        reporter1.writeTo(codedOutputStream2);
        long long4 = reporter1.getReporterId();
        com.google.protobuf.UnknownFieldSet unknownFieldSet5 = reporter1.getUnknownFields();
        org.junit.Assert.assertNotNull(reporter1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(unknownFieldSet5);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.toBuilder();
        com.google.protobuf.ByteString byteString3 = keyValue0.getKeyBytes();
        com.lightstep.tracer.grpc.KeyValue keyValue4 = com.lightstep.tracer.grpc.KeyValue.parseFrom(byteString3);
        com.lightstep.tracer.grpc.MetricPoint metricPoint5 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteString3);
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(keyValue4);
        org.junit.Assert.assertNotNull(metricPoint5);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        com.lightstep.tracer.grpc.IngestResponse ingestResponse0 = com.lightstep.tracer.grpc.IngestResponse.getDefaultInstance();
        boolean boolean1 = ingestResponse0.isInitialized();
        org.junit.Assert.assertNotNull(ingestResponse0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        com.lightstep.tracer.grpc.MetricPoint.Builder builder0 = com.lightstep.tracer.grpc.MetricPoint.newBuilder();
        com.google.protobuf.ByteString byteString1 = builder0.getMetricNameBytes();
        com.google.protobuf.Timestamp timestamp2 = builder0.getStart();
        long long3 = builder0.getUint64Value();
        java.util.List<? extends com.lightstep.tracer.grpc.KeyValueOrBuilder> wildcardList4 = builder0.getLabelsOrBuilderList();
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValue keyValue6 = builder0.getLabels(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(byteString1);
        org.junit.Assert.assertNotNull(timestamp2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardList4);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.Reporter reporter2 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint3 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint4 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(reporter2);
        org.junit.Assert.assertNotNull(metricPoint3);
        org.junit.Assert.assertNotNull(metricPoint4);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        boolean boolean3 = ingestResponse1.equals((java.lang.Object) 1);
        com.lightstep.tracer.grpc.IngestResponse.Builder builder4 = com.lightstep.tracer.grpc.IngestResponse.newBuilder(ingestResponse1);
        com.google.protobuf.Parser<com.lightstep.tracer.grpc.IngestResponse> ingestResponseParser5 = ingestResponse1.getParserForType();
        int int6 = ingestResponse1.getSerializedSize();
        int int7 = ingestResponse1.getSerializedSize();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(ingestResponseParser5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint3 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        java.util.List<? extends com.lightstep.tracer.grpc.KeyValueOrBuilder> wildcardList4 = metricPoint3.getLabelsOrBuilderList();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertNotNull(metricPoint3);
        org.junit.Assert.assertNotNull(wildcardList4);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        long long3 = metricPoint2.getUint64Value();
        java.util.List<com.lightstep.tracer.grpc.KeyValue> keyValueList4 = metricPoint2.getLabelsList();
        int int5 = metricPoint2.getLabelsCount();
        com.google.protobuf.DurationOrBuilder durationOrBuilder6 = metricPoint2.getDurationOrBuilder();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(keyValueList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(durationOrBuilder6);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.metrics.OkHttpSender okHttpSender5 = new com.lightstep.tracer.metrics.OkHttpSender("component_name", "", "lightstep.guid", "https", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.net.MalformedURLException: no protocol: https");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.google.protobuf.ByteString byteString3 = keyValue0.getJsonValueBytes();
        com.lightstep.tracer.grpc.Reporter reporter4 = com.lightstep.tracer.grpc.Reporter.parseFrom(byteString3);
        com.lightstep.tracer.grpc.IngestRequest ingestRequest5 = com.lightstep.tracer.grpc.IngestRequest.parseFrom(byteString3);
        int int6 = ingestRequest5.getSerializedSize();
        int int7 = ingestRequest5.getPointsCount();
        java.util.List<java.lang.String> strList8 = ingestRequest5.findInitializationErrors();
        java.lang.String str9 = ingestRequest5.getIdempotencyKey();
        com.google.protobuf.ByteString byteString10 = ingestRequest5.getIdempotencyKeyBytes();
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(byteString3);
        org.junit.Assert.assertNotNull(reporter4);
        org.junit.Assert.assertNotNull(ingestRequest5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(byteString10);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        java.lang.String str3 = keyValue0.getStringValue();
        java.lang.String str4 = keyValue0.getKey();
        int int5 = keyValue0.getSerializedSize();
        com.google.protobuf.CodedOutputStream codedOutputStream6 = null;
        keyValue0.writeTo(codedOutputStream6);
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        int int3 = metricPoint2.getKindValue();
        com.lightstep.tracer.grpc.MetricPoint.ValueCase valueCase4 = metricPoint2.getValueCase();
        int int5 = valueCase4.getNumber();
        int int6 = valueCase4.getNumber();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + valueCase4 + "' != '" + com.lightstep.tracer.grpc.MetricPoint.ValueCase.VALUE_NOT_SET + "'", valueCase4.equals(com.lightstep.tracer.grpc.MetricPoint.ValueCase.VALUE_NOT_SET));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        byte[] byteArray0 = new byte[] {};
        com.lightstep.tracer.grpc.IngestResponse ingestResponse1 = com.lightstep.tracer.grpc.IngestResponse.parseFrom(byteArray0);
        com.lightstep.tracer.grpc.MetricPoint metricPoint2 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteArray0);
        int int3 = metricPoint2.getKindValue();
        double double4 = metricPoint2.getDoubleValue();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(ingestResponse1);
        org.junit.Assert.assertNotNull(metricPoint2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        com.lightstep.tracer.grpc.KeyValue keyValue0 = com.lightstep.tracer.grpc.KeyValue.getDefaultInstance();
        java.lang.String str1 = keyValue0.getKey();
        com.lightstep.tracer.grpc.KeyValue.Builder builder2 = keyValue0.newBuilderForType();
        com.lightstep.tracer.grpc.KeyValue keyValue3 = keyValue0.getDefaultInstanceForType();
        com.lightstep.tracer.grpc.KeyValue.Builder builder4 = keyValue3.toBuilder();
        com.google.protobuf.UnknownFieldSet unknownFieldSet5 = builder4.getUnknownFields();
        com.google.protobuf.ByteString byteString6 = builder4.getJsonValueBytes();
        com.lightstep.tracer.grpc.MetricPoint metricPoint7 = com.lightstep.tracer.grpc.MetricPoint.parseFrom(byteString6);
        com.google.protobuf.DurationOrBuilder durationOrBuilder8 = metricPoint7.getDurationOrBuilder();
        // The following exception was thrown during execution in test generation
        try {
            com.lightstep.tracer.grpc.KeyValueOrBuilder keyValueOrBuilder10 = metricPoint7.getLabelsOrBuilder((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValue0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(keyValue3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(unknownFieldSet5);
        org.junit.Assert.assertNotNull(byteString6);
        org.junit.Assert.assertNotNull(metricPoint7);
        org.junit.Assert.assertNotNull(durationOrBuilder8);
    }
}

