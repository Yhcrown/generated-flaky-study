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
        com.hazelcast.client.HazelcastClient hazelcastClient0 = org.dataone.cn.hazelcast.HazelcastClientFactory.getProcessingClient();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.dataone.cn.hazelcast.membership.ClusterPartitionMonitor.startSessionMonitor();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.hazelcast.client.HazelcastClient hazelcastClient0 = org.dataone.cn.hazelcast.HazelcastClientFactory.getStorageClient();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.hazelcast.core.IMap<org.dataone.service.types.v1.Identifier, java.lang.String> identifierMap0 = org.dataone.cn.hazelcast.HazelcastClientFactory.getObjectPathMap();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.dataone.cn.hazelcast.membership.ClusterPartitionMonitor.stopMonitors();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.hazelcast.core.IMap<org.dataone.service.types.v1.NodeReference, org.dataone.service.types.v1.Node> nodeReferenceMap0 = org.dataone.cn.hazelcast.HazelcastClientFactory.getNodeMap();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.hazelcast.core.IMap<org.dataone.service.types.v1.Identifier, org.dataone.service.types.v2.SystemMetadata> identifierMap0 = org.dataone.cn.hazelcast.HazelcastClientFactory.getSystemMetadataMap();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.hazelcast.client.HazelcastClient hazelcastClient0 = org.dataone.cn.hazelcast.HazelcastClientFactory.getSessionClient();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.hazelcast.client.HazelcastClient hazelcastClient0 = org.dataone.cn.hazelcast.HazelcastClientInstance.getHazelcastClient();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.dataone.cn.hazelcast.membership.ClusterPartitionMonitor.startProcessingMonitor();
    }
}

