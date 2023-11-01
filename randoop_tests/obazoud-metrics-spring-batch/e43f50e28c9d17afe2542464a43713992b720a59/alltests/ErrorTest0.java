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
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        timerHolder2.time("", "hi!", "");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        timerHolder2.time("", "chunk", "write");
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        timerHolder2.setGroup("metered");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        timerHolder2.time("step", "metered", "sb_rollback_exception");
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder0 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        meterHolder0.mark("metered");
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder0 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder0.setGroup("chunk");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        meterHolder0.mark("write");
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder0 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        meterHolder0.mark("read");
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder0 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        meterHolder0.mark("sb_rollback_exception");
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder0 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder0.setGroup("chunk");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        meterHolder0.mark("");
    }
}

