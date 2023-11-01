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
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey11 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey("SelectKey[key='hi!', timestamp=28313287]", (long) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultQyWeixinRobotKeyManagerComponent0.recover(selectKey11);
    }
}

