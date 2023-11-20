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
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient5 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList3);
        defaultQyWeixinRobotKeyManagerComponent0.init(qyWeixinRobotGroupClient5);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList8 = defaultQyWeixinRobotKeyManagerComponent0.selectKeys(100);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey11 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey("SelectKey[key='hi!', timestamp=28341206]", (long) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultQyWeixinRobotKeyManagerComponent0.recover(selectKey11);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration qyWeixinRobotAutoConfiguration0 = new io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent1 = qyWeixinRobotAutoConfiguration0.defaultQyWeixinRobotScheduledManager();
        io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotKeyManagerFactoryBean qyWeixinRobotKeyManagerFactoryBean2 = qyWeixinRobotAutoConfiguration0.defaultKeyManagerFactoryBean();
        java.lang.Class<? extends io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent> wildcardClass3 = qyWeixinRobotKeyManagerFactoryBean2.clazz;
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent4 = qyWeixinRobotKeyManagerFactoryBean2.getObject();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent5 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient10 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList8);
        defaultQyWeixinRobotKeyManagerComponent5.init(qyWeixinRobotGroupClient10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList13 = defaultQyWeixinRobotKeyManagerComponent5.selectKeys((int) (byte) 0);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey15 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("hi!");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey16 = qyWeixinRobotKey15.decrement();
        java.lang.String str17 = selectKey16.getKey();
        defaultQyWeixinRobotKeyManagerComponent5.recover(selectKey16);
        java.lang.String str19 = selectKey16.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        qyWeixinRobotKeyManagerComponent4.recover(selectKey16);
    }
}

