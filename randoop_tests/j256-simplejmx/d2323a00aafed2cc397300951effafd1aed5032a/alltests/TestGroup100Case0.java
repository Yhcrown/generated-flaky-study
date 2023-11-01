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
        java.lang.String str0 = org.eclipse.jetty.util.component.AbstractLifeCycle.STOPPED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "STOPPED" + "'", str0, "STOPPED");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.lang.String str0 = org.eclipse.jetty.util.component.AbstractLifeCycle.STOPPING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "STOPPING" + "'", str0, "STOPPING");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.lang.String str0 = org.eclipse.jetty.util.component.AbstractLifeCycle.STARTING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "STARTING" + "'", str0, "STARTING");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo2 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo3 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        com.j256.simplejmx.common.JmxAttributeFieldInfo[] jmxAttributeFieldInfoArray4 = new com.j256.simplejmx.common.JmxAttributeFieldInfo[] { jmxAttributeFieldInfo2, jmxAttributeFieldInfo3 };
        com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray5 = new com.j256.simplejmx.common.JmxAttributeMethodInfo[] {};
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo6 = null;
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray7 = new com.j256.simplejmx.common.JmxOperationInfo[] { jmxOperationInfo6 };
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.server.ReflectionMbean reflectionMbean9 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) '4', "STARTING", jmxAttributeFieldInfoArray4, jmxAttributeMethodInfoArray5, jmxOperationInfoArray7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jmxAttributeFieldInfoArray4);
        org.junit.Assert.assertNotNull(jmxAttributeMethodInfoArray5);
        org.junit.Assert.assertNotNull(jmxOperationInfoArray7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.server.ReflectionMbean reflectionMbean1 = new com.j256.simplejmx.server.ReflectionMbean(publishAllBeanWrapper0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.j256.simplejmx.common.JmxAttributeField jmxAttributeField1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo2 = new com.j256.simplejmx.common.JmxAttributeFieldInfo("STOPPED", jmxAttributeField1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        com.j256.simplejmx.common.IoUtils ioUtils0 = new com.j256.simplejmx.common.IoUtils();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.lang.Appendable appendable0 = null;
        java.util.Collection<?>[] wildcardCollectionArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.eclipse.jetty.util.component.AggregateLifeCycle.dump(appendable0, "hi!", wildcardCollectionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.CommandLineJmxClient commandLineJmxClient1 = new com.j256.simplejmx.client.CommandLineJmxClient("STOPPED");
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: JmxServiceUrl was malformed: STOPPED");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName1 = com.j256.simplejmx.common.ObjectNameUtil.makeObjectName((java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Registered class must either implement JmxSelfNaming or have JmxResource annotation");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.j256.simplejmx.common.JmxResource jmxResource0 = null;
        com.j256.simplejmx.common.BaseJmxSelfNaming baseJmxSelfNaming1 = new com.j256.simplejmx.common.BaseJmxSelfNaming();
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName2 = com.j256.simplejmx.common.ObjectNameUtil.makeObjectName(jmxResource0, (com.j256.simplejmx.common.JmxSelfNaming) baseJmxSelfNaming1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Could not create ObjectName because domain name not specified in getJmxDomainName() nor @JmxResource");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.Appendable appendable0 = null;
        java.util.Collection<?> wildcardCollection2 = null;
        java.util.Collection[] collectionArray4 = new java.util.Collection[1];
        @SuppressWarnings("unchecked")
        java.util.Collection<?>[] wildcardCollectionArray5 = (java.util.Collection<?>[]) collectionArray4;
        wildcardCollectionArray5[0] = wildcardCollection2;
        // The following exception was thrown during execution in test generation
        try {
            org.eclipse.jetty.util.component.AggregateLifeCycle.dump(appendable0, "", wildcardCollectionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collectionArray4);
        org.junit.Assert.assertNotNull(wildcardCollectionArray5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper2 = new com.j256.simplejmx.server.PublishAllBeanWrapper((java.lang.Object) 10.0f, jmxResourceInfo1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.lang.String str0 = org.eclipse.jetty.util.component.AbstractLifeCycle.RUNNING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "RUNNING" + "'", str0, "RUNNING");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer(inetAddress0, (int) (short) 1);
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper3 = new com.j256.simplejmx.server.PublishAllBeanWrapper();
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName4 = jmxServer2.register(publishAllBeanWrapper3);
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: Could not build mbean object for publish-all bean: null");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.j256.simplejmx.common.JmxResource jmxResource0 = null;
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper1 = new com.j256.simplejmx.server.PublishAllBeanWrapper();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo2 = publishAllBeanWrapper1.getJmxResourceInfo();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo3 = null;
        publishAllBeanWrapper1.setJmxResourceInfo(jmxResourceInfo3);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName5 = com.j256.simplejmx.common.ObjectNameUtil.makeObjectName(jmxResource0, (java.lang.Object) publishAllBeanWrapper1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jmxResourceInfo2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.j256.simplejmx.common.BaseJmxSelfNaming baseJmxSelfNaming0 = new com.j256.simplejmx.common.BaseJmxSelfNaming();
        java.lang.String str1 = baseJmxSelfNaming0.getJmxBeanName();
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean3 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) baseJmxSelfNaming0, "hi!");
        javax.management.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reflectionMbean3.setAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper0 = new com.j256.simplejmx.server.PublishAllBeanWrapper();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo1 = publishAllBeanWrapper0.getJmxResourceInfo();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo2 = null;
        publishAllBeanWrapper0.setJmxResourceInfo(jmxResourceInfo2);
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.server.ReflectionMbean reflectionMbean4 = new com.j256.simplejmx.server.ReflectionMbean(publishAllBeanWrapper0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jmxResourceInfo1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo1 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer((int) (byte) 10, (int) (byte) -1);
        jmxServer2.close();
        java.net.InetAddress inetAddress4 = null;
        jmxServer2.setInetAddress(inetAddress4);
        int int6 = jmxServer2.getServerPort();
        java.net.InetAddress inetAddress7 = null;
        com.j256.simplejmx.web.JmxWebServer jmxWebServer9 = new com.j256.simplejmx.web.JmxWebServer(inetAddress7, (int) (byte) 0);
        jmxWebServer9.close();
        // The following exception was thrown during execution in test generation
        try {
            jmxServer2.unregisterThrow((java.lang.Object) jmxWebServer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Registered class must either implement JmxSelfNaming or have JmxResource annotation");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.JmxClient jmxClient4 = new com.j256.simplejmx.client.JmxClient("", "STARTING", "STOPPING", strMap3);
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: JmxServiceUrl was malformed: ");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.web.JmxWebServer jmxWebServer2 = new com.j256.simplejmx.web.JmxWebServer(inetAddress0, (int) (byte) 0);
        jmxWebServer2.close();
        jmxWebServer2.setMinNumThreads((int) (byte) 10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer((int) (byte) 10, (int) (byte) -1);
        jmxServer2.close();
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo4 = new com.j256.simplejmx.common.JmxAttributeMethodInfo();
        // The following exception was thrown during execution in test generation
        try {
            jmxServer2.unregisterThrow((java.lang.Object) jmxAttributeMethodInfo4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Registered class must either implement JmxSelfNaming or have JmxResource annotation");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.web.JmxWebServer jmxWebServer2 = new com.j256.simplejmx.web.JmxWebServer(inetAddress0, (int) (byte) 0);
        jmxWebServer2.setMinNumThreads(0);
        com.j256.simplejmx.common.IoUtils.closeQuietly((java.io.Closeable) jmxWebServer2);
        java.net.InetAddress inetAddress6 = null;
        jmxWebServer2.setServerAddress(inetAddress6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName2 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.JmxClient jmxClient4 = new com.j256.simplejmx.client.JmxClient("hi!", "hi!", "RUNNING", strMap3);
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: JmxServiceUrl was malformed: hi!");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer((int) (byte) 10, (int) (byte) -1);
        jmxServer2.close();
        java.net.InetAddress inetAddress4 = null;
        jmxServer2.setInetAddress(inetAddress4);
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper6 = new com.j256.simplejmx.server.PublishAllBeanWrapper();
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName7 = jmxServer2.register(publishAllBeanWrapper6);
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: Could not build mbean object for publish-all bean: null");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.j256.simplejmx.spring.JmxBean jmxBean0 = new com.j256.simplejmx.spring.JmxBean();
        java.lang.Object obj1 = jmxBean0.getTarget();
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray2 = jmxBean0.getOperationInfos();
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(jmxOperationInfoArray2);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.j256.simplejmx.spring.JmxBean jmxBean0 = new com.j256.simplejmx.spring.JmxBean();
        java.lang.Object obj1 = jmxBean0.getTarget();
        javax.management.MBeanServer mBeanServer2 = null;
        com.j256.simplejmx.server.JmxServer jmxServer3 = new com.j256.simplejmx.server.JmxServer(mBeanServer2);
        jmxBean0.setTarget((java.lang.Object) jmxServer3);
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo5 = jmxBean0.getJmxResourceInfo();
        java.lang.String str6 = com.j256.simplejmx.client.ClientUtils.valueToString((java.lang.Object) jmxResourceInfo5);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(jmxResourceInfo5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.j256.simplejmx.client.JmxClient jmxClient0 = null;
        com.j256.simplejmx.client.CommandLineJmxClient commandLineJmxClient1 = new com.j256.simplejmx.client.CommandLineJmxClient(jmxClient0);
        java.io.File file2 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLineJmxClient1.runBatchFile(file2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.j256.simplejmx.client.ClientUtils clientUtils0 = new com.j256.simplejmx.client.ClientUtils();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.JmxClient jmxClient3 = new com.j256.simplejmx.client.JmxClient("null", "", "null");
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: JmxServiceUrl was malformed: null");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer((int) (byte) 10, (int) (byte) -1);
        jmxServer2.close();
        // The following exception was thrown during execution in test generation
        try {
            jmxServer2.start();
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: Malformed service url created service:jmx:rmi://localhost:-1/jndi/rmi://:10/jmxrmi");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo2 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("STARTING", "STOPPING");
        jmxAttributeMethodInfo2.setDescription("STARTING");
        jmxAttributeMethodInfo2.setDescription("RUNNING");
        jmxAttributeMethodInfo2.setDescription("STARTING");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer(inetAddress0, (int) (short) 1);
        jmxServer2.stopThrow();
        jmxServer2.setServiceUrl("null");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper0 = new com.j256.simplejmx.server.PublishAllBeanWrapper();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo1 = publishAllBeanWrapper0.getJmxResourceInfo();
        publishAllBeanWrapper0.setDelegate((java.lang.Object) (short) 0);
        publishAllBeanWrapper0.setTarget((java.lang.Object) 100.0d);
        org.junit.Assert.assertNull(jmxResourceInfo1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.JmxClient jmxClient4 = new com.j256.simplejmx.client.JmxClient("STARTING", "RUNNING", "", strMap3);
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: JmxServiceUrl was malformed: STARTING");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.web.JmxWebServer jmxWebServer2 = new com.j256.simplejmx.web.JmxWebServer(inetAddress0, (int) (byte) 0);
        jmxWebServer2.setMinNumThreads(0);
        jmxWebServer2.setServerPort((int) (short) 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        com.j256.simplejmx.common.JmxResource jmxResource0 = null;
        com.j256.simplejmx.common.JmxFolderName jmxFolderName5 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName8 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName11 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray12 = new com.j256.simplejmx.common.JmxFolderName[] { jmxFolderName5, jmxFolderName8, jmxFolderName11 };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo14 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "hi!", jmxFolderNameArray12, "");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName15 = com.j256.simplejmx.common.ObjectNameUtil.makeObjectName(jmxResource0, (com.j256.simplejmx.common.JmxSelfNaming) jmxResourceInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid ObjectName generated: STOPPED:STARTING=STOPPING,STARTING=STOPPING,STARTING=STOPPING,name=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jmxFolderNameArray12);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.JmxClient jmxClient1 = new com.j256.simplejmx.client.JmxClient(0);
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: Problems connecting to the serverjava.io.IOException: Failed to retrieve RMIServer stub: javax.naming.ServiceUnavailableException [Root exception is java.rmi.ConnectException: Connection refused to host: 192.168.1.88; nested exception is: ??java.net.ConnectException: Connection refused (Connection refused)]");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName1 = com.j256.simplejmx.common.ObjectNameUtil.makeObjectName("STOPPING");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid ObjectName generated: STOPPING");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo0 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo0.setFieldName("hi!");
        jmxAttributeFieldInfo0.setWritable(false);
        jmxAttributeFieldInfo0.setWritable(true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.lang.String str1 = com.j256.simplejmx.client.ClientUtils.valueToString((java.lang.Object) 100L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100" + "'", str1, "100");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.j256.simplejmx.spring.JmxBean jmxBean0 = new com.j256.simplejmx.spring.JmxBean();
        com.j256.simplejmx.common.JmxFolderName jmxFolderName5 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName8 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName11 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray12 = new com.j256.simplejmx.common.JmxFolderName[] { jmxFolderName5, jmxFolderName8, jmxFolderName11 };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo14 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "hi!", jmxFolderNameArray12, "");
        java.lang.String str15 = jmxResourceInfo14.getJmxDescription();
        jmxBean0.setJmxResourceInfo(jmxResourceInfo14);
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray17 = jmxBean0.getOperationInfos();
        org.junit.Assert.assertNotNull(jmxFolderNameArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jmxOperationInfoArray17);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.j256.simplejmx.spring.JmxBean jmxBean0 = new com.j256.simplejmx.spring.JmxBean();
        java.lang.Object obj1 = jmxBean0.getTarget();
        javax.management.MBeanServer mBeanServer2 = null;
        com.j256.simplejmx.server.JmxServer jmxServer3 = new com.j256.simplejmx.server.JmxServer(mBeanServer2);
        jmxBean0.setTarget((java.lang.Object) jmxServer3);
        int int5 = jmxServer3.getServerPort();
        javax.management.ObjectName objectName7 = null;
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo8 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo9 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo10 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo10.setFieldName("hi!");
        jmxAttributeFieldInfo10.setName("");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo15 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo16 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo16.setFieldName("hi!");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo20 = new com.j256.simplejmx.common.JmxAttributeFieldInfo("");
        com.j256.simplejmx.common.JmxAttributeFieldInfo[] jmxAttributeFieldInfoArray21 = new com.j256.simplejmx.common.JmxAttributeFieldInfo[] { jmxAttributeFieldInfo8, jmxAttributeFieldInfo9, jmxAttributeFieldInfo10, jmxAttributeFieldInfo15, jmxAttributeFieldInfo16, jmxAttributeFieldInfo20 };
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo22 = new com.j256.simplejmx.common.JmxAttributeMethodInfo();
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo25 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("STARTING", "STOPPING");
        jmxAttributeMethodInfo25.setDescription("STARTING");
        jmxAttributeMethodInfo25.setDescription("RUNNING");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo32 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("STARTING", "STOPPING");
        jmxAttributeMethodInfo32.setDescription("STARTING");
        jmxAttributeMethodInfo32.setDescription("RUNNING");
        jmxAttributeMethodInfo32.setDescription("STARTING");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo40 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo43 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("hi!", "null");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo46 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("hi!", "null");
        com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray47 = new com.j256.simplejmx.common.JmxAttributeMethodInfo[] { jmxAttributeMethodInfo22, jmxAttributeMethodInfo25, jmxAttributeMethodInfo32, jmxAttributeMethodInfo40, jmxAttributeMethodInfo43, jmxAttributeMethodInfo46 };
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo48 = null;
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray49 = new com.j256.simplejmx.common.JmxOperationInfo[] { jmxOperationInfo48 };
        // The following exception was thrown during execution in test generation
        try {
            jmxServer3.register((java.lang.Object) (short) 1, objectName7, jmxAttributeFieldInfoArray21, jmxAttributeMethodInfoArray47, jmxOperationInfoArray49);
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: JmxServer has not be started");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(jmxAttributeFieldInfoArray21);
        org.junit.Assert.assertNotNull(jmxAttributeMethodInfoArray47);
        org.junit.Assert.assertNotNull(jmxOperationInfoArray49);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.JmxClient jmxClient3 = new com.j256.simplejmx.client.JmxClient("100", "hi!", "STARTING");
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: JmxServiceUrl was malformed: 100");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName4 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName7 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName10 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray11 = new com.j256.simplejmx.common.JmxFolderName[] { jmxFolderName4, jmxFolderName7, jmxFolderName10 };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo13 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "hi!", jmxFolderNameArray11, "");
        java.lang.String str14 = jmxResourceInfo13.getJmxDescription();
        jmxResourceInfo13.setJmxDomainName("");
        jmxResourceInfo13.setJmxBeanName("null");
        org.junit.Assert.assertNotNull(jmxFolderNameArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer((int) (byte) 10, (int) (byte) -1);
        java.lang.Object obj3 = null;
        com.j256.simplejmx.common.JmxFolderName jmxFolderName8 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName11 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName14 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray15 = new com.j256.simplejmx.common.JmxFolderName[] { jmxFolderName8, jmxFolderName11, jmxFolderName14 };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo17 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "hi!", jmxFolderNameArray15, "");
        java.lang.String str18 = jmxResourceInfo17.getJmxDescription();
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo19 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        boolean boolean20 = jmxAttributeFieldInfo19.isReadible();
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo21 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo21.setFieldName("hi!");
        jmxAttributeFieldInfo21.setWritable(false);
        jmxAttributeFieldInfo21.setWritable(true);
        com.j256.simplejmx.common.JmxAttributeFieldInfo[] jmxAttributeFieldInfoArray28 = new com.j256.simplejmx.common.JmxAttributeFieldInfo[] { jmxAttributeFieldInfo19, jmxAttributeFieldInfo21 };
        com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray29 = new com.j256.simplejmx.common.JmxAttributeMethodInfo[] {};
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray30 = new com.j256.simplejmx.common.JmxOperationInfo[] {};
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName31 = jmxServer2.register(obj3, jmxResourceInfo17, jmxAttributeFieldInfoArray28, jmxAttributeMethodInfoArray29, jmxOperationInfoArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid ObjectName generated: STOPPED:STARTING=STOPPING,STARTING=STOPPING,STARTING=STOPPING,name=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jmxFolderNameArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jmxAttributeFieldInfoArray28);
        org.junit.Assert.assertNotNull(jmxAttributeMethodInfoArray29);
        org.junit.Assert.assertNotNull(jmxOperationInfoArray30);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.JmxClient jmxClient2 = new com.j256.simplejmx.client.JmxClient("hi!", strMap1);
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: JmxServiceUrl was malformed: hi!");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.j256.simplejmx.web.JmxWebServer jmxWebServer0 = new com.j256.simplejmx.web.JmxWebServer();
        jmxWebServer0.setServerPort((int) (byte) 1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer(inetAddress0, (int) (short) 1);
        int int3 = jmxServer2.getRegistryPort();
        jmxServer2.setRegistryPort((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.lang.String str2 = com.j256.simplejmx.client.ClientUtils.displayType("STOPPING", (java.lang.Object) (-1L));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "STOPPING" + "'", str2, "STOPPING");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.j256.simplejmx.common.BaseJmxSelfNaming baseJmxSelfNaming0 = new com.j256.simplejmx.common.BaseJmxSelfNaming();
        java.lang.String str1 = baseJmxSelfNaming0.getJmxBeanName();
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean3 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) baseJmxSelfNaming0, "hi!");
        javax.management.MBeanInfo mBeanInfo4 = reflectionMbean3.getMBeanInfo();
        javax.management.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            reflectionMbean3.setAttribute(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(mBeanInfo4);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer((int) (byte) 10, (int) (byte) -1);
        jmxServer2.close();
        java.net.InetAddress inetAddress4 = null;
        jmxServer2.setInetAddress(inetAddress4);
        jmxServer2.setServiceUrl("100");
        // The following exception was thrown during execution in test generation
        try {
            jmxServer2.unregisterThrow((java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Registered class must either implement JmxSelfNaming or have JmxResource annotation");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer((int) (byte) 10, (int) (byte) -1);
        jmxServer2.setServiceUrl("RUNNING");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.JmxClient jmxClient1 = new com.j256.simplejmx.client.JmxClient("null");
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: JmxServiceUrl was malformed: null");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.j256.simplejmx.spring.JmxBean jmxBean0 = new com.j256.simplejmx.spring.JmxBean();
        java.lang.Object obj1 = jmxBean0.getTarget();
        com.j256.simplejmx.common.JmxAttributeFieldInfo[] jmxAttributeFieldInfoArray2 = jmxBean0.getAttributeFieldInfos();
        com.j256.simplejmx.common.JmxAttributeFieldInfo[] jmxAttributeFieldInfoArray3 = jmxBean0.getAttributeFieldInfos();
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(jmxAttributeFieldInfoArray2);
        org.junit.Assert.assertNull(jmxAttributeFieldInfoArray3);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        com.j256.simplejmx.server.JmxServer jmxServer0 = new com.j256.simplejmx.server.JmxServer();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        java.net.InetAddress inetAddress0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.JmxClient jmxClient2 = new com.j256.simplejmx.client.JmxClient(inetAddress0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean2 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) (-1), "hi!");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName8 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName11 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName14 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray15 = new com.j256.simplejmx.common.JmxFolderName[] { jmxFolderName8, jmxFolderName11, jmxFolderName14 };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo17 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "hi!", jmxFolderNameArray15, "");
        java.lang.String str18 = jmxResourceInfo17.getJmxDescription();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray19 = jmxResourceInfo17.getJmxFolderNames();
        java.lang.String[] strArray24 = new java.lang.String[] { "STOPPED", "hi!" };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo26 = new com.j256.simplejmx.common.JmxResourceInfo("RUNNING", "STARTING", strArray24, "STOPPED");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = reflectionMbean2.invoke("", (java.lang.Object[]) jmxFolderNameArray19, strArray24);
            org.junit.Assert.fail("Expected exception of type javax.management.MBeanException; message: null");
        } catch (javax.management.MBeanException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jmxFolderNameArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(jmxFolderNameArray19);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.j256.simplejmx.common.JmxOperation jmxOperation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo2 = new com.j256.simplejmx.common.JmxOperationInfo("", jmxOperation1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        org.eclipse.jetty.util.component.LifeCycle lifeCycle0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.eclipse.jetty.util.component.AbstractLifeCycle.getState(lifeCycle0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.web.JmxWebServer jmxWebServer2 = new com.j256.simplejmx.web.JmxWebServer(inetAddress0, (int) (byte) 0);
        jmxWebServer2.setMinNumThreads(0);
        jmxWebServer2.setMaxNumThreads((int) (byte) 1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.j256.simplejmx.common.BaseJmxSelfNaming baseJmxSelfNaming0 = new com.j256.simplejmx.common.BaseJmxSelfNaming();
        java.lang.String str1 = baseJmxSelfNaming0.getJmxBeanName();
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo3 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        boolean boolean4 = jmxAttributeFieldInfo3.isReadible();
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo5 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo5.setFieldName("hi!");
        jmxAttributeFieldInfo5.setName("null");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo10 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo10.setReadible(false);
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo13 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo13.setFieldName("hi!");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo16 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo16.setFieldName("hi!");
        jmxAttributeFieldInfo16.setName("null");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo21 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        com.j256.simplejmx.common.JmxAttributeFieldInfo[] jmxAttributeFieldInfoArray22 = new com.j256.simplejmx.common.JmxAttributeFieldInfo[] { jmxAttributeFieldInfo3, jmxAttributeFieldInfo5, jmxAttributeFieldInfo10, jmxAttributeFieldInfo13, jmxAttributeFieldInfo16, jmxAttributeFieldInfo21 };
        com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray23 = null;
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray24 = new com.j256.simplejmx.common.JmxOperationInfo[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.server.ReflectionMbean reflectionMbean26 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) str1, "RUNNING", jmxAttributeFieldInfoArray22, jmxAttributeMethodInfoArray23, jmxOperationInfoArray24, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jmxAttributeFieldInfoArray22);
        org.junit.Assert.assertNotNull(jmxOperationInfoArray24);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.lang.String[] strArray2 = null;
        javax.management.ObjectName objectName3 = com.j256.simplejmx.common.ObjectNameUtil.makeObjectName("STARTING", "STARTING", strArray2);
        org.junit.Assert.assertNotNull(objectName3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer(inetAddress0, (int) (short) 1);
        int int3 = jmxServer2.getServerPort();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.j256.simplejmx.server.JmxServer jmxServer1 = new com.j256.simplejmx.server.JmxServer((int) (byte) 1);
        jmxServer1.close();
// flaky:         jmxServer1.start();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.net.InetAddress inetAddress0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.CommandLineJmxClient commandLineJmxClient2 = new com.j256.simplejmx.client.CommandLineJmxClient(inetAddress0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName4 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName7 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName10 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray11 = new com.j256.simplejmx.common.JmxFolderName[] { jmxFolderName4, jmxFolderName7, jmxFolderName10 };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo13 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "hi!", jmxFolderNameArray11, "");
        java.lang.String str14 = jmxResourceInfo13.getJmxDescription();
        java.lang.String str15 = jmxResourceInfo13.getJmxDomainName();
        jmxResourceInfo13.setJmxDomainName("STOPPED");
        org.junit.Assert.assertNotNull(jmxFolderNameArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "STOPPED" + "'", str15, "STOPPED");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.j256.simplejmx.spring.JmxBean jmxBean0 = new com.j256.simplejmx.spring.JmxBean();
        java.lang.Object obj1 = jmxBean0.getTarget();
        jmxBean0.setTarget((java.lang.Object) 100.0f);
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo4 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo4.setName("RUNNING");
        jmxBean0.setTarget((java.lang.Object) "RUNNING");
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.j256.simplejmx.common.JmxAttributeMethod jmxAttributeMethod1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo2 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("hi!", jmxAttributeMethod1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.lang.Appendable appendable0 = null;
        java.util.Collection<?> wildcardCollection2 = null;
        java.util.Collection[] collectionArray4 = new java.util.Collection[1];
        @SuppressWarnings("unchecked")
        java.util.Collection<?>[] wildcardCollectionArray5 = (java.util.Collection<?>[]) collectionArray4;
        wildcardCollectionArray5[0] = wildcardCollection2;
        // The following exception was thrown during execution in test generation
        try {
            org.eclipse.jetty.util.component.AggregateLifeCycle.dump(appendable0, "RUNNING", wildcardCollectionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collectionArray4);
        org.junit.Assert.assertNotNull(wildcardCollectionArray5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer(inetAddress0, 100);
        com.j256.simplejmx.common.JmxFolderName jmxFolderName8 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName11 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName14 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray15 = new com.j256.simplejmx.common.JmxFolderName[] { jmxFolderName8, jmxFolderName11, jmxFolderName14 };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo17 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "hi!", jmxFolderNameArray15, "");
        java.lang.String str18 = jmxResourceInfo17.getJmxDescription();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray19 = jmxResourceInfo17.getJmxFolderNames();
        com.j256.simplejmx.common.JmxAttributeFieldInfo[] jmxAttributeFieldInfoArray20 = new com.j256.simplejmx.common.JmxAttributeFieldInfo[] {};
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo23 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("hi!", "null");
        jmxAttributeMethodInfo23.setMethodName("");
        com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray26 = new com.j256.simplejmx.common.JmxAttributeMethodInfo[] { jmxAttributeMethodInfo23 };
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo28 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo30 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        java.lang.String[] strArray35 = new java.lang.String[] { "STOPPED", "hi!" };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo37 = new com.j256.simplejmx.common.JmxResourceInfo("RUNNING", "STARTING", strArray35, "STOPPED");
        jmxOperationInfo30.setParameterDescriptions(strArray35);
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo40 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo42 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray43 = new com.j256.simplejmx.common.JmxOperationInfo[] { jmxOperationInfo28, jmxOperationInfo30, jmxOperationInfo40, jmxOperationInfo42 };
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName44 = jmxServer2.register((java.lang.Object) "", jmxResourceInfo17, jmxAttributeFieldInfoArray20, jmxAttributeMethodInfoArray26, jmxOperationInfoArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid ObjectName generated: STOPPED:STARTING=STOPPING,STARTING=STOPPING,STARTING=STOPPING,name=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jmxFolderNameArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(jmxFolderNameArray19);
        org.junit.Assert.assertNotNull(jmxAttributeFieldInfoArray20);
        org.junit.Assert.assertNotNull(jmxAttributeMethodInfoArray26);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(jmxOperationInfoArray43);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo1 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        jmxOperationInfo1.setMethodName("STOPPING");
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo5 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        java.lang.String[] strArray10 = new java.lang.String[] { "STOPPED", "hi!" };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo12 = new com.j256.simplejmx.common.JmxResourceInfo("RUNNING", "STARTING", strArray10, "STOPPED");
        jmxOperationInfo5.setParameterDescriptions(strArray10);
        jmxOperationInfo1.setParameterDescriptions(strArray10);
        jmxOperationInfo1.setMethodName("null");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.lang.String str2 = com.j256.simplejmx.client.JmxClient.generalJmxUrlForHostNamePort("null", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "service:jmx:rmi:///jndi/rmi://null:100/jmxrmi" + "'", str2, "service:jmx:rmi:///jndi/rmi://null:100/jmxrmi");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo0 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        boolean boolean1 = jmxAttributeFieldInfo0.isReadible();
        java.lang.String str2 = jmxAttributeFieldInfo0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null(r)" + "'", str2, "null(r)");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.j256.simplejmx.common.BaseJmxSelfNaming baseJmxSelfNaming0 = new com.j256.simplejmx.common.BaseJmxSelfNaming();
        java.lang.String str1 = baseJmxSelfNaming0.getJmxBeanName();
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean3 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) baseJmxSelfNaming0, "hi!");
        javax.management.MBeanInfo mBeanInfo4 = reflectionMbean3.getMBeanInfo();
        javax.management.AttributeList attributeList5 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.management.AttributeList attributeList6 = reflectionMbean3.setAttributes(attributeList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(mBeanInfo4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.j256.simplejmx.common.BaseJmxSelfNaming baseJmxSelfNaming0 = new com.j256.simplejmx.common.BaseJmxSelfNaming();
        java.lang.String str1 = baseJmxSelfNaming0.getJmxBeanName();
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean3 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) baseJmxSelfNaming0, "hi!");
        java.lang.String str4 = baseJmxSelfNaming0.getJmxBeanName();
        java.lang.String str5 = baseJmxSelfNaming0.getJmxBeanName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo1 = new com.j256.simplejmx.common.JmxAttributeFieldInfo("");
        java.lang.String str2 = jmxAttributeFieldInfo1.getFieldName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo0 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo0.setReadible(false);
        jmxAttributeFieldInfo0.setWritable(false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.CommandLineJmxClient commandLineJmxClient2 = new com.j256.simplejmx.client.CommandLineJmxClient("", (int) ' ');
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: Problems connecting to the serverjava.io.IOException: Failed to retrieve RMIServer stub: javax.naming.ServiceUnavailableException [Root exception is java.rmi.ConnectException: Connection refused to host: 192.168.1.88; nested exception is: ??java.net.ConnectException: Connection refused (Connection refused)]");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.j256.simplejmx.web.JmxWebServer jmxWebServer1 = new com.j256.simplejmx.web.JmxWebServer((int) '4');
        jmxWebServer1.stop();
        jmxWebServer1.setServerPort((int) (byte) 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo0 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo0.setFieldName("hi!");
        jmxAttributeFieldInfo0.setName("null");
        jmxAttributeFieldInfo0.setDescription("STOPPING");
        java.lang.Class<?> wildcardClass7 = jmxAttributeFieldInfo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo1 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        jmxOperationInfo1.setMethodName("STOPPING");
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo5 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        java.lang.String[] strArray10 = new java.lang.String[] { "STOPPED", "hi!" };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo12 = new com.j256.simplejmx.common.JmxResourceInfo("RUNNING", "STARTING", strArray10, "STOPPED");
        jmxOperationInfo5.setParameterDescriptions(strArray10);
        jmxOperationInfo1.setParameterDescriptions(strArray10);
        java.lang.String str15 = jmxOperationInfo1.getMethodName();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "STOPPING" + "'", str15, "STOPPING");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.web.JmxWebServer jmxWebServer2 = new com.j256.simplejmx.web.JmxWebServer(inetAddress0, (int) (byte) 0);
        jmxWebServer2.setMinNumThreads(0);
        com.j256.simplejmx.common.IoUtils.closeQuietly((java.io.Closeable) jmxWebServer2);
        jmxWebServer2.close();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.server.ReflectionMbean reflectionMbean2 = new com.j256.simplejmx.server.ReflectionMbean(obj0, "STOPPING");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        com.j256.simplejmx.spring.JmxBean jmxBean0 = new com.j256.simplejmx.spring.JmxBean();
        com.j256.simplejmx.common.JmxFolderName jmxFolderName5 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName8 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName11 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray12 = new com.j256.simplejmx.common.JmxFolderName[] { jmxFolderName5, jmxFolderName8, jmxFolderName11 };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo14 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "hi!", jmxFolderNameArray12, "");
        java.lang.String str15 = jmxResourceInfo14.getJmxDescription();
        jmxBean0.setJmxResourceInfo(jmxResourceInfo14);
        java.lang.String str17 = jmxResourceInfo14.getJmxDescription();
        org.junit.Assert.assertNotNull(jmxFolderNameArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.net.InetAddress inetAddress0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.CommandLineJmxClient commandLineJmxClient2 = new com.j256.simplejmx.client.CommandLineJmxClient(inetAddress0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo2 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("STARTING", "STOPPING");
        jmxAttributeMethodInfo2.setDescription("STARTING");
        jmxAttributeMethodInfo2.setDescription("RUNNING");
        jmxAttributeMethodInfo2.setMethodName("service:jmx:rmi:///jndi/rmi://null:100/jmxrmi");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.j256.simplejmx.common.BaseJmxSelfNaming baseJmxSelfNaming2 = new com.j256.simplejmx.common.BaseJmxSelfNaming();
        java.lang.String str3 = baseJmxSelfNaming2.getJmxBeanName();
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean5 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) baseJmxSelfNaming2, "hi!");
        java.lang.String[] strArray9 = new java.lang.String[] { "null(r)", "null", "100" };
        javax.management.AttributeList attributeList10 = reflectionMbean5.getAttributes(strArray9);
        javax.management.ObjectName objectName11 = com.j256.simplejmx.common.ObjectNameUtil.makeObjectName("STARTING", "STOPPING", strArray9);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(attributeList10);
        org.junit.Assert.assertNotNull(objectName11);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.j256.simplejmx.spring.JmxBean jmxBean0 = new com.j256.simplejmx.spring.JmxBean();
        java.lang.Object obj1 = jmxBean0.getTarget();
        javax.management.MBeanServer mBeanServer2 = null;
        com.j256.simplejmx.server.JmxServer jmxServer3 = new com.j256.simplejmx.server.JmxServer(mBeanServer2);
        jmxBean0.setTarget((java.lang.Object) jmxServer3);
        jmxBean0.setAttributeFieldNames("service:jmx:rmi:///jndi/rmi://null:100/jmxrmi");
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.j256.simplejmx.common.BaseJmxSelfNaming baseJmxSelfNaming2 = new com.j256.simplejmx.common.BaseJmxSelfNaming();
        java.lang.String str3 = baseJmxSelfNaming2.getJmxBeanName();
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean5 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) baseJmxSelfNaming2, "hi!");
        java.lang.String[] strArray9 = new java.lang.String[] { "null(r)", "null", "100" };
        javax.management.AttributeList attributeList10 = reflectionMbean5.getAttributes(strArray9);
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo12 = new com.j256.simplejmx.common.JmxResourceInfo("null", "null", strArray9, "STARTING");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(attributeList10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo1 = new com.j256.simplejmx.common.JmxAttributeFieldInfo("hi!");
        java.lang.String str2 = jmxAttributeFieldInfo1.getDescription();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper0 = new com.j256.simplejmx.server.PublishAllBeanWrapper();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo1 = publishAllBeanWrapper0.getJmxResourceInfo();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo2 = null;
        publishAllBeanWrapper0.setJmxResourceInfo(jmxResourceInfo2);
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray4 = publishAllBeanWrapper0.getOperationInfos();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jmxResourceInfo1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.JmxClient jmxClient3 = new com.j256.simplejmx.client.JmxClient("STARTING", "RUNNING", "service:jmx:rmi:///jndi/rmi://null:100/jmxrmi");
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: JmxServiceUrl was malformed: STARTING");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName2 = new com.j256.simplejmx.common.JmxFolderName("", "RUNNING");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.web.JmxWebServer jmxWebServer2 = new com.j256.simplejmx.web.JmxWebServer(inetAddress0, (int) (byte) 0);
        jmxWebServer2.setServerPort((int) (byte) 100);
        jmxWebServer2.setMaxNumThreads(0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName4 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName7 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName10 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray11 = new com.j256.simplejmx.common.JmxFolderName[] { jmxFolderName4, jmxFolderName7, jmxFolderName10 };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo13 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "hi!", jmxFolderNameArray11, "");
        java.lang.String str14 = jmxResourceInfo13.getJmxDescription();
        java.lang.String str15 = jmxResourceInfo13.getJmxDescription();
        java.lang.String str16 = jmxResourceInfo13.getJmxBeanName();
        org.junit.Assert.assertNotNull(jmxFolderNameArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo1 = new com.j256.simplejmx.common.JmxOperationInfo("100");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo0 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo0.setFieldName("hi!");
        jmxAttributeFieldInfo0.setName("");
        java.lang.String str5 = com.j256.simplejmx.client.ClientUtils.valueToString((java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.CommandLineJmxClient commandLineJmxClient1 = new com.j256.simplejmx.client.CommandLineJmxClient("service:jmx:rmi:///jndi/rmi://null:100/jmxrmi");
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: Problems connecting to the serverjava.io.IOException: Failed to retrieve RMIServer stub: javax.naming.ServiceUnavailableException [Root exception is java.rmi.ConnectException: Connection refused to host: null; nested exception is: ??java.net.ConnectException: Connection refused (Connection refused)]");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.j256.simplejmx.common.BaseJmxSelfNaming baseJmxSelfNaming0 = new com.j256.simplejmx.common.BaseJmxSelfNaming();
        java.lang.String str1 = baseJmxSelfNaming0.getJmxBeanName();
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean3 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) baseJmxSelfNaming0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName4 = com.j256.simplejmx.common.ObjectNameUtil.makeObjectName((com.j256.simplejmx.common.JmxSelfNaming) baseJmxSelfNaming0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Could not create ObjectName because domain name not specified in getJmxDomainName() nor @JmxResource");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer((int) (byte) 100, 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.j256.simplejmx.server.JmxServer jmxServer1 = new com.j256.simplejmx.server.JmxServer(true);
        javax.management.ObjectName objectName4 = com.j256.simplejmx.common.ObjectNameUtil.makeObjectName("RUNNING", "null");
        // The following exception was thrown during execution in test generation
        try {
            jmxServer1.unregisterThrow(objectName4);
            org.junit.Assert.fail("Expected exception of type javax.management.InstanceNotFoundException; message: RUNNING:name=null");
        } catch (javax.management.InstanceNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectName4);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo1 = new com.j256.simplejmx.common.JmxOperationInfo("null");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.j256.simplejmx.common.JmxResource jmxResource0 = null;
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName3 = com.j256.simplejmx.common.ObjectNameUtil.makeObjectName(jmxResource0, (java.lang.Object) jmxServer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo0 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo0.setName("RUNNING");
        jmxAttributeFieldInfo0.setFieldName("hi!");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.j256.simplejmx.server.JmxServer jmxServer1 = new com.j256.simplejmx.server.JmxServer((int) (byte) 1);
        jmxServer1.close();
        java.rmi.server.RMIServerSocketFactory rMIServerSocketFactory3 = null;
        jmxServer1.setServerSocketFactory(rMIServerSocketFactory3);
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper5 = new com.j256.simplejmx.server.PublishAllBeanWrapper();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo6 = publishAllBeanWrapper5.getJmxResourceInfo();
        publishAllBeanWrapper5.setDelegate((java.lang.Object) (short) 0);
        com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray9 = publishAllBeanWrapper5.getAttributeMethodInfos();
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName10 = jmxServer1.register((java.lang.Object) publishAllBeanWrapper5);
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: JmxServer has not be started");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jmxResourceInfo6);
        org.junit.Assert.assertNotNull(jmxAttributeMethodInfoArray9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.web.JmxWebServer jmxWebServer2 = new com.j256.simplejmx.web.JmxWebServer(inetAddress0, 1);
        jmxWebServer2.setMaxNumThreads(100);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.JmxClient jmxClient4 = new com.j256.simplejmx.client.JmxClient("hi!", (int) ' ', "null(r)", "STOPPING");
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: Problems connecting to the serverjava.io.IOException: Failed to retrieve RMIServer stub: javax.naming.InvalidNameException: invalid authority: hi!:32 [Root exception is java.lang.IllegalArgumentException: invalid authority: hi!:32]");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        javax.management.MBeanServer mBeanServer0 = null;
        com.j256.simplejmx.server.JmxServer jmxServer1 = new com.j256.simplejmx.server.JmxServer(mBeanServer0);
        java.rmi.server.RMIServerSocketFactory rMIServerSocketFactory2 = null;
        jmxServer1.setServerSocketFactory(rMIServerSocketFactory2);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.j256.simplejmx.spring.JmxBean jmxBean0 = new com.j256.simplejmx.spring.JmxBean();
        java.lang.Object obj1 = jmxBean0.getTarget();
        javax.management.MBeanServer mBeanServer2 = null;
        com.j256.simplejmx.server.JmxServer jmxServer3 = new com.j256.simplejmx.server.JmxServer(mBeanServer2);
        jmxBean0.setTarget((java.lang.Object) jmxServer3);
        java.lang.Object obj5 = jmxBean0.getTarget();
        com.j256.simplejmx.common.JmxAttributeFieldInfo[] jmxAttributeFieldInfoArray6 = jmxBean0.getAttributeFieldInfos();
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(jmxAttributeFieldInfoArray6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo1 = new com.j256.simplejmx.common.JmxAttributeFieldInfo("STOPPING");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper0 = new com.j256.simplejmx.server.PublishAllBeanWrapper();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo1 = publishAllBeanWrapper0.getJmxResourceInfo();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo2 = publishAllBeanWrapper0.getJmxResourceInfo();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo3 = publishAllBeanWrapper0.getJmxResourceInfo();
        org.junit.Assert.assertNull(jmxResourceInfo1);
        org.junit.Assert.assertNull(jmxResourceInfo2);
        org.junit.Assert.assertNull(jmxResourceInfo3);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        org.eclipse.jetty.util.component.Dumpable dumpable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.eclipse.jetty.util.component.AggregateLifeCycle.dump(dumpable0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.CommandLineJmxClient commandLineJmxClient1 = new com.j256.simplejmx.client.CommandLineJmxClient((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: Problems connecting to the serverjava.io.IOException: Failed to retrieve RMIServer stub: javax.naming.ServiceUnavailableException [Root exception is java.rmi.ConnectException: Connection refused to host: 192.168.1.88; nested exception is: ??java.net.ConnectException: Connection refused (Connection refused)]");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.j256.simplejmx.common.JmxResource jmxResource0 = null;
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper1 = new com.j256.simplejmx.server.PublishAllBeanWrapper();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo2 = null;
        publishAllBeanWrapper1.setJmxResourceInfo(jmxResourceInfo2);
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo4 = new com.j256.simplejmx.common.JmxResourceInfo();
        publishAllBeanWrapper1.setJmxResourceInfo(jmxResourceInfo4);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName6 = com.j256.simplejmx.common.ObjectNameUtil.makeObjectName(jmxResource0, (com.j256.simplejmx.common.JmxSelfNaming) jmxResourceInfo4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Could not create ObjectName because domain name not specified in getJmxDomainName() nor @JmxResource");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo2 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("hi!", "null");
        jmxAttributeMethodInfo2.setMethodName("");
        jmxAttributeMethodInfo2.setDescription("100");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo0 = new com.j256.simplejmx.common.JmxResourceInfo();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray1 = jmxResourceInfo0.getJmxFolderNames();
        java.lang.String str2 = jmxResourceInfo0.getJmxBeanName();
        java.lang.String str3 = jmxResourceInfo0.getJmxBeanName();
        org.junit.Assert.assertNull(jmxFolderNameArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper0 = new com.j256.simplejmx.server.PublishAllBeanWrapper();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo1 = publishAllBeanWrapper0.getJmxResourceInfo();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo2 = publishAllBeanWrapper0.getJmxResourceInfo();
        java.lang.Object obj3 = publishAllBeanWrapper0.getTarget();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo4 = publishAllBeanWrapper0.getJmxResourceInfo();
        org.junit.Assert.assertNull(jmxResourceInfo1);
        org.junit.Assert.assertNull(jmxResourceInfo2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(jmxResourceInfo4);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.lang.String[] strArray4 = new java.lang.String[] { "STOPPED", "hi!" };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo6 = new com.j256.simplejmx.common.JmxResourceInfo("RUNNING", "STARTING", strArray4, "STOPPED");
        java.lang.String str7 = jmxResourceInfo6.getJmxBeanName();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "STARTING" + "'", str7, "STARTING");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.lang.String[] strArray5 = new java.lang.String[] { "STOPPED", "hi!" };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo7 = new com.j256.simplejmx.common.JmxResourceInfo("RUNNING", "STARTING", strArray5, "STOPPED");
        java.lang.String str8 = jmxResourceInfo7.getJmxBeanName();
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper9 = new com.j256.simplejmx.server.PublishAllBeanWrapper((java.lang.Object) "STOPPING", jmxResourceInfo7);
        com.j256.simplejmx.common.JmxAttributeFieldInfo[] jmxAttributeFieldInfoArray10 = publishAllBeanWrapper9.getAttributeFieldInfos();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo11 = publishAllBeanWrapper9.getJmxResourceInfo();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "STARTING" + "'", str8, "STARTING");
        org.junit.Assert.assertNotNull(jmxAttributeFieldInfoArray10);
        org.junit.Assert.assertNotNull(jmxResourceInfo11);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.j256.simplejmx.spring.JmxBean jmxBean0 = new com.j256.simplejmx.spring.JmxBean();
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray1 = jmxBean0.getOperationInfos();
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo4 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("hi!", "null");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo7 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("STARTING", "STOPPING");
        jmxAttributeMethodInfo7.setDescription("STARTING");
        jmxAttributeMethodInfo7.setDescription("RUNNING");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo14 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("STARTING", "STOPPING");
        jmxAttributeMethodInfo14.setDescription("STARTING");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo19 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("STARTING", "STOPPING");
        jmxAttributeMethodInfo19.setDescription("STARTING");
        jmxAttributeMethodInfo19.setDescription("RUNNING");
        com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray24 = new com.j256.simplejmx.common.JmxAttributeMethodInfo[] { jmxAttributeMethodInfo4, jmxAttributeMethodInfo7, jmxAttributeMethodInfo14, jmxAttributeMethodInfo19 };
        jmxBean0.setAttributeMethodInfos(jmxAttributeMethodInfoArray24);
        com.j256.simplejmx.spring.JmxBean jmxBean26 = new com.j256.simplejmx.spring.JmxBean();
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray27 = jmxBean26.getOperationInfos();
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo30 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("hi!", "null");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo33 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("STARTING", "STOPPING");
        jmxAttributeMethodInfo33.setDescription("STARTING");
        jmxAttributeMethodInfo33.setDescription("RUNNING");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo40 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("STARTING", "STOPPING");
        jmxAttributeMethodInfo40.setDescription("STARTING");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo45 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("STARTING", "STOPPING");
        jmxAttributeMethodInfo45.setDescription("STARTING");
        jmxAttributeMethodInfo45.setDescription("RUNNING");
        com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray50 = new com.j256.simplejmx.common.JmxAttributeMethodInfo[] { jmxAttributeMethodInfo30, jmxAttributeMethodInfo33, jmxAttributeMethodInfo40, jmxAttributeMethodInfo45 };
        jmxBean26.setAttributeMethodInfos(jmxAttributeMethodInfoArray50);
        jmxBean0.setAttributeMethodInfos(jmxAttributeMethodInfoArray50);
        com.j256.simplejmx.common.JmxOperationInfo.OperationAction operationAction53 = com.j256.simplejmx.common.JmxOperationInfo.OperationAction.INFO;
        int int54 = operationAction53.getActionValue();
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo56 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo56.setFieldName("hi!");
        jmxAttributeFieldInfo56.setWritable(false);
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo65 = new com.j256.simplejmx.common.JmxAttributeFieldInfo("", false, false, "STARTING");
        java.lang.String str66 = jmxAttributeFieldInfo65.getFieldName();
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo67 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo67.setFieldName("hi!");
        jmxAttributeFieldInfo67.setName("");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo72 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo72.setFieldName("hi!");
        jmxAttributeFieldInfo72.setName("null");
        jmxAttributeFieldInfo72.setDescription("STOPPING");
        java.lang.String str79 = jmxAttributeFieldInfo72.getDescription();
        com.j256.simplejmx.common.JmxAttributeFieldInfo[] jmxAttributeFieldInfoArray80 = new com.j256.simplejmx.common.JmxAttributeFieldInfo[] { jmxAttributeFieldInfo56, jmxAttributeFieldInfo65, jmxAttributeFieldInfo67, jmxAttributeFieldInfo72 };
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo83 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("hi!", "null");
        jmxAttributeMethodInfo83.setMethodName("");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo87 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("");
        com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray88 = new com.j256.simplejmx.common.JmxAttributeMethodInfo[] { jmxAttributeMethodInfo83, jmxAttributeMethodInfo87 };
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray89 = new com.j256.simplejmx.common.JmxOperationInfo[] {};
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean91 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) int54, "service:jmx:rmi:///jndi/rmi://null:100/jmxrmi", jmxAttributeFieldInfoArray80, jmxAttributeMethodInfoArray88, jmxOperationInfoArray89, true);
        jmxBean0.setOperationInfos(jmxOperationInfoArray89);
        org.junit.Assert.assertNull(jmxOperationInfoArray1);
        org.junit.Assert.assertNotNull(jmxAttributeMethodInfoArray24);
        org.junit.Assert.assertNull(jmxOperationInfoArray27);
        org.junit.Assert.assertNotNull(jmxAttributeMethodInfoArray50);
        org.junit.Assert.assertTrue("'" + operationAction53 + "' != '" + com.j256.simplejmx.common.JmxOperationInfo.OperationAction.INFO + "'", operationAction53.equals(com.j256.simplejmx.common.JmxOperationInfo.OperationAction.INFO));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "STOPPING" + "'", str79, "STOPPING");
        org.junit.Assert.assertNotNull(jmxAttributeFieldInfoArray80);
        org.junit.Assert.assertNotNull(jmxAttributeMethodInfoArray88);
        org.junit.Assert.assertNotNull(jmxOperationInfoArray89);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.j256.simplejmx.spring.JmxBean jmxBean0 = new com.j256.simplejmx.spring.JmxBean();
        jmxBean0.setTarget((java.lang.Object) 100.0f);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo1 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        java.lang.String[] strArray6 = new java.lang.String[] { "STOPPED", "hi!" };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo8 = new com.j256.simplejmx.common.JmxResourceInfo("RUNNING", "STARTING", strArray6, "STOPPED");
        jmxOperationInfo1.setParameterDescriptions(strArray6);
        java.lang.String[] strArray10 = jmxOperationInfo1.getParameterNames();
        java.lang.String str11 = jmxOperationInfo1.getMethodName();
        java.lang.String str12 = jmxOperationInfo1.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "STARTING" + "'", str11, "STARTING");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "STARTING" + "'", str12, "STARTING");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo0 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo0.setReadible(false);
        java.lang.String str3 = jmxAttributeFieldInfo0.getFieldName();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo4 = new com.j256.simplejmx.common.JmxAttributeFieldInfo("", false, false, "STARTING");
        java.lang.String str5 = jmxAttributeFieldInfo4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "STARTING" + "'", str5, "STARTING");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.j256.simplejmx.spring.JmxBean jmxBean0 = new com.j256.simplejmx.spring.JmxBean();
        java.lang.Object obj1 = jmxBean0.getTarget();
        jmxBean0.setTarget((java.lang.Object) 100.0f);
        jmxBean0.setAttributeFieldNames("null");
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo6 = jmxBean0.getJmxResourceInfo();
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(jmxResourceInfo6);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.web.JmxWebServer jmxWebServer2 = new com.j256.simplejmx.web.JmxWebServer(inetAddress0, (int) (byte) 0);
        jmxWebServer2.setMinNumThreads(0);
        jmxWebServer2.stop();
        jmxWebServer2.stop();
        jmxWebServer2.close();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo1 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        jmxOperationInfo1.setMethodName("STOPPING");
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo5 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        java.lang.String[] strArray10 = new java.lang.String[] { "STOPPED", "hi!" };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo12 = new com.j256.simplejmx.common.JmxResourceInfo("RUNNING", "STARTING", strArray10, "STOPPED");
        jmxOperationInfo5.setParameterDescriptions(strArray10);
        jmxOperationInfo1.setParameterDescriptions(strArray10);
        com.j256.simplejmx.common.JmxOperationInfo.OperationAction operationAction15 = jmxOperationInfo1.getAction();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + operationAction15 + "' != '" + com.j256.simplejmx.common.JmxOperationInfo.OperationAction.UNKNOWN + "'", operationAction15.equals(com.j256.simplejmx.common.JmxOperationInfo.OperationAction.UNKNOWN));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo0 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo0.setFieldName("hi!");
        jmxAttributeFieldInfo0.setName("null");
        jmxAttributeFieldInfo0.setDescription("STOPPING");
        java.lang.String str7 = jmxAttributeFieldInfo0.getDescription();
        java.lang.String str8 = jmxAttributeFieldInfo0.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "STOPPING" + "'", str7, "STOPPING");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null(r)" + "'", str8, "null(r)");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.j256.simplejmx.spring.BeanPublisher beanPublisher0 = new com.j256.simplejmx.spring.BeanPublisher();
        beanPublisher0.destroy();
        org.springframework.context.ApplicationContext applicationContext2 = null;
        beanPublisher0.setApplicationContext(applicationContext2);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo1 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("STARTING");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper0 = new com.j256.simplejmx.server.PublishAllBeanWrapper();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo1 = null;
        publishAllBeanWrapper0.setJmxResourceInfo(jmxResourceInfo1);
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo3 = new com.j256.simplejmx.common.JmxResourceInfo();
        publishAllBeanWrapper0.setJmxResourceInfo(jmxResourceInfo3);
        jmxResourceInfo3.setJmxDomainName("service:jmx:rmi:///jndi/rmi://null:100/jmxrmi");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.lang.Appendable appendable0 = null;
        com.j256.simplejmx.common.BaseJmxSelfNaming baseJmxSelfNaming1 = new com.j256.simplejmx.common.BaseJmxSelfNaming();
        java.lang.String str2 = baseJmxSelfNaming1.getJmxBeanName();
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean4 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) baseJmxSelfNaming1, "hi!");
        javax.management.MBeanInfo mBeanInfo5 = reflectionMbean4.getMBeanInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.eclipse.jetty.util.component.AggregateLifeCycle.dumpObject(appendable0, (java.lang.Object) mBeanInfo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(mBeanInfo5);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName4 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName7 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName10 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray11 = new com.j256.simplejmx.common.JmxFolderName[] { jmxFolderName4, jmxFolderName7, jmxFolderName10 };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo13 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "hi!", jmxFolderNameArray11, "");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName14 = com.j256.simplejmx.common.ObjectNameUtil.makeObjectName((com.j256.simplejmx.common.JmxSelfNaming) jmxResourceInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid ObjectName generated: STOPPED:STARTING=STOPPING,STARTING=STOPPING,STARTING=STOPPING,name=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jmxFolderNameArray11);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.j256.simplejmx.spring.JmxBean jmxBean0 = new com.j256.simplejmx.spring.JmxBean();
        java.lang.Object obj1 = jmxBean0.getTarget();
        javax.management.MBeanServer mBeanServer2 = null;
        com.j256.simplejmx.server.JmxServer jmxServer3 = new com.j256.simplejmx.server.JmxServer(mBeanServer2);
        jmxBean0.setTarget((java.lang.Object) jmxServer3);
        jmxBean0.setAttributeFieldNames("null");
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo7 = jmxBean0.getJmxResourceInfo();
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper8 = new com.j256.simplejmx.server.PublishAllBeanWrapper();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo9 = publishAllBeanWrapper8.getJmxResourceInfo();
        publishAllBeanWrapper8.setDelegate((java.lang.Object) (short) 0);
        com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray12 = publishAllBeanWrapper8.getAttributeMethodInfos();
        jmxBean0.setAttributeMethodInfos(jmxAttributeMethodInfoArray12);
        jmxBean0.setAttributeMethodNames("100");
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(jmxResourceInfo7);
        org.junit.Assert.assertNull(jmxResourceInfo9);
        org.junit.Assert.assertNotNull(jmxAttributeMethodInfoArray12);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.CommandLineJmxClient commandLineJmxClient1 = new com.j256.simplejmx.client.CommandLineJmxClient((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: Problems connecting to the serverjava.io.IOException: Failed to retrieve RMIServer stub: javax.naming.ServiceUnavailableException [Root exception is java.rmi.ConnectException: Connection refused to host: 192.168.1.88; nested exception is: ??java.net.ConnectException: Connection refused (Connection refused)]");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean2 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) (-1), "hi!");
        javax.management.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reflectionMbean2.setAttribute(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.j256.simplejmx.server.JmxServer jmxServer1 = new com.j256.simplejmx.server.JmxServer((int) (short) -1);
        java.net.InetAddress inetAddress2 = null;
        jmxServer1.setInetAddress(inetAddress2);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.JmxClient jmxClient1 = new com.j256.simplejmx.client.JmxClient((int) ' ');
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: Problems connecting to the serverjava.io.IOException: Failed to retrieve RMIServer stub: javax.naming.ServiceUnavailableException [Root exception is java.rmi.ConnectException: Connection refused to host: 192.168.1.88; nested exception is: ??java.net.ConnectException: Connection refused (Connection refused)]");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo1 = new com.j256.simplejmx.common.JmxAttributeFieldInfo("service:jmx:rmi:///jndi/rmi://null:100/jmxrmi");
        jmxAttributeFieldInfo1.setReadible(true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.JmxClient jmxClient4 = new com.j256.simplejmx.client.JmxClient("null", "STOPPING", "STOPPED", strMap3);
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: JmxServiceUrl was malformed: null");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.j256.simplejmx.common.JmxResource jmxResource0 = null;
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper1 = new com.j256.simplejmx.server.PublishAllBeanWrapper();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo2 = null;
        publishAllBeanWrapper1.setJmxResourceInfo(jmxResourceInfo2);
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo4 = new com.j256.simplejmx.common.JmxResourceInfo();
        publishAllBeanWrapper1.setJmxResourceInfo(jmxResourceInfo4);
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo6 = publishAllBeanWrapper1.getJmxResourceInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName7 = com.j256.simplejmx.common.ObjectNameUtil.makeObjectName(jmxResource0, (com.j256.simplejmx.common.JmxSelfNaming) jmxResourceInfo6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Could not create ObjectName because domain name not specified in getJmxDomainName() nor @JmxResource");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jmxResourceInfo6);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.j256.simplejmx.common.BaseJmxSelfNaming baseJmxSelfNaming0 = new com.j256.simplejmx.common.BaseJmxSelfNaming();
        java.lang.String str1 = baseJmxSelfNaming0.getJmxBeanName();
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean3 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) baseJmxSelfNaming0, "hi!");
        java.lang.String str4 = baseJmxSelfNaming0.getJmxBeanName();
        java.lang.String str5 = baseJmxSelfNaming0.getJmxDomainName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo1 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        java.lang.String[] strArray6 = new java.lang.String[] { "STOPPED", "hi!" };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo8 = new com.j256.simplejmx.common.JmxResourceInfo("RUNNING", "STARTING", strArray6, "STOPPED");
        jmxOperationInfo1.setParameterDescriptions(strArray6);
        jmxOperationInfo1.setDescription("STARTING");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.lang.String str1 = com.j256.simplejmx.client.ClientUtils.valueToString((java.lang.Object) 100.0f);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100.0" + "'", str1, "100.0");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName1 = new com.j256.simplejmx.common.JmxFolderName("service:jmx:rmi:///jndi/rmi://null:100/jmxrmi");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.j256.simplejmx.common.BaseJmxSelfNaming baseJmxSelfNaming0 = new com.j256.simplejmx.common.BaseJmxSelfNaming();
        java.lang.String str1 = baseJmxSelfNaming0.getJmxBeanName();
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean3 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) baseJmxSelfNaming0, "hi!");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray4 = baseJmxSelfNaming0.getJmxFolderNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(jmxFolderNameArray4);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo1 = new com.j256.simplejmx.common.JmxAttributeFieldInfo("");
        jmxAttributeFieldInfo1.setDescription("100");
        jmxAttributeFieldInfo1.setReadible(false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.JmxClient jmxClient4 = new com.j256.simplejmx.client.JmxClient("service:jmx:rmi:///jndi/rmi://null:100/jmxrmi", "hi!", "STOPPED", strMap3);
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: Problems connecting to the serverjava.io.IOException: Failed to retrieve RMIServer stub: javax.naming.ServiceUnavailableException [Root exception is java.rmi.ConnectException: Connection refused to host: null; nested exception is: ??java.net.ConnectException: Connection refused (Connection refused)]");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        java.lang.Appendable appendable0 = null;
        java.util.Collection[] collectionArray3 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<?>[] wildcardCollectionArray4 = (java.util.Collection<?>[]) collectionArray3;
        org.eclipse.jetty.util.component.AggregateLifeCycle.dump(appendable0, "null", wildcardCollectionArray4);
        org.junit.Assert.assertNotNull(collectionArray3);
        org.junit.Assert.assertNotNull(wildcardCollectionArray4);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.j256.simplejmx.spring.JmxBean jmxBean0 = new com.j256.simplejmx.spring.JmxBean();
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo3 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("hi!", "null");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo6 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo8 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo10 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("null");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo11 = new com.j256.simplejmx.common.JmxAttributeMethodInfo();
        com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray12 = new com.j256.simplejmx.common.JmxAttributeMethodInfo[] { jmxAttributeMethodInfo3, jmxAttributeMethodInfo6, jmxAttributeMethodInfo8, jmxAttributeMethodInfo10, jmxAttributeMethodInfo11 };
        jmxBean0.setAttributeMethodInfos(jmxAttributeMethodInfoArray12);
        org.junit.Assert.assertNotNull(jmxAttributeMethodInfoArray12);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo2 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo6 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        jmxOperationInfo6.setMethodName("STOPPING");
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo10 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        java.lang.String[] strArray15 = new java.lang.String[] { "STOPPED", "hi!" };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo17 = new com.j256.simplejmx.common.JmxResourceInfo("RUNNING", "STARTING", strArray15, "STOPPED");
        jmxOperationInfo10.setParameterDescriptions(strArray15);
        jmxOperationInfo6.setParameterDescriptions(strArray15);
        javax.management.ObjectName objectName20 = com.j256.simplejmx.common.ObjectNameUtil.makeObjectName("STOPPED", "", strArray15);
        jmxOperationInfo2.setParameterNames(strArray15);
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo23 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        jmxOperationInfo23.setMethodName("STOPPING");
        java.lang.String[] strArray30 = new java.lang.String[] { "STOPPED", "hi!" };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo32 = new com.j256.simplejmx.common.JmxResourceInfo("RUNNING", "STARTING", strArray30, "STOPPED");
        jmxOperationInfo23.setParameterDescriptions(strArray30);
        com.j256.simplejmx.common.JmxOperationInfo.OperationAction operationAction34 = com.j256.simplejmx.common.JmxOperationInfo.OperationAction.ACTION_INFO;
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo36 = new com.j256.simplejmx.common.JmxOperationInfo("", strArray15, strArray30, operationAction34, "STOPPING");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(objectName20);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + operationAction34 + "' != '" + com.j256.simplejmx.common.JmxOperationInfo.OperationAction.ACTION_INFO + "'", operationAction34.equals(com.j256.simplejmx.common.JmxOperationInfo.OperationAction.ACTION_INFO));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.j256.simplejmx.common.BaseJmxSelfNaming baseJmxSelfNaming0 = new com.j256.simplejmx.common.BaseJmxSelfNaming();
        java.lang.String str1 = baseJmxSelfNaming0.getJmxBeanName();
        java.lang.String str2 = baseJmxSelfNaming0.getJmxBeanName();
        java.lang.String str3 = baseJmxSelfNaming0.getJmxDomainName();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray4 = baseJmxSelfNaming0.getJmxFolderNames();
        java.lang.String str5 = baseJmxSelfNaming0.getJmxDomainName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(jmxFolderNameArray4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo0 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo0.setName("RUNNING");
        jmxAttributeFieldInfo0.setFieldName("100");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo0 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        boolean boolean1 = jmxAttributeFieldInfo0.isWritable();
        boolean boolean2 = jmxAttributeFieldInfo0.isReadible();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo0 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo0.setReadible(false);
        boolean boolean3 = jmxAttributeFieldInfo0.isReadible();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.j256.simplejmx.spring.JmxBean jmxBean0 = new com.j256.simplejmx.spring.JmxBean();
        java.lang.Object obj1 = jmxBean0.getTarget();
        javax.management.MBeanServer mBeanServer2 = null;
        com.j256.simplejmx.server.JmxServer jmxServer3 = new com.j256.simplejmx.server.JmxServer(mBeanServer2);
        jmxBean0.setTarget((java.lang.Object) jmxServer3);
        jmxServer3.close();
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo9 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        jmxOperationInfo9.setMethodName("STOPPING");
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo13 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        java.lang.String[] strArray18 = new java.lang.String[] { "STOPPED", "hi!" };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo20 = new com.j256.simplejmx.common.JmxResourceInfo("RUNNING", "STARTING", strArray18, "STOPPED");
        jmxOperationInfo13.setParameterDescriptions(strArray18);
        jmxOperationInfo9.setParameterDescriptions(strArray18);
        javax.management.ObjectName objectName23 = com.j256.simplejmx.common.ObjectNameUtil.makeObjectName("STOPPED", "", strArray18);
        // The following exception was thrown during execution in test generation
        try {
            jmxServer3.unregisterThrow(objectName23);
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: JmxServer has not be started");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(objectName23);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = com.j256.simplejmx.client.ClientUtils.stringToParam("service:jmx:rmi:///jndi/rmi://null:100/jmxrmi", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class for type ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.JmxClient jmxClient2 = new com.j256.simplejmx.client.JmxClient("100.0", strMap1);
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: JmxServiceUrl was malformed: 100.0");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        java.lang.String str0 = org.eclipse.jetty.util.component.AbstractLifeCycle.STARTED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "STARTED" + "'", str0, "STARTED");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName4 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName7 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName10 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray11 = new com.j256.simplejmx.common.JmxFolderName[] { jmxFolderName4, jmxFolderName7, jmxFolderName10 };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo13 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "hi!", jmxFolderNameArray11, "");
        java.lang.String str14 = jmxResourceInfo13.getJmxDescription();
        java.lang.String str15 = jmxResourceInfo13.getJmxDomainName();
        jmxResourceInfo13.setJmxDomainName("100.0");
        org.junit.Assert.assertNotNull(jmxFolderNameArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "STOPPED" + "'", str15, "STOPPED");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName5 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName8 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName11 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray12 = new com.j256.simplejmx.common.JmxFolderName[] { jmxFolderName5, jmxFolderName8, jmxFolderName11 };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo14 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "hi!", jmxFolderNameArray12, "");
        java.lang.String str15 = jmxResourceInfo14.getJmxDescription();
        java.lang.String str16 = jmxResourceInfo14.getJmxDescription();
        com.j256.simplejmx.common.JmxFolderName jmxFolderName21 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName24 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName27 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray28 = new com.j256.simplejmx.common.JmxFolderName[] { jmxFolderName21, jmxFolderName24, jmxFolderName27 };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo30 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "hi!", jmxFolderNameArray28, "");
        java.lang.String str31 = jmxResourceInfo30.getJmxDescription();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray32 = jmxResourceInfo30.getJmxFolderNames();
        jmxResourceInfo14.setJmxFolderNames(jmxFolderNameArray32);
        java.lang.String str34 = com.j256.simplejmx.client.ClientUtils.displayType("", (java.lang.Object) jmxFolderNameArray32);
        org.junit.Assert.assertNotNull(jmxFolderNameArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(jmxFolderNameArray28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(jmxFolderNameArray32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper0 = new com.j256.simplejmx.server.PublishAllBeanWrapper();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo1 = publishAllBeanWrapper0.getJmxResourceInfo();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo2 = null;
        publishAllBeanWrapper0.setJmxResourceInfo(jmxResourceInfo2);
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray4 = publishAllBeanWrapper0.getAttributeMethodInfos();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jmxResourceInfo1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.j256.simplejmx.common.JmxOperationInfo.OperationAction operationAction0 = com.j256.simplejmx.common.JmxOperationInfo.OperationAction.INFO;
        int int1 = operationAction0.getActionValue();
        int int2 = operationAction0.getActionValue();
        int int3 = operationAction0.getActionValue();
        org.junit.Assert.assertTrue("'" + operationAction0 + "' != '" + com.j256.simplejmx.common.JmxOperationInfo.OperationAction.INFO + "'", operationAction0.equals(com.j256.simplejmx.common.JmxOperationInfo.OperationAction.INFO));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.j256.simplejmx.common.JmxOperationInfo.OperationAction operationAction0 = com.j256.simplejmx.common.JmxOperationInfo.OperationAction.ACTION_INFO;
        int int1 = operationAction0.getActionValue();
        org.junit.Assert.assertTrue("'" + operationAction0 + "' != '" + com.j256.simplejmx.common.JmxOperationInfo.OperationAction.ACTION_INFO + "'", operationAction0.equals(com.j256.simplejmx.common.JmxOperationInfo.OperationAction.ACTION_INFO));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName1 = new com.j256.simplejmx.common.JmxFolderName("null(r)");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo0 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo0.setWritable(false);
        java.lang.String str3 = jmxAttributeFieldInfo0.getDescription();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer(inetAddress0, (int) (short) 1);
        javax.management.ObjectName objectName3 = null;
        jmxServer2.unregister(objectName3);
        com.j256.simplejmx.common.IoUtils.closeQuietly((java.io.Closeable) jmxServer2);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.j256.simplejmx.spring.JmxBean jmxBean0 = new com.j256.simplejmx.spring.JmxBean();
        com.j256.simplejmx.common.JmxFolderName jmxFolderName5 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName8 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName11 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray12 = new com.j256.simplejmx.common.JmxFolderName[] { jmxFolderName5, jmxFolderName8, jmxFolderName11 };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo14 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "hi!", jmxFolderNameArray12, "");
        java.lang.String str15 = jmxResourceInfo14.getJmxDescription();
        jmxBean0.setJmxResourceInfo(jmxResourceInfo14);
        com.j256.simplejmx.common.JmxOperationInfo.OperationAction operationAction17 = com.j256.simplejmx.common.JmxOperationInfo.OperationAction.INFO;
        int int18 = operationAction17.getActionValue();
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo20 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo20.setFieldName("hi!");
        jmxAttributeFieldInfo20.setWritable(false);
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo29 = new com.j256.simplejmx.common.JmxAttributeFieldInfo("", false, false, "STARTING");
        java.lang.String str30 = jmxAttributeFieldInfo29.getFieldName();
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo31 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo31.setFieldName("hi!");
        jmxAttributeFieldInfo31.setName("");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo36 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo36.setFieldName("hi!");
        jmxAttributeFieldInfo36.setName("null");
        jmxAttributeFieldInfo36.setDescription("STOPPING");
        java.lang.String str43 = jmxAttributeFieldInfo36.getDescription();
        com.j256.simplejmx.common.JmxAttributeFieldInfo[] jmxAttributeFieldInfoArray44 = new com.j256.simplejmx.common.JmxAttributeFieldInfo[] { jmxAttributeFieldInfo20, jmxAttributeFieldInfo29, jmxAttributeFieldInfo31, jmxAttributeFieldInfo36 };
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo47 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("hi!", "null");
        jmxAttributeMethodInfo47.setMethodName("");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo51 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("");
        com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray52 = new com.j256.simplejmx.common.JmxAttributeMethodInfo[] { jmxAttributeMethodInfo47, jmxAttributeMethodInfo51 };
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray53 = new com.j256.simplejmx.common.JmxOperationInfo[] {};
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean55 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) int18, "service:jmx:rmi:///jndi/rmi://null:100/jmxrmi", jmxAttributeFieldInfoArray44, jmxAttributeMethodInfoArray52, jmxOperationInfoArray53, true);
        jmxBean0.setAttributeFieldInfos(jmxAttributeFieldInfoArray44);
        org.junit.Assert.assertNotNull(jmxFolderNameArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + operationAction17 + "' != '" + com.j256.simplejmx.common.JmxOperationInfo.OperationAction.INFO + "'", operationAction17.equals(com.j256.simplejmx.common.JmxOperationInfo.OperationAction.INFO));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "STOPPING" + "'", str43, "STOPPING");
        org.junit.Assert.assertNotNull(jmxAttributeFieldInfoArray44);
        org.junit.Assert.assertNotNull(jmxAttributeMethodInfoArray52);
        org.junit.Assert.assertNotNull(jmxOperationInfoArray53);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer(inetAddress0, (int) 'a');
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.j256.simplejmx.common.JmxOperation jmxOperation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo2 = new com.j256.simplejmx.common.JmxOperationInfo("100", jmxOperation1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.JmxClient jmxClient4 = new com.j256.simplejmx.client.JmxClient("100.0", (-1), "100.0", "null");
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: Problems connecting to the serverjava.io.IOException: Failed to retrieve RMIServer stub: javax.naming.InvalidNameException: invalid authority: 100.0:-1 [Root exception is java.lang.IllegalArgumentException: invalid authority: 100.0:-1]");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.j256.simplejmx.server.JmxServer jmxServer1 = new com.j256.simplejmx.server.JmxServer((int) '#');
        jmxServer1.close();
        jmxServer1.setServerPort((int) 'a');
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.web.JmxWebServer jmxWebServer2 = new com.j256.simplejmx.web.JmxWebServer(inetAddress0, (int) (short) 0);
        jmxWebServer2.setMaxNumThreads((int) '4');
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.server.JmxServer jmxServer3 = new com.j256.simplejmx.server.JmxServer(inetAddress0, (int) '#', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            jmxServer3.start();
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: Malformed service url created service:jmx:rmi://localhost:-1/jndi/rmi://:35/jmxrmi");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        com.j256.simplejmx.web.JmxWebServer jmxWebServer1 = new com.j256.simplejmx.web.JmxWebServer((int) 'a');
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo1 = new com.j256.simplejmx.common.JmxAttributeFieldInfo("STARTING");
        jmxAttributeFieldInfo1.setName("STARTED");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer((int) (byte) 10, (int) (byte) -1);
        jmxServer2.setServiceUrl("STARTING");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper0 = new com.j256.simplejmx.server.PublishAllBeanWrapper();
        java.lang.Object obj1 = publishAllBeanWrapper0.getTarget();
        com.j256.simplejmx.common.BaseJmxSelfNaming baseJmxSelfNaming2 = new com.j256.simplejmx.common.BaseJmxSelfNaming();
        publishAllBeanWrapper0.setTarget((java.lang.Object) baseJmxSelfNaming2);
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray4 = baseJmxSelfNaming2.getJmxFolderNames();
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(jmxFolderNameArray4);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.web.JmxWebServer jmxWebServer2 = new com.j256.simplejmx.web.JmxWebServer(inetAddress0, (int) (byte) 0);
        jmxWebServer2.setMinNumThreads(0);
        jmxWebServer2.close();
        jmxWebServer2.setMaxNumThreads(0);
        // The following exception was thrown during execution in test generation
        try {
            jmxWebServer2.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName4 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName7 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName10 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray11 = new com.j256.simplejmx.common.JmxFolderName[] { jmxFolderName4, jmxFolderName7, jmxFolderName10 };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo13 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "hi!", jmxFolderNameArray11, "");
        java.lang.String str14 = jmxResourceInfo13.getJmxDescription();
        java.lang.String str15 = jmxResourceInfo13.getJmxBeanName();
        jmxResourceInfo13.setJmxDescription("100.0");
        org.junit.Assert.assertNotNull(jmxFolderNameArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper0 = new com.j256.simplejmx.server.PublishAllBeanWrapper();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo1 = null;
        publishAllBeanWrapper0.setJmxResourceInfo(jmxResourceInfo1);
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo3 = new com.j256.simplejmx.common.JmxResourceInfo();
        publishAllBeanWrapper0.setJmxResourceInfo(jmxResourceInfo3);
        jmxResourceInfo3.setJmxDescription("STOPPED");
        java.lang.String str7 = jmxResourceInfo3.getJmxDescription();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "STOPPED" + "'", str7, "STOPPED");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer((int) (byte) 10, (int) (byte) -1);
        java.net.InetAddress inetAddress3 = null;
        jmxServer2.setInetAddress(inetAddress3);
        jmxServer2.close();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName2 = new com.j256.simplejmx.common.JmxFolderName("service:jmx:rmi:///jndi/rmi://null:100/jmxrmi", "hi!");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.j256.simplejmx.common.BaseJmxSelfNaming baseJmxSelfNaming0 = new com.j256.simplejmx.common.BaseJmxSelfNaming();
        java.lang.String str1 = baseJmxSelfNaming0.getJmxBeanName();
        java.lang.String str2 = baseJmxSelfNaming0.getJmxDomainName();
        java.lang.String str3 = baseJmxSelfNaming0.getJmxBeanName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.server.JmxServer jmxServer3 = new com.j256.simplejmx.server.JmxServer(inetAddress0, (int) (short) -1, 10);
        jmxServer3.setServerPort((int) (short) 100);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.server.JmxServer jmxServer3 = new com.j256.simplejmx.server.JmxServer(inetAddress0, 10, (int) (byte) -1);
        jmxServer3.setServiceUrl("null(r)");
        com.j256.simplejmx.server.JmxServer jmxServer8 = new com.j256.simplejmx.server.JmxServer((int) (byte) -1, (int) (short) 1);
        int int9 = jmxServer8.getRegisteredCount();
        javax.management.ObjectName objectName13 = com.j256.simplejmx.common.ObjectNameUtil.makeObjectName("RUNNING", "null");
        java.lang.String str14 = com.j256.simplejmx.client.ClientUtils.displayType("100.0", (java.lang.Object) objectName13);
        com.j256.simplejmx.common.JmxOperationInfo.OperationAction operationAction15 = com.j256.simplejmx.common.JmxOperationInfo.OperationAction.INFO;
        int int16 = operationAction15.getActionValue();
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo18 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo18.setFieldName("hi!");
        jmxAttributeFieldInfo18.setWritable(false);
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo27 = new com.j256.simplejmx.common.JmxAttributeFieldInfo("", false, false, "STARTING");
        java.lang.String str28 = jmxAttributeFieldInfo27.getFieldName();
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo29 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo29.setFieldName("hi!");
        jmxAttributeFieldInfo29.setName("");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo34 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo34.setFieldName("hi!");
        jmxAttributeFieldInfo34.setName("null");
        jmxAttributeFieldInfo34.setDescription("STOPPING");
        java.lang.String str41 = jmxAttributeFieldInfo34.getDescription();
        com.j256.simplejmx.common.JmxAttributeFieldInfo[] jmxAttributeFieldInfoArray42 = new com.j256.simplejmx.common.JmxAttributeFieldInfo[] { jmxAttributeFieldInfo18, jmxAttributeFieldInfo27, jmxAttributeFieldInfo29, jmxAttributeFieldInfo34 };
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo45 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("hi!", "null");
        jmxAttributeMethodInfo45.setMethodName("");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo49 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("");
        com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray50 = new com.j256.simplejmx.common.JmxAttributeMethodInfo[] { jmxAttributeMethodInfo45, jmxAttributeMethodInfo49 };
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray51 = new com.j256.simplejmx.common.JmxOperationInfo[] {};
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean53 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) int16, "service:jmx:rmi:///jndi/rmi://null:100/jmxrmi", jmxAttributeFieldInfoArray42, jmxAttributeMethodInfoArray50, jmxOperationInfoArray51, true);
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper54 = new com.j256.simplejmx.server.PublishAllBeanWrapper();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo55 = publishAllBeanWrapper54.getJmxResourceInfo();
        publishAllBeanWrapper54.setDelegate((java.lang.Object) (short) 0);
        com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray58 = publishAllBeanWrapper54.getAttributeMethodInfos();
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray59 = null;
        // The following exception was thrown during execution in test generation
        try {
            jmxServer3.register((java.lang.Object) jmxServer8, objectName13, jmxAttributeFieldInfoArray42, jmxAttributeMethodInfoArray58, jmxOperationInfoArray59);
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: JmxServer has not be started");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objectName13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100.0" + "'", str14, "100.0");
        org.junit.Assert.assertTrue("'" + operationAction15 + "' != '" + com.j256.simplejmx.common.JmxOperationInfo.OperationAction.INFO + "'", operationAction15.equals(com.j256.simplejmx.common.JmxOperationInfo.OperationAction.INFO));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "STOPPING" + "'", str41, "STOPPING");
        org.junit.Assert.assertNotNull(jmxAttributeFieldInfoArray42);
        org.junit.Assert.assertNotNull(jmxAttributeMethodInfoArray50);
        org.junit.Assert.assertNotNull(jmxOperationInfoArray51);
        org.junit.Assert.assertNull(jmxResourceInfo55);
        org.junit.Assert.assertNotNull(jmxAttributeMethodInfoArray58);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean2 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) (-1), "hi!");
        com.j256.simplejmx.common.BaseJmxSelfNaming baseJmxSelfNaming3 = new com.j256.simplejmx.common.BaseJmxSelfNaming();
        java.lang.String str4 = baseJmxSelfNaming3.getJmxBeanName();
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean6 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) baseJmxSelfNaming3, "hi!");
        java.lang.String[] strArray10 = new java.lang.String[] { "null(r)", "null", "100" };
        javax.management.AttributeList attributeList11 = reflectionMbean6.getAttributes(strArray10);
        javax.management.AttributeList attributeList12 = reflectionMbean2.getAttributes(strArray10);
        javax.management.MBeanInfo mBeanInfo13 = reflectionMbean2.getMBeanInfo();
        javax.management.MBeanInfo mBeanInfo14 = reflectionMbean2.getMBeanInfo();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeList12);
        org.junit.Assert.assertNotNull(mBeanInfo13);
        org.junit.Assert.assertNotNull(mBeanInfo14);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo1 = new com.j256.simplejmx.common.JmxAttributeFieldInfo("STOPPED");
        java.lang.String str2 = jmxAttributeFieldInfo1.getDescription();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.j256.simplejmx.server.JmxServer jmxServer1 = new com.j256.simplejmx.server.JmxServer((int) (short) -1);
        jmxServer1.setPort(0);
        java.net.InetAddress inetAddress4 = null;
        jmxServer1.setInetAddress(inetAddress4);
        jmxServer1.setPort(1);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo1 = new com.j256.simplejmx.common.JmxAttributeFieldInfo("hi!");
        jmxAttributeFieldInfo1.setFieldName("");
        java.lang.String str4 = jmxAttributeFieldInfo1.getDescription();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer(inetAddress0, (int) '4');
        jmxServer2.setServerPort(0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper0 = new com.j256.simplejmx.server.PublishAllBeanWrapper();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo1 = null;
        publishAllBeanWrapper0.setJmxResourceInfo(jmxResourceInfo1);
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray3 = publishAllBeanWrapper0.getAttributeMethodInfos();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.lang.String str0 = org.eclipse.jetty.util.component.AbstractLifeCycle.FAILED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "FAILED" + "'", str0, "FAILED");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.j256.simplejmx.server.JmxUsernamePasswordAuthenticator jmxUsernamePasswordAuthenticator0 = new com.j256.simplejmx.server.JmxUsernamePasswordAuthenticator();
        com.j256.simplejmx.spring.JmxBean jmxBean1 = new com.j256.simplejmx.spring.JmxBean();
        java.lang.Object obj2 = jmxBean1.getTarget();
        javax.management.MBeanServer mBeanServer3 = null;
        com.j256.simplejmx.server.JmxServer jmxServer4 = new com.j256.simplejmx.server.JmxServer(mBeanServer3);
        jmxBean1.setTarget((java.lang.Object) jmxServer4);
        jmxBean1.setAttributeFieldNames("null");
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo8 = jmxBean1.getJmxResourceInfo();
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper9 = new com.j256.simplejmx.server.PublishAllBeanWrapper();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo10 = publishAllBeanWrapper9.getJmxResourceInfo();
        publishAllBeanWrapper9.setDelegate((java.lang.Object) (short) 0);
        com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray13 = publishAllBeanWrapper9.getAttributeMethodInfos();
        jmxBean1.setAttributeMethodInfos(jmxAttributeMethodInfoArray13);
        // The following exception was thrown during execution in test generation
        try {
            javax.security.auth.Subject subject15 = jmxUsernamePasswordAuthenticator0.authenticate((java.lang.Object) jmxBean1);
            org.junit.Assert.fail("Expected exception of type java.lang.SecurityException; message: Was expected credentials String[2] object");
        } catch (java.lang.SecurityException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(jmxResourceInfo8);
        org.junit.Assert.assertNull(jmxResourceInfo10);
        org.junit.Assert.assertNotNull(jmxAttributeMethodInfoArray13);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer((int) (byte) 10, (int) (byte) -1);
        java.net.InetAddress inetAddress3 = null;
        jmxServer2.setInetAddress(inetAddress3);
        jmxServer2.stop();
        jmxServer2.close();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        java.lang.String[] strArray8 = new java.lang.String[] { "STOPPING", "STARTED", "", "", "service:jmx:rmi:///jndi/rmi://null:100/jmxrmi", "null" };
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName9 = com.j256.simplejmx.common.ObjectNameUtil.makeObjectName("hi!", "null", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid ObjectName generated: hi!:00=STOPPING,01=STARTED,02=,03=,04=service:jmx:rmi:///jndi/rmi://null:100/jmxrmi,05=null,name=null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.j256.simplejmx.spring.JmxBean jmxBean0 = new com.j256.simplejmx.spring.JmxBean();
        java.lang.Object obj1 = jmxBean0.getTarget();
        com.j256.simplejmx.common.JmxAttributeFieldInfo[] jmxAttributeFieldInfoArray2 = jmxBean0.getAttributeFieldInfos();
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray3 = jmxBean0.getOperationInfos();
        jmxBean0.setOperationNames("null(r)");
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(jmxAttributeFieldInfoArray2);
        org.junit.Assert.assertNull(jmxOperationInfoArray3);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.j256.simplejmx.server.JmxServer jmxServer1 = new com.j256.simplejmx.server.JmxServer(false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean2 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) (-1), "hi!");
        com.j256.simplejmx.common.BaseJmxSelfNaming baseJmxSelfNaming3 = new com.j256.simplejmx.common.BaseJmxSelfNaming();
        java.lang.String str4 = baseJmxSelfNaming3.getJmxBeanName();
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean6 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) baseJmxSelfNaming3, "hi!");
        java.lang.String[] strArray10 = new java.lang.String[] { "null(r)", "null", "100" };
        javax.management.AttributeList attributeList11 = reflectionMbean6.getAttributes(strArray10);
        javax.management.AttributeList attributeList12 = reflectionMbean2.getAttributes(strArray10);
        javax.management.AttributeList attributeList13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.management.AttributeList attributeList14 = reflectionMbean2.setAttributes(attributeList13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeList12);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.j256.simplejmx.spring.JmxBean jmxBean0 = new com.j256.simplejmx.spring.JmxBean();
        java.lang.Object obj1 = jmxBean0.getTarget();
        javax.management.MBeanServer mBeanServer2 = null;
        com.j256.simplejmx.server.JmxServer jmxServer3 = new com.j256.simplejmx.server.JmxServer(mBeanServer2);
        jmxBean0.setTarget((java.lang.Object) jmxServer3);
        jmxServer3.close();
        java.net.InetAddress inetAddress6 = null;
        com.j256.simplejmx.server.JmxServer jmxServer9 = new com.j256.simplejmx.server.JmxServer(inetAddress6, (int) (short) 0, (int) (byte) -1);
        jmxServer3.unregister((java.lang.Object) jmxServer9);
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.j256.simplejmx.common.JmxOperationInfo.OperationAction operationAction0 = com.j256.simplejmx.common.JmxOperationInfo.OperationAction.ACTION;
        org.junit.Assert.assertTrue("'" + operationAction0 + "' != '" + com.j256.simplejmx.common.JmxOperationInfo.OperationAction.ACTION + "'", operationAction0.equals(com.j256.simplejmx.common.JmxOperationInfo.OperationAction.ACTION));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        com.j256.simplejmx.server.JmxServer jmxServer1 = new com.j256.simplejmx.server.JmxServer(10);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.j256.simplejmx.common.BaseJmxSelfNaming baseJmxSelfNaming0 = new com.j256.simplejmx.common.BaseJmxSelfNaming();
        java.lang.String str1 = baseJmxSelfNaming0.getJmxBeanName();
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean3 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) baseJmxSelfNaming0, "hi!");
        java.lang.String[] strArray7 = new java.lang.String[] { "null(r)", "null", "100" };
        javax.management.AttributeList attributeList8 = reflectionMbean3.getAttributes(strArray7);
        javax.management.Attribute attribute9 = null;
        // The following exception was thrown during execution in test generation
        try {
            reflectionMbean3.setAttribute(attribute9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(attributeList8);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.j256.simplejmx.common.BaseJmxSelfNaming baseJmxSelfNaming0 = new com.j256.simplejmx.common.BaseJmxSelfNaming();
        java.lang.String str1 = baseJmxSelfNaming0.getJmxBeanName();
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean3 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) baseJmxSelfNaming0, "hi!");
        java.lang.String[] strArray7 = new java.lang.String[] { "null(r)", "null", "100" };
        javax.management.AttributeList attributeList8 = reflectionMbean3.getAttributes(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = reflectionMbean3.getAttribute("null(r)");
            org.junit.Assert.fail("Expected exception of type javax.management.AttributeNotFoundException; message: Unknown attribute null(r)");
        } catch (javax.management.AttributeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(attributeList8);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.j256.simplejmx.web.JmxWebHandler jmxWebHandler0 = new com.j256.simplejmx.web.JmxWebHandler();
        com.j256.simplejmx.server.JmxServer jmxServer3 = new com.j256.simplejmx.server.JmxServer((int) (byte) 10, (int) (byte) -1);
        jmxServer3.close();
        jmxServer3.close();
        boolean boolean6 = jmxWebHandler0.addBean((java.lang.Object) jmxServer3);
        org.eclipse.jetty.server.Request request8 = null;
        javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        // The following exception was thrown during execution in test generation
        try {
            jmxWebHandler0.handle("STARTED", request8, httpServletRequest9, httpServletResponse10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper0 = new com.j256.simplejmx.server.PublishAllBeanWrapper();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo1 = publishAllBeanWrapper0.getJmxResourceInfo();
        publishAllBeanWrapper0.setDelegate((java.lang.Object) (short) 0);
        com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray4 = publishAllBeanWrapper0.getAttributeMethodInfos();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo5 = publishAllBeanWrapper0.getJmxResourceInfo();
        org.junit.Assert.assertNull(jmxResourceInfo1);
        org.junit.Assert.assertNotNull(jmxAttributeMethodInfoArray4);
        org.junit.Assert.assertNull(jmxResourceInfo5);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.j256.simplejmx.common.BaseJmxSelfNaming baseJmxSelfNaming0 = new com.j256.simplejmx.common.BaseJmxSelfNaming();
        java.lang.String str1 = baseJmxSelfNaming0.getJmxBeanName();
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean3 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) baseJmxSelfNaming0, "hi!");
        java.lang.String[] strArray7 = new java.lang.String[] { "null(r)", "null", "100" };
        javax.management.AttributeList attributeList8 = reflectionMbean3.getAttributes(strArray7);
        com.j256.simplejmx.spring.JmxBean jmxBean10 = new com.j256.simplejmx.spring.JmxBean();
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray11 = jmxBean10.getOperationInfos();
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo14 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("hi!", "null");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo17 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("STARTING", "STOPPING");
        jmxAttributeMethodInfo17.setDescription("STARTING");
        jmxAttributeMethodInfo17.setDescription("RUNNING");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo24 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("STARTING", "STOPPING");
        jmxAttributeMethodInfo24.setDescription("STARTING");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo29 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("STARTING", "STOPPING");
        jmxAttributeMethodInfo29.setDescription("STARTING");
        jmxAttributeMethodInfo29.setDescription("RUNNING");
        com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray34 = new com.j256.simplejmx.common.JmxAttributeMethodInfo[] { jmxAttributeMethodInfo14, jmxAttributeMethodInfo17, jmxAttributeMethodInfo24, jmxAttributeMethodInfo29 };
        jmxBean10.setAttributeMethodInfos(jmxAttributeMethodInfoArray34);
        com.j256.simplejmx.spring.JmxBean jmxBean36 = new com.j256.simplejmx.spring.JmxBean();
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray37 = jmxBean36.getOperationInfos();
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo40 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("hi!", "null");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo43 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("STARTING", "STOPPING");
        jmxAttributeMethodInfo43.setDescription("STARTING");
        jmxAttributeMethodInfo43.setDescription("RUNNING");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo50 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("STARTING", "STOPPING");
        jmxAttributeMethodInfo50.setDescription("STARTING");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo55 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("STARTING", "STOPPING");
        jmxAttributeMethodInfo55.setDescription("STARTING");
        jmxAttributeMethodInfo55.setDescription("RUNNING");
        com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray60 = new com.j256.simplejmx.common.JmxAttributeMethodInfo[] { jmxAttributeMethodInfo40, jmxAttributeMethodInfo43, jmxAttributeMethodInfo50, jmxAttributeMethodInfo55 };
        jmxBean36.setAttributeMethodInfos(jmxAttributeMethodInfoArray60);
        jmxBean10.setAttributeMethodInfos(jmxAttributeMethodInfoArray60);
        java.lang.String[] strArray63 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj64 = reflectionMbean3.invoke("STOPPED", (java.lang.Object[]) jmxAttributeMethodInfoArray60, strArray63);
            org.junit.Assert.fail("Expected exception of type javax.management.MBeanException; message: null");
        } catch (javax.management.MBeanException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(attributeList8);
        org.junit.Assert.assertNull(jmxOperationInfoArray11);
        org.junit.Assert.assertNotNull(jmxAttributeMethodInfoArray34);
        org.junit.Assert.assertNull(jmxOperationInfoArray37);
        org.junit.Assert.assertNotNull(jmxAttributeMethodInfoArray60);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer((int) (byte) -1, (int) (short) 1);
        int int3 = jmxServer2.getRegisteredCount();
        com.j256.simplejmx.client.Main main4 = new com.j256.simplejmx.client.Main();
        jmxServer2.unregister((java.lang.Object) main4);
        javax.management.MBeanServer mBeanServer6 = null;
        com.j256.simplejmx.server.JmxServer jmxServer7 = new com.j256.simplejmx.server.JmxServer(mBeanServer6);
        javax.management.ObjectName objectName8 = null;
        jmxServer7.unregister(objectName8);
        int int10 = jmxServer7.getRegistryPort();
        javax.management.ObjectName objectName13 = com.j256.simplejmx.common.ObjectNameUtil.makeObjectName("RUNNING", "null");
        com.j256.simplejmx.common.JmxOperationInfo.OperationAction operationAction14 = com.j256.simplejmx.common.JmxOperationInfo.OperationAction.INFO;
        int int15 = operationAction14.getActionValue();
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo17 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo17.setFieldName("hi!");
        jmxAttributeFieldInfo17.setWritable(false);
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo26 = new com.j256.simplejmx.common.JmxAttributeFieldInfo("", false, false, "STARTING");
        java.lang.String str27 = jmxAttributeFieldInfo26.getFieldName();
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo28 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo28.setFieldName("hi!");
        jmxAttributeFieldInfo28.setName("");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo33 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo33.setFieldName("hi!");
        jmxAttributeFieldInfo33.setName("null");
        jmxAttributeFieldInfo33.setDescription("STOPPING");
        java.lang.String str40 = jmxAttributeFieldInfo33.getDescription();
        com.j256.simplejmx.common.JmxAttributeFieldInfo[] jmxAttributeFieldInfoArray41 = new com.j256.simplejmx.common.JmxAttributeFieldInfo[] { jmxAttributeFieldInfo17, jmxAttributeFieldInfo26, jmxAttributeFieldInfo28, jmxAttributeFieldInfo33 };
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo44 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("hi!", "null");
        jmxAttributeMethodInfo44.setMethodName("");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo48 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("");
        com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray49 = new com.j256.simplejmx.common.JmxAttributeMethodInfo[] { jmxAttributeMethodInfo44, jmxAttributeMethodInfo48 };
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray50 = new com.j256.simplejmx.common.JmxOperationInfo[] {};
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean52 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) int15, "service:jmx:rmi:///jndi/rmi://null:100/jmxrmi", jmxAttributeFieldInfoArray41, jmxAttributeMethodInfoArray49, jmxOperationInfoArray50, true);
        com.j256.simplejmx.spring.JmxBean jmxBean53 = new com.j256.simplejmx.spring.JmxBean();
        java.lang.Object obj54 = jmxBean53.getTarget();
        com.j256.simplejmx.common.JmxAttributeFieldInfo[] jmxAttributeFieldInfoArray55 = jmxBean53.getAttributeFieldInfos();
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray56 = jmxBean53.getOperationInfos();
        com.j256.simplejmx.spring.JmxBean jmxBean57 = new com.j256.simplejmx.spring.JmxBean();
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray58 = jmxBean57.getOperationInfos();
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo61 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("hi!", "null");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo64 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("STARTING", "STOPPING");
        jmxAttributeMethodInfo64.setDescription("STARTING");
        jmxAttributeMethodInfo64.setDescription("RUNNING");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo71 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("STARTING", "STOPPING");
        jmxAttributeMethodInfo71.setDescription("STARTING");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo76 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("STARTING", "STOPPING");
        jmxAttributeMethodInfo76.setDescription("STARTING");
        jmxAttributeMethodInfo76.setDescription("RUNNING");
        com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray81 = new com.j256.simplejmx.common.JmxAttributeMethodInfo[] { jmxAttributeMethodInfo61, jmxAttributeMethodInfo64, jmxAttributeMethodInfo71, jmxAttributeMethodInfo76 };
        jmxBean57.setAttributeMethodInfos(jmxAttributeMethodInfoArray81);
        jmxBean53.setAttributeMethodInfos(jmxAttributeMethodInfoArray81);
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo88 = new com.j256.simplejmx.common.JmxAttributeFieldInfo("", false, false, "STARTING");
        java.lang.String str89 = jmxAttributeFieldInfo88.getFieldName();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo90 = new com.j256.simplejmx.common.JmxResourceInfo();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray91 = jmxResourceInfo90.getJmxFolderNames();
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper92 = new com.j256.simplejmx.server.PublishAllBeanWrapper((java.lang.Object) str89, jmxResourceInfo90);
        com.j256.simplejmx.common.JmxAttributeFieldInfo[] jmxAttributeFieldInfoArray93 = publishAllBeanWrapper92.getAttributeFieldInfos();
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray94 = publishAllBeanWrapper92.getOperationInfos();
        // The following exception was thrown during execution in test generation
        try {
            jmxServer2.register((java.lang.Object) jmxServer7, objectName13, jmxAttributeFieldInfoArray41, jmxAttributeMethodInfoArray81, jmxOperationInfoArray94);
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: JmxServer has not be started");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objectName13);
        org.junit.Assert.assertTrue("'" + operationAction14 + "' != '" + com.j256.simplejmx.common.JmxOperationInfo.OperationAction.INFO + "'", operationAction14.equals(com.j256.simplejmx.common.JmxOperationInfo.OperationAction.INFO));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "STOPPING" + "'", str40, "STOPPING");
        org.junit.Assert.assertNotNull(jmxAttributeFieldInfoArray41);
        org.junit.Assert.assertNotNull(jmxAttributeMethodInfoArray49);
        org.junit.Assert.assertNotNull(jmxOperationInfoArray50);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(jmxAttributeFieldInfoArray55);
        org.junit.Assert.assertNull(jmxOperationInfoArray56);
        org.junit.Assert.assertNull(jmxOperationInfoArray58);
        org.junit.Assert.assertNotNull(jmxAttributeMethodInfoArray81);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertNull(jmxFolderNameArray91);
        org.junit.Assert.assertNotNull(jmxAttributeFieldInfoArray93);
        org.junit.Assert.assertNotNull(jmxOperationInfoArray94);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo0 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo0.setWritable(false);
        jmxAttributeFieldInfo0.setName("hi!");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.j256.simplejmx.server.JmxUsernamePasswordAuthenticator jmxUsernamePasswordAuthenticator0 = new com.j256.simplejmx.server.JmxUsernamePasswordAuthenticator();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        jmxUsernamePasswordAuthenticator0.setAuthMap(strMap1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        jmxUsernamePasswordAuthenticator0.setAuthMap(strMap3);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.j256.simplejmx.spring.BeanPublisher beanPublisher0 = new com.j256.simplejmx.spring.BeanPublisher();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        beanPublisher0.setApplicationContext(applicationContext1);
        com.j256.simplejmx.server.JmxServer jmxServer5 = new com.j256.simplejmx.server.JmxServer((int) (byte) 10, (int) (byte) -1);
        jmxServer5.close();
        java.net.InetAddress inetAddress7 = null;
        jmxServer5.setInetAddress(inetAddress7);
        beanPublisher0.setJmxServer(jmxServer5);
        org.springframework.context.ApplicationContext applicationContext10 = null;
        beanPublisher0.setApplicationContext(applicationContext10);
        beanPublisher0.destroy();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.j256.simplejmx.spring.JmxBean jmxBean0 = new com.j256.simplejmx.spring.JmxBean();
        com.j256.simplejmx.common.JmxFolderName jmxFolderName5 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName8 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName11 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray12 = new com.j256.simplejmx.common.JmxFolderName[] { jmxFolderName5, jmxFolderName8, jmxFolderName11 };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo14 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "hi!", jmxFolderNameArray12, "");
        java.lang.String str15 = jmxResourceInfo14.getJmxDescription();
        jmxBean0.setJmxResourceInfo(jmxResourceInfo14);
        java.lang.String str17 = jmxResourceInfo14.getJmxBeanName();
        java.lang.String str18 = jmxResourceInfo14.getJmxBeanName();
        org.junit.Assert.assertNotNull(jmxFolderNameArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.JmxClient jmxClient4 = new com.j256.simplejmx.client.JmxClient("service:jmx:rmi:///jndi/rmi://null:100/jmxrmi", (int) (short) -1, "STOPPING", "hi!");
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: Problems connecting to the serverjava.io.IOException: Failed to retrieve RMIServer stub: javax.naming.InvalidNameException: invalid authority: service:jmx:rmi: [Root exception is java.lang.IllegalArgumentException: invalid authority: service:jmx:rmi:]");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.server.JmxServer jmxServer3 = new com.j256.simplejmx.server.JmxServer(inetAddress0, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.j256.simplejmx.web.JmxWebHandler jmxWebHandler0 = new com.j256.simplejmx.web.JmxWebHandler();
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper1 = new com.j256.simplejmx.server.PublishAllBeanWrapper();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo2 = publishAllBeanWrapper1.getJmxResourceInfo();
        java.lang.Object obj3 = publishAllBeanWrapper1.getTarget();
        com.j256.simplejmx.common.JmxFolderName jmxFolderName8 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName11 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName14 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray15 = new com.j256.simplejmx.common.JmxFolderName[] { jmxFolderName8, jmxFolderName11, jmxFolderName14 };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo17 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "hi!", jmxFolderNameArray15, "");
        java.lang.String str18 = jmxResourceInfo17.getJmxDescription();
        java.lang.String str19 = jmxResourceInfo17.getJmxDescription();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray20 = jmxResourceInfo17.getJmxFolderNames();
        publishAllBeanWrapper1.setJmxResourceInfo(jmxResourceInfo17);
        // The following exception was thrown during execution in test generation
        try {
            jmxWebHandler0.manage((java.lang.Object) jmxResourceInfo17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jmxResourceInfo2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(jmxFolderNameArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(jmxFolderNameArray20);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.j256.simplejmx.spring.JmxBean jmxBean0 = new com.j256.simplejmx.spring.JmxBean();
        java.lang.Object obj1 = jmxBean0.getTarget();
        javax.management.MBeanServer mBeanServer2 = null;
        com.j256.simplejmx.server.JmxServer jmxServer3 = new com.j256.simplejmx.server.JmxServer(mBeanServer2);
        jmxBean0.setTarget((java.lang.Object) jmxServer3);
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo5 = jmxBean0.getJmxResourceInfo();
        jmxBean0.setAttributeMethodNames("null");
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(jmxResourceInfo5);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo1 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("FAILED");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.j256.simplejmx.spring.JmxBean jmxBean0 = new com.j256.simplejmx.spring.JmxBean();
        java.lang.Object obj1 = jmxBean0.getTarget();
        com.j256.simplejmx.common.JmxAttributeFieldInfo[] jmxAttributeFieldInfoArray2 = jmxBean0.getAttributeFieldInfos();
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray3 = jmxBean0.getOperationInfos();
        com.j256.simplejmx.server.JmxServer jmxServer6 = new com.j256.simplejmx.server.JmxServer((int) (byte) 10, (int) (byte) -1);
        jmxServer6.close();
        java.net.InetAddress inetAddress8 = null;
        jmxServer6.setInetAddress(inetAddress8);
        int int10 = jmxServer6.getServerPort();
        jmxBean0.setTarget((java.lang.Object) jmxServer6);
        // The following exception was thrown during execution in test generation
        try {
            jmxServer6.start();
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: Unable to create RMI registry on port 10");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(jmxAttributeFieldInfoArray2);
        org.junit.Assert.assertNull(jmxOperationInfoArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo1 = new com.j256.simplejmx.common.JmxAttributeFieldInfo("hi!");
        jmxAttributeFieldInfo1.setFieldName("");
        jmxAttributeFieldInfo1.setDescription("100.0");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer(inetAddress0, (int) (short) -1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo1 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        java.lang.String[] strArray6 = new java.lang.String[] { "STOPPED", "hi!" };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo8 = new com.j256.simplejmx.common.JmxResourceInfo("RUNNING", "STARTING", strArray6, "STOPPED");
        jmxOperationInfo1.setParameterDescriptions(strArray6);
        java.lang.String[] strArray10 = jmxOperationInfo1.getParameterNames();
        java.lang.String str11 = jmxOperationInfo1.getDescription();
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo13 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo17 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        jmxOperationInfo17.setMethodName("STOPPING");
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo21 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        java.lang.String[] strArray26 = new java.lang.String[] { "STOPPED", "hi!" };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo28 = new com.j256.simplejmx.common.JmxResourceInfo("RUNNING", "STARTING", strArray26, "STOPPED");
        jmxOperationInfo21.setParameterDescriptions(strArray26);
        jmxOperationInfo17.setParameterDescriptions(strArray26);
        javax.management.ObjectName objectName31 = com.j256.simplejmx.common.ObjectNameUtil.makeObjectName("STOPPED", "", strArray26);
        jmxOperationInfo13.setParameterNames(strArray26);
        jmxOperationInfo1.setParameterNames(strArray26);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(objectName31);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.JmxClient jmxClient4 = new com.j256.simplejmx.client.JmxClient("100.0", (int) (short) 1, "FAILED", "100");
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: Problems connecting to the serverjava.io.IOException: Failed to retrieve RMIServer stub: javax.naming.InvalidNameException: invalid authority: 100.0:1 [Root exception is java.lang.IllegalArgumentException: invalid authority: 100.0:1]");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        java.net.InetAddress inetAddress0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.JmxClient jmxClient2 = new com.j256.simplejmx.client.JmxClient(inetAddress0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo1 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        java.lang.String str2 = jmxOperationInfo1.getDescription();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean2 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) (-1), "hi!");
        com.j256.simplejmx.common.BaseJmxSelfNaming baseJmxSelfNaming3 = new com.j256.simplejmx.common.BaseJmxSelfNaming();
        java.lang.String str4 = baseJmxSelfNaming3.getJmxBeanName();
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean6 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) baseJmxSelfNaming3, "hi!");
        java.lang.String[] strArray10 = new java.lang.String[] { "null(r)", "null", "100" };
        javax.management.AttributeList attributeList11 = reflectionMbean6.getAttributes(strArray10);
        javax.management.AttributeList attributeList12 = reflectionMbean2.getAttributes(strArray10);
        javax.management.MBeanInfo mBeanInfo13 = reflectionMbean2.getMBeanInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = reflectionMbean2.getAttribute("RUNNING");
            org.junit.Assert.fail("Expected exception of type javax.management.AttributeNotFoundException; message: Unknown attribute RUNNING");
        } catch (javax.management.AttributeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeList12);
        org.junit.Assert.assertNotNull(mBeanInfo13);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.j256.simplejmx.server.JmxServer jmxServer1 = new com.j256.simplejmx.server.JmxServer((int) (byte) 1);
        jmxServer1.close();
        jmxServer1.setUsePlatformMBeanServer(false);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName6 = jmxServer1.register((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: JmxServer has not be started");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.j256.simplejmx.client.JmxClient jmxClient0 = null;
        com.j256.simplejmx.client.CommandLineJmxClient commandLineJmxClient1 = new com.j256.simplejmx.client.CommandLineJmxClient(jmxClient0);
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo3 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        jmxOperationInfo3.setMethodName("STOPPING");
        java.lang.String[] strArray10 = new java.lang.String[] { "STOPPED", "hi!" };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo12 = new com.j256.simplejmx.common.JmxResourceInfo("RUNNING", "STARTING", strArray10, "STOPPED");
        jmxOperationInfo3.setParameterDescriptions(strArray10);
        commandLineJmxClient1.runCommands(strArray10);
        commandLineJmxClient1.close();
        com.j256.simplejmx.common.BaseJmxSelfNaming baseJmxSelfNaming16 = new com.j256.simplejmx.common.BaseJmxSelfNaming();
        java.lang.String str17 = baseJmxSelfNaming16.getJmxBeanName();
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean19 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) baseJmxSelfNaming16, "hi!");
        java.lang.String[] strArray23 = new java.lang.String[] { "null(r)", "null", "100" };
        javax.management.AttributeList attributeList24 = reflectionMbean19.getAttributes(strArray23);
        commandLineJmxClient1.runCommands(strArray23);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(attributeList24);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo4 = new com.j256.simplejmx.common.JmxAttributeFieldInfo("null", true, true, "STARTING");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer(0, (int) (short) 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        com.j256.simplejmx.server.JmxServer jmxServer1 = new com.j256.simplejmx.server.JmxServer(true);
        jmxServer1.setPort((int) (short) 100);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.j256.simplejmx.web.JmxWebHandler jmxWebHandler0 = new com.j256.simplejmx.web.JmxWebHandler();
        com.j256.simplejmx.server.JmxServer jmxServer3 = new com.j256.simplejmx.server.JmxServer((int) (byte) 10, (int) (byte) -1);
        jmxServer3.close();
        jmxServer3.close();
        boolean boolean6 = jmxWebHandler0.addBean((java.lang.Object) jmxServer3);
        com.j256.simplejmx.spring.JmxBean jmxBean7 = new com.j256.simplejmx.spring.JmxBean();
        java.lang.Object obj8 = jmxBean7.getTarget();
        javax.management.MBeanServer mBeanServer9 = null;
        com.j256.simplejmx.server.JmxServer jmxServer10 = new com.j256.simplejmx.server.JmxServer(mBeanServer9);
        jmxBean7.setTarget((java.lang.Object) jmxServer10);
        boolean boolean12 = jmxWebHandler0.removeBean((java.lang.Object) jmxBean7);
        boolean boolean13 = jmxWebHandler0.isStarted();
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo15 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("100");
        boolean boolean16 = jmxWebHandler0.removeBean((java.lang.Object) "100");
        com.j256.simplejmx.server.JmxServer jmxServer18 = new com.j256.simplejmx.server.JmxServer((int) (short) -1);
        jmxServer18.setPort(0);
        java.net.InetAddress inetAddress21 = null;
        jmxServer18.setInetAddress(inetAddress21);
        // The following exception was thrown during execution in test generation
        try {
            jmxWebHandler0.manage((java.lang.Object) jmxServer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo1 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("null");
        jmxAttributeMethodInfo1.setMethodName("STARTED");
        jmxAttributeMethodInfo1.setMethodName("null");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.j256.simplejmx.server.JmxServer jmxServer1 = new com.j256.simplejmx.server.JmxServer((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            jmxServer1.start();
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: Unable to create RMI registry on port 1");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        java.lang.String[] strArray4 = new java.lang.String[] { "STOPPED", "hi!" };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo6 = new com.j256.simplejmx.common.JmxResourceInfo("RUNNING", "STARTING", strArray4, "STOPPED");
        java.lang.String str7 = jmxResourceInfo6.getJmxDescription();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "STOPPED" + "'", str7, "STOPPED");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        com.j256.simplejmx.common.BaseJmxSelfNaming baseJmxSelfNaming0 = new com.j256.simplejmx.common.BaseJmxSelfNaming();
        java.lang.String str1 = baseJmxSelfNaming0.getJmxBeanName();
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean3 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) baseJmxSelfNaming0, "hi!");
        java.lang.String str4 = baseJmxSelfNaming0.getJmxBeanName();
        java.lang.String str5 = baseJmxSelfNaming0.getJmxBeanName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.j256.simplejmx.client.JmxClient jmxClient0 = null;
        com.j256.simplejmx.client.CommandLineJmxClient commandLineJmxClient1 = new com.j256.simplejmx.client.CommandLineJmxClient(jmxClient0);
        commandLineJmxClient1.close();
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo6 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        jmxOperationInfo6.setMethodName("STOPPING");
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo10 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        java.lang.String[] strArray15 = new java.lang.String[] { "STOPPED", "hi!" };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo17 = new com.j256.simplejmx.common.JmxResourceInfo("RUNNING", "STARTING", strArray15, "STOPPED");
        jmxOperationInfo10.setParameterDescriptions(strArray15);
        jmxOperationInfo6.setParameterDescriptions(strArray15);
        javax.management.ObjectName objectName20 = com.j256.simplejmx.common.ObjectNameUtil.makeObjectName("STOPPED", "", strArray15);
        commandLineJmxClient1.runCommands(strArray15);
        java.io.File file22 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLineJmxClient1.runBatchFile(file22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(objectName20);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer(inetAddress0, (int) (short) 1);
        jmxServer2.setPort((int) (byte) 10);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.web.JmxWebServer jmxWebServer2 = new com.j256.simplejmx.web.JmxWebServer(inetAddress0, (int) (byte) 0);
        jmxWebServer2.setMinNumThreads(0);
        jmxWebServer2.close();
        jmxWebServer2.setMaxNumThreads((int) (short) 100);
        jmxWebServer2.start();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.CommandLineJmxClient commandLineJmxClient1 = new com.j256.simplejmx.client.CommandLineJmxClient((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: Problems connecting to the serverjava.io.IOException: Failed to retrieve RMIServer stub: javax.naming.NameNotFoundException: jmxrmi");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName2 = new com.j256.simplejmx.common.JmxFolderName("STOPPING", "");
        java.lang.String str3 = jmxFolderName2.getField();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "STOPPING" + "'", str3, "STOPPING");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.j256.simplejmx.common.BaseJmxSelfNaming baseJmxSelfNaming0 = new com.j256.simplejmx.common.BaseJmxSelfNaming();
        java.lang.String str1 = baseJmxSelfNaming0.getJmxBeanName();
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean3 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) baseJmxSelfNaming0, "hi!");
        java.lang.String[] strArray7 = new java.lang.String[] { "null(r)", "null", "100" };
        javax.management.AttributeList attributeList8 = reflectionMbean3.getAttributes(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = reflectionMbean3.getAttribute("hi!");
            org.junit.Assert.fail("Expected exception of type javax.management.AttributeNotFoundException; message: Unknown attribute hi!");
        } catch (javax.management.AttributeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(attributeList8);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        com.j256.simplejmx.spring.JmxBean jmxBean0 = new com.j256.simplejmx.spring.JmxBean();
        java.lang.Object obj1 = jmxBean0.getTarget();
        javax.management.MBeanServer mBeanServer2 = null;
        com.j256.simplejmx.server.JmxServer jmxServer3 = new com.j256.simplejmx.server.JmxServer(mBeanServer2);
        jmxBean0.setTarget((java.lang.Object) jmxServer3);
        jmxBean0.setAttributeFieldNames("null");
        jmxBean0.setAttributeMethodNames("service:jmx:rmi:///jndi/rmi://null:100/jmxrmi");
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray9 = jmxBean0.getOperationInfos();
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(jmxOperationInfoArray9);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        com.j256.simplejmx.spring.JmxBean jmxBean1 = new com.j256.simplejmx.spring.JmxBean();
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray2 = jmxBean1.getOperationInfos();
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo5 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("hi!", "null");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo8 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("STARTING", "STOPPING");
        jmxAttributeMethodInfo8.setDescription("STARTING");
        jmxAttributeMethodInfo8.setDescription("RUNNING");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo15 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("STARTING", "STOPPING");
        jmxAttributeMethodInfo15.setDescription("STARTING");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo20 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("STARTING", "STOPPING");
        jmxAttributeMethodInfo20.setDescription("STARTING");
        jmxAttributeMethodInfo20.setDescription("RUNNING");
        com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray25 = new com.j256.simplejmx.common.JmxAttributeMethodInfo[] { jmxAttributeMethodInfo5, jmxAttributeMethodInfo8, jmxAttributeMethodInfo15, jmxAttributeMethodInfo20 };
        jmxBean1.setAttributeMethodInfos(jmxAttributeMethodInfoArray25);
        jmxBean1.setOperationNames("100.0");
        java.lang.Object obj29 = jmxBean1.getTarget();
        java.lang.String str30 = com.j256.simplejmx.client.ClientUtils.displayType("100.0", obj29);
        org.junit.Assert.assertNull(jmxOperationInfoArray2);
        org.junit.Assert.assertNotNull(jmxAttributeMethodInfoArray25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "100.0" + "'", str30, "100.0");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo1 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        jmxOperationInfo1.setMethodName("STOPPING");
        jmxOperationInfo1.setMethodName("STARTING");
        jmxOperationInfo1.setDescription("STOPPING");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.j256.simplejmx.client.JmxClient jmxClient0 = null;
        com.j256.simplejmx.client.CommandLineJmxClient commandLineJmxClient1 = new com.j256.simplejmx.client.CommandLineJmxClient(jmxClient0);
        commandLineJmxClient1.close();
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo6 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        jmxOperationInfo6.setMethodName("STOPPING");
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo10 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        java.lang.String[] strArray15 = new java.lang.String[] { "STOPPED", "hi!" };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo17 = new com.j256.simplejmx.common.JmxResourceInfo("RUNNING", "STARTING", strArray15, "STOPPED");
        jmxOperationInfo10.setParameterDescriptions(strArray15);
        jmxOperationInfo6.setParameterDescriptions(strArray15);
        javax.management.ObjectName objectName20 = com.j256.simplejmx.common.ObjectNameUtil.makeObjectName("STOPPED", "", strArray15);
        commandLineJmxClient1.runCommands(strArray15);
        commandLineJmxClient1.close();
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(objectName20);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo4 = new com.j256.simplejmx.common.JmxAttributeFieldInfo("", false, false, "STARTING");
        java.lang.String str5 = jmxAttributeFieldInfo4.getFieldName();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo6 = new com.j256.simplejmx.common.JmxResourceInfo();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray7 = jmxResourceInfo6.getJmxFolderNames();
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper8 = new com.j256.simplejmx.server.PublishAllBeanWrapper((java.lang.Object) str5, jmxResourceInfo6);
        com.j256.simplejmx.common.JmxAttributeFieldInfo[] jmxAttributeFieldInfoArray9 = publishAllBeanWrapper8.getAttributeFieldInfos();
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray10 = publishAllBeanWrapper8.getOperationInfos();
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo15 = new com.j256.simplejmx.common.JmxAttributeFieldInfo("", false, false, "STARTING");
        java.lang.String str16 = jmxAttributeFieldInfo15.getFieldName();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo17 = new com.j256.simplejmx.common.JmxResourceInfo();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray18 = jmxResourceInfo17.getJmxFolderNames();
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper19 = new com.j256.simplejmx.server.PublishAllBeanWrapper((java.lang.Object) str16, jmxResourceInfo17);
        publishAllBeanWrapper8.setTarget((java.lang.Object) jmxResourceInfo17);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jmxFolderNameArray7);
        org.junit.Assert.assertNotNull(jmxAttributeFieldInfoArray9);
        org.junit.Assert.assertNotNull(jmxOperationInfoArray10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(jmxFolderNameArray18);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean2 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) (-1), "hi!");
        com.j256.simplejmx.common.BaseJmxSelfNaming baseJmxSelfNaming3 = new com.j256.simplejmx.common.BaseJmxSelfNaming();
        java.lang.String str4 = baseJmxSelfNaming3.getJmxBeanName();
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean6 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) baseJmxSelfNaming3, "hi!");
        java.lang.String[] strArray10 = new java.lang.String[] { "null(r)", "null", "100" };
        javax.management.AttributeList attributeList11 = reflectionMbean6.getAttributes(strArray10);
        javax.management.AttributeList attributeList12 = reflectionMbean2.getAttributes(strArray10);
        javax.management.MBeanInfo mBeanInfo13 = reflectionMbean2.getMBeanInfo();
        java.lang.String[] strArray20 = new java.lang.String[] { "STOPPED", "hi!" };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo22 = new com.j256.simplejmx.common.JmxResourceInfo("RUNNING", "STARTING", strArray20, "STOPPED");
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo24 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "", strArray20, "100");
        javax.management.AttributeList attributeList25 = reflectionMbean2.getAttributes(strArray20);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeList12);
        org.junit.Assert.assertNotNull(mBeanInfo13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(attributeList25);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.CommandLineJmxClient commandLineJmxClient2 = new com.j256.simplejmx.client.CommandLineJmxClient("100.0", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: Problems connecting to the serverjava.io.IOException: Failed to retrieve RMIServer stub: javax.naming.InvalidNameException: invalid authority: 100.0:0 [Root exception is java.lang.IllegalArgumentException: invalid authority: 100.0:0]");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.server.JmxServer jmxServer3 = new com.j256.simplejmx.server.JmxServer(inetAddress0, 10, (int) ' ');
        jmxServer3.close();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo1 = new com.j256.simplejmx.common.JmxAttributeFieldInfo("RUNNING");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer(inetAddress0, (int) (short) 1);
        jmxServer2.stopThrow();
        int int4 = jmxServer2.getRegistryPort();
        jmxServer2.stop();
        jmxServer2.setPort((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean2 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) (-1), "hi!");
        com.j256.simplejmx.common.BaseJmxSelfNaming baseJmxSelfNaming3 = new com.j256.simplejmx.common.BaseJmxSelfNaming();
        java.lang.String str4 = baseJmxSelfNaming3.getJmxBeanName();
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean6 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) baseJmxSelfNaming3, "hi!");
        java.lang.String[] strArray10 = new java.lang.String[] { "null(r)", "null", "100" };
        javax.management.AttributeList attributeList11 = reflectionMbean6.getAttributes(strArray10);
        javax.management.AttributeList attributeList12 = reflectionMbean2.setAttributes(attributeList11);
        javax.management.Attribute attribute13 = null;
        // The following exception was thrown during execution in test generation
        try {
            reflectionMbean2.setAttribute(attribute13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributeList12);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName5 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName8 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName11 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray12 = new com.j256.simplejmx.common.JmxFolderName[] { jmxFolderName5, jmxFolderName8, jmxFolderName11 };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo14 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "hi!", jmxFolderNameArray12, "");
        java.lang.String str15 = jmxResourceInfo14.getJmxDescription();
        java.lang.String str16 = jmxResourceInfo14.getJmxDomainName();
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper17 = new com.j256.simplejmx.server.PublishAllBeanWrapper((java.lang.Object) (short) 0, jmxResourceInfo14);
        org.junit.Assert.assertNotNull(jmxFolderNameArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "STOPPED" + "'", str16, "STOPPED");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.JmxClient jmxClient2 = new com.j256.simplejmx.client.JmxClient("FAILED", strMap1);
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: JmxServiceUrl was malformed: FAILED");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.JmxClient jmxClient3 = new com.j256.simplejmx.client.JmxClient("", "RUNNING", "FAILED");
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: JmxServiceUrl was malformed: ");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        com.j256.simplejmx.web.JmxWebHandler jmxWebHandler0 = new com.j256.simplejmx.web.JmxWebHandler();
        com.j256.simplejmx.server.JmxServer jmxServer3 = new com.j256.simplejmx.server.JmxServer((int) (byte) 10, (int) (byte) -1);
        jmxServer3.close();
        jmxServer3.close();
        boolean boolean6 = jmxWebHandler0.addBean((java.lang.Object) jmxServer3);
        com.j256.simplejmx.spring.JmxBean jmxBean7 = new com.j256.simplejmx.spring.JmxBean();
        java.lang.Object obj8 = jmxBean7.getTarget();
        javax.management.MBeanServer mBeanServer9 = null;
        com.j256.simplejmx.server.JmxServer jmxServer10 = new com.j256.simplejmx.server.JmxServer(mBeanServer9);
        jmxBean7.setTarget((java.lang.Object) jmxServer10);
        boolean boolean12 = jmxWebHandler0.removeBean((java.lang.Object) jmxBean7);
        java.lang.String[] strArray19 = new java.lang.String[] { "STOPPED", "hi!" };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo21 = new com.j256.simplejmx.common.JmxResourceInfo("RUNNING", "STARTING", strArray19, "STOPPED");
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo23 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "", strArray19, "100");
        boolean boolean24 = jmxWebHandler0.removeBean((java.lang.Object) strArray19);
        com.j256.simplejmx.spring.JmxBean jmxBean25 = new com.j256.simplejmx.spring.JmxBean();
        boolean boolean26 = jmxWebHandler0.contains((java.lang.Object) jmxBean25);
        boolean boolean27 = jmxWebHandler0.isStarting();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        com.j256.simplejmx.server.JmxServer jmxServer1 = new com.j256.simplejmx.server.JmxServer((int) '4');
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName2 = new com.j256.simplejmx.common.JmxFolderName("null", "STOPPING");
        java.lang.String str3 = jmxFolderName2.getField();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        java.lang.String str2 = com.j256.simplejmx.client.JmxClient.generalJmxUrlForHostNamePort("STARTING", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "service:jmx:rmi:///jndi/rmi://STARTING:-1/jmxrmi" + "'", str2, "service:jmx:rmi:///jndi/rmi://STARTING:-1/jmxrmi");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo1 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("100.0");
        java.lang.String str2 = jmxAttributeMethodInfo1.getMethodName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0" + "'", str2, "100.0");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.web.JmxWebServer jmxWebServer2 = new com.j256.simplejmx.web.JmxWebServer(inetAddress0, (int) (byte) 0);
        jmxWebServer2.setMinNumThreads(0);
        jmxWebServer2.stop();
        jmxWebServer2.stop();
        jmxWebServer2.start();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        com.j256.simplejmx.web.JmxWebHandler jmxWebHandler0 = new com.j256.simplejmx.web.JmxWebHandler();
        com.j256.simplejmx.server.JmxServer jmxServer3 = new com.j256.simplejmx.server.JmxServer((int) (byte) 10, (int) (byte) -1);
        jmxServer3.close();
        jmxServer3.close();
        boolean boolean6 = jmxWebHandler0.addBean((java.lang.Object) jmxServer3);
        java.lang.Appendable appendable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            jmxWebHandler0.dump(appendable7, "RUNNING");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        com.j256.simplejmx.spring.JmxBean jmxBean0 = new com.j256.simplejmx.spring.JmxBean();
        java.lang.Object obj1 = jmxBean0.getTarget();
        com.j256.simplejmx.common.JmxAttributeFieldInfo[] jmxAttributeFieldInfoArray2 = jmxBean0.getAttributeFieldInfos();
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray3 = jmxBean0.getOperationInfos();
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo8 = new com.j256.simplejmx.common.JmxAttributeFieldInfo("", false, false, "STARTING");
        java.lang.String str9 = jmxAttributeFieldInfo8.getFieldName();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo10 = new com.j256.simplejmx.common.JmxResourceInfo();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray11 = jmxResourceInfo10.getJmxFolderNames();
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper12 = new com.j256.simplejmx.server.PublishAllBeanWrapper((java.lang.Object) str9, jmxResourceInfo10);
        com.j256.simplejmx.common.JmxAttributeFieldInfo[] jmxAttributeFieldInfoArray13 = publishAllBeanWrapper12.getAttributeFieldInfos();
        com.j256.simplejmx.common.JmxAttributeFieldInfo[] jmxAttributeFieldInfoArray14 = publishAllBeanWrapper12.getAttributeFieldInfos();
        jmxBean0.setAttributeFieldInfos(jmxAttributeFieldInfoArray14);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(jmxAttributeFieldInfoArray2);
        org.junit.Assert.assertNull(jmxOperationInfoArray3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jmxFolderNameArray11);
        org.junit.Assert.assertNotNull(jmxAttributeFieldInfoArray13);
        org.junit.Assert.assertNotNull(jmxAttributeFieldInfoArray14);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        com.j256.simplejmx.web.JmxWebHandler jmxWebHandler0 = new com.j256.simplejmx.web.JmxWebHandler();
        com.j256.simplejmx.server.JmxServer jmxServer3 = new com.j256.simplejmx.server.JmxServer((int) (byte) 10, (int) (byte) -1);
        jmxServer3.close();
        jmxServer3.close();
        boolean boolean6 = jmxWebHandler0.addBean((java.lang.Object) jmxServer3);
        com.j256.simplejmx.spring.JmxBean jmxBean7 = new com.j256.simplejmx.spring.JmxBean();
        java.lang.Object obj8 = jmxBean7.getTarget();
        javax.management.MBeanServer mBeanServer9 = null;
        com.j256.simplejmx.server.JmxServer jmxServer10 = new com.j256.simplejmx.server.JmxServer(mBeanServer9);
        jmxBean7.setTarget((java.lang.Object) jmxServer10);
        boolean boolean12 = jmxWebHandler0.removeBean((java.lang.Object) jmxBean7);
        java.lang.String[] strArray19 = new java.lang.String[] { "STOPPED", "hi!" };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo21 = new com.j256.simplejmx.common.JmxResourceInfo("RUNNING", "STARTING", strArray19, "STOPPED");
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo23 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "", strArray19, "100");
        boolean boolean24 = jmxWebHandler0.removeBean((java.lang.Object) strArray19);
        org.eclipse.jetty.util.component.LifeCycle.Listener listener25 = null;
        jmxWebHandler0.removeLifeCycleListener(listener25);
        com.j256.simplejmx.client.JmxClient jmxClient27 = null;
        com.j256.simplejmx.client.CommandLineJmxClient commandLineJmxClient28 = new com.j256.simplejmx.client.CommandLineJmxClient(jmxClient27);
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo30 = new com.j256.simplejmx.common.JmxOperationInfo("STARTING");
        jmxOperationInfo30.setMethodName("STOPPING");
        java.lang.String[] strArray37 = new java.lang.String[] { "STOPPED", "hi!" };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo39 = new com.j256.simplejmx.common.JmxResourceInfo("RUNNING", "STARTING", strArray37, "STOPPED");
        jmxOperationInfo30.setParameterDescriptions(strArray37);
        commandLineJmxClient28.runCommands(strArray37);
        boolean boolean43 = jmxWebHandler0.addBean((java.lang.Object) commandLineJmxClient28, true);
        java.lang.Appendable appendable44 = null;
        // The following exception was thrown during execution in test generation
        try {
            jmxWebHandler0.dump(appendable44, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        java.net.InetAddress inetAddress0 = null;
        com.j256.simplejmx.web.JmxWebServer jmxWebServer2 = new com.j256.simplejmx.web.JmxWebServer(inetAddress0, (int) (short) 1);
        jmxWebServer2.setServerPort((int) (byte) 100);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        // The following exception was thrown during execution in test generation
        try {
            com.j256.simplejmx.client.CommandLineJmxClient commandLineJmxClient1 = new com.j256.simplejmx.client.CommandLineJmxClient(100);
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: Problems connecting to the serverjava.io.IOException: Failed to retrieve RMIServer stub: javax.naming.ServiceUnavailableException [Root exception is java.rmi.ConnectException: Connection refused to host: 192.168.1.88; nested exception is: ??java.net.ConnectException: Connection refused (Connection refused)]");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo4 = new com.j256.simplejmx.common.JmxAttributeFieldInfo("hi!", true, false, "STARTED");
        jmxAttributeFieldInfo4.setReadible(false);
        jmxAttributeFieldInfo4.setDescription("RUNNING");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper0 = new com.j256.simplejmx.server.PublishAllBeanWrapper();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo1 = publishAllBeanWrapper0.getJmxResourceInfo();
        java.lang.Object obj2 = publishAllBeanWrapper0.getTarget();
        com.j256.simplejmx.common.JmxFolderName jmxFolderName7 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName10 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName13 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray14 = new com.j256.simplejmx.common.JmxFolderName[] { jmxFolderName7, jmxFolderName10, jmxFolderName13 };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo16 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "hi!", jmxFolderNameArray14, "");
        java.lang.String str17 = jmxResourceInfo16.getJmxDescription();
        java.lang.String str18 = jmxResourceInfo16.getJmxDescription();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray19 = jmxResourceInfo16.getJmxFolderNames();
        publishAllBeanWrapper0.setJmxResourceInfo(jmxResourceInfo16);
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray21 = jmxResourceInfo16.getJmxFolderNames();
        org.junit.Assert.assertNull(jmxResourceInfo1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(jmxFolderNameArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(jmxFolderNameArray19);
        org.junit.Assert.assertNotNull(jmxFolderNameArray21);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        com.j256.simplejmx.common.JmxOperationInfo jmxOperationInfo0 = new com.j256.simplejmx.common.JmxOperationInfo();
        jmxOperationInfo0.setMethodName("hi!");
        java.lang.String str3 = jmxOperationInfo0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer((int) (byte) -1, (int) (short) 1);
        int int3 = jmxServer2.getRegisteredCount();
        com.j256.simplejmx.client.Main main4 = new com.j256.simplejmx.client.Main();
        jmxServer2.unregister((java.lang.Object) main4);
        com.j256.simplejmx.server.JmxServer jmxServer7 = new com.j256.simplejmx.server.JmxServer((int) (short) -1);
        jmxServer7.setPort(0);
        com.j256.simplejmx.common.JmxFolderName jmxFolderName16 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName19 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName22 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray23 = new com.j256.simplejmx.common.JmxFolderName[] { jmxFolderName16, jmxFolderName19, jmxFolderName22 };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo25 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "hi!", jmxFolderNameArray23, "");
        java.lang.String str26 = jmxResourceInfo25.getJmxDescription();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray27 = jmxResourceInfo25.getJmxFolderNames();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo29 = new com.j256.simplejmx.common.JmxResourceInfo("", "STOPPING", jmxFolderNameArray27, "");
        jmxServer7.unregister((java.lang.Object) jmxFolderNameArray27);
        com.j256.simplejmx.common.JmxFolderName jmxFolderName35 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName38 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName41 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray42 = new com.j256.simplejmx.common.JmxFolderName[] { jmxFolderName35, jmxFolderName38, jmxFolderName41 };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo44 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "hi!", jmxFolderNameArray42, "");
        java.lang.String str45 = jmxResourceInfo44.getJmxDescription();
        java.lang.String str46 = jmxResourceInfo44.getJmxDescription();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray47 = jmxResourceInfo44.getJmxFolderNames();
        java.lang.String[] strArray53 = new java.lang.String[] { "STOPPED", "hi!" };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo55 = new com.j256.simplejmx.common.JmxResourceInfo("RUNNING", "STARTING", strArray53, "STOPPED");
        java.lang.String str56 = jmxResourceInfo55.getJmxBeanName();
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper57 = new com.j256.simplejmx.server.PublishAllBeanWrapper((java.lang.Object) "STOPPING", jmxResourceInfo55);
        com.j256.simplejmx.common.JmxAttributeFieldInfo[] jmxAttributeFieldInfoArray58 = publishAllBeanWrapper57.getAttributeFieldInfos();
        com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray59 = null;
        com.j256.simplejmx.common.JmxOperationInfo.OperationAction operationAction60 = com.j256.simplejmx.common.JmxOperationInfo.OperationAction.INFO;
        int int61 = operationAction60.getActionValue();
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo63 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo63.setFieldName("hi!");
        jmxAttributeFieldInfo63.setWritable(false);
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo72 = new com.j256.simplejmx.common.JmxAttributeFieldInfo("", false, false, "STARTING");
        java.lang.String str73 = jmxAttributeFieldInfo72.getFieldName();
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo74 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo74.setFieldName("hi!");
        jmxAttributeFieldInfo74.setName("");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo79 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo79.setFieldName("hi!");
        jmxAttributeFieldInfo79.setName("null");
        jmxAttributeFieldInfo79.setDescription("STOPPING");
        java.lang.String str86 = jmxAttributeFieldInfo79.getDescription();
        com.j256.simplejmx.common.JmxAttributeFieldInfo[] jmxAttributeFieldInfoArray87 = new com.j256.simplejmx.common.JmxAttributeFieldInfo[] { jmxAttributeFieldInfo63, jmxAttributeFieldInfo72, jmxAttributeFieldInfo74, jmxAttributeFieldInfo79 };
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo90 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("hi!", "null");
        jmxAttributeMethodInfo90.setMethodName("");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo94 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("");
        com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray95 = new com.j256.simplejmx.common.JmxAttributeMethodInfo[] { jmxAttributeMethodInfo90, jmxAttributeMethodInfo94 };
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray96 = new com.j256.simplejmx.common.JmxOperationInfo[] {};
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean98 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) int61, "service:jmx:rmi:///jndi/rmi://null:100/jmxrmi", jmxAttributeFieldInfoArray87, jmxAttributeMethodInfoArray95, jmxOperationInfoArray96, true);
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName99 = jmxServer2.register((java.lang.Object) jmxServer7, jmxResourceInfo44, jmxAttributeFieldInfoArray58, jmxAttributeMethodInfoArray59, jmxOperationInfoArray96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid ObjectName generated: STOPPED:STARTING=STOPPING,STARTING=STOPPING,STARTING=STOPPING,name=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(jmxFolderNameArray23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(jmxFolderNameArray27);
        org.junit.Assert.assertNotNull(jmxFolderNameArray42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(jmxFolderNameArray47);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "STARTING" + "'", str56, "STARTING");
        org.junit.Assert.assertNotNull(jmxAttributeFieldInfoArray58);
        org.junit.Assert.assertTrue("'" + operationAction60 + "' != '" + com.j256.simplejmx.common.JmxOperationInfo.OperationAction.INFO + "'", operationAction60.equals(com.j256.simplejmx.common.JmxOperationInfo.OperationAction.INFO));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "STOPPING" + "'", str86, "STOPPING");
        org.junit.Assert.assertNotNull(jmxAttributeFieldInfoArray87);
        org.junit.Assert.assertNotNull(jmxAttributeMethodInfoArray95);
        org.junit.Assert.assertNotNull(jmxOperationInfoArray96);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        com.j256.simplejmx.server.JmxServer jmxServer2 = new com.j256.simplejmx.server.JmxServer((int) (byte) 10, (int) (byte) -1);
        jmxServer2.close();
        com.j256.simplejmx.common.JmxFolderName jmxFolderName10 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName13 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName16 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray17 = new com.j256.simplejmx.common.JmxFolderName[] { jmxFolderName10, jmxFolderName13, jmxFolderName16 };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo19 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "hi!", jmxFolderNameArray17, "");
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo21 = new com.j256.simplejmx.common.JmxResourceInfo("hi!", "RUNNING", jmxFolderNameArray17, "");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray22 = jmxResourceInfo21.getJmxFolderNames();
        javax.management.ObjectName objectName26 = com.j256.simplejmx.common.ObjectNameUtil.makeObjectName("RUNNING", "null");
        java.lang.String str27 = com.j256.simplejmx.client.ClientUtils.displayType("100.0", (java.lang.Object) objectName26);
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo33 = new com.j256.simplejmx.common.JmxAttributeFieldInfo("", false, false, "STARTING");
        java.lang.String str34 = jmxAttributeFieldInfo33.getFieldName();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo35 = new com.j256.simplejmx.common.JmxResourceInfo();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray36 = jmxResourceInfo35.getJmxFolderNames();
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper37 = new com.j256.simplejmx.server.PublishAllBeanWrapper((java.lang.Object) str34, jmxResourceInfo35);
        com.j256.simplejmx.common.JmxAttributeFieldInfo[] jmxAttributeFieldInfoArray38 = publishAllBeanWrapper37.getAttributeFieldInfos();
        com.j256.simplejmx.common.JmxOperationInfo.OperationAction operationAction39 = com.j256.simplejmx.common.JmxOperationInfo.OperationAction.INFO;
        int int40 = operationAction39.getActionValue();
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo42 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo42.setFieldName("hi!");
        jmxAttributeFieldInfo42.setWritable(false);
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo51 = new com.j256.simplejmx.common.JmxAttributeFieldInfo("", false, false, "STARTING");
        java.lang.String str52 = jmxAttributeFieldInfo51.getFieldName();
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo53 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo53.setFieldName("hi!");
        jmxAttributeFieldInfo53.setName("");
        com.j256.simplejmx.common.JmxAttributeFieldInfo jmxAttributeFieldInfo58 = new com.j256.simplejmx.common.JmxAttributeFieldInfo();
        jmxAttributeFieldInfo58.setFieldName("hi!");
        jmxAttributeFieldInfo58.setName("null");
        jmxAttributeFieldInfo58.setDescription("STOPPING");
        java.lang.String str65 = jmxAttributeFieldInfo58.getDescription();
        com.j256.simplejmx.common.JmxAttributeFieldInfo[] jmxAttributeFieldInfoArray66 = new com.j256.simplejmx.common.JmxAttributeFieldInfo[] { jmxAttributeFieldInfo42, jmxAttributeFieldInfo51, jmxAttributeFieldInfo53, jmxAttributeFieldInfo58 };
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo69 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("hi!", "null");
        jmxAttributeMethodInfo69.setMethodName("");
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo73 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("");
        com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray74 = new com.j256.simplejmx.common.JmxAttributeMethodInfo[] { jmxAttributeMethodInfo69, jmxAttributeMethodInfo73 };
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray75 = new com.j256.simplejmx.common.JmxOperationInfo[] {};
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean77 = new com.j256.simplejmx.server.ReflectionMbean((java.lang.Object) int40, "service:jmx:rmi:///jndi/rmi://null:100/jmxrmi", jmxAttributeFieldInfoArray66, jmxAttributeMethodInfoArray74, jmxOperationInfoArray75, true);
        com.j256.simplejmx.spring.JmxBean jmxBean78 = new com.j256.simplejmx.spring.JmxBean();
        java.lang.Object obj79 = jmxBean78.getTarget();
        com.j256.simplejmx.common.JmxAttributeFieldInfo[] jmxAttributeFieldInfoArray80 = jmxBean78.getAttributeFieldInfos();
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray81 = jmxBean78.getOperationInfos();
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray82 = new com.j256.simplejmx.common.JmxOperationInfo[] {};
        jmxBean78.setOperationInfos(jmxOperationInfoArray82);
        // The following exception was thrown during execution in test generation
        try {
            jmxServer2.register((java.lang.Object) jmxResourceInfo21, objectName26, "100.0", jmxAttributeFieldInfoArray38, jmxAttributeMethodInfoArray74, jmxOperationInfoArray82);
            org.junit.Assert.fail("Expected exception of type javax.management.JMException; message: JmxServer has not be started");
        } catch (javax.management.JMException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jmxFolderNameArray17);
        org.junit.Assert.assertNotNull(jmxFolderNameArray22);
        org.junit.Assert.assertNotNull(objectName26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "100.0" + "'", str27, "100.0");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(jmxFolderNameArray36);
        org.junit.Assert.assertNotNull(jmxAttributeFieldInfoArray38);
        org.junit.Assert.assertTrue("'" + operationAction39 + "' != '" + com.j256.simplejmx.common.JmxOperationInfo.OperationAction.INFO + "'", operationAction39.equals(com.j256.simplejmx.common.JmxOperationInfo.OperationAction.INFO));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "STOPPING" + "'", str65, "STOPPING");
        org.junit.Assert.assertNotNull(jmxAttributeFieldInfoArray66);
        org.junit.Assert.assertNotNull(jmxAttributeMethodInfoArray74);
        org.junit.Assert.assertNotNull(jmxOperationInfoArray75);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(jmxAttributeFieldInfoArray80);
        org.junit.Assert.assertNull(jmxOperationInfoArray81);
        org.junit.Assert.assertNotNull(jmxOperationInfoArray82);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        com.j256.simplejmx.spring.BeanPublisher beanPublisher0 = new com.j256.simplejmx.spring.BeanPublisher();
        beanPublisher0.destroy();
        beanPublisher0.destroy();
        com.j256.simplejmx.server.JmxServer jmxServer5 = new com.j256.simplejmx.server.JmxServer((int) (byte) 10, (int) (byte) -1);
        java.net.InetAddress inetAddress6 = null;
        jmxServer5.setInetAddress(inetAddress6);
        jmxServer5.stop();
        beanPublisher0.setJmxServer(jmxServer5);
        // The following exception was thrown during execution in test generation
        try {
            beanPublisher0.afterPropertiesSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName4 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName7 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName jmxFolderName10 = new com.j256.simplejmx.common.JmxFolderName("STARTING", "STOPPING");
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray11 = new com.j256.simplejmx.common.JmxFolderName[] { jmxFolderName4, jmxFolderName7, jmxFolderName10 };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo13 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "hi!", jmxFolderNameArray11, "");
        java.lang.String str14 = jmxResourceInfo13.getJmxDescription();
        java.lang.String str15 = jmxResourceInfo13.getJmxDescription();
        com.j256.simplejmx.common.JmxFolderName[] jmxFolderNameArray16 = jmxResourceInfo13.getJmxFolderNames();
        jmxResourceInfo13.setJmxDescription("STOPPED");
        java.lang.String[] strArray23 = new java.lang.String[] {};
        javax.management.ObjectName objectName24 = com.j256.simplejmx.common.ObjectNameUtil.makeObjectName("STARTING", "100", strArray23);
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo26 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPING", "RUNNING", strArray23, "STOPPING");
        jmxResourceInfo13.setJmxFolderNameStrings(strArray23);
        org.junit.Assert.assertNotNull(jmxFolderNameArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(jmxFolderNameArray16);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(objectName24);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        java.lang.Appendable appendable0 = null;
        com.j256.simplejmx.web.JmxWebHandler jmxWebHandler1 = new com.j256.simplejmx.web.JmxWebHandler();
        com.j256.simplejmx.server.JmxServer jmxServer4 = new com.j256.simplejmx.server.JmxServer((int) (byte) 10, (int) (byte) -1);
        jmxServer4.close();
        jmxServer4.close();
        boolean boolean7 = jmxWebHandler1.addBean((java.lang.Object) jmxServer4);
        com.j256.simplejmx.spring.JmxBean jmxBean8 = new com.j256.simplejmx.spring.JmxBean();
        java.lang.Object obj9 = jmxBean8.getTarget();
        javax.management.MBeanServer mBeanServer10 = null;
        com.j256.simplejmx.server.JmxServer jmxServer11 = new com.j256.simplejmx.server.JmxServer(mBeanServer10);
        jmxBean8.setTarget((java.lang.Object) jmxServer11);
        boolean boolean13 = jmxWebHandler1.removeBean((java.lang.Object) jmxBean8);
        java.lang.String[] strArray20 = new java.lang.String[] { "STOPPED", "hi!" };
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo22 = new com.j256.simplejmx.common.JmxResourceInfo("RUNNING", "STARTING", strArray20, "STOPPED");
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo24 = new com.j256.simplejmx.common.JmxResourceInfo("STOPPED", "", strArray20, "100");
        boolean boolean25 = jmxWebHandler1.removeBean((java.lang.Object) strArray20);
        com.j256.simplejmx.spring.JmxBean jmxBean26 = new com.j256.simplejmx.spring.JmxBean();
        boolean boolean27 = jmxWebHandler1.contains((java.lang.Object) jmxBean26);
        // The following exception was thrown during execution in test generation
        try {
            org.eclipse.jetty.util.component.AggregateLifeCycle.dumpObject(appendable0, (java.lang.Object) boolean27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        com.j256.simplejmx.web.JmxWebHandler jmxWebHandler0 = new com.j256.simplejmx.web.JmxWebHandler();
        com.j256.simplejmx.server.JmxServer jmxServer3 = new com.j256.simplejmx.server.JmxServer((int) (byte) 10, (int) (byte) -1);
        jmxServer3.close();
        jmxServer3.close();
        boolean boolean6 = jmxWebHandler0.addBean((java.lang.Object) jmxServer3);
        com.j256.simplejmx.spring.JmxBean jmxBean7 = new com.j256.simplejmx.spring.JmxBean();
        java.lang.Object obj8 = jmxBean7.getTarget();
        javax.management.MBeanServer mBeanServer9 = null;
        com.j256.simplejmx.server.JmxServer jmxServer10 = new com.j256.simplejmx.server.JmxServer(mBeanServer9);
        jmxBean7.setTarget((java.lang.Object) jmxServer10);
        boolean boolean12 = jmxWebHandler0.removeBean((java.lang.Object) jmxBean7);
        boolean boolean13 = jmxWebHandler0.isStarted();
        com.j256.simplejmx.common.JmxAttributeMethodInfo jmxAttributeMethodInfo15 = new com.j256.simplejmx.common.JmxAttributeMethodInfo("100");
        boolean boolean16 = jmxWebHandler0.removeBean((java.lang.Object) "100");
        java.util.Collection<java.lang.Object> objCollection17 = jmxWebHandler0.getBeans();
        java.lang.Appendable appendable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            jmxWebHandler0.dumpThis(appendable18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objCollection17);
    }
}
