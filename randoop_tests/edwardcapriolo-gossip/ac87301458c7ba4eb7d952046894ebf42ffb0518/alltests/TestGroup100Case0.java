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
        long long0 = javax.management.timer.Timer.ONE_MINUTE;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 60000L + "'", long0 == 60000L);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.io.File file0 = null;
        com.google.code.gossip.GossipRunner gossipRunner1 = new com.google.code.gossip.GossipRunner(file0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        long long0 = javax.management.timer.Timer.ONE_DAY;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 86400000L + "'", long0 == 86400000L);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        com.google.code.gossip.StartupSettings startupSettings0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.code.gossip.GossipService gossipService1 = new com.google.code.gossip.GossipService(startupSettings0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        org.apache.log4j.Logger logger0 = com.google.code.gossip.manager.PassiveGossipThread.LOGGER;
        org.junit.Assert.assertNotNull(logger0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.google.code.gossip.examples.GossipExample gossipExample0 = new com.google.code.gossip.examples.GossipExample();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        int int0 = java.lang.Thread.MIN_PRIORITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        long long0 = javax.management.timer.Timer.ONE_HOUR;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 3600000L + "'", long0 == 3600000L);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        int int0 = com.google.code.gossip.manager.GossipManager.MAX_PACKET_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 102400 + "'", int0 == 102400);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        com.google.code.gossip.manager.GossipManager gossipManager0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.code.gossip.manager.impl.OnlyProcessReceivedPassiveGossipThread onlyProcessReceivedPassiveGossipThread1 = new com.google.code.gossip.manager.impl.OnlyProcessReceivedPassiveGossipThread(gossipManager0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        int int0 = java.lang.Thread.NORM_PRIORITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        long long0 = javax.management.timer.Timer.ONE_SECOND;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1000L + "'", long0 == 1000L);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        java.lang.String str5 = startupSettings4.getCluster();
        // The following exception was thrown during execution in test generation
        try {
            com.google.code.gossip.GossipService gossipService6 = new com.google.code.gossip.GossipService(startupSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        com.google.code.gossip.event.GossipState gossipState0 = com.google.code.gossip.event.GossipState.DOWN;
        org.junit.Assert.assertTrue("'" + gossipState0 + "' != '" + com.google.code.gossip.event.GossipState.DOWN + "'", gossipState0.equals(com.google.code.gossip.event.GossipState.DOWN));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.code.gossip.StartupSettings startupSettings1 = com.google.code.gossip.StartupSettings.fromJSONFile(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember4 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        boolean boolean6 = remoteGossipMember4.equals((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass7 = remoteGossipMember4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.google.code.gossip.event.GossipState gossipState0 = com.google.code.gossip.event.GossipState.UP;
        org.junit.Assert.assertTrue("'" + gossipState0 + "' != '" + com.google.code.gossip.event.GossipState.UP + "'", gossipState0.equals(com.google.code.gossip.event.GossipState.UP));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.google.code.gossip.model.GossipMember gossipMember5 = new com.google.code.gossip.model.GossipMember("hi!", "hi!", (java.lang.Integer) 102400, "", (java.lang.Long) 1000L);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        javax.management.NotificationListener notificationListener1 = null;
        com.google.code.gossip.LocalGossipMember localGossipMember2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer3 = new com.google.code.gossip.GossipTimeoutTimer((long) (byte) 0, notificationListener1, localGossipMember2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Listener can't be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        int int0 = java.lang.Thread.MAX_PRIORITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember4 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        boolean boolean6 = remoteGossipMember4.equals((java.lang.Object) (byte) 1);
        boolean boolean8 = remoteGossipMember4.equals((java.lang.Object) 86400000L);
        com.google.code.gossip.StartupSettings startupSettings13 = new com.google.code.gossip.StartupSettings("hi!", 0, (int) ' ', "hi!");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember18 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        java.lang.String str19 = remoteGossipMember18.getAddress();
        java.lang.String str20 = remoteGossipMember18.getAddress();
        startupSettings13.addGossipMember((com.google.code.gossip.GossipMember) remoteGossipMember18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = remoteGossipMember4.equals((java.lang.Object) remoteGossipMember18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.code.gossip.RemoteGossipMember cannot be cast to com.google.code.gossip.LocalGossipMember");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ":0" + "'", str19, ":0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ":0" + "'", str20, ":0");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings27 = null;
        com.google.code.gossip.StartupSettings startupSettings29 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings27, "hi!");
        startupSettings29.setPort(10);
        startupSettings29.setPort((int) 'a');
        java.lang.String str34 = startupSettings29.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList35 = startupSettings29.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings36 = new com.google.code.gossip.GossipSettings();
        gossipSettings36.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener39 = null;
        com.google.code.gossip.GossipService gossipService40 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList35, gossipSettings36, gossipListener39);
        com.google.code.gossip.manager.GossipManager gossipManager41 = gossipService40.get_gossipManager();
        gossipService19.set_gossipManager(gossipManager41);
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList43 = gossipManager41.getDeadList();
        com.google.code.gossip.LocalGossipMember localGossipMember44 = null;
        // The following exception was thrown during execution in test generation
        try {
            gossipManager41.createOrRevivieMember(localGossipMember44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(gossipMemberList35);
        org.junit.Assert.assertNotNull(gossipManager41);
        org.junit.Assert.assertNotNull(localGossipMemberList43);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        startupSettings4.setPort(10);
        startupSettings4.setPort((int) 'a');
        java.lang.String str9 = startupSettings4.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList10 = startupSettings4.getGossipMembers();
        // The following exception was thrown during execution in test generation
        try {
            com.google.code.gossip.GossipService gossipService11 = new com.google.code.gossip.GossipService(startupSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(gossipMemberList10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        startupSettings4.setPort(10);
        startupSettings4.setPort((int) 'a');
        java.lang.String str9 = startupSettings4.getId();
        startupSettings4.setId("");
        java.lang.String str12 = startupSettings4.getId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("hi!", 102400, (int) '4', "hi!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        gossipMember0.setCluster(":0");
        gossipMember0.setHost("");
        gossipMember0.setHost("Member [address=:0, id=hi!, heartbeat=1698797232207]");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        startupSettings4.setPort(10);
        startupSettings4.setPort((int) 'a');
        java.lang.Class<?> wildcardClass9 = startupSettings4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember4 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        boolean boolean6 = remoteGossipMember4.equals((java.lang.Object) (byte) 1);
        boolean boolean8 = remoteGossipMember4.equals((java.lang.Object) 86400000L);
        remoteGossipMember4.setHeartbeat((long) (short) 10);
        java.lang.Class<?> wildcardClass11 = remoteGossipMember4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.Long long1 = gossipMember0.getHeartbeat();
        java.lang.Long long2 = gossipMember0.getHeartbeat();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember4 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        boolean boolean6 = remoteGossipMember4.equals((java.lang.Object) (byte) 1);
        boolean boolean8 = remoteGossipMember4.equals((java.lang.Object) 86400000L);
        long long9 = remoteGossipMember4.getHeartbeat();
        java.lang.String str10 = remoteGossipMember4.getId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698797233244L + "'", long9 == 1698797233244L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember5 = new com.google.code.gossip.RemoteGossipMember("hi!", "", 5, ":0", (long) 102400);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        java.lang.String str5 = startupSettings4.getCluster();
        startupSettings4.setId("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        gossipManager20.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            com.google.code.gossip.manager.impl.OnlyProcessReceivedPassiveGossipThread onlyProcessReceivedPassiveGossipThread22 = new com.google.code.gossip.manager.impl.OnlyProcessReceivedPassiveGossipThread(gossipManager20);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.net.BindException: Can't assign requested address (Bind failed)");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("hi!", 0, (int) ' ', "hi!");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember9 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        boolean boolean11 = remoteGossipMember9.equals((java.lang.Object) (byte) 1);
        startupSettings4.addGossipMember((com.google.code.gossip.GossipMember) remoteGossipMember9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.google.code.gossip.GossipSettings gossipSettings11 = null;
        com.google.code.gossip.StartupSettings startupSettings13 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings11, "hi!");
        startupSettings13.setPort(10);
        startupSettings13.setPort((int) 'a');
        java.lang.String str18 = startupSettings13.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList19 = startupSettings13.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings20 = new com.google.code.gossip.GossipSettings();
        gossipSettings20.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener23 = null;
        com.google.code.gossip.GossipService gossipService24 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList19, gossipSettings20, gossipListener23);
        com.google.code.gossip.manager.GossipManager gossipManager25 = gossipService24.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings32 = null;
        com.google.code.gossip.StartupSettings startupSettings34 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings32, "hi!");
        startupSettings34.setPort(10);
        startupSettings34.setPort((int) 'a');
        java.lang.String str39 = startupSettings34.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList40 = startupSettings34.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings41 = new com.google.code.gossip.GossipSettings();
        gossipSettings41.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener44 = null;
        com.google.code.gossip.GossipService gossipService45 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList40, gossipSettings41, gossipListener44);
        com.google.code.gossip.manager.GossipManager gossipManager46 = gossipService45.get_gossipManager();
        gossipService24.set_gossipManager(gossipManager46);
        gossipManager46.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember50 = new com.google.code.gossip.LocalGossipMember("", "hi!", (int) '4', ":0", (long) (short) 0, (javax.management.NotificationListener) gossipManager46, (-1));
        java.lang.Class<?> wildcardClass51 = localGossipMember50.getClass();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(gossipMemberList19);
        org.junit.Assert.assertNotNull(gossipManager25);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(gossipMemberList40);
        org.junit.Assert.assertNotNull(gossipManager46);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember4 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        boolean boolean6 = remoteGossipMember4.equals((java.lang.Object) (byte) 1);
        boolean boolean8 = remoteGossipMember4.equals((java.lang.Object) 86400000L);
        remoteGossipMember4.setHeartbeat((long) (short) 10);
        remoteGossipMember4.setId(":0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings21 = gossipManager20.getSettings();
        // The following exception was thrown during execution in test generation
        try {
            com.google.code.gossip.manager.impl.OnlyProcessReceivedPassiveGossipThread onlyProcessReceivedPassiveGossipThread22 = new com.google.code.gossip.manager.impl.OnlyProcessReceivedPassiveGossipThread(gossipManager20);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.net.BindException: Can't assign requested address (Bind failed)");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertNotNull(gossipSettings21);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember4 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        java.lang.String str5 = remoteGossipMember4.getAddress();
        java.lang.String str6 = remoteGossipMember4.getAddress();
        remoteGossipMember4.setId("Member [address=:0, id=hi!, heartbeat=1698797232207]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":0" + "'", str5, ":0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":0" + "'", str6, ":0");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        startupSettings4.setPort(10);
        com.google.code.gossip.GossipSettings gossipSettings7 = startupSettings4.getGossipSettings();
        org.junit.Assert.assertNull(gossipSettings7);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        gossipManager20.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember22 = gossipManager20.getMyself();
        localGossipMember22.disableTimer();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertNotNull(localGossipMember22);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings27 = null;
        com.google.code.gossip.StartupSettings startupSettings29 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings27, "hi!");
        startupSettings29.setPort(10);
        startupSettings29.setPort((int) 'a');
        java.lang.String str34 = startupSettings29.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList35 = startupSettings29.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings36 = new com.google.code.gossip.GossipSettings();
        gossipSettings36.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener39 = null;
        com.google.code.gossip.GossipService gossipService40 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList35, gossipSettings36, gossipListener39);
        com.google.code.gossip.manager.GossipManager gossipManager41 = gossipService40.get_gossipManager();
        gossipService19.set_gossipManager(gossipManager41);
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList43 = gossipManager41.getDeadList();
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList44 = gossipManager41.getMemberList();
        javax.management.Notification notification45 = null;
        org.apache.log4j.Logger logger46 = com.google.code.gossip.manager.GossipManager.LOGGER;
        // The following exception was thrown during execution in test generation
        try {
            gossipManager41.handleNotification(notification45, (java.lang.Object) logger46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(gossipMemberList35);
        org.junit.Assert.assertNotNull(gossipManager41);
        org.junit.Assert.assertNotNull(localGossipMemberList43);
        org.junit.Assert.assertNotNull(localGossipMemberList44);
        org.junit.Assert.assertNotNull(logger46);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember4 = new com.google.code.gossip.RemoteGossipMember(":0", "Member [address=:0, id=hi!, heartbeat=1698797232207]", 100, "Member [address=:0, id=hi!, heartbeat=1698797232207]");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings27 = null;
        com.google.code.gossip.StartupSettings startupSettings29 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings27, "hi!");
        startupSettings29.setPort(10);
        startupSettings29.setPort((int) 'a');
        java.lang.String str34 = startupSettings29.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList35 = startupSettings29.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings36 = new com.google.code.gossip.GossipSettings();
        gossipSettings36.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener39 = null;
        com.google.code.gossip.GossipService gossipService40 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList35, gossipSettings36, gossipListener39);
        com.google.code.gossip.manager.GossipManager gossipManager41 = gossipService40.get_gossipManager();
        gossipService19.set_gossipManager(gossipManager41);
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList43 = gossipManager41.getDeadList();
        // The following exception was thrown during execution in test generation
        try {
            com.google.code.gossip.manager.impl.OnlyProcessReceivedPassiveGossipThread onlyProcessReceivedPassiveGossipThread44 = new com.google.code.gossip.manager.impl.OnlyProcessReceivedPassiveGossipThread(gossipManager41);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.net.BindException: Can't assign requested address (Bind failed)");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(gossipMemberList35);
        org.junit.Assert.assertNotNull(gossipManager41);
        org.junit.Assert.assertNotNull(localGossipMemberList43);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        gossipService19.start();
        gossipService19.shutdown();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.google.code.gossip.GossipSettings gossipSettings2 = new com.google.code.gossip.GossipSettings((int) (short) 100, (-1));
        int int3 = gossipSettings2.getCleanupInterval();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        com.google.code.gossip.GossipSettings gossipSettings0 = new com.google.code.gossip.GossipSettings();
        int int1 = gossipSettings0.getGossipInterval();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        gossipManager20.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings22 = gossipManager20.getSettings();
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList23 = gossipManager20.getDeadList();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertNotNull(gossipSettings22);
        org.junit.Assert.assertNotNull(localGossipMemberList23);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.google.code.gossip.GossipSettings gossipSettings4 = new com.google.code.gossip.GossipSettings();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList5 = null;
        com.google.code.gossip.event.GossipListener gossipListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.code.gossip.manager.random.RandomGossipManager randomGossipManager7 = new com.google.code.gossip.manager.random.RandomGossipManager("Member [address=:0, id=hi!, heartbeat=1698797232207]", ":0", (int) (byte) -1, ":0", gossipSettings4, gossipMemberList5, gossipListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        startupSettings4.setPort(10);
        startupSettings4.setPort((int) 'a');
        com.google.code.gossip.StartupSettings startupSettings13 = new com.google.code.gossip.StartupSettings("hi!", 0, (int) ' ', "hi!");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember18 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        java.lang.String str19 = remoteGossipMember18.getAddress();
        java.lang.String str20 = remoteGossipMember18.getAddress();
        startupSettings13.addGossipMember((com.google.code.gossip.GossipMember) remoteGossipMember18);
        startupSettings4.addGossipMember((com.google.code.gossip.GossipMember) remoteGossipMember18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ":0" + "'", str19, ":0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ":0" + "'", str20, ":0");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        startupSettings4.setPort(10);
        startupSettings4.setPort((int) 'a');
        startupSettings4.setId(":0");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.google.code.gossip.model.ActiveGossipMessage activeGossipMessage0 = new com.google.code.gossip.model.ActiveGossipMessage();
        com.google.code.gossip.model.GossipMember gossipMember1 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str2 = gossipMember1.getHost();
        com.google.code.gossip.model.GossipMember gossipMember3 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str4 = gossipMember3.getHost();
        gossipMember3.setHeartbeat((java.lang.Long) 60000L);
        com.google.code.gossip.model.GossipMember gossipMember7 = new com.google.code.gossip.model.GossipMember();
        com.google.code.gossip.model.GossipMember[] gossipMemberArray8 = new com.google.code.gossip.model.GossipMember[] { gossipMember1, gossipMember3, gossipMember7 };
        java.util.ArrayList<com.google.code.gossip.model.GossipMember> gossipMemberList9 = new java.util.ArrayList<com.google.code.gossip.model.GossipMember>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.code.gossip.model.GossipMember>) gossipMemberList9, gossipMemberArray8);
        activeGossipMessage0.setMembers((java.util.List<com.google.code.gossip.model.GossipMember>) gossipMemberList9);
        com.google.code.gossip.model.ActiveGossipMessage activeGossipMessage12 = new com.google.code.gossip.model.ActiveGossipMessage();
        com.google.code.gossip.model.GossipMember gossipMember13 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str14 = gossipMember13.getHost();
        com.google.code.gossip.model.GossipMember gossipMember15 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str16 = gossipMember15.getHost();
        gossipMember15.setHeartbeat((java.lang.Long) 60000L);
        com.google.code.gossip.model.GossipMember gossipMember19 = new com.google.code.gossip.model.GossipMember();
        com.google.code.gossip.model.GossipMember[] gossipMemberArray20 = new com.google.code.gossip.model.GossipMember[] { gossipMember13, gossipMember15, gossipMember19 };
        java.util.ArrayList<com.google.code.gossip.model.GossipMember> gossipMemberList21 = new java.util.ArrayList<com.google.code.gossip.model.GossipMember>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.google.code.gossip.model.GossipMember>) gossipMemberList21, gossipMemberArray20);
        activeGossipMessage12.setMembers((java.util.List<com.google.code.gossip.model.GossipMember>) gossipMemberList21);
        activeGossipMessage0.setMembers((java.util.List<com.google.code.gossip.model.GossipMember>) gossipMemberList21);
        com.google.code.gossip.model.ActiveGossipMessage activeGossipMessage25 = new com.google.code.gossip.model.ActiveGossipMessage();
        com.google.code.gossip.model.GossipMember gossipMember26 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str27 = gossipMember26.getHost();
        com.google.code.gossip.model.GossipMember gossipMember28 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str29 = gossipMember28.getHost();
        gossipMember28.setHeartbeat((java.lang.Long) 60000L);
        com.google.code.gossip.model.GossipMember gossipMember32 = new com.google.code.gossip.model.GossipMember();
        com.google.code.gossip.model.GossipMember[] gossipMemberArray33 = new com.google.code.gossip.model.GossipMember[] { gossipMember26, gossipMember28, gossipMember32 };
        java.util.ArrayList<com.google.code.gossip.model.GossipMember> gossipMemberList34 = new java.util.ArrayList<com.google.code.gossip.model.GossipMember>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.code.gossip.model.GossipMember>) gossipMemberList34, gossipMemberArray33);
        activeGossipMessage25.setMembers((java.util.List<com.google.code.gossip.model.GossipMember>) gossipMemberList34);
        com.google.code.gossip.model.ActiveGossipMessage activeGossipMessage37 = new com.google.code.gossip.model.ActiveGossipMessage();
        com.google.code.gossip.model.GossipMember gossipMember38 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str39 = gossipMember38.getHost();
        com.google.code.gossip.model.GossipMember gossipMember40 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str41 = gossipMember40.getHost();
        gossipMember40.setHeartbeat((java.lang.Long) 60000L);
        com.google.code.gossip.model.GossipMember gossipMember44 = new com.google.code.gossip.model.GossipMember();
        com.google.code.gossip.model.GossipMember[] gossipMemberArray45 = new com.google.code.gossip.model.GossipMember[] { gossipMember38, gossipMember40, gossipMember44 };
        java.util.ArrayList<com.google.code.gossip.model.GossipMember> gossipMemberList46 = new java.util.ArrayList<com.google.code.gossip.model.GossipMember>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.google.code.gossip.model.GossipMember>) gossipMemberList46, gossipMemberArray45);
        activeGossipMessage37.setMembers((java.util.List<com.google.code.gossip.model.GossipMember>) gossipMemberList46);
        activeGossipMessage25.setMembers((java.util.List<com.google.code.gossip.model.GossipMember>) gossipMemberList46);
        activeGossipMessage0.setMembers((java.util.List<com.google.code.gossip.model.GossipMember>) gossipMemberList46);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(gossipMemberArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(gossipMemberArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(gossipMemberArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(gossipMemberArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("hi!", 0, (int) ' ', "hi!");
        java.lang.String str5 = startupSettings4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.google.code.gossip.model.GossipMember gossipMember5 = new com.google.code.gossip.model.GossipMember("", ":0", (java.lang.Integer) 0, "", (java.lang.Long) 1698797232036L);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        com.google.code.gossip.GossipSettings gossipSettings8 = null;
        com.google.code.gossip.StartupSettings startupSettings10 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings8, "hi!");
        startupSettings10.setPort(10);
        startupSettings10.setPort((int) 'a');
        java.lang.String str15 = startupSettings10.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList16 = startupSettings10.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings17 = new com.google.code.gossip.GossipSettings();
        gossipSettings17.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener20 = null;
        com.google.code.gossip.GossipService gossipService21 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList16, gossipSettings17, gossipListener20);
        com.google.code.gossip.manager.GossipManager gossipManager22 = gossipService21.get_gossipManager();
        gossipManager22.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings24 = gossipManager22.getSettings();
        gossipSettings24.setCleanupInterval(10);
        com.google.code.gossip.StartupSettings startupSettings28 = new com.google.code.gossip.StartupSettings(":0", (int) (short) 100, gossipSettings24, "hi!");
        int int29 = gossipSettings24.getGossipInterval();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(gossipMemberList16);
        org.junit.Assert.assertNotNull(gossipManager22);
        org.junit.Assert.assertNotNull(gossipSettings24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1000 + "'", int29 == 1000);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.google.code.gossip.model.GossipMember gossipMember5 = new com.google.code.gossip.model.GossipMember(":0", "Member [address=:0, id=hi!, heartbeat=1698797232207]", (java.lang.Integer) 10, "", (java.lang.Long) 100L);
        java.lang.Long long6 = gossipMember5.getHeartbeat();
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        java.lang.Integer int2 = gossipMember0.getPort();
        gossipMember0.setPort((java.lang.Integer) 1);
        gossipMember0.setPort((java.lang.Integer) 1000);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.google.code.gossip.GossipSettings gossipSettings11 = null;
        com.google.code.gossip.StartupSettings startupSettings13 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings11, "hi!");
        startupSettings13.setPort(10);
        startupSettings13.setPort((int) 'a');
        java.lang.String str18 = startupSettings13.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList19 = startupSettings13.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings20 = new com.google.code.gossip.GossipSettings();
        gossipSettings20.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener23 = null;
        com.google.code.gossip.GossipService gossipService24 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList19, gossipSettings20, gossipListener23);
        com.google.code.gossip.manager.GossipManager gossipManager25 = gossipService24.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings32 = null;
        com.google.code.gossip.StartupSettings startupSettings34 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings32, "hi!");
        startupSettings34.setPort(10);
        startupSettings34.setPort((int) 'a');
        java.lang.String str39 = startupSettings34.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList40 = startupSettings34.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings41 = new com.google.code.gossip.GossipSettings();
        gossipSettings41.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener44 = null;
        com.google.code.gossip.GossipService gossipService45 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList40, gossipSettings41, gossipListener44);
        com.google.code.gossip.manager.GossipManager gossipManager46 = gossipService45.get_gossipManager();
        gossipService24.set_gossipManager(gossipManager46);
        gossipManager46.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember50 = new com.google.code.gossip.LocalGossipMember("", "hi!", (int) '4', ":0", (long) (short) 0, (javax.management.NotificationListener) gossipManager46, (-1));
        com.google.code.gossip.LocalGossipMember localGossipMember51 = gossipManager46.getMyself();
        com.google.code.gossip.LocalGossipMember localGossipMember52 = gossipManager46.getMyself();
        localGossipMember52.startTimeoutTimer();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(gossipMemberList19);
        org.junit.Assert.assertNotNull(gossipManager25);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(gossipMemberList40);
        org.junit.Assert.assertNotNull(gossipManager46);
        org.junit.Assert.assertNotNull(localGossipMember51);
        org.junit.Assert.assertNotNull(localGossipMember52);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        java.lang.Integer int2 = gossipMember0.getPort();
        gossipMember0.setPort((java.lang.Integer) 1);
        java.lang.Long long5 = gossipMember0.getHeartbeat();
        gossipMember0.setCluster("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        com.google.code.gossip.manager.GossipManager gossipManager0 = null;
        com.google.code.gossip.manager.random.RandomActiveGossipThread randomActiveGossipThread1 = new com.google.code.gossip.manager.random.RandomActiveGossipThread(gossipManager0);
        randomActiveGossipThread1.shutdown();
        randomActiveGossipThread1.run();
        randomActiveGossipThread1.run();
        randomActiveGossipThread1.run();
        randomActiveGossipThread1.shutdown();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember4 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        boolean boolean6 = remoteGossipMember4.equals((java.lang.Object) (byte) 1);
        java.lang.String str7 = remoteGossipMember4.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Member [address=:0, id=hi!, heartbeat=1698797234652]" + "'", str7, "Member [address=:0, id=hi!, heartbeat=1698797234652]");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings27 = null;
        com.google.code.gossip.StartupSettings startupSettings29 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings27, "hi!");
        startupSettings29.setPort(10);
        startupSettings29.setPort((int) 'a');
        java.lang.String str34 = startupSettings29.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList35 = startupSettings29.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings36 = new com.google.code.gossip.GossipSettings();
        gossipSettings36.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener39 = null;
        com.google.code.gossip.GossipService gossipService40 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList35, gossipSettings36, gossipListener39);
        com.google.code.gossip.manager.GossipManager gossipManager41 = gossipService40.get_gossipManager();
        gossipService19.set_gossipManager(gossipManager41);
        gossipManager41.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            com.google.code.gossip.manager.impl.OnlyProcessReceivedPassiveGossipThread onlyProcessReceivedPassiveGossipThread44 = new com.google.code.gossip.manager.impl.OnlyProcessReceivedPassiveGossipThread(gossipManager41);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.net.BindException: Can't assign requested address (Bind failed)");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(gossipMemberList35);
        org.junit.Assert.assertNotNull(gossipManager41);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.google.code.gossip.GossipSettings gossipSettings2 = new com.google.code.gossip.GossipSettings((int) (short) 100, (-1));
        gossipSettings2.setCleanupInterval((int) (byte) -1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember5 = new com.google.code.gossip.RemoteGossipMember("Member [address=:0, id=hi!, heartbeat=1698797234652]", "", (int) (short) 100, ":0", 1698797232207L);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember4 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        java.lang.String str5 = remoteGossipMember4.getAddress();
        java.lang.String str6 = remoteGossipMember4.getAddress();
        long long7 = remoteGossipMember4.getHeartbeat();
        remoteGossipMember4.setHeartbeat(1698797232207L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":0" + "'", str5, ":0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":0" + "'", str6, ":0");
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698797234974L + "'", long7 == 1698797234974L);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.google.code.gossip.model.ActiveGossipMessage activeGossipMessage0 = new com.google.code.gossip.model.ActiveGossipMessage();
        com.google.code.gossip.model.GossipMember gossipMember1 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str2 = gossipMember1.getHost();
        com.google.code.gossip.model.GossipMember gossipMember3 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str4 = gossipMember3.getHost();
        gossipMember3.setHeartbeat((java.lang.Long) 60000L);
        com.google.code.gossip.model.GossipMember gossipMember7 = new com.google.code.gossip.model.GossipMember();
        com.google.code.gossip.model.GossipMember[] gossipMemberArray8 = new com.google.code.gossip.model.GossipMember[] { gossipMember1, gossipMember3, gossipMember7 };
        java.util.ArrayList<com.google.code.gossip.model.GossipMember> gossipMemberList9 = new java.util.ArrayList<com.google.code.gossip.model.GossipMember>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.code.gossip.model.GossipMember>) gossipMemberList9, gossipMemberArray8);
        activeGossipMessage0.setMembers((java.util.List<com.google.code.gossip.model.GossipMember>) gossipMemberList9);
        com.google.code.gossip.model.ActiveGossipMessage activeGossipMessage12 = new com.google.code.gossip.model.ActiveGossipMessage();
        com.google.code.gossip.model.GossipMember gossipMember13 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str14 = gossipMember13.getHost();
        com.google.code.gossip.model.GossipMember[] gossipMemberArray15 = new com.google.code.gossip.model.GossipMember[] { gossipMember13 };
        java.util.ArrayList<com.google.code.gossip.model.GossipMember> gossipMemberList16 = new java.util.ArrayList<com.google.code.gossip.model.GossipMember>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.code.gossip.model.GossipMember>) gossipMemberList16, gossipMemberArray15);
        activeGossipMessage12.setMembers((java.util.List<com.google.code.gossip.model.GossipMember>) gossipMemberList16);
        java.util.List<com.google.code.gossip.model.GossipMember> gossipMemberList19 = activeGossipMessage12.getMembers();
        activeGossipMessage0.setMembers(gossipMemberList19);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(gossipMemberArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(gossipMemberArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(gossipMemberList19);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        startupSettings4.setPort(10);
        startupSettings4.setId("");
        java.lang.String str9 = startupSettings4.getId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings27 = null;
        com.google.code.gossip.StartupSettings startupSettings29 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings27, "hi!");
        startupSettings29.setPort(10);
        startupSettings29.setPort((int) 'a');
        java.lang.String str34 = startupSettings29.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList35 = startupSettings29.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings36 = new com.google.code.gossip.GossipSettings();
        gossipSettings36.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener39 = null;
        com.google.code.gossip.GossipService gossipService40 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList35, gossipSettings36, gossipListener39);
        com.google.code.gossip.manager.GossipManager gossipManager41 = gossipService40.get_gossipManager();
        gossipService19.set_gossipManager(gossipManager41);
        com.google.code.gossip.GossipSettings gossipSettings49 = null;
        com.google.code.gossip.StartupSettings startupSettings51 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings49, "hi!");
        startupSettings51.setPort(10);
        startupSettings51.setPort((int) 'a');
        java.lang.String str56 = startupSettings51.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList57 = startupSettings51.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings58 = new com.google.code.gossip.GossipSettings();
        gossipSettings58.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener61 = null;
        com.google.code.gossip.GossipService gossipService62 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList57, gossipSettings58, gossipListener61);
        com.google.code.gossip.manager.GossipManager gossipManager63 = gossipService62.get_gossipManager();
        gossipService19.set_gossipManager(gossipManager63);
        com.google.code.gossip.LocalGossipMember localGossipMember65 = gossipManager63.getMyself();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(gossipMemberList35);
        org.junit.Assert.assertNotNull(gossipManager41);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(gossipMemberList57);
        org.junit.Assert.assertNotNull(gossipManager63);
        org.junit.Assert.assertNotNull(localGossipMember65);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        com.google.code.gossip.GossipSettings gossipSettings11 = null;
        com.google.code.gossip.StartupSettings startupSettings13 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings11, "hi!");
        startupSettings13.setPort(10);
        startupSettings13.setPort((int) 'a');
        java.lang.String str18 = startupSettings13.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList19 = startupSettings13.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings20 = new com.google.code.gossip.GossipSettings();
        gossipSettings20.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener23 = null;
        com.google.code.gossip.GossipService gossipService24 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList19, gossipSettings20, gossipListener23);
        com.google.code.gossip.manager.GossipManager gossipManager25 = gossipService24.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings32 = null;
        com.google.code.gossip.StartupSettings startupSettings34 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings32, "hi!");
        startupSettings34.setPort(10);
        startupSettings34.setPort((int) 'a');
        java.lang.String str39 = startupSettings34.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList40 = startupSettings34.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings41 = new com.google.code.gossip.GossipSettings();
        gossipSettings41.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener44 = null;
        com.google.code.gossip.GossipService gossipService45 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList40, gossipSettings41, gossipListener44);
        com.google.code.gossip.manager.GossipManager gossipManager46 = gossipService45.get_gossipManager();
        gossipService24.set_gossipManager(gossipManager46);
        gossipManager46.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember50 = new com.google.code.gossip.LocalGossipMember("", "hi!", (int) '4', ":0", (long) (short) 0, (javax.management.NotificationListener) gossipManager46, (-1));
        com.google.code.gossip.LocalGossipMember localGossipMember51 = gossipManager46.getMyself();
        // The following exception was thrown during execution in test generation
        try {
            gossipManager46.run();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.reflect.InvocationTargetException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(gossipMemberList19);
        org.junit.Assert.assertNotNull(gossipManager25);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(gossipMemberList40);
        org.junit.Assert.assertNotNull(gossipManager46);
        org.junit.Assert.assertNotNull(localGossipMember51);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.google.code.gossip.GossipSettings gossipSettings8 = null;
        com.google.code.gossip.StartupSettings startupSettings10 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings8, "hi!");
        startupSettings10.setPort(10);
        startupSettings10.setPort((int) 'a');
        java.lang.String str15 = startupSettings10.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList16 = startupSettings10.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings17 = new com.google.code.gossip.GossipSettings();
        gossipSettings17.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener20 = null;
        com.google.code.gossip.GossipService gossipService21 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList16, gossipSettings17, gossipListener20);
        com.google.code.gossip.manager.GossipManager gossipManager22 = gossipService21.get_gossipManager();
        gossipManager22.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings24 = gossipManager22.getSettings();
        gossipSettings24.setCleanupInterval(10);
        com.google.code.gossip.StartupSettings startupSettings28 = new com.google.code.gossip.StartupSettings(":0", (int) (short) 100, gossipSettings24, "hi!");
        com.google.code.gossip.GossipSettings gossipSettings35 = null;
        com.google.code.gossip.StartupSettings startupSettings37 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings35, "hi!");
        startupSettings37.setPort(10);
        startupSettings37.setPort((int) 'a');
        java.lang.String str42 = startupSettings37.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList43 = startupSettings37.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings44 = new com.google.code.gossip.GossipSettings();
        gossipSettings44.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener47 = null;
        com.google.code.gossip.GossipService gossipService48 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList43, gossipSettings44, gossipListener47);
        com.google.code.gossip.manager.GossipManager gossipManager49 = gossipService48.get_gossipManager();
        gossipManager49.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings57 = null;
        com.google.code.gossip.StartupSettings startupSettings59 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings57, "hi!");
        startupSettings59.setPort(10);
        startupSettings59.setPort((int) 'a');
        java.lang.String str64 = startupSettings59.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList65 = startupSettings59.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings66 = new com.google.code.gossip.GossipSettings();
        gossipSettings66.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener69 = null;
        com.google.code.gossip.GossipService gossipService70 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList65, gossipSettings66, gossipListener69);
        com.google.code.gossip.manager.GossipManager gossipManager71 = gossipService70.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings72 = gossipManager71.getSettings();
        com.google.code.gossip.GossipSettings gossipSettings79 = null;
        com.google.code.gossip.StartupSettings startupSettings81 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings79, "hi!");
        startupSettings81.setPort(10);
        startupSettings81.setPort((int) 'a');
        java.lang.String str86 = startupSettings81.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList87 = startupSettings81.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings88 = new com.google.code.gossip.GossipSettings();
        gossipSettings88.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener91 = null;
        com.google.code.gossip.GossipService gossipService92 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList87, gossipSettings88, gossipListener91);
        com.google.code.gossip.manager.GossipManager gossipManager93 = gossipService92.get_gossipManager();
        gossipManager93.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember95 = gossipManager93.getMyself();
        gossipManager71.revivieMember(localGossipMember95);
        gossipManager49.revivieMember(localGossipMember95);
        startupSettings28.addGossipMember((com.google.code.gossip.GossipMember) localGossipMember95);
        localGossipMember95.disableTimer();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(gossipMemberList16);
        org.junit.Assert.assertNotNull(gossipManager22);
        org.junit.Assert.assertNotNull(gossipSettings24);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(gossipMemberList43);
        org.junit.Assert.assertNotNull(gossipManager49);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(gossipMemberList65);
        org.junit.Assert.assertNotNull(gossipManager71);
        org.junit.Assert.assertNotNull(gossipSettings72);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(gossipMemberList87);
        org.junit.Assert.assertNotNull(gossipManager93);
        org.junit.Assert.assertNotNull(localGossipMember95);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        java.lang.String str2 = gossipMember0.getHost();
        gossipMember0.setHeartbeat((java.lang.Long) 100L);
        gossipMember0.setPort((java.lang.Integer) 1);
        gossipMember0.setHeartbeat((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember4 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        boolean boolean6 = remoteGossipMember4.equals((java.lang.Object) (byte) 1);
        int int7 = remoteGossipMember4.getPort();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        com.google.code.gossip.GossipSettings gossipSettings8 = null;
        com.google.code.gossip.StartupSettings startupSettings10 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings8, "hi!");
        startupSettings10.setPort(10);
        startupSettings10.setPort((int) 'a');
        java.lang.String str15 = startupSettings10.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList16 = startupSettings10.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings17 = new com.google.code.gossip.GossipSettings();
        gossipSettings17.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener20 = null;
        com.google.code.gossip.GossipService gossipService21 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList16, gossipSettings17, gossipListener20);
        com.google.code.gossip.manager.GossipManager gossipManager22 = gossipService21.get_gossipManager();
        gossipManager22.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings24 = gossipManager22.getSettings();
        gossipSettings24.setCleanupInterval(10);
        com.google.code.gossip.StartupSettings startupSettings28 = new com.google.code.gossip.StartupSettings("hi!", (int) (short) -1, gossipSettings24, ":0");
        com.google.code.gossip.GossipService gossipService29 = new com.google.code.gossip.GossipService(startupSettings28);
        gossipService29.shutdown();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(gossipMemberList16);
        org.junit.Assert.assertNotNull(gossipManager22);
        org.junit.Assert.assertNotNull(gossipSettings24);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList5 = startupSettings4.getGossipMembers();
        int int6 = startupSettings4.getPort();
        org.junit.Assert.assertNotNull(gossipMemberList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings21 = gossipManager20.getSettings();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipManager42.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember44 = gossipManager42.getMyself();
        gossipManager20.revivieMember(localGossipMember44);
        localGossipMember44.startTimeoutTimer();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertNotNull(gossipSettings21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertNotNull(localGossipMember44);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        org.apache.log4j.Logger logger0 = com.google.code.gossip.GossipService.LOGGER;
        org.junit.Assert.assertNotNull(logger0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        java.lang.Integer int2 = gossipMember0.getPort();
        gossipMember0.setPort((java.lang.Integer) 1);
        java.lang.Long long5 = gossipMember0.getHeartbeat();
        gossipMember0.setId("Member [address=:0, id=hi!, heartbeat=1698797232207]");
        gossipMember0.setCluster("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember4 = new com.google.code.gossip.RemoteGossipMember("Member [address=:0, id=hi!, heartbeat=1698797232207]", "hi!", (int) (short) 100, "hi!");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.google.code.gossip.GossipSettings gossipSettings2 = new com.google.code.gossip.GossipSettings();
        gossipSettings2.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.StartupSettings startupSettings6 = new com.google.code.gossip.StartupSettings("", (int) (short) 10, gossipSettings2, ":0");
        java.lang.String str7 = startupSettings6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        java.lang.String str5 = startupSettings4.getCluster();
        java.lang.String str6 = startupSettings4.getId();
        // The following exception was thrown during execution in test generation
        try {
            com.google.code.gossip.GossipService gossipService7 = new com.google.code.gossip.GossipService(startupSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember4 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        java.lang.String str5 = remoteGossipMember4.getAddress();
        remoteGossipMember4.setId("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":0" + "'", str5, ":0");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        gossipMember0.setCluster("hi!");
        java.lang.String str4 = gossipMember0.getCluster();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.google.code.gossip.model.GossipMember gossipMember5 = new com.google.code.gossip.model.GossipMember("hi!", ":0", (java.lang.Integer) 1, "hi!", (java.lang.Long) 1698797232207L);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        java.lang.Integer int2 = gossipMember0.getPort();
        gossipMember0.setPort((java.lang.Integer) 1);
        gossipMember0.setId("hi!");
        gossipMember0.setHost("");
        gossipMember0.setPort((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int2);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.google.code.gossip.GossipSettings gossipSettings8 = null;
        com.google.code.gossip.StartupSettings startupSettings10 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings8, "hi!");
        startupSettings10.setPort(10);
        startupSettings10.setPort((int) 'a');
        java.lang.String str15 = startupSettings10.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList16 = startupSettings10.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings17 = new com.google.code.gossip.GossipSettings();
        gossipSettings17.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener20 = null;
        com.google.code.gossip.GossipService gossipService21 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList16, gossipSettings17, gossipListener20);
        com.google.code.gossip.manager.GossipManager gossipManager22 = gossipService21.get_gossipManager();
        gossipManager22.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings24 = gossipManager22.getSettings();
        gossipSettings24.setCleanupInterval(10);
        com.google.code.gossip.StartupSettings startupSettings28 = new com.google.code.gossip.StartupSettings(":0", (int) (short) 100, gossipSettings24, "hi!");
        com.google.code.gossip.GossipSettings gossipSettings35 = null;
        com.google.code.gossip.StartupSettings startupSettings37 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings35, "hi!");
        startupSettings37.setPort(10);
        startupSettings37.setPort((int) 'a');
        java.lang.String str42 = startupSettings37.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList43 = startupSettings37.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings44 = new com.google.code.gossip.GossipSettings();
        gossipSettings44.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener47 = null;
        com.google.code.gossip.GossipService gossipService48 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList43, gossipSettings44, gossipListener47);
        com.google.code.gossip.manager.GossipManager gossipManager49 = gossipService48.get_gossipManager();
        gossipManager49.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings57 = null;
        com.google.code.gossip.StartupSettings startupSettings59 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings57, "hi!");
        startupSettings59.setPort(10);
        startupSettings59.setPort((int) 'a');
        java.lang.String str64 = startupSettings59.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList65 = startupSettings59.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings66 = new com.google.code.gossip.GossipSettings();
        gossipSettings66.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener69 = null;
        com.google.code.gossip.GossipService gossipService70 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList65, gossipSettings66, gossipListener69);
        com.google.code.gossip.manager.GossipManager gossipManager71 = gossipService70.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings72 = gossipManager71.getSettings();
        com.google.code.gossip.GossipSettings gossipSettings79 = null;
        com.google.code.gossip.StartupSettings startupSettings81 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings79, "hi!");
        startupSettings81.setPort(10);
        startupSettings81.setPort((int) 'a');
        java.lang.String str86 = startupSettings81.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList87 = startupSettings81.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings88 = new com.google.code.gossip.GossipSettings();
        gossipSettings88.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener91 = null;
        com.google.code.gossip.GossipService gossipService92 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList87, gossipSettings88, gossipListener91);
        com.google.code.gossip.manager.GossipManager gossipManager93 = gossipService92.get_gossipManager();
        gossipManager93.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember95 = gossipManager93.getMyself();
        gossipManager71.revivieMember(localGossipMember95);
        gossipManager49.revivieMember(localGossipMember95);
        startupSettings28.addGossipMember((com.google.code.gossip.GossipMember) localGossipMember95);
        int int99 = startupSettings28.getPort();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(gossipMemberList16);
        org.junit.Assert.assertNotNull(gossipManager22);
        org.junit.Assert.assertNotNull(gossipSettings24);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(gossipMemberList43);
        org.junit.Assert.assertNotNull(gossipManager49);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(gossipMemberList65);
        org.junit.Assert.assertNotNull(gossipManager71);
        org.junit.Assert.assertNotNull(gossipSettings72);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(gossipMemberList87);
        org.junit.Assert.assertNotNull(gossipManager93);
        org.junit.Assert.assertNotNull(localGossipMember95);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 100 + "'", int99 == 100);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.google.code.gossip.GossipSettings gossipSettings8 = null;
        com.google.code.gossip.StartupSettings startupSettings10 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings8, "hi!");
        startupSettings10.setPort(10);
        startupSettings10.setPort((int) 'a');
        java.lang.String str15 = startupSettings10.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList16 = startupSettings10.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings17 = new com.google.code.gossip.GossipSettings();
        gossipSettings17.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener20 = null;
        com.google.code.gossip.GossipService gossipService21 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList16, gossipSettings17, gossipListener20);
        com.google.code.gossip.manager.GossipManager gossipManager22 = gossipService21.get_gossipManager();
        gossipManager22.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings24 = gossipManager22.getSettings();
        gossipSettings24.setCleanupInterval(10);
        com.google.code.gossip.StartupSettings startupSettings28 = new com.google.code.gossip.StartupSettings(":0", (int) (short) 100, gossipSettings24, "hi!");
        int int29 = startupSettings28.getPort();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(gossipMemberList16);
        org.junit.Assert.assertNotNull(gossipManager22);
        org.junit.Assert.assertNotNull(gossipSettings24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.google.code.gossip.GossipSettings gossipSettings8 = null;
        com.google.code.gossip.StartupSettings startupSettings10 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings8, "hi!");
        startupSettings10.setPort(10);
        startupSettings10.setPort((int) 'a');
        java.lang.String str15 = startupSettings10.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList16 = startupSettings10.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings17 = new com.google.code.gossip.GossipSettings();
        gossipSettings17.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener20 = null;
        com.google.code.gossip.GossipService gossipService21 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList16, gossipSettings17, gossipListener20);
        com.google.code.gossip.manager.GossipManager gossipManager22 = gossipService21.get_gossipManager();
        gossipManager22.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings24 = gossipManager22.getSettings();
        gossipSettings24.setCleanupInterval(10);
        com.google.code.gossip.StartupSettings startupSettings28 = new com.google.code.gossip.StartupSettings("hi!", (int) (short) -1, gossipSettings24, ":0");
        com.google.code.gossip.GossipService gossipService29 = new com.google.code.gossip.GossipService(startupSettings28);
        gossipService29.start();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(gossipMemberList16);
        org.junit.Assert.assertNotNull(gossipManager22);
        org.junit.Assert.assertNotNull(gossipSettings24);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("Member [address=:0, id=hi!, heartbeat=1698797234652]", 97, (int) '#', "hi!");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember4 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        java.lang.String str5 = remoteGossipMember4.getAddress();
        java.lang.String str6 = remoteGossipMember4.getAddress();
        long long7 = remoteGossipMember4.getHeartbeat();
        java.lang.String str8 = remoteGossipMember4.getClusterName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":0" + "'", str5, ":0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":0" + "'", str6, ":0");
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698797236152L + "'", long7 == 1698797236152L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember4 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        java.lang.String str5 = remoteGossipMember4.getHost();
        java.lang.String str6 = remoteGossipMember4.getAddress();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":0" + "'", str6, ":0");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings27 = null;
        com.google.code.gossip.StartupSettings startupSettings29 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings27, "hi!");
        startupSettings29.setPort(10);
        startupSettings29.setPort((int) 'a');
        java.lang.String str34 = startupSettings29.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList35 = startupSettings29.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings36 = new com.google.code.gossip.GossipSettings();
        gossipSettings36.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener39 = null;
        com.google.code.gossip.GossipService gossipService40 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList35, gossipSettings36, gossipListener39);
        com.google.code.gossip.manager.GossipManager gossipManager41 = gossipService40.get_gossipManager();
        gossipService19.set_gossipManager(gossipManager41);
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList43 = gossipManager41.getDeadList();
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList44 = gossipManager41.getMemberList();
        gossipManager41.shutdown();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(gossipMemberList35);
        org.junit.Assert.assertNotNull(gossipManager41);
        org.junit.Assert.assertNotNull(localGossipMemberList43);
        org.junit.Assert.assertNotNull(localGossipMemberList44);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        gossipManager20.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember22 = gossipManager20.getMyself();
        gossipManager20.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings39 = null;
        com.google.code.gossip.StartupSettings startupSettings41 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings39, "hi!");
        startupSettings41.setPort(10);
        startupSettings41.setPort((int) 'a');
        java.lang.String str46 = startupSettings41.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList47 = startupSettings41.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings48 = new com.google.code.gossip.GossipSettings();
        gossipSettings48.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener51 = null;
        com.google.code.gossip.GossipService gossipService52 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList47, gossipSettings48, gossipListener51);
        com.google.code.gossip.manager.GossipManager gossipManager53 = gossipService52.get_gossipManager();
        gossipManager53.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings55 = gossipManager53.getSettings();
        gossipSettings55.setCleanupInterval(10);
        com.google.code.gossip.GossipSettings gossipSettings60 = null;
        com.google.code.gossip.StartupSettings startupSettings62 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings60, "hi!");
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList63 = startupSettings62.getGossipMembers();
        com.google.code.gossip.event.GossipListener gossipListener64 = null;
        com.google.code.gossip.manager.random.RandomGossipManager randomGossipManager65 = new com.google.code.gossip.manager.random.RandomGossipManager(":0", "hi!", (int) (byte) 0, "", gossipSettings55, gossipMemberList63, gossipListener64);
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList66 = randomGossipManager65.getDeadList();
        com.google.code.gossip.LocalGossipMember localGossipMember68 = new com.google.code.gossip.LocalGossipMember("", "", 0, "Member [address=:0, id=hi!, heartbeat=1698797232207]", 1698797232559L, (javax.management.NotificationListener) randomGossipManager65, (int) (short) 0);
        com.google.code.gossip.GossipSettings gossipSettings75 = null;
        com.google.code.gossip.StartupSettings startupSettings77 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings75, "hi!");
        startupSettings77.setPort(10);
        startupSettings77.setPort((int) 'a');
        java.lang.String str82 = startupSettings77.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList83 = startupSettings77.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings84 = new com.google.code.gossip.GossipSettings();
        gossipSettings84.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener87 = null;
        com.google.code.gossip.GossipService gossipService88 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList83, gossipSettings84, gossipListener87);
        com.google.code.gossip.manager.GossipManager gossipManager89 = gossipService88.get_gossipManager();
        gossipManager89.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember91 = gossipManager89.getMyself();
        boolean boolean93 = localGossipMember91.equals((java.lang.Object) 3600000L);
        randomGossipManager65.createOrRevivieMember(localGossipMember91);
        gossipManager20.createOrRevivieMember(localGossipMember91);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertNotNull(localGossipMember22);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(gossipMemberList47);
        org.junit.Assert.assertNotNull(gossipManager53);
        org.junit.Assert.assertNotNull(gossipSettings55);
        org.junit.Assert.assertNotNull(gossipMemberList63);
        org.junit.Assert.assertNotNull(localGossipMemberList66);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(gossipMemberList83);
        org.junit.Assert.assertNotNull(gossipManager89);
        org.junit.Assert.assertNotNull(localGossipMember91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.google.code.gossip.GossipSettings gossipSettings10 = null;
        com.google.code.gossip.StartupSettings startupSettings12 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings10, "hi!");
        startupSettings12.setPort(10);
        startupSettings12.setPort((int) 'a');
        java.lang.String str17 = startupSettings12.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList18 = startupSettings12.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings19 = new com.google.code.gossip.GossipSettings();
        gossipSettings19.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener22 = null;
        com.google.code.gossip.GossipService gossipService23 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList18, gossipSettings19, gossipListener22);
        com.google.code.gossip.GossipSettings gossipSettings24 = new com.google.code.gossip.GossipSettings();
        gossipSettings24.setCleanupInterval((int) (short) 0);
        gossipSettings24.setCleanupInterval(1000);
        gossipSettings24.setCleanupInterval(100);
        com.google.code.gossip.event.GossipListener gossipListener31 = null;
        com.google.code.gossip.GossipService gossipService32 = new com.google.code.gossip.GossipService("", "hi!", 0, "", gossipMemberList18, gossipSettings24, gossipListener31);
        gossipService32.shutdown();
        gossipService32.start();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(gossipMemberList18);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.google.code.gossip.model.GossipMember gossipMember5 = new com.google.code.gossip.model.GossipMember(":0", "", (java.lang.Integer) 102400, "hi!", (java.lang.Long) 10L);
        gossipMember5.setCluster(":0");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.google.code.gossip.GossipSettings gossipSettings11 = null;
        com.google.code.gossip.StartupSettings startupSettings13 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings11, "hi!");
        startupSettings13.setPort(10);
        startupSettings13.setPort((int) 'a');
        java.lang.String str18 = startupSettings13.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList19 = startupSettings13.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings20 = new com.google.code.gossip.GossipSettings();
        gossipSettings20.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener23 = null;
        com.google.code.gossip.GossipService gossipService24 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList19, gossipSettings20, gossipListener23);
        com.google.code.gossip.manager.GossipManager gossipManager25 = gossipService24.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings32 = null;
        com.google.code.gossip.StartupSettings startupSettings34 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings32, "hi!");
        startupSettings34.setPort(10);
        startupSettings34.setPort((int) 'a');
        java.lang.String str39 = startupSettings34.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList40 = startupSettings34.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings41 = new com.google.code.gossip.GossipSettings();
        gossipSettings41.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener44 = null;
        com.google.code.gossip.GossipService gossipService45 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList40, gossipSettings41, gossipListener44);
        com.google.code.gossip.manager.GossipManager gossipManager46 = gossipService45.get_gossipManager();
        gossipService24.set_gossipManager(gossipManager46);
        gossipManager46.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember50 = new com.google.code.gossip.LocalGossipMember("", "hi!", (int) '4', ":0", (long) (short) 0, (javax.management.NotificationListener) gossipManager46, (-1));
        com.google.code.gossip.GossipSettings gossipSettings51 = gossipManager46.getSettings();
        com.google.code.gossip.LocalGossipMember localGossipMember52 = gossipManager46.getMyself();
        javax.management.Notification notification53 = null;
        com.google.code.gossip.model.GossipMember gossipMember54 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str55 = gossipMember54.getHost();
        java.lang.String str56 = gossipMember54.getCluster();
        // The following exception was thrown during execution in test generation
        try {
            gossipManager46.handleNotification(notification53, (java.lang.Object) gossipMember54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(gossipMemberList19);
        org.junit.Assert.assertNotNull(gossipManager25);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(gossipMemberList40);
        org.junit.Assert.assertNotNull(gossipManager46);
        org.junit.Assert.assertNotNull(gossipSettings51);
        org.junit.Assert.assertNotNull(localGossipMember52);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str56);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        gossipManager20.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember22 = gossipManager20.getMyself();
        // The following exception was thrown during execution in test generation
        try {
            gossipManager20.run();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.reflect.InvocationTargetException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertNotNull(localGossipMember22);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("hi!", 0, (int) ' ', "hi!");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember9 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        java.lang.String str10 = remoteGossipMember9.getAddress();
        java.lang.String str11 = remoteGossipMember9.getHost();
        startupSettings4.addGossipMember((com.google.code.gossip.GossipMember) remoteGossipMember9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":0" + "'", str10, ":0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.google.code.gossip.model.GossipMember gossipMember5 = new com.google.code.gossip.model.GossipMember(":0", "", (java.lang.Integer) 102400, "hi!", (java.lang.Long) 10L);
        java.lang.String str6 = gossipMember5.getHost();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.google.code.gossip.GossipSettings gossipSettings11 = null;
        com.google.code.gossip.StartupSettings startupSettings13 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings11, "hi!");
        startupSettings13.setPort(10);
        startupSettings13.setPort((int) 'a');
        java.lang.String str18 = startupSettings13.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList19 = startupSettings13.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings20 = new com.google.code.gossip.GossipSettings();
        gossipSettings20.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener23 = null;
        com.google.code.gossip.GossipService gossipService24 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList19, gossipSettings20, gossipListener23);
        com.google.code.gossip.manager.GossipManager gossipManager25 = gossipService24.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings32 = null;
        com.google.code.gossip.StartupSettings startupSettings34 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings32, "hi!");
        startupSettings34.setPort(10);
        startupSettings34.setPort((int) 'a');
        java.lang.String str39 = startupSettings34.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList40 = startupSettings34.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings41 = new com.google.code.gossip.GossipSettings();
        gossipSettings41.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener44 = null;
        com.google.code.gossip.GossipService gossipService45 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList40, gossipSettings41, gossipListener44);
        com.google.code.gossip.manager.GossipManager gossipManager46 = gossipService45.get_gossipManager();
        gossipService24.set_gossipManager(gossipManager46);
        gossipManager46.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember50 = new com.google.code.gossip.LocalGossipMember("", "hi!", (int) '4', ":0", (long) (short) 0, (javax.management.NotificationListener) gossipManager46, (-1));
        com.google.code.gossip.LocalGossipMember localGossipMember51 = gossipManager46.getMyself();
        com.google.code.gossip.LocalGossipMember localGossipMember52 = gossipManager46.getMyself();
        localGossipMember52.disableTimer();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(gossipMemberList19);
        org.junit.Assert.assertNotNull(gossipManager25);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(gossipMemberList40);
        org.junit.Assert.assertNotNull(gossipManager46);
        org.junit.Assert.assertNotNull(localGossipMember51);
        org.junit.Assert.assertNotNull(localGossipMember52);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings21 = gossipManager20.getSettings();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipManager42.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember44 = gossipManager42.getMyself();
        gossipManager20.revivieMember(localGossipMember44);
        com.google.code.gossip.GossipSettings gossipSettings46 = gossipManager20.getSettings();
        // The following exception was thrown during execution in test generation
        try {
            gossipManager20.run();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.reflect.InvocationTargetException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertNotNull(gossipSettings21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertNotNull(localGossipMember44);
        org.junit.Assert.assertNotNull(gossipSettings46);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        gossipMember0.setCluster(":0");
        gossipMember0.setHost("");
        gossipMember0.setCluster("");
        java.lang.Long long8 = gossipMember0.getHeartbeat();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        java.lang.Integer int2 = gossipMember0.getPort();
        gossipMember0.setPort((java.lang.Integer) 1);
        gossipMember0.setId("hi!");
        java.lang.String str7 = gossipMember0.getHost();
        java.lang.Long long8 = gossipMember0.getHeartbeat();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings27 = null;
        com.google.code.gossip.StartupSettings startupSettings29 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings27, "hi!");
        startupSettings29.setPort(10);
        startupSettings29.setPort((int) 'a');
        java.lang.String str34 = startupSettings29.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList35 = startupSettings29.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings36 = new com.google.code.gossip.GossipSettings();
        gossipSettings36.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener39 = null;
        com.google.code.gossip.GossipService gossipService40 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList35, gossipSettings36, gossipListener39);
        com.google.code.gossip.manager.GossipManager gossipManager41 = gossipService40.get_gossipManager();
        gossipService19.set_gossipManager(gossipManager41);
        // The following exception was thrown during execution in test generation
        try {
            gossipManager41.run();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.reflect.InvocationTargetException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(gossipMemberList35);
        org.junit.Assert.assertNotNull(gossipManager41);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        gossipManager20.shutdown();
        gossipManager20.shutdown();
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList23 = gossipManager20.getDeadList();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertNotNull(localGossipMemberList23);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (byte) 1, (int) (short) -1, ":0");
        java.lang.String str5 = startupSettings4.getCluster();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":0" + "'", str5, ":0");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.google.code.gossip.GossipSettings gossipSettings10 = null;
        com.google.code.gossip.StartupSettings startupSettings12 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings10, "hi!");
        startupSettings12.setPort(10);
        startupSettings12.setPort((int) 'a');
        java.lang.String str17 = startupSettings12.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList18 = startupSettings12.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings19 = new com.google.code.gossip.GossipSettings();
        gossipSettings19.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener22 = null;
        com.google.code.gossip.GossipService gossipService23 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList18, gossipSettings19, gossipListener22);
        com.google.code.gossip.GossipSettings gossipSettings24 = new com.google.code.gossip.GossipSettings();
        gossipSettings24.setCleanupInterval((int) (short) 0);
        gossipSettings24.setCleanupInterval(1000);
        gossipSettings24.setCleanupInterval(100);
        com.google.code.gossip.event.GossipListener gossipListener31 = null;
        com.google.code.gossip.GossipService gossipService32 = new com.google.code.gossip.GossipService("", "hi!", 0, "", gossipMemberList18, gossipSettings24, gossipListener31);
        gossipService32.start();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(gossipMemberList18);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        javax.management.NotificationListener notificationListener1 = null;
        com.google.code.gossip.GossipSettings gossipSettings8 = null;
        com.google.code.gossip.StartupSettings startupSettings10 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings8, "hi!");
        startupSettings10.setPort(10);
        startupSettings10.setPort((int) 'a');
        java.lang.String str15 = startupSettings10.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList16 = startupSettings10.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings17 = new com.google.code.gossip.GossipSettings();
        gossipSettings17.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener20 = null;
        com.google.code.gossip.GossipService gossipService21 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList16, gossipSettings17, gossipListener20);
        com.google.code.gossip.manager.GossipManager gossipManager22 = gossipService21.get_gossipManager();
        gossipManager22.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember24 = gossipManager22.getMyself();
        // The following exception was thrown during execution in test generation
        try {
            com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer25 = new com.google.code.gossip.GossipTimeoutTimer(3600000L, notificationListener1, localGossipMember24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Listener can't be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(gossipMemberList16);
        org.junit.Assert.assertNotNull(gossipManager22);
        org.junit.Assert.assertNotNull(localGossipMember24);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.google.code.gossip.GossipSettings gossipSettings11 = null;
        com.google.code.gossip.StartupSettings startupSettings13 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings11, "hi!");
        startupSettings13.setPort(10);
        startupSettings13.setPort((int) 'a');
        java.lang.String str18 = startupSettings13.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList19 = startupSettings13.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings20 = new com.google.code.gossip.GossipSettings();
        gossipSettings20.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener23 = null;
        com.google.code.gossip.GossipService gossipService24 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList19, gossipSettings20, gossipListener23);
        com.google.code.gossip.manager.GossipManager gossipManager25 = gossipService24.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings32 = null;
        com.google.code.gossip.StartupSettings startupSettings34 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings32, "hi!");
        startupSettings34.setPort(10);
        startupSettings34.setPort((int) 'a');
        java.lang.String str39 = startupSettings34.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList40 = startupSettings34.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings41 = new com.google.code.gossip.GossipSettings();
        gossipSettings41.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener44 = null;
        com.google.code.gossip.GossipService gossipService45 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList40, gossipSettings41, gossipListener44);
        com.google.code.gossip.manager.GossipManager gossipManager46 = gossipService45.get_gossipManager();
        gossipService24.set_gossipManager(gossipManager46);
        gossipManager46.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember50 = new com.google.code.gossip.LocalGossipMember("", "hi!", (int) '4', ":0", (long) (short) 0, (javax.management.NotificationListener) gossipManager46, (-1));
        com.google.code.gossip.LocalGossipMember localGossipMember51 = gossipManager46.getMyself();
        com.google.code.gossip.LocalGossipMember localGossipMember52 = gossipManager46.getMyself();
        com.google.code.gossip.LocalGossipMember localGossipMember53 = null;
        // The following exception was thrown during execution in test generation
        try {
            gossipManager46.createOrRevivieMember(localGossipMember53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(gossipMemberList19);
        org.junit.Assert.assertNotNull(gossipManager25);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(gossipMemberList40);
        org.junit.Assert.assertNotNull(gossipManager46);
        org.junit.Assert.assertNotNull(localGossipMember51);
        org.junit.Assert.assertNotNull(localGossipMember52);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        javax.management.MBeanServer mBeanServer93 = null;
        javax.management.ObjectName objectName94 = null;
        javax.management.ObjectName objectName95 = gossipTimeoutTimer92.preRegister(mBeanServer93, objectName94);
        int int96 = gossipTimeoutTimer92.getNbNotifications();
        java.lang.String str98 = gossipTimeoutTimer92.getNotificationType((java.lang.Integer) 102400);
        boolean boolean99 = gossipTimeoutTimer92.isEmpty();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(objectName95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNull(str98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("Member [address=:0, id=hi!, heartbeat=1698797232207]", (int) (byte) 0, 102400, "hi!");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList5 = startupSettings4.getGossipMembers();
        startupSettings4.setCluster("hi!");
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList8 = startupSettings4.getGossipMembers();
        org.junit.Assert.assertNotNull(gossipMemberList5);
        org.junit.Assert.assertNotNull(gossipMemberList8);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("hi!", 0, (int) ' ', "hi!");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember9 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        java.lang.String str10 = remoteGossipMember9.getAddress();
        java.lang.String str11 = remoteGossipMember9.getAddress();
        startupSettings4.addGossipMember((com.google.code.gossip.GossipMember) remoteGossipMember9);
        java.lang.String str13 = remoteGossipMember9.getId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":0" + "'", str10, ":0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":0" + "'", str11, ":0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        java.lang.Integer int2 = gossipMember0.getPort();
        gossipMember0.setPort((java.lang.Integer) 1);
        java.lang.Long long5 = gossipMember0.getHeartbeat();
        java.lang.String str6 = gossipMember0.getCluster();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.google.code.gossip.GossipSettings gossipSettings0 = new com.google.code.gossip.GossipSettings();
        gossipSettings0.setCleanupInterval((int) (short) 0);
        gossipSettings0.setGossipTimeout((int) (byte) 100);
        gossipSettings0.setCleanupInterval(1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("Member [address=:0, id=hi!, heartbeat=1698797234652]", (int) '#', (int) (short) 100, "Member [address=:0, id=hi!, heartbeat=1698797232207]");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        com.google.code.gossip.GossipSettings gossipSettings11 = null;
        com.google.code.gossip.StartupSettings startupSettings13 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings11, "hi!");
        startupSettings13.setPort(10);
        startupSettings13.setPort((int) 'a');
        java.lang.String str18 = startupSettings13.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList19 = startupSettings13.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings20 = new com.google.code.gossip.GossipSettings();
        gossipSettings20.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener23 = null;
        com.google.code.gossip.GossipService gossipService24 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList19, gossipSettings20, gossipListener23);
        com.google.code.gossip.manager.GossipManager gossipManager25 = gossipService24.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings32 = null;
        com.google.code.gossip.StartupSettings startupSettings34 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings32, "hi!");
        startupSettings34.setPort(10);
        startupSettings34.setPort((int) 'a');
        java.lang.String str39 = startupSettings34.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList40 = startupSettings34.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings41 = new com.google.code.gossip.GossipSettings();
        gossipSettings41.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener44 = null;
        com.google.code.gossip.GossipService gossipService45 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList40, gossipSettings41, gossipListener44);
        com.google.code.gossip.manager.GossipManager gossipManager46 = gossipService45.get_gossipManager();
        gossipService24.set_gossipManager(gossipManager46);
        gossipManager46.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember50 = new com.google.code.gossip.LocalGossipMember("", "hi!", (int) '4', ":0", (long) (short) 0, (javax.management.NotificationListener) gossipManager46, (-1));
        com.google.code.gossip.GossipSettings gossipSettings51 = gossipManager46.getSettings();
        com.google.code.gossip.GossipSettings gossipSettings52 = gossipManager46.getSettings();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(gossipMemberList19);
        org.junit.Assert.assertNotNull(gossipManager25);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(gossipMemberList40);
        org.junit.Assert.assertNotNull(gossipManager46);
        org.junit.Assert.assertNotNull(gossipSettings51);
        org.junit.Assert.assertNotNull(gossipSettings52);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        java.lang.String str2 = gossipMember0.getHost();
        gossipMember0.setHeartbeat((java.lang.Long) 100L);
        gossipMember0.setCluster(":0");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        java.lang.Integer int2 = gossipMember0.getPort();
        gossipMember0.setPort((java.lang.Integer) 1);
        gossipMember0.setId("hi!");
        gossipMember0.setHost("");
        gossipMember0.setHost("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int2);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        javax.management.MBeanServer mBeanServer93 = null;
        javax.management.ObjectName objectName94 = null;
        javax.management.ObjectName objectName95 = gossipTimeoutTimer92.preRegister(mBeanServer93, objectName94);
        int int96 = gossipTimeoutTimer92.getNbNotifications();
        java.lang.String str98 = gossipTimeoutTimer92.getNotificationType((java.lang.Integer) 102400);
        gossipTimeoutTimer92.removeAllNotifications();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(objectName95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNull(str98);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        javax.management.MBeanServer mBeanServer93 = null;
        javax.management.ObjectName objectName94 = null;
        javax.management.ObjectName objectName95 = gossipTimeoutTimer92.preRegister(mBeanServer93, objectName94);
        int int96 = gossipTimeoutTimer92.getNbNotifications();
        java.util.Vector<java.lang.Integer> intList97 = gossipTimeoutTimer92.getAllNotificationIDs();
        gossipTimeoutTimer92.reset();
        int int99 = gossipTimeoutTimer92.getNbNotifications();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(objectName95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNotNull(intList97);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 1 + "'", int99 == 1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember4 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        java.lang.String str5 = remoteGossipMember4.getAddress();
        java.lang.String str6 = remoteGossipMember4.getAddress();
        long long7 = remoteGossipMember4.getHeartbeat();
        java.lang.String str8 = remoteGossipMember4.toString();
        java.lang.String str9 = remoteGossipMember4.getHost();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":0" + "'", str5, ":0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":0" + "'", str6, ":0");
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698797238955L + "'", long7 == 1698797238955L);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Member [address=:0, id=hi!, heartbeat=1698797238955]" + "'", str8, "Member [address=:0, id=hi!, heartbeat=1698797238955]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        startupSettings4.setPort(10);
        java.lang.String str7 = startupSettings4.getCluster();
        startupSettings4.setCluster("Member [address=:0, id=hi!, heartbeat=1698797232207]");
        int int10 = startupSettings4.getPort();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        gossipManager20.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings43 = gossipManager42.getSettings();
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipManager64.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember66 = gossipManager64.getMyself();
        gossipManager42.revivieMember(localGossipMember66);
        gossipManager20.revivieMember(localGossipMember66);
        com.google.code.gossip.GossipSettings gossipSettings75 = null;
        com.google.code.gossip.StartupSettings startupSettings77 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings75, "hi!");
        startupSettings77.setPort(10);
        startupSettings77.setPort((int) 'a');
        java.lang.String str82 = startupSettings77.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList83 = startupSettings77.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings84 = new com.google.code.gossip.GossipSettings();
        gossipSettings84.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener87 = null;
        com.google.code.gossip.GossipService gossipService88 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList83, gossipSettings84, gossipListener87);
        boolean boolean89 = localGossipMember66.equals((java.lang.Object) "hi!");
        localGossipMember66.setHeartbeat(3600000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertNotNull(gossipSettings43);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertNotNull(localGossipMember66);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(gossipMemberList83);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        java.lang.Integer int2 = gossipMember0.getPort();
        gossipMember0.setPort((java.lang.Integer) 1);
        java.lang.String str5 = gossipMember0.getHost();
        gossipMember0.setPort((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass8 = gossipMember0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.google.code.gossip.model.GossipMember gossipMember5 = new com.google.code.gossip.model.GossipMember(":0", "", (java.lang.Integer) 102400, "hi!", (java.lang.Long) 10L);
        java.lang.String str6 = gossipMember5.getId();
        gossipMember5.setCluster("Member [address=:0, id=hi!, heartbeat=1698797238955]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        javax.management.MBeanServer mBeanServer93 = null;
        javax.management.ObjectName objectName94 = null;
        javax.management.ObjectName objectName95 = gossipTimeoutTimer92.preRegister(mBeanServer93, objectName94);
        gossipTimeoutTimer92.stop();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(objectName95);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        com.google.code.gossip.model.GossipMember gossipMember5 = new com.google.code.gossip.model.GossipMember("hi!", ":0", (java.lang.Integer) 100, "hi!", (java.lang.Long) 0L);
        java.lang.String str6 = gossipMember5.getId();
        gossipMember5.setHost("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        java.lang.Integer int2 = gossipMember0.getPort();
        gossipMember0.setPort((java.lang.Integer) 1);
        gossipMember0.setId("hi!");
        gossipMember0.setHost("");
        java.lang.Class<?> wildcardClass9 = gossipMember0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        long long0 = javax.management.timer.Timer.ONE_WEEK;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 604800000L + "'", long0 == 604800000L);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember4 = new com.google.code.gossip.RemoteGossipMember("Member [address=:0, id=hi!, heartbeat=1698797232207]", "", 100, "");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.google.code.gossip.GossipSettings gossipSettings15 = null;
        com.google.code.gossip.StartupSettings startupSettings17 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings15, "hi!");
        startupSettings17.setPort(10);
        startupSettings17.setPort((int) 'a');
        java.lang.String str22 = startupSettings17.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList23 = startupSettings17.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings24 = new com.google.code.gossip.GossipSettings();
        gossipSettings24.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener27 = null;
        com.google.code.gossip.GossipService gossipService28 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList23, gossipSettings24, gossipListener27);
        com.google.code.gossip.manager.GossipManager gossipManager29 = gossipService28.get_gossipManager();
        gossipManager29.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings31 = gossipManager29.getSettings();
        gossipSettings31.setCleanupInterval(10);
        com.google.code.gossip.GossipSettings gossipSettings36 = null;
        com.google.code.gossip.StartupSettings startupSettings38 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings36, "hi!");
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList39 = startupSettings38.getGossipMembers();
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.manager.random.RandomGossipManager randomGossipManager41 = new com.google.code.gossip.manager.random.RandomGossipManager(":0", "hi!", (int) (byte) 0, "", gossipSettings31, gossipMemberList39, gossipListener40);
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList42 = randomGossipManager41.getDeadList();
        com.google.code.gossip.LocalGossipMember localGossipMember44 = new com.google.code.gossip.LocalGossipMember("", "", 0, "Member [address=:0, id=hi!, heartbeat=1698797232207]", 1698797232559L, (javax.management.NotificationListener) randomGossipManager41, (int) (short) 0);
        java.lang.String str45 = localGossipMember44.getClusterName();
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(gossipMemberList23);
        org.junit.Assert.assertNotNull(gossipManager29);
        org.junit.Assert.assertNotNull(gossipSettings31);
        org.junit.Assert.assertNotNull(gossipMemberList39);
        org.junit.Assert.assertNotNull(localGossipMemberList42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        com.google.code.gossip.GossipSettings gossipSettings11 = null;
        com.google.code.gossip.StartupSettings startupSettings13 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings11, "hi!");
        startupSettings13.setPort(10);
        startupSettings13.setPort((int) 'a');
        java.lang.String str18 = startupSettings13.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList19 = startupSettings13.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings20 = new com.google.code.gossip.GossipSettings();
        gossipSettings20.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener23 = null;
        com.google.code.gossip.GossipService gossipService24 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList19, gossipSettings20, gossipListener23);
        com.google.code.gossip.manager.GossipManager gossipManager25 = gossipService24.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings32 = null;
        com.google.code.gossip.StartupSettings startupSettings34 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings32, "hi!");
        startupSettings34.setPort(10);
        startupSettings34.setPort((int) 'a');
        java.lang.String str39 = startupSettings34.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList40 = startupSettings34.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings41 = new com.google.code.gossip.GossipSettings();
        gossipSettings41.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener44 = null;
        com.google.code.gossip.GossipService gossipService45 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList40, gossipSettings41, gossipListener44);
        com.google.code.gossip.manager.GossipManager gossipManager46 = gossipService45.get_gossipManager();
        gossipService24.set_gossipManager(gossipManager46);
        gossipManager46.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember50 = new com.google.code.gossip.LocalGossipMember("", "hi!", (int) '4', ":0", (long) (short) 0, (javax.management.NotificationListener) gossipManager46, (-1));
        com.google.code.gossip.LocalGossipMember localGossipMember51 = gossipManager46.getMyself();
        com.google.code.gossip.LocalGossipMember localGossipMember52 = gossipManager46.getMyself();
        localGossipMember52.setId("");
        localGossipMember52.resetTimeoutTimer();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(gossipMemberList19);
        org.junit.Assert.assertNotNull(gossipManager25);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(gossipMemberList40);
        org.junit.Assert.assertNotNull(gossipManager46);
        org.junit.Assert.assertNotNull(localGossipMember51);
        org.junit.Assert.assertNotNull(localGossipMember52);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList5 = startupSettings4.getGossipMembers();
        startupSettings4.setCluster("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.code.gossip.GossipService gossipService8 = new com.google.code.gossip.GossipService(startupSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gossipMemberList5);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        javax.management.MBeanServer mBeanServer93 = null;
        javax.management.ObjectName objectName94 = null;
        javax.management.ObjectName objectName95 = gossipTimeoutTimer92.preRegister(mBeanServer93, objectName94);
        int int96 = gossipTimeoutTimer92.getNbNotifications();
        javax.management.Notification notification97 = null;
        gossipTimeoutTimer92.sendNotification(notification97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(objectName95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        java.lang.String str5 = startupSettings4.getCluster();
        java.lang.String str6 = startupSettings4.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList7 = startupSettings4.getGossipMembers();
        startupSettings4.setCluster("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(gossipMemberList7);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("Member [address=:0, id=hi!, heartbeat=1698797238955]", (int) (short) 100, gossipSettings2, "Member [address=:0, id=hi!, heartbeat=1698797232207]");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        java.lang.String str5 = startupSettings4.getCluster();
        com.google.code.gossip.GossipSettings gossipSettings6 = startupSettings4.getGossipSettings();
        java.lang.String str7 = startupSettings4.getCluster();
        com.google.code.gossip.GossipSettings gossipSettings14 = null;
        com.google.code.gossip.StartupSettings startupSettings16 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings14, "hi!");
        startupSettings16.setPort(10);
        startupSettings16.setPort((int) 'a');
        java.lang.String str21 = startupSettings16.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList22 = startupSettings16.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings23 = new com.google.code.gossip.GossipSettings();
        gossipSettings23.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener26 = null;
        com.google.code.gossip.GossipService gossipService27 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList22, gossipSettings23, gossipListener26);
        com.google.code.gossip.manager.GossipManager gossipManager28 = gossipService27.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings29 = gossipManager28.getSettings();
        com.google.code.gossip.GossipSettings gossipSettings36 = null;
        com.google.code.gossip.StartupSettings startupSettings38 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings36, "hi!");
        startupSettings38.setPort(10);
        startupSettings38.setPort((int) 'a');
        java.lang.String str43 = startupSettings38.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList44 = startupSettings38.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings45 = new com.google.code.gossip.GossipSettings();
        gossipSettings45.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener48 = null;
        com.google.code.gossip.GossipService gossipService49 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList44, gossipSettings45, gossipListener48);
        com.google.code.gossip.manager.GossipManager gossipManager50 = gossipService49.get_gossipManager();
        gossipManager50.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember52 = gossipManager50.getMyself();
        gossipManager28.revivieMember(localGossipMember52);
        startupSettings4.addGossipMember((com.google.code.gossip.GossipMember) localGossipMember52);
        startupSettings4.setCluster("Member [address=:0, id=hi!, heartbeat=1698797232207]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(gossipSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(gossipMemberList22);
        org.junit.Assert.assertNotNull(gossipManager28);
        org.junit.Assert.assertNotNull(gossipSettings29);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(gossipMemberList44);
        org.junit.Assert.assertNotNull(gossipManager50);
        org.junit.Assert.assertNotNull(localGossipMember52);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.google.code.gossip.GossipSettings gossipSettings2 = new com.google.code.gossip.GossipSettings();
        gossipSettings2.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.StartupSettings startupSettings6 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "Member [address=:0, id=hi!, heartbeat=1698797232207]");
        com.google.code.gossip.GossipService gossipService7 = new com.google.code.gossip.GossipService(startupSettings6);
        java.lang.String str8 = startupSettings6.getCluster();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Member [address=:0, id=hi!, heartbeat=1698797232207]" + "'", str8, "Member [address=:0, id=hi!, heartbeat=1698797232207]");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        java.lang.Integer int2 = gossipMember0.getPort();
        java.lang.String str3 = gossipMember0.getHost();
        java.lang.Long long4 = gossipMember0.getHeartbeat();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        gossipTimeoutTimer92.reset();
        gossipTimeoutTimer92.postRegister((java.lang.Boolean) true);
        gossipTimeoutTimer92.stop();
        gossipTimeoutTimer92.preDeregister();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember4 = new com.google.code.gossip.RemoteGossipMember(":0", "hi!", 1000, "Member [address=:0, id=hi!, heartbeat=1698797232207]");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("hi!", 0, (int) ' ', "hi!");
        startupSettings4.setCluster(":0");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember11 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        java.lang.String str12 = remoteGossipMember11.getAddress();
        java.lang.String str13 = remoteGossipMember11.getAddress();
        remoteGossipMember11.setId("");
        startupSettings4.addGossipMember((com.google.code.gossip.GossipMember) remoteGossipMember11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":0" + "'", str12, ":0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":0" + "'", str13, ":0");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        gossipTimeoutTimer92.reset();
        gossipTimeoutTimer92.postRegister((java.lang.Boolean) true);
        gossipTimeoutTimer92.stop();
        gossipTimeoutTimer92.stop();
        java.util.Vector<java.lang.Integer> intList99 = gossipTimeoutTimer92.getNotificationIDs("Member [address=:0, id=hi!, heartbeat=1698797238955]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(intList99);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings32 = null;
        com.google.code.gossip.StartupSettings startupSettings34 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings32, "hi!");
        startupSettings34.setPort(10);
        startupSettings34.setPort((int) 'a');
        java.lang.String str39 = startupSettings34.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList40 = startupSettings34.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings41 = new com.google.code.gossip.GossipSettings();
        gossipSettings41.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener44 = null;
        com.google.code.gossip.GossipService gossipService45 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList40, gossipSettings41, gossipListener44);
        com.google.code.gossip.manager.GossipManager gossipManager46 = gossipService45.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings53 = null;
        com.google.code.gossip.StartupSettings startupSettings55 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings53, "hi!");
        startupSettings55.setPort(10);
        startupSettings55.setPort((int) 'a');
        java.lang.String str60 = startupSettings55.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList61 = startupSettings55.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings62 = new com.google.code.gossip.GossipSettings();
        gossipSettings62.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener65 = null;
        com.google.code.gossip.GossipService gossipService66 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList61, gossipSettings62, gossipListener65);
        com.google.code.gossip.manager.GossipManager gossipManager67 = gossipService66.get_gossipManager();
        gossipService45.set_gossipManager(gossipManager67);
        gossipManager67.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember71 = new com.google.code.gossip.LocalGossipMember("", "hi!", (int) '4', ":0", (long) (short) 0, (javax.management.NotificationListener) gossipManager67, (-1));
        gossipService19.set_gossipManager(gossipManager67);
        // The following exception was thrown during execution in test generation
        try {
            com.google.code.gossip.manager.impl.OnlyProcessReceivedPassiveGossipThread onlyProcessReceivedPassiveGossipThread73 = new com.google.code.gossip.manager.impl.OnlyProcessReceivedPassiveGossipThread(gossipManager67);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.net.BindException: Can't assign requested address (Bind failed)");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(gossipMemberList40);
        org.junit.Assert.assertNotNull(gossipManager46);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(gossipMemberList61);
        org.junit.Assert.assertNotNull(gossipManager67);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (byte) 1, (int) (short) -1, ":0");
        com.google.code.gossip.GossipSettings gossipSettings5 = startupSettings4.getGossipSettings();
        org.junit.Assert.assertNotNull(gossipSettings5);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        javax.management.MBeanServer mBeanServer93 = null;
        javax.management.ObjectName objectName94 = null;
        javax.management.ObjectName objectName95 = gossipTimeoutTimer92.preRegister(mBeanServer93, objectName94);
        java.util.Vector<java.lang.Integer> intList96 = gossipTimeoutTimer92.getAllNotificationIDs();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(objectName95);
        org.junit.Assert.assertNotNull(intList96);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        gossipManager20.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings22 = gossipManager20.getSettings();
        com.google.code.gossip.GossipSettings gossipSettings38 = null;
        com.google.code.gossip.StartupSettings startupSettings40 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings38, "hi!");
        startupSettings40.setPort(10);
        startupSettings40.setPort((int) 'a');
        java.lang.String str45 = startupSettings40.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList46 = startupSettings40.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings47 = new com.google.code.gossip.GossipSettings();
        gossipSettings47.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener50 = null;
        com.google.code.gossip.GossipService gossipService51 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList46, gossipSettings47, gossipListener50);
        com.google.code.gossip.manager.GossipManager gossipManager52 = gossipService51.get_gossipManager();
        gossipManager52.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings54 = gossipManager52.getSettings();
        gossipSettings54.setCleanupInterval(10);
        com.google.code.gossip.GossipSettings gossipSettings59 = null;
        com.google.code.gossip.StartupSettings startupSettings61 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings59, "hi!");
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList62 = startupSettings61.getGossipMembers();
        com.google.code.gossip.event.GossipListener gossipListener63 = null;
        com.google.code.gossip.manager.random.RandomGossipManager randomGossipManager64 = new com.google.code.gossip.manager.random.RandomGossipManager(":0", "hi!", (int) (byte) 0, "", gossipSettings54, gossipMemberList62, gossipListener63);
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList65 = randomGossipManager64.getDeadList();
        com.google.code.gossip.LocalGossipMember localGossipMember67 = new com.google.code.gossip.LocalGossipMember("", "", 0, "Member [address=:0, id=hi!, heartbeat=1698797232207]", 1698797232559L, (javax.management.NotificationListener) randomGossipManager64, (int) (short) 0);
        com.google.code.gossip.GossipSettings gossipSettings74 = null;
        com.google.code.gossip.StartupSettings startupSettings76 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings74, "hi!");
        startupSettings76.setPort(10);
        startupSettings76.setPort((int) 'a');
        java.lang.String str81 = startupSettings76.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList82 = startupSettings76.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings83 = new com.google.code.gossip.GossipSettings();
        gossipSettings83.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener86 = null;
        com.google.code.gossip.GossipService gossipService87 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList82, gossipSettings83, gossipListener86);
        com.google.code.gossip.manager.GossipManager gossipManager88 = gossipService87.get_gossipManager();
        gossipManager88.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember90 = gossipManager88.getMyself();
        boolean boolean92 = localGossipMember90.equals((java.lang.Object) 3600000L);
        randomGossipManager64.createOrRevivieMember(localGossipMember90);
        localGossipMember90.resetTimeoutTimer();
        gossipManager20.createOrRevivieMember(localGossipMember90);
        localGossipMember90.setHeartbeat(0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertNotNull(gossipSettings22);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(gossipMemberList46);
        org.junit.Assert.assertNotNull(gossipManager52);
        org.junit.Assert.assertNotNull(gossipSettings54);
        org.junit.Assert.assertNotNull(gossipMemberList62);
        org.junit.Assert.assertNotNull(localGossipMemberList65);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(gossipMemberList82);
        org.junit.Assert.assertNotNull(gossipManager88);
        org.junit.Assert.assertNotNull(localGossipMember90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        javax.management.NotificationListener notificationListener5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.code.gossip.LocalGossipMember localGossipMember7 = new com.google.code.gossip.LocalGossipMember("", "hi!", (int) '#', "Member [address=:0, id=hi!, heartbeat=1698797232207]", (long) 0, notificationListener5, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Listener can't be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        gossipMember0.setCluster(":0");
        gossipMember0.setPort((java.lang.Integer) 5);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        gossipTimeoutTimer92.reset();
        gossipTimeoutTimer92.postRegister((java.lang.Boolean) true);
        gossipTimeoutTimer92.stop();
        gossipTimeoutTimer92.postRegister((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        javax.management.MBeanServer mBeanServer93 = null;
        javax.management.ObjectName objectName94 = null;
        javax.management.ObjectName objectName95 = gossipTimeoutTimer92.preRegister(mBeanServer93, objectName94);
        int int96 = gossipTimeoutTimer92.getNbNotifications();
        java.util.Vector<java.lang.Integer> intList97 = gossipTimeoutTimer92.getAllNotificationIDs();
        java.lang.Boolean boolean99 = gossipTimeoutTimer92.getFixedRate((java.lang.Integer) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(objectName95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNotNull(intList97);
        org.junit.Assert.assertNull(boolean99);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember4 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        boolean boolean6 = remoteGossipMember4.equals((java.lang.Object) (byte) 1);
        boolean boolean8 = remoteGossipMember4.equals((java.lang.Object) 86400000L);
        remoteGossipMember4.setHeartbeat((long) (short) 10);
        remoteGossipMember4.setId("Member [address=:0, id=hi!, heartbeat=1698797232207]");
        java.lang.Object obj13 = null;
        boolean boolean14 = remoteGossipMember4.equals(obj13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        java.lang.String str9 = startupSettings8.getCluster();
        java.lang.String str10 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList11 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings22 = null;
        com.google.code.gossip.StartupSettings startupSettings24 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings22, "hi!");
        startupSettings24.setPort(10);
        startupSettings24.setPort((int) 'a');
        java.lang.String str29 = startupSettings24.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList30 = startupSettings24.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings31 = new com.google.code.gossip.GossipSettings();
        gossipSettings31.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener34 = null;
        com.google.code.gossip.GossipService gossipService35 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList30, gossipSettings31, gossipListener34);
        com.google.code.gossip.manager.GossipManager gossipManager36 = gossipService35.get_gossipManager();
        gossipManager36.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings38 = gossipManager36.getSettings();
        gossipSettings38.setCleanupInterval(10);
        com.google.code.gossip.GossipSettings gossipSettings43 = null;
        com.google.code.gossip.StartupSettings startupSettings45 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings43, "hi!");
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList46 = startupSettings45.getGossipMembers();
        com.google.code.gossip.event.GossipListener gossipListener47 = null;
        com.google.code.gossip.manager.random.RandomGossipManager randomGossipManager48 = new com.google.code.gossip.manager.random.RandomGossipManager(":0", "hi!", (int) (byte) 0, "", gossipSettings38, gossipMemberList46, gossipListener47);
        int int49 = gossipSettings38.getCleanupInterval();
        com.google.code.gossip.event.GossipListener gossipListener50 = null;
        com.google.code.gossip.GossipService gossipService51 = new com.google.code.gossip.GossipService(":0", "Member [address=:0, id=hi!, heartbeat=1698797232207]", (-1), "hi!", gossipMemberList11, gossipSettings38, gossipListener50);
        com.google.code.gossip.manager.GossipManager gossipManager52 = gossipService51.get_gossipManager();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(gossipMemberList11);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(gossipMemberList30);
        org.junit.Assert.assertNotNull(gossipManager36);
        org.junit.Assert.assertNotNull(gossipSettings38);
        org.junit.Assert.assertNotNull(gossipMemberList46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(gossipManager52);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        java.lang.Integer int2 = gossipMember0.getPort();
        gossipMember0.setPort((java.lang.Integer) 1);
        java.lang.Long long5 = gossipMember0.getHeartbeat();
        java.lang.String str6 = gossipMember0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        gossipManager20.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings43 = gossipManager42.getSettings();
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipManager64.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember66 = gossipManager64.getMyself();
        gossipManager42.revivieMember(localGossipMember66);
        gossipManager20.revivieMember(localGossipMember66);
        localGossipMember66.startTimeoutTimer();
        localGossipMember66.startTimeoutTimer();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertNotNull(gossipSettings43);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertNotNull(localGossipMember66);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        java.lang.String str5 = startupSettings4.getCluster();
        com.google.code.gossip.GossipSettings gossipSettings6 = startupSettings4.getGossipSettings();
        com.google.code.gossip.RemoteGossipMember remoteGossipMember11 = new com.google.code.gossip.RemoteGossipMember("hi!", "Member [address=:0, id=hi!, heartbeat=1698797232207]", 1, "hi!");
        startupSettings4.addGossipMember((com.google.code.gossip.GossipMember) remoteGossipMember11);
        com.google.code.gossip.GossipSettings gossipSettings13 = startupSettings4.getGossipSettings();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(gossipSettings6);
        org.junit.Assert.assertNull(gossipSettings13);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.google.code.gossip.GossipSettings gossipSettings11 = null;
        com.google.code.gossip.StartupSettings startupSettings13 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings11, "hi!");
        startupSettings13.setPort(10);
        startupSettings13.setPort((int) 'a');
        java.lang.String str18 = startupSettings13.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList19 = startupSettings13.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings20 = new com.google.code.gossip.GossipSettings();
        gossipSettings20.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener23 = null;
        com.google.code.gossip.GossipService gossipService24 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList19, gossipSettings20, gossipListener23);
        com.google.code.gossip.manager.GossipManager gossipManager25 = gossipService24.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings32 = null;
        com.google.code.gossip.StartupSettings startupSettings34 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings32, "hi!");
        startupSettings34.setPort(10);
        startupSettings34.setPort((int) 'a');
        java.lang.String str39 = startupSettings34.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList40 = startupSettings34.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings41 = new com.google.code.gossip.GossipSettings();
        gossipSettings41.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener44 = null;
        com.google.code.gossip.GossipService gossipService45 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList40, gossipSettings41, gossipListener44);
        com.google.code.gossip.manager.GossipManager gossipManager46 = gossipService45.get_gossipManager();
        gossipService24.set_gossipManager(gossipManager46);
        gossipManager46.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember50 = new com.google.code.gossip.LocalGossipMember("", "hi!", (int) '4', ":0", (long) (short) 0, (javax.management.NotificationListener) gossipManager46, (-1));
        com.google.code.gossip.GossipSettings gossipSettings51 = gossipManager46.getSettings();
        com.google.code.gossip.LocalGossipMember localGossipMember52 = gossipManager46.getMyself();
        localGossipMember52.disableTimer();
        java.lang.String str54 = localGossipMember52.getAddress();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(gossipMemberList19);
        org.junit.Assert.assertNotNull(gossipManager25);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(gossipMemberList40);
        org.junit.Assert.assertNotNull(gossipManager46);
        org.junit.Assert.assertNotNull(gossipSettings51);
        org.junit.Assert.assertNotNull(localGossipMember52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!:1" + "'", str54, "hi!:1");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        java.lang.String str9 = startupSettings8.getCluster();
        java.lang.String str10 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList11 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings22 = null;
        com.google.code.gossip.StartupSettings startupSettings24 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings22, "hi!");
        startupSettings24.setPort(10);
        startupSettings24.setPort((int) 'a');
        java.lang.String str29 = startupSettings24.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList30 = startupSettings24.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings31 = new com.google.code.gossip.GossipSettings();
        gossipSettings31.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener34 = null;
        com.google.code.gossip.GossipService gossipService35 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList30, gossipSettings31, gossipListener34);
        com.google.code.gossip.manager.GossipManager gossipManager36 = gossipService35.get_gossipManager();
        gossipManager36.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings38 = gossipManager36.getSettings();
        gossipSettings38.setCleanupInterval(10);
        com.google.code.gossip.GossipSettings gossipSettings43 = null;
        com.google.code.gossip.StartupSettings startupSettings45 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings43, "hi!");
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList46 = startupSettings45.getGossipMembers();
        com.google.code.gossip.event.GossipListener gossipListener47 = null;
        com.google.code.gossip.manager.random.RandomGossipManager randomGossipManager48 = new com.google.code.gossip.manager.random.RandomGossipManager(":0", "hi!", (int) (byte) 0, "", gossipSettings38, gossipMemberList46, gossipListener47);
        int int49 = gossipSettings38.getCleanupInterval();
        com.google.code.gossip.event.GossipListener gossipListener50 = null;
        com.google.code.gossip.GossipService gossipService51 = new com.google.code.gossip.GossipService(":0", "Member [address=:0, id=hi!, heartbeat=1698797232207]", (-1), "hi!", gossipMemberList11, gossipSettings38, gossipListener50);
        gossipService51.start();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(gossipMemberList11);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(gossipMemberList30);
        org.junit.Assert.assertNotNull(gossipManager36);
        org.junit.Assert.assertNotNull(gossipSettings38);
        org.junit.Assert.assertNotNull(gossipMemberList46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.google.code.gossip.manager.GossipManager gossipManager0 = null;
        com.google.code.gossip.manager.random.RandomActiveGossipThread randomActiveGossipThread1 = new com.google.code.gossip.manager.random.RandomActiveGossipThread(gossipManager0);
        randomActiveGossipThread1.shutdown();
        randomActiveGossipThread1.run();
        randomActiveGossipThread1.shutdown();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        gossipTimeoutTimer92.reset();
        gossipTimeoutTimer92.postRegister((java.lang.Boolean) true);
        gossipTimeoutTimer92.stop();
        gossipTimeoutTimer92.stop();
        java.lang.Long long99 = gossipTimeoutTimer92.getNbOccurences((java.lang.Integer) 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(long99);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.google.code.gossip.GossipSettings gossipSettings11 = null;
        com.google.code.gossip.StartupSettings startupSettings13 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings11, "hi!");
        startupSettings13.setPort(10);
        startupSettings13.setPort((int) 'a');
        java.lang.String str18 = startupSettings13.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList19 = startupSettings13.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings20 = new com.google.code.gossip.GossipSettings();
        gossipSettings20.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener23 = null;
        com.google.code.gossip.GossipService gossipService24 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList19, gossipSettings20, gossipListener23);
        com.google.code.gossip.manager.GossipManager gossipManager25 = gossipService24.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings32 = null;
        com.google.code.gossip.StartupSettings startupSettings34 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings32, "hi!");
        startupSettings34.setPort(10);
        startupSettings34.setPort((int) 'a');
        java.lang.String str39 = startupSettings34.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList40 = startupSettings34.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings41 = new com.google.code.gossip.GossipSettings();
        gossipSettings41.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener44 = null;
        com.google.code.gossip.GossipService gossipService45 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList40, gossipSettings41, gossipListener44);
        com.google.code.gossip.manager.GossipManager gossipManager46 = gossipService45.get_gossipManager();
        gossipService24.set_gossipManager(gossipManager46);
        gossipManager46.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember50 = new com.google.code.gossip.LocalGossipMember("hi!:1", "hi!:1", (int) (byte) 100, "", (long) 1000, (javax.management.NotificationListener) gossipManager46, 100);
        localGossipMember50.startTimeoutTimer();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(gossipMemberList19);
        org.junit.Assert.assertNotNull(gossipManager25);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(gossipMemberList40);
        org.junit.Assert.assertNotNull(gossipManager46);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        startupSettings4.setPort(10);
        startupSettings4.setId("");
        java.lang.String str9 = startupSettings4.getCluster();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings21 = gossipManager20.getSettings();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings43 = gossipManager42.getSettings();
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipManager64.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember66 = gossipManager64.getMyself();
        gossipManager42.revivieMember(localGossipMember66);
        gossipManager20.createOrRevivieMember(localGossipMember66);
        com.google.code.gossip.manager.random.RandomActiveGossipThread randomActiveGossipThread69 = new com.google.code.gossip.manager.random.RandomActiveGossipThread(gossipManager20);
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList70 = gossipManager20.getMemberList();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertNotNull(gossipSettings21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertNotNull(gossipSettings43);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertNotNull(localGossipMember66);
        org.junit.Assert.assertNotNull(localGossipMemberList70);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList5 = startupSettings4.getGossipMembers();
        startupSettings4.setId("hi!");
        org.junit.Assert.assertNotNull(gossipMemberList5);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.google.code.gossip.GossipSettings gossipSettings11 = null;
        com.google.code.gossip.StartupSettings startupSettings13 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings11, "hi!");
        startupSettings13.setPort(10);
        startupSettings13.setPort((int) 'a');
        java.lang.String str18 = startupSettings13.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList19 = startupSettings13.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings20 = new com.google.code.gossip.GossipSettings();
        gossipSettings20.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener23 = null;
        com.google.code.gossip.GossipService gossipService24 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList19, gossipSettings20, gossipListener23);
        com.google.code.gossip.manager.GossipManager gossipManager25 = gossipService24.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings32 = null;
        com.google.code.gossip.StartupSettings startupSettings34 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings32, "hi!");
        startupSettings34.setPort(10);
        startupSettings34.setPort((int) 'a');
        java.lang.String str39 = startupSettings34.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList40 = startupSettings34.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings41 = new com.google.code.gossip.GossipSettings();
        gossipSettings41.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener44 = null;
        com.google.code.gossip.GossipService gossipService45 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList40, gossipSettings41, gossipListener44);
        com.google.code.gossip.manager.GossipManager gossipManager46 = gossipService45.get_gossipManager();
        gossipService24.set_gossipManager(gossipManager46);
        gossipManager46.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember50 = new com.google.code.gossip.LocalGossipMember("", "hi!", (int) '4', ":0", (long) (short) 0, (javax.management.NotificationListener) gossipManager46, (-1));
        com.google.code.gossip.LocalGossipMember localGossipMember51 = gossipManager46.getMyself();
        com.google.code.gossip.LocalGossipMember localGossipMember52 = gossipManager46.getMyself();
        localGossipMember52.setId("Member [address=:0, id=hi!, heartbeat=1698797234652]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(gossipMemberList19);
        org.junit.Assert.assertNotNull(gossipManager25);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(gossipMemberList40);
        org.junit.Assert.assertNotNull(gossipManager46);
        org.junit.Assert.assertNotNull(localGossipMember51);
        org.junit.Assert.assertNotNull(localGossipMember52);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("hi!", 0, (int) ' ', "hi!");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember9 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        java.lang.String str10 = remoteGossipMember9.getAddress();
        java.lang.String str11 = remoteGossipMember9.getAddress();
        startupSettings4.addGossipMember((com.google.code.gossip.GossipMember) remoteGossipMember9);
        java.lang.Class<?> wildcardClass13 = remoteGossipMember9.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":0" + "'", str10, ":0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":0" + "'", str11, ":0");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings27 = null;
        com.google.code.gossip.StartupSettings startupSettings29 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings27, "hi!");
        startupSettings29.setPort(10);
        startupSettings29.setPort((int) 'a');
        java.lang.String str34 = startupSettings29.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList35 = startupSettings29.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings36 = new com.google.code.gossip.GossipSettings();
        gossipSettings36.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener39 = null;
        com.google.code.gossip.GossipService gossipService40 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList35, gossipSettings36, gossipListener39);
        com.google.code.gossip.manager.GossipManager gossipManager41 = gossipService40.get_gossipManager();
        gossipService19.set_gossipManager(gossipManager41);
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList43 = gossipManager41.getDeadList();
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList44 = gossipManager41.getMemberList();
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList45 = gossipManager41.getMemberList();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(gossipMemberList35);
        org.junit.Assert.assertNotNull(gossipManager41);
        org.junit.Assert.assertNotNull(localGossipMemberList43);
        org.junit.Assert.assertNotNull(localGossipMemberList44);
        org.junit.Assert.assertNotNull(localGossipMemberList45);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember4 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        boolean boolean6 = remoteGossipMember4.equals((java.lang.Object) (byte) 1);
        boolean boolean8 = remoteGossipMember4.equals((java.lang.Object) 86400000L);
        remoteGossipMember4.setHeartbeat((long) (short) 10);
        java.lang.String str11 = remoteGossipMember4.getClusterName();
        remoteGossipMember4.setId("hi!");
        int int14 = remoteGossipMember4.getPort();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.google.code.gossip.GossipSettings gossipSettings2 = new com.google.code.gossip.GossipSettings();
        gossipSettings2.setCleanupInterval((int) (short) 0);
        gossipSettings2.setCleanupInterval(1000);
        gossipSettings2.setCleanupInterval(100);
        gossipSettings2.setCleanupInterval(10);
        com.google.code.gossip.StartupSettings startupSettings12 = new com.google.code.gossip.StartupSettings("hi!", (int) (short) -1, gossipSettings2, ":0");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        java.lang.Integer int2 = gossipMember0.getPort();
        gossipMember0.setPort((java.lang.Integer) 1);
        java.lang.String str5 = gossipMember0.getHost();
        java.lang.String str6 = gossipMember0.getCluster();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.Long long1 = gossipMember0.getHeartbeat();
        java.lang.String str2 = gossipMember0.getCluster();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.google.code.gossip.GossipSettings gossipSettings11 = null;
        com.google.code.gossip.StartupSettings startupSettings13 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings11, "hi!");
        startupSettings13.setPort(10);
        startupSettings13.setPort((int) 'a');
        java.lang.String str18 = startupSettings13.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList19 = startupSettings13.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings20 = new com.google.code.gossip.GossipSettings();
        gossipSettings20.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener23 = null;
        com.google.code.gossip.GossipService gossipService24 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList19, gossipSettings20, gossipListener23);
        com.google.code.gossip.manager.GossipManager gossipManager25 = gossipService24.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings32 = null;
        com.google.code.gossip.StartupSettings startupSettings34 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings32, "hi!");
        startupSettings34.setPort(10);
        startupSettings34.setPort((int) 'a');
        java.lang.String str39 = startupSettings34.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList40 = startupSettings34.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings41 = new com.google.code.gossip.GossipSettings();
        gossipSettings41.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener44 = null;
        com.google.code.gossip.GossipService gossipService45 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList40, gossipSettings41, gossipListener44);
        com.google.code.gossip.manager.GossipManager gossipManager46 = gossipService45.get_gossipManager();
        gossipService24.set_gossipManager(gossipManager46);
        com.google.code.gossip.LocalGossipMember localGossipMember49 = new com.google.code.gossip.LocalGossipMember("hi!", "Member [address=:0, id=hi!, heartbeat=1698797238955]", (int) (short) -1, "Member [address=:0, id=hi!, heartbeat=1698797232207]", (long) (-1), (javax.management.NotificationListener) gossipManager46, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(gossipMemberList19);
        org.junit.Assert.assertNotNull(gossipManager25);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(gossipMemberList40);
        org.junit.Assert.assertNotNull(gossipManager46);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        java.lang.Integer int2 = gossipMember0.getPort();
        gossipMember0.setPort((java.lang.Integer) 1);
        gossipMember0.setId("hi!");
        gossipMember0.setPort((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int2);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        gossipManager20.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember22 = gossipManager20.getMyself();
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList23 = gossipManager20.getDeadList();
        javax.management.Notification notification24 = null;
        com.google.code.gossip.GossipSettings gossipSettings31 = null;
        com.google.code.gossip.StartupSettings startupSettings33 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings31, "hi!");
        startupSettings33.setPort(10);
        startupSettings33.setPort((int) 'a');
        java.lang.String str38 = startupSettings33.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList39 = startupSettings33.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings40 = new com.google.code.gossip.GossipSettings();
        gossipSettings40.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener43 = null;
        com.google.code.gossip.GossipService gossipService44 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList39, gossipSettings40, gossipListener43);
        com.google.code.gossip.manager.GossipManager gossipManager45 = gossipService44.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings46 = gossipManager45.getSettings();
        gossipManager45.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            gossipManager20.handleNotification(notification24, (java.lang.Object) gossipManager45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertNotNull(localGossipMember22);
        org.junit.Assert.assertNotNull(localGossipMemberList23);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(gossipMemberList39);
        org.junit.Assert.assertNotNull(gossipManager45);
        org.junit.Assert.assertNotNull(gossipSettings46);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        javax.management.MBeanServer mBeanServer93 = null;
        javax.management.ObjectName objectName94 = null;
        javax.management.ObjectName objectName95 = gossipTimeoutTimer92.preRegister(mBeanServer93, objectName94);
        int int96 = gossipTimeoutTimer92.getNbNotifications();
        java.lang.String str98 = gossipTimeoutTimer92.getNotificationType((java.lang.Integer) 102400);
        boolean boolean99 = gossipTimeoutTimer92.getSendPastNotifications();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(objectName95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNull(str98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.google.code.gossip.model.GossipMember gossipMember5 = new com.google.code.gossip.model.GossipMember("hi!:1", "Member [address=:0, id=hi!, heartbeat=1698797234652]", (java.lang.Integer) 0, "Member [address=:0, id=hi!, heartbeat=1698797232207]", (java.lang.Long) 10L);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList21 = gossipManager20.getDeadList();
        com.google.code.gossip.LocalGossipMember localGossipMember22 = gossipManager20.getMyself();
        localGossipMember22.resetTimeoutTimer();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertNotNull(localGossipMemberList21);
        org.junit.Assert.assertNotNull(localGossipMember22);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        java.util.Vector<java.lang.Integer> intList93 = gossipTimeoutTimer92.getAllNotificationIDs();
        javax.management.MBeanServer mBeanServer94 = null;
        javax.management.ObjectName objectName95 = null;
        javax.management.ObjectName objectName96 = gossipTimeoutTimer92.preRegister(mBeanServer94, objectName95);
        gossipTimeoutTimer92.preDeregister();
        boolean boolean98 = gossipTimeoutTimer92.isEmpty();
        gossipTimeoutTimer92.removeAllNotifications();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(intList93);
        org.junit.Assert.assertNull(objectName96);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        com.google.code.gossip.GossipSettings gossipSettings8 = null;
        com.google.code.gossip.StartupSettings startupSettings10 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings8, "hi!");
        startupSettings10.setPort(10);
        startupSettings10.setPort((int) 'a');
        java.lang.String str15 = startupSettings10.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList16 = startupSettings10.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings17 = new com.google.code.gossip.GossipSettings();
        gossipSettings17.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener20 = null;
        com.google.code.gossip.GossipService gossipService21 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList16, gossipSettings17, gossipListener20);
        com.google.code.gossip.manager.GossipManager gossipManager22 = gossipService21.get_gossipManager();
        gossipManager22.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings24 = gossipManager22.getSettings();
        gossipSettings24.setCleanupInterval(10);
        com.google.code.gossip.StartupSettings startupSettings28 = new com.google.code.gossip.StartupSettings("hi!", (int) (short) -1, gossipSettings24, ":0");
        com.google.code.gossip.GossipService gossipService29 = new com.google.code.gossip.GossipService(startupSettings28);
        int int30 = startupSettings28.getPort();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList31 = startupSettings28.getGossipMembers();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(gossipMemberList16);
        org.junit.Assert.assertNotNull(gossipManager22);
        org.junit.Assert.assertNotNull(gossipSettings24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(gossipMemberList31);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        javax.management.MBeanServer mBeanServer93 = null;
        javax.management.ObjectName objectName94 = null;
        javax.management.ObjectName objectName95 = gossipTimeoutTimer92.preRegister(mBeanServer93, objectName94);
        java.lang.Object obj97 = gossipTimeoutTimer92.getNotificationUserData((java.lang.Integer) 102400);
        gossipTimeoutTimer92.setSendPastNotifications(false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(objectName95);
        org.junit.Assert.assertNull(obj97);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.google.code.gossip.model.GossipMember gossipMember5 = new com.google.code.gossip.model.GossipMember("hi!", ":0", (java.lang.Integer) 100, "hi!", (java.lang.Long) 0L);
        java.lang.String str6 = gossipMember5.getHost();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":0" + "'", str6, ":0");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("hi!", 0, (int) ' ', "hi!");
        startupSettings4.setCluster(":0");
        com.google.code.gossip.GossipSettings gossipSettings13 = null;
        com.google.code.gossip.StartupSettings startupSettings15 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings13, "hi!");
        startupSettings15.setPort(10);
        startupSettings15.setPort((int) 'a');
        java.lang.String str20 = startupSettings15.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList21 = startupSettings15.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings22 = new com.google.code.gossip.GossipSettings();
        gossipSettings22.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener25 = null;
        com.google.code.gossip.GossipService gossipService26 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList21, gossipSettings22, gossipListener25);
        com.google.code.gossip.manager.GossipManager gossipManager27 = gossipService26.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = gossipManager27.getSettings();
        com.google.code.gossip.GossipSettings gossipSettings35 = null;
        com.google.code.gossip.StartupSettings startupSettings37 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings35, "hi!");
        startupSettings37.setPort(10);
        startupSettings37.setPort((int) 'a');
        java.lang.String str42 = startupSettings37.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList43 = startupSettings37.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings44 = new com.google.code.gossip.GossipSettings();
        gossipSettings44.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener47 = null;
        com.google.code.gossip.GossipService gossipService48 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList43, gossipSettings44, gossipListener47);
        com.google.code.gossip.manager.GossipManager gossipManager49 = gossipService48.get_gossipManager();
        gossipManager49.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember51 = gossipManager49.getMyself();
        gossipManager27.revivieMember(localGossipMember51);
        java.lang.String str53 = localGossipMember51.getHost();
        startupSettings4.addGossipMember((com.google.code.gossip.GossipMember) localGossipMember51);
        startupSettings4.setId("Member [address=:0, id=hi!, heartbeat=1698797234652]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(gossipMemberList21);
        org.junit.Assert.assertNotNull(gossipManager27);
        org.junit.Assert.assertNotNull(gossipSettings28);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(gossipMemberList43);
        org.junit.Assert.assertNotNull(gossipManager49);
        org.junit.Assert.assertNotNull(localGossipMember51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember4 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (byte) 1, "Member [address=:0, id=hi!, heartbeat=1698797232207]");
        long long5 = remoteGossipMember4.getHeartbeat();
        int int6 = remoteGossipMember4.getPort();
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698797244075L + "'", long5 == 1698797244075L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (byte) 10, (-1), "Member [address=:0, id=hi!, heartbeat=1698797234652]");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        gossipManager20.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings22 = gossipManager20.getSettings();
        int int23 = gossipSettings22.getGossipInterval();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertNotNull(gossipSettings22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1000 + "'", int23 == 1000);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        javax.management.NotificationListener notificationListener1 = null;
        com.google.code.gossip.GossipSettings gossipSettings8 = null;
        com.google.code.gossip.StartupSettings startupSettings10 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings8, "hi!");
        startupSettings10.setPort(10);
        startupSettings10.setPort((int) 'a');
        java.lang.String str15 = startupSettings10.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList16 = startupSettings10.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings17 = new com.google.code.gossip.GossipSettings();
        gossipSettings17.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener20 = null;
        com.google.code.gossip.GossipService gossipService21 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList16, gossipSettings17, gossipListener20);
        com.google.code.gossip.manager.GossipManager gossipManager22 = gossipService21.get_gossipManager();
        gossipManager22.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings30 = null;
        com.google.code.gossip.StartupSettings startupSettings32 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings30, "hi!");
        startupSettings32.setPort(10);
        startupSettings32.setPort((int) 'a');
        java.lang.String str37 = startupSettings32.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList38 = startupSettings32.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings39 = new com.google.code.gossip.GossipSettings();
        gossipSettings39.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener42 = null;
        com.google.code.gossip.GossipService gossipService43 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList38, gossipSettings39, gossipListener42);
        com.google.code.gossip.manager.GossipManager gossipManager44 = gossipService43.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings45 = gossipManager44.getSettings();
        com.google.code.gossip.GossipSettings gossipSettings52 = null;
        com.google.code.gossip.StartupSettings startupSettings54 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings52, "hi!");
        startupSettings54.setPort(10);
        startupSettings54.setPort((int) 'a');
        java.lang.String str59 = startupSettings54.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList60 = startupSettings54.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings61 = new com.google.code.gossip.GossipSettings();
        gossipSettings61.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener64 = null;
        com.google.code.gossip.GossipService gossipService65 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList60, gossipSettings61, gossipListener64);
        com.google.code.gossip.manager.GossipManager gossipManager66 = gossipService65.get_gossipManager();
        gossipManager66.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember68 = gossipManager66.getMyself();
        gossipManager44.revivieMember(localGossipMember68);
        gossipManager22.revivieMember(localGossipMember68);
        // The following exception was thrown during execution in test generation
        try {
            com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer71 = new com.google.code.gossip.GossipTimeoutTimer((long) 'a', notificationListener1, localGossipMember68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Listener can't be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(gossipMemberList16);
        org.junit.Assert.assertNotNull(gossipManager22);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(gossipMemberList38);
        org.junit.Assert.assertNotNull(gossipManager44);
        org.junit.Assert.assertNotNull(gossipSettings45);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(gossipMemberList60);
        org.junit.Assert.assertNotNull(gossipManager66);
        org.junit.Assert.assertNotNull(localGossipMember68);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        javax.management.MBeanServer mBeanServer93 = null;
        javax.management.ObjectName objectName94 = null;
        javax.management.ObjectName objectName95 = gossipTimeoutTimer92.preRegister(mBeanServer93, objectName94);
        int int96 = gossipTimeoutTimer92.getNbNotifications();
        gossipTimeoutTimer92.start();
        java.lang.Object obj99 = gossipTimeoutTimer92.getNotificationUserData((java.lang.Integer) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(objectName95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNull(obj99);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        java.lang.String str2 = gossipMember0.getHost();
        gossipMember0.setPort((java.lang.Integer) 1000);
        java.lang.String str5 = gossipMember0.getId();
        gossipMember0.setCluster("Member [address=:0, id=hi!, heartbeat=1698797238955]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        gossipMember0.setCluster(":0");
        gossipMember0.setHost("");
        gossipMember0.setCluster("");
        gossipMember0.setHost("Member [address=:0, id=hi!, heartbeat=1698797234652]");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        java.lang.String str93 = localGossipMember89.getId();
        localGossipMember89.disableTimer();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        gossipTimeoutTimer92.reset();
        gossipTimeoutTimer92.postRegister((java.lang.Boolean) true);
        gossipTimeoutTimer92.stop();
        gossipTimeoutTimer92.stop();
        gossipTimeoutTimer92.postRegister((java.lang.Boolean) true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.google.code.gossip.GossipSettings gossipSettings11 = null;
        com.google.code.gossip.StartupSettings startupSettings13 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings11, "hi!");
        startupSettings13.setPort(10);
        startupSettings13.setPort((int) 'a');
        java.lang.String str18 = startupSettings13.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList19 = startupSettings13.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings20 = new com.google.code.gossip.GossipSettings();
        gossipSettings20.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener23 = null;
        com.google.code.gossip.GossipService gossipService24 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList19, gossipSettings20, gossipListener23);
        com.google.code.gossip.manager.GossipManager gossipManager25 = gossipService24.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings32 = null;
        com.google.code.gossip.StartupSettings startupSettings34 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings32, "hi!");
        startupSettings34.setPort(10);
        startupSettings34.setPort((int) 'a');
        java.lang.String str39 = startupSettings34.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList40 = startupSettings34.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings41 = new com.google.code.gossip.GossipSettings();
        gossipSettings41.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener44 = null;
        com.google.code.gossip.GossipService gossipService45 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList40, gossipSettings41, gossipListener44);
        com.google.code.gossip.manager.GossipManager gossipManager46 = gossipService45.get_gossipManager();
        gossipService24.set_gossipManager(gossipManager46);
        gossipManager46.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember50 = new com.google.code.gossip.LocalGossipMember("", "hi!", (int) '4', ":0", (long) (short) 0, (javax.management.NotificationListener) gossipManager46, (-1));
        com.google.code.gossip.GossipSettings gossipSettings51 = gossipManager46.getSettings();
        com.google.code.gossip.LocalGossipMember localGossipMember52 = gossipManager46.getMyself();
        com.google.code.gossip.GossipSettings gossipSettings53 = gossipManager46.getSettings();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(gossipMemberList19);
        org.junit.Assert.assertNotNull(gossipManager25);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(gossipMemberList40);
        org.junit.Assert.assertNotNull(gossipManager46);
        org.junit.Assert.assertNotNull(gossipSettings51);
        org.junit.Assert.assertNotNull(localGossipMember52);
        org.junit.Assert.assertNotNull(gossipSettings53);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        java.lang.String str2 = gossipMember0.getHost();
        java.lang.Integer int3 = gossipMember0.getPort();
        java.lang.Long long4 = gossipMember0.getHeartbeat();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        gossipTimeoutTimer92.reset();
        gossipTimeoutTimer92.postRegister((java.lang.Boolean) true);
        gossipTimeoutTimer92.stop();
        java.lang.Long long98 = gossipTimeoutTimer92.getNbOccurences((java.lang.Integer) (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(long98);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.google.code.gossip.GossipSettings gossipSettings6 = new com.google.code.gossip.GossipSettings();
        gossipSettings6.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.StartupSettings startupSettings10 = new com.google.code.gossip.StartupSettings("", (int) (short) 10, gossipSettings6, ":0");
        com.google.code.gossip.StartupSettings startupSettings12 = new com.google.code.gossip.StartupSettings("hi!:1", 100, gossipSettings6, "Member [address=:0, id=hi!, heartbeat=1698797238955]");
        com.google.code.gossip.StartupSettings startupSettings14 = new com.google.code.gossip.StartupSettings("hi!:1", 97, gossipSettings6, "Member [address=:0, id=hi!, heartbeat=1698797238955]");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        gossipMember0.setCluster(":0");
        gossipMember0.setHost("");
        gossipMember0.setCluster("");
        gossipMember0.setPort((java.lang.Integer) 5);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        java.lang.String str5 = startupSettings4.getCluster();
        java.lang.String str6 = startupSettings4.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList7 = startupSettings4.getGossipMembers();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList8 = startupSettings4.getGossipMembers();
        startupSettings4.setPort((int) 'a');
        com.google.code.gossip.GossipSettings gossipSettings11 = startupSettings4.getGossipSettings();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(gossipMemberList7);
        org.junit.Assert.assertNotNull(gossipMemberList8);
        org.junit.Assert.assertNull(gossipSettings11);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        gossipService19.start();
        com.google.code.gossip.GossipSettings gossipSettings27 = null;
        com.google.code.gossip.StartupSettings startupSettings29 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings27, "hi!");
        startupSettings29.setPort(10);
        startupSettings29.setPort((int) 'a');
        java.lang.String str34 = startupSettings29.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList35 = startupSettings29.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings36 = new com.google.code.gossip.GossipSettings();
        gossipSettings36.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener39 = null;
        com.google.code.gossip.GossipService gossipService40 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList35, gossipSettings36, gossipListener39);
        com.google.code.gossip.manager.GossipManager gossipManager41 = gossipService40.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings48 = null;
        com.google.code.gossip.StartupSettings startupSettings50 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings48, "hi!");
        startupSettings50.setPort(10);
        startupSettings50.setPort((int) 'a');
        java.lang.String str55 = startupSettings50.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList56 = startupSettings50.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings57 = new com.google.code.gossip.GossipSettings();
        gossipSettings57.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener60 = null;
        com.google.code.gossip.GossipService gossipService61 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList56, gossipSettings57, gossipListener60);
        com.google.code.gossip.manager.GossipManager gossipManager62 = gossipService61.get_gossipManager();
        gossipService40.set_gossipManager(gossipManager62);
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList64 = gossipManager62.getDeadList();
        gossipService19.set_gossipManager(gossipManager62);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(gossipMemberList35);
        org.junit.Assert.assertNotNull(gossipManager41);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(gossipMemberList56);
        org.junit.Assert.assertNotNull(gossipManager62);
        org.junit.Assert.assertNotNull(localGossipMemberList64);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.google.code.gossip.GossipSettings gossipSettings2 = new com.google.code.gossip.GossipSettings(0, (int) (short) 100);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        java.lang.Class<?> wildcardClass20 = gossipMemberList14.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.google.code.gossip.GossipSettings gossipSettings14 = null;
        com.google.code.gossip.StartupSettings startupSettings16 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings14, "hi!");
        startupSettings16.setPort(10);
        startupSettings16.setPort((int) 'a');
        java.lang.String str21 = startupSettings16.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList22 = startupSettings16.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings23 = new com.google.code.gossip.GossipSettings();
        gossipSettings23.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener26 = null;
        com.google.code.gossip.GossipService gossipService27 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList22, gossipSettings23, gossipListener26);
        com.google.code.gossip.GossipSettings gossipSettings28 = new com.google.code.gossip.GossipSettings();
        gossipSettings28.setCleanupInterval((int) (short) 0);
        gossipSettings28.setCleanupInterval(1000);
        gossipSettings28.setCleanupInterval(100);
        com.google.code.gossip.event.GossipListener gossipListener35 = null;
        com.google.code.gossip.GossipService gossipService36 = new com.google.code.gossip.GossipService("", "hi!", 0, "", gossipMemberList22, gossipSettings28, gossipListener35);
        com.google.code.gossip.GossipSettings gossipSettings45 = null;
        com.google.code.gossip.StartupSettings startupSettings47 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings45, "hi!");
        startupSettings47.setPort(10);
        startupSettings47.setPort((int) 'a');
        java.lang.String str52 = startupSettings47.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList53 = startupSettings47.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings54 = new com.google.code.gossip.GossipSettings();
        gossipSettings54.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener57 = null;
        com.google.code.gossip.GossipService gossipService58 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList53, gossipSettings54, gossipListener57);
        com.google.code.gossip.manager.GossipManager gossipManager59 = gossipService58.get_gossipManager();
        gossipManager59.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings61 = gossipManager59.getSettings();
        gossipSettings61.setCleanupInterval(10);
        com.google.code.gossip.StartupSettings startupSettings65 = new com.google.code.gossip.StartupSettings(":0", (int) (short) 100, gossipSettings61, "hi!");
        com.google.code.gossip.event.GossipListener gossipListener66 = null;
        com.google.code.gossip.GossipService gossipService67 = new com.google.code.gossip.GossipService("", ":0", (int) (byte) 1, "hi!", gossipMemberList22, gossipSettings61, gossipListener66);
        com.google.code.gossip.manager.GossipManager gossipManager68 = gossipService67.get_gossipManager();
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(gossipMemberList22);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(gossipMemberList53);
        org.junit.Assert.assertNotNull(gossipManager59);
        org.junit.Assert.assertNotNull(gossipSettings61);
        org.junit.Assert.assertNotNull(gossipManager68);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        javax.management.MBeanServer mBeanServer93 = null;
        javax.management.ObjectName objectName94 = null;
        javax.management.ObjectName objectName95 = gossipTimeoutTimer92.preRegister(mBeanServer93, objectName94);
        int int96 = gossipTimeoutTimer92.getNbNotifications();
        java.util.Vector<java.lang.Integer> intList97 = gossipTimeoutTimer92.getAllNotificationIDs();
        java.util.Vector<java.lang.Integer> intList99 = gossipTimeoutTimer92.getNotificationIDs("hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(objectName95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNotNull(intList97);
        org.junit.Assert.assertNotNull(intList99);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        javax.management.MBeanServer mBeanServer93 = null;
        javax.management.ObjectName objectName94 = null;
        javax.management.ObjectName objectName95 = gossipTimeoutTimer92.preRegister(mBeanServer93, objectName94);
        int int96 = gossipTimeoutTimer92.getNbNotifications();
        java.lang.Object obj98 = gossipTimeoutTimer92.getNotificationUserData((java.lang.Integer) 5);
        boolean boolean99 = gossipTimeoutTimer92.isActive();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(objectName95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNull(obj98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (byte) 0, 1000, "Member [address=:0, id=hi!, heartbeat=1698797238955]");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.google.code.gossip.GossipSettings gossipSettings11 = null;
        com.google.code.gossip.StartupSettings startupSettings13 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings11, "hi!");
        startupSettings13.setPort(10);
        startupSettings13.setPort((int) 'a');
        java.lang.String str18 = startupSettings13.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList19 = startupSettings13.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings20 = new com.google.code.gossip.GossipSettings();
        gossipSettings20.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener23 = null;
        com.google.code.gossip.GossipService gossipService24 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList19, gossipSettings20, gossipListener23);
        com.google.code.gossip.manager.GossipManager gossipManager25 = gossipService24.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings32 = null;
        com.google.code.gossip.StartupSettings startupSettings34 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings32, "hi!");
        startupSettings34.setPort(10);
        startupSettings34.setPort((int) 'a');
        java.lang.String str39 = startupSettings34.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList40 = startupSettings34.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings41 = new com.google.code.gossip.GossipSettings();
        gossipSettings41.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener44 = null;
        com.google.code.gossip.GossipService gossipService45 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList40, gossipSettings41, gossipListener44);
        com.google.code.gossip.manager.GossipManager gossipManager46 = gossipService45.get_gossipManager();
        gossipService24.set_gossipManager(gossipManager46);
        gossipManager46.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember50 = new com.google.code.gossip.LocalGossipMember("", "hi!", (int) '4', ":0", (long) (short) 0, (javax.management.NotificationListener) gossipManager46, (-1));
        com.google.code.gossip.GossipSettings gossipSettings51 = gossipManager46.getSettings();
        // The following exception was thrown during execution in test generation
        try {
            com.google.code.gossip.manager.impl.OnlyProcessReceivedPassiveGossipThread onlyProcessReceivedPassiveGossipThread52 = new com.google.code.gossip.manager.impl.OnlyProcessReceivedPassiveGossipThread(gossipManager46);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.net.BindException: Can't assign requested address (Bind failed)");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(gossipMemberList19);
        org.junit.Assert.assertNotNull(gossipManager25);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(gossipMemberList40);
        org.junit.Assert.assertNotNull(gossipManager46);
        org.junit.Assert.assertNotNull(gossipSettings51);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        gossipTimeoutTimer92.reset();
        gossipTimeoutTimer92.postRegister((java.lang.Boolean) true);
        java.lang.Object obj97 = gossipTimeoutTimer92.getNotificationUserData((java.lang.Integer) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(obj97);
// flaky:         org.junit.Assert.assertEquals(obj97.toString(), "Member [address=hi!:1, id=, heartbeat=1698797245592]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj97), "Member [address=hi!:1, id=, heartbeat=1698797245592]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj97), "Member [address=hi!:1, id=, heartbeat=1698797245592]");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", 5, (int) (short) 10, "hi!");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList4 = null;
        com.google.code.gossip.GossipSettings gossipSettings13 = null;
        com.google.code.gossip.StartupSettings startupSettings15 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings13, "hi!");
        startupSettings15.setPort(10);
        startupSettings15.setPort((int) 'a');
        java.lang.String str20 = startupSettings15.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList21 = startupSettings15.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings22 = new com.google.code.gossip.GossipSettings();
        gossipSettings22.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener25 = null;
        com.google.code.gossip.GossipService gossipService26 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList21, gossipSettings22, gossipListener25);
        com.google.code.gossip.manager.GossipManager gossipManager27 = gossipService26.get_gossipManager();
        gossipManager27.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings29 = gossipManager27.getSettings();
        gossipSettings29.setCleanupInterval(10);
        com.google.code.gossip.StartupSettings startupSettings33 = new com.google.code.gossip.StartupSettings(":0", (int) (short) 100, gossipSettings29, "hi!");
        com.google.code.gossip.event.GossipListener gossipListener34 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.code.gossip.GossipService gossipService35 = new com.google.code.gossip.GossipService("", "Member [address=:0, id=hi!, heartbeat=1698797234652]", 97, "Member [address=:0, id=hi!, heartbeat=1698797238955]", gossipMemberList4, gossipSettings29, gossipListener34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(gossipMemberList21);
        org.junit.Assert.assertNotNull(gossipManager27);
        org.junit.Assert.assertNotNull(gossipSettings29);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.google.code.gossip.GossipSettings gossipSettings11 = null;
        com.google.code.gossip.StartupSettings startupSettings13 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings11, "hi!");
        startupSettings13.setPort(10);
        startupSettings13.setPort((int) 'a');
        java.lang.String str18 = startupSettings13.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList19 = startupSettings13.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings20 = new com.google.code.gossip.GossipSettings();
        gossipSettings20.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener23 = null;
        com.google.code.gossip.GossipService gossipService24 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList19, gossipSettings20, gossipListener23);
        com.google.code.gossip.manager.GossipManager gossipManager25 = gossipService24.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings26 = gossipManager25.getSettings();
        com.google.code.gossip.LocalGossipMember localGossipMember28 = new com.google.code.gossip.LocalGossipMember("Member [address=:0, id=hi!, heartbeat=1698797234652]", "hi!", 97, "Member [address=:0, id=hi!, heartbeat=1698797234652]", 1698797234974L, (javax.management.NotificationListener) gossipManager25, (int) '#');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(gossipMemberList19);
        org.junit.Assert.assertNotNull(gossipManager25);
        org.junit.Assert.assertNotNull(gossipSettings26);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        java.lang.Integer int2 = gossipMember0.getPort();
        gossipMember0.setPort((java.lang.Integer) 1);
        java.lang.Long long5 = gossipMember0.getHeartbeat();
        java.lang.String str6 = gossipMember0.getHost();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList22 = gossipManager21.getDeadList();
        com.google.code.gossip.LocalGossipMember localGossipMember23 = gossipManager21.getMyself();
        com.google.code.gossip.GossipSettings gossipSettings30 = null;
        com.google.code.gossip.StartupSettings startupSettings32 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings30, "hi!");
        startupSettings32.setPort(10);
        startupSettings32.setPort((int) 'a');
        java.lang.String str37 = startupSettings32.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList38 = startupSettings32.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings39 = new com.google.code.gossip.GossipSettings();
        gossipSettings39.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener42 = null;
        com.google.code.gossip.GossipService gossipService43 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList38, gossipSettings39, gossipListener42);
        com.google.code.gossip.manager.GossipManager gossipManager44 = gossipService43.get_gossipManager();
        gossipManager44.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings52 = null;
        com.google.code.gossip.StartupSettings startupSettings54 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings52, "hi!");
        startupSettings54.setPort(10);
        startupSettings54.setPort((int) 'a');
        java.lang.String str59 = startupSettings54.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList60 = startupSettings54.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings61 = new com.google.code.gossip.GossipSettings();
        gossipSettings61.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener64 = null;
        com.google.code.gossip.GossipService gossipService65 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList60, gossipSettings61, gossipListener64);
        com.google.code.gossip.manager.GossipManager gossipManager66 = gossipService65.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings67 = gossipManager66.getSettings();
        com.google.code.gossip.GossipSettings gossipSettings74 = null;
        com.google.code.gossip.StartupSettings startupSettings76 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings74, "hi!");
        startupSettings76.setPort(10);
        startupSettings76.setPort((int) 'a');
        java.lang.String str81 = startupSettings76.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList82 = startupSettings76.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings83 = new com.google.code.gossip.GossipSettings();
        gossipSettings83.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener86 = null;
        com.google.code.gossip.GossipService gossipService87 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList82, gossipSettings83, gossipListener86);
        com.google.code.gossip.manager.GossipManager gossipManager88 = gossipService87.get_gossipManager();
        gossipManager88.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember90 = gossipManager88.getMyself();
        gossipManager66.revivieMember(localGossipMember90);
        gossipManager44.revivieMember(localGossipMember90);
        localGossipMember90.startTimeoutTimer();
        java.lang.String str94 = localGossipMember90.getId();
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer95 = new com.google.code.gossip.GossipTimeoutTimer(1L, (javax.management.NotificationListener) gossipManager21, localGossipMember90);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertNotNull(localGossipMemberList22);
        org.junit.Assert.assertNotNull(localGossipMember23);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(gossipMemberList38);
        org.junit.Assert.assertNotNull(gossipManager44);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(gossipMemberList60);
        org.junit.Assert.assertNotNull(gossipManager66);
        org.junit.Assert.assertNotNull(gossipSettings67);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(gossipMemberList82);
        org.junit.Assert.assertNotNull(gossipManager88);
        org.junit.Assert.assertNotNull(localGossipMember90);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        gossipManager20.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember22 = gossipManager20.getMyself();
        localGossipMember22.setHeartbeat((long) (short) 0);
        java.lang.String str25 = localGossipMember22.toString();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertNotNull(localGossipMember22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Member [address=hi!:1, id=, heartbeat=0]" + "'", str25, "Member [address=hi!:1, id=, heartbeat=0]");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("Member [address=hi!:1, id=, heartbeat=0]", 1000, (int) (byte) 10, "Member [address=:0, id=hi!, heartbeat=1698797232207]");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        gossipService19.start();
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService19.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings49 = null;
        com.google.code.gossip.StartupSettings startupSettings51 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings49, "hi!");
        startupSettings51.setPort(10);
        startupSettings51.setPort((int) 'a');
        java.lang.String str56 = startupSettings51.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList57 = startupSettings51.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings58 = new com.google.code.gossip.GossipSettings();
        gossipSettings58.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener61 = null;
        com.google.code.gossip.GossipService gossipService62 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList57, gossipSettings58, gossipListener61);
        com.google.code.gossip.manager.GossipManager gossipManager63 = gossipService62.get_gossipManager();
        gossipService41.set_gossipManager(gossipManager63);
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList65 = gossipManager63.getDeadList();
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList66 = gossipManager63.getMemberList();
        com.google.code.gossip.LocalGossipMember localGossipMember67 = gossipManager63.getMyself();
        gossipService19.set_gossipManager(gossipManager63);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(gossipMemberList57);
        org.junit.Assert.assertNotNull(gossipManager63);
        org.junit.Assert.assertNotNull(localGossipMemberList65);
        org.junit.Assert.assertNotNull(localGossipMemberList66);
        org.junit.Assert.assertNotNull(localGossipMember67);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        java.util.Vector<java.lang.Integer> intList93 = gossipTimeoutTimer92.getAllNotificationIDs();
        java.lang.String str95 = gossipTimeoutTimer92.getNotificationType((java.lang.Integer) 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(intList93);
        org.junit.Assert.assertNull(str95);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("hi!", 0, (int) ' ', "hi!");
        com.google.code.gossip.GossipService gossipService5 = new com.google.code.gossip.GossipService(startupSettings4);
        startupSettings4.setPort((int) (short) 10);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.google.code.gossip.GossipSettings gossipSettings8 = null;
        com.google.code.gossip.StartupSettings startupSettings10 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings8, "hi!");
        startupSettings10.setPort(10);
        startupSettings10.setPort((int) 'a');
        java.lang.String str15 = startupSettings10.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList16 = startupSettings10.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings17 = new com.google.code.gossip.GossipSettings();
        gossipSettings17.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener20 = null;
        com.google.code.gossip.GossipService gossipService21 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList16, gossipSettings17, gossipListener20);
        int int22 = gossipSettings17.getGossipInterval();
        com.google.code.gossip.StartupSettings startupSettings24 = new com.google.code.gossip.StartupSettings(":0", (int) (byte) 1, gossipSettings17, "Member [address=:0, id=hi!, heartbeat=1698797232207]");
        gossipSettings17.setGossipTimeout((int) '4');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(gossipMemberList16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1000 + "'", int22 == 1000);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        startupSettings4.setPort(10);
        startupSettings4.setId("");
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList9 = startupSettings4.getGossipMembers();
        org.junit.Assert.assertNotNull(gossipMemberList9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.google.code.gossip.model.GossipMember gossipMember5 = new com.google.code.gossip.model.GossipMember("hi!", "", (java.lang.Integer) 10, "Member [address=:0, id=hi!, heartbeat=1698797232207]", (java.lang.Long) 0L);
        java.lang.String str6 = gossipMember5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Member [address=:0, id=hi!, heartbeat=1698797232207]" + "'", str6, "Member [address=:0, id=hi!, heartbeat=1698797232207]");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        java.util.Vector<java.lang.Integer> intList93 = gossipTimeoutTimer92.getAllNotificationIDs();
        javax.management.MBeanServer mBeanServer94 = null;
        javax.management.ObjectName objectName95 = null;
        javax.management.ObjectName objectName96 = gossipTimeoutTimer92.preRegister(mBeanServer94, objectName95);
        gossipTimeoutTimer92.start();
        gossipTimeoutTimer92.setSendPastNotifications(true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(intList93);
        org.junit.Assert.assertNull(objectName96);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList21 = gossipManager20.getDeadList();
        com.google.code.gossip.manager.random.RandomActiveGossipThread randomActiveGossipThread22 = new com.google.code.gossip.manager.random.RandomActiveGossipThread(gossipManager20);
        randomActiveGossipThread22.shutdown();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertNotNull(localGossipMemberList21);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("hi!", 0, (int) ' ', "hi!");
        com.google.code.gossip.GossipService gossipService5 = new com.google.code.gossip.GossipService(startupSettings4);
        com.google.code.gossip.GossipSettings gossipSettings8 = null;
        com.google.code.gossip.StartupSettings startupSettings10 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings8, "hi!");
        java.lang.String str11 = startupSettings10.getCluster();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList12 = startupSettings10.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings19 = null;
        com.google.code.gossip.StartupSettings startupSettings21 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings19, "hi!");
        startupSettings21.setPort(10);
        startupSettings21.setPort((int) 'a');
        java.lang.String str26 = startupSettings21.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList27 = startupSettings21.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings28 = new com.google.code.gossip.GossipSettings();
        gossipSettings28.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener31 = null;
        com.google.code.gossip.GossipService gossipService32 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList27, gossipSettings28, gossipListener31);
        com.google.code.gossip.manager.GossipManager gossipManager33 = gossipService32.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings34 = gossipManager33.getSettings();
        com.google.code.gossip.GossipSettings gossipSettings41 = null;
        com.google.code.gossip.StartupSettings startupSettings43 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings41, "hi!");
        startupSettings43.setPort(10);
        startupSettings43.setPort((int) 'a');
        java.lang.String str48 = startupSettings43.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList49 = startupSettings43.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings50 = new com.google.code.gossip.GossipSettings();
        gossipSettings50.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener53 = null;
        com.google.code.gossip.GossipService gossipService54 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList49, gossipSettings50, gossipListener53);
        com.google.code.gossip.manager.GossipManager gossipManager55 = gossipService54.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings56 = gossipManager55.getSettings();
        com.google.code.gossip.GossipSettings gossipSettings63 = null;
        com.google.code.gossip.StartupSettings startupSettings65 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings63, "hi!");
        startupSettings65.setPort(10);
        startupSettings65.setPort((int) 'a');
        java.lang.String str70 = startupSettings65.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList71 = startupSettings65.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings72 = new com.google.code.gossip.GossipSettings();
        gossipSettings72.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener75 = null;
        com.google.code.gossip.GossipService gossipService76 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList71, gossipSettings72, gossipListener75);
        com.google.code.gossip.manager.GossipManager gossipManager77 = gossipService76.get_gossipManager();
        gossipManager77.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember79 = gossipManager77.getMyself();
        gossipManager55.revivieMember(localGossipMember79);
        gossipManager33.createOrRevivieMember(localGossipMember79);
        startupSettings10.addGossipMember((com.google.code.gossip.GossipMember) localGossipMember79);
        startupSettings4.addGossipMember((com.google.code.gossip.GossipMember) localGossipMember79);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(gossipMemberList12);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(gossipMemberList27);
        org.junit.Assert.assertNotNull(gossipManager33);
        org.junit.Assert.assertNotNull(gossipSettings34);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(gossipMemberList49);
        org.junit.Assert.assertNotNull(gossipManager55);
        org.junit.Assert.assertNotNull(gossipSettings56);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(gossipMemberList71);
        org.junit.Assert.assertNotNull(gossipManager77);
        org.junit.Assert.assertNotNull(localGossipMember79);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        java.util.Vector<java.lang.Integer> intList93 = gossipTimeoutTimer92.getAllNotificationIDs();
        javax.management.MBeanNotificationInfo[] mBeanNotificationInfoArray94 = gossipTimeoutTimer92.getNotificationInfo();
        gossipTimeoutTimer92.postRegister((java.lang.Boolean) true);
        gossipTimeoutTimer92.stop();
        gossipTimeoutTimer92.removeAllNotifications();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(intList93);
        org.junit.Assert.assertNotNull(mBeanNotificationInfoArray94);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.google.code.gossip.model.ActiveGossipMessage activeGossipMessage0 = new com.google.code.gossip.model.ActiveGossipMessage();
        com.google.code.gossip.model.GossipMember gossipMember1 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str2 = gossipMember1.getHost();
        com.google.code.gossip.model.GossipMember gossipMember3 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str4 = gossipMember3.getHost();
        gossipMember3.setHeartbeat((java.lang.Long) 60000L);
        com.google.code.gossip.model.GossipMember gossipMember7 = new com.google.code.gossip.model.GossipMember();
        com.google.code.gossip.model.GossipMember[] gossipMemberArray8 = new com.google.code.gossip.model.GossipMember[] { gossipMember1, gossipMember3, gossipMember7 };
        java.util.ArrayList<com.google.code.gossip.model.GossipMember> gossipMemberList9 = new java.util.ArrayList<com.google.code.gossip.model.GossipMember>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.code.gossip.model.GossipMember>) gossipMemberList9, gossipMemberArray8);
        activeGossipMessage0.setMembers((java.util.List<com.google.code.gossip.model.GossipMember>) gossipMemberList9);
        java.util.List<com.google.code.gossip.model.GossipMember> gossipMemberList12 = activeGossipMessage0.getMembers();
        java.util.List<com.google.code.gossip.model.GossipMember> gossipMemberList13 = activeGossipMessage0.getMembers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(gossipMemberArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(gossipMemberList12);
        org.junit.Assert.assertNotNull(gossipMemberList13);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        gossipManager20.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember22 = gossipManager20.getMyself();
        javax.management.Notification notification23 = null;
        // The following exception was thrown during execution in test generation
        try {
            gossipManager20.handleNotification(notification23, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertNotNull(localGossipMember22);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.google.code.gossip.GossipSettings gossipSettings10 = null;
        com.google.code.gossip.StartupSettings startupSettings12 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings10, "hi!");
        startupSettings12.setPort(10);
        startupSettings12.setPort((int) 'a');
        java.lang.String str17 = startupSettings12.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList18 = startupSettings12.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings19 = new com.google.code.gossip.GossipSettings();
        gossipSettings19.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener22 = null;
        com.google.code.gossip.GossipService gossipService23 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList18, gossipSettings19, gossipListener22);
        com.google.code.gossip.manager.GossipManager gossipManager24 = gossipService23.get_gossipManager();
        gossipManager24.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings26 = gossipManager24.getSettings();
        gossipSettings26.setCleanupInterval(10);
        com.google.code.gossip.GossipSettings gossipSettings31 = null;
        com.google.code.gossip.StartupSettings startupSettings33 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings31, "hi!");
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList34 = startupSettings33.getGossipMembers();
        com.google.code.gossip.event.GossipListener gossipListener35 = null;
        com.google.code.gossip.manager.random.RandomGossipManager randomGossipManager36 = new com.google.code.gossip.manager.random.RandomGossipManager(":0", "hi!", (int) (byte) 0, "", gossipSettings26, gossipMemberList34, gossipListener35);
        com.google.code.gossip.GossipSettings gossipSettings48 = null;
        com.google.code.gossip.StartupSettings startupSettings50 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings48, "hi!");
        startupSettings50.setPort(10);
        startupSettings50.setPort((int) 'a');
        java.lang.String str55 = startupSettings50.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList56 = startupSettings50.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings57 = new com.google.code.gossip.GossipSettings();
        gossipSettings57.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener60 = null;
        com.google.code.gossip.GossipService gossipService61 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList56, gossipSettings57, gossipListener60);
        com.google.code.gossip.manager.GossipManager gossipManager62 = gossipService61.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings69 = null;
        com.google.code.gossip.StartupSettings startupSettings71 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings69, "hi!");
        startupSettings71.setPort(10);
        startupSettings71.setPort((int) 'a');
        java.lang.String str76 = startupSettings71.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList77 = startupSettings71.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings78 = new com.google.code.gossip.GossipSettings();
        gossipSettings78.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener81 = null;
        com.google.code.gossip.GossipService gossipService82 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList77, gossipSettings78, gossipListener81);
        com.google.code.gossip.manager.GossipManager gossipManager83 = gossipService82.get_gossipManager();
        gossipService61.set_gossipManager(gossipManager83);
        gossipManager83.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember87 = new com.google.code.gossip.LocalGossipMember("", "hi!", (int) '4', ":0", (long) (short) 0, (javax.management.NotificationListener) gossipManager83, (-1));
        com.google.code.gossip.GossipSettings gossipSettings88 = gossipManager83.getSettings();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager83.getMyself();
        localGossipMember89.disableTimer();
        randomGossipManager36.revivieMember(localGossipMember89);
        localGossipMember89.disableTimer();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(gossipMemberList18);
        org.junit.Assert.assertNotNull(gossipManager24);
        org.junit.Assert.assertNotNull(gossipSettings26);
        org.junit.Assert.assertNotNull(gossipMemberList34);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(gossipMemberList56);
        org.junit.Assert.assertNotNull(gossipManager62);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(gossipMemberList77);
        org.junit.Assert.assertNotNull(gossipManager83);
        org.junit.Assert.assertNotNull(gossipSettings88);
        org.junit.Assert.assertNotNull(localGossipMember89);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.google.code.gossip.GossipSettings gossipSettings10 = null;
        com.google.code.gossip.StartupSettings startupSettings12 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings10, "hi!");
        startupSettings12.setPort(10);
        startupSettings12.setPort((int) 'a');
        java.lang.String str17 = startupSettings12.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList18 = startupSettings12.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings19 = new com.google.code.gossip.GossipSettings();
        gossipSettings19.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener22 = null;
        com.google.code.gossip.GossipService gossipService23 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList18, gossipSettings19, gossipListener22);
        com.google.code.gossip.manager.GossipManager gossipManager24 = gossipService23.get_gossipManager();
        gossipManager24.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings26 = gossipManager24.getSettings();
        gossipSettings26.setCleanupInterval(10);
        com.google.code.gossip.GossipSettings gossipSettings31 = null;
        com.google.code.gossip.StartupSettings startupSettings33 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings31, "hi!");
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList34 = startupSettings33.getGossipMembers();
        com.google.code.gossip.event.GossipListener gossipListener35 = null;
        com.google.code.gossip.manager.random.RandomGossipManager randomGossipManager36 = new com.google.code.gossip.manager.random.RandomGossipManager(":0", "hi!", (int) (byte) 0, "", gossipSettings26, gossipMemberList34, gossipListener35);
        gossipSettings26.setGossipTimeout(5);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(gossipMemberList18);
        org.junit.Assert.assertNotNull(gossipManager24);
        org.junit.Assert.assertNotNull(gossipSettings26);
        org.junit.Assert.assertNotNull(gossipMemberList34);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        java.lang.String str5 = startupSettings4.getCluster();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList6 = startupSettings4.getGossipMembers();
        startupSettings4.setId("Member [address=:0, id=hi!, heartbeat=1698797234652]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(gossipMemberList6);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        java.lang.String str2 = gossipMember0.getHost();
        gossipMember0.setHeartbeat((java.lang.Long) 100L);
        gossipMember0.setPort((java.lang.Integer) 1);
        gossipMember0.setPort((java.lang.Integer) 97);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings21 = gossipManager20.getSettings();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings43 = gossipManager42.getSettings();
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipManager64.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember66 = gossipManager64.getMyself();
        gossipManager42.revivieMember(localGossipMember66);
        gossipManager20.createOrRevivieMember(localGossipMember66);
        com.google.code.gossip.manager.random.RandomActiveGossipThread randomActiveGossipThread69 = new com.google.code.gossip.manager.random.RandomActiveGossipThread(gossipManager20);
        randomActiveGossipThread69.shutdown();
        randomActiveGossipThread69.run();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertNotNull(gossipSettings21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertNotNull(gossipSettings43);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertNotNull(localGossipMember66);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        javax.management.MBeanServer mBeanServer93 = null;
        javax.management.ObjectName objectName94 = null;
        javax.management.ObjectName objectName95 = gossipTimeoutTimer92.preRegister(mBeanServer93, objectName94);
        int int96 = gossipTimeoutTimer92.getNbNotifications();
        gossipTimeoutTimer92.start();
        java.lang.Object obj99 = gossipTimeoutTimer92.getNotificationUserData((java.lang.Integer) 5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(objectName95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNull(obj99);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings27 = null;
        com.google.code.gossip.StartupSettings startupSettings29 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings27, "hi!");
        startupSettings29.setPort(10);
        startupSettings29.setPort((int) 'a');
        java.lang.String str34 = startupSettings29.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList35 = startupSettings29.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings36 = new com.google.code.gossip.GossipSettings();
        gossipSettings36.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener39 = null;
        com.google.code.gossip.GossipService gossipService40 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList35, gossipSettings36, gossipListener39);
        com.google.code.gossip.manager.GossipManager gossipManager41 = gossipService40.get_gossipManager();
        gossipService19.set_gossipManager(gossipManager41);
        com.google.code.gossip.GossipSettings gossipSettings49 = null;
        com.google.code.gossip.StartupSettings startupSettings51 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings49, "hi!");
        startupSettings51.setPort(10);
        startupSettings51.setPort((int) 'a');
        java.lang.String str56 = startupSettings51.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList57 = startupSettings51.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings58 = new com.google.code.gossip.GossipSettings();
        gossipSettings58.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener61 = null;
        com.google.code.gossip.GossipService gossipService62 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList57, gossipSettings58, gossipListener61);
        com.google.code.gossip.manager.GossipManager gossipManager63 = gossipService62.get_gossipManager();
        gossipService19.set_gossipManager(gossipManager63);
        com.google.code.gossip.manager.GossipManager gossipManager65 = gossipService19.get_gossipManager();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(gossipMemberList35);
        org.junit.Assert.assertNotNull(gossipManager41);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(gossipMemberList57);
        org.junit.Assert.assertNotNull(gossipManager63);
        org.junit.Assert.assertNotNull(gossipManager65);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService19.get_gossipManager();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertNotNull(gossipManager21);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        com.google.code.gossip.GossipSettings gossipSettings8 = null;
        com.google.code.gossip.StartupSettings startupSettings10 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings8, "hi!");
        startupSettings10.setPort(10);
        startupSettings10.setPort((int) 'a');
        java.lang.String str15 = startupSettings10.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList16 = startupSettings10.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings17 = new com.google.code.gossip.GossipSettings();
        gossipSettings17.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener20 = null;
        com.google.code.gossip.GossipService gossipService21 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList16, gossipSettings17, gossipListener20);
        com.google.code.gossip.manager.GossipManager gossipManager22 = gossipService21.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings23 = gossipManager22.getSettings();
        com.google.code.gossip.GossipSettings gossipSettings30 = null;
        com.google.code.gossip.StartupSettings startupSettings32 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings30, "hi!");
        startupSettings32.setPort(10);
        startupSettings32.setPort((int) 'a');
        java.lang.String str37 = startupSettings32.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList38 = startupSettings32.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings39 = new com.google.code.gossip.GossipSettings();
        gossipSettings39.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener42 = null;
        com.google.code.gossip.GossipService gossipService43 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList38, gossipSettings39, gossipListener42);
        com.google.code.gossip.manager.GossipManager gossipManager44 = gossipService43.get_gossipManager();
        gossipManager44.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember46 = gossipManager44.getMyself();
        gossipManager22.revivieMember(localGossipMember46);
        com.google.code.gossip.GossipSettings gossipSettings48 = gossipManager22.getSettings();
        int int49 = gossipSettings48.getCleanupInterval();
        com.google.code.gossip.StartupSettings startupSettings51 = new com.google.code.gossip.StartupSettings(":0", (int) (byte) 100, gossipSettings48, "Member [address=hi!:1, id=, heartbeat=0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(gossipMemberList16);
        org.junit.Assert.assertNotNull(gossipManager22);
        org.junit.Assert.assertNotNull(gossipSettings23);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(gossipMemberList38);
        org.junit.Assert.assertNotNull(gossipManager44);
        org.junit.Assert.assertNotNull(localGossipMember46);
        org.junit.Assert.assertNotNull(gossipSettings48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.google.code.gossip.GossipSettings gossipSettings11 = null;
        com.google.code.gossip.StartupSettings startupSettings13 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings11, "hi!");
        startupSettings13.setPort(10);
        startupSettings13.setPort((int) 'a');
        java.lang.String str18 = startupSettings13.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList19 = startupSettings13.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings20 = new com.google.code.gossip.GossipSettings();
        gossipSettings20.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener23 = null;
        com.google.code.gossip.GossipService gossipService24 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList19, gossipSettings20, gossipListener23);
        com.google.code.gossip.manager.GossipManager gossipManager25 = gossipService24.get_gossipManager();
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList26 = gossipManager25.getDeadList();
        com.google.code.gossip.LocalGossipMember localGossipMember28 = new com.google.code.gossip.LocalGossipMember(":0", "", (int) (short) -1, "Member [address=:0, id=hi!, heartbeat=1698797232207]", 100L, (javax.management.NotificationListener) gossipManager25, (-1));
        com.google.code.gossip.LocalGossipMember localGossipMember29 = gossipManager25.getMyself();
        gossipManager25.shutdown();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(gossipMemberList19);
        org.junit.Assert.assertNotNull(gossipManager25);
        org.junit.Assert.assertNotNull(localGossipMemberList26);
        org.junit.Assert.assertNotNull(localGossipMember29);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.google.code.gossip.GossipSettings gossipSettings2 = new com.google.code.gossip.GossipSettings();
        gossipSettings2.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.StartupSettings startupSettings6 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "Member [address=:0, id=hi!, heartbeat=1698797232207]");
        gossipSettings2.setCleanupInterval(5);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        gossipTimeoutTimer92.reset();
        gossipTimeoutTimer92.postRegister((java.lang.Boolean) true);
        boolean boolean96 = gossipTimeoutTimer92.getSendPastNotifications();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        gossipTimeoutTimer92.reset();
        gossipTimeoutTimer92.postRegister((java.lang.Boolean) true);
        java.lang.Long long97 = gossipTimeoutTimer92.getNbOccurences((java.lang.Integer) 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(long97);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        startupSettings4.setPort(10);
        java.lang.String str7 = startupSettings4.getCluster();
        java.lang.String str8 = startupSettings4.getId();
        startupSettings4.setCluster("Member [address=hi!:1, id=, heartbeat=0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.google.code.gossip.GossipSettings gossipSettings11 = null;
        com.google.code.gossip.StartupSettings startupSettings13 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings11, "hi!");
        startupSettings13.setPort(10);
        startupSettings13.setPort((int) 'a');
        java.lang.String str18 = startupSettings13.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList19 = startupSettings13.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings20 = new com.google.code.gossip.GossipSettings();
        gossipSettings20.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener23 = null;
        com.google.code.gossip.GossipService gossipService24 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList19, gossipSettings20, gossipListener23);
        com.google.code.gossip.manager.GossipManager gossipManager25 = gossipService24.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings32 = null;
        com.google.code.gossip.StartupSettings startupSettings34 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings32, "hi!");
        startupSettings34.setPort(10);
        startupSettings34.setPort((int) 'a');
        java.lang.String str39 = startupSettings34.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList40 = startupSettings34.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings41 = new com.google.code.gossip.GossipSettings();
        gossipSettings41.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener44 = null;
        com.google.code.gossip.GossipService gossipService45 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList40, gossipSettings41, gossipListener44);
        com.google.code.gossip.manager.GossipManager gossipManager46 = gossipService45.get_gossipManager();
        gossipService24.set_gossipManager(gossipManager46);
        gossipManager46.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember50 = new com.google.code.gossip.LocalGossipMember("", "hi!", (int) '4', ":0", (long) (short) 0, (javax.management.NotificationListener) gossipManager46, (-1));
        com.google.code.gossip.GossipSettings gossipSettings51 = gossipManager46.getSettings();
        com.google.code.gossip.LocalGossipMember localGossipMember52 = gossipManager46.getMyself();
        // The following exception was thrown during execution in test generation
        try {
            com.google.code.gossip.manager.impl.OnlyProcessReceivedPassiveGossipThread onlyProcessReceivedPassiveGossipThread53 = new com.google.code.gossip.manager.impl.OnlyProcessReceivedPassiveGossipThread(gossipManager46);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.net.BindException: Can't assign requested address (Bind failed)");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(gossipMemberList19);
        org.junit.Assert.assertNotNull(gossipManager25);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(gossipMemberList40);
        org.junit.Assert.assertNotNull(gossipManager46);
        org.junit.Assert.assertNotNull(gossipSettings51);
        org.junit.Assert.assertNotNull(localGossipMember52);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("hi!", 1, (int) (short) 10, "");
        java.lang.String str5 = startupSettings4.getCluster();
        java.lang.String str6 = startupSettings4.getId();
        startupSettings4.setCluster("");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember13 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        java.lang.String str14 = remoteGossipMember13.getAddress();
        java.lang.String str15 = remoteGossipMember13.getAddress();
        remoteGossipMember13.setId("");
        startupSettings4.addGossipMember((com.google.code.gossip.GossipMember) remoteGossipMember13);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":0" + "'", str14, ":0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":0" + "'", str15, ":0");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        com.google.code.gossip.GossipSettings gossipSettings4 = new com.google.code.gossip.GossipSettings();
        gossipSettings4.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 10, gossipSettings4, ":0");
        com.google.code.gossip.StartupSettings startupSettings10 = new com.google.code.gossip.StartupSettings("hi!:1", 100, gossipSettings4, "Member [address=:0, id=hi!, heartbeat=1698797238955]");
        int int11 = startupSettings10.getPort();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        javax.management.MBeanServer mBeanServer93 = null;
        javax.management.ObjectName objectName94 = null;
        javax.management.ObjectName objectName95 = gossipTimeoutTimer92.preRegister(mBeanServer93, objectName94);
        int int96 = gossipTimeoutTimer92.getNbNotifications();
        java.lang.Object obj98 = gossipTimeoutTimer92.getNotificationUserData((java.lang.Integer) 5);
        gossipTimeoutTimer92.reset();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(objectName95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNull(obj98);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        com.google.code.gossip.GossipSettings gossipSettings11 = null;
        com.google.code.gossip.StartupSettings startupSettings13 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings11, "hi!");
        startupSettings13.setPort(10);
        startupSettings13.setPort((int) 'a');
        java.lang.String str18 = startupSettings13.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList19 = startupSettings13.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings20 = new com.google.code.gossip.GossipSettings();
        gossipSettings20.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener23 = null;
        com.google.code.gossip.GossipService gossipService24 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList19, gossipSettings20, gossipListener23);
        com.google.code.gossip.manager.GossipManager gossipManager25 = gossipService24.get_gossipManager();
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList26 = gossipManager25.getDeadList();
        com.google.code.gossip.LocalGossipMember localGossipMember28 = new com.google.code.gossip.LocalGossipMember(":0", "", (int) (short) -1, "Member [address=:0, id=hi!, heartbeat=1698797232207]", 100L, (javax.management.NotificationListener) gossipManager25, (-1));
        com.google.code.gossip.LocalGossipMember localGossipMember29 = gossipManager25.getMyself();
        // The following exception was thrown during execution in test generation
        try {
            com.google.code.gossip.manager.impl.OnlyProcessReceivedPassiveGossipThread onlyProcessReceivedPassiveGossipThread30 = new com.google.code.gossip.manager.impl.OnlyProcessReceivedPassiveGossipThread(gossipManager25);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.net.BindException: Can't assign requested address (Bind failed)");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(gossipMemberList19);
        org.junit.Assert.assertNotNull(gossipManager25);
        org.junit.Assert.assertNotNull(localGossipMemberList26);
        org.junit.Assert.assertNotNull(localGossipMember29);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        gossipTimeoutTimer92.reset();
        java.lang.Boolean boolean95 = gossipTimeoutTimer92.getFixedRate((java.lang.Integer) 100);
        java.lang.Long long97 = gossipTimeoutTimer92.getNbOccurences((java.lang.Integer) 102400);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(boolean95);
        org.junit.Assert.assertNull(long97);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings21 = gossipManager20.getSettings();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings43 = gossipManager42.getSettings();
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipManager64.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember66 = gossipManager64.getMyself();
        gossipManager42.revivieMember(localGossipMember66);
        gossipManager20.createOrRevivieMember(localGossipMember66);
        com.google.code.gossip.manager.random.RandomActiveGossipThread randomActiveGossipThread69 = new com.google.code.gossip.manager.random.RandomActiveGossipThread(gossipManager20);
        com.google.code.gossip.LocalGossipMember localGossipMember70 = gossipManager20.getMyself();
        localGossipMember70.disableTimer();
        java.lang.String str72 = localGossipMember70.getClusterName();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertNotNull(gossipSettings21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertNotNull(gossipSettings43);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertNotNull(localGossipMember66);
        org.junit.Assert.assertNotNull(localGossipMember70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        startupSettings4.setPort(10);
        startupSettings4.setPort((int) 'a');
        int int9 = startupSettings4.getPort();
        java.lang.String str10 = startupSettings4.getCluster();
        java.lang.String str11 = startupSettings4.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        gossipTimeoutTimer92.reset();
        gossipTimeoutTimer92.removeNotification((java.lang.Integer) 1);
        // The following exception was thrown during execution in test generation
        try {
            gossipTimeoutTimer92.removeNotification((java.lang.Integer) 102400);
            org.junit.Assert.fail("Expected exception of type javax.management.InstanceNotFoundException; message: Timer notification to remove not in the list of notifications");
        } catch (javax.management.InstanceNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings21 = gossipManager20.getSettings();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings43 = gossipManager42.getSettings();
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipManager64.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember66 = gossipManager64.getMyself();
        gossipManager42.revivieMember(localGossipMember66);
        gossipManager20.createOrRevivieMember(localGossipMember66);
        com.google.code.gossip.manager.random.RandomActiveGossipThread randomActiveGossipThread69 = new com.google.code.gossip.manager.random.RandomActiveGossipThread(gossipManager20);
        com.google.code.gossip.LocalGossipMember localGossipMember70 = gossipManager20.getMyself();
        java.lang.String str71 = localGossipMember70.getAddress();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertNotNull(gossipSettings21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertNotNull(gossipSettings43);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertNotNull(localGossipMember66);
        org.junit.Assert.assertNotNull(localGossipMember70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!:1" + "'", str71, "hi!:1");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        java.lang.String str2 = gossipMember0.getHost();
        gossipMember0.setHeartbeat((java.lang.Long) 100L);
        java.lang.String str5 = gossipMember0.getCluster();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.google.code.gossip.GossipSettings gossipSettings0 = new com.google.code.gossip.GossipSettings();
        gossipSettings0.setCleanupInterval((int) (short) 0);
        int int3 = gossipSettings0.getCleanupInterval();
        int int4 = gossipSettings0.getCleanupInterval();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        gossipManager20.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings22 = gossipManager20.getSettings();
        gossipSettings22.setCleanupInterval(10);
        gossipSettings22.setGossipTimeout((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertNotNull(gossipSettings22);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember5 = new com.google.code.gossip.RemoteGossipMember("Member [address=:0, id=hi!, heartbeat=1698797232207]", "hi!", (int) (short) 100, "Member [address=hi!:1, id=, heartbeat=0]", 1698797233244L);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.google.code.gossip.GossipSettings gossipSettings2 = new com.google.code.gossip.GossipSettings((int) ' ', (int) 'a');
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings27 = null;
        com.google.code.gossip.StartupSettings startupSettings29 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings27, "hi!");
        startupSettings29.setPort(10);
        startupSettings29.setPort((int) 'a');
        java.lang.String str34 = startupSettings29.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList35 = startupSettings29.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings36 = new com.google.code.gossip.GossipSettings();
        gossipSettings36.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener39 = null;
        com.google.code.gossip.GossipService gossipService40 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList35, gossipSettings36, gossipListener39);
        com.google.code.gossip.manager.GossipManager gossipManager41 = gossipService40.get_gossipManager();
        gossipService19.set_gossipManager(gossipManager41);
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList43 = gossipManager41.getDeadList();
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList44 = gossipManager41.getMemberList();
        com.google.code.gossip.LocalGossipMember localGossipMember45 = gossipManager41.getMyself();
        com.google.code.gossip.manager.random.RandomActiveGossipThread randomActiveGossipThread46 = new com.google.code.gossip.manager.random.RandomActiveGossipThread(gossipManager41);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(gossipMemberList35);
        org.junit.Assert.assertNotNull(gossipManager41);
        org.junit.Assert.assertNotNull(localGossipMemberList43);
        org.junit.Assert.assertNotNull(localGossipMemberList44);
        org.junit.Assert.assertNotNull(localGossipMember45);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        startupSettings4.setPort(10);
        startupSettings4.setPort((int) 'a');
        int int9 = startupSettings4.getPort();
        java.lang.String str10 = startupSettings4.getCluster();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList11 = startupSettings4.getGossipMembers();
        startupSettings4.setId("Member [address=hi!:1, id=, heartbeat=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(gossipMemberList11);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList5 = startupSettings4.getGossipMembers();
        // The following exception was thrown during execution in test generation
        try {
            com.google.code.gossip.GossipService gossipService6 = new com.google.code.gossip.GossipService(startupSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gossipMemberList5);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        java.util.Vector<java.lang.Integer> intList93 = gossipTimeoutTimer92.getAllNotificationIDs();
        javax.management.MBeanNotificationInfo[] mBeanNotificationInfoArray94 = gossipTimeoutTimer92.getNotificationInfo();
        gossipTimeoutTimer92.postRegister((java.lang.Boolean) true);
        gossipTimeoutTimer92.stop();
        // The following exception was thrown during execution in test generation
        try {
            gossipTimeoutTimer92.removeNotification((java.lang.Integer) 1000);
            org.junit.Assert.fail("Expected exception of type javax.management.InstanceNotFoundException; message: Timer notification to remove not in the list of notifications");
        } catch (javax.management.InstanceNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(intList93);
        org.junit.Assert.assertNotNull(mBeanNotificationInfoArray94);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        java.util.Vector<java.lang.Integer> intList93 = gossipTimeoutTimer92.getAllNotificationIDs();
        javax.management.MBeanNotificationInfo[] mBeanNotificationInfoArray94 = gossipTimeoutTimer92.getNotificationInfo();
        gossipTimeoutTimer92.preDeregister();
        java.util.Vector<java.lang.Integer> intList97 = gossipTimeoutTimer92.getNotificationIDs("Member [address=:0, id=hi!, heartbeat=1698797232207]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(intList93);
        org.junit.Assert.assertNotNull(mBeanNotificationInfoArray94);
        org.junit.Assert.assertNotNull(intList97);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        com.google.code.gossip.GossipSettings gossipSettings2 = new com.google.code.gossip.GossipSettings((int) 'a', (int) (byte) 1);
        gossipSettings2.setCleanupInterval((int) (byte) 0);
        gossipSettings2.setGossipTimeout((int) (byte) 1);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        com.google.code.gossip.GossipSettings gossipSettings16 = null;
        com.google.code.gossip.StartupSettings startupSettings18 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings16, "hi!");
        startupSettings18.setPort(10);
        startupSettings18.setPort((int) 'a');
        java.lang.String str23 = startupSettings18.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList24 = startupSettings18.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings25 = new com.google.code.gossip.GossipSettings();
        gossipSettings25.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener28 = null;
        com.google.code.gossip.GossipService gossipService29 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList24, gossipSettings25, gossipListener28);
        com.google.code.gossip.manager.GossipManager gossipManager30 = gossipService29.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings37 = null;
        com.google.code.gossip.StartupSettings startupSettings39 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings37, "hi!");
        startupSettings39.setPort(10);
        startupSettings39.setPort((int) 'a');
        java.lang.String str44 = startupSettings39.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList45 = startupSettings39.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings46 = new com.google.code.gossip.GossipSettings();
        gossipSettings46.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener49 = null;
        com.google.code.gossip.GossipService gossipService50 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList45, gossipSettings46, gossipListener49);
        com.google.code.gossip.manager.GossipManager gossipManager51 = gossipService50.get_gossipManager();
        gossipService29.set_gossipManager(gossipManager51);
        gossipManager51.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember55 = new com.google.code.gossip.LocalGossipMember("", "hi!", (int) '4', ":0", (long) (short) 0, (javax.management.NotificationListener) gossipManager51, (-1));
        com.google.code.gossip.LocalGossipMember localGossipMember57 = new com.google.code.gossip.LocalGossipMember(":0", ":0", (int) 'a', ":0", 60000L, (javax.management.NotificationListener) gossipManager51, (int) '#');
        com.google.code.gossip.LocalGossipMember localGossipMember58 = gossipManager51.getMyself();
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(gossipMemberList24);
        org.junit.Assert.assertNotNull(gossipManager30);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(gossipMemberList45);
        org.junit.Assert.assertNotNull(gossipManager51);
        org.junit.Assert.assertNotNull(localGossipMember58);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings21 = gossipManager20.getSettings();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipManager42.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember44 = gossipManager42.getMyself();
        gossipManager20.revivieMember(localGossipMember44);
        com.google.code.gossip.GossipSettings gossipSettings46 = gossipManager20.getSettings();
        int int47 = gossipSettings46.getCleanupInterval();
        int int48 = gossipSettings46.getGossipInterval();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertNotNull(gossipSettings21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertNotNull(localGossipMember44);
        org.junit.Assert.assertNotNull(gossipSettings46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1000 + "'", int48 == 1000);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        gossipTimeoutTimer92.reset();
        gossipTimeoutTimer92.postRegister((java.lang.Boolean) true);
        gossipTimeoutTimer92.postRegister((java.lang.Boolean) true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        gossipTimeoutTimer92.reset();
        gossipTimeoutTimer92.removeNotification((java.lang.Integer) 1);
        java.lang.String str97 = gossipTimeoutTimer92.getNotificationMessage((java.lang.Integer) 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(str97);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        com.google.code.gossip.GossipSettings gossipSettings4 = new com.google.code.gossip.GossipSettings();
        gossipSettings4.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 10, gossipSettings4, ":0");
        com.google.code.gossip.StartupSettings startupSettings10 = new com.google.code.gossip.StartupSettings("hi!:1", 100, gossipSettings4, "Member [address=:0, id=hi!, heartbeat=1698797238955]");
        java.lang.String str11 = startupSettings10.getId();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!:1" + "'", str11, "hi!:1");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        com.google.code.gossip.GossipSettings gossipSettings2 = new com.google.code.gossip.GossipSettings((int) 'a', (int) (byte) 1);
        gossipSettings2.setCleanupInterval((int) (byte) 0);
        gossipSettings2.setCleanupInterval(10);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        gossipService19.start();
        gossipService19.shutdown();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("hi!", 10, 0, "Member [address=:0, id=hi!, heartbeat=1698797234652]");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings21 = gossipManager20.getSettings();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipManager42.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember44 = gossipManager42.getMyself();
        gossipManager20.revivieMember(localGossipMember44);
        com.google.code.gossip.GossipSettings gossipSettings46 = gossipManager20.getSettings();
        int int47 = gossipSettings46.getCleanupInterval();
        int int48 = gossipSettings46.getCleanupInterval();
        gossipSettings46.setGossipTimeout(1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertNotNull(gossipSettings21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertNotNull(localGossipMember44);
        org.junit.Assert.assertNotNull(gossipSettings46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("hi!", (int) (byte) 10, (int) '#', "Member [address=:0, id=hi!, heartbeat=1698797234652]");
        int int5 = startupSettings4.getPort();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        com.google.code.gossip.GossipSettings gossipSettings8 = null;
        com.google.code.gossip.StartupSettings startupSettings10 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings8, "hi!");
        startupSettings10.setPort(10);
        startupSettings10.setPort((int) 'a');
        java.lang.String str15 = startupSettings10.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList16 = startupSettings10.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings17 = new com.google.code.gossip.GossipSettings();
        gossipSettings17.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener20 = null;
        com.google.code.gossip.GossipService gossipService21 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList16, gossipSettings17, gossipListener20);
        int int22 = gossipSettings17.getGossipInterval();
        int int23 = gossipSettings17.getCleanupInterval();
        com.google.code.gossip.StartupSettings startupSettings25 = new com.google.code.gossip.StartupSettings("", (int) (byte) 0, gossipSettings17, "hi!");
        int int26 = gossipSettings17.getCleanupInterval();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(gossipMemberList16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1000 + "'", int22 == 1000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        java.util.Vector<java.lang.Integer> intList93 = gossipTimeoutTimer92.getAllNotificationIDs();
        javax.management.MBeanServer mBeanServer94 = null;
        javax.management.ObjectName objectName95 = null;
        javax.management.ObjectName objectName96 = gossipTimeoutTimer92.preRegister(mBeanServer94, objectName95);
        gossipTimeoutTimer92.postDeregister();
        java.lang.Long long99 = gossipTimeoutTimer92.getPeriod((java.lang.Integer) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(intList93);
        org.junit.Assert.assertNull(objectName96);
        org.junit.Assert.assertNull(long99);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        gossipMember0.setHeartbeat((java.lang.Long) 60000L);
        gossipMember0.setPort((java.lang.Integer) 100);
        gossipMember0.setId("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        gossipManager20.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember22 = gossipManager20.getMyself();
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList23 = gossipManager20.getDeadList();
        com.google.code.gossip.LocalGossipMember localGossipMember24 = gossipManager20.getMyself();
        java.lang.String str25 = localGossipMember24.toString();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertNotNull(localGossipMember22);
        org.junit.Assert.assertNotNull(localGossipMemberList23);
        org.junit.Assert.assertNotNull(localGossipMember24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Member [address=hi!:1, id=, heartbeat=1698797249120]" + "'", str25, "Member [address=hi!:1, id=, heartbeat=1698797249120]");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        com.google.code.gossip.GossipSettings gossipSettings7 = null;
        com.google.code.gossip.StartupSettings startupSettings9 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings7, "hi!");
        startupSettings9.setPort(10);
        startupSettings9.setPort((int) 'a');
        java.lang.String str14 = startupSettings9.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList15 = startupSettings9.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings16 = new com.google.code.gossip.GossipSettings();
        gossipSettings16.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener19 = null;
        com.google.code.gossip.GossipService gossipService20 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList15, gossipSettings16, gossipListener19);
        com.google.code.gossip.manager.GossipManager gossipManager21 = gossipService20.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings28 = null;
        com.google.code.gossip.StartupSettings startupSettings30 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings28, "hi!");
        startupSettings30.setPort(10);
        startupSettings30.setPort((int) 'a');
        java.lang.String str35 = startupSettings30.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList36 = startupSettings30.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings37 = new com.google.code.gossip.GossipSettings();
        gossipSettings37.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener40 = null;
        com.google.code.gossip.GossipService gossipService41 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList36, gossipSettings37, gossipListener40);
        com.google.code.gossip.manager.GossipManager gossipManager42 = gossipService41.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager42);
        com.google.code.gossip.GossipSettings gossipSettings50 = null;
        com.google.code.gossip.StartupSettings startupSettings52 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings50, "hi!");
        startupSettings52.setPort(10);
        startupSettings52.setPort((int) 'a');
        java.lang.String str57 = startupSettings52.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList58 = startupSettings52.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings59 = new com.google.code.gossip.GossipSettings();
        gossipSettings59.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener62 = null;
        com.google.code.gossip.GossipService gossipService63 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList58, gossipSettings59, gossipListener62);
        com.google.code.gossip.manager.GossipManager gossipManager64 = gossipService63.get_gossipManager();
        gossipService20.set_gossipManager(gossipManager64);
        gossipManager64.shutdown();
        com.google.code.gossip.GossipSettings gossipSettings73 = null;
        com.google.code.gossip.StartupSettings startupSettings75 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings73, "hi!");
        startupSettings75.setPort(10);
        startupSettings75.setPort((int) 'a');
        java.lang.String str80 = startupSettings75.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList81 = startupSettings75.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings82 = new com.google.code.gossip.GossipSettings();
        gossipSettings82.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener85 = null;
        com.google.code.gossip.GossipService gossipService86 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList81, gossipSettings82, gossipListener85);
        com.google.code.gossip.manager.GossipManager gossipManager87 = gossipService86.get_gossipManager();
        gossipManager87.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember89 = gossipManager87.getMyself();
        boolean boolean91 = localGossipMember89.equals((java.lang.Object) 3600000L);
        com.google.code.gossip.GossipTimeoutTimer gossipTimeoutTimer92 = new com.google.code.gossip.GossipTimeoutTimer((long) 1000, (javax.management.NotificationListener) gossipManager64, localGossipMember89);
        javax.management.MBeanServer mBeanServer93 = null;
        javax.management.ObjectName objectName94 = null;
        javax.management.ObjectName objectName95 = gossipTimeoutTimer92.preRegister(mBeanServer93, objectName94);
        int int96 = gossipTimeoutTimer92.getNbNotifications();
        java.lang.String str98 = gossipTimeoutTimer92.getNotificationMessage((java.lang.Integer) 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(gossipMemberList15);
        org.junit.Assert.assertNotNull(gossipManager21);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(gossipMemberList36);
        org.junit.Assert.assertNotNull(gossipManager42);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(gossipMemberList58);
        org.junit.Assert.assertNotNull(gossipManager64);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(gossipMemberList81);
        org.junit.Assert.assertNotNull(gossipManager87);
        org.junit.Assert.assertNotNull(localGossipMember89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(objectName95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNull(str98);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        gossipMember0.setHeartbeat((java.lang.Long) 60000L);
        gossipMember0.setPort((java.lang.Integer) 100);
        java.lang.String str6 = gossipMember0.getHost();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        java.lang.Integer int2 = gossipMember0.getPort();
        gossipMember0.setPort((java.lang.Integer) 1);
        gossipMember0.setId("hi!");
        gossipMember0.setPort((java.lang.Integer) 102400);
        gossipMember0.setId("Member [address=:0, id=hi!, heartbeat=1698797232207]");
        java.lang.String str11 = gossipMember0.getId();
        gossipMember0.setHeartbeat((java.lang.Long) 1698797234974L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Member [address=:0, id=hi!, heartbeat=1698797232207]" + "'", str11, "Member [address=:0, id=hi!, heartbeat=1698797232207]");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        com.google.code.gossip.model.GossipMember gossipMember0 = new com.google.code.gossip.model.GossipMember();
        java.lang.String str1 = gossipMember0.getHost();
        gossipMember0.setHeartbeat((java.lang.Long) 1000L);
        gossipMember0.setHeartbeat((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("hi!:1", 1, (int) '4', "Member [address=:0, id=hi!, heartbeat=1698797234652]");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        com.google.code.gossip.GossipSettings gossipSettings6 = null;
        com.google.code.gossip.StartupSettings startupSettings8 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings6, "hi!");
        startupSettings8.setPort(10);
        startupSettings8.setPort((int) 'a');
        java.lang.String str13 = startupSettings8.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList14 = startupSettings8.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings15 = new com.google.code.gossip.GossipSettings();
        gossipSettings15.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener18 = null;
        com.google.code.gossip.GossipService gossipService19 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList14, gossipSettings15, gossipListener18);
        com.google.code.gossip.manager.GossipManager gossipManager20 = gossipService19.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings32 = null;
        com.google.code.gossip.StartupSettings startupSettings34 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings32, "hi!");
        startupSettings34.setPort(10);
        startupSettings34.setPort((int) 'a');
        java.lang.String str39 = startupSettings34.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList40 = startupSettings34.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings41 = new com.google.code.gossip.GossipSettings();
        gossipSettings41.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener44 = null;
        com.google.code.gossip.GossipService gossipService45 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList40, gossipSettings41, gossipListener44);
        com.google.code.gossip.manager.GossipManager gossipManager46 = gossipService45.get_gossipManager();
        com.google.code.gossip.GossipSettings gossipSettings53 = null;
        com.google.code.gossip.StartupSettings startupSettings55 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings53, "hi!");
        startupSettings55.setPort(10);
        startupSettings55.setPort((int) 'a');
        java.lang.String str60 = startupSettings55.getId();
        java.util.List<com.google.code.gossip.GossipMember> gossipMemberList61 = startupSettings55.getGossipMembers();
        com.google.code.gossip.GossipSettings gossipSettings62 = new com.google.code.gossip.GossipSettings();
        gossipSettings62.setCleanupInterval((int) (short) 0);
        com.google.code.gossip.event.GossipListener gossipListener65 = null;
        com.google.code.gossip.GossipService gossipService66 = new com.google.code.gossip.GossipService("", "hi!", 1, "", gossipMemberList61, gossipSettings62, gossipListener65);
        com.google.code.gossip.manager.GossipManager gossipManager67 = gossipService66.get_gossipManager();
        gossipService45.set_gossipManager(gossipManager67);
        gossipManager67.shutdown();
        com.google.code.gossip.LocalGossipMember localGossipMember71 = new com.google.code.gossip.LocalGossipMember("", "hi!", (int) '4', ":0", (long) (short) 0, (javax.management.NotificationListener) gossipManager67, (-1));
        gossipService19.set_gossipManager(gossipManager67);
        com.google.code.gossip.manager.GossipManager gossipManager73 = gossipService19.get_gossipManager();
        java.util.List<com.google.code.gossip.LocalGossipMember> localGossipMemberList74 = gossipManager73.getMemberList();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(gossipMemberList14);
        org.junit.Assert.assertNotNull(gossipManager20);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(gossipMemberList40);
        org.junit.Assert.assertNotNull(gossipManager46);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(gossipMemberList61);
        org.junit.Assert.assertNotNull(gossipManager67);
        org.junit.Assert.assertNotNull(gossipManager73);
        org.junit.Assert.assertNotNull(localGossipMemberList74);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        com.google.code.gossip.GossipSettings gossipSettings2 = new com.google.code.gossip.GossipSettings(1, (int) (short) 10);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        com.google.code.gossip.GossipSettings gossipSettings2 = null;
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("", (int) (short) 1, gossipSettings2, "hi!");
        java.lang.String str5 = startupSettings4.getCluster();
        java.lang.String str6 = startupSettings4.getId();
        com.google.code.gossip.GossipSettings gossipSettings7 = startupSettings4.getGossipSettings();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(gossipSettings7);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        com.google.code.gossip.StartupSettings startupSettings4 = new com.google.code.gossip.StartupSettings("Member [address=:0, id=hi!, heartbeat=1698797238955]", (int) (byte) -1, 1000, "hi!");
    }
}
