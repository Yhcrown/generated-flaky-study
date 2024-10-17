package flaky; 

// import org.junit.FixMethodOrder;

import org.junit.Test;

// import org.junit.runners.MethodSorters;

// @FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTest{
    public static boolean debug = false;

	@Test
    public void test092_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date7.toString(), "Mon Nov 20 02:38:01 CST 2023");
    }
	@Test
    public void test101_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date7.toString(), "Mon Nov 20 02:38:01 CST 2023");
    }
	@Test
    public void test115_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date7.toString(), "Mon Nov 20 02:38:01 CST 2023");
    }
	@Test
    public void test117_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date7.toString(), "Mon Nov 20 02:38:02 CST 2023");
    }
	@Test
    public void test123_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date16.toString(), "Mon Nov 20 02:38:02 CST 2023");
    }
	@Test
    public void test124_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date15.toString(), "Mon Nov 20 02:38:02 CST 2023");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/etc/dataone/storage/hazelcast.xml" + "'", str18, "/etc/dataone/storage/hazelcast.xml");
    }
	@Test
    public void test134_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        org.apache.commons.logging.Log log0 = org.dataone.cn.ldap.LDAPService.log;
         org.junit.Assert.assertNotNull(log0);
    }
	@Test
    public void test139_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date10.toString(), "Mon Nov 20 02:38:02 CST 2023");
    }
	@Test
    public void test144_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        org.dataone.cn.log.MetricEvent metricEvent0 = org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED;
        org.dataone.service.types.v1.NodeReference nodeReference1 = null;
        org.dataone.service.types.v1.Identifier identifier2 = null;
        org.dataone.cn.log.MetricLogEntry metricLogEntry4 = new org.dataone.cn.log.MetricLogEntry(metricEvent0, nodeReference1, identifier2, "smreplicationpolicy");
        java.lang.String str5 = metricLogEntry4.toString();
        java.lang.Long long6 = metricLogEntry4.getTimeToCompleteEventMS();
        org.junit.Assert.assertTrue("'" + metricEvent0 + "' != '" + org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED + "'", metricEvent0.equals(org.dataone.cn.log.MetricEvent.LOG_AGGREGATION_HARVEST_RETRIEVED));
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{\"event\":\"log aggregation harvest retrieved\",\"message\":\"smreplicationpolicy\",\"threadName\":\"randoop.util.RunnerThread\",\"threadId\":3646,\"dateLogged\":\"2023-11-20T08:38:02.572+00:00\"}" + "'", str5, "{\"event\":\"log aggregation harvest retrieved\",\"message\":\"smreplicationpolicy\",\"threadName\":\"randoop.util.RunnerThread\",\"threadId\":3646,\"dateLogged\":\"2023-11-20T08:38:02.572+00:00\"}");
        org.junit.Assert.assertNull(long6);
    }
	@Test
    public void test146_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date16.toString(), "Mon Nov 20 02:38:02 CST 2023");
    }
	@Test
    public void test149_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date15.toString(), "Mon Nov 20 02:38:02 CST 2023");
        org.junit.Assert.assertTrue("'" + auditEvent18 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent18.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
    }
	@Test
    public void test153_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date7.toString(), "Mon Nov 20 02:38:02 CST 2023");
    }
	@Test
    public void test155_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date15.toString(), "Mon Nov 20 02:38:02 CST 2023");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "processing" + "'", str18, "processing");
    }
	@Test
    public void test160_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date10.toString(), "Mon Nov 20 02:38:03 CST 2023");
    }
	@Test
    public void test173_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date10.toString(), "Mon Nov 20 02:38:03 CST 2023");
    }
	@Test
    public void test175_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date14.toString(), "Mon Nov 20 02:38:03 CST 2023");
    }
	@Test
    public void test176_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date10.toString(), "Mon Nov 20 02:38:03 CST 2023");
    }
	@Test
    public void test179_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date7.toString(), "Mon Nov 20 02:38:03 CST 2023");
    }
	@Test
    public void test185_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date17.toString(), "Mon Nov 20 02:38:03 CST 2023");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }
	@Test
    public void test187_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date6.toString(), "Mon Nov 20 02:38:03 CST 2023");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Nov 20 02:38:03 CST 2023");
    }
	@Test
    public void test187_2() throws Throwable {
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
         org.junit.Assert.assertEquals(date9.toString(), "Mon Nov 20 02:38:03 CST 2023");
    }
	@Test
    public void test189_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date16.toString(), "Mon Nov 20 02:38:03 CST 2023");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/etc/dataone/storage/hazelcast.xml" + "'", str19, "/etc/dataone/storage/hazelcast.xml");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + auditEvent26 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent26.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "replica not found" + "'", str27, "replica not found");
        org.junit.Assert.assertNull(str33);
    }
	@Test
    public void test208_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date24.toString(), "Mon Nov 20 02:38:03 CST 2023");
    }
	@Test
    public void test226_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date25.toString(), "Mon Nov 20 02:38:04 CST 2023");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }
	@Test
    public void test229_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date15.toString(), "Mon Nov 20 02:38:04 CST 2023");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "replica not found" + "'", str18, "replica not found");
    }
	@Test
    public void test230_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date6.toString(), "Mon Nov 20 02:38:04 CST 2023");
        org.junit.Assert.assertNull(identifier9);
    }
	@Test
    public void test237_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date14.toString(), "Mon Nov 20 02:38:04 CST 2023");
    }
	@Test
    public void test242_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date25.toString(), "Mon Nov 20 02:38:04 CST 2023");
    }
	@Test
    public void test245_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date29.toString(), "Mon Nov 20 02:38:04 CST 2023");
    }
	@Test
    public void test251_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date10.toString(), "Mon Nov 20 02:38:04 CST 2023");
    }
	@Test
    public void test253_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date8.toString(), "Mon Nov 20 02:38:04 CST 2023");
    }
	@Test
    public void test258_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date15.toString(), "Mon Nov 20 02:38:04 CST 2023");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/etc/dataone/storage/hazelcast.xml" + "'", str18, "/etc/dataone/storage/hazelcast.xml");
        org.junit.Assert.assertTrue("'" + auditEvent19 + "' != '" + org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND + "'", auditEvent19.equals(org.dataone.cn.log.AuditEvent.REPLICA_NOT_FOUND));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/etc/dataone/storage/hazelcast.xml" + "'", str20, "/etc/dataone/storage/hazelcast.xml");
    }
	@Test
    public void test259_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date25.toString(), "Mon Nov 20 02:38:04 CST 2023");
    }
	@Test
    public void test265_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date9.toString(), "Mon Nov 20 02:38:04 CST 2023");
        org.junit.Assert.assertNull(auditEvent11);
        org.junit.Assert.assertNull(str12);
    }
	@Test
    public void test268_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{\"event\":\"synchronization harvest submitted\",\"threadName\":\"randoop.util.RunnerThread\",\"threadId\":15620,\"dateLogged\":\"2023-11-20T08:38:04.755+00:00\"}" + "'", str8, "{\"event\":\"synchronization harvest submitted\",\"threadName\":\"randoop.util.RunnerThread\",\"threadId\":15620,\"dateLogged\":\"2023-11-20T08:38:04.755+00:00\"}");
    }
	@Test
    public void test272_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date6.toString(), "Mon Nov 20 02:38:04 CST 2023");
        org.junit.Assert.assertNull(long7);
    }
	@Test
    public void test274_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{\"event\":\"synchronization harvest submitted\",\"message\":\"log aggregation harvest retrieved\",\"timeToCompleteEventMS\":-1,\"threadName\":\"randoop.util.RunnerThread\",\"threadId\":15743,\"dateLogged\":\"2023-11-20T08:38:04.805+00:00\"}" + "'", str16, "{\"event\":\"synchronization harvest submitted\",\"message\":\"log aggregation harvest retrieved\",\"timeToCompleteEventMS\":-1,\"threadName\":\"randoop.util.RunnerThread\",\"threadId\":15743,\"dateLogged\":\"2023-11-20T08:38:04.805+00:00\"}");
        org.junit.Assert.assertTrue("'" + metricEvent17 + "' != '" + org.dataone.cn.log.MetricEvent.REPLICA_STATUS + "'", metricEvent17.equals(org.dataone.cn.log.MetricEvent.REPLICA_STATUS));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "replication status" + "'", str18, "replication status");
    }
	@Test
    public void test286_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date15.toString(), "Mon Nov 20 02:38:04 CST 2023");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/etc/dataone/storage/hazelcast.xml" + "'", str18, "/etc/dataone/storage/hazelcast.xml");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/etc/dataone/storage/hazelcast.xml" + "'", str19, "/etc/dataone/storage/hazelcast.xml");
    }
	@Test
    public void test297_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date21.toString(), "Mon Nov 20 02:38:05 CST 2023");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str38);
    }
	@Test
    public void test300_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{\"event\":\"log aggregation harvest retrieved\",\"message\":\"smreplicationpolicy\",\"threadName\":\"randoop.util.RunnerThread\",\"threadId\":16770,\"dateLogged\":\"2023-11-20T08:38:05.043+00:00\"}" + "'", str5, "{\"event\":\"log aggregation harvest retrieved\",\"message\":\"smreplicationpolicy\",\"threadName\":\"randoop.util.RunnerThread\",\"threadId\":16770,\"dateLogged\":\"2023-11-20T08:38:05.043+00:00\"}");
        org.junit.Assert.assertTrue("'" + metricEvent6 + "' != '" + org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED + "'", metricEvent6.equals(org.dataone.cn.log.MetricEvent.SYNCHRONIZATION_HARVEST_SUBMITTED));
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Nov 20 02:38:05 CST 2023");
    }
	@Test
    public void test300_2() throws Throwable {
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
         org.junit.Assert.assertEquals(date12.toString(), "Mon Nov 20 02:38:05 CST 2023");
    }
	@Test
    public void test310_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date7.toString(), "Mon Nov 20 02:38:05 CST 2023");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Nov 20 02:38:05 CST 2023");
    }
	@Test
    public void test310_2() throws Throwable {
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
         org.junit.Assert.assertEquals(date8.toString(), "Mon Nov 20 02:38:05 CST 2023");
    }
	@Test
    public void test312_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date10.toString(), "Mon Nov 20 02:38:05 CST 2023");
    }
	@Test
    public void test313_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date25.toString(), "Mon Nov 20 02:38:05 CST 2023");
    }
	@Test
    public void test317_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date25.toString(), "Mon Nov 20 02:38:05 CST 2023");
    }
}