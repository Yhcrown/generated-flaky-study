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
        java.lang.String str0 = com.gizwits.openapi.sdk.OpenApi.getGizwitsBaseApiUrl();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "https://api.gizwits.com" + "'", str0, "https://api.gizwits.com");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("https://api.gizwits.com", "", "https://api.gizwits.com", "https://api.gizwits.com", "", "https://api.gizwits.com", "https://api.gizwits.com");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Gizwits open api fault");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.lang.String str1 = com.gizwits.openapi.sdk.HttpRequest.md5("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "d41d8cd98f00b204e9800998ecf8427e" + "'", str1, "d41d8cd98f00b204e9800998ecf8427e");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("d41d8cd98f00b204e9800998ecf8427e", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Gizwits open api fault");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.lang.Throwable throwable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException(throwable0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("d41d8cd98f00b204e9800998ecf8427e", "https://api.gizwits.com", "");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Gizwits open api fault");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        com.gizwits.openapi.sdk.HttpRequest.Method method1 = com.gizwits.openapi.sdk.HttpRequest.Method.PUT;
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = com.gizwits.openapi.sdk.HttpRequest.send("https://api.gizwits.com", method1, strMap2, "https://api.gizwits.com", "hi!");
        org.junit.Assert.assertTrue("'" + method1 + "' != '" + com.gizwits.openapi.sdk.HttpRequest.Method.PUT + "'", method1.equals(com.gizwits.openapi.sdk.HttpRequest.Method.PUT));
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        com.gizwits.openapi.sdk.HttpRequest httpRequest0 = new com.gizwits.openapi.sdk.HttpRequest();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        java.lang.Class<?> wildcardClass2 = deviceInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("", "", "");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Gizwits open api fault");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        java.lang.String str2 = gizwitsException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com" + "'", str2, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.String str1 = com.gizwits.openapi.sdk.HttpRequest.md5("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str1, "aff97160474a056e838c1f721af01edf");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        com.gizwits.openapi.sdk.HttpRequest.Method method1 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = com.gizwits.openapi.sdk.HttpRequest.send("https://api.gizwits.com", method1, strMap2, "hi!", "aff97160474a056e838c1f721af01edf");
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        com.gizwits.openapi.sdk.OpenApi.setGizwitsBaseApiUrl("");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("", "d41d8cd98f00b204e9800998ecf8427e", "d41d8cd98f00b204e9800998ecf8427e", "hi!", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "aff97160474a056e838c1f721af01edf", "https://api.gizwits.com");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.gizwits.openapi.sdk.DeviceInfo> deviceInfoList2 = com.gizwits.openapi.sdk.OpenApi.getBoundDevices("hi!", "https://api.gizwits.com");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException1);
        java.lang.String str3 = gizwitsException1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com" + "'", str3, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException3);
        gizwitsException1.addSuppressed((java.lang.Throwable) gizwitsException4);
        java.lang.String str6 = gizwitsException4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com" + "'", str6, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("https://api.gizwits.com", "d41d8cd98f00b204e9800998ecf8427e", "aff97160474a056e838c1f721af01edf");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.gizwits.openapi.sdk.OpenApi.setGizwitsBaseApiUrl("https://api.gizwits.com");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("aff97160474a056e838c1f721af01edf", "d41d8cd98f00b204e9800998ecf8427e", "");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Gizwits open api fault");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.gizwits.openapi.sdk.DeviceInfo> deviceInfoList2 = com.gizwits.openapi.sdk.OpenApi.getBoundDevices("aff97160474a056e838c1f721af01edf", "");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Gizwits open api fault");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.unbindDevice("", "d41d8cd98f00b204e9800998ecf8427e", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Gizwits open api fault");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("aff97160474a056e838c1f721af01edf", "hi!", "https://api.gizwits.com");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Gizwits open api fault");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        com.gizwits.openapi.sdk.HttpRequest.Method method1 = com.gizwits.openapi.sdk.HttpRequest.Method.DELETE;
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = com.gizwits.openapi.sdk.HttpRequest.send("", method1, strMap2, "", "hi!");
        org.junit.Assert.assertTrue("'" + method1 + "' != '" + com.gizwits.openapi.sdk.HttpRequest.Method.DELETE + "'", method1.equals(com.gizwits.openapi.sdk.HttpRequest.Method.DELETE));
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "d41d8cd98f00b204e9800998ecf8427e");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Gizwits open api fault");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException3);
        gizwitsException1.addSuppressed((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException1);
        java.lang.String str7 = gizwitsException1.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com" + "'", str7, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com", (java.lang.Throwable) gizwitsException2);
        java.lang.String str4 = gizwitsException2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com" + "'", str4, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.gizwits.openapi.sdk.DeviceInfo> deviceInfoList2 = com.gizwits.openapi.sdk.OpenApi.getBoundDevices("d41d8cd98f00b204e9800998ecf8427e", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Gizwits open api fault");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException3);
        gizwitsException1.addSuppressed((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException1);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException8 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException10 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException11 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException10);
        gizwitsException8.addSuppressed((java.lang.Throwable) gizwitsException11);
        gizwitsException1.addSuppressed((java.lang.Throwable) gizwitsException8);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException15 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException16 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException15);
        gizwitsException8.addSuppressed((java.lang.Throwable) gizwitsException15);
        java.lang.String str18 = gizwitsException8.toString();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com" + "'", str18, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("d41d8cd98f00b204e9800998ecf8427e", "hi!", "", "d41d8cd98f00b204e9800998ecf8427e", "aff97160474a056e838c1f721af01edf", "d41d8cd98f00b204e9800998ecf8427e", "");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Gizwits open api fault");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        java.lang.String str1 = com.gizwits.openapi.sdk.HttpRequest.md5("https://api.gizwits.com");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2a27d7f39ff2023c5dc2aa7ba2acaa28" + "'", str1, "2a27d7f39ff2023c5dc2aa7ba2acaa28");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("2a27d7f39ff2023c5dc2aa7ba2acaa28", "2a27d7f39ff2023c5dc2aa7ba2acaa28", "");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Gizwits open api fault");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("hi!", "https://api.gizwits.com", "hi!", "https://api.gizwits.com", "d41d8cd98f00b204e9800998ecf8427e", "2a27d7f39ff2023c5dc2aa7ba2acaa28", "");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Gizwits open api fault");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.unbindDevice("aff97160474a056e838c1f721af01edf", "https://api.gizwits.com", "2a27d7f39ff2023c5dc2aa7ba2acaa28");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Gizwits open api fault");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.unbindDevice("", "aff97160474a056e838c1f721af01edf", "https://api.gizwits.com");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Gizwits open api fault");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException3);
        gizwitsException1.addSuppressed((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException1);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException8 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException10 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException11 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException10);
        gizwitsException8.addSuppressed((java.lang.Throwable) gizwitsException11);
        gizwitsException1.addSuppressed((java.lang.Throwable) gizwitsException8);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException15 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException16 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException15);
        gizwitsException8.addSuppressed((java.lang.Throwable) gizwitsException15);
        java.lang.Class<?> wildcardClass18 = gizwitsException15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.gizwits.openapi.sdk.DeviceInfo> deviceInfoList2 = com.gizwits.openapi.sdk.OpenApi.getBoundDevices("https://api.gizwits.com", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Gizwits open api fault");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.lang.String str1 = com.gizwits.openapi.sdk.HttpRequest.md5("2a27d7f39ff2023c5dc2aa7ba2acaa28");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "8129b88dea4e85ae5f6aa83f997f9827" + "'", str1, "8129b88dea4e85ae5f6aa83f997f9827");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str8 = deviceInfo0.getDid();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.gizwits.openapi.sdk.DeviceInfo> deviceInfoList2 = com.gizwits.openapi.sdk.OpenApi.getBoundDevices("", "8129b88dea4e85ae5f6aa83f997f9827");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Gizwits open api fault");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.gizwits.openapi.sdk.OpenApi.setGizwitsBaseApiUrl("8129b88dea4e85ae5f6aa83f997f9827");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("2a27d7f39ff2023c5dc2aa7ba2acaa28", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setMac("aff97160474a056e838c1f721af01edf");
        java.lang.String str8 = deviceInfo0.getAlias();
        deviceInfo0.setAlias("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException3);
        gizwitsException1.addSuppressed((java.lang.Throwable) gizwitsException4);
        java.lang.String str6 = gizwitsException1.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com" + "'", str6, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("", "2a27d7f39ff2023c5dc2aa7ba2acaa28", "", "2a27d7f39ff2023c5dc2aa7ba2acaa28", "https://api.gizwits.com", "8129b88dea4e85ae5f6aa83f997f9827", "");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("");
        java.lang.Throwable[] throwableArray2 = gizwitsException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = throwableArray2.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("https://api.gizwits.com", "", "aff97160474a056e838c1f721af01edf", "hi!", "hi!", "hi!", "aff97160474a056e838c1f721af01edf");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("8129b88dea4e85ae5f6aa83f997f9827", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException3);
        gizwitsException1.addSuppressed((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException1);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException8 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException10 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException11 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException10);
        gizwitsException8.addSuppressed((java.lang.Throwable) gizwitsException11);
        gizwitsException1.addSuppressed((java.lang.Throwable) gizwitsException8);
        java.lang.Class<?> wildcardClass14 = gizwitsException8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException3);
        gizwitsException1.addSuppressed((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException1);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException8 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException10 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException11 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException10);
        gizwitsException8.addSuppressed((java.lang.Throwable) gizwitsException11);
        gizwitsException1.addSuppressed((java.lang.Throwable) gizwitsException8);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException15 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException16 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException15);
        gizwitsException8.addSuppressed((java.lang.Throwable) gizwitsException15);
        java.lang.String str18 = gizwitsException15.toString();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com" + "'", str18, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.unbindDevice("2a27d7f39ff2023c5dc2aa7ba2acaa28", "aff97160474a056e838c1f721af01edf", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.gizwits.openapi.sdk.DeviceInfo> deviceInfoList2 = com.gizwits.openapi.sdk.OpenApi.getBoundDevices("2a27d7f39ff2023c5dc2aa7ba2acaa28", "2a27d7f39ff2023c5dc2aa7ba2acaa28");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.gizwits.openapi.sdk.DeviceInfo> deviceInfoList2 = com.gizwits.openapi.sdk.OpenApi.getBoundDevices("2a27d7f39ff2023c5dc2aa7ba2acaa28", "d41d8cd98f00b204e9800998ecf8427e");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        java.lang.String str2 = deviceInfo0.getMac();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("aff97160474a056e838c1f721af01edf", "2a27d7f39ff2023c5dc2aa7ba2acaa28", "2a27d7f39ff2023c5dc2aa7ba2acaa28");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        boolean boolean6 = deviceInfo0.getIsOnline();
        java.lang.String str7 = deviceInfo0.getDid();
        boolean boolean8 = deviceInfo0.getIsOnline();
        deviceInfo0.setMac("d41d8cd98f00b204e9800998ecf8427e");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.gizwits.openapi.sdk.DeviceInfo> deviceInfoList2 = com.gizwits.openapi.sdk.OpenApi.getBoundDevices("aff97160474a056e838c1f721af01edf", "aff97160474a056e838c1f721af01edf");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        boolean boolean1 = deviceInfo0.getIsOnline();
        java.lang.String str2 = deviceInfo0.getAlias();
        java.lang.String str3 = deviceInfo0.getMac();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("8129b88dea4e85ae5f6aa83f997f9827", "", "");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.gizwits.openapi.sdk.DeviceInfo> deviceInfoList2 = com.gizwits.openapi.sdk.OpenApi.getBoundDevices("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "https://api.gizwits.com");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        java.lang.Throwable[] throwableArray2 = gizwitsException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = throwableArray2.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException6);
        gizwitsException4.addSuppressed((java.lang.Throwable) gizwitsException7);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException9 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException11 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException13 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException14 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException13);
        gizwitsException11.addSuppressed((java.lang.Throwable) gizwitsException14);
        gizwitsException4.addSuppressed((java.lang.Throwable) gizwitsException11);
        gizwitsException2.addSuppressed((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException18 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException19 = new com.gizwits.openapi.sdk.GizwitsException("hi!", (java.lang.Throwable) gizwitsException18);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("", (java.lang.Throwable) gizwitsException2);
        java.lang.Throwable[] throwableArray4 = gizwitsException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.gizwits.openapi.sdk.DeviceInfo> deviceInfoList2 = com.gizwits.openapi.sdk.OpenApi.getBoundDevices("", "d41d8cd98f00b204e9800998ecf8427e");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        boolean boolean1 = deviceInfo0.getIsOnline();
        java.lang.String str2 = deviceInfo0.getAlias();
        deviceInfo0.setAlias("d41d8cd98f00b204e9800998ecf8427e");
        java.lang.Class<?> wildcardClass5 = deviceInfo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException3);
        gizwitsException1.addSuppressed((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException1);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException8 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException10 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException11 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException10);
        gizwitsException8.addSuppressed((java.lang.Throwable) gizwitsException11);
        gizwitsException1.addSuppressed((java.lang.Throwable) gizwitsException8);
        java.lang.Throwable[] throwableArray14 = gizwitsException1.getSuppressed();
        java.lang.Class<?> wildcardClass15 = gizwitsException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("https://api.gizwits.com", "", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        boolean boolean1 = deviceInfo0.getIsOnline();
        boolean boolean2 = deviceInfo0.getIsOnline();
        java.lang.String str3 = deviceInfo0.getAlias();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("", "d41d8cd98f00b204e9800998ecf8427e", "2a27d7f39ff2023c5dc2aa7ba2acaa28", "8129b88dea4e85ae5f6aa83f997f9827", "", "hi!", "8129b88dea4e85ae5f6aa83f997f9827");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        java.lang.Throwable[] throwableArray2 = gizwitsException1.getSuppressed();
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException("aff97160474a056e838c1f721af01edf");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", (java.lang.Throwable) gizwitsException5);
        gizwitsException1.addSuppressed((java.lang.Throwable) gizwitsException5);
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.lang.String str1 = com.gizwits.openapi.sdk.HttpRequest.md5("d41d8cd98f00b204e9800998ecf8427e");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "74be16979710d4c4e7c6647856088456" + "'", str1, "74be16979710d4c4e7c6647856088456");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.unbindDevice("8129b88dea4e85ae5f6aa83f997f9827", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "https://api.gizwits.com");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        deviceInfo0.setAlias("d41d8cd98f00b204e9800998ecf8427e");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException1);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException2);
        java.lang.String str4 = gizwitsException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com" + "'", str4, "com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException5);
        gizwitsException3.addSuppressed((java.lang.Throwable) gizwitsException6);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException8 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException3);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException10 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException12 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException13 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException12);
        gizwitsException10.addSuppressed((java.lang.Throwable) gizwitsException13);
        gizwitsException3.addSuppressed((java.lang.Throwable) gizwitsException10);
        gizwitsException1.addSuppressed((java.lang.Throwable) gizwitsException3);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException17 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException3);
        java.lang.Class<?> wildcardClass18 = gizwitsException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        boolean boolean1 = deviceInfo0.getIsOnline();
        java.lang.String str2 = deviceInfo0.getAlias();
        deviceInfo0.setAlias("d41d8cd98f00b204e9800998ecf8427e");
        deviceInfo0.setMac("2a27d7f39ff2023c5dc2aa7ba2acaa28");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        boolean boolean6 = deviceInfo0.getIsOnline();
        java.lang.String str7 = deviceInfo0.getDid();
        boolean boolean8 = deviceInfo0.getIsOnline();
        deviceInfo0.setMac("74be16979710d4c4e7c6647856088456");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.gizwits.openapi.sdk.DeviceInfo> deviceInfoList2 = com.gizwits.openapi.sdk.OpenApi.getBoundDevices("com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("hi!", "com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "8129b88dea4e85ae5f6aa83f997f9827");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        java.lang.Throwable throwable1 = null;
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com", throwable1);
        java.lang.String str3 = gizwitsException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com" + "'", str3, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.gizwits.openapi.sdk.DeviceInfo> deviceInfoList2 = com.gizwits.openapi.sdk.OpenApi.getBoundDevices("2a27d7f39ff2023c5dc2aa7ba2acaa28", "https://api.gizwits.com");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.gizwits.openapi.sdk.HttpRequest.Method method1 = com.gizwits.openapi.sdk.HttpRequest.Method.POST;
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = com.gizwits.openapi.sdk.HttpRequest.send("com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", method1, strMap2, "https://api.gizwits.com", "aff97160474a056e838c1f721af01edf");
        org.junit.Assert.assertTrue("'" + method1 + "' != '" + com.gizwits.openapi.sdk.HttpRequest.Method.POST + "'", method1.equals(com.gizwits.openapi.sdk.HttpRequest.Method.POST));
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        java.lang.String str1 = com.gizwits.openapi.sdk.HttpRequest.md5("8129b88dea4e85ae5f6aa83f997f9827");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "126de9c45f5d1d8c8eb7ba9488f410fc" + "'", str1, "126de9c45f5d1d8c8eb7ba9488f410fc");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setMac("aff97160474a056e838c1f721af01edf");
        java.lang.String str8 = deviceInfo0.getAlias();
        java.lang.String str9 = deviceInfo0.getDid();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com", (java.lang.Throwable) gizwitsException2);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException2);
        java.lang.Throwable[] throwableArray5 = gizwitsException4.getSuppressed();
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException8 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException10 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException12 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException13 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException12);
        gizwitsException10.addSuppressed((java.lang.Throwable) gizwitsException13);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException15 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException10);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException17 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException19 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException20 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException19);
        gizwitsException17.addSuppressed((java.lang.Throwable) gizwitsException20);
        gizwitsException10.addSuppressed((java.lang.Throwable) gizwitsException17);
        gizwitsException8.addSuppressed((java.lang.Throwable) gizwitsException10);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException24 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException10);
        gizwitsException6.addSuppressed((java.lang.Throwable) gizwitsException24);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("", "2a27d7f39ff2023c5dc2aa7ba2acaa28", "74be16979710d4c4e7c6647856088456");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.unbindDevice("", "hi!", "2a27d7f39ff2023c5dc2aa7ba2acaa28");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("aff97160474a056e838c1f721af01edf");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", (java.lang.Throwable) gizwitsException2);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException9 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException10 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException9);
        gizwitsException7.addSuppressed((java.lang.Throwable) gizwitsException10);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException12 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException7);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException14 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException16 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException17 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException16);
        gizwitsException14.addSuppressed((java.lang.Throwable) gizwitsException17);
        gizwitsException7.addSuppressed((java.lang.Throwable) gizwitsException14);
        gizwitsException5.addSuppressed((java.lang.Throwable) gizwitsException7);
        gizwitsException3.addSuppressed((java.lang.Throwable) gizwitsException7);
        java.lang.Throwable throwable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            gizwitsException3.addSuppressed(throwable22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.gizwits.openapi.sdk.HttpRequest.Method method2 = com.gizwits.openapi.sdk.HttpRequest.Method.PUT;
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = com.gizwits.openapi.sdk.HttpRequest.send("https://api.gizwits.com", method2, strMap3, "hi!", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = com.gizwits.openapi.sdk.HttpRequest.send("126de9c45f5d1d8c8eb7ba9488f410fc", method2, strMap7, "74be16979710d4c4e7c6647856088456", "2a27d7f39ff2023c5dc2aa7ba2acaa28");
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + com.gizwits.openapi.sdk.HttpRequest.Method.PUT + "'", method2.equals(com.gizwits.openapi.sdk.HttpRequest.Method.PUT));
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.Class<?> wildcardClass2 = gizwitsException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str8 = deviceInfo0.getMac();
        deviceInfo0.setAlias("hi!");
        deviceInfo0.setMac("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str13 = deviceInfo0.getDid();
        java.lang.String str14 = deviceInfo0.getDid();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException8 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException7);
        gizwitsException5.addSuppressed((java.lang.Throwable) gizwitsException8);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException10 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException5);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException12 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException14 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException15 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException14);
        gizwitsException12.addSuppressed((java.lang.Throwable) gizwitsException15);
        gizwitsException5.addSuppressed((java.lang.Throwable) gizwitsException12);
        gizwitsException3.addSuppressed((java.lang.Throwable) gizwitsException5);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException19 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException5);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException20 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com", (java.lang.Throwable) gizwitsException19);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException21 = new com.gizwits.openapi.sdk.GizwitsException("8129b88dea4e85ae5f6aa83f997f9827", (java.lang.Throwable) gizwitsException19);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.gizwits.openapi.sdk.HttpRequest.Method method4 = com.gizwits.openapi.sdk.HttpRequest.Method.PUT;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = com.gizwits.openapi.sdk.HttpRequest.send("aff97160474a056e838c1f721af01edf", method4, strMap5, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = com.gizwits.openapi.sdk.HttpRequest.send("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", method4, strMap9, "aff97160474a056e838c1f721af01edf", "aff97160474a056e838c1f721af01edf");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = com.gizwits.openapi.sdk.HttpRequest.send("8129b88dea4e85ae5f6aa83f997f9827", method4, strMap13, "", "aff97160474a056e838c1f721af01edf");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = com.gizwits.openapi.sdk.HttpRequest.send("74be16979710d4c4e7c6647856088456", method4, strMap17, "aff97160474a056e838c1f721af01edf", "hi!");
        org.junit.Assert.assertTrue("'" + method4 + "' != '" + com.gizwits.openapi.sdk.HttpRequest.Method.PUT + "'", method4.equals(com.gizwits.openapi.sdk.HttpRequest.Method.PUT));
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(strMap20);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.gizwits.openapi.sdk.OpenApi.setGizwitsBaseApiUrl("2a27d7f39ff2023c5dc2aa7ba2acaa28");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        java.lang.Throwable[] throwableArray3 = gizwitsException2.getSuppressed();
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException("2a27d7f39ff2023c5dc2aa7ba2acaa28", (java.lang.Throwable) gizwitsException2);
        java.lang.Throwable[] throwableArray5 = gizwitsException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        java.lang.String str1 = com.gizwits.openapi.sdk.HttpRequest.md5("126de9c45f5d1d8c8eb7ba9488f410fc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "51dab0dacb3460d9be4fecd4cf802628" + "'", str1, "51dab0dacb3460d9be4fecd4cf802628");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        boolean boolean6 = deviceInfo0.getIsOnline();
        java.lang.String str7 = deviceInfo0.getDid();
        boolean boolean8 = deviceInfo0.getIsOnline();
        deviceInfo0.setDid("2a27d7f39ff2023c5dc2aa7ba2acaa28");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "74be16979710d4c4e7c6647856088456", "8129b88dea4e85ae5f6aa83f997f9827", "126de9c45f5d1d8c8eb7ba9488f410fc", "2a27d7f39ff2023c5dc2aa7ba2acaa28", "126de9c45f5d1d8c8eb7ba9488f410fc", "8129b88dea4e85ae5f6aa83f997f9827");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("51dab0dacb3460d9be4fecd4cf802628", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "hi!");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.gizwits.openapi.sdk.OpenApi.setGizwitsBaseApiUrl("d41d8cd98f00b204e9800998ecf8427e");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.gizwits.openapi.sdk.OpenApi.setGizwitsBaseApiUrl("aff97160474a056e838c1f721af01edf");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("aff97160474a056e838c1f721af01edf");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("8129b88dea4e85ae5f6aa83f997f9827", (java.lang.Throwable) gizwitsException2);
        java.lang.Class<?> wildcardClass4 = gizwitsException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("126de9c45f5d1d8c8eb7ba9488f410fc", "aff97160474a056e838c1f721af01edf", "74be16979710d4c4e7c6647856088456");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("aff97160474a056e838c1f721af01edf");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", (java.lang.Throwable) gizwitsException2);
        java.lang.String str4 = gizwitsException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com" + "'", str4, "com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException3);
        gizwitsException1.addSuppressed((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        java.lang.Class<?> wildcardClass7 = gizwitsException6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("https://api.gizwits.com", "8129b88dea4e85ae5f6aa83f997f9827", "d41d8cd98f00b204e9800998ecf8427e");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.unbindDevice("74be16979710d4c4e7c6647856088456", "https://api.gizwits.com", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException5);
        gizwitsException3.addSuppressed((java.lang.Throwable) gizwitsException6);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException8 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException3);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException10 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException12 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException13 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException12);
        gizwitsException10.addSuppressed((java.lang.Throwable) gizwitsException13);
        gizwitsException3.addSuppressed((java.lang.Throwable) gizwitsException10);
        gizwitsException1.addSuppressed((java.lang.Throwable) gizwitsException3);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException18 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException20 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException21 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException20);
        gizwitsException18.addSuppressed((java.lang.Throwable) gizwitsException21);
        gizwitsException1.addSuppressed((java.lang.Throwable) gizwitsException18);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.gizwits.openapi.sdk.DeviceInfo> deviceInfoList2 = com.gizwits.openapi.sdk.OpenApi.getBoundDevices("https://api.gizwits.com", "");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("aff97160474a056e838c1f721af01edf", "d41d8cd98f00b204e9800998ecf8427e", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "https://api.gizwits.com", "51dab0dacb3460d9be4fecd4cf802628", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "126de9c45f5d1d8c8eb7ba9488f410fc");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.gizwits.openapi.sdk.HttpRequest.Method method2 = com.gizwits.openapi.sdk.HttpRequest.Method.PUT;
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = com.gizwits.openapi.sdk.HttpRequest.send("https://api.gizwits.com", method2, strMap3, "hi!", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = com.gizwits.openapi.sdk.HttpRequest.send("126de9c45f5d1d8c8eb7ba9488f410fc", method2, strMap7, "74be16979710d4c4e7c6647856088456", "hi!");
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + com.gizwits.openapi.sdk.HttpRequest.Method.PUT + "'", method2.equals(com.gizwits.openapi.sdk.HttpRequest.Method.PUT));
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.gizwits.openapi.sdk.DeviceInfo> deviceInfoList2 = com.gizwits.openapi.sdk.OpenApi.getBoundDevices("aff97160474a056e838c1f721af01edf", "8129b88dea4e85ae5f6aa83f997f9827");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("126de9c45f5d1d8c8eb7ba9488f410fc", "126de9c45f5d1d8c8eb7ba9488f410fc", "hi!", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        boolean boolean2 = deviceInfo0.getIsOnline();
        java.lang.String str3 = deviceInfo0.getDid();
        deviceInfo0.setAlias("hi!");
        java.lang.String str6 = deviceInfo0.getAlias();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        java.lang.Throwable throwable1 = null;
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com", throwable1);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException5);
        gizwitsException2.addSuppressed((java.lang.Throwable) gizwitsException5);
        java.lang.String str8 = gizwitsException5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com" + "'", str8, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com", (java.lang.Throwable) gizwitsException2);
        java.lang.Throwable[] throwableArray4 = gizwitsException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        java.lang.String str1 = com.gizwits.openapi.sdk.HttpRequest.md5("74be16979710d4c4e7c6647856088456");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "acf7ef943fdeb3cbfed8dd0d8f584731" + "'", str1, "acf7ef943fdeb3cbfed8dd0d8f584731");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        boolean boolean1 = deviceInfo0.getIsOnline();
        deviceInfo0.setAlias("aff97160474a056e838c1f721af01edf");
        boolean boolean4 = deviceInfo0.getIsOnline();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.lang.String str1 = com.gizwits.openapi.sdk.HttpRequest.md5("51dab0dacb3460d9be4fecd4cf802628");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "c9d8067a53481f5f59e31be2f7b3627e" + "'", str1, "c9d8067a53481f5f59e31be2f7b3627e");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.gizwits.openapi.sdk.HttpRequest.Method method4 = com.gizwits.openapi.sdk.HttpRequest.Method.GET;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = com.gizwits.openapi.sdk.HttpRequest.send("hi!", method4, strMap5, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "aff97160474a056e838c1f721af01edf");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = com.gizwits.openapi.sdk.HttpRequest.send("2a27d7f39ff2023c5dc2aa7ba2acaa28", method4, strMap9, "https://api.gizwits.com", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = com.gizwits.openapi.sdk.HttpRequest.send("https://api.gizwits.com", method4, strMap13, "51dab0dacb3460d9be4fecd4cf802628", "https://api.gizwits.com");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = com.gizwits.openapi.sdk.HttpRequest.send("acf7ef943fdeb3cbfed8dd0d8f584731", method4, strMap17, "hi!", "acf7ef943fdeb3cbfed8dd0d8f584731");
        org.junit.Assert.assertTrue("'" + method4 + "' != '" + com.gizwits.openapi.sdk.HttpRequest.Method.GET + "'", method4.equals(com.gizwits.openapi.sdk.HttpRequest.Method.GET));
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(strMap20);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.unbindDevice("51dab0dacb3460d9be4fecd4cf802628", "126de9c45f5d1d8c8eb7ba9488f410fc", "acf7ef943fdeb3cbfed8dd0d8f584731");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.unbindDevice("aff97160474a056e838c1f721af01edf", "d41d8cd98f00b204e9800998ecf8427e", "aff97160474a056e838c1f721af01edf");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("https://api.gizwits.com", "https://api.gizwits.com", "126de9c45f5d1d8c8eb7ba9488f410fc", "", "hi!", "aff97160474a056e838c1f721af01edf", "");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        boolean boolean6 = deviceInfo0.getIsOnline();
        java.lang.String str7 = deviceInfo0.getDid();
        java.lang.String str8 = deviceInfo0.getDid();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException6);
        gizwitsException4.addSuppressed((java.lang.Throwable) gizwitsException7);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException9 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException11 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException13 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException14 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException13);
        gizwitsException11.addSuppressed((java.lang.Throwable) gizwitsException14);
        gizwitsException4.addSuppressed((java.lang.Throwable) gizwitsException11);
        gizwitsException2.addSuppressed((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException18 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException19 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com", (java.lang.Throwable) gizwitsException18);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException21 = new com.gizwits.openapi.sdk.GizwitsException("aff97160474a056e838c1f721af01edf");
        gizwitsException19.addSuppressed((java.lang.Throwable) gizwitsException21);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException25 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        java.lang.Throwable[] throwableArray26 = gizwitsException25.getSuppressed();
        com.gizwits.openapi.sdk.GizwitsException gizwitsException27 = new com.gizwits.openapi.sdk.GizwitsException("2a27d7f39ff2023c5dc2aa7ba2acaa28", (java.lang.Throwable) gizwitsException25);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException28 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException27);
        gizwitsException19.addSuppressed((java.lang.Throwable) gizwitsException27);
        java.lang.String str30 = gizwitsException19.toString();
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com" + "'", str30, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("", "https://api.gizwits.com", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "", "51dab0dacb3460d9be4fecd4cf802628", "2a27d7f39ff2023c5dc2aa7ba2acaa28", "");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException3);
        gizwitsException1.addSuppressed((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException1);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException9 = new com.gizwits.openapi.sdk.GizwitsException("aff97160474a056e838c1f721af01edf");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException10 = new com.gizwits.openapi.sdk.GizwitsException("8129b88dea4e85ae5f6aa83f997f9827", (java.lang.Throwable) gizwitsException9);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException11 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException10);
        gizwitsException6.addSuppressed((java.lang.Throwable) gizwitsException10);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.gizwits.openapi.sdk.DeviceInfo> deviceInfoList2 = com.gizwits.openapi.sdk.OpenApi.getBoundDevices("c9d8067a53481f5f59e31be2f7b3627e", "51dab0dacb3460d9be4fecd4cf802628");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        boolean boolean6 = deviceInfo0.getIsOnline();
        boolean boolean7 = deviceInfo0.getIsOnline();
        deviceInfo0.setMac("2a27d7f39ff2023c5dc2aa7ba2acaa28");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        boolean boolean6 = deviceInfo0.getIsOnline();
        java.lang.String str7 = deviceInfo0.getDid();
        deviceInfo0.setAlias("126de9c45f5d1d8c8eb7ba9488f410fc");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setMac("aff97160474a056e838c1f721af01edf");
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("https://api.gizwits.com");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("");
        java.lang.Throwable[] throwableArray2 = gizwitsException1.getSuppressed();
        java.lang.String str3 = gizwitsException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: " + "'", str3, "com.gizwits.openapi.sdk.GizwitsException: ");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.gizwits.openapi.sdk.HttpRequest.Method method4 = com.gizwits.openapi.sdk.HttpRequest.Method.PUT;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = com.gizwits.openapi.sdk.HttpRequest.send("aff97160474a056e838c1f721af01edf", method4, strMap5, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = com.gizwits.openapi.sdk.HttpRequest.send("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", method4, strMap9, "aff97160474a056e838c1f721af01edf", "aff97160474a056e838c1f721af01edf");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = com.gizwits.openapi.sdk.HttpRequest.send("8129b88dea4e85ae5f6aa83f997f9827", method4, strMap13, "", "aff97160474a056e838c1f721af01edf");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = com.gizwits.openapi.sdk.HttpRequest.send("c9d8067a53481f5f59e31be2f7b3627e", method4, strMap17, "c9d8067a53481f5f59e31be2f7b3627e", "2a27d7f39ff2023c5dc2aa7ba2acaa28");
        org.junit.Assert.assertTrue("'" + method4 + "' != '" + com.gizwits.openapi.sdk.HttpRequest.Method.PUT + "'", method4.equals(com.gizwits.openapi.sdk.HttpRequest.Method.PUT));
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(strMap20);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("aff97160474a056e838c1f721af01edf");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("8129b88dea4e85ae5f6aa83f997f9827", (java.lang.Throwable) gizwitsException2);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException3);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.gizwits.openapi.sdk.DeviceInfo> deviceInfoList2 = com.gizwits.openapi.sdk.OpenApi.getBoundDevices("c9d8067a53481f5f59e31be2f7b3627e", "hi!");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("126de9c45f5d1d8c8eb7ba9488f410fc", "8129b88dea4e85ae5f6aa83f997f9827", "https://api.gizwits.com", "aff97160474a056e838c1f721af01edf", "51dab0dacb3460d9be4fecd4cf802628", "2a27d7f39ff2023c5dc2aa7ba2acaa28", "com.gizwits.openapi.sdk.GizwitsException: ");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str8 = deviceInfo0.getMac();
        deviceInfo0.setAlias("hi!");
        deviceInfo0.setMac("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str13 = deviceInfo0.getDid();
        deviceInfo0.setIsOnline(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.unbindDevice("", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "74be16979710d4c4e7c6647856088456");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.gizwits.openapi.sdk.HttpRequest.Method method1 = com.gizwits.openapi.sdk.HttpRequest.Method.GET;
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = com.gizwits.openapi.sdk.HttpRequest.send("2a27d7f39ff2023c5dc2aa7ba2acaa28", method1, strMap2, "acf7ef943fdeb3cbfed8dd0d8f584731", "74be16979710d4c4e7c6647856088456");
        org.junit.Assert.assertTrue("'" + method1 + "' != '" + com.gizwits.openapi.sdk.HttpRequest.Method.GET + "'", method1.equals(com.gizwits.openapi.sdk.HttpRequest.Method.GET));
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        boolean boolean2 = deviceInfo0.getIsOnline();
        java.lang.String str3 = deviceInfo0.getAlias();
        deviceInfo0.setMac("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str6 = deviceInfo0.getDid();
        deviceInfo0.setMac("com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.gizwits.openapi.sdk.HttpRequest.Method method0 = com.gizwits.openapi.sdk.HttpRequest.Method.PUT;
        java.lang.Class<?> wildcardClass1 = method0.getClass();
        org.junit.Assert.assertTrue("'" + method0 + "' != '" + com.gizwits.openapi.sdk.HttpRequest.Method.PUT + "'", method0.equals(com.gizwits.openapi.sdk.HttpRequest.Method.PUT));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.gizwits.openapi.sdk.DeviceInfo> deviceInfoList2 = com.gizwits.openapi.sdk.OpenApi.getBoundDevices("aff97160474a056e838c1f721af01edf", "c9d8067a53481f5f59e31be2f7b3627e");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        deviceInfo0.setMac("hi!");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("acf7ef943fdeb3cbfed8dd0d8f584731", "2a27d7f39ff2023c5dc2aa7ba2acaa28", "c9d8067a53481f5f59e31be2f7b3627e");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        java.lang.String str4 = deviceInfo0.getDid();
        java.lang.String str5 = deviceInfo0.getDid();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com", (java.lang.Throwable) gizwitsException2);
        java.lang.String str4 = gizwitsException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com" + "'", str4, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        boolean boolean6 = deviceInfo0.getIsOnline();
        java.lang.String str7 = deviceInfo0.getDid();
        boolean boolean8 = deviceInfo0.getIsOnline();
        java.lang.String str9 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("aff97160474a056e838c1f721af01edf", "acf7ef943fdeb3cbfed8dd0d8f584731", "com.gizwits.openapi.sdk.GizwitsException: ", "126de9c45f5d1d8c8eb7ba9488f410fc", "c9d8067a53481f5f59e31be2f7b3627e", "com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "acf7ef943fdeb3cbfed8dd0d8f584731");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getDid();
        deviceInfo0.setIsOnline(false);
        java.lang.String str4 = deviceInfo0.getMac();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("2a27d7f39ff2023c5dc2aa7ba2acaa28", "com.gizwits.openapi.sdk.GizwitsException: ", "d41d8cd98f00b204e9800998ecf8427e");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.gizwits.openapi.sdk.DeviceInfo> deviceInfoList2 = com.gizwits.openapi.sdk.OpenApi.getBoundDevices("https://api.gizwits.com", "acf7ef943fdeb3cbfed8dd0d8f584731");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        java.lang.Throwable[] throwableArray3 = gizwitsException2.getSuppressed();
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException("2a27d7f39ff2023c5dc2aa7ba2acaa28", (java.lang.Throwable) gizwitsException2);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        java.lang.Throwable[] throwableArray6 = gizwitsException4.getSuppressed();
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        java.lang.String str1 = com.gizwits.openapi.sdk.HttpRequest.md5("aff97160474a056e838c1f721af01edf");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "33efbb43f502e2933fbfc8c508980152" + "'", str1, "33efbb43f502e2933fbfc8c508980152");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setMac("aff97160474a056e838c1f721af01edf");
        java.lang.String str8 = deviceInfo0.getAlias();
        java.lang.String str9 = deviceInfo0.getMac();
        java.lang.String str10 = deviceInfo0.getAlias();
        boolean boolean11 = deviceInfo0.getIsOnline();
        java.lang.String str12 = deviceInfo0.getMac();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str9, "aff97160474a056e838c1f721af01edf");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str12, "aff97160474a056e838c1f721af01edf");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("https://api.gizwits.com", "acf7ef943fdeb3cbfed8dd0d8f584731", "com.gizwits.openapi.sdk.GizwitsException: ", "51dab0dacb3460d9be4fecd4cf802628", "74be16979710d4c4e7c6647856088456", "https://api.gizwits.com", "acf7ef943fdeb3cbfed8dd0d8f584731");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("aff97160474a056e838c1f721af01edf");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", (java.lang.Throwable) gizwitsException2);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException2);
        java.lang.String str5 = gizwitsException4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: aff97160474a056e838c1f721af01edf" + "'", str5, "com.gizwits.openapi.sdk.GizwitsException: aff97160474a056e838c1f721af01edf");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.gizwits.openapi.sdk.HttpRequest.Method method2 = com.gizwits.openapi.sdk.HttpRequest.Method.GET;
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = com.gizwits.openapi.sdk.HttpRequest.send("hi!", method2, strMap3, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "aff97160474a056e838c1f721af01edf");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = com.gizwits.openapi.sdk.HttpRequest.send("", method2, strMap7, "", "https://api.gizwits.com");
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + com.gizwits.openapi.sdk.HttpRequest.Method.GET + "'", method2.equals(com.gizwits.openapi.sdk.HttpRequest.Method.GET));
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        deviceInfo0.setAlias("8129b88dea4e85ae5f6aa83f997f9827");
        java.lang.String str10 = deviceInfo0.getAlias();
        java.lang.String str11 = deviceInfo0.getDid();
        java.lang.String str12 = deviceInfo0.getAlias();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "8129b88dea4e85ae5f6aa83f997f9827" + "'", str10, "8129b88dea4e85ae5f6aa83f997f9827");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "8129b88dea4e85ae5f6aa83f997f9827" + "'", str12, "8129b88dea4e85ae5f6aa83f997f9827");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("51dab0dacb3460d9be4fecd4cf802628");
        java.lang.String str2 = gizwitsException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: 51dab0dacb3460d9be4fecd4cf802628" + "'", str2, "com.gizwits.openapi.sdk.GizwitsException: 51dab0dacb3460d9be4fecd4cf802628");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("", "", "d41d8cd98f00b204e9800998ecf8427e", "https://api.gizwits.com", "com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "aff97160474a056e838c1f721af01edf", "hi!");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        java.lang.String str1 = com.gizwits.openapi.sdk.HttpRequest.md5("c9d8067a53481f5f59e31be2f7b3627e");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9b2d4d431d4c7cb32fdff91406393cd3" + "'", str1, "9b2d4d431d4c7cb32fdff91406393cd3");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        deviceInfo0.setAlias("8129b88dea4e85ae5f6aa83f997f9827");
        java.lang.String str10 = deviceInfo0.getAlias();
        java.lang.String str11 = deviceInfo0.getMac();
        boolean boolean12 = deviceInfo0.getIsOnline();
        java.lang.String str13 = deviceInfo0.getMac();
        java.lang.String str14 = deviceInfo0.getDid();
        boolean boolean15 = deviceInfo0.getIsOnline();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "8129b88dea4e85ae5f6aa83f997f9827" + "'", str10, "8129b88dea4e85ae5f6aa83f997f9827");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getDid();
        deviceInfo0.setIsOnline(false);
        java.lang.String str4 = deviceInfo0.getAlias();
        boolean boolean5 = deviceInfo0.getIsOnline();
        deviceInfo0.setMac("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("8129b88dea4e85ae5f6aa83f997f9827", "9b2d4d431d4c7cb32fdff91406393cd3", "2a27d7f39ff2023c5dc2aa7ba2acaa28", "", "com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "51dab0dacb3460d9be4fecd4cf802628", "acf7ef943fdeb3cbfed8dd0d8f584731");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str8 = deviceInfo0.getMac();
        deviceInfo0.setAlias("hi!");
        deviceInfo0.setMac("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str13 = deviceInfo0.getDid();
        deviceInfo0.setDid("hi!");
        deviceInfo0.setMac("2a27d7f39ff2023c5dc2aa7ba2acaa28");
        java.lang.String str18 = deviceInfo0.getAlias();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.unbindDevice("9b2d4d431d4c7cb32fdff91406393cd3", "hi!", "com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        boolean boolean2 = deviceInfo0.getIsOnline();
        java.lang.String str3 = deviceInfo0.getAlias();
        boolean boolean4 = deviceInfo0.getIsOnline();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("acf7ef943fdeb3cbfed8dd0d8f584731", "com.gizwits.openapi.sdk.GizwitsException: aff97160474a056e838c1f721af01edf", "c9d8067a53481f5f59e31be2f7b3627e", "51dab0dacb3460d9be4fecd4cf802628", "aff97160474a056e838c1f721af01edf", "126de9c45f5d1d8c8eb7ba9488f410fc", "https://api.gizwits.com");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException1);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException2);
        java.lang.Class<?> wildcardClass4 = gizwitsException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        boolean boolean6 = deviceInfo0.getIsOnline();
        java.lang.String str7 = deviceInfo0.getAlias();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("74be16979710d4c4e7c6647856088456", "c9d8067a53481f5f59e31be2f7b3627e", "9b2d4d431d4c7cb32fdff91406393cd3");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        java.lang.String str4 = deviceInfo0.getAlias();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setAlias("https://api.gizwits.com");
        java.lang.String str5 = deviceInfo0.getMac();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("2a27d7f39ff2023c5dc2aa7ba2acaa28", "com.gizwits.openapi.sdk.GizwitsException: ", "acf7ef943fdeb3cbfed8dd0d8f584731", "c9d8067a53481f5f59e31be2f7b3627e", "", "51dab0dacb3460d9be4fecd4cf802628", "https://api.gizwits.com");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        com.gizwits.openapi.sdk.HttpRequest.Method method2 = com.gizwits.openapi.sdk.HttpRequest.Method.PUT;
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = com.gizwits.openapi.sdk.HttpRequest.send("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", method2, strMap3, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = com.gizwits.openapi.sdk.HttpRequest.send("com.gizwits.openapi.sdk.GizwitsException: aff97160474a056e838c1f721af01edf", method2, strMap7, "hi!", "9b2d4d431d4c7cb32fdff91406393cd3");
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + com.gizwits.openapi.sdk.HttpRequest.Method.PUT + "'", method2.equals(com.gizwits.openapi.sdk.HttpRequest.Method.PUT));
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        deviceInfo0.setDid("hi!");
        deviceInfo0.setDid("com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        deviceInfo0.setIsOnline(false);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setMac("aff97160474a056e838c1f721af01edf");
        java.lang.String str8 = deviceInfo0.getAlias();
        java.lang.String str9 = deviceInfo0.getMac();
        java.lang.String str10 = deviceInfo0.getAlias();
        java.lang.String str11 = deviceInfo0.getAlias();
        java.lang.String str12 = deviceInfo0.getDid();
        java.lang.String str13 = deviceInfo0.getDid();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str9, "aff97160474a056e838c1f721af01edf");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str8 = deviceInfo0.getMac();
        deviceInfo0.setAlias("hi!");
        deviceInfo0.setMac("https://api.gizwits.com");
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setMac("com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str17 = deviceInfo0.getDid();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("com.gizwits.openapi.sdk.GizwitsException: ", "d41d8cd98f00b204e9800998ecf8427e", "com.gizwits.openapi.sdk.GizwitsException: aff97160474a056e838c1f721af01edf", "c9d8067a53481f5f59e31be2f7b3627e", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "hi!", "c9d8067a53481f5f59e31be2f7b3627e");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        java.lang.Throwable[] throwableArray3 = gizwitsException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = gizwitsException2.getSuppressed();
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException2);
        java.lang.Throwable[] throwableArray6 = gizwitsException2.getSuppressed();
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException("c9d8067a53481f5f59e31be2f7b3627e", (java.lang.Throwable) gizwitsException2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        boolean boolean2 = deviceInfo0.getIsOnline();
        java.lang.String str3 = deviceInfo0.getAlias();
        deviceInfo0.setMac("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str6 = deviceInfo0.getMac();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com" + "'", str6, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        gizwitsException2.addSuppressed((java.lang.Throwable) gizwitsException5);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException5);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException10 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        java.lang.Throwable[] throwableArray11 = gizwitsException10.getSuppressed();
        com.gizwits.openapi.sdk.GizwitsException gizwitsException12 = new com.gizwits.openapi.sdk.GizwitsException("2a27d7f39ff2023c5dc2aa7ba2acaa28", (java.lang.Throwable) gizwitsException10);
        gizwitsException7.addSuppressed((java.lang.Throwable) gizwitsException10);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException14 = new com.gizwits.openapi.sdk.GizwitsException("", (java.lang.Throwable) gizwitsException10);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setMac("aff97160474a056e838c1f721af01edf");
        deviceInfo0.setDid("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setMac("aff97160474a056e838c1f721af01edf");
        deviceInfo0.setAlias("aff97160474a056e838c1f721af01edf");
        java.lang.String str10 = deviceInfo0.getDid();
        deviceInfo0.setDid("acf7ef943fdeb3cbfed8dd0d8f584731");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        java.lang.Throwable throwable1 = null;
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("74be16979710d4c4e7c6647856088456", throwable1);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        deviceInfo0.setAlias("8129b88dea4e85ae5f6aa83f997f9827");
        java.lang.String str10 = deviceInfo0.getAlias();
        deviceInfo0.setMac("51dab0dacb3460d9be4fecd4cf802628");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "8129b88dea4e85ae5f6aa83f997f9827" + "'", str10, "8129b88dea4e85ae5f6aa83f997f9827");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        deviceInfo0.setIsOnline(true);
        java.lang.String str3 = deviceInfo0.getAlias();
        java.lang.Class<?> wildcardClass4 = deviceInfo0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setMac("aff97160474a056e838c1f721af01edf");
        java.lang.String str8 = deviceInfo0.getAlias();
        deviceInfo0.setAlias("2a27d7f39ff2023c5dc2aa7ba2acaa28");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.gizwits.openapi.sdk.OpenApi openApi0 = new com.gizwits.openapi.sdk.OpenApi();
        java.lang.Class<?> wildcardClass1 = openApi0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException6);
        gizwitsException4.addSuppressed((java.lang.Throwable) gizwitsException7);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException9 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException11 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException13 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException14 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException13);
        gizwitsException11.addSuppressed((java.lang.Throwable) gizwitsException14);
        gizwitsException4.addSuppressed((java.lang.Throwable) gizwitsException11);
        gizwitsException2.addSuppressed((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException18 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException19 = new com.gizwits.openapi.sdk.GizwitsException("74be16979710d4c4e7c6647856088456", (java.lang.Throwable) gizwitsException18);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.gizwits.openapi.sdk.DeviceInfo> deviceInfoList2 = com.gizwits.openapi.sdk.OpenApi.getBoundDevices("com.gizwits.openapi.sdk.GizwitsException: 51dab0dacb3460d9be4fecd4cf802628", "");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str8 = deviceInfo0.getMac();
        deviceInfo0.setAlias("hi!");
        deviceInfo0.setMac("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str13 = deviceInfo0.getDid();
        deviceInfo0.setDid("hi!");
        java.lang.String str16 = deviceInfo0.getDid();
        java.lang.String str17 = deviceInfo0.getMac();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com" + "'", str17, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getDid();
        deviceInfo0.setDid("https://api.gizwits.com");
        java.lang.String str4 = deviceInfo0.getDid();
        deviceInfo0.setDid("");
        deviceInfo0.setDid("com.gizwits.openapi.sdk.GizwitsException: ");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "https://api.gizwits.com" + "'", str4, "https://api.gizwits.com");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        boolean boolean2 = deviceInfo0.getIsOnline();
        java.lang.String str3 = deviceInfo0.getDid();
        java.lang.Class<?> wildcardClass4 = deviceInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("aff97160474a056e838c1f721af01edf");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", (java.lang.Throwable) gizwitsException2);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException9 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException10 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException9);
        gizwitsException7.addSuppressed((java.lang.Throwable) gizwitsException10);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException12 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException7);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException14 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException16 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException17 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException16);
        gizwitsException14.addSuppressed((java.lang.Throwable) gizwitsException17);
        gizwitsException7.addSuppressed((java.lang.Throwable) gizwitsException14);
        gizwitsException5.addSuppressed((java.lang.Throwable) gizwitsException7);
        gizwitsException3.addSuppressed((java.lang.Throwable) gizwitsException7);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException22 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException7);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("9b2d4d431d4c7cb32fdff91406393cd3", "9b2d4d431d4c7cb32fdff91406393cd3", "74be16979710d4c4e7c6647856088456", "", "33efbb43f502e2933fbfc8c508980152", "com.gizwits.openapi.sdk.GizwitsException: aff97160474a056e838c1f721af01edf", "hi!");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.gizwits.openapi.sdk.OpenApi.setGizwitsBaseApiUrl("hi!");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com", (java.lang.Throwable) gizwitsException3);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException6);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException8 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException7);
        gizwitsException3.addSuppressed((java.lang.Throwable) gizwitsException7);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException10 = new com.gizwits.openapi.sdk.GizwitsException("com.gizwits.openapi.sdk.GizwitsException: aff97160474a056e838c1f721af01edf", (java.lang.Throwable) gizwitsException7);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("9b2d4d431d4c7cb32fdff91406393cd3", "hi!", "8129b88dea4e85ae5f6aa83f997f9827");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException8 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException7);
        gizwitsException5.addSuppressed((java.lang.Throwable) gizwitsException8);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException10 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException5);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException12 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException14 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException15 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException14);
        gizwitsException12.addSuppressed((java.lang.Throwable) gizwitsException15);
        gizwitsException5.addSuppressed((java.lang.Throwable) gizwitsException12);
        gizwitsException3.addSuppressed((java.lang.Throwable) gizwitsException5);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException19 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException5);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException20 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com", (java.lang.Throwable) gizwitsException19);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException21 = new com.gizwits.openapi.sdk.GizwitsException("com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", (java.lang.Throwable) gizwitsException19);
        java.lang.Throwable[] throwableArray22 = gizwitsException19.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.lang.Throwable throwable1 = null;
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com", throwable1);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException5);
        gizwitsException2.addSuppressed((java.lang.Throwable) gizwitsException5);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException9 = new com.gizwits.openapi.sdk.GizwitsException("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException11 = new com.gizwits.openapi.sdk.GizwitsException("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException12 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException11);
        gizwitsException9.addSuppressed((java.lang.Throwable) gizwitsException11);
        gizwitsException2.addSuppressed((java.lang.Throwable) gizwitsException11);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException15 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException2);
        java.lang.String str16 = gizwitsException2.toString();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com" + "'", str16, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        java.lang.String str1 = com.gizwits.openapi.sdk.HttpRequest.md5("com.gizwits.openapi.sdk.GizwitsException: ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5482be16dadb92a0660def6a1a05756e" + "'", str1, "5482be16dadb92a0660def6a1a05756e");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.gizwits.openapi.sdk.HttpRequest.Method method4 = com.gizwits.openapi.sdk.HttpRequest.Method.GET;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = com.gizwits.openapi.sdk.HttpRequest.send("hi!", method4, strMap5, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "aff97160474a056e838c1f721af01edf");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = com.gizwits.openapi.sdk.HttpRequest.send("2a27d7f39ff2023c5dc2aa7ba2acaa28", method4, strMap9, "https://api.gizwits.com", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = com.gizwits.openapi.sdk.HttpRequest.send("https://api.gizwits.com", method4, strMap13, "51dab0dacb3460d9be4fecd4cf802628", "https://api.gizwits.com");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = com.gizwits.openapi.sdk.HttpRequest.send("8129b88dea4e85ae5f6aa83f997f9827", method4, strMap17, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "126de9c45f5d1d8c8eb7ba9488f410fc");
        org.junit.Assert.assertTrue("'" + method4 + "' != '" + com.gizwits.openapi.sdk.HttpRequest.Method.GET + "'", method4.equals(com.gizwits.openapi.sdk.HttpRequest.Method.GET));
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(strMap20);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException5);
        gizwitsException3.addSuppressed((java.lang.Throwable) gizwitsException6);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException8 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException3);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException10 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException12 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException13 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException12);
        gizwitsException10.addSuppressed((java.lang.Throwable) gizwitsException13);
        gizwitsException3.addSuppressed((java.lang.Throwable) gizwitsException10);
        gizwitsException1.addSuppressed((java.lang.Throwable) gizwitsException3);
        java.lang.Throwable[] throwableArray17 = gizwitsException1.getSuppressed();
        com.gizwits.openapi.sdk.GizwitsException gizwitsException18 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException1);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.gizwits.openapi.sdk.HttpRequest.Method method3 = com.gizwits.openapi.sdk.HttpRequest.Method.PUT;
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = com.gizwits.openapi.sdk.HttpRequest.send("", method3, strMap4, "d41d8cd98f00b204e9800998ecf8427e", "https://api.gizwits.com");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = com.gizwits.openapi.sdk.HttpRequest.send("c9d8067a53481f5f59e31be2f7b3627e", method3, strMap8, "c9d8067a53481f5f59e31be2f7b3627e", "aff97160474a056e838c1f721af01edf");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = com.gizwits.openapi.sdk.HttpRequest.send("https://api.gizwits.com", method3, strMap12, "d41d8cd98f00b204e9800998ecf8427e", "com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        org.junit.Assert.assertTrue("'" + method3 + "' != '" + com.gizwits.openapi.sdk.HttpRequest.Method.PUT + "'", method3.equals(com.gizwits.openapi.sdk.HttpRequest.Method.PUT));
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.unbindDevice("com.gizwits.openapi.sdk.GizwitsException: ", "51dab0dacb3460d9be4fecd4cf802628", "c9d8067a53481f5f59e31be2f7b3627e");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.unbindDevice("51dab0dacb3460d9be4fecd4cf802628", "acf7ef943fdeb3cbfed8dd0d8f584731", "9b2d4d431d4c7cb32fdff91406393cd3");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("5482be16dadb92a0660def6a1a05756e", "2a27d7f39ff2023c5dc2aa7ba2acaa28", "74be16979710d4c4e7c6647856088456", "com.gizwits.openapi.sdk.GizwitsException: aff97160474a056e838c1f721af01edf", "126de9c45f5d1d8c8eb7ba9488f410fc", "33efbb43f502e2933fbfc8c508980152", "com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.gizwits.openapi.sdk.HttpRequest.Method method1 = com.gizwits.openapi.sdk.HttpRequest.Method.PUT;
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = com.gizwits.openapi.sdk.HttpRequest.send("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", method1, strMap2, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "");
        java.lang.Class<?> wildcardClass6 = method1.getClass();
        org.junit.Assert.assertTrue("'" + method1 + "' != '" + com.gizwits.openapi.sdk.HttpRequest.Method.PUT + "'", method1.equals(com.gizwits.openapi.sdk.HttpRequest.Method.PUT));
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.gizwits.openapi.sdk.OpenApi.setGizwitsBaseApiUrl("com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        boolean boolean6 = deviceInfo0.getIsOnline();
        java.lang.String str7 = deviceInfo0.getDid();
        boolean boolean8 = deviceInfo0.getIsOnline();
        java.lang.String str9 = deviceInfo0.getMac();
        java.lang.Class<?> wildcardClass10 = deviceInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        boolean boolean1 = deviceInfo0.getIsOnline();
        deviceInfo0.setAlias("aff97160474a056e838c1f721af01edf");
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setMac("");
        deviceInfo0.setAlias("");
        deviceInfo0.setDid("126de9c45f5d1d8c8eb7ba9488f410fc");
        deviceInfo0.setMac("74be16979710d4c4e7c6647856088456");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        boolean boolean2 = deviceInfo0.getIsOnline();
        boolean boolean3 = deviceInfo0.getIsOnline();
        boolean boolean4 = deviceInfo0.getIsOnline();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        java.lang.Throwable throwable1 = null;
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com", throwable1);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException5);
        gizwitsException2.addSuppressed((java.lang.Throwable) gizwitsException5);
        java.lang.Throwable[] throwableArray8 = gizwitsException5.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setMac("aff97160474a056e838c1f721af01edf");
        deviceInfo0.setAlias("aff97160474a056e838c1f721af01edf");
        boolean boolean10 = deviceInfo0.getIsOnline();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.gizwits.openapi.sdk.OpenApi.setGizwitsBaseApiUrl("com.gizwits.openapi.sdk.GizwitsException: ");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException3);
        gizwitsException1.addSuppressed((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException6);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        gizwitsException2.addSuppressed((java.lang.Throwable) gizwitsException5);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException2);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException9 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException11 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException12 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException11);
        gizwitsException9.addSuppressed((java.lang.Throwable) gizwitsException12);
        gizwitsException2.addSuppressed((java.lang.Throwable) gizwitsException9);
        java.lang.Throwable[] throwableArray15 = gizwitsException2.getSuppressed();
        com.gizwits.openapi.sdk.GizwitsException gizwitsException16 = new com.gizwits.openapi.sdk.GizwitsException("2a27d7f39ff2023c5dc2aa7ba2acaa28", (java.lang.Throwable) gizwitsException2);
        java.lang.Throwable[] throwableArray17 = gizwitsException16.getSuppressed();
        java.lang.Class<?> wildcardClass18 = gizwitsException16.getClass();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("8129b88dea4e85ae5f6aa83f997f9827");
        java.lang.Throwable[] throwableArray2 = gizwitsException1.getSuppressed();
        java.lang.Throwable throwable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            gizwitsException1.addSuppressed(throwable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        gizwitsException2.addSuppressed((java.lang.Throwable) gizwitsException5);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException2);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException9 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException11 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException12 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException11);
        gizwitsException9.addSuppressed((java.lang.Throwable) gizwitsException12);
        gizwitsException2.addSuppressed((java.lang.Throwable) gizwitsException9);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException16 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException17 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException16);
        gizwitsException9.addSuppressed((java.lang.Throwable) gizwitsException16);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException19 = new com.gizwits.openapi.sdk.GizwitsException("126de9c45f5d1d8c8eb7ba9488f410fc", (java.lang.Throwable) gizwitsException16);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException1);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException2);
        java.lang.Throwable[] throwableArray4 = gizwitsException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str8 = deviceInfo0.getAlias();
        deviceInfo0.setIsOnline(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com" + "'", str8, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException6);
        gizwitsException4.addSuppressed((java.lang.Throwable) gizwitsException7);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException9 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException11 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException13 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException14 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException13);
        gizwitsException11.addSuppressed((java.lang.Throwable) gizwitsException14);
        gizwitsException4.addSuppressed((java.lang.Throwable) gizwitsException11);
        gizwitsException2.addSuppressed((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException18 = new com.gizwits.openapi.sdk.GizwitsException("", (java.lang.Throwable) gizwitsException4);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getDid();
        deviceInfo0.setDid("https://api.gizwits.com");
        deviceInfo0.setMac("2a27d7f39ff2023c5dc2aa7ba2acaa28");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        boolean boolean2 = deviceInfo0.getIsOnline();
        java.lang.String str3 = deviceInfo0.getAlias();
        java.lang.String str4 = deviceInfo0.getMac();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("33efbb43f502e2933fbfc8c508980152");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        boolean boolean2 = deviceInfo0.getIsOnline();
        java.lang.String str3 = deviceInfo0.getDid();
        java.lang.String str4 = deviceInfo0.getDid();
        deviceInfo0.setDid("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.unbindDevice("9b2d4d431d4c7cb32fdff91406393cd3", "acf7ef943fdeb3cbfed8dd0d8f584731", "126de9c45f5d1d8c8eb7ba9488f410fc");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        java.lang.Throwable throwable1 = null;
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com", throwable1);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException5);
        gizwitsException2.addSuppressed((java.lang.Throwable) gizwitsException5);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException9 = new com.gizwits.openapi.sdk.GizwitsException("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException11 = new com.gizwits.openapi.sdk.GizwitsException("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException12 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException11);
        gizwitsException9.addSuppressed((java.lang.Throwable) gizwitsException11);
        gizwitsException2.addSuppressed((java.lang.Throwable) gizwitsException11);
        java.lang.Throwable[] throwableArray15 = gizwitsException2.getSuppressed();
        java.lang.Class<?> wildcardClass16 = throwableArray15.getClass();
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("2a27d7f39ff2023c5dc2aa7ba2acaa28", "c9d8067a53481f5f59e31be2f7b3627e", "com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "51dab0dacb3460d9be4fecd4cf802628", "8129b88dea4e85ae5f6aa83f997f9827", "com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "hi!");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException3);
        gizwitsException1.addSuppressed((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException1);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException1);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException8 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException7);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setMac("aff97160474a056e838c1f721af01edf");
        java.lang.String str8 = deviceInfo0.getAlias();
        java.lang.String str9 = deviceInfo0.getMac();
        java.lang.String str10 = deviceInfo0.getDid();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str9, "aff97160474a056e838c1f721af01edf");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("");
        java.lang.Throwable[] throwableArray2 = gizwitsException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = gizwitsException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("126de9c45f5d1d8c8eb7ba9488f410fc", "33efbb43f502e2933fbfc8c508980152", "hi!");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException5);
        gizwitsException3.addSuppressed((java.lang.Throwable) gizwitsException6);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException8 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException3);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException10 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException12 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException13 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException12);
        gizwitsException10.addSuppressed((java.lang.Throwable) gizwitsException13);
        gizwitsException3.addSuppressed((java.lang.Throwable) gizwitsException10);
        java.lang.Throwable[] throwableArray16 = gizwitsException3.getSuppressed();
        com.gizwits.openapi.sdk.GizwitsException gizwitsException17 = new com.gizwits.openapi.sdk.GizwitsException("2a27d7f39ff2023c5dc2aa7ba2acaa28", (java.lang.Throwable) gizwitsException3);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException18 = new com.gizwits.openapi.sdk.GizwitsException("51dab0dacb3460d9be4fecd4cf802628", (java.lang.Throwable) gizwitsException3);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com", (java.lang.Throwable) gizwitsException2);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException5);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException6);
        gizwitsException2.addSuppressed((java.lang.Throwable) gizwitsException6);
        java.lang.String str9 = gizwitsException2.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com" + "'", str9, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.gizwits.openapi.sdk.DeviceInfo> deviceInfoList2 = com.gizwits.openapi.sdk.OpenApi.getBoundDevices("d41d8cd98f00b204e9800998ecf8427e", "33efbb43f502e2933fbfc8c508980152");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("", (java.lang.Throwable) gizwitsException2);
        java.lang.Throwable[] throwableArray4 = gizwitsException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.unbindDevice("com.gizwits.openapi.sdk.GizwitsException: aff97160474a056e838c1f721af01edf", "aff97160474a056e838c1f721af01edf", "");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setAlias("126de9c45f5d1d8c8eb7ba9488f410fc");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.gizwits.openapi.sdk.DeviceInfo> deviceInfoList2 = com.gizwits.openapi.sdk.OpenApi.getBoundDevices("5482be16dadb92a0660def6a1a05756e", "com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setMac("aff97160474a056e838c1f721af01edf");
        java.lang.String str8 = deviceInfo0.getAlias();
        boolean boolean9 = deviceInfo0.getIsOnline();
        java.lang.String str10 = deviceInfo0.getAlias();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        deviceInfo0.setDid("hi!");
        deviceInfo0.setDid("com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str12 = deviceInfo0.getAlias();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com" + "'", str12, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setMac("aff97160474a056e838c1f721af01edf");
        java.lang.String str8 = deviceInfo0.getAlias();
        java.lang.String str9 = deviceInfo0.getMac();
        java.lang.String str10 = deviceInfo0.getAlias();
        boolean boolean11 = deviceInfo0.getIsOnline();
        deviceInfo0.setAlias("https://api.gizwits.com");
        boolean boolean14 = deviceInfo0.getIsOnline();
        deviceInfo0.setMac("com.gizwits.openapi.sdk.GizwitsException: ");
        boolean boolean17 = deviceInfo0.getIsOnline();
        java.lang.String str18 = deviceInfo0.getAlias();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str9, "aff97160474a056e838c1f721af01edf");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "https://api.gizwits.com" + "'", str18, "https://api.gizwits.com");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        boolean boolean2 = deviceInfo0.getIsOnline();
        boolean boolean3 = deviceInfo0.getIsOnline();
        java.lang.String str4 = deviceInfo0.getMac();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException5);
        gizwitsException3.addSuppressed((java.lang.Throwable) gizwitsException6);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException8 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException3);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException10 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException12 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException13 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException12);
        gizwitsException10.addSuppressed((java.lang.Throwable) gizwitsException13);
        gizwitsException3.addSuppressed((java.lang.Throwable) gizwitsException10);
        gizwitsException1.addSuppressed((java.lang.Throwable) gizwitsException3);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException18 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException20 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException21 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException20);
        gizwitsException18.addSuppressed((java.lang.Throwable) gizwitsException21);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException23 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException21);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException26 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        java.lang.Throwable[] throwableArray27 = gizwitsException26.getSuppressed();
        com.gizwits.openapi.sdk.GizwitsException gizwitsException28 = new com.gizwits.openapi.sdk.GizwitsException("2a27d7f39ff2023c5dc2aa7ba2acaa28", (java.lang.Throwable) gizwitsException26);
        gizwitsException23.addSuppressed((java.lang.Throwable) gizwitsException26);
        gizwitsException3.addSuppressed((java.lang.Throwable) gizwitsException23);
        java.lang.Class<?> wildcardClass31 = gizwitsException23.getClass();
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        boolean boolean1 = deviceInfo0.getIsOnline();
        java.lang.String str2 = deviceInfo0.getAlias();
        deviceInfo0.setAlias("51dab0dacb3460d9be4fecd4cf802628");
        java.lang.String str5 = deviceInfo0.getAlias();
        java.lang.Class<?> wildcardClass6 = deviceInfo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "51dab0dacb3460d9be4fecd4cf802628" + "'", str5, "51dab0dacb3460d9be4fecd4cf802628");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setMac("aff97160474a056e838c1f721af01edf");
        java.lang.String str8 = deviceInfo0.getAlias();
        deviceInfo0.setMac("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        boolean boolean11 = deviceInfo0.getIsOnline();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException6);
        gizwitsException4.addSuppressed((java.lang.Throwable) gizwitsException7);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException9 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException11 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException13 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException14 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException13);
        gizwitsException11.addSuppressed((java.lang.Throwable) gizwitsException14);
        gizwitsException4.addSuppressed((java.lang.Throwable) gizwitsException11);
        gizwitsException2.addSuppressed((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException18 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException19 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com", (java.lang.Throwable) gizwitsException18);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException21 = new com.gizwits.openapi.sdk.GizwitsException("aff97160474a056e838c1f721af01edf");
        gizwitsException19.addSuppressed((java.lang.Throwable) gizwitsException21);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException25 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException26 = new com.gizwits.openapi.sdk.GizwitsException("", (java.lang.Throwable) gizwitsException25);
        gizwitsException21.addSuppressed((java.lang.Throwable) gizwitsException26);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str8 = deviceInfo0.getMac();
        deviceInfo0.setAlias("hi!");
        deviceInfo0.setMac("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str13 = deviceInfo0.getDid();
        java.lang.String str14 = deviceInfo0.getAlias();
        deviceInfo0.setAlias("aff97160474a056e838c1f721af01edf");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("aff97160474a056e838c1f721af01edf");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", (java.lang.Throwable) gizwitsException2);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException2);
        java.lang.Class<?> wildcardClass5 = gizwitsException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        boolean boolean2 = deviceInfo0.getIsOnline();
        java.lang.String str3 = deviceInfo0.getAlias();
        java.lang.Class<?> wildcardClass4 = deviceInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("aff97160474a056e838c1f721af01edf");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException("8129b88dea4e85ae5f6aa83f997f9827", (java.lang.Throwable) gizwitsException3);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        java.lang.Throwable[] throwableArray6 = gizwitsException5.getSuppressed();
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com", (java.lang.Throwable) gizwitsException5);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("2a27d7f39ff2023c5dc2aa7ba2acaa28");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("", "com.gizwits.openapi.sdk.GizwitsException: aff97160474a056e838c1f721af01edf", "9b2d4d431d4c7cb32fdff91406393cd3", "hi!", "aff97160474a056e838c1f721af01edf", "hi!", "");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        com.gizwits.openapi.sdk.HttpRequest.Method method3 = com.gizwits.openapi.sdk.HttpRequest.Method.GET;
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = com.gizwits.openapi.sdk.HttpRequest.send("hi!", method3, strMap4, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "aff97160474a056e838c1f721af01edf");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = com.gizwits.openapi.sdk.HttpRequest.send("8129b88dea4e85ae5f6aa83f997f9827", method3, strMap8, "126de9c45f5d1d8c8eb7ba9488f410fc", "https://api.gizwits.com");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = com.gizwits.openapi.sdk.HttpRequest.send("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", method3, strMap12, "https://api.gizwits.com", "8129b88dea4e85ae5f6aa83f997f9827");
        org.junit.Assert.assertTrue("'" + method3 + "' != '" + com.gizwits.openapi.sdk.HttpRequest.Method.GET + "'", method3.equals(com.gizwits.openapi.sdk.HttpRequest.Method.GET));
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        boolean boolean6 = deviceInfo0.getIsOnline();
        java.lang.String str7 = deviceInfo0.getDid();
        deviceInfo0.setIsOnline(true);
        java.lang.String str10 = deviceInfo0.getDid();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException6);
        gizwitsException4.addSuppressed((java.lang.Throwable) gizwitsException7);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException9 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException11 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException13 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException14 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException13);
        gizwitsException11.addSuppressed((java.lang.Throwable) gizwitsException14);
        gizwitsException4.addSuppressed((java.lang.Throwable) gizwitsException11);
        gizwitsException2.addSuppressed((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException18 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException19 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com", (java.lang.Throwable) gizwitsException18);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException21 = new com.gizwits.openapi.sdk.GizwitsException("aff97160474a056e838c1f721af01edf");
        gizwitsException19.addSuppressed((java.lang.Throwable) gizwitsException21);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException25 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        java.lang.Throwable[] throwableArray26 = gizwitsException25.getSuppressed();
        com.gizwits.openapi.sdk.GizwitsException gizwitsException27 = new com.gizwits.openapi.sdk.GizwitsException("2a27d7f39ff2023c5dc2aa7ba2acaa28", (java.lang.Throwable) gizwitsException25);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException28 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException27);
        gizwitsException19.addSuppressed((java.lang.Throwable) gizwitsException27);
        java.lang.Throwable[] throwableArray30 = gizwitsException19.getSuppressed();
        java.lang.Class<?> wildcardClass31 = throwableArray30.getClass();
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("aff97160474a056e838c1f721af01edf");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("8129b88dea4e85ae5f6aa83f997f9827", (java.lang.Throwable) gizwitsException2);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException3);
        java.lang.Class<?> wildcardClass5 = gizwitsException4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setMac("aff97160474a056e838c1f721af01edf");
        java.lang.String str8 = deviceInfo0.getAlias();
        java.lang.String str9 = deviceInfo0.getMac();
        java.lang.String str10 = deviceInfo0.getAlias();
        boolean boolean11 = deviceInfo0.getIsOnline();
        deviceInfo0.setMac("com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str9, "aff97160474a056e838c1f721af01edf");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("", "2a27d7f39ff2023c5dc2aa7ba2acaa28", "2a27d7f39ff2023c5dc2aa7ba2acaa28", "126de9c45f5d1d8c8eb7ba9488f410fc", "d41d8cd98f00b204e9800998ecf8427e", "c9d8067a53481f5f59e31be2f7b3627e", "33efbb43f502e2933fbfc8c508980152");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str8 = deviceInfo0.getMac();
        deviceInfo0.setAlias("hi!");
        deviceInfo0.setMac("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str13 = deviceInfo0.getDid();
        deviceInfo0.setDid("hi!");
        deviceInfo0.setAlias("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getDid();
        java.lang.Class<?> wildcardClass2 = deviceInfo0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.unbindDevice("com.gizwits.openapi.sdk.GizwitsException: 51dab0dacb3460d9be4fecd4cf802628", "5482be16dadb92a0660def6a1a05756e", "com.gizwits.openapi.sdk.GizwitsException: 51dab0dacb3460d9be4fecd4cf802628");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException6);
        gizwitsException4.addSuppressed((java.lang.Throwable) gizwitsException7);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException9 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException11 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException13 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException14 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException13);
        gizwitsException11.addSuppressed((java.lang.Throwable) gizwitsException14);
        gizwitsException4.addSuppressed((java.lang.Throwable) gizwitsException11);
        gizwitsException2.addSuppressed((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException18 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException19 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com", (java.lang.Throwable) gizwitsException18);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException21 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException23 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException24 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException23);
        gizwitsException21.addSuppressed((java.lang.Throwable) gizwitsException24);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException26 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException21);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException28 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException30 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException31 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException30);
        gizwitsException28.addSuppressed((java.lang.Throwable) gizwitsException31);
        gizwitsException21.addSuppressed((java.lang.Throwable) gizwitsException28);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException35 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException36 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException35);
        gizwitsException28.addSuppressed((java.lang.Throwable) gizwitsException35);
        gizwitsException18.addSuppressed((java.lang.Throwable) gizwitsException28);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException39 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException28);
        java.lang.String str40 = gizwitsException28.toString();
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com" + "'", str40, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        boolean boolean2 = deviceInfo0.getIsOnline();
        java.lang.String str3 = deviceInfo0.getAlias();
        deviceInfo0.setMac("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str6 = deviceInfo0.getDid();
        deviceInfo0.setIsOnline(false);
        java.lang.String str9 = deviceInfo0.getAlias();
        deviceInfo0.setDid("74be16979710d4c4e7c6647856088456");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        com.gizwits.openapi.sdk.HttpRequest.Method method5 = com.gizwits.openapi.sdk.HttpRequest.Method.GET;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = com.gizwits.openapi.sdk.HttpRequest.send("hi!", method5, strMap6, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "aff97160474a056e838c1f721af01edf");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = com.gizwits.openapi.sdk.HttpRequest.send("2a27d7f39ff2023c5dc2aa7ba2acaa28", method5, strMap10, "https://api.gizwits.com", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = com.gizwits.openapi.sdk.HttpRequest.send("https://api.gizwits.com", method5, strMap14, "51dab0dacb3460d9be4fecd4cf802628", "https://api.gizwits.com");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = com.gizwits.openapi.sdk.HttpRequest.send("33efbb43f502e2933fbfc8c508980152", method5, strMap18, "33efbb43f502e2933fbfc8c508980152", "51dab0dacb3460d9be4fecd4cf802628");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = com.gizwits.openapi.sdk.HttpRequest.send("com.gizwits.openapi.sdk.GizwitsException: ", method5, strMap22, "", "com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        org.junit.Assert.assertTrue("'" + method5 + "' != '" + com.gizwits.openapi.sdk.HttpRequest.Method.GET + "'", method5.equals(com.gizwits.openapi.sdk.HttpRequest.Method.GET));
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNull(strMap25);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("74be16979710d4c4e7c6647856088456", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "5482be16dadb92a0660def6a1a05756e", "com.gizwits.openapi.sdk.GizwitsException: aff97160474a056e838c1f721af01edf", "5482be16dadb92a0660def6a1a05756e", "74be16979710d4c4e7c6647856088456", "d41d8cd98f00b204e9800998ecf8427e");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.unbindDevice("8129b88dea4e85ae5f6aa83f997f9827", "8129b88dea4e85ae5f6aa83f997f9827", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("com.gizwits.openapi.sdk.GizwitsException: ", (java.lang.Throwable) gizwitsException2);
        java.lang.String str4 = gizwitsException2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com" + "'", str4, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.gizwits.openapi.sdk.DeviceInfo> deviceInfoList2 = com.gizwits.openapi.sdk.OpenApi.getBoundDevices("https://api.gizwits.com", "d41d8cd98f00b204e9800998ecf8427e");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        deviceInfo0.setAlias("8129b88dea4e85ae5f6aa83f997f9827");
        java.lang.String str10 = deviceInfo0.getAlias();
        java.lang.String str11 = deviceInfo0.getDid();
        java.lang.String str12 = deviceInfo0.getMac();
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: 51dab0dacb3460d9be4fecd4cf802628");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "8129b88dea4e85ae5f6aa83f997f9827" + "'", str10, "8129b88dea4e85ae5f6aa83f997f9827");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        boolean boolean1 = deviceInfo0.getIsOnline();
        java.lang.String str2 = deviceInfo0.getAlias();
        deviceInfo0.setMac("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str5 = deviceInfo0.getAlias();
        java.lang.String str6 = deviceInfo0.getDid();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        java.lang.String str1 = com.gizwits.openapi.sdk.HttpRequest.md5("33efbb43f502e2933fbfc8c508980152");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "47979e5c63c7730b9aa1aa3976607f76" + "'", str1, "47979e5c63c7730b9aa1aa3976607f76");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.gizwits.openapi.sdk.DeviceInfo> deviceInfoList2 = com.gizwits.openapi.sdk.OpenApi.getBoundDevices("com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "d41d8cd98f00b204e9800998ecf8427e");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str8 = deviceInfo0.getMac();
        deviceInfo0.setAlias("hi!");
        deviceInfo0.setMac("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str13 = deviceInfo0.getDid();
        java.lang.String str14 = deviceInfo0.getAlias();
        deviceInfo0.setAlias("47979e5c63c7730b9aa1aa3976607f76");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("aff97160474a056e838c1f721af01edf");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", (java.lang.Throwable) gizwitsException2);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException9 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException10 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException9);
        gizwitsException7.addSuppressed((java.lang.Throwable) gizwitsException10);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException12 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException7);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException14 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException16 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException17 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException16);
        gizwitsException14.addSuppressed((java.lang.Throwable) gizwitsException17);
        gizwitsException7.addSuppressed((java.lang.Throwable) gizwitsException14);
        gizwitsException5.addSuppressed((java.lang.Throwable) gizwitsException7);
        gizwitsException3.addSuppressed((java.lang.Throwable) gizwitsException7);
        java.lang.Throwable[] throwableArray22 = gizwitsException7.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getDid();
        deviceInfo0.setIsOnline(false);
        java.lang.String str4 = deviceInfo0.getDid();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setMac("aff97160474a056e838c1f721af01edf");
        java.lang.String str8 = deviceInfo0.getAlias();
        deviceInfo0.setMac("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str11 = deviceInfo0.getMac();
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: 51dab0dacb3460d9be4fecd4cf802628");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com" + "'", str11, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        java.lang.Throwable throwable1 = null;
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com", throwable1);
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException(throwable1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.unbindDevice("5482be16dadb92a0660def6a1a05756e", "5482be16dadb92a0660def6a1a05756e", "9b2d4d431d4c7cb32fdff91406393cd3");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.gizwits.openapi.sdk.DeviceInfo> deviceInfoList2 = com.gizwits.openapi.sdk.OpenApi.getBoundDevices("9b2d4d431d4c7cb32fdff91406393cd3", "");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setMac("aff97160474a056e838c1f721af01edf");
        deviceInfo0.setDid("126de9c45f5d1d8c8eb7ba9488f410fc");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("", "acf7ef943fdeb3cbfed8dd0d8f584731", "com.gizwits.openapi.sdk.GizwitsException: ");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        java.lang.String str4 = deviceInfo0.getDid();
        deviceInfo0.setMac("126de9c45f5d1d8c8eb7ba9488f410fc");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        deviceInfo0.setAlias("8129b88dea4e85ae5f6aa83f997f9827");
        java.lang.String str10 = deviceInfo0.getAlias();
        java.lang.String str11 = deviceInfo0.getDid();
        java.lang.String str12 = deviceInfo0.getMac();
        boolean boolean13 = deviceInfo0.getIsOnline();
        java.lang.String str14 = deviceInfo0.getMac();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "8129b88dea4e85ae5f6aa83f997f9827" + "'", str10, "8129b88dea4e85ae5f6aa83f997f9827");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        com.gizwits.openapi.sdk.OpenApi.setGizwitsBaseApiUrl("com.gizwits.openapi.sdk.GizwitsException: 51dab0dacb3460d9be4fecd4cf802628");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        boolean boolean4 = deviceInfo0.getIsOnline();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        com.gizwits.openapi.sdk.HttpRequest.Method method2 = com.gizwits.openapi.sdk.HttpRequest.Method.GET;
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = com.gizwits.openapi.sdk.HttpRequest.send("hi!", method2, strMap3, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "aff97160474a056e838c1f721af01edf");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = com.gizwits.openapi.sdk.HttpRequest.send("acf7ef943fdeb3cbfed8dd0d8f584731", method2, strMap7, "https://api.gizwits.com", "hi!");
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + com.gizwits.openapi.sdk.HttpRequest.Method.GET + "'", method2.equals(com.gizwits.openapi.sdk.HttpRequest.Method.GET));
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com", (java.lang.Throwable) gizwitsException3);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException6);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException8 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException7);
        gizwitsException3.addSuppressed((java.lang.Throwable) gizwitsException7);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException10 = new com.gizwits.openapi.sdk.GizwitsException("hi!", (java.lang.Throwable) gizwitsException3);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setMac("aff97160474a056e838c1f721af01edf");
        java.lang.String str8 = deviceInfo0.getAlias();
        deviceInfo0.setMac("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str11 = deviceInfo0.getMac();
        java.lang.String str12 = deviceInfo0.getDid();
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com" + "'", str11, "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        boolean boolean1 = deviceInfo0.getIsOnline();
        deviceInfo0.setAlias("aff97160474a056e838c1f721af01edf");
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setAlias("d41d8cd98f00b204e9800998ecf8427e");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("c9d8067a53481f5f59e31be2f7b3627e", "https://api.gizwits.com", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "74be16979710d4c4e7c6647856088456", "8129b88dea4e85ae5f6aa83f997f9827", "51dab0dacb3460d9be4fecd4cf802628", "");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com", (java.lang.Throwable) gizwitsException2);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException2);
        java.lang.Throwable[] throwableArray5 = gizwitsException4.getSuppressed();
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException9 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        java.lang.Throwable[] throwableArray10 = gizwitsException9.getSuppressed();
        com.gizwits.openapi.sdk.GizwitsException gizwitsException11 = new com.gizwits.openapi.sdk.GizwitsException("2a27d7f39ff2023c5dc2aa7ba2acaa28", (java.lang.Throwable) gizwitsException9);
        gizwitsException4.addSuppressed((java.lang.Throwable) gizwitsException9);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("hi!");
        java.lang.Throwable[] throwableArray2 = gizwitsException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = gizwitsException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException8 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException7);
        gizwitsException5.addSuppressed((java.lang.Throwable) gizwitsException8);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException10 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException5);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException12 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException14 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException15 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException14);
        gizwitsException12.addSuppressed((java.lang.Throwable) gizwitsException15);
        gizwitsException5.addSuppressed((java.lang.Throwable) gizwitsException12);
        gizwitsException3.addSuppressed((java.lang.Throwable) gizwitsException5);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException19 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException5);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException20 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com", (java.lang.Throwable) gizwitsException19);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException21 = new com.gizwits.openapi.sdk.GizwitsException("com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", (java.lang.Throwable) gizwitsException19);
        java.lang.String str22 = gizwitsException21.toString();
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com" + "'", str22, "com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("com.gizwits.openapi.sdk.GizwitsException: aff97160474a056e838c1f721af01edf");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("51dab0dacb3460d9be4fecd4cf802628", (java.lang.Throwable) gizwitsException2);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        gizwitsException2.addSuppressed((java.lang.Throwable) gizwitsException5);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException2);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException9 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException11 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException12 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException11);
        gizwitsException9.addSuppressed((java.lang.Throwable) gizwitsException12);
        gizwitsException2.addSuppressed((java.lang.Throwable) gizwitsException9);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException15 = new com.gizwits.openapi.sdk.GizwitsException("5482be16dadb92a0660def6a1a05756e", (java.lang.Throwable) gizwitsException9);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        boolean boolean1 = deviceInfo0.getIsOnline();
        java.lang.String str2 = deviceInfo0.getAlias();
        java.lang.String str3 = deviceInfo0.getDid();
        java.lang.String str4 = deviceInfo0.getMac();
        java.lang.String str5 = deviceInfo0.getMac();
        java.lang.Class<?> wildcardClass6 = deviceInfo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException6);
        gizwitsException4.addSuppressed((java.lang.Throwable) gizwitsException7);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException9 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException11 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException13 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException14 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException13);
        gizwitsException11.addSuppressed((java.lang.Throwable) gizwitsException14);
        gizwitsException4.addSuppressed((java.lang.Throwable) gizwitsException11);
        gizwitsException2.addSuppressed((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException19 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException21 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException22 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException21);
        gizwitsException19.addSuppressed((java.lang.Throwable) gizwitsException22);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException24 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException22);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException27 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        java.lang.Throwable[] throwableArray28 = gizwitsException27.getSuppressed();
        com.gizwits.openapi.sdk.GizwitsException gizwitsException29 = new com.gizwits.openapi.sdk.GizwitsException("2a27d7f39ff2023c5dc2aa7ba2acaa28", (java.lang.Throwable) gizwitsException27);
        gizwitsException24.addSuppressed((java.lang.Throwable) gizwitsException27);
        gizwitsException4.addSuppressed((java.lang.Throwable) gizwitsException24);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException32 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e", (java.lang.Throwable) gizwitsException4);
        java.lang.Throwable[] throwableArray33 = gizwitsException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray33);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException6);
        gizwitsException4.addSuppressed((java.lang.Throwable) gizwitsException7);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException9 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException11 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException13 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException14 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException13);
        gizwitsException11.addSuppressed((java.lang.Throwable) gizwitsException14);
        gizwitsException4.addSuppressed((java.lang.Throwable) gizwitsException11);
        gizwitsException2.addSuppressed((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException18 = new com.gizwits.openapi.sdk.GizwitsException("com.gizwits.openapi.sdk.GizwitsException: 51dab0dacb3460d9be4fecd4cf802628", (java.lang.Throwable) gizwitsException2);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException1);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException2);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException3);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("126de9c45f5d1d8c8eb7ba9488f410fc");
        java.lang.Throwable[] throwableArray2 = gizwitsException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("5482be16dadb92a0660def6a1a05756e", "9b2d4d431d4c7cb32fdff91406393cd3", "com.gizwits.openapi.sdk.GizwitsException: aff97160474a056e838c1f721af01edf", "acf7ef943fdeb3cbfed8dd0d8f584731", "", "5482be16dadb92a0660def6a1a05756e", "com.gizwits.openapi.sdk.GizwitsException: ");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException1 = new com.gizwits.openapi.sdk.GizwitsException("c9d8067a53481f5f59e31be2f7b3627e");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException1);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException2 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException7 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException6);
        gizwitsException4.addSuppressed((java.lang.Throwable) gizwitsException7);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException9 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException11 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException13 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException14 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException13);
        gizwitsException11.addSuppressed((java.lang.Throwable) gizwitsException14);
        gizwitsException4.addSuppressed((java.lang.Throwable) gizwitsException11);
        gizwitsException2.addSuppressed((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException18 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException4);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException19 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com", (java.lang.Throwable) gizwitsException18);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException21 = new com.gizwits.openapi.sdk.GizwitsException("aff97160474a056e838c1f721af01edf");
        gizwitsException19.addSuppressed((java.lang.Throwable) gizwitsException21);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException24 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException26 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException27 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException26);
        gizwitsException24.addSuppressed((java.lang.Throwable) gizwitsException27);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException29 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException24);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException31 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException33 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException34 = new com.gizwits.openapi.sdk.GizwitsException((java.lang.Throwable) gizwitsException33);
        gizwitsException31.addSuppressed((java.lang.Throwable) gizwitsException34);
        gizwitsException24.addSuppressed((java.lang.Throwable) gizwitsException31);
        gizwitsException21.addSuppressed((java.lang.Throwable) gizwitsException31);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        deviceInfo0.setIsOnline(true);
        boolean boolean3 = deviceInfo0.getIsOnline();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setMac("aff97160474a056e838c1f721af01edf");
        java.lang.String str8 = deviceInfo0.getAlias();
        java.lang.String str9 = deviceInfo0.getMac();
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: 51dab0dacb3460d9be4fecd4cf802628");
        java.lang.String str12 = deviceInfo0.getAlias();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str9, "aff97160474a056e838c1f721af01edf");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.gizwits.openapi.sdk.GizwitsException: 51dab0dacb3460d9be4fecd4cf802628" + "'", str12, "com.gizwits.openapi.sdk.GizwitsException: 51dab0dacb3460d9be4fecd4cf802628");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str8 = deviceInfo0.getMac();
        deviceInfo0.setAlias("hi!");
        deviceInfo0.setMac("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str13 = deviceInfo0.getDid();
        deviceInfo0.setDid("hi!");
        java.lang.String str16 = deviceInfo0.getDid();
        boolean boolean17 = deviceInfo0.getIsOnline();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: 51dab0dacb3460d9be4fecd4cf802628");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("", "d41d8cd98f00b204e9800998ecf8427e", "74be16979710d4c4e7c6647856088456");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("d41d8cd98f00b204e9800998ecf8427e");
        java.lang.Throwable[] throwableArray4 = gizwitsException3.getSuppressed();
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException("2a27d7f39ff2023c5dc2aa7ba2acaa28", (java.lang.Throwable) gizwitsException3);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException6 = new com.gizwits.openapi.sdk.GizwitsException("acf7ef943fdeb3cbfed8dd0d8f584731", (java.lang.Throwable) gizwitsException5);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        java.lang.String str4 = deviceInfo0.getDid();
        java.lang.String str5 = deviceInfo0.getAlias();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.unbindDevice("com.gizwits.openapi.sdk.GizwitsException: ", "com.gizwits.openapi.sdk.GizwitsException: ", "com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        // The following exception was thrown during execution in test generation
        try {
            com.gizwits.openapi.sdk.DeviceInfo deviceInfo7 = com.gizwits.openapi.sdk.OpenApi.bindDevice("126de9c45f5d1d8c8eb7ba9488f410fc", "5482be16dadb92a0660def6a1a05756e", "74be16979710d4c4e7c6647856088456", "hi!", "https://api.gizwits.com", "c9d8067a53481f5f59e31be2f7b3627e", "47979e5c63c7730b9aa1aa3976607f76");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.gizwits.openapi.sdk.OpenApi.getDeviceOnlineStatus("com.gizwits.openapi.sdk.GizwitsException: ", "5482be16dadb92a0660def6a1a05756e", "com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.gizwits.openapi.sdk.DeviceInfo> deviceInfoList2 = com.gizwits.openapi.sdk.OpenApi.getBoundDevices("com.gizwits.openapi.sdk.GizwitsException: 51dab0dacb3460d9be4fecd4cf802628", "com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException3 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com");
        com.gizwits.openapi.sdk.GizwitsException gizwitsException4 = new com.gizwits.openapi.sdk.GizwitsException("https://api.gizwits.com", (java.lang.Throwable) gizwitsException3);
        com.gizwits.openapi.sdk.GizwitsException gizwitsException5 = new com.gizwits.openapi.sdk.GizwitsException("74be16979710d4c4e7c6647856088456", (java.lang.Throwable) gizwitsException3);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        com.gizwits.openapi.sdk.DeviceInfo deviceInfo0 = new com.gizwits.openapi.sdk.DeviceInfo();
        java.lang.String str1 = deviceInfo0.getMac();
        deviceInfo0.setIsOnline(true);
        deviceInfo0.setDid("hi!");
        deviceInfo0.setAlias("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str8 = deviceInfo0.getMac();
        deviceInfo0.setAlias("hi!");
        deviceInfo0.setMac("com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com");
        java.lang.String str13 = deviceInfo0.getDid();
        deviceInfo0.setDid("hi!");
        boolean boolean16 = deviceInfo0.getIsOnline();
        deviceInfo0.setMac("https://api.gizwits.com");
        deviceInfo0.setDid("33efbb43f502e2933fbfc8c508980152");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.gizwits.openapi.sdk.DeviceInfo> deviceInfoList2 = com.gizwits.openapi.sdk.OpenApi.getBoundDevices("com.gizwits.openapi.sdk.GizwitsException: com.gizwits.openapi.sdk.GizwitsException: https://api.gizwits.com", "126de9c45f5d1d8c8eb7ba9488f410fc");
            org.junit.Assert.fail("Expected exception of type com.gizwits.openapi.sdk.GizwitsException; message: Internal error");
        } catch (com.gizwits.openapi.sdk.GizwitsException e) {
            // Expected exception.
        }
    }
}

