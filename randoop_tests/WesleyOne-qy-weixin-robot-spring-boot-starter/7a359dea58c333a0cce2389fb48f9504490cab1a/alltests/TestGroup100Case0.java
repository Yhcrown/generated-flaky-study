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
        okhttp3.OkHttpClient okHttpClient0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent defaultQyWeixinRobotRetrofit2HttpClientComponent1 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent(okHttpClient0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: client == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent1 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage qyWeixinRobotBaseMessage2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = defaultQyWeixinRobotQueueManagerComponent1.provide(qyWeixinRobotBaseMessage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType qyWeixinRobotMessageType0 = io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.text;
        org.junit.Assert.assertTrue("'" + qyWeixinRobotMessageType0 + "' != '" + io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.text + "'", qyWeixinRobotMessageType0.equals(io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.text));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.lang.String str0 = io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage.AT_ALL_C;
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent1 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent(scheduledExecutorService0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse1 = io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse.err("");
        qyWeixinRobotResponse1.setErrmsg("hi!");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.util.concurrent.ExecutorService executorService0 = io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient.getSendExecutorService();
        org.junit.Assert.assertNotNull(executorService0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey1 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("hi!");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey2 = qyWeixinRobotKey1.decrement();
        long long3 = selectKey2.getTimestamp();
        org.junit.Assert.assertNotNull(selectKey2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 28313287L + "'", long3 == 28313287L);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.lang.String str0 = org.springframework.beans.factory.FactoryBean.OBJECT_TYPE_ATTRIBUTE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "factoryBeanObjectType" + "'", str0, "factoryBeanObjectType");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType qyWeixinRobotMessageType0 = io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.file;
        org.junit.Assert.assertTrue("'" + qyWeixinRobotMessageType0 + "' != '" + io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.file + "'", qyWeixinRobotMessageType0.equals(io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.file));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage[] qyWeixinRobotBaseMessageArray0 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage[] {};
        java.util.ArrayList<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList1 = new java.util.ArrayList<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage>) qyWeixinRobotBaseMessageList1, qyWeixinRobotBaseMessageArray0);
        boolean boolean3 = io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotUtil.isNotEmpty((java.util.Collection<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage>) qyWeixinRobotBaseMessageList1);
        boolean boolean4 = io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotUtil.isEmpty((java.util.Collection<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage>) qyWeixinRobotBaseMessageList1);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse0 = io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse.ok();
        java.lang.String str1 = qyWeixinRobotResponse0.toString();
        boolean boolean2 = qyWeixinRobotResponse0.isSuccess();
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']" + "'", str1, "QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        java.lang.String str3 = article2.getPicurl();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse0 = io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse.ok();
        java.lang.String str1 = qyWeixinRobotResponse0.getCreated_at();
        qyWeixinRobotResponse0.setErrcode((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService4 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent5 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit2, false, scheduledExecutorService4);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotThreadFactory qyWeixinRobotThreadFactory7 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotThreadFactory("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        java.lang.Runnable runnable8 = null;
        java.lang.Thread thread9 = qyWeixinRobotThreadFactory7.newThread(runnable8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture10 = defaultQyWeixinRobotScheduledManagerComponent5.scheduled(runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(thread9);
        org.junit.Assert.assertEquals(thread9.toString(), "Thread[QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']1,5,main]");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
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
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotThreadFactory qyWeixinRobotThreadFactory17 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotThreadFactory("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        java.lang.Runnable runnable18 = null;
        java.lang.Thread thread19 = qyWeixinRobotThreadFactory17.newThread(runnable18);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture20 = defaultQyWeixinRobotScheduledManagerComponent14.scheduled(runnable18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(thread19);
        org.junit.Assert.assertEquals(thread19.toString(), "Thread[QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']1,5,main]");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent6 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent8 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService14 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent15 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit12, false, scheduledExecutorService14);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient16 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList4, qyWeixinRobotHttpClientComponent6, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent8, qyWeixinRobotKeyManagerComponent9, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent15);
        defaultQyWeixinRobotScheduledManagerComponent0.destroy(qyWeixinRobotGroupClient16);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient18 = null;
        defaultQyWeixinRobotScheduledManagerComponent0.destroy(qyWeixinRobotGroupClient18);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey1 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("\u72b6\u6001\u5df2\u5173\u95ed");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("hi!");
        java.lang.String str3 = qyWeixinRobotMarkdownMessage2.toString();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder callbackBuilder4 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage2);
        retrofit2.Callback<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse> qyWeixinRobotResponseCallback5 = callbackBuilder4.build();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{markdown={content=hi!}, msgtype=markdown}" + "'", str3, "{markdown={content=hi!}, msgtype=markdown}");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponseCallback5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("hi!");
        java.lang.String str3 = qyWeixinRobotMarkdownMessage2.toString();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder callbackBuilder4 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage2);
        qyWeixinRobotMarkdownMessage2.setContent("{markdown={content=hi!}, msgtype=markdown}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{markdown={content=hi!}, msgtype=markdown}" + "'", str3, "{markdown={content=hi!}, msgtype=markdown}");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage1 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        java.lang.String str2 = qyWeixinRobotMarkdownMessage1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}" + "'", str2, "{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("factoryBeanObjectType", "SelectKey[key='hi!', timestamp=28313287]");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage1 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("hi!");
        java.lang.String str2 = qyWeixinRobotMarkdownMessage1.toString();
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType qyWeixinRobotMessageType3 = qyWeixinRobotMarkdownMessage1.getMsgType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{markdown={content=hi!}, msgtype=markdown}" + "'", str2, "{markdown={content=hi!}, msgtype=markdown}");
        org.junit.Assert.assertTrue("'" + qyWeixinRobotMessageType3 + "' != '" + io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.markdown + "'", qyWeixinRobotMessageType3.equals(io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.markdown));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotUtil qyWeixinRobotUtil0 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotUtil();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "{markdown={content=hi!}, msgtype=markdown}" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent6 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent8 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList10 = defaultQyWeixinRobotQueueManagerComponent8.consume((int) ' ');
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService16 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent17 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent(100L, (long) '#', timeUnit14, true, scheduledExecutorService16);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient18 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList4, qyWeixinRobotHttpClientComponent6, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent8, qyWeixinRobotKeyManagerComponent11, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent17);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotThreadFactory qyWeixinRobotThreadFactory20 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotThreadFactory("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        java.lang.Runnable runnable21 = null;
        java.lang.Thread thread22 = qyWeixinRobotThreadFactory20.newThread(runnable21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture23 = defaultQyWeixinRobotScheduledManagerComponent17.scheduled(runnable21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList10);
        org.junit.Assert.assertNotNull(thread22);
        org.junit.Assert.assertEquals(thread22.toString(), "Thread[QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']1,5,main]");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
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
        // The following exception was thrown during execution in test generation
        try {
            qyWeixinRobotGroupClient24.init();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(selectKeyList8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(strList27);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse28);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType qyWeixinRobotMessageType0 = io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.news;
        org.junit.Assert.assertTrue("'" + qyWeixinRobotMessageType0 + "' != '" + io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.news + "'", qyWeixinRobotMessageType0.equals(io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.news));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
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
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent16 = qyWeixinRobotGroupClient15.getHttpClient();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage18 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType qyWeixinRobotMessageType19 = qyWeixinRobotTextMessage18.getMsgType();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse20 = qyWeixinRobotGroupClient15.sendDirect((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage18);
        qyWeixinRobotResponse20.setErrmsg("");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotHttpClientComponent16);
        org.junit.Assert.assertTrue("'" + qyWeixinRobotMessageType19 + "' != '" + io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.text + "'", qyWeixinRobotMessageType19.equals(io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.text));
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse20);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse0 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse();
        qyWeixinRobotResponse0.setType("{msgtype=text, text={content=QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']}}");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
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
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage17 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        java.util.List<java.lang.String> strList18 = qyWeixinRobotTextMessage17.getMentionedMobileList();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse19 = qyWeixinRobotGroupClient15.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage17);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent20 = qyWeixinRobotGroupClient15.getHttpClient();
        qyWeixinRobotGroupClient15.destroy();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(strList18);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse19);
        org.junit.Assert.assertNotNull(qyWeixinRobotHttpClientComponent20);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
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
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent21 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent23 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent24 = null;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService29 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent30 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit27, false, scheduledExecutorService29);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient31 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList19, qyWeixinRobotHttpClientComponent21, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent23, qyWeixinRobotKeyManagerComponent24, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent30);
        defaultQyWeixinRobotScheduledManagerComponent14.init(qyWeixinRobotGroupClient31);
        // The following exception was thrown during execution in test generation
        try {
            qyWeixinRobotGroupClient31.init();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse1 = io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse.err("\u72b6\u6001\u5df2\u5173\u95ed");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        java.lang.String str0 = org.springframework.beans.factory.FactoryBean.OBJECT_TYPE_ATTRIBUTE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "factoryBeanObjectType" + "'", str0, "factoryBeanObjectType");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent6 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent8 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService14 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent15 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit12, false, scheduledExecutorService14);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient16 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList4, qyWeixinRobotHttpClientComponent6, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent8, qyWeixinRobotKeyManagerComponent9, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent15);
        defaultQyWeixinRobotScheduledManagerComponent0.destroy(qyWeixinRobotGroupClient16);
        qyWeixinRobotGroupClient16.destroy();
        qyWeixinRobotGroupClient16.destroy();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent26 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent28 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent29 = null;
        java.util.concurrent.TimeUnit timeUnit32 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService34 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent35 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit32, false, scheduledExecutorService34);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient36 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList24, qyWeixinRobotHttpClientComponent26, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent28, qyWeixinRobotKeyManagerComponent29, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent42 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent44 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent45 = null;
        java.util.concurrent.TimeUnit timeUnit48 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService50 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent51 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit48, false, scheduledExecutorService50);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient52 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList40, qyWeixinRobotHttpClientComponent42, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent44, qyWeixinRobotKeyManagerComponent45, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent51);
        defaultQyWeixinRobotScheduledManagerComponent35.init(qyWeixinRobotGroupClient52);
        byte[] byteArray55 = new byte[] {};
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse56 = qyWeixinRobotGroupClient52.uploadMedia("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", byteArray55);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse57 = qyWeixinRobotGroupClient16.uploadMedia("\u72b6\u6001\u5df2\u5173\u95ed", byteArray55);
        java.lang.String str58 = qyWeixinRobotResponse57.getCreated_at();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[]");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse56);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse57);
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey1 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("factoryBeanObjectType");
        java.lang.String str2 = qyWeixinRobotKey1.getKey();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "factoryBeanObjectType" + "'", str2, "factoryBeanObjectType");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        // The following exception was thrown during execution in test generation
        try {
            io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent1 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent6 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent8 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService14 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent15 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit12, false, scheduledExecutorService14);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient16 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList4, qyWeixinRobotHttpClientComponent6, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent8, qyWeixinRobotKeyManagerComponent9, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent15);
        defaultQyWeixinRobotScheduledManagerComponent0.destroy(qyWeixinRobotGroupClient16);
        qyWeixinRobotGroupClient16.destroy();
        qyWeixinRobotGroupClient16.destroy();
        qyWeixinRobotGroupClient16.destroy();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent22 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent28 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent30 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent31 = null;
        java.util.concurrent.TimeUnit timeUnit34 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService36 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent37 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit34, false, scheduledExecutorService36);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient38 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList26, qyWeixinRobotHttpClientComponent28, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent30, qyWeixinRobotKeyManagerComponent31, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent37);
        defaultQyWeixinRobotScheduledManagerComponent22.destroy(qyWeixinRobotGroupClient38);
        qyWeixinRobotGroupClient38.destroy();
        qyWeixinRobotGroupClient38.destroy();
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent48 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent50 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent51 = null;
        java.util.concurrent.TimeUnit timeUnit54 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService56 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent57 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit54, false, scheduledExecutorService56);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient58 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList46, qyWeixinRobotHttpClientComponent48, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent50, qyWeixinRobotKeyManagerComponent51, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent57);
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent64 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent66 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent67 = null;
        java.util.concurrent.TimeUnit timeUnit70 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService72 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent73 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit70, false, scheduledExecutorService72);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient74 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList62, qyWeixinRobotHttpClientComponent64, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent66, qyWeixinRobotKeyManagerComponent67, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent73);
        defaultQyWeixinRobotScheduledManagerComponent57.init(qyWeixinRobotGroupClient74);
        byte[] byteArray77 = new byte[] {};
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse78 = qyWeixinRobotGroupClient74.uploadMedia("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", byteArray77);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse79 = qyWeixinRobotGroupClient38.uploadMedia("\u72b6\u6001\u5df2\u5173\u95ed", byteArray77);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse80 = qyWeixinRobotGroupClient16.uploadMedia("{msgtype=text, text={content=QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']}}", byteArray77);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[]");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse78);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse79);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse80);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent();
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotThreadFactory qyWeixinRobotThreadFactory2 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotThreadFactory("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        java.lang.Runnable runnable3 = null;
        java.lang.Thread thread4 = qyWeixinRobotThreadFactory2.newThread(runnable3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture5 = defaultQyWeixinRobotScheduledManagerComponent0.scheduled(runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(thread4);
        org.junit.Assert.assertEquals(thread4.toString(), "Thread[QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']1,5,main]");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse1 = io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse.err("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType qyWeixinRobotMessageType0 = io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.image;
        org.junit.Assert.assertTrue("'" + qyWeixinRobotMessageType0 + "' != '" + io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.image + "'", qyWeixinRobotMessageType0.equals(io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.image));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient4 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList2);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage7 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("{markdown={content=hi!}, msgtype=markdown}", "QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse8 = qyWeixinRobotGroupClient4.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage7);
        java.lang.String str9 = qyWeixinRobotImageMessage7.getMd5();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']" + "'", str9, "QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("hi!", "");
        qyWeixinRobotImageMessage2.setBase64("hi!");
        qyWeixinRobotImageMessage2.setMd5("SelectKey[key='hi!', timestamp=28313287]");
        qyWeixinRobotImageMessage2.setMd5("hi!");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        article2.setPicurl("hi!");
        java.lang.String str5 = article2.getTitle();
        article2.setTitle("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService4 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent5 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) (short) 10, (long) (short) 100, timeUnit2, true, scheduledExecutorService4);
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent6 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent12 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent14 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService20 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent21 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit18, false, scheduledExecutorService20);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient22 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList10, qyWeixinRobotHttpClientComponent12, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent14, qyWeixinRobotKeyManagerComponent15, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent21);
        defaultQyWeixinRobotScheduledManagerComponent6.destroy(qyWeixinRobotGroupClient22);
        qyWeixinRobotGroupClient22.destroy();
        qyWeixinRobotGroupClient22.destroy();
        qyWeixinRobotGroupClient22.destroy();
        // The following exception was thrown during execution in test generation
        try {
            defaultQyWeixinRobotScheduledManagerComponent5.destroy(qyWeixinRobotGroupClient22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
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
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent30 = qyWeixinRobotGroupClient24.getScheduledManager();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(selectKeyList8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(strList27);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse28);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent30);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "{markdown={content=hi!}, msgtype=markdown}" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent6 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent8 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList10 = defaultQyWeixinRobotQueueManagerComponent8.consume((int) ' ');
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService16 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent17 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent(100L, (long) '#', timeUnit14, true, scheduledExecutorService16);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient18 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList4, qyWeixinRobotHttpClientComponent6, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent8, qyWeixinRobotKeyManagerComponent11, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent17);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient19 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList10);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        // The following exception was thrown during execution in test generation
        try {
            io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent1 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService4 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent5 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent(100L, (long) '#', timeUnit2, true, scheduledExecutorService4);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotThreadFactory qyWeixinRobotThreadFactory7 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotThreadFactory("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        java.lang.Runnable runnable8 = null;
        java.lang.Thread thread9 = qyWeixinRobotThreadFactory7.newThread(runnable8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture10 = defaultQyWeixinRobotScheduledManagerComponent5.scheduled((java.lang.Runnable) thread9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(thread9);
        org.junit.Assert.assertEquals(thread9.toString(), "Thread[QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']1,5,main]");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        int int0 = io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage.MAX_MARKDOWN_CONTENT_LEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService4 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent5 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) (byte) 0, (long) (-1), timeUnit2, true, scheduledExecutorService4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
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
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage17 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("hi!");
        java.lang.String str18 = qyWeixinRobotMarkdownMessage17.toString();
        boolean boolean19 = defaultQyWeixinRobotQueueManagerComponent7.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage17);
        java.lang.String str20 = qyWeixinRobotMarkdownMessage17.getContent();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{markdown={content=hi!}, msgtype=markdown}" + "'", str18, "{markdown={content=hi!}, msgtype=markdown}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
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
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent21 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent23 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent24 = null;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService29 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent30 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit27, false, scheduledExecutorService29);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient31 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList19, qyWeixinRobotHttpClientComponent21, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent23, qyWeixinRobotKeyManagerComponent24, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent30);
        defaultQyWeixinRobotScheduledManagerComponent14.init(qyWeixinRobotGroupClient31);
        byte[] byteArray34 = new byte[] {};
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse35 = qyWeixinRobotGroupClient31.uploadMedia("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", byteArray34);
        java.lang.String str36 = qyWeixinRobotResponse35.getErrmsg();
        java.lang.String str37 = qyWeixinRobotResponse35.getType();
        java.lang.String str38 = qyWeixinRobotResponse35.getType();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u72b6\u6001\u5df2\u5173\u95ed" + "'", str36, "\u72b6\u6001\u5df2\u5173\u95ed");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotThreadFactory qyWeixinRobotThreadFactory1 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotThreadFactory("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType qyWeixinRobotMessageType0 = io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.markdown;
        org.junit.Assert.assertTrue("'" + qyWeixinRobotMessageType0 + "' != '" + io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.markdown + "'", qyWeixinRobotMessageType0.equals(io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.markdown));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage[] qyWeixinRobotBaseMessageArray0 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage[] {};
        java.util.ArrayList<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList1 = new java.util.ArrayList<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage>) qyWeixinRobotBaseMessageList1, qyWeixinRobotBaseMessageArray0);
        boolean boolean3 = io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotUtil.isNotEmpty((java.util.Collection<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage>) qyWeixinRobotBaseMessageList1);
        boolean boolean4 = io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotUtil.isNotEmpty((java.util.Collection<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage>) qyWeixinRobotBaseMessageList1);
        boolean boolean5 = io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotUtil.isNotEmpty((java.util.Collection<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage>) qyWeixinRobotBaseMessageList1);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent6 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent8 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService14 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent15 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit12, false, scheduledExecutorService14);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient16 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList4, qyWeixinRobotHttpClientComponent6, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent8, qyWeixinRobotKeyManagerComponent9, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent15);
        defaultQyWeixinRobotScheduledManagerComponent0.destroy(qyWeixinRobotGroupClient16);
        qyWeixinRobotGroupClient16.destroy();
        qyWeixinRobotGroupClient16.destroy();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent26 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent28 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent29 = null;
        java.util.concurrent.TimeUnit timeUnit32 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService34 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent35 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit32, false, scheduledExecutorService34);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient36 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList24, qyWeixinRobotHttpClientComponent26, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent28, qyWeixinRobotKeyManagerComponent29, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent42 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent44 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent45 = null;
        java.util.concurrent.TimeUnit timeUnit48 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService50 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent51 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit48, false, scheduledExecutorService50);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient52 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList40, qyWeixinRobotHttpClientComponent42, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent44, qyWeixinRobotKeyManagerComponent45, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent51);
        defaultQyWeixinRobotScheduledManagerComponent35.init(qyWeixinRobotGroupClient52);
        byte[] byteArray55 = new byte[] {};
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse56 = qyWeixinRobotGroupClient52.uploadMedia("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", byteArray55);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse57 = qyWeixinRobotGroupClient16.uploadMedia("\u72b6\u6001\u5df2\u5173\u95ed", byteArray55);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent63 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent65 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent66 = null;
        java.util.concurrent.TimeUnit timeUnit69 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService71 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent72 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit69, false, scheduledExecutorService71);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient73 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList61, qyWeixinRobotHttpClientComponent63, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent65, qyWeixinRobotKeyManagerComponent66, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent72);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage75 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        java.util.List<java.lang.String> strList76 = qyWeixinRobotTextMessage75.getMentionedMobileList();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse77 = qyWeixinRobotGroupClient73.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage75);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse78 = qyWeixinRobotGroupClient16.sendDirect((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage75);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[]");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse56);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse57);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(strList76);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse77);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse78);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent1 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList3 = defaultQyWeixinRobotQueueManagerComponent1.consume((int) ' ');
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList5 = defaultQyWeixinRobotQueueManagerComponent1.consume((int) (byte) 100);
        boolean boolean6 = io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotUtil.isNotEmpty((java.util.Collection<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage>) qyWeixinRobotBaseMessageList5);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList3);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        java.lang.String[] strArray10 = new java.lang.String[] { "QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']", "QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", "QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']", "", "QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']", "QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", "{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}", "", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent18 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent20 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent21 = null;
        java.util.concurrent.TimeUnit timeUnit24 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService26 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent27 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit24, false, scheduledExecutorService26);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient28 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList16, qyWeixinRobotHttpClientComponent18, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent20, qyWeixinRobotKeyManagerComponent21, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent27);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent29 = qyWeixinRobotGroupClient28.getHttpClient();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent31 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList33 = defaultQyWeixinRobotQueueManagerComponent31.consume((int) ' ');
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage35 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("");
        boolean boolean36 = defaultQyWeixinRobotQueueManagerComponent31.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage35);
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent37 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient42 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList40);
        defaultQyWeixinRobotKeyManagerComponent37.init(qyWeixinRobotGroupClient42);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList45 = defaultQyWeixinRobotKeyManagerComponent37.selectKeys((int) (byte) 0);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent51 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent53 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent54 = null;
        java.util.concurrent.TimeUnit timeUnit57 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService59 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent60 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit57, false, scheduledExecutorService59);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient61 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList49, qyWeixinRobotHttpClientComponent51, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent53, qyWeixinRobotKeyManagerComponent54, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent60);
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent67 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent69 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent70 = null;
        java.util.concurrent.TimeUnit timeUnit73 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService75 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent76 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit73, false, scheduledExecutorService75);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient77 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList65, qyWeixinRobotHttpClientComponent67, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent69, qyWeixinRobotKeyManagerComponent70, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent76);
        defaultQyWeixinRobotScheduledManagerComponent60.init(qyWeixinRobotGroupClient77);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent79 = qyWeixinRobotGroupClient77.getScheduledManager();
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient80 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList11, qyWeixinRobotHttpClientComponent29, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent31, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent) defaultQyWeixinRobotKeyManagerComponent37, qyWeixinRobotScheduledManagerComponent79);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotHttpClientComponent29);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(selectKeyList45);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent79);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService4 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent5 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent(0L, (long) (byte) 10, timeUnit2, true, scheduledExecutorService4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent1 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList3 = defaultQyWeixinRobotQueueManagerComponent1.consume((int) ' ');
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage5 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("");
        boolean boolean6 = defaultQyWeixinRobotQueueManagerComponent1.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage5);
        java.lang.String str7 = qyWeixinRobotMarkdownMessage5.getContent();
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        java.lang.String str3 = article2.getDescription();
        java.lang.String str4 = article2.getTitle();
        java.lang.String str5 = article2.getUrl();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test063() throws Throwable {
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
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "SelectKey[key='hi!', timestamp=28313287]" + "'", str63, "SelectKey[key='hi!', timestamp=28313287]");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse0 = io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse.ok();
        boolean boolean1 = qyWeixinRobotResponse0.isSuccess();
        qyWeixinRobotResponse0.setErrcode((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
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
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage17 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("hi!");
        java.lang.String str18 = qyWeixinRobotMarkdownMessage17.toString();
        boolean boolean19 = defaultQyWeixinRobotQueueManagerComponent7.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage17);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage21 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        java.util.List<java.lang.String> strList22 = qyWeixinRobotTextMessage21.getMentionedList();
        boolean boolean23 = defaultQyWeixinRobotQueueManagerComponent7.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage21);
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent24 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent30 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent32 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent33 = null;
        java.util.concurrent.TimeUnit timeUnit36 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService38 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent39 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit36, false, scheduledExecutorService38);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient40 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList28, qyWeixinRobotHttpClientComponent30, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent32, qyWeixinRobotKeyManagerComponent33, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent39);
        defaultQyWeixinRobotScheduledManagerComponent24.destroy(qyWeixinRobotGroupClient40);
        qyWeixinRobotGroupClient40.destroy();
        qyWeixinRobotGroupClient40.destroy();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage45 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse46 = qyWeixinRobotGroupClient40.sendDirect((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage45);
        boolean boolean47 = defaultQyWeixinRobotQueueManagerComponent7.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage45);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{markdown={content=hi!}, msgtype=markdown}" + "'", str18, "{markdown={content=hi!}, msgtype=markdown}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
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
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent18 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient23 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList21);
        defaultQyWeixinRobotKeyManagerComponent18.init(qyWeixinRobotGroupClient23);
        defaultQyWeixinRobotScheduledManagerComponent14.init(qyWeixinRobotGroupClient23);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent32 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent34 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent35 = null;
        java.util.concurrent.TimeUnit timeUnit38 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService40 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent41 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit38, false, scheduledExecutorService40);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient42 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList30, qyWeixinRobotHttpClientComponent32, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent34, qyWeixinRobotKeyManagerComponent35, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent41);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent48 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent50 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent51 = null;
        java.util.concurrent.TimeUnit timeUnit54 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService56 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent57 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit54, false, scheduledExecutorService56);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient58 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList46, qyWeixinRobotHttpClientComponent48, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent50, qyWeixinRobotKeyManagerComponent51, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent57);
        defaultQyWeixinRobotScheduledManagerComponent41.init(qyWeixinRobotGroupClient58);
        byte[] byteArray61 = new byte[] {};
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse62 = qyWeixinRobotGroupClient58.uploadMedia("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", byteArray61);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse63 = qyWeixinRobotGroupClient23.uploadMedia("hi!", byteArray61);
        qyWeixinRobotGroupClient23.init();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[]");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse62);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse63);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient4 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList2);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent5 = qyWeixinRobotGroupClient4.getHttpClient();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent6 = qyWeixinRobotGroupClient4.getKeyManager();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent7 = qyWeixinRobotGroupClient4.getScheduledManager();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotHttpClientComponent5);
        org.junit.Assert.assertNotNull(qyWeixinRobotKeyManagerComponent6);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent7);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse0 = io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse.ok();
        qyWeixinRobotResponse0.setCreated_at("hi!");
        java.lang.String str3 = qyWeixinRobotResponse0.getMedia_id();
        java.lang.String str4 = qyWeixinRobotResponse0.getType();
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey1 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("hi!");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey2 = qyWeixinRobotKey1.decrement();
        java.lang.String str3 = selectKey2.getKey();
        java.lang.String str4 = selectKey2.toString();
        org.junit.Assert.assertNotNull(selectKey2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SelectKey[key='hi!', timestamp=28313287]" + "'", str4, "SelectKey[key='hi!', timestamp=28313287]");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("hi!", "{msgtype=text, text={content=QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']}}");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration qyWeixinRobotAutoConfiguration0 = new io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent1 = qyWeixinRobotAutoConfiguration0.defaultQyWeixinRobotScheduledManager();
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient2 = null;
        qyWeixinRobotScheduledManagerComponent1.init(qyWeixinRobotGroupClient2);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.lang.String[] strArray3 = new java.lang.String[] { "SelectKey[key='hi!', timestamp=28313287]", "{markdown={content=hi!}, msgtype=markdown}", "factoryBeanObjectType" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient6 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList4);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent7 = qyWeixinRobotGroupClient6.getScheduledManager();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent6 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent8 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService14 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent15 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit12, false, scheduledExecutorService14);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient16 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList4, qyWeixinRobotHttpClientComponent6, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent8, qyWeixinRobotKeyManagerComponent9, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent15);
        defaultQyWeixinRobotScheduledManagerComponent0.destroy(qyWeixinRobotGroupClient16);
        qyWeixinRobotGroupClient16.destroy();
        qyWeixinRobotGroupClient16.destroy();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage21 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse22 = qyWeixinRobotGroupClient16.sendDirect((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage21);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage24 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("hi!");
        java.lang.String str25 = qyWeixinRobotMarkdownMessage24.toString();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse26 = qyWeixinRobotGroupClient16.sendDirect((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage24);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{markdown={content=hi!}, msgtype=markdown}" + "'", str25, "{markdown={content=hi!}, msgtype=markdown}");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse26);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent6 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent8 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService14 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent15 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit12, false, scheduledExecutorService14);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient16 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList4, qyWeixinRobotHttpClientComponent6, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent8, qyWeixinRobotKeyManagerComponent9, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent15);
        defaultQyWeixinRobotScheduledManagerComponent0.destroy(qyWeixinRobotGroupClient16);
        qyWeixinRobotGroupClient16.destroy();
        qyWeixinRobotGroupClient16.destroy();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent26 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent28 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent29 = null;
        java.util.concurrent.TimeUnit timeUnit32 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService34 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent35 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit32, false, scheduledExecutorService34);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient36 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList24, qyWeixinRobotHttpClientComponent26, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent28, qyWeixinRobotKeyManagerComponent29, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent42 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent44 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent45 = null;
        java.util.concurrent.TimeUnit timeUnit48 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService50 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent51 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit48, false, scheduledExecutorService50);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient52 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList40, qyWeixinRobotHttpClientComponent42, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent44, qyWeixinRobotKeyManagerComponent45, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent51);
        defaultQyWeixinRobotScheduledManagerComponent35.init(qyWeixinRobotGroupClient52);
        byte[] byteArray55 = new byte[] {};
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse56 = qyWeixinRobotGroupClient52.uploadMedia("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", byteArray55);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse57 = qyWeixinRobotGroupClient16.uploadMedia("\u72b6\u6001\u5df2\u5173\u95ed", byteArray55);
        qyWeixinRobotResponse57.setErrcode((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[]");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse56);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse57);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
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
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage17 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("hi!");
        java.lang.String str18 = qyWeixinRobotMarkdownMessage17.toString();
        boolean boolean19 = defaultQyWeixinRobotQueueManagerComponent7.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage17);
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent20 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient25 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList23);
        defaultQyWeixinRobotKeyManagerComponent20.init(qyWeixinRobotGroupClient25);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList28 = defaultQyWeixinRobotKeyManagerComponent20.selectKeys((int) (byte) 0);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent34 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent36 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent37 = null;
        java.util.concurrent.TimeUnit timeUnit40 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService42 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent43 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit40, false, scheduledExecutorService42);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient44 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList32, qyWeixinRobotHttpClientComponent34, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent36, qyWeixinRobotKeyManagerComponent37, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent43);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage46 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        java.util.List<java.lang.String> strList47 = qyWeixinRobotTextMessage46.getMentionedMobileList();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse48 = qyWeixinRobotGroupClient44.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage46);
        defaultQyWeixinRobotKeyManagerComponent20.init(qyWeixinRobotGroupClient44);
        defaultQyWeixinRobotQueueManagerComponent7.destroy(qyWeixinRobotGroupClient44);
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent56 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent58 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent59 = null;
        java.util.concurrent.TimeUnit timeUnit62 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService64 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent65 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit62, false, scheduledExecutorService64);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient66 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList54, qyWeixinRobotHttpClientComponent56, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent58, qyWeixinRobotKeyManagerComponent59, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent65);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage68 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("hi!");
        java.lang.String str69 = qyWeixinRobotMarkdownMessage68.toString();
        boolean boolean70 = defaultQyWeixinRobotQueueManagerComponent58.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage68);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage72 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        java.util.List<java.lang.String> strList73 = qyWeixinRobotTextMessage72.getMentionedList();
        boolean boolean74 = defaultQyWeixinRobotQueueManagerComponent58.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage72);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse75 = qyWeixinRobotGroupClient44.sendDirect((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage72);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{markdown={content=hi!}, msgtype=markdown}" + "'", str18, "{markdown={content=hi!}, msgtype=markdown}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(selectKeyList28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(strList47);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse48);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "{markdown={content=hi!}, msgtype=markdown}" + "'", str69, "{markdown={content=hi!}, msgtype=markdown}");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(strList73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse75);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent defaultQyWeixinRobotRetrofit2HttpClientComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage4 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("\u72b6\u6001\u5df2\u5173\u95ed", "{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse5 = defaultQyWeixinRobotRetrofit2HttpClientComponent0.send("{msgtype=text, text={content=QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']}}", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage4);
        qyWeixinRobotImageMessage4.setMd5("{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse5);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
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
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent21 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent23 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent24 = null;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService29 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent30 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit27, false, scheduledExecutorService29);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient31 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList19, qyWeixinRobotHttpClientComponent21, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent23, qyWeixinRobotKeyManagerComponent24, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent30);
        defaultQyWeixinRobotScheduledManagerComponent14.init(qyWeixinRobotGroupClient31);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent33 = qyWeixinRobotGroupClient31.getScheduledManager();
        boolean boolean34 = qyWeixinRobotGroupClient31.isStatus();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent35 = qyWeixinRobotGroupClient31.getKeyManager();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent37 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList39 = defaultQyWeixinRobotQueueManagerComponent37.consume((int) ' ');
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage41 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("");
        boolean boolean42 = defaultQyWeixinRobotQueueManagerComponent37.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage41);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse43 = qyWeixinRobotGroupClient31.sendDirect((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage41);
        java.util.Map<java.lang.String, java.lang.Object> strMap44 = qyWeixinRobotMarkdownMessage41.getMsgBody();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(qyWeixinRobotKeyManagerComponent35);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse43);
        org.junit.Assert.assertNotNull(strMap44);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService4 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent5 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 'a', (long) (short) 0, timeUnit2, false, scheduledExecutorService4);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent6 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent8 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService14 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent15 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit12, false, scheduledExecutorService14);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient16 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList4, qyWeixinRobotHttpClientComponent6, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent8, qyWeixinRobotKeyManagerComponent9, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent15);
        defaultQyWeixinRobotScheduledManagerComponent0.destroy(qyWeixinRobotGroupClient16);
        qyWeixinRobotGroupClient16.destroy();
        qyWeixinRobotGroupClient16.destroy();
        qyWeixinRobotGroupClient16.destroy();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent21 = qyWeixinRobotGroupClient16.getHttpClient();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage24 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("\u72b6\u6001\u5df2\u5173\u95ed", "{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse25 = qyWeixinRobotGroupClient16.sendDirect((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage24);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotHttpClientComponent21);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse25);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent1 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage4 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("hi!", "");
        java.lang.String str5 = qyWeixinRobotImageMessage4.getBase64();
        boolean boolean6 = defaultQyWeixinRobotQueueManagerComponent1.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage4);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList8 = defaultQyWeixinRobotQueueManagerComponent1.consume(1);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient13 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList11);
        defaultQyWeixinRobotQueueManagerComponent1.init(qyWeixinRobotGroupClient13);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
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
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList33 = defaultQyWeixinRobotKeyManagerComponent0.selectKeys((int) '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(selectKeyList8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(strList27);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse28);
        org.junit.Assert.assertNotNull(selectKeyList31);
        org.junit.Assert.assertNotNull(selectKeyList33);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
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
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage17 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        java.util.List<java.lang.String> strList18 = qyWeixinRobotTextMessage17.getMentionedMobileList();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse19 = qyWeixinRobotGroupClient15.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage17);
        java.lang.String str20 = qyWeixinRobotResponse19.getMedia_id();
        java.lang.String str21 = qyWeixinRobotResponse19.getMedia_id();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(strList18);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient5 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList3);
        defaultQyWeixinRobotKeyManagerComponent0.init(qyWeixinRobotGroupClient5);
        boolean boolean7 = qyWeixinRobotGroupClient5.isStatus();
        qyWeixinRobotGroupClient5.destroy();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse1 = io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse.err("{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}");
        java.lang.Class<?> wildcardClass2 = qyWeixinRobotResponse1.getClass();
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey1 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("hi!");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey2 = qyWeixinRobotKey1.decrement();
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey4 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("hi!");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey5 = qyWeixinRobotKey4.decrement();
        java.lang.String str6 = selectKey5.getKey();
        int int7 = qyWeixinRobotKey1.increment(selectKey5);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey8 = qyWeixinRobotKey1.decrement();
        java.lang.String str9 = selectKey8.getKey();
        org.junit.Assert.assertNotNull(selectKey2);
        org.junit.Assert.assertNotNull(selectKey5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(selectKey8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse0 = io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse.ok();
        java.lang.String str1 = qyWeixinRobotResponse0.getCreated_at();
        qyWeixinRobotResponse0.setErrcode((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("hi!");
        java.lang.String str3 = qyWeixinRobotMarkdownMessage2.toString();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder callbackBuilder4 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage2);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType qyWeixinRobotMessageType5 = qyWeixinRobotMarkdownMessage2.getMsgType();
        qyWeixinRobotMarkdownMessage2.setContent("\u72b6\u6001\u5df2\u5173\u95ed");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{markdown={content=hi!}, msgtype=markdown}" + "'", str3, "{markdown={content=hi!}, msgtype=markdown}");
        org.junit.Assert.assertTrue("'" + qyWeixinRobotMessageType5 + "' != '" + io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.markdown + "'", qyWeixinRobotMessageType5.equals(io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.markdown));
    }

    @Test
    public void test088() throws Throwable {
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
// flaky:         org.junit.Assert.assertEquals(thread24.toString(), "\u72b6\u6001\u5df2\u5173\u95ed1,5,main]");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage3 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("hi!");
        java.lang.String str4 = qyWeixinRobotMarkdownMessage3.toString();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder callbackBuilder5 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage3);
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder callbackBuilder6 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder("{msgtype=text, text={content=QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']}}", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage3);
        retrofit2.Callback<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse> qyWeixinRobotResponseCallback7 = callbackBuilder6.build();
        retrofit2.Callback<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse> qyWeixinRobotResponseCallback8 = callbackBuilder6.build();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{markdown={content=hi!}, msgtype=markdown}" + "'", str4, "{markdown={content=hi!}, msgtype=markdown}");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponseCallback7);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponseCallback8);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
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
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage17 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        java.util.List<java.lang.String> strList18 = qyWeixinRobotTextMessage17.getMentionedMobileList();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse19 = qyWeixinRobotGroupClient15.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage17);
        java.lang.String str20 = qyWeixinRobotTextMessage17.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = qyWeixinRobotTextMessage17.getMsgBody();
        java.lang.String[] strArray25 = new java.lang.String[] { "SelectKey[key='hi!', timestamp=28313287]", "{markdown={content=hi!}, msgtype=markdown}", "factoryBeanObjectType" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient28 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList26);
        qyWeixinRobotTextMessage17.setMentionedList((java.util.List<java.lang.String>) strList26);
        java.lang.String str30 = qyWeixinRobotTextMessage17.getContent();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(strList18);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{msgtype=text, text={content=QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']}}" + "'", str20, "{msgtype=text, text={content=QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']}}");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']" + "'", str30, "QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
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
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage17 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("hi!");
        java.lang.String str18 = qyWeixinRobotMarkdownMessage17.toString();
        boolean boolean19 = defaultQyWeixinRobotQueueManagerComponent7.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage17);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage21 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        java.util.List<java.lang.String> strList22 = qyWeixinRobotTextMessage21.getMentionedList();
        boolean boolean23 = defaultQyWeixinRobotQueueManagerComponent7.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage21);
        java.lang.String str24 = qyWeixinRobotTextMessage21.getContent();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{markdown={content=hi!}, msgtype=markdown}" + "'", str18, "{markdown={content=hi!}, msgtype=markdown}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']" + "'", str24, "QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
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
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent16 = qyWeixinRobotGroupClient15.getHttpClient();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage18 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType qyWeixinRobotMessageType19 = qyWeixinRobotTextMessage18.getMsgType();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse20 = qyWeixinRobotGroupClient15.sendDirect((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage18);
        qyWeixinRobotResponse20.setErrmsg("{markdown={content=hi!}, msgtype=markdown}");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotHttpClientComponent16);
        org.junit.Assert.assertTrue("'" + qyWeixinRobotMessageType19 + "' != '" + io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.text + "'", qyWeixinRobotMessageType19.equals(io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.text));
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse20);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        article2.setPicurl("hi!");
        article2.setPicurl("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        article2.setUrl("hi!");
        java.lang.String str9 = article2.getDescription();
        article2.setTitle("hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder callbackBuilder3 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder("hi!", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage2);
    }

    @Test
    public void test095() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 28313287L + "'", long23 == 28313287L);
        org.junit.Assert.assertNotNull(selectKeyList26);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        java.lang.String str3 = article2.getDescription();
        java.lang.String str4 = article2.getTitle();
        article2.setTitle("{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService4 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent5 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) (byte) 1, 0L, timeUnit2, true, scheduledExecutorService4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse1 = io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse.err("{msgtype=text, text={content=QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']}}");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        java.lang.String str3 = article2.getDescription();
        java.lang.String str4 = article2.getTitle();
        article2.setTitle("\u72b6\u6001\u5df2\u5173\u95ed");
        article2.setUrl("{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}");
        java.lang.String str9 = article2.getPicurl();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "{markdown={content=hi!}, msgtype=markdown}" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent6 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent8 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList10 = defaultQyWeixinRobotQueueManagerComponent8.consume((int) ' ');
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService16 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent17 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent(100L, (long) '#', timeUnit14, true, scheduledExecutorService16);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient18 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList4, qyWeixinRobotHttpClientComponent6, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent8, qyWeixinRobotKeyManagerComponent11, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent17);
        qyWeixinRobotGroupClient18.destroy();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient4 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList2);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage7 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("hi!", "");
        java.lang.String str8 = qyWeixinRobotImageMessage7.getBase64();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse9 = qyWeixinRobotGroupClient4.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage7);
        java.lang.String str10 = qyWeixinRobotResponse9.getType();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test102() throws Throwable {
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SelectKey[key='hi!', timestamp=28313287]" + "'", str6, "SelectKey[key='hi!', timestamp=28313287]");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey2 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey("SelectKey[key='hi!', timestamp=28313287]", (long) '4');
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("factoryBeanObjectType", "QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
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
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent21 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent23 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent24 = null;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService29 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent30 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit27, false, scheduledExecutorService29);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient31 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList19, qyWeixinRobotHttpClientComponent21, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent23, qyWeixinRobotKeyManagerComponent24, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent30);
        defaultQyWeixinRobotScheduledManagerComponent14.init(qyWeixinRobotGroupClient31);
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent33 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient38 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList36);
        defaultQyWeixinRobotKeyManagerComponent33.init(qyWeixinRobotGroupClient38);
        boolean boolean40 = qyWeixinRobotGroupClient38.isStatus();
        java.util.List<java.lang.String> strList41 = qyWeixinRobotGroupClient38.getKeyList();
        // The following exception was thrown during execution in test generation
        try {
            defaultQyWeixinRobotScheduledManagerComponent14.destroy(qyWeixinRobotGroupClient38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strList41);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent1 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage4 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("hi!", "");
        java.lang.String str5 = qyWeixinRobotImageMessage4.getBase64();
        boolean boolean6 = defaultQyWeixinRobotQueueManagerComponent1.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage4);
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent8 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage11 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("hi!", "");
        java.lang.String str12 = qyWeixinRobotImageMessage11.getBase64();
        boolean boolean13 = defaultQyWeixinRobotQueueManagerComponent8.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage11);
        java.lang.String str14 = qyWeixinRobotImageMessage11.getMd5();
        boolean boolean15 = defaultQyWeixinRobotQueueManagerComponent1.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage11);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        java.lang.String str3 = article2.getDescription();
        java.lang.String str4 = article2.getTitle();
        article2.setTitle("\u72b6\u6001\u5df2\u5173\u95ed");
        article2.setUrl("{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}");
        article2.setUrl("\u72b6\u6001\u5df2\u5173\u95ed");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("\u72b6\u6001\u5df2\u5173\u95ed", "QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = qyWeixinRobotImageMessage2.toMap();
        java.lang.String str4 = qyWeixinRobotImageMessage2.getBase64();
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u72b6\u6001\u5df2\u5173\u95ed" + "'", str4, "\u72b6\u6001\u5df2\u5173\u95ed");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage qyWeixinRobotBaseMessage1 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder callbackBuilder2 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder("SelectKey[key='hi!', timestamp=28313287]", qyWeixinRobotBaseMessage1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse0 = io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse.ok();
        java.lang.String str1 = qyWeixinRobotResponse0.toString();
        java.lang.String str2 = qyWeixinRobotResponse0.getMedia_id();
        qyWeixinRobotResponse0.setCreated_at("{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']" + "'", str1, "QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent1 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList3 = defaultQyWeixinRobotQueueManagerComponent1.consume((int) ' ');
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent9 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent11 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService17 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent18 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit15, false, scheduledExecutorService17);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient19 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList7, qyWeixinRobotHttpClientComponent9, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent11, qyWeixinRobotKeyManagerComponent12, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent18);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent25 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent27 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent28 = null;
        java.util.concurrent.TimeUnit timeUnit31 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService33 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent34 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit31, false, scheduledExecutorService33);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient35 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList23, qyWeixinRobotHttpClientComponent25, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent27, qyWeixinRobotKeyManagerComponent28, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent34);
        defaultQyWeixinRobotScheduledManagerComponent18.init(qyWeixinRobotGroupClient35);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage38 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("SelectKey[key='hi!', timestamp=28313287]");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse39 = qyWeixinRobotGroupClient35.sendDirect((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage38);
        boolean boolean40 = defaultQyWeixinRobotQueueManagerComponent1.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage38);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration qyWeixinRobotAutoConfiguration0 = new io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent1 = qyWeixinRobotAutoConfiguration0.defaultQyWeixinRobotScheduledManager();
        io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotKeyManagerFactoryBean qyWeixinRobotKeyManagerFactoryBean2 = qyWeixinRobotAutoConfiguration0.defaultKeyManagerFactoryBean();
        java.lang.Class<? extends io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent> wildcardClass3 = qyWeixinRobotKeyManagerFactoryBean2.clazz;
        boolean boolean4 = qyWeixinRobotKeyManagerFactoryBean2.isSingleton();
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent1);
        org.junit.Assert.assertNotNull(qyWeixinRobotKeyManagerFactoryBean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent defaultQyWeixinRobotRetrofit2HttpClientComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage4 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("\u72b6\u6001\u5df2\u5173\u95ed", "{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse5 = defaultQyWeixinRobotRetrofit2HttpClientComponent0.send("{msgtype=text, text={content=QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']}}", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage4);
        java.lang.Class<?> wildcardClass6 = defaultQyWeixinRobotRetrofit2HttpClientComponent0.getClass();
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration qyWeixinRobotAutoConfiguration0 = new io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent1 = qyWeixinRobotAutoConfiguration0.defaultQyWeixinRobotHttpClient();
        io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotQueueManagerFactoryBean qyWeixinRobotQueueManagerFactoryBean2 = qyWeixinRobotAutoConfiguration0.defaultQueueManagerFactoryBean();
        java.lang.Class<?> wildcardClass3 = qyWeixinRobotQueueManagerFactoryBean2.getObjectType();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent qyWeixinRobotQueueManagerComponent4 = qyWeixinRobotQueueManagerFactoryBean2.getObject();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent qyWeixinRobotQueueManagerComponent5 = qyWeixinRobotQueueManagerFactoryBean2.getObject();
        java.lang.Class<?> wildcardClass6 = qyWeixinRobotQueueManagerFactoryBean2.getObjectType();
        org.junit.Assert.assertNotNull(qyWeixinRobotHttpClientComponent1);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerFactoryBean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerComponent4);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerComponent5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "{markdown={content=hi!}, msgtype=markdown}" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent6 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent8 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList10 = defaultQyWeixinRobotQueueManagerComponent8.consume((int) ' ');
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService16 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent17 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent(100L, (long) '#', timeUnit14, true, scheduledExecutorService16);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient18 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList4, qyWeixinRobotHttpClientComponent6, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent8, qyWeixinRobotKeyManagerComponent11, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent17);
        io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotGroupBean qyWeixinRobotGroupBean19 = new io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotGroupBean((java.util.List<java.lang.String>) strList4);
        // The following exception was thrown during execution in test generation
        try {
            qyWeixinRobotGroupBean19.afterPropertiesSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList10);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
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
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent21 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent23 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent24 = null;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService29 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent30 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit27, false, scheduledExecutorService29);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient31 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList19, qyWeixinRobotHttpClientComponent21, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent23, qyWeixinRobotKeyManagerComponent24, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent30);
        defaultQyWeixinRobotScheduledManagerComponent14.init(qyWeixinRobotGroupClient31);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent33 = qyWeixinRobotGroupClient31.getScheduledManager();
        boolean boolean34 = qyWeixinRobotGroupClient31.isStatus();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent36 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent42 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent44 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent45 = null;
        java.util.concurrent.TimeUnit timeUnit48 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService50 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent51 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit48, false, scheduledExecutorService50);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient52 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList40, qyWeixinRobotHttpClientComponent42, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent44, qyWeixinRobotKeyManagerComponent45, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent51);
        defaultQyWeixinRobotScheduledManagerComponent36.destroy(qyWeixinRobotGroupClient52);
        qyWeixinRobotGroupClient52.destroy();
        qyWeixinRobotGroupClient52.destroy();
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent62 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent64 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent65 = null;
        java.util.concurrent.TimeUnit timeUnit68 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService70 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent71 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit68, false, scheduledExecutorService70);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient72 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList60, qyWeixinRobotHttpClientComponent62, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent64, qyWeixinRobotKeyManagerComponent65, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent71);
        java.lang.String[] strArray75 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList76 = new java.util.ArrayList<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList76, strArray75);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent78 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent80 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent81 = null;
        java.util.concurrent.TimeUnit timeUnit84 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService86 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent87 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit84, false, scheduledExecutorService86);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient88 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList76, qyWeixinRobotHttpClientComponent78, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent80, qyWeixinRobotKeyManagerComponent81, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent87);
        defaultQyWeixinRobotScheduledManagerComponent71.init(qyWeixinRobotGroupClient88);
        byte[] byteArray91 = new byte[] {};
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse92 = qyWeixinRobotGroupClient88.uploadMedia("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", byteArray91);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse93 = qyWeixinRobotGroupClient52.uploadMedia("\u72b6\u6001\u5df2\u5173\u95ed", byteArray91);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse94 = qyWeixinRobotGroupClient31.uploadMedia("{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}", byteArray91);
        java.lang.Class<?> wildcardClass95 = qyWeixinRobotGroupClient31.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray91), "[]");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse92);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse93);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse94);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
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
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent18 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient23 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList21);
        defaultQyWeixinRobotKeyManagerComponent18.init(qyWeixinRobotGroupClient23);
        defaultQyWeixinRobotScheduledManagerComponent14.init(qyWeixinRobotGroupClient23);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent31 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent33 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent34 = null;
        java.util.concurrent.TimeUnit timeUnit37 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService39 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent40 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit37, false, scheduledExecutorService39);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient41 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList29, qyWeixinRobotHttpClientComponent31, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent33, qyWeixinRobotKeyManagerComponent34, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent40);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage43 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        java.util.List<java.lang.String> strList44 = qyWeixinRobotTextMessage43.getMentionedMobileList();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse45 = qyWeixinRobotGroupClient41.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage43);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType qyWeixinRobotMessageType46 = qyWeixinRobotTextMessage43.getMsgType();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse47 = qyWeixinRobotGroupClient23.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage43);
        qyWeixinRobotTextMessage43.setContent("");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(strList44);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse45);
        org.junit.Assert.assertTrue("'" + qyWeixinRobotMessageType46 + "' != '" + io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.text + "'", qyWeixinRobotMessageType46.equals(io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.text));
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse47);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent defaultQyWeixinRobotRetrofit2HttpClientComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent3 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList5 = defaultQyWeixinRobotQueueManagerComponent3.consume((int) ' ');
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage7 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("hi!");
        java.lang.String str8 = qyWeixinRobotMarkdownMessage7.getContent();
        boolean boolean9 = defaultQyWeixinRobotQueueManagerComponent3.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage7);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType qyWeixinRobotMessageType10 = qyWeixinRobotMarkdownMessage7.getMsgType();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse11 = defaultQyWeixinRobotRetrofit2HttpClientComponent0.send("hi!", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage7);
        java.lang.String str12 = qyWeixinRobotMarkdownMessage7.toString();
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + qyWeixinRobotMessageType10 + "' != '" + io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.markdown + "'", qyWeixinRobotMessageType10.equals(io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.markdown));
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{markdown={content=hi!}, msgtype=markdown}" + "'", str12, "{markdown={content=hi!}, msgtype=markdown}");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
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
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent21 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent23 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent24 = null;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService29 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent30 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit27, false, scheduledExecutorService29);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient31 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList19, qyWeixinRobotHttpClientComponent21, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent23, qyWeixinRobotKeyManagerComponent24, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent30);
        defaultQyWeixinRobotScheduledManagerComponent14.init(qyWeixinRobotGroupClient31);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent33 = qyWeixinRobotGroupClient31.getScheduledManager();
        boolean boolean34 = qyWeixinRobotGroupClient31.isStatus();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent36 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent42 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent44 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent45 = null;
        java.util.concurrent.TimeUnit timeUnit48 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService50 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent51 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit48, false, scheduledExecutorService50);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient52 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList40, qyWeixinRobotHttpClientComponent42, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent44, qyWeixinRobotKeyManagerComponent45, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent51);
        defaultQyWeixinRobotScheduledManagerComponent36.destroy(qyWeixinRobotGroupClient52);
        qyWeixinRobotGroupClient52.destroy();
        qyWeixinRobotGroupClient52.destroy();
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent62 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent64 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent65 = null;
        java.util.concurrent.TimeUnit timeUnit68 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService70 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent71 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit68, false, scheduledExecutorService70);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient72 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList60, qyWeixinRobotHttpClientComponent62, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent64, qyWeixinRobotKeyManagerComponent65, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent71);
        java.lang.String[] strArray75 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList76 = new java.util.ArrayList<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList76, strArray75);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent78 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent80 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent81 = null;
        java.util.concurrent.TimeUnit timeUnit84 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService86 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent87 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit84, false, scheduledExecutorService86);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient88 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList76, qyWeixinRobotHttpClientComponent78, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent80, qyWeixinRobotKeyManagerComponent81, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent87);
        defaultQyWeixinRobotScheduledManagerComponent71.init(qyWeixinRobotGroupClient88);
        byte[] byteArray91 = new byte[] {};
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse92 = qyWeixinRobotGroupClient88.uploadMedia("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", byteArray91);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse93 = qyWeixinRobotGroupClient52.uploadMedia("\u72b6\u6001\u5df2\u5173\u95ed", byteArray91);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse94 = qyWeixinRobotGroupClient31.uploadMedia("{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}", byteArray91);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent qyWeixinRobotQueueManagerComponent95 = qyWeixinRobotGroupClient31.getQueueManager();
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList97 = qyWeixinRobotQueueManagerComponent95.consume((int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray91), "[]");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse92);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse93);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse94);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerComponent95);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList97);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage1 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = qyWeixinRobotTextMessage1.getMsgBody();
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey2 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey("factoryBeanObjectType", (long) 0);
        java.lang.String str3 = selectKey2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SelectKey[key='factoryBeanObjectType', timestamp=0]" + "'", str3, "SelectKey[key='factoryBeanObjectType', timestamp=0]");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
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
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent21 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent23 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent24 = null;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService29 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent30 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit27, false, scheduledExecutorService29);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient31 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList19, qyWeixinRobotHttpClientComponent21, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent23, qyWeixinRobotKeyManagerComponent24, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent30);
        defaultQyWeixinRobotScheduledManagerComponent14.init(qyWeixinRobotGroupClient31);
        java.lang.String[] strArray36 = new java.lang.String[] { "SelectKey[key='hi!', timestamp=28313287]", "{markdown={content=hi!}, msgtype=markdown}", "factoryBeanObjectType" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient39 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList37);
        // The following exception was thrown during execution in test generation
        try {
            defaultQyWeixinRobotScheduledManagerComponent14.destroy(qyWeixinRobotGroupClient39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse0 = io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse.ok();
        qyWeixinRobotResponse0.setCreated_at("SelectKey[key='hi!', timestamp=28313287]");
        java.lang.String str3 = qyWeixinRobotResponse0.getType();
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("SelectKey[key='hi!', timestamp=28313287]");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder callbackBuilder3 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder("{markdown={content=hi!}, msgtype=markdown}", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage2);
        retrofit2.Callback<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse> qyWeixinRobotResponseCallback4 = callbackBuilder3.build();
        org.junit.Assert.assertNotNull(qyWeixinRobotResponseCallback4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage1 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
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
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage17 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        java.util.List<java.lang.String> strList18 = qyWeixinRobotTextMessage17.getMentionedMobileList();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse19 = qyWeixinRobotGroupClient15.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage17);
        java.lang.String str20 = qyWeixinRobotResponse19.getMedia_id();
        java.lang.String str21 = qyWeixinRobotResponse19.getErrmsg();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(strList18);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u72b6\u6001\u5df2\u5173\u95ed" + "'", str21, "\u72b6\u6001\u5df2\u5173\u95ed");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("\u72b6\u6001\u5df2\u5173\u95ed", "QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration qyWeixinRobotAutoConfiguration0 = new io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent1 = qyWeixinRobotAutoConfiguration0.defaultQyWeixinRobotScheduledManager();
        io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotKeyManagerFactoryBean qyWeixinRobotKeyManagerFactoryBean2 = qyWeixinRobotAutoConfiguration0.defaultKeyManagerFactoryBean();
        boolean boolean3 = qyWeixinRobotKeyManagerFactoryBean2.isSingleton();
        boolean boolean4 = qyWeixinRobotKeyManagerFactoryBean2.isSingleton();
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent1);
        org.junit.Assert.assertNotNull(qyWeixinRobotKeyManagerFactoryBean2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("hi!", "");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article5 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", "factoryBeanObjectType");
        article5.setDescription("");
        java.lang.String str8 = article5.getPicurl();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article11 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        article11.setPicurl("hi!");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article16 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        article16.setPicurl("hi!");
        article16.setPicurl("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        article16.setUrl("hi!");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article25 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        article25.setPicurl("hi!");
        java.lang.String str28 = article25.getDescription();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article31 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        article31.setPicurl("hi!");
        java.lang.String str34 = article31.getTitle();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article37 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        article37.setPicurl("hi!");
        java.lang.String str40 = article37.getDescription();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article43 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        java.lang.String str44 = article43.getDescription();
        java.lang.String str45 = article43.getTitle();
        java.lang.String str46 = article43.getUrl();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article49 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        article49.setPicurl("hi!");
        java.lang.String str52 = article49.getTitle();
        article49.setTitle("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article57 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("factoryBeanObjectType", "SelectKey[key='hi!', timestamp=28313287]");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article60 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        java.lang.String str61 = article60.getPicurl();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article64 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        java.lang.String str65 = article64.getDescription();
        article64.setTitle("{markdown={content=hi!}, msgtype=markdown}");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article[] articleArray68 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article[] { article2, article5, article11, article16, article25, article31, article37, article43, article49, article57, article60, article64 };
        java.util.ArrayList<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article> articleList69 = new java.util.ArrayList<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article>) articleList69, articleArray68);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage qyWeixinRobotNewsMessage71 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage((java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article>) articleList69);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article> articleList72 = null;
        qyWeixinRobotNewsMessage71.setArticles(articleList72);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType qyWeixinRobotMessageType74 = qyWeixinRobotNewsMessage71.getMsgType();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(articleArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + qyWeixinRobotMessageType74 + "' != '" + io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.news + "'", qyWeixinRobotMessageType74.equals(io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.news));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", "factoryBeanObjectType");
        java.lang.String str3 = article2.getDescription();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
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
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage17 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        java.util.List<java.lang.String> strList18 = qyWeixinRobotTextMessage17.getMentionedMobileList();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse19 = qyWeixinRobotGroupClient15.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage17);
        qyWeixinRobotResponse19.setCreated_at("SelectKey[key='hi!', timestamp=28313287]");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(strList18);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse19);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse1 = io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse.err("");
        qyWeixinRobotResponse1.setType("");
        java.lang.String str4 = qyWeixinRobotResponse1.getCreated_at();
        java.lang.String str5 = qyWeixinRobotResponse1.getErrmsg();
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
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
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent30 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent32 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent33 = null;
        java.util.concurrent.TimeUnit timeUnit36 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService38 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent39 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit36, false, scheduledExecutorService38);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient40 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList28, qyWeixinRobotHttpClientComponent30, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent32, qyWeixinRobotKeyManagerComponent33, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent39);
        defaultQyWeixinRobotScheduledManagerComponent23.init(qyWeixinRobotGroupClient40);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent42 = qyWeixinRobotGroupClient40.getScheduledManager();
        boolean boolean43 = qyWeixinRobotGroupClient40.isStatus();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent qyWeixinRobotQueueManagerComponent44 = qyWeixinRobotGroupClient40.getQueueManager();
        defaultQyWeixinRobotKeyManagerComponent0.init(qyWeixinRobotGroupClient40);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent46 = qyWeixinRobotGroupClient40.getHttpClient();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(selectKeyList8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerComponent44);
        org.junit.Assert.assertNotNull(qyWeixinRobotHttpClientComponent46);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration qyWeixinRobotAutoConfiguration0 = new io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent1 = qyWeixinRobotAutoConfiguration0.defaultQyWeixinRobotHttpClient();
        io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotQueueManagerFactoryBean qyWeixinRobotQueueManagerFactoryBean2 = qyWeixinRobotAutoConfiguration0.defaultQueueManagerFactoryBean();
        java.lang.Class<? extends io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent> wildcardClass3 = qyWeixinRobotQueueManagerFactoryBean2.clazz;
        org.junit.Assert.assertNotNull(qyWeixinRobotHttpClientComponent1);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerFactoryBean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
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
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage17 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        java.util.List<java.lang.String> strList18 = qyWeixinRobotTextMessage17.getMentionedMobileList();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse19 = qyWeixinRobotGroupClient15.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage17);
        java.lang.String str20 = qyWeixinRobotTextMessage17.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = qyWeixinRobotTextMessage17.getMsgBody();
        java.lang.String[] strArray25 = new java.lang.String[] { "SelectKey[key='hi!', timestamp=28313287]", "{markdown={content=hi!}, msgtype=markdown}", "factoryBeanObjectType" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient28 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList26);
        qyWeixinRobotTextMessage17.setMentionedList((java.util.List<java.lang.String>) strList26);
        qyWeixinRobotTextMessage17.setContent("SelectKey[key='factoryBeanObjectType', timestamp=0]");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(strList18);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{msgtype=text, text={content=QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']}}" + "'", str20, "{msgtype=text, text={content=QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']}}");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent defaultQyWeixinRobotRetrofit2HttpClientComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage4 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("\u72b6\u6001\u5df2\u5173\u95ed", "{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse5 = defaultQyWeixinRobotRetrofit2HttpClientComponent0.send("{msgtype=text, text={content=QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']}}", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage4);
        qyWeixinRobotResponse5.setType("SelectKey[key='hi!', timestamp=28313287]");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse5);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent6 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent8 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService14 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent15 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit12, false, scheduledExecutorService14);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient16 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList4, qyWeixinRobotHttpClientComponent6, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent8, qyWeixinRobotKeyManagerComponent9, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent15);
        defaultQyWeixinRobotScheduledManagerComponent0.destroy(qyWeixinRobotGroupClient16);
        boolean boolean18 = qyWeixinRobotGroupClient16.isStatus();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent defaultQyWeixinRobotRetrofit2HttpClientComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent2 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent8 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent10 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService16 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent17 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit14, false, scheduledExecutorService16);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient18 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList6, qyWeixinRobotHttpClientComponent8, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent10, qyWeixinRobotKeyManagerComponent11, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent17);
        defaultQyWeixinRobotScheduledManagerComponent2.destroy(qyWeixinRobotGroupClient18);
        qyWeixinRobotGroupClient18.destroy();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage23 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("\u72b6\u6001\u5df2\u5173\u95ed", "QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse24 = qyWeixinRobotGroupClient18.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage23);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse25 = defaultQyWeixinRobotRetrofit2HttpClientComponent0.send("\u72b6\u6001\u5df2\u5173\u95ed", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage23);
        java.lang.String str26 = qyWeixinRobotResponse25.getType();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse24);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage1 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("SelectKey[key='hi!', timestamp=28313287]");
        java.util.List<java.lang.String> strList2 = qyWeixinRobotTextMessage1.getMentionedList();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent8 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent10 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService16 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent17 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit14, false, scheduledExecutorService16);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient18 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList6, qyWeixinRobotHttpClientComponent8, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent10, qyWeixinRobotKeyManagerComponent11, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent17);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage20 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        java.util.List<java.lang.String> strList21 = qyWeixinRobotTextMessage20.getMentionedMobileList();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse22 = qyWeixinRobotGroupClient18.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage20);
        java.lang.String str23 = qyWeixinRobotTextMessage20.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = qyWeixinRobotTextMessage20.getMsgBody();
        java.lang.String[] strArray28 = new java.lang.String[] { "SelectKey[key='hi!', timestamp=28313287]", "{markdown={content=hi!}, msgtype=markdown}", "factoryBeanObjectType" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient31 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList29);
        qyWeixinRobotTextMessage20.setMentionedList((java.util.List<java.lang.String>) strList29);
        qyWeixinRobotTextMessage1.setMentionedList((java.util.List<java.lang.String>) strList29);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(strList21);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{msgtype=text, text={content=QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']}}" + "'", str23, "{msgtype=text, text={content=QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']}}");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
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
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage17 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        java.util.List<java.lang.String> strList18 = qyWeixinRobotTextMessage17.getMentionedMobileList();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse19 = qyWeixinRobotGroupClient15.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage17);
        java.lang.String str20 = qyWeixinRobotTextMessage17.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = qyWeixinRobotTextMessage17.getMsgBody();
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType qyWeixinRobotMessageType22 = qyWeixinRobotTextMessage17.getMsgType();
        java.util.List<java.lang.String> strList23 = qyWeixinRobotTextMessage17.getMentionedList();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(strList18);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{msgtype=text, text={content=QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']}}" + "'", str20, "{msgtype=text, text={content=QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']}}");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + qyWeixinRobotMessageType22 + "' != '" + io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.text + "'", qyWeixinRobotMessageType22.equals(io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.text));
        org.junit.Assert.assertNull(strList23);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "{markdown={content=hi!}, msgtype=markdown}" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent6 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent8 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList10 = defaultQyWeixinRobotQueueManagerComponent8.consume((int) ' ');
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService16 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent17 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent(100L, (long) '#', timeUnit14, true, scheduledExecutorService16);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient18 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList4, qyWeixinRobotHttpClientComponent6, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent8, qyWeixinRobotKeyManagerComponent11, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent17);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotThreadFactory qyWeixinRobotThreadFactory20 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotThreadFactory("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        java.lang.Runnable runnable21 = null;
        java.lang.Thread thread22 = qyWeixinRobotThreadFactory20.newThread(runnable21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture23 = defaultQyWeixinRobotScheduledManagerComponent17.scheduled((java.lang.Runnable) thread22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList10);
        org.junit.Assert.assertNotNull(thread22);
        org.junit.Assert.assertEquals(thread22.toString(), "Thread[QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']1,5,main]");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse0 = io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse.ok();
        qyWeixinRobotResponse0.setCreated_at("SelectKey[key='hi!', timestamp=28313287]");
        qyWeixinRobotResponse0.setCreated_at("");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
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
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage17 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        java.util.List<java.lang.String> strList18 = qyWeixinRobotTextMessage17.getMentionedMobileList();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse19 = qyWeixinRobotGroupClient15.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage17);
        byte[] byteArray22 = new byte[] { (byte) 100 };
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse23 = qyWeixinRobotGroupClient15.uploadMedia("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", byteArray22);
        java.lang.String str24 = qyWeixinRobotResponse23.getMedia_id();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(strList18);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey1 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("factoryBeanObjectType");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = qyWeixinRobotKey1.increment(selectKey2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse0 = io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse.ok();
        java.lang.String str1 = qyWeixinRobotResponse0.toString();
        java.lang.String str2 = qyWeixinRobotResponse0.getMedia_id();
        java.lang.String str3 = qyWeixinRobotResponse0.getErrmsg();
        qyWeixinRobotResponse0.setType("{markdown={content=hi!}, msgtype=markdown}");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']" + "'", str1, "QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ok" + "'", str3, "ok");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent1 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList3 = defaultQyWeixinRobotQueueManagerComponent1.consume((int) ' ');
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage5 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("hi!");
        java.lang.String str6 = qyWeixinRobotMarkdownMessage5.getContent();
        boolean boolean7 = defaultQyWeixinRobotQueueManagerComponent1.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage5);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList9 = defaultQyWeixinRobotQueueManagerComponent1.consume((int) '4');
        boolean boolean10 = io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotUtil.isEmpty((java.util.Collection<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage>) qyWeixinRobotBaseMessageList9);
        boolean boolean11 = io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotUtil.isEmpty((java.util.Collection<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage>) qyWeixinRobotBaseMessageList9);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent defaultQyWeixinRobotRetrofit2HttpClientComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent2 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent8 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent10 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService16 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent17 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit14, false, scheduledExecutorService16);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient18 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList6, qyWeixinRobotHttpClientComponent8, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent10, qyWeixinRobotKeyManagerComponent11, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent17);
        defaultQyWeixinRobotScheduledManagerComponent2.destroy(qyWeixinRobotGroupClient18);
        qyWeixinRobotGroupClient18.destroy();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage23 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("\u72b6\u6001\u5df2\u5173\u95ed", "QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse24 = qyWeixinRobotGroupClient18.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage23);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse25 = defaultQyWeixinRobotRetrofit2HttpClientComponent0.send("\u72b6\u6001\u5df2\u5173\u95ed", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage23);
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent28 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent34 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent36 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent37 = null;
        java.util.concurrent.TimeUnit timeUnit40 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService42 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent43 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit40, false, scheduledExecutorService42);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient44 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList32, qyWeixinRobotHttpClientComponent34, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent36, qyWeixinRobotKeyManagerComponent37, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent43);
        defaultQyWeixinRobotScheduledManagerComponent28.destroy(qyWeixinRobotGroupClient44);
        qyWeixinRobotGroupClient44.destroy();
        qyWeixinRobotGroupClient44.destroy();
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent54 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent56 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent57 = null;
        java.util.concurrent.TimeUnit timeUnit60 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService62 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent63 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit60, false, scheduledExecutorService62);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient64 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList52, qyWeixinRobotHttpClientComponent54, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent56, qyWeixinRobotKeyManagerComponent57, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent63);
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent70 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent72 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent73 = null;
        java.util.concurrent.TimeUnit timeUnit76 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService78 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent79 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit76, false, scheduledExecutorService78);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient80 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList68, qyWeixinRobotHttpClientComponent70, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent72, qyWeixinRobotKeyManagerComponent73, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent79);
        defaultQyWeixinRobotScheduledManagerComponent63.init(qyWeixinRobotGroupClient80);
        byte[] byteArray83 = new byte[] {};
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse84 = qyWeixinRobotGroupClient80.uploadMedia("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", byteArray83);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse85 = qyWeixinRobotGroupClient44.uploadMedia("\u72b6\u6001\u5df2\u5173\u95ed", byteArray83);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse86 = defaultQyWeixinRobotRetrofit2HttpClientComponent0.uploadMedia("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", "hi!", byteArray83);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse24);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[]");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse84);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse85);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse86);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", "factoryBeanObjectType");
        article2.setDescription("");
        java.lang.String str5 = article2.getPicurl();
        article2.setDescription("{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "{markdown={content=hi!}, msgtype=markdown}" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent6 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent8 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList10 = defaultQyWeixinRobotQueueManagerComponent8.consume((int) ' ');
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService16 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent17 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent(100L, (long) '#', timeUnit14, true, scheduledExecutorService16);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient18 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList4, qyWeixinRobotHttpClientComponent6, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent8, qyWeixinRobotKeyManagerComponent11, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent17);
        io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotGroupBean qyWeixinRobotGroupBean19 = new io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotGroupBean((java.util.List<java.lang.String>) strList4);
        qyWeixinRobotGroupBean19.setBeanName("{markdown={content=hi!}, msgtype=markdown}");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
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
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList31 = defaultQyWeixinRobotKeyManagerComponent0.selectKeys((int) (short) 0);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList33 = defaultQyWeixinRobotKeyManagerComponent0.selectKeys((int) (short) 1);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList35 = defaultQyWeixinRobotKeyManagerComponent0.selectKeys((int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(selectKeyList8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(strList27);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse28);
        org.junit.Assert.assertNotNull(selectKeyList31);
        org.junit.Assert.assertNotNull(selectKeyList33);
        org.junit.Assert.assertNotNull(selectKeyList35);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient4 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList2);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent5 = qyWeixinRobotGroupClient4.getHttpClient();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent6 = qyWeixinRobotGroupClient4.getKeyManager();
        java.util.List<java.lang.String> strList7 = qyWeixinRobotGroupClient4.getKeyList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotHttpClientComponent5);
        org.junit.Assert.assertNotNull(qyWeixinRobotKeyManagerComponent6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration qyWeixinRobotAutoConfiguration0 = new io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent1 = qyWeixinRobotAutoConfiguration0.defaultQyWeixinRobotHttpClient();
        io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotQueueManagerFactoryBean qyWeixinRobotQueueManagerFactoryBean2 = qyWeixinRobotAutoConfiguration0.defaultQueueManagerFactoryBean();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent3 = qyWeixinRobotAutoConfiguration0.defaultQyWeixinRobotScheduledManager();
        org.junit.Assert.assertNotNull(qyWeixinRobotHttpClientComponent1);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerFactoryBean2);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent3);
    }

    @Test
    public void test153() throws Throwable {
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u72b6\u6001\u5df2\u5173\u95ed', type='null', media_id='null', created_at='null']" + "'", str9, "\u72b6\u6001\u5df2\u5173\u95ed', type='null', media_id='null', created_at='null']");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotFileMessage qyWeixinRobotFileMessage1 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotFileMessage("{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = qyWeixinRobotFileMessage1.getMsgBody();
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
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
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent21 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent23 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent24 = null;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService29 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent30 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit27, false, scheduledExecutorService29);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient31 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList19, qyWeixinRobotHttpClientComponent21, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent23, qyWeixinRobotKeyManagerComponent24, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent30);
        defaultQyWeixinRobotScheduledManagerComponent14.init(qyWeixinRobotGroupClient31);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent33 = qyWeixinRobotGroupClient31.getScheduledManager();
        boolean boolean34 = qyWeixinRobotGroupClient31.isStatus();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent40 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent42 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent43 = null;
        java.util.concurrent.TimeUnit timeUnit46 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService48 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent49 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit46, false, scheduledExecutorService48);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient50 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList38, qyWeixinRobotHttpClientComponent40, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent42, qyWeixinRobotKeyManagerComponent43, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent49);
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent56 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent58 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent59 = null;
        java.util.concurrent.TimeUnit timeUnit62 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService64 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent65 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit62, false, scheduledExecutorService64);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient66 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList54, qyWeixinRobotHttpClientComponent56, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent58, qyWeixinRobotKeyManagerComponent59, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent65);
        defaultQyWeixinRobotScheduledManagerComponent49.init(qyWeixinRobotGroupClient66);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent68 = qyWeixinRobotGroupClient66.getScheduledManager();
        boolean boolean69 = qyWeixinRobotGroupClient66.isStatus();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent70 = qyWeixinRobotGroupClient66.getKeyManager();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent72 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList74 = defaultQyWeixinRobotQueueManagerComponent72.consume((int) ' ');
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage76 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("");
        boolean boolean77 = defaultQyWeixinRobotQueueManagerComponent72.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage76);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse78 = qyWeixinRobotGroupClient66.sendDirect((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage76);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse79 = qyWeixinRobotGroupClient31.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage76);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent80 = qyWeixinRobotGroupClient31.getHttpClient();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent81 = qyWeixinRobotGroupClient31.getHttpClient();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(qyWeixinRobotKeyManagerComponent70);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse78);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse79);
        org.junit.Assert.assertNotNull(qyWeixinRobotHttpClientComponent80);
        org.junit.Assert.assertNotNull(qyWeixinRobotHttpClientComponent81);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("hi!", "");
        qyWeixinRobotImageMessage2.setBase64("");
        java.lang.String str5 = qyWeixinRobotImageMessage2.getBase64();
        qyWeixinRobotImageMessage2.setMd5("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = qyWeixinRobotImageMessage2.getMsgBody();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
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
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent21 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent23 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent24 = null;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService29 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent30 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit27, false, scheduledExecutorService29);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient31 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList19, qyWeixinRobotHttpClientComponent21, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent23, qyWeixinRobotKeyManagerComponent24, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent30);
        defaultQyWeixinRobotScheduledManagerComponent14.init(qyWeixinRobotGroupClient31);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent33 = qyWeixinRobotGroupClient31.getScheduledManager();
        boolean boolean34 = qyWeixinRobotGroupClient31.isStatus();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent qyWeixinRobotQueueManagerComponent35 = qyWeixinRobotGroupClient31.getQueueManager();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage38 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("hi!");
        java.lang.String str39 = qyWeixinRobotMarkdownMessage38.toString();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder callbackBuilder40 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage38);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse41 = qyWeixinRobotGroupClient31.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage38);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerComponent35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "{markdown={content=hi!}, msgtype=markdown}" + "'", str39, "{markdown={content=hi!}, msgtype=markdown}");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse41);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration qyWeixinRobotAutoConfiguration0 = new io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent1 = qyWeixinRobotAutoConfiguration0.defaultQyWeixinRobotHttpClient();
        io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotQueueManagerFactoryBean qyWeixinRobotQueueManagerFactoryBean2 = qyWeixinRobotAutoConfiguration0.defaultQueueManagerFactoryBean();
        java.lang.Class<?> wildcardClass3 = qyWeixinRobotQueueManagerFactoryBean2.getObjectType();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent qyWeixinRobotQueueManagerComponent4 = qyWeixinRobotQueueManagerFactoryBean2.getObject();
        java.lang.Class<?> wildcardClass5 = qyWeixinRobotQueueManagerFactoryBean2.getObjectType();
        org.junit.Assert.assertNotNull(qyWeixinRobotHttpClientComponent1);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerFactoryBean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerComponent4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
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
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent30 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent32 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent33 = null;
        java.util.concurrent.TimeUnit timeUnit36 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService38 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent39 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit36, false, scheduledExecutorService38);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient40 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList28, qyWeixinRobotHttpClientComponent30, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent32, qyWeixinRobotKeyManagerComponent33, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent39);
        defaultQyWeixinRobotScheduledManagerComponent23.init(qyWeixinRobotGroupClient40);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent42 = qyWeixinRobotGroupClient40.getScheduledManager();
        boolean boolean43 = qyWeixinRobotGroupClient40.isStatus();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent qyWeixinRobotQueueManagerComponent44 = qyWeixinRobotGroupClient40.getQueueManager();
        defaultQyWeixinRobotKeyManagerComponent0.init(qyWeixinRobotGroupClient40);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList47 = defaultQyWeixinRobotKeyManagerComponent0.selectKeys((int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(selectKeyList8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerComponent44);
        org.junit.Assert.assertNotNull(selectKeyList47);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent1 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList3 = defaultQyWeixinRobotQueueManagerComponent1.consume((int) ' ');
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList5 = defaultQyWeixinRobotQueueManagerComponent1.consume((int) (byte) 100);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage8 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("\u72b6\u6001\u5df2\u5173\u95ed", "{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}");
        boolean boolean9 = defaultQyWeixinRobotQueueManagerComponent1.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage8);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = qyWeixinRobotImageMessage8.getMsgBody();
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList3);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
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
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage17 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        java.util.List<java.lang.String> strList18 = qyWeixinRobotTextMessage17.getMentionedMobileList();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse19 = qyWeixinRobotGroupClient15.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage17);
        java.lang.String str20 = qyWeixinRobotTextMessage17.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = qyWeixinRobotTextMessage17.getMsgBody();
        java.lang.String[] strArray25 = new java.lang.String[] { "SelectKey[key='hi!', timestamp=28313287]", "{markdown={content=hi!}, msgtype=markdown}", "factoryBeanObjectType" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient28 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList26);
        qyWeixinRobotTextMessage17.setMentionedList((java.util.List<java.lang.String>) strList26);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient30 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList26);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(strList18);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{msgtype=text, text={content=QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']}}" + "'", str20, "{msgtype=text, text={content=QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']}}");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
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
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent18 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent24 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent26 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent27 = null;
        java.util.concurrent.TimeUnit timeUnit30 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService32 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent33 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit30, false, scheduledExecutorService32);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient34 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList22, qyWeixinRobotHttpClientComponent24, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent26, qyWeixinRobotKeyManagerComponent27, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent33);
        defaultQyWeixinRobotScheduledManagerComponent18.destroy(qyWeixinRobotGroupClient34);
        qyWeixinRobotGroupClient34.destroy();
        // The following exception was thrown during execution in test generation
        try {
            defaultQyWeixinRobotScheduledManagerComponent14.destroy(qyWeixinRobotGroupClient34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse1 = io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse.err("");
        java.lang.String str2 = qyWeixinRobotResponse1.toString();
        java.lang.String str3 = qyWeixinRobotResponse1.getMedia_id();
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']" + "'", str2, "QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotThreadFactory qyWeixinRobotThreadFactory1 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotThreadFactory("");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey1 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("hi!");
        java.lang.String str2 = qyWeixinRobotKey1.getKey();
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey3 = qyWeixinRobotKey1.decrement();
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey4 = qyWeixinRobotKey1.decrement();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent5 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient10 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList8);
        defaultQyWeixinRobotKeyManagerComponent5.init(qyWeixinRobotGroupClient10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList13 = defaultQyWeixinRobotKeyManagerComponent5.selectKeys((int) (byte) 0);
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent14 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient19 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList17);
        defaultQyWeixinRobotKeyManagerComponent14.init(qyWeixinRobotGroupClient19);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList22 = defaultQyWeixinRobotKeyManagerComponent14.selectKeys((int) (byte) 0);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey24 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("hi!");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey25 = qyWeixinRobotKey24.decrement();
        java.lang.String str26 = selectKey25.getKey();
        defaultQyWeixinRobotKeyManagerComponent14.recover(selectKey25);
        long long28 = selectKey25.getTimestamp();
        defaultQyWeixinRobotKeyManagerComponent5.recover(selectKey25);
        int int30 = qyWeixinRobotKey1.increment(selectKey25);
        java.lang.String str31 = selectKey25.getKey();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(selectKey3);
        org.junit.Assert.assertNotNull(selectKey4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(selectKeyList13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(selectKeyList22);
        org.junit.Assert.assertNotNull(selectKey25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 28313288L + "'", long28 == 28313288L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 19 + "'", int30 == 19);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        java.util.List<java.lang.String> strList0 = null;
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient1 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient(strList0);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent2 = qyWeixinRobotGroupClient1.getKeyManager();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage5 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("hi!");
        java.lang.String str6 = qyWeixinRobotMarkdownMessage5.toString();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder callbackBuilder7 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage5);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = qyWeixinRobotMarkdownMessage5.getMsgBody();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse9 = qyWeixinRobotGroupClient1.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage5);
        org.junit.Assert.assertNotNull(qyWeixinRobotKeyManagerComponent2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{markdown={content=hi!}, msgtype=markdown}" + "'", str6, "{markdown={content=hi!}, msgtype=markdown}");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse9);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
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
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent21 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent23 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent24 = null;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService29 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent30 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit27, false, scheduledExecutorService29);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient31 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList19, qyWeixinRobotHttpClientComponent21, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent23, qyWeixinRobotKeyManagerComponent24, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent30);
        defaultQyWeixinRobotScheduledManagerComponent14.init(qyWeixinRobotGroupClient31);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent33 = qyWeixinRobotGroupClient31.getScheduledManager();
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 0 };
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse40 = qyWeixinRobotGroupClient31.uploadMedia("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']", byteArray39);
        java.util.List<java.lang.String> strList41 = qyWeixinRobotGroupClient31.getKeyList();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent33);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[10, 1, 0, 0]");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse40);
        org.junit.Assert.assertNotNull(strList41);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("hi!", "");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article5 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", "factoryBeanObjectType");
        article5.setDescription("");
        java.lang.String str8 = article5.getPicurl();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article11 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        article11.setPicurl("hi!");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article16 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        article16.setPicurl("hi!");
        article16.setPicurl("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        article16.setUrl("hi!");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article25 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        article25.setPicurl("hi!");
        java.lang.String str28 = article25.getDescription();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article31 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        article31.setPicurl("hi!");
        java.lang.String str34 = article31.getTitle();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article37 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        article37.setPicurl("hi!");
        java.lang.String str40 = article37.getDescription();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article43 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        java.lang.String str44 = article43.getDescription();
        java.lang.String str45 = article43.getTitle();
        java.lang.String str46 = article43.getUrl();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article49 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        article49.setPicurl("hi!");
        java.lang.String str52 = article49.getTitle();
        article49.setTitle("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article57 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("factoryBeanObjectType", "SelectKey[key='hi!', timestamp=28313287]");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article60 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        java.lang.String str61 = article60.getPicurl();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article64 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        java.lang.String str65 = article64.getDescription();
        article64.setTitle("{markdown={content=hi!}, msgtype=markdown}");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article[] articleArray68 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article[] { article2, article5, article11, article16, article25, article31, article37, article43, article49, article57, article60, article64 };
        java.util.ArrayList<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article> articleList69 = new java.util.ArrayList<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article>) articleList69, articleArray68);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage qyWeixinRobotNewsMessage71 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage((java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article>) articleList69);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType qyWeixinRobotMessageType72 = qyWeixinRobotNewsMessage71.getMsgType();
        java.util.Map<java.lang.String, java.lang.Object> strMap73 = qyWeixinRobotNewsMessage71.getMsgBody();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(articleArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + qyWeixinRobotMessageType72 + "' != '" + io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.news + "'", qyWeixinRobotMessageType72.equals(io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.news));
        org.junit.Assert.assertNotNull(strMap73);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("hi!", "");
        java.lang.String str3 = article2.getDescription();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent6 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent8 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService14 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent15 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit12, false, scheduledExecutorService14);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient16 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList4, qyWeixinRobotHttpClientComponent6, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent8, qyWeixinRobotKeyManagerComponent9, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent15);
        defaultQyWeixinRobotScheduledManagerComponent0.destroy(qyWeixinRobotGroupClient16);
        qyWeixinRobotGroupClient16.destroy();
        qyWeixinRobotGroupClient16.destroy();
        boolean boolean20 = qyWeixinRobotGroupClient16.isStatus();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient5 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList3);
        defaultQyWeixinRobotKeyManagerComponent0.init(qyWeixinRobotGroupClient5);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList8 = defaultQyWeixinRobotKeyManagerComponent0.selectKeys((int) (byte) 0);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey10 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("hi!");
        java.lang.String str11 = qyWeixinRobotKey10.getKey();
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey12 = qyWeixinRobotKey10.decrement();
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey13 = qyWeixinRobotKey10.decrement();
        java.lang.String str14 = selectKey13.toString();
        java.lang.String str15 = selectKey13.getKey();
        java.lang.String str16 = selectKey13.toString();
        defaultQyWeixinRobotKeyManagerComponent0.recover(selectKey13);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey19 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("hi!");
        java.lang.String str20 = qyWeixinRobotKey19.getKey();
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey21 = qyWeixinRobotKey19.decrement();
        defaultQyWeixinRobotKeyManagerComponent0.recover(selectKey21);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(selectKeyList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(selectKey12);
        org.junit.Assert.assertNotNull(selectKey13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SelectKey[key='hi!', timestamp=28313288]" + "'", str14, "SelectKey[key='hi!', timestamp=28313288]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SelectKey[key='hi!', timestamp=28313288]" + "'", str16, "SelectKey[key='hi!', timestamp=28313288]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(selectKey21);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "{markdown={content=hi!}, msgtype=markdown}" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent6 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent8 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList10 = defaultQyWeixinRobotQueueManagerComponent8.consume((int) ' ');
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService16 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent17 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent(100L, (long) '#', timeUnit14, true, scheduledExecutorService16);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient18 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList4, qyWeixinRobotHttpClientComponent6, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent8, qyWeixinRobotKeyManagerComponent11, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent17);
        io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotGroupBean qyWeixinRobotGroupBean19 = new io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotGroupBean((java.util.List<java.lang.String>) strList4);
        org.springframework.context.ApplicationContext applicationContext20 = null;
        qyWeixinRobotGroupBean19.setApplicationContext(applicationContext20);
        java.lang.String str22 = qyWeixinRobotGroupBean19.getBeanName();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent24 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage27 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("hi!", "");
        java.lang.String str28 = qyWeixinRobotImageMessage27.getBase64();
        boolean boolean29 = defaultQyWeixinRobotQueueManagerComponent24.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage27);
        java.lang.String str30 = qyWeixinRobotImageMessage27.getMd5();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse31 = qyWeixinRobotGroupBean19.sendDirect((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage27);
        qyWeixinRobotGroupBean19.setBeanName("\u72b6\u6001\u5df2\u5173\u95ed");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList10);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse31);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage1 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType qyWeixinRobotMessageType2 = qyWeixinRobotTextMessage1.getMsgType();
        qyWeixinRobotTextMessage1.setContent("SelectKey[key='hi!', timestamp=28313287]");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType qyWeixinRobotMessageType5 = qyWeixinRobotTextMessage1.getMsgType();
        org.junit.Assert.assertTrue("'" + qyWeixinRobotMessageType2 + "' != '" + io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.text + "'", qyWeixinRobotMessageType2.equals(io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.text));
        org.junit.Assert.assertTrue("'" + qyWeixinRobotMessageType5 + "' != '" + io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.text + "'", qyWeixinRobotMessageType5.equals(io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.text));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        article2.setPicurl("hi!");
        java.lang.String str5 = article2.getDescription();
        java.lang.String str6 = article2.getUrl();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotThreadFactory qyWeixinRobotThreadFactory1 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotThreadFactory("\u72b6\u6001\u5df2\u5173\u95ed', type='null', media_id='null', created_at='null']");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey1 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("hi!");
        java.lang.String str2 = qyWeixinRobotKey1.getKey();
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey3 = qyWeixinRobotKey1.decrement();
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey4 = qyWeixinRobotKey1.decrement();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent5 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient10 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList8);
        defaultQyWeixinRobotKeyManagerComponent5.init(qyWeixinRobotGroupClient10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList13 = defaultQyWeixinRobotKeyManagerComponent5.selectKeys((int) (byte) 0);
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent14 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient19 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList17);
        defaultQyWeixinRobotKeyManagerComponent14.init(qyWeixinRobotGroupClient19);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList22 = defaultQyWeixinRobotKeyManagerComponent14.selectKeys((int) (byte) 0);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey24 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("hi!");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey25 = qyWeixinRobotKey24.decrement();
        java.lang.String str26 = selectKey25.getKey();
        defaultQyWeixinRobotKeyManagerComponent14.recover(selectKey25);
        long long28 = selectKey25.getTimestamp();
        defaultQyWeixinRobotKeyManagerComponent5.recover(selectKey25);
        int int30 = qyWeixinRobotKey1.increment(selectKey25);
        java.lang.String str31 = selectKey25.toString();
        java.lang.String str32 = selectKey25.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(selectKey3);
        org.junit.Assert.assertNotNull(selectKey4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(selectKeyList13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(selectKeyList22);
        org.junit.Assert.assertNotNull(selectKey25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 28313288L + "'", long28 == 28313288L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 19 + "'", int30 == 19);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "SelectKey[key='hi!', timestamp=28313288]" + "'", str31, "SelectKey[key='hi!', timestamp=28313288]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "SelectKey[key='hi!', timestamp=28313288]" + "'", str32, "SelectKey[key='hi!', timestamp=28313288]");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "{markdown={content=hi!}, msgtype=markdown}" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent6 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent8 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList10 = defaultQyWeixinRobotQueueManagerComponent8.consume((int) ' ');
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService16 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent17 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent(100L, (long) '#', timeUnit14, true, scheduledExecutorService16);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient18 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList4, qyWeixinRobotHttpClientComponent6, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent8, qyWeixinRobotKeyManagerComponent11, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent17);
        io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotGroupBean qyWeixinRobotGroupBean19 = new io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotGroupBean((java.util.List<java.lang.String>) strList4);
        org.springframework.context.ApplicationContext applicationContext20 = null;
        qyWeixinRobotGroupBean19.setApplicationContext(applicationContext20);
        qyWeixinRobotGroupBean19.setBeanName("hi!");
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent30 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent32 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent33 = null;
        java.util.concurrent.TimeUnit timeUnit36 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService38 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent39 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit36, false, scheduledExecutorService38);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient40 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList28, qyWeixinRobotHttpClientComponent30, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent32, qyWeixinRobotKeyManagerComponent33, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent39);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient41 = null;
        defaultQyWeixinRobotScheduledManagerComponent39.init(qyWeixinRobotGroupClient41);
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent43 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient48 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList46);
        defaultQyWeixinRobotKeyManagerComponent43.init(qyWeixinRobotGroupClient48);
        defaultQyWeixinRobotScheduledManagerComponent39.init(qyWeixinRobotGroupClient48);
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent57 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent59 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent60 = null;
        java.util.concurrent.TimeUnit timeUnit63 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService65 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent66 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit63, false, scheduledExecutorService65);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient67 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList55, qyWeixinRobotHttpClientComponent57, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent59, qyWeixinRobotKeyManagerComponent60, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent66);
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent73 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent75 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent76 = null;
        java.util.concurrent.TimeUnit timeUnit79 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService81 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent82 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit79, false, scheduledExecutorService81);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient83 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList71, qyWeixinRobotHttpClientComponent73, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent75, qyWeixinRobotKeyManagerComponent76, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent82);
        defaultQyWeixinRobotScheduledManagerComponent66.init(qyWeixinRobotGroupClient83);
        byte[] byteArray86 = new byte[] {};
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse87 = qyWeixinRobotGroupClient83.uploadMedia("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", byteArray86);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse88 = qyWeixinRobotGroupClient48.uploadMedia("hi!", byteArray86);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse89 = qyWeixinRobotGroupBean19.uploadMedia("", byteArray86);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList10);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray86), "[]");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse87);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse88);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse89);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotFileMessage qyWeixinRobotFileMessage1 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotFileMessage("{markdown={content=hi!}, msgtype=markdown}");
        qyWeixinRobotFileMessage1.setMediaId("SelectKey[key='hi!', timestamp=28313287]");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration qyWeixinRobotAutoConfiguration0 = new io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent1 = qyWeixinRobotAutoConfiguration0.defaultQyWeixinRobotScheduledManager();
        io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotKeyManagerFactoryBean qyWeixinRobotKeyManagerFactoryBean2 = qyWeixinRobotAutoConfiguration0.defaultKeyManagerFactoryBean();
        boolean boolean3 = qyWeixinRobotKeyManagerFactoryBean2.isSingleton();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent4 = qyWeixinRobotKeyManagerFactoryBean2.getObject();
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent1);
        org.junit.Assert.assertNotNull(qyWeixinRobotKeyManagerFactoryBean2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(qyWeixinRobotKeyManagerComponent4);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent1 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage4 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("hi!", "");
        java.lang.String str5 = qyWeixinRobotImageMessage4.getBase64();
        boolean boolean6 = defaultQyWeixinRobotQueueManagerComponent1.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage4);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList8 = defaultQyWeixinRobotQueueManagerComponent1.consume((-1));
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
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent30 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent32 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent33 = null;
        java.util.concurrent.TimeUnit timeUnit36 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService38 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent39 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit36, false, scheduledExecutorService38);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient40 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList28, qyWeixinRobotHttpClientComponent30, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent32, qyWeixinRobotKeyManagerComponent33, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent39);
        defaultQyWeixinRobotScheduledManagerComponent23.init(qyWeixinRobotGroupClient40);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent42 = qyWeixinRobotGroupClient40.getScheduledManager();
        boolean boolean43 = qyWeixinRobotGroupClient40.isStatus();
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent49 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent51 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent52 = null;
        java.util.concurrent.TimeUnit timeUnit55 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService57 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent58 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit55, false, scheduledExecutorService57);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient59 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList47, qyWeixinRobotHttpClientComponent49, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent51, qyWeixinRobotKeyManagerComponent52, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent58);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent65 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent67 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent68 = null;
        java.util.concurrent.TimeUnit timeUnit71 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService73 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent74 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit71, false, scheduledExecutorService73);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient75 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList63, qyWeixinRobotHttpClientComponent65, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent67, qyWeixinRobotKeyManagerComponent68, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent74);
        defaultQyWeixinRobotScheduledManagerComponent58.init(qyWeixinRobotGroupClient75);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent77 = qyWeixinRobotGroupClient75.getScheduledManager();
        boolean boolean78 = qyWeixinRobotGroupClient75.isStatus();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent79 = qyWeixinRobotGroupClient75.getKeyManager();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent81 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList83 = defaultQyWeixinRobotQueueManagerComponent81.consume((int) ' ');
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage85 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("");
        boolean boolean86 = defaultQyWeixinRobotQueueManagerComponent81.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage85);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse87 = qyWeixinRobotGroupClient75.sendDirect((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage85);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse88 = qyWeixinRobotGroupClient40.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage85);
        boolean boolean89 = defaultQyWeixinRobotQueueManagerComponent1.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage85);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage91 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        java.util.List<java.lang.String> strList92 = qyWeixinRobotTextMessage91.getMentionedList();
        boolean boolean93 = defaultQyWeixinRobotQueueManagerComponent1.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage91);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(qyWeixinRobotKeyManagerComponent79);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList83);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse87);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNull(strList92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey1 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("{markdown={content=hi!}, msgtype=markdown}");
        java.lang.String str2 = qyWeixinRobotKey1.getKey();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{markdown={content=hi!}, msgtype=markdown}" + "'", str2, "{markdown={content=hi!}, msgtype=markdown}");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        java.lang.String str3 = article2.getDescription();
        article2.setTitle("{markdown={content=hi!}, msgtype=markdown}");
        java.lang.String str6 = article2.getDescription();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration qyWeixinRobotAutoConfiguration0 = new io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration();
        io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotQueueManagerFactoryBean qyWeixinRobotQueueManagerFactoryBean1 = qyWeixinRobotAutoConfiguration0.defaultQueueManagerFactoryBean();
        boolean boolean2 = qyWeixinRobotQueueManagerFactoryBean1.isSingleton();
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerFactoryBean1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent();
        java.lang.Class<?> wildcardClass1 = defaultQyWeixinRobotScheduledManagerComponent0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
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
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent30 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent32 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent33 = null;
        java.util.concurrent.TimeUnit timeUnit36 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService38 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent39 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit36, false, scheduledExecutorService38);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient40 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList28, qyWeixinRobotHttpClientComponent30, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent32, qyWeixinRobotKeyManagerComponent33, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent39);
        defaultQyWeixinRobotScheduledManagerComponent23.init(qyWeixinRobotGroupClient40);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent42 = qyWeixinRobotGroupClient40.getScheduledManager();
        boolean boolean43 = qyWeixinRobotGroupClient40.isStatus();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent qyWeixinRobotQueueManagerComponent44 = qyWeixinRobotGroupClient40.getQueueManager();
        defaultQyWeixinRobotKeyManagerComponent0.init(qyWeixinRobotGroupClient40);
        java.util.List<java.lang.String> strList46 = qyWeixinRobotGroupClient40.getKeyList();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(selectKeyList8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerComponent44);
        org.junit.Assert.assertNotNull(strList46);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent defaultQyWeixinRobotRetrofit2HttpClientComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage4 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("\u72b6\u6001\u5df2\u5173\u95ed", "{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse5 = defaultQyWeixinRobotRetrofit2HttpClientComponent0.send("{msgtype=text, text={content=QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']}}", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage4);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType qyWeixinRobotMessageType6 = qyWeixinRobotImageMessage4.getMsgType();
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse5);
        org.junit.Assert.assertTrue("'" + qyWeixinRobotMessageType6 + "' != '" + io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.image + "'", qyWeixinRobotMessageType6.equals(io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.image));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent1 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage4 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("hi!", "");
        java.lang.String str5 = qyWeixinRobotImageMessage4.getBase64();
        boolean boolean6 = defaultQyWeixinRobotQueueManagerComponent1.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage4);
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent8 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList10 = defaultQyWeixinRobotQueueManagerComponent8.consume((int) ' ');
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage12 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("hi!");
        java.lang.String str13 = qyWeixinRobotMarkdownMessage12.getContent();
        boolean boolean14 = defaultQyWeixinRobotQueueManagerComponent8.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage12);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType qyWeixinRobotMessageType15 = qyWeixinRobotMarkdownMessage12.getMsgType();
        boolean boolean16 = defaultQyWeixinRobotQueueManagerComponent1.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage12);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList18 = defaultQyWeixinRobotQueueManagerComponent1.consume((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + qyWeixinRobotMessageType15 + "' != '" + io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.markdown + "'", qyWeixinRobotMessageType15.equals(io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.markdown));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList18);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
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
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent21 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent23 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent24 = null;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService29 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent30 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit27, false, scheduledExecutorService29);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient31 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList19, qyWeixinRobotHttpClientComponent21, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent23, qyWeixinRobotKeyManagerComponent24, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent30);
        defaultQyWeixinRobotScheduledManagerComponent14.init(qyWeixinRobotGroupClient31);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent33 = qyWeixinRobotGroupClient31.getScheduledManager();
        boolean boolean34 = qyWeixinRobotGroupClient31.isStatus();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent qyWeixinRobotQueueManagerComponent35 = qyWeixinRobotGroupClient31.getQueueManager();
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList37 = qyWeixinRobotQueueManagerComponent35.consume(4096);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerComponent35);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList37);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
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
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent21 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent23 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent24 = null;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService29 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent30 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit27, false, scheduledExecutorService29);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient31 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList19, qyWeixinRobotHttpClientComponent21, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent23, qyWeixinRobotKeyManagerComponent24, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent30);
        defaultQyWeixinRobotScheduledManagerComponent14.init(qyWeixinRobotGroupClient31);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent33 = qyWeixinRobotGroupClient31.getScheduledManager();
        boolean boolean34 = qyWeixinRobotGroupClient31.isStatus();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent40 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent42 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent43 = null;
        java.util.concurrent.TimeUnit timeUnit46 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService48 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent49 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit46, false, scheduledExecutorService48);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient50 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList38, qyWeixinRobotHttpClientComponent40, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent42, qyWeixinRobotKeyManagerComponent43, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent49);
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent56 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent58 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent59 = null;
        java.util.concurrent.TimeUnit timeUnit62 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService64 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent65 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit62, false, scheduledExecutorService64);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient66 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList54, qyWeixinRobotHttpClientComponent56, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent58, qyWeixinRobotKeyManagerComponent59, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent65);
        defaultQyWeixinRobotScheduledManagerComponent49.init(qyWeixinRobotGroupClient66);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent68 = qyWeixinRobotGroupClient66.getScheduledManager();
        boolean boolean69 = qyWeixinRobotGroupClient66.isStatus();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent70 = qyWeixinRobotGroupClient66.getKeyManager();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent72 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList74 = defaultQyWeixinRobotQueueManagerComponent72.consume((int) ' ');
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage76 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("");
        boolean boolean77 = defaultQyWeixinRobotQueueManagerComponent72.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage76);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse78 = qyWeixinRobotGroupClient66.sendDirect((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage76);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse79 = qyWeixinRobotGroupClient31.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage76);
        java.lang.String str80 = qyWeixinRobotMarkdownMessage76.getContent();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(qyWeixinRobotKeyManagerComponent70);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse78);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey1 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("hi!");
        java.lang.String str2 = qyWeixinRobotKey1.getKey();
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey3 = qyWeixinRobotKey1.decrement();
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey4 = qyWeixinRobotKey1.decrement();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent5 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient10 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList8);
        defaultQyWeixinRobotKeyManagerComponent5.init(qyWeixinRobotGroupClient10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList13 = defaultQyWeixinRobotKeyManagerComponent5.selectKeys((int) (byte) 0);
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent14 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient19 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList17);
        defaultQyWeixinRobotKeyManagerComponent14.init(qyWeixinRobotGroupClient19);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList22 = defaultQyWeixinRobotKeyManagerComponent14.selectKeys((int) (byte) 0);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey24 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("hi!");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey25 = qyWeixinRobotKey24.decrement();
        java.lang.String str26 = selectKey25.getKey();
        defaultQyWeixinRobotKeyManagerComponent14.recover(selectKey25);
        long long28 = selectKey25.getTimestamp();
        defaultQyWeixinRobotKeyManagerComponent5.recover(selectKey25);
        int int30 = qyWeixinRobotKey1.increment(selectKey25);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey33 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", (long) (byte) 10);
        int int34 = qyWeixinRobotKey1.increment(selectKey33);
        java.lang.String str35 = qyWeixinRobotKey1.getKey();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(selectKey3);
        org.junit.Assert.assertNotNull(selectKey4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(selectKeyList13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(selectKeyList22);
        org.junit.Assert.assertNotNull(selectKey25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 28313288L + "'", long28 == 28313288L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 19 + "'", int30 == 19);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration qyWeixinRobotAutoConfiguration0 = new io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent1 = qyWeixinRobotAutoConfiguration0.defaultQyWeixinRobotHttpClient();
        io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotQueueManagerFactoryBean qyWeixinRobotQueueManagerFactoryBean2 = qyWeixinRobotAutoConfiguration0.defaultQueueManagerFactoryBean();
        java.lang.Class<?> wildcardClass3 = qyWeixinRobotQueueManagerFactoryBean2.getObjectType();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent qyWeixinRobotQueueManagerComponent4 = qyWeixinRobotQueueManagerFactoryBean2.getObject();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent qyWeixinRobotQueueManagerComponent5 = qyWeixinRobotQueueManagerFactoryBean2.getObject();
        java.lang.Class<? extends io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent> wildcardClass6 = qyWeixinRobotQueueManagerFactoryBean2.clazz;
        org.junit.Assert.assertNotNull(qyWeixinRobotHttpClientComponent1);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerFactoryBean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerComponent4);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerComponent5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("hi!", "");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article5 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", "factoryBeanObjectType");
        article5.setDescription("");
        java.lang.String str8 = article5.getPicurl();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article11 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        article11.setPicurl("hi!");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article16 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        article16.setPicurl("hi!");
        article16.setPicurl("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        article16.setUrl("hi!");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article25 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        article25.setPicurl("hi!");
        java.lang.String str28 = article25.getDescription();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article31 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        article31.setPicurl("hi!");
        java.lang.String str34 = article31.getTitle();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article37 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        article37.setPicurl("hi!");
        java.lang.String str40 = article37.getDescription();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article43 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        java.lang.String str44 = article43.getDescription();
        java.lang.String str45 = article43.getTitle();
        java.lang.String str46 = article43.getUrl();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article49 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        article49.setPicurl("hi!");
        java.lang.String str52 = article49.getTitle();
        article49.setTitle("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article57 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("factoryBeanObjectType", "SelectKey[key='hi!', timestamp=28313287]");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article60 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        java.lang.String str61 = article60.getPicurl();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article64 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        java.lang.String str65 = article64.getDescription();
        article64.setTitle("{markdown={content=hi!}, msgtype=markdown}");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article[] articleArray68 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article[] { article2, article5, article11, article16, article25, article31, article37, article43, article49, article57, article60, article64 };
        java.util.ArrayList<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article> articleList69 = new java.util.ArrayList<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article>) articleList69, articleArray68);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage qyWeixinRobotNewsMessage71 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage((java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article>) articleList69);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage qyWeixinRobotNewsMessage72 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage((java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article>) articleList69);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(articleArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent1 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 1);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("hi!", "");
        qyWeixinRobotImageMessage2.setBase64("");
        java.lang.String str5 = qyWeixinRobotImageMessage2.getBase64();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = qyWeixinRobotImageMessage2.getMsgBody();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse1 = io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse.err("");
        qyWeixinRobotResponse1.setErrcode((java.lang.Integer) 19);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse1);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient4 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList2);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent5 = qyWeixinRobotGroupClient4.getHttpClient();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent6 = qyWeixinRobotGroupClient4.getKeyManager();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent7 = qyWeixinRobotGroupClient4.getKeyManager();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotHttpClientComponent5);
        org.junit.Assert.assertNotNull(qyWeixinRobotKeyManagerComponent6);
        org.junit.Assert.assertNotNull(qyWeixinRobotKeyManagerComponent7);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent1 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList3 = defaultQyWeixinRobotQueueManagerComponent1.consume((int) ' ');
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent9 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent11 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService17 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent18 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit15, false, scheduledExecutorService17);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient19 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList7, qyWeixinRobotHttpClientComponent9, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent11, qyWeixinRobotKeyManagerComponent12, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent18);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage21 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        java.util.List<java.lang.String> strList22 = qyWeixinRobotTextMessage21.getMentionedMobileList();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse23 = qyWeixinRobotGroupClient19.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage21);
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = qyWeixinRobotTextMessage21.getMsgBody();
        boolean boolean25 = defaultQyWeixinRobotQueueManagerComponent1.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage21);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient4 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList2);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent5 = qyWeixinRobotGroupClient4.getHttpClient();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent6 = qyWeixinRobotGroupClient4.getScheduledManager();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent defaultQyWeixinRobotRetrofit2HttpClientComponent7 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage11 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("\u72b6\u6001\u5df2\u5173\u95ed", "{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse12 = defaultQyWeixinRobotRetrofit2HttpClientComponent7.send("{msgtype=text, text={content=QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']}}", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage11);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent19 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent21 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent22 = null;
        java.util.concurrent.TimeUnit timeUnit25 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService27 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent28 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit25, false, scheduledExecutorService27);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient29 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList17, qyWeixinRobotHttpClientComponent19, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent21, qyWeixinRobotKeyManagerComponent22, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent28);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage31 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("hi!");
        java.lang.String str32 = qyWeixinRobotMarkdownMessage31.toString();
        boolean boolean33 = defaultQyWeixinRobotQueueManagerComponent21.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage31);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage35 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        java.util.List<java.lang.String> strList36 = qyWeixinRobotTextMessage35.getMentionedList();
        boolean boolean37 = defaultQyWeixinRobotQueueManagerComponent21.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage35);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse38 = defaultQyWeixinRobotRetrofit2HttpClientComponent7.send("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage35);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse39 = qyWeixinRobotGroupClient4.sendDirect((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage35);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotHttpClientComponent5);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent6);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "{markdown={content=hi!}, msgtype=markdown}" + "'", str32, "{markdown={content=hi!}, msgtype=markdown}");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(strList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse38);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse39);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient5 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList3);
        defaultQyWeixinRobotKeyManagerComponent0.init(qyWeixinRobotGroupClient5);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList8 = defaultQyWeixinRobotKeyManagerComponent0.selectKeys(100);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList10 = defaultQyWeixinRobotKeyManagerComponent0.selectKeys(19);
        java.lang.Class<?> wildcardClass11 = selectKeyList10.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(selectKeyList8);
        org.junit.Assert.assertNotNull(selectKeyList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey1 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("hi!");
        java.lang.String str2 = qyWeixinRobotKey1.getKey();
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey3 = qyWeixinRobotKey1.decrement();
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey5 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("hi!");
        java.lang.String str6 = qyWeixinRobotKey5.getKey();
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey7 = qyWeixinRobotKey5.decrement();
        int int8 = qyWeixinRobotKey1.increment(selectKey7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(selectKey3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(selectKey7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage1 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        java.util.List<java.lang.String> strList2 = qyWeixinRobotTextMessage1.getMentionedList();
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType qyWeixinRobotMessageType3 = qyWeixinRobotTextMessage1.getMsgType();
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertTrue("'" + qyWeixinRobotMessageType3 + "' != '" + io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.text + "'", qyWeixinRobotMessageType3.equals(io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.text));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration qyWeixinRobotAutoConfiguration0 = new io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent1 = qyWeixinRobotAutoConfiguration0.defaultQyWeixinRobotScheduledManager();
        io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotKeyManagerFactoryBean qyWeixinRobotKeyManagerFactoryBean2 = qyWeixinRobotAutoConfiguration0.defaultKeyManagerFactoryBean();
        java.lang.Class<? extends io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent> wildcardClass3 = qyWeixinRobotKeyManagerFactoryBean2.clazz;
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent4 = qyWeixinRobotKeyManagerFactoryBean2.getObject();
        java.lang.Class<? extends io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent> wildcardClass5 = qyWeixinRobotKeyManagerFactoryBean2.clazz;
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent6 = qyWeixinRobotKeyManagerFactoryBean2.getObject();
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent1);
        org.junit.Assert.assertNotNull(qyWeixinRobotKeyManagerFactoryBean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(qyWeixinRobotKeyManagerComponent4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(qyWeixinRobotKeyManagerComponent6);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent1 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage4 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("hi!", "");
        java.lang.String str5 = qyWeixinRobotImageMessage4.getBase64();
        boolean boolean6 = defaultQyWeixinRobotQueueManagerComponent1.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage4);
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent8 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList10 = defaultQyWeixinRobotQueueManagerComponent8.consume((int) ' ');
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage12 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("hi!");
        java.lang.String str13 = qyWeixinRobotMarkdownMessage12.getContent();
        boolean boolean14 = defaultQyWeixinRobotQueueManagerComponent8.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage12);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType qyWeixinRobotMessageType15 = qyWeixinRobotMarkdownMessage12.getMsgType();
        boolean boolean16 = defaultQyWeixinRobotQueueManagerComponent1.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage12);
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent defaultQyWeixinRobotRetrofit2HttpClientComponent17 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent20 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList22 = defaultQyWeixinRobotQueueManagerComponent20.consume((int) ' ');
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage24 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("hi!");
        java.lang.String str25 = qyWeixinRobotMarkdownMessage24.getContent();
        boolean boolean26 = defaultQyWeixinRobotQueueManagerComponent20.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage24);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType qyWeixinRobotMessageType27 = qyWeixinRobotMarkdownMessage24.getMsgType();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse28 = defaultQyWeixinRobotRetrofit2HttpClientComponent17.send("hi!", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage24);
        boolean boolean29 = defaultQyWeixinRobotQueueManagerComponent1.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage24);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + qyWeixinRobotMessageType15 + "' != '" + io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.markdown + "'", qyWeixinRobotMessageType15.equals(io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.markdown));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + qyWeixinRobotMessageType27 + "' != '" + io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.markdown + "'", qyWeixinRobotMessageType27.equals(io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.markdown));
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent1 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage4 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("hi!", "");
        java.lang.String str5 = qyWeixinRobotImageMessage4.getBase64();
        boolean boolean6 = defaultQyWeixinRobotQueueManagerComponent1.provide((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage4);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList8 = defaultQyWeixinRobotQueueManagerComponent1.consume(1);
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
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent30 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent32 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent33 = null;
        java.util.concurrent.TimeUnit timeUnit36 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService38 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent39 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit36, false, scheduledExecutorService38);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient40 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList28, qyWeixinRobotHttpClientComponent30, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent32, qyWeixinRobotKeyManagerComponent33, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent39);
        defaultQyWeixinRobotScheduledManagerComponent23.init(qyWeixinRobotGroupClient40);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent42 = qyWeixinRobotGroupClient40.getScheduledManager();
        boolean boolean43 = qyWeixinRobotGroupClient40.isStatus();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent qyWeixinRobotQueueManagerComponent44 = qyWeixinRobotGroupClient40.getQueueManager();
        defaultQyWeixinRobotQueueManagerComponent1.init(qyWeixinRobotGroupClient40);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerComponent44);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "{markdown={content=hi!}, msgtype=markdown}" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent6 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent8 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList10 = defaultQyWeixinRobotQueueManagerComponent8.consume((int) ' ');
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService16 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent17 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent(100L, (long) '#', timeUnit14, true, scheduledExecutorService16);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient18 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList4, qyWeixinRobotHttpClientComponent6, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent8, qyWeixinRobotKeyManagerComponent11, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent17);
        io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotGroupBean qyWeixinRobotGroupBean19 = new io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotGroupBean((java.util.List<java.lang.String>) strList4);
        org.springframework.context.ApplicationContext applicationContext20 = null;
        qyWeixinRobotGroupBean19.setApplicationContext(applicationContext20);
        qyWeixinRobotGroupBean19.setBeanName("hi!");
        qyWeixinRobotGroupBean19.setBeanName("\u72b6\u6001\u5df2\u5173\u95ed', type='null', media_id='null', created_at='null']");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList10);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", "factoryBeanObjectType");
        article2.setPicurl("");
        java.lang.String str5 = article2.getTitle();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']" + "'", str5, "QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration qyWeixinRobotAutoConfiguration0 = new io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration();
        io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotQueueManagerFactoryBean qyWeixinRobotQueueManagerFactoryBean1 = qyWeixinRobotAutoConfiguration0.defaultQueueManagerFactoryBean();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent2 = qyWeixinRobotAutoConfiguration0.defaultQyWeixinRobotHttpClient();
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerFactoryBean1);
        org.junit.Assert.assertNotNull(qyWeixinRobotHttpClientComponent2);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
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
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList50 = defaultQyWeixinRobotKeyManagerComponent0.selectKeys(0);
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
        org.junit.Assert.assertNotNull(selectKeyList50);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", "factoryBeanObjectType");
        article2.setDescription("");
        java.lang.String str5 = article2.getPicurl();
        java.lang.String str6 = article2.getPicurl();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration qyWeixinRobotAutoConfiguration0 = new io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent1 = qyWeixinRobotAutoConfiguration0.defaultQyWeixinRobotHttpClient();
        io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotQueueManagerFactoryBean qyWeixinRobotQueueManagerFactoryBean2 = qyWeixinRobotAutoConfiguration0.defaultQueueManagerFactoryBean();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent3 = qyWeixinRobotAutoConfiguration0.defaultQyWeixinRobotHttpClient();
        io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotKeyManagerFactoryBean qyWeixinRobotKeyManagerFactoryBean4 = qyWeixinRobotAutoConfiguration0.defaultKeyManagerFactoryBean();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent5 = qyWeixinRobotKeyManagerFactoryBean4.getObject();
        org.junit.Assert.assertNotNull(qyWeixinRobotHttpClientComponent1);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerFactoryBean2);
        org.junit.Assert.assertNotNull(qyWeixinRobotHttpClientComponent3);
        org.junit.Assert.assertNotNull(qyWeixinRobotKeyManagerFactoryBean4);
        org.junit.Assert.assertNotNull(qyWeixinRobotKeyManagerComponent5);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent();
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotThreadFactory qyWeixinRobotThreadFactory2 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotThreadFactory("hi!");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotThreadFactory qyWeixinRobotThreadFactory4 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotThreadFactory("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        java.lang.Runnable runnable5 = null;
        java.lang.Thread thread6 = qyWeixinRobotThreadFactory4.newThread(runnable5);
        java.lang.Thread thread7 = qyWeixinRobotThreadFactory2.newThread((java.lang.Runnable) thread6);
        java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture8 = defaultQyWeixinRobotScheduledManagerComponent0.scheduled((java.lang.Runnable) thread7);
        org.junit.Assert.assertNotNull(thread6);
        org.junit.Assert.assertEquals(thread6.toString(), "Thread[QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']1,5,main]");
        org.junit.Assert.assertNotNull(thread7);
        org.junit.Assert.assertEquals(thread7.toString(), "Thread[hi!1,5,main]");
        org.junit.Assert.assertNotNull(wildcardScheduledFuture8);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("hi!", "");
        qyWeixinRobotImageMessage2.setBase64("hi!");
        qyWeixinRobotImageMessage2.setBase64("SelectKey[key='factoryBeanObjectType', timestamp=0]");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
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
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent21 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent23 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent24 = null;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService29 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent30 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit27, false, scheduledExecutorService29);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient31 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList19, qyWeixinRobotHttpClientComponent21, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent23, qyWeixinRobotKeyManagerComponent24, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent30);
        defaultQyWeixinRobotScheduledManagerComponent14.init(qyWeixinRobotGroupClient31);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent33 = qyWeixinRobotGroupClient31.getScheduledManager();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent qyWeixinRobotQueueManagerComponent34 = qyWeixinRobotGroupClient31.getQueueManager();
        boolean boolean35 = qyWeixinRobotGroupClient31.isStatus();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent33);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerComponent34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage1 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("SelectKey[key='hi!', timestamp=28313287]");
        java.util.List<java.lang.String> strList2 = qyWeixinRobotTextMessage1.getMentionedList();
        qyWeixinRobotTextMessage1.setContent("ok");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent5 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient10 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList8);
        defaultQyWeixinRobotKeyManagerComponent5.init(qyWeixinRobotGroupClient10);
        boolean boolean12 = qyWeixinRobotGroupClient10.isStatus();
        java.util.List<java.lang.String> strList13 = qyWeixinRobotGroupClient10.getKeyList();
        qyWeixinRobotTextMessage1.setMentionedMobileList(strList13);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("hi!", "");
        qyWeixinRobotImageMessage2.setBase64("");
        java.lang.String str5 = qyWeixinRobotImageMessage2.getBase64();
        qyWeixinRobotImageMessage2.setMd5("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        qyWeixinRobotImageMessage2.setBase64("");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType qyWeixinRobotMessageType10 = qyWeixinRobotImageMessage2.getMsgType();
        qyWeixinRobotImageMessage2.setBase64("{msgtype=text, text={content=QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']}}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + qyWeixinRobotMessageType10 + "' != '" + io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.image + "'", qyWeixinRobotMessageType10.equals(io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.image));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        java.lang.String str3 = article2.getDescription();
        article2.setTitle("{markdown={content=hi!}, msgtype=markdown}");
        article2.setDescription("");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration qyWeixinRobotAutoConfiguration0 = new io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent1 = qyWeixinRobotAutoConfiguration0.defaultQyWeixinRobotScheduledManager();
        io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotQueueManagerFactoryBean qyWeixinRobotQueueManagerFactoryBean2 = qyWeixinRobotAutoConfiguration0.defaultQueueManagerFactoryBean();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent qyWeixinRobotQueueManagerComponent3 = qyWeixinRobotQueueManagerFactoryBean2.getObject();
        boolean boolean4 = qyWeixinRobotQueueManagerFactoryBean2.isSingleton();
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent1);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerFactoryBean2);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerComponent3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
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
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient36 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList34);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage39 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("{markdown={content=hi!}, msgtype=markdown}", "QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse40 = qyWeixinRobotGroupClient36.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage39);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage43 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("\u72b6\u6001\u5df2\u5173\u95ed", "QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse44 = qyWeixinRobotGroupClient36.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage43);
        defaultQyWeixinRobotKeyManagerComponent0.init(qyWeixinRobotGroupClient36);
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent46 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient51 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList49);
        defaultQyWeixinRobotKeyManagerComponent46.init(qyWeixinRobotGroupClient51);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList54 = defaultQyWeixinRobotKeyManagerComponent46.selectKeys((int) (byte) 0);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey56 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("hi!");
        java.lang.String str57 = qyWeixinRobotKey56.getKey();
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey58 = qyWeixinRobotKey56.decrement();
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey59 = qyWeixinRobotKey56.decrement();
        java.lang.String str60 = selectKey59.toString();
        java.lang.String str61 = selectKey59.getKey();
        java.lang.String str62 = selectKey59.toString();
        defaultQyWeixinRobotKeyManagerComponent46.recover(selectKey59);
        defaultQyWeixinRobotKeyManagerComponent0.recover(selectKey59);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(selectKeyList8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(strList27);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse28);
        org.junit.Assert.assertNotNull(selectKeyList31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse40);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse44);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(selectKeyList54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(selectKey58);
        org.junit.Assert.assertNotNull(selectKey59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "SelectKey[key='hi!', timestamp=28313288]" + "'", str60, "SelectKey[key='hi!', timestamp=28313288]");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "SelectKey[key='hi!', timestamp=28313288]" + "'", str62, "SelectKey[key='hi!', timestamp=28313288]");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent defaultQyWeixinRobotRetrofit2HttpClientComponent1 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage5 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("\u72b6\u6001\u5df2\u5173\u95ed", "{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse6 = defaultQyWeixinRobotRetrofit2HttpClientComponent1.send("{msgtype=text, text={content=QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']}}", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage5);
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder callbackBuilder7 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage5);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = qyWeixinRobotImageMessage5.getMsgBody();
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse6);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("hi!");
        java.lang.String str3 = qyWeixinRobotMarkdownMessage2.toString();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder callbackBuilder4 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage2);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType qyWeixinRobotMessageType5 = qyWeixinRobotMarkdownMessage2.getMsgType();
        qyWeixinRobotMarkdownMessage2.setContent("SelectKey[key='hi!', timestamp=28313287]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{markdown={content=hi!}, msgtype=markdown}" + "'", str3, "{markdown={content=hi!}, msgtype=markdown}");
        org.junit.Assert.assertTrue("'" + qyWeixinRobotMessageType5 + "' != '" + io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.markdown + "'", qyWeixinRobotMessageType5.equals(io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.markdown));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", "factoryBeanObjectType");
        java.lang.String str3 = article2.getPicurl();
        java.lang.String str4 = article2.getPicurl();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage1 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        java.util.List<java.lang.String> strList2 = qyWeixinRobotTextMessage1.getMentionedMobileList();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = qyWeixinRobotTextMessage1.getMsgBody();
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey2 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey("\u72b6\u6001\u5df2\u5173\u95ed', type='null', media_id='null', created_at='null']", 28313287L);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient4 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList2);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage7 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("{markdown={content=hi!}, msgtype=markdown}", "QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse8 = qyWeixinRobotGroupClient4.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage7);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent qyWeixinRobotQueueManagerComponent9 = qyWeixinRobotGroupClient4.getQueueManager();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent10 = qyWeixinRobotGroupClient4.getKeyManager();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent11 = qyWeixinRobotGroupClient4.getScheduledManager();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse8);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerComponent9);
        org.junit.Assert.assertNotNull(qyWeixinRobotKeyManagerComponent10);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent11);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration qyWeixinRobotAutoConfiguration0 = new io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent1 = qyWeixinRobotAutoConfiguration0.defaultQyWeixinRobotScheduledManager();
        io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotKeyManagerFactoryBean qyWeixinRobotKeyManagerFactoryBean2 = qyWeixinRobotAutoConfiguration0.defaultKeyManagerFactoryBean();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent3 = qyWeixinRobotAutoConfiguration0.defaultQyWeixinRobotHttpClient();
        io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotQueueManagerFactoryBean qyWeixinRobotQueueManagerFactoryBean4 = qyWeixinRobotAutoConfiguration0.defaultQueueManagerFactoryBean();
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent1);
        org.junit.Assert.assertNotNull(qyWeixinRobotKeyManagerFactoryBean2);
        org.junit.Assert.assertNotNull(qyWeixinRobotHttpClientComponent3);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerFactoryBean4);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
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
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent21 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent23 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent24 = null;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService29 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent30 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit27, false, scheduledExecutorService29);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient31 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList19, qyWeixinRobotHttpClientComponent21, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent23, qyWeixinRobotKeyManagerComponent24, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent30);
        defaultQyWeixinRobotScheduledManagerComponent14.init(qyWeixinRobotGroupClient31);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent33 = qyWeixinRobotGroupClient31.getScheduledManager();
        boolean boolean34 = qyWeixinRobotGroupClient31.isStatus();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent36 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent42 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent44 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent45 = null;
        java.util.concurrent.TimeUnit timeUnit48 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService50 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent51 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit48, false, scheduledExecutorService50);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient52 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList40, qyWeixinRobotHttpClientComponent42, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent44, qyWeixinRobotKeyManagerComponent45, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent51);
        defaultQyWeixinRobotScheduledManagerComponent36.destroy(qyWeixinRobotGroupClient52);
        qyWeixinRobotGroupClient52.destroy();
        qyWeixinRobotGroupClient52.destroy();
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent62 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent64 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent65 = null;
        java.util.concurrent.TimeUnit timeUnit68 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService70 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent71 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit68, false, scheduledExecutorService70);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient72 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList60, qyWeixinRobotHttpClientComponent62, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent64, qyWeixinRobotKeyManagerComponent65, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent71);
        java.lang.String[] strArray75 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList76 = new java.util.ArrayList<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList76, strArray75);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent78 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent80 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent81 = null;
        java.util.concurrent.TimeUnit timeUnit84 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService86 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent87 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit84, false, scheduledExecutorService86);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient88 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList76, qyWeixinRobotHttpClientComponent78, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent80, qyWeixinRobotKeyManagerComponent81, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent87);
        defaultQyWeixinRobotScheduledManagerComponent71.init(qyWeixinRobotGroupClient88);
        byte[] byteArray91 = new byte[] {};
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse92 = qyWeixinRobotGroupClient88.uploadMedia("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", byteArray91);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse93 = qyWeixinRobotGroupClient52.uploadMedia("\u72b6\u6001\u5df2\u5173\u95ed", byteArray91);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse94 = qyWeixinRobotGroupClient31.uploadMedia("{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}", byteArray91);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent qyWeixinRobotQueueManagerComponent95 = qyWeixinRobotGroupClient31.getQueueManager();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent96 = qyWeixinRobotGroupClient31.getKeyManager();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray91), "[]");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse92);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse93);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse94);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerComponent95);
        org.junit.Assert.assertNotNull(qyWeixinRobotKeyManagerComponent96);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "{markdown={content=hi!}, msgtype=markdown}" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent6 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent8 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList10 = defaultQyWeixinRobotQueueManagerComponent8.consume((int) ' ');
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService16 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent17 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent(100L, (long) '#', timeUnit14, true, scheduledExecutorService16);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient18 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList4, qyWeixinRobotHttpClientComponent6, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent8, qyWeixinRobotKeyManagerComponent11, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent17);
        io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotGroupBean qyWeixinRobotGroupBean19 = new io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotGroupBean((java.util.List<java.lang.String>) strList4);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage22 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("hi!");
        java.lang.String str23 = qyWeixinRobotMarkdownMessage22.toString();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder callbackBuilder24 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage22);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = qyWeixinRobotMarkdownMessage22.getMsgBody();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse26 = qyWeixinRobotGroupBean19.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage22);
        java.lang.String str27 = qyWeixinRobotResponse26.getCreated_at();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{markdown={content=hi!}, msgtype=markdown}" + "'", str23, "{markdown={content=hi!}, msgtype=markdown}");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}", "QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        java.lang.String str3 = article2.getPicurl();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService4 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent5 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 10, (long) (short) 100, timeUnit2, true, scheduledExecutorService4);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey2 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey("SelectKey[key='hi!', timestamp=28313288]", (long) '#');
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        java.lang.String[] strArray3 = new java.lang.String[] { "SelectKey[key='hi!', timestamp=28313287]", "{markdown={content=hi!}, msgtype=markdown}", "factoryBeanObjectType" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient6 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList4);
        qyWeixinRobotGroupClient6.destroy();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent9 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient14 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList12);
        defaultQyWeixinRobotKeyManagerComponent9.init(qyWeixinRobotGroupClient14);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList17 = defaultQyWeixinRobotKeyManagerComponent9.selectKeys((int) (byte) 0);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent23 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent25 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent26 = null;
        java.util.concurrent.TimeUnit timeUnit29 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService31 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent32 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit29, false, scheduledExecutorService31);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient33 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList21, qyWeixinRobotHttpClientComponent23, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent25, qyWeixinRobotKeyManagerComponent26, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent32);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent39 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent41 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent42 = null;
        java.util.concurrent.TimeUnit timeUnit45 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService47 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent48 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit45, false, scheduledExecutorService47);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient49 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList37, qyWeixinRobotHttpClientComponent39, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent41, qyWeixinRobotKeyManagerComponent42, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent48);
        defaultQyWeixinRobotScheduledManagerComponent32.init(qyWeixinRobotGroupClient49);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent51 = qyWeixinRobotGroupClient49.getScheduledManager();
        boolean boolean52 = qyWeixinRobotGroupClient49.isStatus();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent qyWeixinRobotQueueManagerComponent53 = qyWeixinRobotGroupClient49.getQueueManager();
        defaultQyWeixinRobotKeyManagerComponent9.init(qyWeixinRobotGroupClient49);
        byte[] byteArray57 = new byte[] { (byte) -1 };
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse58 = qyWeixinRobotGroupClient49.uploadMedia("SelectKey[key='hi!', timestamp=28313287]", byteArray57);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse59 = qyWeixinRobotGroupClient6.uploadMedia("ok", byteArray57);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(selectKeyList17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerComponent53);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-1]");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse58);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse59);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage1 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("SelectKey[key='hi!', timestamp=28313287]");
        java.util.List<java.lang.String> strList2 = qyWeixinRobotTextMessage1.getMentionedMobileList();
        qyWeixinRobotTextMessage1.setContent("hi!");
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotFileMessage qyWeixinRobotFileMessage1 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotFileMessage("{markdown={content=hi!}, msgtype=markdown}");
        java.lang.String str2 = qyWeixinRobotFileMessage1.getMediaId();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{markdown={content=hi!}, msgtype=markdown}" + "'", str2, "{markdown={content=hi!}, msgtype=markdown}");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        java.util.List<java.lang.String> strList0 = null;
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient1 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient(strList0);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent2 = qyWeixinRobotGroupClient1.getKeyManager();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent3 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient8 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList6);
        defaultQyWeixinRobotKeyManagerComponent3.init(qyWeixinRobotGroupClient8);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList11 = defaultQyWeixinRobotKeyManagerComponent3.selectKeys((int) (byte) 0);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent17 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent19 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent20 = null;
        java.util.concurrent.TimeUnit timeUnit23 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService25 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent26 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit23, false, scheduledExecutorService25);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient27 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList15, qyWeixinRobotHttpClientComponent17, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent19, qyWeixinRobotKeyManagerComponent20, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent26);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage29 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        java.util.List<java.lang.String> strList30 = qyWeixinRobotTextMessage29.getMentionedMobileList();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse31 = qyWeixinRobotGroupClient27.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage29);
        defaultQyWeixinRobotKeyManagerComponent3.init(qyWeixinRobotGroupClient27);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList34 = defaultQyWeixinRobotKeyManagerComponent3.selectKeys(0);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList36 = defaultQyWeixinRobotKeyManagerComponent3.selectKeys((int) 'a');
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent37 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient42 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList40);
        defaultQyWeixinRobotKeyManagerComponent37.init(qyWeixinRobotGroupClient42);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList45 = defaultQyWeixinRobotKeyManagerComponent37.selectKeys((int) (byte) 0);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey47 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("hi!");
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey48 = qyWeixinRobotKey47.decrement();
        java.lang.String str49 = selectKey48.getKey();
        defaultQyWeixinRobotKeyManagerComponent37.recover(selectKey48);
        defaultQyWeixinRobotKeyManagerComponent3.recover(selectKey48);
        long long52 = selectKey48.getTimestamp();
        // The following exception was thrown during execution in test generation
        try {
            qyWeixinRobotKeyManagerComponent2.recover(selectKey48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qyWeixinRobotKeyManagerComponent2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(selectKeyList11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(strList30);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse31);
        org.junit.Assert.assertNotNull(selectKeyList34);
        org.junit.Assert.assertNotNull(selectKeyList36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(selectKeyList45);
        org.junit.Assert.assertNotNull(selectKey48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 28313288L + "'", long52 == 28313288L);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("\u72b6\u6001\u5df2\u5173\u95ed", "\u72b6\u6001\u5df2\u5173\u95ed");
        java.lang.String str3 = qyWeixinRobotImageMessage2.getMd5();
        java.lang.String str4 = qyWeixinRobotImageMessage2.getBase64();
        java.lang.Class<?> wildcardClass5 = qyWeixinRobotImageMessage2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u72b6\u6001\u5df2\u5173\u95ed" + "'", str3, "\u72b6\u6001\u5df2\u5173\u95ed");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u72b6\u6001\u5df2\u5173\u95ed" + "'", str4, "\u72b6\u6001\u5df2\u5173\u95ed");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotFileMessage qyWeixinRobotFileMessage1 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotFileMessage("{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}");
        java.lang.String str2 = qyWeixinRobotFileMessage1.getMediaId();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = qyWeixinRobotFileMessage1.getMsgBody();
        java.lang.String str4 = qyWeixinRobotFileMessage1.getMediaId();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}" + "'", str2, "{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}" + "'", str4, "{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        article2.setPicurl("{msgtype=text, text={content=QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']}}");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse0 = io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse.ok();
        java.lang.String str1 = qyWeixinRobotResponse0.getErrmsg();
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ok" + "'", str1, "ok");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent6 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent8 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService14 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent15 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit12, false, scheduledExecutorService14);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient16 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList4, qyWeixinRobotHttpClientComponent6, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent8, qyWeixinRobotKeyManagerComponent9, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent15);
        defaultQyWeixinRobotScheduledManagerComponent0.destroy(qyWeixinRobotGroupClient16);
        qyWeixinRobotGroupClient16.destroy();
        qyWeixinRobotGroupClient16.destroy();
        qyWeixinRobotGroupClient16.destroy();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent21 = qyWeixinRobotGroupClient16.getHttpClient();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent qyWeixinRobotQueueManagerComponent22 = qyWeixinRobotGroupClient16.getQueueManager();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent29 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent31 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent32 = null;
        java.util.concurrent.TimeUnit timeUnit35 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService37 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent38 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit35, false, scheduledExecutorService37);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient39 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList27, qyWeixinRobotHttpClientComponent29, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent31, qyWeixinRobotKeyManagerComponent32, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent38);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient40 = null;
        defaultQyWeixinRobotScheduledManagerComponent38.init(qyWeixinRobotGroupClient40);
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent42 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient47 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList45);
        defaultQyWeixinRobotKeyManagerComponent42.init(qyWeixinRobotGroupClient47);
        defaultQyWeixinRobotScheduledManagerComponent38.init(qyWeixinRobotGroupClient47);
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent56 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent58 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent59 = null;
        java.util.concurrent.TimeUnit timeUnit62 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService64 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent65 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit62, false, scheduledExecutorService64);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient66 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList54, qyWeixinRobotHttpClientComponent56, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent58, qyWeixinRobotKeyManagerComponent59, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent65);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent72 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent74 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent75 = null;
        java.util.concurrent.TimeUnit timeUnit78 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService80 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent81 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit78, false, scheduledExecutorService80);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient82 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList70, qyWeixinRobotHttpClientComponent72, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent74, qyWeixinRobotKeyManagerComponent75, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent81);
        defaultQyWeixinRobotScheduledManagerComponent65.init(qyWeixinRobotGroupClient82);
        byte[] byteArray85 = new byte[] {};
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse86 = qyWeixinRobotGroupClient82.uploadMedia("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", byteArray85);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse87 = qyWeixinRobotGroupClient47.uploadMedia("hi!", byteArray85);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse88 = qyWeixinRobotGroupClient16.uploadMedia("{markdown={content=hi!}, msgtype=markdown}", byteArray85);
        java.lang.String str89 = qyWeixinRobotResponse88.getType();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotHttpClientComponent21);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerComponent22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[]");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse86);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse87);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse88);
        org.junit.Assert.assertNull(str89);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage3 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("SelectKey[key='hi!', timestamp=28313287]");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder callbackBuilder4 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder("{markdown={content=hi!}, msgtype=markdown}", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage3);
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder callbackBuilder5 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent.CallbackBuilder("SelectKey[key='hi!', timestamp=28313287]", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage3);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("\u72b6\u6001\u5df2\u5173\u95ed", "\u72b6\u6001\u5df2\u5173\u95ed");
        article2.setUrl("hi!");
        java.lang.String str5 = article2.getUrl();
        article2.setUrl("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration qyWeixinRobotAutoConfiguration0 = new io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent qyWeixinRobotScheduledManagerComponent1 = qyWeixinRobotAutoConfiguration0.defaultQyWeixinRobotScheduledManager();
        io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotKeyManagerFactoryBean qyWeixinRobotKeyManagerFactoryBean2 = qyWeixinRobotAutoConfiguration0.defaultKeyManagerFactoryBean();
        java.lang.Class<? extends io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent> wildcardClass3 = qyWeixinRobotKeyManagerFactoryBean2.clazz;
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent4 = qyWeixinRobotKeyManagerFactoryBean2.getObject();
        java.lang.Class<?> wildcardClass5 = qyWeixinRobotKeyManagerFactoryBean2.getObjectType();
        org.junit.Assert.assertNotNull(qyWeixinRobotScheduledManagerComponent1);
        org.junit.Assert.assertNotNull(qyWeixinRobotKeyManagerFactoryBean2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(qyWeixinRobotKeyManagerComponent4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration qyWeixinRobotAutoConfiguration0 = new io.github.wesleyone.qy.weixin.robot.spring.autoconfiguration.QyWeixinRobotAutoConfiguration();
        io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotQueueManagerFactoryBean qyWeixinRobotQueueManagerFactoryBean1 = qyWeixinRobotAutoConfiguration0.defaultQueueManagerFactoryBean();
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent qyWeixinRobotQueueManagerComponent2 = qyWeixinRobotQueueManagerFactoryBean1.getObject();
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerFactoryBean1);
        org.junit.Assert.assertNotNull(qyWeixinRobotQueueManagerComponent2);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
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
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage17 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        java.util.List<java.lang.String> strList18 = qyWeixinRobotTextMessage17.getMentionedMobileList();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse19 = qyWeixinRobotGroupClient15.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotTextMessage17);
        qyWeixinRobotResponse19.setType("hi!");
        boolean boolean22 = qyWeixinRobotResponse19.isSuccess();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(strList18);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article article2 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotNewsMessage.Article("", "hi!");
        article2.setPicurl("hi!");
        java.lang.String str5 = article2.getTitle();
        java.lang.String str6 = article2.getTitle();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage1 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("{markdown={content=hi!}, msgtype=markdown}");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = qyWeixinRobotTextMessage1.getMsgBody();
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType qyWeixinRobotMessageType3 = qyWeixinRobotTextMessage1.getMsgType();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + qyWeixinRobotMessageType3 + "' != '" + io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.text + "'", qyWeixinRobotMessageType3.equals(io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotMessageType.text));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent defaultQyWeixinRobotRetrofit2HttpClientComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotRetrofit2HttpClientComponent();
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent2 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent8 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent10 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService16 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent17 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit14, false, scheduledExecutorService16);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient18 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList6, qyWeixinRobotHttpClientComponent8, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent10, qyWeixinRobotKeyManagerComponent11, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent17);
        defaultQyWeixinRobotScheduledManagerComponent2.destroy(qyWeixinRobotGroupClient18);
        qyWeixinRobotGroupClient18.destroy();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage qyWeixinRobotImageMessage23 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotImageMessage("\u72b6\u6001\u5df2\u5173\u95ed", "QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse24 = qyWeixinRobotGroupClient18.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage23);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse25 = defaultQyWeixinRobotRetrofit2HttpClientComponent0.send("\u72b6\u6001\u5df2\u5173\u95ed", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotImageMessage23);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage28 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("{markdown={content=QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']}, msgtype=markdown}");
        java.util.function.Supplier<retrofit2.Callback<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse>> qyWeixinRobotResponseCallbackSupplier29 = null;
        defaultQyWeixinRobotRetrofit2HttpClientComponent0.sendAsync("{markdown={content=hi!}, msgtype=markdown}", (io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage28, qyWeixinRobotResponseCallbackSupplier29);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse24);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse25);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage qyWeixinRobotTextMessage1 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotTextMessage("SelectKey[key='hi!', timestamp=28313287]");
        java.util.List<java.lang.String> strList2 = qyWeixinRobotTextMessage1.getMentionedMobileList();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = qyWeixinRobotTextMessage1.getMsgBody();
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService4 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent5 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent(100L, (long) '#', timeUnit2, true, scheduledExecutorService4);
        java.lang.String[] strArray9 = new java.lang.String[] { "SelectKey[key='hi!', timestamp=28313287]", "{markdown={content=hi!}, msgtype=markdown}", "factoryBeanObjectType" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient12 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList10);
        defaultQyWeixinRobotScheduledManagerComponent5.init(qyWeixinRobotGroupClient12);
        qyWeixinRobotGroupClient12.init();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
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
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList31 = defaultQyWeixinRobotKeyManagerComponent0.selectKeys((int) (short) 0);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList33 = defaultQyWeixinRobotKeyManagerComponent0.selectKeys((int) (short) 1);
        java.util.List<io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey> selectKeyList35 = defaultQyWeixinRobotKeyManagerComponent0.selectKeys((int) (short) 0);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent41 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent43 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent44 = null;
        java.util.concurrent.TimeUnit timeUnit47 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService49 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent50 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit47, false, scheduledExecutorService49);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient51 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList39, qyWeixinRobotHttpClientComponent41, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent43, qyWeixinRobotKeyManagerComponent44, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent50);
        defaultQyWeixinRobotKeyManagerComponent0.init(qyWeixinRobotGroupClient51);
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey qyWeixinRobotKey54 = new io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey("hi!");
        java.lang.String str55 = qyWeixinRobotKey54.getKey();
        io.github.wesleyone.qy.weixin.robot.common.QyWeixinRobotKey.SelectKey selectKey56 = qyWeixinRobotKey54.decrement();
        defaultQyWeixinRobotKeyManagerComponent0.recover(selectKey56);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(selectKeyList8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(strList27);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse28);
        org.junit.Assert.assertNotNull(selectKeyList31);
        org.junit.Assert.assertNotNull(selectKeyList33);
        org.junit.Assert.assertNotNull(selectKeyList35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(selectKey56);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "{markdown={content=hi!}, msgtype=markdown}" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent6 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent8 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        java.util.List<io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage> qyWeixinRobotBaseMessageList10 = defaultQyWeixinRobotQueueManagerComponent8.consume((int) ' ');
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService16 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent17 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent(100L, (long) '#', timeUnit14, true, scheduledExecutorService16);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient18 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList4, qyWeixinRobotHttpClientComponent6, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent8, qyWeixinRobotKeyManagerComponent11, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent17);
        io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotGroupBean qyWeixinRobotGroupBean19 = new io.github.wesleyone.qy.weixin.robot.spring.bean.QyWeixinRobotGroupBean((java.util.List<java.lang.String>) strList4);
        org.springframework.context.ApplicationContext applicationContext20 = null;
        qyWeixinRobotGroupBean19.setApplicationContext(applicationContext20);
        java.lang.String str22 = qyWeixinRobotGroupBean19.getBeanName();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent29 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent31 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent32 = null;
        java.util.concurrent.TimeUnit timeUnit35 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService37 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent38 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit35, false, scheduledExecutorService37);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient39 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList27, qyWeixinRobotHttpClientComponent29, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent31, qyWeixinRobotKeyManagerComponent32, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent38);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient40 = null;
        defaultQyWeixinRobotScheduledManagerComponent38.init(qyWeixinRobotGroupClient40);
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent defaultQyWeixinRobotKeyManagerComponent42 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotKeyManagerComponent();
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient47 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList45);
        defaultQyWeixinRobotKeyManagerComponent42.init(qyWeixinRobotGroupClient47);
        defaultQyWeixinRobotScheduledManagerComponent38.init(qyWeixinRobotGroupClient47);
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent56 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent58 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent59 = null;
        java.util.concurrent.TimeUnit timeUnit62 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService64 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent65 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit62, false, scheduledExecutorService64);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient66 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList54, qyWeixinRobotHttpClientComponent56, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent58, qyWeixinRobotKeyManagerComponent59, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent65);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent72 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent74 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent75 = null;
        java.util.concurrent.TimeUnit timeUnit78 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService80 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent81 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit78, false, scheduledExecutorService80);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient82 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList70, qyWeixinRobotHttpClientComponent72, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent74, qyWeixinRobotKeyManagerComponent75, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent81);
        defaultQyWeixinRobotScheduledManagerComponent65.init(qyWeixinRobotGroupClient82);
        byte[] byteArray85 = new byte[] {};
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse86 = qyWeixinRobotGroupClient82.uploadMedia("QyWeixinRobotResponse[errcode=0, errmsg='ok', type='null', media_id='null', created_at='null']", byteArray85);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse87 = qyWeixinRobotGroupClient47.uploadMedia("hi!", byteArray85);
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse88 = qyWeixinRobotGroupBean19.uploadMedia("ok", byteArray85);
        qyWeixinRobotResponse88.setCreated_at("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotBaseMessageList10);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[]");
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse86);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse87);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse88);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent0 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotHttpClientComponent qyWeixinRobotHttpClientComponent6 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent defaultQyWeixinRobotQueueManagerComponent8 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotQueueManagerComponent((int) (byte) 10);
        io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotKeyManagerComponent qyWeixinRobotKeyManagerComponent9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService14 = null;
        io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent defaultQyWeixinRobotScheduledManagerComponent15 = new io.github.wesleyone.qy.weixin.robot.component.impl.DefaultQyWeixinRobotScheduledManagerComponent((long) 100, (long) (-1), timeUnit12, false, scheduledExecutorService14);
        io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient qyWeixinRobotGroupClient16 = new io.github.wesleyone.qy.weixin.robot.client.QyWeixinRobotGroupClient((java.util.List<java.lang.String>) strList4, qyWeixinRobotHttpClientComponent6, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotQueueManagerComponent) defaultQyWeixinRobotQueueManagerComponent8, qyWeixinRobotKeyManagerComponent9, (io.github.wesleyone.qy.weixin.robot.component.QyWeixinRobotScheduledManagerComponent) defaultQyWeixinRobotScheduledManagerComponent15);
        defaultQyWeixinRobotScheduledManagerComponent0.destroy(qyWeixinRobotGroupClient16);
        qyWeixinRobotGroupClient16.destroy();
        qyWeixinRobotGroupClient16.destroy();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage21 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse22 = qyWeixinRobotGroupClient16.sendDirect((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage21);
        qyWeixinRobotGroupClient16.destroy();
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage qyWeixinRobotMarkdownMessage25 = new io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotMarkdownMessage("QyWeixinRobotResponse[errcode=99999, errmsg='', type='null', media_id='null', created_at='null']");
        io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotResponse qyWeixinRobotResponse26 = qyWeixinRobotGroupClient16.send((io.github.wesleyone.qy.weixin.robot.entity.QyWeixinRobotBaseMessage) qyWeixinRobotMarkdownMessage25);
        qyWeixinRobotGroupClient16.destroy();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse22);
        org.junit.Assert.assertNotNull(qyWeixinRobotResponse26);
    }
}
