import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTests{
    public static boolean debug = false;


    public void test030_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember4 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        boolean boolean6 = remoteGossipMember4.equals((java.lang.Object) (byte) 1);
        boolean boolean8 = remoteGossipMember4.equals((java.lang.Object) 86400000L);
        long long9 = remoteGossipMember4.getHeartbeat();
        java.lang.String str10 = remoteGossipMember4.getId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698797233244L + "'", long9 == 1698797233244L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    public void test060_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember4 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        boolean boolean6 = remoteGossipMember4.equals((java.lang.Object) (byte) 1);
        java.lang.String str7 = remoteGossipMember4.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Member [address=:0, id=hi!, heartbeat=1698797234652]" + "'", str7, "Member [address=:0, id=hi!, heartbeat=1698797234652]");
    }

    public void test064_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember4 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        java.lang.String str5 = remoteGossipMember4.getAddress();
        java.lang.String str6 = remoteGossipMember4.getAddress();
        long long7 = remoteGossipMember4.getHeartbeat();
        remoteGossipMember4.setHeartbeat(1698797232207L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":0" + "'", str5, ":0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":0" + "'", str6, ":0");
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698797234974L + "'", long7 == 1698797234974L);
    }

    public void test088_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember4 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (short) 0, "hi!");
        java.lang.String str5 = remoteGossipMember4.getAddress();
        java.lang.String str6 = remoteGossipMember4.getAddress();
        long long7 = remoteGossipMember4.getHeartbeat();
        java.lang.String str8 = remoteGossipMember4.getClusterName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":0" + "'", str5, ":0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":0" + "'", str6, ":0");
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698797236152L + "'", long7 == 1698797236152L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    public void test120_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698797238955L + "'", long7 == 1698797238955L);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Member [address=:0, id=hi!, heartbeat=1698797238955]" + "'", str8, "Member [address=:0, id=hi!, heartbeat=1698797238955]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    public void test120_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Member [address=:0, id=hi!, heartbeat=1698797238955]" + "'", str8, "Member [address=:0, id=hi!, heartbeat=1698797238955]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    public void test182_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.google.code.gossip.RemoteGossipMember remoteGossipMember4 = new com.google.code.gossip.RemoteGossipMember("hi!", "", (int) (byte) 1, "Member [address=:0, id=hi!, heartbeat=1698797232207]");
        long long5 = remoteGossipMember4.getHeartbeat();
        int int6 = remoteGossipMember4.getPort();
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698797244075L + "'", long5 == 1698797244075L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    public void test205_1() throws Throwable {
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
         org.junit.Assert.assertEquals(obj97.toString(), "Member [address=hi!:1, id=, heartbeat=1698797245592]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj97), "Member [address=hi!:1, id=, heartbeat=1698797245592]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj97), "Member [address=hi!:1, id=, heartbeat=1698797245592]");
    }

    public void test205_2() throws Throwable {
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
         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj97), "Member [address=hi!:1, id=, heartbeat=1698797245592]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj97), "Member [address=hi!:1, id=, heartbeat=1698797245592]");
    }

    public void test205_3() throws Throwable {
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
         org.junit.Assert.assertEquals(java.util.Objects.toString(obj97), "Member [address=hi!:1, id=, heartbeat=1698797245592]");
    }

    public void test273_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Member [address=hi!:1, id=, heartbeat=1698797249120]" + "'", str25, "Member [address=hi!:1, id=, heartbeat=1698797249120]");
    }
}