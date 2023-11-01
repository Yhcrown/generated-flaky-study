import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper0 = new com.j256.simplejmx.server.PublishAllBeanWrapper();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean1 = new com.j256.simplejmx.server.ReflectionMbean(publishAllBeanWrapper0);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper0 = new com.j256.simplejmx.server.PublishAllBeanWrapper();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo1 = publishAllBeanWrapper0.getJmxResourceInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.j256.simplejmx.common.JmxOperationInfo[] jmxOperationInfoArray2 = publishAllBeanWrapper0.getOperationInfos();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper0 = new com.j256.simplejmx.server.PublishAllBeanWrapper();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo1 = publishAllBeanWrapper0.getJmxResourceInfo();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo2 = publishAllBeanWrapper0.getJmxResourceInfo();
        java.lang.Object obj3 = publishAllBeanWrapper0.getTarget();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo4 = publishAllBeanWrapper0.getJmxResourceInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.j256.simplejmx.server.ReflectionMbean reflectionMbean5 = new com.j256.simplejmx.server.ReflectionMbean(publishAllBeanWrapper0);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.j256.simplejmx.server.JmxServer jmxServer1 = new com.j256.simplejmx.server.JmxServer((int) (byte) 1);
        jmxServer1.close();
        jmxServer1.setUsePlatformMBeanServer(false);
        com.j256.simplejmx.server.PublishAllBeanWrapper publishAllBeanWrapper5 = new com.j256.simplejmx.server.PublishAllBeanWrapper();
        com.j256.simplejmx.common.JmxResourceInfo jmxResourceInfo6 = publishAllBeanWrapper5.getJmxResourceInfo();
        publishAllBeanWrapper5.setDelegate((java.lang.Object) (short) 0);
        com.j256.simplejmx.common.JmxAttributeMethodInfo[] jmxAttributeMethodInfoArray9 = publishAllBeanWrapper5.getAttributeMethodInfos();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.management.ObjectName objectName10 = jmxServer1.register(publishAllBeanWrapper5);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        com.j256.simplejmx.spring.BeanPublisher beanPublisher0 = new com.j256.simplejmx.spring.BeanPublisher();
        beanPublisher0.destroy();
        beanPublisher0.destroy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        beanPublisher0.afterPropertiesSet();
    }
}

