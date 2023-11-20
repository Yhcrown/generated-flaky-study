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
        int int0 = javax.servlet.http.HttpServletResponse.SC_BAD_REQUEST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 400 + "'", int0 == 400);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        org.dataone.service.types.v1.NodeReference nodeReference0 = null;
        org.dataone.service.types.v1.Identifier identifier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.synchronization.types.SyncObject syncObject2 = new org.dataone.cn.synchronization.types.SyncObject(nodeReference0, identifier1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.lang.String str0 = org.dataone.cn.servlet.http.ParameterKeys.AUTHORIZED_SUBJECTS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "authorizedSubjects" + "'", str0, "authorizedSubjects");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean0 = org.dataone.cn.ComponentActivationUtility.replicationMNAuditorIsActive();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'Replication.audit.mn.active' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        java.lang.String str0 = org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener.PROCESSING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "processing" + "'", str0, "processing");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
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
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        int int0 = javax.servlet.http.HttpServletResponse.SC_PARTIAL_CONTENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 206 + "'", int0 == 206);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener3 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        java.lang.String str0 = javax.servlet.http.HttpServletRequest.CLIENT_CERT_AUTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "CLIENT_CERT" + "'", str0, "CLIENT_CERT");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        boolean boolean0 = org.dataone.cn.hazelcast.membership.ClusterPartitionMonitor.getStoragePartion();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.String str0 = org.dataone.cn.servlet.http.ParameterKeys.IS_CN_ADMINISTRATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "isCnAdministrator" + "'", str0, "isCnAdministrator");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        int int0 = javax.servlet.http.HttpServletResponse.SC_UNAUTHORIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 401 + "'", int0 == 401);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.lang.String str0 = org.dataone.cn.hazelcast.HazelcastConfigLocationFactory.getSessionConfigLocation();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/etc/dataone/portal/hazelcast.xml" + "'", str0, "/etc/dataone/portal/hazelcast.xml");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.lang.String str0 = org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener.SESSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "session" + "'", str0, "session");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
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
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        int int0 = javax.servlet.http.HttpServletResponse.SC_PAYMENT_REQUIRED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 402 + "'", int0 == 402);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.dataone.cn.dao.ReplicationDao.ReplicaDto> replicaDtoCollection2 = replicationDaoMetacatImpl0.getQueuedReplicasByNode("");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        guid,                                  member_node,                           status,                                date_verified                          FROM  smreplicationstatus              WHERE member_node = ?               AND status = 'QUEUED'               ORDER BY date_verified ASC;           [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        int int0 = javax.servlet.http.HttpServletResponse.SC_MOVED_PERMANENTLY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 301 + "'", int0 == 301);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.lang.String str0 = org.dataone.cn.hazelcast.HazelcastConfigLocationFactory.getStorageConfigLocation();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/etc/dataone/storage/hazelcast.xml" + "'", str0, "/etc/dataone/storage/hazelcast.xml");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
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
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        boolean boolean0 = org.dataone.cn.hazelcast.membership.ClusterPartitionMonitor.getSessionPartition();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        int int0 = javax.servlet.http.HttpServletResponse.SC_REQUEST_ENTITY_TOO_LARGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 413 + "'", int0 == 413);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        java.lang.String str0 = javax.servlet.http.HttpServletRequest.FORM_AUTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "FORM" + "'", str0, "FORM");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_SUBMITTED;
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_SUBMITTED));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList4 = replicationDaoMetacatImpl0.getCompletedMemberNodeReplicasByDate(date1, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        int int0 = javax.servlet.http.HttpServletResponse.SC_PROXY_AUTHENTICATION_REQUIRED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 407 + "'", int0 == 407);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        org.apache.commons.logging.Log log0 = null;
        org.dataone.cn.ldap.LDAPService.log = log0;
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        java.lang.String str0 = org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SM_POLICY_TABLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "smreplicationpolicy" + "'", str0, "smreplicationpolicy");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = org.dataone.cn.hazelcast.HazelcastInstanceFactory.getProcessingInstance();
        org.junit.Assert.assertNull(hazelcastInstance0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean0 = org.dataone.cn.ComponentActivationUtility.replicationCNAuditorIsActive();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'Replication.audit.cn.active' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        int int0 = javax.servlet.http.HttpServletResponse.SC_REQUEST_TIMEOUT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 408 + "'", int0 == 408);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
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
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        org.dataone.cn.log.AuditEvent auditEvent0 = org.dataone.cn.log.AuditEvent.REPLICA_BAD_CHECKSUM;
        org.junit.Assert.assertTrue("'" + auditEvent0 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_BAD_CHECKSUM + "'", auditEvent0.equals(org.dataone.cn.log.AuditEvent.REPLICA_BAD_CHECKSUM));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
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
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        int int0 = javax.servlet.http.HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 415 + "'", int0 == 415);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        org.dataone.cn.hazelcast.HazelcastClientInstance hazelcastClientInstance0 = new org.dataone.cn.hazelcast.HazelcastClientInstance();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
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
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        int int0 = javax.servlet.http.HttpServletResponse.SC_CREATED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 201 + "'", int0 == 201);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        int int0 = javax.servlet.http.HttpServletResponse.SC_NOT_MODIFIED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 304 + "'", int0 == 304);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener3 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "processing", "FORM");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.dataone.cn.dao.ReplicationDao.ReplicaDto> replicaDtoCollection2 = replicationDaoMetacatImpl0.getQueuedReplicasByNode("FORM");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        guid,                                  member_node,                           status,                                date_verified                          FROM  smreplicationstatus              WHERE member_node = ?               AND status = 'QUEUED'               ORDER BY date_verified ASC;           [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        int int0 = javax.servlet.http.HttpServletResponse.SC_BAD_GATEWAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 502 + "'", int0 == 502);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.dataone.cn.dao.ReplicationDao.ReplicaDto> replicaDtoCollection2 = replicationDaoMetacatImpl0.getQueuedReplicasByNode("smreplicationpolicy");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        guid,                                  member_node,                           status,                                date_verified                          FROM  smreplicationstatus              WHERE member_node = ?               AND status = 'QUEUED'               ORDER BY date_verified ASC;           [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        int int0 = javax.servlet.http.HttpServletResponse.SC_ACCEPTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 202 + "'", int0 == 202);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = replicationDaoMetacatImpl0.getRequestedReplicationCount(nodeReference1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        org.dataone.cn.batch.exceptions.ExecutionDisabledException executionDisabledException1 = new org.dataone.cn.batch.exceptions.ExecutionDisabledException("hi!");
        org.dataone.cn.dao.exceptions.DataAccessException dataAccessException2 = new org.dataone.cn.dao.exceptions.DataAccessException((java.lang.Throwable) executionDisabledException1);
        java.lang.Throwable[] throwableArray3 = executionDisabledException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.hazelcast.ClientConfiguration clientConfiguration0 = new org.dataone.cn.hazelcast.ClientConfiguration();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: /etc/dataone/storage/hazelcast.xml (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        int int0 = javax.servlet.http.HttpServletResponse.SC_MOVED_TEMPORARILY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 302 + "'", int0 == 302);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        int int0 = javax.servlet.http.HttpServletResponse.SC_SWITCHING_PROTOCOLS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 101 + "'", int0 == 101);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        int int0 = javax.servlet.http.HttpServletResponse.SC_PRECONDITION_FAILED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 412 + "'", int0 == 412);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        int int0 = javax.servlet.http.HttpServletResponse.SC_NOT_ACCEPTABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 406 + "'", int0 == 406);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        int int0 = javax.servlet.http.HttpServletResponse.SC_OK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 200 + "'", int0 == 200);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        int int0 = javax.servlet.http.HttpServletResponse.SC_RESET_CONTENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 205 + "'", int0 == 205);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        java.lang.String str0 = org.dataone.cn.servlet.http.ParameterKeys.IS_MN_ADMINISTRATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "isMnAdministrator" + "'", str0, "isMnAdministrator");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.dataone.cn.dao.ReplicationDao.ReplicaDto> replicaDtoCollection2 = replicationDaoMetacatImpl0.getQueuedReplicasByNode("CLIENT_CERT");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        guid,                                  member_node,                           status,                                date_verified                          FROM  smreplicationstatus              WHERE member_node = ?               AND status = 'QUEUED'               ORDER BY date_verified ASC;           [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        org.dataone.cn.hazelcast.membership.ClusterPartitionMonitor.setStoragePartition(true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList4 = replicationDaoMetacatImpl0.getCompletedMemberNodeReplicasByDate(date1, 205, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        int int0 = javax.servlet.http.HttpServletResponse.SC_METHOD_NOT_ALLOWED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 405 + "'", int0 == 405);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        int int0 = javax.servlet.http.HttpServletResponse.SC_NO_CONTENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 204 + "'", int0 == 204);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList4 = replicationDaoMetacatImpl0.getCompletedCoordinatingNodeReplicasByDate(date1, 100, 408);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        org.dataone.cn.hazelcast.HazelcastConfigLocationFactory hazelcastConfigLocationFactory0 = new org.dataone.cn.hazelcast.HazelcastConfigLocationFactory();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        int int0 = javax.servlet.http.HttpServletResponse.SC_LENGTH_REQUIRED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 411 + "'", int0 == 411);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener3 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "", "CLIENT_CERT");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        org.dataone.cn.batch.exceptions.ExecutionDisabledException executionDisabledException1 = new org.dataone.cn.batch.exceptions.ExecutionDisabledException("hi!");
        java.lang.Throwable[] throwableArray2 = executionDisabledException1.getSuppressed();
        java.lang.String str3 = executionDisabledException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.dataone.cn.batch.exceptions.ExecutionDisabledException: hi!" + "'", str3, "org.dataone.cn.batch.exceptions.ExecutionDisabledException: hi!");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList4 = replicationDaoMetacatImpl0.getCompletedMemberNodeReplicasByDate(date1, 0, 407);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList4 = replicationDaoMetacatImpl0.getCompletedMemberNodeReplicasByDate(date1, 0, 206);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.lang.String str0 = javax.servlet.http.HttpServletRequest.DIGEST_AUTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "DIGEST" + "'", str0, "DIGEST");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        org.dataone.cn.ldap.DirContextPooledObjectFactory dirContextPooledObjectFactory0 = new org.dataone.cn.ldap.DirContextPooledObjectFactory();
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = dirContextPooledObjectFactory0.validateObject(dirContextPooledObject1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
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
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        java.lang.String str0 = org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ACCESS_TABLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xml_access" + "'", str0, "xml_access");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        org.dataone.cn.hazelcast.membership.ClusterPartitionMonitor.setProcessingPartition(false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent5 = metricLogEntry4.getEvent();
        org.dataone.service.types.v1.NodeReference nodeReference6 = metricLogEntry4.getNodeId();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent5 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent5.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNull(nodeReference6);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println(0.0f);
        bufferedServletOutputStream0.reset();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            bufferedServletOutputStream0.write(byteArray7, (int) (short) 100, 301);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 100]");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        int int0 = javax.servlet.http.HttpServletResponse.SC_SERVICE_UNAVAILABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 503 + "'", int0 == 503);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean0 = org.dataone.cn.ComponentActivationUtility.synchronizationIsActive();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'Synchronization.active' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        java.lang.String str0 = org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SM_STATUS_TABLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "smreplicationstatus" + "'", str0, "smreplicationstatus");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        java.lang.String str0 = org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SYSMETA_TABLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "systemmetadata" + "'", str0, "systemmetadata");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
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
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
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
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        int int0 = javax.servlet.http.HttpServletResponse.SC_FOUND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 302 + "'", int0 == 302);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        boolean boolean0 = org.dataone.cn.ComponentActivationUtility.disableSynchronization();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        int int0 = javax.servlet.http.HttpServletResponse.SC_INTERNAL_SERVER_ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 500 + "'", int0 == 500);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        org.dataone.cn.dao.SystemMetadataDao systemMetadataDao0 = org.dataone.cn.dao.DaoFactory.getSystemMetadataDao();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.cn.dao.SystemMetadataStatus> systemMetadataStatusList3 = systemMetadataDao0.listSystemMetadataStatus(204, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.dataone.cn.dao.exceptions.DataAccessException; message: org.springframework.jdbc.BadSqlGrammarException: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SYSTEMMETADATA\" not found; SQL statement:?SELECT guid, serial_version, date_modified, archived FROM systemmetadata ORDER BY guid LIMIT 10 OFFSET 2030; [42102-163]");
        } catch (org.dataone.cn.dao.exceptions.DataAccessException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemMetadataDao0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        org.dataone.cn.hazelcast.membership.ClusterPartitionMonitor.setProcessingPartition(true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
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
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        java.lang.Throwable throwable0 = null;
        org.dataone.cn.batch.exceptions.ExecutionDisabledException executionDisabledException1 = new org.dataone.cn.batch.exceptions.ExecutionDisabledException(throwable0);
        java.lang.Class<?> wildcardClass2 = executionDisabledException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
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
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList4 = replicationDaoMetacatImpl0.getCompletedCoordinatingNodeReplicasByDate(date1, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        org.dataone.cn.log.AuditLogEntry auditLogEntry0 = new org.dataone.cn.log.AuditLogEntry();
        java.lang.String str1 = auditLogEntry0.getId();
        auditLogEntry0.setId("isMnAdministrator");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        org.dataone.cn.ldap.DirContextPooledObjectFactory dirContextPooledObjectFactory0 = new org.dataone.cn.ldap.DirContextPooledObjectFactory();
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject1 = null;
        dirContextPooledObjectFactory0.activateObject(dirContextPooledObject1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject3 = dirContextPooledObjectFactory0.makeObject();
            org.junit.Assert.fail("Expected exception of type javax.naming.CommunicationException; message: localhost:12389");
        } catch (javax.naming.CommunicationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.MetricEvent metricEvent1 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        org.dataone.service.types.v1.Identifier identifier3 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry5 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, nodeReference2, identifier3, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent6 = metricLogEntry5.getEvent();
        java.util.Date date7 = metricLogEntry5.getDateLogged();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList10 = replicationDaoMetacatImpl0.getCompletedCoordinatingNodeReplicasByDate(date7, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'COMPLETED'   AND member_node = 'cnDev'  ORDER BY date_verified ASC; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + metricEvent1 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent1.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent6 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent6.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Nov 20 02:38:01 CST 2023");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        int int0 = javax.servlet.http.HttpServletResponse.SC_MULTIPLE_CHOICES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 300 + "'", int0 == 300);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        org.dataone.cn.dao.ReplicationPolicyEntry replicationPolicyEntry0 = new org.dataone.cn.dao.ReplicationPolicyEntry();
        org.dataone.service.types.v1.Identifier identifier1 = replicationPolicyEntry0.getPid();
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        replicationPolicyEntry0.setMemberNode(nodeReference2);
        org.junit.Assert.assertNull(identifier1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        org.apache.commons.logging.Log log0 = org.dataone.cn.hazelcast.HazelcastClientFactory.logger;
        org.dataone.cn.ldap.DirContextProvider.log = log0;
        org.dataone.cn.servlet.http.ProxyServletRequestWrapper.logger = log0;
        org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        java.lang.String str0 = javax.servlet.http.HttpServletRequest.BASIC_AUTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "BASIC" + "'", str0, "BASIC");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println(0.0f);
        bufferedServletOutputStream0.print(false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener2 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "isCnAdministrator");
        com.hazelcast.core.MembershipEvent membershipEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            clusterPartitionMembershipListener2.handleMemberRemovedEvent(membershipEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        org.dataone.cn.dao.ReplicationPolicyEntry replicationPolicyEntry0 = new org.dataone.cn.dao.ReplicationPolicyEntry();
        replicationPolicyEntry0.setPolicy("BASIC");
        java.lang.String str3 = replicationPolicyEntry0.getPolicy();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "BASIC" + "'", str3, "BASIC");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        int int0 = javax.servlet.http.HttpServletResponse.SC_GATEWAY_TIMEOUT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 504 + "'", int0 == 504);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.MetricEvent metricEvent1 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        org.dataone.service.types.v1.Identifier identifier3 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry5 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, nodeReference2, identifier3, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent6 = metricLogEntry5.getEvent();
        java.util.Date date7 = metricLogEntry5.getDateLogged();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList10 = replicationDaoMetacatImpl0.getCompletedCoordinatingNodeReplicasByDate(date7, 504, 0);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'COMPLETED'   AND member_node = 'cnDev'  ORDER BY date_verified ASC; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + metricEvent1 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent1.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent6 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent6.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Nov 20 02:38:01 CST 2023");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        org.dataone.cn.ldap.DirContextProvider dirContextProvider0 = org.dataone.cn.ldap.DirContextProvider.getInstance();
        javax.naming.directory.DirContext dirContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            dirContextProvider0.returnDirContext(dirContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Returned object not currently part of this pool");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dirContextProvider0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        org.dataone.cn.log.AuditLogEntry auditLogEntry0 = new org.dataone.cn.log.AuditLogEntry();
        auditLogEntry0.setPid("replica not found");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = replicationDaoMetacatImpl0.getQueuedReplicaCountByNode("/etc/dataone/storage/hazelcast.xml");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        count(*)                               FROM  smreplicationstatus              WHERE member_node = ?                  AND status = 'QUEUED';              [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        org.dataone.cn.dao.SystemMetadataDao systemMetadataDao0 = org.dataone.cn.dao.DaoFactory.getSystemMetadataDao();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.cn.dao.SystemMetadataStatus> systemMetadataStatusList3 = systemMetadataDao0.listSystemMetadataStatus((int) (short) 0, 301);
            org.junit.Assert.fail("Expected exception of type org.dataone.cn.dao.exceptions.DataAccessException; message: org.springframework.jdbc.BadSqlGrammarException: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SYSTEMMETADATA\" not found; SQL statement:?SELECT guid, serial_version, date_modified, archived FROM systemmetadata ORDER BY guid; [42102-163]");
        } catch (org.dataone.cn.dao.exceptions.DataAccessException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemMetadataDao0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener2 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "isCnAdministrator");
        com.hazelcast.core.MembershipEvent membershipEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            clusterPartitionMembershipListener2.memberRemoved(membershipEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
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
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println(0.0f);
        bufferedServletOutputStream0.println(' ');
        bufferedServletOutputStream0.print((long) (byte) -1);
        bufferedServletOutputStream0.println((int) 'a');
        bufferedServletOutputStream0.setBufferSize(401);
        bufferedServletOutputStream0.println('#');
        bufferedServletOutputStream0.print(false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
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
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        int int0 = javax.servlet.http.HttpServletResponse.SC_CONFLICT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 409 + "'", int0 == 409);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        org.apache.commons.logging.Log log0 = org.dataone.cn.ldap.DirContextPooledObjectFactory.log;
        org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = replicationDaoMetacatImpl0.getRequestedReplicationCount(nodeReference1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
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
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        org.apache.commons.logging.Log log0 = org.dataone.cn.hazelcast.HazelcastClientInstance.logger;
        org.dataone.cn.ldap.DirContextProvider.log = log0;
        org.dataone.cn.ldap.DirContextPooledObjectFactory.log = log0;
        org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.MetricEvent metricEvent1 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        org.dataone.service.types.v1.Identifier identifier3 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry5 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, nodeReference2, identifier3, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent6 = metricLogEntry5.getEvent();
        java.util.Date date7 = metricLogEntry5.getDateLogged();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList10 = replicationDaoMetacatImpl0.getCompletedMemberNodeReplicasByDate(date7, (int) (short) 1, 101);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'COMPLETED'   AND member_node <> 'cnDev'  ORDER BY date_verified ASC  LIMIT 101 OFFSET 0; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + metricEvent1 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent1.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent6 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent6.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Nov 20 02:38:01 CST 2023");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        org.dataone.cn.batch.exceptions.ExecutionDisabledException executionDisabledException0 = new org.dataone.cn.batch.exceptions.ExecutionDisabledException();
        java.lang.Throwable[] throwableArray1 = executionDisabledException0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.MetricEvent metricEvent1 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        org.dataone.service.types.v1.Identifier identifier3 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry5 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, nodeReference2, identifier3, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent6 = metricLogEntry5.getEvent();
        java.util.Date date7 = metricLogEntry5.getDateLogged();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList10 = replicationDaoMetacatImpl0.getCompletedCoordinatingNodeReplicasByDate(date7, (int) (short) 0, 413);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'COMPLETED'   AND member_node = 'cnDev'  ORDER BY date_verified ASC; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + metricEvent1 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent1.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent6 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent6.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Nov 20 02:38:02 CST 2023");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = replicationDaoMetacatImpl0.getQueuedReplicaCountByNode("CLIENT_CERT");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        count(*)                               FROM  smreplicationstatus              WHERE member_node = ?                  AND status = 'QUEUED';              [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        int int0 = javax.servlet.http.HttpServletResponse.SC_REQUESTED_RANGE_NOT_SATISFIABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 416 + "'", int0 == 416);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        org.dataone.cn.ldap.DirContextPooledObjectFactory dirContextPooledObjectFactory0 = new org.dataone.cn.ldap.DirContextPooledObjectFactory();
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject1 = null;
        dirContextPooledObjectFactory0.activateObject(dirContextPooledObject1);
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dirContextPooledObjectFactory0.destroyObject(dirContextPooledObject3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        int int0 = javax.servlet.http.HttpServletResponse.SC_SEE_OTHER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 303 + "'", int0 == 303);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        org.dataone.cn.ldap.DirContextPooledObjectFactory dirContextPooledObjectFactory0 = new org.dataone.cn.ldap.DirContextPooledObjectFactory();
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject1 = null;
        dirContextPooledObjectFactory0.activateObject(dirContextPooledObject1);
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject3 = null;
        dirContextPooledObjectFactory0.passivateObject(dirContextPooledObject3);
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = dirContextPooledObjectFactory0.validateObject(dirContextPooledObject5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.AuditLogEntry auditLogEntry3 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date4 = null;
        auditLogEntry3.setDateLogged(date4);
        org.dataone.cn.log.AuditEvent auditEvent6 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str7 = auditEvent6.toString();
        auditLogEntry3.setEvent(auditEvent6);
        org.dataone.cn.log.AuditEvent auditEvent9 = auditLogEntry3.getEvent();
        org.dataone.cn.log.MetricEvent metricEvent10 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference11 = null;
        org.dataone.service.types.v1.Identifier identifier12 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry14 = new org.dataone.cn.log.MetricLogEntry(metricEvent10, nodeReference11, identifier12, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent15 = metricLogEntry14.getEvent();
        java.util.Date date16 = metricLogEntry14.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry18 = new org.dataone.cn.log.AuditLogEntry("Task-FORM-smreplicationpolicy", "processing", auditEvent9, date16, "/etc/dataone/storage/hazelcast.xml");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.cn.dao.ReplicationDao.ReplicaDto> replicaDtoList19 = replicationDaoMetacatImpl0.getRequestedReplicasByDate(date16);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        guid,                                  member_node,                           status,                                date_verified                          FROM  smreplicationstatus              WHERE date_verified <= ?               AND status = 'REQUESTED'               ORDER BY date_verified ASC;           [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + auditEvent6 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent6.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "replica not found" + "'", str7, "replica not found");
        org.junit.Assert.assertTrue("'" + auditEvent9 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent9.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertTrue("'" + metricEvent10 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent10.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent15 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent15.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Mon Nov 20 02:38:02 CST 2023");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        org.dataone.cn.log.AuditLogEntry auditLogEntry2 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date3 = null;
        auditLogEntry2.setDateLogged(date3);
        org.dataone.cn.log.AuditEvent auditEvent5 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str6 = auditEvent5.toString();
        auditLogEntry2.setEvent(auditEvent5);
        org.dataone.cn.log.AuditEvent auditEvent8 = auditLogEntry2.getEvent();
        org.dataone.cn.log.MetricEvent metricEvent9 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference10 = null;
        org.dataone.service.types.v1.Identifier identifier11 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry13 = new org.dataone.cn.log.MetricLogEntry(metricEvent9, nodeReference10, identifier11, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent14 = metricLogEntry13.getEvent();
        java.util.Date date15 = metricLogEntry13.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry17 = new org.dataone.cn.log.AuditLogEntry("Task-FORM-smreplicationpolicy", "processing", auditEvent8, date15, "/etc/dataone/storage/hazelcast.xml");
        java.lang.String str18 = auditLogEntry17.getLogText();
        auditLogEntry17.setLogText("DIGEST");
        org.junit.Assert.assertTrue("'" + auditEvent5 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent5.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "replica not found" + "'", str6, "replica not found");
        org.junit.Assert.assertTrue("'" + auditEvent8 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent8.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertTrue("'" + metricEvent9 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent9.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent14 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent14.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Mon Nov 20 02:38:02 CST 2023");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/etc/dataone/storage/hazelcast.xml" + "'", str18, "/etc/dataone/storage/hazelcast.xml");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener3 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "replication status", "/etc/dataone/portal/hazelcast.xml");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        int int0 = javax.servlet.http.HttpServletResponse.SC_USE_PROXY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 305 + "'", int0 == 305);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent5 = metricLogEntry4.getEvent();
        java.lang.Long long6 = metricLogEntry4.getTimeToCompleteEventMS();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent5 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent5.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener2 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "isCnAdministrator");
        com.hazelcast.core.MembershipEvent membershipEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            clusterPartitionMembershipListener2.handleMemberAddedEvent(membershipEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = replicationDaoMetacatImpl0.getQueuedReplicaCountByNode("systemmetadata");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        count(*)                               FROM  smreplicationstatus              WHERE member_node = ?                  AND status = 'QUEUED';              [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.dataone.cn.ldap.DirContextPooledObjectFactory dirContextPooledObjectFactory0 = new org.dataone.cn.ldap.DirContextPooledObjectFactory();
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject1 = null;
        // The following exception was thrown during execution in test generation
        try {
            dirContextPooledObjectFactory0.destroyObject(dirContextPooledObject1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        int int0 = javax.servlet.http.HttpServletResponse.SC_GONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 410 + "'", int0 == 410);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        boolean boolean0 = org.dataone.cn.hazelcast.membership.ClusterPartitionMonitor.getProcessingPartition();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        org.dataone.cn.dao.ReplicationPolicyEntry replicationPolicyEntry0 = new org.dataone.cn.dao.ReplicationPolicyEntry();
        org.dataone.service.types.v1.Identifier identifier1 = replicationPolicyEntry0.getPid();
        org.dataone.service.types.v1.NodeReference nodeReference2 = replicationPolicyEntry0.getMemberNode();
        org.dataone.service.types.v1.Identifier identifier3 = null;
        replicationPolicyEntry0.setPid(identifier3);
        org.dataone.service.types.v1.NodeReference nodeReference5 = null;
        replicationPolicyEntry0.setMemberNode(nodeReference5);
        org.junit.Assert.assertNull(identifier1);
        org.junit.Assert.assertNull(nodeReference2);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        org.apache.commons.logging.Log log0 = org.dataone.cn.ldap.LDAPService.log;
// flaky:         org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println(0.0f);
        bufferedServletOutputStream0.reset();
        bufferedServletOutputStream0.setBufferSize((int) (short) 0);
        bufferedServletOutputStream0.println((long) (short) 10);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        org.dataone.cn.log.MetricEvent metricEvent0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.log.MetricLogEntry metricLogEntry1 = new org.dataone.cn.log.MetricLogEntry(metricEvent0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetricEvent may not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.flush();
        bufferedServletOutputStream0.println((double) 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.dataone.cn.log.AuditLogEntry auditLogEntry0 = new org.dataone.cn.log.AuditLogEntry();
        java.lang.String str1 = auditLogEntry0.getId();
        java.lang.String str2 = auditLogEntry0.getLogText();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.AuditLogEntry auditLogEntry1 = new org.dataone.cn.log.AuditLogEntry();
        auditLogEntry1.setNodeId("org.dataone.cn.batch.exceptions.ExecutionDisabledException: hi!");
        org.dataone.cn.log.MetricEvent metricEvent4 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference5 = null;
        org.dataone.service.types.v1.Identifier identifier6 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry8 = new org.dataone.cn.log.MetricLogEntry(metricEvent4, nodeReference5, identifier6, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent9 = metricLogEntry8.getEvent();
        java.util.Date date10 = metricLogEntry8.getDateLogged();
        auditLogEntry1.setDateLogged(date10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList14 = replicationDaoMetacatImpl0.getCompletedCoordinatingNodeReplicasByDate(date10, 303, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'COMPLETED'   AND member_node = 'cnDev'  ORDER BY date_verified ASC; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + metricEvent4 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent4.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent9 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent9.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Nov 20 02:38:02 CST 2023");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        int int0 = javax.servlet.http.HttpServletResponse.SC_EXPECTATION_FAILED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 417 + "'", int0 == 417);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        int int0 = javax.servlet.http.HttpServletResponse.SC_REQUEST_URI_TOO_LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 414 + "'", int0 == 414);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        java.lang.String str1 = metricEvent0.toString();
        java.lang.String str2 = metricEvent0.toString();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "log aggregation harvest retrieved" + "'", str1, "log aggregation harvest retrieved");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "log aggregation harvest retrieved" + "'", str2, "log aggregation harvest retrieved");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        org.dataone.cn.dao.ReplicationPolicyEntry replicationPolicyEntry0 = new org.dataone.cn.dao.ReplicationPolicyEntry();
        org.dataone.service.types.v1.NodeReference nodeReference1 = replicationPolicyEntry0.getMemberNode();
        java.lang.String str2 = replicationPolicyEntry0.getPolicy();
        org.junit.Assert.assertNull(nodeReference1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2, "smreplicationpolicy");
        java.lang.String str5 = metricLogEntry4.toString();
        java.lang.Long long6 = metricLogEntry4.getTimeToCompleteEventMS();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{\"event\":\"log aggregation harvest retrieved\",\"message\":\"smreplicationpolicy\",\"threadName\":\"randoop.util.RunnerThread\",\"threadId\":3646,\"dateLogged\":\"2023-11-20T08:38:02.572+00:00\"}" + "'", str5, "{\"event\":\"log aggregation harvest retrieved\",\"message\":\"smreplicationpolicy\",\"threadName\":\"randoop.util.RunnerThread\",\"threadId\":3646,\"dateLogged\":\"2023-11-20T08:38:02.572+00:00\"}");
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        org.apache.commons.logging.Log log0 = org.dataone.cn.hazelcast.HazelcastClientFactory.logger;
        org.dataone.cn.ldap.DirContextProvider.log = log0;
        org.dataone.cn.ldap.LDAPService.log = log0;
        org.dataone.cn.ldap.DirContextPooledObjectFactory.log = log0;
        org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.AuditLogEntry auditLogEntry3 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date4 = null;
        auditLogEntry3.setDateLogged(date4);
        org.dataone.cn.log.AuditEvent auditEvent6 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str7 = auditEvent6.toString();
        auditLogEntry3.setEvent(auditEvent6);
        org.dataone.cn.log.AuditEvent auditEvent9 = auditLogEntry3.getEvent();
        org.dataone.cn.log.MetricEvent metricEvent10 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference11 = null;
        org.dataone.service.types.v1.Identifier identifier12 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry14 = new org.dataone.cn.log.MetricLogEntry(metricEvent10, nodeReference11, identifier12, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent15 = metricLogEntry14.getEvent();
        java.util.Date date16 = metricLogEntry14.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry18 = new org.dataone.cn.log.AuditLogEntry("Task-FORM-smreplicationpolicy", "processing", auditEvent9, date16, "/etc/dataone/storage/hazelcast.xml");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList21 = replicationDaoMetacatImpl0.getCompletedMemberNodeReplicasByDate(date16, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'COMPLETED'   AND member_node <> 'cnDev'  ORDER BY date_verified ASC ; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + auditEvent6 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent6.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "replica not found" + "'", str7, "replica not found");
        org.junit.Assert.assertTrue("'" + auditEvent9 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent9.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertTrue("'" + metricEvent10 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent10.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent15 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent15.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Mon Nov 20 02:38:02 CST 2023");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        org.apache.commons.dbcp.BasicDataSource basicDataSource0 = org.dataone.cn.dao.MetacatDataSourceFactory.getMetacatDataSource();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl1 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl((javax.sql.DataSource) basicDataSource0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.cn.dao.SystemMetadataStatus> systemMetadataStatusList4 = systemMetadataDaoMetacatImpl1.listSystemMetadataStatus(301, 503);
            org.junit.Assert.fail("Expected exception of type org.dataone.cn.dao.exceptions.DataAccessException; message: org.springframework.jdbc.BadSqlGrammarException: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SYSTEMMETADATA\" not found; SQL statement:?SELECT guid, serial_version, date_modified, archived FROM systemmetadata ORDER BY guid LIMIT 503 OFFSET 150900; [42102-163]");
        } catch (org.dataone.cn.dao.exceptions.DataAccessException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDataSource0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.hazelcast.ClientConfiguration clientConfiguration1 = new org.dataone.cn.hazelcast.ClientConfiguration("isCnAdministrator");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: isCnAdministrator (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        org.dataone.cn.log.AuditLogEntry auditLogEntry2 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date3 = null;
        auditLogEntry2.setDateLogged(date3);
        org.dataone.cn.log.AuditEvent auditEvent5 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str6 = auditEvent5.toString();
        auditLogEntry2.setEvent(auditEvent5);
        org.dataone.cn.log.AuditEvent auditEvent8 = auditLogEntry2.getEvent();
        org.dataone.cn.log.MetricEvent metricEvent9 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference10 = null;
        org.dataone.service.types.v1.Identifier identifier11 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry13 = new org.dataone.cn.log.MetricLogEntry(metricEvent9, nodeReference10, identifier11, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent14 = metricLogEntry13.getEvent();
        java.util.Date date15 = metricLogEntry13.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry17 = new org.dataone.cn.log.AuditLogEntry("Task-FORM-smreplicationpolicy", "processing", auditEvent8, date15, "/etc/dataone/storage/hazelcast.xml");
        org.dataone.cn.log.AuditEvent auditEvent18 = auditLogEntry17.getEvent();
        org.junit.Assert.assertTrue("'" + auditEvent5 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent5.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "replica not found" + "'", str6, "replica not found");
        org.junit.Assert.assertTrue("'" + auditEvent8 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent8.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertTrue("'" + metricEvent9 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent9.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent14 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent14.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Mon Nov 20 02:38:02 CST 2023");
        org.junit.Assert.assertTrue("'" + auditEvent18 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent18.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = replicationDaoMetacatImpl0.getQueuedReplicaCountByNode("org.dataone.cn.batch.exceptions.ExecutionDisabledException: hi!");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        count(*)                               FROM  smreplicationstatus              WHERE member_node = ?                  AND status = 'QUEUED';              [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        org.apache.commons.dbcp.BasicDataSource basicDataSource0 = org.dataone.cn.dao.MetacatDataSourceFactory.getMetacatDataSource();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl1 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl((javax.sql.DataSource) basicDataSource0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = systemMetadataDaoMetacatImpl1.getSystemMetadataCount();
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: StatementCallback; bad SQL grammar [SELECT count(guid) FROM systemmetadata]; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SYSTEMMETADATA\" not found; SQL statement:?SELECT count(guid) FROM systemmetadata [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDataSource0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        org.apache.commons.logging.Log log0 = org.dataone.cn.servlet.http.ProxyServletRequestWrapper.logger;
        org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.MetricEvent metricEvent1 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        org.dataone.service.types.v1.Identifier identifier3 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry5 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, nodeReference2, identifier3, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent6 = metricLogEntry5.getEvent();
        java.util.Date date7 = metricLogEntry5.getDateLogged();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList10 = replicationDaoMetacatImpl0.getCompletedMemberNodeReplicasByDate(date7, 406, (-1));
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'COMPLETED'   AND member_node <> 'cnDev'  ORDER BY date_verified ASC ; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + metricEvent1 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent1.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent6 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent6.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Nov 20 02:38:02 CST 2023");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.dataone.cn.dao.ReplicationDao.ReplicaDto> replicaDtoCollection2 = replicationDaoMetacatImpl0.getQueuedReplicasByNode("/etc/dataone/portal/hazelcast.xml");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        guid,                                  member_node,                           status,                                date_verified                          FROM  smreplicationstatus              WHERE member_node = ?               AND status = 'QUEUED'               ORDER BY date_verified ASC;           [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        org.dataone.cn.log.AuditLogEntry auditLogEntry2 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date3 = null;
        auditLogEntry2.setDateLogged(date3);
        org.dataone.cn.log.AuditEvent auditEvent5 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str6 = auditEvent5.toString();
        auditLogEntry2.setEvent(auditEvent5);
        org.dataone.cn.log.AuditEvent auditEvent8 = auditLogEntry2.getEvent();
        org.dataone.cn.log.MetricEvent metricEvent9 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference10 = null;
        org.dataone.service.types.v1.Identifier identifier11 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry13 = new org.dataone.cn.log.MetricLogEntry(metricEvent9, nodeReference10, identifier11, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent14 = metricLogEntry13.getEvent();
        java.util.Date date15 = metricLogEntry13.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry17 = new org.dataone.cn.log.AuditLogEntry("Task-FORM-smreplicationpolicy", "processing", auditEvent8, date15, "/etc/dataone/storage/hazelcast.xml");
        java.lang.String str18 = auditLogEntry17.getNodeId();
        org.junit.Assert.assertTrue("'" + auditEvent5 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent5.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "replica not found" + "'", str6, "replica not found");
        org.junit.Assert.assertTrue("'" + auditEvent8 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent8.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertTrue("'" + metricEvent9 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent9.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent14 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent14.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Mon Nov 20 02:38:02 CST 2023");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "processing" + "'", str18, "processing");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println(0.0f);
        bufferedServletOutputStream0.println(' ');
        bufferedServletOutputStream0.print((long) (byte) -1);
        bufferedServletOutputStream0.println((int) 'a');
        bufferedServletOutputStream0.setBufferSize(401);
        bufferedServletOutputStream0.println('4');
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        org.dataone.cn.servlet.http.ParameterKeys parameterKeys0 = new org.dataone.cn.servlet.http.ParameterKeys();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        org.dataone.cn.batch.exceptions.ExecutionDisabledException executionDisabledException1 = new org.dataone.cn.batch.exceptions.ExecutionDisabledException("hi!");
        org.dataone.cn.dao.exceptions.DataAccessException dataAccessException2 = new org.dataone.cn.dao.exceptions.DataAccessException((java.lang.Throwable) executionDisabledException1);
        org.dataone.cn.batch.exceptions.ExecutionDisabledException executionDisabledException3 = new org.dataone.cn.batch.exceptions.ExecutionDisabledException((java.lang.Throwable) dataAccessException2);
        org.dataone.cn.dao.exceptions.DataAccessException dataAccessException4 = new org.dataone.cn.dao.exceptions.DataAccessException((java.lang.Throwable) executionDisabledException3);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        org.dataone.cn.hazelcast.membership.ClusterPartitionMonitor.setStoragePartition(false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.AuditLogEntry auditLogEntry1 = new org.dataone.cn.log.AuditLogEntry();
        auditLogEntry1.setNodeId("org.dataone.cn.batch.exceptions.ExecutionDisabledException: hi!");
        org.dataone.cn.log.MetricEvent metricEvent4 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference5 = null;
        org.dataone.service.types.v1.Identifier identifier6 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry8 = new org.dataone.cn.log.MetricLogEntry(metricEvent4, nodeReference5, identifier6, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent9 = metricLogEntry8.getEvent();
        java.util.Date date10 = metricLogEntry8.getDateLogged();
        auditLogEntry1.setDateLogged(date10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList14 = replicationDaoMetacatImpl0.getCompletedMemberNodeReplicasByDate(date10, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'COMPLETED'   AND member_node <> 'cnDev'  ORDER BY date_verified ASC ; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + metricEvent4 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent4.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent9 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent9.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Nov 20 02:38:03 CST 2023");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
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
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println(0.0f);
        bufferedServletOutputStream0.println(' ');
        bufferedServletOutputStream0.print((long) (byte) -1);
        bufferedServletOutputStream0.println((int) 'a');
        bufferedServletOutputStream0.println((long) 305);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        org.dataone.cn.dao.SystemMetadataDao systemMetadataDao0 = org.dataone.cn.dao.DaoFactory.getSystemMetadataDao();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.cn.dao.SystemMetadataStatus> systemMetadataStatusList3 = systemMetadataDao0.listSystemMetadataStatus(300, 411);
            org.junit.Assert.fail("Expected exception of type org.dataone.cn.dao.exceptions.DataAccessException; message: org.springframework.jdbc.BadSqlGrammarException: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SYSTEMMETADATA\" not found; SQL statement:?SELECT guid, serial_version, date_modified, archived FROM systemmetadata ORDER BY guid LIMIT 411 OFFSET 122889; [42102-163]");
        } catch (org.dataone.cn.dao.exceptions.DataAccessException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemMetadataDao0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println(0.0f);
        bufferedServletOutputStream0.println(' ');
        bufferedServletOutputStream0.print((long) (byte) -1);
        bufferedServletOutputStream0.println((int) 'a');
        bufferedServletOutputStream0.print("authorizedSubjects");
        bufferedServletOutputStream0.print("session");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        org.dataone.cn.ldap.DirContextPooledObjectFactory dirContextPooledObjectFactory0 = new org.dataone.cn.ldap.DirContextPooledObjectFactory();
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject1 = null;
        dirContextPooledObjectFactory0.activateObject(dirContextPooledObject1);
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject3 = null;
        dirContextPooledObjectFactory0.passivateObject(dirContextPooledObject3);
        org.dataone.cn.ldap.DirContextPooledObjectFactory dirContextPooledObjectFactory5 = new org.dataone.cn.ldap.DirContextPooledObjectFactory();
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject6 = null;
        dirContextPooledObjectFactory5.activateObject(dirContextPooledObject6);
        javax.naming.directory.DirContext dirContext8 = null;
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject9 = dirContextPooledObjectFactory5.wrap(dirContext8);
        dirContextPooledObjectFactory0.activateObject(dirContextPooledObject9);
        javax.naming.directory.DirContext dirContext11 = null;
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject12 = dirContextPooledObjectFactory0.wrap(dirContext11);
        org.junit.Assert.assertNotNull(dirContextPooledObject9);
        org.junit.Assert.assertNotNull(dirContextPooledObject12);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        java.lang.String str0 = org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.IDENTIFIER_TABLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "identifier" + "'", str0, "identifier");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        org.dataone.cn.synchronization.types.SyncObject syncObject2 = new org.dataone.cn.synchronization.types.SyncObject("authorizedSubjects", "log aggregation harvest retrieved");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2, "smreplicationpolicy");
        java.lang.String str5 = metricEvent0.toString();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "log aggregation harvest retrieved" + "'", str5, "log aggregation harvest retrieved");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener2 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "isCnAdministrator");
        com.hazelcast.core.MembershipEvent membershipEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            clusterPartitionMembershipListener2.memberAdded(membershipEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
        dirContextPooledObjectFactory0.activateObject(dirContextPooledObject1);
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject3 = null;
        dirContextPooledObjectFactory0.passivateObject(dirContextPooledObject3);
        org.dataone.cn.ldap.DirContextPooledObjectFactory dirContextPooledObjectFactory5 = new org.dataone.cn.ldap.DirContextPooledObjectFactory();
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject6 = null;
        dirContextPooledObjectFactory5.activateObject(dirContextPooledObject6);
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject8 = null;
        dirContextPooledObjectFactory5.passivateObject(dirContextPooledObject8);
        org.dataone.cn.ldap.DirContextPooledObjectFactory dirContextPooledObjectFactory10 = new org.dataone.cn.ldap.DirContextPooledObjectFactory();
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject11 = null;
        dirContextPooledObjectFactory10.activateObject(dirContextPooledObject11);
        javax.naming.directory.DirContext dirContext13 = null;
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject14 = dirContextPooledObjectFactory10.wrap(dirContext13);
        dirContextPooledObjectFactory5.activateObject(dirContextPooledObject14);
        // The following exception was thrown during execution in test generation
        try {
            dirContextPooledObjectFactory0.destroyObject(dirContextPooledObject14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dirContextPooledObject14);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        org.dataone.cn.log.AuditLogQueryClientNullObjectImpl auditLogQueryClientNullObjectImpl0 = new org.dataone.cn.log.AuditLogQueryClientNullObjectImpl();
        org.dataone.cn.log.AuditLogClientSplunkImpl auditLogClientSplunkImpl1 = new org.dataone.cn.log.AuditLogClientSplunkImpl();
        org.dataone.cn.log.AuditLogEntry auditLogEntry2 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date3 = null;
        auditLogEntry2.setDateLogged(date3);
        java.lang.String str5 = auditLogEntry2.getNodeId();
        java.lang.String str8 = auditLogClientSplunkImpl1.queryLog(auditLogEntry2, (java.lang.Integer) 300, (java.lang.Integer) 301);
        java.lang.String str11 = auditLogQueryClientNullObjectImpl0.queryLog(auditLogEntry2, (java.lang.Integer) 415, (java.lang.Integer) (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.lang.String str0 = org.dataone.cn.hazelcast.HazelcastConfigLocationFactory.getProcessingConfigLocation();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/etc/dataone/process/hazelcast.xml" + "'", str0, "/etc/dataone/process/hazelcast.xml");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.AuditLogEntry auditLogEntry1 = new org.dataone.cn.log.AuditLogEntry();
        auditLogEntry1.setNodeId("org.dataone.cn.batch.exceptions.ExecutionDisabledException: hi!");
        org.dataone.cn.log.MetricEvent metricEvent4 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference5 = null;
        org.dataone.service.types.v1.Identifier identifier6 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry8 = new org.dataone.cn.log.MetricLogEntry(metricEvent4, nodeReference5, identifier6, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent9 = metricLogEntry8.getEvent();
        java.util.Date date10 = metricLogEntry8.getDateLogged();
        auditLogEntry1.setDateLogged(date10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList14 = replicationDaoMetacatImpl0.getCompletedCoordinatingNodeReplicasByDate(date10, (int) (short) -1, 206);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'COMPLETED'   AND member_node = 'cnDev'  ORDER BY date_verified ASC; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + metricEvent4 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent4.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent9 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent9.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Nov 20 02:38:03 CST 2023");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        org.dataone.cn.synchronization.types.SyncObject syncObject2 = new org.dataone.cn.synchronization.types.SyncObject("FORM", "smreplicationpolicy");
        syncObject2.setSleepUntil((long) 400);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.MetricLogClient metricLogClient1 = org.dataone.cn.log.MetricLogClientFactory.getMetricLogClient();
        org.dataone.cn.log.MetricEvent metricEvent2 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference3 = null;
        org.dataone.service.types.v1.Identifier identifier4 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry6 = new org.dataone.cn.log.MetricLogEntry(metricEvent2, nodeReference3, identifier4, "smreplicationpolicy");
        boolean boolean7 = metricLogClient1.logMetricEvent(metricLogEntry6);
        org.dataone.cn.log.MetricEvent metricEvent8 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference9 = null;
        org.dataone.service.types.v1.Identifier identifier10 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry12 = new org.dataone.cn.log.MetricLogEntry(metricEvent8, nodeReference9, identifier10, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent13 = metricLogEntry12.getEvent();
        java.util.Date date14 = metricLogEntry12.getDateLogged();
        metricLogEntry6.setDateLogged(date14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.cn.dao.ReplicationDao.ReplicaDto> replicaDtoList16 = replicationDaoMetacatImpl0.getRequestedReplicasByDate(date14);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        guid,                                  member_node,                           status,                                date_verified                          FROM  smreplicationstatus              WHERE date_verified <= ?               AND status = 'REQUESTED'               ORDER BY date_verified ASC;           [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricLogClient1);
        org.junit.Assert.assertTrue("'" + metricEvent2 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent2.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + metricEvent8 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent8.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent13 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent13.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Mon Nov 20 02:38:03 CST 2023");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.AuditLogEntry auditLogEntry1 = new org.dataone.cn.log.AuditLogEntry();
        auditLogEntry1.setNodeId("org.dataone.cn.batch.exceptions.ExecutionDisabledException: hi!");
        org.dataone.cn.log.MetricEvent metricEvent4 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference5 = null;
        org.dataone.service.types.v1.Identifier identifier6 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry8 = new org.dataone.cn.log.MetricLogEntry(metricEvent4, nodeReference5, identifier6, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent9 = metricLogEntry8.getEvent();
        java.util.Date date10 = metricLogEntry8.getDateLogged();
        auditLogEntry1.setDateLogged(date10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList14 = replicationDaoMetacatImpl0.getCompletedCoordinatingNodeReplicasByDate(date10, 503, 415);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'COMPLETED'   AND member_node = 'cnDev'  ORDER BY date_verified ASC LIMIT 415 OFFSET 208330; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + metricEvent4 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent4.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent9 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent9.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Nov 20 02:38:03 CST 2023");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        bufferedServletOutputStream0.write(byteArray2);
        bufferedServletOutputStream0.print(0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        bufferedServletOutputStream0.write(byteArray2);
        bufferedServletOutputStream0.print(' ');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.MetricEvent metricEvent1 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        org.dataone.service.types.v1.Identifier identifier3 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry5 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, nodeReference2, identifier3, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent6 = metricLogEntry5.getEvent();
        java.util.Date date7 = metricLogEntry5.getDateLogged();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList10 = replicationDaoMetacatImpl0.getInvalidMemberNodeReplicasByDate(date7, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'INVALIDATED'   AND member_node <> 'cnDev'  ORDER BY date_verified ASC ; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + metricEvent1 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent1.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent6 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent6.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Nov 20 02:38:03 CST 2023");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        org.apache.commons.dbcp.BasicDataSource basicDataSource0 = org.dataone.cn.dao.MetacatDataSourceFactory.getMetacatDataSource();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl1 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl((javax.sql.DataSource) basicDataSource0);
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SystemMetadataStatusMapper systemMetadataStatusMapper2 = systemMetadataDaoMetacatImpl1.new SystemMetadataStatusMapper();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = systemMetadataDaoMetacatImpl1.getSystemMetadataCount(strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDataSource0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        int int0 = javax.servlet.http.HttpServletResponse.SC_CONTINUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        org.apache.commons.dbcp.BasicDataSource basicDataSource0 = org.dataone.cn.dao.MetacatDataSourceFactory.getMetacatDataSource();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl1 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl((javax.sql.DataSource) basicDataSource0);
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SystemMetadataStatusMapper systemMetadataStatusMapper2 = systemMetadataDaoMetacatImpl1.new SystemMetadataStatusMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SystemMetadataStatusMapper systemMetadataStatusMapper3 = systemMetadataDaoMetacatImpl1.new SystemMetadataStatusMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.cn.dao.SystemMetadataStatus> systemMetadataStatusList6 = systemMetadataDaoMetacatImpl1.listSystemMetadataStatus((int) (short) 1, 201);
            org.junit.Assert.fail("Expected exception of type org.dataone.cn.dao.exceptions.DataAccessException; message: org.springframework.jdbc.BadSqlGrammarException: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SYSTEMMETADATA\" not found; SQL statement:?SELECT guid, serial_version, date_modified, archived FROM systemmetadata ORDER BY guid LIMIT 201 OFFSET 0; [42102-163]");
        } catch (org.dataone.cn.dao.exceptions.DataAccessException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDataSource0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        org.apache.commons.dbcp.BasicDataSource basicDataSource0 = org.dataone.cn.dao.MetacatDataSourceFactory.getMetacatDataSource();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl1 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl((javax.sql.DataSource) basicDataSource0);
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SystemMetadataStatusMapper systemMetadataStatusMapper2 = systemMetadataDaoMetacatImpl1.new SystemMetadataStatusMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SystemMetadataStatusMapper systemMetadataStatusMapper3 = systemMetadataDaoMetacatImpl1.new SystemMetadataStatusMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicationPolicyEntryMapper replicationPolicyEntryMapper4 = systemMetadataDaoMetacatImpl1.new ReplicationPolicyEntryMapper();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = systemMetadataDaoMetacatImpl1.getSystemMetadataCount();
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: StatementCallback; bad SQL grammar [SELECT count(guid) FROM systemmetadata]; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SYSTEMMETADATA\" not found; SQL statement:?SELECT count(guid) FROM systemmetadata [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDataSource0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        org.dataone.cn.dao.ReplicationPolicyEntry replicationPolicyEntry0 = new org.dataone.cn.dao.ReplicationPolicyEntry();
        replicationPolicyEntry0.setPolicy("BASIC");
        org.dataone.service.types.v1.NodeReference nodeReference3 = replicationPolicyEntry0.getMemberNode();
        org.dataone.service.types.v1.NodeReference nodeReference4 = null;
        replicationPolicyEntry0.setMemberNode(nodeReference4);
        org.junit.Assert.assertNull(nodeReference3);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        org.dataone.cn.log.AuditLogClient auditLogClient0 = org.dataone.cn.log.AuditLogClientFactory.getAuditLogClient();
        org.dataone.cn.log.AuditLogClientSplunkImpl auditLogClientSplunkImpl1 = new org.dataone.cn.log.AuditLogClientSplunkImpl();
        org.dataone.cn.log.AuditLogEntry auditLogEntry4 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date5 = null;
        auditLogEntry4.setDateLogged(date5);
        org.dataone.cn.log.AuditEvent auditEvent7 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str8 = auditEvent7.toString();
        auditLogEntry4.setEvent(auditEvent7);
        org.dataone.cn.log.AuditEvent auditEvent10 = auditLogEntry4.getEvent();
        org.dataone.cn.log.MetricEvent metricEvent11 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference12 = null;
        org.dataone.service.types.v1.Identifier identifier13 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry15 = new org.dataone.cn.log.MetricLogEntry(metricEvent11, nodeReference12, identifier13, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent16 = metricLogEntry15.getEvent();
        java.util.Date date17 = metricLogEntry15.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry19 = new org.dataone.cn.log.AuditLogEntry("Task-FORM-smreplicationpolicy", "processing", auditEvent10, date17, "/etc/dataone/storage/hazelcast.xml");
        java.lang.String str22 = auditLogClientSplunkImpl1.queryLog(auditLogEntry19, (java.lang.Integer) 504, (java.lang.Integer) 300);
        boolean boolean23 = auditLogClient0.removeReplicaAuditEvent(auditLogEntry19);
        org.junit.Assert.assertNotNull(auditLogClient0);
        org.junit.Assert.assertTrue("'" + auditEvent7 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent7.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "replica not found" + "'", str8, "replica not found");
        org.junit.Assert.assertTrue("'" + auditEvent10 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent10.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertTrue("'" + metricEvent11 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent11.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent16 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent16.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Mon Nov 20 02:38:03 CST 2023");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry3 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2);
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent5 = metricLogEntry4.getEvent();
        java.util.Date date6 = metricLogEntry4.getDateLogged();
        metricLogEntry4.setTimeToCompleteEventMS((java.lang.Long) 100L);
        java.util.Date date9 = metricLogEntry4.getDateLogged();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent5 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent5.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Nov 20 02:38:03 CST 2023");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Nov 20 02:38:03 CST 2023");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        org.apache.commons.dbcp.BasicDataSource basicDataSource0 = org.dataone.cn.dao.MetacatDataSourceFactory.getMetacatDataSource();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl1 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl((javax.sql.DataSource) basicDataSource0);
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SystemMetadataStatusMapper systemMetadataStatusMapper2 = systemMetadataDaoMetacatImpl1.new SystemMetadataStatusMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SystemMetadataStatusMapper systemMetadataStatusMapper3 = systemMetadataDaoMetacatImpl1.new SystemMetadataStatusMapper();
        java.sql.ResultSet resultSet4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.dao.SystemMetadataStatus systemMetadataStatus6 = systemMetadataStatusMapper3.mapRow(resultSet4, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDataSource0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        org.dataone.cn.log.AuditLogClient auditLogClient0 = org.dataone.cn.log.AuditLogClientFactory.getAuditLogClient();
        org.dataone.cn.log.AuditLogEntry auditLogEntry3 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date4 = null;
        auditLogEntry3.setDateLogged(date4);
        org.dataone.cn.log.AuditEvent auditEvent6 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str7 = auditEvent6.toString();
        auditLogEntry3.setEvent(auditEvent6);
        org.dataone.cn.log.AuditEvent auditEvent9 = auditLogEntry3.getEvent();
        org.dataone.cn.log.MetricEvent metricEvent10 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference11 = null;
        org.dataone.service.types.v1.Identifier identifier12 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry14 = new org.dataone.cn.log.MetricLogEntry(metricEvent10, nodeReference11, identifier12, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent15 = metricLogEntry14.getEvent();
        java.util.Date date16 = metricLogEntry14.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry18 = new org.dataone.cn.log.AuditLogEntry("Task-FORM-smreplicationpolicy", "processing", auditEvent9, date16, "/etc/dataone/storage/hazelcast.xml");
        java.lang.String str19 = auditLogEntry18.getLogText();
        java.lang.String str22 = auditLogClient0.queryLog(auditLogEntry18, (java.lang.Integer) 202, (java.lang.Integer) 0);
        org.dataone.cn.log.AuditLogEntry auditLogEntry23 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date24 = null;
        auditLogEntry23.setDateLogged(date24);
        org.dataone.cn.log.AuditEvent auditEvent26 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str27 = auditEvent26.toString();
        auditLogEntry23.setEvent(auditEvent26);
        auditLogEntry23.setNodeId("processing");
        java.lang.String str33 = auditLogClient0.queryLog(auditLogEntry23, (java.lang.Integer) 101, (java.lang.Integer) 300);
        org.junit.Assert.assertNotNull(auditLogClient0);
        org.junit.Assert.assertTrue("'" + auditEvent6 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent6.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "replica not found" + "'", str7, "replica not found");
        org.junit.Assert.assertTrue("'" + auditEvent9 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent9.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertTrue("'" + metricEvent10 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent10.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent15 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent15.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Mon Nov 20 02:38:03 CST 2023");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/etc/dataone/storage/hazelcast.xml" + "'", str19, "/etc/dataone/storage/hazelcast.xml");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + auditEvent26 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent26.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "replica not found" + "'", str27, "replica not found");
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent5 = metricLogEntry4.getEvent();
        org.dataone.cn.log.MetricEvent metricEvent6 = org.dataone.cn.log.MetricEvent.REPLICA_STATUS;
        java.lang.String str7 = metricEvent6.toString();
        org.dataone.service.types.v1.NodeReference nodeReference8 = null;
        org.dataone.service.types.v1.Identifier identifier9 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry11 = new org.dataone.cn.log.MetricLogEntry(metricEvent6, nodeReference8, identifier9, "DIGEST");
        metricLogEntry4.setEvent(metricEvent6);
        org.dataone.service.types.v1.NodeReference nodeReference13 = null;
        org.dataone.service.types.v1.Identifier identifier14 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry17 = new org.dataone.cn.log.MetricLogEntry(metricEvent6, nodeReference13, identifier14, "smreplicationstatus", (java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent5 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent5.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent6 + "' != '" + org.dataone.cn.log.MetricEvent.REPLICA_STATUS + "'", metricEvent6.equals(org.dataone.cn.log.MetricEvent.REPLICA_STATUS));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "replication status" + "'", str7, "replication status");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        org.dataone.cn.ldap.DirContextPooledObjectFactory dirContextPooledObjectFactory0 = new org.dataone.cn.ldap.DirContextPooledObjectFactory();
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject1 = null;
        dirContextPooledObjectFactory0.activateObject(dirContextPooledObject1);
        javax.naming.directory.DirContext dirContext3 = null;
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject4 = dirContextPooledObjectFactory0.wrap(dirContext3);
        org.dataone.cn.ldap.DirContextPooledObjectFactory dirContextPooledObjectFactory5 = new org.dataone.cn.ldap.DirContextPooledObjectFactory();
        org.dataone.cn.ldap.DirContextPooledObjectFactory dirContextPooledObjectFactory6 = new org.dataone.cn.ldap.DirContextPooledObjectFactory();
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject7 = null;
        dirContextPooledObjectFactory6.activateObject(dirContextPooledObject7);
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject9 = null;
        dirContextPooledObjectFactory6.passivateObject(dirContextPooledObject9);
        org.dataone.cn.ldap.DirContextPooledObjectFactory dirContextPooledObjectFactory11 = new org.dataone.cn.ldap.DirContextPooledObjectFactory();
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject12 = null;
        dirContextPooledObjectFactory11.activateObject(dirContextPooledObject12);
        javax.naming.directory.DirContext dirContext14 = null;
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject15 = dirContextPooledObjectFactory11.wrap(dirContext14);
        dirContextPooledObjectFactory6.activateObject(dirContextPooledObject15);
        dirContextPooledObjectFactory5.activateObject(dirContextPooledObject15);
        // The following exception was thrown during execution in test generation
        try {
            dirContextPooledObjectFactory0.destroyObject(dirContextPooledObject15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dirContextPooledObject4);
        org.junit.Assert.assertNotNull(dirContextPooledObject15);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
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
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        org.apache.commons.dbcp.BasicDataSource basicDataSource0 = org.dataone.cn.dao.MetacatDataSourceFactory.getMetacatDataSource();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl1 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl((javax.sql.DataSource) basicDataSource0);
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SystemMetadataStatusMapper systemMetadataStatusMapper2 = systemMetadataDaoMetacatImpl1.new SystemMetadataStatusMapper();
        java.sql.ResultSet resultSet3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.dao.SystemMetadataStatus systemMetadataStatus5 = systemMetadataStatusMapper2.mapRow(resultSet3, 411);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDataSource0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        org.dataone.cn.hazelcast.membership.ClusterPartitionMonitor.setSessionPartition(true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        int int0 = javax.servlet.http.HttpServletResponse.SC_TEMPORARY_REDIRECT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 307 + "'", int0 == 307);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        org.apache.commons.dbcp.BasicDataSource basicDataSource0 = org.dataone.cn.dao.MetacatDataSourceFactory.getMetacatDataSource();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl1 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl((javax.sql.DataSource) basicDataSource0);
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SystemMetadataStatusMapper systemMetadataStatusMapper2 = systemMetadataDaoMetacatImpl1.new SystemMetadataStatusMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SystemMetadataStatusMapper systemMetadataStatusMapper3 = systemMetadataDaoMetacatImpl1.new SystemMetadataStatusMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicationPolicyEntryMapper replicationPolicyEntryMapper4 = systemMetadataDaoMetacatImpl1.new ReplicationPolicyEntryMapper();
        org.dataone.service.types.v1.Permission permission5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = systemMetadataDaoMetacatImpl1.convertPermission(permission5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDataSource0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println(0.0f);
        bufferedServletOutputStream0.println();
        bufferedServletOutputStream0.println((double) (byte) -1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        org.dataone.cn.dao.SystemMetadataStatus systemMetadataStatus0 = new org.dataone.cn.dao.SystemMetadataStatus();
        java.util.Date date1 = systemMetadataStatus0.getLastSystemMetadataModificationDate();
        java.util.Date date2 = systemMetadataStatus0.getLastSystemMetadataModificationDate();
        systemMetadataStatus0.setDeleted((java.lang.Boolean) true);
        java.util.Date date5 = systemMetadataStatus0.getLastSystemMetadataModificationDate();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        org.dataone.cn.batch.exceptions.ExecutionDisabledException executionDisabledException1 = new org.dataone.cn.batch.exceptions.ExecutionDisabledException("authorizedSubjects");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println(0.0f);
        bufferedServletOutputStream0.print((float) 202);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println(false);
        bufferedServletOutputStream0.println((int) (byte) 100);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.reset();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean0 = org.dataone.cn.ComponentActivationUtility.replicationIsActive();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'Replication.active' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        org.dataone.cn.log.AuditLogEntry auditLogEntry2 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date3 = null;
        auditLogEntry2.setDateLogged(date3);
        org.dataone.cn.log.AuditEvent auditEvent5 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str6 = auditEvent5.toString();
        auditLogEntry2.setEvent(auditEvent5);
        org.dataone.cn.log.AuditEvent auditEvent8 = auditLogEntry2.getEvent();
        org.dataone.cn.log.AuditLogEntry auditLogEntry10 = new org.dataone.cn.log.AuditLogEntry("isMnAdministrator", "systemmetadata", auditEvent8, "processing");
        java.lang.String str11 = auditLogEntry10.getLogText();
        org.junit.Assert.assertTrue("'" + auditEvent5 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent5.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "replica not found" + "'", str6, "replica not found");
        org.junit.Assert.assertTrue("'" + auditEvent8 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent8.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "processing" + "'", str11, "processing");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        org.apache.commons.dbcp.BasicDataSource basicDataSource0 = org.dataone.cn.dao.MetacatDataSourceFactory.getMetacatDataSource();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl1 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl((javax.sql.DataSource) basicDataSource0);
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SystemMetadataStatusMapper systemMetadataStatusMapper2 = systemMetadataDaoMetacatImpl1.new SystemMetadataStatusMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SystemMetadataStatusMapper systemMetadataStatusMapper3 = systemMetadataDaoMetacatImpl1.new SystemMetadataStatusMapper();
        org.dataone.service.types.v1.Identifier identifier4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.service.types.v2.SystemMetadata systemMetadata5 = systemMetadataDaoMetacatImpl1.getSystemMetadata(identifier4);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SYSTEMMETADATA\" not found; SQL statement:?SELECT guid, series_id, date_uploaded, rights_holder, checksum, checksum_algorithm, origin_member_node, authoritive_member_node, date_modified, submitter, object_format, size, replication_allowed, number_replicas, obsoletes, obsoleted_by, serial_version, archived FROM systemmetadata WHERE guid = ?; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDataSource0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        org.apache.commons.dbcp.BasicDataSource basicDataSource0 = org.dataone.cn.dao.MetacatDataSourceFactory.getMetacatDataSource();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl1 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl((javax.sql.DataSource) basicDataSource0);
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.AccessRuleMapper accessRuleMapper2 = systemMetadataDaoMetacatImpl1.new AccessRuleMapper();
        org.dataone.service.types.v1.Identifier identifier3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.service.types.v2.SystemMetadata systemMetadata4 = systemMetadataDaoMetacatImpl1.getSystemMetadata(identifier3);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SYSTEMMETADATA\" not found; SQL statement:?SELECT guid, series_id, date_uploaded, rights_holder, checksum, checksum_algorithm, origin_member_node, authoritive_member_node, date_modified, submitter, object_format, size, replication_allowed, number_replicas, obsoletes, obsoleted_by, serial_version, archived FROM systemmetadata WHERE guid = ?; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDataSource0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        org.dataone.cn.synchronization.types.SyncObject syncObject2 = new org.dataone.cn.synchronization.types.SyncObject("FORM", "smreplicationpolicy");
        java.lang.String str3 = syncObject2.getNodeId();
        java.lang.String str4 = syncObject2.getPid();
        boolean boolean6 = syncObject2.equals((java.lang.Object) 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FORM" + "'", str3, "FORM");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "smreplicationpolicy" + "'", str4, "smreplicationpolicy");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2, "smreplicationpolicy");
        org.dataone.service.types.v1.NodeReference nodeReference5 = null;
        org.dataone.service.types.v1.Identifier identifier6 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry8 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference5, identifier6, "{\"event\":\"log aggregation harvest retrieved\",\"message\":\"smreplicationpolicy\",\"threadName\":\"randoop.util.RunnerThread\",\"threadId\":3511,\"dateLogged\":\"2023-11-20T08:38:02.514+00:00\"}");
        org.dataone.cn.log.AuditLogEntry auditLogEntry11 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date12 = null;
        auditLogEntry11.setDateLogged(date12);
        org.dataone.cn.log.AuditEvent auditEvent14 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str15 = auditEvent14.toString();
        auditLogEntry11.setEvent(auditEvent14);
        org.dataone.cn.log.AuditEvent auditEvent17 = auditLogEntry11.getEvent();
        org.dataone.cn.log.MetricEvent metricEvent18 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference19 = null;
        org.dataone.service.types.v1.Identifier identifier20 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry22 = new org.dataone.cn.log.MetricLogEntry(metricEvent18, nodeReference19, identifier20, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent23 = metricLogEntry22.getEvent();
        java.util.Date date24 = metricLogEntry22.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry26 = new org.dataone.cn.log.AuditLogEntry("Task-FORM-smreplicationpolicy", "processing", auditEvent17, date24, "/etc/dataone/storage/hazelcast.xml");
        metricLogEntry8.setDateLogged(date24);
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + auditEvent14 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent14.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "replica not found" + "'", str15, "replica not found");
        org.junit.Assert.assertTrue("'" + auditEvent17 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent17.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertTrue("'" + metricEvent18 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent18.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent23 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent23.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Mon Nov 20 02:38:03 CST 2023");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        org.dataone.cn.log.AuditLogClientSolrImpl auditLogClientSolrImpl0 = new org.dataone.cn.log.AuditLogClientSolrImpl();
        org.dataone.cn.log.AuditLogEntry auditLogEntry1 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date2 = null;
        auditLogEntry1.setDateLogged(date2);
        org.dataone.cn.log.AuditEvent auditEvent4 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str5 = auditEvent4.toString();
        auditLogEntry1.setEvent(auditEvent4);
        auditLogEntry1.setLogText("");
        boolean boolean9 = auditLogClientSolrImpl0.removeReplicaAuditEvent(auditLogEntry1);
        org.junit.Assert.assertTrue("'" + auditEvent4 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent4.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "replica not found" + "'", str5, "replica not found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_RETRIEVED;
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_RETRIEVED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_RETRIEVED));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        org.dataone.cn.log.AuditLogEntry auditLogEntry0 = new org.dataone.cn.log.AuditLogEntry();
        auditLogEntry0.setLogText("smreplicationstatus");
        auditLogEntry0.setLogText("org.dataone.cn.batch.exceptions.ExecutionDisabledException: hi!");
        java.lang.String str5 = auditLogEntry0.getPid();
        java.lang.String str6 = auditLogEntry0.getLogText();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.dataone.cn.batch.exceptions.ExecutionDisabledException: hi!" + "'", str6, "org.dataone.cn.batch.exceptions.ExecutionDisabledException: hi!");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_QUEUED;
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_QUEUED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_QUEUED));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2, "smreplicationpolicy");
        org.dataone.service.types.v1.NodeReference nodeReference5 = null;
        org.dataone.service.types.v1.Identifier identifier6 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry8 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference5, identifier6, "{\"event\":\"log aggregation harvest retrieved\",\"message\":\"smreplicationpolicy\",\"threadName\":\"randoop.util.RunnerThread\",\"threadId\":3511,\"dateLogged\":\"2023-11-20T08:38:02.514+00:00\"}");
        org.dataone.service.types.v1.Identifier identifier9 = metricLogEntry8.getPid();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNull(identifier9);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener2 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "isCnAdministrator");
        clusterPartitionMembershipListener2.setExpectedIPList("Task-FORM-smreplicationpolicy");
        com.hazelcast.core.MembershipEvent membershipEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            clusterPartitionMembershipListener2.memberRemoved(membershipEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        org.dataone.cn.log.AuditLogWriteClientSplunkImpl auditLogWriteClientSplunkImpl0 = new org.dataone.cn.log.AuditLogWriteClientSplunkImpl();
        org.dataone.cn.log.AuditLogEntry auditLogEntry1 = new org.dataone.cn.log.AuditLogEntry();
        auditLogEntry1.setLogText("smreplicationstatus");
        auditLogEntry1.setLogText("org.dataone.cn.batch.exceptions.ExecutionDisabledException: hi!");
        boolean boolean6 = auditLogWriteClientSplunkImpl0.removeReplicaAuditEvent(auditLogEntry1);
        org.dataone.cn.log.AuditLogClientSplunkImpl auditLogClientSplunkImpl7 = new org.dataone.cn.log.AuditLogClientSplunkImpl();
        org.dataone.cn.log.AuditLogEntry auditLogEntry8 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date9 = null;
        auditLogEntry8.setDateLogged(date9);
        java.lang.String str11 = auditLogEntry8.getNodeId();
        java.lang.String str14 = auditLogClientSplunkImpl7.queryLog(auditLogEntry8, (java.lang.Integer) 300, (java.lang.Integer) 301);
        boolean boolean15 = auditLogWriteClientSplunkImpl0.removeReplicaAuditEvent(auditLogEntry8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println(0.0f);
        bufferedServletOutputStream0.println(' ');
        bufferedServletOutputStream0.print((long) (byte) -1);
        bufferedServletOutputStream0.reset();
        bufferedServletOutputStream0.close();
        bufferedServletOutputStream0.println((long) 300);
        bufferedServletOutputStream0.print('a');
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        org.apache.commons.dbcp.BasicDataSource basicDataSource0 = org.dataone.cn.dao.MetacatDataSourceFactory.getMetacatDataSource();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl1 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl((javax.sql.DataSource) basicDataSource0);
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SystemMetadataStatusMapper systemMetadataStatusMapper2 = systemMetadataDaoMetacatImpl1.new SystemMetadataStatusMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SystemMetadataStatusMapper systemMetadataStatusMapper3 = systemMetadataDaoMetacatImpl1.new SystemMetadataStatusMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicationPolicyEntryMapper replicationPolicyEntryMapper4 = systemMetadataDaoMetacatImpl1.new ReplicationPolicyEntryMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.cn.dao.SystemMetadataStatus> systemMetadataStatusList7 = systemMetadataDaoMetacatImpl1.listSystemMetadataStatus((int) '4', 202);
            org.junit.Assert.fail("Expected exception of type org.dataone.cn.dao.exceptions.DataAccessException; message: org.springframework.jdbc.BadSqlGrammarException: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SYSTEMMETADATA\" not found; SQL statement:?SELECT guid, serial_version, date_modified, archived FROM systemmetadata ORDER BY guid LIMIT 202 OFFSET 10302; [42102-163]");
        } catch (org.dataone.cn.dao.exceptions.DataAccessException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDataSource0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        org.dataone.cn.dao.SystemMetadataStatus systemMetadataStatus0 = new org.dataone.cn.dao.SystemMetadataStatus();
        org.dataone.service.types.v1.Identifier identifier1 = systemMetadataStatus0.getPid();
        org.junit.Assert.assertNull(identifier1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.hazelcast.config.Config config0 = null;
        org.dataone.cn.hazelcast.ClientConfiguration clientConfiguration1 = new org.dataone.cn.hazelcast.ClientConfiguration(config0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = clientConfiguration1.getGroup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println(0.0f);
        bufferedServletOutputStream0.println(' ');
        bufferedServletOutputStream0.print((long) (byte) -1);
        bufferedServletOutputStream0.println((int) 'a');
        bufferedServletOutputStream0.setBufferSize(401);
        bufferedServletOutputStream0.println('#');
        bufferedServletOutputStream0.close();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        org.dataone.cn.dao.ReplicationPolicyEntry replicationPolicyEntry0 = new org.dataone.cn.dao.ReplicationPolicyEntry();
        org.dataone.service.types.v1.Identifier identifier1 = replicationPolicyEntry0.getPid();
        replicationPolicyEntry0.setPolicy("isMnAdministrator");
        org.dataone.service.types.v1.NodeReference nodeReference4 = replicationPolicyEntry0.getMemberNode();
        org.junit.Assert.assertNull(identifier1);
        org.junit.Assert.assertNull(nodeReference4);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        org.apache.commons.dbcp.BasicDataSource basicDataSource0 = org.dataone.cn.dao.MetacatDataSourceFactory.getMetacatDataSource();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl1 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl((javax.sql.DataSource) basicDataSource0);
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.AccessRuleMapper accessRuleMapper2 = systemMetadataDaoMetacatImpl1.new AccessRuleMapper();
        java.sql.ResultSet resultSet3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.service.types.v1.AccessRule accessRule5 = accessRuleMapper2.mapRow(resultSet3, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDataSource0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        org.dataone.cn.dao.SystemMetadataStatus systemMetadataStatus0 = new org.dataone.cn.dao.SystemMetadataStatus();
        java.lang.Boolean boolean1 = systemMetadataStatus0.getDeleted();
        java.lang.Boolean boolean2 = systemMetadataStatus0.getDeleted();
        org.junit.Assert.assertNull(boolean1);
        org.junit.Assert.assertNull(boolean2);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener2 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "isCnAdministrator");
        // The following exception was thrown during execution in test generation
        try {
            clusterPartitionMembershipListener2.startListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        org.dataone.cn.log.AuditLogEntry auditLogEntry0 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date1 = null;
        auditLogEntry0.setDateLogged(date1);
        org.dataone.cn.log.AuditEvent auditEvent3 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str4 = auditEvent3.toString();
        auditLogEntry0.setEvent(auditEvent3);
        org.dataone.cn.log.AuditEvent auditEvent6 = auditLogEntry0.getEvent();
        java.lang.String str7 = auditLogEntry0.getNodeId();
        org.junit.Assert.assertTrue("'" + auditEvent3 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent3.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "replica not found" + "'", str4, "replica not found");
        org.junit.Assert.assertTrue("'" + auditEvent6 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent6.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        org.dataone.cn.log.AuditLogClientSolrImpl auditLogClientSolrImpl0 = new org.dataone.cn.log.AuditLogClientSolrImpl();
        org.dataone.cn.log.AuditLogWriteClientSplunkImpl auditLogWriteClientSplunkImpl1 = new org.dataone.cn.log.AuditLogWriteClientSplunkImpl();
        org.dataone.cn.log.AuditLogEntry auditLogEntry2 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date3 = null;
        auditLogEntry2.setDateLogged(date3);
        org.dataone.cn.log.AuditEvent auditEvent5 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str6 = auditEvent5.toString();
        auditLogEntry2.setEvent(auditEvent5);
        org.dataone.cn.log.AuditEvent auditEvent8 = auditLogEntry2.getEvent();
        boolean boolean9 = auditLogWriteClientSplunkImpl1.removeReplicaAuditEvent(auditLogEntry2);
        auditLogEntry2.setId("log aggregation harvest retrieved");
        org.dataone.cn.log.MetricLogClient metricLogClient12 = org.dataone.cn.log.MetricLogClientFactory.getMetricLogClient();
        org.dataone.cn.log.MetricEvent metricEvent13 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference14 = null;
        org.dataone.service.types.v1.Identifier identifier15 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry17 = new org.dataone.cn.log.MetricLogEntry(metricEvent13, nodeReference14, identifier15, "smreplicationpolicy");
        boolean boolean18 = metricLogClient12.logMetricEvent(metricLogEntry17);
        org.dataone.cn.log.MetricEvent metricEvent19 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference20 = null;
        org.dataone.service.types.v1.Identifier identifier21 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry23 = new org.dataone.cn.log.MetricLogEntry(metricEvent19, nodeReference20, identifier21, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent24 = metricLogEntry23.getEvent();
        java.util.Date date25 = metricLogEntry23.getDateLogged();
        metricLogEntry17.setDateLogged(date25);
        auditLogEntry2.setDateLogged(date25);
        java.lang.String str30 = auditLogClientSolrImpl0.queryLog(auditLogEntry2, (java.lang.Integer) 409, (java.lang.Integer) 413);
        org.junit.Assert.assertTrue("'" + auditEvent5 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent5.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "replica not found" + "'", str6, "replica not found");
        org.junit.Assert.assertTrue("'" + auditEvent8 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent8.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(metricLogClient12);
        org.junit.Assert.assertTrue("'" + metricEvent13 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent13.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + metricEvent19 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent19.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent24 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent24.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Mon Nov 20 02:38:04 CST 2023");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        org.apache.commons.logging.Log log0 = org.dataone.cn.hazelcast.HazelcastClientFactory.logger;
        org.dataone.cn.ldap.DirContextProvider.log = log0;
        org.dataone.cn.ldap.DirContextProvider.log = log0;
        org.dataone.cn.servlet.http.ProxyServletRequestWrapper.logger = log0;
        org.dataone.cn.servlet.http.ProxyServletRequestWrapper.logger = log0;
        org.dataone.cn.ldap.LDAPService.log = log0;
        org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println(0.0f);
        bufferedServletOutputStream0.println((double) 302);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        org.dataone.cn.log.AuditLogEntry auditLogEntry2 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date3 = null;
        auditLogEntry2.setDateLogged(date3);
        org.dataone.cn.log.AuditEvent auditEvent5 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str6 = auditEvent5.toString();
        auditLogEntry2.setEvent(auditEvent5);
        org.dataone.cn.log.AuditEvent auditEvent8 = auditLogEntry2.getEvent();
        org.dataone.cn.log.MetricEvent metricEvent9 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference10 = null;
        org.dataone.service.types.v1.Identifier identifier11 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry13 = new org.dataone.cn.log.MetricLogEntry(metricEvent9, nodeReference10, identifier11, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent14 = metricLogEntry13.getEvent();
        java.util.Date date15 = metricLogEntry13.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry17 = new org.dataone.cn.log.AuditLogEntry("Task-FORM-smreplicationpolicy", "processing", auditEvent8, date15, "/etc/dataone/storage/hazelcast.xml");
        java.lang.String str18 = auditEvent8.toString();
        org.junit.Assert.assertTrue("'" + auditEvent5 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent5.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "replica not found" + "'", str6, "replica not found");
        org.junit.Assert.assertTrue("'" + auditEvent8 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent8.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertTrue("'" + metricEvent9 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent9.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent14 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent14.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Mon Nov 20 02:38:04 CST 2023");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "replica not found" + "'", str18, "replica not found");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent5 = metricLogEntry4.getEvent();
        java.util.Date date6 = metricLogEntry4.getDateLogged();
        metricLogEntry4.setTimeToCompleteEventMS((java.lang.Long) 100L);
        org.dataone.service.types.v1.Identifier identifier9 = metricLogEntry4.getPid();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent5 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent5.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Nov 20 02:38:04 CST 2023");
        org.junit.Assert.assertNull(identifier9);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println(0.0f);
        bufferedServletOutputStream0.println(' ');
        bufferedServletOutputStream0.print((long) (byte) -1);
        bufferedServletOutputStream0.reset();
        bufferedServletOutputStream0.close();
        bufferedServletOutputStream0.println((long) 300);
        bufferedServletOutputStream0.flush();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println(0.0f);
        bufferedServletOutputStream0.println(' ');
        bufferedServletOutputStream0.print((long) (byte) -1);
        bufferedServletOutputStream0.println((int) 'a');
        bufferedServletOutputStream0.setBufferSize(401);
        bufferedServletOutputStream0.println('#');
        bufferedServletOutputStream0.flush();
        bufferedServletOutputStream0.println((double) 415);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        org.dataone.cn.log.AuditLogEntry auditLogEntry0 = new org.dataone.cn.log.AuditLogEntry();
        auditLogEntry0.setLogText("smreplicationstatus");
        java.util.Date date3 = auditLogEntry0.getDateLogged();
        java.lang.String str4 = auditLogEntry0.getNodeId();
        java.lang.Class<?> wildcardClass5 = auditLogEntry0.getClass();
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        bufferedServletOutputStream0.write(byteArray2);
        bufferedServletOutputStream0.print(0.0d);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        org.dataone.cn.dao.SystemMetadataStatus systemMetadataStatus0 = new org.dataone.cn.dao.SystemMetadataStatus();
        java.math.BigInteger bigInteger1 = null;
        systemMetadataStatus0.setSerialVersion(bigInteger1);
        org.dataone.service.types.v1.Identifier identifier3 = systemMetadataStatus0.getPid();
        org.junit.Assert.assertNull(identifier3);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        org.dataone.cn.log.AuditLogQueryClientNullObjectImpl auditLogQueryClientNullObjectImpl0 = new org.dataone.cn.log.AuditLogQueryClientNullObjectImpl();
        java.lang.String str4 = auditLogQueryClientNullObjectImpl0.queryLog("smreplicationstatus", (java.lang.Integer) 416, (java.lang.Integer) 201);
        org.dataone.cn.log.AuditLogWriteClientSplunkImpl auditLogWriteClientSplunkImpl5 = new org.dataone.cn.log.AuditLogWriteClientSplunkImpl();
        org.dataone.cn.log.AuditLogEntry auditLogEntry6 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date7 = null;
        auditLogEntry6.setDateLogged(date7);
        org.dataone.cn.log.AuditEvent auditEvent9 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str10 = auditEvent9.toString();
        auditLogEntry6.setEvent(auditEvent9);
        org.dataone.cn.log.AuditEvent auditEvent12 = auditLogEntry6.getEvent();
        boolean boolean13 = auditLogWriteClientSplunkImpl5.removeReplicaAuditEvent(auditLogEntry6);
        java.lang.String str16 = auditLogQueryClientNullObjectImpl0.queryLog(auditLogEntry6, (java.lang.Integer) 0, (java.lang.Integer) 300);
        org.dataone.cn.log.AuditLogEntry auditLogEntry19 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date20 = null;
        auditLogEntry19.setDateLogged(date20);
        org.dataone.cn.log.AuditEvent auditEvent22 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str23 = auditEvent22.toString();
        auditLogEntry19.setEvent(auditEvent22);
        org.dataone.cn.log.AuditLogEntry auditLogEntry26 = new org.dataone.cn.log.AuditLogEntry("org.dataone.cn.batch.exceptions.ExecutionDisabledException: hi!", "/etc/dataone/storage/hazelcast.xml", auditEvent22, "/etc/dataone/portal/hazelcast.xml");
        java.lang.String str29 = auditLogQueryClientNullObjectImpl0.queryLog(auditLogEntry26, (java.lang.Integer) 200, (java.lang.Integer) 408);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + auditEvent9 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent9.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "replica not found" + "'", str10, "replica not found");
        org.junit.Assert.assertTrue("'" + auditEvent12 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent12.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + auditEvent22 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent22.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "replica not found" + "'", str23, "replica not found");
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.MetricLogClient metricLogClient1 = org.dataone.cn.log.MetricLogClientFactory.getMetricLogClient();
        org.dataone.cn.log.MetricEvent metricEvent2 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference3 = null;
        org.dataone.service.types.v1.Identifier identifier4 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry6 = new org.dataone.cn.log.MetricLogEntry(metricEvent2, nodeReference3, identifier4, "smreplicationpolicy");
        boolean boolean7 = metricLogClient1.logMetricEvent(metricLogEntry6);
        org.dataone.cn.log.MetricEvent metricEvent8 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference9 = null;
        org.dataone.service.types.v1.Identifier identifier10 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry12 = new org.dataone.cn.log.MetricLogEntry(metricEvent8, nodeReference9, identifier10, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent13 = metricLogEntry12.getEvent();
        java.util.Date date14 = metricLogEntry12.getDateLogged();
        metricLogEntry6.setDateLogged(date14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList18 = replicationDaoMetacatImpl0.getCompletedCoordinatingNodeReplicasByDate(date14, 304, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'COMPLETED'   AND member_node = 'cnDev'  ORDER BY date_verified ASC LIMIT 100 OFFSET 30300; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricLogClient1);
        org.junit.Assert.assertTrue("'" + metricEvent2 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent2.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + metricEvent8 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent8.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent13 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent13.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Mon Nov 20 02:38:04 CST 2023");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        org.dataone.cn.log.AuditLogWriteClientSplunkImpl auditLogWriteClientSplunkImpl0 = new org.dataone.cn.log.AuditLogWriteClientSplunkImpl();
        org.dataone.cn.log.AuditLogEntry auditLogEntry1 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date2 = null;
        auditLogEntry1.setDateLogged(date2);
        org.dataone.cn.log.AuditEvent auditEvent4 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str5 = auditEvent4.toString();
        auditLogEntry1.setEvent(auditEvent4);
        org.dataone.cn.log.AuditEvent auditEvent7 = auditLogEntry1.getEvent();
        boolean boolean8 = auditLogWriteClientSplunkImpl0.removeReplicaAuditEvent(auditLogEntry1);
        org.dataone.cn.log.AuditLogEntry auditLogEntry9 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date10 = null;
        auditLogEntry9.setDateLogged(date10);
        java.lang.String str12 = auditLogEntry9.getNodeId();
        java.lang.String str13 = auditLogEntry9.getId();
        boolean boolean14 = auditLogWriteClientSplunkImpl0.removeReplicaAuditEvent(auditLogEntry9);
        org.junit.Assert.assertTrue("'" + auditEvent4 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent4.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "replica not found" + "'", str5, "replica not found");
        org.junit.Assert.assertTrue("'" + auditEvent7 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent7.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        org.dataone.cn.ldap.DirContextProvider dirContextProvider0 = org.dataone.cn.ldap.DirContextProvider.getInstance();
        int int1 = dirContextProvider0.getNumDirContextIdle();
        int int2 = dirContextProvider0.getNumDirContextActive();
        org.junit.Assert.assertNotNull(dirContextProvider0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.REPLICA_STATUS;
        java.lang.String str1 = metricEvent0.toString();
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        org.dataone.service.types.v1.Identifier identifier3 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry5 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference2, identifier3, "DIGEST");
        org.dataone.service.types.v1.NodeReference nodeReference6 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry7 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference6);
        org.dataone.service.types.v1.Identifier identifier8 = null;
        metricLogEntry7.setPid(identifier8);
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.REPLICA_STATUS + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.REPLICA_STATUS));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "replication status" + "'", str1, "replication status");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println(0.0f);
        bufferedServletOutputStream0.println(' ');
        bufferedServletOutputStream0.setBufferSize(500);
        bufferedServletOutputStream0.println(504);
        byte[] byteArray9 = new byte[] {};
        bufferedServletOutputStream0.write(byteArray9);
        bufferedServletOutputStream0.print(true);
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream13 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream13.println(0.0f);
        bufferedServletOutputStream13.println(' ');
        bufferedServletOutputStream13.print((long) (byte) -1);
        byte[] byteArray20 = bufferedServletOutputStream13.getBuffer();
        bufferedServletOutputStream0.write(byteArray20);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[48, 46, 48, 13, 10, 32, 13, 10, 45, 49]");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.AuditLogWriteClientSplunkImpl auditLogWriteClientSplunkImpl1 = new org.dataone.cn.log.AuditLogWriteClientSplunkImpl();
        org.dataone.cn.log.AuditLogEntry auditLogEntry2 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date3 = null;
        auditLogEntry2.setDateLogged(date3);
        org.dataone.cn.log.AuditEvent auditEvent5 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str6 = auditEvent5.toString();
        auditLogEntry2.setEvent(auditEvent5);
        org.dataone.cn.log.AuditEvent auditEvent8 = auditLogEntry2.getEvent();
        boolean boolean9 = auditLogWriteClientSplunkImpl1.removeReplicaAuditEvent(auditLogEntry2);
        auditLogEntry2.setId("log aggregation harvest retrieved");
        org.dataone.cn.log.MetricLogClient metricLogClient12 = org.dataone.cn.log.MetricLogClientFactory.getMetricLogClient();
        org.dataone.cn.log.MetricEvent metricEvent13 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference14 = null;
        org.dataone.service.types.v1.Identifier identifier15 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry17 = new org.dataone.cn.log.MetricLogEntry(metricEvent13, nodeReference14, identifier15, "smreplicationpolicy");
        boolean boolean18 = metricLogClient12.logMetricEvent(metricLogEntry17);
        org.dataone.cn.log.MetricEvent metricEvent19 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference20 = null;
        org.dataone.service.types.v1.Identifier identifier21 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry23 = new org.dataone.cn.log.MetricLogEntry(metricEvent19, nodeReference20, identifier21, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent24 = metricLogEntry23.getEvent();
        java.util.Date date25 = metricLogEntry23.getDateLogged();
        metricLogEntry17.setDateLogged(date25);
        auditLogEntry2.setDateLogged(date25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList30 = replicationDaoMetacatImpl0.getCompletedMemberNodeReplicasByDate(date25, 407, 206);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'COMPLETED'   AND member_node <> 'cnDev'  ORDER BY date_verified ASC  LIMIT 206 OFFSET 83636; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + auditEvent5 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent5.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "replica not found" + "'", str6, "replica not found");
        org.junit.Assert.assertTrue("'" + auditEvent8 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent8.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(metricLogClient12);
        org.junit.Assert.assertTrue("'" + metricEvent13 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent13.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + metricEvent19 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent19.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent24 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent24.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Mon Nov 20 02:38:04 CST 2023");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println(0.0f);
        bufferedServletOutputStream0.println(' ');
        bufferedServletOutputStream0.print((long) (byte) -1);
        bufferedServletOutputStream0.println((int) 'a');
        bufferedServletOutputStream0.print("authorizedSubjects");
        bufferedServletOutputStream0.setBufferSize(401);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        org.dataone.cn.dao.SystemMetadataDao systemMetadataDao0 = org.dataone.cn.dao.DaoFactory.getSystemMetadataDao();
        org.dataone.service.types.v1.Identifier identifier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.service.types.v2.SystemMetadata systemMetadata2 = systemMetadataDao0.getSystemMetadata(identifier1);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SYSTEMMETADATA\" not found; SQL statement:?SELECT guid, series_id, date_uploaded, rights_holder, checksum, checksum_algorithm, origin_member_node, authoritive_member_node, date_modified, submitter, object_format, size, replication_allowed, number_replicas, obsoletes, obsoleted_by, serial_version, archived FROM systemmetadata WHERE guid = ?; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(systemMetadataDao0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        org.dataone.cn.log.AuditLogEntry auditLogEntry0 = new org.dataone.cn.log.AuditLogEntry();
        auditLogEntry0.setLogText("smreplicationstatus");
        java.util.Date date3 = auditLogEntry0.getDateLogged();
        java.lang.String str4 = auditLogEntry0.getNodeId();
        org.dataone.cn.log.AuditLogWriteClientSplunkImpl auditLogWriteClientSplunkImpl5 = new org.dataone.cn.log.AuditLogWriteClientSplunkImpl();
        org.dataone.cn.log.AuditLogEntry auditLogEntry6 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date7 = null;
        auditLogEntry6.setDateLogged(date7);
        org.dataone.cn.log.AuditEvent auditEvent9 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str10 = auditEvent9.toString();
        auditLogEntry6.setEvent(auditEvent9);
        org.dataone.cn.log.AuditEvent auditEvent12 = auditLogEntry6.getEvent();
        boolean boolean13 = auditLogWriteClientSplunkImpl5.removeReplicaAuditEvent(auditLogEntry6);
        auditLogEntry6.setId("log aggregation harvest retrieved");
        org.dataone.cn.log.MetricLogClient metricLogClient16 = org.dataone.cn.log.MetricLogClientFactory.getMetricLogClient();
        org.dataone.cn.log.MetricEvent metricEvent17 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference18 = null;
        org.dataone.service.types.v1.Identifier identifier19 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry21 = new org.dataone.cn.log.MetricLogEntry(metricEvent17, nodeReference18, identifier19, "smreplicationpolicy");
        boolean boolean22 = metricLogClient16.logMetricEvent(metricLogEntry21);
        org.dataone.cn.log.MetricEvent metricEvent23 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference24 = null;
        org.dataone.service.types.v1.Identifier identifier25 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry27 = new org.dataone.cn.log.MetricLogEntry(metricEvent23, nodeReference24, identifier25, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent28 = metricLogEntry27.getEvent();
        java.util.Date date29 = metricLogEntry27.getDateLogged();
        metricLogEntry21.setDateLogged(date29);
        auditLogEntry6.setDateLogged(date29);
        auditLogEntry0.setDateLogged(date29);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + auditEvent9 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent9.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "replica not found" + "'", str10, "replica not found");
        org.junit.Assert.assertTrue("'" + auditEvent12 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent12.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(metricLogClient16);
        org.junit.Assert.assertTrue("'" + metricEvent17 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent17.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + metricEvent23 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent23.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent28 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent28.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Mon Nov 20 02:38:04 CST 2023");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println(false);
        bufferedServletOutputStream0.reset();
        bufferedServletOutputStream0.close();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        org.dataone.cn.ldap.DirContextPooledObjectFactory dirContextPooledObjectFactory0 = new org.dataone.cn.ldap.DirContextPooledObjectFactory();
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject1 = null;
        dirContextPooledObjectFactory0.activateObject(dirContextPooledObject1);
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject3 = null;
        dirContextPooledObjectFactory0.passivateObject(dirContextPooledObject3);
        javax.naming.directory.DirContext dirContext5 = null;
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject6 = dirContextPooledObjectFactory0.wrap(dirContext5);
        org.junit.Assert.assertNotNull(dirContextPooledObject6);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        java.lang.String str1 = metricEvent0.toString();
        org.dataone.cn.log.MetricLogEntry metricLogEntry2 = new org.dataone.cn.log.MetricLogEntry(metricEvent0);
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "log aggregation harvest retrieved" + "'", str1, "log aggregation harvest retrieved");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.REPLICATION_TASKS;
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.REPLICATION_TASKS + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.REPLICATION_TASKS));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        int int0 = javax.servlet.http.HttpServletResponse.SC_NOT_IMPLEMENTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 501 + "'", int0 == 501);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        org.dataone.cn.dao.ReplicationDao replicationDao0 = org.dataone.cn.dao.DaoFactory.getReplicationDao();
        org.dataone.cn.log.MetricEvent metricEvent1 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        org.dataone.service.types.v1.Identifier identifier3 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry5 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, nodeReference2, identifier3, "smreplicationpolicy");
        org.dataone.service.types.v1.NodeReference nodeReference6 = null;
        org.dataone.service.types.v1.Identifier identifier7 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry9 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, nodeReference6, identifier7, "{\"event\":\"log aggregation harvest retrieved\",\"message\":\"smreplicationpolicy\",\"threadName\":\"randoop.util.RunnerThread\",\"threadId\":3511,\"dateLogged\":\"2023-11-20T08:38:02.514+00:00\"}");
        java.util.Date date10 = metricLogEntry9.getDateLogged();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList13 = replicationDao0.getInvalidMemberNodeReplicasByDate(date10, (int) (byte) 1, 206);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'INVALIDATED'   AND member_node <> 'cnDev'  ORDER BY date_verified ASC  LIMIT 206 OFFSET 0; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(replicationDao0);
        org.junit.Assert.assertTrue("'" + metricEvent1 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent1.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Nov 20 02:38:04 CST 2023");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener2 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "isCnAdministrator");
        clusterPartitionMembershipListener2.setExpectedIPList("Task-FORM-smreplicationpolicy");
        com.hazelcast.core.MembershipEvent membershipEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            clusterPartitionMembershipListener2.handleMemberAddedEvent(membershipEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.REPLICA_STATUS;
        java.lang.String str1 = metricEvent0.toString();
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        org.dataone.service.types.v1.Identifier identifier3 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry5 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference2, identifier3, "DIGEST");
        org.dataone.service.types.v1.NodeReference nodeReference6 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry7 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference6);
        java.util.Date date8 = metricLogEntry7.getDateLogged();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.REPLICA_STATUS + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.REPLICA_STATUS));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "replication status" + "'", str1, "replication status");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Nov 20 02:38:04 CST 2023");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println(0.0f);
        bufferedServletOutputStream0.reset();
        bufferedServletOutputStream0.println('4');
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        org.dataone.cn.dao.ReplicationDao replicationDao0 = org.dataone.cn.dao.DaoFactory.getReplicationDao();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.dataone.cn.dao.ReplicationDao.ReplicaDto> replicaDtoCollection2 = replicationDao0.getQueuedReplicasByNode("/etc/dataone/process/hazelcast.xml");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        guid,                                  member_node,                           status,                                date_verified                          FROM  smreplicationstatus              WHERE member_node = ?               AND status = 'QUEUED'               ORDER BY date_verified ASC;           [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(replicationDao0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println(0.0f);
        bufferedServletOutputStream0.println(' ');
        bufferedServletOutputStream0.print((long) (byte) -1);
        bufferedServletOutputStream0.println((int) 'a');
        bufferedServletOutputStream0.println(410);
        bufferedServletOutputStream0.println((long) 407);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        org.dataone.cn.ldap.DirContextProvider dirContextProvider0 = org.dataone.cn.ldap.DirContextProvider.getInstance();
        int int1 = dirContextProvider0.getNumDirContextIdle();
        // The following exception was thrown during execution in test generation
        try {
            javax.naming.directory.DirContext dirContext2 = dirContextProvider0.borrowDirContext();
            org.junit.Assert.fail("Expected exception of type javax.naming.CommunicationException; message: localhost:12389");
        } catch (javax.naming.CommunicationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dirContextProvider0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        org.dataone.cn.log.AuditLogEntry auditLogEntry2 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date3 = null;
        auditLogEntry2.setDateLogged(date3);
        org.dataone.cn.log.AuditEvent auditEvent5 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str6 = auditEvent5.toString();
        auditLogEntry2.setEvent(auditEvent5);
        org.dataone.cn.log.AuditEvent auditEvent8 = auditLogEntry2.getEvent();
        org.dataone.cn.log.MetricEvent metricEvent9 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference10 = null;
        org.dataone.service.types.v1.Identifier identifier11 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry13 = new org.dataone.cn.log.MetricLogEntry(metricEvent9, nodeReference10, identifier11, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent14 = metricLogEntry13.getEvent();
        java.util.Date date15 = metricLogEntry13.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry17 = new org.dataone.cn.log.AuditLogEntry("Task-FORM-smreplicationpolicy", "processing", auditEvent8, date15, "/etc/dataone/storage/hazelcast.xml");
        java.lang.String str18 = auditLogEntry17.getLogText();
        org.dataone.cn.log.AuditEvent auditEvent19 = auditLogEntry17.getEvent();
        java.lang.String str20 = auditLogEntry17.getLogText();
        org.junit.Assert.assertTrue("'" + auditEvent5 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent5.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "replica not found" + "'", str6, "replica not found");
        org.junit.Assert.assertTrue("'" + auditEvent8 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent8.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertTrue("'" + metricEvent9 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent9.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent14 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent14.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Mon Nov 20 02:38:04 CST 2023");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/etc/dataone/storage/hazelcast.xml" + "'", str18, "/etc/dataone/storage/hazelcast.xml");
        org.junit.Assert.assertTrue("'" + auditEvent19 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent19.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/etc/dataone/storage/hazelcast.xml" + "'", str20, "/etc/dataone/storage/hazelcast.xml");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.AuditLogEntry auditLogEntry3 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date4 = null;
        auditLogEntry3.setDateLogged(date4);
        org.dataone.cn.log.AuditEvent auditEvent6 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str7 = auditEvent6.toString();
        auditLogEntry3.setEvent(auditEvent6);
        org.dataone.cn.log.AuditEvent auditEvent9 = auditLogEntry3.getEvent();
        org.dataone.cn.log.AuditLogEntry auditLogEntry11 = new org.dataone.cn.log.AuditLogEntry("isMnAdministrator", "systemmetadata", auditEvent9, "processing");
        org.dataone.cn.log.MetricLogClient metricLogClient12 = org.dataone.cn.log.MetricLogClientFactory.getMetricLogClient();
        org.dataone.cn.log.MetricEvent metricEvent13 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference14 = null;
        org.dataone.service.types.v1.Identifier identifier15 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry17 = new org.dataone.cn.log.MetricLogEntry(metricEvent13, nodeReference14, identifier15, "smreplicationpolicy");
        boolean boolean18 = metricLogClient12.logMetricEvent(metricLogEntry17);
        org.dataone.cn.log.MetricEvent metricEvent19 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference20 = null;
        org.dataone.service.types.v1.Identifier identifier21 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry23 = new org.dataone.cn.log.MetricLogEntry(metricEvent19, nodeReference20, identifier21, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent24 = metricLogEntry23.getEvent();
        java.util.Date date25 = metricLogEntry23.getDateLogged();
        metricLogEntry17.setDateLogged(date25);
        auditLogEntry11.setDateLogged(date25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.cn.dao.ReplicationDao.ReplicaDto> replicaDtoList28 = replicationDaoMetacatImpl0.getRequestedReplicasByDate(date25);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        guid,                                  member_node,                           status,                                date_verified                          FROM  smreplicationstatus              WHERE date_verified <= ?               AND status = 'REQUESTED'               ORDER BY date_verified ASC;           [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + auditEvent6 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent6.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "replica not found" + "'", str7, "replica not found");
        org.junit.Assert.assertTrue("'" + auditEvent9 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent9.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertNotNull(metricLogClient12);
        org.junit.Assert.assertTrue("'" + metricEvent13 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent13.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + metricEvent19 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent19.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent24 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent24.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Mon Nov 20 02:38:04 CST 2023");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        org.dataone.cn.log.AuditLogEntry auditLogEntry0 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date1 = null;
        auditLogEntry0.setDateLogged(date1);
        org.dataone.cn.log.AuditEvent auditEvent3 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str4 = auditEvent3.toString();
        auditLogEntry0.setEvent(auditEvent3);
        auditLogEntry0.setLogText("");
        java.lang.String str8 = auditLogEntry0.getLogText();
        org.dataone.cn.log.AuditEvent auditEvent9 = auditLogEntry0.getEvent();
        org.junit.Assert.assertTrue("'" + auditEvent3 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent3.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "replica not found" + "'", str4, "replica not found");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + auditEvent9 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent9.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.dataone.cn.dao.ReplicationDao.ReplicaDto> replicaDtoCollection2 = replicationDaoMetacatImpl0.getQueuedReplicasByNode("systemmetadata");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        guid,                                  member_node,                           status,                                date_verified                          FROM  smreplicationstatus              WHERE member_node = ?               AND status = 'QUEUED'               ORDER BY date_verified ASC;           [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println((long) (byte) 0);
        bufferedServletOutputStream0.println("DIGEST");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener2 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "isCnAdministrator");
        clusterPartitionMembershipListener2.stopListener();
        com.hazelcast.core.MembershipEvent membershipEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            clusterPartitionMembershipListener2.memberAdded(membershipEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println(0.0f);
        bufferedServletOutputStream0.reset();
        bufferedServletOutputStream0.print((-1));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        org.dataone.cn.log.AuditLogEntry auditLogEntry0 = new org.dataone.cn.log.AuditLogEntry();
        auditLogEntry0.setNodeId("org.dataone.cn.batch.exceptions.ExecutionDisabledException: hi!");
        org.dataone.cn.log.MetricEvent metricEvent3 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference4 = null;
        org.dataone.service.types.v1.Identifier identifier5 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry7 = new org.dataone.cn.log.MetricLogEntry(metricEvent3, nodeReference4, identifier5, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent8 = metricLogEntry7.getEvent();
        java.util.Date date9 = metricLogEntry7.getDateLogged();
        auditLogEntry0.setDateLogged(date9);
        org.dataone.cn.log.AuditEvent auditEvent11 = auditLogEntry0.getEvent();
        java.lang.String str12 = auditLogEntry0.getId();
        org.junit.Assert.assertTrue("'" + metricEvent3 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent3.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent8 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent8.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Nov 20 02:38:04 CST 2023");
        org.junit.Assert.assertNull(auditEvent11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        org.dataone.cn.dao.SystemMetadataStatus systemMetadataStatus0 = new org.dataone.cn.dao.SystemMetadataStatus();
        java.lang.Boolean boolean1 = systemMetadataStatus0.getDeleted();
        systemMetadataStatus0.setDeleted((java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean1);
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
        metricLogEntry3.setNodeId(nodeReference4);
        org.dataone.service.types.v1.Identifier identifier6 = null;
        metricLogEntry3.setPid(identifier6);
        org.dataone.service.types.v1.NodeReference nodeReference8 = null;
        metricLogEntry3.setNodeId(nodeReference8);
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry3 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2);
        org.dataone.service.types.v1.NodeReference nodeReference4 = null;
        metricLogEntry3.setNodeId(nodeReference4);
        org.dataone.service.types.v1.Identifier identifier6 = null;
        metricLogEntry3.setPid(identifier6);
        java.lang.String str8 = metricLogEntry3.toString();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{\"event\":\"synchronization harvest submitted\",\"threadName\":\"randoop.util.RunnerThread\",\"threadId\":15620,\"dateLogged\":\"2023-11-20T08:38:04.755+00:00\"}" + "'", str8, "{\"event\":\"synchronization harvest submitted\",\"threadName\":\"randoop.util.RunnerThread\",\"threadId\":15620,\"dateLogged\":\"2023-11-20T08:38:04.755+00:00\"}");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println(0.0f);
        bufferedServletOutputStream0.println(' ');
        bufferedServletOutputStream0.print((long) (byte) -1);
        bufferedServletOutputStream0.reset();
        bufferedServletOutputStream0.close();
        bufferedServletOutputStream0.println((long) 300);
        bufferedServletOutputStream0.print((-1.0f));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        org.apache.commons.dbcp.BasicDataSource basicDataSource0 = org.dataone.cn.dao.MetacatDataSourceFactory.getMetacatDataSource();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl1 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl((javax.sql.DataSource) basicDataSource0);
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.AccessRuleMapper accessRuleMapper2 = systemMetadataDaoMetacatImpl1.new AccessRuleMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SystemMetadataStatusMapper systemMetadataStatusMapper3 = systemMetadataDaoMetacatImpl1.new SystemMetadataStatusMapper();
        org.dataone.service.types.v2.SystemMetadata systemMetadata4 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.service.types.v1.Identifier identifier6 = systemMetadataDaoMetacatImpl1.saveSystemMetadata(systemMetadata4, strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDataSource0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        org.dataone.cn.synchronization.types.SyncObject syncObject2 = new org.dataone.cn.synchronization.types.SyncObject("FORM", "smreplicationpolicy");
        java.lang.String str3 = syncObject2.getNodeId();
        java.lang.String str4 = syncObject2.getPid();
        syncObject2.setSleepUntil((long) 406);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FORM" + "'", str3, "FORM");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "smreplicationpolicy" + "'", str4, "smreplicationpolicy");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry3 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2);
        org.dataone.service.types.v1.Identifier identifier4 = null;
        metricLogEntry3.setPid(identifier4);
        java.util.Date date6 = metricLogEntry3.getDateLogged();
        java.lang.Long long7 = metricLogEntry3.getTimeToCompleteEventMS();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Nov 20 02:38:04 CST 2023");
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener3 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "{\"event\":\"log aggregation harvest retrieved\",\"message\":\"smreplicationpolicy\",\"threadName\":\"randoop.util.RunnerThread\",\"threadId\":3511,\"dateLogged\":\"2023-11-20T08:38:02.514+00:00\"}", "/etc/dataone/portal/hazelcast.xml");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry5 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2, "xml_access", (java.lang.Long) (-1L));
        metricLogEntry5.setMessage("log aggregation harvest retrieved");
        org.dataone.cn.log.MetricEvent metricEvent8 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference9 = null;
        org.dataone.service.types.v1.Identifier identifier10 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry13 = new org.dataone.cn.log.MetricLogEntry(metricEvent8, nodeReference9, identifier10, "xml_access", (java.lang.Long) (-1L));
        metricLogEntry13.setMessage("log aggregation harvest retrieved");
        java.lang.String str16 = metricLogEntry13.toString();
        org.dataone.cn.log.MetricEvent metricEvent17 = org.dataone.cn.log.MetricEvent.REPLICA_STATUS;
        java.lang.String str18 = metricEvent17.toString();
        org.dataone.service.types.v1.NodeReference nodeReference19 = null;
        org.dataone.service.types.v1.Identifier identifier20 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry22 = new org.dataone.cn.log.MetricLogEntry(metricEvent17, nodeReference19, identifier20, "DIGEST");
        metricLogEntry13.setEvent(metricEvent17);
        metricLogEntry5.setEvent(metricEvent17);
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertTrue("'" + metricEvent8 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent8.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{\"event\":\"synchronization harvest submitted\",\"message\":\"log aggregation harvest retrieved\",\"timeToCompleteEventMS\":-1,\"threadName\":\"randoop.util.RunnerThread\",\"threadId\":15743,\"dateLogged\":\"2023-11-20T08:38:04.805+00:00\"}" + "'", str16, "{\"event\":\"synchronization harvest submitted\",\"message\":\"log aggregation harvest retrieved\",\"timeToCompleteEventMS\":-1,\"threadName\":\"randoop.util.RunnerThread\",\"threadId\":15743,\"dateLogged\":\"2023-11-20T08:38:04.805+00:00\"}");
        org.junit.Assert.assertTrue("'" + metricEvent17 + "' != '" + org.dataone.cn.log.MetricEvent.REPLICA_STATUS + "'", metricEvent17.equals(org.dataone.cn.log.MetricEvent.REPLICA_STATUS));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "replication status" + "'", str18, "replication status");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.REPLICA_STATUS;
        java.lang.String str1 = metricEvent0.toString();
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        org.dataone.service.types.v1.Identifier identifier3 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry5 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference2, identifier3, "DIGEST");
        org.dataone.service.types.v1.NodeReference nodeReference6 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry7 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference6);
        org.dataone.cn.log.MetricEvent metricEvent8 = metricLogEntry7.getEvent();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.REPLICA_STATUS + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.REPLICA_STATUS));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "replication status" + "'", str1, "replication status");
        org.junit.Assert.assertTrue("'" + metricEvent8 + "' != '" + org.dataone.cn.log.MetricEvent.REPLICA_STATUS + "'", metricEvent8.equals(org.dataone.cn.log.MetricEvent.REPLICA_STATUS));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        org.dataone.cn.dao.ReplicationPolicyEntry replicationPolicyEntry0 = new org.dataone.cn.dao.ReplicationPolicyEntry();
        org.dataone.service.types.v1.Identifier identifier1 = replicationPolicyEntry0.getPid();
        org.dataone.service.types.v1.NodeReference nodeReference2 = replicationPolicyEntry0.getMemberNode();
        java.lang.String str3 = replicationPolicyEntry0.getPolicy();
        org.junit.Assert.assertNull(identifier1);
        org.junit.Assert.assertNull(nodeReference2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry5 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2, "xml_access", (java.lang.Long) (-1L));
        java.lang.String str6 = metricEvent0.toString();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "synchronization harvest submitted" + "'", str6, "synchronization harvest submitted");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println(0.0f);
        bufferedServletOutputStream0.reset();
        bufferedServletOutputStream0.setBufferSize((int) (short) 0);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1 };
        bufferedServletOutputStream0.write(byteArray8);
        bufferedServletOutputStream0.println(415);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 1]");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println(0.0f);
        bufferedServletOutputStream0.println(' ');
        bufferedServletOutputStream0.setBufferSize(500);
        bufferedServletOutputStream0.println(504);
        bufferedServletOutputStream0.println((float) 415);
        bufferedServletOutputStream0.print((int) '#');
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener2 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "isCnAdministrator");
        clusterPartitionMembershipListener2.stopListener();
        com.hazelcast.core.MembershipEvent membershipEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            clusterPartitionMembershipListener2.handleMemberAddedEvent(membershipEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        org.dataone.cn.dao.ReplicationDao.ReplicaDto replicaDto0 = new org.dataone.cn.dao.ReplicationDao.ReplicaDto();
        org.dataone.service.types.v1.Replica replica1 = null;
        replicaDto0.replica = replica1;
        org.dataone.service.types.v1.Replica replica3 = replicaDto0.replica;
        org.junit.Assert.assertNull(replica3);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
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
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        org.dataone.cn.dao.SystemMetadataStatus systemMetadataStatus0 = new org.dataone.cn.dao.SystemMetadataStatus();
        java.util.Date date1 = systemMetadataStatus0.getLastSystemMetadataModificationDate();
        java.util.Date date2 = systemMetadataStatus0.getLastSystemMetadataModificationDate();
        systemMetadataStatus0.setDeleted((java.lang.Boolean) true);
        systemMetadataStatus0.setDeleted((java.lang.Boolean) false);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date2);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println((long) (byte) 0);
        bufferedServletOutputStream0.println('#');
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream5 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream5.println(0.0f);
        bufferedServletOutputStream5.println(' ');
        bufferedServletOutputStream5.print((long) (byte) -1);
        bufferedServletOutputStream5.reset();
        bufferedServletOutputStream5.print((double) 100);
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream15 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream15.println(0.0f);
        bufferedServletOutputStream15.reset();
        bufferedServletOutputStream15.setBufferSize((int) (short) 0);
        byte[] byteArray23 = new byte[] { (byte) 100, (byte) 1 };
        bufferedServletOutputStream15.write(byteArray23);
        bufferedServletOutputStream5.write(byteArray23);
        bufferedServletOutputStream0.write(byteArray23);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100, 1]");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        org.apache.commons.logging.Log log0 = org.dataone.cn.ldap.DirContextProvider.log;
        org.dataone.cn.ldap.LDAPService.log = log0;
        org.junit.Assert.assertNotNull(log0);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        org.dataone.cn.log.AuditLogEntry auditLogEntry2 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date3 = null;
        auditLogEntry2.setDateLogged(date3);
        org.dataone.cn.log.AuditEvent auditEvent5 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str6 = auditEvent5.toString();
        auditLogEntry2.setEvent(auditEvent5);
        org.dataone.cn.log.AuditEvent auditEvent8 = auditLogEntry2.getEvent();
        org.dataone.cn.log.MetricEvent metricEvent9 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference10 = null;
        org.dataone.service.types.v1.Identifier identifier11 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry13 = new org.dataone.cn.log.MetricLogEntry(metricEvent9, nodeReference10, identifier11, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent14 = metricLogEntry13.getEvent();
        java.util.Date date15 = metricLogEntry13.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry17 = new org.dataone.cn.log.AuditLogEntry("Task-FORM-smreplicationpolicy", "processing", auditEvent8, date15, "/etc/dataone/storage/hazelcast.xml");
        java.lang.String str18 = auditLogEntry17.getLogText();
        java.lang.String str19 = auditLogEntry17.getLogText();
        org.junit.Assert.assertTrue("'" + auditEvent5 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent5.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "replica not found" + "'", str6, "replica not found");
        org.junit.Assert.assertTrue("'" + auditEvent8 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent8.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertTrue("'" + metricEvent9 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent9.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent14 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent14.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Mon Nov 20 02:38:04 CST 2023");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/etc/dataone/storage/hazelcast.xml" + "'", str18, "/etc/dataone/storage/hazelcast.xml");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/etc/dataone/storage/hazelcast.xml" + "'", str19, "/etc/dataone/storage/hazelcast.xml");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        org.dataone.cn.log.AuditLogEntry auditLogEntry0 = new org.dataone.cn.log.AuditLogEntry();
        java.lang.String str1 = auditLogEntry0.getId();
        org.dataone.cn.log.AuditEvent auditEvent2 = auditLogEntry0.getEvent();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(auditEvent2);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        org.dataone.cn.log.AuditLogClientSplunkImpl auditLogClientSplunkImpl0 = new org.dataone.cn.log.AuditLogClientSplunkImpl();
        org.dataone.cn.log.AuditLogEntry auditLogEntry1 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date2 = null;
        auditLogEntry1.setDateLogged(date2);
        java.lang.String str4 = auditLogEntry1.getNodeId();
        java.lang.String str7 = auditLogClientSplunkImpl0.queryLog(auditLogEntry1, (java.lang.Integer) 300, (java.lang.Integer) 301);
        java.util.Date date8 = auditLogEntry1.getDateLogged();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        org.dataone.cn.log.AuditLogEntry auditLogEntry0 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date1 = null;
        auditLogEntry0.setDateLogged(date1);
        org.dataone.cn.log.AuditEvent auditEvent3 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str4 = auditEvent3.toString();
        auditLogEntry0.setEvent(auditEvent3);
        auditLogEntry0.setId("replica not found");
        auditLogEntry0.setPid("{\"event\":\"synchronization harvest submitted\",\"threadName\":\"randoop.util.RunnerThread\",\"threadId\":15620,\"dateLogged\":\"2023-11-20T08:38:04.755+00:00\"}");
        org.junit.Assert.assertTrue("'" + auditEvent3 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent3.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "replica not found" + "'", str4, "replica not found");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.dataone.cn.dao.ReplicationDao.ReplicaDto> replicaDtoCollection2 = replicationDaoMetacatImpl0.getQueuedReplicasByNode("{\"event\":\"log aggregation harvest retrieved\",\"message\":\"smreplicationpolicy\",\"threadName\":\"randoop.util.RunnerThread\",\"threadId\":3646,\"dateLogged\":\"2023-11-20T08:38:02.572+00:00\"}");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        guid,                                  member_node,                           status,                                date_verified                          FROM  smreplicationstatus              WHERE member_node = ?               AND status = 'QUEUED'               ORDER BY date_verified ASC;           [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        org.apache.commons.dbcp.BasicDataSource basicDataSource0 = org.dataone.cn.dao.MetacatDataSourceFactory.getMetacatDataSource();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl1 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl((javax.sql.DataSource) basicDataSource0);
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SystemMetadataStatusMapper systemMetadataStatusMapper2 = systemMetadataDaoMetacatImpl1.new SystemMetadataStatusMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SystemMetadataStatusMapper systemMetadataStatusMapper3 = systemMetadataDaoMetacatImpl1.new SystemMetadataStatusMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicationPolicyEntryMapper replicationPolicyEntryMapper4 = systemMetadataDaoMetacatImpl1.new ReplicationPolicyEntryMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.cn.dao.SystemMetadataStatus> systemMetadataStatusList7 = systemMetadataDaoMetacatImpl1.listSystemMetadataStatus(302, 416);
            org.junit.Assert.fail("Expected exception of type org.dataone.cn.dao.exceptions.DataAccessException; message: org.springframework.jdbc.BadSqlGrammarException: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SYSTEMMETADATA\" not found; SQL statement:?SELECT guid, serial_version, date_modified, archived FROM systemmetadata ORDER BY guid LIMIT 416 OFFSET 125216; [42102-163]");
        } catch (org.dataone.cn.dao.exceptions.DataAccessException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDataSource0);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        int int0 = javax.servlet.http.HttpServletResponse.SC_NOT_FOUND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 404 + "'", int0 == 404);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        com.hazelcast.config.Config config0 = null;
        org.dataone.cn.hazelcast.ClientConfiguration clientConfiguration1 = new org.dataone.cn.hazelcast.ClientConfiguration(config0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = clientConfiguration1.getPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        org.dataone.cn.servlet.http.BufferedServletOutputStream bufferedServletOutputStream0 = new org.dataone.cn.servlet.http.BufferedServletOutputStream();
        bufferedServletOutputStream0.println(0.0f);
        bufferedServletOutputStream0.println(' ');
        bufferedServletOutputStream0.print((long) (byte) -1);
        bufferedServletOutputStream0.reset();
        bufferedServletOutputStream0.close();
        bufferedServletOutputStream0.println((double) 412);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        com.hazelcast.core.HazelcastInstance hazelcastInstance0 = null;
        org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener clusterPartitionMembershipListener2 = new org.dataone.cn.hazelcast.membership.ClusterPartitionMembershipListener(hazelcastInstance0, "isCnAdministrator");
        clusterPartitionMembershipListener2.setExpectedIPList("{\"event\":\"synchronization harvest submitted\",\"message\":\"log aggregation harvest retrieved\",\"timeToCompleteEventMS\":-1,\"threadName\":\"randoop.util.RunnerThread\",\"threadId\":15743,\"dateLogged\":\"2023-11-20T08:38:04.805+00:00\"}");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        org.apache.commons.dbcp.BasicDataSource basicDataSource0 = org.dataone.cn.dao.MetacatDataSourceFactory.getMetacatDataSource();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl1 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl((javax.sql.DataSource) basicDataSource0);
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.AccessRuleMapper accessRuleMapper2 = systemMetadataDaoMetacatImpl1.new AccessRuleMapper();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = systemMetadataDaoMetacatImpl1.getSystemMetadataCount();
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: StatementCallback; bad SQL grammar [SELECT count(guid) FROM systemmetadata]; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SYSTEMMETADATA\" not found; SQL statement:?SELECT count(guid) FROM systemmetadata [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDataSource0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        org.dataone.cn.log.AuditLogClientSplunkImpl auditLogClientSplunkImpl0 = new org.dataone.cn.log.AuditLogClientSplunkImpl();
        java.lang.String str4 = auditLogClientSplunkImpl0.queryLog("smreplicationstatus", (java.lang.Integer) 100, (java.lang.Integer) 0);
        org.dataone.cn.log.AuditLogClientSplunkImpl auditLogClientSplunkImpl5 = new org.dataone.cn.log.AuditLogClientSplunkImpl();
        org.dataone.cn.log.AuditLogEntry auditLogEntry8 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date9 = null;
        auditLogEntry8.setDateLogged(date9);
        org.dataone.cn.log.AuditEvent auditEvent11 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str12 = auditEvent11.toString();
        auditLogEntry8.setEvent(auditEvent11);
        org.dataone.cn.log.AuditEvent auditEvent14 = auditLogEntry8.getEvent();
        org.dataone.cn.log.MetricEvent metricEvent15 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference16 = null;
        org.dataone.service.types.v1.Identifier identifier17 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry19 = new org.dataone.cn.log.MetricLogEntry(metricEvent15, nodeReference16, identifier17, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent20 = metricLogEntry19.getEvent();
        java.util.Date date21 = metricLogEntry19.getDateLogged();
        org.dataone.cn.log.AuditLogEntry auditLogEntry23 = new org.dataone.cn.log.AuditLogEntry("Task-FORM-smreplicationpolicy", "processing", auditEvent14, date21, "/etc/dataone/storage/hazelcast.xml");
        java.lang.String str26 = auditLogClientSplunkImpl5.queryLog(auditLogEntry23, (java.lang.Integer) 504, (java.lang.Integer) 300);
        org.dataone.cn.log.AuditLogWriteClientSplunkImpl auditLogWriteClientSplunkImpl27 = new org.dataone.cn.log.AuditLogWriteClientSplunkImpl();
        org.dataone.cn.log.AuditLogEntry auditLogEntry28 = new org.dataone.cn.log.AuditLogEntry();
        auditLogEntry28.setLogText("smreplicationstatus");
        auditLogEntry28.setLogText("org.dataone.cn.batch.exceptions.ExecutionDisabledException: hi!");
        boolean boolean33 = auditLogWriteClientSplunkImpl27.removeReplicaAuditEvent(auditLogEntry28);
        auditLogEntry28.setPid("session");
        java.lang.String str38 = auditLogClientSplunkImpl5.queryLog(auditLogEntry28, (java.lang.Integer) 301, (java.lang.Integer) 402);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = auditLogClientSplunkImpl0.logAuditEvent(auditLogEntry28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + auditEvent11 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent11.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "replica not found" + "'", str12, "replica not found");
        org.junit.Assert.assertTrue("'" + auditEvent14 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent14.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertTrue("'" + metricEvent15 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent15.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent20 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent20.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Mon Nov 20 02:38:05 CST 2023");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        org.dataone.cn.log.AuditEvent auditEvent0 = org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED;
        org.junit.Assert.assertTrue("'" + auditEvent0 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED + "'", auditEvent0.equals(org.dataone.cn.log.AuditEvent.REPLICA_AUDIT_FAILED));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        org.dataone.cn.log.AuditLogEntry auditLogEntry0 = new org.dataone.cn.log.AuditLogEntry();
        auditLogEntry0.setLogText("smreplicationstatus");
        java.util.Date date3 = auditLogEntry0.getDateLogged();
        java.lang.String str4 = auditLogEntry0.getPid();
        java.lang.String str5 = auditLogEntry0.getId();
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2, "smreplicationpolicy");
        java.lang.String str5 = metricLogEntry4.toString();
        org.dataone.cn.log.MetricEvent metricEvent6 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference7 = null;
        org.dataone.service.types.v1.Identifier identifier8 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry9 = new org.dataone.cn.log.MetricLogEntry(metricEvent6, nodeReference7, identifier8);
        org.dataone.service.types.v1.Identifier identifier10 = null;
        metricLogEntry9.setPid(identifier10);
        java.util.Date date12 = metricLogEntry9.getDateLogged();
        metricLogEntry4.setDateLogged(date12);
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{\"event\":\"log aggregation harvest retrieved\",\"message\":\"smreplicationpolicy\",\"threadName\":\"randoop.util.RunnerThread\",\"threadId\":16770,\"dateLogged\":\"2023-11-20T08:38:05.043+00:00\"}" + "'", str5, "{\"event\":\"log aggregation harvest retrieved\",\"message\":\"smreplicationpolicy\",\"threadName\":\"randoop.util.RunnerThread\",\"threadId\":16770,\"dateLogged\":\"2023-11-20T08:38:05.043+00:00\"}");
        org.junit.Assert.assertTrue("'" + metricEvent6 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent6.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Nov 20 02:38:05 CST 2023");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        org.dataone.cn.ldap.DirContextProvider dirContextProvider0 = org.dataone.cn.ldap.DirContextProvider.getInstance();
        int int1 = dirContextProvider0.getNumDirContextActive();
        int int2 = dirContextProvider0.getNumDirContextActive();
        org.junit.Assert.assertNotNull(dirContextProvider0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        org.apache.commons.dbcp.BasicDataSource basicDataSource0 = org.dataone.cn.dao.MetacatDataSourceFactory.getMetacatDataSource();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl1 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl((javax.sql.DataSource) basicDataSource0);
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SystemMetadataStatusMapper systemMetadataStatusMapper2 = systemMetadataDaoMetacatImpl1.new SystemMetadataStatusMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SystemMetadataStatusMapper systemMetadataStatusMapper3 = systemMetadataDaoMetacatImpl1.new SystemMetadataStatusMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicationPolicyEntryMapper replicationPolicyEntryMapper4 = systemMetadataDaoMetacatImpl1.new ReplicationPolicyEntryMapper();
        org.dataone.service.types.v2.SystemMetadata systemMetadata5 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.service.types.v1.Identifier identifier7 = systemMetadataDaoMetacatImpl1.saveSystemMetadata(systemMetadata5, strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDataSource0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        org.dataone.cn.dao.SystemMetadataStatus systemMetadataStatus0 = new org.dataone.cn.dao.SystemMetadataStatus();
        java.math.BigInteger bigInteger1 = null;
        systemMetadataStatus0.setSerialVersion(bigInteger1);
        java.util.Date date3 = systemMetadataStatus0.getLastSystemMetadataModificationDate();
        org.junit.Assert.assertNull(date3);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        org.dataone.cn.ldap.DirContextPooledObjectFactory dirContextPooledObjectFactory0 = new org.dataone.cn.ldap.DirContextPooledObjectFactory();
        org.dataone.cn.ldap.DirContextPooledObjectFactory dirContextPooledObjectFactory1 = new org.dataone.cn.ldap.DirContextPooledObjectFactory();
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject2 = null;
        dirContextPooledObjectFactory1.activateObject(dirContextPooledObject2);
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject4 = null;
        dirContextPooledObjectFactory1.passivateObject(dirContextPooledObject4);
        org.dataone.cn.ldap.DirContextPooledObjectFactory dirContextPooledObjectFactory6 = new org.dataone.cn.ldap.DirContextPooledObjectFactory();
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject7 = null;
        dirContextPooledObjectFactory6.activateObject(dirContextPooledObject7);
        javax.naming.directory.DirContext dirContext9 = null;
        org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject10 = dirContextPooledObjectFactory6.wrap(dirContext9);
        dirContextPooledObjectFactory1.activateObject(dirContextPooledObject10);
        dirContextPooledObjectFactory0.activateObject(dirContextPooledObject10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.pool2.PooledObject<javax.naming.directory.DirContext> dirContextPooledObject13 = dirContextPooledObjectFactory0.makeObject();
            org.junit.Assert.fail("Expected exception of type javax.naming.CommunicationException; message: localhost:12389");
        } catch (javax.naming.CommunicationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dirContextPooledObject10);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        org.dataone.cn.synchronization.types.SyncObject syncObject2 = new org.dataone.cn.synchronization.types.SyncObject("replication status", "");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        com.hazelcast.config.Config config0 = null;
        org.dataone.cn.hazelcast.ClientConfiguration clientConfiguration1 = new org.dataone.cn.hazelcast.ClientConfiguration(config0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = clientConfiguration1.getLocalhost();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        org.apache.commons.dbcp.BasicDataSource basicDataSource0 = org.dataone.cn.dao.MetacatDataSourceFactory.getMetacatDataSource();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl1 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl((javax.sql.DataSource) basicDataSource0);
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.AccessRuleMapper accessRuleMapper2 = systemMetadataDaoMetacatImpl1.new AccessRuleMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicationPolicyEntryMapper replicationPolicyEntryMapper3 = systemMetadataDaoMetacatImpl1.new ReplicationPolicyEntryMapper();
        java.sql.ResultSet resultSet4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.dao.ReplicationPolicyEntry replicationPolicyEntry6 = replicationPolicyEntryMapper3.mapRow(resultSet4, 303);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDataSource0);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.cn.hazelcast.ClientConfiguration clientConfiguration1 = new org.dataone.cn.hazelcast.ClientConfiguration("{\"event\":\"synchronization harvest submitted\",\"message\":\"log aggregation harvest retrieved\",\"timeToCompleteEventMS\":-1,\"threadName\":\"randoop.util.RunnerThread\",\"threadId\":15223,\"dateLogged\":\"2023-11-20T08:38:04.681+00:00\"}");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: {\"event\":\"synchronization harvest submitted\",\"message\":\"log aggregation harvest retrieved\",\"timeToCompleteEventMS\":-1,\"threadName\":\"randoop.util.RunnerThread\",\"threadId\":15223,\"dateLogged\":\"2023-11-20T08:38:04.681+00:00\"} (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        org.apache.commons.dbcp.BasicDataSource basicDataSource0 = org.dataone.cn.dao.MetacatDataSourceFactory.getMetacatDataSource();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl systemMetadataDaoMetacatImpl1 = new org.dataone.cn.dao.SystemMetadataDaoMetacatImpl((javax.sql.DataSource) basicDataSource0);
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SystemMetadataStatusMapper systemMetadataStatusMapper2 = systemMetadataDaoMetacatImpl1.new SystemMetadataStatusMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.SystemMetadataStatusMapper systemMetadataStatusMapper3 = systemMetadataDaoMetacatImpl1.new SystemMetadataStatusMapper();
        org.dataone.cn.dao.SystemMetadataDaoMetacatImpl.ReplicationPolicyEntryMapper replicationPolicyEntryMapper4 = systemMetadataDaoMetacatImpl1.new ReplicationPolicyEntryMapper();
        org.dataone.service.types.v1.Identifier identifier5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.dataone.service.types.v2.SystemMetadata systemMetadata6 = systemMetadataDaoMetacatImpl1.getSystemMetadata(identifier5);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SYSTEMMETADATA\" not found; SQL statement:?SELECT guid, series_id, date_uploaded, rights_holder, checksum, checksum_algorithm, origin_member_node, authoritive_member_node, date_modified, submitter, object_format, size, replication_allowed, number_replicas, obsoletes, obsoleted_by, serial_version, archived FROM systemmetadata WHERE guid = ?; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDataSource0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.MetricEvent metricEvent1 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        org.dataone.service.types.v1.Identifier identifier3 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, nodeReference2, identifier3);
        org.dataone.service.types.v1.Identifier identifier5 = null;
        metricLogEntry4.setPid(identifier5);
        java.util.Date date7 = metricLogEntry4.getDateLogged();
        java.util.Date date8 = metricLogEntry4.getDateLogged();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList11 = replicationDaoMetacatImpl0.getInvalidMemberNodeReplicasByDate(date8, (int) '4', 413);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'INVALIDATED'   AND member_node <> 'cnDev'  ORDER BY date_verified ASC  LIMIT 413 OFFSET 21063; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + metricEvent1 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent1.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Nov 20 02:38:05 CST 2023");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Nov 20 02:38:05 CST 2023");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        int int0 = javax.servlet.http.HttpServletResponse.SC_FORBIDDEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 403 + "'", int0 == 403);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.AuditLogEntry auditLogEntry1 = new org.dataone.cn.log.AuditLogEntry();
        auditLogEntry1.setNodeId("org.dataone.cn.batch.exceptions.ExecutionDisabledException: hi!");
        org.dataone.cn.log.MetricEvent metricEvent4 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference5 = null;
        org.dataone.service.types.v1.Identifier identifier6 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry8 = new org.dataone.cn.log.MetricLogEntry(metricEvent4, nodeReference5, identifier6, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent9 = metricLogEntry8.getEvent();
        java.util.Date date10 = metricLogEntry8.getDateLogged();
        auditLogEntry1.setDateLogged(date10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList14 = replicationDaoMetacatImpl0.getInvalidMemberNodeReplicasByDate(date10, 307, 10);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'INVALIDATED'   AND member_node <> 'cnDev'  ORDER BY date_verified ASC  LIMIT 10 OFFSET 3060; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + metricEvent4 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent4.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent9 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent9.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Nov 20 02:38:05 CST 2023");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        org.dataone.cn.dao.ReplicationDao replicationDao0 = org.dataone.cn.dao.DaoFactory.getReplicationDao();
        org.dataone.cn.log.AuditLogEntry auditLogEntry3 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date4 = null;
        auditLogEntry3.setDateLogged(date4);
        org.dataone.cn.log.AuditEvent auditEvent6 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str7 = auditEvent6.toString();
        auditLogEntry3.setEvent(auditEvent6);
        org.dataone.cn.log.AuditEvent auditEvent9 = auditLogEntry3.getEvent();
        org.dataone.cn.log.AuditLogEntry auditLogEntry11 = new org.dataone.cn.log.AuditLogEntry("isMnAdministrator", "systemmetadata", auditEvent9, "processing");
        org.dataone.cn.log.MetricLogClient metricLogClient12 = org.dataone.cn.log.MetricLogClientFactory.getMetricLogClient();
        org.dataone.cn.log.MetricEvent metricEvent13 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference14 = null;
        org.dataone.service.types.v1.Identifier identifier15 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry17 = new org.dataone.cn.log.MetricLogEntry(metricEvent13, nodeReference14, identifier15, "smreplicationpolicy");
        boolean boolean18 = metricLogClient12.logMetricEvent(metricLogEntry17);
        org.dataone.cn.log.MetricEvent metricEvent19 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference20 = null;
        org.dataone.service.types.v1.Identifier identifier21 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry23 = new org.dataone.cn.log.MetricLogEntry(metricEvent19, nodeReference20, identifier21, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent24 = metricLogEntry23.getEvent();
        java.util.Date date25 = metricLogEntry23.getDateLogged();
        metricLogEntry17.setDateLogged(date25);
        auditLogEntry11.setDateLogged(date25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.cn.dao.ReplicationDao.ReplicaDto> replicaDtoList28 = replicationDao0.getRequestedReplicasByDate(date25);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        guid,                                  member_node,                           status,                                date_verified                          FROM  smreplicationstatus              WHERE date_verified <= ?               AND status = 'REQUESTED'               ORDER BY date_verified ASC;           [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(replicationDao0);
        org.junit.Assert.assertTrue("'" + auditEvent6 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent6.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "replica not found" + "'", str7, "replica not found");
        org.junit.Assert.assertTrue("'" + auditEvent9 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent9.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertNotNull(metricLogClient12);
        org.junit.Assert.assertTrue("'" + metricEvent13 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent13.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + metricEvent19 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent19.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent24 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent24.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Mon Nov 20 02:38:05 CST 2023");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        com.hazelcast.config.Config config0 = null;
        org.dataone.cn.hazelcast.ClientConfiguration clientConfiguration1 = new org.dataone.cn.hazelcast.ClientConfiguration(config0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = clientConfiguration1.getPassword();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry3 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2);
        org.dataone.service.types.v1.NodeReference nodeReference4 = null;
        metricLogEntry3.setNodeId(nodeReference4);
        org.dataone.service.types.v1.Identifier identifier6 = null;
        metricLogEntry3.setPid(identifier6);
        org.dataone.cn.log.MetricEvent metricEvent8 = metricLogEntry3.getEvent();
        org.dataone.cn.log.MetricLogEntry metricLogEntry9 = new org.dataone.cn.log.MetricLogEntry(metricEvent8);
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertTrue("'" + metricEvent8 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent8.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = replicationDaoMetacatImpl0.queuedReplicaExists("", "log aggregation harvest retrieved");
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT        count(*)                               FROM  smreplicationstatus              WHERE guid = ?                         AND member_node = ?                    AND status = 'QUEUED'                 [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        org.dataone.cn.dao.ReplicationDaoMetacatImpl replicationDaoMetacatImpl0 = new org.dataone.cn.dao.ReplicationDaoMetacatImpl();
        org.dataone.cn.log.AuditLogWriteClientSplunkImpl auditLogWriteClientSplunkImpl1 = new org.dataone.cn.log.AuditLogWriteClientSplunkImpl();
        org.dataone.cn.log.AuditLogEntry auditLogEntry2 = new org.dataone.cn.log.AuditLogEntry();
        java.util.Date date3 = null;
        auditLogEntry2.setDateLogged(date3);
        org.dataone.cn.log.AuditEvent auditEvent5 = org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND;
        java.lang.String str6 = auditEvent5.toString();
        auditLogEntry2.setEvent(auditEvent5);
        org.dataone.cn.log.AuditEvent auditEvent8 = auditLogEntry2.getEvent();
        boolean boolean9 = auditLogWriteClientSplunkImpl1.removeReplicaAuditEvent(auditLogEntry2);
        auditLogEntry2.setId("log aggregation harvest retrieved");
        org.dataone.cn.log.MetricLogClient metricLogClient12 = org.dataone.cn.log.MetricLogClientFactory.getMetricLogClient();
        org.dataone.cn.log.MetricEvent metricEvent13 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference14 = null;
        org.dataone.service.types.v1.Identifier identifier15 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry17 = new org.dataone.cn.log.MetricLogEntry(metricEvent13, nodeReference14, identifier15, "smreplicationpolicy");
        boolean boolean18 = metricLogClient12.logMetricEvent(metricLogEntry17);
        org.dataone.cn.log.MetricEvent metricEvent19 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference20 = null;
        org.dataone.service.types.v1.Identifier identifier21 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry23 = new org.dataone.cn.log.MetricLogEntry(metricEvent19, nodeReference20, identifier21, "smreplicationpolicy");
        org.dataone.cn.log.MetricEvent metricEvent24 = metricLogEntry23.getEvent();
        java.util.Date date25 = metricLogEntry23.getDateLogged();
        metricLogEntry17.setDateLogged(date25);
        auditLogEntry2.setDateLogged(date25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.dataone.service.types.v1.Identifier> identifierList30 = replicationDaoMetacatImpl0.getCompletedCoordinatingNodeReplicasByDate(date25, 404, 0);
            org.junit.Assert.fail("Expected exception of type org.springframework.jdbc.BadSqlGrammarException; message: PreparedStatementCallback; bad SQL grammar []; nested exception is org.h2.jdbc.JdbcSQLException: Table \"SMREPLICATIONSTATUS\" not found; SQL statement:?SELECT DISTINCT guid, date_verified  FROM  smreplicationstatus  WHERE date_verified <= ?   AND status = 'COMPLETED'   AND member_node = 'cnDev'  ORDER BY date_verified ASC; [42102-163]");
        } catch (org.springframework.jdbc.BadSqlGrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + auditEvent5 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent5.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "replica not found" + "'", str6, "replica not found");
        org.junit.Assert.assertTrue("'" + auditEvent8 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent8.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(metricLogClient12);
        org.junit.Assert.assertTrue("'" + metricEvent13 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent13.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + metricEvent19 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent19.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertTrue("'" + metricEvent24 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent24.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Mon Nov 20 02:38:05 CST 2023");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        org.dataone.cn.log.MetricLogClient metricLogClient0 = org.dataone.cn.log.MetricLogClientFactory.getMetricLogClient();
        org.dataone.cn.log.MetricEvent metricEvent1 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        org.dataone.service.types.v1.Identifier identifier3 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry6 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, nodeReference2, identifier3, "xml_access", (java.lang.Long) (-1L));
        metricLogEntry6.setMessage("log aggregation harvest retrieved");
        boolean boolean9 = metricLogClient0.logMetricEvent(metricLogEntry6);
        org.junit.Assert.assertNotNull(metricLogClient0);
        org.junit.Assert.assertTrue("'" + metricEvent1 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent1.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        org.dataone.cn.log.MetricLogClientLog4JImpl metricLogClientLog4JImpl0 = new org.dataone.cn.log.MetricLogClientLog4JImpl();
        org.dataone.cn.log.MetricEvent metricEvent1 = org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED;
        org.dataone.service.types.v1.NodeReference nodeReference2 = null;
        org.dataone.service.types.v1.Identifier identifier3 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, nodeReference2, identifier3);
        org.dataone.service.types.v1.NodeReference nodeReference5 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry6 = new org.dataone.cn.log.MetricLogEntry(metricEvent1, nodeReference5);
        boolean boolean7 = metricLogClientLog4JImpl0.logMetricEvent(metricLogEntry6);
        org.junit.Assert.assertTrue("'" + metricEvent1 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent1.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        org.dataone.cn.log.AuditLogClientSolrImpl auditLogClientSolrImpl0 = new org.dataone.cn.log.AuditLogClientSolrImpl();
        org.dataone.cn.log.AuditLogEntry auditLogEntry1 = new org.dataone.cn.log.AuditLogEntry();
        auditLogEntry1.setLogText("smreplicationstatus");
        auditLogEntry1.setLogText("org.dataone.cn.batch.exceptions.ExecutionDisabledException: hi!");
        java.lang.String str6 = auditLogEntry1.getPid();
        boolean boolean7 = auditLogClientSolrImpl0.removeReplicaAuditEvent(auditLogEntry1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }
}
