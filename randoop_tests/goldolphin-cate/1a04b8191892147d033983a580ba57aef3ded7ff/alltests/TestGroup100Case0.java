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
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool partitionedSchedulerPool0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.partitioned.PartitionedStore<java.lang.String, net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> strPartitionedStore1 = new net.goldolphin.cate.partitioned.PartitionedStore<java.lang.String, net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>(partitionedSchedulerPool0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool partitionedSchedulerPool0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.WhenAllTask<java.lang.CharSequence>, net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> charSequenceWhenAllTaskPartitionedStore1 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.WhenAllTask<java.lang.CharSequence>, net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>(partitionedSchedulerPool0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        net.goldolphin.cate.ITask<net.goldolphin.cate.WhenAllTask<java.lang.CharSequence>, ?>[] charSequenceWhenAllTaskITaskArray0 = null;
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.WhenAllTask<java.lang.CharSequence>> charSequenceWhenAllTaskWhenAllTask1 = net.goldolphin.cate.Task.whenAll(charSequenceWhenAllTaskITaskArray0);
        org.junit.Assert.assertNotNull(charSequenceWhenAllTaskWhenAllTask1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        net.goldolphin.cate.SynchronizedScheduler synchronizedScheduler0 = new net.goldolphin.cate.SynchronizedScheduler();
        net.goldolphin.cate.Action0 action0_1 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask2 = net.goldolphin.cate.Task.create(action0_1);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitTask2.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = unitWaiter3.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter5 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter4);
        net.goldolphin.cate.IContinuation iContinuation6 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation7 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation6);
        net.goldolphin.cate.IContinuation iContinuation8 = unitWaiter4.buildContinuation(iContinuation6);
        net.goldolphin.cate.Environment environment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            synchronizedScheduler0.schedule(iContinuation8, (java.lang.Object) 0, environment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitWaiter4);
        org.junit.Assert.assertNotNull(iContinuation8);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        net.goldolphin.cate.Action0 action0_1 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask2 = net.goldolphin.cate.Task.create(action0_1);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitTask2.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = unitWaiter3.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter5 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter4);
        net.goldolphin.cate.IContinuation iContinuation6 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation7 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation6);
        net.goldolphin.cate.IContinuation iContinuation8 = unitWaiter4.buildContinuation(iContinuation6);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation9 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (byte) 100, iContinuation6);
        java.lang.Class<?> wildcardClass10 = indexContinuation9.getClass();
        org.junit.Assert.assertNotNull(unitTask2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitWaiter4);
        org.junit.Assert.assertNotNull(iContinuation8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        java.util.concurrent.Executor executor4 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler5 = new net.goldolphin.cate.ExecutorScheduler(executor4);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler5);
        net.goldolphin.cate.Action0 action0_7 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask8 = net.goldolphin.cate.Task.create(action0_7);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter9 = unitTask8.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter10 = unitWaiter9.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter11 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter10);
        net.goldolphin.cate.IContinuation iContinuation12 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation13 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation12);
        net.goldolphin.cate.IContinuation iContinuation14 = unitWaiter10.buildContinuation(iContinuation12);
        net.goldolphin.cate.Action0 action0_15 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask16 = net.goldolphin.cate.Task.create(action0_15);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter17 = unitTask16.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_18 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask19 = unitTask16.continueWith(unitAction1_18);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitTask20 = unitTask16.flatten();
        net.goldolphin.cate.Environment environment21 = null;
        // The following exception was thrown during execution in test generation
        try {
            executorScheduler5.schedule(iContinuation12, (java.lang.Object) unitTask20, environment21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unitTask8);
        org.junit.Assert.assertNotNull(unitWaiter9);
        org.junit.Assert.assertNotNull(unitWaiter10);
        org.junit.Assert.assertNotNull(iContinuation14);
        org.junit.Assert.assertNotNull(unitTask16);
        org.junit.Assert.assertNotNull(unitWaiter17);
        org.junit.Assert.assertNotNull(unitTask19);
        org.junit.Assert.assertNotNull(unitTask20);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Action0 action0_3 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask4 = net.goldolphin.cate.Task.create(action0_3);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter5 = unitTask4.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter6 = unitWaiter5.continueWithWaiter();
        java.util.concurrent.Executor executor7 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler8 = new net.goldolphin.cate.ExecutorScheduler(executor7);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = unitWaiter5.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler8);
        // The following exception was thrown during execution in test generation
        try {
            unitTask1.execute((net.goldolphin.cate.IScheduler) executorScheduler8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitTask4);
        org.junit.Assert.assertNotNull(unitWaiter5);
        org.junit.Assert.assertNotNull(unitWaiter6);
        org.junit.Assert.assertNotNull(unitTask9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        java.util.concurrent.Executor executor4 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler5 = new net.goldolphin.cate.ExecutorScheduler(executor4);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler5);
        java.util.concurrent.Executor executor7 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler8 = new net.goldolphin.cate.ExecutorScheduler(executor7);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler8);
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask12 = null;
        net.goldolphin.cate.Action0 action0_13 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask14 = net.goldolphin.cate.Task.create(action0_13);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter15 = unitTask14.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter16 = unitWaiter15.continueWithWaiter();
        java.util.concurrent.Executor executor17 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler18 = new net.goldolphin.cate.ExecutorScheduler(executor17);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask19 = unitWaiter15.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler18);
        java.util.concurrent.Executor executor20 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler21 = new net.goldolphin.cate.ExecutorScheduler(executor20);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask22 = unitWaiter15.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler21);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler23 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask12, (net.goldolphin.cate.IScheduler) executorScheduler21);
        java.util.concurrent.Executor executor24 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler25 = new net.goldolphin.cate.ExecutorScheduler(executor24);
        net.goldolphin.cate.IScheduler[] iSchedulerArray26 = new net.goldolphin.cate.IScheduler[] { executorScheduler8, executorScheduler11, executorScheduler21, executorScheduler25 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner27 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool28 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray26, unitWaiterFunc0TaskIPartitioner27);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore29 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool28);
        net.goldolphin.cate.Action0 action0_30 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask31 = net.goldolphin.cate.Task.create(action0_30);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter32 = unitTask31.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter33 = unitWaiter32.continueWithWaiter();
        java.util.concurrent.Executor executor34 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler35 = new net.goldolphin.cate.ExecutorScheduler(executor34);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask36 = unitWaiter32.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler35);
        java.util.concurrent.Executor executor37 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler38 = new net.goldolphin.cate.ExecutorScheduler(executor37);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask39 = unitWaiter32.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler38);
        java.util.concurrent.Executor executor40 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler41 = new net.goldolphin.cate.ExecutorScheduler(executor40);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask42 = null;
        net.goldolphin.cate.Action0 action0_43 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask44 = net.goldolphin.cate.Task.create(action0_43);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter45 = unitTask44.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter46 = unitWaiter45.continueWithWaiter();
        java.util.concurrent.Executor executor47 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler48 = new net.goldolphin.cate.ExecutorScheduler(executor47);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask49 = unitWaiter45.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler48);
        java.util.concurrent.Executor executor50 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler51 = new net.goldolphin.cate.ExecutorScheduler(executor50);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask52 = unitWaiter45.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler51);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler53 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask42, (net.goldolphin.cate.IScheduler) executorScheduler51);
        java.util.concurrent.Executor executor54 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler55 = new net.goldolphin.cate.ExecutorScheduler(executor54);
        net.goldolphin.cate.IScheduler[] iSchedulerArray56 = new net.goldolphin.cate.IScheduler[] { executorScheduler38, executorScheduler41, executorScheduler51, executorScheduler55 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner57 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool58 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray56, unitWaiterFunc0TaskIPartitioner57);
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.IScheduler iScheduler59 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore29.remove(unitWaiterFunc0TaskPartitionedSchedulerPool58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitTask14);
        org.junit.Assert.assertNotNull(unitWaiter15);
        org.junit.Assert.assertNotNull(unitWaiter16);
        org.junit.Assert.assertNotNull(unitTask19);
        org.junit.Assert.assertNotNull(unitTask22);
        org.junit.Assert.assertNotNull(iSchedulerArray26);
        org.junit.Assert.assertNotNull(unitTask31);
        org.junit.Assert.assertNotNull(unitWaiter32);
        org.junit.Assert.assertNotNull(unitWaiter33);
        org.junit.Assert.assertNotNull(unitTask36);
        org.junit.Assert.assertNotNull(unitTask39);
        org.junit.Assert.assertNotNull(unitTask44);
        org.junit.Assert.assertNotNull(unitWaiter45);
        org.junit.Assert.assertNotNull(unitWaiter46);
        org.junit.Assert.assertNotNull(unitTask49);
        org.junit.Assert.assertNotNull(unitTask52);
        org.junit.Assert.assertNotNull(iSchedulerArray56);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        java.util.concurrent.Executor executor4 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler5 = new net.goldolphin.cate.ExecutorScheduler(executor4);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler5);
        java.util.concurrent.Executor executor7 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler8 = new net.goldolphin.cate.ExecutorScheduler(executor7);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler8);
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask12 = null;
        net.goldolphin.cate.Action0 action0_13 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask14 = net.goldolphin.cate.Task.create(action0_13);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter15 = unitTask14.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter16 = unitWaiter15.continueWithWaiter();
        java.util.concurrent.Executor executor17 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler18 = new net.goldolphin.cate.ExecutorScheduler(executor17);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask19 = unitWaiter15.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler18);
        java.util.concurrent.Executor executor20 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler21 = new net.goldolphin.cate.ExecutorScheduler(executor20);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask22 = unitWaiter15.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler21);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler23 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask12, (net.goldolphin.cate.IScheduler) executorScheduler21);
        java.util.concurrent.Executor executor24 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler25 = new net.goldolphin.cate.ExecutorScheduler(executor24);
        net.goldolphin.cate.IScheduler[] iSchedulerArray26 = new net.goldolphin.cate.IScheduler[] { executorScheduler8, executorScheduler11, executorScheduler21, executorScheduler25 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner27 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool28 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray26, unitWaiterFunc0TaskIPartitioner27);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore29 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool28);
        net.goldolphin.cate.Action0 action0_30 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask31 = net.goldolphin.cate.Task.create(action0_30);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter32 = unitTask31.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter33 = unitWaiter32.continueWithWaiter();
        java.util.concurrent.Executor executor34 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler35 = new net.goldolphin.cate.ExecutorScheduler(executor34);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask36 = unitWaiter32.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler35);
        java.util.concurrent.Executor executor37 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler38 = new net.goldolphin.cate.ExecutorScheduler(executor37);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask39 = unitWaiter32.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler38);
        java.util.concurrent.Executor executor40 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler41 = new net.goldolphin.cate.ExecutorScheduler(executor40);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask42 = null;
        net.goldolphin.cate.Action0 action0_43 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask44 = net.goldolphin.cate.Task.create(action0_43);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter45 = unitTask44.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter46 = unitWaiter45.continueWithWaiter();
        java.util.concurrent.Executor executor47 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler48 = new net.goldolphin.cate.ExecutorScheduler(executor47);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask49 = unitWaiter45.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler48);
        java.util.concurrent.Executor executor50 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler51 = new net.goldolphin.cate.ExecutorScheduler(executor50);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask52 = unitWaiter45.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler51);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler53 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask42, (net.goldolphin.cate.IScheduler) executorScheduler51);
        java.util.concurrent.Executor executor54 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler55 = new net.goldolphin.cate.ExecutorScheduler(executor54);
        net.goldolphin.cate.IScheduler[] iSchedulerArray56 = new net.goldolphin.cate.IScheduler[] { executorScheduler38, executorScheduler41, executorScheduler51, executorScheduler55 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner57 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool58 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray56, unitWaiterFunc0TaskIPartitioner57);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore59 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool58);
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.IScheduler iScheduler60 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore29.get(unitWaiterFunc0TaskPartitionedSchedulerPool58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitTask14);
        org.junit.Assert.assertNotNull(unitWaiter15);
        org.junit.Assert.assertNotNull(unitWaiter16);
        org.junit.Assert.assertNotNull(unitTask19);
        org.junit.Assert.assertNotNull(unitTask22);
        org.junit.Assert.assertNotNull(iSchedulerArray26);
        org.junit.Assert.assertNotNull(unitTask31);
        org.junit.Assert.assertNotNull(unitWaiter32);
        org.junit.Assert.assertNotNull(unitWaiter33);
        org.junit.Assert.assertNotNull(unitTask36);
        org.junit.Assert.assertNotNull(unitTask39);
        org.junit.Assert.assertNotNull(unitTask44);
        org.junit.Assert.assertNotNull(unitWaiter45);
        org.junit.Assert.assertNotNull(unitWaiter46);
        org.junit.Assert.assertNotNull(unitTask49);
        org.junit.Assert.assertNotNull(unitTask52);
        org.junit.Assert.assertNotNull(iSchedulerArray56);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        java.util.concurrent.Executor executor0 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler1 = new net.goldolphin.cate.ExecutorScheduler(executor0);
        net.goldolphin.cate.Action0 action0_2 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask3 = net.goldolphin.cate.Task.create(action0_2);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = unitTask3.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter5 = unitWaiter4.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter6 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter5);
        net.goldolphin.cate.IContinuation iContinuation7 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation8 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation7);
        net.goldolphin.cate.IContinuation iContinuation9 = unitWaiter5.buildContinuation(iContinuation7);
        net.goldolphin.cate.ITask<net.goldolphin.cate.WhenAllTask<java.lang.CharSequence>, net.goldolphin.cate.FlattenTask.Continuation> charSequenceWhenAllTaskITask10 = null;
        net.goldolphin.cate.Waiter<net.goldolphin.cate.WhenAllTask<java.lang.CharSequence>, net.goldolphin.cate.FlattenTask.Continuation> charSequenceWhenAllTaskWaiter11 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.WhenAllTask<java.lang.CharSequence>, net.goldolphin.cate.FlattenTask.Continuation>(charSequenceWhenAllTaskITask10);
        net.goldolphin.cate.Environment environment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            executorScheduler1.schedule(iContinuation7, (java.lang.Object) charSequenceWhenAllTaskWaiter11, environment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask3);
        org.junit.Assert.assertNotNull(unitWaiter4);
        org.junit.Assert.assertNotNull(unitWaiter5);
        org.junit.Assert.assertNotNull(iContinuation9);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask0 = null;
        net.goldolphin.cate.Action0 action0_1 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask2 = net.goldolphin.cate.Task.create(action0_1);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitTask2.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = unitWaiter3.continueWithWaiter();
        java.util.concurrent.Executor executor5 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler6 = new net.goldolphin.cate.ExecutorScheduler(executor5);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask7 = unitWaiter3.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler6);
        java.util.concurrent.Executor executor8 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler9 = new net.goldolphin.cate.ExecutorScheduler(executor8);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask10 = unitWaiter3.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler9);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler11 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask0, (net.goldolphin.cate.IScheduler) executorScheduler9);
        net.goldolphin.cate.IContinuation iContinuation12 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation13 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation12);
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.IContinuation iContinuation14 = iSchedulerTaskWithScheduler11.buildContinuation((net.goldolphin.cate.IContinuation) continuation13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitWaiter4);
        org.junit.Assert.assertNotNull(unitTask7);
        org.junit.Assert.assertNotNull(unitTask10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        net.goldolphin.cate.ITask<java.io.Serializable, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> serializableITask0 = null;
        net.goldolphin.cate.TaskWithInitState<java.io.Serializable, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> serializableTaskWithInitState2 = new net.goldolphin.cate.TaskWithInitState<java.io.Serializable, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(serializableITask0, (java.io.Serializable) 0.0f);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitTask3 = unitTask1.flatten();
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitTask3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        net.goldolphin.cate.ITask<java.io.Serializable, ?>[] serializableITaskArray0 = null;
        net.goldolphin.cate.WhenAnyTask<java.io.Serializable> serializableWhenAnyTask1 = new net.goldolphin.cate.WhenAnyTask<java.io.Serializable>(serializableITaskArray0);
        net.goldolphin.cate.Action0 action0_2 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask3 = net.goldolphin.cate.Task.create(action0_2);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = unitTask3.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter5 = unitWaiter4.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter6 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter5);
        net.goldolphin.cate.IContinuation iContinuation7 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation8 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation7);
        net.goldolphin.cate.IContinuation iContinuation9 = unitWaiter5.buildContinuation(iContinuation7);
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.IContinuation iContinuation10 = serializableWhenAnyTask1.buildContinuation(iContinuation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask3);
        org.junit.Assert.assertNotNull(unitWaiter4);
        org.junit.Assert.assertNotNull(unitWaiter5);
        org.junit.Assert.assertNotNull(iContinuation9);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Action0 action0_2 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask3 = net.goldolphin.cate.Task.create(action0_2);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = unitTask3.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask5 = unitTask1.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter4);
        net.goldolphin.cate.Action0 action0_6 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask7 = net.goldolphin.cate.Task.create(action0_6);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter8 = unitTask7.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter9 = unitWaiter8.continueWithWaiter();
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask12 = unitWaiter8.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler11);
        // The following exception was thrown during execution in test generation
        try {
            unitTask5.execute((net.goldolphin.cate.IScheduler) executorScheduler11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitTask3);
        org.junit.Assert.assertNotNull(unitWaiter4);
        org.junit.Assert.assertNotNull(unitTask5);
        org.junit.Assert.assertNotNull(unitTask7);
        org.junit.Assert.assertNotNull(unitWaiter8);
        org.junit.Assert.assertNotNull(unitWaiter9);
        org.junit.Assert.assertNotNull(unitTask12);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        java.util.concurrent.Executor executor4 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler5 = new net.goldolphin.cate.ExecutorScheduler(executor4);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler5);
        java.util.concurrent.Executor executor7 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler8 = new net.goldolphin.cate.ExecutorScheduler(executor7);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler8);
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask12 = null;
        net.goldolphin.cate.Action0 action0_13 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask14 = net.goldolphin.cate.Task.create(action0_13);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter15 = unitTask14.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter16 = unitWaiter15.continueWithWaiter();
        java.util.concurrent.Executor executor17 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler18 = new net.goldolphin.cate.ExecutorScheduler(executor17);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask19 = unitWaiter15.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler18);
        java.util.concurrent.Executor executor20 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler21 = new net.goldolphin.cate.ExecutorScheduler(executor20);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask22 = unitWaiter15.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler21);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler23 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask12, (net.goldolphin.cate.IScheduler) executorScheduler21);
        java.util.concurrent.Executor executor24 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler25 = new net.goldolphin.cate.ExecutorScheduler(executor24);
        net.goldolphin.cate.IScheduler[] iSchedulerArray26 = new net.goldolphin.cate.IScheduler[] { executorScheduler8, executorScheduler11, executorScheduler21, executorScheduler25 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner27 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool28 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray26, unitWaiterFunc0TaskIPartitioner27);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore29 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool28);
        net.goldolphin.cate.Action0 action0_30 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask31 = net.goldolphin.cate.Task.create(action0_30);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter32 = unitTask31.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter33 = unitWaiter32.continueWithWaiter();
        java.util.concurrent.Executor executor34 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler35 = new net.goldolphin.cate.ExecutorScheduler(executor34);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask36 = unitWaiter32.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler35);
        java.util.concurrent.Executor executor37 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler38 = new net.goldolphin.cate.ExecutorScheduler(executor37);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask39 = unitWaiter32.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler38);
        java.util.concurrent.Executor executor40 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler41 = new net.goldolphin.cate.ExecutorScheduler(executor40);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask42 = null;
        net.goldolphin.cate.Action0 action0_43 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask44 = net.goldolphin.cate.Task.create(action0_43);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter45 = unitTask44.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter46 = unitWaiter45.continueWithWaiter();
        java.util.concurrent.Executor executor47 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler48 = new net.goldolphin.cate.ExecutorScheduler(executor47);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask49 = unitWaiter45.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler48);
        java.util.concurrent.Executor executor50 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler51 = new net.goldolphin.cate.ExecutorScheduler(executor50);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask52 = unitWaiter45.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler51);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler53 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask42, (net.goldolphin.cate.IScheduler) executorScheduler51);
        java.util.concurrent.Executor executor54 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler55 = new net.goldolphin.cate.ExecutorScheduler(executor54);
        net.goldolphin.cate.IScheduler[] iSchedulerArray56 = new net.goldolphin.cate.IScheduler[] { executorScheduler38, executorScheduler41, executorScheduler51, executorScheduler55 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner57 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool58 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray56, unitWaiterFunc0TaskIPartitioner57);
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.IScheduler iScheduler59 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore29.get(unitWaiterFunc0TaskPartitionedSchedulerPool58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitTask14);
        org.junit.Assert.assertNotNull(unitWaiter15);
        org.junit.Assert.assertNotNull(unitWaiter16);
        org.junit.Assert.assertNotNull(unitTask19);
        org.junit.Assert.assertNotNull(unitTask22);
        org.junit.Assert.assertNotNull(iSchedulerArray26);
        org.junit.Assert.assertNotNull(unitTask31);
        org.junit.Assert.assertNotNull(unitWaiter32);
        org.junit.Assert.assertNotNull(unitWaiter33);
        org.junit.Assert.assertNotNull(unitTask36);
        org.junit.Assert.assertNotNull(unitTask39);
        org.junit.Assert.assertNotNull(unitTask44);
        org.junit.Assert.assertNotNull(unitWaiter45);
        org.junit.Assert.assertNotNull(unitWaiter46);
        org.junit.Assert.assertNotNull(unitTask49);
        org.junit.Assert.assertNotNull(unitTask52);
        org.junit.Assert.assertNotNull(iSchedulerArray56);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        net.goldolphin.cate.ITask<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>, net.goldolphin.cate.FlattenTask.Continuation> unitWaiterFunc0TaskITask0 = null;
        net.goldolphin.cate.ITask<net.goldolphin.cate.FlattenTask.Continuation, net.goldolphin.cate.ExecutorScheduler> continuationITask1 = null;
        net.goldolphin.cate.SeqTask<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>, net.goldolphin.cate.FlattenTask.Continuation, net.goldolphin.cate.ExecutorScheduler> unitWaiterFunc0TaskSeqTask2 = new net.goldolphin.cate.SeqTask<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>, net.goldolphin.cate.FlattenTask.Continuation, net.goldolphin.cate.ExecutorScheduler>(unitWaiterFunc0TaskITask0, continuationITask1);
        net.goldolphin.cate.Action0 action0_4 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask5 = net.goldolphin.cate.Task.create(action0_4);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter6 = unitTask5.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter7 = unitWaiter6.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter8 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter7);
        net.goldolphin.cate.IContinuation iContinuation9 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation10 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation9);
        net.goldolphin.cate.IContinuation iContinuation11 = unitWaiter7.buildContinuation(iContinuation9);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation12 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (byte) 100, iContinuation9);
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.IContinuation iContinuation13 = unitWaiterFunc0TaskSeqTask2.buildContinuation(iContinuation9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask5);
        org.junit.Assert.assertNotNull(unitWaiter6);
        org.junit.Assert.assertNotNull(unitWaiter7);
        org.junit.Assert.assertNotNull(iContinuation11);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        net.goldolphin.cate.Maybe<java.util.Map<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>[]> partitionedSchedulerPoolMapArrayMaybe0 = net.goldolphin.cate.Maybe.nothing();
        org.junit.Assert.assertNotNull(partitionedSchedulerPoolMapArrayMaybe0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Action0 action0_2 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask3 = net.goldolphin.cate.Task.create(action0_2);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = unitTask3.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask5 = unitTask1.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter4);
        java.lang.Class<?> wildcardClass6 = unitTask1.getClass();
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitTask3);
        org.junit.Assert.assertNotNull(unitWaiter4);
        org.junit.Assert.assertNotNull(unitTask5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.CollectTask.Counter counter1 = new net.goldolphin.cate.CollectTask.Counter((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        net.goldolphin.cate.Action0 action0_1 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask2 = net.goldolphin.cate.Task.create(action0_1);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitTask2.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_4 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask5 = unitTask2.continueWith(unitAction1_4);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitTask6 = unitTask2.flatten();
        net.goldolphin.cate.CollectTask.Result result7 = new net.goldolphin.cate.CollectTask.Result((int) (short) 0, (java.lang.Object) unitTask2);
        int int8 = result7.index;
        org.junit.Assert.assertNotNull(unitTask2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask5);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        java.util.concurrent.Executor executor4 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler5 = new net.goldolphin.cate.ExecutorScheduler(executor4);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler5);
        java.util.concurrent.Executor executor7 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler8 = new net.goldolphin.cate.ExecutorScheduler(executor7);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler8);
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask12 = null;
        net.goldolphin.cate.Action0 action0_13 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask14 = net.goldolphin.cate.Task.create(action0_13);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter15 = unitTask14.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter16 = unitWaiter15.continueWithWaiter();
        java.util.concurrent.Executor executor17 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler18 = new net.goldolphin.cate.ExecutorScheduler(executor17);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask19 = unitWaiter15.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler18);
        java.util.concurrent.Executor executor20 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler21 = new net.goldolphin.cate.ExecutorScheduler(executor20);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask22 = unitWaiter15.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler21);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler23 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask12, (net.goldolphin.cate.IScheduler) executorScheduler21);
        java.util.concurrent.Executor executor24 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler25 = new net.goldolphin.cate.ExecutorScheduler(executor24);
        net.goldolphin.cate.IScheduler[] iSchedulerArray26 = new net.goldolphin.cate.IScheduler[] { executorScheduler8, executorScheduler11, executorScheduler21, executorScheduler25 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner27 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool28 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray26, unitWaiterFunc0TaskIPartitioner27);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore29 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool28);
        java.util.Map<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>[] func0TaskPartitionedSchedulerPoolMapArray30 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore29.getData();
        net.goldolphin.cate.Action0 action0_31 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask32 = net.goldolphin.cate.Task.create(action0_31);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter33 = unitTask32.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter34 = unitWaiter33.continueWithWaiter();
        java.util.concurrent.Executor executor35 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler36 = new net.goldolphin.cate.ExecutorScheduler(executor35);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask37 = unitWaiter33.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler36);
        java.util.concurrent.Executor executor38 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler39 = new net.goldolphin.cate.ExecutorScheduler(executor38);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask40 = unitWaiter33.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler39);
        java.util.concurrent.Executor executor41 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler42 = new net.goldolphin.cate.ExecutorScheduler(executor41);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask43 = null;
        net.goldolphin.cate.Action0 action0_44 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask45 = net.goldolphin.cate.Task.create(action0_44);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter46 = unitTask45.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter47 = unitWaiter46.continueWithWaiter();
        java.util.concurrent.Executor executor48 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler49 = new net.goldolphin.cate.ExecutorScheduler(executor48);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask50 = unitWaiter46.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler49);
        java.util.concurrent.Executor executor51 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler52 = new net.goldolphin.cate.ExecutorScheduler(executor51);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask53 = unitWaiter46.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler52);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler54 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask43, (net.goldolphin.cate.IScheduler) executorScheduler52);
        java.util.concurrent.Executor executor55 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler56 = new net.goldolphin.cate.ExecutorScheduler(executor55);
        net.goldolphin.cate.IScheduler[] iSchedulerArray57 = new net.goldolphin.cate.IScheduler[] { executorScheduler39, executorScheduler42, executorScheduler52, executorScheduler56 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner58 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool59 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray57, unitWaiterFunc0TaskIPartitioner58);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore29.contains(unitWaiterFunc0TaskPartitionedSchedulerPool59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitTask14);
        org.junit.Assert.assertNotNull(unitWaiter15);
        org.junit.Assert.assertNotNull(unitWaiter16);
        org.junit.Assert.assertNotNull(unitTask19);
        org.junit.Assert.assertNotNull(unitTask22);
        org.junit.Assert.assertNotNull(iSchedulerArray26);
        org.junit.Assert.assertNotNull(func0TaskPartitionedSchedulerPoolMapArray30);
        org.junit.Assert.assertNotNull(unitTask32);
        org.junit.Assert.assertNotNull(unitWaiter33);
        org.junit.Assert.assertNotNull(unitWaiter34);
        org.junit.Assert.assertNotNull(unitTask37);
        org.junit.Assert.assertNotNull(unitTask40);
        org.junit.Assert.assertNotNull(unitTask45);
        org.junit.Assert.assertNotNull(unitWaiter46);
        org.junit.Assert.assertNotNull(unitWaiter47);
        org.junit.Assert.assertNotNull(unitTask50);
        org.junit.Assert.assertNotNull(unitTask53);
        org.junit.Assert.assertNotNull(iSchedulerArray57);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Action0 action0_2 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask3 = net.goldolphin.cate.Task.create(action0_2);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = unitTask3.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask5 = unitTask1.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter4);
        net.goldolphin.cate.SynchronizedScheduler synchronizedScheduler7 = new net.goldolphin.cate.SynchronizedScheduler();
        // The following exception was thrown during execution in test generation
        try {
            unitTask5.execute((java.lang.Object) (short) 1, (net.goldolphin.cate.IScheduler) synchronizedScheduler7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitTask3);
        org.junit.Assert.assertNotNull(unitWaiter4);
        org.junit.Assert.assertNotNull(unitTask5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        net.goldolphin.cate.ITask<java.io.Serializable, ?> serializableITask0 = null;
        net.goldolphin.cate.ITask[] iTaskArray2 = new net.goldolphin.cate.ITask[1];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<java.io.Serializable, ?>[] serializableITaskArray3 = (net.goldolphin.cate.ITask<java.io.Serializable, ?>[]) iTaskArray2;
        serializableITaskArray3[0] = serializableITask0;
        net.goldolphin.cate.WhenAnyTask<java.io.Serializable> serializableWhenAnyTask6 = net.goldolphin.cate.Task.whenAny(serializableITaskArray3);
        net.goldolphin.cate.Func0<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0_7 = null;
        net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0Task8 = new net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>(unitWaiterFunc0_7);
        net.goldolphin.cate.Action0 action0_10 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask11 = net.goldolphin.cate.Task.create(action0_10);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter12 = unitTask11.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter13 = unitWaiter12.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter14 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter13);
        net.goldolphin.cate.IContinuation iContinuation15 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation16 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation15);
        net.goldolphin.cate.IContinuation iContinuation17 = unitWaiter13.buildContinuation(iContinuation15);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation18 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (byte) 100, iContinuation15);
        net.goldolphin.cate.IContinuation iContinuation19 = unitWaiterFunc0Task8.buildContinuation(iContinuation15);
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.IContinuation iContinuation20 = serializableWhenAnyTask6.buildContinuation(iContinuation15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTaskArray2);
        org.junit.Assert.assertNotNull(serializableITaskArray3);
        org.junit.Assert.assertNotNull(serializableWhenAnyTask6);
        org.junit.Assert.assertNotNull(unitTask11);
        org.junit.Assert.assertNotNull(unitWaiter12);
        org.junit.Assert.assertNotNull(unitWaiter13);
        org.junit.Assert.assertNotNull(iContinuation17);
        org.junit.Assert.assertNotNull(iContinuation19);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_3 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask4 = unitTask1.continueWith(unitAction1_3);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitTask5 = unitTask1.flatten();
        net.goldolphin.cate.Action0 action0_6 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask7 = net.goldolphin.cate.Task.create(action0_6);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter8 = unitTask7.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter9 = unitWaiter8.continueWithWaiter();
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask12 = unitWaiter8.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler11);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask13 = unitTask1.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler11);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter14 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.ITask[] iTaskArray16 = new net.goldolphin.cate.ITask[0];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>, ?>[] unitITaskITaskArray17 = (net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>, ?>[]) iTaskArray16;
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitITaskWhenAllTask18 = new net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>(unitITaskITaskArray17);
        java.util.concurrent.Executor executor19 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler20 = new net.goldolphin.cate.ExecutorScheduler(executor19);
        // The following exception was thrown during execution in test generation
        try {
            unitWaiter14.execute((java.lang.Object) unitITaskITaskArray17, (net.goldolphin.cate.IScheduler) executorScheduler20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitTask4);
        org.junit.Assert.assertNotNull(unitTask5);
        org.junit.Assert.assertNotNull(unitTask7);
        org.junit.Assert.assertNotNull(unitWaiter8);
        org.junit.Assert.assertNotNull(unitWaiter9);
        org.junit.Assert.assertNotNull(unitTask12);
        org.junit.Assert.assertNotNull(unitTask13);
        org.junit.Assert.assertNotNull(unitWaiter14);
        org.junit.Assert.assertNotNull(iTaskArray16);
        org.junit.Assert.assertNotNull(unitITaskITaskArray17);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        net.goldolphin.cate.Action0 action0_1 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask2 = net.goldolphin.cate.Task.create(action0_1);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitTask2.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = unitWaiter3.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter5 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter4);
        net.goldolphin.cate.IContinuation iContinuation6 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation7 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation6);
        net.goldolphin.cate.IContinuation iContinuation8 = unitWaiter4.buildContinuation(iContinuation6);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation9 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (byte) 100, iContinuation6);
        net.goldolphin.cate.ContextAction<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextAction11 = null;
        net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextTask12 = new net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceContextAction11);
        net.goldolphin.cate.Action0 action0_13 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask14 = net.goldolphin.cate.Task.create(action0_13);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter15 = unitTask14.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter16 = unitWaiter15.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter17 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter16);
        net.goldolphin.cate.IContinuation iContinuation18 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation19 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation18);
        net.goldolphin.cate.IContinuation iContinuation20 = unitWaiter16.buildContinuation(iContinuation18);
        net.goldolphin.cate.IContinuation iContinuation21 = charSequenceContextTask12.buildContinuation(iContinuation20);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation22 = new net.goldolphin.cate.CollectTask.IndexContinuation(10, iContinuation21);
        net.goldolphin.cate.Environment environment23 = null;
        net.goldolphin.cate.SynchronizedScheduler synchronizedScheduler24 = new net.goldolphin.cate.SynchronizedScheduler();
        // The following exception was thrown during execution in test generation
        try {
            indexContinuation9.apply((java.lang.Object) iContinuation21, environment23, (net.goldolphin.cate.IScheduler) synchronizedScheduler24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitWaiter4);
        org.junit.Assert.assertNotNull(iContinuation8);
        org.junit.Assert.assertNotNull(unitTask14);
        org.junit.Assert.assertNotNull(unitWaiter15);
        org.junit.Assert.assertNotNull(unitWaiter16);
        org.junit.Assert.assertNotNull(iContinuation20);
        org.junit.Assert.assertNotNull(iContinuation21);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        boolean boolean3 = unitWaiter2.isComplete();
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        java.util.concurrent.Executor executor4 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler5 = new net.goldolphin.cate.ExecutorScheduler(executor4);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler5);
        java.util.concurrent.Executor executor7 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler8 = new net.goldolphin.cate.ExecutorScheduler(executor7);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler8);
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask12 = null;
        net.goldolphin.cate.Action0 action0_13 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask14 = net.goldolphin.cate.Task.create(action0_13);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter15 = unitTask14.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter16 = unitWaiter15.continueWithWaiter();
        java.util.concurrent.Executor executor17 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler18 = new net.goldolphin.cate.ExecutorScheduler(executor17);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask19 = unitWaiter15.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler18);
        java.util.concurrent.Executor executor20 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler21 = new net.goldolphin.cate.ExecutorScheduler(executor20);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask22 = unitWaiter15.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler21);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler23 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask12, (net.goldolphin.cate.IScheduler) executorScheduler21);
        java.util.concurrent.Executor executor24 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler25 = new net.goldolphin.cate.ExecutorScheduler(executor24);
        net.goldolphin.cate.IScheduler[] iSchedulerArray26 = new net.goldolphin.cate.IScheduler[] { executorScheduler8, executorScheduler11, executorScheduler21, executorScheduler25 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner27 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool28 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray26, unitWaiterFunc0TaskIPartitioner27);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore29 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool28);
        java.util.Map<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>[] func0TaskPartitionedSchedulerPoolMapArray30 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore29.getData();
        net.goldolphin.cate.Action0 action0_31 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask32 = net.goldolphin.cate.Task.create(action0_31);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter33 = unitTask32.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter34 = unitWaiter33.continueWithWaiter();
        java.util.concurrent.Executor executor35 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler36 = new net.goldolphin.cate.ExecutorScheduler(executor35);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask37 = unitWaiter33.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler36);
        java.util.concurrent.Executor executor38 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler39 = new net.goldolphin.cate.ExecutorScheduler(executor38);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask40 = unitWaiter33.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler39);
        java.util.concurrent.Executor executor41 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler42 = new net.goldolphin.cate.ExecutorScheduler(executor41);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask43 = null;
        net.goldolphin.cate.Action0 action0_44 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask45 = net.goldolphin.cate.Task.create(action0_44);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter46 = unitTask45.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter47 = unitWaiter46.continueWithWaiter();
        java.util.concurrent.Executor executor48 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler49 = new net.goldolphin.cate.ExecutorScheduler(executor48);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask50 = unitWaiter46.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler49);
        java.util.concurrent.Executor executor51 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler52 = new net.goldolphin.cate.ExecutorScheduler(executor51);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask53 = unitWaiter46.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler52);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler54 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask43, (net.goldolphin.cate.IScheduler) executorScheduler52);
        java.util.concurrent.Executor executor55 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler56 = new net.goldolphin.cate.ExecutorScheduler(executor55);
        net.goldolphin.cate.IScheduler[] iSchedulerArray57 = new net.goldolphin.cate.IScheduler[] { executorScheduler39, executorScheduler42, executorScheduler52, executorScheduler56 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner58 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool59 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray57, unitWaiterFunc0TaskIPartitioner58);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore60 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool59);
        int int61 = unitWaiterFunc0TaskPartitionedSchedulerPool59.getPartitionNum();
        net.goldolphin.cate.partitioned.IPartitioner iPartitioner62 = unitWaiterFunc0TaskPartitionedSchedulerPool59.getPartitioner();
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.IScheduler iScheduler63 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore29.remove(unitWaiterFunc0TaskPartitionedSchedulerPool59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitTask14);
        org.junit.Assert.assertNotNull(unitWaiter15);
        org.junit.Assert.assertNotNull(unitWaiter16);
        org.junit.Assert.assertNotNull(unitTask19);
        org.junit.Assert.assertNotNull(unitTask22);
        org.junit.Assert.assertNotNull(iSchedulerArray26);
        org.junit.Assert.assertNotNull(func0TaskPartitionedSchedulerPoolMapArray30);
        org.junit.Assert.assertNotNull(unitTask32);
        org.junit.Assert.assertNotNull(unitWaiter33);
        org.junit.Assert.assertNotNull(unitWaiter34);
        org.junit.Assert.assertNotNull(unitTask37);
        org.junit.Assert.assertNotNull(unitTask40);
        org.junit.Assert.assertNotNull(unitTask45);
        org.junit.Assert.assertNotNull(unitWaiter46);
        org.junit.Assert.assertNotNull(unitWaiter47);
        org.junit.Assert.assertNotNull(unitTask50);
        org.junit.Assert.assertNotNull(unitTask53);
        org.junit.Assert.assertNotNull(iSchedulerArray57);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 4 + "'", int61 == 4);
        org.junit.Assert.assertNull(iPartitioner62);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Action0 action0_2 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask3 = net.goldolphin.cate.Task.create(action0_2);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = unitTask3.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask5 = unitTask1.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter4);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter6 = unitTask5.continueWithWaiter();
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitTask3);
        org.junit.Assert.assertNotNull(unitWaiter4);
        org.junit.Assert.assertNotNull(unitTask5);
        org.junit.Assert.assertNotNull(unitWaiter6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        net.goldolphin.cate.Maybe<net.goldolphin.cate.Func1Task<java.util.Map<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>[], net.goldolphin.cate.IStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>>> mapArrayFunc1TaskMaybe0 = net.goldolphin.cate.Maybe.nothing();
        org.junit.Assert.assertNotNull(mapArrayFunc1TaskMaybe0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        net.goldolphin.cate.ITask<net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>, java.lang.reflect.Type> func0TaskPartitionedSchedulerPoolPartitionedStoreITask0 = null;
        net.goldolphin.cate.Action0 action0_1 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask2 = net.goldolphin.cate.Task.create(action0_1);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitTask2.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = unitWaiter3.continueWithWaiter();
        java.util.concurrent.Executor executor5 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler6 = new net.goldolphin.cate.ExecutorScheduler(executor5);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask7 = unitWaiter3.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler6);
        java.util.concurrent.Executor executor8 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler9 = new net.goldolphin.cate.ExecutorScheduler(executor8);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask10 = unitWaiter3.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler9);
        java.util.concurrent.Executor executor11 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler12 = new net.goldolphin.cate.ExecutorScheduler(executor11);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask13 = null;
        net.goldolphin.cate.Action0 action0_14 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask15 = net.goldolphin.cate.Task.create(action0_14);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter16 = unitTask15.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter17 = unitWaiter16.continueWithWaiter();
        java.util.concurrent.Executor executor18 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler19 = new net.goldolphin.cate.ExecutorScheduler(executor18);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask20 = unitWaiter16.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler19);
        java.util.concurrent.Executor executor21 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler22 = new net.goldolphin.cate.ExecutorScheduler(executor21);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask23 = unitWaiter16.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler22);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler24 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask13, (net.goldolphin.cate.IScheduler) executorScheduler22);
        java.util.concurrent.Executor executor25 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler26 = new net.goldolphin.cate.ExecutorScheduler(executor25);
        net.goldolphin.cate.IScheduler[] iSchedulerArray27 = new net.goldolphin.cate.IScheduler[] { executorScheduler9, executorScheduler12, executorScheduler22, executorScheduler26 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner28 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool29 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray27, unitWaiterFunc0TaskIPartitioner28);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore30 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool29);
        java.util.Map<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>[] func0TaskPartitionedSchedulerPoolMapArray31 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore30.getData();
        net.goldolphin.cate.TaskWithInitState<net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>, java.lang.reflect.Type> func0TaskPartitionedSchedulerPoolPartitionedStoreTaskWithInitState32 = new net.goldolphin.cate.TaskWithInitState<net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>, java.lang.reflect.Type>(func0TaskPartitionedSchedulerPoolPartitionedStoreITask0, waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore30);
        net.goldolphin.cate.Action0 action0_33 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask34 = net.goldolphin.cate.Task.create(action0_33);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter35 = unitTask34.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter36 = unitWaiter35.continueWithWaiter();
        java.util.concurrent.Executor executor37 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler38 = new net.goldolphin.cate.ExecutorScheduler(executor37);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask39 = unitWaiter35.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler38);
        java.util.concurrent.Executor executor40 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler41 = new net.goldolphin.cate.ExecutorScheduler(executor40);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask42 = unitWaiter35.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler41);
        java.util.concurrent.Executor executor43 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler44 = new net.goldolphin.cate.ExecutorScheduler(executor43);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask45 = null;
        net.goldolphin.cate.Action0 action0_46 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask47 = net.goldolphin.cate.Task.create(action0_46);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter48 = unitTask47.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter49 = unitWaiter48.continueWithWaiter();
        java.util.concurrent.Executor executor50 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler51 = new net.goldolphin.cate.ExecutorScheduler(executor50);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask52 = unitWaiter48.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler51);
        java.util.concurrent.Executor executor53 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler54 = new net.goldolphin.cate.ExecutorScheduler(executor53);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask55 = unitWaiter48.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler54);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler56 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask45, (net.goldolphin.cate.IScheduler) executorScheduler54);
        java.util.concurrent.Executor executor57 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler58 = new net.goldolphin.cate.ExecutorScheduler(executor57);
        net.goldolphin.cate.IScheduler[] iSchedulerArray59 = new net.goldolphin.cate.IScheduler[] { executorScheduler41, executorScheduler44, executorScheduler54, executorScheduler58 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner60 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool61 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray59, unitWaiterFunc0TaskIPartitioner60);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore62 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool61);
        int int63 = unitWaiterFunc0TaskPartitionedSchedulerPool61.getPartitionNum();
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore64 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool61);
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.IScheduler iScheduler65 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore30.get(unitWaiterFunc0TaskPartitionedSchedulerPool61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitWaiter4);
        org.junit.Assert.assertNotNull(unitTask7);
        org.junit.Assert.assertNotNull(unitTask10);
        org.junit.Assert.assertNotNull(unitTask15);
        org.junit.Assert.assertNotNull(unitWaiter16);
        org.junit.Assert.assertNotNull(unitWaiter17);
        org.junit.Assert.assertNotNull(unitTask20);
        org.junit.Assert.assertNotNull(unitTask23);
        org.junit.Assert.assertNotNull(iSchedulerArray27);
        org.junit.Assert.assertNotNull(func0TaskPartitionedSchedulerPoolMapArray31);
        org.junit.Assert.assertNotNull(unitTask34);
        org.junit.Assert.assertNotNull(unitWaiter35);
        org.junit.Assert.assertNotNull(unitWaiter36);
        org.junit.Assert.assertNotNull(unitTask39);
        org.junit.Assert.assertNotNull(unitTask42);
        org.junit.Assert.assertNotNull(unitTask47);
        org.junit.Assert.assertNotNull(unitWaiter48);
        org.junit.Assert.assertNotNull(unitWaiter49);
        org.junit.Assert.assertNotNull(unitTask52);
        org.junit.Assert.assertNotNull(unitTask55);
        org.junit.Assert.assertNotNull(iSchedulerArray59);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 4 + "'", int63 == 4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        net.goldolphin.cate.IContinuation iContinuation0 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation1 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation0);
        net.goldolphin.cate.Environment environment3 = null;
        net.goldolphin.cate.SynchronizedScheduler synchronizedScheduler4 = new net.goldolphin.cate.SynchronizedScheduler();
        // The following exception was thrown during execution in test generation
        try {
            continuation1.apply((java.lang.Object) '4', environment3, (net.goldolphin.cate.IScheduler) synchronizedScheduler4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to net.goldolphin.cate.ITask");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask0 = null;
        net.goldolphin.cate.Action0 action0_1 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask2 = net.goldolphin.cate.Task.create(action0_1);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitTask2.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = unitWaiter3.continueWithWaiter();
        java.util.concurrent.Executor executor5 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler6 = new net.goldolphin.cate.ExecutorScheduler(executor5);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask7 = unitWaiter3.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler6);
        java.util.concurrent.Executor executor8 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler9 = new net.goldolphin.cate.ExecutorScheduler(executor8);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask10 = unitWaiter3.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler9);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler11 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask0, (net.goldolphin.cate.IScheduler) executorScheduler9);
        net.goldolphin.cate.Func0<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0_12 = null;
        net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0Task13 = new net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>(unitWaiterFunc0_12);
        net.goldolphin.cate.Action0 action0_15 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask16 = net.goldolphin.cate.Task.create(action0_15);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter17 = unitTask16.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter18 = unitWaiter17.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter19 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter18);
        net.goldolphin.cate.IContinuation iContinuation20 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation21 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation20);
        net.goldolphin.cate.IContinuation iContinuation22 = unitWaiter18.buildContinuation(iContinuation20);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation23 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (byte) 100, iContinuation20);
        net.goldolphin.cate.IContinuation iContinuation24 = unitWaiterFunc0Task13.buildContinuation(iContinuation20);
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.IContinuation iContinuation25 = iSchedulerTaskWithScheduler11.buildContinuation(iContinuation20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitWaiter4);
        org.junit.Assert.assertNotNull(unitTask7);
        org.junit.Assert.assertNotNull(unitTask10);
        org.junit.Assert.assertNotNull(unitTask16);
        org.junit.Assert.assertNotNull(unitWaiter17);
        org.junit.Assert.assertNotNull(unitWaiter18);
        org.junit.Assert.assertNotNull(iContinuation22);
        org.junit.Assert.assertNotNull(iContinuation24);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_4 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask5 = unitWaiter2.continueWith(unitAction1_4);
        net.goldolphin.cate.Action0 action0_6 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask7 = net.goldolphin.cate.Task.create(action0_6);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter8 = unitTask7.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter9 = unitWaiter8.continueWithWaiter();
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask12 = unitWaiter8.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler11);
        java.util.concurrent.Executor executor13 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler14 = new net.goldolphin.cate.ExecutorScheduler(executor13);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask15 = unitWaiter8.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler14);
        boolean boolean16 = unitWaiter8.isComplete();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask17 = unitTask5.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter8);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter18 = unitTask17.continueWithWaiter();
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask5);
        org.junit.Assert.assertNotNull(unitTask7);
        org.junit.Assert.assertNotNull(unitWaiter8);
        org.junit.Assert.assertNotNull(unitWaiter9);
        org.junit.Assert.assertNotNull(unitTask12);
        org.junit.Assert.assertNotNull(unitTask15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unitTask17);
        org.junit.Assert.assertNotNull(unitWaiter18);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        java.util.concurrent.Executor executor4 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler5 = new net.goldolphin.cate.ExecutorScheduler(executor4);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler5);
        java.util.concurrent.Executor executor7 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler8 = new net.goldolphin.cate.ExecutorScheduler(executor7);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler8);
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask12 = null;
        net.goldolphin.cate.Action0 action0_13 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask14 = net.goldolphin.cate.Task.create(action0_13);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter15 = unitTask14.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter16 = unitWaiter15.continueWithWaiter();
        java.util.concurrent.Executor executor17 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler18 = new net.goldolphin.cate.ExecutorScheduler(executor17);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask19 = unitWaiter15.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler18);
        java.util.concurrent.Executor executor20 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler21 = new net.goldolphin.cate.ExecutorScheduler(executor20);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask22 = unitWaiter15.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler21);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler23 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask12, (net.goldolphin.cate.IScheduler) executorScheduler21);
        java.util.concurrent.Executor executor24 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler25 = new net.goldolphin.cate.ExecutorScheduler(executor24);
        net.goldolphin.cate.IScheduler[] iSchedulerArray26 = new net.goldolphin.cate.IScheduler[] { executorScheduler8, executorScheduler11, executorScheduler21, executorScheduler25 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner27 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool28 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray26, unitWaiterFunc0TaskIPartitioner27);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore29 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool28);
        java.util.Map<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>[] func0TaskPartitionedSchedulerPoolMapArray30 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore29.getData();
        net.goldolphin.cate.Action0 action0_31 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask32 = net.goldolphin.cate.Task.create(action0_31);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter33 = unitTask32.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter34 = unitWaiter33.continueWithWaiter();
        java.util.concurrent.Executor executor35 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler36 = new net.goldolphin.cate.ExecutorScheduler(executor35);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask37 = unitWaiter33.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler36);
        java.util.concurrent.Executor executor38 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler39 = new net.goldolphin.cate.ExecutorScheduler(executor38);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask40 = unitWaiter33.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler39);
        java.util.concurrent.Executor executor41 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler42 = new net.goldolphin.cate.ExecutorScheduler(executor41);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask43 = null;
        net.goldolphin.cate.Action0 action0_44 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask45 = net.goldolphin.cate.Task.create(action0_44);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter46 = unitTask45.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter47 = unitWaiter46.continueWithWaiter();
        java.util.concurrent.Executor executor48 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler49 = new net.goldolphin.cate.ExecutorScheduler(executor48);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask50 = unitWaiter46.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler49);
        java.util.concurrent.Executor executor51 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler52 = new net.goldolphin.cate.ExecutorScheduler(executor51);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask53 = unitWaiter46.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler52);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler54 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask43, (net.goldolphin.cate.IScheduler) executorScheduler52);
        java.util.concurrent.Executor executor55 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler56 = new net.goldolphin.cate.ExecutorScheduler(executor55);
        net.goldolphin.cate.IScheduler[] iSchedulerArray57 = new net.goldolphin.cate.IScheduler[] { executorScheduler39, executorScheduler42, executorScheduler52, executorScheduler56 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner58 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool59 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray57, unitWaiterFunc0TaskIPartitioner58);
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.IScheduler iScheduler60 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore29.remove(unitWaiterFunc0TaskPartitionedSchedulerPool59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitTask14);
        org.junit.Assert.assertNotNull(unitWaiter15);
        org.junit.Assert.assertNotNull(unitWaiter16);
        org.junit.Assert.assertNotNull(unitTask19);
        org.junit.Assert.assertNotNull(unitTask22);
        org.junit.Assert.assertNotNull(iSchedulerArray26);
        org.junit.Assert.assertNotNull(func0TaskPartitionedSchedulerPoolMapArray30);
        org.junit.Assert.assertNotNull(unitTask32);
        org.junit.Assert.assertNotNull(unitWaiter33);
        org.junit.Assert.assertNotNull(unitWaiter34);
        org.junit.Assert.assertNotNull(unitTask37);
        org.junit.Assert.assertNotNull(unitTask40);
        org.junit.Assert.assertNotNull(unitTask45);
        org.junit.Assert.assertNotNull(unitWaiter46);
        org.junit.Assert.assertNotNull(unitWaiter47);
        org.junit.Assert.assertNotNull(unitTask50);
        org.junit.Assert.assertNotNull(unitTask53);
        org.junit.Assert.assertNotNull(iSchedulerArray57);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        net.goldolphin.cate.Func1<java.util.Map<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>[], net.goldolphin.cate.IStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>> partitionedSchedulerPoolMapArrayFunc1_0 = null;
        net.goldolphin.cate.Func1Task<java.util.Map<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>[], net.goldolphin.cate.IStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>> partitionedSchedulerPoolMapArrayFunc1Task1 = new net.goldolphin.cate.Func1Task<java.util.Map<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>[], net.goldolphin.cate.IStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>>(partitionedSchedulerPoolMapArrayFunc1_0);
        net.goldolphin.cate.ContextAction<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextAction3 = null;
        net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextTask4 = new net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceContextAction3);
        net.goldolphin.cate.Action0 action0_5 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = net.goldolphin.cate.Task.create(action0_5);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter7 = unitTask6.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter8 = unitWaiter7.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter9 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter8);
        net.goldolphin.cate.IContinuation iContinuation10 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation11 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation10);
        net.goldolphin.cate.IContinuation iContinuation12 = unitWaiter8.buildContinuation(iContinuation10);
        net.goldolphin.cate.IContinuation iContinuation13 = charSequenceContextTask4.buildContinuation(iContinuation12);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation14 = new net.goldolphin.cate.CollectTask.IndexContinuation(10, iContinuation13);
        net.goldolphin.cate.IContinuation iContinuation15 = partitionedSchedulerPoolMapArrayFunc1Task1.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation14);
        net.goldolphin.cate.Action0 action0_16 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask17 = net.goldolphin.cate.Task.create(action0_16);
        net.goldolphin.cate.Environment environment18 = null;
        net.goldolphin.cate.SynchronizedScheduler synchronizedScheduler20 = new net.goldolphin.cate.SynchronizedScheduler();
        net.goldolphin.cate.CollectTask.Result result21 = new net.goldolphin.cate.CollectTask.Result(1, (java.lang.Object) synchronizedScheduler20);
        // The following exception was thrown during execution in test generation
        try {
            indexContinuation14.apply((java.lang.Object) unitTask17, environment18, (net.goldolphin.cate.IScheduler) synchronizedScheduler20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unitWaiter7);
        org.junit.Assert.assertNotNull(unitWaiter8);
        org.junit.Assert.assertNotNull(iContinuation12);
        org.junit.Assert.assertNotNull(iContinuation13);
        org.junit.Assert.assertNotNull(iContinuation15);
        org.junit.Assert.assertNotNull(unitTask17);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        net.goldolphin.cate.ITask<net.goldolphin.cate.CollectTask.Counter, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> counterITask0 = null;
        net.goldolphin.cate.FlattenTask<net.goldolphin.cate.CollectTask.Counter, net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> counterFlattenTask1 = new net.goldolphin.cate.FlattenTask<net.goldolphin.cate.CollectTask.Counter, net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(counterITask0);
        net.goldolphin.cate.Action0 action0_2 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask3 = net.goldolphin.cate.Task.create(action0_2);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = unitTask3.continueWithWaiter();
        net.goldolphin.cate.util.ExecutorTimer executorTimer5 = new net.goldolphin.cate.util.ExecutorTimer();
        net.goldolphin.cate.Action0 action0_6 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask7 = net.goldolphin.cate.Task.create(action0_6);
        net.goldolphin.cate.Action0 action0_8 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = net.goldolphin.cate.Task.create(action0_8);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter10 = unitTask9.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask11 = unitTask7.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter10);
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Maybe<net.goldolphin.cate.Unit>> unitTask15 = executorTimer5.withTimeout((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitTask7, unitAction1_12, (long) (byte) -1, timeUnit14);
        net.goldolphin.cate.SynchronizedScheduler synchronizedScheduler16 = new net.goldolphin.cate.SynchronizedScheduler();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask17 = unitTask7.withScheduler((net.goldolphin.cate.IScheduler) synchronizedScheduler16);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask18 = unitTask3.withScheduler((net.goldolphin.cate.IScheduler) synchronizedScheduler16);
        net.goldolphin.cate.ContextAction<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextAction20 = null;
        net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextTask21 = new net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceContextAction20);
        net.goldolphin.cate.Action0 action0_22 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask23 = net.goldolphin.cate.Task.create(action0_22);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter24 = unitTask23.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter25 = unitWaiter24.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter26 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter25);
        net.goldolphin.cate.IContinuation iContinuation27 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation28 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation27);
        net.goldolphin.cate.IContinuation iContinuation29 = unitWaiter25.buildContinuation(iContinuation27);
        net.goldolphin.cate.IContinuation iContinuation30 = charSequenceContextTask21.buildContinuation(iContinuation29);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation31 = new net.goldolphin.cate.CollectTask.IndexContinuation(10, iContinuation30);
        net.goldolphin.cate.IContinuation iContinuation32 = unitTask18.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation31);
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.IContinuation iContinuation33 = counterFlattenTask1.buildContinuation(iContinuation32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask3);
        org.junit.Assert.assertNotNull(unitWaiter4);
        org.junit.Assert.assertNotNull(unitTask7);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitWaiter10);
        org.junit.Assert.assertNotNull(unitTask11);
        org.junit.Assert.assertNotNull(unitTask15);
        org.junit.Assert.assertNotNull(unitTask17);
        org.junit.Assert.assertNotNull(unitTask18);
        org.junit.Assert.assertNotNull(unitTask23);
        org.junit.Assert.assertNotNull(unitWaiter24);
        org.junit.Assert.assertNotNull(unitWaiter25);
        org.junit.Assert.assertNotNull(iContinuation29);
        org.junit.Assert.assertNotNull(iContinuation30);
        org.junit.Assert.assertNotNull(iContinuation32);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        net.goldolphin.cate.ITask[] iTaskArray1 = new net.goldolphin.cate.ITask[0];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<java.lang.Comparable<java.lang.String>, ?>[] strComparableITaskArray2 = (net.goldolphin.cate.ITask<java.lang.Comparable<java.lang.String>, ?>[]) iTaskArray1;
        net.goldolphin.cate.WhenAllTask<java.lang.Comparable<java.lang.String>> strComparableWhenAllTask3 = net.goldolphin.cate.Task.whenAll((net.goldolphin.cate.ITask<java.lang.Comparable<java.lang.String>, ?>[]) iTaskArray1);
        org.junit.Assert.assertNotNull(iTaskArray1);
        org.junit.Assert.assertNotNull(strComparableITaskArray2);
        org.junit.Assert.assertNotNull(strComparableWhenAllTask3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        net.goldolphin.cate.util.ExecutorTimer executorTimer0 = new net.goldolphin.cate.util.ExecutorTimer();
        net.goldolphin.cate.Action0 action0_1 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask2 = net.goldolphin.cate.Task.create(action0_1);
        net.goldolphin.cate.Action0 action0_3 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask4 = net.goldolphin.cate.Task.create(action0_3);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter5 = unitTask4.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = unitTask2.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter5);
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Maybe<net.goldolphin.cate.Unit>> unitTask10 = executorTimer0.withTimeout((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitTask2, unitAction1_7, (long) (byte) -1, timeUnit9);
        net.goldolphin.cate.SynchronizedScheduler synchronizedScheduler11 = new net.goldolphin.cate.SynchronizedScheduler();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask12 = unitTask2.withScheduler((net.goldolphin.cate.IScheduler) synchronizedScheduler11);
        net.goldolphin.cate.Action0 action0_14 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask15 = net.goldolphin.cate.Task.create(action0_14);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter16 = unitTask15.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter17 = unitWaiter16.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter18 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter17);
        net.goldolphin.cate.IContinuation iContinuation19 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation20 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation19);
        net.goldolphin.cate.IContinuation iContinuation21 = unitWaiter17.buildContinuation(iContinuation19);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation22 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (byte) 100, iContinuation19);
        net.goldolphin.cate.Action0 action0_23 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask24 = net.goldolphin.cate.Task.create(action0_23);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter25 = unitTask24.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_26 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask27 = unitTask24.continueWith(unitAction1_26);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitTask28 = unitTask24.flatten();
        net.goldolphin.cate.Environment environment29 = null;
        // The following exception was thrown during execution in test generation
        try {
            synchronizedScheduler11.schedule(iContinuation19, (java.lang.Object) unitTask28, environment29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask2);
        org.junit.Assert.assertNotNull(unitTask4);
        org.junit.Assert.assertNotNull(unitWaiter5);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unitTask10);
        org.junit.Assert.assertNotNull(unitTask12);
        org.junit.Assert.assertNotNull(unitTask15);
        org.junit.Assert.assertNotNull(unitWaiter16);
        org.junit.Assert.assertNotNull(unitWaiter17);
        org.junit.Assert.assertNotNull(iContinuation21);
        org.junit.Assert.assertNotNull(unitTask24);
        org.junit.Assert.assertNotNull(unitWaiter25);
        org.junit.Assert.assertNotNull(unitTask27);
        org.junit.Assert.assertNotNull(unitTask28);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        net.goldolphin.cate.ITask<net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>, java.lang.reflect.Type> func0TaskPartitionedSchedulerPoolPartitionedStoreITask0 = null;
        net.goldolphin.cate.Action0 action0_1 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask2 = net.goldolphin.cate.Task.create(action0_1);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitTask2.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = unitWaiter3.continueWithWaiter();
        java.util.concurrent.Executor executor5 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler6 = new net.goldolphin.cate.ExecutorScheduler(executor5);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask7 = unitWaiter3.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler6);
        java.util.concurrent.Executor executor8 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler9 = new net.goldolphin.cate.ExecutorScheduler(executor8);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask10 = unitWaiter3.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler9);
        java.util.concurrent.Executor executor11 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler12 = new net.goldolphin.cate.ExecutorScheduler(executor11);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask13 = null;
        net.goldolphin.cate.Action0 action0_14 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask15 = net.goldolphin.cate.Task.create(action0_14);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter16 = unitTask15.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter17 = unitWaiter16.continueWithWaiter();
        java.util.concurrent.Executor executor18 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler19 = new net.goldolphin.cate.ExecutorScheduler(executor18);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask20 = unitWaiter16.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler19);
        java.util.concurrent.Executor executor21 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler22 = new net.goldolphin.cate.ExecutorScheduler(executor21);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask23 = unitWaiter16.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler22);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler24 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask13, (net.goldolphin.cate.IScheduler) executorScheduler22);
        java.util.concurrent.Executor executor25 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler26 = new net.goldolphin.cate.ExecutorScheduler(executor25);
        net.goldolphin.cate.IScheduler[] iSchedulerArray27 = new net.goldolphin.cate.IScheduler[] { executorScheduler9, executorScheduler12, executorScheduler22, executorScheduler26 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner28 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool29 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray27, unitWaiterFunc0TaskIPartitioner28);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore30 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool29);
        java.util.Map<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>[] func0TaskPartitionedSchedulerPoolMapArray31 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore30.getData();
        net.goldolphin.cate.TaskWithInitState<net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>, java.lang.reflect.Type> func0TaskPartitionedSchedulerPoolPartitionedStoreTaskWithInitState32 = new net.goldolphin.cate.TaskWithInitState<net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>, java.lang.reflect.Type>(func0TaskPartitionedSchedulerPoolPartitionedStoreITask0, waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore30);
        net.goldolphin.cate.Action0 action0_33 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask34 = net.goldolphin.cate.Task.create(action0_33);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter35 = unitTask34.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter36 = unitWaiter35.continueWithWaiter();
        java.util.concurrent.Executor executor37 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler38 = new net.goldolphin.cate.ExecutorScheduler(executor37);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask39 = unitWaiter35.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler38);
        java.util.concurrent.Executor executor40 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler41 = new net.goldolphin.cate.ExecutorScheduler(executor40);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask42 = unitWaiter35.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler41);
        java.util.concurrent.Executor executor43 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler44 = new net.goldolphin.cate.ExecutorScheduler(executor43);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask45 = null;
        net.goldolphin.cate.Action0 action0_46 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask47 = net.goldolphin.cate.Task.create(action0_46);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter48 = unitTask47.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter49 = unitWaiter48.continueWithWaiter();
        java.util.concurrent.Executor executor50 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler51 = new net.goldolphin.cate.ExecutorScheduler(executor50);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask52 = unitWaiter48.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler51);
        java.util.concurrent.Executor executor53 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler54 = new net.goldolphin.cate.ExecutorScheduler(executor53);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask55 = unitWaiter48.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler54);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler56 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask45, (net.goldolphin.cate.IScheduler) executorScheduler54);
        java.util.concurrent.Executor executor57 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler58 = new net.goldolphin.cate.ExecutorScheduler(executor57);
        net.goldolphin.cate.IScheduler[] iSchedulerArray59 = new net.goldolphin.cate.IScheduler[] { executorScheduler41, executorScheduler44, executorScheduler54, executorScheduler58 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner60 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool61 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray59, unitWaiterFunc0TaskIPartitioner60);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore62 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool61);
        int int63 = unitWaiterFunc0TaskPartitionedSchedulerPool61.getPartitionNum();
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore64 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool61);
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.IScheduler iScheduler65 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore30.get(unitWaiterFunc0TaskPartitionedSchedulerPool61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitWaiter4);
        org.junit.Assert.assertNotNull(unitTask7);
        org.junit.Assert.assertNotNull(unitTask10);
        org.junit.Assert.assertNotNull(unitTask15);
        org.junit.Assert.assertNotNull(unitWaiter16);
        org.junit.Assert.assertNotNull(unitWaiter17);
        org.junit.Assert.assertNotNull(unitTask20);
        org.junit.Assert.assertNotNull(unitTask23);
        org.junit.Assert.assertNotNull(iSchedulerArray27);
        org.junit.Assert.assertNotNull(func0TaskPartitionedSchedulerPoolMapArray31);
        org.junit.Assert.assertNotNull(unitTask34);
        org.junit.Assert.assertNotNull(unitWaiter35);
        org.junit.Assert.assertNotNull(unitWaiter36);
        org.junit.Assert.assertNotNull(unitTask39);
        org.junit.Assert.assertNotNull(unitTask42);
        org.junit.Assert.assertNotNull(unitTask47);
        org.junit.Assert.assertNotNull(unitWaiter48);
        org.junit.Assert.assertNotNull(unitWaiter49);
        org.junit.Assert.assertNotNull(unitTask52);
        org.junit.Assert.assertNotNull(unitTask55);
        org.junit.Assert.assertNotNull(iSchedulerArray59);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 4 + "'", int63 == 4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        net.goldolphin.cate.ITask<net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>, java.lang.reflect.Type> func0TaskPartitionedSchedulerPoolPartitionedStoreITask0 = null;
        net.goldolphin.cate.Action0 action0_1 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask2 = net.goldolphin.cate.Task.create(action0_1);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitTask2.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = unitWaiter3.continueWithWaiter();
        java.util.concurrent.Executor executor5 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler6 = new net.goldolphin.cate.ExecutorScheduler(executor5);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask7 = unitWaiter3.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler6);
        java.util.concurrent.Executor executor8 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler9 = new net.goldolphin.cate.ExecutorScheduler(executor8);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask10 = unitWaiter3.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler9);
        java.util.concurrent.Executor executor11 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler12 = new net.goldolphin.cate.ExecutorScheduler(executor11);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask13 = null;
        net.goldolphin.cate.Action0 action0_14 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask15 = net.goldolphin.cate.Task.create(action0_14);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter16 = unitTask15.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter17 = unitWaiter16.continueWithWaiter();
        java.util.concurrent.Executor executor18 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler19 = new net.goldolphin.cate.ExecutorScheduler(executor18);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask20 = unitWaiter16.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler19);
        java.util.concurrent.Executor executor21 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler22 = new net.goldolphin.cate.ExecutorScheduler(executor21);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask23 = unitWaiter16.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler22);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler24 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask13, (net.goldolphin.cate.IScheduler) executorScheduler22);
        java.util.concurrent.Executor executor25 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler26 = new net.goldolphin.cate.ExecutorScheduler(executor25);
        net.goldolphin.cate.IScheduler[] iSchedulerArray27 = new net.goldolphin.cate.IScheduler[] { executorScheduler9, executorScheduler12, executorScheduler22, executorScheduler26 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner28 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool29 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray27, unitWaiterFunc0TaskIPartitioner28);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore30 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool29);
        java.util.Map<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>[] func0TaskPartitionedSchedulerPoolMapArray31 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore30.getData();
        net.goldolphin.cate.TaskWithInitState<net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>, java.lang.reflect.Type> func0TaskPartitionedSchedulerPoolPartitionedStoreTaskWithInitState32 = new net.goldolphin.cate.TaskWithInitState<net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>, java.lang.reflect.Type>(func0TaskPartitionedSchedulerPoolPartitionedStoreITask0, waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore30);
        net.goldolphin.cate.Action0 action0_33 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask34 = net.goldolphin.cate.Task.create(action0_33);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter35 = unitTask34.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter36 = unitWaiter35.continueWithWaiter();
        java.util.concurrent.Executor executor37 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler38 = new net.goldolphin.cate.ExecutorScheduler(executor37);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask39 = unitWaiter35.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler38);
        java.util.concurrent.Executor executor40 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler41 = new net.goldolphin.cate.ExecutorScheduler(executor40);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask42 = unitWaiter35.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler41);
        java.util.concurrent.Executor executor43 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler44 = new net.goldolphin.cate.ExecutorScheduler(executor43);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask45 = null;
        net.goldolphin.cate.Action0 action0_46 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask47 = net.goldolphin.cate.Task.create(action0_46);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter48 = unitTask47.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter49 = unitWaiter48.continueWithWaiter();
        java.util.concurrent.Executor executor50 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler51 = new net.goldolphin.cate.ExecutorScheduler(executor50);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask52 = unitWaiter48.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler51);
        java.util.concurrent.Executor executor53 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler54 = new net.goldolphin.cate.ExecutorScheduler(executor53);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask55 = unitWaiter48.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler54);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler56 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask45, (net.goldolphin.cate.IScheduler) executorScheduler54);
        java.util.concurrent.Executor executor57 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler58 = new net.goldolphin.cate.ExecutorScheduler(executor57);
        net.goldolphin.cate.IScheduler[] iSchedulerArray59 = new net.goldolphin.cate.IScheduler[] { executorScheduler41, executorScheduler44, executorScheduler54, executorScheduler58 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner60 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool61 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray59, unitWaiterFunc0TaskIPartitioner60);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore62 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool61);
        int int63 = unitWaiterFunc0TaskPartitionedSchedulerPool61.getPartitionNum();
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore64 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool61);
        net.goldolphin.cate.Action0 action0_65 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask66 = net.goldolphin.cate.Task.create(action0_65);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter67 = unitTask66.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter68 = unitWaiter67.continueWithWaiter();
        java.util.concurrent.Executor executor69 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler70 = new net.goldolphin.cate.ExecutorScheduler(executor69);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask71 = unitWaiter67.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler70);
        java.util.concurrent.Executor executor72 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler73 = new net.goldolphin.cate.ExecutorScheduler(executor72);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask74 = unitWaiter67.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler73);
        // The following exception was thrown during execution in test generation
        try {
            waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore30.put(unitWaiterFunc0TaskPartitionedSchedulerPool61, (net.goldolphin.cate.IScheduler) executorScheduler73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitWaiter4);
        org.junit.Assert.assertNotNull(unitTask7);
        org.junit.Assert.assertNotNull(unitTask10);
        org.junit.Assert.assertNotNull(unitTask15);
        org.junit.Assert.assertNotNull(unitWaiter16);
        org.junit.Assert.assertNotNull(unitWaiter17);
        org.junit.Assert.assertNotNull(unitTask20);
        org.junit.Assert.assertNotNull(unitTask23);
        org.junit.Assert.assertNotNull(iSchedulerArray27);
        org.junit.Assert.assertNotNull(func0TaskPartitionedSchedulerPoolMapArray31);
        org.junit.Assert.assertNotNull(unitTask34);
        org.junit.Assert.assertNotNull(unitWaiter35);
        org.junit.Assert.assertNotNull(unitWaiter36);
        org.junit.Assert.assertNotNull(unitTask39);
        org.junit.Assert.assertNotNull(unitTask42);
        org.junit.Assert.assertNotNull(unitTask47);
        org.junit.Assert.assertNotNull(unitWaiter48);
        org.junit.Assert.assertNotNull(unitWaiter49);
        org.junit.Assert.assertNotNull(unitTask52);
        org.junit.Assert.assertNotNull(unitTask55);
        org.junit.Assert.assertNotNull(iSchedulerArray59);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 4 + "'", int63 == 4);
        org.junit.Assert.assertNotNull(unitTask66);
        org.junit.Assert.assertNotNull(unitWaiter67);
        org.junit.Assert.assertNotNull(unitWaiter68);
        org.junit.Assert.assertNotNull(unitTask71);
        org.junit.Assert.assertNotNull(unitTask74);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        net.goldolphin.cate.ITask[] iTaskArray1 = new net.goldolphin.cate.ITask[0];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, ?>[] unitITaskArray2 = (net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, ?>[]) iTaskArray1;
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.Unit> unitWhenAllTask3 = net.goldolphin.cate.Task.whenAll(unitITaskArray2);
        org.junit.Assert.assertNotNull(iTaskArray1);
        org.junit.Assert.assertNotNull(unitITaskArray2);
        org.junit.Assert.assertNotNull(unitWhenAllTask3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        net.goldolphin.cate.util.ExecutorTimer executorTimer0 = new net.goldolphin.cate.util.ExecutorTimer();
        net.goldolphin.cate.Action0 action0_1 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask2 = net.goldolphin.cate.Task.create(action0_1);
        net.goldolphin.cate.Action0 action0_3 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask4 = net.goldolphin.cate.Task.create(action0_3);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter5 = unitTask4.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = unitTask2.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter5);
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Maybe<net.goldolphin.cate.Unit>> unitTask10 = executorTimer0.withTimeout((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitTask2, unitAction1_7, (long) (byte) -1, timeUnit9);
        net.goldolphin.cate.ContextAction<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextAction11 = null;
        net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextTask12 = new net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceContextAction11);
        net.goldolphin.cate.Action0 action0_13 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask14 = net.goldolphin.cate.Task.create(action0_13);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter15 = unitTask14.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter16 = unitWaiter15.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter17 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter16);
        net.goldolphin.cate.IContinuation iContinuation18 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation19 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation18);
        net.goldolphin.cate.IContinuation iContinuation20 = unitWaiter16.buildContinuation(iContinuation18);
        net.goldolphin.cate.IContinuation iContinuation21 = charSequenceContextTask12.buildContinuation(iContinuation20);
        net.goldolphin.cate.Action0 action0_22 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask23 = net.goldolphin.cate.Task.create(action0_22);
        net.goldolphin.cate.ContextAction<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextAction25 = null;
        net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextTask26 = new net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceContextAction25);
        net.goldolphin.cate.Action0 action0_27 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask28 = net.goldolphin.cate.Task.create(action0_27);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter29 = unitTask28.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter30 = unitWaiter29.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter31 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter30);
        net.goldolphin.cate.IContinuation iContinuation32 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation33 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation32);
        net.goldolphin.cate.IContinuation iContinuation34 = unitWaiter30.buildContinuation(iContinuation32);
        net.goldolphin.cate.IContinuation iContinuation35 = charSequenceContextTask26.buildContinuation(iContinuation34);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation36 = new net.goldolphin.cate.CollectTask.IndexContinuation(10, iContinuation35);
        net.goldolphin.cate.IContinuation iContinuation37 = unitTask23.buildContinuation(iContinuation35);
        net.goldolphin.cate.IContinuation iContinuation38 = charSequenceContextTask12.buildContinuation(iContinuation35);
        net.goldolphin.cate.Action0 action0_39 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask40 = net.goldolphin.cate.Task.create(action0_39);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter41 = unitTask40.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter42 = unitWaiter41.continueWithWaiter();
        java.util.concurrent.Executor executor43 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler44 = new net.goldolphin.cate.ExecutorScheduler(executor43);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask45 = unitWaiter41.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler44);
        java.util.concurrent.Executor executor46 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler47 = new net.goldolphin.cate.ExecutorScheduler(executor46);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask48 = unitWaiter41.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler47);
        // The following exception was thrown during execution in test generation
        try {
            unitTask2.execute((java.lang.Object) iContinuation35, (net.goldolphin.cate.IScheduler) executorScheduler47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask2);
        org.junit.Assert.assertNotNull(unitTask4);
        org.junit.Assert.assertNotNull(unitWaiter5);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unitTask10);
        org.junit.Assert.assertNotNull(unitTask14);
        org.junit.Assert.assertNotNull(unitWaiter15);
        org.junit.Assert.assertNotNull(unitWaiter16);
        org.junit.Assert.assertNotNull(iContinuation20);
        org.junit.Assert.assertNotNull(iContinuation21);
        org.junit.Assert.assertNotNull(unitTask23);
        org.junit.Assert.assertNotNull(unitTask28);
        org.junit.Assert.assertNotNull(unitWaiter29);
        org.junit.Assert.assertNotNull(unitWaiter30);
        org.junit.Assert.assertNotNull(iContinuation34);
        org.junit.Assert.assertNotNull(iContinuation35);
        org.junit.Assert.assertNotNull(iContinuation37);
        org.junit.Assert.assertNotNull(iContinuation38);
        org.junit.Assert.assertNotNull(unitTask40);
        org.junit.Assert.assertNotNull(unitWaiter41);
        org.junit.Assert.assertNotNull(unitWaiter42);
        org.junit.Assert.assertNotNull(unitTask45);
        org.junit.Assert.assertNotNull(unitTask48);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        java.util.concurrent.Executor executor4 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler5 = new net.goldolphin.cate.ExecutorScheduler(executor4);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler5);
        net.goldolphin.cate.Unit unit7 = net.goldolphin.cate.Unit.VALUE;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask8 = unitWaiter2.withInitState(unit7);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter9 = unitWaiter2.continueWithWaiter();
        net.goldolphin.cate.Action0 action0_10 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask11 = net.goldolphin.cate.Task.create(action0_10);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter12 = unitTask11.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter13 = unitWaiter12.continueWithWaiter();
        net.goldolphin.cate.Action0 action0_14 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask15 = net.goldolphin.cate.Task.create(action0_14);
        net.goldolphin.cate.Action0 action0_16 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask17 = net.goldolphin.cate.Task.create(action0_16);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter18 = unitTask17.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter19 = unitWaiter18.continueWithWaiter();
        java.util.concurrent.Executor executor20 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler21 = new net.goldolphin.cate.ExecutorScheduler(executor20);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask22 = unitWaiter18.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler21);
        net.goldolphin.cate.Unit unit23 = net.goldolphin.cate.Unit.VALUE;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask24 = unitWaiter18.withInitState(unit23);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask25 = unitTask15.withInitState(unit23);
        unitWaiter13.setResult(unit23);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask27 = unitWaiter9.withInitState(unit23);
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unit7);
        org.junit.Assert.assertNotNull(unitTask8);
        org.junit.Assert.assertNotNull(unitWaiter9);
        org.junit.Assert.assertNotNull(unitTask11);
        org.junit.Assert.assertNotNull(unitWaiter12);
        org.junit.Assert.assertNotNull(unitWaiter13);
        org.junit.Assert.assertNotNull(unitTask15);
        org.junit.Assert.assertNotNull(unitTask17);
        org.junit.Assert.assertNotNull(unitWaiter18);
        org.junit.Assert.assertNotNull(unitWaiter19);
        org.junit.Assert.assertNotNull(unitTask22);
        org.junit.Assert.assertNotNull(unit23);
        org.junit.Assert.assertNotNull(unitTask24);
        org.junit.Assert.assertNotNull(unitTask25);
        org.junit.Assert.assertNotNull(unitTask27);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        net.goldolphin.cate.ITask<java.io.Serializable, ?> serializableITask0 = null;
        net.goldolphin.cate.ITask[] iTaskArray2 = new net.goldolphin.cate.ITask[1];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<java.io.Serializable, ?>[] serializableITaskArray3 = (net.goldolphin.cate.ITask<java.io.Serializable, ?>[]) iTaskArray2;
        serializableITaskArray3[0] = serializableITask0;
        net.goldolphin.cate.WhenAnyTask<java.io.Serializable> serializableWhenAnyTask6 = net.goldolphin.cate.Task.whenAny(serializableITaskArray3);
        net.goldolphin.cate.WhenAnyTask<java.io.Serializable> serializableWhenAnyTask7 = new net.goldolphin.cate.WhenAnyTask<java.io.Serializable>(serializableITaskArray3);
        org.junit.Assert.assertNotNull(iTaskArray2);
        org.junit.Assert.assertNotNull(serializableITaskArray3);
        org.junit.Assert.assertNotNull(serializableWhenAnyTask6);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        net.goldolphin.cate.ITask<net.goldolphin.cate.CollectTask.Result, net.goldolphin.cate.Action1Task<java.lang.Object>> resultITask0 = null;
        net.goldolphin.cate.IScheduler iScheduler1 = null;
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.CollectTask.Result, net.goldolphin.cate.Action1Task<java.lang.Object>> resultTaskWithScheduler2 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.CollectTask.Result, net.goldolphin.cate.Action1Task<java.lang.Object>>(resultITask0, iScheduler1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        net.goldolphin.cate.ITask<net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>, java.lang.reflect.Type> func0TaskPartitionedSchedulerPoolPartitionedStoreITask0 = null;
        net.goldolphin.cate.Action0 action0_1 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask2 = net.goldolphin.cate.Task.create(action0_1);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitTask2.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = unitWaiter3.continueWithWaiter();
        java.util.concurrent.Executor executor5 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler6 = new net.goldolphin.cate.ExecutorScheduler(executor5);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask7 = unitWaiter3.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler6);
        java.util.concurrent.Executor executor8 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler9 = new net.goldolphin.cate.ExecutorScheduler(executor8);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask10 = unitWaiter3.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler9);
        java.util.concurrent.Executor executor11 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler12 = new net.goldolphin.cate.ExecutorScheduler(executor11);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask13 = null;
        net.goldolphin.cate.Action0 action0_14 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask15 = net.goldolphin.cate.Task.create(action0_14);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter16 = unitTask15.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter17 = unitWaiter16.continueWithWaiter();
        java.util.concurrent.Executor executor18 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler19 = new net.goldolphin.cate.ExecutorScheduler(executor18);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask20 = unitWaiter16.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler19);
        java.util.concurrent.Executor executor21 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler22 = new net.goldolphin.cate.ExecutorScheduler(executor21);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask23 = unitWaiter16.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler22);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler24 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask13, (net.goldolphin.cate.IScheduler) executorScheduler22);
        java.util.concurrent.Executor executor25 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler26 = new net.goldolphin.cate.ExecutorScheduler(executor25);
        net.goldolphin.cate.IScheduler[] iSchedulerArray27 = new net.goldolphin.cate.IScheduler[] { executorScheduler9, executorScheduler12, executorScheduler22, executorScheduler26 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner28 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool29 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray27, unitWaiterFunc0TaskIPartitioner28);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore30 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool29);
        java.util.Map<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>[] func0TaskPartitionedSchedulerPoolMapArray31 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore30.getData();
        net.goldolphin.cate.TaskWithInitState<net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>, java.lang.reflect.Type> func0TaskPartitionedSchedulerPoolPartitionedStoreTaskWithInitState32 = new net.goldolphin.cate.TaskWithInitState<net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>, java.lang.reflect.Type>(func0TaskPartitionedSchedulerPoolPartitionedStoreITask0, waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore30);
        net.goldolphin.cate.Action0 action0_33 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask34 = net.goldolphin.cate.Task.create(action0_33);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter35 = unitTask34.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter36 = unitWaiter35.continueWithWaiter();
        java.util.concurrent.Executor executor37 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler38 = new net.goldolphin.cate.ExecutorScheduler(executor37);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask39 = unitWaiter35.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler38);
        java.util.concurrent.Executor executor40 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler41 = new net.goldolphin.cate.ExecutorScheduler(executor40);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask42 = unitWaiter35.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler41);
        java.util.concurrent.Executor executor43 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler44 = new net.goldolphin.cate.ExecutorScheduler(executor43);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask45 = null;
        net.goldolphin.cate.Action0 action0_46 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask47 = net.goldolphin.cate.Task.create(action0_46);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter48 = unitTask47.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter49 = unitWaiter48.continueWithWaiter();
        java.util.concurrent.Executor executor50 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler51 = new net.goldolphin.cate.ExecutorScheduler(executor50);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask52 = unitWaiter48.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler51);
        java.util.concurrent.Executor executor53 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler54 = new net.goldolphin.cate.ExecutorScheduler(executor53);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask55 = unitWaiter48.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler54);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler56 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask45, (net.goldolphin.cate.IScheduler) executorScheduler54);
        java.util.concurrent.Executor executor57 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler58 = new net.goldolphin.cate.ExecutorScheduler(executor57);
        net.goldolphin.cate.IScheduler[] iSchedulerArray59 = new net.goldolphin.cate.IScheduler[] { executorScheduler41, executorScheduler44, executorScheduler54, executorScheduler58 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner60 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool61 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray59, unitWaiterFunc0TaskIPartitioner60);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore62 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool61);
        int int63 = unitWaiterFunc0TaskPartitionedSchedulerPool61.getPartitionNum();
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.IScheduler iScheduler64 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore30.get(unitWaiterFunc0TaskPartitionedSchedulerPool61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitWaiter4);
        org.junit.Assert.assertNotNull(unitTask7);
        org.junit.Assert.assertNotNull(unitTask10);
        org.junit.Assert.assertNotNull(unitTask15);
        org.junit.Assert.assertNotNull(unitWaiter16);
        org.junit.Assert.assertNotNull(unitWaiter17);
        org.junit.Assert.assertNotNull(unitTask20);
        org.junit.Assert.assertNotNull(unitTask23);
        org.junit.Assert.assertNotNull(iSchedulerArray27);
        org.junit.Assert.assertNotNull(func0TaskPartitionedSchedulerPoolMapArray31);
        org.junit.Assert.assertNotNull(unitTask34);
        org.junit.Assert.assertNotNull(unitWaiter35);
        org.junit.Assert.assertNotNull(unitWaiter36);
        org.junit.Assert.assertNotNull(unitTask39);
        org.junit.Assert.assertNotNull(unitTask42);
        org.junit.Assert.assertNotNull(unitTask47);
        org.junit.Assert.assertNotNull(unitWaiter48);
        org.junit.Assert.assertNotNull(unitWaiter49);
        org.junit.Assert.assertNotNull(unitTask52);
        org.junit.Assert.assertNotNull(unitTask55);
        org.junit.Assert.assertNotNull(iSchedulerArray59);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 4 + "'", int63 == 4);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter3);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, java.lang.CharSequence> unitTask5 = unitWaiter4.flatten();
        net.goldolphin.cate.IScheduler iScheduler6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unitWaiter4.execute(iScheduler6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, java.io.Serializable> unitTask3 = unitWaiter2.flatten();
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitTask3);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter3);
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_5 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = unitWaiter3.continueWith(unitAction1_5);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter7 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        java.util.concurrent.Executor executor4 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler5 = new net.goldolphin.cate.ExecutorScheduler(executor4);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler5);
        java.util.concurrent.Executor executor7 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler8 = new net.goldolphin.cate.ExecutorScheduler(executor7);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler8);
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask12 = null;
        net.goldolphin.cate.Action0 action0_13 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask14 = net.goldolphin.cate.Task.create(action0_13);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter15 = unitTask14.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter16 = unitWaiter15.continueWithWaiter();
        java.util.concurrent.Executor executor17 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler18 = new net.goldolphin.cate.ExecutorScheduler(executor17);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask19 = unitWaiter15.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler18);
        java.util.concurrent.Executor executor20 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler21 = new net.goldolphin.cate.ExecutorScheduler(executor20);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask22 = unitWaiter15.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler21);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler23 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask12, (net.goldolphin.cate.IScheduler) executorScheduler21);
        java.util.concurrent.Executor executor24 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler25 = new net.goldolphin.cate.ExecutorScheduler(executor24);
        net.goldolphin.cate.IScheduler[] iSchedulerArray26 = new net.goldolphin.cate.IScheduler[] { executorScheduler8, executorScheduler11, executorScheduler21, executorScheduler25 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner27 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool28 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray26, unitWaiterFunc0TaskIPartitioner27);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore29 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool28);
        java.util.Map<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>[] func0TaskPartitionedSchedulerPoolMapArray30 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore29.getData();
        net.goldolphin.cate.Action0 action0_31 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask32 = net.goldolphin.cate.Task.create(action0_31);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter33 = unitTask32.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter34 = unitWaiter33.continueWithWaiter();
        java.util.concurrent.Executor executor35 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler36 = new net.goldolphin.cate.ExecutorScheduler(executor35);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask37 = unitWaiter33.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler36);
        java.util.concurrent.Executor executor38 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler39 = new net.goldolphin.cate.ExecutorScheduler(executor38);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask40 = unitWaiter33.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler39);
        java.util.concurrent.Executor executor41 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler42 = new net.goldolphin.cate.ExecutorScheduler(executor41);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask43 = null;
        net.goldolphin.cate.Action0 action0_44 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask45 = net.goldolphin.cate.Task.create(action0_44);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter46 = unitTask45.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter47 = unitWaiter46.continueWithWaiter();
        java.util.concurrent.Executor executor48 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler49 = new net.goldolphin.cate.ExecutorScheduler(executor48);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask50 = unitWaiter46.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler49);
        java.util.concurrent.Executor executor51 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler52 = new net.goldolphin.cate.ExecutorScheduler(executor51);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask53 = unitWaiter46.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler52);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler54 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask43, (net.goldolphin.cate.IScheduler) executorScheduler52);
        java.util.concurrent.Executor executor55 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler56 = new net.goldolphin.cate.ExecutorScheduler(executor55);
        net.goldolphin.cate.IScheduler[] iSchedulerArray57 = new net.goldolphin.cate.IScheduler[] { executorScheduler39, executorScheduler42, executorScheduler52, executorScheduler56 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner58 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool59 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray57, unitWaiterFunc0TaskIPartitioner58);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore60 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool59);
        int int61 = unitWaiterFunc0TaskPartitionedSchedulerPool59.getPartitionNum();
        net.goldolphin.cate.partitioned.IPartitioner iPartitioner62 = unitWaiterFunc0TaskPartitionedSchedulerPool59.getPartitioner();
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.IScheduler iScheduler63 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore29.get(unitWaiterFunc0TaskPartitionedSchedulerPool59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitTask14);
        org.junit.Assert.assertNotNull(unitWaiter15);
        org.junit.Assert.assertNotNull(unitWaiter16);
        org.junit.Assert.assertNotNull(unitTask19);
        org.junit.Assert.assertNotNull(unitTask22);
        org.junit.Assert.assertNotNull(iSchedulerArray26);
        org.junit.Assert.assertNotNull(func0TaskPartitionedSchedulerPoolMapArray30);
        org.junit.Assert.assertNotNull(unitTask32);
        org.junit.Assert.assertNotNull(unitWaiter33);
        org.junit.Assert.assertNotNull(unitWaiter34);
        org.junit.Assert.assertNotNull(unitTask37);
        org.junit.Assert.assertNotNull(unitTask40);
        org.junit.Assert.assertNotNull(unitTask45);
        org.junit.Assert.assertNotNull(unitWaiter46);
        org.junit.Assert.assertNotNull(unitWaiter47);
        org.junit.Assert.assertNotNull(unitTask50);
        org.junit.Assert.assertNotNull(unitTask53);
        org.junit.Assert.assertNotNull(iSchedulerArray57);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 4 + "'", int61 == 4);
        org.junit.Assert.assertNull(iPartitioner62);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        net.goldolphin.cate.ITask<net.goldolphin.cate.CollectTask.Counter, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> counterITask0 = null;
        net.goldolphin.cate.FlattenTask<net.goldolphin.cate.CollectTask.Counter, net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> counterFlattenTask1 = new net.goldolphin.cate.FlattenTask<net.goldolphin.cate.CollectTask.Counter, net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(counterITask0);
        net.goldolphin.cate.IContinuation iContinuation2 = net.goldolphin.cate.IContinuation.END_CONTINUATION;
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.IContinuation iContinuation3 = counterFlattenTask1.buildContinuation(iContinuation2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iContinuation2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        net.goldolphin.cate.ITask<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>, net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> iSchedulerTaskWithSchedulerITask0 = null;
        net.goldolphin.cate.Waiter<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>, net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> iSchedulerTaskWithSchedulerWaiter1 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>, net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>(iSchedulerTaskWithSchedulerITask0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        net.goldolphin.cate.Maybe<java.lang.Comparable<java.lang.String>> strComparableMaybe0 = net.goldolphin.cate.Maybe.nothing();
        java.lang.Comparable<java.lang.String> strComparable1 = strComparableMaybe0.get();
        boolean boolean2 = strComparableMaybe0.isNothing();
        java.lang.Comparable<java.lang.String> strComparable3 = strComparableMaybe0.get();
        java.lang.String str4 = strComparableMaybe0.toString();
        org.junit.Assert.assertNotNull(strComparableMaybe0);
        org.junit.Assert.assertNull(strComparable1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(strComparable3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Maybe{Nothing}" + "'", str4, "Maybe{Nothing}");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        net.goldolphin.cate.IdenticalTask<net.goldolphin.cate.CollectTask<java.lang.CharSequence, java.lang.Object[]>> charSequenceCollectTaskIdenticalTask0 = net.goldolphin.cate.IdenticalTask.instance();
        org.junit.Assert.assertNotNull(charSequenceCollectTaskIdenticalTask0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        net.goldolphin.cate.IContinuation iContinuation0 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation1 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation0);
        net.goldolphin.cate.Action0 action0_2 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask3 = net.goldolphin.cate.Task.create(action0_2);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = unitTask3.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter5 = unitTask3.continueWithWaiter();
        net.goldolphin.cate.Environment environment6 = null;
        net.goldolphin.cate.Action0 action0_7 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask8 = net.goldolphin.cate.Task.create(action0_7);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter9 = unitTask8.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter10 = unitWaiter9.continueWithWaiter();
        java.util.concurrent.Executor executor11 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler12 = new net.goldolphin.cate.ExecutorScheduler(executor11);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask13 = unitWaiter9.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler12);
        // The following exception was thrown during execution in test generation
        try {
            continuation1.apply((java.lang.Object) unitTask3, environment6, (net.goldolphin.cate.IScheduler) executorScheduler12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask3);
        org.junit.Assert.assertNotNull(unitWaiter4);
        org.junit.Assert.assertNotNull(unitWaiter5);
        org.junit.Assert.assertNotNull(unitTask8);
        org.junit.Assert.assertNotNull(unitWaiter9);
        org.junit.Assert.assertNotNull(unitWaiter10);
        org.junit.Assert.assertNotNull(unitTask13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        java.util.concurrent.Executor executor4 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler5 = new net.goldolphin.cate.ExecutorScheduler(executor4);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler5);
        java.util.concurrent.Executor executor7 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler8 = new net.goldolphin.cate.ExecutorScheduler(executor7);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler8);
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask12 = null;
        net.goldolphin.cate.Action0 action0_13 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask14 = net.goldolphin.cate.Task.create(action0_13);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter15 = unitTask14.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter16 = unitWaiter15.continueWithWaiter();
        java.util.concurrent.Executor executor17 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler18 = new net.goldolphin.cate.ExecutorScheduler(executor17);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask19 = unitWaiter15.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler18);
        java.util.concurrent.Executor executor20 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler21 = new net.goldolphin.cate.ExecutorScheduler(executor20);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask22 = unitWaiter15.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler21);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler23 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask12, (net.goldolphin.cate.IScheduler) executorScheduler21);
        java.util.concurrent.Executor executor24 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler25 = new net.goldolphin.cate.ExecutorScheduler(executor24);
        net.goldolphin.cate.IScheduler[] iSchedulerArray26 = new net.goldolphin.cate.IScheduler[] { executorScheduler8, executorScheduler11, executorScheduler21, executorScheduler25 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner27 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool28 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray26, unitWaiterFunc0TaskIPartitioner27);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore29 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool28);
        java.util.Map<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>[] func0TaskPartitionedSchedulerPoolMapArray30 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore29.getData();
        net.goldolphin.cate.Action0 action0_31 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask32 = net.goldolphin.cate.Task.create(action0_31);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter33 = unitTask32.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter34 = unitWaiter33.continueWithWaiter();
        java.util.concurrent.Executor executor35 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler36 = new net.goldolphin.cate.ExecutorScheduler(executor35);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask37 = unitWaiter33.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler36);
        java.util.concurrent.Executor executor38 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler39 = new net.goldolphin.cate.ExecutorScheduler(executor38);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask40 = unitWaiter33.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler39);
        java.util.concurrent.Executor executor41 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler42 = new net.goldolphin.cate.ExecutorScheduler(executor41);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask43 = null;
        net.goldolphin.cate.Action0 action0_44 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask45 = net.goldolphin.cate.Task.create(action0_44);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter46 = unitTask45.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter47 = unitWaiter46.continueWithWaiter();
        java.util.concurrent.Executor executor48 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler49 = new net.goldolphin.cate.ExecutorScheduler(executor48);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask50 = unitWaiter46.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler49);
        java.util.concurrent.Executor executor51 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler52 = new net.goldolphin.cate.ExecutorScheduler(executor51);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask53 = unitWaiter46.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler52);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler54 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask43, (net.goldolphin.cate.IScheduler) executorScheduler52);
        java.util.concurrent.Executor executor55 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler56 = new net.goldolphin.cate.ExecutorScheduler(executor55);
        net.goldolphin.cate.IScheduler[] iSchedulerArray57 = new net.goldolphin.cate.IScheduler[] { executorScheduler39, executorScheduler42, executorScheduler52, executorScheduler56 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner58 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool59 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray57, unitWaiterFunc0TaskIPartitioner58);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore60 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool59);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean61 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore29.contains(unitWaiterFunc0TaskPartitionedSchedulerPool59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitTask14);
        org.junit.Assert.assertNotNull(unitWaiter15);
        org.junit.Assert.assertNotNull(unitWaiter16);
        org.junit.Assert.assertNotNull(unitTask19);
        org.junit.Assert.assertNotNull(unitTask22);
        org.junit.Assert.assertNotNull(iSchedulerArray26);
        org.junit.Assert.assertNotNull(func0TaskPartitionedSchedulerPoolMapArray30);
        org.junit.Assert.assertNotNull(unitTask32);
        org.junit.Assert.assertNotNull(unitWaiter33);
        org.junit.Assert.assertNotNull(unitWaiter34);
        org.junit.Assert.assertNotNull(unitTask37);
        org.junit.Assert.assertNotNull(unitTask40);
        org.junit.Assert.assertNotNull(unitTask45);
        org.junit.Assert.assertNotNull(unitWaiter46);
        org.junit.Assert.assertNotNull(unitWaiter47);
        org.junit.Assert.assertNotNull(unitTask50);
        org.junit.Assert.assertNotNull(unitTask53);
        org.junit.Assert.assertNotNull(iSchedulerArray57);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter3);
        net.goldolphin.cate.IContinuation iContinuation5 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation6 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation5);
        net.goldolphin.cate.IContinuation iContinuation7 = unitWaiter3.buildContinuation(iContinuation5);
        net.goldolphin.cate.Action0 action0_8 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = net.goldolphin.cate.Task.create(action0_8);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter10 = unitTask9.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter11 = unitWaiter10.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter12 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter11);
        net.goldolphin.cate.IContinuation iContinuation13 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation14 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation13);
        net.goldolphin.cate.IContinuation iContinuation15 = unitWaiter11.buildContinuation(iContinuation13);
        net.goldolphin.cate.IContinuation[] iContinuationArray16 = new net.goldolphin.cate.IContinuation[] { iContinuation5, iContinuation15 };
        net.goldolphin.cate.ContextCollectTask.DispatcherContinuation dispatcherContinuation17 = new net.goldolphin.cate.ContextCollectTask.DispatcherContinuation(iContinuationArray16);
        net.goldolphin.cate.IContinuation[] iContinuationArray18 = new net.goldolphin.cate.IContinuation[] { dispatcherContinuation17 };
        net.goldolphin.cate.ContextCollectTask.DispatcherContinuation dispatcherContinuation19 = new net.goldolphin.cate.ContextCollectTask.DispatcherContinuation(iContinuationArray18);
        net.goldolphin.cate.Action0 action0_20 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask21 = net.goldolphin.cate.Task.create(action0_20);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter22 = unitTask21.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_23 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask24 = unitTask21.continueWith(unitAction1_23);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitTask25 = unitTask21.flatten();
        net.goldolphin.cate.Environment environment26 = null;
        net.goldolphin.cate.util.ExecutorTimer executorTimer27 = new net.goldolphin.cate.util.ExecutorTimer();
        net.goldolphin.cate.Action0 action0_28 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask29 = net.goldolphin.cate.Task.create(action0_28);
        net.goldolphin.cate.Action0 action0_30 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask31 = net.goldolphin.cate.Task.create(action0_30);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter32 = unitTask31.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask33 = unitTask29.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter32);
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_34 = null;
        java.util.concurrent.TimeUnit timeUnit36 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Maybe<net.goldolphin.cate.Unit>> unitTask37 = executorTimer27.withTimeout((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitTask29, unitAction1_34, (long) (byte) -1, timeUnit36);
        net.goldolphin.cate.SynchronizedScheduler synchronizedScheduler38 = new net.goldolphin.cate.SynchronizedScheduler();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask39 = unitTask29.withScheduler((net.goldolphin.cate.IScheduler) synchronizedScheduler38);
        // The following exception was thrown during execution in test generation
        try {
            dispatcherContinuation19.apply((java.lang.Object) unitTask25, environment26, (net.goldolphin.cate.IScheduler) synchronizedScheduler38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(iContinuation7);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitWaiter10);
        org.junit.Assert.assertNotNull(unitWaiter11);
        org.junit.Assert.assertNotNull(iContinuation15);
        org.junit.Assert.assertNotNull(iContinuationArray16);
        org.junit.Assert.assertNotNull(iContinuationArray18);
        org.junit.Assert.assertNotNull(unitTask21);
        org.junit.Assert.assertNotNull(unitWaiter22);
        org.junit.Assert.assertNotNull(unitTask24);
        org.junit.Assert.assertNotNull(unitTask25);
        org.junit.Assert.assertNotNull(unitTask29);
        org.junit.Assert.assertNotNull(unitTask31);
        org.junit.Assert.assertNotNull(unitWaiter32);
        org.junit.Assert.assertNotNull(unitTask33);
        org.junit.Assert.assertNotNull(unitTask37);
        org.junit.Assert.assertNotNull(unitTask39);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        net.goldolphin.cate.ITask<java.io.Serializable, net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]> serializableITask0 = null;
        net.goldolphin.cate.Waiter<java.io.Serializable, net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]> serializableWaiter1 = new net.goldolphin.cate.Waiter<java.io.Serializable, net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]>(serializableITask0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        net.goldolphin.cate.ITask<net.goldolphin.cate.ExecutorScheduler, java.lang.Comparable<java.lang.String>> executorSchedulerITask0 = null;
        net.goldolphin.cate.Waiter<net.goldolphin.cate.ExecutorScheduler, java.lang.Comparable<java.lang.String>> executorSchedulerWaiter1 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.ExecutorScheduler, java.lang.Comparable<java.lang.String>>(executorSchedulerITask0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask0 = null;
        net.goldolphin.cate.Action0 action0_1 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask2 = net.goldolphin.cate.Task.create(action0_1);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitTask2.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = unitWaiter3.continueWithWaiter();
        java.util.concurrent.Executor executor5 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler6 = new net.goldolphin.cate.ExecutorScheduler(executor5);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask7 = unitWaiter3.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler6);
        java.util.concurrent.Executor executor8 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler9 = new net.goldolphin.cate.ExecutorScheduler(executor8);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask10 = unitWaiter3.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler9);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler11 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask0, (net.goldolphin.cate.IScheduler) executorScheduler9);
        net.goldolphin.cate.IContinuation iContinuation12 = null;
        net.goldolphin.cate.ContextAction<net.goldolphin.cate.CollectTask.Result, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> resultContextAction13 = null;
        net.goldolphin.cate.ITask[] iTaskArray15 = new net.goldolphin.cate.ITask[0];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[] iTaskArrayITaskArray16 = (net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray15;
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]> charSequenceITaskArrayWhenAllTask17 = new net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]>((net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray15);
        net.goldolphin.cate.WhenAnyTask<java.lang.reflect.Type> typeWhenAnyTask18 = net.goldolphin.cate.Task.whenAny((net.goldolphin.cate.ITask<java.lang.reflect.Type, ?>[]) iTaskArray15);
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.IScheduler[]> iSchedulerArrayWhenAllTask19 = net.goldolphin.cate.Task.whenAll((net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler[], ?>[]) iTaskArray15);
        net.goldolphin.cate.ContextCollectTask<net.goldolphin.cate.SynchronizedScheduler, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> synchronizedSchedulerContextCollectTask20 = new net.goldolphin.cate.ContextCollectTask<net.goldolphin.cate.SynchronizedScheduler, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(resultContextAction13, (net.goldolphin.cate.ITask<net.goldolphin.cate.SynchronizedScheduler, ?>[]) iTaskArray15);
        net.goldolphin.cate.IContinuation iContinuation22 = net.goldolphin.cate.IContinuation.END_CONTINUATION;
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation23 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (short) -1, iContinuation22);
        net.goldolphin.cate.IContinuation iContinuation24 = synchronizedSchedulerContextCollectTask20.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation23);
        net.goldolphin.cate.Environment environment25 = null;
        // The following exception was thrown during execution in test generation
        try {
            executorScheduler9.schedule(iContinuation12, (java.lang.Object) indexContinuation23, environment25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitWaiter4);
        org.junit.Assert.assertNotNull(unitTask7);
        org.junit.Assert.assertNotNull(unitTask10);
        org.junit.Assert.assertNotNull(iTaskArray15);
        org.junit.Assert.assertNotNull(iTaskArrayITaskArray16);
        org.junit.Assert.assertNotNull(typeWhenAnyTask18);
        org.junit.Assert.assertNotNull(iSchedulerArrayWhenAllTask19);
        org.junit.Assert.assertNotNull(iContinuation22);
        org.junit.Assert.assertNotNull(iContinuation24);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Action0 action0_2 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask3 = net.goldolphin.cate.Task.create(action0_2);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = unitTask3.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask5 = unitTask1.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter4);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter6 = unitWaiter4.continueWithWaiter();
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitTask3);
        org.junit.Assert.assertNotNull(unitWaiter4);
        org.junit.Assert.assertNotNull(unitTask5);
        org.junit.Assert.assertNotNull(unitWaiter6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_3 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask4 = unitTask1.continueWith(unitAction1_3);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitTask5 = unitTask1.flatten();
        net.goldolphin.cate.Action0 action0_6 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask7 = net.goldolphin.cate.Task.create(action0_6);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter8 = unitTask7.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter9 = unitWaiter8.continueWithWaiter();
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask12 = unitWaiter8.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler11);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask13 = unitTask1.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler11);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter14 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter15 = unitWaiter14.continueWithWaiter();
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitTask4);
        org.junit.Assert.assertNotNull(unitTask5);
        org.junit.Assert.assertNotNull(unitTask7);
        org.junit.Assert.assertNotNull(unitWaiter8);
        org.junit.Assert.assertNotNull(unitWaiter9);
        org.junit.Assert.assertNotNull(unitTask12);
        org.junit.Assert.assertNotNull(unitTask13);
        org.junit.Assert.assertNotNull(unitWaiter14);
        org.junit.Assert.assertNotNull(unitWaiter15);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        net.goldolphin.cate.Maybe<java.lang.Comparable<java.lang.String>> strComparableMaybe0 = net.goldolphin.cate.Maybe.nothing();
        java.lang.String str1 = strComparableMaybe0.toString();
        org.junit.Assert.assertNotNull(strComparableMaybe0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Maybe{Nothing}" + "'", str1, "Maybe{Nothing}");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        net.goldolphin.cate.ITask<java.lang.CharSequence, java.io.Serializable> charSequenceITask0 = null;
        net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable> charSequenceTaskWithInitState2 = new net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>(charSequenceITask0, (java.lang.CharSequence) "hi!");
        net.goldolphin.cate.ContextAction<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextAction3 = null;
        net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextTask4 = new net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceContextAction3);
        net.goldolphin.cate.Action0 action0_5 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = net.goldolphin.cate.Task.create(action0_5);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter7 = unitTask6.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter8 = unitWaiter7.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter9 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter8);
        net.goldolphin.cate.IContinuation iContinuation10 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation11 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation10);
        net.goldolphin.cate.IContinuation iContinuation12 = unitWaiter8.buildContinuation(iContinuation10);
        net.goldolphin.cate.IContinuation iContinuation13 = charSequenceContextTask4.buildContinuation(iContinuation12);
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.IContinuation iContinuation14 = charSequenceTaskWithInitState2.buildContinuation(iContinuation13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unitWaiter7);
        org.junit.Assert.assertNotNull(unitWaiter8);
        org.junit.Assert.assertNotNull(iContinuation12);
        org.junit.Assert.assertNotNull(iContinuation13);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        net.goldolphin.cate.ITask<java.lang.CharSequence, java.io.Serializable> charSequenceITask0 = null;
        net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable> charSequenceTaskWithInitState2 = new net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>(charSequenceITask0, (java.lang.CharSequence) "hi!");
        net.goldolphin.cate.Action0 action0_4 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask5 = net.goldolphin.cate.Task.create(action0_4);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter6 = unitTask5.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter7 = unitWaiter6.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter8 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter7);
        net.goldolphin.cate.IContinuation iContinuation9 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation10 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation9);
        net.goldolphin.cate.IContinuation iContinuation11 = unitWaiter7.buildContinuation(iContinuation9);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation12 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (byte) 100, iContinuation9);
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.IContinuation iContinuation13 = charSequenceTaskWithInitState2.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask5);
        org.junit.Assert.assertNotNull(unitWaiter6);
        org.junit.Assert.assertNotNull(unitWaiter7);
        org.junit.Assert.assertNotNull(iContinuation11);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        net.goldolphin.cate.ITask<net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>, java.lang.reflect.Type> func0TaskPartitionedSchedulerPoolPartitionedStoreITask0 = null;
        net.goldolphin.cate.Action0 action0_1 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask2 = net.goldolphin.cate.Task.create(action0_1);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitTask2.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = unitWaiter3.continueWithWaiter();
        java.util.concurrent.Executor executor5 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler6 = new net.goldolphin.cate.ExecutorScheduler(executor5);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask7 = unitWaiter3.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler6);
        java.util.concurrent.Executor executor8 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler9 = new net.goldolphin.cate.ExecutorScheduler(executor8);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask10 = unitWaiter3.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler9);
        java.util.concurrent.Executor executor11 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler12 = new net.goldolphin.cate.ExecutorScheduler(executor11);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask13 = null;
        net.goldolphin.cate.Action0 action0_14 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask15 = net.goldolphin.cate.Task.create(action0_14);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter16 = unitTask15.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter17 = unitWaiter16.continueWithWaiter();
        java.util.concurrent.Executor executor18 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler19 = new net.goldolphin.cate.ExecutorScheduler(executor18);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask20 = unitWaiter16.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler19);
        java.util.concurrent.Executor executor21 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler22 = new net.goldolphin.cate.ExecutorScheduler(executor21);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask23 = unitWaiter16.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler22);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler24 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask13, (net.goldolphin.cate.IScheduler) executorScheduler22);
        java.util.concurrent.Executor executor25 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler26 = new net.goldolphin.cate.ExecutorScheduler(executor25);
        net.goldolphin.cate.IScheduler[] iSchedulerArray27 = new net.goldolphin.cate.IScheduler[] { executorScheduler9, executorScheduler12, executorScheduler22, executorScheduler26 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner28 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool29 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray27, unitWaiterFunc0TaskIPartitioner28);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore30 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool29);
        java.util.Map<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>[] func0TaskPartitionedSchedulerPoolMapArray31 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore30.getData();
        net.goldolphin.cate.TaskWithInitState<net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>, java.lang.reflect.Type> func0TaskPartitionedSchedulerPoolPartitionedStoreTaskWithInitState32 = new net.goldolphin.cate.TaskWithInitState<net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>, java.lang.reflect.Type>(func0TaskPartitionedSchedulerPoolPartitionedStoreITask0, waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore30);
        net.goldolphin.cate.Action0 action0_33 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask34 = net.goldolphin.cate.Task.create(action0_33);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter35 = unitTask34.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter36 = unitWaiter35.continueWithWaiter();
        java.util.concurrent.Executor executor37 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler38 = new net.goldolphin.cate.ExecutorScheduler(executor37);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask39 = unitWaiter35.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler38);
        java.util.concurrent.Executor executor40 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler41 = new net.goldolphin.cate.ExecutorScheduler(executor40);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask42 = unitWaiter35.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler41);
        java.util.concurrent.Executor executor43 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler44 = new net.goldolphin.cate.ExecutorScheduler(executor43);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask45 = null;
        net.goldolphin.cate.Action0 action0_46 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask47 = net.goldolphin.cate.Task.create(action0_46);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter48 = unitTask47.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter49 = unitWaiter48.continueWithWaiter();
        java.util.concurrent.Executor executor50 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler51 = new net.goldolphin.cate.ExecutorScheduler(executor50);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask52 = unitWaiter48.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler51);
        java.util.concurrent.Executor executor53 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler54 = new net.goldolphin.cate.ExecutorScheduler(executor53);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask55 = unitWaiter48.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler54);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler56 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask45, (net.goldolphin.cate.IScheduler) executorScheduler54);
        java.util.concurrent.Executor executor57 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler58 = new net.goldolphin.cate.ExecutorScheduler(executor57);
        net.goldolphin.cate.IScheduler[] iSchedulerArray59 = new net.goldolphin.cate.IScheduler[] { executorScheduler41, executorScheduler44, executorScheduler54, executorScheduler58 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner60 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool61 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray59, unitWaiterFunc0TaskIPartitioner60);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore62 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool61);
        int int63 = unitWaiterFunc0TaskPartitionedSchedulerPool61.getPartitionNum();
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.IScheduler iScheduler64 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore30.remove(unitWaiterFunc0TaskPartitionedSchedulerPool61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitWaiter4);
        org.junit.Assert.assertNotNull(unitTask7);
        org.junit.Assert.assertNotNull(unitTask10);
        org.junit.Assert.assertNotNull(unitTask15);
        org.junit.Assert.assertNotNull(unitWaiter16);
        org.junit.Assert.assertNotNull(unitWaiter17);
        org.junit.Assert.assertNotNull(unitTask20);
        org.junit.Assert.assertNotNull(unitTask23);
        org.junit.Assert.assertNotNull(iSchedulerArray27);
        org.junit.Assert.assertNotNull(func0TaskPartitionedSchedulerPoolMapArray31);
        org.junit.Assert.assertNotNull(unitTask34);
        org.junit.Assert.assertNotNull(unitWaiter35);
        org.junit.Assert.assertNotNull(unitWaiter36);
        org.junit.Assert.assertNotNull(unitTask39);
        org.junit.Assert.assertNotNull(unitTask42);
        org.junit.Assert.assertNotNull(unitTask47);
        org.junit.Assert.assertNotNull(unitWaiter48);
        org.junit.Assert.assertNotNull(unitWaiter49);
        org.junit.Assert.assertNotNull(unitTask52);
        org.junit.Assert.assertNotNull(unitTask55);
        org.junit.Assert.assertNotNull(iSchedulerArray59);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 4 + "'", int63 == 4);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_4 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask5 = unitWaiter2.continueWith(unitAction1_4);
        net.goldolphin.cate.Action0 action0_6 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask7 = net.goldolphin.cate.Task.create(action0_6);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter8 = unitTask7.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter9 = unitWaiter8.continueWithWaiter();
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask12 = unitWaiter8.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler11);
        java.util.concurrent.Executor executor13 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler14 = new net.goldolphin.cate.ExecutorScheduler(executor13);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask15 = unitWaiter8.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler14);
        boolean boolean16 = unitWaiter8.isComplete();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask17 = unitTask5.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter8);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter18 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter8);
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask5);
        org.junit.Assert.assertNotNull(unitTask7);
        org.junit.Assert.assertNotNull(unitWaiter8);
        org.junit.Assert.assertNotNull(unitWaiter9);
        org.junit.Assert.assertNotNull(unitTask12);
        org.junit.Assert.assertNotNull(unitTask15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unitTask17);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        net.goldolphin.cate.Maybe<java.io.Serializable> serializableMaybe1 = net.goldolphin.cate.Maybe.just((java.io.Serializable) false);
        org.junit.Assert.assertNotNull(serializableMaybe1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        net.goldolphin.cate.ITask[] iTaskArray2 = new net.goldolphin.cate.ITask[0];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[] iTaskArrayITaskArray3 = (net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray2;
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]> charSequenceITaskArrayWhenAllTask4 = new net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]>((net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray2);
        net.goldolphin.cate.WhenAnyTask<java.lang.reflect.Type> typeWhenAnyTask5 = net.goldolphin.cate.Task.whenAny((net.goldolphin.cate.ITask<java.lang.reflect.Type, ?>[]) iTaskArray2);
        net.goldolphin.cate.CollectTask.Result result6 = new net.goldolphin.cate.CollectTask.Result((int) (short) 10, (java.lang.Object) iTaskArray2);
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.CollectTask<java.lang.CharSequence, java.lang.Object[]>> charSequenceCollectTaskWhenAllTask7 = net.goldolphin.cate.Task.whenAll((net.goldolphin.cate.ITask<net.goldolphin.cate.CollectTask<java.lang.CharSequence, java.lang.Object[]>, ?>[]) iTaskArray2);
        org.junit.Assert.assertNotNull(iTaskArray2);
        org.junit.Assert.assertNotNull(iTaskArrayITaskArray3);
        org.junit.Assert.assertNotNull(typeWhenAnyTask5);
        org.junit.Assert.assertNotNull(charSequenceCollectTaskWhenAllTask7);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        net.goldolphin.cate.Func0<net.goldolphin.cate.CollectTask.IndexContinuation> indexContinuationFunc0_0 = null;
        net.goldolphin.cate.Func0Task<net.goldolphin.cate.CollectTask.IndexContinuation> indexContinuationFunc0Task1 = new net.goldolphin.cate.Func0Task<net.goldolphin.cate.CollectTask.IndexContinuation>(indexContinuationFunc0_0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>> iSchedulerTaskWithSchedulerHashedPartitioner0 = net.goldolphin.cate.partitioned.HashedPartitioner.instance();
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = iSchedulerTaskWithSchedulerHashedPartitioner0.partition(iSchedulerTaskWithScheduler1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSchedulerTaskWithSchedulerHashedPartitioner0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>> iSchedulerTaskWithSchedulerHashedPartitioner1 = net.goldolphin.cate.partitioned.HashedPartitioner.instance();
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask2 = null;
        net.goldolphin.cate.Action0 action0_3 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask4 = net.goldolphin.cate.Task.create(action0_3);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter5 = unitTask4.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter6 = unitWaiter5.continueWithWaiter();
        java.util.concurrent.Executor executor7 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler8 = new net.goldolphin.cate.ExecutorScheduler(executor7);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = unitWaiter5.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler8);
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask12 = unitWaiter5.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler11);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler13 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask2, (net.goldolphin.cate.IScheduler) executorScheduler11);
        int int15 = iSchedulerTaskWithSchedulerHashedPartitioner1.partition(iSchedulerTaskWithScheduler13, (int) (byte) 10);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore16 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((int) (byte) 1, (net.goldolphin.cate.partitioned.IPartitioner) iSchedulerTaskWithSchedulerHashedPartitioner1);
        net.goldolphin.cate.Action0 action0_17 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask18 = net.goldolphin.cate.Task.create(action0_17);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter19 = unitTask18.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter20 = unitWaiter19.continueWithWaiter();
        java.util.concurrent.Executor executor21 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler22 = new net.goldolphin.cate.ExecutorScheduler(executor21);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask23 = unitWaiter19.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler22);
        java.util.concurrent.Executor executor24 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler25 = new net.goldolphin.cate.ExecutorScheduler(executor24);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask26 = unitWaiter19.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler25);
        java.util.concurrent.Executor executor27 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler28 = new net.goldolphin.cate.ExecutorScheduler(executor27);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask29 = null;
        net.goldolphin.cate.Action0 action0_30 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask31 = net.goldolphin.cate.Task.create(action0_30);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter32 = unitTask31.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter33 = unitWaiter32.continueWithWaiter();
        java.util.concurrent.Executor executor34 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler35 = new net.goldolphin.cate.ExecutorScheduler(executor34);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask36 = unitWaiter32.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler35);
        java.util.concurrent.Executor executor37 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler38 = new net.goldolphin.cate.ExecutorScheduler(executor37);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask39 = unitWaiter32.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler38);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler40 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask29, (net.goldolphin.cate.IScheduler) executorScheduler38);
        java.util.concurrent.Executor executor41 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler42 = new net.goldolphin.cate.ExecutorScheduler(executor41);
        net.goldolphin.cate.IScheduler[] iSchedulerArray43 = new net.goldolphin.cate.IScheduler[] { executorScheduler25, executorScheduler28, executorScheduler38, executorScheduler42 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner44 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool45 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray43, unitWaiterFunc0TaskIPartitioner44);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore46 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool45);
        int int47 = unitWaiterFunc0TaskPartitionedSchedulerPool45.getPartitionNum();
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore48 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool45);
        net.goldolphin.cate.partitioned.IPartitioner iPartitioner49 = unitWaiterFunc0TaskPartitionedSchedulerPool45.getPartitioner();
        net.goldolphin.cate.IScheduler iScheduler50 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore16.get(unitWaiterFunc0TaskPartitionedSchedulerPool45);
        net.goldolphin.cate.Action0 action0_51 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask52 = net.goldolphin.cate.Task.create(action0_51);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter53 = unitTask52.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter54 = unitWaiter53.continueWithWaiter();
        java.util.concurrent.Executor executor55 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler56 = new net.goldolphin.cate.ExecutorScheduler(executor55);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask57 = unitWaiter53.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler56);
        java.util.concurrent.Executor executor58 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler59 = new net.goldolphin.cate.ExecutorScheduler(executor58);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask60 = unitWaiter53.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler59);
        java.util.concurrent.Executor executor61 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler62 = new net.goldolphin.cate.ExecutorScheduler(executor61);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask63 = null;
        net.goldolphin.cate.Action0 action0_64 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask65 = net.goldolphin.cate.Task.create(action0_64);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter66 = unitTask65.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter67 = unitWaiter66.continueWithWaiter();
        java.util.concurrent.Executor executor68 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler69 = new net.goldolphin.cate.ExecutorScheduler(executor68);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask70 = unitWaiter66.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler69);
        java.util.concurrent.Executor executor71 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler72 = new net.goldolphin.cate.ExecutorScheduler(executor71);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask73 = unitWaiter66.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler72);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler74 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask63, (net.goldolphin.cate.IScheduler) executorScheduler72);
        java.util.concurrent.Executor executor75 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler76 = new net.goldolphin.cate.ExecutorScheduler(executor75);
        net.goldolphin.cate.IScheduler[] iSchedulerArray77 = new net.goldolphin.cate.IScheduler[] { executorScheduler59, executorScheduler62, executorScheduler72, executorScheduler76 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner78 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool79 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray77, unitWaiterFunc0TaskIPartitioner78);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore80 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool79);
        int int81 = unitWaiterFunc0TaskPartitionedSchedulerPool79.getPartitionNum();
        net.goldolphin.cate.partitioned.IPartitioner iPartitioner82 = unitWaiterFunc0TaskPartitionedSchedulerPool79.getPartitioner();
        net.goldolphin.cate.IScheduler iScheduler83 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore16.get(unitWaiterFunc0TaskPartitionedSchedulerPool79);
        org.junit.Assert.assertNotNull(iSchedulerTaskWithSchedulerHashedPartitioner1);
        org.junit.Assert.assertNotNull(unitTask4);
        org.junit.Assert.assertNotNull(unitWaiter5);
        org.junit.Assert.assertNotNull(unitWaiter6);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitTask12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(unitTask18);
        org.junit.Assert.assertNotNull(unitWaiter19);
        org.junit.Assert.assertNotNull(unitWaiter20);
        org.junit.Assert.assertNotNull(unitTask23);
        org.junit.Assert.assertNotNull(unitTask26);
        org.junit.Assert.assertNotNull(unitTask31);
        org.junit.Assert.assertNotNull(unitWaiter32);
        org.junit.Assert.assertNotNull(unitWaiter33);
        org.junit.Assert.assertNotNull(unitTask36);
        org.junit.Assert.assertNotNull(unitTask39);
        org.junit.Assert.assertNotNull(iSchedulerArray43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 4 + "'", int47 == 4);
        org.junit.Assert.assertNull(iPartitioner49);
        org.junit.Assert.assertNull(iScheduler50);
        org.junit.Assert.assertNotNull(unitTask52);
        org.junit.Assert.assertNotNull(unitWaiter53);
        org.junit.Assert.assertNotNull(unitWaiter54);
        org.junit.Assert.assertNotNull(unitTask57);
        org.junit.Assert.assertNotNull(unitTask60);
        org.junit.Assert.assertNotNull(unitTask65);
        org.junit.Assert.assertNotNull(unitWaiter66);
        org.junit.Assert.assertNotNull(unitWaiter67);
        org.junit.Assert.assertNotNull(unitTask70);
        org.junit.Assert.assertNotNull(unitTask73);
        org.junit.Assert.assertNotNull(iSchedulerArray77);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 4 + "'", int81 == 4);
        org.junit.Assert.assertNull(iPartitioner82);
        org.junit.Assert.assertNull(iScheduler83);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        net.goldolphin.cate.Action1<java.lang.Object> objAction1_0 = null;
        net.goldolphin.cate.Action1Task<java.lang.Object> objAction1Task1 = new net.goldolphin.cate.Action1Task<java.lang.Object>(objAction1_0);
        net.goldolphin.cate.Func0<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0_3 = null;
        net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0Task4 = new net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>(unitWaiterFunc0_3);
        net.goldolphin.cate.Action0 action0_6 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask7 = net.goldolphin.cate.Task.create(action0_6);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter8 = unitTask7.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter9 = unitWaiter8.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter10 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter9);
        net.goldolphin.cate.IContinuation iContinuation11 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation12 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation11);
        net.goldolphin.cate.IContinuation iContinuation13 = unitWaiter9.buildContinuation(iContinuation11);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation14 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (byte) 100, iContinuation11);
        net.goldolphin.cate.IContinuation iContinuation15 = unitWaiterFunc0Task4.buildContinuation(iContinuation11);
        net.goldolphin.cate.ContextAction<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextAction17 = null;
        net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextTask18 = new net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceContextAction17);
        net.goldolphin.cate.Action0 action0_19 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask20 = net.goldolphin.cate.Task.create(action0_19);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter21 = unitTask20.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter22 = unitWaiter21.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter23 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter22);
        net.goldolphin.cate.IContinuation iContinuation24 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation25 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation24);
        net.goldolphin.cate.IContinuation iContinuation26 = unitWaiter22.buildContinuation(iContinuation24);
        net.goldolphin.cate.IContinuation iContinuation27 = charSequenceContextTask18.buildContinuation(iContinuation26);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation28 = new net.goldolphin.cate.CollectTask.IndexContinuation(10, iContinuation27);
        net.goldolphin.cate.IContinuation iContinuation29 = unitWaiterFunc0Task4.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation28);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation30 = new net.goldolphin.cate.CollectTask.IndexContinuation(0, iContinuation29);
        net.goldolphin.cate.IContinuation iContinuation31 = objAction1Task1.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation30);
        org.junit.Assert.assertNotNull(unitTask7);
        org.junit.Assert.assertNotNull(unitWaiter8);
        org.junit.Assert.assertNotNull(unitWaiter9);
        org.junit.Assert.assertNotNull(iContinuation13);
        org.junit.Assert.assertNotNull(iContinuation15);
        org.junit.Assert.assertNotNull(unitTask20);
        org.junit.Assert.assertNotNull(unitWaiter21);
        org.junit.Assert.assertNotNull(unitWaiter22);
        org.junit.Assert.assertNotNull(iContinuation26);
        org.junit.Assert.assertNotNull(iContinuation27);
        org.junit.Assert.assertNotNull(iContinuation29);
        org.junit.Assert.assertNotNull(iContinuation31);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.SynchronizedScheduler> synchronizedSchedulerHashedPartitioner0 = net.goldolphin.cate.partitioned.HashedPartitioner.instance();
        org.junit.Assert.assertNotNull(synchronizedSchedulerHashedPartitioner0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_3 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask4 = unitTask1.continueWith(unitAction1_3);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitTask5 = unitTask1.flatten();
        java.util.concurrent.Executor executor6 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler7 = new net.goldolphin.cate.ExecutorScheduler(executor6);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask8 = unitTask1.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler7);
        net.goldolphin.cate.Action0 action0_9 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask10 = net.goldolphin.cate.Task.create(action0_9);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter11 = unitTask10.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter12 = unitWaiter11.continueWithWaiter();
        net.goldolphin.cate.Action0 action0_13 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask14 = net.goldolphin.cate.Task.create(action0_13);
        net.goldolphin.cate.Action0 action0_15 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask16 = net.goldolphin.cate.Task.create(action0_15);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter17 = unitTask16.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter18 = unitWaiter17.continueWithWaiter();
        java.util.concurrent.Executor executor19 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler20 = new net.goldolphin.cate.ExecutorScheduler(executor19);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask21 = unitWaiter17.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler20);
        net.goldolphin.cate.Unit unit22 = net.goldolphin.cate.Unit.VALUE;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask23 = unitWaiter17.withInitState(unit22);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask24 = unitTask14.withInitState(unit22);
        unitWaiter12.setResult(unit22);
        net.goldolphin.cate.IContinuation iContinuation27 = net.goldolphin.cate.IContinuation.END_CONTINUATION;
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation28 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (short) -1, iContinuation27);
        net.goldolphin.cate.IContinuation iContinuation29 = unitWaiter12.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation28);
        net.goldolphin.cate.Action0 action0_30 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask31 = net.goldolphin.cate.Task.create(action0_30);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter32 = unitTask31.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter33 = unitWaiter32.continueWithWaiter();
        java.util.concurrent.Executor executor34 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler35 = new net.goldolphin.cate.ExecutorScheduler(executor34);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask36 = unitWaiter32.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler35);
        net.goldolphin.cate.Unit unit37 = net.goldolphin.cate.Unit.VALUE;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask38 = unitWaiter32.withInitState(unit37);
        net.goldolphin.cate.Action0 action0_39 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask40 = net.goldolphin.cate.Task.create(action0_39);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter41 = unitTask40.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter42 = unitWaiter41.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter43 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter42);
        net.goldolphin.cate.IContinuation iContinuation44 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation45 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation44);
        net.goldolphin.cate.IContinuation iContinuation46 = unitWaiter42.buildContinuation(iContinuation44);
        net.goldolphin.cate.IContinuation iContinuation47 = unitWaiter32.buildContinuation(iContinuation44);
        net.goldolphin.cate.Environment environment48 = null;
        // The following exception was thrown during execution in test generation
        try {
            executorScheduler7.schedule((net.goldolphin.cate.IContinuation) indexContinuation28, (java.lang.Object) iContinuation44, environment48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitTask4);
        org.junit.Assert.assertNotNull(unitTask5);
        org.junit.Assert.assertNotNull(unitTask8);
        org.junit.Assert.assertNotNull(unitTask10);
        org.junit.Assert.assertNotNull(unitWaiter11);
        org.junit.Assert.assertNotNull(unitWaiter12);
        org.junit.Assert.assertNotNull(unitTask14);
        org.junit.Assert.assertNotNull(unitTask16);
        org.junit.Assert.assertNotNull(unitWaiter17);
        org.junit.Assert.assertNotNull(unitWaiter18);
        org.junit.Assert.assertNotNull(unitTask21);
        org.junit.Assert.assertNotNull(unit22);
        org.junit.Assert.assertNotNull(unitTask23);
        org.junit.Assert.assertNotNull(unitTask24);
        org.junit.Assert.assertNotNull(iContinuation27);
        org.junit.Assert.assertNotNull(iContinuation29);
        org.junit.Assert.assertNotNull(unitTask31);
        org.junit.Assert.assertNotNull(unitWaiter32);
        org.junit.Assert.assertNotNull(unitWaiter33);
        org.junit.Assert.assertNotNull(unitTask36);
        org.junit.Assert.assertNotNull(unit37);
        org.junit.Assert.assertNotNull(unitTask38);
        org.junit.Assert.assertNotNull(unitTask40);
        org.junit.Assert.assertNotNull(unitWaiter41);
        org.junit.Assert.assertNotNull(unitWaiter42);
        org.junit.Assert.assertNotNull(iContinuation46);
        org.junit.Assert.assertNotNull(iContinuation47);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        net.goldolphin.cate.ITask[] iTaskArray2 = new net.goldolphin.cate.ITask[0];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[] iTaskArrayITaskArray3 = (net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray2;
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]> charSequenceITaskArrayWhenAllTask4 = new net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]>((net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray2);
        net.goldolphin.cate.WhenAnyTask<java.lang.reflect.Type> typeWhenAnyTask5 = net.goldolphin.cate.Task.whenAny((net.goldolphin.cate.ITask<java.lang.reflect.Type, ?>[]) iTaskArray2);
        net.goldolphin.cate.CollectTask.Result result6 = new net.goldolphin.cate.CollectTask.Result((int) (short) 10, (java.lang.Object) iTaskArray2);
        net.goldolphin.cate.WhenAllTask<java.lang.CharSequence> charSequenceWhenAllTask7 = new net.goldolphin.cate.WhenAllTask<java.lang.CharSequence>((net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]) iTaskArray2);
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.CollectTask<java.lang.CharSequence, java.lang.Object[]>> charSequenceCollectTaskWhenAllTask8 = net.goldolphin.cate.Task.whenAll((net.goldolphin.cate.ITask<net.goldolphin.cate.CollectTask<java.lang.CharSequence, java.lang.Object[]>, ?>[]) iTaskArray2);
        org.junit.Assert.assertNotNull(iTaskArray2);
        org.junit.Assert.assertNotNull(iTaskArrayITaskArray3);
        org.junit.Assert.assertNotNull(typeWhenAnyTask5);
        org.junit.Assert.assertNotNull(charSequenceCollectTaskWhenAllTask8);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        net.goldolphin.cate.ITask[] iTaskArray1 = new net.goldolphin.cate.ITask[0];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[] iTaskArrayITaskArray2 = (net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray1;
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]> charSequenceITaskArrayWhenAllTask3 = new net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]>((net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray1);
        net.goldolphin.cate.WhenAnyTask<java.lang.reflect.Type> typeWhenAnyTask4 = net.goldolphin.cate.Task.whenAny((net.goldolphin.cate.ITask<java.lang.reflect.Type, ?>[]) iTaskArray1);
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ContextCollectTask<net.goldolphin.cate.SynchronizedScheduler, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>> synchronizedSchedulerContextCollectTaskWhenAllTask5 = new net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ContextCollectTask<net.goldolphin.cate.SynchronizedScheduler, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>>((net.goldolphin.cate.ITask<net.goldolphin.cate.ContextCollectTask<net.goldolphin.cate.SynchronizedScheduler, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, ?>[]) iTaskArray1);
        org.junit.Assert.assertNotNull(iTaskArray1);
        org.junit.Assert.assertNotNull(iTaskArrayITaskArray2);
        org.junit.Assert.assertNotNull(typeWhenAnyTask4);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        net.goldolphin.cate.ITask[] iTaskArray1 = new net.goldolphin.cate.ITask[0];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[] charSequenceITaskArray2 = (net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]) iTaskArray1;
        net.goldolphin.cate.WhenAllTask<java.lang.CharSequence> charSequenceWhenAllTask3 = net.goldolphin.cate.Task.whenAll(charSequenceITaskArray2);
        net.goldolphin.cate.WhenAllTask<java.lang.CharSequence> charSequenceWhenAllTask4 = new net.goldolphin.cate.WhenAllTask<java.lang.CharSequence>(charSequenceITaskArray2);
        net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[] charSequenceITaskArray5 = charSequenceWhenAllTask4.getTasks();
        net.goldolphin.cate.WhenAllTask<java.lang.CharSequence> charSequenceWhenAllTask6 = new net.goldolphin.cate.WhenAllTask<java.lang.CharSequence>(charSequenceITaskArray5);
        net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[] charSequenceITaskArray7 = charSequenceWhenAllTask6.getTasks();
        org.junit.Assert.assertNotNull(iTaskArray1);
        org.junit.Assert.assertNotNull(charSequenceITaskArray2);
        org.junit.Assert.assertNotNull(charSequenceWhenAllTask3);
        org.junit.Assert.assertNotNull(charSequenceITaskArray5);
        org.junit.Assert.assertNotNull(charSequenceITaskArray7);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter3);
        net.goldolphin.cate.IContinuation iContinuation5 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation6 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation5);
        net.goldolphin.cate.IContinuation iContinuation7 = unitWaiter3.buildContinuation(iContinuation5);
        net.goldolphin.cate.Action0 action0_8 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = net.goldolphin.cate.Task.create(action0_8);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter10 = unitTask9.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter11 = unitWaiter10.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter12 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter11);
        net.goldolphin.cate.IContinuation iContinuation13 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation14 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation13);
        net.goldolphin.cate.IContinuation iContinuation15 = unitWaiter11.buildContinuation(iContinuation13);
        net.goldolphin.cate.IContinuation[] iContinuationArray16 = new net.goldolphin.cate.IContinuation[] { iContinuation5, iContinuation15 };
        net.goldolphin.cate.ContextCollectTask.DispatcherContinuation dispatcherContinuation17 = new net.goldolphin.cate.ContextCollectTask.DispatcherContinuation(iContinuationArray16);
        net.goldolphin.cate.Action0 action0_19 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask20 = net.goldolphin.cate.Task.create(action0_19);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter21 = unitTask20.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter22 = unitWaiter21.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter23 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter22);
        net.goldolphin.cate.IContinuation iContinuation24 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation25 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation24);
        net.goldolphin.cate.IContinuation iContinuation26 = unitWaiter22.buildContinuation(iContinuation24);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation27 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (byte) 100, iContinuation24);
        net.goldolphin.cate.FlattenTask.Continuation continuation28 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation24);
        net.goldolphin.cate.Environment environment29 = null;
        net.goldolphin.cate.Func0<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0_30 = null;
        net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0Task31 = new net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>(unitWaiterFunc0_30);
        net.goldolphin.cate.Action0 action0_33 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask34 = net.goldolphin.cate.Task.create(action0_33);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter35 = unitTask34.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter36 = unitWaiter35.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter37 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter36);
        net.goldolphin.cate.IContinuation iContinuation38 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation39 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation38);
        net.goldolphin.cate.IContinuation iContinuation40 = unitWaiter36.buildContinuation(iContinuation38);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation41 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (byte) 100, iContinuation38);
        net.goldolphin.cate.IContinuation iContinuation42 = unitWaiterFunc0Task31.buildContinuation(iContinuation38);
        net.goldolphin.cate.IContinuation iContinuation44 = net.goldolphin.cate.IContinuation.END_CONTINUATION;
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation45 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (short) -1, iContinuation44);
        net.goldolphin.cate.IContinuation iContinuation46 = unitWaiterFunc0Task31.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation45);
        net.goldolphin.cate.Action0 action0_47 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask48 = net.goldolphin.cate.Task.create(action0_47);
        net.goldolphin.cate.Action0 action0_49 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask50 = net.goldolphin.cate.Task.create(action0_49);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter51 = unitTask50.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask52 = unitTask48.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter51);
        net.goldolphin.cate.Environment environment53 = null;
        net.goldolphin.cate.Action0 action0_54 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask55 = net.goldolphin.cate.Task.create(action0_54);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter56 = unitTask55.continueWithWaiter();
        net.goldolphin.cate.util.ExecutorTimer executorTimer57 = new net.goldolphin.cate.util.ExecutorTimer();
        net.goldolphin.cate.Action0 action0_58 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask59 = net.goldolphin.cate.Task.create(action0_58);
        net.goldolphin.cate.Action0 action0_60 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask61 = net.goldolphin.cate.Task.create(action0_60);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter62 = unitTask61.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask63 = unitTask59.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter62);
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_64 = null;
        java.util.concurrent.TimeUnit timeUnit66 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Maybe<net.goldolphin.cate.Unit>> unitTask67 = executorTimer57.withTimeout((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitTask59, unitAction1_64, (long) (byte) -1, timeUnit66);
        net.goldolphin.cate.SynchronizedScheduler synchronizedScheduler68 = new net.goldolphin.cate.SynchronizedScheduler();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask69 = unitTask59.withScheduler((net.goldolphin.cate.IScheduler) synchronizedScheduler68);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask70 = unitTask55.withScheduler((net.goldolphin.cate.IScheduler) synchronizedScheduler68);
        indexContinuation45.apply((java.lang.Object) unitTask52, environment53, (net.goldolphin.cate.IScheduler) synchronizedScheduler68);
        // The following exception was thrown during execution in test generation
        try {
            dispatcherContinuation17.apply((java.lang.Object) iContinuation24, environment29, (net.goldolphin.cate.IScheduler) synchronizedScheduler68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(iContinuation7);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitWaiter10);
        org.junit.Assert.assertNotNull(unitWaiter11);
        org.junit.Assert.assertNotNull(iContinuation15);
        org.junit.Assert.assertNotNull(iContinuationArray16);
        org.junit.Assert.assertNotNull(unitTask20);
        org.junit.Assert.assertNotNull(unitWaiter21);
        org.junit.Assert.assertNotNull(unitWaiter22);
        org.junit.Assert.assertNotNull(iContinuation26);
        org.junit.Assert.assertNotNull(unitTask34);
        org.junit.Assert.assertNotNull(unitWaiter35);
        org.junit.Assert.assertNotNull(unitWaiter36);
        org.junit.Assert.assertNotNull(iContinuation40);
        org.junit.Assert.assertNotNull(iContinuation42);
        org.junit.Assert.assertNotNull(iContinuation44);
        org.junit.Assert.assertNotNull(iContinuation46);
        org.junit.Assert.assertNotNull(unitTask48);
        org.junit.Assert.assertNotNull(unitTask50);
        org.junit.Assert.assertNotNull(unitWaiter51);
        org.junit.Assert.assertNotNull(unitTask52);
        org.junit.Assert.assertNotNull(unitTask55);
        org.junit.Assert.assertNotNull(unitWaiter56);
        org.junit.Assert.assertNotNull(unitTask59);
        org.junit.Assert.assertNotNull(unitTask61);
        org.junit.Assert.assertNotNull(unitWaiter62);
        org.junit.Assert.assertNotNull(unitTask63);
        org.junit.Assert.assertNotNull(unitTask67);
        org.junit.Assert.assertNotNull(unitTask69);
        org.junit.Assert.assertNotNull(unitTask70);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        net.goldolphin.cate.ITask[] iTaskArray1 = new net.goldolphin.cate.ITask[0];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[] iTaskArrayITaskArray2 = (net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray1;
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]> charSequenceITaskArrayWhenAllTask3 = new net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]>((net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray1);
        net.goldolphin.cate.WhenAnyTask<java.lang.reflect.Type> typeWhenAnyTask4 = net.goldolphin.cate.Task.whenAny((net.goldolphin.cate.ITask<java.lang.reflect.Type, ?>[]) iTaskArray1);
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.CollectTask<java.lang.CharSequence, java.lang.Object[]>> charSequenceCollectTaskWhenAllTask5 = net.goldolphin.cate.Task.whenAll((net.goldolphin.cate.ITask<net.goldolphin.cate.CollectTask<java.lang.CharSequence, java.lang.Object[]>, ?>[]) iTaskArray1);
        net.goldolphin.cate.WhenAllTask<java.lang.reflect.GenericDeclaration> genericDeclarationWhenAllTask6 = net.goldolphin.cate.Task.whenAll((net.goldolphin.cate.ITask<java.lang.reflect.GenericDeclaration, ?>[]) iTaskArray1);
        org.junit.Assert.assertNotNull(iTaskArray1);
        org.junit.Assert.assertNotNull(iTaskArrayITaskArray2);
        org.junit.Assert.assertNotNull(typeWhenAnyTask4);
        org.junit.Assert.assertNotNull(charSequenceCollectTaskWhenAllTask5);
        org.junit.Assert.assertNotNull(genericDeclarationWhenAllTask6);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Action0 action0_2 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask3 = net.goldolphin.cate.Task.create(action0_2);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = unitTask3.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask5 = unitTask1.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter4);
        net.goldolphin.cate.Unit unit6 = null;
        unitWaiter4.setResult(unit6);
        net.goldolphin.cate.Action0 action0_8 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = net.goldolphin.cate.Task.create(action0_8);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter10 = unitTask9.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter11 = unitWaiter10.continueWithWaiter();
        java.util.concurrent.Executor executor12 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler13 = new net.goldolphin.cate.ExecutorScheduler(executor12);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask14 = unitWaiter10.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler13);
        net.goldolphin.cate.Unit unit15 = net.goldolphin.cate.Unit.VALUE;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask16 = unitWaiter10.withInitState(unit15);
        // The following exception was thrown during execution in test generation
        try {
            unitWaiter4.setResult(unit15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The task is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitTask3);
        org.junit.Assert.assertNotNull(unitWaiter4);
        org.junit.Assert.assertNotNull(unitTask5);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitWaiter10);
        org.junit.Assert.assertNotNull(unitWaiter11);
        org.junit.Assert.assertNotNull(unitTask14);
        org.junit.Assert.assertNotNull(unit15);
        org.junit.Assert.assertNotNull(unitTask16);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter3);
        net.goldolphin.cate.IContinuation iContinuation5 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation6 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation5);
        net.goldolphin.cate.IContinuation iContinuation7 = unitWaiter3.buildContinuation(iContinuation5);
        net.goldolphin.cate.Action0 action0_8 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = net.goldolphin.cate.Task.create(action0_8);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter10 = unitTask9.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter11 = unitWaiter10.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter12 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter11);
        net.goldolphin.cate.IContinuation iContinuation13 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation14 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation13);
        net.goldolphin.cate.IContinuation iContinuation15 = unitWaiter11.buildContinuation(iContinuation13);
        net.goldolphin.cate.IContinuation[] iContinuationArray16 = new net.goldolphin.cate.IContinuation[] { iContinuation5, iContinuation15 };
        net.goldolphin.cate.ContextCollectTask.DispatcherContinuation dispatcherContinuation17 = new net.goldolphin.cate.ContextCollectTask.DispatcherContinuation(iContinuationArray16);
        net.goldolphin.cate.ContextCollectTask.DispatcherContinuation dispatcherContinuation18 = new net.goldolphin.cate.ContextCollectTask.DispatcherContinuation(iContinuationArray16);
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(iContinuation7);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitWaiter10);
        org.junit.Assert.assertNotNull(unitWaiter11);
        org.junit.Assert.assertNotNull(iContinuation15);
        org.junit.Assert.assertNotNull(iContinuationArray16);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        net.goldolphin.cate.ContextAction<net.goldolphin.cate.CollectTask.Result, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> resultContextAction0 = null;
        net.goldolphin.cate.ITask[] iTaskArray2 = new net.goldolphin.cate.ITask[0];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[] iTaskArrayITaskArray3 = (net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray2;
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]> charSequenceITaskArrayWhenAllTask4 = new net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]>((net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray2);
        net.goldolphin.cate.WhenAnyTask<java.lang.reflect.Type> typeWhenAnyTask5 = net.goldolphin.cate.Task.whenAny((net.goldolphin.cate.ITask<java.lang.reflect.Type, ?>[]) iTaskArray2);
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.IScheduler[]> iSchedulerArrayWhenAllTask6 = net.goldolphin.cate.Task.whenAll((net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler[], ?>[]) iTaskArray2);
        net.goldolphin.cate.ContextCollectTask<net.goldolphin.cate.SynchronizedScheduler, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> synchronizedSchedulerContextCollectTask7 = new net.goldolphin.cate.ContextCollectTask<net.goldolphin.cate.SynchronizedScheduler, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(resultContextAction0, (net.goldolphin.cate.ITask<net.goldolphin.cate.SynchronizedScheduler, ?>[]) iTaskArray2);
        net.goldolphin.cate.IContinuation iContinuation9 = net.goldolphin.cate.IContinuation.END_CONTINUATION;
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation10 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (short) -1, iContinuation9);
        net.goldolphin.cate.IContinuation iContinuation11 = synchronizedSchedulerContextCollectTask7.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation10);
        net.goldolphin.cate.Func0<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0_12 = null;
        net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0Task13 = new net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>(unitWaiterFunc0_12);
        net.goldolphin.cate.Action0 action0_15 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask16 = net.goldolphin.cate.Task.create(action0_15);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter17 = unitTask16.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter18 = unitWaiter17.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter19 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter18);
        net.goldolphin.cate.IContinuation iContinuation20 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation21 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation20);
        net.goldolphin.cate.IContinuation iContinuation22 = unitWaiter18.buildContinuation(iContinuation20);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation23 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (byte) 100, iContinuation20);
        net.goldolphin.cate.IContinuation iContinuation24 = unitWaiterFunc0Task13.buildContinuation(iContinuation20);
        net.goldolphin.cate.IContinuation iContinuation26 = net.goldolphin.cate.IContinuation.END_CONTINUATION;
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation27 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (short) -1, iContinuation26);
        net.goldolphin.cate.IContinuation iContinuation28 = unitWaiterFunc0Task13.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation27);
        net.goldolphin.cate.IContinuation iContinuation29 = synchronizedSchedulerContextCollectTask7.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation27);
        net.goldolphin.cate.FlattenTask.Continuation continuation30 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation29);
        net.goldolphin.cate.Environment environment32 = null;
        net.goldolphin.cate.Action0 action0_33 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask34 = net.goldolphin.cate.Task.create(action0_33);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter35 = unitTask34.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_36 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask37 = unitTask34.continueWith(unitAction1_36);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitTask38 = unitTask34.flatten();
        java.util.concurrent.Executor executor39 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler40 = new net.goldolphin.cate.ExecutorScheduler(executor39);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask41 = unitTask34.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler40);
        // The following exception was thrown during execution in test generation
        try {
            continuation30.apply((java.lang.Object) (byte) 0, environment32, (net.goldolphin.cate.IScheduler) executorScheduler40);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to net.goldolphin.cate.ITask");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTaskArray2);
        org.junit.Assert.assertNotNull(iTaskArrayITaskArray3);
        org.junit.Assert.assertNotNull(typeWhenAnyTask5);
        org.junit.Assert.assertNotNull(iSchedulerArrayWhenAllTask6);
        org.junit.Assert.assertNotNull(iContinuation9);
        org.junit.Assert.assertNotNull(iContinuation11);
        org.junit.Assert.assertNotNull(unitTask16);
        org.junit.Assert.assertNotNull(unitWaiter17);
        org.junit.Assert.assertNotNull(unitWaiter18);
        org.junit.Assert.assertNotNull(iContinuation22);
        org.junit.Assert.assertNotNull(iContinuation24);
        org.junit.Assert.assertNotNull(iContinuation26);
        org.junit.Assert.assertNotNull(iContinuation28);
        org.junit.Assert.assertNotNull(iContinuation29);
        org.junit.Assert.assertNotNull(unitTask34);
        org.junit.Assert.assertNotNull(unitWaiter35);
        org.junit.Assert.assertNotNull(unitTask37);
        org.junit.Assert.assertNotNull(unitTask38);
        org.junit.Assert.assertNotNull(unitTask41);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        net.goldolphin.cate.util.ExecutorTimer executorTimer0 = new net.goldolphin.cate.util.ExecutorTimer();
        net.goldolphin.cate.Action0 action0_1 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask2 = net.goldolphin.cate.Task.create(action0_1);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitTask2.continueWithWaiter();
        net.goldolphin.cate.util.ExecutorTimer executorTimer4 = new net.goldolphin.cate.util.ExecutorTimer();
        net.goldolphin.cate.Action0 action0_5 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = net.goldolphin.cate.Task.create(action0_5);
        net.goldolphin.cate.Action0 action0_7 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask8 = net.goldolphin.cate.Task.create(action0_7);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter9 = unitTask8.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask10 = unitTask6.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter9);
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_11 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Maybe<net.goldolphin.cate.Unit>> unitTask14 = executorTimer4.withTimeout((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitTask6, unitAction1_11, (long) (byte) -1, timeUnit13);
        net.goldolphin.cate.SynchronizedScheduler synchronizedScheduler15 = new net.goldolphin.cate.SynchronizedScheduler();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask16 = unitTask6.withScheduler((net.goldolphin.cate.IScheduler) synchronizedScheduler15);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask17 = unitTask2.withScheduler((net.goldolphin.cate.IScheduler) synchronizedScheduler15);
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_18 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask19 = unitTask2.continueWith(unitAction1_18);
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_20 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Maybe<net.goldolphin.cate.Unit>> unitTask23 = executorTimer0.withTimeout((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitTask2, unitAction1_20, (long) (byte) 1, timeUnit22);
        org.junit.Assert.assertNotNull(unitTask2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unitTask8);
        org.junit.Assert.assertNotNull(unitWaiter9);
        org.junit.Assert.assertNotNull(unitTask10);
        org.junit.Assert.assertNotNull(unitTask14);
        org.junit.Assert.assertNotNull(unitTask16);
        org.junit.Assert.assertNotNull(unitTask17);
        org.junit.Assert.assertNotNull(unitTask19);
        org.junit.Assert.assertNotNull(unitTask23);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>> iSchedulerTaskWithSchedulerHashedPartitioner0 = net.goldolphin.cate.partitioned.HashedPartitioner.instance();
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask1 = null;
        net.goldolphin.cate.Action0 action0_2 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask3 = net.goldolphin.cate.Task.create(action0_2);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = unitTask3.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter5 = unitWaiter4.continueWithWaiter();
        java.util.concurrent.Executor executor6 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler7 = new net.goldolphin.cate.ExecutorScheduler(executor6);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask8 = unitWaiter4.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler7);
        java.util.concurrent.Executor executor9 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler10 = new net.goldolphin.cate.ExecutorScheduler(executor9);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask11 = unitWaiter4.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler10);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler12 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask1, (net.goldolphin.cate.IScheduler) executorScheduler10);
        int int14 = iSchedulerTaskWithSchedulerHashedPartitioner0.partition(iSchedulerTaskWithScheduler12, (int) (byte) 10);
        net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>> iSchedulerTaskWithSchedulerHashedPartitioner16 = net.goldolphin.cate.partitioned.HashedPartitioner.instance();
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore17 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>(1, (net.goldolphin.cate.partitioned.IPartitioner) iSchedulerTaskWithSchedulerHashedPartitioner16);
        net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>> iSchedulerTaskWithSchedulerHashedPartitioner18 = net.goldolphin.cate.partitioned.HashedPartitioner.instance();
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask19 = null;
        net.goldolphin.cate.Action0 action0_20 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask21 = net.goldolphin.cate.Task.create(action0_20);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter22 = unitTask21.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter23 = unitWaiter22.continueWithWaiter();
        java.util.concurrent.Executor executor24 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler25 = new net.goldolphin.cate.ExecutorScheduler(executor24);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask26 = unitWaiter22.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler25);
        java.util.concurrent.Executor executor27 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler28 = new net.goldolphin.cate.ExecutorScheduler(executor27);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask29 = unitWaiter22.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler28);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler30 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask19, (net.goldolphin.cate.IScheduler) executorScheduler28);
        int int32 = iSchedulerTaskWithSchedulerHashedPartitioner18.partition(iSchedulerTaskWithScheduler30, (int) (byte) 10);
        int int34 = iSchedulerTaskWithSchedulerHashedPartitioner16.partition(iSchedulerTaskWithScheduler30, (int) '4');
        int int36 = iSchedulerTaskWithSchedulerHashedPartitioner0.partition(iSchedulerTaskWithScheduler30, (int) (short) -1);
        org.junit.Assert.assertNotNull(iSchedulerTaskWithSchedulerHashedPartitioner0);
        org.junit.Assert.assertNotNull(unitTask3);
        org.junit.Assert.assertNotNull(unitWaiter4);
        org.junit.Assert.assertNotNull(unitWaiter5);
        org.junit.Assert.assertNotNull(unitTask8);
        org.junit.Assert.assertNotNull(unitTask11);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(iSchedulerTaskWithSchedulerHashedPartitioner16);
        org.junit.Assert.assertNotNull(iSchedulerTaskWithSchedulerHashedPartitioner18);
        org.junit.Assert.assertNotNull(unitTask21);
        org.junit.Assert.assertNotNull(unitWaiter22);
        org.junit.Assert.assertNotNull(unitWaiter23);
        org.junit.Assert.assertNotNull(unitTask26);
        org.junit.Assert.assertNotNull(unitTask29);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 36 + "'", int34 == 36);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        net.goldolphin.cate.ITask<java.lang.Comparable<java.lang.String>, net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> strComparableITask0 = null;
        net.goldolphin.cate.FlattenTask<java.lang.Comparable<java.lang.String>, net.goldolphin.cate.Unit, net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> strComparableFlattenTask1 = new net.goldolphin.cate.FlattenTask<java.lang.Comparable<java.lang.String>, net.goldolphin.cate.Unit, net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>(strComparableITask0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        net.goldolphin.cate.Func0<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0_1 = null;
        net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0Task2 = new net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>(unitWaiterFunc0_1);
        net.goldolphin.cate.Action0 action0_4 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask5 = net.goldolphin.cate.Task.create(action0_4);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter6 = unitTask5.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter7 = unitWaiter6.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter8 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter7);
        net.goldolphin.cate.IContinuation iContinuation9 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation10 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation9);
        net.goldolphin.cate.IContinuation iContinuation11 = unitWaiter7.buildContinuation(iContinuation9);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation12 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (byte) 100, iContinuation9);
        net.goldolphin.cate.IContinuation iContinuation13 = unitWaiterFunc0Task2.buildContinuation(iContinuation9);
        net.goldolphin.cate.ContextAction<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextAction15 = null;
        net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextTask16 = new net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceContextAction15);
        net.goldolphin.cate.Action0 action0_17 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask18 = net.goldolphin.cate.Task.create(action0_17);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter19 = unitTask18.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter20 = unitWaiter19.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter21 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter20);
        net.goldolphin.cate.IContinuation iContinuation22 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation23 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation22);
        net.goldolphin.cate.IContinuation iContinuation24 = unitWaiter20.buildContinuation(iContinuation22);
        net.goldolphin.cate.IContinuation iContinuation25 = charSequenceContextTask16.buildContinuation(iContinuation24);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation26 = new net.goldolphin.cate.CollectTask.IndexContinuation(10, iContinuation25);
        net.goldolphin.cate.IContinuation iContinuation27 = unitWaiterFunc0Task2.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation26);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation28 = new net.goldolphin.cate.CollectTask.IndexContinuation(0, iContinuation27);
        net.goldolphin.cate.Action0 action0_29 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask30 = net.goldolphin.cate.Task.create(action0_29);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter31 = unitTask30.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter32 = unitWaiter31.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_33 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask34 = unitWaiter31.continueWith(unitAction1_33);
        net.goldolphin.cate.Action0 action0_35 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask36 = net.goldolphin.cate.Task.create(action0_35);
        net.goldolphin.cate.Action0 action0_37 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask38 = net.goldolphin.cate.Task.create(action0_37);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter39 = unitTask38.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter40 = unitWaiter39.continueWithWaiter();
        java.util.concurrent.Executor executor41 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler42 = new net.goldolphin.cate.ExecutorScheduler(executor41);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask43 = unitWaiter39.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler42);
        net.goldolphin.cate.Unit unit44 = net.goldolphin.cate.Unit.VALUE;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask45 = unitWaiter39.withInitState(unit44);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask46 = unitTask36.withInitState(unit44);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask47 = unitTask34.withInitState(unit44);
        net.goldolphin.cate.Environment environment48 = null;
        net.goldolphin.cate.Action0 action0_49 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask50 = net.goldolphin.cate.Task.create(action0_49);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter51 = unitTask50.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_52 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask53 = unitTask50.continueWith(unitAction1_52);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitTask54 = unitTask50.flatten();
        java.util.concurrent.Executor executor55 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler56 = new net.goldolphin.cate.ExecutorScheduler(executor55);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask57 = unitTask50.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler56);
        // The following exception was thrown during execution in test generation
        try {
            iContinuation27.apply((java.lang.Object) unitTask47, environment48, (net.goldolphin.cate.IScheduler) executorScheduler56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask5);
        org.junit.Assert.assertNotNull(unitWaiter6);
        org.junit.Assert.assertNotNull(unitWaiter7);
        org.junit.Assert.assertNotNull(iContinuation11);
        org.junit.Assert.assertNotNull(iContinuation13);
        org.junit.Assert.assertNotNull(unitTask18);
        org.junit.Assert.assertNotNull(unitWaiter19);
        org.junit.Assert.assertNotNull(unitWaiter20);
        org.junit.Assert.assertNotNull(iContinuation24);
        org.junit.Assert.assertNotNull(iContinuation25);
        org.junit.Assert.assertNotNull(iContinuation27);
        org.junit.Assert.assertNotNull(unitTask30);
        org.junit.Assert.assertNotNull(unitWaiter31);
        org.junit.Assert.assertNotNull(unitWaiter32);
        org.junit.Assert.assertNotNull(unitTask34);
        org.junit.Assert.assertNotNull(unitTask36);
        org.junit.Assert.assertNotNull(unitTask38);
        org.junit.Assert.assertNotNull(unitWaiter39);
        org.junit.Assert.assertNotNull(unitWaiter40);
        org.junit.Assert.assertNotNull(unitTask43);
        org.junit.Assert.assertNotNull(unit44);
        org.junit.Assert.assertNotNull(unitTask45);
        org.junit.Assert.assertNotNull(unitTask46);
        org.junit.Assert.assertNotNull(unitTask47);
        org.junit.Assert.assertNotNull(unitTask50);
        org.junit.Assert.assertNotNull(unitWaiter51);
        org.junit.Assert.assertNotNull(unitTask53);
        org.junit.Assert.assertNotNull(unitTask54);
        org.junit.Assert.assertNotNull(unitTask57);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        net.goldolphin.cate.Action0 action0_1 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask2 = net.goldolphin.cate.Task.create(action0_1);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitTask2.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_4 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask5 = unitTask2.continueWith(unitAction1_4);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitTask6 = unitTask2.flatten();
        net.goldolphin.cate.CollectTask.Result result7 = new net.goldolphin.cate.CollectTask.Result((int) (short) 0, (java.lang.Object) unitTask2);
        net.goldolphin.cate.Action0 action0_8 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = net.goldolphin.cate.Task.create(action0_8);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter10 = unitTask9.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask11 = unitTask2.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitTask9);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter12 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitTask11);
        org.junit.Assert.assertNotNull(unitTask2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask5);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitWaiter10);
        org.junit.Assert.assertNotNull(unitTask11);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        java.util.concurrent.Executor executor4 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler5 = new net.goldolphin.cate.ExecutorScheduler(executor4);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler5);
        java.util.concurrent.Executor executor7 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler8 = new net.goldolphin.cate.ExecutorScheduler(executor7);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler8);
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask12 = null;
        net.goldolphin.cate.Action0 action0_13 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask14 = net.goldolphin.cate.Task.create(action0_13);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter15 = unitTask14.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter16 = unitWaiter15.continueWithWaiter();
        java.util.concurrent.Executor executor17 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler18 = new net.goldolphin.cate.ExecutorScheduler(executor17);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask19 = unitWaiter15.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler18);
        java.util.concurrent.Executor executor20 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler21 = new net.goldolphin.cate.ExecutorScheduler(executor20);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask22 = unitWaiter15.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler21);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler23 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask12, (net.goldolphin.cate.IScheduler) executorScheduler21);
        java.util.concurrent.Executor executor24 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler25 = new net.goldolphin.cate.ExecutorScheduler(executor24);
        net.goldolphin.cate.IScheduler[] iSchedulerArray26 = new net.goldolphin.cate.IScheduler[] { executorScheduler8, executorScheduler11, executorScheduler21, executorScheduler25 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner27 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool28 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray26, unitWaiterFunc0TaskIPartitioner27);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore29 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool28);
        int int30 = unitWaiterFunc0TaskPartitionedSchedulerPool28.getPartitionNum();
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore31 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool28);
        net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>> iSchedulerTaskWithSchedulerHashedPartitioner33 = net.goldolphin.cate.partitioned.HashedPartitioner.instance();
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask34 = null;
        net.goldolphin.cate.Action0 action0_35 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask36 = net.goldolphin.cate.Task.create(action0_35);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter37 = unitTask36.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter38 = unitWaiter37.continueWithWaiter();
        java.util.concurrent.Executor executor39 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler40 = new net.goldolphin.cate.ExecutorScheduler(executor39);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask41 = unitWaiter37.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler40);
        java.util.concurrent.Executor executor42 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler43 = new net.goldolphin.cate.ExecutorScheduler(executor42);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask44 = unitWaiter37.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler43);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler45 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask34, (net.goldolphin.cate.IScheduler) executorScheduler43);
        int int47 = iSchedulerTaskWithSchedulerHashedPartitioner33.partition(iSchedulerTaskWithScheduler45, (int) (byte) 10);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore48 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((int) (byte) 1, (net.goldolphin.cate.partitioned.IPartitioner) iSchedulerTaskWithSchedulerHashedPartitioner33);
        net.goldolphin.cate.Action0 action0_49 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask50 = net.goldolphin.cate.Task.create(action0_49);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter51 = unitTask50.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter52 = unitWaiter51.continueWithWaiter();
        java.util.concurrent.Executor executor53 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler54 = new net.goldolphin.cate.ExecutorScheduler(executor53);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask55 = unitWaiter51.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler54);
        java.util.concurrent.Executor executor56 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler57 = new net.goldolphin.cate.ExecutorScheduler(executor56);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask58 = unitWaiter51.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler57);
        java.util.concurrent.Executor executor59 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler60 = new net.goldolphin.cate.ExecutorScheduler(executor59);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask61 = null;
        net.goldolphin.cate.Action0 action0_62 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask63 = net.goldolphin.cate.Task.create(action0_62);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter64 = unitTask63.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter65 = unitWaiter64.continueWithWaiter();
        java.util.concurrent.Executor executor66 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler67 = new net.goldolphin.cate.ExecutorScheduler(executor66);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask68 = unitWaiter64.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler67);
        java.util.concurrent.Executor executor69 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler70 = new net.goldolphin.cate.ExecutorScheduler(executor69);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask71 = unitWaiter64.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler70);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler72 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask61, (net.goldolphin.cate.IScheduler) executorScheduler70);
        java.util.concurrent.Executor executor73 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler74 = new net.goldolphin.cate.ExecutorScheduler(executor73);
        net.goldolphin.cate.IScheduler[] iSchedulerArray75 = new net.goldolphin.cate.IScheduler[] { executorScheduler57, executorScheduler60, executorScheduler70, executorScheduler74 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner76 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool77 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray75, unitWaiterFunc0TaskIPartitioner76);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore78 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool77);
        int int79 = unitWaiterFunc0TaskPartitionedSchedulerPool77.getPartitionNum();
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore80 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool77);
        net.goldolphin.cate.partitioned.IPartitioner iPartitioner81 = unitWaiterFunc0TaskPartitionedSchedulerPool77.getPartitioner();
        net.goldolphin.cate.IScheduler iScheduler82 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore48.get(unitWaiterFunc0TaskPartitionedSchedulerPool77);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean83 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore31.contains(unitWaiterFunc0TaskPartitionedSchedulerPool77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitTask14);
        org.junit.Assert.assertNotNull(unitWaiter15);
        org.junit.Assert.assertNotNull(unitWaiter16);
        org.junit.Assert.assertNotNull(unitTask19);
        org.junit.Assert.assertNotNull(unitTask22);
        org.junit.Assert.assertNotNull(iSchedulerArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(iSchedulerTaskWithSchedulerHashedPartitioner33);
        org.junit.Assert.assertNotNull(unitTask36);
        org.junit.Assert.assertNotNull(unitWaiter37);
        org.junit.Assert.assertNotNull(unitWaiter38);
        org.junit.Assert.assertNotNull(unitTask41);
        org.junit.Assert.assertNotNull(unitTask44);
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 4 + "'", int47 == 4);
        org.junit.Assert.assertNotNull(unitTask50);
        org.junit.Assert.assertNotNull(unitWaiter51);
        org.junit.Assert.assertNotNull(unitWaiter52);
        org.junit.Assert.assertNotNull(unitTask55);
        org.junit.Assert.assertNotNull(unitTask58);
        org.junit.Assert.assertNotNull(unitTask63);
        org.junit.Assert.assertNotNull(unitWaiter64);
        org.junit.Assert.assertNotNull(unitWaiter65);
        org.junit.Assert.assertNotNull(unitTask68);
        org.junit.Assert.assertNotNull(unitTask71);
        org.junit.Assert.assertNotNull(iSchedulerArray75);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 4 + "'", int79 == 4);
        org.junit.Assert.assertNull(iPartitioner81);
        org.junit.Assert.assertNull(iScheduler82);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>> iSchedulerTaskWithSchedulerHashedPartitioner1 = net.goldolphin.cate.partitioned.HashedPartitioner.instance();
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask2 = null;
        net.goldolphin.cate.Action0 action0_3 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask4 = net.goldolphin.cate.Task.create(action0_3);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter5 = unitTask4.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter6 = unitWaiter5.continueWithWaiter();
        java.util.concurrent.Executor executor7 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler8 = new net.goldolphin.cate.ExecutorScheduler(executor7);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = unitWaiter5.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler8);
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask12 = unitWaiter5.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler11);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler13 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask2, (net.goldolphin.cate.IScheduler) executorScheduler11);
        int int15 = iSchedulerTaskWithSchedulerHashedPartitioner1.partition(iSchedulerTaskWithScheduler13, (int) (byte) 10);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore16 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((int) (byte) 1, (net.goldolphin.cate.partitioned.IPartitioner) iSchedulerTaskWithSchedulerHashedPartitioner1);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask17 = null;
        net.goldolphin.cate.Action0 action0_18 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask19 = net.goldolphin.cate.Task.create(action0_18);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter20 = unitTask19.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter21 = unitWaiter20.continueWithWaiter();
        java.util.concurrent.Executor executor22 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler23 = new net.goldolphin.cate.ExecutorScheduler(executor22);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask24 = unitWaiter20.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler23);
        java.util.concurrent.Executor executor25 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler26 = new net.goldolphin.cate.ExecutorScheduler(executor25);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask27 = unitWaiter20.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler26);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler28 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask17, (net.goldolphin.cate.IScheduler) executorScheduler26);
        int int30 = iSchedulerTaskWithSchedulerHashedPartitioner1.partition(iSchedulerTaskWithScheduler28, (int) (short) 100);
        net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>> iSchedulerTaskWithSchedulerHashedPartitioner32 = net.goldolphin.cate.partitioned.HashedPartitioner.instance();
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore33 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>(1, (net.goldolphin.cate.partitioned.IPartitioner) iSchedulerTaskWithSchedulerHashedPartitioner32);
        net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>> iSchedulerTaskWithSchedulerHashedPartitioner34 = net.goldolphin.cate.partitioned.HashedPartitioner.instance();
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask35 = null;
        net.goldolphin.cate.Action0 action0_36 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask37 = net.goldolphin.cate.Task.create(action0_36);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter38 = unitTask37.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter39 = unitWaiter38.continueWithWaiter();
        java.util.concurrent.Executor executor40 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler41 = new net.goldolphin.cate.ExecutorScheduler(executor40);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask42 = unitWaiter38.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler41);
        java.util.concurrent.Executor executor43 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler44 = new net.goldolphin.cate.ExecutorScheduler(executor43);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask45 = unitWaiter38.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler44);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler46 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask35, (net.goldolphin.cate.IScheduler) executorScheduler44);
        int int48 = iSchedulerTaskWithSchedulerHashedPartitioner34.partition(iSchedulerTaskWithScheduler46, (int) (byte) 10);
        int int50 = iSchedulerTaskWithSchedulerHashedPartitioner32.partition(iSchedulerTaskWithScheduler46, (int) '4');
        int int52 = iSchedulerTaskWithSchedulerHashedPartitioner1.partition(iSchedulerTaskWithScheduler46, (int) (byte) 1);
        org.junit.Assert.assertNotNull(iSchedulerTaskWithSchedulerHashedPartitioner1);
        org.junit.Assert.assertNotNull(unitTask4);
        org.junit.Assert.assertNotNull(unitWaiter5);
        org.junit.Assert.assertNotNull(unitWaiter6);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitTask12);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(unitTask19);
        org.junit.Assert.assertNotNull(unitWaiter20);
        org.junit.Assert.assertNotNull(unitWaiter21);
        org.junit.Assert.assertNotNull(unitTask24);
        org.junit.Assert.assertNotNull(unitTask27);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 56 + "'", int30 == 56);
        org.junit.Assert.assertNotNull(iSchedulerTaskWithSchedulerHashedPartitioner32);
        org.junit.Assert.assertNotNull(iSchedulerTaskWithSchedulerHashedPartitioner34);
        org.junit.Assert.assertNotNull(unitTask37);
        org.junit.Assert.assertNotNull(unitWaiter38);
        org.junit.Assert.assertNotNull(unitWaiter39);
        org.junit.Assert.assertNotNull(unitTask42);
        org.junit.Assert.assertNotNull(unitTask45);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 6 + "'", int48 == 6);
// flaky:         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 12 + "'", int50 == 12);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        net.goldolphin.cate.ITask<net.goldolphin.cate.SeqTask<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>, net.goldolphin.cate.FlattenTask.Continuation, net.goldolphin.cate.ExecutorScheduler>, java.lang.String> waiterFunc0TaskSeqTaskITask0 = null;
        net.goldolphin.cate.Waiter<net.goldolphin.cate.SeqTask<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>, net.goldolphin.cate.FlattenTask.Continuation, net.goldolphin.cate.ExecutorScheduler>, java.lang.String> waiterFunc0TaskSeqTaskWaiter1 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.SeqTask<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>, net.goldolphin.cate.FlattenTask.Continuation, net.goldolphin.cate.ExecutorScheduler>, java.lang.String>(waiterFunc0TaskSeqTaskITask0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        net.goldolphin.cate.IdenticalTask<java.lang.String> strIdenticalTask0 = net.goldolphin.cate.IdenticalTask.instance();
        net.goldolphin.cate.Func1<java.util.Map<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>[], net.goldolphin.cate.IStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>> partitionedSchedulerPoolMapArrayFunc1_1 = null;
        net.goldolphin.cate.Func1Task<java.util.Map<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>[], net.goldolphin.cate.IStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>> partitionedSchedulerPoolMapArrayFunc1Task2 = new net.goldolphin.cate.Func1Task<java.util.Map<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>[], net.goldolphin.cate.IStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>>(partitionedSchedulerPoolMapArrayFunc1_1);
        net.goldolphin.cate.ContextAction<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextAction4 = null;
        net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextTask5 = new net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceContextAction4);
        net.goldolphin.cate.Action0 action0_6 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask7 = net.goldolphin.cate.Task.create(action0_6);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter8 = unitTask7.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter9 = unitWaiter8.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter10 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter9);
        net.goldolphin.cate.IContinuation iContinuation11 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation12 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation11);
        net.goldolphin.cate.IContinuation iContinuation13 = unitWaiter9.buildContinuation(iContinuation11);
        net.goldolphin.cate.IContinuation iContinuation14 = charSequenceContextTask5.buildContinuation(iContinuation13);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation15 = new net.goldolphin.cate.CollectTask.IndexContinuation(10, iContinuation14);
        net.goldolphin.cate.IContinuation iContinuation16 = partitionedSchedulerPoolMapArrayFunc1Task2.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation15);
        net.goldolphin.cate.Func0<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0_17 = null;
        net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0Task18 = new net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>(unitWaiterFunc0_17);
        net.goldolphin.cate.Action0 action0_20 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask21 = net.goldolphin.cate.Task.create(action0_20);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter22 = unitTask21.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter23 = unitWaiter22.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter24 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter23);
        net.goldolphin.cate.IContinuation iContinuation25 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation26 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation25);
        net.goldolphin.cate.IContinuation iContinuation27 = unitWaiter23.buildContinuation(iContinuation25);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation28 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (byte) 100, iContinuation25);
        net.goldolphin.cate.IContinuation iContinuation29 = unitWaiterFunc0Task18.buildContinuation(iContinuation25);
        net.goldolphin.cate.ContextAction<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextAction31 = null;
        net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextTask32 = new net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceContextAction31);
        net.goldolphin.cate.Action0 action0_33 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask34 = net.goldolphin.cate.Task.create(action0_33);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter35 = unitTask34.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter36 = unitWaiter35.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter37 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter36);
        net.goldolphin.cate.IContinuation iContinuation38 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation39 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation38);
        net.goldolphin.cate.IContinuation iContinuation40 = unitWaiter36.buildContinuation(iContinuation38);
        net.goldolphin.cate.IContinuation iContinuation41 = charSequenceContextTask32.buildContinuation(iContinuation40);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation42 = new net.goldolphin.cate.CollectTask.IndexContinuation(10, iContinuation41);
        net.goldolphin.cate.IContinuation iContinuation43 = unitWaiterFunc0Task18.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation42);
        net.goldolphin.cate.IContinuation iContinuation44 = partitionedSchedulerPoolMapArrayFunc1Task2.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation42);
        net.goldolphin.cate.Func0<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0_45 = null;
        net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0Task46 = new net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>(unitWaiterFunc0_45);
        net.goldolphin.cate.Action0 action0_48 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask49 = net.goldolphin.cate.Task.create(action0_48);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter50 = unitTask49.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter51 = unitWaiter50.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter52 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter51);
        net.goldolphin.cate.IContinuation iContinuation53 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation54 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation53);
        net.goldolphin.cate.IContinuation iContinuation55 = unitWaiter51.buildContinuation(iContinuation53);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation56 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (byte) 100, iContinuation53);
        net.goldolphin.cate.IContinuation iContinuation57 = unitWaiterFunc0Task46.buildContinuation(iContinuation53);
        net.goldolphin.cate.IContinuation iContinuation59 = net.goldolphin.cate.IContinuation.END_CONTINUATION;
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation60 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (short) -1, iContinuation59);
        net.goldolphin.cate.IContinuation iContinuation61 = unitWaiterFunc0Task46.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation60);
        net.goldolphin.cate.IContinuation iContinuation62 = partitionedSchedulerPoolMapArrayFunc1Task2.buildContinuation(iContinuation61);
        net.goldolphin.cate.IContinuation iContinuation63 = strIdenticalTask0.buildContinuation(iContinuation62);
        net.goldolphin.cate.Maybe<net.goldolphin.cate.IdenticalTask<java.lang.String>> strIdenticalTaskMaybe64 = net.goldolphin.cate.Maybe.just(strIdenticalTask0);
        org.junit.Assert.assertNotNull(strIdenticalTask0);
        org.junit.Assert.assertNotNull(unitTask7);
        org.junit.Assert.assertNotNull(unitWaiter8);
        org.junit.Assert.assertNotNull(unitWaiter9);
        org.junit.Assert.assertNotNull(iContinuation13);
        org.junit.Assert.assertNotNull(iContinuation14);
        org.junit.Assert.assertNotNull(iContinuation16);
        org.junit.Assert.assertNotNull(unitTask21);
        org.junit.Assert.assertNotNull(unitWaiter22);
        org.junit.Assert.assertNotNull(unitWaiter23);
        org.junit.Assert.assertNotNull(iContinuation27);
        org.junit.Assert.assertNotNull(iContinuation29);
        org.junit.Assert.assertNotNull(unitTask34);
        org.junit.Assert.assertNotNull(unitWaiter35);
        org.junit.Assert.assertNotNull(unitWaiter36);
        org.junit.Assert.assertNotNull(iContinuation40);
        org.junit.Assert.assertNotNull(iContinuation41);
        org.junit.Assert.assertNotNull(iContinuation43);
        org.junit.Assert.assertNotNull(iContinuation44);
        org.junit.Assert.assertNotNull(unitTask49);
        org.junit.Assert.assertNotNull(unitWaiter50);
        org.junit.Assert.assertNotNull(unitWaiter51);
        org.junit.Assert.assertNotNull(iContinuation55);
        org.junit.Assert.assertNotNull(iContinuation57);
        org.junit.Assert.assertNotNull(iContinuation59);
        org.junit.Assert.assertNotNull(iContinuation61);
        org.junit.Assert.assertNotNull(iContinuation62);
        org.junit.Assert.assertNotNull(iContinuation63);
        org.junit.Assert.assertNotNull(strIdenticalTaskMaybe64);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        net.goldolphin.cate.ITask<java.lang.CharSequence, java.io.Serializable> charSequenceITask0 = null;
        java.lang.CharSequence charSequence1 = null;
        net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable> charSequenceTaskWithInitState2 = new net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>(charSequenceITask0, charSequence1);
        net.goldolphin.cate.Func0<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0_3 = null;
        net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0Task4 = new net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>(unitWaiterFunc0_3);
        net.goldolphin.cate.Action0 action0_6 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask7 = net.goldolphin.cate.Task.create(action0_6);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter8 = unitTask7.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter9 = unitWaiter8.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter10 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter9);
        net.goldolphin.cate.IContinuation iContinuation11 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation12 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation11);
        net.goldolphin.cate.IContinuation iContinuation13 = unitWaiter9.buildContinuation(iContinuation11);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation14 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (byte) 100, iContinuation11);
        net.goldolphin.cate.IContinuation iContinuation15 = unitWaiterFunc0Task4.buildContinuation(iContinuation11);
        net.goldolphin.cate.IContinuation iContinuation17 = net.goldolphin.cate.IContinuation.END_CONTINUATION;
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation18 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (short) -1, iContinuation17);
        net.goldolphin.cate.IContinuation iContinuation19 = unitWaiterFunc0Task4.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation18);
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.IContinuation iContinuation20 = charSequenceTaskWithInitState2.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask7);
        org.junit.Assert.assertNotNull(unitWaiter8);
        org.junit.Assert.assertNotNull(unitWaiter9);
        org.junit.Assert.assertNotNull(iContinuation13);
        org.junit.Assert.assertNotNull(iContinuation15);
        org.junit.Assert.assertNotNull(iContinuation17);
        org.junit.Assert.assertNotNull(iContinuation19);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        java.util.concurrent.Executor executor4 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler5 = new net.goldolphin.cate.ExecutorScheduler(executor4);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler5);
        java.util.concurrent.Executor executor7 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler8 = new net.goldolphin.cate.ExecutorScheduler(executor7);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler8);
        net.goldolphin.cate.ContextAction<net.goldolphin.cate.CollectTask.Result, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> resultContextAction10 = null;
        net.goldolphin.cate.ITask[] iTaskArray12 = new net.goldolphin.cate.ITask[0];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[] iTaskArrayITaskArray13 = (net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray12;
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]> charSequenceITaskArrayWhenAllTask14 = new net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]>((net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray12);
        net.goldolphin.cate.WhenAnyTask<java.lang.reflect.Type> typeWhenAnyTask15 = net.goldolphin.cate.Task.whenAny((net.goldolphin.cate.ITask<java.lang.reflect.Type, ?>[]) iTaskArray12);
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.IScheduler[]> iSchedulerArrayWhenAllTask16 = net.goldolphin.cate.Task.whenAll((net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler[], ?>[]) iTaskArray12);
        net.goldolphin.cate.ContextCollectTask<net.goldolphin.cate.SynchronizedScheduler, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> synchronizedSchedulerContextCollectTask17 = new net.goldolphin.cate.ContextCollectTask<net.goldolphin.cate.SynchronizedScheduler, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(resultContextAction10, (net.goldolphin.cate.ITask<net.goldolphin.cate.SynchronizedScheduler, ?>[]) iTaskArray12);
        net.goldolphin.cate.IContinuation iContinuation19 = net.goldolphin.cate.IContinuation.END_CONTINUATION;
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation20 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (short) -1, iContinuation19);
        net.goldolphin.cate.IContinuation iContinuation21 = synchronizedSchedulerContextCollectTask17.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation20);
        net.goldolphin.cate.Func0<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0_22 = null;
        net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0Task23 = new net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>(unitWaiterFunc0_22);
        net.goldolphin.cate.Action0 action0_25 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask26 = net.goldolphin.cate.Task.create(action0_25);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter27 = unitTask26.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter28 = unitWaiter27.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter29 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter28);
        net.goldolphin.cate.IContinuation iContinuation30 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation31 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation30);
        net.goldolphin.cate.IContinuation iContinuation32 = unitWaiter28.buildContinuation(iContinuation30);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation33 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (byte) 100, iContinuation30);
        net.goldolphin.cate.IContinuation iContinuation34 = unitWaiterFunc0Task23.buildContinuation(iContinuation30);
        net.goldolphin.cate.IContinuation iContinuation36 = net.goldolphin.cate.IContinuation.END_CONTINUATION;
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation37 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (short) -1, iContinuation36);
        net.goldolphin.cate.IContinuation iContinuation38 = unitWaiterFunc0Task23.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation37);
        net.goldolphin.cate.IContinuation iContinuation39 = synchronizedSchedulerContextCollectTask17.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation37);
        net.goldolphin.cate.FlattenTask.Continuation continuation40 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation39);
        net.goldolphin.cate.Unit unit41 = net.goldolphin.cate.Unit.VALUE;
        net.goldolphin.cate.Environment environment42 = null;
        // The following exception was thrown during execution in test generation
        try {
            executorScheduler8.schedule((net.goldolphin.cate.IContinuation) continuation40, (java.lang.Object) unit41, environment42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(iTaskArray12);
        org.junit.Assert.assertNotNull(iTaskArrayITaskArray13);
        org.junit.Assert.assertNotNull(typeWhenAnyTask15);
        org.junit.Assert.assertNotNull(iSchedulerArrayWhenAllTask16);
        org.junit.Assert.assertNotNull(iContinuation19);
        org.junit.Assert.assertNotNull(iContinuation21);
        org.junit.Assert.assertNotNull(unitTask26);
        org.junit.Assert.assertNotNull(unitWaiter27);
        org.junit.Assert.assertNotNull(unitWaiter28);
        org.junit.Assert.assertNotNull(iContinuation32);
        org.junit.Assert.assertNotNull(iContinuation34);
        org.junit.Assert.assertNotNull(iContinuation36);
        org.junit.Assert.assertNotNull(iContinuation38);
        org.junit.Assert.assertNotNull(iContinuation39);
        org.junit.Assert.assertNotNull(unit41);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        net.goldolphin.cate.ITask<net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>>, net.goldolphin.cate.IStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>> iSchedulerTaskWithSchedulerHashedPartitionerITask0 = null;
        net.goldolphin.cate.ITask<net.goldolphin.cate.IStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>, java.io.Serializable> func0TaskPartitionedSchedulerPoolIStoreITask1 = null;
        net.goldolphin.cate.SeqTask<net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>>, net.goldolphin.cate.IStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>, java.io.Serializable> iSchedulerTaskWithSchedulerHashedPartitionerSeqTask2 = new net.goldolphin.cate.SeqTask<net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>>, net.goldolphin.cate.IStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>, java.io.Serializable>(iSchedulerTaskWithSchedulerHashedPartitionerITask0, func0TaskPartitionedSchedulerPoolIStoreITask1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        java.util.concurrent.Executor executor4 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler5 = new net.goldolphin.cate.ExecutorScheduler(executor4);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler5);
        net.goldolphin.cate.Unit unit7 = net.goldolphin.cate.Unit.VALUE;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask8 = unitWaiter2.withInitState(unit7);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter9 = unitWaiter2.continueWithWaiter();
        net.goldolphin.cate.Action0 action0_10 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask11 = net.goldolphin.cate.Task.create(action0_10);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter12 = unitTask11.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter13 = unitWaiter12.continueWithWaiter();
        java.util.concurrent.Executor executor14 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler15 = new net.goldolphin.cate.ExecutorScheduler(executor14);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask16 = unitWaiter12.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler15);
        java.util.concurrent.Executor executor17 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler18 = new net.goldolphin.cate.ExecutorScheduler(executor17);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask19 = unitWaiter12.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler18);
        net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>> iSchedulerTaskWithSchedulerHashedPartitioner20 = net.goldolphin.cate.partitioned.HashedPartitioner.instance();
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask21 = null;
        net.goldolphin.cate.Action0 action0_22 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask23 = net.goldolphin.cate.Task.create(action0_22);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter24 = unitTask23.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter25 = unitWaiter24.continueWithWaiter();
        java.util.concurrent.Executor executor26 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler27 = new net.goldolphin.cate.ExecutorScheduler(executor26);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask28 = unitWaiter24.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler27);
        java.util.concurrent.Executor executor29 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler30 = new net.goldolphin.cate.ExecutorScheduler(executor29);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask31 = unitWaiter24.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler30);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler32 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask21, (net.goldolphin.cate.IScheduler) executorScheduler30);
        int int34 = iSchedulerTaskWithSchedulerHashedPartitioner20.partition(iSchedulerTaskWithScheduler32, (int) (byte) 10);
        net.goldolphin.cate.SynchronizedScheduler synchronizedScheduler35 = new net.goldolphin.cate.SynchronizedScheduler();
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler36 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>((net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>) iSchedulerTaskWithScheduler32, (net.goldolphin.cate.IScheduler) synchronizedScheduler35);
        // The following exception was thrown during execution in test generation
        try {
            unitWaiter9.execute((java.lang.Object) executorScheduler18, (net.goldolphin.cate.IScheduler) synchronizedScheduler35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unit7);
        org.junit.Assert.assertNotNull(unitTask8);
        org.junit.Assert.assertNotNull(unitWaiter9);
        org.junit.Assert.assertNotNull(unitTask11);
        org.junit.Assert.assertNotNull(unitWaiter12);
        org.junit.Assert.assertNotNull(unitWaiter13);
        org.junit.Assert.assertNotNull(unitTask16);
        org.junit.Assert.assertNotNull(unitTask19);
        org.junit.Assert.assertNotNull(iSchedulerTaskWithSchedulerHashedPartitioner20);
        org.junit.Assert.assertNotNull(unitTask23);
        org.junit.Assert.assertNotNull(unitWaiter24);
        org.junit.Assert.assertNotNull(unitWaiter25);
        org.junit.Assert.assertNotNull(unitTask28);
        org.junit.Assert.assertNotNull(unitTask31);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 9 + "'", int34 == 9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_3 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask4 = unitTask1.continueWith(unitAction1_3);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitTask5 = unitTask1.flatten();
        java.util.concurrent.Executor executor6 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler7 = new net.goldolphin.cate.ExecutorScheduler(executor6);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask8 = unitTask1.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler7);
        net.goldolphin.cate.ContextAction<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextAction9 = null;
        net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextTask10 = new net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceContextAction9);
        net.goldolphin.cate.Action0 action0_11 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask12 = net.goldolphin.cate.Task.create(action0_11);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter13 = unitTask12.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter14 = unitWaiter13.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter15 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter14);
        net.goldolphin.cate.IContinuation iContinuation16 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation17 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation16);
        net.goldolphin.cate.IContinuation iContinuation18 = unitWaiter14.buildContinuation(iContinuation16);
        net.goldolphin.cate.IContinuation iContinuation19 = charSequenceContextTask10.buildContinuation(iContinuation18);
        net.goldolphin.cate.Action0 action0_20 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask21 = net.goldolphin.cate.Task.create(action0_20);
        net.goldolphin.cate.ContextAction<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextAction23 = null;
        net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextTask24 = new net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceContextAction23);
        net.goldolphin.cate.Action0 action0_25 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask26 = net.goldolphin.cate.Task.create(action0_25);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter27 = unitTask26.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter28 = unitWaiter27.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter29 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter28);
        net.goldolphin.cate.IContinuation iContinuation30 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation31 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation30);
        net.goldolphin.cate.IContinuation iContinuation32 = unitWaiter28.buildContinuation(iContinuation30);
        net.goldolphin.cate.IContinuation iContinuation33 = charSequenceContextTask24.buildContinuation(iContinuation32);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation34 = new net.goldolphin.cate.CollectTask.IndexContinuation(10, iContinuation33);
        net.goldolphin.cate.IContinuation iContinuation35 = unitTask21.buildContinuation(iContinuation33);
        net.goldolphin.cate.IContinuation iContinuation36 = charSequenceContextTask10.buildContinuation(iContinuation33);
        net.goldolphin.cate.IdenticalTask<java.lang.String> strIdenticalTask37 = net.goldolphin.cate.IdenticalTask.instance();
        net.goldolphin.cate.ContextAction<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextAction39 = null;
        net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextTask40 = new net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceContextAction39);
        net.goldolphin.cate.Action0 action0_41 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask42 = net.goldolphin.cate.Task.create(action0_41);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter43 = unitTask42.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter44 = unitWaiter43.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter45 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter44);
        net.goldolphin.cate.IContinuation iContinuation46 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation47 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation46);
        net.goldolphin.cate.IContinuation iContinuation48 = unitWaiter44.buildContinuation(iContinuation46);
        net.goldolphin.cate.IContinuation iContinuation49 = charSequenceContextTask40.buildContinuation(iContinuation48);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation50 = new net.goldolphin.cate.CollectTask.IndexContinuation(10, iContinuation49);
        net.goldolphin.cate.IContinuation iContinuation51 = strIdenticalTask37.buildContinuation(iContinuation49);
        net.goldolphin.cate.IContinuation iContinuation52 = charSequenceContextTask10.buildContinuation(iContinuation51);
        net.goldolphin.cate.Action0 action0_53 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask54 = net.goldolphin.cate.Task.create(action0_53);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter55 = unitTask54.continueWithWaiter();
        net.goldolphin.cate.util.ExecutorTimer executorTimer56 = new net.goldolphin.cate.util.ExecutorTimer();
        net.goldolphin.cate.Action0 action0_57 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask58 = net.goldolphin.cate.Task.create(action0_57);
        net.goldolphin.cate.Action0 action0_59 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask60 = net.goldolphin.cate.Task.create(action0_59);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter61 = unitTask60.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask62 = unitTask58.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter61);
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_63 = null;
        java.util.concurrent.TimeUnit timeUnit65 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Maybe<net.goldolphin.cate.Unit>> unitTask66 = executorTimer56.withTimeout((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitTask58, unitAction1_63, (long) (byte) -1, timeUnit65);
        net.goldolphin.cate.SynchronizedScheduler synchronizedScheduler67 = new net.goldolphin.cate.SynchronizedScheduler();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask68 = unitTask58.withScheduler((net.goldolphin.cate.IScheduler) synchronizedScheduler67);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask69 = unitTask54.withScheduler((net.goldolphin.cate.IScheduler) synchronizedScheduler67);
        net.goldolphin.cate.Environment environment70 = null;
        // The following exception was thrown during execution in test generation
        try {
            executorScheduler7.schedule(iContinuation51, (java.lang.Object) unitTask54, environment70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitTask4);
        org.junit.Assert.assertNotNull(unitTask5);
        org.junit.Assert.assertNotNull(unitTask8);
        org.junit.Assert.assertNotNull(unitTask12);
        org.junit.Assert.assertNotNull(unitWaiter13);
        org.junit.Assert.assertNotNull(unitWaiter14);
        org.junit.Assert.assertNotNull(iContinuation18);
        org.junit.Assert.assertNotNull(iContinuation19);
        org.junit.Assert.assertNotNull(unitTask21);
        org.junit.Assert.assertNotNull(unitTask26);
        org.junit.Assert.assertNotNull(unitWaiter27);
        org.junit.Assert.assertNotNull(unitWaiter28);
        org.junit.Assert.assertNotNull(iContinuation32);
        org.junit.Assert.assertNotNull(iContinuation33);
        org.junit.Assert.assertNotNull(iContinuation35);
        org.junit.Assert.assertNotNull(iContinuation36);
        org.junit.Assert.assertNotNull(strIdenticalTask37);
        org.junit.Assert.assertNotNull(unitTask42);
        org.junit.Assert.assertNotNull(unitWaiter43);
        org.junit.Assert.assertNotNull(unitWaiter44);
        org.junit.Assert.assertNotNull(iContinuation48);
        org.junit.Assert.assertNotNull(iContinuation49);
        org.junit.Assert.assertNotNull(iContinuation51);
        org.junit.Assert.assertNotNull(iContinuation52);
        org.junit.Assert.assertNotNull(unitTask54);
        org.junit.Assert.assertNotNull(unitWaiter55);
        org.junit.Assert.assertNotNull(unitTask58);
        org.junit.Assert.assertNotNull(unitTask60);
        org.junit.Assert.assertNotNull(unitWaiter61);
        org.junit.Assert.assertNotNull(unitTask62);
        org.junit.Assert.assertNotNull(unitTask66);
        org.junit.Assert.assertNotNull(unitTask68);
        org.junit.Assert.assertNotNull(unitTask69);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        net.goldolphin.cate.SynchronizedScheduler synchronizedScheduler1 = new net.goldolphin.cate.SynchronizedScheduler();
        net.goldolphin.cate.CollectTask.Result result2 = new net.goldolphin.cate.CollectTask.Result(1, (java.lang.Object) synchronizedScheduler1);
        java.lang.Object obj3 = result2.value;
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter3);
        net.goldolphin.cate.IContinuation iContinuation5 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation6 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation5);
        net.goldolphin.cate.IContinuation iContinuation7 = unitWaiter3.buildContinuation(iContinuation5);
        net.goldolphin.cate.Action0 action0_8 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = net.goldolphin.cate.Task.create(action0_8);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter10 = unitTask9.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter11 = unitWaiter10.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter12 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter11);
        net.goldolphin.cate.IContinuation iContinuation13 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation14 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation13);
        net.goldolphin.cate.IContinuation iContinuation15 = unitWaiter11.buildContinuation(iContinuation13);
        net.goldolphin.cate.IContinuation[] iContinuationArray16 = new net.goldolphin.cate.IContinuation[] { iContinuation5, iContinuation15 };
        net.goldolphin.cate.ContextCollectTask.DispatcherContinuation dispatcherContinuation17 = new net.goldolphin.cate.ContextCollectTask.DispatcherContinuation(iContinuationArray16);
        net.goldolphin.cate.IContinuation[] iContinuationArray18 = new net.goldolphin.cate.IContinuation[] { dispatcherContinuation17 };
        net.goldolphin.cate.ContextCollectTask.DispatcherContinuation dispatcherContinuation19 = new net.goldolphin.cate.ContextCollectTask.DispatcherContinuation(iContinuationArray18);
        net.goldolphin.cate.Action0 action0_20 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask21 = net.goldolphin.cate.Task.create(action0_20);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter22 = unitTask21.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_23 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask24 = unitTask21.continueWith(unitAction1_23);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitTask25 = unitTask21.flatten();
        net.goldolphin.cate.Environment environment26 = null;
        net.goldolphin.cate.Action0 action0_27 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask28 = net.goldolphin.cate.Task.create(action0_27);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter29 = unitTask28.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_30 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask31 = unitTask28.continueWith(unitAction1_30);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitTask32 = unitTask28.flatten();
        net.goldolphin.cate.Action0 action0_33 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask34 = net.goldolphin.cate.Task.create(action0_33);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter35 = unitTask34.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter36 = unitWaiter35.continueWithWaiter();
        java.util.concurrent.Executor executor37 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler38 = new net.goldolphin.cate.ExecutorScheduler(executor37);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask39 = unitWaiter35.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler38);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask40 = unitTask28.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler38);
        // The following exception was thrown during execution in test generation
        try {
            dispatcherContinuation19.apply((java.lang.Object) unitTask21, environment26, (net.goldolphin.cate.IScheduler) executorScheduler38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(iContinuation7);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitWaiter10);
        org.junit.Assert.assertNotNull(unitWaiter11);
        org.junit.Assert.assertNotNull(iContinuation15);
        org.junit.Assert.assertNotNull(iContinuationArray16);
        org.junit.Assert.assertNotNull(iContinuationArray18);
        org.junit.Assert.assertNotNull(unitTask21);
        org.junit.Assert.assertNotNull(unitWaiter22);
        org.junit.Assert.assertNotNull(unitTask24);
        org.junit.Assert.assertNotNull(unitTask25);
        org.junit.Assert.assertNotNull(unitTask28);
        org.junit.Assert.assertNotNull(unitWaiter29);
        org.junit.Assert.assertNotNull(unitTask31);
        org.junit.Assert.assertNotNull(unitTask32);
        org.junit.Assert.assertNotNull(unitTask34);
        org.junit.Assert.assertNotNull(unitWaiter35);
        org.junit.Assert.assertNotNull(unitWaiter36);
        org.junit.Assert.assertNotNull(unitTask39);
        org.junit.Assert.assertNotNull(unitTask40);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        net.goldolphin.cate.CollectTask.Counter counter1 = new net.goldolphin.cate.CollectTask.Counter((int) (short) 10);
        java.lang.Object[] objArray2 = counter1.getResults();
        int int3 = counter1.getComplete();
        net.goldolphin.cate.ITask[] iTaskArray6 = new net.goldolphin.cate.ITask[0];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[] iTaskArrayITaskArray7 = (net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray6;
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]> charSequenceITaskArrayWhenAllTask8 = new net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]>((net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray6);
        net.goldolphin.cate.WhenAnyTask<java.lang.reflect.Type> typeWhenAnyTask9 = net.goldolphin.cate.Task.whenAny((net.goldolphin.cate.ITask<java.lang.reflect.Type, ?>[]) iTaskArray6);
        net.goldolphin.cate.CollectTask.Result result10 = new net.goldolphin.cate.CollectTask.Result((int) (short) 10, (java.lang.Object) iTaskArray6);
        int int11 = result10.index;
        java.lang.Object obj12 = result10.value;
        // The following exception was thrown during execution in test generation
        try {
            counter1.record(result10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iTaskArray6);
        org.junit.Assert.assertNotNull(iTaskArrayITaskArray7);
        org.junit.Assert.assertNotNull(typeWhenAnyTask9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        java.util.concurrent.Executor executor4 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler5 = new net.goldolphin.cate.ExecutorScheduler(executor4);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler5);
        net.goldolphin.cate.Unit unit7 = net.goldolphin.cate.Unit.VALUE;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask8 = unitWaiter2.withInitState(unit7);
        net.goldolphin.cate.Action0 action0_9 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask10 = net.goldolphin.cate.Task.create(action0_9);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter11 = unitTask10.continueWithWaiter();
        net.goldolphin.cate.util.ExecutorTimer executorTimer12 = new net.goldolphin.cate.util.ExecutorTimer();
        net.goldolphin.cate.Action0 action0_13 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask14 = net.goldolphin.cate.Task.create(action0_13);
        net.goldolphin.cate.Action0 action0_15 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask16 = net.goldolphin.cate.Task.create(action0_15);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter17 = unitTask16.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask18 = unitTask14.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter17);
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_19 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Maybe<net.goldolphin.cate.Unit>> unitTask22 = executorTimer12.withTimeout((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitTask14, unitAction1_19, (long) (byte) -1, timeUnit21);
        net.goldolphin.cate.SynchronizedScheduler synchronizedScheduler23 = new net.goldolphin.cate.SynchronizedScheduler();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask24 = unitTask14.withScheduler((net.goldolphin.cate.IScheduler) synchronizedScheduler23);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask25 = unitTask10.withScheduler((net.goldolphin.cate.IScheduler) synchronizedScheduler23);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask26 = unitWaiter2.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitTask25);
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unit7);
        org.junit.Assert.assertNotNull(unitTask8);
        org.junit.Assert.assertNotNull(unitTask10);
        org.junit.Assert.assertNotNull(unitWaiter11);
        org.junit.Assert.assertNotNull(unitTask14);
        org.junit.Assert.assertNotNull(unitTask16);
        org.junit.Assert.assertNotNull(unitWaiter17);
        org.junit.Assert.assertNotNull(unitTask18);
        org.junit.Assert.assertNotNull(unitTask22);
        org.junit.Assert.assertNotNull(unitTask24);
        org.junit.Assert.assertNotNull(unitTask25);
        org.junit.Assert.assertNotNull(unitTask26);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_4 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask5 = unitWaiter2.continueWith(unitAction1_4);
        net.goldolphin.cate.Action0 action0_6 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask7 = net.goldolphin.cate.Task.create(action0_6);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter8 = unitTask7.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_9 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask10 = unitTask7.continueWith(unitAction1_9);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitTask11 = unitTask7.flatten();
        net.goldolphin.cate.Action0 action0_12 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask13 = net.goldolphin.cate.Task.create(action0_12);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter14 = unitTask13.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter15 = unitWaiter14.continueWithWaiter();
        java.util.concurrent.Executor executor16 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler17 = new net.goldolphin.cate.ExecutorScheduler(executor16);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask18 = unitWaiter14.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler17);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask19 = unitTask7.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler17);
        net.goldolphin.cate.Action0 action0_20 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask21 = net.goldolphin.cate.Task.create(action0_20);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter22 = unitTask21.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter23 = unitWaiter22.continueWithWaiter();
        net.goldolphin.cate.Action0 action0_24 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask25 = net.goldolphin.cate.Task.create(action0_24);
        net.goldolphin.cate.Action0 action0_26 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask27 = net.goldolphin.cate.Task.create(action0_26);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter28 = unitTask27.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter29 = unitWaiter28.continueWithWaiter();
        java.util.concurrent.Executor executor30 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler31 = new net.goldolphin.cate.ExecutorScheduler(executor30);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask32 = unitWaiter28.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler31);
        net.goldolphin.cate.Unit unit33 = net.goldolphin.cate.Unit.VALUE;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask34 = unitWaiter28.withInitState(unit33);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask35 = unitTask25.withInitState(unit33);
        unitWaiter23.setResult(unit33);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask37 = unitTask7.withInitState(unit33);
        net.goldolphin.cate.SynchronizedScheduler synchronizedScheduler38 = new net.goldolphin.cate.SynchronizedScheduler();
        // The following exception was thrown during execution in test generation
        try {
            unitWaiter2.execute((java.lang.Object) unitTask7, (net.goldolphin.cate.IScheduler) synchronizedScheduler38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask5);
        org.junit.Assert.assertNotNull(unitTask7);
        org.junit.Assert.assertNotNull(unitWaiter8);
        org.junit.Assert.assertNotNull(unitTask10);
        org.junit.Assert.assertNotNull(unitTask11);
        org.junit.Assert.assertNotNull(unitTask13);
        org.junit.Assert.assertNotNull(unitWaiter14);
        org.junit.Assert.assertNotNull(unitWaiter15);
        org.junit.Assert.assertNotNull(unitTask18);
        org.junit.Assert.assertNotNull(unitTask19);
        org.junit.Assert.assertNotNull(unitTask21);
        org.junit.Assert.assertNotNull(unitWaiter22);
        org.junit.Assert.assertNotNull(unitWaiter23);
        org.junit.Assert.assertNotNull(unitTask25);
        org.junit.Assert.assertNotNull(unitTask27);
        org.junit.Assert.assertNotNull(unitWaiter28);
        org.junit.Assert.assertNotNull(unitWaiter29);
        org.junit.Assert.assertNotNull(unitTask32);
        org.junit.Assert.assertNotNull(unit33);
        org.junit.Assert.assertNotNull(unitTask34);
        org.junit.Assert.assertNotNull(unitTask35);
        org.junit.Assert.assertNotNull(unitTask37);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Action0 action0_2 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask3 = net.goldolphin.cate.Task.create(action0_2);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = unitTask3.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter5 = unitWaiter4.continueWithWaiter();
        java.util.concurrent.Executor executor6 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler7 = new net.goldolphin.cate.ExecutorScheduler(executor6);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask8 = unitWaiter4.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler7);
        net.goldolphin.cate.Unit unit9 = net.goldolphin.cate.Unit.VALUE;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask10 = unitWaiter4.withInitState(unit9);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask11 = unitTask1.withInitState(unit9);
        net.goldolphin.cate.Action0 action0_12 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask13 = net.goldolphin.cate.Task.create(action0_12);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter14 = unitTask13.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter15 = unitWaiter14.continueWithWaiter();
        java.util.concurrent.Executor executor16 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler17 = new net.goldolphin.cate.ExecutorScheduler(executor16);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask18 = unitWaiter14.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler17);
        net.goldolphin.cate.Unit unit19 = net.goldolphin.cate.Unit.VALUE;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask20 = unitWaiter14.withInitState(unit19);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter21 = unitWaiter14.continueWithWaiter();
        net.goldolphin.cate.Action0 action0_22 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask23 = net.goldolphin.cate.Task.create(action0_22);
        net.goldolphin.cate.Action0 action0_24 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask25 = net.goldolphin.cate.Task.create(action0_24);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter26 = unitTask25.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter27 = unitWaiter26.continueWithWaiter();
        java.util.concurrent.Executor executor28 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler29 = new net.goldolphin.cate.ExecutorScheduler(executor28);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask30 = unitWaiter26.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler29);
        net.goldolphin.cate.Unit unit31 = net.goldolphin.cate.Unit.VALUE;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask32 = unitWaiter26.withInitState(unit31);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask33 = unitTask23.withInitState(unit31);
        unitWaiter21.setResult(unit31);
        net.goldolphin.cate.Action0 action0_35 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask36 = net.goldolphin.cate.Task.create(action0_35);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter37 = unitTask36.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter38 = unitWaiter37.continueWithWaiter();
        java.util.concurrent.Executor executor39 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler40 = new net.goldolphin.cate.ExecutorScheduler(executor39);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask41 = unitWaiter37.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler40);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask42 = unitWaiter21.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitTask41);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask43 = unitTask11.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitTask41);
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitTask3);
        org.junit.Assert.assertNotNull(unitWaiter4);
        org.junit.Assert.assertNotNull(unitWaiter5);
        org.junit.Assert.assertNotNull(unitTask8);
        org.junit.Assert.assertNotNull(unit9);
        org.junit.Assert.assertNotNull(unitTask10);
        org.junit.Assert.assertNotNull(unitTask11);
        org.junit.Assert.assertNotNull(unitTask13);
        org.junit.Assert.assertNotNull(unitWaiter14);
        org.junit.Assert.assertNotNull(unitWaiter15);
        org.junit.Assert.assertNotNull(unitTask18);
        org.junit.Assert.assertNotNull(unit19);
        org.junit.Assert.assertNotNull(unitTask20);
        org.junit.Assert.assertNotNull(unitWaiter21);
        org.junit.Assert.assertNotNull(unitTask23);
        org.junit.Assert.assertNotNull(unitTask25);
        org.junit.Assert.assertNotNull(unitWaiter26);
        org.junit.Assert.assertNotNull(unitWaiter27);
        org.junit.Assert.assertNotNull(unitTask30);
        org.junit.Assert.assertNotNull(unit31);
        org.junit.Assert.assertNotNull(unitTask32);
        org.junit.Assert.assertNotNull(unitTask33);
        org.junit.Assert.assertNotNull(unitTask36);
        org.junit.Assert.assertNotNull(unitWaiter37);
        org.junit.Assert.assertNotNull(unitWaiter38);
        org.junit.Assert.assertNotNull(unitTask41);
        org.junit.Assert.assertNotNull(unitTask42);
        org.junit.Assert.assertNotNull(unitTask43);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.ContextAction<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextAction3 = null;
        net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextTask4 = new net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceContextAction3);
        net.goldolphin.cate.Action0 action0_5 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = net.goldolphin.cate.Task.create(action0_5);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter7 = unitTask6.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter8 = unitWaiter7.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter9 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter8);
        net.goldolphin.cate.IContinuation iContinuation10 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation11 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation10);
        net.goldolphin.cate.IContinuation iContinuation12 = unitWaiter8.buildContinuation(iContinuation10);
        net.goldolphin.cate.IContinuation iContinuation13 = charSequenceContextTask4.buildContinuation(iContinuation12);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation14 = new net.goldolphin.cate.CollectTask.IndexContinuation(10, iContinuation13);
        net.goldolphin.cate.IContinuation iContinuation15 = unitTask1.buildContinuation(iContinuation13);
        net.goldolphin.cate.Action0 action0_16 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask17 = net.goldolphin.cate.Task.create(action0_16);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter18 = unitTask17.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter19 = unitWaiter18.continueWithWaiter();
        net.goldolphin.cate.Action0 action0_20 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask21 = net.goldolphin.cate.Task.create(action0_20);
        net.goldolphin.cate.Action0 action0_22 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask23 = net.goldolphin.cate.Task.create(action0_22);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter24 = unitTask23.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter25 = unitWaiter24.continueWithWaiter();
        java.util.concurrent.Executor executor26 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler27 = new net.goldolphin.cate.ExecutorScheduler(executor26);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask28 = unitWaiter24.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler27);
        net.goldolphin.cate.Unit unit29 = net.goldolphin.cate.Unit.VALUE;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask30 = unitWaiter24.withInitState(unit29);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask31 = unitTask21.withInitState(unit29);
        unitWaiter19.setResult(unit29);
        net.goldolphin.cate.Action0 action0_33 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask34 = net.goldolphin.cate.Task.create(action0_33);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter35 = unitTask34.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter36 = unitWaiter35.continueWithWaiter();
        java.util.concurrent.Executor executor37 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler38 = new net.goldolphin.cate.ExecutorScheduler(executor37);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask39 = unitWaiter35.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler38);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask40 = unitWaiter19.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler38);
        net.goldolphin.cate.Environment environment41 = null;
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask42 = null;
        net.goldolphin.cate.Action0 action0_43 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask44 = net.goldolphin.cate.Task.create(action0_43);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter45 = unitTask44.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter46 = unitWaiter45.continueWithWaiter();
        java.util.concurrent.Executor executor47 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler48 = new net.goldolphin.cate.ExecutorScheduler(executor47);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask49 = unitWaiter45.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler48);
        java.util.concurrent.Executor executor50 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler51 = new net.goldolphin.cate.ExecutorScheduler(executor50);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask52 = unitWaiter45.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler51);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler53 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask42, (net.goldolphin.cate.IScheduler) executorScheduler51);
        // The following exception was thrown during execution in test generation
        try {
            iContinuation13.apply((java.lang.Object) unitTask40, environment41, (net.goldolphin.cate.IScheduler) executorScheduler51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unitWaiter7);
        org.junit.Assert.assertNotNull(unitWaiter8);
        org.junit.Assert.assertNotNull(iContinuation12);
        org.junit.Assert.assertNotNull(iContinuation13);
        org.junit.Assert.assertNotNull(iContinuation15);
        org.junit.Assert.assertNotNull(unitTask17);
        org.junit.Assert.assertNotNull(unitWaiter18);
        org.junit.Assert.assertNotNull(unitWaiter19);
        org.junit.Assert.assertNotNull(unitTask21);
        org.junit.Assert.assertNotNull(unitTask23);
        org.junit.Assert.assertNotNull(unitWaiter24);
        org.junit.Assert.assertNotNull(unitWaiter25);
        org.junit.Assert.assertNotNull(unitTask28);
        org.junit.Assert.assertNotNull(unit29);
        org.junit.Assert.assertNotNull(unitTask30);
        org.junit.Assert.assertNotNull(unitTask31);
        org.junit.Assert.assertNotNull(unitTask34);
        org.junit.Assert.assertNotNull(unitWaiter35);
        org.junit.Assert.assertNotNull(unitWaiter36);
        org.junit.Assert.assertNotNull(unitTask39);
        org.junit.Assert.assertNotNull(unitTask40);
        org.junit.Assert.assertNotNull(unitTask44);
        org.junit.Assert.assertNotNull(unitWaiter45);
        org.junit.Assert.assertNotNull(unitWaiter46);
        org.junit.Assert.assertNotNull(unitTask49);
        org.junit.Assert.assertNotNull(unitTask52);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_3 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask4 = unitTask1.continueWith(unitAction1_3);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitTask5 = unitTask1.flatten();
        java.util.concurrent.Executor executor6 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler7 = new net.goldolphin.cate.ExecutorScheduler(executor6);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask8 = unitTask1.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler7);
        net.goldolphin.cate.Func0<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0_9 = null;
        net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0Task10 = new net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>(unitWaiterFunc0_9);
        net.goldolphin.cate.Func0<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0_11 = null;
        net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0Task12 = new net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>(unitWaiterFunc0_11);
        net.goldolphin.cate.Action0 action0_14 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask15 = net.goldolphin.cate.Task.create(action0_14);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter16 = unitTask15.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter17 = unitWaiter16.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter18 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter17);
        net.goldolphin.cate.IContinuation iContinuation19 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation20 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation19);
        net.goldolphin.cate.IContinuation iContinuation21 = unitWaiter17.buildContinuation(iContinuation19);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation22 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (byte) 100, iContinuation19);
        net.goldolphin.cate.IContinuation iContinuation23 = unitWaiterFunc0Task12.buildContinuation(iContinuation19);
        net.goldolphin.cate.ContextAction<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextAction25 = null;
        net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextTask26 = new net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceContextAction25);
        net.goldolphin.cate.Action0 action0_27 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask28 = net.goldolphin.cate.Task.create(action0_27);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter29 = unitTask28.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter30 = unitWaiter29.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter31 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter30);
        net.goldolphin.cate.IContinuation iContinuation32 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation33 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation32);
        net.goldolphin.cate.IContinuation iContinuation34 = unitWaiter30.buildContinuation(iContinuation32);
        net.goldolphin.cate.IContinuation iContinuation35 = charSequenceContextTask26.buildContinuation(iContinuation34);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation36 = new net.goldolphin.cate.CollectTask.IndexContinuation(10, iContinuation35);
        net.goldolphin.cate.IContinuation iContinuation37 = unitWaiterFunc0Task12.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation36);
        net.goldolphin.cate.IContinuation iContinuation38 = unitWaiterFunc0Task10.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation36);
        net.goldolphin.cate.ITask<java.io.Serializable, ?> serializableITask39 = null;
        net.goldolphin.cate.ITask[] iTaskArray41 = new net.goldolphin.cate.ITask[1];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<java.io.Serializable, ?>[] serializableITaskArray42 = (net.goldolphin.cate.ITask<java.io.Serializable, ?>[]) iTaskArray41;
        serializableITaskArray42[0] = serializableITask39;
        net.goldolphin.cate.WhenAnyTask<java.io.Serializable> serializableWhenAnyTask45 = new net.goldolphin.cate.WhenAnyTask<java.io.Serializable>(serializableITaskArray42);
        net.goldolphin.cate.Environment environment46 = null;
        // The following exception was thrown during execution in test generation
        try {
            executorScheduler7.schedule((net.goldolphin.cate.IContinuation) indexContinuation36, (java.lang.Object) serializableITaskArray42, environment46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitTask4);
        org.junit.Assert.assertNotNull(unitTask5);
        org.junit.Assert.assertNotNull(unitTask8);
        org.junit.Assert.assertNotNull(unitTask15);
        org.junit.Assert.assertNotNull(unitWaiter16);
        org.junit.Assert.assertNotNull(unitWaiter17);
        org.junit.Assert.assertNotNull(iContinuation21);
        org.junit.Assert.assertNotNull(iContinuation23);
        org.junit.Assert.assertNotNull(unitTask28);
        org.junit.Assert.assertNotNull(unitWaiter29);
        org.junit.Assert.assertNotNull(unitWaiter30);
        org.junit.Assert.assertNotNull(iContinuation34);
        org.junit.Assert.assertNotNull(iContinuation35);
        org.junit.Assert.assertNotNull(iContinuation37);
        org.junit.Assert.assertNotNull(iContinuation38);
        org.junit.Assert.assertNotNull(iTaskArray41);
        org.junit.Assert.assertNotNull(serializableITaskArray42);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        net.goldolphin.cate.CollectTask.Counter counter1 = new net.goldolphin.cate.CollectTask.Counter((int) (byte) 1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Action0 action0_2 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask3 = net.goldolphin.cate.Task.create(action0_2);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = unitTask3.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter5 = unitWaiter4.continueWithWaiter();
        java.util.concurrent.Executor executor6 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler7 = new net.goldolphin.cate.ExecutorScheduler(executor6);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask8 = unitWaiter4.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler7);
        net.goldolphin.cate.Unit unit9 = net.goldolphin.cate.Unit.VALUE;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask10 = unitWaiter4.withInitState(unit9);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask11 = unitTask1.withInitState(unit9);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter12 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitTask11);
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitTask3);
        org.junit.Assert.assertNotNull(unitWaiter4);
        org.junit.Assert.assertNotNull(unitWaiter5);
        org.junit.Assert.assertNotNull(unitTask8);
        org.junit.Assert.assertNotNull(unit9);
        org.junit.Assert.assertNotNull(unitTask10);
        org.junit.Assert.assertNotNull(unitTask11);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        net.goldolphin.cate.CollectTask.Counter counter1 = new net.goldolphin.cate.CollectTask.Counter((int) (byte) 0);
        net.goldolphin.cate.ITask[] iTaskArray4 = new net.goldolphin.cate.ITask[0];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[] iTaskArrayITaskArray5 = (net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray4;
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]> charSequenceITaskArrayWhenAllTask6 = new net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]>((net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray4);
        net.goldolphin.cate.WhenAnyTask<java.lang.reflect.Type> typeWhenAnyTask7 = net.goldolphin.cate.Task.whenAny((net.goldolphin.cate.ITask<java.lang.reflect.Type, ?>[]) iTaskArray4);
        net.goldolphin.cate.CollectTask.Result result8 = new net.goldolphin.cate.CollectTask.Result((int) (short) 10, (java.lang.Object) iTaskArray4);
        int int9 = result8.index;
        java.lang.Object obj10 = result8.value;
        java.lang.Object obj11 = result8.value;
        // The following exception was thrown during execution in test generation
        try {
            counter1.record(result8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Invalid complete value: 1 exceeds 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTaskArray4);
        org.junit.Assert.assertNotNull(iTaskArrayITaskArray5);
        org.junit.Assert.assertNotNull(typeWhenAnyTask7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        java.util.concurrent.Executor executor4 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler5 = new net.goldolphin.cate.ExecutorScheduler(executor4);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler5);
        java.util.concurrent.Executor executor7 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler8 = new net.goldolphin.cate.ExecutorScheduler(executor7);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler8);
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask12 = null;
        net.goldolphin.cate.Action0 action0_13 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask14 = net.goldolphin.cate.Task.create(action0_13);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter15 = unitTask14.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter16 = unitWaiter15.continueWithWaiter();
        java.util.concurrent.Executor executor17 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler18 = new net.goldolphin.cate.ExecutorScheduler(executor17);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask19 = unitWaiter15.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler18);
        java.util.concurrent.Executor executor20 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler21 = new net.goldolphin.cate.ExecutorScheduler(executor20);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask22 = unitWaiter15.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler21);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler23 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask12, (net.goldolphin.cate.IScheduler) executorScheduler21);
        java.util.concurrent.Executor executor24 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler25 = new net.goldolphin.cate.ExecutorScheduler(executor24);
        net.goldolphin.cate.IScheduler[] iSchedulerArray26 = new net.goldolphin.cate.IScheduler[] { executorScheduler8, executorScheduler11, executorScheduler21, executorScheduler25 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner27 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool28 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray26, unitWaiterFunc0TaskIPartitioner27);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore29 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool28);
        int int30 = unitWaiterFunc0TaskPartitionedSchedulerPool28.getPartitionNum();
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore31 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool28);
        net.goldolphin.cate.partitioned.IPartitioner iPartitioner32 = unitWaiterFunc0TaskPartitionedSchedulerPool28.getPartitioner();
        net.goldolphin.cate.partitioned.IPartitioner iPartitioner33 = unitWaiterFunc0TaskPartitionedSchedulerPool28.getPartitioner();
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitTask14);
        org.junit.Assert.assertNotNull(unitWaiter15);
        org.junit.Assert.assertNotNull(unitWaiter16);
        org.junit.Assert.assertNotNull(unitTask19);
        org.junit.Assert.assertNotNull(unitTask22);
        org.junit.Assert.assertNotNull(iSchedulerArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNull(iPartitioner32);
        org.junit.Assert.assertNull(iPartitioner33);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter3);
        net.goldolphin.cate.IContinuation iContinuation5 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation6 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation5);
        net.goldolphin.cate.IContinuation iContinuation7 = unitWaiter3.buildContinuation(iContinuation5);
        net.goldolphin.cate.Action0 action0_8 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = net.goldolphin.cate.Task.create(action0_8);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter10 = unitTask9.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter11 = unitWaiter10.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter12 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter11);
        net.goldolphin.cate.IContinuation iContinuation13 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation14 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation13);
        net.goldolphin.cate.IContinuation iContinuation15 = unitWaiter11.buildContinuation(iContinuation13);
        net.goldolphin.cate.IContinuation[] iContinuationArray16 = new net.goldolphin.cate.IContinuation[] { iContinuation5, iContinuation15 };
        net.goldolphin.cate.ContextCollectTask.DispatcherContinuation dispatcherContinuation17 = new net.goldolphin.cate.ContextCollectTask.DispatcherContinuation(iContinuationArray16);
        net.goldolphin.cate.IContinuation[] iContinuationArray18 = new net.goldolphin.cate.IContinuation[] { dispatcherContinuation17 };
        net.goldolphin.cate.ContextCollectTask.DispatcherContinuation dispatcherContinuation19 = new net.goldolphin.cate.ContextCollectTask.DispatcherContinuation(iContinuationArray18);
        net.goldolphin.cate.ContextCollectTask.DispatcherContinuation dispatcherContinuation20 = new net.goldolphin.cate.ContextCollectTask.DispatcherContinuation(iContinuationArray18);
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(iContinuation7);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitWaiter10);
        org.junit.Assert.assertNotNull(unitWaiter11);
        org.junit.Assert.assertNotNull(iContinuation15);
        org.junit.Assert.assertNotNull(iContinuationArray16);
        org.junit.Assert.assertNotNull(iContinuationArray18);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        net.goldolphin.cate.util.ExecutorTimer executorTimer0 = new net.goldolphin.cate.util.ExecutorTimer();
        net.goldolphin.cate.Action0 action0_1 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask2 = net.goldolphin.cate.Task.create(action0_1);
        net.goldolphin.cate.Action0 action0_3 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask4 = net.goldolphin.cate.Task.create(action0_3);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter5 = unitTask4.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = unitTask2.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter5);
        net.goldolphin.cate.Unit unit7 = null;
        unitWaiter5.setResult(unit7);
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_9 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask10 = unitWaiter5.continueWith(unitAction1_9);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter11 = unitWaiter5.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Maybe<net.goldolphin.cate.Unit>> unitTask15 = executorTimer0.withTimeout((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter11, unitAction1_12, (long) (byte) 1, timeUnit14);
        net.goldolphin.cate.Action0 action0_16 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask17 = net.goldolphin.cate.Task.create(action0_16);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter18 = unitTask17.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter19 = unitWaiter18.continueWithWaiter();
        java.util.concurrent.Executor executor20 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler21 = new net.goldolphin.cate.ExecutorScheduler(executor20);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask22 = unitWaiter18.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler21);
        net.goldolphin.cate.Unit unit23 = net.goldolphin.cate.Unit.VALUE;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask24 = unitWaiter18.withInitState(unit23);
        net.goldolphin.cate.Action0 action0_25 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask26 = net.goldolphin.cate.Task.create(action0_25);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter27 = unitTask26.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter28 = unitWaiter27.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter29 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter28);
        net.goldolphin.cate.IContinuation iContinuation30 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation31 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation30);
        net.goldolphin.cate.IContinuation iContinuation32 = unitWaiter28.buildContinuation(iContinuation30);
        net.goldolphin.cate.IContinuation iContinuation33 = unitWaiter18.buildContinuation(iContinuation30);
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_34 = null;
        java.util.concurrent.TimeUnit timeUnit36 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Maybe<net.goldolphin.cate.Unit>> unitTask37 = executorTimer0.withTimeout((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter18, unitAction1_34, (long) (short) 0, timeUnit36);
        executorTimer0.shutdown();
        org.junit.Assert.assertNotNull(unitTask2);
        org.junit.Assert.assertNotNull(unitTask4);
        org.junit.Assert.assertNotNull(unitWaiter5);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unitTask10);
        org.junit.Assert.assertNotNull(unitWaiter11);
        org.junit.Assert.assertNotNull(unitTask15);
        org.junit.Assert.assertNotNull(unitTask17);
        org.junit.Assert.assertNotNull(unitWaiter18);
        org.junit.Assert.assertNotNull(unitWaiter19);
        org.junit.Assert.assertNotNull(unitTask22);
        org.junit.Assert.assertNotNull(unit23);
        org.junit.Assert.assertNotNull(unitTask24);
        org.junit.Assert.assertNotNull(unitTask26);
        org.junit.Assert.assertNotNull(unitWaiter27);
        org.junit.Assert.assertNotNull(unitWaiter28);
        org.junit.Assert.assertNotNull(iContinuation32);
        org.junit.Assert.assertNotNull(iContinuation33);
        org.junit.Assert.assertNotNull(unitTask37);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        net.goldolphin.cate.Func0<java.lang.CharSequence> charSequenceFunc0_0 = null;
        net.goldolphin.cate.Func0Task<java.lang.CharSequence> charSequenceFunc0Task1 = new net.goldolphin.cate.Func0Task<java.lang.CharSequence>(charSequenceFunc0_0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        net.goldolphin.cate.ContextAction<net.goldolphin.cate.CollectTask.Result, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> resultContextAction1 = null;
        net.goldolphin.cate.ITask[] iTaskArray3 = new net.goldolphin.cate.ITask[0];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[] iTaskArrayITaskArray4 = (net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray3;
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]> charSequenceITaskArrayWhenAllTask5 = new net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]>((net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray3);
        net.goldolphin.cate.WhenAnyTask<java.lang.reflect.Type> typeWhenAnyTask6 = net.goldolphin.cate.Task.whenAny((net.goldolphin.cate.ITask<java.lang.reflect.Type, ?>[]) iTaskArray3);
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.IScheduler[]> iSchedulerArrayWhenAllTask7 = net.goldolphin.cate.Task.whenAll((net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler[], ?>[]) iTaskArray3);
        net.goldolphin.cate.ContextCollectTask<net.goldolphin.cate.SynchronizedScheduler, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> synchronizedSchedulerContextCollectTask8 = new net.goldolphin.cate.ContextCollectTask<net.goldolphin.cate.SynchronizedScheduler, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(resultContextAction1, (net.goldolphin.cate.ITask<net.goldolphin.cate.SynchronizedScheduler, ?>[]) iTaskArray3);
        net.goldolphin.cate.IContinuation iContinuation10 = net.goldolphin.cate.IContinuation.END_CONTINUATION;
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation11 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (short) -1, iContinuation10);
        net.goldolphin.cate.IContinuation iContinuation12 = synchronizedSchedulerContextCollectTask8.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation11);
        net.goldolphin.cate.Func0<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0_13 = null;
        net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0Task14 = new net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>(unitWaiterFunc0_13);
        net.goldolphin.cate.Action0 action0_16 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask17 = net.goldolphin.cate.Task.create(action0_16);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter18 = unitTask17.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter19 = unitWaiter18.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter20 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter19);
        net.goldolphin.cate.IContinuation iContinuation21 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation22 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation21);
        net.goldolphin.cate.IContinuation iContinuation23 = unitWaiter19.buildContinuation(iContinuation21);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation24 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (byte) 100, iContinuation21);
        net.goldolphin.cate.IContinuation iContinuation25 = unitWaiterFunc0Task14.buildContinuation(iContinuation21);
        net.goldolphin.cate.IContinuation iContinuation27 = net.goldolphin.cate.IContinuation.END_CONTINUATION;
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation28 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (short) -1, iContinuation27);
        net.goldolphin.cate.IContinuation iContinuation29 = unitWaiterFunc0Task14.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation28);
        net.goldolphin.cate.IContinuation iContinuation30 = synchronizedSchedulerContextCollectTask8.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation28);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation31 = new net.goldolphin.cate.CollectTask.IndexContinuation(56, (net.goldolphin.cate.IContinuation) indexContinuation28);
        org.junit.Assert.assertNotNull(iTaskArray3);
        org.junit.Assert.assertNotNull(iTaskArrayITaskArray4);
        org.junit.Assert.assertNotNull(typeWhenAnyTask6);
        org.junit.Assert.assertNotNull(iSchedulerArrayWhenAllTask7);
        org.junit.Assert.assertNotNull(iContinuation10);
        org.junit.Assert.assertNotNull(iContinuation12);
        org.junit.Assert.assertNotNull(unitTask17);
        org.junit.Assert.assertNotNull(unitWaiter18);
        org.junit.Assert.assertNotNull(unitWaiter19);
        org.junit.Assert.assertNotNull(iContinuation23);
        org.junit.Assert.assertNotNull(iContinuation25);
        org.junit.Assert.assertNotNull(iContinuation27);
        org.junit.Assert.assertNotNull(iContinuation29);
        org.junit.Assert.assertNotNull(iContinuation30);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        net.goldolphin.cate.ITask[] iTaskArray2 = new net.goldolphin.cate.ITask[0];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[] iTaskArrayITaskArray3 = (net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray2;
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]> charSequenceITaskArrayWhenAllTask4 = new net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]>((net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray2);
        net.goldolphin.cate.WhenAnyTask<java.lang.reflect.Type> typeWhenAnyTask5 = net.goldolphin.cate.Task.whenAny((net.goldolphin.cate.ITask<java.lang.reflect.Type, ?>[]) iTaskArray2);
        net.goldolphin.cate.CollectTask.Result result6 = new net.goldolphin.cate.CollectTask.Result((int) (short) 10, (java.lang.Object) iTaskArray2);
        java.lang.Object obj7 = result6.value;
        org.junit.Assert.assertNotNull(iTaskArray2);
        org.junit.Assert.assertNotNull(iTaskArrayITaskArray3);
        org.junit.Assert.assertNotNull(typeWhenAnyTask5);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        net.goldolphin.cate.Maybe<java.lang.Comparable<java.lang.String>> strComparableMaybe0 = net.goldolphin.cate.Maybe.nothing();
        boolean boolean1 = strComparableMaybe0.isNothing();
        java.lang.Comparable<java.lang.String> strComparable2 = strComparableMaybe0.get();
        org.junit.Assert.assertNotNull(strComparableMaybe0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(strComparable2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        net.goldolphin.cate.ITask[] iTaskArray2 = new net.goldolphin.cate.ITask[0];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[] iTaskArrayITaskArray3 = (net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray2;
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]> charSequenceITaskArrayWhenAllTask4 = new net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]>((net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray2);
        net.goldolphin.cate.WhenAnyTask<java.lang.reflect.Type> typeWhenAnyTask5 = net.goldolphin.cate.Task.whenAny((net.goldolphin.cate.ITask<java.lang.reflect.Type, ?>[]) iTaskArray2);
        net.goldolphin.cate.CollectTask.Result result6 = new net.goldolphin.cate.CollectTask.Result((int) (short) 10, (java.lang.Object) iTaskArray2);
        net.goldolphin.cate.WhenAllTask<java.lang.CharSequence> charSequenceWhenAllTask7 = new net.goldolphin.cate.WhenAllTask<java.lang.CharSequence>((net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]) iTaskArray2);
        net.goldolphin.cate.WhenAllTask<java.lang.reflect.Type> typeWhenAllTask8 = net.goldolphin.cate.Task.whenAll((net.goldolphin.cate.ITask<java.lang.reflect.Type, ?>[]) iTaskArray2);
        org.junit.Assert.assertNotNull(iTaskArray2);
        org.junit.Assert.assertNotNull(iTaskArrayITaskArray3);
        org.junit.Assert.assertNotNull(typeWhenAnyTask5);
        org.junit.Assert.assertNotNull(typeWhenAllTask8);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.util.ExecutorTimer executorTimer3 = new net.goldolphin.cate.util.ExecutorTimer();
        net.goldolphin.cate.Action0 action0_4 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask5 = net.goldolphin.cate.Task.create(action0_4);
        net.goldolphin.cate.Action0 action0_6 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask7 = net.goldolphin.cate.Task.create(action0_6);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter8 = unitTask7.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = unitTask5.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter8);
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Maybe<net.goldolphin.cate.Unit>> unitTask13 = executorTimer3.withTimeout((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitTask5, unitAction1_10, (long) (byte) -1, timeUnit12);
        net.goldolphin.cate.SynchronizedScheduler synchronizedScheduler14 = new net.goldolphin.cate.SynchronizedScheduler();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask15 = unitTask5.withScheduler((net.goldolphin.cate.IScheduler) synchronizedScheduler14);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask16 = unitTask1.withScheduler((net.goldolphin.cate.IScheduler) synchronizedScheduler14);
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_17 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask18 = unitTask1.continueWith(unitAction1_17);
        net.goldolphin.cate.Action0 action0_19 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask20 = net.goldolphin.cate.Task.create(action0_19);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter21 = unitTask20.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter22 = unitWaiter21.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_23 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask24 = unitWaiter21.continueWith(unitAction1_23);
        net.goldolphin.cate.Action0 action0_25 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask26 = net.goldolphin.cate.Task.create(action0_25);
        net.goldolphin.cate.Action0 action0_27 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask28 = net.goldolphin.cate.Task.create(action0_27);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter29 = unitTask28.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter30 = unitWaiter29.continueWithWaiter();
        java.util.concurrent.Executor executor31 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler32 = new net.goldolphin.cate.ExecutorScheduler(executor31);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask33 = unitWaiter29.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler32);
        net.goldolphin.cate.Unit unit34 = net.goldolphin.cate.Unit.VALUE;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask35 = unitWaiter29.withInitState(unit34);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask36 = unitTask26.withInitState(unit34);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask37 = unitTask24.withInitState(unit34);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask38 = unitTask18.withInitState(unit34);
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitTask5);
        org.junit.Assert.assertNotNull(unitTask7);
        org.junit.Assert.assertNotNull(unitWaiter8);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitTask13);
        org.junit.Assert.assertNotNull(unitTask15);
        org.junit.Assert.assertNotNull(unitTask16);
        org.junit.Assert.assertNotNull(unitTask18);
        org.junit.Assert.assertNotNull(unitTask20);
        org.junit.Assert.assertNotNull(unitWaiter21);
        org.junit.Assert.assertNotNull(unitWaiter22);
        org.junit.Assert.assertNotNull(unitTask24);
        org.junit.Assert.assertNotNull(unitTask26);
        org.junit.Assert.assertNotNull(unitTask28);
        org.junit.Assert.assertNotNull(unitWaiter29);
        org.junit.Assert.assertNotNull(unitWaiter30);
        org.junit.Assert.assertNotNull(unitTask33);
        org.junit.Assert.assertNotNull(unit34);
        org.junit.Assert.assertNotNull(unitTask35);
        org.junit.Assert.assertNotNull(unitTask36);
        org.junit.Assert.assertNotNull(unitTask37);
        org.junit.Assert.assertNotNull(unitTask38);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Action0 action0_2 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask3 = net.goldolphin.cate.Task.create(action0_2);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = unitTask3.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask5 = unitTask1.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter4);
        net.goldolphin.cate.Unit unit6 = null;
        unitWaiter4.setResult(unit6);
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_8 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = unitWaiter4.continueWith(unitAction1_8);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter10 = unitTask9.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter11 = unitTask9.continueWithWaiter();
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitTask3);
        org.junit.Assert.assertNotNull(unitWaiter4);
        org.junit.Assert.assertNotNull(unitTask5);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitWaiter10);
        org.junit.Assert.assertNotNull(unitWaiter11);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>> iSchedulerTaskWithSchedulerHashedPartitioner1 = net.goldolphin.cate.partitioned.HashedPartitioner.instance();
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask2 = null;
        net.goldolphin.cate.Action0 action0_3 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask4 = net.goldolphin.cate.Task.create(action0_3);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter5 = unitTask4.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter6 = unitWaiter5.continueWithWaiter();
        java.util.concurrent.Executor executor7 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler8 = new net.goldolphin.cate.ExecutorScheduler(executor7);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = unitWaiter5.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler8);
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask12 = unitWaiter5.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler11);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler13 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask2, (net.goldolphin.cate.IScheduler) executorScheduler11);
        int int15 = iSchedulerTaskWithSchedulerHashedPartitioner1.partition(iSchedulerTaskWithScheduler13, (int) (byte) 10);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore16 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((int) (byte) 1, (net.goldolphin.cate.partitioned.IPartitioner) iSchedulerTaskWithSchedulerHashedPartitioner1);
        net.goldolphin.cate.Action0 action0_17 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask18 = net.goldolphin.cate.Task.create(action0_17);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter19 = unitTask18.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter20 = unitWaiter19.continueWithWaiter();
        java.util.concurrent.Executor executor21 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler22 = new net.goldolphin.cate.ExecutorScheduler(executor21);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask23 = unitWaiter19.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler22);
        java.util.concurrent.Executor executor24 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler25 = new net.goldolphin.cate.ExecutorScheduler(executor24);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask26 = unitWaiter19.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler25);
        java.util.concurrent.Executor executor27 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler28 = new net.goldolphin.cate.ExecutorScheduler(executor27);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask29 = null;
        net.goldolphin.cate.Action0 action0_30 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask31 = net.goldolphin.cate.Task.create(action0_30);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter32 = unitTask31.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter33 = unitWaiter32.continueWithWaiter();
        java.util.concurrent.Executor executor34 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler35 = new net.goldolphin.cate.ExecutorScheduler(executor34);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask36 = unitWaiter32.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler35);
        java.util.concurrent.Executor executor37 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler38 = new net.goldolphin.cate.ExecutorScheduler(executor37);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask39 = unitWaiter32.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler38);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler40 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask29, (net.goldolphin.cate.IScheduler) executorScheduler38);
        java.util.concurrent.Executor executor41 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler42 = new net.goldolphin.cate.ExecutorScheduler(executor41);
        net.goldolphin.cate.IScheduler[] iSchedulerArray43 = new net.goldolphin.cate.IScheduler[] { executorScheduler25, executorScheduler28, executorScheduler38, executorScheduler42 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner44 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool45 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray43, unitWaiterFunc0TaskIPartitioner44);
        boolean boolean46 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore16.contains(unitWaiterFunc0TaskPartitionedSchedulerPool45);
        net.goldolphin.cate.Action0 action0_47 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask48 = net.goldolphin.cate.Task.create(action0_47);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter49 = unitTask48.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter50 = unitWaiter49.continueWithWaiter();
        java.util.concurrent.Executor executor51 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler52 = new net.goldolphin.cate.ExecutorScheduler(executor51);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask53 = unitWaiter49.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler52);
        java.util.concurrent.Executor executor54 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler55 = new net.goldolphin.cate.ExecutorScheduler(executor54);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask56 = unitWaiter49.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler55);
        java.util.concurrent.Executor executor57 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler58 = new net.goldolphin.cate.ExecutorScheduler(executor57);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask59 = null;
        net.goldolphin.cate.Action0 action0_60 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask61 = net.goldolphin.cate.Task.create(action0_60);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter62 = unitTask61.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter63 = unitWaiter62.continueWithWaiter();
        java.util.concurrent.Executor executor64 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler65 = new net.goldolphin.cate.ExecutorScheduler(executor64);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask66 = unitWaiter62.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler65);
        java.util.concurrent.Executor executor67 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler68 = new net.goldolphin.cate.ExecutorScheduler(executor67);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask69 = unitWaiter62.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler68);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler70 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask59, (net.goldolphin.cate.IScheduler) executorScheduler68);
        java.util.concurrent.Executor executor71 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler72 = new net.goldolphin.cate.ExecutorScheduler(executor71);
        net.goldolphin.cate.IScheduler[] iSchedulerArray73 = new net.goldolphin.cate.IScheduler[] { executorScheduler55, executorScheduler58, executorScheduler68, executorScheduler72 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner74 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool75 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray73, unitWaiterFunc0TaskIPartitioner74);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore76 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool75);
        int int77 = unitWaiterFunc0TaskPartitionedSchedulerPool75.getPartitionNum();
        net.goldolphin.cate.IScheduler iScheduler78 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore16.remove(unitWaiterFunc0TaskPartitionedSchedulerPool75);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore79 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool75);
        org.junit.Assert.assertNotNull(iSchedulerTaskWithSchedulerHashedPartitioner1);
        org.junit.Assert.assertNotNull(unitTask4);
        org.junit.Assert.assertNotNull(unitWaiter5);
        org.junit.Assert.assertNotNull(unitWaiter6);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitTask12);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(unitTask18);
        org.junit.Assert.assertNotNull(unitWaiter19);
        org.junit.Assert.assertNotNull(unitWaiter20);
        org.junit.Assert.assertNotNull(unitTask23);
        org.junit.Assert.assertNotNull(unitTask26);
        org.junit.Assert.assertNotNull(unitTask31);
        org.junit.Assert.assertNotNull(unitWaiter32);
        org.junit.Assert.assertNotNull(unitWaiter33);
        org.junit.Assert.assertNotNull(unitTask36);
        org.junit.Assert.assertNotNull(unitTask39);
        org.junit.Assert.assertNotNull(iSchedulerArray43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(unitTask48);
        org.junit.Assert.assertNotNull(unitWaiter49);
        org.junit.Assert.assertNotNull(unitWaiter50);
        org.junit.Assert.assertNotNull(unitTask53);
        org.junit.Assert.assertNotNull(unitTask56);
        org.junit.Assert.assertNotNull(unitTask61);
        org.junit.Assert.assertNotNull(unitWaiter62);
        org.junit.Assert.assertNotNull(unitWaiter63);
        org.junit.Assert.assertNotNull(unitTask66);
        org.junit.Assert.assertNotNull(unitTask69);
        org.junit.Assert.assertNotNull(iSchedulerArray73);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 4 + "'", int77 == 4);
        org.junit.Assert.assertNull(iScheduler78);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        net.goldolphin.cate.Func0<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0_0 = null;
        net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0Task1 = new net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>(unitWaiterFunc0_0);
        net.goldolphin.cate.Action0 action0_3 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask4 = net.goldolphin.cate.Task.create(action0_3);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter5 = unitTask4.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter6 = unitWaiter5.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter7 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter6);
        net.goldolphin.cate.IContinuation iContinuation8 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation9 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation8);
        net.goldolphin.cate.IContinuation iContinuation10 = unitWaiter6.buildContinuation(iContinuation8);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation11 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (byte) 100, iContinuation8);
        net.goldolphin.cate.IContinuation iContinuation12 = unitWaiterFunc0Task1.buildContinuation(iContinuation8);
        net.goldolphin.cate.ContextAction<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextAction14 = null;
        net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextTask15 = new net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceContextAction14);
        net.goldolphin.cate.Action0 action0_16 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask17 = net.goldolphin.cate.Task.create(action0_16);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter18 = unitTask17.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter19 = unitWaiter18.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter20 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter19);
        net.goldolphin.cate.IContinuation iContinuation21 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation22 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation21);
        net.goldolphin.cate.IContinuation iContinuation23 = unitWaiter19.buildContinuation(iContinuation21);
        net.goldolphin.cate.IContinuation iContinuation24 = charSequenceContextTask15.buildContinuation(iContinuation23);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation25 = new net.goldolphin.cate.CollectTask.IndexContinuation(10, iContinuation24);
        net.goldolphin.cate.IContinuation iContinuation26 = unitWaiterFunc0Task1.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation25);
        net.goldolphin.cate.Action0 action0_27 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask28 = net.goldolphin.cate.Task.create(action0_27);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter29 = unitTask28.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter30 = unitWaiter29.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter31 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter30);
        net.goldolphin.cate.Environment environment32 = null;
        net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>> iSchedulerTaskWithSchedulerHashedPartitioner33 = net.goldolphin.cate.partitioned.HashedPartitioner.instance();
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask34 = null;
        net.goldolphin.cate.Action0 action0_35 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask36 = net.goldolphin.cate.Task.create(action0_35);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter37 = unitTask36.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter38 = unitWaiter37.continueWithWaiter();
        java.util.concurrent.Executor executor39 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler40 = new net.goldolphin.cate.ExecutorScheduler(executor39);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask41 = unitWaiter37.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler40);
        java.util.concurrent.Executor executor42 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler43 = new net.goldolphin.cate.ExecutorScheduler(executor42);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask44 = unitWaiter37.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler43);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler45 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask34, (net.goldolphin.cate.IScheduler) executorScheduler43);
        int int47 = iSchedulerTaskWithSchedulerHashedPartitioner33.partition(iSchedulerTaskWithScheduler45, (int) (byte) 10);
        net.goldolphin.cate.SynchronizedScheduler synchronizedScheduler48 = new net.goldolphin.cate.SynchronizedScheduler();
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler49 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>((net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>) iSchedulerTaskWithScheduler45, (net.goldolphin.cate.IScheduler) synchronizedScheduler48);
        // The following exception was thrown during execution in test generation
        try {
            indexContinuation25.apply((java.lang.Object) unitWaiter31, environment32, (net.goldolphin.cate.IScheduler) synchronizedScheduler48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask4);
        org.junit.Assert.assertNotNull(unitWaiter5);
        org.junit.Assert.assertNotNull(unitWaiter6);
        org.junit.Assert.assertNotNull(iContinuation10);
        org.junit.Assert.assertNotNull(iContinuation12);
        org.junit.Assert.assertNotNull(unitTask17);
        org.junit.Assert.assertNotNull(unitWaiter18);
        org.junit.Assert.assertNotNull(unitWaiter19);
        org.junit.Assert.assertNotNull(iContinuation23);
        org.junit.Assert.assertNotNull(iContinuation24);
        org.junit.Assert.assertNotNull(iContinuation26);
        org.junit.Assert.assertNotNull(unitTask28);
        org.junit.Assert.assertNotNull(unitWaiter29);
        org.junit.Assert.assertNotNull(unitWaiter30);
        org.junit.Assert.assertNotNull(iSchedulerTaskWithSchedulerHashedPartitioner33);
        org.junit.Assert.assertNotNull(unitTask36);
        org.junit.Assert.assertNotNull(unitWaiter37);
        org.junit.Assert.assertNotNull(unitWaiter38);
        org.junit.Assert.assertNotNull(unitTask41);
        org.junit.Assert.assertNotNull(unitTask44);
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 6 + "'", int47 == 6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        net.goldolphin.cate.WhenAllTask whenAllTask0 = null;
        net.goldolphin.cate.ContextAction<net.goldolphin.cate.CollectTask.Result, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> resultContextAction1 = null;
        net.goldolphin.cate.ITask[] iTaskArray3 = new net.goldolphin.cate.ITask[0];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[] iTaskArrayITaskArray4 = (net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray3;
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]> charSequenceITaskArrayWhenAllTask5 = new net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]>((net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray3);
        net.goldolphin.cate.WhenAnyTask<java.lang.reflect.Type> typeWhenAnyTask6 = net.goldolphin.cate.Task.whenAny((net.goldolphin.cate.ITask<java.lang.reflect.Type, ?>[]) iTaskArray3);
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.IScheduler[]> iSchedulerArrayWhenAllTask7 = net.goldolphin.cate.Task.whenAll((net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler[], ?>[]) iTaskArray3);
        net.goldolphin.cate.ContextCollectTask<net.goldolphin.cate.SynchronizedScheduler, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> synchronizedSchedulerContextCollectTask8 = new net.goldolphin.cate.ContextCollectTask<net.goldolphin.cate.SynchronizedScheduler, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(resultContextAction1, (net.goldolphin.cate.ITask<net.goldolphin.cate.SynchronizedScheduler, ?>[]) iTaskArray3);
        net.goldolphin.cate.IContinuation iContinuation10 = net.goldolphin.cate.IContinuation.END_CONTINUATION;
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation11 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (short) -1, iContinuation10);
        net.goldolphin.cate.IContinuation iContinuation12 = synchronizedSchedulerContextCollectTask8.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation11);
        net.goldolphin.cate.IContinuation iContinuation13 = net.goldolphin.cate.IContinuation.END_CONTINUATION;
        net.goldolphin.cate.IContinuation iContinuation14 = synchronizedSchedulerContextCollectTask8.buildContinuation(iContinuation13);
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>.Continuation continuation15 = whenAllTask0.new Continuation(iContinuation13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to net.goldolphin.cate.WhenAllTask$Continuation with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTaskArray3);
        org.junit.Assert.assertNotNull(iTaskArrayITaskArray4);
        org.junit.Assert.assertNotNull(typeWhenAnyTask6);
        org.junit.Assert.assertNotNull(iSchedulerArrayWhenAllTask7);
        org.junit.Assert.assertNotNull(iContinuation10);
        org.junit.Assert.assertNotNull(iContinuation12);
        org.junit.Assert.assertNotNull(iContinuation13);
        org.junit.Assert.assertNotNull(iContinuation14);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        net.goldolphin.cate.Action0 action0_4 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask5 = net.goldolphin.cate.Task.create(action0_4);
        net.goldolphin.cate.Action0 action0_6 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask7 = net.goldolphin.cate.Task.create(action0_6);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter8 = unitTask7.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter9 = unitWaiter8.continueWithWaiter();
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask12 = unitWaiter8.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler11);
        net.goldolphin.cate.Unit unit13 = net.goldolphin.cate.Unit.VALUE;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask14 = unitWaiter8.withInitState(unit13);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask15 = unitTask5.withInitState(unit13);
        unitWaiter3.setResult(unit13);
        net.goldolphin.cate.Action0 action0_17 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask18 = net.goldolphin.cate.Task.create(action0_17);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter19 = unitTask18.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter20 = unitWaiter19.continueWithWaiter();
        java.util.concurrent.Executor executor21 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler22 = new net.goldolphin.cate.ExecutorScheduler(executor21);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask23 = unitWaiter19.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler22);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask24 = unitWaiter3.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler22);
        net.goldolphin.cate.ContextAction<net.goldolphin.cate.CollectTask.Result, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> resultContextAction25 = null;
        net.goldolphin.cate.ITask[] iTaskArray27 = new net.goldolphin.cate.ITask[0];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[] iTaskArrayITaskArray28 = (net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray27;
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]> charSequenceITaskArrayWhenAllTask29 = new net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]>((net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray27);
        net.goldolphin.cate.WhenAnyTask<java.lang.reflect.Type> typeWhenAnyTask30 = net.goldolphin.cate.Task.whenAny((net.goldolphin.cate.ITask<java.lang.reflect.Type, ?>[]) iTaskArray27);
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.IScheduler[]> iSchedulerArrayWhenAllTask31 = net.goldolphin.cate.Task.whenAll((net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler[], ?>[]) iTaskArray27);
        net.goldolphin.cate.ContextCollectTask<net.goldolphin.cate.SynchronizedScheduler, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> synchronizedSchedulerContextCollectTask32 = new net.goldolphin.cate.ContextCollectTask<net.goldolphin.cate.SynchronizedScheduler, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(resultContextAction25, (net.goldolphin.cate.ITask<net.goldolphin.cate.SynchronizedScheduler, ?>[]) iTaskArray27);
        net.goldolphin.cate.IContinuation iContinuation34 = net.goldolphin.cate.IContinuation.END_CONTINUATION;
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation35 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (short) -1, iContinuation34);
        net.goldolphin.cate.IContinuation iContinuation36 = synchronizedSchedulerContextCollectTask32.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation35);
        net.goldolphin.cate.IContinuation iContinuation37 = net.goldolphin.cate.IContinuation.END_CONTINUATION;
        net.goldolphin.cate.IContinuation iContinuation38 = synchronizedSchedulerContextCollectTask32.buildContinuation(iContinuation37);
        net.goldolphin.cate.Environment environment40 = null;
        // The following exception was thrown during execution in test generation
        try {
            executorScheduler22.schedule(iContinuation38, (java.lang.Object) 10.0d, environment40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask5);
        org.junit.Assert.assertNotNull(unitTask7);
        org.junit.Assert.assertNotNull(unitWaiter8);
        org.junit.Assert.assertNotNull(unitWaiter9);
        org.junit.Assert.assertNotNull(unitTask12);
        org.junit.Assert.assertNotNull(unit13);
        org.junit.Assert.assertNotNull(unitTask14);
        org.junit.Assert.assertNotNull(unitTask15);
        org.junit.Assert.assertNotNull(unitTask18);
        org.junit.Assert.assertNotNull(unitWaiter19);
        org.junit.Assert.assertNotNull(unitWaiter20);
        org.junit.Assert.assertNotNull(unitTask23);
        org.junit.Assert.assertNotNull(unitTask24);
        org.junit.Assert.assertNotNull(iTaskArray27);
        org.junit.Assert.assertNotNull(iTaskArrayITaskArray28);
        org.junit.Assert.assertNotNull(typeWhenAnyTask30);
        org.junit.Assert.assertNotNull(iSchedulerArrayWhenAllTask31);
        org.junit.Assert.assertNotNull(iContinuation34);
        org.junit.Assert.assertNotNull(iContinuation36);
        org.junit.Assert.assertNotNull(iContinuation37);
        org.junit.Assert.assertNotNull(iContinuation38);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        net.goldolphin.cate.Action1<java.lang.Object> objAction1_0 = null;
        net.goldolphin.cate.Action1Task<java.lang.Object> objAction1Task1 = new net.goldolphin.cate.Action1Task<java.lang.Object>(objAction1_0);
        net.goldolphin.cate.Action0 action0_3 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask4 = net.goldolphin.cate.Task.create(action0_3);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter5 = unitTask4.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter6 = unitWaiter5.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter7 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter6);
        net.goldolphin.cate.IContinuation iContinuation8 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation9 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation8);
        net.goldolphin.cate.IContinuation iContinuation10 = unitWaiter6.buildContinuation(iContinuation8);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation11 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (byte) 100, iContinuation8);
        net.goldolphin.cate.IContinuation iContinuation12 = objAction1Task1.buildContinuation(iContinuation8);
        org.junit.Assert.assertNotNull(unitTask4);
        org.junit.Assert.assertNotNull(unitWaiter5);
        org.junit.Assert.assertNotNull(unitWaiter6);
        org.junit.Assert.assertNotNull(iContinuation10);
        org.junit.Assert.assertNotNull(iContinuation12);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        net.goldolphin.cate.ITask[] iTaskArray2 = new net.goldolphin.cate.ITask[0];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[] iTaskArrayITaskArray3 = (net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray2;
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]> charSequenceITaskArrayWhenAllTask4 = new net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]>((net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray2);
        net.goldolphin.cate.WhenAnyTask<java.lang.reflect.Type> typeWhenAnyTask5 = net.goldolphin.cate.Task.whenAny((net.goldolphin.cate.ITask<java.lang.reflect.Type, ?>[]) iTaskArray2);
        net.goldolphin.cate.CollectTask.Result result6 = new net.goldolphin.cate.CollectTask.Result((int) (short) 10, (java.lang.Object) iTaskArray2);
        net.goldolphin.cate.Maybe<net.goldolphin.cate.CollectTask.Result> resultMaybe7 = net.goldolphin.cate.Maybe.just(result6);
        org.junit.Assert.assertNotNull(iTaskArray2);
        org.junit.Assert.assertNotNull(iTaskArrayITaskArray3);
        org.junit.Assert.assertNotNull(typeWhenAnyTask5);
        org.junit.Assert.assertNotNull(resultMaybe7);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        net.goldolphin.cate.util.ExecutorTimer executorTimer0 = new net.goldolphin.cate.util.ExecutorTimer();
        net.goldolphin.cate.Action0 action0_1 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask2 = net.goldolphin.cate.Task.create(action0_1);
        net.goldolphin.cate.Action0 action0_3 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask4 = net.goldolphin.cate.Task.create(action0_3);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter5 = unitTask4.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = unitTask2.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter5);
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Maybe<net.goldolphin.cate.Unit>> unitTask10 = executorTimer0.withTimeout((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitTask2, unitAction1_7, (long) (byte) -1, timeUnit9);
        net.goldolphin.cate.Action0 action0_11 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask12 = net.goldolphin.cate.Task.create(action0_11);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter13 = unitTask12.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter14 = unitWaiter13.continueWithWaiter();
        java.util.concurrent.Executor executor15 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler16 = new net.goldolphin.cate.ExecutorScheduler(executor15);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask17 = unitWaiter13.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler16);
        net.goldolphin.cate.Unit unit18 = net.goldolphin.cate.Unit.VALUE;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask19 = unitWaiter13.withInitState(unit18);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter20 = unitWaiter13.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_21 = null;
        java.util.concurrent.TimeUnit timeUnit23 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Maybe<net.goldolphin.cate.Unit>> unitTask24 = executorTimer0.withTimeout((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter13, unitAction1_21, (long) ' ', timeUnit23);
        net.goldolphin.cate.Action0 action0_25 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask26 = net.goldolphin.cate.Task.create(action0_25);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter27 = unitTask26.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter28 = unitWaiter27.continueWithWaiter();
        net.goldolphin.cate.Action0 action0_29 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask30 = net.goldolphin.cate.Task.create(action0_29);
        net.goldolphin.cate.Action0 action0_31 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask32 = net.goldolphin.cate.Task.create(action0_31);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter33 = unitTask32.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter34 = unitWaiter33.continueWithWaiter();
        java.util.concurrent.Executor executor35 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler36 = new net.goldolphin.cate.ExecutorScheduler(executor35);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask37 = unitWaiter33.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler36);
        net.goldolphin.cate.Unit unit38 = net.goldolphin.cate.Unit.VALUE;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask39 = unitWaiter33.withInitState(unit38);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask40 = unitTask30.withInitState(unit38);
        unitWaiter28.setResult(unit38);
        net.goldolphin.cate.Action0 action0_42 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask43 = net.goldolphin.cate.Task.create(action0_42);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter44 = unitTask43.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter45 = unitWaiter44.continueWithWaiter();
        java.util.concurrent.Executor executor46 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler47 = new net.goldolphin.cate.ExecutorScheduler(executor46);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask48 = unitWaiter44.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler47);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask49 = unitWaiter28.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler47);
        // The following exception was thrown during execution in test generation
        try {
            unitWaiter13.execute((net.goldolphin.cate.IScheduler) executorScheduler47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask2);
        org.junit.Assert.assertNotNull(unitTask4);
        org.junit.Assert.assertNotNull(unitWaiter5);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unitTask10);
        org.junit.Assert.assertNotNull(unitTask12);
        org.junit.Assert.assertNotNull(unitWaiter13);
        org.junit.Assert.assertNotNull(unitWaiter14);
        org.junit.Assert.assertNotNull(unitTask17);
        org.junit.Assert.assertNotNull(unit18);
        org.junit.Assert.assertNotNull(unitTask19);
        org.junit.Assert.assertNotNull(unitWaiter20);
        org.junit.Assert.assertNotNull(unitTask24);
        org.junit.Assert.assertNotNull(unitTask26);
        org.junit.Assert.assertNotNull(unitWaiter27);
        org.junit.Assert.assertNotNull(unitWaiter28);
        org.junit.Assert.assertNotNull(unitTask30);
        org.junit.Assert.assertNotNull(unitTask32);
        org.junit.Assert.assertNotNull(unitWaiter33);
        org.junit.Assert.assertNotNull(unitWaiter34);
        org.junit.Assert.assertNotNull(unitTask37);
        org.junit.Assert.assertNotNull(unit38);
        org.junit.Assert.assertNotNull(unitTask39);
        org.junit.Assert.assertNotNull(unitTask40);
        org.junit.Assert.assertNotNull(unitTask43);
        org.junit.Assert.assertNotNull(unitWaiter44);
        org.junit.Assert.assertNotNull(unitWaiter45);
        org.junit.Assert.assertNotNull(unitTask48);
        org.junit.Assert.assertNotNull(unitTask49);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        net.goldolphin.cate.ITask[] iTaskArray2 = new net.goldolphin.cate.ITask[0];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[] iTaskArrayITaskArray3 = (net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray2;
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]> charSequenceITaskArrayWhenAllTask4 = new net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]>((net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray2);
        net.goldolphin.cate.WhenAnyTask<java.lang.reflect.Type> typeWhenAnyTask5 = net.goldolphin.cate.Task.whenAny((net.goldolphin.cate.ITask<java.lang.reflect.Type, ?>[]) iTaskArray2);
        net.goldolphin.cate.CollectTask.Result result6 = new net.goldolphin.cate.CollectTask.Result((int) (short) 10, (java.lang.Object) iTaskArray2);
        int int7 = result6.index;
        java.lang.Object obj8 = result6.value;
        int int9 = result6.index;
        net.goldolphin.cate.Maybe<net.goldolphin.cate.CollectTask.Result> resultMaybe10 = net.goldolphin.cate.Maybe.just(result6);
        org.junit.Assert.assertNotNull(iTaskArray2);
        org.junit.Assert.assertNotNull(iTaskArrayITaskArray3);
        org.junit.Assert.assertNotNull(typeWhenAnyTask5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(resultMaybe10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        net.goldolphin.cate.ITask<java.lang.CharSequence, java.io.Serializable> charSequenceITask0 = null;
        java.lang.CharSequence charSequence1 = null;
        net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable> charSequenceTaskWithInitState2 = new net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>(charSequenceITask0, charSequence1);
        net.goldolphin.cate.Action0 action0_3 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask4 = net.goldolphin.cate.Task.create(action0_3);
        net.goldolphin.cate.ContextAction<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextAction6 = null;
        net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextTask7 = new net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceContextAction6);
        net.goldolphin.cate.Action0 action0_8 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = net.goldolphin.cate.Task.create(action0_8);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter10 = unitTask9.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter11 = unitWaiter10.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter12 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter11);
        net.goldolphin.cate.IContinuation iContinuation13 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation14 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation13);
        net.goldolphin.cate.IContinuation iContinuation15 = unitWaiter11.buildContinuation(iContinuation13);
        net.goldolphin.cate.IContinuation iContinuation16 = charSequenceContextTask7.buildContinuation(iContinuation15);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation17 = new net.goldolphin.cate.CollectTask.IndexContinuation(10, iContinuation16);
        net.goldolphin.cate.IContinuation iContinuation18 = unitTask4.buildContinuation(iContinuation16);
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.IContinuation iContinuation19 = charSequenceTaskWithInitState2.buildContinuation(iContinuation18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask4);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitWaiter10);
        org.junit.Assert.assertNotNull(unitWaiter11);
        org.junit.Assert.assertNotNull(iContinuation15);
        org.junit.Assert.assertNotNull(iContinuation16);
        org.junit.Assert.assertNotNull(iContinuation18);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        net.goldolphin.cate.ITask[] iTaskArray1 = new net.goldolphin.cate.ITask[0];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[] iTaskArrayITaskArray2 = (net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray1;
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]> charSequenceITaskArrayWhenAllTask3 = new net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]>((net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray1);
        net.goldolphin.cate.WhenAnyTask<java.lang.reflect.Type> typeWhenAnyTask4 = net.goldolphin.cate.Task.whenAny((net.goldolphin.cate.ITask<java.lang.reflect.Type, ?>[]) iTaskArray1);
        net.goldolphin.cate.WhenAnyTask<net.goldolphin.cate.IStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>> func0TaskPartitionedSchedulerPoolIStoreWhenAnyTask5 = net.goldolphin.cate.Task.whenAny((net.goldolphin.cate.ITask<net.goldolphin.cate.IStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>, ?>[]) iTaskArray1);
        org.junit.Assert.assertNotNull(iTaskArray1);
        org.junit.Assert.assertNotNull(iTaskArrayITaskArray2);
        org.junit.Assert.assertNotNull(typeWhenAnyTask4);
        org.junit.Assert.assertNotNull(func0TaskPartitionedSchedulerPoolIStoreWhenAnyTask5);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        net.goldolphin.cate.Func1<java.util.Map<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>[], net.goldolphin.cate.IStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>> partitionedSchedulerPoolMapArrayFunc1_0 = null;
        net.goldolphin.cate.Func1Task<java.util.Map<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>[], net.goldolphin.cate.IStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>> partitionedSchedulerPoolMapArrayFunc1Task1 = new net.goldolphin.cate.Func1Task<java.util.Map<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>[], net.goldolphin.cate.IStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>>(partitionedSchedulerPoolMapArrayFunc1_0);
        net.goldolphin.cate.ContextAction<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextAction3 = null;
        net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextTask4 = new net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceContextAction3);
        net.goldolphin.cate.Action0 action0_5 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = net.goldolphin.cate.Task.create(action0_5);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter7 = unitTask6.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter8 = unitWaiter7.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter9 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter8);
        net.goldolphin.cate.IContinuation iContinuation10 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation11 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation10);
        net.goldolphin.cate.IContinuation iContinuation12 = unitWaiter8.buildContinuation(iContinuation10);
        net.goldolphin.cate.IContinuation iContinuation13 = charSequenceContextTask4.buildContinuation(iContinuation12);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation14 = new net.goldolphin.cate.CollectTask.IndexContinuation(10, iContinuation13);
        net.goldolphin.cate.IContinuation iContinuation15 = partitionedSchedulerPoolMapArrayFunc1Task1.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation14);
        net.goldolphin.cate.ContextAction<net.goldolphin.cate.CollectTask.Result, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> resultContextAction16 = null;
        net.goldolphin.cate.ITask[] iTaskArray18 = new net.goldolphin.cate.ITask[0];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[] iTaskArrayITaskArray19 = (net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray18;
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]> charSequenceITaskArrayWhenAllTask20 = new net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]>((net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray18);
        net.goldolphin.cate.WhenAnyTask<java.lang.reflect.Type> typeWhenAnyTask21 = net.goldolphin.cate.Task.whenAny((net.goldolphin.cate.ITask<java.lang.reflect.Type, ?>[]) iTaskArray18);
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.IScheduler[]> iSchedulerArrayWhenAllTask22 = net.goldolphin.cate.Task.whenAll((net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler[], ?>[]) iTaskArray18);
        net.goldolphin.cate.ContextCollectTask<net.goldolphin.cate.SynchronizedScheduler, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> synchronizedSchedulerContextCollectTask23 = new net.goldolphin.cate.ContextCollectTask<net.goldolphin.cate.SynchronizedScheduler, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(resultContextAction16, (net.goldolphin.cate.ITask<net.goldolphin.cate.SynchronizedScheduler, ?>[]) iTaskArray18);
        net.goldolphin.cate.IContinuation iContinuation25 = net.goldolphin.cate.IContinuation.END_CONTINUATION;
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation26 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (short) -1, iContinuation25);
        net.goldolphin.cate.IContinuation iContinuation27 = synchronizedSchedulerContextCollectTask23.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation26);
        net.goldolphin.cate.Func0<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0_28 = null;
        net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0Task29 = new net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>(unitWaiterFunc0_28);
        net.goldolphin.cate.Action0 action0_31 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask32 = net.goldolphin.cate.Task.create(action0_31);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter33 = unitTask32.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter34 = unitWaiter33.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter35 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter34);
        net.goldolphin.cate.IContinuation iContinuation36 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation37 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation36);
        net.goldolphin.cate.IContinuation iContinuation38 = unitWaiter34.buildContinuation(iContinuation36);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation39 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (byte) 100, iContinuation36);
        net.goldolphin.cate.IContinuation iContinuation40 = unitWaiterFunc0Task29.buildContinuation(iContinuation36);
        net.goldolphin.cate.IContinuation iContinuation42 = net.goldolphin.cate.IContinuation.END_CONTINUATION;
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation43 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (short) -1, iContinuation42);
        net.goldolphin.cate.IContinuation iContinuation44 = unitWaiterFunc0Task29.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation43);
        net.goldolphin.cate.IContinuation iContinuation45 = synchronizedSchedulerContextCollectTask23.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation43);
        net.goldolphin.cate.IContinuation iContinuation46 = partitionedSchedulerPoolMapArrayFunc1Task1.buildContinuation(iContinuation45);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unitWaiter7);
        org.junit.Assert.assertNotNull(unitWaiter8);
        org.junit.Assert.assertNotNull(iContinuation12);
        org.junit.Assert.assertNotNull(iContinuation13);
        org.junit.Assert.assertNotNull(iContinuation15);
        org.junit.Assert.assertNotNull(iTaskArray18);
        org.junit.Assert.assertNotNull(iTaskArrayITaskArray19);
        org.junit.Assert.assertNotNull(typeWhenAnyTask21);
        org.junit.Assert.assertNotNull(iSchedulerArrayWhenAllTask22);
        org.junit.Assert.assertNotNull(iContinuation25);
        org.junit.Assert.assertNotNull(iContinuation27);
        org.junit.Assert.assertNotNull(unitTask32);
        org.junit.Assert.assertNotNull(unitWaiter33);
        org.junit.Assert.assertNotNull(unitWaiter34);
        org.junit.Assert.assertNotNull(iContinuation38);
        org.junit.Assert.assertNotNull(iContinuation40);
        org.junit.Assert.assertNotNull(iContinuation42);
        org.junit.Assert.assertNotNull(iContinuation44);
        org.junit.Assert.assertNotNull(iContinuation45);
        org.junit.Assert.assertNotNull(iContinuation46);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        net.goldolphin.cate.CollectTask.Counter counter1 = new net.goldolphin.cate.CollectTask.Counter((int) (short) 10);
        java.lang.Object[] objArray2 = counter1.getResults();
        int int3 = counter1.getComplete();
        int int4 = counter1.getComplete();
        java.lang.Object[] objArray5 = counter1.getResults();
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        net.goldolphin.cate.Action1<net.goldolphin.cate.WhenAnyTask<net.goldolphin.cate.util.ExecutorTimer>.Continuation> continuationAction1_0 = null;
        net.goldolphin.cate.Action1Task<net.goldolphin.cate.WhenAnyTask<net.goldolphin.cate.util.ExecutorTimer>.Continuation> continuationAction1Task1 = new net.goldolphin.cate.Action1Task<net.goldolphin.cate.WhenAnyTask<net.goldolphin.cate.util.ExecutorTimer>.Continuation>(continuationAction1_0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        net.goldolphin.cate.ITask<net.goldolphin.cate.FlattenTask<net.goldolphin.cate.CollectTask.Counter, net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, ?>[] counterFlattenTaskITaskArray0 = null;
        net.goldolphin.cate.WhenAnyTask<net.goldolphin.cate.FlattenTask<net.goldolphin.cate.CollectTask.Counter, net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>> counterFlattenTaskWhenAnyTask1 = net.goldolphin.cate.Task.whenAny(counterFlattenTaskITaskArray0);
        org.junit.Assert.assertNotNull(counterFlattenTaskWhenAnyTask1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        java.util.concurrent.Executor executor4 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler5 = new net.goldolphin.cate.ExecutorScheduler(executor4);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler5);
        java.util.concurrent.Executor executor7 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler8 = new net.goldolphin.cate.ExecutorScheduler(executor7);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = unitWaiter2.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler8);
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask12 = null;
        net.goldolphin.cate.Action0 action0_13 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask14 = net.goldolphin.cate.Task.create(action0_13);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter15 = unitTask14.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter16 = unitWaiter15.continueWithWaiter();
        java.util.concurrent.Executor executor17 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler18 = new net.goldolphin.cate.ExecutorScheduler(executor17);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask19 = unitWaiter15.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler18);
        java.util.concurrent.Executor executor20 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler21 = new net.goldolphin.cate.ExecutorScheduler(executor20);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask22 = unitWaiter15.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler21);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler23 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask12, (net.goldolphin.cate.IScheduler) executorScheduler21);
        java.util.concurrent.Executor executor24 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler25 = new net.goldolphin.cate.ExecutorScheduler(executor24);
        net.goldolphin.cate.IScheduler[] iSchedulerArray26 = new net.goldolphin.cate.IScheduler[] { executorScheduler8, executorScheduler11, executorScheduler21, executorScheduler25 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner27 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool28 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray26, unitWaiterFunc0TaskIPartitioner27);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore29 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool28);
        int int30 = unitWaiterFunc0TaskPartitionedSchedulerPool28.getPartitionNum();
        net.goldolphin.cate.Func0<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0_31 = null;
        net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0Task32 = new net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>(unitWaiterFunc0_31);
        net.goldolphin.cate.Func0<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0_33 = null;
        net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0Task34 = new net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>(unitWaiterFunc0_33);
        net.goldolphin.cate.Action0 action0_36 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask37 = net.goldolphin.cate.Task.create(action0_36);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter38 = unitTask37.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter39 = unitWaiter38.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter40 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter39);
        net.goldolphin.cate.IContinuation iContinuation41 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation42 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation41);
        net.goldolphin.cate.IContinuation iContinuation43 = unitWaiter39.buildContinuation(iContinuation41);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation44 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (byte) 100, iContinuation41);
        net.goldolphin.cate.IContinuation iContinuation45 = unitWaiterFunc0Task34.buildContinuation(iContinuation41);
        net.goldolphin.cate.ContextAction<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextAction47 = null;
        net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextTask48 = new net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceContextAction47);
        net.goldolphin.cate.Action0 action0_49 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask50 = net.goldolphin.cate.Task.create(action0_49);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter51 = unitTask50.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter52 = unitWaiter51.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter53 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter52);
        net.goldolphin.cate.IContinuation iContinuation54 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation55 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation54);
        net.goldolphin.cate.IContinuation iContinuation56 = unitWaiter52.buildContinuation(iContinuation54);
        net.goldolphin.cate.IContinuation iContinuation57 = charSequenceContextTask48.buildContinuation(iContinuation56);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation58 = new net.goldolphin.cate.CollectTask.IndexContinuation(10, iContinuation57);
        net.goldolphin.cate.IContinuation iContinuation59 = unitWaiterFunc0Task34.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation58);
        net.goldolphin.cate.IContinuation iContinuation60 = unitWaiterFunc0Task32.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation58);
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.IScheduler iScheduler61 = unitWaiterFunc0TaskPartitionedSchedulerPool28.getScheduler(unitWaiterFunc0Task32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitTask14);
        org.junit.Assert.assertNotNull(unitWaiter15);
        org.junit.Assert.assertNotNull(unitWaiter16);
        org.junit.Assert.assertNotNull(unitTask19);
        org.junit.Assert.assertNotNull(unitTask22);
        org.junit.Assert.assertNotNull(iSchedulerArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(unitTask37);
        org.junit.Assert.assertNotNull(unitWaiter38);
        org.junit.Assert.assertNotNull(unitWaiter39);
        org.junit.Assert.assertNotNull(iContinuation43);
        org.junit.Assert.assertNotNull(iContinuation45);
        org.junit.Assert.assertNotNull(unitTask50);
        org.junit.Assert.assertNotNull(unitWaiter51);
        org.junit.Assert.assertNotNull(unitWaiter52);
        org.junit.Assert.assertNotNull(iContinuation56);
        org.junit.Assert.assertNotNull(iContinuation57);
        org.junit.Assert.assertNotNull(iContinuation59);
        org.junit.Assert.assertNotNull(iContinuation60);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        net.goldolphin.cate.util.ExecutorTimer executorTimer0 = new net.goldolphin.cate.util.ExecutorTimer();
        executorTimer0.shutdown();
        executorTimer0.shutdown();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>> iSchedulerTaskWithSchedulerHashedPartitioner1 = net.goldolphin.cate.partitioned.HashedPartitioner.instance();
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask2 = null;
        net.goldolphin.cate.Action0 action0_3 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask4 = net.goldolphin.cate.Task.create(action0_3);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter5 = unitTask4.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter6 = unitWaiter5.continueWithWaiter();
        java.util.concurrent.Executor executor7 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler8 = new net.goldolphin.cate.ExecutorScheduler(executor7);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = unitWaiter5.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler8);
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask12 = unitWaiter5.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler11);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler13 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask2, (net.goldolphin.cate.IScheduler) executorScheduler11);
        int int15 = iSchedulerTaskWithSchedulerHashedPartitioner1.partition(iSchedulerTaskWithScheduler13, (int) (byte) 10);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore16 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((int) (byte) 1, (net.goldolphin.cate.partitioned.IPartitioner) iSchedulerTaskWithSchedulerHashedPartitioner1);
        net.goldolphin.cate.Action0 action0_17 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask18 = net.goldolphin.cate.Task.create(action0_17);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter19 = unitTask18.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter20 = unitWaiter19.continueWithWaiter();
        java.util.concurrent.Executor executor21 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler22 = new net.goldolphin.cate.ExecutorScheduler(executor21);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask23 = unitWaiter19.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler22);
        java.util.concurrent.Executor executor24 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler25 = new net.goldolphin.cate.ExecutorScheduler(executor24);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask26 = unitWaiter19.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler25);
        java.util.concurrent.Executor executor27 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler28 = new net.goldolphin.cate.ExecutorScheduler(executor27);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask29 = null;
        net.goldolphin.cate.Action0 action0_30 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask31 = net.goldolphin.cate.Task.create(action0_30);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter32 = unitTask31.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter33 = unitWaiter32.continueWithWaiter();
        java.util.concurrent.Executor executor34 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler35 = new net.goldolphin.cate.ExecutorScheduler(executor34);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask36 = unitWaiter32.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler35);
        java.util.concurrent.Executor executor37 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler38 = new net.goldolphin.cate.ExecutorScheduler(executor37);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask39 = unitWaiter32.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler38);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler40 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask29, (net.goldolphin.cate.IScheduler) executorScheduler38);
        java.util.concurrent.Executor executor41 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler42 = new net.goldolphin.cate.ExecutorScheduler(executor41);
        net.goldolphin.cate.IScheduler[] iSchedulerArray43 = new net.goldolphin.cate.IScheduler[] { executorScheduler25, executorScheduler28, executorScheduler38, executorScheduler42 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner44 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool45 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray43, unitWaiterFunc0TaskIPartitioner44);
        boolean boolean46 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore16.contains(unitWaiterFunc0TaskPartitionedSchedulerPool45);
        java.util.Map<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>[] func0TaskPartitionedSchedulerPoolMapArray47 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore16.getData();
        net.goldolphin.cate.Action0 action0_48 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask49 = net.goldolphin.cate.Task.create(action0_48);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter50 = unitTask49.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter51 = unitWaiter50.continueWithWaiter();
        java.util.concurrent.Executor executor52 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler53 = new net.goldolphin.cate.ExecutorScheduler(executor52);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask54 = unitWaiter50.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler53);
        java.util.concurrent.Executor executor55 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler56 = new net.goldolphin.cate.ExecutorScheduler(executor55);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask57 = unitWaiter50.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler56);
        java.util.concurrent.Executor executor58 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler59 = new net.goldolphin.cate.ExecutorScheduler(executor58);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask60 = null;
        net.goldolphin.cate.Action0 action0_61 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask62 = net.goldolphin.cate.Task.create(action0_61);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter63 = unitTask62.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter64 = unitWaiter63.continueWithWaiter();
        java.util.concurrent.Executor executor65 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler66 = new net.goldolphin.cate.ExecutorScheduler(executor65);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask67 = unitWaiter63.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler66);
        java.util.concurrent.Executor executor68 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler69 = new net.goldolphin.cate.ExecutorScheduler(executor68);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask70 = unitWaiter63.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler69);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler71 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask60, (net.goldolphin.cate.IScheduler) executorScheduler69);
        java.util.concurrent.Executor executor72 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler73 = new net.goldolphin.cate.ExecutorScheduler(executor72);
        net.goldolphin.cate.IScheduler[] iSchedulerArray74 = new net.goldolphin.cate.IScheduler[] { executorScheduler56, executorScheduler59, executorScheduler69, executorScheduler73 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner75 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool76 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray74, unitWaiterFunc0TaskIPartitioner75);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore77 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool76);
        net.goldolphin.cate.partitioned.IPartitioner iPartitioner78 = unitWaiterFunc0TaskPartitionedSchedulerPool76.getPartitioner();
        net.goldolphin.cate.IScheduler iScheduler79 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore16.get(unitWaiterFunc0TaskPartitionedSchedulerPool76);
        org.junit.Assert.assertNotNull(iSchedulerTaskWithSchedulerHashedPartitioner1);
        org.junit.Assert.assertNotNull(unitTask4);
        org.junit.Assert.assertNotNull(unitWaiter5);
        org.junit.Assert.assertNotNull(unitWaiter6);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitTask12);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(unitTask18);
        org.junit.Assert.assertNotNull(unitWaiter19);
        org.junit.Assert.assertNotNull(unitWaiter20);
        org.junit.Assert.assertNotNull(unitTask23);
        org.junit.Assert.assertNotNull(unitTask26);
        org.junit.Assert.assertNotNull(unitTask31);
        org.junit.Assert.assertNotNull(unitWaiter32);
        org.junit.Assert.assertNotNull(unitWaiter33);
        org.junit.Assert.assertNotNull(unitTask36);
        org.junit.Assert.assertNotNull(unitTask39);
        org.junit.Assert.assertNotNull(iSchedulerArray43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(func0TaskPartitionedSchedulerPoolMapArray47);
        org.junit.Assert.assertNotNull(unitTask49);
        org.junit.Assert.assertNotNull(unitWaiter50);
        org.junit.Assert.assertNotNull(unitWaiter51);
        org.junit.Assert.assertNotNull(unitTask54);
        org.junit.Assert.assertNotNull(unitTask57);
        org.junit.Assert.assertNotNull(unitTask62);
        org.junit.Assert.assertNotNull(unitWaiter63);
        org.junit.Assert.assertNotNull(unitWaiter64);
        org.junit.Assert.assertNotNull(unitTask67);
        org.junit.Assert.assertNotNull(unitTask70);
        org.junit.Assert.assertNotNull(iSchedulerArray74);
        org.junit.Assert.assertNull(iPartitioner78);
        org.junit.Assert.assertNull(iScheduler79);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>> iSchedulerTaskWithSchedulerHashedPartitioner1 = net.goldolphin.cate.partitioned.HashedPartitioner.instance();
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore2 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>(1, (net.goldolphin.cate.partitioned.IPartitioner) iSchedulerTaskWithSchedulerHashedPartitioner1);
        net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>> iSchedulerTaskWithSchedulerHashedPartitioner3 = net.goldolphin.cate.partitioned.HashedPartitioner.instance();
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask4 = null;
        net.goldolphin.cate.Action0 action0_5 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = net.goldolphin.cate.Task.create(action0_5);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter7 = unitTask6.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter8 = unitWaiter7.continueWithWaiter();
        java.util.concurrent.Executor executor9 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler10 = new net.goldolphin.cate.ExecutorScheduler(executor9);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask11 = unitWaiter7.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler10);
        java.util.concurrent.Executor executor12 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler13 = new net.goldolphin.cate.ExecutorScheduler(executor12);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask14 = unitWaiter7.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler13);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler15 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask4, (net.goldolphin.cate.IScheduler) executorScheduler13);
        int int17 = iSchedulerTaskWithSchedulerHashedPartitioner3.partition(iSchedulerTaskWithScheduler15, (int) (byte) 10);
        int int19 = iSchedulerTaskWithSchedulerHashedPartitioner1.partition(iSchedulerTaskWithScheduler15, (int) '4');
        net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>> iSchedulerTaskWithSchedulerHashedPartitioner20 = net.goldolphin.cate.partitioned.HashedPartitioner.instance();
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask21 = null;
        net.goldolphin.cate.Action0 action0_22 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask23 = net.goldolphin.cate.Task.create(action0_22);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter24 = unitTask23.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter25 = unitWaiter24.continueWithWaiter();
        java.util.concurrent.Executor executor26 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler27 = new net.goldolphin.cate.ExecutorScheduler(executor26);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask28 = unitWaiter24.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler27);
        java.util.concurrent.Executor executor29 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler30 = new net.goldolphin.cate.ExecutorScheduler(executor29);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask31 = unitWaiter24.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler30);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler32 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask21, (net.goldolphin.cate.IScheduler) executorScheduler30);
        int int34 = iSchedulerTaskWithSchedulerHashedPartitioner20.partition(iSchedulerTaskWithScheduler32, (int) (byte) 10);
        net.goldolphin.cate.SynchronizedScheduler synchronizedScheduler35 = new net.goldolphin.cate.SynchronizedScheduler();
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler36 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>((net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>) iSchedulerTaskWithScheduler32, (net.goldolphin.cate.IScheduler) synchronizedScheduler35);
        int int38 = iSchedulerTaskWithSchedulerHashedPartitioner1.partition(iSchedulerTaskWithScheduler36, 9);
        org.junit.Assert.assertNotNull(iSchedulerTaskWithSchedulerHashedPartitioner1);
        org.junit.Assert.assertNotNull(iSchedulerTaskWithSchedulerHashedPartitioner3);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unitWaiter7);
        org.junit.Assert.assertNotNull(unitWaiter8);
        org.junit.Assert.assertNotNull(unitTask11);
        org.junit.Assert.assertNotNull(unitTask14);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(iSchedulerTaskWithSchedulerHashedPartitioner20);
        org.junit.Assert.assertNotNull(unitTask23);
        org.junit.Assert.assertNotNull(unitWaiter24);
        org.junit.Assert.assertNotNull(unitWaiter25);
        org.junit.Assert.assertNotNull(unitTask28);
        org.junit.Assert.assertNotNull(unitTask31);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>> iSchedulerTaskWithSchedulerHashedPartitioner2 = net.goldolphin.cate.partitioned.HashedPartitioner.instance();
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.Maybe<java.lang.Comparable<java.lang.String>>, net.goldolphin.cate.Unit> strComparableMaybePartitionedStore3 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.Maybe<java.lang.Comparable<java.lang.String>>, net.goldolphin.cate.Unit>((int) '#', (net.goldolphin.cate.partitioned.IPartitioner) iSchedulerTaskWithSchedulerHashedPartitioner2);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore4 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((int) (short) 100, (net.goldolphin.cate.partitioned.IPartitioner) iSchedulerTaskWithSchedulerHashedPartitioner2);
        net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>> iSchedulerTaskWithSchedulerHashedPartitioner6 = net.goldolphin.cate.partitioned.HashedPartitioner.instance();
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask7 = null;
        net.goldolphin.cate.Action0 action0_8 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = net.goldolphin.cate.Task.create(action0_8);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter10 = unitTask9.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter11 = unitWaiter10.continueWithWaiter();
        java.util.concurrent.Executor executor12 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler13 = new net.goldolphin.cate.ExecutorScheduler(executor12);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask14 = unitWaiter10.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler13);
        java.util.concurrent.Executor executor15 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler16 = new net.goldolphin.cate.ExecutorScheduler(executor15);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask17 = unitWaiter10.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler16);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler18 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask7, (net.goldolphin.cate.IScheduler) executorScheduler16);
        int int20 = iSchedulerTaskWithSchedulerHashedPartitioner6.partition(iSchedulerTaskWithScheduler18, (int) (byte) 10);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore21 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((int) (byte) 1, (net.goldolphin.cate.partitioned.IPartitioner) iSchedulerTaskWithSchedulerHashedPartitioner6);
        net.goldolphin.cate.Action0 action0_22 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask23 = net.goldolphin.cate.Task.create(action0_22);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter24 = unitTask23.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter25 = unitWaiter24.continueWithWaiter();
        java.util.concurrent.Executor executor26 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler27 = new net.goldolphin.cate.ExecutorScheduler(executor26);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask28 = unitWaiter24.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler27);
        java.util.concurrent.Executor executor29 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler30 = new net.goldolphin.cate.ExecutorScheduler(executor29);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask31 = unitWaiter24.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler30);
        java.util.concurrent.Executor executor32 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler33 = new net.goldolphin.cate.ExecutorScheduler(executor32);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask34 = null;
        net.goldolphin.cate.Action0 action0_35 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask36 = net.goldolphin.cate.Task.create(action0_35);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter37 = unitTask36.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter38 = unitWaiter37.continueWithWaiter();
        java.util.concurrent.Executor executor39 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler40 = new net.goldolphin.cate.ExecutorScheduler(executor39);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask41 = unitWaiter37.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler40);
        java.util.concurrent.Executor executor42 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler43 = new net.goldolphin.cate.ExecutorScheduler(executor42);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask44 = unitWaiter37.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler43);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler45 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask34, (net.goldolphin.cate.IScheduler) executorScheduler43);
        java.util.concurrent.Executor executor46 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler47 = new net.goldolphin.cate.ExecutorScheduler(executor46);
        net.goldolphin.cate.IScheduler[] iSchedulerArray48 = new net.goldolphin.cate.IScheduler[] { executorScheduler30, executorScheduler33, executorScheduler43, executorScheduler47 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner49 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool50 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray48, unitWaiterFunc0TaskIPartitioner49);
        boolean boolean51 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore21.contains(unitWaiterFunc0TaskPartitionedSchedulerPool50);
        net.goldolphin.cate.Action0 action0_52 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask53 = net.goldolphin.cate.Task.create(action0_52);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter54 = unitTask53.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter55 = unitWaiter54.continueWithWaiter();
        java.util.concurrent.Executor executor56 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler57 = new net.goldolphin.cate.ExecutorScheduler(executor56);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask58 = unitWaiter54.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler57);
        java.util.concurrent.Executor executor59 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler60 = new net.goldolphin.cate.ExecutorScheduler(executor59);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask61 = unitWaiter54.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler60);
        java.util.concurrent.Executor executor62 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler63 = new net.goldolphin.cate.ExecutorScheduler(executor62);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask64 = null;
        net.goldolphin.cate.Action0 action0_65 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask66 = net.goldolphin.cate.Task.create(action0_65);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter67 = unitTask66.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter68 = unitWaiter67.continueWithWaiter();
        java.util.concurrent.Executor executor69 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler70 = new net.goldolphin.cate.ExecutorScheduler(executor69);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask71 = unitWaiter67.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler70);
        java.util.concurrent.Executor executor72 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler73 = new net.goldolphin.cate.ExecutorScheduler(executor72);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask74 = unitWaiter67.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler73);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler75 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask64, (net.goldolphin.cate.IScheduler) executorScheduler73);
        java.util.concurrent.Executor executor76 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler77 = new net.goldolphin.cate.ExecutorScheduler(executor76);
        net.goldolphin.cate.IScheduler[] iSchedulerArray78 = new net.goldolphin.cate.IScheduler[] { executorScheduler60, executorScheduler63, executorScheduler73, executorScheduler77 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner79 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool80 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray78, unitWaiterFunc0TaskIPartitioner79);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore81 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool80);
        int int82 = unitWaiterFunc0TaskPartitionedSchedulerPool80.getPartitionNum();
        net.goldolphin.cate.IScheduler iScheduler83 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore21.remove(unitWaiterFunc0TaskPartitionedSchedulerPool80);
        net.goldolphin.cate.IScheduler iScheduler84 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore4.remove(unitWaiterFunc0TaskPartitionedSchedulerPool80);
        org.junit.Assert.assertNotNull(iSchedulerTaskWithSchedulerHashedPartitioner2);
        org.junit.Assert.assertNotNull(iSchedulerTaskWithSchedulerHashedPartitioner6);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitWaiter10);
        org.junit.Assert.assertNotNull(unitWaiter11);
        org.junit.Assert.assertNotNull(unitTask14);
        org.junit.Assert.assertNotNull(unitTask17);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertNotNull(unitTask23);
        org.junit.Assert.assertNotNull(unitWaiter24);
        org.junit.Assert.assertNotNull(unitWaiter25);
        org.junit.Assert.assertNotNull(unitTask28);
        org.junit.Assert.assertNotNull(unitTask31);
        org.junit.Assert.assertNotNull(unitTask36);
        org.junit.Assert.assertNotNull(unitWaiter37);
        org.junit.Assert.assertNotNull(unitWaiter38);
        org.junit.Assert.assertNotNull(unitTask41);
        org.junit.Assert.assertNotNull(unitTask44);
        org.junit.Assert.assertNotNull(iSchedulerArray48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(unitTask53);
        org.junit.Assert.assertNotNull(unitWaiter54);
        org.junit.Assert.assertNotNull(unitWaiter55);
        org.junit.Assert.assertNotNull(unitTask58);
        org.junit.Assert.assertNotNull(unitTask61);
        org.junit.Assert.assertNotNull(unitTask66);
        org.junit.Assert.assertNotNull(unitWaiter67);
        org.junit.Assert.assertNotNull(unitWaiter68);
        org.junit.Assert.assertNotNull(unitTask71);
        org.junit.Assert.assertNotNull(unitTask74);
        org.junit.Assert.assertNotNull(iSchedulerArray78);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 4 + "'", int82 == 4);
        org.junit.Assert.assertNull(iScheduler83);
        org.junit.Assert.assertNull(iScheduler84);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        net.goldolphin.cate.ITask<java.lang.CharSequence, java.io.Serializable> charSequenceITask0 = null;
        net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable> charSequenceTaskWithInitState2 = new net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>(charSequenceITask0, (java.lang.CharSequence) "hi!");
        net.goldolphin.cate.Action0 action0_3 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask4 = net.goldolphin.cate.Task.create(action0_3);
        net.goldolphin.cate.Action0 action0_5 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = net.goldolphin.cate.Task.create(action0_5);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter7 = unitTask6.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask8 = unitTask4.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter7);
        net.goldolphin.cate.Unit unit9 = null;
        unitWaiter7.setResult(unit9);
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_11 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask12 = unitWaiter7.continueWith(unitAction1_11);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter13 = unitWaiter7.continueWithWaiter();
        net.goldolphin.cate.ContextAction<net.goldolphin.cate.CollectTask.Result, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> resultContextAction14 = null;
        net.goldolphin.cate.ITask[] iTaskArray16 = new net.goldolphin.cate.ITask[0];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[] iTaskArrayITaskArray17 = (net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray16;
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]> charSequenceITaskArrayWhenAllTask18 = new net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]>((net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray16);
        net.goldolphin.cate.WhenAnyTask<java.lang.reflect.Type> typeWhenAnyTask19 = net.goldolphin.cate.Task.whenAny((net.goldolphin.cate.ITask<java.lang.reflect.Type, ?>[]) iTaskArray16);
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.IScheduler[]> iSchedulerArrayWhenAllTask20 = net.goldolphin.cate.Task.whenAll((net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler[], ?>[]) iTaskArray16);
        net.goldolphin.cate.ContextCollectTask<net.goldolphin.cate.SynchronizedScheduler, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> synchronizedSchedulerContextCollectTask21 = new net.goldolphin.cate.ContextCollectTask<net.goldolphin.cate.SynchronizedScheduler, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(resultContextAction14, (net.goldolphin.cate.ITask<net.goldolphin.cate.SynchronizedScheduler, ?>[]) iTaskArray16);
        net.goldolphin.cate.IContinuation iContinuation23 = net.goldolphin.cate.IContinuation.END_CONTINUATION;
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation24 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (short) -1, iContinuation23);
        net.goldolphin.cate.IContinuation iContinuation25 = synchronizedSchedulerContextCollectTask21.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation24);
        net.goldolphin.cate.IContinuation iContinuation26 = unitWaiter7.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation24);
        // The following exception was thrown during execution in test generation
        try {
            net.goldolphin.cate.IContinuation iContinuation27 = charSequenceTaskWithInitState2.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitTask4);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unitWaiter7);
        org.junit.Assert.assertNotNull(unitTask8);
        org.junit.Assert.assertNotNull(unitTask12);
        org.junit.Assert.assertNotNull(unitWaiter13);
        org.junit.Assert.assertNotNull(iTaskArray16);
        org.junit.Assert.assertNotNull(iTaskArrayITaskArray17);
        org.junit.Assert.assertNotNull(typeWhenAnyTask19);
        org.junit.Assert.assertNotNull(iSchedulerArrayWhenAllTask20);
        org.junit.Assert.assertNotNull(iContinuation23);
        org.junit.Assert.assertNotNull(iContinuation25);
        org.junit.Assert.assertNotNull(iContinuation26);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>> iSchedulerTaskWithSchedulerHashedPartitioner1 = net.goldolphin.cate.partitioned.HashedPartitioner.instance();
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask2 = null;
        net.goldolphin.cate.Action0 action0_3 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask4 = net.goldolphin.cate.Task.create(action0_3);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter5 = unitTask4.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter6 = unitWaiter5.continueWithWaiter();
        java.util.concurrent.Executor executor7 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler8 = new net.goldolphin.cate.ExecutorScheduler(executor7);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = unitWaiter5.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler8);
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask12 = unitWaiter5.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler11);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler13 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask2, (net.goldolphin.cate.IScheduler) executorScheduler11);
        int int15 = iSchedulerTaskWithSchedulerHashedPartitioner1.partition(iSchedulerTaskWithScheduler13, (int) (byte) 10);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore16 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((int) (byte) 1, (net.goldolphin.cate.partitioned.IPartitioner) iSchedulerTaskWithSchedulerHashedPartitioner1);
        net.goldolphin.cate.Action0 action0_17 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask18 = net.goldolphin.cate.Task.create(action0_17);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter19 = unitTask18.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter20 = unitWaiter19.continueWithWaiter();
        java.util.concurrent.Executor executor21 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler22 = new net.goldolphin.cate.ExecutorScheduler(executor21);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask23 = unitWaiter19.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler22);
        java.util.concurrent.Executor executor24 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler25 = new net.goldolphin.cate.ExecutorScheduler(executor24);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask26 = unitWaiter19.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler25);
        java.util.concurrent.Executor executor27 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler28 = new net.goldolphin.cate.ExecutorScheduler(executor27);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask29 = null;
        net.goldolphin.cate.Action0 action0_30 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask31 = net.goldolphin.cate.Task.create(action0_30);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter32 = unitTask31.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter33 = unitWaiter32.continueWithWaiter();
        java.util.concurrent.Executor executor34 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler35 = new net.goldolphin.cate.ExecutorScheduler(executor34);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask36 = unitWaiter32.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler35);
        java.util.concurrent.Executor executor37 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler38 = new net.goldolphin.cate.ExecutorScheduler(executor37);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask39 = unitWaiter32.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler38);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler40 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask29, (net.goldolphin.cate.IScheduler) executorScheduler38);
        java.util.concurrent.Executor executor41 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler42 = new net.goldolphin.cate.ExecutorScheduler(executor41);
        net.goldolphin.cate.IScheduler[] iSchedulerArray43 = new net.goldolphin.cate.IScheduler[] { executorScheduler25, executorScheduler28, executorScheduler38, executorScheduler42 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner44 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool45 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray43, unitWaiterFunc0TaskIPartitioner44);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore46 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool45);
        int int47 = unitWaiterFunc0TaskPartitionedSchedulerPool45.getPartitionNum();
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore48 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool45);
        net.goldolphin.cate.partitioned.IPartitioner iPartitioner49 = unitWaiterFunc0TaskPartitionedSchedulerPool45.getPartitioner();
        boolean boolean50 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore16.contains(unitWaiterFunc0TaskPartitionedSchedulerPool45);
        net.goldolphin.cate.Action0 action0_51 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask52 = net.goldolphin.cate.Task.create(action0_51);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter53 = unitTask52.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter54 = unitWaiter53.continueWithWaiter();
        java.util.concurrent.Executor executor55 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler56 = new net.goldolphin.cate.ExecutorScheduler(executor55);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask57 = unitWaiter53.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler56);
        java.util.concurrent.Executor executor58 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler59 = new net.goldolphin.cate.ExecutorScheduler(executor58);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask60 = unitWaiter53.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler59);
        java.util.concurrent.Executor executor61 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler62 = new net.goldolphin.cate.ExecutorScheduler(executor61);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask63 = null;
        net.goldolphin.cate.Action0 action0_64 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask65 = net.goldolphin.cate.Task.create(action0_64);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter66 = unitTask65.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter67 = unitWaiter66.continueWithWaiter();
        java.util.concurrent.Executor executor68 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler69 = new net.goldolphin.cate.ExecutorScheduler(executor68);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask70 = unitWaiter66.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler69);
        java.util.concurrent.Executor executor71 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler72 = new net.goldolphin.cate.ExecutorScheduler(executor71);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask73 = unitWaiter66.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler72);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler74 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask63, (net.goldolphin.cate.IScheduler) executorScheduler72);
        java.util.concurrent.Executor executor75 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler76 = new net.goldolphin.cate.ExecutorScheduler(executor75);
        net.goldolphin.cate.IScheduler[] iSchedulerArray77 = new net.goldolphin.cate.IScheduler[] { executorScheduler59, executorScheduler62, executorScheduler72, executorScheduler76 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner78 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool79 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray77, unitWaiterFunc0TaskIPartitioner78);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore80 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool79);
        net.goldolphin.cate.partitioned.IPartitioner iPartitioner81 = unitWaiterFunc0TaskPartitionedSchedulerPool79.getPartitioner();
        net.goldolphin.cate.Action0 action0_82 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask83 = net.goldolphin.cate.Task.create(action0_82);
        net.goldolphin.cate.util.ExecutorTimer executorTimer84 = new net.goldolphin.cate.util.ExecutorTimer();
        net.goldolphin.cate.Action0 action0_85 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask86 = net.goldolphin.cate.Task.create(action0_85);
        net.goldolphin.cate.Action0 action0_87 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask88 = net.goldolphin.cate.Task.create(action0_87);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter89 = unitTask88.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask90 = unitTask86.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter89);
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_91 = null;
        java.util.concurrent.TimeUnit timeUnit93 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Maybe<net.goldolphin.cate.Unit>> unitTask94 = executorTimer84.withTimeout((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitTask86, unitAction1_91, (long) (byte) -1, timeUnit93);
        net.goldolphin.cate.SynchronizedScheduler synchronizedScheduler95 = new net.goldolphin.cate.SynchronizedScheduler();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask96 = unitTask86.withScheduler((net.goldolphin.cate.IScheduler) synchronizedScheduler95);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask97 = unitTask83.withScheduler((net.goldolphin.cate.IScheduler) synchronizedScheduler95);
        waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore16.put(unitWaiterFunc0TaskPartitionedSchedulerPool79, (net.goldolphin.cate.IScheduler) synchronizedScheduler95);
        org.junit.Assert.assertNotNull(iSchedulerTaskWithSchedulerHashedPartitioner1);
        org.junit.Assert.assertNotNull(unitTask4);
        org.junit.Assert.assertNotNull(unitWaiter5);
        org.junit.Assert.assertNotNull(unitWaiter6);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitTask12);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(unitTask18);
        org.junit.Assert.assertNotNull(unitWaiter19);
        org.junit.Assert.assertNotNull(unitWaiter20);
        org.junit.Assert.assertNotNull(unitTask23);
        org.junit.Assert.assertNotNull(unitTask26);
        org.junit.Assert.assertNotNull(unitTask31);
        org.junit.Assert.assertNotNull(unitWaiter32);
        org.junit.Assert.assertNotNull(unitWaiter33);
        org.junit.Assert.assertNotNull(unitTask36);
        org.junit.Assert.assertNotNull(unitTask39);
        org.junit.Assert.assertNotNull(iSchedulerArray43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 4 + "'", int47 == 4);
        org.junit.Assert.assertNull(iPartitioner49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(unitTask52);
        org.junit.Assert.assertNotNull(unitWaiter53);
        org.junit.Assert.assertNotNull(unitWaiter54);
        org.junit.Assert.assertNotNull(unitTask57);
        org.junit.Assert.assertNotNull(unitTask60);
        org.junit.Assert.assertNotNull(unitTask65);
        org.junit.Assert.assertNotNull(unitWaiter66);
        org.junit.Assert.assertNotNull(unitWaiter67);
        org.junit.Assert.assertNotNull(unitTask70);
        org.junit.Assert.assertNotNull(unitTask73);
        org.junit.Assert.assertNotNull(iSchedulerArray77);
        org.junit.Assert.assertNull(iPartitioner81);
        org.junit.Assert.assertNotNull(unitTask83);
        org.junit.Assert.assertNotNull(unitTask86);
        org.junit.Assert.assertNotNull(unitTask88);
        org.junit.Assert.assertNotNull(unitWaiter89);
        org.junit.Assert.assertNotNull(unitTask90);
        org.junit.Assert.assertNotNull(unitTask94);
        org.junit.Assert.assertNotNull(unitTask96);
        org.junit.Assert.assertNotNull(unitTask97);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Action0Task action0Task1 = new net.goldolphin.cate.Action0Task(action0_0);
        net.goldolphin.cate.ITask[] iTaskArray3 = new net.goldolphin.cate.ITask[0];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[] charSequenceITaskArray4 = (net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]) iTaskArray3;
        net.goldolphin.cate.WhenAllTask<java.lang.CharSequence> charSequenceWhenAllTask5 = net.goldolphin.cate.Task.whenAll(charSequenceITaskArray4);
        net.goldolphin.cate.WhenAllTask<java.lang.CharSequence> charSequenceWhenAllTask6 = new net.goldolphin.cate.WhenAllTask<java.lang.CharSequence>(charSequenceITaskArray4);
        net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[] charSequenceITaskArray7 = charSequenceWhenAllTask6.getTasks();
        net.goldolphin.cate.ContextAction<net.goldolphin.cate.CollectTask.Result, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> resultContextAction8 = null;
        net.goldolphin.cate.ITask[] iTaskArray10 = new net.goldolphin.cate.ITask[0];
        @SuppressWarnings("unchecked")
        net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[] iTaskArrayITaskArray11 = (net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray10;
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]> charSequenceITaskArrayWhenAllTask12 = new net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]>((net.goldolphin.cate.ITask<net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[], ?>[]) iTaskArray10);
        net.goldolphin.cate.WhenAnyTask<java.lang.reflect.Type> typeWhenAnyTask13 = net.goldolphin.cate.Task.whenAny((net.goldolphin.cate.ITask<java.lang.reflect.Type, ?>[]) iTaskArray10);
        net.goldolphin.cate.WhenAllTask<net.goldolphin.cate.IScheduler[]> iSchedulerArrayWhenAllTask14 = net.goldolphin.cate.Task.whenAll((net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler[], ?>[]) iTaskArray10);
        net.goldolphin.cate.ContextCollectTask<net.goldolphin.cate.SynchronizedScheduler, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> synchronizedSchedulerContextCollectTask15 = new net.goldolphin.cate.ContextCollectTask<net.goldolphin.cate.SynchronizedScheduler, net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(resultContextAction8, (net.goldolphin.cate.ITask<net.goldolphin.cate.SynchronizedScheduler, ?>[]) iTaskArray10);
        net.goldolphin.cate.IContinuation iContinuation17 = net.goldolphin.cate.IContinuation.END_CONTINUATION;
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation18 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (short) -1, iContinuation17);
        net.goldolphin.cate.IContinuation iContinuation19 = synchronizedSchedulerContextCollectTask15.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation18);
        net.goldolphin.cate.Func0<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0_20 = null;
        net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0Task21 = new net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>(unitWaiterFunc0_20);
        net.goldolphin.cate.Action0 action0_23 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask24 = net.goldolphin.cate.Task.create(action0_23);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter25 = unitTask24.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter26 = unitWaiter25.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter27 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter26);
        net.goldolphin.cate.IContinuation iContinuation28 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation29 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation28);
        net.goldolphin.cate.IContinuation iContinuation30 = unitWaiter26.buildContinuation(iContinuation28);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation31 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (byte) 100, iContinuation28);
        net.goldolphin.cate.IContinuation iContinuation32 = unitWaiterFunc0Task21.buildContinuation(iContinuation28);
        net.goldolphin.cate.IContinuation iContinuation34 = net.goldolphin.cate.IContinuation.END_CONTINUATION;
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation35 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (short) -1, iContinuation34);
        net.goldolphin.cate.IContinuation iContinuation36 = unitWaiterFunc0Task21.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation35);
        net.goldolphin.cate.IContinuation iContinuation37 = synchronizedSchedulerContextCollectTask15.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation35);
        net.goldolphin.cate.IContinuation iContinuation38 = charSequenceWhenAllTask6.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation35);
        net.goldolphin.cate.Action0 action0_39 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask40 = net.goldolphin.cate.Task.create(action0_39);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter41 = unitTask40.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter42 = unitWaiter41.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter43 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter42);
        net.goldolphin.cate.IContinuation iContinuation44 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation45 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation44);
        net.goldolphin.cate.IContinuation iContinuation46 = unitWaiter42.buildContinuation(iContinuation44);
        net.goldolphin.cate.Action0 action0_47 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask48 = net.goldolphin.cate.Task.create(action0_47);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter49 = unitTask48.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter50 = unitWaiter49.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter51 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter50);
        net.goldolphin.cate.IContinuation iContinuation52 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation53 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation52);
        net.goldolphin.cate.IContinuation iContinuation54 = unitWaiter50.buildContinuation(iContinuation52);
        net.goldolphin.cate.IContinuation[] iContinuationArray55 = new net.goldolphin.cate.IContinuation[] { iContinuation44, iContinuation54 };
        net.goldolphin.cate.ContextCollectTask.DispatcherContinuation dispatcherContinuation56 = new net.goldolphin.cate.ContextCollectTask.DispatcherContinuation(iContinuationArray55);
        net.goldolphin.cate.IContinuation[] iContinuationArray57 = new net.goldolphin.cate.IContinuation[] { dispatcherContinuation56 };
        net.goldolphin.cate.ContextCollectTask.DispatcherContinuation dispatcherContinuation58 = new net.goldolphin.cate.ContextCollectTask.DispatcherContinuation(iContinuationArray57);
        net.goldolphin.cate.IContinuation iContinuation59 = charSequenceWhenAllTask6.buildContinuation((net.goldolphin.cate.IContinuation) dispatcherContinuation58);
        net.goldolphin.cate.IContinuation iContinuation60 = action0Task1.buildContinuation(iContinuation59);
        net.goldolphin.cate.FlattenTask.Continuation continuation61 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation59);
        org.junit.Assert.assertNotNull(iTaskArray3);
        org.junit.Assert.assertNotNull(charSequenceITaskArray4);
        org.junit.Assert.assertNotNull(charSequenceWhenAllTask5);
        org.junit.Assert.assertNotNull(charSequenceITaskArray7);
        org.junit.Assert.assertNotNull(iTaskArray10);
        org.junit.Assert.assertNotNull(iTaskArrayITaskArray11);
        org.junit.Assert.assertNotNull(typeWhenAnyTask13);
        org.junit.Assert.assertNotNull(iSchedulerArrayWhenAllTask14);
        org.junit.Assert.assertNotNull(iContinuation17);
        org.junit.Assert.assertNotNull(iContinuation19);
        org.junit.Assert.assertNotNull(unitTask24);
        org.junit.Assert.assertNotNull(unitWaiter25);
        org.junit.Assert.assertNotNull(unitWaiter26);
        org.junit.Assert.assertNotNull(iContinuation30);
        org.junit.Assert.assertNotNull(iContinuation32);
        org.junit.Assert.assertNotNull(iContinuation34);
        org.junit.Assert.assertNotNull(iContinuation36);
        org.junit.Assert.assertNotNull(iContinuation37);
        org.junit.Assert.assertNotNull(iContinuation38);
        org.junit.Assert.assertNotNull(unitTask40);
        org.junit.Assert.assertNotNull(unitWaiter41);
        org.junit.Assert.assertNotNull(unitWaiter42);
        org.junit.Assert.assertNotNull(iContinuation46);
        org.junit.Assert.assertNotNull(unitTask48);
        org.junit.Assert.assertNotNull(unitWaiter49);
        org.junit.Assert.assertNotNull(unitWaiter50);
        org.junit.Assert.assertNotNull(iContinuation54);
        org.junit.Assert.assertNotNull(iContinuationArray55);
        org.junit.Assert.assertNotNull(iContinuationArray57);
        org.junit.Assert.assertNotNull(iContinuation59);
        org.junit.Assert.assertNotNull(iContinuation60);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_3 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask4 = unitTask1.continueWith(unitAction1_3);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitTask5 = unitTask1.flatten();
        java.util.concurrent.Executor executor6 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler7 = new net.goldolphin.cate.ExecutorScheduler(executor6);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask8 = unitTask1.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler7);
        net.goldolphin.cate.Action0 action0_9 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask10 = net.goldolphin.cate.Task.create(action0_9);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter11 = unitTask10.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter12 = unitWaiter11.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_13 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask14 = unitWaiter11.continueWith(unitAction1_13);
        net.goldolphin.cate.Action0 action0_15 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask16 = net.goldolphin.cate.Task.create(action0_15);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter17 = unitTask16.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_18 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask19 = unitTask16.continueWith(unitAction1_18);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitTask20 = unitTask16.flatten();
        java.util.concurrent.Executor executor21 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler22 = new net.goldolphin.cate.ExecutorScheduler(executor21);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask23 = unitTask16.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler22);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask24 = unitWaiter11.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler22);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask25 = unitTask8.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler22);
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitTask4);
        org.junit.Assert.assertNotNull(unitTask5);
        org.junit.Assert.assertNotNull(unitTask8);
        org.junit.Assert.assertNotNull(unitTask10);
        org.junit.Assert.assertNotNull(unitWaiter11);
        org.junit.Assert.assertNotNull(unitWaiter12);
        org.junit.Assert.assertNotNull(unitTask14);
        org.junit.Assert.assertNotNull(unitTask16);
        org.junit.Assert.assertNotNull(unitWaiter17);
        org.junit.Assert.assertNotNull(unitTask19);
        org.junit.Assert.assertNotNull(unitTask20);
        org.junit.Assert.assertNotNull(unitTask23);
        org.junit.Assert.assertNotNull(unitTask24);
        org.junit.Assert.assertNotNull(unitTask25);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>> iSchedulerTaskWithSchedulerHashedPartitioner1 = net.goldolphin.cate.partitioned.HashedPartitioner.instance();
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask2 = null;
        net.goldolphin.cate.Action0 action0_3 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask4 = net.goldolphin.cate.Task.create(action0_3);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter5 = unitTask4.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter6 = unitWaiter5.continueWithWaiter();
        java.util.concurrent.Executor executor7 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler8 = new net.goldolphin.cate.ExecutorScheduler(executor7);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = unitWaiter5.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler8);
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask12 = unitWaiter5.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler11);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler13 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask2, (net.goldolphin.cate.IScheduler) executorScheduler11);
        int int15 = iSchedulerTaskWithSchedulerHashedPartitioner1.partition(iSchedulerTaskWithScheduler13, (int) (byte) 10);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore16 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((int) (byte) 1, (net.goldolphin.cate.partitioned.IPartitioner) iSchedulerTaskWithSchedulerHashedPartitioner1);
        net.goldolphin.cate.Action0 action0_17 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask18 = net.goldolphin.cate.Task.create(action0_17);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter19 = unitTask18.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter20 = unitWaiter19.continueWithWaiter();
        java.util.concurrent.Executor executor21 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler22 = new net.goldolphin.cate.ExecutorScheduler(executor21);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask23 = unitWaiter19.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler22);
        java.util.concurrent.Executor executor24 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler25 = new net.goldolphin.cate.ExecutorScheduler(executor24);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask26 = unitWaiter19.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler25);
        java.util.concurrent.Executor executor27 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler28 = new net.goldolphin.cate.ExecutorScheduler(executor27);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask29 = null;
        net.goldolphin.cate.Action0 action0_30 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask31 = net.goldolphin.cate.Task.create(action0_30);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter32 = unitTask31.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter33 = unitWaiter32.continueWithWaiter();
        java.util.concurrent.Executor executor34 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler35 = new net.goldolphin.cate.ExecutorScheduler(executor34);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask36 = unitWaiter32.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler35);
        java.util.concurrent.Executor executor37 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler38 = new net.goldolphin.cate.ExecutorScheduler(executor37);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask39 = unitWaiter32.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler38);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler40 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask29, (net.goldolphin.cate.IScheduler) executorScheduler38);
        java.util.concurrent.Executor executor41 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler42 = new net.goldolphin.cate.ExecutorScheduler(executor41);
        net.goldolphin.cate.IScheduler[] iSchedulerArray43 = new net.goldolphin.cate.IScheduler[] { executorScheduler25, executorScheduler28, executorScheduler38, executorScheduler42 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner44 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool45 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray43, unitWaiterFunc0TaskIPartitioner44);
        boolean boolean46 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore16.contains(unitWaiterFunc0TaskPartitionedSchedulerPool45);
        java.util.Map<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>[] func0TaskPartitionedSchedulerPoolMapArray47 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore16.getData();
        net.goldolphin.cate.Action0 action0_48 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask49 = net.goldolphin.cate.Task.create(action0_48);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter50 = unitTask49.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter51 = unitWaiter50.continueWithWaiter();
        java.util.concurrent.Executor executor52 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler53 = new net.goldolphin.cate.ExecutorScheduler(executor52);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask54 = unitWaiter50.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler53);
        java.util.concurrent.Executor executor55 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler56 = new net.goldolphin.cate.ExecutorScheduler(executor55);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask57 = unitWaiter50.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler56);
        java.util.concurrent.Executor executor58 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler59 = new net.goldolphin.cate.ExecutorScheduler(executor58);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask60 = null;
        net.goldolphin.cate.Action0 action0_61 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask62 = net.goldolphin.cate.Task.create(action0_61);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter63 = unitTask62.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter64 = unitWaiter63.continueWithWaiter();
        java.util.concurrent.Executor executor65 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler66 = new net.goldolphin.cate.ExecutorScheduler(executor65);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask67 = unitWaiter63.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler66);
        java.util.concurrent.Executor executor68 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler69 = new net.goldolphin.cate.ExecutorScheduler(executor68);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask70 = unitWaiter63.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler69);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler71 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask60, (net.goldolphin.cate.IScheduler) executorScheduler69);
        java.util.concurrent.Executor executor72 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler73 = new net.goldolphin.cate.ExecutorScheduler(executor72);
        net.goldolphin.cate.IScheduler[] iSchedulerArray74 = new net.goldolphin.cate.IScheduler[] { executorScheduler56, executorScheduler59, executorScheduler69, executorScheduler73 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner75 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool76 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray74, unitWaiterFunc0TaskIPartitioner75);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore77 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool76);
        int int78 = unitWaiterFunc0TaskPartitionedSchedulerPool76.getPartitionNum();
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore79 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool76);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.CollectTask<java.lang.CharSequence, java.lang.Object[]>, java.lang.reflect.AnnotatedElement> charSequenceCollectTaskPartitionedStore80 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.CollectTask<java.lang.CharSequence, java.lang.Object[]>, java.lang.reflect.AnnotatedElement>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool76);
        boolean boolean81 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore16.contains(unitWaiterFunc0TaskPartitionedSchedulerPool76);
        org.junit.Assert.assertNotNull(iSchedulerTaskWithSchedulerHashedPartitioner1);
        org.junit.Assert.assertNotNull(unitTask4);
        org.junit.Assert.assertNotNull(unitWaiter5);
        org.junit.Assert.assertNotNull(unitWaiter6);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitTask12);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(unitTask18);
        org.junit.Assert.assertNotNull(unitWaiter19);
        org.junit.Assert.assertNotNull(unitWaiter20);
        org.junit.Assert.assertNotNull(unitTask23);
        org.junit.Assert.assertNotNull(unitTask26);
        org.junit.Assert.assertNotNull(unitTask31);
        org.junit.Assert.assertNotNull(unitWaiter32);
        org.junit.Assert.assertNotNull(unitWaiter33);
        org.junit.Assert.assertNotNull(unitTask36);
        org.junit.Assert.assertNotNull(unitTask39);
        org.junit.Assert.assertNotNull(iSchedulerArray43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(func0TaskPartitionedSchedulerPoolMapArray47);
        org.junit.Assert.assertNotNull(unitTask49);
        org.junit.Assert.assertNotNull(unitWaiter50);
        org.junit.Assert.assertNotNull(unitWaiter51);
        org.junit.Assert.assertNotNull(unitTask54);
        org.junit.Assert.assertNotNull(unitTask57);
        org.junit.Assert.assertNotNull(unitTask62);
        org.junit.Assert.assertNotNull(unitWaiter63);
        org.junit.Assert.assertNotNull(unitWaiter64);
        org.junit.Assert.assertNotNull(unitTask67);
        org.junit.Assert.assertNotNull(unitTask70);
        org.junit.Assert.assertNotNull(iSchedulerArray74);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 4 + "'", int78 == 4);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>> iSchedulerTaskWithSchedulerHashedPartitioner1 = net.goldolphin.cate.partitioned.HashedPartitioner.instance();
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask2 = null;
        net.goldolphin.cate.Action0 action0_3 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask4 = net.goldolphin.cate.Task.create(action0_3);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter5 = unitTask4.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter6 = unitWaiter5.continueWithWaiter();
        java.util.concurrent.Executor executor7 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler8 = new net.goldolphin.cate.ExecutorScheduler(executor7);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = unitWaiter5.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler8);
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask12 = unitWaiter5.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler11);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler13 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask2, (net.goldolphin.cate.IScheduler) executorScheduler11);
        int int15 = iSchedulerTaskWithSchedulerHashedPartitioner1.partition(iSchedulerTaskWithScheduler13, (int) (byte) 10);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore16 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((int) (byte) 1, (net.goldolphin.cate.partitioned.IPartitioner) iSchedulerTaskWithSchedulerHashedPartitioner1);
        net.goldolphin.cate.Action0 action0_17 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask18 = net.goldolphin.cate.Task.create(action0_17);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter19 = unitTask18.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter20 = unitWaiter19.continueWithWaiter();
        java.util.concurrent.Executor executor21 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler22 = new net.goldolphin.cate.ExecutorScheduler(executor21);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask23 = unitWaiter19.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler22);
        java.util.concurrent.Executor executor24 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler25 = new net.goldolphin.cate.ExecutorScheduler(executor24);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask26 = unitWaiter19.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler25);
        java.util.concurrent.Executor executor27 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler28 = new net.goldolphin.cate.ExecutorScheduler(executor27);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask29 = null;
        net.goldolphin.cate.Action0 action0_30 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask31 = net.goldolphin.cate.Task.create(action0_30);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter32 = unitTask31.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter33 = unitWaiter32.continueWithWaiter();
        java.util.concurrent.Executor executor34 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler35 = new net.goldolphin.cate.ExecutorScheduler(executor34);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask36 = unitWaiter32.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler35);
        java.util.concurrent.Executor executor37 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler38 = new net.goldolphin.cate.ExecutorScheduler(executor37);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask39 = unitWaiter32.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler38);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler40 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask29, (net.goldolphin.cate.IScheduler) executorScheduler38);
        java.util.concurrent.Executor executor41 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler42 = new net.goldolphin.cate.ExecutorScheduler(executor41);
        net.goldolphin.cate.IScheduler[] iSchedulerArray43 = new net.goldolphin.cate.IScheduler[] { executorScheduler25, executorScheduler28, executorScheduler38, executorScheduler42 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner44 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool45 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray43, unitWaiterFunc0TaskIPartitioner44);
        boolean boolean46 = waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore16.contains(unitWaiterFunc0TaskPartitionedSchedulerPool45);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore47 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool45);
        org.junit.Assert.assertNotNull(iSchedulerTaskWithSchedulerHashedPartitioner1);
        org.junit.Assert.assertNotNull(unitTask4);
        org.junit.Assert.assertNotNull(unitWaiter5);
        org.junit.Assert.assertNotNull(unitWaiter6);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitTask12);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(unitTask18);
        org.junit.Assert.assertNotNull(unitWaiter19);
        org.junit.Assert.assertNotNull(unitWaiter20);
        org.junit.Assert.assertNotNull(unitTask23);
        org.junit.Assert.assertNotNull(unitTask26);
        org.junit.Assert.assertNotNull(unitTask31);
        org.junit.Assert.assertNotNull(unitWaiter32);
        org.junit.Assert.assertNotNull(unitWaiter33);
        org.junit.Assert.assertNotNull(unitTask36);
        org.junit.Assert.assertNotNull(unitTask39);
        org.junit.Assert.assertNotNull(iSchedulerArray43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        net.goldolphin.cate.util.ExecutorTimer executorTimer0 = new net.goldolphin.cate.util.ExecutorTimer();
        net.goldolphin.cate.Action0 action0_1 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask2 = net.goldolphin.cate.Task.create(action0_1);
        net.goldolphin.cate.Action0 action0_3 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask4 = net.goldolphin.cate.Task.create(action0_3);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter5 = unitTask4.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask6 = unitTask2.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter5);
        net.goldolphin.cate.Unit unit7 = null;
        unitWaiter5.setResult(unit7);
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_9 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask10 = unitWaiter5.continueWith(unitAction1_9);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter11 = unitWaiter5.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Maybe<net.goldolphin.cate.Unit>> unitTask15 = executorTimer0.withTimeout((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter11, unitAction1_12, (long) (byte) 1, timeUnit14);
        executorTimer0.shutdown();
        java.util.concurrent.TimeUnit timeUnit18 = null;
        net.goldolphin.cate.Task<?, ?> wildcardTask19 = executorTimer0.delay(1L, timeUnit18);
        executorTimer0.shutdown();
        org.junit.Assert.assertNotNull(unitTask2);
        org.junit.Assert.assertNotNull(unitTask4);
        org.junit.Assert.assertNotNull(unitWaiter5);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(unitTask10);
        org.junit.Assert.assertNotNull(unitWaiter11);
        org.junit.Assert.assertNotNull(unitTask15);
        org.junit.Assert.assertNotNull(wildcardTask19);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        net.goldolphin.cate.ContextAction<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextAction0 = null;
        net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextTask1 = new net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceContextAction0);
        net.goldolphin.cate.Action0 action0_2 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask3 = net.goldolphin.cate.Task.create(action0_2);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter4 = unitTask3.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter5 = unitWaiter4.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter6 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter5);
        net.goldolphin.cate.IContinuation iContinuation7 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation8 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation7);
        net.goldolphin.cate.IContinuation iContinuation9 = unitWaiter5.buildContinuation(iContinuation7);
        net.goldolphin.cate.IContinuation iContinuation10 = charSequenceContextTask1.buildContinuation(iContinuation9);
        net.goldolphin.cate.Action0 action0_11 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask12 = net.goldolphin.cate.Task.create(action0_11);
        net.goldolphin.cate.ContextAction<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextAction14 = null;
        net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextTask15 = new net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceContextAction14);
        net.goldolphin.cate.Action0 action0_16 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask17 = net.goldolphin.cate.Task.create(action0_16);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter18 = unitTask17.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter19 = unitWaiter18.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter20 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter19);
        net.goldolphin.cate.IContinuation iContinuation21 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation22 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation21);
        net.goldolphin.cate.IContinuation iContinuation23 = unitWaiter19.buildContinuation(iContinuation21);
        net.goldolphin.cate.IContinuation iContinuation24 = charSequenceContextTask15.buildContinuation(iContinuation23);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation25 = new net.goldolphin.cate.CollectTask.IndexContinuation(10, iContinuation24);
        net.goldolphin.cate.IContinuation iContinuation26 = unitTask12.buildContinuation(iContinuation24);
        net.goldolphin.cate.IContinuation iContinuation27 = charSequenceContextTask1.buildContinuation(iContinuation24);
        net.goldolphin.cate.IdenticalTask<java.lang.String> strIdenticalTask28 = net.goldolphin.cate.IdenticalTask.instance();
        net.goldolphin.cate.ContextAction<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextAction30 = null;
        net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextTask31 = new net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceContextAction30);
        net.goldolphin.cate.Action0 action0_32 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask33 = net.goldolphin.cate.Task.create(action0_32);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter34 = unitTask33.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter35 = unitWaiter34.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter36 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter35);
        net.goldolphin.cate.IContinuation iContinuation37 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation38 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation37);
        net.goldolphin.cate.IContinuation iContinuation39 = unitWaiter35.buildContinuation(iContinuation37);
        net.goldolphin.cate.IContinuation iContinuation40 = charSequenceContextTask31.buildContinuation(iContinuation39);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation41 = new net.goldolphin.cate.CollectTask.IndexContinuation(10, iContinuation40);
        net.goldolphin.cate.IContinuation iContinuation42 = strIdenticalTask28.buildContinuation(iContinuation40);
        net.goldolphin.cate.IContinuation iContinuation43 = charSequenceContextTask1.buildContinuation(iContinuation42);
        net.goldolphin.cate.Action0 action0_44 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask45 = net.goldolphin.cate.Task.create(action0_44);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter46 = unitTask45.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter47 = unitWaiter46.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter48 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter47);
        net.goldolphin.cate.IContinuation iContinuation49 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation50 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation49);
        net.goldolphin.cate.IContinuation iContinuation51 = unitWaiter47.buildContinuation(iContinuation49);
        net.goldolphin.cate.Action0 action0_52 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask53 = net.goldolphin.cate.Task.create(action0_52);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter54 = unitTask53.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter55 = unitWaiter54.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter56 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter55);
        net.goldolphin.cate.IContinuation iContinuation57 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation58 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation57);
        net.goldolphin.cate.IContinuation iContinuation59 = unitWaiter55.buildContinuation(iContinuation57);
        net.goldolphin.cate.IContinuation[] iContinuationArray60 = new net.goldolphin.cate.IContinuation[] { iContinuation49, iContinuation59 };
        net.goldolphin.cate.ContextCollectTask.DispatcherContinuation dispatcherContinuation61 = new net.goldolphin.cate.ContextCollectTask.DispatcherContinuation(iContinuationArray60);
        net.goldolphin.cate.IContinuation iContinuation62 = charSequenceContextTask1.buildContinuation((net.goldolphin.cate.IContinuation) dispatcherContinuation61);
        net.goldolphin.cate.Func0<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0_63 = null;
        net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0Task64 = new net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>(unitWaiterFunc0_63);
        net.goldolphin.cate.Func0<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0_65 = null;
        net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0Task66 = new net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>(unitWaiterFunc0_65);
        net.goldolphin.cate.Action0 action0_68 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask69 = net.goldolphin.cate.Task.create(action0_68);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter70 = unitTask69.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter71 = unitWaiter70.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter72 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter71);
        net.goldolphin.cate.IContinuation iContinuation73 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation74 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation73);
        net.goldolphin.cate.IContinuation iContinuation75 = unitWaiter71.buildContinuation(iContinuation73);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation76 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (byte) 100, iContinuation73);
        net.goldolphin.cate.IContinuation iContinuation77 = unitWaiterFunc0Task66.buildContinuation(iContinuation73);
        net.goldolphin.cate.ContextAction<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextAction79 = null;
        net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceContextTask80 = new net.goldolphin.cate.ContextTask<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(charSequenceContextAction79);
        net.goldolphin.cate.Action0 action0_81 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask82 = net.goldolphin.cate.Task.create(action0_81);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter83 = unitTask82.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter84 = unitWaiter83.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter85 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter84);
        net.goldolphin.cate.IContinuation iContinuation86 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation87 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation86);
        net.goldolphin.cate.IContinuation iContinuation88 = unitWaiter84.buildContinuation(iContinuation86);
        net.goldolphin.cate.IContinuation iContinuation89 = charSequenceContextTask80.buildContinuation(iContinuation88);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation90 = new net.goldolphin.cate.CollectTask.IndexContinuation(10, iContinuation89);
        net.goldolphin.cate.IContinuation iContinuation91 = unitWaiterFunc0Task66.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation90);
        net.goldolphin.cate.IContinuation iContinuation92 = unitWaiterFunc0Task64.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation90);
        net.goldolphin.cate.IContinuation iContinuation93 = charSequenceContextTask1.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation90);
        org.junit.Assert.assertNotNull(unitTask3);
        org.junit.Assert.assertNotNull(unitWaiter4);
        org.junit.Assert.assertNotNull(unitWaiter5);
        org.junit.Assert.assertNotNull(iContinuation9);
        org.junit.Assert.assertNotNull(iContinuation10);
        org.junit.Assert.assertNotNull(unitTask12);
        org.junit.Assert.assertNotNull(unitTask17);
        org.junit.Assert.assertNotNull(unitWaiter18);
        org.junit.Assert.assertNotNull(unitWaiter19);
        org.junit.Assert.assertNotNull(iContinuation23);
        org.junit.Assert.assertNotNull(iContinuation24);
        org.junit.Assert.assertNotNull(iContinuation26);
        org.junit.Assert.assertNotNull(iContinuation27);
        org.junit.Assert.assertNotNull(strIdenticalTask28);
        org.junit.Assert.assertNotNull(unitTask33);
        org.junit.Assert.assertNotNull(unitWaiter34);
        org.junit.Assert.assertNotNull(unitWaiter35);
        org.junit.Assert.assertNotNull(iContinuation39);
        org.junit.Assert.assertNotNull(iContinuation40);
        org.junit.Assert.assertNotNull(iContinuation42);
        org.junit.Assert.assertNotNull(iContinuation43);
        org.junit.Assert.assertNotNull(unitTask45);
        org.junit.Assert.assertNotNull(unitWaiter46);
        org.junit.Assert.assertNotNull(unitWaiter47);
        org.junit.Assert.assertNotNull(iContinuation51);
        org.junit.Assert.assertNotNull(unitTask53);
        org.junit.Assert.assertNotNull(unitWaiter54);
        org.junit.Assert.assertNotNull(unitWaiter55);
        org.junit.Assert.assertNotNull(iContinuation59);
        org.junit.Assert.assertNotNull(iContinuationArray60);
        org.junit.Assert.assertNotNull(iContinuation62);
        org.junit.Assert.assertNotNull(unitTask69);
        org.junit.Assert.assertNotNull(unitWaiter70);
        org.junit.Assert.assertNotNull(unitWaiter71);
        org.junit.Assert.assertNotNull(iContinuation75);
        org.junit.Assert.assertNotNull(iContinuation77);
        org.junit.Assert.assertNotNull(unitTask82);
        org.junit.Assert.assertNotNull(unitWaiter83);
        org.junit.Assert.assertNotNull(unitWaiter84);
        org.junit.Assert.assertNotNull(iContinuation88);
        org.junit.Assert.assertNotNull(iContinuation89);
        org.junit.Assert.assertNotNull(iContinuation91);
        org.junit.Assert.assertNotNull(iContinuation92);
        org.junit.Assert.assertNotNull(iContinuation93);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>> iSchedulerTaskWithSchedulerHashedPartitioner3 = net.goldolphin.cate.partitioned.HashedPartitioner.instance();
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore4 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>(7, (net.goldolphin.cate.partitioned.IPartitioner) iSchedulerTaskWithSchedulerHashedPartitioner3);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore5 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((int) (short) 1, (net.goldolphin.cate.partitioned.IPartitioner) iSchedulerTaskWithSchedulerHashedPartitioner3);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.ContextCollectTask.DispatcherContinuation, net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]> dispatcherContinuationPartitionedStore6 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.ContextCollectTask.DispatcherContinuation, net.goldolphin.cate.ITask<java.lang.CharSequence, ?>[]>(6, (net.goldolphin.cate.partitioned.IPartitioner) iSchedulerTaskWithSchedulerHashedPartitioner3);
        org.junit.Assert.assertNotNull(iSchedulerTaskWithSchedulerHashedPartitioner3);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        net.goldolphin.cate.Action0 action0_4 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask5 = net.goldolphin.cate.Task.create(action0_4);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter6 = unitTask5.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter7 = unitWaiter6.continueWithWaiter();
        java.util.concurrent.Executor executor8 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler9 = new net.goldolphin.cate.ExecutorScheduler(executor8);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask10 = unitWaiter6.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler9);
        net.goldolphin.cate.Unit unit11 = net.goldolphin.cate.Unit.VALUE;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask12 = unitWaiter6.withInitState(unit11);
        net.goldolphin.cate.Action0 action0_13 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask14 = net.goldolphin.cate.Task.create(action0_13);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter15 = unitTask14.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter16 = unitWaiter15.continueWithWaiter();
        java.util.concurrent.Executor executor17 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler18 = new net.goldolphin.cate.ExecutorScheduler(executor17);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask19 = unitWaiter15.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler18);
        net.goldolphin.cate.Unit unit20 = net.goldolphin.cate.Unit.VALUE;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask21 = unitWaiter15.withInitState(unit20);
        unitWaiter6.setResult(unit20);
        unitWaiter2.setResult(unit20);
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask5);
        org.junit.Assert.assertNotNull(unitWaiter6);
        org.junit.Assert.assertNotNull(unitWaiter7);
        org.junit.Assert.assertNotNull(unitTask10);
        org.junit.Assert.assertNotNull(unit11);
        org.junit.Assert.assertNotNull(unitTask12);
        org.junit.Assert.assertNotNull(unitTask14);
        org.junit.Assert.assertNotNull(unitWaiter15);
        org.junit.Assert.assertNotNull(unitWaiter16);
        org.junit.Assert.assertNotNull(unitTask19);
        org.junit.Assert.assertNotNull(unit20);
        org.junit.Assert.assertNotNull(unitTask21);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        net.goldolphin.cate.partitioned.HashedPartitioner<net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>> iSchedulerTaskWithSchedulerHashedPartitioner1 = net.goldolphin.cate.partitioned.HashedPartitioner.instance();
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask2 = null;
        net.goldolphin.cate.Action0 action0_3 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask4 = net.goldolphin.cate.Task.create(action0_3);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter5 = unitTask4.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter6 = unitWaiter5.continueWithWaiter();
        java.util.concurrent.Executor executor7 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler8 = new net.goldolphin.cate.ExecutorScheduler(executor7);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask9 = unitWaiter5.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler8);
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask12 = unitWaiter5.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler11);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler13 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask2, (net.goldolphin.cate.IScheduler) executorScheduler11);
        int int15 = iSchedulerTaskWithSchedulerHashedPartitioner1.partition(iSchedulerTaskWithScheduler13, (int) (byte) 10);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore16 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((int) (byte) 1, (net.goldolphin.cate.partitioned.IPartitioner) iSchedulerTaskWithSchedulerHashedPartitioner1);
        net.goldolphin.cate.Action0 action0_17 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask18 = net.goldolphin.cate.Task.create(action0_17);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter19 = unitTask18.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter20 = unitWaiter19.continueWithWaiter();
        java.util.concurrent.Executor executor21 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler22 = new net.goldolphin.cate.ExecutorScheduler(executor21);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask23 = unitWaiter19.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler22);
        java.util.concurrent.Executor executor24 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler25 = new net.goldolphin.cate.ExecutorScheduler(executor24);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask26 = unitWaiter19.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler25);
        java.util.concurrent.Executor executor27 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler28 = new net.goldolphin.cate.ExecutorScheduler(executor27);
        net.goldolphin.cate.ITask<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerITask29 = null;
        net.goldolphin.cate.Action0 action0_30 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask31 = net.goldolphin.cate.Task.create(action0_30);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter32 = unitTask31.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter33 = unitWaiter32.continueWithWaiter();
        java.util.concurrent.Executor executor34 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler35 = new net.goldolphin.cate.ExecutorScheduler(executor34);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask36 = unitWaiter32.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler35);
        java.util.concurrent.Executor executor37 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler38 = new net.goldolphin.cate.ExecutorScheduler(executor37);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask39 = unitWaiter32.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler38);
        net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>> iSchedulerTaskWithScheduler40 = new net.goldolphin.cate.TaskWithScheduler<net.goldolphin.cate.IScheduler, net.goldolphin.cate.TaskWithInitState<java.lang.CharSequence, java.io.Serializable>>(iSchedulerITask29, (net.goldolphin.cate.IScheduler) executorScheduler38);
        java.util.concurrent.Executor executor41 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler42 = new net.goldolphin.cate.ExecutorScheduler(executor41);
        net.goldolphin.cate.IScheduler[] iSchedulerArray43 = new net.goldolphin.cate.IScheduler[] { executorScheduler25, executorScheduler28, executorScheduler38, executorScheduler42 };
        net.goldolphin.cate.partitioned.IPartitioner<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskIPartitioner44 = null;
        net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>> unitWaiterFunc0TaskPartitionedSchedulerPool45 = new net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>(iSchedulerArray43, unitWaiterFunc0TaskIPartitioner44);
        net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler> waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore46 = new net.goldolphin.cate.partitioned.PartitionedStore<net.goldolphin.cate.partitioned.PartitionedSchedulerPool<net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>>, net.goldolphin.cate.IScheduler>((net.goldolphin.cate.partitioned.PartitionedSchedulerPool) unitWaiterFunc0TaskPartitionedSchedulerPool45);
        net.goldolphin.cate.partitioned.IPartitioner iPartitioner47 = unitWaiterFunc0TaskPartitionedSchedulerPool45.getPartitioner();
        net.goldolphin.cate.Func0<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0_48 = null;
        net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitWaiterFunc0Task49 = new net.goldolphin.cate.Func0Task<net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>>(unitWaiterFunc0_48);
        net.goldolphin.cate.Action0 action0_51 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask52 = net.goldolphin.cate.Task.create(action0_51);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter53 = unitTask52.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter54 = unitWaiter53.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter55 = new net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter54);
        net.goldolphin.cate.IContinuation iContinuation56 = null;
        net.goldolphin.cate.FlattenTask.Continuation continuation57 = new net.goldolphin.cate.FlattenTask.Continuation(iContinuation56);
        net.goldolphin.cate.IContinuation iContinuation58 = unitWaiter54.buildContinuation(iContinuation56);
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation59 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (byte) 100, iContinuation56);
        net.goldolphin.cate.IContinuation iContinuation60 = unitWaiterFunc0Task49.buildContinuation(iContinuation56);
        net.goldolphin.cate.IContinuation iContinuation62 = net.goldolphin.cate.IContinuation.END_CONTINUATION;
        net.goldolphin.cate.CollectTask.IndexContinuation indexContinuation63 = new net.goldolphin.cate.CollectTask.IndexContinuation((int) (short) -1, iContinuation62);
        net.goldolphin.cate.IContinuation iContinuation64 = unitWaiterFunc0Task49.buildContinuation((net.goldolphin.cate.IContinuation) indexContinuation63);
        net.goldolphin.cate.Action0 action0_65 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask66 = net.goldolphin.cate.Task.create(action0_65);
        net.goldolphin.cate.Action0 action0_67 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask68 = net.goldolphin.cate.Task.create(action0_67);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter69 = unitTask68.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask70 = unitTask66.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter69);
        net.goldolphin.cate.Environment environment71 = null;
        net.goldolphin.cate.Action0 action0_72 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask73 = net.goldolphin.cate.Task.create(action0_72);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter74 = unitTask73.continueWithWaiter();
        net.goldolphin.cate.util.ExecutorTimer executorTimer75 = new net.goldolphin.cate.util.ExecutorTimer();
        net.goldolphin.cate.Action0 action0_76 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask77 = net.goldolphin.cate.Task.create(action0_76);
        net.goldolphin.cate.Action0 action0_78 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask79 = net.goldolphin.cate.Task.create(action0_78);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter80 = unitTask79.continueWithWaiter();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask81 = unitTask77.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter80);
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_82 = null;
        java.util.concurrent.TimeUnit timeUnit84 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Maybe<net.goldolphin.cate.Unit>> unitTask85 = executorTimer75.withTimeout((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitTask77, unitAction1_82, (long) (byte) -1, timeUnit84);
        net.goldolphin.cate.SynchronizedScheduler synchronizedScheduler86 = new net.goldolphin.cate.SynchronizedScheduler();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask87 = unitTask77.withScheduler((net.goldolphin.cate.IScheduler) synchronizedScheduler86);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask88 = unitTask73.withScheduler((net.goldolphin.cate.IScheduler) synchronizedScheduler86);
        indexContinuation63.apply((java.lang.Object) unitTask70, environment71, (net.goldolphin.cate.IScheduler) synchronizedScheduler86);
        waiterFunc0TaskPartitionedSchedulerPoolPartitionedStore16.put(unitWaiterFunc0TaskPartitionedSchedulerPool45, (net.goldolphin.cate.IScheduler) synchronizedScheduler86);
        org.junit.Assert.assertNotNull(iSchedulerTaskWithSchedulerHashedPartitioner1);
        org.junit.Assert.assertNotNull(unitTask4);
        org.junit.Assert.assertNotNull(unitWaiter5);
        org.junit.Assert.assertNotNull(unitWaiter6);
        org.junit.Assert.assertNotNull(unitTask9);
        org.junit.Assert.assertNotNull(unitTask12);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(unitTask18);
        org.junit.Assert.assertNotNull(unitWaiter19);
        org.junit.Assert.assertNotNull(unitWaiter20);
        org.junit.Assert.assertNotNull(unitTask23);
        org.junit.Assert.assertNotNull(unitTask26);
        org.junit.Assert.assertNotNull(unitTask31);
        org.junit.Assert.assertNotNull(unitWaiter32);
        org.junit.Assert.assertNotNull(unitWaiter33);
        org.junit.Assert.assertNotNull(unitTask36);
        org.junit.Assert.assertNotNull(unitTask39);
        org.junit.Assert.assertNotNull(iSchedulerArray43);
        org.junit.Assert.assertNull(iPartitioner47);
        org.junit.Assert.assertNotNull(unitTask52);
        org.junit.Assert.assertNotNull(unitWaiter53);
        org.junit.Assert.assertNotNull(unitWaiter54);
        org.junit.Assert.assertNotNull(iContinuation58);
        org.junit.Assert.assertNotNull(iContinuation60);
        org.junit.Assert.assertNotNull(iContinuation62);
        org.junit.Assert.assertNotNull(iContinuation64);
        org.junit.Assert.assertNotNull(unitTask66);
        org.junit.Assert.assertNotNull(unitTask68);
        org.junit.Assert.assertNotNull(unitWaiter69);
        org.junit.Assert.assertNotNull(unitTask70);
        org.junit.Assert.assertNotNull(unitTask73);
        org.junit.Assert.assertNotNull(unitWaiter74);
        org.junit.Assert.assertNotNull(unitTask77);
        org.junit.Assert.assertNotNull(unitTask79);
        org.junit.Assert.assertNotNull(unitWaiter80);
        org.junit.Assert.assertNotNull(unitTask81);
        org.junit.Assert.assertNotNull(unitTask85);
        org.junit.Assert.assertNotNull(unitTask87);
        org.junit.Assert.assertNotNull(unitTask88);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_3 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask4 = unitTask1.continueWith(unitAction1_3);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitTask5 = unitTask1.flatten();
        net.goldolphin.cate.Action0 action0_6 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask7 = net.goldolphin.cate.Task.create(action0_6);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter8 = unitTask7.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter9 = unitWaiter8.continueWithWaiter();
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask12 = unitWaiter8.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler11);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask13 = unitTask1.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler11);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter14 = unitTask13.continueWithWaiter();
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitTask4);
        org.junit.Assert.assertNotNull(unitTask5);
        org.junit.Assert.assertNotNull(unitTask7);
        org.junit.Assert.assertNotNull(unitWaiter8);
        org.junit.Assert.assertNotNull(unitWaiter9);
        org.junit.Assert.assertNotNull(unitTask12);
        org.junit.Assert.assertNotNull(unitTask13);
        org.junit.Assert.assertNotNull(unitWaiter14);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        net.goldolphin.cate.Action0 action0_1 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask2 = net.goldolphin.cate.Task.create(action0_1);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitTask2.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_4 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask5 = unitTask2.continueWith(unitAction1_4);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>> unitTask6 = unitTask2.flatten();
        net.goldolphin.cate.CollectTask.Result result7 = new net.goldolphin.cate.CollectTask.Result((int) (short) 0, (java.lang.Object) unitTask2);
        java.lang.Object obj8 = result7.value;
        org.junit.Assert.assertNotNull(unitTask2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask5);
        org.junit.Assert.assertNotNull(unitTask6);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        net.goldolphin.cate.Maybe<net.goldolphin.cate.IContinuation> iContinuationMaybe0 = net.goldolphin.cate.Maybe.nothing();
        org.junit.Assert.assertNotNull(iContinuationMaybe0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        net.goldolphin.cate.Action0 action0_0 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask1 = net.goldolphin.cate.Task.create(action0_0);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter2 = unitTask1.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter3 = unitWaiter2.continueWithWaiter();
        net.goldolphin.cate.Action1<net.goldolphin.cate.Unit> unitAction1_4 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask5 = unitWaiter2.continueWith(unitAction1_4);
        net.goldolphin.cate.Action0 action0_6 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask7 = net.goldolphin.cate.Task.create(action0_6);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter8 = unitTask7.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter9 = unitWaiter8.continueWithWaiter();
        java.util.concurrent.Executor executor10 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler11 = new net.goldolphin.cate.ExecutorScheduler(executor10);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask12 = unitWaiter8.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler11);
        java.util.concurrent.Executor executor13 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler14 = new net.goldolphin.cate.ExecutorScheduler(executor13);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask15 = unitWaiter8.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler14);
        boolean boolean16 = unitWaiter8.isComplete();
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask17 = unitTask5.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter8);
        net.goldolphin.cate.Action0 action0_18 = null;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask19 = net.goldolphin.cate.Task.create(action0_18);
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter20 = unitTask19.continueWithWaiter();
        net.goldolphin.cate.Waiter<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitWaiter21 = unitWaiter20.continueWithWaiter();
        java.util.concurrent.Executor executor22 = null;
        net.goldolphin.cate.ExecutorScheduler executorScheduler23 = new net.goldolphin.cate.ExecutorScheduler(executor22);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask24 = unitWaiter20.withScheduler((net.goldolphin.cate.IScheduler) executorScheduler23);
        net.goldolphin.cate.Unit unit25 = net.goldolphin.cate.Unit.VALUE;
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask26 = unitWaiter20.withInitState(unit25);
        net.goldolphin.cate.Task<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit> unitTask27 = unitWaiter8.continueWith((net.goldolphin.cate.ITask<net.goldolphin.cate.Unit, net.goldolphin.cate.Unit>) unitWaiter20);
        org.junit.Assert.assertNotNull(unitTask1);
        org.junit.Assert.assertNotNull(unitWaiter2);
        org.junit.Assert.assertNotNull(unitWaiter3);
        org.junit.Assert.assertNotNull(unitTask5);
        org.junit.Assert.assertNotNull(unitTask7);
        org.junit.Assert.assertNotNull(unitWaiter8);
        org.junit.Assert.assertNotNull(unitWaiter9);
        org.junit.Assert.assertNotNull(unitTask12);
        org.junit.Assert.assertNotNull(unitTask15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unitTask17);
        org.junit.Assert.assertNotNull(unitTask19);
        org.junit.Assert.assertNotNull(unitWaiter20);
        org.junit.Assert.assertNotNull(unitWaiter21);
        org.junit.Assert.assertNotNull(unitTask24);
        org.junit.Assert.assertNotNull(unit25);
        org.junit.Assert.assertNotNull(unitTask26);
        org.junit.Assert.assertNotNull(unitTask27);
    }
}
