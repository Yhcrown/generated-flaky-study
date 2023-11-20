import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTests{
    public static boolean debug = false;


    public void test008_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey1 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("hi!");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey2 = qyWeixinRobotKey1.decrement();
        long long3 = selectKey2.getTimestamp();
        org.junit.Assert.assertNotNull(selectKey2);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 28313287L + "'", long3 == 28313287L);
    }

    public void test063_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient5 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList3);
        defaultQyWeixinRobotKeyManagerComponent0.init(qyWeixinRobotGroupClient5);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList8 = defaultQyWeixinRobotKeyManagerComponent0.selectKeys((int) (byte) 0);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent14 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent16 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent17 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService22 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent23 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit20, false, scheduledExecutorService22);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient24 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList12, qyWeixinRobotHttpClientComponent14, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent16, qyWeixinRobotKeyManagerComponent17, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent23);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage26 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        java.util.List<java.lang.String> strList27 = qyWeixinRobotTextMessage26.getMentionedMobileList();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse28 = qyWeixinRobotGroupClient24.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage26);
        defaultQyWeixinRobotKeyManagerComponent0.init(qyWeixinRobotGroupClient24);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList31 = defaultQyWeixinRobotKeyManagerComponent0.selectKeys(0);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList33 = defaultQyWeixinRobotKeyManagerComponent0.selectKeys((int) 'a');
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent34 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient39 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList37);
        defaultQyWeixinRobotKeyManagerComponent34.init(qyWeixinRobotGroupClient39);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList42 = defaultQyWeixinRobotKeyManagerComponent34.selectKeys((int) (byte) 0);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey44 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("hi!");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey45 = qyWeixinRobotKey44.decrement();
        java.lang.String str46 = selectKey45.getKey();
        defaultQyWeixinRobotKeyManagerComponent34.recover(selectKey45);
        defaultQyWeixinRobotKeyManagerComponent0.recover(selectKey45);
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent49 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient54 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList52);
        defaultQyWeixinRobotKeyManagerComponent49.init(qyWeixinRobotGroupClient54);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList57 = defaultQyWeixinRobotKeyManagerComponent49.selectKeys((int) (byte) 0);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey59 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("hi!");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey60 = qyWeixinRobotKey59.decrement();
        java.lang.String str61 = selectKey60.getKey();
        defaultQyWeixinRobotKeyManagerComponent49.recover(selectKey60);
        java.lang.String str63 = selectKey60.toString();
        defaultQyWeixinRobotKeyManagerComponent0.recover(selectKey60);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(selectKeyList8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(strList27);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse28);
        org.junit.Assert.assertNotNull(selectKeyList31);
        org.junit.Assert.assertNotNull(selectKeyList33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(selectKeyList42);
        org.junit.Assert.assertNotNull(selectKey45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(selectKeyList57);
        org.junit.Assert.assertNotNull(selectKey60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "SelectKey[key='hi!', timestamp=28313287]" + "'", str63, "SelectKey[key='hi!', timestamp=28313287]");
    }

    public void test069_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey1 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("hi!");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey2 = qyWeixinRobotKey1.decrement();
        java.lang.String str3 = selectKey2.getKey();
        java.lang.String str4 = selectKey2.toString();
        org.junit.Assert.assertNotNull(selectKey2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SelectKey[key='hi!', timestamp=28313287]" + "'", str4, "SelectKey[key='hi!', timestamp=28313287]");
    }

    public void test088_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent5 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent7 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent8 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent14 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit11, false, scheduledExecutorService13);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient15 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList3, qyWeixinRobotHttpClientComponent5, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent7, qyWeixinRobotKeyManagerComponent8, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent14);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient16 = null;
        defaultQyWeixinRobotScheduledManagerComponent14.init(qyWeixinRobotGroupClient16);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotThreadFactory qyWeixinRobotThreadFactory19 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotThreadFactory("\u72b6\u6001\u5df2\u5173\u95ed");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotThreadFactory qyWeixinRobotThreadFactory21 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotThreadFactory("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        java.lang.Runnable runnable22 = null;
        java.lang.Thread thread23 = qyWeixinRobotThreadFactory21.newThread(runnable22);
        java.lang.Thread thread24 = qyWeixinRobotThreadFactory19.newThread((java.lang.Runnable) thread23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture25 = defaultQyWeixinRobotScheduledManagerComponent14.scheduled((java.lang.Runnable) thread23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(thread23);
        org.junit.Assert.assertEquals(thread23.toString(), "Thread[QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']1,5,main]");
        org.junit.Assert.assertNotNull(thread24);
         org.junit.Assert.assertEquals(thread24.toString(), "\u72b6\u6001\u5df2\u5173\u95ed1,5,main]");
    }

    public void test095_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient5 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList3);
        defaultQyWeixinRobotKeyManagerComponent0.init(qyWeixinRobotGroupClient5);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList8 = defaultQyWeixinRobotKeyManagerComponent0.selectKeys((int) (byte) 0);
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent9 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient14 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList12);
        defaultQyWeixinRobotKeyManagerComponent9.init(qyWeixinRobotGroupClient14);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList17 = defaultQyWeixinRobotKeyManagerComponent9.selectKeys((int) (byte) 0);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey19 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("hi!");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey20 = qyWeixinRobotKey19.decrement();
        java.lang.String str21 = selectKey20.getKey();
        defaultQyWeixinRobotKeyManagerComponent9.recover(selectKey20);
        long long23 = selectKey20.getTimestamp();
        defaultQyWeixinRobotKeyManagerComponent0.recover(selectKey20);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList26 = defaultQyWeixinRobotKeyManagerComponent0.selectKeys((int) '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(selectKeyList8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(selectKeyList17);
        org.junit.Assert.assertNotNull(selectKey20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 28313287L + "'", long23 == 28313287L);
        org.junit.Assert.assertNotNull(selectKeyList26);
    }

    public void test102_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey1 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("hi!");
        java.lang.String str2 = qyWeixinRobotKey1.getKey();
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey3 = qyWeixinRobotKey1.decrement();
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey4 = qyWeixinRobotKey1.decrement();
        java.lang.String str5 = selectKey4.toString();
        java.lang.String str6 = selectKey4.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(selectKey3);
        org.junit.Assert.assertNotNull(selectKey4);
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SelectKey[key='hi!', timestamp=28313287]" + "'", str5, "SelectKey[key='hi!', timestamp=28313287]");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SelectKey[key='hi!', timestamp=28313287]" + "'", str6, "SelectKey[key='hi!', timestamp=28313287]");
    }

    public void test102_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey1 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("hi!");
        java.lang.String str2 = qyWeixinRobotKey1.getKey();
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey3 = qyWeixinRobotKey1.decrement();
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey4 = qyWeixinRobotKey1.decrement();
        java.lang.String str5 = selectKey4.toString();
        java.lang.String str6 = selectKey4.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(selectKey3);
        org.junit.Assert.assertNotNull(selectKey4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SelectKey[key='hi!', timestamp=28313287]" + "'", str5, "SelectKey[key='hi!', timestamp=28313287]");
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SelectKey[key='hi!', timestamp=28313287]" + "'", str6, "SelectKey[key='hi!', timestamp=28313287]");
    }

    public void test153_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient4 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList2);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage7 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("{markdown={content=hi!}, msgtype=markdown}", "QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse8 = qyWeixinRobotGroupClient4.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage7);
        java.lang.String str9 = qyWeixinRobotResponse8.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse8);
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u72b6\u6001\u5df2\u5173\u95ed', type='null', media_id='null', created_at='null']" + "'", str9, "\u72b6\u6001\u5df2\u5173\u95ed', type='null', media_id='null', created_at='null']");
    }
}