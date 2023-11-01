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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.dataone.cn.hazelcast.membership.ClusterPartitionMonitor.startSessionMonitor();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.hazelcast.core.IMap<org.dataone.service.types.v1.Identifier, org.dataone.service.types.v2.SystemMetadata> identifierMap0 = org.dataone.cn.hazelcast.HazelcastClientFactory.getSystemMetadataMap();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.hazelcast.client.HazelcastClient hazelcastClient0 = org.dataone.cn.hazelcast.HazelcastClientFactory.getSessionClient();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.hazelcast.client.HazelcastClient hazelcastClient0 = org.dataone.cn.hazelcast.HazelcastClientInstance.getHazelcastClient();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.hazelcast.client.HazelcastClient hazelcastClient0 = org.dataone.cn.hazelcast.HazelcastClientFactory.getProcessingClient();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.dataone.cn.hazelcast.membership.ClusterPartitionMonitor.startStorageMonitor();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.dataone.cn.hazelcast.membership.ClusterPartitionMonitor.stopMonitors();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.hazelcast.core.IMap<org.dataone.service.types.v1.NodeReference, org.dataone.service.types.v1.Node> nodeReferenceMap0 = org.dataone.cn.hazelcast.HazelcastClientFactory.getNodeMap();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.dataone.cn.log.AuditLogEntry auditLogEntry0 = new org.dataone.cn.log.AuditLogEntry();
        java.lang.String str1 = auditLogEntry0.getId();
        java.lang.String str2 = auditLogEntry0.getLogText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = auditLogEntry0.toString();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.hazelcast.client.HazelcastClient hazelcastClient0 = org.dataone.cn.hazelcast.HazelcastClientFactory.getStorageClient();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.dataone.cn.log.AuditLogClientSplunkImpl auditLogClientSplunkImpl0 = new org.dataone.cn.log.AuditLogClientSplunkImpl();
        java.lang.String str4 = auditLogClientSplunkImpl0.queryLog("smreplicationstatus", (java.lang.Integer) 100, (java.lang.Integer) 0);
        org.dataone.cn.log.AuditLogEntry auditLogEntry5 = new org.dataone.cn.log.AuditLogEntry();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = auditLogClientSplunkImpl0.logAuditEvent(auditLogEntry5);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.hazelcast.core.IMap<org.dataone.service.types.v1.Identifier, java.lang.String> identifierMap0 = org.dataone.cn.hazelcast.HazelcastClientFactory.getObjectPathMap();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.dataone.cn.log.AuditLogEntry auditLogEntry0 = new org.dataone.cn.log.AuditLogEntry();
        auditLogEntry0.setLogText("smreplicationstatus");
        java.util.Date date3 = auditLogEntry0.getDateLogged();
        java.lang.String str4 = auditLogEntry0.getNodeId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = auditLogEntry0.toString();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.dataone.cn.log.AuditLogEntry auditLogEntry0 = new org.dataone.cn.log.AuditLogEntry();
        auditLogEntry0.setLogText("smreplicationstatus");
        auditLogEntry0.setLogText("org.dataone.cn.batch.exceptions.ExecutionDisabledException: hi!");
        java.lang.String str5 = auditLogEntry0.getPid();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = auditLogEntry0.toString();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.dataone.cn.log.AuditLogWriteClientSplunkImpl auditLogWriteClientSplunkImpl0 = new org.dataone.cn.log.AuditLogWriteClientSplunkImpl();
        org.dataone.cn.log.AuditLogEntry auditLogEntry1 = new org.dataone.cn.log.AuditLogEntry();
        auditLogEntry1.setLogText("smreplicationstatus");
        auditLogEntry1.setLogText("org.dataone.cn.batch.exceptions.ExecutionDisabledException: hi!");
        boolean boolean6 = auditLogWriteClientSplunkImpl0.removeReplicaAuditEvent(auditLogEntry1);
        org.dataone.cn.log.AuditLogEntry auditLogEntry7 = new org.dataone.cn.log.AuditLogEntry();
        auditLogEntry7.setLogText("smreplicationstatus");
        auditLogEntry7.setLogText("org.dataone.cn.batch.exceptions.ExecutionDisabledException: hi!");
        java.lang.String str12 = auditLogEntry7.getPid();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = auditLogWriteClientSplunkImpl0.logAuditEvent(auditLogEntry7);
    }
}

