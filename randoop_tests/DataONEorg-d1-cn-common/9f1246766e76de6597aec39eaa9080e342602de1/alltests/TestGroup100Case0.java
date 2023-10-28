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
        java.lang.String str0 = org.dataone.cn.hazelcast.HazelcastConfigLocationFactory.getStorageConfigLocation();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/etc/dataone/storage/hazelcast.xml" + "'", str0, "/etc/dataone/storage/hazelcast.xml");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        int int0 = javax.servlet.http.HttpServletResponse.SC_BAD_GATEWAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 502 + "'", int0 == 502);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        org.dataone.cn.log.MetricEvent metricEvent0 = null;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.log.MetricLogEntry metricLogEntry2 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetricEvent may not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        org.dataone.service.types.v1.NodeReference nodeReference0 = null;
        org.dataone.service.types.v1.Identifier identifier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.synchronization.types.SyncObject syncObject2 = new org.dataone.cn.synchronization.types.SyncObject(nodeReference0, identifier1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.dataone.service.types.v1.NodeReference.getValue()\" because \"nodeId\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.lang.String str0 = org.dataone.cn.servlet.http.ParameterKeys.AUTHORIZED_SUBJECTS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "authorizedSubjects" + "'", str0, "authorizedSubjects");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean0 = org.dataone.cn.ComponentActivationUtility.replicationIsActive();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'Replication.active' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicationPolicyEntryMapper replicationPolicyEntryMapper1 = systemMetadataDaoMetacatImpl0.new ReplicationPolicyEntryMapper();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.dataone.cn.dao.SystemMetadataDaoMetacatImpl$ReplicationPolicyEntryMapper with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.lang.String str0 = org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener.PROCESSING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "processing" + "'", str0, "processing");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        org.dataone.cn.dao.SystemMetadataDao systemMetadataDao0 = org.dataone.cn.dao.DaoFactory.getSystemMetadataDao();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = systemMetadataDao0.getSystemMetadataCount();
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: StatementCallback; bad SQL grammar [SELECT count(guid) FROM systemmetadata]; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SYSTEMMETADATA\" not found; SQL statement:?SELECT count(guid) FROM systemmetadata [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemMetadataDao0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        boolean boolean0 = org.dataone.cn.hazelcast.membership.ClusterPartitionMonitor.getProcessingPartition();
// flaky:         org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        java.lang.String str0 = javax.servlet.http.HttpServletRequest.FORM_AUTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "FORM" + "'", str0, "FORM");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        int int0 = javax.servlet.http.HttpServletResponse.SC_NOT_FOUND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 404 + "'", int0 == 404);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.lang.String str0 = org.dataone.cn.servlet.http.ParameterKeys.IS_CN_ADMINISTRATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "isCnAdministrator" + "'", str0, "isCnAdministrator");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        int int0 = javax.servlet.http.HttpServletResponse.SC_TEMPORARY_REDIRECT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 307 + "'", int0 == 307);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.lang.String str0 = org.dataone.cn.hazelcast.HazelcastConfigLocationFactory.getProcessingConfigLocation();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/etc/dataone/process/hazelcast.xml" + "'", str0, "/etc/dataone/process/hazelcast.xml");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        int int0 = javax.servlet.http.HttpServletResponse.SC_OK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 200 + "'", int0 == 200);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.AccessRuleMapper accessRuleMapper1 = systemMetadataDaoMetacatImpl0.new AccessRuleMapper();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.dataone.cn.dao.SystemMetadataDaoMetacatImpl$AccessRuleMapper with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        int int0 = javax.servlet.http.HttpServletResponse.SC_METHOD_NOT_ALLOWED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 405 + "'", int0 == 405);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.lang.String str0 = org.dataone.cn.hazelcast.HazelcastConfigLocationFactory.getSessionConfigLocation();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/etc/dataone/portal/hazelcast.xml" + "'", str0, "/etc/dataone/portal/hazelcast.xml");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicaEntryMapper replicaEntryMapper1 = systemMetadataDaoMetacatImpl0.new ReplicaEntryMapper();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.dataone.cn.dao.SystemMetadataDaoMetacatImpl$ReplicaEntryMapper with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        com.hazelcast.config.Config config0 = null;
        org.dataone.cn.hazelcast.ClientConfiguration clientConfiguration1 = new org.dataone.cn.hazelcast.ClientConfiguration(config0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = clientConfiguration1.getPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.hazelcast.config.Config.getNetworkConfig()\" because \"this.hazelcastConfig\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.hazelcast.config.Config config0 = null;
        org.dataone.cn.hazelcast.ClientConfiguration clientConfiguration1 = new org.dataone.cn.hazelcast.ClientConfiguration(config0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = clientConfiguration1.getGroup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.hazelcast.config.Config.getGroupConfig()\" because \"this.hazelcastConfig\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        int int0 = javax.servlet.http.HttpServletResponse.SC_BAD_REQUEST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 400 + "'", int0 == 400);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.hazelcast.ClientConfiguration clientConfiguration1 = new org.dataone.cn.hazelcast.ClientConfiguration("authorizedSubjects");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: authorizedSubjects (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean0 = org.dataone.cn.ComponentActivationUtility.synchronizationIsActive();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'Synchronization.active' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener3 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "hi!", "FORM");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.hazelcast.core.HazelcastInstance.getName()\" because \"instance\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        org.dataone.cn.hazelcast.membership.ClusterPartitionMonitor.setSessionPartition(false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        java.lang.String str0 = org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SM_STATUS_TABLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "smreplicationstatus" + "'", str0, "smreplicationstatus");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        org.dataone.cn.ldap.DirContextProvider dirContextProvider0 = org.dataone.cn.ldap.DirContextProvider.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            javax.naming.directory.DirContext dirContext1 = dirContextProvider0.borrowDirContext();
            org.junit.Assert.fail("Expected exception of type javax.naming.CommunicationException; message: localhost:12389");
        } catch (javax.naming.CommunicationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dirContextProvider0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        java.lang.String str0 = org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener.STORAGE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "storage" + "'", str0, "storage");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        int int0 = javax.servlet.http.HttpServletResponse.SC_GONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 410 + "'", int0 == 410);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        int int0 = javax.servlet.http.HttpServletResponse.SC_NOT_ACCEPTABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 406 + "'", int0 == 406);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        int int0 = javax.servlet.http.HttpServletResponse.SC_UNAUTHORIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 401 + "'", int0 == 401);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        int int0 = javax.servlet.http.HttpServletResponse.SC_NO_CONTENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 204 + "'", int0 == 204);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        int int0 = javax.servlet.http.HttpServletResponse.SC_SEE_OTHER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 303 + "'", int0 == 303);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        int int0 = javax.servlet.http.HttpServletResponse.SC_MOVED_PERMANENTLY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 301 + "'", int0 == 301);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = org.dataone.cn.hazelcast.HazelcastInstanceFactory.getProcessingInstance();
        org.junit.Assert.assertNull(hazelcastInstance0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.lang.String str0 = org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SM_POLICY_TABLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "smreplicationpolicy" + "'", str0, "smreplicationpolicy");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.lang.String str0 = org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener.SESSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "session" + "'", str0, "session");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        com.hazelcast.config.Config config0 = null;
        org.dataone.cn.hazelcast.ClientConfiguration clientConfiguration1 = new org.dataone.cn.hazelcast.ClientConfiguration(config0);
        // The following exception was thrown during execution in test generation
        try {
            clientConfiguration1.setStorageConfigurationLocation("storage");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: storage (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        java.lang.String str0 = org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.IDENTIFIER_TABLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "identifier" + "'", str0, "identifier");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        int int0 = javax.servlet.http.HttpServletResponse.SC_INTERNAL_SERVER_ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 500 + "'", int0 == 500);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        org.dataone.cn.hazelcast.membership.ClusterPartitionMonitor.setProcessingPartition(false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        int int0 = javax.servlet.http.HttpServletResponse.SC_REQUEST_ENTITY_TOO_LARGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 413 + "'", int0 == 413);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        int int0 = javax.servlet.http.HttpServletResponse.SC_REQUEST_TIMEOUT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 408 + "'", int0 == 408);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        org.dataone.cn.log.MetricLogClient metricLogClient0 = org.dataone.cn.log.MetricLogClientFactory.getMetricLogClient();
        org.junit.Assert.assertNotNull(metricLogClient0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SystemMetadataStatusMapper systemMetadataStatusMapper1 = systemMetadataDaoMetacatImpl0.new SystemMetadataStatusMapper();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.dataone.cn.dao.SystemMetadataDaoMetacatImpl$SystemMetadataStatusMapper with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        int int0 = javax.servlet.http.HttpServletResponse.SC_NOT_MODIFIED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 304 + "'", int0 == 304);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.dataone.service.types.v1.NodeReference> nodeReferenceCollection1 = replicationDaoMetacatImpl0.getMemberNodesWithQueuedReplica();
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT         DISTINCT member_node        FROM smreplicationstatus    WHERE status='QUEUED';      [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        int int0 = javax.servlet.http.HttpServletResponse.SC_LENGTH_REQUIRED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 411 + "'", int0 == 411);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        boolean boolean0 = org.dataone.cn.hazelcast.membership.ClusterPartitionMonitor.getSessionPartition();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        int int0 = javax.servlet.http.HttpServletResponse.SC_NOT_IMPLEMENTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 501 + "'", int0 == 501);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.flush();
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        int int0 = javax.servlet.http.HttpServletResponse.SC_CONFLICT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 409 + "'", int0 == 409);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<org.dataone.service.types.v1.NodeReference, java.lang.Integer> nodeReferenceMap1 = replicationDaoMetacatImpl0.getRecentFailedReplicas();
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT                   member_node,                           count(status) AS count                 FROM  smreplicationstatus  WHERE status = 'FAILED'                AND   date_verified >= ?               GROUP BY member_node                   ORDER BY member_node;                 [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = replicationDaoMetacatImpl0.getRequestedReplicationCount(nodeReference1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.dataone.service.types.v1.NodeReference.getValue()\" because \"nodeRef\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        int int0 = javax.servlet.http.HttpServletResponse.SC_SWITCHING_PROTOCOLS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 101 + "'", int0 == 101);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        int int0 = javax.servlet.http.HttpServletResponse.SC_PRECONDITION_FAILED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 412 + "'", int0 == 412);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        int int0 = javax.servlet.http.HttpServletResponse.SC_FORBIDDEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 403 + "'", int0 == 403);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        int int0 = javax.servlet.http.HttpServletResponse.SC_PROXY_AUTHENTICATION_REQUIRED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 407 + "'", int0 == 407);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.hazelcast.config.Config config0 = null;
        org.dataone.cn.hazelcast.ClientConfiguration clientConfiguration1 = new org.dataone.cn.hazelcast.ClientConfiguration(config0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = clientConfiguration1.getPassword();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.hazelcast.config.Config.getGroupConfig()\" because \"this.hazelcastConfig\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        int int0 = javax.servlet.http.HttpServletResponse.SC_EXPECTATION_FAILED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 417 + "'", int0 == 417);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener2 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "processing");
        com.hazelcast.core.MembershipEvent membershipEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            clusterPartitionMembershipListener2.handleMemberRemovedEvent(membershipEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.hazelcast.core.HazelcastInstance.getCluster()\" because \"this.hzInstance\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.MetricEvent metricEvent1 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        org.dataone.service.types.v1.Identifier identifier3 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry5 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, nodeReference2, identifier3, "FORM");
        java.util.Date date6 = metricLogEntry5.getDateLogged();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList9 = replicationDaoMetacatImpl0.getCompletedMemberNodeReplicasByDate(date6, 411, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'COMPLETED'   AND member_node <> 'cnDev'  ORDER BY date_verified ASC  LIMIT 32 OFFSET 13120; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + metricEvent1 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent1.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Fri Oct 27 23:36:57 CDT 2023");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<org.dataone.service.types.v1.NodeReference, java.lang.Integer> nodeReferenceMap1 = replicationDaoMetacatImpl0.getRecentFailedReplicas();
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT                   member_node,                           count(status) AS count                 FROM  smreplicationstatus  WHERE status = 'FAILED'                AND   date_verified >= ?               GROUP BY member_node                   ORDER BY member_node;                 [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.AuditEvent auditEvent3 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str4 = auditEvent3.toString();
        org.dataone.cn.log.MetricEvent metricEvent5 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference6 = null;
        org.dataone.service.types.v1.Identifier identifier7 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry9 = new org.dataone.cn.log.MetricLogEntry(metricEvent5, nodeReference6, identifier7, "FORM");
        java.util.Date date10 = metricLogEntry9.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry12 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent3, date10, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList15 = replicationDaoMetacatImpl0.getInvalidMemberNodeReplicasByDate(date10, 408, 408);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'INVALIDATED'   AND member_node <> 'cnDev'  ORDER BY date_verified ASC  LIMIT 408 OFFSET 166056; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + auditEvent3 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent3.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "replica audit failed" + "'", str4, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent5 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent5.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Fri Oct 27 23:36:57 CDT 2023");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        int int0 = javax.servlet.http.HttpServletResponse.SC_SERVICE_UNAVAILABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 503 + "'", int0 == 503);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.MetricEvent metricEvent1 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        org.dataone.service.types.v1.Identifier identifier3 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry5 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, nodeReference2, identifier3, "FORM");
        java.util.Date date6 = metricLogEntry5.getDateLogged();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList9 = replicationDaoMetacatImpl0.getCompletedMemberNodeReplicasByDate(date6, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'COMPLETED'   AND member_node <> 'cnDev'  ORDER BY date_verified ASC  LIMIT 100 OFFSET 9900; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + metricEvent1 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent1.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Fri Oct 27 23:36:57 CDT 2023");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        org.dataone.cn.hazelcast.HazelcastClientInstance hazelcastClientInstance0 = new org.dataone.cn.hazelcast.HazelcastClientInstance();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        int int0 = javax.servlet.http.HttpServletResponse.SC_PARTIAL_CONTENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 206 + "'", int0 == 206);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener3 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:57 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:36:57:366, log text: hi!'}", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.hazelcast.core.HazelcastInstance.getName()\" because \"instance\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.cn.log.MetricLogEntry metricLogEntry1 = new org.dataone.cn.log.MetricLogEntry(metricEvent0);
        java.lang.Long long2 = metricLogEntry1.getTimeToCompleteEventMS();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        javax.servlet.http.HttpServletResponse httpServletResponse0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.servlet.http.BufferedServletResponseWrapper bufferedServletResponseWrapper1 = new org.dataone.cn.servlet.http.BufferedServletResponseWrapper(httpServletResponse0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Response cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        int int0 = javax.servlet.http.HttpServletResponse.SC_HTTP_VERSION_NOT_SUPPORTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 505 + "'", int0 == 505);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.lang.String str0 = org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SYSMETA_TABLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "systemmetadata" + "'", str0, "systemmetadata");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        org.dataone.cn.log.MetricLogClientLog4JImpl metricLogClientLog4JImpl0 = new org.dataone.cn.log.MetricLogClientLog4JImpl();
        org.dataone.cn.log.MetricEvent metricEvent1 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        org.dataone.service.types.v1.Identifier identifier3 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry5 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, nodeReference2, identifier3, "FORM");
        java.util.Date date6 = metricLogEntry5.getDateLogged();
        boolean boolean7 = metricLogClientLog4JImpl0.logMetricEvent(metricLogEntry5);
        org.junit.Assert.assertTrue("'" + metricEvent1 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent1.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Fri Oct 27 23:36:57 CDT 2023");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.servlet.http.ProxyServletRequestWrapper proxyServletRequestWrapper1 = new org.dataone.cn.servlet.http.ProxyServletRequestWrapper(httpServletRequest0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = replicationDaoMetacatImpl0.queuedReplicaExists("/etc/dataone/process/hazelcast.xml", "session");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        count(*)                               FROM  smreplicationstatus              WHERE guid = ?                         AND member_node = ?                    AND status = 'QUEUED'                 [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = replicationDaoMetacatImpl0.getQueuedReplicaCountByNode("replica audit failed");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        count(*)                               FROM  smreplicationstatus              WHERE member_node = ?                  AND status = 'QUEUED';              [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        org.dataone.cn.dao.SystemMetadataDao systemMetadataDao0 = org.dataone.cn.dao.DaoFactory.getSystemMetadataDao();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.cn.dao.SystemMetadataStatus> systemMetadataStatusList3 = systemMetadataDao0.listSystemMetadataStatus((int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.dataone.cn.dao.exceptions.DataAccessException; message: org.springframework.jdbc.BadSqlGrammarException: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SYSTEMMETADATA\" not found; SQL statement:?SELECT guid, serial_version, date_modified, archived FROM systemmetadata ORDER BY guid LIMIT 100 OFFSET 900; [42102-163]");
        } catch (org.dataone.cn.dao.exceptions.DataAccessException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemMetadataDao0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        org.dataone.cn.dao.ReplicationPolicyEntry replicationPolicyEntry0 = new org.dataone.cn.dao.ReplicationPolicyEntry();
        replicationPolicyEntry0.setPolicy("isCnAdministrator");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        int int0 = javax.servlet.http.HttpServletResponse.SC_REQUESTED_RANGE_NOT_SATISFIABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 416 + "'", int0 == 416);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = systemMetadataDaoMetacatImpl0.getSystemMetadataCount();
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: StatementCallback; bad SQL grammar [SELECT count(guid) FROM systemmetadata]; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SYSTEMMETADATA\" not found; SQL statement:?SELECT count(guid) FROM systemmetadata [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.MetricEvent metricEvent1 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        org.dataone.service.types.v1.Identifier identifier3 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry5 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, nodeReference2, identifier3, "FORM");
        java.util.Date date6 = metricLogEntry5.getDateLogged();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList9 = replicationDaoMetacatImpl0.getCompletedCoordinatingNodeReplicasByDate(date6, 406, 503);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'COMPLETED'   AND member_node = 'cnDev'  ORDER BY date_verified ASC LIMIT 503 OFFSET 203715; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + metricEvent1 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent1.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Fri Oct 27 23:36:57 CDT 2023");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.cn.dao.SystemMetadataStatus> systemMetadataStatusList4 = systemMetadataDaoMetacatImpl0.listSystemMetadataStatus((int) ' ', 301, strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"this.val$finalTableMap\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        org.dataone.cn.batch.exceptions.ExecutionDisabledException executionDisabledException1 = new org.dataone.cn.batch.exceptions.ExecutionDisabledException("");
        org.dataone.cn.dao.exceptions.DataAccessException dataAccessException2 = new org.dataone.cn.dao.exceptions.DataAccessException((java.lang.Throwable) executionDisabledException1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = replicationDaoMetacatImpl0.queuedReplicaExists("authorizedSubjects", "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:57 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:36:57:366, log text: hi!'}");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        count(*)                               FROM  smreplicationstatus              WHERE guid = ?                         AND member_node = ?                    AND status = 'QUEUED'                 [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        int int0 = javax.servlet.http.HttpServletResponse.SC_REQUEST_URI_TOO_LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 414 + "'", int0 == 414);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.dataone.cn.dao.ReplicationDao.ReplicaDto> replicaDtoCollection2 = replicationDaoMetacatImpl0.getQueuedReplicasByNode("synchronization harvest submitted");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        guid,                                  member_node,                           status,                                date_verified                          FROM  smreplicationstatus              WHERE member_node = ?               AND status = 'QUEUED'               ORDER BY date_verified ASC;           [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        int int0 = javax.servlet.http.HttpServletResponse.SC_GATEWAY_TIMEOUT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 504 + "'", int0 == 504);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl();
        org.dataone.service.types.v1.Identifier identifier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.service.types.v2.SystemMetadata systemMetadata2 = systemMetadataDaoMetacatImpl0.getSystemMetadata(identifier1);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SYSTEMMETADATA\" not found; SQL statement:?SELECT guid, series_id, date_uploaded, rights_holder, checksum, checksum_algorithm, origin_member_node, authoritive_member_node, date_modified, submitter, object_format, size, replication_allowed, number_replicas, obsoletes, obsoleted_by, serial_version, archived FROM systemmetadata WHERE guid = ?; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener2 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "processing");
        com.hazelcast.core.MembershipEvent membershipEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            clusterPartitionMembershipListener2.handleMemberAddedEvent(membershipEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.hazelcast.core.HazelcastInstance.getCluster()\" because \"this.hzInstance\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        org.dataone.cn.synchronization.types.SyncObject syncObject2 = new org.dataone.cn.synchronization.types.SyncObject("AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:57 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:36:57:366, log text: hi!'}", "systemmetadata");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl();
        org.dataone.service.types.v1.Identifier identifier1 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.service.types.v2.SystemMetadata systemMetadata3 = systemMetadataDaoMetacatImpl0.getSystemMetadata(identifier1, strMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"tableMap\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.hazelcast.ClientConfiguration clientConfiguration1 = new org.dataone.cn.hazelcast.ClientConfiguration("smreplicationpolicy");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: smreplicationpolicy (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.cn.dao.SystemMetadataStatus> systemMetadataStatusList4 = systemMetadataDaoMetacatImpl0.listSystemMetadataStatus(100, 407, strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"this.val$finalTableMap\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.MetricEvent metricEvent1 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        org.dataone.service.types.v1.Identifier identifier3 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry5 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, nodeReference2, identifier3, "FORM");
        java.util.Date date6 = metricLogEntry5.getDateLogged();
        java.util.Date date7 = metricLogEntry5.getDateLogged();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList10 = replicationDaoMetacatImpl0.getCompletedMemberNodeReplicasByDate(date7, (int) (short) 10, 401);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'COMPLETED'   AND member_node <> 'cnDev'  ORDER BY date_verified ASC  LIMIT 401 OFFSET 3609; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + metricEvent1 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent1.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Fri Oct 27 23:36:58 CDT 2023");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Oct 27 23:36:58 CDT 2023");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        int int0 = javax.servlet.http.HttpServletResponse.SC_CREATED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 201 + "'", int0 == 201);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = replicationDaoMetacatImpl0.queuedReplicaExists("smreplicationpolicy", "authorizedSubjects");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        count(*)                               FROM  smreplicationstatus              WHERE guid = ?                         AND member_node = ?                    AND status = 'QUEUED'                 [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry3 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2);
        java.lang.String str4 = metricEvent0.toString();
        org.dataone.service.types.v1.NodeReference nodeReference5 = null;
        org.dataone.service.types.v1.Identifier identifier6 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry7 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference5, identifier6);
        java.lang.String str8 = metricEvent0.toString();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "synchronization harvest submitted" + "'", str4, "synchronization harvest submitted");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "synchronization harvest submitted" + "'", str8, "synchronization harvest submitted");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<org.dataone.service.types.v1.NodeReference, java.lang.Integer> nodeReferenceMap1 = replicationDaoMetacatImpl0.getPendingReplicasByNode();
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT           member_node,                  count(status) AS count       FROM  smreplicationstatus    WHERE status = 'REQUESTED'     OR  status = 'QUEUED'      GROUP BY member_node         ORDER BY member_node;       [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.hazelcast.ClientConfiguration clientConfiguration0 = new org.dataone.cn.hazelcast.ClientConfiguration();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: storage (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        javax.sql.DataSource dataSource0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl1 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl(dataSource0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property 'dataSource' is required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<org.dataone.service.types.v1.NodeReference, java.lang.Integer> nodeReferenceMap1 = replicationDaoMetacatImpl0.getRecentCompletedReplicas();
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT                   member_node,                           count(status) AS count                 FROM  smreplicationstatus  WHERE status = 'COMPLETED'             AND   date_verified >= ?               GROUP BY member_node                   ORDER BY member_node;                 [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = replicationDaoMetacatImpl0.getQueuedReplicaCountByNode("isCnAdministrator");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        count(*)                               FROM  smreplicationstatus              WHERE member_node = ?                  AND status = 'QUEUED';              [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.close();
        outputStream0.close();
        outputStream0.flush();
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean0 = org.dataone.cn.ComponentActivationUtility.replicationMNAuditorIsActive();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'Replication.audit.mn.active' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        org.dataone.cn.hazelcast.membership.ClusterPartitionMonitor.setProcessingPartition(true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.lang.String str0 = javax.servlet.http.HttpServletRequest.DIGEST_AUTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "DIGEST" + "'", str0, "DIGEST");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        int int0 = javax.servlet.http.HttpServletResponse.SC_MULTIPLE_CHOICES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 300 + "'", int0 == 300);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener2 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "processing");
        // The following exception was thrown during execution in test generation
        try {
            clusterPartitionMembershipListener2.startListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.hazelcast.core.HazelcastInstance.getName()\" because \"this.hzInstance\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl();
        org.dataone.service.types.v1.Permission permission1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = systemMetadataDaoMetacatImpl0.convertPermission(permission1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.dataone.service.types.v1.Permission.equals(Object)\" because \"permission\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.AuditEvent auditEvent3 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str4 = auditEvent3.toString();
        org.dataone.cn.log.MetricEvent metricEvent5 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference6 = null;
        org.dataone.service.types.v1.Identifier identifier7 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry9 = new org.dataone.cn.log.MetricLogEntry(metricEvent5, nodeReference6, identifier7, "FORM");
        java.util.Date date10 = metricLogEntry9.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry12 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent3, date10, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList15 = replicationDaoMetacatImpl0.getCompletedCoordinatingNodeReplicasByDate(date10, 1, 0);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'COMPLETED'   AND member_node = 'cnDev'  ORDER BY date_verified ASC; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + auditEvent3 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent3.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "replica audit failed" + "'", str4, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent5 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent5.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Fri Oct 27 23:36:59 CDT 2023");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.cn.dao.SystemMetadataStatus> systemMetadataStatusList3 = systemMetadataDaoMetacatImpl0.listSystemMetadataStatus(408, 307);
            org.junit.Assert.fail("Expected exception of type org.dataone.cn.dao.exceptions.DataAccessException; message: org.springframework.jdbc.BadSqlGrammarException: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SYSTEMMETADATA\" not found; SQL statement:?SELECT guid, serial_version, date_modified, archived FROM systemmetadata ORDER BY guid LIMIT 307 OFFSET 124949; [42102-163]");
        } catch (org.dataone.cn.dao.exceptions.DataAccessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        org.dataone.cn.log.AuditEvent auditEvent2 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str3 = auditEvent2.toString();
        org.dataone.cn.log.MetricEvent metricEvent4 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference5 = null;
        org.dataone.service.types.v1.Identifier identifier6 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry8 = new org.dataone.cn.log.MetricLogEntry(metricEvent4, nodeReference5, identifier6, "FORM");
        java.util.Date date9 = metricLogEntry8.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry11 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent2, date9, "hi!");
        auditLogEntry11.setNodeId("processing");
        org.junit.Assert.assertTrue("'" + auditEvent2 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent2.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "replica audit failed" + "'", str3, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent4 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent4.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Fri Oct 27 23:36:59 CDT 2023");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        org.apache.commons.logging.Log log0 = org.dataone.cn.ldap.LDAPService.log;
        org.dataone.cn.ldap.DirContextPooledObjectFactory.log = log0;
        org.dataone.cn.ldap.DirContextProvider.log = log0;
        org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        org.dataone.cn.servlet.http.ParameterKeys parameterKeys0 = new org.dataone.cn.servlet.http.ParameterKeys();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        boolean boolean0 = org.dataone.cn.ComponentActivationUtility.disableSynchronization();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = replicationDaoMetacatImpl0.queuedReplicaExists("processing", "/etc/dataone/storage/hazelcast.xml");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        count(*)                               FROM  smreplicationstatus              WHERE guid = ?                         AND member_node = ?                    AND status = 'QUEUED'                 [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        int int0 = javax.servlet.http.HttpServletResponse.SC_PAYMENT_REQUIRED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 402 + "'", int0 == 402);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        org.dataone.cn.hazelcast.HazelcastConfigLocationFactory hazelcastConfigLocationFactory0 = new org.dataone.cn.hazelcast.HazelcastConfigLocationFactory();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener2 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "processing");
        com.hazelcast.core.MembershipEvent membershipEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            clusterPartitionMembershipListener2.memberAdded(membershipEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.hazelcast.core.MembershipEvent.getEventType()\" because \"membershipEvent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.MetricEvent metricEvent1 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        org.dataone.service.types.v1.Identifier identifier3 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry5 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, nodeReference2, identifier3, "FORM");
        java.util.Date date6 = metricLogEntry5.getDateLogged();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList9 = replicationDaoMetacatImpl0.getCompletedCoordinatingNodeReplicasByDate(date6, (int) (short) -1, 408);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'COMPLETED'   AND member_node = 'cnDev'  ORDER BY date_verified ASC; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + metricEvent1 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent1.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Fri Oct 27 23:36:59 CDT 2023");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        java.lang.String str0 = org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ACCESS_TABLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xml_access" + "'", str0, "xml_access");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener2 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "processing");
        clusterPartitionMembershipListener2.setExpectedIPList("processing");
        clusterPartitionMembershipListener2.setExpectedIPList("session");
        com.hazelcast.core.MembershipEvent membershipEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            clusterPartitionMembershipListener2.memberRemoved(membershipEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.hazelcast.core.MembershipEvent.getEventType()\" because \"membershipEvent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        org.dataone.cn.dao.SystemMetadataStatus systemMetadataStatus0 = new org.dataone.cn.dao.SystemMetadataStatus();
        java.util.Date date1 = systemMetadataStatus0.getLastSystemMetadataModificationDate();
        org.dataone.cn.log.MetricEvent metricEvent2 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference3 = null;
        org.dataone.service.types.v1.Identifier identifier4 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry6 = new org.dataone.cn.log.MetricLogEntry(metricEvent2, nodeReference3, identifier4, "FORM");
        java.util.Date date7 = metricLogEntry6.getDateLogged();
        systemMetadataStatus0.setLastSystemMetadataModificationDate(date7);
        org.dataone.service.types.v1.Identifier identifier9 = null;
        systemMetadataStatus0.setPid(identifier9);
        java.math.BigInteger bigInteger11 = systemMetadataStatus0.getSerialVersion();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertTrue("'" + metricEvent2 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent2.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Oct 27 23:36:59 CDT 2023");
        org.junit.Assert.assertNull(bigInteger11);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        int int0 = javax.servlet.http.HttpServletResponse.SC_NON_AUTHORITATIVE_INFORMATION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 203 + "'", int0 == 203);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        int int0 = javax.servlet.http.HttpServletResponse.SC_ACCEPTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 202 + "'", int0 == 202);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = replicationDaoMetacatImpl0.queuedReplicaExists("AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023, dateLogged: 10/27/2023:23:36:58:794, log text: hi!'}", "replica audit failed");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        count(*)                               FROM  smreplicationstatus              WHERE guid = ?                         AND member_node = ?                    AND status = 'QUEUED'                 [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap1 = replicationDaoMetacatImpl0.getCountsByNodeStatus();
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT                   member_node, status,                 count(status) AS count                FROM  smreplicationstatus             GROUP BY member_node, status          ORDER BY member_node, status;        [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        java.io.OutputStream outputStream0 = java.io.OutputStream.nullOutputStream();
        outputStream0.close();
        outputStream0.flush();
        org.junit.Assert.assertNotNull(outputStream0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicationPolicyEntryMapper replicationPolicyEntryMapper1 = systemMetadataDaoMetacatImpl0.new ReplicationPolicyEntryMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.cn.dao.SystemMetadataStatus> systemMetadataStatusList4 = systemMetadataDaoMetacatImpl0.listSystemMetadataStatus(407, 304);
            org.junit.Assert.fail("Expected exception of type org.dataone.cn.dao.exceptions.DataAccessException; message: org.springframework.jdbc.BadSqlGrammarException: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SYSTEMMETADATA\" not found; SQL statement:?SELECT guid, serial_version, date_modified, archived FROM systemmetadata ORDER BY guid LIMIT 304 OFFSET 123424; [42102-163]");
        } catch (org.dataone.cn.dao.exceptions.DataAccessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry3 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2);
        java.lang.String str4 = metricEvent0.toString();
        org.dataone.service.types.v1.NodeReference nodeReference5 = null;
        org.dataone.service.types.v1.Identifier identifier6 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry7 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference5, identifier6);
        java.lang.Class<?> wildcardClass8 = metricLogEntry7.getClass();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "synchronization harvest submitted" + "'", str4, "synchronization harvest submitted");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        int int0 = javax.servlet.http.HttpServletResponse.SC_FOUND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 302 + "'", int0 == 302);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        org.apache.commons.logging.Log log0 = org.dataone.cn.hazelcast.HazelcastClientFactory.logger;
        org.dataone.cn.servlet.http.ProxyServletRequestWrapper.logger = log0;
        org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        java.lang.String str0 = org.dataone.cn.servlet.http.ParameterKeys.IS_MN_ADMINISTRATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "isMnAdministrator" + "'", str0, "isMnAdministrator");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        org.dataone.cn.log.AuditEvent auditEvent0 = org.dataone.cn.log.AuditEvent.REPLICA_BAD_CHECKSUM;
        org.junit.Assert.assertTrue("'" + auditEvent0 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_BAD_CHECKSUM + "'", auditEvent0.equals(org.dataone.cn.log.AuditEvent.REPLICA_BAD_CHECKSUM));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.dataone.cn.dao.ReplicationDao.ReplicaDto> replicaDtoCollection2 = replicationDaoMetacatImpl0.getQueuedReplicasByNode("AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:36:58:325, log text: hi!'}");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        guid,                                  member_node,                           status,                                date_verified                          FROM  smreplicationstatus              WHERE member_node = ?               AND status = 'QUEUED'               ORDER BY date_verified ASC;           [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        int int0 = javax.servlet.http.HttpServletResponse.SC_USE_PROXY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 305 + "'", int0 == 305);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.MetricEvent metricEvent1 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        org.dataone.service.types.v1.Identifier identifier3 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry5 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, nodeReference2, identifier3, "FORM");
        java.util.Date date6 = metricLogEntry5.getDateLogged();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList9 = replicationDaoMetacatImpl0.getCompletedMemberNodeReplicasByDate(date6, 504, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'COMPLETED'   AND member_node <> 'cnDev'  ORDER BY date_verified ASC  LIMIT 52 OFFSET 26156; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + metricEvent1 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent1.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Fri Oct 27 23:37:00 CDT 2023");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.hazelcast.config.Config config0 = null;
        org.dataone.cn.hazelcast.ClientConfiguration clientConfiguration1 = new org.dataone.cn.hazelcast.ClientConfiguration(config0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = clientConfiguration1.getLocalhost();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.hazelcast.config.Config.getNetworkConfig()\" because \"this.hazelcastConfig\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        org.dataone.cn.batch.exceptions.ExecutionDisabledException executionDisabledException0 = new org.dataone.cn.batch.exceptions.ExecutionDisabledException();
        java.lang.Throwable[] throwableArray1 = executionDisabledException0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.MetricEvent metricEvent1 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        org.dataone.service.types.v1.Identifier identifier3 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry5 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, nodeReference2, identifier3, "FORM");
        java.util.Date date6 = metricLogEntry5.getDateLogged();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList9 = replicationDaoMetacatImpl0.getCompletedMemberNodeReplicasByDate(date6, (int) '4', 407);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'COMPLETED'   AND member_node <> 'cnDev'  ORDER BY date_verified ASC  LIMIT 407 OFFSET 20757; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + metricEvent1 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent1.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Fri Oct 27 23:37:00 CDT 2023");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        org.apache.commons.logging.Log log0 = org.dataone.cn.ldap.DirContextPooledObjectFactory.log;
        org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.close();
        bufferedServletOutputStream0.print((float) 406);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry3 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2);
        org.dataone.cn.log.MetricEvent metricEvent4 = metricLogEntry3.getEvent();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertTrue("'" + metricEvent4 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent4.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<org.dataone.service.types.v1.NodeReference, java.lang.Integer> nodeReferenceMap1 = replicationDaoMetacatImpl0.getRecentCompletedReplicas();
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT                   member_node,                           count(status) AS count                 FROM  smreplicationstatus  WHERE status = 'COMPLETED'             AND   date_verified >= ?               GROUP BY member_node                   ORDER BY member_node;                 [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicationPolicyEntryMapper replicationPolicyEntryMapper1 = systemMetadataDaoMetacatImpl0.new ReplicationPolicyEntryMapper();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.cn.dao.SystemMetadataStatus> systemMetadataStatusList5 = systemMetadataDaoMetacatImpl0.listSystemMetadataStatus((int) 'a', (int) (byte) 1, strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"this.val$finalTableMap\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        org.dataone.cn.batch.exceptions.ExecutionDisabledException executionDisabledException1 = new org.dataone.cn.batch.exceptions.ExecutionDisabledException("replica audit failed");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2, "FORM");
        java.util.Date date5 = metricLogEntry4.getDateLogged();
        org.dataone.service.types.v1.Identifier identifier6 = null;
        metricLogEntry4.setPid(identifier6);
        java.lang.String str8 = metricLogEntry4.toString();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Oct 27 23:37:00 CDT 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{\"event\":\"synchronization harvest submitted\",\"message\":\"FORM\",\"threadName\":\"main\",\"threadId\":1,\"dateLogged\":\"2023-10-28T04:37:00.861+00:00\"}" + "'", str8, "{\"event\":\"synchronization harvest submitted\",\"message\":\"FORM\",\"threadName\":\"main\",\"threadId\":1,\"dateLogged\":\"2023-10-28T04:37:00.861+00:00\"}");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        org.dataone.cn.ldap.DirContextProvider dirContextProvider0 = org.dataone.cn.ldap.DirContextProvider.getInstance();
        int int1 = dirContextProvider0.getNumDirContextActive();
        int int2 = dirContextProvider0.getNumDirContextIdle();
        int int3 = dirContextProvider0.getNumDirContextIdle();
        org.junit.Assert.assertNotNull(dirContextProvider0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry3 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2);
        java.lang.String str4 = metricEvent0.toString();
        org.dataone.service.types.v1.NodeReference nodeReference5 = null;
        org.dataone.service.types.v1.Identifier identifier6 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry7 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference5, identifier6);
        org.dataone.service.types.v1.NodeReference nodeReference8 = null;
        org.dataone.service.types.v1.Identifier identifier9 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry11 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference8, identifier9, "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:57 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:36:57:366, log text: hi!'}");
        org.dataone.service.types.v1.NodeReference nodeReference12 = metricLogEntry11.getNodeId();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "synchronization harvest submitted" + "'", str4, "synchronization harvest submitted");
        org.junit.Assert.assertNull(nodeReference12);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicationPolicyEntryMapper replicationPolicyEntryMapper1 = systemMetadataDaoMetacatImpl0.new ReplicationPolicyEntryMapper();
        org.dataone.service.types.v1.Permission permission2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = systemMetadataDaoMetacatImpl0.convertPermission(permission2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.dataone.service.types.v1.Permission.equals(Object)\" because \"permission\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.print((float) 501);
        bufferedServletOutputStream0.println((float) 204);
        bufferedServletOutputStream0.write(305);
        bufferedServletOutputStream0.println((long) 501);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        org.dataone.cn.dao.SystemMetadataStatus systemMetadataStatus0 = new org.dataone.cn.dao.SystemMetadataStatus();
        java.util.Date date1 = systemMetadataStatus0.getLastSystemMetadataModificationDate();
        systemMetadataStatus0.setDeleted((java.lang.Boolean) false);
        org.junit.Assert.assertNull(date1);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry3 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2);
        java.lang.String str4 = metricEvent0.toString();
        org.dataone.service.types.v1.NodeReference nodeReference5 = null;
        org.dataone.service.types.v1.Identifier identifier6 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry7 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference5, identifier6);
        java.lang.String str8 = metricLogEntry7.toString();
        org.dataone.cn.log.MetricEvent metricEvent9 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_RETRIEVED;
        metricLogEntry7.setEvent(metricEvent9);
        org.dataone.service.types.v1.NodeReference nodeReference11 = null;
        org.dataone.service.types.v1.Identifier identifier12 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry13 = new org.dataone.cn.log.MetricLogEntry(metricEvent9, nodeReference11, identifier12);
        org.dataone.service.types.v1.NodeReference nodeReference15 = null;
        org.dataone.service.types.v1.Identifier identifier16 = null;
        org.dataone.cn.log.AuditEvent auditEvent20 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str21 = auditEvent20.toString();
        org.dataone.cn.log.MetricEvent metricEvent22 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference23 = null;
        org.dataone.service.types.v1.Identifier identifier24 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry26 = new org.dataone.cn.log.MetricLogEntry(metricEvent22, nodeReference23, identifier24, "FORM");
        java.util.Date date27 = metricLogEntry26.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry29 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent20, date27, "hi!");
        java.lang.String str30 = auditLogEntry29.getId();
        java.util.Date date31 = auditLogEntry29.getDateLogged();
        org.dataone.cn.log.MetricLogEntry metricLogEntry32 = new org.dataone.cn.log.MetricLogEntry(metricEvent9, "systemmetadata", nodeReference15, identifier16, (java.lang.Long) 10L, date31);
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "synchronization harvest submitted" + "'", str4, "synchronization harvest submitted");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{\"event\":\"synchronization harvest submitted\",\"threadName\":\"main\",\"threadId\":1,\"dateLogged\":\"2023-10-28T04:37:01.245+00:00\"}" + "'", str8, "{\"event\":\"synchronization harvest submitted\",\"threadName\":\"main\",\"threadId\":1,\"dateLogged\":\"2023-10-28T04:37:01.245+00:00\"}");
        org.junit.Assert.assertTrue("'" + metricEvent9 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_RETRIEVED + "'", metricEvent9.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + auditEvent20 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent20.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "replica audit failed" + "'", str21, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent22 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent22.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Fri Oct 27 23:37:01 CDT 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "|authorizedSubjects|replica audit failed|Fri Oct 27 23:37:01 CDT 2023" + "'", str30, "|authorizedSubjects|replica audit failed|Fri Oct 27 23:37:01 CDT 2023");
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Fri Oct 27 23:37:01 CDT 2023");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap1 = replicationDaoMetacatImpl0.getCountsByNodeStatus();
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT                   member_node, status,                 count(status) AS count                FROM  smreplicationstatus             GROUP BY member_node, status          ORDER BY member_node, status;        [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.dataone.service.types.v1.NodeReference> nodeReferenceCollection1 = replicationDaoMetacatImpl0.getMemberNodesWithQueuedReplica();
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT         DISTINCT member_node        FROM smreplicationstatus    WHERE status='QUEUED';      [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        org.dataone.cn.dao.ReplicationPolicyEntry replicationPolicyEntry0 = new org.dataone.cn.dao.ReplicationPolicyEntry();
        org.dataone.service.types.v1.NodeReference nodeReference1 = replicationPolicyEntry0.getMemberNode();
        org.junit.Assert.assertNull(nodeReference1);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = replicationDaoMetacatImpl0.getRequestedReplicationCount(nodeReference1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.dataone.service.types.v1.NodeReference.getValue()\" because \"nodeRef\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicationPolicyEntryMapper replicationPolicyEntryMapper1 = systemMetadataDaoMetacatImpl0.new ReplicationPolicyEntryMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicationPolicyEntryMapper replicationPolicyEntryMapper2 = systemMetadataDaoMetacatImpl0.new ReplicationPolicyEntryMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.AccessRuleMapper accessRuleMapper3 = systemMetadataDaoMetacatImpl0.new AccessRuleMapper();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = systemMetadataDaoMetacatImpl0.getSystemMetadataCount();
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: StatementCallback; bad SQL grammar [SELECT count(guid) FROM systemmetadata]; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SYSTEMMETADATA\" not found; SQL statement:?SELECT count(guid) FROM systemmetadata [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry3 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2);
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent0);
        org.dataone.service.types.v1.NodeReference nodeReference5 = null;
        metricLogEntry4.setNodeId(nodeReference5);
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicationPolicyEntryMapper replicationPolicyEntryMapper1 = systemMetadataDaoMetacatImpl0.new ReplicationPolicyEntryMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicationPolicyEntryMapper replicationPolicyEntryMapper2 = systemMetadataDaoMetacatImpl0.new ReplicationPolicyEntryMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.AccessRuleMapper accessRuleMapper3 = systemMetadataDaoMetacatImpl0.new AccessRuleMapper();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = systemMetadataDaoMetacatImpl0.getSystemMetadataCount(strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"tableMap\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        org.dataone.cn.dao.ReplicationPolicyEntry replicationPolicyEntry0 = new org.dataone.cn.dao.ReplicationPolicyEntry();
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        replicationPolicyEntry0.setMemberNode(nodeReference1);
        org.dataone.service.types.v1.NodeReference nodeReference3 = null;
        replicationPolicyEntry0.setMemberNode(nodeReference3);
        org.dataone.service.types.v1.NodeReference nodeReference5 = replicationPolicyEntry0.getMemberNode();
        org.dataone.service.types.v1.NodeReference nodeReference6 = null;
        replicationPolicyEntry0.setMemberNode(nodeReference6);
        org.dataone.service.types.v1.Identifier identifier8 = null;
        replicationPolicyEntry0.setPid(identifier8);
        org.junit.Assert.assertNull(nodeReference5);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.AuditEvent auditEvent3 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str4 = auditEvent3.toString();
        org.dataone.cn.log.MetricEvent metricEvent5 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference6 = null;
        org.dataone.service.types.v1.Identifier identifier7 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry9 = new org.dataone.cn.log.MetricLogEntry(metricEvent5, nodeReference6, identifier7, "FORM");
        java.util.Date date10 = metricLogEntry9.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry12 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent3, date10, "hi!");
        java.lang.String str13 = auditLogEntry12.getId();
        java.util.Date date14 = auditLogEntry12.getDateLogged();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList17 = replicationDaoMetacatImpl0.getInvalidMemberNodeReplicasByDate(date14, 307, 407);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'INVALIDATED'   AND member_node <> 'cnDev'  ORDER BY date_verified ASC  LIMIT 407 OFFSET 124542; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + auditEvent3 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent3.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "replica audit failed" + "'", str4, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent5 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent5.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Fri Oct 27 23:37:01 CDT 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "|authorizedSubjects|replica audit failed|Fri Oct 27 23:37:01 CDT 2023" + "'", str13, "|authorizedSubjects|replica audit failed|Fri Oct 27 23:37:01 CDT 2023");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Fri Oct 27 23:37:01 CDT 2023");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println((int) (short) 100);
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) -1 };
        bufferedServletOutputStream0.write(byteArray9);
        bufferedServletOutputStream0.print(true);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 1, 0, 0, -1, -1]");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicationPolicyEntryMapper replicationPolicyEntryMapper1 = systemMetadataDaoMetacatImpl0.new ReplicationPolicyEntryMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicationPolicyEntryMapper replicationPolicyEntryMapper2 = systemMetadataDaoMetacatImpl0.new ReplicationPolicyEntryMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.AccessRuleMapper accessRuleMapper3 = systemMetadataDaoMetacatImpl0.new AccessRuleMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.cn.dao.SystemMetadataStatus> systemMetadataStatusList6 = systemMetadataDaoMetacatImpl0.listSystemMetadataStatus(200, 408);
            org.junit.Assert.fail("Expected exception of type org.dataone.cn.dao.exceptions.DataAccessException; message: org.springframework.jdbc.BadSqlGrammarException: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SYSTEMMETADATA\" not found; SQL statement:?SELECT guid, serial_version, date_modified, archived FROM systemmetadata ORDER BY guid LIMIT 408 OFFSET 81192; [42102-163]");
        } catch (org.dataone.cn.dao.exceptions.DataAccessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener2 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "processing");
        clusterPartitionMembershipListener2.setExpectedIPList("processing");
        com.hazelcast.core.MembershipEvent membershipEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            clusterPartitionMembershipListener2.memberAdded(membershipEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.hazelcast.core.MembershipEvent.getEventType()\" because \"membershipEvent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        org.dataone.cn.ldap.DirContextPooledObjectFactory dirContextPooledObjectFactory0 = new org.dataone.cn.ldap.DirContextPooledObjectFactory();
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject1 = null;
        dirContextPooledObjectFactory0.passivateObject(dirContextPooledObject1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.AuditEvent auditEvent3 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str4 = auditEvent3.toString();
        org.dataone.cn.log.MetricEvent metricEvent5 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference6 = null;
        org.dataone.service.types.v1.Identifier identifier7 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry9 = new org.dataone.cn.log.MetricLogEntry(metricEvent5, nodeReference6, identifier7, "FORM");
        java.util.Date date10 = metricLogEntry9.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry12 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent3, date10, "hi!");
        org.dataone.cn.log.MetricEvent metricEvent13 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference14 = null;
        org.dataone.service.types.v1.Identifier identifier15 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry17 = new org.dataone.cn.log.MetricLogEntry(metricEvent13, nodeReference14, identifier15, "FORM");
        java.util.Date date18 = metricLogEntry17.getDateLogged();
        java.util.Date date19 = metricLogEntry17.getDateLogged();
        auditLogEntry12.setDateLogged(date19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList23 = replicationDaoMetacatImpl0.getInvalidMemberNodeReplicasByDate(date19, 303, 504);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'INVALIDATED'   AND member_node <> 'cnDev'  ORDER BY date_verified ASC  LIMIT 504 OFFSET 152208; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + auditEvent3 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent3.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "replica audit failed" + "'", str4, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent5 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent5.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Fri Oct 27 23:37:01 CDT 2023");
        org.junit.Assert.assertTrue("'" + metricEvent13 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent13.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Fri Oct 27 23:37:01 CDT 2023");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Fri Oct 27 23:37:01 CDT 2023");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        org.dataone.cn.hazelcast.membership.ClusterPartitionMonitor.setStoragePartition(true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        org.apache.commons.logging.Log log0 = org.dataone.cn.hazelcast.HazelcastClientFactory.logger;
        org.dataone.cn.ldap.DirContextProvider.log = log0;
        org.dataone.cn.servlet.http.ProxyServletRequestWrapper.logger = log0;
        org.dataone.cn.ldap.DirContextPooledObjectFactory.log = log0;
        org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener2 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "processing");
        com.hazelcast.core.MembershipEvent membershipEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            clusterPartitionMembershipListener2.handleMemberAddedEvent(membershipEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.hazelcast.core.HazelcastInstance.getCluster()\" because \"this.hzInstance\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        org.dataone.cn.batch.exceptions.ExecutionDisabledException executionDisabledException1 = new org.dataone.cn.batch.exceptions.ExecutionDisabledException("");
        org.dataone.cn.batch.exceptions.ExecutionDisabledException executionDisabledException2 = new org.dataone.cn.batch.exceptions.ExecutionDisabledException();
        executionDisabledException1.addSuppressed((java.lang.Throwable) executionDisabledException2);
        org.dataone.cn.batch.exceptions.ExecutionDisabledException executionDisabledException5 = new org.dataone.cn.batch.exceptions.ExecutionDisabledException("");
        org.dataone.cn.batch.exceptions.ExecutionDisabledException executionDisabledException6 = new org.dataone.cn.batch.exceptions.ExecutionDisabledException();
        executionDisabledException5.addSuppressed((java.lang.Throwable) executionDisabledException6);
        org.dataone.cn.batch.exceptions.ExecutionDisabledException executionDisabledException8 = new org.dataone.cn.batch.exceptions.ExecutionDisabledException((java.lang.Throwable) executionDisabledException5);
        executionDisabledException1.addSuppressed((java.lang.Throwable) executionDisabledException5);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        java.lang.String str0 = javax.servlet.http.HttpServletRequest.BASIC_AUTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "BASIC" + "'", str0, "BASIC");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.AccessRuleMapper accessRuleMapper1 = systemMetadataDaoMetacatImpl0.new AccessRuleMapper();
        java.sql.ResultSet resultSet2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.service.types.v1.AccessRule accessRule4 = accessRuleMapper1.mapRow(resultSet2, 202);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.ResultSet.getString(String)\" because \"resultSet\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println((int) (short) 100);
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) -1 };
        bufferedServletOutputStream0.write(byteArray9);
        byte[] byteArray11 = bufferedServletOutputStream0.getBuffer();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 1, 0, 0, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[49, 48, 48, 13, 10, 0, 1, 0, 0, -1, -1]");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.cn.dao.ReplicationDao.ReplicaDto> replicaDtoList2 = replicationDaoMetacatImpl0.getRequestedReplicasByDate(date1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"cutoffDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        byte[] byteArray1 = bufferedServletOutputStream0.getBuffer();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        boolean boolean0 = org.dataone.cn.hazelcast.membership.ClusterPartitionMonitor.getStoragePartion();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.MetricEvent metricEvent1 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        org.dataone.service.types.v1.Identifier identifier3 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry5 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, nodeReference2, identifier3, "FORM");
        java.util.Date date6 = metricLogEntry5.getDateLogged();
        java.util.Date date7 = metricLogEntry5.getDateLogged();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList10 = replicationDaoMetacatImpl0.getInvalidMemberNodeReplicasByDate(date7, 204, 411);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'INVALIDATED'   AND member_node <> 'cnDev'  ORDER BY date_verified ASC  LIMIT 411 OFFSET 83433; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + metricEvent1 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent1.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Fri Oct 27 23:37:02 CDT 2023");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Oct 27 23:37:02 CDT 2023");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.AuditEvent auditEvent3 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str4 = auditEvent3.toString();
        org.dataone.cn.log.MetricEvent metricEvent5 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference6 = null;
        org.dataone.service.types.v1.Identifier identifier7 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry9 = new org.dataone.cn.log.MetricLogEntry(metricEvent5, nodeReference6, identifier7, "FORM");
        java.util.Date date10 = metricLogEntry9.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry12 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent3, date10, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList15 = replicationDaoMetacatImpl0.getCompletedCoordinatingNodeReplicasByDate(date10, 410, 0);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'COMPLETED'   AND member_node = 'cnDev'  ORDER BY date_verified ASC; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + auditEvent3 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent3.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "replica audit failed" + "'", str4, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent5 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent5.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Fri Oct 27 23:37:02 CDT 2023");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        org.dataone.cn.hazelcast.membership.ClusterPartitionMonitor.setSessionPartition(true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        org.dataone.cn.log.AuditEvent auditEvent2 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str3 = auditEvent2.toString();
        org.dataone.cn.log.MetricEvent metricEvent4 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference5 = null;
        org.dataone.service.types.v1.Identifier identifier6 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry8 = new org.dataone.cn.log.MetricLogEntry(metricEvent4, nodeReference5, identifier6, "FORM");
        java.util.Date date9 = metricLogEntry8.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry11 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent2, date9, "hi!");
        java.lang.String str12 = auditLogEntry11.toString();
        auditLogEntry11.setNodeId("|authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023");
        java.lang.Class<?> wildcardClass15 = auditLogEntry11.getClass();
        org.junit.Assert.assertTrue("'" + auditEvent2 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent2.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "replica audit failed" + "'", str3, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent4 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent4.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Fri Oct 27 23:37:02 CDT 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:02 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:02:402, log text: hi!'}" + "'", str12, "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:02 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:02:402, log text: hi!'}");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener2 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "processing");
        clusterPartitionMembershipListener2.setExpectedIPList("processing");
        com.hazelcast.core.MembershipEvent membershipEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            clusterPartitionMembershipListener2.memberRemoved(membershipEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.hazelcast.core.MembershipEvent.getEventType()\" because \"membershipEvent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        int int0 = javax.servlet.http.HttpServletResponse.SC_CONTINUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.AccessRuleMapper accessRuleMapper1 = systemMetadataDaoMetacatImpl0.new AccessRuleMapper();
        org.dataone.service.types.v1.Permission permission2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = systemMetadataDaoMetacatImpl0.convertPermission(permission2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.dataone.service.types.v1.Permission.equals(Object)\" because \"permission\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        org.dataone.cn.log.AuditEvent auditEvent2 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str3 = auditEvent2.toString();
        org.dataone.cn.log.MetricEvent metricEvent4 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference5 = null;
        org.dataone.service.types.v1.Identifier identifier6 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry8 = new org.dataone.cn.log.MetricLogEntry(metricEvent4, nodeReference5, identifier6, "FORM");
        java.util.Date date9 = metricLogEntry8.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry11 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent2, date9, "hi!");
        java.lang.String str12 = auditLogEntry11.toString();
        java.util.Date date13 = auditLogEntry11.getDateLogged();
        org.junit.Assert.assertTrue("'" + auditEvent2 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent2.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "replica audit failed" + "'", str3, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent4 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent4.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Fri Oct 27 23:37:02 CDT 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:02 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:02:512, log text: hi!'}" + "'", str12, "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:02 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:02:512, log text: hi!'}");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Fri Oct 27 23:37:02 CDT 2023");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        org.dataone.cn.synchronization.types.SyncObject syncObject2 = new org.dataone.cn.synchronization.types.SyncObject("AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023, dateLogged: 10/27/2023:23:36:58:794, log text: hi!'}", "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:02 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:02:512, log text: hi!'}");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2, "FORM");
        java.util.Date date5 = metricLogEntry4.getDateLogged();
        org.dataone.service.types.v1.Identifier identifier6 = null;
        metricLogEntry4.setPid(identifier6);
        org.dataone.cn.log.MetricEvent metricEvent8 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference9 = null;
        org.dataone.service.types.v1.Identifier identifier10 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry11 = new org.dataone.cn.log.MetricLogEntry(metricEvent8, nodeReference9, identifier10);
        org.dataone.cn.log.MetricLogEntry metricLogEntry12 = new org.dataone.cn.log.MetricLogEntry(metricEvent8);
        metricLogEntry4.setEvent(metricEvent8);
        org.dataone.cn.log.MetricEvent metricEvent14 = metricLogEntry4.getEvent();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Oct 27 23:37:02 CDT 2023");
        org.junit.Assert.assertTrue("'" + metricEvent8 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent8.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertTrue("'" + metricEvent14 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent14.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.hazelcast.ClientConfiguration clientConfiguration1 = new org.dataone.cn.hazelcast.ClientConfiguration("|authorizedSubjects|replica audit failed|Fri Oct 27 23:36:59 CDT 2023");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:59 CDT 2023 (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.close();
        bufferedServletOutputStream0.println();
        bufferedServletOutputStream0.write(404);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        org.apache.commons.logging.Log log0 = org.dataone.cn.servlet.http.ProxyServletRequestWrapper.logger;
        org.dataone.cn.ldap.DirContextProvider.log = log0;
        org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        org.dataone.cn.log.AuditLogClientSolrImpl auditLogClientSolrImpl0 = new org.dataone.cn.log.AuditLogClientSolrImpl();
        org.dataone.cn.log.AuditEvent auditEvent3 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str4 = auditEvent3.toString();
        org.dataone.cn.log.MetricEvent metricEvent5 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference6 = null;
        org.dataone.service.types.v1.Identifier identifier7 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry9 = new org.dataone.cn.log.MetricLogEntry(metricEvent5, nodeReference6, identifier7, "FORM");
        java.util.Date date10 = metricLogEntry9.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry12 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent3, date10, "hi!");
        java.lang.String str13 = auditLogEntry12.toString();
        boolean boolean14 = auditLogClientSolrImpl0.removeReplicaAuditEvent(auditLogEntry12);
        org.junit.Assert.assertTrue("'" + auditEvent3 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent3.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "replica audit failed" + "'", str4, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent5 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent5.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Fri Oct 27 23:37:02 CDT 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:02 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:02:644, log text: hi!'}" + "'", str13, "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:02 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:02:644, log text: hi!'}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2, "FORM");
        java.util.Date date5 = metricLogEntry4.getDateLogged();
        org.dataone.service.types.v1.Identifier identifier6 = null;
        metricLogEntry4.setPid(identifier6);
        org.dataone.cn.log.MetricEvent metricEvent8 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference9 = null;
        org.dataone.service.types.v1.Identifier identifier10 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry11 = new org.dataone.cn.log.MetricLogEntry(metricEvent8, nodeReference9, identifier10);
        org.dataone.cn.log.MetricLogEntry metricLogEntry12 = new org.dataone.cn.log.MetricLogEntry(metricEvent8);
        metricLogEntry4.setEvent(metricEvent8);
        org.dataone.service.types.v1.NodeReference nodeReference14 = metricLogEntry4.getNodeId();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Oct 27 23:37:02 CDT 2023");
        org.junit.Assert.assertTrue("'" + metricEvent8 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent8.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNull(nodeReference14);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_QUEUED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2, "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023, dateLogged: 10/27/2023:23:36:58:794, log text: hi!'}");
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_QUEUED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_QUEUED));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        int int0 = javax.servlet.http.HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 415 + "'", int0 == 415);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry3 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2);
        java.lang.String str4 = metricEvent0.toString();
        org.dataone.service.types.v1.NodeReference nodeReference5 = null;
        org.dataone.service.types.v1.Identifier identifier6 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry7 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference5, identifier6);
        org.dataone.service.types.v1.NodeReference nodeReference8 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry9 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference8);
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "synchronization harvest submitted" + "'", str4, "synchronization harvest submitted");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.cn.dao.SystemMetadataStatus> systemMetadataStatusList4 = systemMetadataDaoMetacatImpl0.listSystemMetadataStatus((int) (short) 10, 407, strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.get(Object)\" because \"this.val$finalTableMap\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        org.dataone.cn.batch.exceptions.ExecutionDisabledException executionDisabledException1 = new org.dataone.cn.batch.exceptions.ExecutionDisabledException("{\"event\":\"synchronization harvest submitted\",\"threadName\":\"main\",\"threadId\":1,\"dateLogged\":\"2023-10-28T04:37:00.469+00:00\"}");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        org.apache.commons.logging.Log log0 = org.dataone.cn.hazelcast.HazelcastClientInstance.logger;
        org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener2 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:36:58:794, log text: hi!'}");
        clusterPartitionMembershipListener2.stopListener();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        org.dataone.cn.dao.ReplicationDao replicationDao0 = org.dataone.cn.dao.DaoFactory.getReplicationDao();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = replicationDao0.getQueuedReplicaCountByNode("Task-hi!-/etc/dataone/storage/hazelcast.xml");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        count(*)                               FROM  smreplicationstatus              WHERE member_node = ?                  AND status = 'QUEUED';              [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(replicationDao0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        org.dataone.cn.dao.ReplicationDao replicationDao0 = org.dataone.cn.dao.DaoFactory.getReplicationDao();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = replicationDao0.queuedReplicaExists("replica not found", "smreplicationstatus");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        count(*)                               FROM  smreplicationstatus              WHERE guid = ?                         AND member_node = ?                    AND status = 'QUEUED'                 [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(replicationDao0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        int int0 = javax.servlet.http.HttpServletResponse.SC_RESET_CONTENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 205 + "'", int0 == 205);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.AccessRuleMapper accessRuleMapper1 = systemMetadataDaoMetacatImpl0.new AccessRuleMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.cn.dao.SystemMetadataStatus> systemMetadataStatusList4 = systemMetadataDaoMetacatImpl0.listSystemMetadataStatus(204, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.dataone.cn.dao.exceptions.DataAccessException; message: org.springframework.jdbc.BadSqlGrammarException: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SYSTEMMETADATA\" not found; SQL statement:?SELECT guid, serial_version, date_modified, archived FROM systemmetadata ORDER BY guid LIMIT 52 OFFSET 10556; [42102-163]");
        } catch (org.dataone.cn.dao.exceptions.DataAccessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        org.dataone.cn.dao.ReplicationPolicyEntry replicationPolicyEntry0 = new org.dataone.cn.dao.ReplicationPolicyEntry();
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        replicationPolicyEntry0.setMemberNode(nodeReference1);
        org.dataone.service.types.v1.Identifier identifier3 = replicationPolicyEntry0.getPid();
        java.lang.String str4 = replicationPolicyEntry0.getPolicy();
        org.junit.Assert.assertNull(identifier3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        org.dataone.cn.batch.exceptions.ExecutionDisabledException executionDisabledException1 = new org.dataone.cn.batch.exceptions.ExecutionDisabledException("");
        org.dataone.cn.batch.exceptions.ExecutionDisabledException executionDisabledException2 = new org.dataone.cn.batch.exceptions.ExecutionDisabledException();
        executionDisabledException1.addSuppressed((java.lang.Throwable) executionDisabledException2);
        org.dataone.cn.batch.exceptions.ExecutionDisabledException executionDisabledException4 = new org.dataone.cn.batch.exceptions.ExecutionDisabledException((java.lang.Throwable) executionDisabledException1);
        java.lang.Throwable[] throwableArray5 = executionDisabledException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        org.dataone.cn.log.AuditLogQueryClientNullObjectImpl auditLogQueryClientNullObjectImpl0 = new org.dataone.cn.log.AuditLogQueryClientNullObjectImpl();
        org.dataone.cn.log.AuditEvent auditEvent3 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str4 = auditEvent3.toString();
        org.dataone.cn.log.MetricEvent metricEvent5 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference6 = null;
        org.dataone.service.types.v1.Identifier identifier7 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry9 = new org.dataone.cn.log.MetricLogEntry(metricEvent5, nodeReference6, identifier7, "FORM");
        java.util.Date date10 = metricLogEntry9.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry12 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent3, date10, "hi!");
        java.lang.String str13 = auditLogEntry12.toString();
        auditLogEntry12.setNodeId("|authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023");
        java.lang.String str16 = auditLogEntry12.toString();
        java.lang.String str19 = auditLogQueryClientNullObjectImpl0.queryLog(auditLogEntry12, (java.lang.Integer) 401, (java.lang.Integer) 1);
        java.lang.String str23 = auditLogQueryClientNullObjectImpl0.queryLog("/etc/dataone/portal/hazelcast.xml", (java.lang.Integer) 0, (java.lang.Integer) 305);
        org.junit.Assert.assertTrue("'" + auditEvent3 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent3.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "replica audit failed" + "'", str4, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent5 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent5.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Fri Oct 27 23:37:03 CDT 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:03 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:03:124, log text: hi!'}" + "'", str13, "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:03 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:03:124, log text: hi!'}");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:03 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023, dateLogged: 10/27/2023:23:37:03:124, log text: hi!'}" + "'", str16, "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:03 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023, dateLogged: 10/27/2023:23:37:03:124, log text: hi!'}");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.print((float) 501);
        bufferedServletOutputStream0.println((float) 204);
        bufferedServletOutputStream0.write(305);
        bufferedServletOutputStream0.println(200);
        bufferedServletOutputStream0.print((double) (short) 10);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry3 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2);
        org.dataone.service.types.v1.NodeReference nodeReference4 = null;
        org.dataone.service.types.v1.Identifier identifier5 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry8 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference4, identifier5, "processing", (java.lang.Long) 10L);
        org.dataone.cn.log.MetricEvent metricEvent9 = metricLogEntry8.getEvent();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertTrue("'" + metricEvent9 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent9.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.print((float) 501);
        bufferedServletOutputStream0.print(502);
        bufferedServletOutputStream0.println(0);
        bufferedServletOutputStream0.println((double) 416);
        bufferedServletOutputStream0.close();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        org.dataone.cn.batch.exceptions.ExecutionDisabledException executionDisabledException1 = new org.dataone.cn.batch.exceptions.ExecutionDisabledException("");
        java.lang.String str2 = executionDisabledException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.dataone.cn.batch.exceptions.ExecutionDisabledException: " + "'", str2, "org.dataone.cn.batch.exceptions.ExecutionDisabledException: ");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        org.dataone.cn.log.AuditEvent auditEvent2 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str3 = auditEvent2.toString();
        org.dataone.cn.log.MetricEvent metricEvent4 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference5 = null;
        org.dataone.service.types.v1.Identifier identifier6 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry8 = new org.dataone.cn.log.MetricLogEntry(metricEvent4, nodeReference5, identifier6, "FORM");
        java.util.Date date9 = metricLogEntry8.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry11 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent2, date9, "hi!");
        java.lang.String str12 = auditLogEntry11.toString();
        org.dataone.cn.log.MetricEvent metricEvent13 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference14 = null;
        org.dataone.service.types.v1.Identifier identifier15 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry16 = new org.dataone.cn.log.MetricLogEntry(metricEvent13, nodeReference14, identifier15);
        java.lang.String str17 = metricEvent13.toString();
        org.dataone.service.types.v1.NodeReference nodeReference18 = null;
        org.dataone.service.types.v1.Identifier identifier19 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry20 = new org.dataone.cn.log.MetricLogEntry(metricEvent13, nodeReference18, identifier19);
        org.dataone.service.types.v1.NodeReference nodeReference22 = null;
        org.dataone.service.types.v1.Identifier identifier23 = null;
        org.dataone.cn.log.MetricEvent metricEvent25 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference26 = null;
        org.dataone.service.types.v1.Identifier identifier27 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry29 = new org.dataone.cn.log.MetricLogEntry(metricEvent25, nodeReference26, identifier27, "FORM");
        java.util.Date date30 = metricLogEntry29.getDateLogged();
        org.dataone.cn.log.MetricLogEntry metricLogEntry31 = new org.dataone.cn.log.MetricLogEntry(metricEvent13, "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023, dateLogged: 10/27/2023:23:36:58:794, log text: hi!'}", nodeReference22, identifier23, (java.lang.Long) 100L, date30);
        auditLogEntry11.setDateLogged(date30);
        org.junit.Assert.assertTrue("'" + auditEvent2 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent2.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "replica audit failed" + "'", str3, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent4 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent4.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Fri Oct 27 23:37:03 CDT 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:03 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:03:318, log text: hi!'}" + "'", str12, "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:03 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:03:318, log text: hi!'}");
        org.junit.Assert.assertTrue("'" + metricEvent13 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent13.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "synchronization harvest submitted" + "'", str17, "synchronization harvest submitted");
        org.junit.Assert.assertTrue("'" + metricEvent25 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent25.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Fri Oct 27 23:37:03 CDT 2023");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        int int0 = javax.servlet.http.HttpServletResponse.SC_MOVED_TEMPORARILY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 302 + "'", int0 == 302);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        org.apache.commons.logging.Log log0 = org.dataone.cn.ldap.DirContextProvider.log;
        org.dataone.cn.ldap.DirContextProvider.log = log0;
        org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean0 = org.dataone.cn.ComponentActivationUtility.replicationCNAuditorIsActive();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'Replication.audit.cn.active' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicationPolicyEntryMapper replicationPolicyEntryMapper1 = systemMetadataDaoMetacatImpl0.new ReplicationPolicyEntryMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicaEntryMapper replicaEntryMapper2 = systemMetadataDaoMetacatImpl0.new ReplicaEntryMapper();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println((int) (short) 100);
        bufferedServletOutputStream0.close();
        bufferedServletOutputStream0.println((long) 206);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        org.dataone.cn.log.AuditLogQueryClientNullObjectImpl auditLogQueryClientNullObjectImpl0 = new org.dataone.cn.log.AuditLogQueryClientNullObjectImpl();
        java.lang.String str4 = auditLogQueryClientNullObjectImpl0.queryLog("replica audit failed", (java.lang.Integer) 411, (java.lang.Integer) 101);
        org.dataone.cn.log.AuditEvent auditEvent7 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str8 = auditEvent7.toString();
        org.dataone.cn.log.MetricEvent metricEvent9 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference10 = null;
        org.dataone.service.types.v1.Identifier identifier11 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry13 = new org.dataone.cn.log.MetricLogEntry(metricEvent9, nodeReference10, identifier11, "FORM");
        java.util.Date date14 = metricLogEntry13.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry16 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent7, date14, "hi!");
        java.lang.String str17 = auditLogEntry16.toString();
        java.lang.String str20 = auditLogQueryClientNullObjectImpl0.queryLog(auditLogEntry16, (java.lang.Integer) (-1), (java.lang.Integer) 400);
        java.lang.String str24 = auditLogQueryClientNullObjectImpl0.queryLog("identifier", (java.lang.Integer) 503, (java.lang.Integer) 500);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + auditEvent7 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent7.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "replica audit failed" + "'", str8, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent9 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent9.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Fri Oct 27 23:37:03 CDT 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:03 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:03:441, log text: hi!'}" + "'", str17, "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:03 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:03:441, log text: hi!'}");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println('4');
        bufferedServletOutputStream0.setBufferSize((int) (byte) 100);
        bufferedServletOutputStream0.println((long) 302);
        bufferedServletOutputStream0.print((long) 410);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        org.dataone.cn.ldap.DirContextProvider dirContextProvider0 = org.dataone.cn.ldap.DirContextProvider.getInstance();
        int int1 = dirContextProvider0.getNumDirContextActive();
        javax.naming.directory.DirContext dirContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dirContextProvider0.returnDirContext(dirContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Returned object not currently part of this pool");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dirContextProvider0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        org.dataone.cn.ldap.DirContextPooledObjectFactory dirContextPooledObjectFactory0 = new org.dataone.cn.ldap.DirContextPooledObjectFactory();
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = dirContextPooledObjectFactory0.validateObject(dirContextPooledObject1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.pool2.PooledObject.getObject()\" because \"p\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        org.dataone.cn.dao.ReplicationDao replicationDao0 = org.dataone.cn.dao.DaoFactory.getReplicationDao();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<org.dataone.service.types.v1.NodeReference, java.lang.Integer> nodeReferenceMap1 = replicationDao0.getRecentCompletedReplicas();
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT                   member_node,                           count(status) AS count                 FROM  smreplicationstatus  WHERE status = 'COMPLETED'             AND   date_verified >= ?               GROUP BY member_node                   ORDER BY member_node;                 [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(replicationDao0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        org.dataone.cn.dao.ReplicationDao replicationDao0 = org.dataone.cn.dao.DaoFactory.getReplicationDao();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<org.dataone.service.types.v1.NodeReference, java.lang.Integer> nodeReferenceMap1 = replicationDao0.getRecentFailedReplicas();
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT                   member_node,                           count(status) AS count                 FROM  smreplicationstatus  WHERE status = 'FAILED'                AND   date_verified >= ?               GROUP BY member_node                   ORDER BY member_node;                 [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(replicationDao0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.AccessRuleMapper accessRuleMapper1 = systemMetadataDaoMetacatImpl0.new AccessRuleMapper();
        org.dataone.service.types.v2.SystemMetadata systemMetadata2 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.service.types.v1.Identifier identifier4 = systemMetadataDaoMetacatImpl0.saveSystemMetadata(systemMetadata2, strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.dataone.service.types.v2.SystemMetadata.getIdentifier()\" because \"systemMetadata\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        org.dataone.cn.log.AuditLogQueryClientNullObjectImpl auditLogQueryClientNullObjectImpl0 = new org.dataone.cn.log.AuditLogQueryClientNullObjectImpl();
        java.lang.String str4 = auditLogQueryClientNullObjectImpl0.queryLog("replica audit failed", (java.lang.Integer) 411, (java.lang.Integer) 101);
        java.lang.String str8 = auditLogQueryClientNullObjectImpl0.queryLog("|authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023", (java.lang.Integer) 401, (java.lang.Integer) 411);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        org.dataone.cn.dao.ReplicationPolicyEntry replicationPolicyEntry0 = new org.dataone.cn.dao.ReplicationPolicyEntry();
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        replicationPolicyEntry0.setMemberNode(nodeReference1);
        org.dataone.service.types.v1.NodeReference nodeReference3 = null;
        replicationPolicyEntry0.setMemberNode(nodeReference3);
        org.dataone.service.types.v1.Identifier identifier5 = null;
        replicationPolicyEntry0.setPid(identifier5);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<org.dataone.service.types.v1.NodeReference, java.lang.Integer> nodeReferenceMap1 = replicationDaoMetacatImpl0.getPendingReplicasByNode();
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT           member_node,                  count(status) AS count       FROM  smreplicationstatus    WHERE status = 'REQUESTED'     OR  status = 'QUEUED'      GROUP BY member_node         ORDER BY member_node;       [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.AuditEvent auditEvent3 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str4 = auditEvent3.toString();
        org.dataone.cn.log.MetricEvent metricEvent5 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference6 = null;
        org.dataone.service.types.v1.Identifier identifier7 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry9 = new org.dataone.cn.log.MetricLogEntry(metricEvent5, nodeReference6, identifier7, "FORM");
        java.util.Date date10 = metricLogEntry9.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry12 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent3, date10, "hi!");
        java.lang.String str13 = auditLogEntry12.getId();
        java.util.Date date14 = auditLogEntry12.getDateLogged();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList17 = replicationDaoMetacatImpl0.getCompletedCoordinatingNodeReplicasByDate(date14, 403, 0);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'COMPLETED'   AND member_node = 'cnDev'  ORDER BY date_verified ASC; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + auditEvent3 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent3.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "replica audit failed" + "'", str4, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent5 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent5.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Fri Oct 27 23:37:03 CDT 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "|authorizedSubjects|replica audit failed|Fri Oct 27 23:37:03 CDT 2023" + "'", str13, "|authorizedSubjects|replica audit failed|Fri Oct 27 23:37:03 CDT 2023");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Fri Oct 27 23:37:03 CDT 2023");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        org.dataone.cn.synchronization.types.SyncObject syncObject2 = new org.dataone.cn.synchronization.types.SyncObject("hi!", "smreplicationpolicy");
        syncObject2.setAttempt((java.lang.Integer) 200);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.print((float) 501);
        bufferedServletOutputStream0.print(502);
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream5 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream5.println((int) (short) 100);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) -1 };
        bufferedServletOutputStream5.write(byteArray14);
        bufferedServletOutputStream0.write(byteArray14);
        bufferedServletOutputStream0.print(true);
        bufferedServletOutputStream0.print(0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 1, 0, 0, -1, -1]");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        org.dataone.cn.hazelcast.membership.ClusterPartitionMonitor.setStoragePartition(false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.print((float) 501);
        bufferedServletOutputStream0.print(true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2, "FORM");
        java.util.Date date5 = metricLogEntry4.getDateLogged();
        org.dataone.service.types.v1.NodeReference nodeReference6 = metricLogEntry4.getNodeId();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Oct 27 23:37:03 CDT 2023");
        org.junit.Assert.assertNull(nodeReference6);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        org.dataone.cn.log.AuditLogClientSolrImpl auditLogClientSolrImpl0 = new org.dataone.cn.log.AuditLogClientSolrImpl();
        org.dataone.cn.log.AuditEvent auditEvent3 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str4 = auditEvent3.toString();
        org.dataone.cn.log.MetricEvent metricEvent5 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference6 = null;
        org.dataone.service.types.v1.Identifier identifier7 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry9 = new org.dataone.cn.log.MetricLogEntry(metricEvent5, nodeReference6, identifier7, "FORM");
        java.util.Date date10 = metricLogEntry9.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry12 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent3, date10, "hi!");
        org.dataone.cn.log.MetricEvent metricEvent13 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference14 = null;
        org.dataone.service.types.v1.Identifier identifier15 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry17 = new org.dataone.cn.log.MetricLogEntry(metricEvent13, nodeReference14, identifier15, "FORM");
        java.util.Date date18 = metricLogEntry17.getDateLogged();
        java.util.Date date19 = metricLogEntry17.getDateLogged();
        auditLogEntry12.setDateLogged(date19);
        boolean boolean21 = auditLogClientSolrImpl0.logAuditEvent(auditLogEntry12);
        java.lang.String str22 = auditLogEntry12.getPid();
        java.lang.String str23 = auditLogEntry12.getNodeId();
        org.junit.Assert.assertTrue("'" + auditEvent3 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent3.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "replica audit failed" + "'", str4, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent5 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent5.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Fri Oct 27 23:37:03 CDT 2023");
        org.junit.Assert.assertTrue("'" + metricEvent13 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent13.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Fri Oct 27 23:37:03 CDT 2023");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Fri Oct 27 23:37:03 CDT 2023");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "authorizedSubjects" + "'", str23, "authorizedSubjects");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = replicationDaoMetacatImpl0.getQueuedReplicaCountByNode("org.dataone.cn.batch.exceptions.ExecutionDisabledException: ");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        count(*)                               FROM  smreplicationstatus              WHERE member_node = ?                  AND status = 'QUEUED';              [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        org.dataone.cn.log.AuditLogQueryClientNullObjectImpl auditLogQueryClientNullObjectImpl0 = new org.dataone.cn.log.AuditLogQueryClientNullObjectImpl();
        java.lang.String str4 = auditLogQueryClientNullObjectImpl0.queryLog("replica audit failed", (java.lang.Integer) 411, (java.lang.Integer) 101);
        org.dataone.cn.log.AuditEvent auditEvent7 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str8 = auditEvent7.toString();
        org.dataone.cn.log.MetricEvent metricEvent9 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference10 = null;
        org.dataone.service.types.v1.Identifier identifier11 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry13 = new org.dataone.cn.log.MetricLogEntry(metricEvent9, nodeReference10, identifier11, "FORM");
        java.util.Date date14 = metricLogEntry13.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry16 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent7, date14, "hi!");
        java.lang.String str17 = auditLogEntry16.toString();
        java.lang.String str20 = auditLogQueryClientNullObjectImpl0.queryLog(auditLogEntry16, (java.lang.Integer) (-1), (java.lang.Integer) 400);
        java.lang.String str24 = auditLogQueryClientNullObjectImpl0.queryLog("AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:03 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:03:318, log text: hi!'}", (java.lang.Integer) 205, (java.lang.Integer) 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + auditEvent7 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent7.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "replica audit failed" + "'", str8, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent9 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent9.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Fri Oct 27 23:37:04 CDT 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:04 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:04:20, log text: hi!'}" + "'", str17, "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:04 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:04:20, log text: hi!'}");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener2 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "|authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicationPolicyEntryMapper replicationPolicyEntryMapper1 = systemMetadataDaoMetacatImpl0.new ReplicationPolicyEntryMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicationPolicyEntryMapper replicationPolicyEntryMapper2 = systemMetadataDaoMetacatImpl0.new ReplicationPolicyEntryMapper();
        org.dataone.service.types.v1.Permission permission3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = systemMetadataDaoMetacatImpl0.convertPermission(permission3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.dataone.service.types.v1.Permission.equals(Object)\" because \"permission\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.MetricEvent metricEvent1 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        org.dataone.service.types.v1.Identifier identifier3 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry5 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, nodeReference2, identifier3, "FORM");
        java.util.Date date6 = metricLogEntry5.getDateLogged();
        java.util.Date date7 = metricLogEntry5.getDateLogged();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList10 = replicationDaoMetacatImpl0.getCompletedCoordinatingNodeReplicasByDate(date7, 200, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'COMPLETED'   AND member_node = 'cnDev'  ORDER BY date_verified ASC LIMIT 10 OFFSET 1990; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + metricEvent1 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent1.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Fri Oct 27 23:37:04 CDT 2023");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Oct 27 23:37:04 CDT 2023");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        org.dataone.cn.dao.ReplicationPolicyEntry replicationPolicyEntry0 = new org.dataone.cn.dao.ReplicationPolicyEntry();
        org.dataone.service.types.v1.Identifier identifier1 = null;
        replicationPolicyEntry0.setPid(identifier1);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.close();
        bufferedServletOutputStream0.println('a');
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        org.dataone.cn.ldap.DirContextProvider dirContextProvider0 = org.dataone.cn.ldap.DirContextProvider.getInstance();
        int int1 = dirContextProvider0.getNumDirContextActive();
        int int2 = dirContextProvider0.getNumDirContextIdle();
        int int3 = dirContextProvider0.getNumDirContextActive();
        javax.naming.directory.DirContext dirContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dirContextProvider0.returnDirContext(dirContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Returned object not currently part of this pool");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dirContextProvider0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        org.dataone.cn.synchronization.types.SyncObject syncObject2 = new org.dataone.cn.synchronization.types.SyncObject("hi!", "/etc/dataone/storage/hazelcast.xml");
        syncObject2.setSleepUntil((long) 413);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        org.dataone.cn.batch.exceptions.ExecutionDisabledException executionDisabledException1 = new org.dataone.cn.batch.exceptions.ExecutionDisabledException("");
        java.lang.Throwable[] throwableArray2 = executionDisabledException1.getSuppressed();
        org.dataone.cn.dao.exceptions.DataAccessException dataAccessException3 = new org.dataone.cn.dao.exceptions.DataAccessException((java.lang.Throwable) executionDisabledException1);
        org.dataone.cn.batch.exceptions.ExecutionDisabledException executionDisabledException4 = new org.dataone.cn.batch.exceptions.ExecutionDisabledException((java.lang.Throwable) executionDisabledException1);
        java.lang.Throwable[] throwableArray5 = executionDisabledException4.getSuppressed();
        org.dataone.cn.dao.exceptions.DataAccessException dataAccessException6 = new org.dataone.cn.dao.exceptions.DataAccessException((java.lang.Throwable) executionDisabledException4);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2, "FORM");
        java.util.Date date5 = metricLogEntry4.getDateLogged();
        org.dataone.cn.log.MetricEvent metricEvent6 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference7 = null;
        org.dataone.service.types.v1.Identifier identifier8 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry10 = new org.dataone.cn.log.MetricLogEntry(metricEvent6, nodeReference7, identifier8, "FORM");
        java.util.Date date11 = metricLogEntry10.getDateLogged();
        org.dataone.service.types.v1.Identifier identifier12 = null;
        metricLogEntry10.setPid(identifier12);
        org.dataone.cn.log.MetricEvent metricEvent14 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference15 = null;
        org.dataone.service.types.v1.Identifier identifier16 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry17 = new org.dataone.cn.log.MetricLogEntry(metricEvent14, nodeReference15, identifier16);
        org.dataone.cn.log.MetricLogEntry metricLogEntry18 = new org.dataone.cn.log.MetricLogEntry(metricEvent14);
        metricLogEntry10.setEvent(metricEvent14);
        metricLogEntry4.setEvent(metricEvent14);
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Oct 27 23:37:04 CDT 2023");
        org.junit.Assert.assertTrue("'" + metricEvent6 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent6.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Fri Oct 27 23:37:04 CDT 2023");
        org.junit.Assert.assertTrue("'" + metricEvent14 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent14.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = replicationDaoMetacatImpl0.getQueuedReplicaCountByNode("AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:03 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:03:124, log text: hi!'}");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        count(*)                               FROM  smreplicationstatus              WHERE member_node = ?                  AND status = 'QUEUED';              [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.MetricEvent metricEvent1 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        org.dataone.service.types.v1.Identifier identifier3 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry5 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, nodeReference2, identifier3, "FORM");
        java.util.Date date6 = metricLogEntry5.getDateLogged();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList9 = replicationDaoMetacatImpl0.getCompletedMemberNodeReplicasByDate(date6, (int) (short) 100, 401);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'COMPLETED'   AND member_node <> 'cnDev'  ORDER BY date_verified ASC  LIMIT 401 OFFSET 39699; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + metricEvent1 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent1.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Fri Oct 27 23:37:04 CDT 2023");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.close();
        bufferedServletOutputStream0.println();
        bufferedServletOutputStream0.print((double) 501);
        bufferedServletOutputStream0.print((long) 10);
        bufferedServletOutputStream0.close();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        org.dataone.cn.log.AuditLogClientSolrImpl auditLogClientSolrImpl0 = new org.dataone.cn.log.AuditLogClientSolrImpl();
        org.dataone.cn.log.AuditEvent auditEvent3 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str4 = auditEvent3.toString();
        org.dataone.cn.log.MetricEvent metricEvent5 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference6 = null;
        org.dataone.service.types.v1.Identifier identifier7 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry9 = new org.dataone.cn.log.MetricLogEntry(metricEvent5, nodeReference6, identifier7, "FORM");
        java.util.Date date10 = metricLogEntry9.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry12 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent3, date10, "hi!");
        org.dataone.cn.log.MetricEvent metricEvent13 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference14 = null;
        org.dataone.service.types.v1.Identifier identifier15 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry17 = new org.dataone.cn.log.MetricLogEntry(metricEvent13, nodeReference14, identifier15, "FORM");
        java.util.Date date18 = metricLogEntry17.getDateLogged();
        java.util.Date date19 = metricLogEntry17.getDateLogged();
        auditLogEntry12.setDateLogged(date19);
        boolean boolean21 = auditLogClientSolrImpl0.logAuditEvent(auditLogEntry12);
        java.util.Date date22 = auditLogEntry12.getDateLogged();
        org.junit.Assert.assertTrue("'" + auditEvent3 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent3.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "replica audit failed" + "'", str4, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent5 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent5.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Fri Oct 27 23:37:04 CDT 2023");
        org.junit.Assert.assertTrue("'" + metricEvent13 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent13.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Fri Oct 27 23:37:04 CDT 2023");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Fri Oct 27 23:37:04 CDT 2023");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Fri Oct 27 23:37:04 CDT 2023");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        org.dataone.cn.batch.exceptions.ExecutionDisabledException executionDisabledException1 = new org.dataone.cn.batch.exceptions.ExecutionDisabledException("hi!");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = systemMetadataDaoMetacatImpl0.getSystemMetadataCount();
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: StatementCallback; bad SQL grammar [SELECT count(guid) FROM systemmetadata]; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SYSTEMMETADATA\" not found; SQL statement:?SELECT count(guid) FROM systemmetadata [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2, "FORM");
        org.dataone.service.types.v1.NodeReference nodeReference5 = null;
        org.dataone.service.types.v1.Identifier identifier6 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry9 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference5, identifier6, "synchronization harvest submitted", (java.lang.Long) 0L);
        org.dataone.service.types.v1.NodeReference nodeReference10 = null;
        org.dataone.service.types.v1.Identifier identifier11 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry12 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference10, identifier11);
        org.dataone.service.types.v1.NodeReference nodeReference13 = null;
        org.dataone.service.types.v1.Identifier identifier14 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry17 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference13, identifier14, "|authorizedSubjects|replica audit failed|Fri Oct 27 23:37:02 CDT 2023", (java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener2 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "processing");
        clusterPartitionMembershipListener2.setExpectedIPList("processing");
        com.hazelcast.core.MembershipEvent membershipEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            clusterPartitionMembershipListener2.handleMemberAddedEvent(membershipEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.hazelcast.core.HazelcastInstance.getCluster()\" because \"this.hzInstance\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        org.dataone.cn.ldap.DirContextProvider dirContextProvider0 = org.dataone.cn.ldap.DirContextProvider.getInstance();
        int int1 = dirContextProvider0.getNumDirContextActive();
        int int2 = dirContextProvider0.getNumDirContextIdle();
        int int3 = dirContextProvider0.getNumDirContextActive();
        int int4 = dirContextProvider0.getNumDirContextIdle();
        int int5 = dirContextProvider0.getNumDirContextActive();
        org.junit.Assert.assertNotNull(dirContextProvider0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        org.dataone.cn.dao.ReplicationPolicyEntry replicationPolicyEntry0 = new org.dataone.cn.dao.ReplicationPolicyEntry();
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        replicationPolicyEntry0.setMemberNode(nodeReference1);
        org.dataone.service.types.v1.NodeReference nodeReference3 = null;
        replicationPolicyEntry0.setMemberNode(nodeReference3);
        org.dataone.service.types.v1.NodeReference nodeReference5 = replicationPolicyEntry0.getMemberNode();
        org.dataone.service.types.v1.Identifier identifier6 = null;
        replicationPolicyEntry0.setPid(identifier6);
        org.junit.Assert.assertNull(nodeReference5);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        java.lang.String str0 = javax.servlet.http.HttpServletRequest.CLIENT_CERT_AUTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "CLIENT_CERT" + "'", str0, "CLIENT_CERT");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        org.dataone.cn.dao.ReplicationPolicyEntry replicationPolicyEntry0 = new org.dataone.cn.dao.ReplicationPolicyEntry();
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        replicationPolicyEntry0.setMemberNode(nodeReference1);
        org.dataone.service.types.v1.Identifier identifier3 = null;
        replicationPolicyEntry0.setPid(identifier3);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2, "FORM");
        java.util.Date date5 = metricLogEntry4.getDateLogged();
        org.dataone.service.types.v1.Identifier identifier6 = null;
        metricLogEntry4.setPid(identifier6);
        metricLogEntry4.setMessage("session");
        org.dataone.service.types.v1.NodeReference nodeReference10 = metricLogEntry4.getNodeId();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Oct 27 23:37:04 CDT 2023");
        org.junit.Assert.assertNull(nodeReference10);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.print((float) 501);
        bufferedServletOutputStream0.print(502);
        bufferedServletOutputStream0.print((long) 307);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry3 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2);
        org.dataone.service.types.v1.NodeReference nodeReference4 = null;
        org.dataone.service.types.v1.Identifier identifier5 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry8 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference4, identifier5, "processing", (java.lang.Long) 10L);
        java.lang.String str9 = metricLogEntry8.toString();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{\"event\":\"synchronization harvest submitted\",\"message\":\"processing\",\"timeToCompleteEventMS\":10,\"threadName\":\"main\",\"threadId\":1,\"dateLogged\":\"2023-10-28T04:37:04.661+00:00\"}" + "'", str9, "{\"event\":\"synchronization harvest submitted\",\"message\":\"processing\",\"timeToCompleteEventMS\":10,\"threadName\":\"main\",\"threadId\":1,\"dateLogged\":\"2023-10-28T04:37:04.661+00:00\"}");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SystemMetadataStatusMapper systemMetadataStatusMapper1 = systemMetadataDaoMetacatImpl0.new SystemMetadataStatusMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicationPolicyEntryMapper replicationPolicyEntryMapper2 = systemMetadataDaoMetacatImpl0.new ReplicationPolicyEntryMapper();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.AccessRuleMapper accessRuleMapper1 = systemMetadataDaoMetacatImpl0.new AccessRuleMapper();
        java.sql.ResultSet resultSet2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.service.types.v1.AccessRule accessRule4 = accessRuleMapper1.mapRow(resultSet2, 403);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.ResultSet.getString(String)\" because \"resultSet\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.print((float) 501);
        bufferedServletOutputStream0.print(502);
        bufferedServletOutputStream0.println(0);
        bufferedServletOutputStream0.print(304);
        bufferedServletOutputStream0.print('a');
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry3 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2);
        org.dataone.service.types.v1.NodeReference nodeReference4 = null;
        org.dataone.service.types.v1.Identifier identifier5 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry8 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference4, identifier5, "processing", (java.lang.Long) 10L);
        org.dataone.cn.log.MetricEvent metricEvent9 = org.dataone.cn.log.MetricEvent.REPLICA_STATUS;
        metricLogEntry8.setEvent(metricEvent9);
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertTrue("'" + metricEvent9 + "' != '" + org.dataone.cn.log.MetricEvent.REPLICA_STATUS + "'", metricEvent9.equals(org.dataone.cn.log.MetricEvent.REPLICA_STATUS));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.cn.log.MetricLogEntry metricLogEntry1 = new org.dataone.cn.log.MetricLogEntry(metricEvent0);
        org.dataone.cn.log.MetricEvent metricEvent2 = metricLogEntry1.getEvent();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertTrue("'" + metricEvent2 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent2.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        org.dataone.cn.dao.ReplicationPolicyEntry replicationPolicyEntry0 = new org.dataone.cn.dao.ReplicationPolicyEntry();
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        replicationPolicyEntry0.setMemberNode(nodeReference1);
        org.dataone.service.types.v1.NodeReference nodeReference3 = null;
        replicationPolicyEntry0.setMemberNode(nodeReference3);
        org.dataone.service.types.v1.NodeReference nodeReference5 = replicationPolicyEntry0.getMemberNode();
        org.dataone.service.types.v1.NodeReference nodeReference6 = null;
        replicationPolicyEntry0.setMemberNode(nodeReference6);
        replicationPolicyEntry0.setPolicy("AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:02 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:02:644, log text: hi!'}");
        org.dataone.service.types.v1.NodeReference nodeReference10 = null;
        replicationPolicyEntry0.setMemberNode(nodeReference10);
        org.junit.Assert.assertNull(nodeReference5);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println('4');
        bufferedServletOutputStream0.setBufferSize((int) (byte) 100);
        bufferedServletOutputStream0.print(0.0f);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2, "FORM");
        java.util.Date date5 = metricLogEntry4.getDateLogged();
        org.dataone.service.types.v1.Identifier identifier6 = null;
        metricLogEntry4.setPid(identifier6);
        org.dataone.cn.log.MetricEvent metricEvent8 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference9 = null;
        org.dataone.service.types.v1.Identifier identifier10 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry11 = new org.dataone.cn.log.MetricLogEntry(metricEvent8, nodeReference9, identifier10);
        org.dataone.cn.log.MetricLogEntry metricLogEntry12 = new org.dataone.cn.log.MetricLogEntry(metricEvent8);
        metricLogEntry4.setEvent(metricEvent8);
        org.dataone.service.types.v1.NodeReference nodeReference14 = null;
        metricLogEntry4.setNodeId(nodeReference14);
        java.util.Date date16 = null;
        metricLogEntry4.setDateLogged(date16);
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Oct 27 23:37:04 CDT 2023");
        org.junit.Assert.assertTrue("'" + metricEvent8 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent8.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_QUEUED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry2 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1);
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_QUEUED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_QUEUED));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.AuditEvent auditEvent3 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str4 = auditEvent3.toString();
        org.dataone.cn.log.MetricEvent metricEvent5 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference6 = null;
        org.dataone.service.types.v1.Identifier identifier7 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry9 = new org.dataone.cn.log.MetricLogEntry(metricEvent5, nodeReference6, identifier7, "FORM");
        java.util.Date date10 = metricLogEntry9.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry12 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent3, date10, "hi!");
        java.lang.String str13 = auditLogEntry12.getId();
        java.util.Date date14 = auditLogEntry12.getDateLogged();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList17 = replicationDaoMetacatImpl0.getInvalidMemberNodeReplicasByDate(date14, 416, 402);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'INVALIDATED'   AND member_node <> 'cnDev'  ORDER BY date_verified ASC  LIMIT 402 OFFSET 166830; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + auditEvent3 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent3.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "replica audit failed" + "'", str4, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent5 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent5.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Fri Oct 27 23:37:04 CDT 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "|authorizedSubjects|replica audit failed|Fri Oct 27 23:37:04 CDT 2023" + "'", str13, "|authorizedSubjects|replica audit failed|Fri Oct 27 23:37:04 CDT 2023");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Fri Oct 27 23:37:04 CDT 2023");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry3 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2);
        java.lang.String str4 = metricEvent0.toString();
        org.dataone.service.types.v1.NodeReference nodeReference5 = null;
        org.dataone.service.types.v1.Identifier identifier6 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry7 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference5, identifier6);
        java.lang.String str8 = metricLogEntry7.toString();
        org.dataone.cn.log.MetricEvent metricEvent9 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_RETRIEVED;
        metricLogEntry7.setEvent(metricEvent9);
        java.lang.String str11 = metricEvent9.toString();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "synchronization harvest submitted" + "'", str4, "synchronization harvest submitted");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{\"event\":\"synchronization harvest submitted\",\"threadName\":\"main\",\"threadId\":1,\"dateLogged\":\"2023-10-28T04:37:04.950+00:00\"}" + "'", str8, "{\"event\":\"synchronization harvest submitted\",\"threadName\":\"main\",\"threadId\":1,\"dateLogged\":\"2023-10-28T04:37:04.950+00:00\"}");
        org.junit.Assert.assertTrue("'" + metricEvent9 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_RETRIEVED + "'", metricEvent9.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "synchronization harvest retrieved" + "'", str11, "synchronization harvest retrieved");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.dao.SystemMetadataStatus systemMetadataStatus1 = new org.dataone.cn.dao.SystemMetadataStatus();
        java.util.Date date2 = systemMetadataStatus1.getLastSystemMetadataModificationDate();
        org.dataone.cn.log.MetricEvent metricEvent3 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference4 = null;
        org.dataone.service.types.v1.Identifier identifier5 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry7 = new org.dataone.cn.log.MetricLogEntry(metricEvent3, nodeReference4, identifier5, "FORM");
        java.util.Date date8 = metricLogEntry7.getDateLogged();
        systemMetadataStatus1.setLastSystemMetadataModificationDate(date8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList12 = replicationDaoMetacatImpl0.getInvalidMemberNodeReplicasByDate(date8, 504, 0);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'INVALIDATED'   AND member_node <> 'cnDev'  ORDER BY date_verified ASC ; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + metricEvent3 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent3.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Oct 27 23:37:05 CDT 2023");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        org.dataone.cn.dao.SystemMetadataStatus systemMetadataStatus0 = new org.dataone.cn.dao.SystemMetadataStatus();
        java.math.BigInteger bigInteger1 = null;
        systemMetadataStatus0.setSerialVersion(bigInteger1);
        org.dataone.service.types.v1.Identifier identifier3 = null;
        systemMetadataStatus0.setPid(identifier3);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        org.dataone.cn.dao.SystemMetadataStatus systemMetadataStatus0 = new org.dataone.cn.dao.SystemMetadataStatus();
        systemMetadataStatus0.setDeleted((java.lang.Boolean) false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener2 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:36:58:794, log text: hi!'}");
        com.hazelcast.core.MembershipEvent membershipEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            clusterPartitionMembershipListener2.handleMemberRemovedEvent(membershipEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.hazelcast.core.HazelcastInstance.getCluster()\" because \"this.hzInstance\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        org.dataone.cn.dao.SystemMetadataStatus systemMetadataStatus0 = new org.dataone.cn.dao.SystemMetadataStatus();
        java.util.Date date1 = systemMetadataStatus0.getLastSystemMetadataModificationDate();
        systemMetadataStatus0.setDeleted((java.lang.Boolean) true);
        org.junit.Assert.assertNull(date1);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.MetricEvent metricEvent1 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        org.dataone.service.types.v1.Identifier identifier3 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, nodeReference2, identifier3);
        java.lang.String str5 = metricEvent1.toString();
        org.dataone.service.types.v1.NodeReference nodeReference6 = null;
        org.dataone.service.types.v1.Identifier identifier7 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry8 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, nodeReference6, identifier7);
        org.dataone.service.types.v1.NodeReference nodeReference10 = null;
        org.dataone.service.types.v1.Identifier identifier11 = null;
        org.dataone.cn.log.MetricEvent metricEvent13 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference14 = null;
        org.dataone.service.types.v1.Identifier identifier15 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry17 = new org.dataone.cn.log.MetricLogEntry(metricEvent13, nodeReference14, identifier15, "FORM");
        java.util.Date date18 = metricLogEntry17.getDateLogged();
        org.dataone.cn.log.MetricLogEntry metricLogEntry19 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023, dateLogged: 10/27/2023:23:36:58:794, log text: hi!'}", nodeReference10, identifier11, (java.lang.Long) 100L, date18);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList22 = replicationDaoMetacatImpl0.getInvalidMemberNodeReplicasByDate(date18, 204, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'INVALIDATED'   AND member_node <> 'cnDev'  ORDER BY date_verified ASC  LIMIT 100 OFFSET 20300; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + metricEvent1 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent1.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "synchronization harvest submitted" + "'", str5, "synchronization harvest submitted");
        org.junit.Assert.assertTrue("'" + metricEvent13 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent13.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Fri Oct 27 23:37:05 CDT 2023");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener2 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "processing");
        clusterPartitionMembershipListener2.setExpectedIPList("processing");
        // The following exception was thrown during execution in test generation
        try {
            clusterPartitionMembershipListener2.startListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.hazelcast.core.HazelcastInstance.getName()\" because \"this.hzInstance\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = replicationDaoMetacatImpl0.queuedReplicaExists("BASIC", "{\"event\":\"synchronization harvest submitted\",\"threadName\":\"main\",\"threadId\":1,\"dateLogged\":\"2023-10-28T04:37:00.469+00:00\"}");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        count(*)                               FROM  smreplicationstatus              WHERE guid = ?                         AND member_node = ?                    AND status = 'QUEUED'                 [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.REPLICATION_TASKS;
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.REPLICATION_TASKS + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.REPLICATION_TASKS));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        org.apache.commons.logging.Log log0 = org.dataone.cn.servlet.http.ProxyServletRequestWrapper.logger;
        org.dataone.cn.ldap.LDAPService.log = log0;
        org.dataone.cn.ldap.LDAPService.log = log0;
        org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        org.dataone.cn.dao.SystemMetadataStatus systemMetadataStatus0 = new org.dataone.cn.dao.SystemMetadataStatus();
        systemMetadataStatus0.setDeleted((java.lang.Boolean) true);
        java.util.Date date3 = null;
        systemMetadataStatus0.setLastSystemMetadataModificationDate(date3);
        org.dataone.service.types.v1.Identifier identifier5 = null;
        systemMetadataStatus0.setPid(identifier5);
        java.math.BigInteger bigInteger7 = systemMetadataStatus0.getSerialVersion();
        org.junit.Assert.assertNull(bigInteger7);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicationPolicyEntryMapper replicationPolicyEntryMapper1 = systemMetadataDaoMetacatImpl0.new ReplicationPolicyEntryMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicationPolicyEntryMapper replicationPolicyEntryMapper2 = systemMetadataDaoMetacatImpl0.new ReplicationPolicyEntryMapper();
        java.sql.ResultSet resultSet3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.dao.ReplicationPolicyEntry replicationPolicyEntry5 = replicationPolicyEntryMapper2.mapRow(resultSet3, 401);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.ResultSet.getString(String)\" because \"resultSet\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry3 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2);
        java.lang.String str4 = metricEvent0.toString();
        org.dataone.service.types.v1.NodeReference nodeReference5 = null;
        org.dataone.service.types.v1.Identifier identifier6 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry7 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference5, identifier6);
        org.dataone.service.types.v1.NodeReference nodeReference8 = metricLogEntry7.getNodeId();
        java.lang.Long long9 = metricLogEntry7.getTimeToCompleteEventMS();
        org.dataone.service.types.v1.NodeReference nodeReference10 = metricLogEntry7.getNodeId();
        java.util.Date date11 = metricLogEntry7.getDateLogged();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "synchronization harvest submitted" + "'", str4, "synchronization harvest submitted");
        org.junit.Assert.assertNull(nodeReference8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(nodeReference10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Fri Oct 27 23:37:05 CDT 2023");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        org.dataone.cn.dao.SystemMetadataStatus systemMetadataStatus0 = new org.dataone.cn.dao.SystemMetadataStatus();
        systemMetadataStatus0.setDeleted((java.lang.Boolean) true);
        java.util.Date date3 = null;
        systemMetadataStatus0.setLastSystemMetadataModificationDate(date3);
        org.dataone.service.types.v1.Identifier identifier5 = null;
        systemMetadataStatus0.setPid(identifier5);
        org.dataone.service.types.v1.Identifier identifier7 = null;
        systemMetadataStatus0.setPid(identifier7);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        org.dataone.cn.synchronization.types.SyncObject syncObject2 = new org.dataone.cn.synchronization.types.SyncObject("hi!", "/etc/dataone/storage/hazelcast.xml");
        syncObject2.setLockAttempt((java.lang.Integer) 307);
        java.lang.String str5 = syncObject2.getNodeId();
        syncObject2.setLockAttempt((java.lang.Integer) 201);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        org.dataone.cn.log.AuditLogClientSplunkImpl auditLogClientSplunkImpl0 = new org.dataone.cn.log.AuditLogClientSplunkImpl();
        java.lang.String str4 = auditLogClientSplunkImpl0.queryLog("{\"event\":\"synchronization harvest submitted\",\"threadName\":\"main\",\"threadId\":1,\"dateLogged\":\"2023-10-28T04:37:04.950+00:00\"}", (java.lang.Integer) 415, (java.lang.Integer) 304);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        org.dataone.cn.log.AuditLogClientSolrImpl auditLogClientSolrImpl0 = new org.dataone.cn.log.AuditLogClientSolrImpl();
        org.dataone.cn.log.AuditEvent auditEvent3 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str4 = auditEvent3.toString();
        org.dataone.cn.log.MetricEvent metricEvent5 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference6 = null;
        org.dataone.service.types.v1.Identifier identifier7 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry9 = new org.dataone.cn.log.MetricLogEntry(metricEvent5, nodeReference6, identifier7, "FORM");
        java.util.Date date10 = metricLogEntry9.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry12 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent3, date10, "hi!");
        org.dataone.cn.log.MetricEvent metricEvent13 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference14 = null;
        org.dataone.service.types.v1.Identifier identifier15 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry17 = new org.dataone.cn.log.MetricLogEntry(metricEvent13, nodeReference14, identifier15, "FORM");
        java.util.Date date18 = metricLogEntry17.getDateLogged();
        java.util.Date date19 = metricLogEntry17.getDateLogged();
        auditLogEntry12.setDateLogged(date19);
        boolean boolean21 = auditLogClientSolrImpl0.logAuditEvent(auditLogEntry12);
        java.lang.String str25 = auditLogClientSolrImpl0.queryLog("AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:01 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:01:770, log text: hi!'}", (java.lang.Integer) 1, (java.lang.Integer) 500);
        org.dataone.cn.log.AuditEvent auditEvent28 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str29 = auditEvent28.toString();
        org.dataone.cn.log.MetricEvent metricEvent30 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference31 = null;
        org.dataone.service.types.v1.Identifier identifier32 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry34 = new org.dataone.cn.log.MetricLogEntry(metricEvent30, nodeReference31, identifier32, "FORM");
        java.util.Date date35 = metricLogEntry34.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry37 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent28, date35, "hi!");
        boolean boolean38 = auditLogClientSolrImpl0.logAuditEvent(auditLogEntry37);
        org.junit.Assert.assertTrue("'" + auditEvent3 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent3.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "replica audit failed" + "'", str4, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent5 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent5.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Fri Oct 27 23:37:05 CDT 2023");
        org.junit.Assert.assertTrue("'" + metricEvent13 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent13.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Fri Oct 27 23:37:05 CDT 2023");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Fri Oct 27 23:37:05 CDT 2023");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + auditEvent28 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent28.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "replica audit failed" + "'", str29, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent30 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent30.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Fri Oct 27 23:37:05 CDT 2023");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        org.dataone.cn.log.MetricLogClientLog4JImpl metricLogClientLog4JImpl0 = new org.dataone.cn.log.MetricLogClientLog4JImpl();
        org.dataone.cn.log.MetricLogClientLog4JImpl metricLogClientLog4JImpl1 = new org.dataone.cn.log.MetricLogClientLog4JImpl();
        org.dataone.cn.log.MetricEvent metricEvent2 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference3 = null;
        org.dataone.service.types.v1.Identifier identifier4 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry5 = new org.dataone.cn.log.MetricLogEntry(metricEvent2, nodeReference3, identifier4);
        boolean boolean6 = metricLogClientLog4JImpl1.logMetricEvent(metricLogEntry5);
        boolean boolean7 = metricLogClientLog4JImpl0.logMetricEvent(metricLogEntry5);
        org.dataone.cn.log.MetricEvent metricEvent8 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_SUBMITTED;
        metricLogEntry5.setEvent(metricEvent8);
        org.dataone.service.types.v1.NodeReference nodeReference10 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry11 = new org.dataone.cn.log.MetricLogEntry(metricEvent8, nodeReference10);
        org.dataone.service.types.v1.NodeReference nodeReference12 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry13 = new org.dataone.cn.log.MetricLogEntry(metricEvent8, nodeReference12);
        org.junit.Assert.assertTrue("'" + metricEvent2 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent2.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + metricEvent8 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_SUBMITTED + "'", metricEvent8.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_SUBMITTED));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.dataone.cn.dao.ReplicationDao.ReplicaDto> replicaDtoCollection2 = replicationDaoMetacatImpl0.getQueuedReplicasByNode("AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:36:58:794, log text: hi!'}");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        guid,                                  member_node,                           status,                                date_verified                          FROM  smreplicationstatus              WHERE member_node = ?               AND status = 'QUEUED'               ORDER BY date_verified ASC;           [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener2 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "processing");
        clusterPartitionMembershipListener2.setExpectedIPList("processing");
        clusterPartitionMembershipListener2.setExpectedIPList("session");
        com.hazelcast.core.MembershipEvent membershipEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            clusterPartitionMembershipListener2.handleMemberAddedEvent(membershipEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.hazelcast.core.HazelcastInstance.getCluster()\" because \"this.hzInstance\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        org.dataone.cn.ldap.DirContextPooledObjectFactory dirContextPooledObjectFactory0 = new org.dataone.cn.ldap.DirContextPooledObjectFactory();
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject1 = null;
        dirContextPooledObjectFactory0.activateObject(dirContextPooledObject1);
        javax.naming.directory.DirContext dirContext3 = null;
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject4 = dirContextPooledObjectFactory0.wrap(dirContext3);
        org.junit.Assert.assertNotNull(dirContextPooledObject4);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2, "FORM");
        java.util.Date date5 = metricLogEntry4.getDateLogged();
        java.util.Date date6 = metricLogEntry4.getDateLogged();
        org.dataone.service.types.v1.Identifier identifier7 = null;
        metricLogEntry4.setPid(identifier7);
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Oct 27 23:37:05 CDT 2023");
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Fri Oct 27 23:37:05 CDT 2023");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        org.dataone.cn.log.AuditEvent auditEvent2 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str3 = auditEvent2.toString();
        org.dataone.cn.log.MetricEvent metricEvent4 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference5 = null;
        org.dataone.service.types.v1.Identifier identifier6 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry8 = new org.dataone.cn.log.MetricLogEntry(metricEvent4, nodeReference5, identifier6, "FORM");
        java.util.Date date9 = metricLogEntry8.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry11 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent2, date9, "hi!");
        org.dataone.cn.log.MetricEvent metricEvent12 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference13 = null;
        org.dataone.service.types.v1.Identifier identifier14 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry16 = new org.dataone.cn.log.MetricLogEntry(metricEvent12, nodeReference13, identifier14, "FORM");
        java.util.Date date17 = metricLogEntry16.getDateLogged();
        java.util.Date date18 = metricLogEntry16.getDateLogged();
        auditLogEntry11.setDateLogged(date18);
        java.util.Date date20 = auditLogEntry11.getDateLogged();
        auditLogEntry11.setPid("{\"event\":\"synchronization harvest submitted\",\"threadName\":\"main\",\"threadId\":1,\"dateLogged\":\"2023-10-28T04:36:59.002+00:00\"}");
        org.junit.Assert.assertTrue("'" + auditEvent2 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent2.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "replica audit failed" + "'", str3, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent4 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent4.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Fri Oct 27 23:37:05 CDT 2023");
        org.junit.Assert.assertTrue("'" + metricEvent12 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent12.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Fri Oct 27 23:37:05 CDT 2023");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Fri Oct 27 23:37:05 CDT 2023");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Fri Oct 27 23:37:05 CDT 2023");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        org.dataone.cn.log.AuditLogClientSolrImpl auditLogClientSolrImpl0 = new org.dataone.cn.log.AuditLogClientSolrImpl();
        org.dataone.cn.log.AuditEvent auditEvent3 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str4 = auditEvent3.toString();
        org.dataone.cn.log.MetricEvent metricEvent5 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference6 = null;
        org.dataone.service.types.v1.Identifier identifier7 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry9 = new org.dataone.cn.log.MetricLogEntry(metricEvent5, nodeReference6, identifier7, "FORM");
        java.util.Date date10 = metricLogEntry9.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry12 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent3, date10, "hi!");
        org.dataone.cn.log.MetricEvent metricEvent13 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference14 = null;
        org.dataone.service.types.v1.Identifier identifier15 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry17 = new org.dataone.cn.log.MetricLogEntry(metricEvent13, nodeReference14, identifier15, "FORM");
        java.util.Date date18 = metricLogEntry17.getDateLogged();
        java.util.Date date19 = metricLogEntry17.getDateLogged();
        auditLogEntry12.setDateLogged(date19);
        boolean boolean21 = auditLogClientSolrImpl0.logAuditEvent(auditLogEntry12);
        org.dataone.cn.log.AuditLogQueryClientNullObjectImpl auditLogQueryClientNullObjectImpl22 = new org.dataone.cn.log.AuditLogQueryClientNullObjectImpl();
        org.dataone.cn.log.AuditLogClientSolrImpl auditLogClientSolrImpl23 = new org.dataone.cn.log.AuditLogClientSolrImpl();
        org.dataone.cn.log.AuditEvent auditEvent26 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str27 = auditEvent26.toString();
        org.dataone.cn.log.MetricEvent metricEvent28 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference29 = null;
        org.dataone.service.types.v1.Identifier identifier30 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry32 = new org.dataone.cn.log.MetricLogEntry(metricEvent28, nodeReference29, identifier30, "FORM");
        java.util.Date date33 = metricLogEntry32.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry35 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent26, date33, "hi!");
        org.dataone.cn.log.MetricEvent metricEvent36 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference37 = null;
        org.dataone.service.types.v1.Identifier identifier38 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry40 = new org.dataone.cn.log.MetricLogEntry(metricEvent36, nodeReference37, identifier38, "FORM");
        java.util.Date date41 = metricLogEntry40.getDateLogged();
        java.util.Date date42 = metricLogEntry40.getDateLogged();
        auditLogEntry35.setDateLogged(date42);
        boolean boolean44 = auditLogClientSolrImpl23.logAuditEvent(auditLogEntry35);
        java.lang.String str45 = auditLogEntry35.getPid();
        java.lang.String str48 = auditLogQueryClientNullObjectImpl22.queryLog(auditLogEntry35, (java.lang.Integer) 301, (java.lang.Integer) 307);
        boolean boolean49 = auditLogClientSolrImpl0.removeReplicaAuditEvent(auditLogEntry35);
        java.lang.String str50 = auditLogEntry35.getLogText();
        org.junit.Assert.assertTrue("'" + auditEvent3 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent3.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "replica audit failed" + "'", str4, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent5 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent5.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Fri Oct 27 23:37:05 CDT 2023");
        org.junit.Assert.assertTrue("'" + metricEvent13 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent13.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Fri Oct 27 23:37:05 CDT 2023");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Fri Oct 27 23:37:05 CDT 2023");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + auditEvent26 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent26.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "replica audit failed" + "'", str27, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent28 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent28.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Fri Oct 27 23:37:05 CDT 2023");
        org.junit.Assert.assertTrue("'" + metricEvent36 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent36.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Fri Oct 27 23:37:05 CDT 2023");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Fri Oct 27 23:37:05 CDT 2023");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        org.apache.commons.logging.Log log0 = org.dataone.cn.hazelcast.HazelcastClientFactory.logger;
        org.dataone.cn.ldap.DirContextProvider.log = log0;
        org.dataone.cn.servlet.http.ProxyServletRequestWrapper.logger = log0;
        org.dataone.cn.ldap.LDAPService.log = log0;
        org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        org.dataone.cn.log.AuditEvent auditEvent2 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str3 = auditEvent2.toString();
        org.dataone.cn.log.MetricEvent metricEvent4 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference5 = null;
        org.dataone.service.types.v1.Identifier identifier6 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry8 = new org.dataone.cn.log.MetricLogEntry(metricEvent4, nodeReference5, identifier6, "FORM");
        java.util.Date date9 = metricLogEntry8.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry11 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent2, date9, "hi!");
        org.dataone.cn.log.MetricEvent metricEvent12 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference13 = null;
        org.dataone.service.types.v1.Identifier identifier14 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry16 = new org.dataone.cn.log.MetricLogEntry(metricEvent12, nodeReference13, identifier14, "FORM");
        java.util.Date date17 = metricLogEntry16.getDateLogged();
        java.util.Date date18 = metricLogEntry16.getDateLogged();
        auditLogEntry11.setDateLogged(date18);
        java.util.Date date20 = auditLogEntry11.getDateLogged();
        java.lang.String str21 = auditLogEntry11.getId();
        org.junit.Assert.assertTrue("'" + auditEvent2 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent2.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "replica audit failed" + "'", str3, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent4 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent4.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Fri Oct 27 23:37:05 CDT 2023");
        org.junit.Assert.assertTrue("'" + metricEvent12 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent12.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Fri Oct 27 23:37:05 CDT 2023");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Fri Oct 27 23:37:05 CDT 2023");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Fri Oct 27 23:37:05 CDT 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "|authorizedSubjects|replica audit failed|Fri Oct 27 23:37:05 CDT 2023" + "'", str21, "|authorizedSubjects|replica audit failed|Fri Oct 27 23:37:05 CDT 2023");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println((int) (short) 100);
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) -1 };
        bufferedServletOutputStream0.write(byteArray9);
        java.lang.Class<?> wildcardClass11 = bufferedServletOutputStream0.getClass();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 1, 0, 0, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        org.dataone.cn.log.MetricLogClientLog4JImpl metricLogClientLog4JImpl0 = new org.dataone.cn.log.MetricLogClientLog4JImpl();
        org.dataone.cn.log.MetricEvent metricEvent1 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        org.dataone.service.types.v1.Identifier identifier3 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, nodeReference2, identifier3);
        boolean boolean5 = metricLogClientLog4JImpl0.logMetricEvent(metricLogEntry4);
        org.dataone.cn.log.MetricEvent metricEvent6 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference7 = null;
        org.dataone.service.types.v1.Identifier identifier8 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry9 = new org.dataone.cn.log.MetricLogEntry(metricEvent6, nodeReference7, identifier8);
        java.lang.String str10 = metricEvent6.toString();
        org.dataone.service.types.v1.NodeReference nodeReference11 = null;
        org.dataone.service.types.v1.Identifier identifier12 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry13 = new org.dataone.cn.log.MetricLogEntry(metricEvent6, nodeReference11, identifier12);
        java.lang.String str14 = metricLogEntry13.toString();
        boolean boolean15 = metricLogClientLog4JImpl0.logMetricEvent(metricLogEntry13);
        org.junit.Assert.assertTrue("'" + metricEvent1 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent1.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + metricEvent6 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent6.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "synchronization harvest submitted" + "'", str10, "synchronization harvest submitted");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{\"event\":\"synchronization harvest submitted\",\"threadName\":\"main\",\"threadId\":1,\"dateLogged\":\"2023-10-28T04:37:05.738+00:00\"}" + "'", str14, "{\"event\":\"synchronization harvest submitted\",\"threadName\":\"main\",\"threadId\":1,\"dateLogged\":\"2023-10-28T04:37:05.738+00:00\"}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.print((float) 501);
        bufferedServletOutputStream0.print(502);
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream5 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream5.println((int) (short) 100);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) -1 };
        bufferedServletOutputStream5.write(byteArray14);
        bufferedServletOutputStream0.write(byteArray14);
        bufferedServletOutputStream0.print((long) 409);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 1, 0, 0, -1, -1]");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.close();
        bufferedServletOutputStream0.println();
        bufferedServletOutputStream0.close();
        bufferedServletOutputStream0.println((float) 409);
        bufferedServletOutputStream0.println("FORM");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        org.dataone.cn.log.AuditLogClientSolrImpl auditLogClientSolrImpl0 = new org.dataone.cn.log.AuditLogClientSolrImpl();
        org.dataone.cn.log.AuditEvent auditEvent3 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str4 = auditEvent3.toString();
        org.dataone.cn.log.MetricEvent metricEvent5 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference6 = null;
        org.dataone.service.types.v1.Identifier identifier7 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry9 = new org.dataone.cn.log.MetricLogEntry(metricEvent5, nodeReference6, identifier7, "FORM");
        java.util.Date date10 = metricLogEntry9.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry12 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent3, date10, "hi!");
        java.lang.String str13 = auditLogEntry12.toString();
        auditLogEntry12.setNodeId("|authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023");
        java.lang.String str16 = auditLogEntry12.toString();
        boolean boolean17 = auditLogClientSolrImpl0.logAuditEvent(auditLogEntry12);
        org.junit.Assert.assertTrue("'" + auditEvent3 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent3.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "replica audit failed" + "'", str4, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent5 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent5.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Fri Oct 27 23:37:05 CDT 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:05 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:05:798, log text: hi!'}" + "'", str13, "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:05 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:05:798, log text: hi!'}");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:05 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023, dateLogged: 10/27/2023:23:37:05:798, log text: hi!'}" + "'", str16, "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:05 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023, dateLogged: 10/27/2023:23:37:05:798, log text: hi!'}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        org.dataone.cn.log.AuditEvent auditEvent2 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str3 = auditEvent2.toString();
        org.dataone.cn.log.MetricEvent metricEvent4 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference5 = null;
        org.dataone.service.types.v1.Identifier identifier6 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry8 = new org.dataone.cn.log.MetricLogEntry(metricEvent4, nodeReference5, identifier6, "FORM");
        java.util.Date date9 = metricLogEntry8.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry11 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent2, date9, "hi!");
        org.dataone.cn.log.MetricEvent metricEvent12 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference13 = null;
        org.dataone.service.types.v1.Identifier identifier14 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry16 = new org.dataone.cn.log.MetricLogEntry(metricEvent12, nodeReference13, identifier14, "FORM");
        java.util.Date date17 = metricLogEntry16.getDateLogged();
        java.util.Date date18 = metricLogEntry16.getDateLogged();
        auditLogEntry11.setDateLogged(date18);
        java.util.Date date20 = auditLogEntry11.getDateLogged();
        auditLogEntry11.setNodeId("");
        org.dataone.cn.log.AuditEvent auditEvent23 = auditLogEntry11.getEvent();
        org.junit.Assert.assertTrue("'" + auditEvent2 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent2.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "replica audit failed" + "'", str3, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent4 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent4.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Fri Oct 27 23:37:05 CDT 2023");
        org.junit.Assert.assertTrue("'" + metricEvent12 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent12.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Fri Oct 27 23:37:05 CDT 2023");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Fri Oct 27 23:37:05 CDT 2023");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Fri Oct 27 23:37:05 CDT 2023");
        org.junit.Assert.assertTrue("'" + auditEvent23 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent23.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        org.dataone.cn.dao.SystemMetadataStatus systemMetadataStatus0 = new org.dataone.cn.dao.SystemMetadataStatus();
        java.util.Date date1 = systemMetadataStatus0.getLastSystemMetadataModificationDate();
        org.dataone.cn.log.MetricEvent metricEvent2 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference3 = null;
        org.dataone.service.types.v1.Identifier identifier4 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry6 = new org.dataone.cn.log.MetricLogEntry(metricEvent2, nodeReference3, identifier4, "FORM");
        java.util.Date date7 = metricLogEntry6.getDateLogged();
        systemMetadataStatus0.setLastSystemMetadataModificationDate(date7);
        org.dataone.service.types.v1.Identifier identifier9 = null;
        systemMetadataStatus0.setPid(identifier9);
        org.dataone.service.types.v1.Identifier identifier11 = systemMetadataStatus0.getPid();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertTrue("'" + metricEvent2 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent2.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Oct 27 23:37:05 CDT 2023");
        org.junit.Assert.assertNull(identifier11);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener2 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "session");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicationPolicyEntryMapper replicationPolicyEntryMapper1 = systemMetadataDaoMetacatImpl0.new ReplicationPolicyEntryMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicationPolicyEntryMapper replicationPolicyEntryMapper2 = systemMetadataDaoMetacatImpl0.new ReplicationPolicyEntryMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.AccessRuleMapper accessRuleMapper3 = systemMetadataDaoMetacatImpl0.new AccessRuleMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicationPolicyEntryMapper replicationPolicyEntryMapper4 = systemMetadataDaoMetacatImpl0.new ReplicationPolicyEntryMapper();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = systemMetadataDaoMetacatImpl0.getSystemMetadataCount();
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: StatementCallback; bad SQL grammar [SELECT count(guid) FROM systemmetadata]; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SYSTEMMETADATA\" not found; SQL statement:?SELECT count(guid) FROM systemmetadata [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        org.dataone.cn.log.AuditEvent auditEvent4 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str5 = auditEvent4.toString();
        org.dataone.cn.log.MetricEvent metricEvent6 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference7 = null;
        org.dataone.service.types.v1.Identifier identifier8 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry10 = new org.dataone.cn.log.MetricLogEntry(metricEvent6, nodeReference7, identifier8, "FORM");
        java.util.Date date11 = metricLogEntry10.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry13 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent4, date11, "hi!");
        java.lang.String str14 = auditLogEntry13.toString();
        auditLogEntry13.setNodeId("|authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023");
        java.lang.String str17 = auditLogEntry13.toString();
        org.dataone.cn.log.AuditEvent auditEvent20 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str21 = auditEvent20.toString();
        org.dataone.cn.log.AuditLogEntry auditLogEntry23 = new org.dataone.cn.log.AuditLogEntry("", "processing", auditEvent20, "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:57 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:36:57:366, log text: hi!'}");
        auditLogEntry13.setEvent(auditEvent20);
        org.dataone.cn.log.AuditLogEntry auditLogEntry26 = new org.dataone.cn.log.AuditLogEntry("AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:03 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:03:124, log text: hi!'}", "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:03 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:03:318, log text: hi!'}", auditEvent20, "/etc/dataone/storage/hazelcast.xml");
        org.junit.Assert.assertTrue("'" + auditEvent4 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent4.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "replica audit failed" + "'", str5, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent6 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent6.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Fri Oct 27 23:37:05 CDT 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:05 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:05:907, log text: hi!'}" + "'", str14, "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:05 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:05:907, log text: hi!'}");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:05 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023, dateLogged: 10/27/2023:23:37:05:907, log text: hi!'}" + "'", str17, "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:05 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023, dateLogged: 10/27/2023:23:37:05:907, log text: hi!'}");
        org.junit.Assert.assertTrue("'" + auditEvent20 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent20.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "replica not found" + "'", str21, "replica not found");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener2 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:36:58:794, log text: hi!'}");
        com.hazelcast.core.MembershipEvent membershipEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            clusterPartitionMembershipListener2.memberRemoved(membershipEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.hazelcast.core.MembershipEvent.getEventType()\" because \"membershipEvent\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        org.dataone.cn.dao.SystemMetadataStatus systemMetadataStatus0 = new org.dataone.cn.dao.SystemMetadataStatus();
        java.util.Date date1 = systemMetadataStatus0.getLastSystemMetadataModificationDate();
        org.dataone.service.types.v1.Identifier identifier2 = null;
        systemMetadataStatus0.setPid(identifier2);
        org.junit.Assert.assertNull(date1);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        org.dataone.cn.ldap.DirContextPooledObjectFactory dirContextPooledObjectFactory0 = new org.dataone.cn.ldap.DirContextPooledObjectFactory();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject1 = dirContextPooledObjectFactory0.makeObject();
            org.junit.Assert.fail("Expected exception of type javax.naming.CommunicationException; message: localhost:12389");
        } catch (javax.naming.CommunicationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        org.dataone.cn.batch.exceptions.ExecutionDisabledException executionDisabledException1 = new org.dataone.cn.batch.exceptions.ExecutionDisabledException("");
        java.lang.Throwable[] throwableArray2 = executionDisabledException1.getSuppressed();
        org.dataone.cn.dao.exceptions.DataAccessException dataAccessException3 = new org.dataone.cn.dao.exceptions.DataAccessException((java.lang.Throwable) executionDisabledException1);
        org.dataone.cn.batch.exceptions.ExecutionDisabledException executionDisabledException4 = new org.dataone.cn.batch.exceptions.ExecutionDisabledException((java.lang.Throwable) executionDisabledException1);
        java.lang.String str5 = executionDisabledException4.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.dataone.cn.batch.exceptions.ExecutionDisabledException: org.dataone.cn.batch.exceptions.ExecutionDisabledException: " + "'", str5, "org.dataone.cn.batch.exceptions.ExecutionDisabledException: org.dataone.cn.batch.exceptions.ExecutionDisabledException: ");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        org.dataone.cn.dao.ReplicationPolicyEntry replicationPolicyEntry0 = new org.dataone.cn.dao.ReplicationPolicyEntry();
        replicationPolicyEntry0.setPolicy("|authorizedSubjects|replica audit failed|Fri Oct 27 23:36:59 CDT 2023");
        replicationPolicyEntry0.setPolicy("AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:02 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:02:644, log text: hi!'}");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        org.dataone.cn.dao.ReplicationDao.ReplicaDto replicaDto0 = new org.dataone.cn.dao.ReplicationDao.ReplicaDto();
        org.dataone.service.types.v1.Identifier identifier1 = replicaDto0.identifier;
        org.dataone.service.types.v1.Replica replica2 = null;
        replicaDto0.replica = replica2;
        org.junit.Assert.assertNull(identifier1);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.print((float) 501);
        bufferedServletOutputStream0.println((float) 204);
        bufferedServletOutputStream0.write(305);
        bufferedServletOutputStream0.print("storage");
        bufferedServletOutputStream0.println((long) 204);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        org.apache.commons.dbcp.BasicDataSource basicDataSource0 = org.dataone.cn.dao.MetacatDataSourceFactory.getMetacatDataSource();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl1 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl((javax.sql.DataSource) basicDataSource0);
        org.junit.Assert.assertNotNull(basicDataSource0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        org.dataone.cn.dao.ReplicationPolicyEntry replicationPolicyEntry0 = new org.dataone.cn.dao.ReplicationPolicyEntry();
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        replicationPolicyEntry0.setMemberNode(nodeReference1);
        org.dataone.service.types.v1.Identifier identifier3 = replicationPolicyEntry0.getPid();
        org.dataone.service.types.v1.Identifier identifier4 = null;
        replicationPolicyEntry0.setPid(identifier4);
        org.junit.Assert.assertNull(identifier3);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.print((float) 501);
        bufferedServletOutputStream0.println((float) 204);
        bufferedServletOutputStream0.write(305);
        bufferedServletOutputStream0.println(200);
        bufferedServletOutputStream0.print((double) 304);
        bufferedServletOutputStream0.println();
        bufferedServletOutputStream0.println((long) 100);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println((int) (short) 100);
        bufferedServletOutputStream0.println("session");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        org.dataone.cn.dao.ReplicationDao replicationDao0 = org.dataone.cn.dao.DaoFactory.getReplicationDao();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = replicationDao0.queuedReplicaExists("AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:02 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:02:512, log text: hi!'}", "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:05 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:05:798, log text: hi!'}");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        count(*)                               FROM  smreplicationstatus              WHERE guid = ?                         AND member_node = ?                    AND status = 'QUEUED'                 [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(replicationDao0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl0 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SystemMetadataStatusMapper systemMetadataStatusMapper1 = systemMetadataDaoMetacatImpl0.new SystemMetadataStatusMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SystemMetadataStatusMapper systemMetadataStatusMapper2 = systemMetadataDaoMetacatImpl0.new SystemMetadataStatusMapper();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.AuditEvent auditEvent3 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str4 = auditEvent3.toString();
        org.dataone.cn.log.MetricEvent metricEvent5 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference6 = null;
        org.dataone.service.types.v1.Identifier identifier7 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry9 = new org.dataone.cn.log.MetricLogEntry(metricEvent5, nodeReference6, identifier7, "FORM");
        java.util.Date date10 = metricLogEntry9.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry12 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent3, date10, "hi!");
        org.dataone.cn.log.MetricEvent metricEvent13 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference14 = null;
        org.dataone.service.types.v1.Identifier identifier15 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry17 = new org.dataone.cn.log.MetricLogEntry(metricEvent13, nodeReference14, identifier15, "FORM");
        java.util.Date date18 = metricLogEntry17.getDateLogged();
        java.util.Date date19 = metricLogEntry17.getDateLogged();
        auditLogEntry12.setDateLogged(date19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.cn.dao.ReplicationDao.ReplicaDto> replicaDtoList21 = replicationDaoMetacatImpl0.getRequestedReplicasByDate(date19);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        guid,                                  member_node,                           status,                                date_verified                          FROM  smreplicationstatus              WHERE date_verified <= ?               AND status = 'REQUESTED'               ORDER BY date_verified ASC;           [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + auditEvent3 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent3.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "replica audit failed" + "'", str4, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent5 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent5.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Fri Oct 27 23:37:06 CDT 2023");
        org.junit.Assert.assertTrue("'" + metricEvent13 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent13.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Fri Oct 27 23:37:06 CDT 2023");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Fri Oct 27 23:37:06 CDT 2023");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        org.dataone.cn.log.AuditLogClientSolrImpl auditLogClientSolrImpl0 = new org.dataone.cn.log.AuditLogClientSolrImpl();
        org.dataone.cn.log.AuditLogClientSolrImpl auditLogClientSolrImpl1 = new org.dataone.cn.log.AuditLogClientSolrImpl();
        org.dataone.cn.log.AuditEvent auditEvent4 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str5 = auditEvent4.toString();
        org.dataone.cn.log.MetricEvent metricEvent6 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference7 = null;
        org.dataone.service.types.v1.Identifier identifier8 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry10 = new org.dataone.cn.log.MetricLogEntry(metricEvent6, nodeReference7, identifier8, "FORM");
        java.util.Date date11 = metricLogEntry10.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry13 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent4, date11, "hi!");
        org.dataone.cn.log.MetricEvent metricEvent14 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference15 = null;
        org.dataone.service.types.v1.Identifier identifier16 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry18 = new org.dataone.cn.log.MetricLogEntry(metricEvent14, nodeReference15, identifier16, "FORM");
        java.util.Date date19 = metricLogEntry18.getDateLogged();
        java.util.Date date20 = metricLogEntry18.getDateLogged();
        auditLogEntry13.setDateLogged(date20);
        boolean boolean22 = auditLogClientSolrImpl1.logAuditEvent(auditLogEntry13);
        org.dataone.cn.log.AuditLogQueryClientNullObjectImpl auditLogQueryClientNullObjectImpl23 = new org.dataone.cn.log.AuditLogQueryClientNullObjectImpl();
        org.dataone.cn.log.AuditLogClientSolrImpl auditLogClientSolrImpl24 = new org.dataone.cn.log.AuditLogClientSolrImpl();
        org.dataone.cn.log.AuditEvent auditEvent27 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str28 = auditEvent27.toString();
        org.dataone.cn.log.MetricEvent metricEvent29 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference30 = null;
        org.dataone.service.types.v1.Identifier identifier31 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry33 = new org.dataone.cn.log.MetricLogEntry(metricEvent29, nodeReference30, identifier31, "FORM");
        java.util.Date date34 = metricLogEntry33.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry36 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent27, date34, "hi!");
        org.dataone.cn.log.MetricEvent metricEvent37 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference38 = null;
        org.dataone.service.types.v1.Identifier identifier39 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry41 = new org.dataone.cn.log.MetricLogEntry(metricEvent37, nodeReference38, identifier39, "FORM");
        java.util.Date date42 = metricLogEntry41.getDateLogged();
        java.util.Date date43 = metricLogEntry41.getDateLogged();
        auditLogEntry36.setDateLogged(date43);
        boolean boolean45 = auditLogClientSolrImpl24.logAuditEvent(auditLogEntry36);
        java.lang.String str46 = auditLogEntry36.getPid();
        java.lang.String str49 = auditLogQueryClientNullObjectImpl23.queryLog(auditLogEntry36, (java.lang.Integer) 301, (java.lang.Integer) 307);
        boolean boolean50 = auditLogClientSolrImpl1.removeReplicaAuditEvent(auditLogEntry36);
        java.util.Date date51 = auditLogEntry36.getDateLogged();
        java.lang.String str54 = auditLogClientSolrImpl0.queryLog(auditLogEntry36, (java.lang.Integer) (-1), (java.lang.Integer) 406);
        org.junit.Assert.assertTrue("'" + auditEvent4 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent4.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "replica audit failed" + "'", str5, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent6 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent6.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Fri Oct 27 23:37:06 CDT 2023");
        org.junit.Assert.assertTrue("'" + metricEvent14 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent14.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Fri Oct 27 23:37:06 CDT 2023");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Fri Oct 27 23:37:06 CDT 2023");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + auditEvent27 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent27.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "replica audit failed" + "'", str28, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent29 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent29.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Fri Oct 27 23:37:06 CDT 2023");
        org.junit.Assert.assertTrue("'" + metricEvent37 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent37.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Fri Oct 27 23:37:06 CDT 2023");
        org.junit.Assert.assertNotNull(date43);
// flaky:         org.junit.Assert.assertEquals(date43.toString(), "Fri Oct 27 23:37:06 CDT 2023");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(date51);
// flaky:         org.junit.Assert.assertEquals(date51.toString(), "Fri Oct 27 23:37:06 CDT 2023");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.dao.SystemMetadataStatus systemMetadataStatus1 = new org.dataone.cn.dao.SystemMetadataStatus();
        java.util.Date date2 = systemMetadataStatus1.getLastSystemMetadataModificationDate();
        org.dataone.cn.log.AuditEvent auditEvent5 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str6 = auditEvent5.toString();
        org.dataone.cn.log.MetricEvent metricEvent7 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference8 = null;
        org.dataone.service.types.v1.Identifier identifier9 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry11 = new org.dataone.cn.log.MetricLogEntry(metricEvent7, nodeReference8, identifier9, "FORM");
        java.util.Date date12 = metricLogEntry11.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry14 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent5, date12, "hi!");
        org.dataone.cn.log.MetricEvent metricEvent15 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference16 = null;
        org.dataone.service.types.v1.Identifier identifier17 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry19 = new org.dataone.cn.log.MetricLogEntry(metricEvent15, nodeReference16, identifier17, "FORM");
        java.util.Date date20 = metricLogEntry19.getDateLogged();
        java.util.Date date21 = metricLogEntry19.getDateLogged();
        auditLogEntry14.setDateLogged(date21);
        java.util.Date date23 = auditLogEntry14.getDateLogged();
        systemMetadataStatus1.setLastSystemMetadataModificationDate(date23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList27 = replicationDaoMetacatImpl0.getCompletedCoordinatingNodeReplicasByDate(date23, 408, 200);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'COMPLETED'   AND member_node = 'cnDev'  ORDER BY date_verified ASC LIMIT 200 OFFSET 81400; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + auditEvent5 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent5.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "replica audit failed" + "'", str6, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent7 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent7.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Fri Oct 27 23:37:06 CDT 2023");
        org.junit.Assert.assertTrue("'" + metricEvent15 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent15.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Fri Oct 27 23:37:06 CDT 2023");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Fri Oct 27 23:37:06 CDT 2023");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Fri Oct 27 23:37:06 CDT 2023");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2, "FORM");
        java.util.Date date5 = metricLogEntry4.getDateLogged();
        org.dataone.service.types.v1.Identifier identifier6 = null;
        metricLogEntry4.setPid(identifier6);
        java.util.Date date8 = metricLogEntry4.getDateLogged();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Oct 27 23:37:06 CDT 2023");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Oct 27 23:37:06 CDT 2023");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        org.dataone.cn.ldap.DirContextPooledObjectFactory dirContextPooledObjectFactory0 = new org.dataone.cn.ldap.DirContextPooledObjectFactory();
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject1 = null;
        dirContextPooledObjectFactory0.activateObject(dirContextPooledObject1);
        // The following exception was thrown during execution in test generation
        try {
            javax.naming.directory.DirContext dirContext3 = dirContextPooledObjectFactory0.create();
            org.junit.Assert.fail("Expected exception of type javax.naming.CommunicationException; message: localhost:12389");
        } catch (javax.naming.CommunicationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println('4');
        bufferedServletOutputStream0.setBufferSize((int) (byte) 100);
        bufferedServletOutputStream0.close();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        org.dataone.cn.dao.SystemMetadataStatus systemMetadataStatus0 = new org.dataone.cn.dao.SystemMetadataStatus();
        java.util.Date date1 = systemMetadataStatus0.getLastSystemMetadataModificationDate();
        org.dataone.cn.log.AuditEvent auditEvent4 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str5 = auditEvent4.toString();
        org.dataone.cn.log.MetricEvent metricEvent6 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference7 = null;
        org.dataone.service.types.v1.Identifier identifier8 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry10 = new org.dataone.cn.log.MetricLogEntry(metricEvent6, nodeReference7, identifier8, "FORM");
        java.util.Date date11 = metricLogEntry10.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry13 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent4, date11, "hi!");
        org.dataone.cn.log.MetricEvent metricEvent14 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference15 = null;
        org.dataone.service.types.v1.Identifier identifier16 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry18 = new org.dataone.cn.log.MetricLogEntry(metricEvent14, nodeReference15, identifier16, "FORM");
        java.util.Date date19 = metricLogEntry18.getDateLogged();
        java.util.Date date20 = metricLogEntry18.getDateLogged();
        auditLogEntry13.setDateLogged(date20);
        java.util.Date date22 = auditLogEntry13.getDateLogged();
        systemMetadataStatus0.setLastSystemMetadataModificationDate(date22);
        org.dataone.service.types.v1.Identifier identifier24 = systemMetadataStatus0.getPid();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertTrue("'" + auditEvent4 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent4.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "replica audit failed" + "'", str5, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent6 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent6.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Fri Oct 27 23:37:06 CDT 2023");
        org.junit.Assert.assertTrue("'" + metricEvent14 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent14.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Fri Oct 27 23:37:06 CDT 2023");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Fri Oct 27 23:37:06 CDT 2023");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Fri Oct 27 23:37:06 CDT 2023");
        org.junit.Assert.assertNull(identifier24);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.close();
        bufferedServletOutputStream0.println();
        bufferedServletOutputStream0.close();
        bufferedServletOutputStream0.println(501);
        bufferedServletOutputStream0.println();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        org.dataone.cn.dao.ReplicationDao.ReplicaDto replicaDto0 = new org.dataone.cn.dao.ReplicationDao.ReplicaDto();
        org.dataone.service.types.v1.Replica replica1 = replicaDto0.replica;
        org.junit.Assert.assertNull(replica1);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.dao.SystemMetadataStatus systemMetadataStatus1 = new org.dataone.cn.dao.SystemMetadataStatus();
        java.util.Date date2 = systemMetadataStatus1.getLastSystemMetadataModificationDate();
        org.dataone.cn.log.AuditEvent auditEvent5 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str6 = auditEvent5.toString();
        org.dataone.cn.log.MetricEvent metricEvent7 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference8 = null;
        org.dataone.service.types.v1.Identifier identifier9 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry11 = new org.dataone.cn.log.MetricLogEntry(metricEvent7, nodeReference8, identifier9, "FORM");
        java.util.Date date12 = metricLogEntry11.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry14 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent5, date12, "hi!");
        org.dataone.cn.log.MetricEvent metricEvent15 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference16 = null;
        org.dataone.service.types.v1.Identifier identifier17 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry19 = new org.dataone.cn.log.MetricLogEntry(metricEvent15, nodeReference16, identifier17, "FORM");
        java.util.Date date20 = metricLogEntry19.getDateLogged();
        java.util.Date date21 = metricLogEntry19.getDateLogged();
        auditLogEntry14.setDateLogged(date21);
        java.util.Date date23 = auditLogEntry14.getDateLogged();
        systemMetadataStatus1.setLastSystemMetadataModificationDate(date23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList27 = replicationDaoMetacatImpl0.getInvalidMemberNodeReplicasByDate(date23, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'INVALIDATED'   AND member_node <> 'cnDev'  ORDER BY date_verified ASC ; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + auditEvent5 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent5.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "replica audit failed" + "'", str6, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent7 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent7.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Fri Oct 27 23:37:06 CDT 2023");
        org.junit.Assert.assertTrue("'" + metricEvent15 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent15.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Fri Oct 27 23:37:06 CDT 2023");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Fri Oct 27 23:37:06 CDT 2023");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Fri Oct 27 23:37:06 CDT 2023");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        org.dataone.cn.log.AuditLogClientSplunkImpl auditLogClientSplunkImpl0 = new org.dataone.cn.log.AuditLogClientSplunkImpl();
        org.dataone.cn.log.AuditEvent auditEvent3 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str4 = auditEvent3.toString();
        org.dataone.cn.log.MetricEvent metricEvent5 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference6 = null;
        org.dataone.service.types.v1.Identifier identifier7 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry9 = new org.dataone.cn.log.MetricLogEntry(metricEvent5, nodeReference6, identifier7, "FORM");
        java.util.Date date10 = metricLogEntry9.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry12 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent3, date10, "hi!");
        org.dataone.cn.log.MetricEvent metricEvent13 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference14 = null;
        org.dataone.service.types.v1.Identifier identifier15 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry17 = new org.dataone.cn.log.MetricLogEntry(metricEvent13, nodeReference14, identifier15, "FORM");
        java.util.Date date18 = metricLogEntry17.getDateLogged();
        java.util.Date date19 = metricLogEntry17.getDateLogged();
        auditLogEntry12.setDateLogged(date19);
        java.util.Date date21 = auditLogEntry12.getDateLogged();
        org.dataone.cn.log.AuditEvent auditEvent26 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str27 = auditEvent26.toString();
        org.dataone.cn.log.MetricEvent metricEvent28 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference29 = null;
        org.dataone.service.types.v1.Identifier identifier30 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry32 = new org.dataone.cn.log.MetricLogEntry(metricEvent28, nodeReference29, identifier30, "FORM");
        java.util.Date date33 = metricLogEntry32.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry35 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent26, date33, "hi!");
        java.lang.String str36 = auditLogEntry35.getId();
        org.dataone.cn.log.AuditEvent auditEvent37 = auditLogEntry35.getEvent();
        org.dataone.cn.log.AuditLogEntry auditLogEntry39 = new org.dataone.cn.log.AuditLogEntry("{\"event\":\"synchronization harvest submitted\",\"message\":\"FORM\",\"threadName\":\"main\",\"threadId\":1,\"dateLogged\":\"2023-10-28T04:37:00.861+00:00\"}", "|authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023", auditEvent37, "/etc/dataone/process/hazelcast.xml");
        auditLogEntry12.setEvent(auditEvent37);
        boolean boolean41 = auditLogClientSplunkImpl0.removeReplicaAuditEvent(auditLogEntry12);
        org.dataone.cn.log.AuditEvent auditEvent44 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        java.lang.String str45 = auditEvent44.toString();
        org.dataone.cn.log.MetricEvent metricEvent46 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference47 = null;
        org.dataone.service.types.v1.Identifier identifier48 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry50 = new org.dataone.cn.log.MetricLogEntry(metricEvent46, nodeReference47, identifier48, "FORM");
        java.util.Date date51 = metricLogEntry50.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry53 = new org.dataone.cn.log.AuditLogEntry("", "authorizedSubjects", auditEvent44, date51, "hi!");
        java.lang.String str54 = auditLogEntry53.toString();
        auditLogEntry53.setNodeId("|authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023");
        java.lang.String str57 = auditLogEntry53.toString();
        org.dataone.cn.log.AuditEvent auditEvent60 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str61 = auditEvent60.toString();
        org.dataone.cn.log.AuditLogEntry auditLogEntry63 = new org.dataone.cn.log.AuditLogEntry("", "processing", auditEvent60, "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:57 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:36:57:366, log text: hi!'}");
        auditLogEntry53.setEvent(auditEvent60);
        auditLogEntry12.setEvent(auditEvent60);
        org.junit.Assert.assertTrue("'" + auditEvent3 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent3.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "replica audit failed" + "'", str4, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent5 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent5.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Fri Oct 27 23:37:06 CDT 2023");
        org.junit.Assert.assertTrue("'" + metricEvent13 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent13.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Fri Oct 27 23:37:06 CDT 2023");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Fri Oct 27 23:37:06 CDT 2023");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Fri Oct 27 23:37:06 CDT 2023");
        org.junit.Assert.assertTrue("'" + auditEvent26 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent26.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "replica audit failed" + "'", str27, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent28 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent28.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Fri Oct 27 23:37:06 CDT 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "|authorizedSubjects|replica audit failed|Fri Oct 27 23:37:06 CDT 2023" + "'", str36, "|authorizedSubjects|replica audit failed|Fri Oct 27 23:37:06 CDT 2023");
        org.junit.Assert.assertTrue("'" + auditEvent37 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent37.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + auditEvent44 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent44.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "replica audit failed" + "'", str45, "replica audit failed");
        org.junit.Assert.assertTrue("'" + metricEvent46 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent46.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date51);
// flaky:         org.junit.Assert.assertEquals(date51.toString(), "Fri Oct 27 23:37:06 CDT 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:06 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:06:474, log text: hi!'}" + "'", str54, "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:06 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: authorizedSubjects, dateLogged: 10/27/2023:23:37:06:474, log text: hi!'}");
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:06 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023, dateLogged: 10/27/2023:23:37:06:474, log text: hi!'}" + "'", str57, "AuditLogEntry {id: |authorizedSubjects|replica audit failed|Fri Oct 27 23:37:06 CDT 2023, pid: , auditEvent: replica audit failed, nodeId: |authorizedSubjects|replica audit failed|Fri Oct 27 23:36:58 CDT 2023, dateLogged: 10/27/2023:23:37:06:474, log text: hi!'}");
        org.junit.Assert.assertTrue("'" + auditEvent60 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent60.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "replica not found" + "'", str61, "replica not found");
    }
}
