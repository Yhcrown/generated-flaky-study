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
        java.lang.String str0 = com.bazoud.metrics.springbatch.MetricsHelper.WRITE_KIND;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "write" + "'", str0, "write");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.lang.String str0 = com.bazoud.metrics.springbatch.MetricsHelper.METERED_KIND;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "metered" + "'", str0, "metered");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.lang.String str0 = com.bazoud.metrics.springbatch.MetricsHelper.STEP_KIND;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "step" + "'", str0, "step");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedChunkListener0.beforeStep(stepExecution1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.lang.String str0 = org.springframework.batch.core.ChunkListener.ROLLBACK_EXCEPTION_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "sb_rollback_exception" + "'", str0, "sb_rollback_exception");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        java.lang.Class<?> wildcardClass2 = stepExecutionHolder1.getClass();
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemProcessListener3.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder4);
        org.springframework.batch.core.StepExecution stepExecution6 = stepExecutionHolder4.getCurrent();
        org.springframework.batch.core.StepExecution stepExecution7 = stepExecutionHolder4.getCurrent();
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(stepExecution6);
        org.junit.Assert.assertNull(stepExecution7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener0 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution1 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedJobExecutionListener0.beforeJob(jobExecution1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.lang.String str0 = com.bazoud.metrics.springbatch.MetricsHelper.CHUNK_KIND;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "chunk" + "'", str0, "chunk");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener0 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution1 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedJobExecutionListener0.afterJob(jobExecution1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder3 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution4 = null;
        // The following exception was thrown during execution in test generation
        try {
            stepExecutionHolder3.before(stepExecution4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener timedStepExecutionListener0 = new com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedStepExecutionListener0.beforeStep(stepExecution1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution1 = null;
        meteredJobExecutionListener0.beforeJob(jobExecution1);
        org.springframework.batch.core.JobExecution jobExecution3 = null;
        // The following exception was thrown during execution in test generation
        try {
            meteredJobExecutionListener0.afterJob(jobExecution3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.lang.String str0 = com.bazoud.metrics.springbatch.MetricsHelper.TIMED_KIND;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "timed" + "'", str0, "timed");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener timedStepExecutionListener0 = new com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.batch.core.ExitStatus exitStatus2 = timedStepExecutionListener0.afterStep(stepExecution1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        java.lang.String str0 = com.bazoud.metrics.springbatch.MetricsHelper.PROCESS_KIND;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "process" + "'", str0, "process");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.lang.String str0 = com.bazoud.metrics.springbatch.MetricsHelper.JOB_KIND;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "job" + "'", str0, "job");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemProcessListener3.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder4);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = null;
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        org.springframework.batch.core.StepExecution stepExecution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedItemProcessListener0.beforeStep(stepExecution8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedChunkListener0.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder5 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            stepExecutionHolder5.before(stepExecution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener0 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener1 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemWriteListener1.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder3 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener1.setTimerHolder(timerHolder3);
        timerHolder3.setGroup("metered");
        timedJobExecutionListener0.setTimerHolder(timerHolder3);
        org.springframework.batch.core.JobExecution jobExecution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedJobExecutionListener0.afterJob(jobExecution8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.lang.String str0 = com.bazoud.metrics.springbatch.MetricsHelper.METRICS_BATCH_GROUP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "batch" + "'", str0, "batch");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.lang.String str0 = com.bazoud.metrics.springbatch.MetricsHelper.READ_KIND;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "read" + "'", str0, "read");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder3 = timedItemWriteListener2.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener4 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder5 = timedItemWriteListener4.getStepExecutionHolder();
        timedItemWriteListener2.setStepExecutionHolder(stepExecutionHolder5);
        timedItemWriteListener0.setStepExecutionHolder(stepExecutionHolder5);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNotNull(stepExecutionHolder3);
        org.junit.Assert.assertNotNull(stepExecutionHolder5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder3 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext4 = null;
        timedChunkListener0.beforeChunk(chunkContext4);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener6 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution7 = null;
        org.springframework.batch.core.ExitStatus exitStatus8 = timedChunkListener6.afterStep(stepExecution7);
        org.springframework.batch.core.StepExecution stepExecution9 = null;
        org.springframework.batch.core.ExitStatus exitStatus10 = timedChunkListener6.afterStep(stepExecution9);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder11 = timedChunkListener6.getStepExecutionHolder();
        timedChunkListener0.setStepExecutionHolder(stepExecutionHolder11);
        org.springframework.batch.core.StepExecution stepExecution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedChunkListener0.beforeStep(stepExecution13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder3);
        org.junit.Assert.assertNull(exitStatus8);
        org.junit.Assert.assertNull(exitStatus10);
        org.junit.Assert.assertNotNull(stepExecutionHolder11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemWriteListener9.getStepExecutionHolder();
        java.lang.Exception exception11 = null;
        timedItemProcessListener0.onProcessError((java.lang.Object) stepExecutionHolder10, exception11);
        org.springframework.batch.core.StepExecution stepExecution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedItemProcessListener0.beforeStep(stepExecution13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        java.util.List list4 = null;
        timedItemWriteListener0.beforeWrite(list4);
        com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener timedStepExecutionListener6 = new com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener7 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder8 = timedItemProcessListener7.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution10 = null;
        org.springframework.batch.core.ExitStatus exitStatus11 = timedItemProcessListener9.afterStep(stepExecution10);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener12 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder13 = timedItemProcessListener12.getStepExecutionHolder();
        timedItemProcessListener9.setStepExecutionHolder(stepExecutionHolder13);
        timedItemProcessListener7.setStepExecutionHolder(stepExecutionHolder13);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener16 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder17 = timedItemWriteListener16.getStepExecutionHolder();
        java.lang.Exception exception18 = null;
        timedItemProcessListener7.onProcessError((java.lang.Object) stepExecutionHolder17, exception18);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener21 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder22 = timedItemWriteListener21.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder23 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener21.setTimerHolder(timerHolder23);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener25 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder26 = timedItemWriteListener25.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder27 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener25.setTimerHolder(timerHolder27);
        timerHolder27.setGroup("metered");
        timedItemWriteListener21.setTimerHolder(timerHolder27);
        timedItemProcessListener7.afterProcess((java.lang.Object) "step", (java.lang.Object) timerHolder27);
        timedStepExecutionListener6.setTimerHolder(timerHolder27);
        timedItemWriteListener0.setTimerHolder(timerHolder27);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNotNull(stepExecutionHolder8);
        org.junit.Assert.assertNull(exitStatus11);
        org.junit.Assert.assertNotNull(stepExecutionHolder13);
        org.junit.Assert.assertNotNull(stepExecutionHolder17);
        org.junit.Assert.assertNotNull(stepExecutionHolder22);
        org.junit.Assert.assertNotNull(stepExecutionHolder26);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemProcessListener3.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder4);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = null;
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        java.lang.Class<?> wildcardClass8 = timedItemProcessListener0.getClass();
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder3 = timedItemWriteListener2.getStepExecutionHolder();
        timedItemWriteListener0.setStepExecutionHolder(stepExecutionHolder3);
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        // The following exception was thrown during execution in test generation
        try {
            stepExecutionHolder3.before(stepExecution5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNotNull(stepExecutionHolder3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener4 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        org.springframework.batch.core.ExitStatus exitStatus6 = timedItemProcessListener4.afterStep(stepExecution5);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener7 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder8 = timedItemProcessListener7.getStepExecutionHolder();
        timedItemProcessListener4.setStepExecutionHolder(stepExecutionHolder8);
        timedItemWriteListener0.setStepExecutionHolder(stepExecutionHolder8);
        org.springframework.batch.core.StepExecution stepExecution11 = null;
        org.springframework.batch.core.ExitStatus exitStatus12 = timedItemWriteListener0.afterStep(stepExecution11);
        java.util.List list13 = null;
        timedItemWriteListener0.beforeWrite(list13);
        org.springframework.batch.core.StepExecution stepExecution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedItemWriteListener0.beforeStep(stepExecution15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus6);
        org.junit.Assert.assertNotNull(stepExecutionHolder8);
        org.junit.Assert.assertNull(exitStatus12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener0 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener1 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemWriteListener1.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder3 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener1.setTimerHolder(timerHolder3);
        timerHolder3.setGroup("metered");
        timedJobExecutionListener0.setTimerHolder(timerHolder3);
        org.springframework.batch.core.JobExecution jobExecution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedJobExecutionListener0.beforeJob(jobExecution8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution1 = null;
        meteredJobExecutionListener0.beforeJob(jobExecution1);
        java.lang.Class<?> wildcardClass3 = meteredJobExecutionListener0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        java.lang.Class<?> wildcardClass9 = stepExecutionHolder6.getClass();
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener timedStepExecutionListener0 = new com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener1 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemProcessListener1.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution4 = null;
        org.springframework.batch.core.ExitStatus exitStatus5 = timedItemProcessListener3.afterStep(stepExecution4);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener6 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder7 = timedItemProcessListener6.getStepExecutionHolder();
        timedItemProcessListener3.setStepExecutionHolder(stepExecutionHolder7);
        timedItemProcessListener1.setStepExecutionHolder(stepExecutionHolder7);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener10 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder11 = timedItemWriteListener10.getStepExecutionHolder();
        java.lang.Exception exception12 = null;
        timedItemProcessListener1.onProcessError((java.lang.Object) stepExecutionHolder11, exception12);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder16 = timedItemWriteListener15.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder17 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener15.setTimerHolder(timerHolder17);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener19 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = timedItemWriteListener19.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder21 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener19.setTimerHolder(timerHolder21);
        timerHolder21.setGroup("metered");
        timedItemWriteListener15.setTimerHolder(timerHolder21);
        timedItemProcessListener1.afterProcess((java.lang.Object) "step", (java.lang.Object) timerHolder21);
        timedStepExecutionListener0.setTimerHolder(timerHolder21);
        org.springframework.batch.core.StepExecution stepExecution28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.batch.core.ExitStatus exitStatus29 = timedStepExecutionListener0.afterStep(stepExecution28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
        org.junit.Assert.assertNull(exitStatus5);
        org.junit.Assert.assertNotNull(stepExecutionHolder7);
        org.junit.Assert.assertNotNull(stepExecutionHolder11);
        org.junit.Assert.assertNotNull(stepExecutionHolder16);
        org.junit.Assert.assertNotNull(stepExecutionHolder20);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener4 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder5 = timedItemWriteListener4.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder6 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener4.setTimerHolder(timerHolder6);
        timerHolder6.setGroup("metered");
        timedItemWriteListener0.setTimerHolder(timerHolder6);
        com.codahale.metrics.MetricRegistry metricRegistry11 = null;
        timerHolder6.setMetricRegistry(metricRegistry11);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNotNull(stepExecutionHolder5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder3 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext4 = null;
        timedChunkListener0.beforeChunk(chunkContext4);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext6 = null;
        timedChunkListener0.afterChunk(chunkContext6);
        org.springframework.batch.core.StepExecution stepExecution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedChunkListener0.beforeStep(stepExecution8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemProcessListener3.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder4);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener6 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution7 = null;
        org.springframework.batch.core.ExitStatus exitStatus8 = timedItemProcessListener6.afterStep(stepExecution7);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemProcessListener9.getStepExecutionHolder();
        timedItemProcessListener6.setStepExecutionHolder(stepExecutionHolder10);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder10);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder13 = timedItemProcessListener0.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution14 = null;
        // The following exception was thrown during execution in test generation
        try {
            stepExecutionHolder13.before(stepExecution14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus8);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNotNull(stepExecutionHolder13);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder1 = null;
        meteredJobExecutionListener0.setMeterHolder(meterHolder1);
        org.springframework.batch.core.JobExecution jobExecution3 = null;
        // The following exception was thrown during execution in test generation
        try {
            meteredJobExecutionListener0.afterJob(jobExecution3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder0 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        com.codahale.metrics.MetricRegistry metricRegistry1 = null;
        meterHolder0.setMetricRegistry(metricRegistry1);
        // The following exception was thrown during execution in test generation
        try {
            meterHolder0.mark("metered");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = exitStatus2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        java.lang.Exception exception4 = null;
        java.util.List list5 = null;
        timedItemWriteListener0.onWriteError(exception4, list5);
        java.util.List list7 = null;
        timedItemWriteListener0.beforeWrite(list7);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemProcessListener3.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder4);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = null;
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder8 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timerHolder8.setGroup("hi!");
        timedItemProcessListener0.setTimerHolder(timerHolder8);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener12 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder13 = timedItemWriteListener12.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder14 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener12.setTimerHolder(timerHolder14);
        timerHolder14.setGroup("metered");
        com.codahale.metrics.MetricRegistry metricRegistry18 = null;
        timerHolder14.setMetricRegistry(metricRegistry18);
        timedItemProcessListener0.setTimerHolder(timerHolder14);
        timerHolder14.setGroup("job");
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNotNull(stepExecutionHolder13);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemProcessListener3.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder4);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener6 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution7 = null;
        org.springframework.batch.core.ExitStatus exitStatus8 = timedItemProcessListener6.afterStep(stepExecution7);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemProcessListener9.getStepExecutionHolder();
        timedItemProcessListener6.setStepExecutionHolder(stepExecutionHolder10);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener12 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution13 = null;
        org.springframework.batch.core.ExitStatus exitStatus14 = timedItemProcessListener12.afterStep(stepExecution13);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder16 = timedItemProcessListener15.getStepExecutionHolder();
        timedItemProcessListener12.setStepExecutionHolder(stepExecutionHolder16);
        timedItemProcessListener6.setStepExecutionHolder(stepExecutionHolder16);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder16);
        org.springframework.batch.core.StepExecution stepExecution20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedItemProcessListener0.beforeStep(stepExecution20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus8);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNull(exitStatus14);
        org.junit.Assert.assertNotNull(stepExecutionHolder16);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemWriteListener9.getStepExecutionHolder();
        java.lang.Exception exception11 = null;
        timedItemProcessListener0.onProcessError((java.lang.Object) stepExecutionHolder10, exception11);
        timedItemProcessListener0.beforeProcess((java.lang.Object) "chunk");
        org.springframework.batch.core.StepExecution stepExecution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedItemProcessListener0.beforeStep(stepExecution15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder0 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder0.setGroup("");
        com.codahale.metrics.MetricRegistry metricRegistry3 = null;
        meterHolder0.setMetricRegistry(metricRegistry3);
        // The following exception was thrown during execution in test generation
        try {
            meterHolder0.mark("chunk", "write");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder3 = timedChunkListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedChunkListener0.beforeStep(stepExecution5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder3);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener4 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        org.springframework.batch.core.ExitStatus exitStatus6 = timedItemProcessListener4.afterStep(stepExecution5);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener7 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder8 = timedItemProcessListener7.getStepExecutionHolder();
        timedItemProcessListener4.setStepExecutionHolder(stepExecutionHolder8);
        timedItemWriteListener0.setStepExecutionHolder(stepExecutionHolder8);
        java.util.List list11 = null;
        timedItemWriteListener0.beforeWrite(list11);
        java.util.List list13 = null;
        timedItemWriteListener0.afterWrite(list13);
        java.lang.Exception exception15 = null;
        java.util.List list16 = null;
        timedItemWriteListener0.onWriteError(exception15, list16);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus6);
        org.junit.Assert.assertNotNull(stepExecutionHolder8);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution1 = null;
        // The following exception was thrown during execution in test generation
        try {
            meteredJobExecutionListener0.afterJob(jobExecution1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution1 = null;
        meteredJobExecutionListener0.beforeJob(jobExecution1);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder3 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        com.codahale.metrics.MetricRegistry metricRegistry4 = null;
        meterHolder3.setMetricRegistry(metricRegistry4);
        meteredJobExecutionListener0.setMeterHolder(meterHolder3);
        org.springframework.batch.core.JobExecution jobExecution7 = null;
        meteredJobExecutionListener0.beforeJob(jobExecution7);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder3 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext4 = null;
        timedChunkListener0.beforeChunk(chunkContext4);
        org.springframework.batch.core.StepExecution stepExecution6 = null;
        org.springframework.batch.core.ExitStatus exitStatus7 = timedChunkListener0.afterStep(stepExecution6);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder8 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedChunkListener0.beforeStep(stepExecution9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder3);
        org.junit.Assert.assertNull(exitStatus7);
        org.junit.Assert.assertNotNull(stepExecutionHolder8);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemWriteListener9.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener11 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder12 = timedItemWriteListener11.getStepExecutionHolder();
        timedItemWriteListener9.setStepExecutionHolder(stepExecutionHolder12);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener14 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder15 = timedItemProcessListener14.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener16 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution17 = null;
        org.springframework.batch.core.ExitStatus exitStatus18 = timedItemProcessListener16.afterStep(stepExecution17);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener19 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = timedItemProcessListener19.getStepExecutionHolder();
        timedItemProcessListener16.setStepExecutionHolder(stepExecutionHolder20);
        timedItemProcessListener14.setStepExecutionHolder(stepExecutionHolder20);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener23 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder24 = timedItemWriteListener23.getStepExecutionHolder();
        java.lang.Exception exception25 = null;
        timedItemProcessListener14.onProcessError((java.lang.Object) stepExecutionHolder24, exception25);
        timedItemProcessListener14.beforeProcess((java.lang.Object) "chunk");
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener29 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener30 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder31 = timedItemWriteListener30.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder32 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener30.setTimerHolder(timerHolder32);
        timerHolder32.setGroup("metered");
        timedJobExecutionListener29.setTimerHolder(timerHolder32);
        timedItemProcessListener14.beforeProcess((java.lang.Object) timedJobExecutionListener29);
        timedItemProcessListener0.afterProcess((java.lang.Object) timedItemWriteListener9, (java.lang.Object) timedJobExecutionListener29);
        org.springframework.batch.core.JobExecution jobExecution39 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedJobExecutionListener29.afterJob(jobExecution39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNotNull(stepExecutionHolder12);
        org.junit.Assert.assertNotNull(stepExecutionHolder15);
        org.junit.Assert.assertNull(exitStatus18);
        org.junit.Assert.assertNotNull(stepExecutionHolder20);
        org.junit.Assert.assertNotNull(stepExecutionHolder24);
        org.junit.Assert.assertNotNull(stepExecutionHolder31);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.batch.core.ExitStatus exitStatus2 = meteredStepExecutionListener0.afterStep(stepExecution1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution1);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener3 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution4 = null;
        meteredJobExecutionListener3.beforeJob(jobExecution4);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder6 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        com.codahale.metrics.MetricRegistry metricRegistry7 = null;
        meterHolder6.setMetricRegistry(metricRegistry7);
        meteredJobExecutionListener3.setMeterHolder(meterHolder6);
        meteredStepExecutionListener0.setMeterHolder(meterHolder6);
        org.springframework.batch.core.StepExecution stepExecution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.batch.core.ExitStatus exitStatus12 = meteredStepExecutionListener0.afterStep(stepExecution11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener4 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        org.springframework.batch.core.ExitStatus exitStatus6 = timedItemProcessListener4.afterStep(stepExecution5);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener7 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder8 = timedItemProcessListener7.getStepExecutionHolder();
        timedItemProcessListener4.setStepExecutionHolder(stepExecutionHolder8);
        timedItemWriteListener0.setStepExecutionHolder(stepExecutionHolder8);
        java.util.List list11 = null;
        timedItemWriteListener0.beforeWrite(list11);
        java.util.List list13 = null;
        timedItemWriteListener0.afterWrite(list13);
        org.springframework.batch.core.StepExecution stepExecution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedItemWriteListener0.beforeStep(stepExecution15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus6);
        org.junit.Assert.assertNotNull(stepExecutionHolder8);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemProcessListener3.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder4);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener6 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution7 = null;
        org.springframework.batch.core.ExitStatus exitStatus8 = timedItemProcessListener6.afterStep(stepExecution7);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemProcessListener9.getStepExecutionHolder();
        timedItemProcessListener6.setStepExecutionHolder(stepExecutionHolder10);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener12 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution13 = null;
        org.springframework.batch.core.ExitStatus exitStatus14 = timedItemProcessListener12.afterStep(stepExecution13);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder16 = timedItemProcessListener15.getStepExecutionHolder();
        timedItemProcessListener12.setStepExecutionHolder(stepExecutionHolder16);
        timedItemProcessListener6.setStepExecutionHolder(stepExecutionHolder16);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener19 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = timedItemWriteListener19.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder21 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener19.setTimerHolder(timerHolder21);
        timedItemProcessListener0.afterProcess((java.lang.Object) stepExecutionHolder16, (java.lang.Object) timedItemWriteListener19);
        org.springframework.batch.core.StepExecution stepExecution24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedItemProcessListener0.beforeStep(stepExecution24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus8);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNull(exitStatus14);
        org.junit.Assert.assertNotNull(stepExecutionHolder16);
        org.junit.Assert.assertNotNull(stepExecutionHolder20);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemProcessListener3.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder4);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener6 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution7 = null;
        org.springframework.batch.core.ExitStatus exitStatus8 = timedItemProcessListener6.afterStep(stepExecution7);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemProcessListener9.getStepExecutionHolder();
        timedItemProcessListener6.setStepExecutionHolder(stepExecutionHolder10);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder10);
        org.springframework.batch.core.StepExecution stepExecution13 = null;
        boolean boolean14 = stepExecutionHolder10.after(stepExecution13);
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus8);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener0 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener1 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemWriteListener1.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder3 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener1.setTimerHolder(timerHolder3);
        timerHolder3.setGroup("metered");
        timedJobExecutionListener0.setTimerHolder(timerHolder3);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener8 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = timedItemWriteListener8.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder10 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener8.setTimerHolder(timerHolder10);
        timerHolder10.setGroup("metered");
        timedJobExecutionListener0.setTimerHolder(timerHolder10);
        org.springframework.batch.core.JobExecution jobExecution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedJobExecutionListener0.beforeJob(jobExecution15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
        org.junit.Assert.assertNotNull(stepExecutionHolder9);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemProcessListener3.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder4);
        org.springframework.batch.core.StepExecution stepExecution6 = stepExecutionHolder4.getCurrent();
        org.springframework.batch.core.StepExecution stepExecution7 = null;
        boolean boolean8 = stepExecutionHolder4.after(stepExecution7);
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(stepExecution6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener4 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        org.springframework.batch.core.ExitStatus exitStatus6 = timedItemProcessListener4.afterStep(stepExecution5);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener7 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder8 = timedItemProcessListener7.getStepExecutionHolder();
        timedItemProcessListener4.setStepExecutionHolder(stepExecutionHolder8);
        timedItemWriteListener0.setStepExecutionHolder(stepExecutionHolder8);
        org.springframework.batch.core.StepExecution stepExecution11 = null;
        org.springframework.batch.core.ExitStatus exitStatus12 = timedItemWriteListener0.afterStep(stepExecution11);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder13 = new com.bazoud.metrics.springbatch.timer.StepExecutionHolder();
        timedItemWriteListener0.setStepExecutionHolder(stepExecutionHolder13);
        org.springframework.batch.core.StepExecution stepExecution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            stepExecutionHolder13.before(stepExecution15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus6);
        org.junit.Assert.assertNotNull(stepExecutionHolder8);
        org.junit.Assert.assertNull(exitStatus12);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedChunkListener0.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder5 = timedChunkListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution7 = null;
        boolean boolean8 = stepExecutionHolder6.after(stepExecution7);
        org.springframework.batch.core.StepExecution stepExecution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            stepExecutionHolder6.before(stepExecution9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder5);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener timedStepExecutionListener0 = new com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener1 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemProcessListener1.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution4 = null;
        org.springframework.batch.core.ExitStatus exitStatus5 = timedItemProcessListener3.afterStep(stepExecution4);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener6 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder7 = timedItemProcessListener6.getStepExecutionHolder();
        timedItemProcessListener3.setStepExecutionHolder(stepExecutionHolder7);
        timedItemProcessListener1.setStepExecutionHolder(stepExecutionHolder7);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener10 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder11 = timedItemWriteListener10.getStepExecutionHolder();
        java.lang.Exception exception12 = null;
        timedItemProcessListener1.onProcessError((java.lang.Object) stepExecutionHolder11, exception12);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder16 = timedItemWriteListener15.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder17 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener15.setTimerHolder(timerHolder17);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener19 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = timedItemWriteListener19.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder21 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener19.setTimerHolder(timerHolder21);
        timerHolder21.setGroup("metered");
        timedItemWriteListener15.setTimerHolder(timerHolder21);
        timedItemProcessListener1.afterProcess((java.lang.Object) "step", (java.lang.Object) timerHolder21);
        timedStepExecutionListener0.setTimerHolder(timerHolder21);
        org.springframework.batch.core.StepExecution stepExecution28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedStepExecutionListener0.beforeStep(stepExecution28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
        org.junit.Assert.assertNull(exitStatus5);
        org.junit.Assert.assertNotNull(stepExecutionHolder7);
        org.junit.Assert.assertNotNull(stepExecutionHolder11);
        org.junit.Assert.assertNotNull(stepExecutionHolder16);
        org.junit.Assert.assertNotNull(stepExecutionHolder20);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemProcessListener3.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder4);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = null;
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder8 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timerHolder8.setGroup("hi!");
        timedItemProcessListener0.setTimerHolder(timerHolder8);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder12 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener13 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        timedItemReadListener13.beforeRead();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder15 = timedItemReadListener13.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener16 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder17 = timedItemProcessListener16.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder18 = timedItemProcessListener16.getStepExecutionHolder();
        // The following exception was thrown during execution in test generation
        try {
            timedItemProcessListener0.afterProcess((java.lang.Object) stepExecutionHolder15, (java.lang.Object) timedItemProcessListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(stepExecutionHolder12);
        org.junit.Assert.assertNotNull(stepExecutionHolder15);
        org.junit.Assert.assertNotNull(stepExecutionHolder17);
        org.junit.Assert.assertNotNull(stepExecutionHolder18);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemProcessListener3.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder4);
        org.springframework.batch.core.StepExecution stepExecution6 = stepExecutionHolder4.getCurrent();
        org.springframework.batch.core.StepExecution stepExecution7 = null;
        // The following exception was thrown during execution in test generation
        try {
            stepExecutionHolder4.before(stepExecution7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(stepExecution6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener4 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        org.springframework.batch.core.ExitStatus exitStatus6 = timedItemProcessListener4.afterStep(stepExecution5);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener7 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder8 = timedItemProcessListener7.getStepExecutionHolder();
        timedItemProcessListener4.setStepExecutionHolder(stepExecutionHolder8);
        timedItemWriteListener0.setStepExecutionHolder(stepExecutionHolder8);
        org.springframework.batch.core.StepExecution stepExecution11 = null;
        org.springframework.batch.core.ExitStatus exitStatus12 = timedItemWriteListener0.afterStep(stepExecution11);
        java.util.List list13 = null;
        timedItemWriteListener0.afterWrite(list13);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus6);
        org.junit.Assert.assertNotNull(stepExecutionHolder8);
        org.junit.Assert.assertNull(exitStatus12);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemWriteListener9.getStepExecutionHolder();
        java.lang.Exception exception11 = null;
        timedItemProcessListener0.onProcessError((java.lang.Object) stepExecutionHolder10, exception11);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener14 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder15 = timedItemWriteListener14.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder16 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener14.setTimerHolder(timerHolder16);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener18 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder19 = timedItemWriteListener18.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder20 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener18.setTimerHolder(timerHolder20);
        timerHolder20.setGroup("metered");
        timedItemWriteListener14.setTimerHolder(timerHolder20);
        timedItemProcessListener0.afterProcess((java.lang.Object) "step", (java.lang.Object) timerHolder20);
        org.springframework.batch.core.StepExecution stepExecution26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedItemProcessListener0.beforeStep(stepExecution26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNotNull(stepExecutionHolder15);
        org.junit.Assert.assertNotNull(stepExecutionHolder19);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.beforeProcess((java.lang.Object) 10.0d);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener11 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder12 = timedItemWriteListener11.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder13 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener11.setTimerHolder(timerHolder13);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution16 = null;
        org.springframework.batch.core.ExitStatus exitStatus17 = timedItemProcessListener15.afterStep(stepExecution16);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener18 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder19 = timedItemProcessListener18.getStepExecutionHolder();
        timedItemProcessListener15.setStepExecutionHolder(stepExecutionHolder19);
        timedItemWriteListener11.setStepExecutionHolder(stepExecutionHolder19);
        timedItemProcessListener0.afterProcess((java.lang.Object) timedItemWriteListener11, (java.lang.Object) 10.0f);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener24 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution25 = null;
        org.springframework.batch.core.ExitStatus exitStatus26 = timedItemProcessListener24.afterStep(stepExecution25);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener27 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder28 = timedItemProcessListener27.getStepExecutionHolder();
        timedItemProcessListener24.setStepExecutionHolder(stepExecutionHolder28);
        timedItemWriteListener11.setStepExecutionHolder(stepExecutionHolder28);
        org.springframework.batch.core.StepExecution stepExecution31 = stepExecutionHolder28.getCurrent();
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(stepExecutionHolder12);
        org.junit.Assert.assertNull(exitStatus17);
        org.junit.Assert.assertNotNull(stepExecutionHolder19);
        org.junit.Assert.assertNull(exitStatus26);
        org.junit.Assert.assertNotNull(stepExecutionHolder28);
        org.junit.Assert.assertNull(stepExecution31);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder0 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        com.codahale.metrics.MetricRegistry metricRegistry1 = null;
        meterHolder0.setMetricRegistry(metricRegistry1);
        // The following exception was thrown during execution in test generation
        try {
            meterHolder0.mark("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution1);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener3 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution4 = null;
        meteredJobExecutionListener3.beforeJob(jobExecution4);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder6 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        com.codahale.metrics.MetricRegistry metricRegistry7 = null;
        meterHolder6.setMetricRegistry(metricRegistry7);
        meteredJobExecutionListener3.setMeterHolder(meterHolder6);
        meteredStepExecutionListener0.setMeterHolder(meterHolder6);
        // The following exception was thrown during execution in test generation
        try {
            meterHolder6.mark("process", "step");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener timedStepExecutionListener0 = new com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener1 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemProcessListener1.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution4 = null;
        org.springframework.batch.core.ExitStatus exitStatus5 = timedItemProcessListener3.afterStep(stepExecution4);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener6 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder7 = timedItemProcessListener6.getStepExecutionHolder();
        timedItemProcessListener3.setStepExecutionHolder(stepExecutionHolder7);
        timedItemProcessListener1.setStepExecutionHolder(stepExecutionHolder7);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener10 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder11 = timedItemWriteListener10.getStepExecutionHolder();
        java.lang.Exception exception12 = null;
        timedItemProcessListener1.onProcessError((java.lang.Object) stepExecutionHolder11, exception12);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder16 = timedItemWriteListener15.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder17 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener15.setTimerHolder(timerHolder17);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener19 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = timedItemWriteListener19.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder21 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener19.setTimerHolder(timerHolder21);
        timerHolder21.setGroup("metered");
        timedItemWriteListener15.setTimerHolder(timerHolder21);
        timedItemProcessListener1.afterProcess((java.lang.Object) "step", (java.lang.Object) timerHolder21);
        timedStepExecutionListener0.setTimerHolder(timerHolder21);
        com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener timedStepExecutionListener28 = new com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener29 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder30 = timedItemProcessListener29.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener31 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution32 = null;
        org.springframework.batch.core.ExitStatus exitStatus33 = timedItemProcessListener31.afterStep(stepExecution32);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener34 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder35 = timedItemProcessListener34.getStepExecutionHolder();
        timedItemProcessListener31.setStepExecutionHolder(stepExecutionHolder35);
        timedItemProcessListener29.setStepExecutionHolder(stepExecutionHolder35);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener38 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder39 = timedItemWriteListener38.getStepExecutionHolder();
        java.lang.Exception exception40 = null;
        timedItemProcessListener29.onProcessError((java.lang.Object) stepExecutionHolder39, exception40);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener43 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder44 = timedItemWriteListener43.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder45 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener43.setTimerHolder(timerHolder45);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener47 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder48 = timedItemWriteListener47.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder49 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener47.setTimerHolder(timerHolder49);
        timerHolder49.setGroup("metered");
        timedItemWriteListener43.setTimerHolder(timerHolder49);
        timedItemProcessListener29.afterProcess((java.lang.Object) "step", (java.lang.Object) timerHolder49);
        timedStepExecutionListener28.setTimerHolder(timerHolder49);
        timerHolder49.setGroup("job");
        timedStepExecutionListener0.setTimerHolder(timerHolder49);
        org.springframework.batch.core.StepExecution stepExecution59 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.batch.core.ExitStatus exitStatus60 = timedStepExecutionListener0.afterStep(stepExecution59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
        org.junit.Assert.assertNull(exitStatus5);
        org.junit.Assert.assertNotNull(stepExecutionHolder7);
        org.junit.Assert.assertNotNull(stepExecutionHolder11);
        org.junit.Assert.assertNotNull(stepExecutionHolder16);
        org.junit.Assert.assertNotNull(stepExecutionHolder20);
        org.junit.Assert.assertNotNull(stepExecutionHolder30);
        org.junit.Assert.assertNull(exitStatus33);
        org.junit.Assert.assertNotNull(stepExecutionHolder35);
        org.junit.Assert.assertNotNull(stepExecutionHolder39);
        org.junit.Assert.assertNotNull(stepExecutionHolder44);
        org.junit.Assert.assertNotNull(stepExecutionHolder48);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener1 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution2 = null;
        org.springframework.batch.core.ExitStatus exitStatus3 = timedChunkListener1.afterStep(stepExecution2);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedChunkListener1.getStepExecutionHolder();
        timedItemReadListener0.afterRead((java.lang.Object) stepExecutionHolder4);
        org.springframework.batch.core.StepExecution stepExecution6 = null;
        org.springframework.batch.core.ExitStatus exitStatus7 = timedItemReadListener0.afterStep(stepExecution6);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener8 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = timedItemReadListener8.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder10 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemReadListener8.setTimerHolder(timerHolder10);
        timedItemReadListener0.afterRead((java.lang.Object) timedItemReadListener8);
        java.lang.Exception exception13 = null;
        timedItemReadListener0.onReadError(exception13);
        org.junit.Assert.assertNull(exitStatus3);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus7);
        org.junit.Assert.assertNotNull(stepExecutionHolder9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener4 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        org.springframework.batch.core.ExitStatus exitStatus6 = timedItemProcessListener4.afterStep(stepExecution5);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener7 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder8 = timedItemProcessListener7.getStepExecutionHolder();
        timedItemProcessListener4.setStepExecutionHolder(stepExecutionHolder8);
        timedItemWriteListener0.setStepExecutionHolder(stepExecutionHolder8);
        java.util.List list11 = null;
        timedItemWriteListener0.beforeWrite(list11);
        java.util.List list13 = null;
        timedItemWriteListener0.afterWrite(list13);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder15 = timedItemWriteListener0.getStepExecutionHolder();
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus6);
        org.junit.Assert.assertNotNull(stepExecutionHolder8);
        org.junit.Assert.assertNotNull(stepExecutionHolder15);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener1 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution2 = null;
        org.springframework.batch.core.ExitStatus exitStatus3 = timedChunkListener1.afterStep(stepExecution2);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedChunkListener1.getStepExecutionHolder();
        timedItemReadListener0.afterRead((java.lang.Object) stepExecutionHolder4);
        org.springframework.batch.core.StepExecution stepExecution6 = null;
        org.springframework.batch.core.ExitStatus exitStatus7 = timedItemReadListener0.afterStep(stepExecution6);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener8 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = timedItemReadListener8.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder10 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemReadListener8.setTimerHolder(timerHolder10);
        timedItemReadListener0.afterRead((java.lang.Object) timedItemReadListener8);
        org.springframework.batch.core.StepExecution stepExecution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedItemReadListener8.beforeStep(stepExecution13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus3);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus7);
        org.junit.Assert.assertNotNull(stepExecutionHolder9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener4 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        org.springframework.batch.core.ExitStatus exitStatus6 = timedItemProcessListener4.afterStep(stepExecution5);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener7 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder8 = timedItemProcessListener7.getStepExecutionHolder();
        timedItemProcessListener4.setStepExecutionHolder(stepExecutionHolder8);
        timedItemWriteListener0.setStepExecutionHolder(stepExecutionHolder8);
        java.lang.Class<?> wildcardClass11 = timedItemWriteListener0.getClass();
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus6);
        org.junit.Assert.assertNotNull(stepExecutionHolder8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        java.util.List list2 = null;
        timedItemWriteListener0.beforeWrite(list2);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemWriteListener9.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener11 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder12 = timedItemWriteListener11.getStepExecutionHolder();
        timedItemWriteListener9.setStepExecutionHolder(stepExecutionHolder12);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener14 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder15 = timedItemProcessListener14.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener16 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution17 = null;
        org.springframework.batch.core.ExitStatus exitStatus18 = timedItemProcessListener16.afterStep(stepExecution17);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener19 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = timedItemProcessListener19.getStepExecutionHolder();
        timedItemProcessListener16.setStepExecutionHolder(stepExecutionHolder20);
        timedItemProcessListener14.setStepExecutionHolder(stepExecutionHolder20);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener23 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder24 = timedItemWriteListener23.getStepExecutionHolder();
        java.lang.Exception exception25 = null;
        timedItemProcessListener14.onProcessError((java.lang.Object) stepExecutionHolder24, exception25);
        timedItemProcessListener14.beforeProcess((java.lang.Object) "chunk");
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener29 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener30 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder31 = timedItemWriteListener30.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder32 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener30.setTimerHolder(timerHolder32);
        timerHolder32.setGroup("metered");
        timedJobExecutionListener29.setTimerHolder(timerHolder32);
        timedItemProcessListener14.beforeProcess((java.lang.Object) timedJobExecutionListener29);
        timedItemProcessListener0.afterProcess((java.lang.Object) timedItemWriteListener9, (java.lang.Object) timedJobExecutionListener29);
        org.springframework.batch.core.JobExecution jobExecution39 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedJobExecutionListener29.beforeJob(jobExecution39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNotNull(stepExecutionHolder12);
        org.junit.Assert.assertNotNull(stepExecutionHolder15);
        org.junit.Assert.assertNull(exitStatus18);
        org.junit.Assert.assertNotNull(stepExecutionHolder20);
        org.junit.Assert.assertNotNull(stepExecutionHolder24);
        org.junit.Assert.assertNotNull(stepExecutionHolder31);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener0 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener1 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemWriteListener1.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder3 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener1.setTimerHolder(timerHolder3);
        timerHolder3.setGroup("metered");
        timedJobExecutionListener0.setTimerHolder(timerHolder3);
        timerHolder3.destroy();
        timerHolder3.setGroup("timed");
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemWriteListener3.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder5 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener3.setTimerHolder(timerHolder5);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener7 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution8 = null;
        org.springframework.batch.core.ExitStatus exitStatus9 = timedItemProcessListener7.afterStep(stepExecution8);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener10 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder11 = timedItemProcessListener10.getStepExecutionHolder();
        timedItemProcessListener7.setStepExecutionHolder(stepExecutionHolder11);
        timedItemWriteListener3.setStepExecutionHolder(stepExecutionHolder11);
        java.util.List list14 = null;
        timedItemWriteListener3.afterWrite(list14);
        java.util.List list16 = null;
        timedItemWriteListener3.beforeWrite(list16);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener18 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder19 = timedItemProcessListener18.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener20 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution21 = null;
        org.springframework.batch.core.ExitStatus exitStatus22 = timedItemProcessListener20.afterStep(stepExecution21);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener23 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder24 = timedItemProcessListener23.getStepExecutionHolder();
        timedItemProcessListener20.setStepExecutionHolder(stepExecutionHolder24);
        timedItemProcessListener18.setStepExecutionHolder(stepExecutionHolder24);
        timedItemProcessListener18.beforeProcess((java.lang.Object) 10.0d);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener29 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder30 = timedItemWriteListener29.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder31 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener29.setTimerHolder(timerHolder31);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener33 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution34 = null;
        org.springframework.batch.core.ExitStatus exitStatus35 = timedItemProcessListener33.afterStep(stepExecution34);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener36 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder37 = timedItemProcessListener36.getStepExecutionHolder();
        timedItemProcessListener33.setStepExecutionHolder(stepExecutionHolder37);
        timedItemWriteListener29.setStepExecutionHolder(stepExecutionHolder37);
        timedItemProcessListener18.afterProcess((java.lang.Object) timedItemWriteListener29, (java.lang.Object) 10.0f);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener42 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution43 = null;
        org.springframework.batch.core.ExitStatus exitStatus44 = timedItemProcessListener42.afterStep(stepExecution43);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener45 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder46 = timedItemProcessListener45.getStepExecutionHolder();
        timedItemProcessListener42.setStepExecutionHolder(stepExecutionHolder46);
        timedItemWriteListener29.setStepExecutionHolder(stepExecutionHolder46);
        timedItemProcessListener0.afterProcess((java.lang.Object) timedItemWriteListener3, (java.lang.Object) stepExecutionHolder46);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener50 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder51 = timedItemProcessListener50.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener52 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution53 = null;
        org.springframework.batch.core.ExitStatus exitStatus54 = timedItemProcessListener52.afterStep(stepExecution53);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener55 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder56 = timedItemProcessListener55.getStepExecutionHolder();
        timedItemProcessListener52.setStepExecutionHolder(stepExecutionHolder56);
        timedItemProcessListener50.setStepExecutionHolder(stepExecutionHolder56);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener59 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder60 = timedItemWriteListener59.getStepExecutionHolder();
        java.lang.Exception exception61 = null;
        timedItemProcessListener50.onProcessError((java.lang.Object) stepExecutionHolder60, exception61);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener63 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution64 = null;
        org.springframework.batch.core.ExitStatus exitStatus65 = timedChunkListener63.afterStep(stepExecution64);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder66 = timedChunkListener63.getStepExecutionHolder();
        java.lang.Exception exception67 = null;
        timedItemProcessListener50.onProcessError((java.lang.Object) stepExecutionHolder66, exception67);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder66);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus9);
        org.junit.Assert.assertNotNull(stepExecutionHolder11);
        org.junit.Assert.assertNotNull(stepExecutionHolder19);
        org.junit.Assert.assertNull(exitStatus22);
        org.junit.Assert.assertNotNull(stepExecutionHolder24);
        org.junit.Assert.assertNotNull(stepExecutionHolder30);
        org.junit.Assert.assertNull(exitStatus35);
        org.junit.Assert.assertNotNull(stepExecutionHolder37);
        org.junit.Assert.assertNull(exitStatus44);
        org.junit.Assert.assertNotNull(stepExecutionHolder46);
        org.junit.Assert.assertNotNull(stepExecutionHolder51);
        org.junit.Assert.assertNull(exitStatus54);
        org.junit.Assert.assertNotNull(stepExecutionHolder56);
        org.junit.Assert.assertNotNull(stepExecutionHolder60);
        org.junit.Assert.assertNull(exitStatus65);
        org.junit.Assert.assertNotNull(stepExecutionHolder66);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext1 = null;
        timedChunkListener0.afterChunkError(chunkContext1);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext3 = null;
        timedChunkListener0.afterChunk(chunkContext3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution6 = null;
        org.springframework.batch.core.ExitStatus exitStatus7 = timedItemProcessListener5.afterStep(stepExecution6);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener8 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = timedItemProcessListener8.getStepExecutionHolder();
        timedItemProcessListener5.setStepExecutionHolder(stepExecutionHolder9);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener11 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution12 = null;
        org.springframework.batch.core.ExitStatus exitStatus13 = timedItemProcessListener11.afterStep(stepExecution12);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener14 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder15 = timedItemProcessListener14.getStepExecutionHolder();
        timedItemProcessListener11.setStepExecutionHolder(stepExecutionHolder15);
        timedItemProcessListener5.setStepExecutionHolder(stepExecutionHolder15);
        timedChunkListener0.setStepExecutionHolder(stepExecutionHolder15);
        org.springframework.batch.core.StepExecution stepExecution19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedChunkListener0.beforeStep(stepExecution19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus7);
        org.junit.Assert.assertNotNull(stepExecutionHolder9);
        org.junit.Assert.assertNull(exitStatus13);
        org.junit.Assert.assertNotNull(stepExecutionHolder15);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener4 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder5 = timedItemWriteListener4.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder6 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener4.setTimerHolder(timerHolder6);
        timerHolder6.setGroup("metered");
        timedItemWriteListener0.setTimerHolder(timerHolder6);
        java.util.List list11 = null;
        timedItemWriteListener0.beforeWrite(list11);
        org.springframework.batch.core.StepExecution stepExecution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedItemWriteListener0.beforeStep(stepExecution13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNotNull(stepExecutionHolder5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener4 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        org.springframework.batch.core.ExitStatus exitStatus6 = timedItemProcessListener4.afterStep(stepExecution5);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener7 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder8 = timedItemProcessListener7.getStepExecutionHolder();
        timedItemProcessListener4.setStepExecutionHolder(stepExecutionHolder8);
        timedItemWriteListener0.setStepExecutionHolder(stepExecutionHolder8);
        org.springframework.batch.core.StepExecution stepExecution11 = null;
        org.springframework.batch.core.ExitStatus exitStatus12 = timedItemWriteListener0.afterStep(stepExecution11);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder13 = new com.bazoud.metrics.springbatch.timer.StepExecutionHolder();
        timedItemWriteListener0.setStepExecutionHolder(stepExecutionHolder13);
        java.util.List list15 = null;
        timedItemWriteListener0.afterWrite(list15);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus6);
        org.junit.Assert.assertNotNull(stepExecutionHolder8);
        org.junit.Assert.assertNull(exitStatus12);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.beforeProcess((java.lang.Object) 10.0d);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener11 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder12 = timedItemWriteListener11.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder13 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener11.setTimerHolder(timerHolder13);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution16 = null;
        org.springframework.batch.core.ExitStatus exitStatus17 = timedItemProcessListener15.afterStep(stepExecution16);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener18 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder19 = timedItemProcessListener18.getStepExecutionHolder();
        timedItemProcessListener15.setStepExecutionHolder(stepExecutionHolder19);
        timedItemWriteListener11.setStepExecutionHolder(stepExecutionHolder19);
        timedItemProcessListener0.afterProcess((java.lang.Object) timedItemWriteListener11, (java.lang.Object) 10.0f);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener24 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution25 = null;
        org.springframework.batch.core.ExitStatus exitStatus26 = timedItemProcessListener24.afterStep(stepExecution25);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener27 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder28 = timedItemProcessListener27.getStepExecutionHolder();
        timedItemProcessListener24.setStepExecutionHolder(stepExecutionHolder28);
        timedItemWriteListener11.setStepExecutionHolder(stepExecutionHolder28);
        java.util.List list31 = null;
        timedItemWriteListener11.afterWrite(list31);
        java.util.List list33 = null;
        timedItemWriteListener11.afterWrite(list33);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(stepExecutionHolder12);
        org.junit.Assert.assertNull(exitStatus17);
        org.junit.Assert.assertNotNull(stepExecutionHolder19);
        org.junit.Assert.assertNull(exitStatus26);
        org.junit.Assert.assertNotNull(stepExecutionHolder28);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener timedStepExecutionListener0 = new com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener1 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemProcessListener1.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution4 = null;
        org.springframework.batch.core.ExitStatus exitStatus5 = timedItemProcessListener3.afterStep(stepExecution4);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener6 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder7 = timedItemProcessListener6.getStepExecutionHolder();
        timedItemProcessListener3.setStepExecutionHolder(stepExecutionHolder7);
        timedItemProcessListener1.setStepExecutionHolder(stepExecutionHolder7);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener10 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder11 = timedItemWriteListener10.getStepExecutionHolder();
        java.lang.Exception exception12 = null;
        timedItemProcessListener1.onProcessError((java.lang.Object) stepExecutionHolder11, exception12);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder16 = timedItemWriteListener15.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder17 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener15.setTimerHolder(timerHolder17);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener19 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = timedItemWriteListener19.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder21 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener19.setTimerHolder(timerHolder21);
        timerHolder21.setGroup("metered");
        timedItemWriteListener15.setTimerHolder(timerHolder21);
        timedItemProcessListener1.afterProcess((java.lang.Object) "step", (java.lang.Object) timerHolder21);
        timedStepExecutionListener0.setTimerHolder(timerHolder21);
        com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener timedStepExecutionListener28 = new com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener29 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder30 = timedItemProcessListener29.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener31 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution32 = null;
        org.springframework.batch.core.ExitStatus exitStatus33 = timedItemProcessListener31.afterStep(stepExecution32);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener34 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder35 = timedItemProcessListener34.getStepExecutionHolder();
        timedItemProcessListener31.setStepExecutionHolder(stepExecutionHolder35);
        timedItemProcessListener29.setStepExecutionHolder(stepExecutionHolder35);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener38 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder39 = timedItemWriteListener38.getStepExecutionHolder();
        java.lang.Exception exception40 = null;
        timedItemProcessListener29.onProcessError((java.lang.Object) stepExecutionHolder39, exception40);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener43 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder44 = timedItemWriteListener43.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder45 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener43.setTimerHolder(timerHolder45);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener47 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder48 = timedItemWriteListener47.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder49 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener47.setTimerHolder(timerHolder49);
        timerHolder49.setGroup("metered");
        timedItemWriteListener43.setTimerHolder(timerHolder49);
        timedItemProcessListener29.afterProcess((java.lang.Object) "step", (java.lang.Object) timerHolder49);
        timedStepExecutionListener28.setTimerHolder(timerHolder49);
        timerHolder49.setGroup("job");
        timedStepExecutionListener0.setTimerHolder(timerHolder49);
        org.springframework.batch.core.StepExecution stepExecution59 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedStepExecutionListener0.beforeStep(stepExecution59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
        org.junit.Assert.assertNull(exitStatus5);
        org.junit.Assert.assertNotNull(stepExecutionHolder7);
        org.junit.Assert.assertNotNull(stepExecutionHolder11);
        org.junit.Assert.assertNotNull(stepExecutionHolder16);
        org.junit.Assert.assertNotNull(stepExecutionHolder20);
        org.junit.Assert.assertNotNull(stepExecutionHolder30);
        org.junit.Assert.assertNull(exitStatus33);
        org.junit.Assert.assertNotNull(stepExecutionHolder35);
        org.junit.Assert.assertNotNull(stepExecutionHolder39);
        org.junit.Assert.assertNotNull(stepExecutionHolder44);
        org.junit.Assert.assertNotNull(stepExecutionHolder48);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext1 = null;
        timedChunkListener0.afterChunkError(chunkContext1);
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedChunkListener0.afterStep(stepExecution3);
        org.junit.Assert.assertNull(exitStatus4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener3 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedChunkListener3.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder5 = timedChunkListener3.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder5);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder7 = timedItemProcessListener0.getStepExecutionHolder();
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNotNull(stepExecutionHolder5);
        org.junit.Assert.assertNotNull(stepExecutionHolder7);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener1 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution2 = null;
        org.springframework.batch.core.ExitStatus exitStatus3 = timedChunkListener1.afterStep(stepExecution2);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedChunkListener1.getStepExecutionHolder();
        timedItemReadListener0.afterRead((java.lang.Object) stepExecutionHolder4);
        org.springframework.batch.core.StepExecution stepExecution6 = null;
        org.springframework.batch.core.ExitStatus exitStatus7 = timedItemReadListener0.afterStep(stepExecution6);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener8 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = timedItemReadListener8.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder10 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemReadListener8.setTimerHolder(timerHolder10);
        timedItemReadListener0.afterRead((java.lang.Object) timedItemReadListener8);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder13 = timedItemReadListener0.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution14 = null;
        org.springframework.batch.core.ExitStatus exitStatus15 = timedItemReadListener0.afterStep(stepExecution14);
        org.junit.Assert.assertNull(exitStatus3);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus7);
        org.junit.Assert.assertNotNull(stepExecutionHolder9);
        org.junit.Assert.assertNotNull(stepExecutionHolder13);
        org.junit.Assert.assertNull(exitStatus15);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemWriteListener9.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener11 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder12 = timedItemWriteListener11.getStepExecutionHolder();
        timedItemWriteListener9.setStepExecutionHolder(stepExecutionHolder12);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener14 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder15 = timedItemProcessListener14.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener16 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution17 = null;
        org.springframework.batch.core.ExitStatus exitStatus18 = timedItemProcessListener16.afterStep(stepExecution17);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener19 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = timedItemProcessListener19.getStepExecutionHolder();
        timedItemProcessListener16.setStepExecutionHolder(stepExecutionHolder20);
        timedItemProcessListener14.setStepExecutionHolder(stepExecutionHolder20);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener23 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder24 = timedItemWriteListener23.getStepExecutionHolder();
        java.lang.Exception exception25 = null;
        timedItemProcessListener14.onProcessError((java.lang.Object) stepExecutionHolder24, exception25);
        timedItemProcessListener14.beforeProcess((java.lang.Object) "chunk");
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener29 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener30 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder31 = timedItemWriteListener30.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder32 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener30.setTimerHolder(timerHolder32);
        timerHolder32.setGroup("metered");
        timedJobExecutionListener29.setTimerHolder(timerHolder32);
        timedItemProcessListener14.beforeProcess((java.lang.Object) timedJobExecutionListener29);
        timedItemProcessListener0.afterProcess((java.lang.Object) timedItemWriteListener9, (java.lang.Object) timedJobExecutionListener29);
        org.springframework.batch.core.StepExecution stepExecution39 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedItemProcessListener0.beforeStep(stepExecution39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNotNull(stepExecutionHolder12);
        org.junit.Assert.assertNotNull(stepExecutionHolder15);
        org.junit.Assert.assertNull(exitStatus18);
        org.junit.Assert.assertNotNull(stepExecutionHolder20);
        org.junit.Assert.assertNotNull(stepExecutionHolder24);
        org.junit.Assert.assertNotNull(stepExecutionHolder31);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution1);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener3 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder4 = null;
        meteredJobExecutionListener3.setMeterHolder(meterHolder4);
        org.springframework.batch.core.JobExecution jobExecution6 = null;
        meteredJobExecutionListener3.beforeJob(jobExecution6);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder8 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder8.setGroup("");
        meteredJobExecutionListener3.setMeterHolder(meterHolder8);
        meteredStepExecutionListener0.setMeterHolder(meterHolder8);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener13 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution14 = null;
        meteredJobExecutionListener13.beforeJob(jobExecution14);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder16 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        com.codahale.metrics.MetricRegistry metricRegistry17 = null;
        meterHolder16.setMetricRegistry(metricRegistry17);
        meteredJobExecutionListener13.setMeterHolder(meterHolder16);
        meteredStepExecutionListener0.setMeterHolder(meterHolder16);
        org.springframework.batch.core.StepExecution stepExecution21 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution21);
        org.springframework.batch.core.StepExecution stepExecution23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.batch.core.ExitStatus exitStatus24 = meteredStepExecutionListener0.afterStep(stepExecution23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution1);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener3 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder4 = null;
        meteredJobExecutionListener3.setMeterHolder(meterHolder4);
        org.springframework.batch.core.JobExecution jobExecution6 = null;
        meteredJobExecutionListener3.beforeJob(jobExecution6);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder8 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder8.setGroup("");
        meteredJobExecutionListener3.setMeterHolder(meterHolder8);
        meteredStepExecutionListener0.setMeterHolder(meterHolder8);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener13 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution14 = null;
        meteredJobExecutionListener13.beforeJob(jobExecution14);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder16 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        com.codahale.metrics.MetricRegistry metricRegistry17 = null;
        meterHolder16.setMetricRegistry(metricRegistry17);
        meteredJobExecutionListener13.setMeterHolder(meterHolder16);
        meteredStepExecutionListener0.setMeterHolder(meterHolder16);
        // The following exception was thrown during execution in test generation
        try {
            meterHolder16.mark("read");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        timedItemReadListener0.beforeRead();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemReadListener0.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemReadListener0.afterStep(stepExecution3);
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        org.springframework.batch.core.ExitStatus exitStatus6 = timedItemReadListener0.afterStep(stepExecution5);
        java.lang.Exception exception7 = null;
        timedItemReadListener0.onReadError(exception7);
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNull(exitStatus6);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemWriteListener9.getStepExecutionHolder();
        java.lang.Exception exception11 = null;
        timedItemProcessListener0.onProcessError((java.lang.Object) stepExecutionHolder10, exception11);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener14 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder15 = timedItemWriteListener14.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder16 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener14.setTimerHolder(timerHolder16);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener18 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder19 = timedItemWriteListener18.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder20 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener18.setTimerHolder(timerHolder20);
        timerHolder20.setGroup("metered");
        timedItemWriteListener14.setTimerHolder(timerHolder20);
        timedItemProcessListener0.afterProcess((java.lang.Object) "step", (java.lang.Object) timerHolder20);
        timerHolder20.destroy();
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNotNull(stepExecutionHolder15);
        org.junit.Assert.assertNotNull(stepExecutionHolder19);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution1);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener3 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder4 = null;
        meteredJobExecutionListener3.setMeterHolder(meterHolder4);
        org.springframework.batch.core.JobExecution jobExecution6 = null;
        meteredJobExecutionListener3.beforeJob(jobExecution6);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder8 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder8.setGroup("");
        meteredJobExecutionListener3.setMeterHolder(meterHolder8);
        meteredStepExecutionListener0.setMeterHolder(meterHolder8);
        meterHolder8.setGroup("metered");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedChunkListener0.afterStep(stepExecution3);
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedChunkListener0.beforeStep(stepExecution5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNull(exitStatus4);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemWriteListener9.getStepExecutionHolder();
        java.lang.Exception exception11 = null;
        timedItemProcessListener0.onProcessError((java.lang.Object) stepExecutionHolder10, exception11);
        timedItemProcessListener0.beforeProcess((java.lang.Object) "chunk");
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener15 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener16 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder17 = timedItemWriteListener16.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder18 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener16.setTimerHolder(timerHolder18);
        timerHolder18.setGroup("metered");
        timedJobExecutionListener15.setTimerHolder(timerHolder18);
        timedItemProcessListener0.beforeProcess((java.lang.Object) timedJobExecutionListener15);
        org.springframework.batch.core.JobExecution jobExecution24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedJobExecutionListener15.beforeJob(jobExecution24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNotNull(stepExecutionHolder17);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        timedItemReadListener0.beforeRead();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemReadListener0.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemReadListener0.afterStep(stepExecution3);
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        org.springframework.batch.core.ExitStatus exitStatus6 = timedItemReadListener0.afterStep(stepExecution5);
        org.springframework.batch.core.StepExecution stepExecution7 = null;
        org.springframework.batch.core.ExitStatus exitStatus8 = timedItemReadListener0.afterStep(stepExecution7);
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNull(exitStatus6);
        org.junit.Assert.assertNull(exitStatus8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.beforeProcess((java.lang.Object) 10.0d);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener11 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder12 = timedItemWriteListener11.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder13 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener11.setTimerHolder(timerHolder13);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution16 = null;
        org.springframework.batch.core.ExitStatus exitStatus17 = timedItemProcessListener15.afterStep(stepExecution16);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener18 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder19 = timedItemProcessListener18.getStepExecutionHolder();
        timedItemProcessListener15.setStepExecutionHolder(stepExecutionHolder19);
        timedItemWriteListener11.setStepExecutionHolder(stepExecutionHolder19);
        timedItemProcessListener0.afterProcess((java.lang.Object) timedItemWriteListener11, (java.lang.Object) 10.0f);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener24 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution25 = null;
        org.springframework.batch.core.ExitStatus exitStatus26 = timedItemProcessListener24.afterStep(stepExecution25);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener27 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder28 = timedItemProcessListener27.getStepExecutionHolder();
        timedItemProcessListener24.setStepExecutionHolder(stepExecutionHolder28);
        timedItemWriteListener11.setStepExecutionHolder(stepExecutionHolder28);
        org.springframework.batch.core.StepExecution stepExecution31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedItemWriteListener11.beforeStep(stepExecution31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(stepExecutionHolder12);
        org.junit.Assert.assertNull(exitStatus17);
        org.junit.Assert.assertNotNull(stepExecutionHolder19);
        org.junit.Assert.assertNull(exitStatus26);
        org.junit.Assert.assertNotNull(stepExecutionHolder28);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder0 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        com.codahale.metrics.MetricRegistry metricRegistry1 = null;
        meterHolder0.setMetricRegistry(metricRegistry1);
        // The following exception was thrown during execution in test generation
        try {
            meterHolder0.mark("step");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemProcessListener3.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder4);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener6 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution7 = null;
        org.springframework.batch.core.ExitStatus exitStatus8 = timedItemProcessListener6.afterStep(stepExecution7);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemProcessListener9.getStepExecutionHolder();
        timedItemProcessListener6.setStepExecutionHolder(stepExecutionHolder10);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder10);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder13 = timedItemProcessListener0.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution14 = null;
        boolean boolean15 = stepExecutionHolder13.after(stepExecution14);
        org.springframework.batch.core.StepExecution stepExecution16 = null;
        boolean boolean17 = stepExecutionHolder13.after(stepExecution16);
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus8);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNotNull(stepExecutionHolder13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemWriteListener9.getStepExecutionHolder();
        java.lang.Exception exception11 = null;
        timedItemProcessListener0.onProcessError((java.lang.Object) stepExecutionHolder10, exception11);
        timedItemProcessListener0.beforeProcess((java.lang.Object) "chunk");
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener15 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener16 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder17 = timedItemWriteListener16.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder18 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener16.setTimerHolder(timerHolder18);
        timerHolder18.setGroup("metered");
        timedJobExecutionListener15.setTimerHolder(timerHolder18);
        timedItemProcessListener0.beforeProcess((java.lang.Object) timedJobExecutionListener15);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder24 = timedItemProcessListener0.getStepExecutionHolder();
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNotNull(stepExecutionHolder17);
        org.junit.Assert.assertNotNull(stepExecutionHolder24);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener0 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener1 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemWriteListener1.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder3 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener1.setTimerHolder(timerHolder3);
        timerHolder3.setGroup("metered");
        timedJobExecutionListener0.setTimerHolder(timerHolder3);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener8 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = timedItemWriteListener8.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder10 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener8.setTimerHolder(timerHolder10);
        timerHolder10.setGroup("metered");
        timerHolder10.destroy();
        com.codahale.metrics.MetricRegistry metricRegistry15 = null;
        timerHolder10.setMetricRegistry(metricRegistry15);
        timerHolder10.destroy();
        timedJobExecutionListener0.setTimerHolder(timerHolder10);
        org.springframework.batch.core.JobExecution jobExecution19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedJobExecutionListener0.afterJob(jobExecution19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
        org.junit.Assert.assertNotNull(stepExecutionHolder9);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemWriteListener9.getStepExecutionHolder();
        java.lang.Exception exception11 = null;
        timedItemProcessListener0.onProcessError((java.lang.Object) stepExecutionHolder10, exception11);
        timedItemProcessListener0.beforeProcess((java.lang.Object) "chunk");
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener15 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener16 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder17 = timedItemWriteListener16.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder18 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener16.setTimerHolder(timerHolder18);
        timerHolder18.setGroup("metered");
        timedJobExecutionListener15.setTimerHolder(timerHolder18);
        timedItemProcessListener0.beforeProcess((java.lang.Object) timedJobExecutionListener15);
        org.springframework.batch.core.StepExecution stepExecution24 = null;
        org.springframework.batch.core.ExitStatus exitStatus25 = timedItemProcessListener0.afterStep(stepExecution24);
        java.lang.Exception exception27 = null;
        timedItemProcessListener0.onProcessError((java.lang.Object) 0, exception27);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNotNull(stepExecutionHolder17);
        org.junit.Assert.assertNull(exitStatus25);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener timedStepExecutionListener0 = new com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener1 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemProcessListener1.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution4 = null;
        org.springframework.batch.core.ExitStatus exitStatus5 = timedItemProcessListener3.afterStep(stepExecution4);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener6 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder7 = timedItemProcessListener6.getStepExecutionHolder();
        timedItemProcessListener3.setStepExecutionHolder(stepExecutionHolder7);
        timedItemProcessListener1.setStepExecutionHolder(stepExecutionHolder7);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener10 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder11 = timedItemWriteListener10.getStepExecutionHolder();
        java.lang.Exception exception12 = null;
        timedItemProcessListener1.onProcessError((java.lang.Object) stepExecutionHolder11, exception12);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder16 = timedItemWriteListener15.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder17 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener15.setTimerHolder(timerHolder17);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener19 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = timedItemWriteListener19.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder21 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener19.setTimerHolder(timerHolder21);
        timerHolder21.setGroup("metered");
        timedItemWriteListener15.setTimerHolder(timerHolder21);
        timedItemProcessListener1.afterProcess((java.lang.Object) "step", (java.lang.Object) timerHolder21);
        timedStepExecutionListener0.setTimerHolder(timerHolder21);
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener28 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener29 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder30 = timedItemWriteListener29.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder31 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener29.setTimerHolder(timerHolder31);
        timerHolder31.setGroup("metered");
        timedJobExecutionListener28.setTimerHolder(timerHolder31);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener36 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder37 = timedItemWriteListener36.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder38 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener36.setTimerHolder(timerHolder38);
        timerHolder38.setGroup("metered");
        timedJobExecutionListener28.setTimerHolder(timerHolder38);
        timedStepExecutionListener0.setTimerHolder(timerHolder38);
        org.springframework.batch.core.StepExecution stepExecution44 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedStepExecutionListener0.beforeStep(stepExecution44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
        org.junit.Assert.assertNull(exitStatus5);
        org.junit.Assert.assertNotNull(stepExecutionHolder7);
        org.junit.Assert.assertNotNull(stepExecutionHolder11);
        org.junit.Assert.assertNotNull(stepExecutionHolder16);
        org.junit.Assert.assertNotNull(stepExecutionHolder20);
        org.junit.Assert.assertNotNull(stepExecutionHolder30);
        org.junit.Assert.assertNotNull(stepExecutionHolder37);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemReadListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemReadListener0.setTimerHolder(timerHolder2);
        org.springframework.batch.core.StepExecution stepExecution4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedItemReadListener0.beforeStep(stepExecution4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemProcessListener3.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder4);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener6 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution7 = null;
        org.springframework.batch.core.ExitStatus exitStatus8 = timedItemProcessListener6.afterStep(stepExecution7);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemProcessListener9.getStepExecutionHolder();
        timedItemProcessListener6.setStepExecutionHolder(stepExecutionHolder10);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder10);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder13 = timedItemProcessListener0.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution14 = stepExecutionHolder13.getCurrent();
        org.springframework.batch.core.StepExecution stepExecution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            stepExecutionHolder13.before(stepExecution15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus8);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNotNull(stepExecutionHolder13);
        org.junit.Assert.assertNull(stepExecution14);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedChunkListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedChunkListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener3 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener4 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder5 = timedItemWriteListener4.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder6 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener4.setTimerHolder(timerHolder6);
        timerHolder6.setGroup("metered");
        timedJobExecutionListener3.setTimerHolder(timerHolder6);
        com.codahale.metrics.MetricRegistry metricRegistry11 = null;
        timerHolder6.setMetricRegistry(metricRegistry11);
        timedChunkListener0.setTimerHolder(timerHolder6);
        org.springframework.batch.core.StepExecution stepExecution14 = null;
        org.springframework.batch.core.ExitStatus exitStatus15 = timedChunkListener0.afterStep(stepExecution14);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
        org.junit.Assert.assertNotNull(stepExecutionHolder5);
        org.junit.Assert.assertNull(exitStatus15);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener4 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder5 = timedItemWriteListener4.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder6 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener4.setTimerHolder(timerHolder6);
        timerHolder6.setGroup("metered");
        timedItemWriteListener0.setTimerHolder(timerHolder6);
        java.util.List list11 = null;
        timedItemWriteListener0.beforeWrite(list11);
        java.util.List list13 = null;
        timedItemWriteListener0.afterWrite(list13);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNotNull(stepExecutionHolder5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext1 = null;
        timedChunkListener0.afterChunkError(chunkContext1);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext3 = null;
        timedChunkListener0.afterChunk(chunkContext3);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext5 = null;
        timedChunkListener0.afterChunk(chunkContext5);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener7 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution8 = null;
        org.springframework.batch.core.ExitStatus exitStatus9 = timedItemProcessListener7.afterStep(stepExecution8);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener10 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder11 = timedItemProcessListener10.getStepExecutionHolder();
        timedItemProcessListener7.setStepExecutionHolder(stepExecutionHolder11);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener13 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder14 = timedItemWriteListener13.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder15 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener13.setTimerHolder(timerHolder15);
        timerHolder15.setGroup("metered");
        com.codahale.metrics.MetricRegistry metricRegistry19 = null;
        timerHolder15.setMetricRegistry(metricRegistry19);
        timedItemProcessListener7.setTimerHolder(timerHolder15);
        timedChunkListener0.setTimerHolder(timerHolder15);
        org.junit.Assert.assertNull(exitStatus9);
        org.junit.Assert.assertNotNull(stepExecutionHolder11);
        org.junit.Assert.assertNotNull(stepExecutionHolder14);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedChunkListener0.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder5 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext6 = null;
        timedChunkListener0.afterChunkError(chunkContext6);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext8 = null;
        timedChunkListener0.beforeChunk(chunkContext8);
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        timedItemReadListener0.beforeRead();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemReadListener0.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemReadListener0.afterStep(stepExecution3);
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        org.springframework.batch.core.ExitStatus exitStatus6 = timedItemReadListener0.afterStep(stepExecution5);
        timedItemReadListener0.beforeRead();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener8 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = timedItemWriteListener8.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener10 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder11 = timedItemWriteListener10.getStepExecutionHolder();
        timedItemWriteListener8.setStepExecutionHolder(stepExecutionHolder11);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder13 = timedItemWriteListener8.getStepExecutionHolder();
        timedItemReadListener0.setStepExecutionHolder(stepExecutionHolder13);
        timedItemReadListener0.beforeRead();
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNull(exitStatus6);
        org.junit.Assert.assertNotNull(stepExecutionHolder9);
        org.junit.Assert.assertNotNull(stepExecutionHolder11);
        org.junit.Assert.assertNotNull(stepExecutionHolder13);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder3 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext4 = null;
        timedChunkListener0.beforeChunk(chunkContext4);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext6 = null;
        timedChunkListener0.afterChunkError(chunkContext6);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext8 = null;
        timedChunkListener0.afterChunk(chunkContext8);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            stepExecutionHolder10.before(stepExecution11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder3);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.beforeProcess((java.lang.Object) 10.0d);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener11 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder12 = timedItemWriteListener11.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder13 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener11.setTimerHolder(timerHolder13);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution16 = null;
        org.springframework.batch.core.ExitStatus exitStatus17 = timedItemProcessListener15.afterStep(stepExecution16);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener18 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder19 = timedItemProcessListener18.getStepExecutionHolder();
        timedItemProcessListener15.setStepExecutionHolder(stepExecutionHolder19);
        timedItemWriteListener11.setStepExecutionHolder(stepExecutionHolder19);
        timedItemProcessListener0.afterProcess((java.lang.Object) timedItemWriteListener11, (java.lang.Object) 10.0f);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener24 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution25 = null;
        org.springframework.batch.core.ExitStatus exitStatus26 = timedItemProcessListener24.afterStep(stepExecution25);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener27 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder28 = timedItemProcessListener27.getStepExecutionHolder();
        timedItemProcessListener24.setStepExecutionHolder(stepExecutionHolder28);
        timedItemWriteListener11.setStepExecutionHolder(stepExecutionHolder28);
        java.lang.Exception exception31 = null;
        java.util.List list32 = null;
        timedItemWriteListener11.onWriteError(exception31, list32);
        org.springframework.batch.core.StepExecution stepExecution34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedItemWriteListener11.beforeStep(stepExecution34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(stepExecutionHolder12);
        org.junit.Assert.assertNull(exitStatus17);
        org.junit.Assert.assertNotNull(stepExecutionHolder19);
        org.junit.Assert.assertNull(exitStatus26);
        org.junit.Assert.assertNotNull(stepExecutionHolder28);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        timerHolder2.setGroup("metered");
        timerHolder2.destroy();
        com.codahale.metrics.MetricRegistry metricRegistry7 = null;
        timerHolder2.setMetricRegistry(metricRegistry7);
        // The following exception was thrown during execution in test generation
        try {
            timerHolder2.time("sb_rollback_exception", "process", "step");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemWriteListener0.getStepExecutionHolder();
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder0 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        com.codahale.metrics.MetricRegistry metricRegistry1 = null;
        meterHolder0.setMetricRegistry(metricRegistry1);
        meterHolder0.destroy();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        timedItemReadListener0.beforeRead();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemReadListener0.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemReadListener0.afterStep(stepExecution3);
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        org.springframework.batch.core.ExitStatus exitStatus6 = timedItemReadListener0.afterStep(stepExecution5);
        timedItemReadListener0.beforeRead();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener8 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution9 = null;
        org.springframework.batch.core.ExitStatus exitStatus10 = timedChunkListener8.afterStep(stepExecution9);
        org.springframework.batch.core.StepExecution stepExecution11 = null;
        org.springframework.batch.core.ExitStatus exitStatus12 = timedChunkListener8.afterStep(stepExecution11);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder13 = timedChunkListener8.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder14 = timedChunkListener8.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution15 = null;
        boolean boolean16 = stepExecutionHolder14.after(stepExecution15);
        timedItemReadListener0.setStepExecutionHolder(stepExecutionHolder14);
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNull(exitStatus6);
        org.junit.Assert.assertNull(exitStatus10);
        org.junit.Assert.assertNull(exitStatus12);
        org.junit.Assert.assertNotNull(stepExecutionHolder13);
        org.junit.Assert.assertNotNull(stepExecutionHolder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder0 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timerHolder0.setGroup("hi!");
        java.lang.Class<?> wildcardClass3 = timerHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        timedItemReadListener0.beforeRead();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemReadListener0.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemReadListener0.afterStep(stepExecution3);
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        org.springframework.batch.core.ExitStatus exitStatus6 = timedItemReadListener0.afterStep(stepExecution5);
        timedItemReadListener0.beforeRead();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener8 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = timedItemWriteListener8.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener10 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder11 = timedItemWriteListener10.getStepExecutionHolder();
        timedItemWriteListener8.setStepExecutionHolder(stepExecutionHolder11);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder13 = timedItemWriteListener8.getStepExecutionHolder();
        timedItemReadListener0.setStepExecutionHolder(stepExecutionHolder13);
        org.springframework.batch.core.StepExecution stepExecution15 = null;
        boolean boolean16 = stepExecutionHolder13.after(stepExecution15);
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNull(exitStatus6);
        org.junit.Assert.assertNotNull(stepExecutionHolder9);
        org.junit.Assert.assertNotNull(stepExecutionHolder11);
        org.junit.Assert.assertNotNull(stepExecutionHolder13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        timerHolder2.setGroup("metered");
        timerHolder2.destroy();
        com.codahale.metrics.MetricRegistry metricRegistry7 = null;
        timerHolder2.setMetricRegistry(metricRegistry7);
        timerHolder2.setGroup("chunk");
        timerHolder2.stop("write", "step", "sb_rollback_exception");
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        java.lang.Object obj3 = null;
        java.lang.Exception exception4 = null;
        timedItemProcessListener0.onProcessError(obj3, exception4);
        org.junit.Assert.assertNull(exitStatus2);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener1 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution2 = null;
        org.springframework.batch.core.ExitStatus exitStatus3 = timedChunkListener1.afterStep(stepExecution2);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedChunkListener1.getStepExecutionHolder();
        timedItemReadListener0.afterRead((java.lang.Object) stepExecutionHolder4);
        org.springframework.batch.core.StepExecution stepExecution6 = null;
        org.springframework.batch.core.ExitStatus exitStatus7 = timedItemReadListener0.afterStep(stepExecution6);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener8 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = timedItemReadListener8.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder10 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemReadListener8.setTimerHolder(timerHolder10);
        timedItemReadListener0.afterRead((java.lang.Object) timedItemReadListener8);
        org.springframework.batch.core.StepExecution stepExecution13 = null;
        org.springframework.batch.core.ExitStatus exitStatus14 = timedItemReadListener8.afterStep(stepExecution13);
        java.lang.Exception exception15 = null;
        timedItemReadListener8.onReadError(exception15);
        org.junit.Assert.assertNull(exitStatus3);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus7);
        org.junit.Assert.assertNotNull(stepExecutionHolder9);
        org.junit.Assert.assertNull(exitStatus14);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemProcessListener3.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder4);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = null;
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener8 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = timedItemWriteListener8.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder10 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener8.setTimerHolder(timerHolder10);
        timerHolder10.setGroup("metered");
        java.lang.Exception exception14 = null;
        timedItemProcessListener0.onProcessError((java.lang.Object) "metered", exception14);
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNotNull(stepExecutionHolder9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener0 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener1 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemWriteListener1.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder3 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener1.setTimerHolder(timerHolder3);
        timerHolder3.setGroup("metered");
        timedJobExecutionListener0.setTimerHolder(timerHolder3);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener8 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = timedItemWriteListener8.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder10 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener8.setTimerHolder(timerHolder10);
        timerHolder10.setGroup("metered");
        timedJobExecutionListener0.setTimerHolder(timerHolder10);
        org.springframework.batch.core.JobExecution jobExecution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedJobExecutionListener0.afterJob(jobExecution15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
        org.junit.Assert.assertNotNull(stepExecutionHolder9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder3 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext4 = null;
        timedChunkListener0.beforeChunk(chunkContext4);
        org.springframework.batch.core.StepExecution stepExecution6 = null;
        org.springframework.batch.core.ExitStatus exitStatus7 = timedChunkListener0.afterStep(stepExecution6);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder8 = timedChunkListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener9 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution10 = null;
        org.springframework.batch.core.ExitStatus exitStatus11 = timedChunkListener9.afterStep(stepExecution10);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder12 = timedChunkListener9.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext13 = null;
        timedChunkListener9.beforeChunk(chunkContext13);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext15 = null;
        timedChunkListener9.afterChunkError(chunkContext15);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext17 = null;
        timedChunkListener9.afterChunk(chunkContext17);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder19 = timedChunkListener9.getStepExecutionHolder();
        timedChunkListener0.setStepExecutionHolder(stepExecutionHolder19);
        org.springframework.batch.core.StepExecution stepExecution21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedChunkListener0.beforeStep(stepExecution21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder3);
        org.junit.Assert.assertNull(exitStatus7);
        org.junit.Assert.assertNotNull(stepExecutionHolder8);
        org.junit.Assert.assertNull(exitStatus11);
        org.junit.Assert.assertNotNull(stepExecutionHolder12);
        org.junit.Assert.assertNotNull(stepExecutionHolder19);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemProcessListener3.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder4);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = null;
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder8 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timerHolder8.setGroup("hi!");
        timedItemProcessListener0.setTimerHolder(timerHolder8);
        // The following exception was thrown during execution in test generation
        try {
            timerHolder8.time("batch", "batch", "write");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        timerHolder2.setGroup("metered");
        com.codahale.metrics.MetricRegistry metricRegistry6 = null;
        timerHolder2.setMetricRegistry(metricRegistry6);
        timerHolder2.setGroup("read");
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.beforeProcess((java.lang.Object) 10.0d);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener11 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution12 = null;
        org.springframework.batch.core.ExitStatus exitStatus13 = timedChunkListener11.afterStep(stepExecution12);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder14 = timedChunkListener11.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext15 = null;
        timedChunkListener11.beforeChunk(chunkContext15);
        org.springframework.batch.core.StepExecution stepExecution17 = null;
        org.springframework.batch.core.ExitStatus exitStatus18 = timedChunkListener11.afterStep(stepExecution17);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder19 = timedChunkListener11.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext20 = null;
        timedChunkListener11.afterChunk(chunkContext20);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener22 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder23 = timedItemWriteListener22.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder24 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener22.setTimerHolder(timerHolder24);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener26 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution27 = null;
        org.springframework.batch.core.ExitStatus exitStatus28 = timedItemProcessListener26.afterStep(stepExecution27);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener29 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder30 = timedItemProcessListener29.getStepExecutionHolder();
        timedItemProcessListener26.setStepExecutionHolder(stepExecutionHolder30);
        timedItemWriteListener22.setStepExecutionHolder(stepExecutionHolder30);
        org.springframework.batch.core.StepExecution stepExecution33 = null;
        boolean boolean34 = stepExecutionHolder30.after(stepExecution33);
        timedChunkListener11.setStepExecutionHolder(stepExecutionHolder30);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder30);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder37 = timedItemProcessListener0.getStepExecutionHolder();
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNull(exitStatus13);
        org.junit.Assert.assertNotNull(stepExecutionHolder14);
        org.junit.Assert.assertNull(exitStatus18);
        org.junit.Assert.assertNotNull(stepExecutionHolder19);
        org.junit.Assert.assertNotNull(stepExecutionHolder23);
        org.junit.Assert.assertNull(exitStatus28);
        org.junit.Assert.assertNotNull(stepExecutionHolder30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(stepExecutionHolder37);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder3 = timedItemWriteListener2.getStepExecutionHolder();
        timedItemWriteListener0.setStepExecutionHolder(stepExecutionHolder3);
        org.springframework.batch.core.StepExecution stepExecution5 = stepExecutionHolder3.getCurrent();
        java.lang.Class<?> wildcardClass6 = stepExecutionHolder3.getClass();
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNotNull(stepExecutionHolder3);
        org.junit.Assert.assertNull(stepExecution5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedChunkListener0.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder5 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext6 = null;
        timedChunkListener0.afterChunk(chunkContext6);
        org.springframework.batch.core.StepExecution stepExecution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedChunkListener0.beforeStep(stepExecution8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder5);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemReadListener0.getStepExecutionHolder();
        timedItemReadListener0.beforeRead();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedItemReadListener0.beforeStep(stepExecution3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution1);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder3 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder3.setGroup("");
        com.codahale.metrics.MetricRegistry metricRegistry6 = null;
        meterHolder3.setMetricRegistry(metricRegistry6);
        meteredStepExecutionListener0.setMeterHolder(meterHolder3);
        // The following exception was thrown during execution in test generation
        try {
            meterHolder3.mark("read");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemWriteListener9.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener11 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder12 = timedItemWriteListener11.getStepExecutionHolder();
        timedItemWriteListener9.setStepExecutionHolder(stepExecutionHolder12);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener14 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder15 = timedItemProcessListener14.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener16 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution17 = null;
        org.springframework.batch.core.ExitStatus exitStatus18 = timedItemProcessListener16.afterStep(stepExecution17);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener19 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = timedItemProcessListener19.getStepExecutionHolder();
        timedItemProcessListener16.setStepExecutionHolder(stepExecutionHolder20);
        timedItemProcessListener14.setStepExecutionHolder(stepExecutionHolder20);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener23 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder24 = timedItemWriteListener23.getStepExecutionHolder();
        java.lang.Exception exception25 = null;
        timedItemProcessListener14.onProcessError((java.lang.Object) stepExecutionHolder24, exception25);
        timedItemProcessListener14.beforeProcess((java.lang.Object) "chunk");
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener29 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener30 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder31 = timedItemWriteListener30.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder32 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener30.setTimerHolder(timerHolder32);
        timerHolder32.setGroup("metered");
        timedJobExecutionListener29.setTimerHolder(timerHolder32);
        timedItemProcessListener14.beforeProcess((java.lang.Object) timedJobExecutionListener29);
        timedItemProcessListener0.afterProcess((java.lang.Object) timedItemWriteListener9, (java.lang.Object) timedJobExecutionListener29);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener39 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder40 = timedItemProcessListener39.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener41 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution42 = null;
        org.springframework.batch.core.ExitStatus exitStatus43 = timedItemProcessListener41.afterStep(stepExecution42);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener44 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder45 = timedItemProcessListener44.getStepExecutionHolder();
        timedItemProcessListener41.setStepExecutionHolder(stepExecutionHolder45);
        timedItemProcessListener39.setStepExecutionHolder(stepExecutionHolder45);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener48 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder49 = timedItemWriteListener48.getStepExecutionHolder();
        java.lang.Exception exception50 = null;
        timedItemProcessListener39.onProcessError((java.lang.Object) stepExecutionHolder49, exception50);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener53 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder54 = timedItemWriteListener53.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder55 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener53.setTimerHolder(timerHolder55);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener57 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder58 = timedItemWriteListener57.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder59 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener57.setTimerHolder(timerHolder59);
        timerHolder59.setGroup("metered");
        timedItemWriteListener53.setTimerHolder(timerHolder59);
        timedItemProcessListener39.afterProcess((java.lang.Object) "step", (java.lang.Object) timerHolder59);
        timedJobExecutionListener29.setTimerHolder(timerHolder59);
        timerHolder59.setGroup("batch");
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNotNull(stepExecutionHolder12);
        org.junit.Assert.assertNotNull(stepExecutionHolder15);
        org.junit.Assert.assertNull(exitStatus18);
        org.junit.Assert.assertNotNull(stepExecutionHolder20);
        org.junit.Assert.assertNotNull(stepExecutionHolder24);
        org.junit.Assert.assertNotNull(stepExecutionHolder31);
        org.junit.Assert.assertNotNull(stepExecutionHolder40);
        org.junit.Assert.assertNull(exitStatus43);
        org.junit.Assert.assertNotNull(stepExecutionHolder45);
        org.junit.Assert.assertNotNull(stepExecutionHolder49);
        org.junit.Assert.assertNotNull(stepExecutionHolder54);
        org.junit.Assert.assertNotNull(stepExecutionHolder58);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder3 = timedChunkListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        org.springframework.batch.core.ExitStatus exitStatus6 = timedChunkListener0.afterStep(stepExecution5);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext7 = null;
        timedChunkListener0.afterChunk(chunkContext7);
        org.springframework.batch.core.StepExecution stepExecution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedChunkListener0.beforeStep(stepExecution9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder3);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus6);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener0 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener1 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemWriteListener1.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder3 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener1.setTimerHolder(timerHolder3);
        timerHolder3.setGroup("metered");
        timedJobExecutionListener0.setTimerHolder(timerHolder3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener8 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = timedItemProcessListener8.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener10 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution11 = null;
        org.springframework.batch.core.ExitStatus exitStatus12 = timedItemProcessListener10.afterStep(stepExecution11);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener13 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder14 = timedItemProcessListener13.getStepExecutionHolder();
        timedItemProcessListener10.setStepExecutionHolder(stepExecutionHolder14);
        timedItemProcessListener8.setStepExecutionHolder(stepExecutionHolder14);
        timedItemProcessListener8.beforeProcess((java.lang.Object) 10.0d);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener19 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = timedItemWriteListener19.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder21 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener19.setTimerHolder(timerHolder21);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener23 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution24 = null;
        org.springframework.batch.core.ExitStatus exitStatus25 = timedItemProcessListener23.afterStep(stepExecution24);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener26 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder27 = timedItemProcessListener26.getStepExecutionHolder();
        timedItemProcessListener23.setStepExecutionHolder(stepExecutionHolder27);
        timedItemWriteListener19.setStepExecutionHolder(stepExecutionHolder27);
        timedItemProcessListener8.afterProcess((java.lang.Object) timedItemWriteListener19, (java.lang.Object) 10.0f);
        org.springframework.batch.core.StepExecution stepExecution32 = null;
        org.springframework.batch.core.ExitStatus exitStatus33 = timedItemWriteListener19.afterStep(stepExecution32);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener34 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder35 = timedItemWriteListener34.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder36 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener34.setTimerHolder(timerHolder36);
        timerHolder36.setGroup("metered");
        timerHolder36.destroy();
        com.codahale.metrics.MetricRegistry metricRegistry41 = null;
        timerHolder36.setMetricRegistry(metricRegistry41);
        timedItemWriteListener19.setTimerHolder(timerHolder36);
        timedJobExecutionListener0.setTimerHolder(timerHolder36);
        org.springframework.batch.core.JobExecution jobExecution45 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedJobExecutionListener0.afterJob(jobExecution45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
        org.junit.Assert.assertNotNull(stepExecutionHolder9);
        org.junit.Assert.assertNull(exitStatus12);
        org.junit.Assert.assertNotNull(stepExecutionHolder14);
        org.junit.Assert.assertNotNull(stepExecutionHolder20);
        org.junit.Assert.assertNull(exitStatus25);
        org.junit.Assert.assertNotNull(stepExecutionHolder27);
        org.junit.Assert.assertNull(exitStatus33);
        org.junit.Assert.assertNotNull(stepExecutionHolder35);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedChunkListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext3 = null;
        timedChunkListener0.afterChunkError(chunkContext3);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener1 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution2 = null;
        org.springframework.batch.core.ExitStatus exitStatus3 = timedChunkListener1.afterStep(stepExecution2);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedChunkListener1.getStepExecutionHolder();
        timedItemReadListener0.afterRead((java.lang.Object) stepExecutionHolder4);
        timedItemReadListener0.beforeRead();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener7 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder8 = timedItemWriteListener7.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder9 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener7.setTimerHolder(timerHolder9);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener11 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution12 = null;
        org.springframework.batch.core.ExitStatus exitStatus13 = timedItemProcessListener11.afterStep(stepExecution12);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener14 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder15 = timedItemProcessListener14.getStepExecutionHolder();
        timedItemProcessListener11.setStepExecutionHolder(stepExecutionHolder15);
        timedItemWriteListener7.setStepExecutionHolder(stepExecutionHolder15);
        org.springframework.batch.core.StepExecution stepExecution18 = null;
        org.springframework.batch.core.ExitStatus exitStatus19 = timedItemWriteListener7.afterStep(stepExecution18);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = new com.bazoud.metrics.springbatch.timer.StepExecutionHolder();
        timedItemWriteListener7.setStepExecutionHolder(stepExecutionHolder20);
        java.util.List list22 = null;
        timedItemWriteListener7.beforeWrite(list22);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener24 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder25 = timedItemWriteListener24.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder26 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener24.setTimerHolder(timerHolder26);
        timerHolder26.setGroup("metered");
        timerHolder26.destroy();
        com.codahale.metrics.MetricRegistry metricRegistry31 = null;
        timerHolder26.setMetricRegistry(metricRegistry31);
        timedItemWriteListener7.setTimerHolder(timerHolder26);
        timedItemReadListener0.setTimerHolder(timerHolder26);
        timerHolder26.setGroup("timed");
        // The following exception was thrown during execution in test generation
        try {
            timerHolder26.time("process", "read", "metered");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus3);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNotNull(stepExecutionHolder8);
        org.junit.Assert.assertNull(exitStatus13);
        org.junit.Assert.assertNotNull(stepExecutionHolder15);
        org.junit.Assert.assertNull(exitStatus19);
        org.junit.Assert.assertNotNull(stepExecutionHolder25);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder0 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder0.setGroup("");
        com.codahale.metrics.MetricRegistry metricRegistry3 = null;
        meterHolder0.setMetricRegistry(metricRegistry3);
        // The following exception was thrown during execution in test generation
        try {
            meterHolder0.mark("job", "step");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemWriteListener9.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener11 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder12 = timedItemWriteListener11.getStepExecutionHolder();
        timedItemWriteListener9.setStepExecutionHolder(stepExecutionHolder12);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener14 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder15 = timedItemProcessListener14.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener16 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution17 = null;
        org.springframework.batch.core.ExitStatus exitStatus18 = timedItemProcessListener16.afterStep(stepExecution17);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener19 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = timedItemProcessListener19.getStepExecutionHolder();
        timedItemProcessListener16.setStepExecutionHolder(stepExecutionHolder20);
        timedItemProcessListener14.setStepExecutionHolder(stepExecutionHolder20);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener23 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder24 = timedItemWriteListener23.getStepExecutionHolder();
        java.lang.Exception exception25 = null;
        timedItemProcessListener14.onProcessError((java.lang.Object) stepExecutionHolder24, exception25);
        timedItemProcessListener14.beforeProcess((java.lang.Object) "chunk");
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener29 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener30 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder31 = timedItemWriteListener30.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder32 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener30.setTimerHolder(timerHolder32);
        timerHolder32.setGroup("metered");
        timedJobExecutionListener29.setTimerHolder(timerHolder32);
        timedItemProcessListener14.beforeProcess((java.lang.Object) timedJobExecutionListener29);
        timedItemProcessListener0.afterProcess((java.lang.Object) timedItemWriteListener9, (java.lang.Object) timedJobExecutionListener29);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener39 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder40 = timedItemProcessListener39.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener41 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution42 = null;
        org.springframework.batch.core.ExitStatus exitStatus43 = timedItemProcessListener41.afterStep(stepExecution42);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener44 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder45 = timedItemProcessListener44.getStepExecutionHolder();
        timedItemProcessListener41.setStepExecutionHolder(stepExecutionHolder45);
        timedItemProcessListener39.setStepExecutionHolder(stepExecutionHolder45);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener48 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder49 = timedItemWriteListener48.getStepExecutionHolder();
        java.lang.Exception exception50 = null;
        timedItemProcessListener39.onProcessError((java.lang.Object) stepExecutionHolder49, exception50);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener53 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder54 = timedItemWriteListener53.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder55 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener53.setTimerHolder(timerHolder55);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener57 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder58 = timedItemWriteListener57.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder59 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener57.setTimerHolder(timerHolder59);
        timerHolder59.setGroup("metered");
        timedItemWriteListener53.setTimerHolder(timerHolder59);
        timedItemProcessListener39.afterProcess((java.lang.Object) "step", (java.lang.Object) timerHolder59);
        timedJobExecutionListener29.setTimerHolder(timerHolder59);
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener66 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener67 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder68 = timedItemWriteListener67.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder69 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener67.setTimerHolder(timerHolder69);
        timerHolder69.setGroup("metered");
        timedJobExecutionListener66.setTimerHolder(timerHolder69);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener74 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder75 = timedItemWriteListener74.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder76 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener74.setTimerHolder(timerHolder76);
        timerHolder76.setGroup("metered");
        timerHolder76.destroy();
        com.codahale.metrics.MetricRegistry metricRegistry81 = null;
        timerHolder76.setMetricRegistry(metricRegistry81);
        timerHolder76.destroy();
        timedJobExecutionListener66.setTimerHolder(timerHolder76);
        timedJobExecutionListener29.setTimerHolder(timerHolder76);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNotNull(stepExecutionHolder12);
        org.junit.Assert.assertNotNull(stepExecutionHolder15);
        org.junit.Assert.assertNull(exitStatus18);
        org.junit.Assert.assertNotNull(stepExecutionHolder20);
        org.junit.Assert.assertNotNull(stepExecutionHolder24);
        org.junit.Assert.assertNotNull(stepExecutionHolder31);
        org.junit.Assert.assertNotNull(stepExecutionHolder40);
        org.junit.Assert.assertNull(exitStatus43);
        org.junit.Assert.assertNotNull(stepExecutionHolder45);
        org.junit.Assert.assertNotNull(stepExecutionHolder49);
        org.junit.Assert.assertNotNull(stepExecutionHolder54);
        org.junit.Assert.assertNotNull(stepExecutionHolder58);
        org.junit.Assert.assertNotNull(stepExecutionHolder68);
        org.junit.Assert.assertNotNull(stepExecutionHolder75);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution1);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener3 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder4 = null;
        meteredJobExecutionListener3.setMeterHolder(meterHolder4);
        org.springframework.batch.core.JobExecution jobExecution6 = null;
        meteredJobExecutionListener3.beforeJob(jobExecution6);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder8 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder8.setGroup("");
        meteredJobExecutionListener3.setMeterHolder(meterHolder8);
        meteredStepExecutionListener0.setMeterHolder(meterHolder8);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener13 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution14 = null;
        meteredJobExecutionListener13.beforeJob(jobExecution14);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder16 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        com.codahale.metrics.MetricRegistry metricRegistry17 = null;
        meterHolder16.setMetricRegistry(metricRegistry17);
        meteredJobExecutionListener13.setMeterHolder(meterHolder16);
        meteredStepExecutionListener0.setMeterHolder(meterHolder16);
        org.springframework.batch.core.StepExecution stepExecution21 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution21);
        org.springframework.batch.core.StepExecution stepExecution23 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution23);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder1 = null;
        meteredJobExecutionListener0.setMeterHolder(meterHolder1);
        org.springframework.batch.core.JobExecution jobExecution3 = null;
        meteredJobExecutionListener0.beforeJob(jobExecution3);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder5 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder5.setGroup("");
        meteredJobExecutionListener0.setMeterHolder(meterHolder5);
        meterHolder5.setGroup("process");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution1);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener3 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder4 = null;
        meteredJobExecutionListener3.setMeterHolder(meterHolder4);
        org.springframework.batch.core.JobExecution jobExecution6 = null;
        meteredJobExecutionListener3.beforeJob(jobExecution6);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder8 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder8.setGroup("");
        meteredJobExecutionListener3.setMeterHolder(meterHolder8);
        meteredStepExecutionListener0.setMeterHolder(meterHolder8);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener13 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution14 = null;
        meteredJobExecutionListener13.beforeJob(jobExecution14);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder16 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        com.codahale.metrics.MetricRegistry metricRegistry17 = null;
        meterHolder16.setMetricRegistry(metricRegistry17);
        meteredJobExecutionListener13.setMeterHolder(meterHolder16);
        meteredStepExecutionListener0.setMeterHolder(meterHolder16);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener21 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        timedItemReadListener21.beforeRead();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder23 = timedItemReadListener21.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution24 = null;
        org.springframework.batch.core.ExitStatus exitStatus25 = timedItemReadListener21.afterStep(stepExecution24);
        org.springframework.batch.core.StepExecution stepExecution26 = null;
        org.springframework.batch.core.ExitStatus exitStatus27 = timedItemReadListener21.afterStep(stepExecution26);
        timedItemReadListener21.beforeRead();
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener29 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution30 = null;
        meteredStepExecutionListener29.beforeStep(stepExecution30);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder32 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder32.setGroup("chunk");
        meteredStepExecutionListener29.setMeterHolder(meterHolder32);
        timedItemReadListener21.afterRead((java.lang.Object) meteredStepExecutionListener29);
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener37 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution38 = null;
        meteredStepExecutionListener37.beforeStep(stepExecution38);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder40 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder40.setGroup("chunk");
        meteredStepExecutionListener37.setMeterHolder(meterHolder40);
        meteredStepExecutionListener29.setMeterHolder(meterHolder40);
        com.codahale.metrics.MetricRegistry metricRegistry45 = null;
        meterHolder40.setMetricRegistry(metricRegistry45);
        meteredStepExecutionListener0.setMeterHolder(meterHolder40);
        org.junit.Assert.assertNotNull(stepExecutionHolder23);
        org.junit.Assert.assertNull(exitStatus25);
        org.junit.Assert.assertNull(exitStatus27);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        org.springframework.batch.core.StepExecution stepExecution9 = null;
        org.springframework.batch.core.ExitStatus exitStatus10 = timedItemProcessListener0.afterStep(stepExecution9);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener11 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder12 = timedItemProcessListener11.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder13 = timedItemProcessListener11.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener14 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder15 = timedItemWriteListener14.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder16 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener14.setTimerHolder(timerHolder16);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener18 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution19 = null;
        org.springframework.batch.core.ExitStatus exitStatus20 = timedItemProcessListener18.afterStep(stepExecution19);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener21 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder22 = timedItemProcessListener21.getStepExecutionHolder();
        timedItemProcessListener18.setStepExecutionHolder(stepExecutionHolder22);
        timedItemWriteListener14.setStepExecutionHolder(stepExecutionHolder22);
        java.util.List list25 = null;
        timedItemWriteListener14.afterWrite(list25);
        java.util.List list27 = null;
        timedItemWriteListener14.beforeWrite(list27);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener29 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder30 = timedItemProcessListener29.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener31 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution32 = null;
        org.springframework.batch.core.ExitStatus exitStatus33 = timedItemProcessListener31.afterStep(stepExecution32);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener34 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder35 = timedItemProcessListener34.getStepExecutionHolder();
        timedItemProcessListener31.setStepExecutionHolder(stepExecutionHolder35);
        timedItemProcessListener29.setStepExecutionHolder(stepExecutionHolder35);
        timedItemProcessListener29.beforeProcess((java.lang.Object) 10.0d);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener40 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder41 = timedItemWriteListener40.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder42 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener40.setTimerHolder(timerHolder42);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener44 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution45 = null;
        org.springframework.batch.core.ExitStatus exitStatus46 = timedItemProcessListener44.afterStep(stepExecution45);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener47 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder48 = timedItemProcessListener47.getStepExecutionHolder();
        timedItemProcessListener44.setStepExecutionHolder(stepExecutionHolder48);
        timedItemWriteListener40.setStepExecutionHolder(stepExecutionHolder48);
        timedItemProcessListener29.afterProcess((java.lang.Object) timedItemWriteListener40, (java.lang.Object) 10.0f);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener53 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution54 = null;
        org.springframework.batch.core.ExitStatus exitStatus55 = timedItemProcessListener53.afterStep(stepExecution54);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener56 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder57 = timedItemProcessListener56.getStepExecutionHolder();
        timedItemProcessListener53.setStepExecutionHolder(stepExecutionHolder57);
        timedItemWriteListener40.setStepExecutionHolder(stepExecutionHolder57);
        timedItemProcessListener11.afterProcess((java.lang.Object) timedItemWriteListener14, (java.lang.Object) stepExecutionHolder57);
        java.lang.Exception exception61 = null;
        timedItemProcessListener0.onProcessError((java.lang.Object) timedItemWriteListener14, exception61);
        org.springframework.batch.core.StepExecution stepExecution63 = null;
        org.springframework.batch.core.ExitStatus exitStatus64 = timedItemProcessListener0.afterStep(stepExecution63);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder65 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder65.setGroup("chunk");
        java.lang.Exception exception68 = null;
        timedItemProcessListener0.onProcessError((java.lang.Object) "chunk", exception68);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNull(exitStatus10);
        org.junit.Assert.assertNotNull(stepExecutionHolder12);
        org.junit.Assert.assertNotNull(stepExecutionHolder13);
        org.junit.Assert.assertNotNull(stepExecutionHolder15);
        org.junit.Assert.assertNull(exitStatus20);
        org.junit.Assert.assertNotNull(stepExecutionHolder22);
        org.junit.Assert.assertNotNull(stepExecutionHolder30);
        org.junit.Assert.assertNull(exitStatus33);
        org.junit.Assert.assertNotNull(stepExecutionHolder35);
        org.junit.Assert.assertNotNull(stepExecutionHolder41);
        org.junit.Assert.assertNull(exitStatus46);
        org.junit.Assert.assertNotNull(stepExecutionHolder48);
        org.junit.Assert.assertNull(exitStatus55);
        org.junit.Assert.assertNotNull(stepExecutionHolder57);
        org.junit.Assert.assertNull(exitStatus64);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder3 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext4 = null;
        timedChunkListener0.beforeChunk(chunkContext4);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext6 = null;
        timedChunkListener0.afterChunkError(chunkContext6);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext8 = null;
        timedChunkListener0.afterChunk(chunkContext8);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext10 = null;
        timedChunkListener0.afterChunkError(chunkContext10);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder12 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext13 = null;
        timedChunkListener0.afterChunk(chunkContext13);
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder3);
        org.junit.Assert.assertNotNull(stepExecutionHolder12);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder3 = timedItemWriteListener2.getStepExecutionHolder();
        timedItemWriteListener0.setStepExecutionHolder(stepExecutionHolder3);
        java.util.List list5 = null;
        timedItemWriteListener0.afterWrite(list5);
        org.springframework.batch.core.StepExecution stepExecution7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedItemWriteListener0.beforeStep(stepExecution7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNotNull(stepExecutionHolder3);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        java.util.List list4 = null;
        timedItemWriteListener0.beforeWrite(list4);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemWriteListener0.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution7 = null;
        boolean boolean8 = stepExecutionHolder6.after(stepExecution7);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder3 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext4 = null;
        timedChunkListener0.beforeChunk(chunkContext4);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext6 = null;
        timedChunkListener0.afterChunkError(chunkContext6);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext8 = null;
        timedChunkListener0.afterChunk(chunkContext8);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext11 = null;
        timedChunkListener0.afterChunk(chunkContext11);
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder3);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemReadListener0.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution2 = null;
        org.springframework.batch.core.ExitStatus exitStatus3 = timedItemReadListener0.afterStep(stepExecution2);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus3);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution1 = null;
        meteredJobExecutionListener0.beforeJob(jobExecution1);
        org.springframework.batch.core.JobExecution jobExecution3 = null;
        meteredJobExecutionListener0.beforeJob(jobExecution3);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener5 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution6 = null;
        meteredJobExecutionListener5.beforeJob(jobExecution6);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder8 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        com.codahale.metrics.MetricRegistry metricRegistry9 = null;
        meterHolder8.setMetricRegistry(metricRegistry9);
        meteredJobExecutionListener5.setMeterHolder(meterHolder8);
        meterHolder8.setGroup("metered");
        meteredJobExecutionListener0.setMeterHolder(meterHolder8);
        org.springframework.batch.core.JobExecution jobExecution15 = null;
        // The following exception was thrown during execution in test generation
        try {
            meteredJobExecutionListener0.afterJob(jobExecution15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener4 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        org.springframework.batch.core.ExitStatus exitStatus6 = timedItemProcessListener4.afterStep(stepExecution5);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener7 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder8 = timedItemProcessListener7.getStepExecutionHolder();
        timedItemProcessListener4.setStepExecutionHolder(stepExecutionHolder8);
        timedItemWriteListener0.setStepExecutionHolder(stepExecutionHolder8);
        java.util.List list11 = null;
        timedItemWriteListener0.afterWrite(list11);
        java.util.List list13 = null;
        timedItemWriteListener0.beforeWrite(list13);
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder15 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder15);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus6);
        org.junit.Assert.assertNotNull(stepExecutionHolder8);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder0 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        com.codahale.metrics.MetricRegistry metricRegistry1 = null;
        meterHolder0.setMetricRegistry(metricRegistry1);
        com.codahale.metrics.MetricRegistry metricRegistry3 = null;
        meterHolder0.setMetricRegistry(metricRegistry3);
        // The following exception was thrown during execution in test generation
        try {
            meterHolder0.mark("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder1 = null;
        meteredJobExecutionListener0.setMeterHolder(meterHolder1);
        org.springframework.batch.core.JobExecution jobExecution3 = null;
        meteredJobExecutionListener0.beforeJob(jobExecution3);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder5 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder5.setGroup("");
        meterHolder5.setGroup("timed");
        meteredJobExecutionListener0.setMeterHolder(meterHolder5);
        org.springframework.batch.core.JobExecution jobExecution11 = null;
        // The following exception was thrown during execution in test generation
        try {
            meteredJobExecutionListener0.afterJob(jobExecution11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        java.lang.Exception exception4 = null;
        java.util.List list5 = null;
        timedItemWriteListener0.onWriteError(exception4, list5);
        java.lang.Exception exception7 = null;
        java.util.List list8 = null;
        timedItemWriteListener0.onWriteError(exception7, list8);
        org.springframework.batch.core.StepExecution stepExecution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedItemWriteListener0.beforeStep(stepExecution10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder3 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext4 = null;
        timedChunkListener0.beforeChunk(chunkContext4);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext6 = null;
        timedChunkListener0.afterChunkError(chunkContext6);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext8 = null;
        timedChunkListener0.afterChunkError(chunkContext8);
        org.springframework.batch.core.StepExecution stepExecution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedChunkListener0.beforeStep(stepExecution10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder3);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext1 = null;
        timedChunkListener0.afterChunkError(chunkContext1);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext3 = null;
        timedChunkListener0.afterChunk(chunkContext3);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext5 = null;
        timedChunkListener0.afterChunkError(chunkContext5);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemProcessListener3.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder4);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener6 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution7 = null;
        org.springframework.batch.core.ExitStatus exitStatus8 = timedItemProcessListener6.afterStep(stepExecution7);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemProcessListener9.getStepExecutionHolder();
        timedItemProcessListener6.setStepExecutionHolder(stepExecutionHolder10);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener12 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution13 = null;
        org.springframework.batch.core.ExitStatus exitStatus14 = timedItemProcessListener12.afterStep(stepExecution13);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder16 = timedItemProcessListener15.getStepExecutionHolder();
        timedItemProcessListener12.setStepExecutionHolder(stepExecutionHolder16);
        timedItemProcessListener6.setStepExecutionHolder(stepExecutionHolder16);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener19 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = timedItemWriteListener19.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder21 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener19.setTimerHolder(timerHolder21);
        timedItemProcessListener0.afterProcess((java.lang.Object) stepExecutionHolder16, (java.lang.Object) timedItemWriteListener19);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener24 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution25 = null;
        org.springframework.batch.core.ExitStatus exitStatus26 = timedChunkListener24.afterStep(stepExecution25);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder27 = timedChunkListener24.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext28 = null;
        timedChunkListener24.beforeChunk(chunkContext28);
        org.springframework.batch.core.StepExecution stepExecution30 = null;
        org.springframework.batch.core.ExitStatus exitStatus31 = timedChunkListener24.afterStep(stepExecution30);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder32 = timedChunkListener24.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder32);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener34 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution35 = null;
        org.springframework.batch.core.ExitStatus exitStatus36 = timedChunkListener34.afterStep(stepExecution35);
        org.springframework.batch.core.StepExecution stepExecution37 = null;
        org.springframework.batch.core.ExitStatus exitStatus38 = timedChunkListener34.afterStep(stepExecution37);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder39 = timedChunkListener34.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext40 = null;
        timedChunkListener34.afterChunkError(chunkContext40);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener42 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder43 = timedItemProcessListener42.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder44 = timedItemProcessListener42.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener45 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder46 = timedItemWriteListener45.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder47 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener45.setTimerHolder(timerHolder47);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener49 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution50 = null;
        org.springframework.batch.core.ExitStatus exitStatus51 = timedItemProcessListener49.afterStep(stepExecution50);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener52 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder53 = timedItemProcessListener52.getStepExecutionHolder();
        timedItemProcessListener49.setStepExecutionHolder(stepExecutionHolder53);
        timedItemWriteListener45.setStepExecutionHolder(stepExecutionHolder53);
        java.util.List list56 = null;
        timedItemWriteListener45.afterWrite(list56);
        java.util.List list58 = null;
        timedItemWriteListener45.beforeWrite(list58);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener60 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder61 = timedItemProcessListener60.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener62 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution63 = null;
        org.springframework.batch.core.ExitStatus exitStatus64 = timedItemProcessListener62.afterStep(stepExecution63);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener65 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder66 = timedItemProcessListener65.getStepExecutionHolder();
        timedItemProcessListener62.setStepExecutionHolder(stepExecutionHolder66);
        timedItemProcessListener60.setStepExecutionHolder(stepExecutionHolder66);
        timedItemProcessListener60.beforeProcess((java.lang.Object) 10.0d);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener71 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder72 = timedItemWriteListener71.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder73 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener71.setTimerHolder(timerHolder73);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener75 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution76 = null;
        org.springframework.batch.core.ExitStatus exitStatus77 = timedItemProcessListener75.afterStep(stepExecution76);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener78 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder79 = timedItemProcessListener78.getStepExecutionHolder();
        timedItemProcessListener75.setStepExecutionHolder(stepExecutionHolder79);
        timedItemWriteListener71.setStepExecutionHolder(stepExecutionHolder79);
        timedItemProcessListener60.afterProcess((java.lang.Object) timedItemWriteListener71, (java.lang.Object) 10.0f);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener84 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution85 = null;
        org.springframework.batch.core.ExitStatus exitStatus86 = timedItemProcessListener84.afterStep(stepExecution85);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener87 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder88 = timedItemProcessListener87.getStepExecutionHolder();
        timedItemProcessListener84.setStepExecutionHolder(stepExecutionHolder88);
        timedItemWriteListener71.setStepExecutionHolder(stepExecutionHolder88);
        timedItemProcessListener42.afterProcess((java.lang.Object) timedItemWriteListener45, (java.lang.Object) stepExecutionHolder88);
        timedChunkListener34.setStepExecutionHolder(stepExecutionHolder88);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder88);
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus8);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNull(exitStatus14);
        org.junit.Assert.assertNotNull(stepExecutionHolder16);
        org.junit.Assert.assertNotNull(stepExecutionHolder20);
        org.junit.Assert.assertNull(exitStatus26);
        org.junit.Assert.assertNotNull(stepExecutionHolder27);
        org.junit.Assert.assertNull(exitStatus31);
        org.junit.Assert.assertNotNull(stepExecutionHolder32);
        org.junit.Assert.assertNull(exitStatus36);
        org.junit.Assert.assertNull(exitStatus38);
        org.junit.Assert.assertNotNull(stepExecutionHolder39);
        org.junit.Assert.assertNotNull(stepExecutionHolder43);
        org.junit.Assert.assertNotNull(stepExecutionHolder44);
        org.junit.Assert.assertNotNull(stepExecutionHolder46);
        org.junit.Assert.assertNull(exitStatus51);
        org.junit.Assert.assertNotNull(stepExecutionHolder53);
        org.junit.Assert.assertNotNull(stepExecutionHolder61);
        org.junit.Assert.assertNull(exitStatus64);
        org.junit.Assert.assertNotNull(stepExecutionHolder66);
        org.junit.Assert.assertNotNull(stepExecutionHolder72);
        org.junit.Assert.assertNull(exitStatus77);
        org.junit.Assert.assertNotNull(stepExecutionHolder79);
        org.junit.Assert.assertNull(exitStatus86);
        org.junit.Assert.assertNotNull(stepExecutionHolder88);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        timedItemReadListener0.beforeRead();
        java.lang.Object obj2 = null;
        timedItemReadListener0.afterRead(obj2);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder0 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        com.codahale.metrics.MetricRegistry metricRegistry1 = null;
        timerHolder0.setMetricRegistry(metricRegistry1);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener1 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution2 = null;
        org.springframework.batch.core.ExitStatus exitStatus3 = timedChunkListener1.afterStep(stepExecution2);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedChunkListener1.getStepExecutionHolder();
        timedItemReadListener0.afterRead((java.lang.Object) stepExecutionHolder4);
        timedItemReadListener0.beforeRead();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener7 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder8 = timedItemWriteListener7.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder9 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener7.setTimerHolder(timerHolder9);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener11 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution12 = null;
        org.springframework.batch.core.ExitStatus exitStatus13 = timedItemProcessListener11.afterStep(stepExecution12);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener14 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder15 = timedItemProcessListener14.getStepExecutionHolder();
        timedItemProcessListener11.setStepExecutionHolder(stepExecutionHolder15);
        timedItemWriteListener7.setStepExecutionHolder(stepExecutionHolder15);
        org.springframework.batch.core.StepExecution stepExecution18 = null;
        org.springframework.batch.core.ExitStatus exitStatus19 = timedItemWriteListener7.afterStep(stepExecution18);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = new com.bazoud.metrics.springbatch.timer.StepExecutionHolder();
        timedItemWriteListener7.setStepExecutionHolder(stepExecutionHolder20);
        java.util.List list22 = null;
        timedItemWriteListener7.beforeWrite(list22);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener24 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder25 = timedItemWriteListener24.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder26 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener24.setTimerHolder(timerHolder26);
        timerHolder26.setGroup("metered");
        timerHolder26.destroy();
        com.codahale.metrics.MetricRegistry metricRegistry31 = null;
        timerHolder26.setMetricRegistry(metricRegistry31);
        timedItemWriteListener7.setTimerHolder(timerHolder26);
        timedItemReadListener0.setTimerHolder(timerHolder26);
        org.springframework.batch.core.StepExecution stepExecution35 = null;
        org.springframework.batch.core.ExitStatus exitStatus36 = timedItemReadListener0.afterStep(stepExecution35);
        org.junit.Assert.assertNull(exitStatus3);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNotNull(stepExecutionHolder8);
        org.junit.Assert.assertNull(exitStatus13);
        org.junit.Assert.assertNotNull(stepExecutionHolder15);
        org.junit.Assert.assertNull(exitStatus19);
        org.junit.Assert.assertNotNull(stepExecutionHolder25);
        org.junit.Assert.assertNull(exitStatus36);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener1 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution2 = null;
        org.springframework.batch.core.ExitStatus exitStatus3 = timedChunkListener1.afterStep(stepExecution2);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedChunkListener1.getStepExecutionHolder();
        timedItemReadListener0.afterRead((java.lang.Object) stepExecutionHolder4);
        timedItemReadListener0.beforeRead();
        org.springframework.batch.core.StepExecution stepExecution7 = null;
        org.springframework.batch.core.ExitStatus exitStatus8 = timedItemReadListener0.afterStep(stepExecution7);
        org.junit.Assert.assertNull(exitStatus3);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus8);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemProcessListener3.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder4);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = null;
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder8 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timerHolder8.setGroup("hi!");
        timedItemProcessListener0.setTimerHolder(timerHolder8);
        org.springframework.batch.core.StepExecution stepExecution12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedItemProcessListener0.beforeStep(stepExecution12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution1);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener3 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder4 = null;
        meteredJobExecutionListener3.setMeterHolder(meterHolder4);
        org.springframework.batch.core.JobExecution jobExecution6 = null;
        meteredJobExecutionListener3.beforeJob(jobExecution6);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder8 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder8.setGroup("");
        meteredJobExecutionListener3.setMeterHolder(meterHolder8);
        meteredStepExecutionListener0.setMeterHolder(meterHolder8);
        // The following exception was thrown during execution in test generation
        try {
            meterHolder8.mark("write");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.beforeProcess((java.lang.Object) 10.0d);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener11 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder12 = timedItemWriteListener11.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder13 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener11.setTimerHolder(timerHolder13);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution16 = null;
        org.springframework.batch.core.ExitStatus exitStatus17 = timedItemProcessListener15.afterStep(stepExecution16);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener18 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder19 = timedItemProcessListener18.getStepExecutionHolder();
        timedItemProcessListener15.setStepExecutionHolder(stepExecutionHolder19);
        timedItemWriteListener11.setStepExecutionHolder(stepExecutionHolder19);
        timedItemProcessListener0.afterProcess((java.lang.Object) timedItemWriteListener11, (java.lang.Object) 10.0f);
        org.springframework.batch.core.StepExecution stepExecution24 = null;
        org.springframework.batch.core.ExitStatus exitStatus25 = timedItemWriteListener11.afterStep(stepExecution24);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener26 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener27 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution28 = null;
        org.springframework.batch.core.ExitStatus exitStatus29 = timedChunkListener27.afterStep(stepExecution28);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder30 = timedChunkListener27.getStepExecutionHolder();
        timedItemReadListener26.afterRead((java.lang.Object) stepExecutionHolder30);
        timedItemReadListener26.beforeRead();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener33 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder34 = timedItemWriteListener33.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder35 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener33.setTimerHolder(timerHolder35);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener37 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution38 = null;
        org.springframework.batch.core.ExitStatus exitStatus39 = timedItemProcessListener37.afterStep(stepExecution38);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener40 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder41 = timedItemProcessListener40.getStepExecutionHolder();
        timedItemProcessListener37.setStepExecutionHolder(stepExecutionHolder41);
        timedItemWriteListener33.setStepExecutionHolder(stepExecutionHolder41);
        org.springframework.batch.core.StepExecution stepExecution44 = null;
        org.springframework.batch.core.ExitStatus exitStatus45 = timedItemWriteListener33.afterStep(stepExecution44);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder46 = new com.bazoud.metrics.springbatch.timer.StepExecutionHolder();
        timedItemWriteListener33.setStepExecutionHolder(stepExecutionHolder46);
        java.util.List list48 = null;
        timedItemWriteListener33.beforeWrite(list48);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener50 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder51 = timedItemWriteListener50.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder52 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener50.setTimerHolder(timerHolder52);
        timerHolder52.setGroup("metered");
        timerHolder52.destroy();
        com.codahale.metrics.MetricRegistry metricRegistry57 = null;
        timerHolder52.setMetricRegistry(metricRegistry57);
        timedItemWriteListener33.setTimerHolder(timerHolder52);
        timedItemReadListener26.setTimerHolder(timerHolder52);
        timerHolder52.setGroup("timed");
        timedItemWriteListener11.setTimerHolder(timerHolder52);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(stepExecutionHolder12);
        org.junit.Assert.assertNull(exitStatus17);
        org.junit.Assert.assertNotNull(stepExecutionHolder19);
        org.junit.Assert.assertNull(exitStatus25);
        org.junit.Assert.assertNull(exitStatus29);
        org.junit.Assert.assertNotNull(stepExecutionHolder30);
        org.junit.Assert.assertNotNull(stepExecutionHolder34);
        org.junit.Assert.assertNull(exitStatus39);
        org.junit.Assert.assertNotNull(stepExecutionHolder41);
        org.junit.Assert.assertNull(exitStatus45);
        org.junit.Assert.assertNotNull(stepExecutionHolder51);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener4 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        org.springframework.batch.core.ExitStatus exitStatus6 = timedItemProcessListener4.afterStep(stepExecution5);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener7 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder8 = timedItemProcessListener7.getStepExecutionHolder();
        timedItemProcessListener4.setStepExecutionHolder(stepExecutionHolder8);
        timedItemWriteListener0.setStepExecutionHolder(stepExecutionHolder8);
        java.util.List list11 = null;
        timedItemWriteListener0.afterWrite(list11);
        java.util.List list13 = null;
        timedItemWriteListener0.afterWrite(list13);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus6);
        org.junit.Assert.assertNotNull(stepExecutionHolder8);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemProcessListener3.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder4);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener6 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution7 = null;
        org.springframework.batch.core.ExitStatus exitStatus8 = timedItemProcessListener6.afterStep(stepExecution7);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemProcessListener9.getStepExecutionHolder();
        timedItemProcessListener6.setStepExecutionHolder(stepExecutionHolder10);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener12 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution13 = null;
        org.springframework.batch.core.ExitStatus exitStatus14 = timedItemProcessListener12.afterStep(stepExecution13);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder16 = timedItemProcessListener15.getStepExecutionHolder();
        timedItemProcessListener12.setStepExecutionHolder(stepExecutionHolder16);
        timedItemProcessListener6.setStepExecutionHolder(stepExecutionHolder16);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener19 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = timedItemWriteListener19.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder21 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener19.setTimerHolder(timerHolder21);
        timedItemProcessListener0.afterProcess((java.lang.Object) stepExecutionHolder16, (java.lang.Object) timedItemWriteListener19);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener24 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution25 = null;
        org.springframework.batch.core.ExitStatus exitStatus26 = timedChunkListener24.afterStep(stepExecution25);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder27 = timedChunkListener24.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext28 = null;
        timedChunkListener24.beforeChunk(chunkContext28);
        org.springframework.batch.core.StepExecution stepExecution30 = null;
        org.springframework.batch.core.ExitStatus exitStatus31 = timedChunkListener24.afterStep(stepExecution30);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder32 = timedChunkListener24.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder32);
        org.springframework.batch.core.StepExecution stepExecution34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedItemProcessListener0.beforeStep(stepExecution34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus8);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNull(exitStatus14);
        org.junit.Assert.assertNotNull(stepExecutionHolder16);
        org.junit.Assert.assertNotNull(stepExecutionHolder20);
        org.junit.Assert.assertNull(exitStatus26);
        org.junit.Assert.assertNotNull(stepExecutionHolder27);
        org.junit.Assert.assertNull(exitStatus31);
        org.junit.Assert.assertNotNull(stepExecutionHolder32);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution1);
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.batch.core.ExitStatus exitStatus4 = meteredStepExecutionListener0.afterStep(stepExecution3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedChunkListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener2 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder3 = timedChunkListener2.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedChunkListener2.getStepExecutionHolder();
        timedChunkListener0.setStepExecutionHolder(stepExecutionHolder4);
        org.springframework.batch.core.StepExecution stepExecution6 = stepExecutionHolder4.getCurrent();
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNotNull(stepExecutionHolder3);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(stepExecution6);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemWriteListener9.getStepExecutionHolder();
        java.lang.Exception exception11 = null;
        timedItemProcessListener0.onProcessError((java.lang.Object) stepExecutionHolder10, exception11);
        timedItemProcessListener0.beforeProcess((java.lang.Object) "chunk");
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener15 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener16 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder17 = timedItemWriteListener16.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder18 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener16.setTimerHolder(timerHolder18);
        timerHolder18.setGroup("metered");
        timedJobExecutionListener15.setTimerHolder(timerHolder18);
        timedItemProcessListener0.beforeProcess((java.lang.Object) timedJobExecutionListener15);
        org.springframework.batch.core.StepExecution stepExecution24 = null;
        org.springframework.batch.core.ExitStatus exitStatus25 = timedItemProcessListener0.afterStep(stepExecution24);
        org.springframework.batch.core.StepExecution stepExecution26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedItemProcessListener0.beforeStep(stepExecution26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNotNull(stepExecutionHolder17);
        org.junit.Assert.assertNull(exitStatus25);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedChunkListener0.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution6 = null;
        org.springframework.batch.core.ExitStatus exitStatus7 = timedItemProcessListener5.afterStep(stepExecution6);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener8 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = timedItemProcessListener8.getStepExecutionHolder();
        timedItemProcessListener5.setStepExecutionHolder(stepExecutionHolder9);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder11 = null;
        timedItemProcessListener5.setStepExecutionHolder(stepExecutionHolder11);
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder13 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timerHolder13.setGroup("hi!");
        timedItemProcessListener5.setTimerHolder(timerHolder13);
        timedChunkListener0.setTimerHolder(timerHolder13);
        java.lang.Class<?> wildcardClass18 = timedChunkListener0.getClass();
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNull(exitStatus7);
        org.junit.Assert.assertNotNull(stepExecutionHolder9);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemWriteListener9.getStepExecutionHolder();
        java.lang.Exception exception11 = null;
        timedItemProcessListener0.onProcessError((java.lang.Object) stepExecutionHolder10, exception11);
        timedItemProcessListener0.beforeProcess((java.lang.Object) "chunk");
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener15 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener16 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder17 = timedItemWriteListener16.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder18 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener16.setTimerHolder(timerHolder18);
        timerHolder18.setGroup("metered");
        timedJobExecutionListener15.setTimerHolder(timerHolder18);
        timedItemProcessListener0.beforeProcess((java.lang.Object) timedJobExecutionListener15);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener24 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution25 = null;
        org.springframework.batch.core.ExitStatus exitStatus26 = timedItemProcessListener24.afterStep(stepExecution25);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener27 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder28 = timedItemProcessListener27.getStepExecutionHolder();
        timedItemProcessListener24.setStepExecutionHolder(stepExecutionHolder28);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder30 = null;
        timedItemProcessListener24.setStepExecutionHolder(stepExecutionHolder30);
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder32 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timerHolder32.setGroup("hi!");
        timedItemProcessListener24.setTimerHolder(timerHolder32);
        timedJobExecutionListener15.setTimerHolder(timerHolder32);
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder37 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timerHolder37.setGroup("hi!");
        timedJobExecutionListener15.setTimerHolder(timerHolder37);
        org.springframework.batch.core.JobExecution jobExecution41 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedJobExecutionListener15.afterJob(jobExecution41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNotNull(stepExecutionHolder17);
        org.junit.Assert.assertNull(exitStatus26);
        org.junit.Assert.assertNotNull(stepExecutionHolder28);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution1);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener3 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution4 = null;
        meteredJobExecutionListener3.beforeJob(jobExecution4);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder6 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        com.codahale.metrics.MetricRegistry metricRegistry7 = null;
        meterHolder6.setMetricRegistry(metricRegistry7);
        meteredJobExecutionListener3.setMeterHolder(meterHolder6);
        meteredStepExecutionListener0.setMeterHolder(meterHolder6);
        // The following exception was thrown during execution in test generation
        try {
            meterHolder6.mark("batch");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution1 = null;
        meteredJobExecutionListener0.beforeJob(jobExecution1);
        org.springframework.batch.core.JobExecution jobExecution3 = null;
        meteredJobExecutionListener0.beforeJob(jobExecution3);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener5 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution6 = null;
        meteredJobExecutionListener5.beforeJob(jobExecution6);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder8 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        com.codahale.metrics.MetricRegistry metricRegistry9 = null;
        meterHolder8.setMetricRegistry(metricRegistry9);
        meteredJobExecutionListener5.setMeterHolder(meterHolder8);
        meterHolder8.setGroup("metered");
        meteredJobExecutionListener0.setMeterHolder(meterHolder8);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder15 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder15.setGroup("");
        com.codahale.metrics.MetricRegistry metricRegistry18 = null;
        meterHolder15.setMetricRegistry(metricRegistry18);
        meteredJobExecutionListener0.setMeterHolder(meterHolder15);
        // The following exception was thrown during execution in test generation
        try {
            meterHolder15.mark("process");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedChunkListener0.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder5 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext6 = null;
        timedChunkListener0.afterChunkError(chunkContext6);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener8 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = timedItemProcessListener8.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemProcessListener8.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener11 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder12 = timedItemWriteListener11.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder13 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener11.setTimerHolder(timerHolder13);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution16 = null;
        org.springframework.batch.core.ExitStatus exitStatus17 = timedItemProcessListener15.afterStep(stepExecution16);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener18 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder19 = timedItemProcessListener18.getStepExecutionHolder();
        timedItemProcessListener15.setStepExecutionHolder(stepExecutionHolder19);
        timedItemWriteListener11.setStepExecutionHolder(stepExecutionHolder19);
        java.util.List list22 = null;
        timedItemWriteListener11.afterWrite(list22);
        java.util.List list24 = null;
        timedItemWriteListener11.beforeWrite(list24);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener26 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder27 = timedItemProcessListener26.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener28 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution29 = null;
        org.springframework.batch.core.ExitStatus exitStatus30 = timedItemProcessListener28.afterStep(stepExecution29);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener31 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder32 = timedItemProcessListener31.getStepExecutionHolder();
        timedItemProcessListener28.setStepExecutionHolder(stepExecutionHolder32);
        timedItemProcessListener26.setStepExecutionHolder(stepExecutionHolder32);
        timedItemProcessListener26.beforeProcess((java.lang.Object) 10.0d);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener37 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder38 = timedItemWriteListener37.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder39 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener37.setTimerHolder(timerHolder39);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener41 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution42 = null;
        org.springframework.batch.core.ExitStatus exitStatus43 = timedItemProcessListener41.afterStep(stepExecution42);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener44 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder45 = timedItemProcessListener44.getStepExecutionHolder();
        timedItemProcessListener41.setStepExecutionHolder(stepExecutionHolder45);
        timedItemWriteListener37.setStepExecutionHolder(stepExecutionHolder45);
        timedItemProcessListener26.afterProcess((java.lang.Object) timedItemWriteListener37, (java.lang.Object) 10.0f);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener50 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution51 = null;
        org.springframework.batch.core.ExitStatus exitStatus52 = timedItemProcessListener50.afterStep(stepExecution51);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener53 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder54 = timedItemProcessListener53.getStepExecutionHolder();
        timedItemProcessListener50.setStepExecutionHolder(stepExecutionHolder54);
        timedItemWriteListener37.setStepExecutionHolder(stepExecutionHolder54);
        timedItemProcessListener8.afterProcess((java.lang.Object) timedItemWriteListener11, (java.lang.Object) stepExecutionHolder54);
        timedChunkListener0.setStepExecutionHolder(stepExecutionHolder54);
        org.springframework.batch.core.StepExecution stepExecution59 = null;
        org.springframework.batch.core.ExitStatus exitStatus60 = timedChunkListener0.afterStep(stepExecution59);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext61 = null;
        timedChunkListener0.afterChunkError(chunkContext61);
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder5);
        org.junit.Assert.assertNotNull(stepExecutionHolder9);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNotNull(stepExecutionHolder12);
        org.junit.Assert.assertNull(exitStatus17);
        org.junit.Assert.assertNotNull(stepExecutionHolder19);
        org.junit.Assert.assertNotNull(stepExecutionHolder27);
        org.junit.Assert.assertNull(exitStatus30);
        org.junit.Assert.assertNotNull(stepExecutionHolder32);
        org.junit.Assert.assertNotNull(stepExecutionHolder38);
        org.junit.Assert.assertNull(exitStatus43);
        org.junit.Assert.assertNotNull(stepExecutionHolder45);
        org.junit.Assert.assertNull(exitStatus52);
        org.junit.Assert.assertNotNull(stepExecutionHolder54);
        org.junit.Assert.assertNull(exitStatus60);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener1 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution2 = null;
        org.springframework.batch.core.ExitStatus exitStatus3 = timedChunkListener1.afterStep(stepExecution2);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedChunkListener1.getStepExecutionHolder();
        timedItemReadListener0.afterRead((java.lang.Object) stepExecutionHolder4);
        timedItemReadListener0.beforeRead();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener7 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder8 = timedItemWriteListener7.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder9 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener7.setTimerHolder(timerHolder9);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener11 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution12 = null;
        org.springframework.batch.core.ExitStatus exitStatus13 = timedItemProcessListener11.afterStep(stepExecution12);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener14 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder15 = timedItemProcessListener14.getStepExecutionHolder();
        timedItemProcessListener11.setStepExecutionHolder(stepExecutionHolder15);
        timedItemWriteListener7.setStepExecutionHolder(stepExecutionHolder15);
        org.springframework.batch.core.StepExecution stepExecution18 = null;
        org.springframework.batch.core.ExitStatus exitStatus19 = timedItemWriteListener7.afterStep(stepExecution18);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = new com.bazoud.metrics.springbatch.timer.StepExecutionHolder();
        timedItemWriteListener7.setStepExecutionHolder(stepExecutionHolder20);
        java.util.List list22 = null;
        timedItemWriteListener7.beforeWrite(list22);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener24 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder25 = timedItemWriteListener24.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder26 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener24.setTimerHolder(timerHolder26);
        timerHolder26.setGroup("metered");
        timerHolder26.destroy();
        com.codahale.metrics.MetricRegistry metricRegistry31 = null;
        timerHolder26.setMetricRegistry(metricRegistry31);
        timedItemWriteListener7.setTimerHolder(timerHolder26);
        timedItemReadListener0.setTimerHolder(timerHolder26);
        timerHolder26.setGroup("timed");
        timerHolder26.setGroup("metered");
        org.junit.Assert.assertNull(exitStatus3);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNotNull(stepExecutionHolder8);
        org.junit.Assert.assertNull(exitStatus13);
        org.junit.Assert.assertNotNull(stepExecutionHolder15);
        org.junit.Assert.assertNull(exitStatus19);
        org.junit.Assert.assertNotNull(stepExecutionHolder25);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder3 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext4 = null;
        timedChunkListener0.beforeChunk(chunkContext4);
        org.springframework.batch.core.StepExecution stepExecution6 = null;
        org.springframework.batch.core.ExitStatus exitStatus7 = timedChunkListener0.afterStep(stepExecution6);
        org.springframework.batch.core.StepExecution stepExecution8 = null;
        org.springframework.batch.core.ExitStatus exitStatus9 = timedChunkListener0.afterStep(stepExecution8);
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder3);
        org.junit.Assert.assertNull(exitStatus7);
        org.junit.Assert.assertNull(exitStatus9);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemWriteListener9.getStepExecutionHolder();
        java.lang.Exception exception11 = null;
        timedItemProcessListener0.onProcessError((java.lang.Object) stepExecutionHolder10, exception11);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener13 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution14 = null;
        org.springframework.batch.core.ExitStatus exitStatus15 = timedChunkListener13.afterStep(stepExecution14);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder16 = timedChunkListener13.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder17 = timedChunkListener13.getStepExecutionHolder();
        timedItemProcessListener0.beforeProcess((java.lang.Object) timedChunkListener13);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNull(exitStatus15);
        org.junit.Assert.assertNotNull(stepExecutionHolder16);
        org.junit.Assert.assertNotNull(stepExecutionHolder17);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener4 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        org.springframework.batch.core.ExitStatus exitStatus6 = timedItemProcessListener4.afterStep(stepExecution5);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener7 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder8 = timedItemProcessListener7.getStepExecutionHolder();
        timedItemProcessListener4.setStepExecutionHolder(stepExecutionHolder8);
        timedItemWriteListener0.setStepExecutionHolder(stepExecutionHolder8);
        java.util.List list11 = null;
        timedItemWriteListener0.afterWrite(list11);
        java.util.List list13 = null;
        timedItemWriteListener0.beforeWrite(list13);
        java.util.List list15 = null;
        timedItemWriteListener0.beforeWrite(list15);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus6);
        org.junit.Assert.assertNotNull(stepExecutionHolder8);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedChunkListener0.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder5 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext6 = null;
        timedChunkListener0.beforeChunk(chunkContext6);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder8 = timedChunkListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener9 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution10 = null;
        org.springframework.batch.core.ExitStatus exitStatus11 = timedChunkListener9.afterStep(stepExecution10);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder12 = timedChunkListener9.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext13 = null;
        timedChunkListener9.beforeChunk(chunkContext13);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext15 = null;
        timedChunkListener9.afterChunkError(chunkContext15);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext17 = null;
        timedChunkListener9.afterChunk(chunkContext17);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener19 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution20 = null;
        org.springframework.batch.core.ExitStatus exitStatus21 = timedChunkListener19.afterStep(stepExecution20);
        org.springframework.batch.core.StepExecution stepExecution22 = null;
        org.springframework.batch.core.ExitStatus exitStatus23 = timedChunkListener19.afterStep(stepExecution22);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder24 = timedChunkListener19.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext25 = null;
        timedChunkListener19.afterChunkError(chunkContext25);
        org.springframework.batch.core.StepExecution stepExecution27 = null;
        org.springframework.batch.core.ExitStatus exitStatus28 = timedChunkListener19.afterStep(stepExecution27);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener29 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder30 = timedItemProcessListener29.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener31 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution32 = null;
        org.springframework.batch.core.ExitStatus exitStatus33 = timedItemProcessListener31.afterStep(stepExecution32);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener34 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder35 = timedItemProcessListener34.getStepExecutionHolder();
        timedItemProcessListener31.setStepExecutionHolder(stepExecutionHolder35);
        timedItemProcessListener29.setStepExecutionHolder(stepExecutionHolder35);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener38 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder39 = timedItemWriteListener38.getStepExecutionHolder();
        java.lang.Exception exception40 = null;
        timedItemProcessListener29.onProcessError((java.lang.Object) stepExecutionHolder39, exception40);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener42 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution43 = null;
        org.springframework.batch.core.ExitStatus exitStatus44 = timedChunkListener42.afterStep(stepExecution43);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder45 = timedChunkListener42.getStepExecutionHolder();
        java.lang.Exception exception46 = null;
        timedItemProcessListener29.onProcessError((java.lang.Object) stepExecutionHolder45, exception46);
        timedChunkListener19.setStepExecutionHolder(stepExecutionHolder45);
        timedChunkListener9.setStepExecutionHolder(stepExecutionHolder45);
        timedChunkListener0.setStepExecutionHolder(stepExecutionHolder45);
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder5);
        org.junit.Assert.assertNotNull(stepExecutionHolder8);
        org.junit.Assert.assertNull(exitStatus11);
        org.junit.Assert.assertNotNull(stepExecutionHolder12);
        org.junit.Assert.assertNull(exitStatus21);
        org.junit.Assert.assertNull(exitStatus23);
        org.junit.Assert.assertNotNull(stepExecutionHolder24);
        org.junit.Assert.assertNull(exitStatus28);
        org.junit.Assert.assertNotNull(stepExecutionHolder30);
        org.junit.Assert.assertNull(exitStatus33);
        org.junit.Assert.assertNotNull(stepExecutionHolder35);
        org.junit.Assert.assertNotNull(stepExecutionHolder39);
        org.junit.Assert.assertNull(exitStatus44);
        org.junit.Assert.assertNotNull(stepExecutionHolder45);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener0.afterStep(stepExecution3);
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNull(exitStatus4);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution1 = null;
        meteredJobExecutionListener0.beforeJob(jobExecution1);
        org.springframework.batch.core.JobExecution jobExecution3 = null;
        meteredJobExecutionListener0.beforeJob(jobExecution3);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener5 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution6 = null;
        meteredJobExecutionListener5.beforeJob(jobExecution6);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder8 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        com.codahale.metrics.MetricRegistry metricRegistry9 = null;
        meterHolder8.setMetricRegistry(metricRegistry9);
        meteredJobExecutionListener5.setMeterHolder(meterHolder8);
        meterHolder8.setGroup("metered");
        meteredJobExecutionListener0.setMeterHolder(meterHolder8);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder15 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder15.setGroup("");
        com.codahale.metrics.MetricRegistry metricRegistry18 = null;
        meterHolder15.setMetricRegistry(metricRegistry18);
        meteredJobExecutionListener0.setMeterHolder(meterHolder15);
        org.springframework.batch.core.JobExecution jobExecution21 = null;
        // The following exception was thrown during execution in test generation
        try {
            meteredJobExecutionListener0.afterJob(jobExecution21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemWriteListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution4 = null;
        org.springframework.batch.core.ExitStatus exitStatus5 = timedItemProcessListener3.afterStep(stepExecution4);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener6 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder7 = timedItemProcessListener6.getStepExecutionHolder();
        timedItemProcessListener3.setStepExecutionHolder(stepExecutionHolder7);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = null;
        timedItemProcessListener3.setStepExecutionHolder(stepExecutionHolder9);
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder11 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timerHolder11.setGroup("hi!");
        timedItemProcessListener3.setTimerHolder(timerHolder11);
        timerHolder11.setGroup("hi!");
        timedItemWriteListener0.setTimerHolder(timerHolder11);
        org.springframework.batch.core.StepExecution stepExecution18 = null;
        org.springframework.batch.core.ExitStatus exitStatus19 = timedItemWriteListener0.afterStep(stepExecution18);
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNull(exitStatus5);
        org.junit.Assert.assertNotNull(stepExecutionHolder7);
        org.junit.Assert.assertNull(exitStatus19);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        timerHolder2.setGroup("metered");
        timerHolder2.destroy();
        com.codahale.metrics.MetricRegistry metricRegistry7 = null;
        timerHolder2.setMetricRegistry(metricRegistry7);
        // The following exception was thrown during execution in test generation
        try {
            timerHolder2.time("sb_rollback_exception", "metered", "read");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution1);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder3 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meteredStepExecutionListener0.setMeterHolder(meterHolder3);
        // The following exception was thrown during execution in test generation
        try {
            meterHolder3.mark("chunk");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedChunkListener0.getStepExecutionHolder();
        java.lang.Class<?> wildcardClass2 = stepExecutionHolder1.getClass();
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedChunkListener0.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder5 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext6 = null;
        timedChunkListener0.afterChunk(chunkContext6);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext8 = null;
        timedChunkListener0.afterChunk(chunkContext8);
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder5);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        timedItemReadListener0.beforeRead();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemReadListener0.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemReadListener0.afterStep(stepExecution3);
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        org.springframework.batch.core.ExitStatus exitStatus6 = timedItemReadListener0.afterStep(stepExecution5);
        timedItemReadListener0.beforeRead();
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener8 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution9 = null;
        meteredStepExecutionListener8.beforeStep(stepExecution9);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder11 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder11.setGroup("chunk");
        meteredStepExecutionListener8.setMeterHolder(meterHolder11);
        timedItemReadListener0.afterRead((java.lang.Object) meteredStepExecutionListener8);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        timedItemReadListener0.afterRead((java.lang.Object) wildcardClass17);
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNull(exitStatus6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemWriteListener9.getStepExecutionHolder();
        java.lang.Exception exception11 = null;
        timedItemProcessListener0.onProcessError((java.lang.Object) stepExecutionHolder10, exception11);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener13 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder14 = timedItemWriteListener13.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder15 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener13.setTimerHolder(timerHolder15);
        java.lang.Exception exception17 = null;
        java.util.List list18 = null;
        timedItemWriteListener13.onWriteError(exception17, list18);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = timedItemWriteListener13.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution21 = stepExecutionHolder20.getCurrent();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder20);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNotNull(stepExecutionHolder14);
        org.junit.Assert.assertNotNull(stepExecutionHolder20);
        org.junit.Assert.assertNull(stepExecution21);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemProcessListener3.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder4);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = null;
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder8 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timerHolder8.setGroup("hi!");
        timedItemProcessListener0.setTimerHolder(timerHolder8);
        // The following exception was thrown during execution in test generation
        try {
            timerHolder8.time("job", "step", "step");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.beforeProcess((java.lang.Object) 10.0d);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener11 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution12 = null;
        org.springframework.batch.core.ExitStatus exitStatus13 = timedItemProcessListener11.afterStep(stepExecution12);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener14 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder15 = timedItemProcessListener14.getStepExecutionHolder();
        timedItemProcessListener11.setStepExecutionHolder(stepExecutionHolder15);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener17 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution18 = null;
        org.springframework.batch.core.ExitStatus exitStatus19 = timedItemProcessListener17.afterStep(stepExecution18);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener20 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder21 = timedItemProcessListener20.getStepExecutionHolder();
        timedItemProcessListener17.setStepExecutionHolder(stepExecutionHolder21);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener23 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution24 = null;
        org.springframework.batch.core.ExitStatus exitStatus25 = timedItemProcessListener23.afterStep(stepExecution24);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener26 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder27 = timedItemProcessListener26.getStepExecutionHolder();
        timedItemProcessListener23.setStepExecutionHolder(stepExecutionHolder27);
        timedItemProcessListener17.setStepExecutionHolder(stepExecutionHolder27);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener30 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder31 = timedItemWriteListener30.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder32 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener30.setTimerHolder(timerHolder32);
        timedItemProcessListener11.afterProcess((java.lang.Object) stepExecutionHolder27, (java.lang.Object) timedItemWriteListener30);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener35 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution36 = null;
        org.springframework.batch.core.ExitStatus exitStatus37 = timedChunkListener35.afterStep(stepExecution36);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder38 = timedChunkListener35.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext39 = null;
        timedChunkListener35.beforeChunk(chunkContext39);
        org.springframework.batch.core.StepExecution stepExecution41 = null;
        org.springframework.batch.core.ExitStatus exitStatus42 = timedChunkListener35.afterStep(stepExecution41);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder43 = timedChunkListener35.getStepExecutionHolder();
        timedItemProcessListener11.setStepExecutionHolder(stepExecutionHolder43);
        java.lang.Exception exception45 = null;
        timedItemProcessListener0.onProcessError((java.lang.Object) stepExecutionHolder43, exception45);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNull(exitStatus13);
        org.junit.Assert.assertNotNull(stepExecutionHolder15);
        org.junit.Assert.assertNull(exitStatus19);
        org.junit.Assert.assertNotNull(stepExecutionHolder21);
        org.junit.Assert.assertNull(exitStatus25);
        org.junit.Assert.assertNotNull(stepExecutionHolder27);
        org.junit.Assert.assertNotNull(stepExecutionHolder31);
        org.junit.Assert.assertNull(exitStatus37);
        org.junit.Assert.assertNotNull(stepExecutionHolder38);
        org.junit.Assert.assertNull(exitStatus42);
        org.junit.Assert.assertNotNull(stepExecutionHolder43);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemWriteListener9.getStepExecutionHolder();
        java.lang.Exception exception11 = null;
        timedItemProcessListener0.onProcessError((java.lang.Object) stepExecutionHolder10, exception11);
        timedItemProcessListener0.beforeProcess((java.lang.Object) "chunk");
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener15 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener16 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder17 = timedItemWriteListener16.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder18 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener16.setTimerHolder(timerHolder18);
        timerHolder18.setGroup("metered");
        timedJobExecutionListener15.setTimerHolder(timerHolder18);
        timedItemProcessListener0.beforeProcess((java.lang.Object) timedJobExecutionListener15);
        org.springframework.batch.core.StepExecution stepExecution24 = null;
        org.springframework.batch.core.ExitStatus exitStatus25 = timedItemProcessListener0.afterStep(stepExecution24);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener26 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution27 = null;
        org.springframework.batch.core.ExitStatus exitStatus28 = timedChunkListener26.afterStep(stepExecution27);
        org.springframework.batch.core.StepExecution stepExecution29 = null;
        org.springframework.batch.core.ExitStatus exitStatus30 = timedChunkListener26.afterStep(stepExecution29);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder31 = timedChunkListener26.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext32 = null;
        timedChunkListener26.beforeChunk(chunkContext32);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder34 = timedChunkListener26.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener35 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder36 = timedChunkListener35.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder37 = timedChunkListener35.getStepExecutionHolder();
        timedChunkListener26.setStepExecutionHolder(stepExecutionHolder37);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener39 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution40 = null;
        org.springframework.batch.core.ExitStatus exitStatus41 = timedChunkListener39.afterStep(stepExecution40);
        org.springframework.batch.core.StepExecution stepExecution42 = null;
        org.springframework.batch.core.ExitStatus exitStatus43 = timedChunkListener39.afterStep(stepExecution42);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder44 = timedChunkListener39.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext45 = null;
        timedChunkListener39.afterChunkError(chunkContext45);
        org.springframework.batch.core.StepExecution stepExecution47 = null;
        org.springframework.batch.core.ExitStatus exitStatus48 = timedChunkListener39.afterStep(stepExecution47);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener49 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder50 = timedItemProcessListener49.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener51 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution52 = null;
        org.springframework.batch.core.ExitStatus exitStatus53 = timedItemProcessListener51.afterStep(stepExecution52);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener54 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder55 = timedItemProcessListener54.getStepExecutionHolder();
        timedItemProcessListener51.setStepExecutionHolder(stepExecutionHolder55);
        timedItemProcessListener49.setStepExecutionHolder(stepExecutionHolder55);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener58 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder59 = timedItemWriteListener58.getStepExecutionHolder();
        java.lang.Exception exception60 = null;
        timedItemProcessListener49.onProcessError((java.lang.Object) stepExecutionHolder59, exception60);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener62 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution63 = null;
        org.springframework.batch.core.ExitStatus exitStatus64 = timedChunkListener62.afterStep(stepExecution63);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder65 = timedChunkListener62.getStepExecutionHolder();
        java.lang.Exception exception66 = null;
        timedItemProcessListener49.onProcessError((java.lang.Object) stepExecutionHolder65, exception66);
        timedChunkListener39.setStepExecutionHolder(stepExecutionHolder65);
        timedItemProcessListener0.afterProcess((java.lang.Object) stepExecutionHolder37, (java.lang.Object) timedChunkListener39);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNotNull(stepExecutionHolder17);
        org.junit.Assert.assertNull(exitStatus25);
        org.junit.Assert.assertNull(exitStatus28);
        org.junit.Assert.assertNull(exitStatus30);
        org.junit.Assert.assertNotNull(stepExecutionHolder31);
        org.junit.Assert.assertNotNull(stepExecutionHolder34);
        org.junit.Assert.assertNotNull(stepExecutionHolder36);
        org.junit.Assert.assertNotNull(stepExecutionHolder37);
        org.junit.Assert.assertNull(exitStatus41);
        org.junit.Assert.assertNull(exitStatus43);
        org.junit.Assert.assertNotNull(stepExecutionHolder44);
        org.junit.Assert.assertNull(exitStatus48);
        org.junit.Assert.assertNotNull(stepExecutionHolder50);
        org.junit.Assert.assertNull(exitStatus53);
        org.junit.Assert.assertNotNull(stepExecutionHolder55);
        org.junit.Assert.assertNotNull(stepExecutionHolder59);
        org.junit.Assert.assertNull(exitStatus64);
        org.junit.Assert.assertNotNull(stepExecutionHolder65);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext1 = null;
        timedChunkListener0.afterChunkError(chunkContext1);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext3 = null;
        timedChunkListener0.afterChunk(chunkContext3);
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        org.springframework.batch.core.ExitStatus exitStatus6 = timedChunkListener0.afterStep(stepExecution5);
        com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener timedStepExecutionListener7 = new com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener8 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = timedItemProcessListener8.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener10 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution11 = null;
        org.springframework.batch.core.ExitStatus exitStatus12 = timedItemProcessListener10.afterStep(stepExecution11);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener13 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder14 = timedItemProcessListener13.getStepExecutionHolder();
        timedItemProcessListener10.setStepExecutionHolder(stepExecutionHolder14);
        timedItemProcessListener8.setStepExecutionHolder(stepExecutionHolder14);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener17 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder18 = timedItemWriteListener17.getStepExecutionHolder();
        java.lang.Exception exception19 = null;
        timedItemProcessListener8.onProcessError((java.lang.Object) stepExecutionHolder18, exception19);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener22 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder23 = timedItemWriteListener22.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder24 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener22.setTimerHolder(timerHolder24);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener26 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder27 = timedItemWriteListener26.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder28 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener26.setTimerHolder(timerHolder28);
        timerHolder28.setGroup("metered");
        timedItemWriteListener22.setTimerHolder(timerHolder28);
        timedItemProcessListener8.afterProcess((java.lang.Object) "step", (java.lang.Object) timerHolder28);
        timedStepExecutionListener7.setTimerHolder(timerHolder28);
        timerHolder28.setGroup("job");
        timedChunkListener0.setTimerHolder(timerHolder28);
        org.junit.Assert.assertNull(exitStatus6);
        org.junit.Assert.assertNotNull(stepExecutionHolder9);
        org.junit.Assert.assertNull(exitStatus12);
        org.junit.Assert.assertNotNull(stepExecutionHolder14);
        org.junit.Assert.assertNotNull(stepExecutionHolder18);
        org.junit.Assert.assertNotNull(stepExecutionHolder23);
        org.junit.Assert.assertNotNull(stepExecutionHolder27);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution1);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener3 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution4 = null;
        meteredJobExecutionListener3.beforeJob(jobExecution4);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder6 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        com.codahale.metrics.MetricRegistry metricRegistry7 = null;
        meterHolder6.setMetricRegistry(metricRegistry7);
        meteredJobExecutionListener3.setMeterHolder(meterHolder6);
        meteredStepExecutionListener0.setMeterHolder(meterHolder6);
        // The following exception was thrown during execution in test generation
        try {
            meterHolder6.mark("step");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener1 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution2 = null;
        org.springframework.batch.core.ExitStatus exitStatus3 = timedChunkListener1.afterStep(stepExecution2);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedChunkListener1.getStepExecutionHolder();
        timedItemReadListener0.afterRead((java.lang.Object) stepExecutionHolder4);
        org.springframework.batch.core.StepExecution stepExecution6 = null;
        org.springframework.batch.core.ExitStatus exitStatus7 = timedItemReadListener0.afterStep(stepExecution6);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener8 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = timedItemReadListener8.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder10 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemReadListener8.setTimerHolder(timerHolder10);
        timedItemReadListener0.afterRead((java.lang.Object) timedItemReadListener8);
        timedItemReadListener0.beforeRead();
        org.junit.Assert.assertNull(exitStatus3);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus7);
        org.junit.Assert.assertNotNull(stepExecutionHolder9);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener4 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        org.springframework.batch.core.ExitStatus exitStatus6 = timedItemProcessListener4.afterStep(stepExecution5);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener7 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder8 = timedItemProcessListener7.getStepExecutionHolder();
        timedItemProcessListener4.setStepExecutionHolder(stepExecutionHolder8);
        timedItemWriteListener0.setStepExecutionHolder(stepExecutionHolder8);
        org.springframework.batch.core.StepExecution stepExecution11 = null;
        org.springframework.batch.core.ExitStatus exitStatus12 = timedItemWriteListener0.afterStep(stepExecution11);
        org.springframework.batch.core.StepExecution stepExecution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedItemWriteListener0.beforeStep(stepExecution13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus6);
        org.junit.Assert.assertNotNull(stepExecutionHolder8);
        org.junit.Assert.assertNull(exitStatus12);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution1);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener3 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder4 = null;
        meteredJobExecutionListener3.setMeterHolder(meterHolder4);
        org.springframework.batch.core.JobExecution jobExecution6 = null;
        meteredJobExecutionListener3.beforeJob(jobExecution6);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder8 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder8.setGroup("");
        meteredJobExecutionListener3.setMeterHolder(meterHolder8);
        meteredStepExecutionListener0.setMeterHolder(meterHolder8);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener13 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution14 = null;
        meteredJobExecutionListener13.beforeJob(jobExecution14);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder16 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        com.codahale.metrics.MetricRegistry metricRegistry17 = null;
        meterHolder16.setMetricRegistry(metricRegistry17);
        meteredJobExecutionListener13.setMeterHolder(meterHolder16);
        meteredStepExecutionListener0.setMeterHolder(meterHolder16);
        org.springframework.batch.core.StepExecution stepExecution21 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution21);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener23 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        timedItemReadListener23.beforeRead();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder25 = timedItemReadListener23.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution26 = null;
        org.springframework.batch.core.ExitStatus exitStatus27 = timedItemReadListener23.afterStep(stepExecution26);
        org.springframework.batch.core.StepExecution stepExecution28 = null;
        org.springframework.batch.core.ExitStatus exitStatus29 = timedItemReadListener23.afterStep(stepExecution28);
        timedItemReadListener23.beforeRead();
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener31 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution32 = null;
        meteredStepExecutionListener31.beforeStep(stepExecution32);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder34 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder34.setGroup("chunk");
        meteredStepExecutionListener31.setMeterHolder(meterHolder34);
        timedItemReadListener23.afterRead((java.lang.Object) meteredStepExecutionListener31);
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener39 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution40 = null;
        meteredStepExecutionListener39.beforeStep(stepExecution40);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder42 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder42.setGroup("chunk");
        meteredStepExecutionListener39.setMeterHolder(meterHolder42);
        meteredStepExecutionListener31.setMeterHolder(meterHolder42);
        meterHolder42.destroy();
        meteredStepExecutionListener0.setMeterHolder(meterHolder42);
        // The following exception was thrown during execution in test generation
        try {
            meterHolder42.mark("process", "job");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder25);
        org.junit.Assert.assertNull(exitStatus27);
        org.junit.Assert.assertNull(exitStatus29);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder3 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext4 = null;
        timedChunkListener0.afterChunk(chunkContext4);
        org.springframework.batch.core.StepExecution stepExecution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedChunkListener0.beforeStep(stepExecution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder3);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution1 = null;
        meteredJobExecutionListener0.beforeJob(jobExecution1);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener3 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution4 = null;
        meteredJobExecutionListener3.beforeJob(jobExecution4);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder6 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        com.codahale.metrics.MetricRegistry metricRegistry7 = null;
        meterHolder6.setMetricRegistry(metricRegistry7);
        meteredJobExecutionListener3.setMeterHolder(meterHolder6);
        meteredJobExecutionListener0.setMeterHolder(meterHolder6);
        // The following exception was thrown during execution in test generation
        try {
            meterHolder6.mark("read");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.beforeProcess((java.lang.Object) 10.0d);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener11 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution12 = null;
        org.springframework.batch.core.ExitStatus exitStatus13 = timedChunkListener11.afterStep(stepExecution12);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder14 = timedChunkListener11.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext15 = null;
        timedChunkListener11.beforeChunk(chunkContext15);
        org.springframework.batch.core.StepExecution stepExecution17 = null;
        org.springframework.batch.core.ExitStatus exitStatus18 = timedChunkListener11.afterStep(stepExecution17);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder19 = timedChunkListener11.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext20 = null;
        timedChunkListener11.afterChunk(chunkContext20);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener22 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder23 = timedItemWriteListener22.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder24 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener22.setTimerHolder(timerHolder24);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener26 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution27 = null;
        org.springframework.batch.core.ExitStatus exitStatus28 = timedItemProcessListener26.afterStep(stepExecution27);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener29 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder30 = timedItemProcessListener29.getStepExecutionHolder();
        timedItemProcessListener26.setStepExecutionHolder(stepExecutionHolder30);
        timedItemWriteListener22.setStepExecutionHolder(stepExecutionHolder30);
        org.springframework.batch.core.StepExecution stepExecution33 = null;
        boolean boolean34 = stepExecutionHolder30.after(stepExecution33);
        timedChunkListener11.setStepExecutionHolder(stepExecutionHolder30);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder30);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener37 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder38 = timedItemReadListener37.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder39 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemReadListener37.setTimerHolder(timerHolder39);
        timedItemProcessListener0.beforeProcess((java.lang.Object) timedItemReadListener37);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener42 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder43 = timedItemProcessListener42.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener44 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution45 = null;
        org.springframework.batch.core.ExitStatus exitStatus46 = timedItemProcessListener44.afterStep(stepExecution45);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener47 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder48 = timedItemProcessListener47.getStepExecutionHolder();
        timedItemProcessListener44.setStepExecutionHolder(stepExecutionHolder48);
        timedItemProcessListener42.setStepExecutionHolder(stepExecutionHolder48);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder48);
        org.springframework.batch.core.StepExecution stepExecution52 = null;
        org.springframework.batch.core.ExitStatus exitStatus53 = timedItemProcessListener0.afterStep(stepExecution52);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNull(exitStatus13);
        org.junit.Assert.assertNotNull(stepExecutionHolder14);
        org.junit.Assert.assertNull(exitStatus18);
        org.junit.Assert.assertNotNull(stepExecutionHolder19);
        org.junit.Assert.assertNotNull(stepExecutionHolder23);
        org.junit.Assert.assertNull(exitStatus28);
        org.junit.Assert.assertNotNull(stepExecutionHolder30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(stepExecutionHolder38);
        org.junit.Assert.assertNotNull(stepExecutionHolder43);
        org.junit.Assert.assertNull(exitStatus46);
        org.junit.Assert.assertNotNull(stepExecutionHolder48);
        org.junit.Assert.assertNull(exitStatus53);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemProcessListener3.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder4);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener6 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution7 = null;
        org.springframework.batch.core.ExitStatus exitStatus8 = timedItemProcessListener6.afterStep(stepExecution7);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemProcessListener9.getStepExecutionHolder();
        timedItemProcessListener6.setStepExecutionHolder(stepExecutionHolder10);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener12 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution13 = null;
        org.springframework.batch.core.ExitStatus exitStatus14 = timedItemProcessListener12.afterStep(stepExecution13);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder16 = timedItemProcessListener15.getStepExecutionHolder();
        timedItemProcessListener12.setStepExecutionHolder(stepExecutionHolder16);
        timedItemProcessListener6.setStepExecutionHolder(stepExecutionHolder16);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener19 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = timedItemWriteListener19.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder21 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener19.setTimerHolder(timerHolder21);
        timedItemProcessListener0.afterProcess((java.lang.Object) stepExecutionHolder16, (java.lang.Object) timedItemWriteListener19);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener24 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution25 = null;
        org.springframework.batch.core.ExitStatus exitStatus26 = timedChunkListener24.afterStep(stepExecution25);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder27 = timedChunkListener24.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext28 = null;
        timedChunkListener24.beforeChunk(chunkContext28);
        org.springframework.batch.core.StepExecution stepExecution30 = null;
        org.springframework.batch.core.ExitStatus exitStatus31 = timedChunkListener24.afterStep(stepExecution30);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder32 = timedChunkListener24.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder32);
        org.springframework.batch.core.StepExecution stepExecution34 = null;
        org.springframework.batch.core.ExitStatus exitStatus35 = timedItemProcessListener0.afterStep(stepExecution34);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener36 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder37 = timedItemWriteListener36.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder38 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener36.setTimerHolder(timerHolder38);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener40 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution41 = null;
        org.springframework.batch.core.ExitStatus exitStatus42 = timedItemProcessListener40.afterStep(stepExecution41);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener43 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder44 = timedItemProcessListener43.getStepExecutionHolder();
        timedItemProcessListener40.setStepExecutionHolder(stepExecutionHolder44);
        timedItemWriteListener36.setStepExecutionHolder(stepExecutionHolder44);
        java.util.List list47 = null;
        timedItemWriteListener36.beforeWrite(list47);
        java.lang.Exception exception49 = null;
        timedItemProcessListener0.onProcessError((java.lang.Object) timedItemWriteListener36, exception49);
        com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener timedStepExecutionListener51 = new com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener52 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder53 = timedItemProcessListener52.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener54 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution55 = null;
        org.springframework.batch.core.ExitStatus exitStatus56 = timedItemProcessListener54.afterStep(stepExecution55);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener57 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder58 = timedItemProcessListener57.getStepExecutionHolder();
        timedItemProcessListener54.setStepExecutionHolder(stepExecutionHolder58);
        timedItemProcessListener52.setStepExecutionHolder(stepExecutionHolder58);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener61 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder62 = timedItemWriteListener61.getStepExecutionHolder();
        java.lang.Exception exception63 = null;
        timedItemProcessListener52.onProcessError((java.lang.Object) stepExecutionHolder62, exception63);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener66 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder67 = timedItemWriteListener66.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder68 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener66.setTimerHolder(timerHolder68);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener70 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder71 = timedItemWriteListener70.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder72 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener70.setTimerHolder(timerHolder72);
        timerHolder72.setGroup("metered");
        timedItemWriteListener66.setTimerHolder(timerHolder72);
        timedItemProcessListener52.afterProcess((java.lang.Object) "step", (java.lang.Object) timerHolder72);
        timedStepExecutionListener51.setTimerHolder(timerHolder72);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener79 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder80 = timedItemReadListener79.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder81 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemReadListener79.setTimerHolder(timerHolder81);
        timedStepExecutionListener51.setTimerHolder(timerHolder81);
        com.codahale.metrics.MetricRegistry metricRegistry84 = null;
        timerHolder81.setMetricRegistry(metricRegistry84);
        timedItemWriteListener36.setTimerHolder(timerHolder81);
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus8);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNull(exitStatus14);
        org.junit.Assert.assertNotNull(stepExecutionHolder16);
        org.junit.Assert.assertNotNull(stepExecutionHolder20);
        org.junit.Assert.assertNull(exitStatus26);
        org.junit.Assert.assertNotNull(stepExecutionHolder27);
        org.junit.Assert.assertNull(exitStatus31);
        org.junit.Assert.assertNotNull(stepExecutionHolder32);
        org.junit.Assert.assertNull(exitStatus35);
        org.junit.Assert.assertNotNull(stepExecutionHolder37);
        org.junit.Assert.assertNull(exitStatus42);
        org.junit.Assert.assertNotNull(stepExecutionHolder44);
        org.junit.Assert.assertNotNull(stepExecutionHolder53);
        org.junit.Assert.assertNull(exitStatus56);
        org.junit.Assert.assertNotNull(stepExecutionHolder58);
        org.junit.Assert.assertNotNull(stepExecutionHolder62);
        org.junit.Assert.assertNotNull(stepExecutionHolder67);
        org.junit.Assert.assertNotNull(stepExecutionHolder71);
        org.junit.Assert.assertNotNull(stepExecutionHolder80);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener timedStepExecutionListener0 = new com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener1 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemWriteListener1.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder3 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener1.setTimerHolder(timerHolder3);
        timerHolder3.setGroup("metered");
        timerHolder3.destroy();
        timedStepExecutionListener0.setTimerHolder(timerHolder3);
        org.springframework.batch.core.StepExecution stepExecution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.batch.core.ExitStatus exitStatus10 = timedStepExecutionListener0.afterStep(stepExecution9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution1);
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution3);
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution5);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedChunkListener0.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder5 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext6 = null;
        timedChunkListener0.beforeChunk(chunkContext6);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder8 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution9 = null;
        // The following exception was thrown during execution in test generation
        try {
            stepExecutionHolder8.before(stepExecution9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder5);
        org.junit.Assert.assertNotNull(stepExecutionHolder8);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedChunkListener0.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder5 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution6 = null;
        org.springframework.batch.core.ExitStatus exitStatus7 = timedChunkListener0.afterStep(stepExecution6);
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder5);
        org.junit.Assert.assertNull(exitStatus7);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder3 = timedItemWriteListener2.getStepExecutionHolder();
        timedItemWriteListener0.setStepExecutionHolder(stepExecutionHolder3);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder5 = timedItemWriteListener0.getStepExecutionHolder();
        java.lang.Exception exception6 = null;
        java.util.List list7 = null;
        timedItemWriteListener0.onWriteError(exception6, list7);
        org.springframework.batch.core.StepExecution stepExecution9 = null;
        org.springframework.batch.core.ExitStatus exitStatus10 = timedItemWriteListener0.afterStep(stepExecution9);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNotNull(stepExecutionHolder3);
        org.junit.Assert.assertNotNull(stepExecutionHolder5);
        org.junit.Assert.assertNull(exitStatus10);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder3 = timedItemWriteListener2.getStepExecutionHolder();
        timedItemWriteListener0.setStepExecutionHolder(stepExecutionHolder3);
        java.util.List list5 = null;
        timedItemWriteListener0.afterWrite(list5);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener7 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder8 = timedItemWriteListener7.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder9 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener7.setTimerHolder(timerHolder9);
        timerHolder9.stop("write", "sb_rollback_exception", "batch");
        timerHolder9.stop("hi!", "metered", "process");
        timedItemWriteListener0.setTimerHolder(timerHolder9);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNotNull(stepExecutionHolder3);
        org.junit.Assert.assertNotNull(stepExecutionHolder8);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedChunkListener0.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder5 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext6 = null;
        timedChunkListener0.afterChunkError(chunkContext6);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener8 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = timedItemProcessListener8.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemProcessListener8.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener11 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder12 = timedItemWriteListener11.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder13 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener11.setTimerHolder(timerHolder13);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution16 = null;
        org.springframework.batch.core.ExitStatus exitStatus17 = timedItemProcessListener15.afterStep(stepExecution16);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener18 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder19 = timedItemProcessListener18.getStepExecutionHolder();
        timedItemProcessListener15.setStepExecutionHolder(stepExecutionHolder19);
        timedItemWriteListener11.setStepExecutionHolder(stepExecutionHolder19);
        java.util.List list22 = null;
        timedItemWriteListener11.afterWrite(list22);
        java.util.List list24 = null;
        timedItemWriteListener11.beforeWrite(list24);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener26 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder27 = timedItemProcessListener26.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener28 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution29 = null;
        org.springframework.batch.core.ExitStatus exitStatus30 = timedItemProcessListener28.afterStep(stepExecution29);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener31 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder32 = timedItemProcessListener31.getStepExecutionHolder();
        timedItemProcessListener28.setStepExecutionHolder(stepExecutionHolder32);
        timedItemProcessListener26.setStepExecutionHolder(stepExecutionHolder32);
        timedItemProcessListener26.beforeProcess((java.lang.Object) 10.0d);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener37 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder38 = timedItemWriteListener37.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder39 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener37.setTimerHolder(timerHolder39);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener41 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution42 = null;
        org.springframework.batch.core.ExitStatus exitStatus43 = timedItemProcessListener41.afterStep(stepExecution42);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener44 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder45 = timedItemProcessListener44.getStepExecutionHolder();
        timedItemProcessListener41.setStepExecutionHolder(stepExecutionHolder45);
        timedItemWriteListener37.setStepExecutionHolder(stepExecutionHolder45);
        timedItemProcessListener26.afterProcess((java.lang.Object) timedItemWriteListener37, (java.lang.Object) 10.0f);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener50 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution51 = null;
        org.springframework.batch.core.ExitStatus exitStatus52 = timedItemProcessListener50.afterStep(stepExecution51);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener53 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder54 = timedItemProcessListener53.getStepExecutionHolder();
        timedItemProcessListener50.setStepExecutionHolder(stepExecutionHolder54);
        timedItemWriteListener37.setStepExecutionHolder(stepExecutionHolder54);
        timedItemProcessListener8.afterProcess((java.lang.Object) timedItemWriteListener11, (java.lang.Object) stepExecutionHolder54);
        timedChunkListener0.setStepExecutionHolder(stepExecutionHolder54);
        org.springframework.batch.core.StepExecution stepExecution59 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedChunkListener0.beforeStep(stepExecution59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder5);
        org.junit.Assert.assertNotNull(stepExecutionHolder9);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNotNull(stepExecutionHolder12);
        org.junit.Assert.assertNull(exitStatus17);
        org.junit.Assert.assertNotNull(stepExecutionHolder19);
        org.junit.Assert.assertNotNull(stepExecutionHolder27);
        org.junit.Assert.assertNull(exitStatus30);
        org.junit.Assert.assertNotNull(stepExecutionHolder32);
        org.junit.Assert.assertNotNull(stepExecutionHolder38);
        org.junit.Assert.assertNull(exitStatus43);
        org.junit.Assert.assertNotNull(stepExecutionHolder45);
        org.junit.Assert.assertNull(exitStatus52);
        org.junit.Assert.assertNotNull(stepExecutionHolder54);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        org.springframework.batch.core.StepExecution stepExecution9 = null;
        org.springframework.batch.core.ExitStatus exitStatus10 = timedItemProcessListener0.afterStep(stepExecution9);
        org.springframework.batch.core.StepExecution stepExecution11 = null;
        org.springframework.batch.core.ExitStatus exitStatus12 = timedItemProcessListener0.afterStep(stepExecution11);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNull(exitStatus10);
        org.junit.Assert.assertNull(exitStatus12);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener1 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution2 = null;
        org.springframework.batch.core.ExitStatus exitStatus3 = timedChunkListener1.afterStep(stepExecution2);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedChunkListener1.getStepExecutionHolder();
        timedItemReadListener0.afterRead((java.lang.Object) stepExecutionHolder4);
        org.springframework.batch.core.StepExecution stepExecution6 = null;
        org.springframework.batch.core.ExitStatus exitStatus7 = timedItemReadListener0.afterStep(stepExecution6);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener8 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = timedItemReadListener8.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder10 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemReadListener8.setTimerHolder(timerHolder10);
        timedItemReadListener0.afterRead((java.lang.Object) timedItemReadListener8);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener13 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution14 = null;
        org.springframework.batch.core.ExitStatus exitStatus15 = timedChunkListener13.afterStep(stepExecution14);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder16 = timedChunkListener13.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext17 = null;
        timedChunkListener13.beforeChunk(chunkContext17);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext19 = null;
        timedChunkListener13.afterChunkError(chunkContext19);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext21 = null;
        timedChunkListener13.afterChunk(chunkContext21);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener23 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution24 = null;
        org.springframework.batch.core.ExitStatus exitStatus25 = timedChunkListener23.afterStep(stepExecution24);
        org.springframework.batch.core.StepExecution stepExecution26 = null;
        org.springframework.batch.core.ExitStatus exitStatus27 = timedChunkListener23.afterStep(stepExecution26);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder28 = timedChunkListener23.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext29 = null;
        timedChunkListener23.afterChunkError(chunkContext29);
        org.springframework.batch.core.StepExecution stepExecution31 = null;
        org.springframework.batch.core.ExitStatus exitStatus32 = timedChunkListener23.afterStep(stepExecution31);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener33 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder34 = timedItemProcessListener33.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener35 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution36 = null;
        org.springframework.batch.core.ExitStatus exitStatus37 = timedItemProcessListener35.afterStep(stepExecution36);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener38 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder39 = timedItemProcessListener38.getStepExecutionHolder();
        timedItemProcessListener35.setStepExecutionHolder(stepExecutionHolder39);
        timedItemProcessListener33.setStepExecutionHolder(stepExecutionHolder39);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener42 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder43 = timedItemWriteListener42.getStepExecutionHolder();
        java.lang.Exception exception44 = null;
        timedItemProcessListener33.onProcessError((java.lang.Object) stepExecutionHolder43, exception44);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener46 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution47 = null;
        org.springframework.batch.core.ExitStatus exitStatus48 = timedChunkListener46.afterStep(stepExecution47);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder49 = timedChunkListener46.getStepExecutionHolder();
        java.lang.Exception exception50 = null;
        timedItemProcessListener33.onProcessError((java.lang.Object) stepExecutionHolder49, exception50);
        timedChunkListener23.setStepExecutionHolder(stepExecutionHolder49);
        timedChunkListener13.setStepExecutionHolder(stepExecutionHolder49);
        timedItemReadListener8.afterRead((java.lang.Object) timedChunkListener13);
        java.lang.Exception exception55 = null;
        timedItemReadListener8.onReadError(exception55);
        org.junit.Assert.assertNull(exitStatus3);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus7);
        org.junit.Assert.assertNotNull(stepExecutionHolder9);
        org.junit.Assert.assertNull(exitStatus15);
        org.junit.Assert.assertNotNull(stepExecutionHolder16);
        org.junit.Assert.assertNull(exitStatus25);
        org.junit.Assert.assertNull(exitStatus27);
        org.junit.Assert.assertNotNull(stepExecutionHolder28);
        org.junit.Assert.assertNull(exitStatus32);
        org.junit.Assert.assertNotNull(stepExecutionHolder34);
        org.junit.Assert.assertNull(exitStatus37);
        org.junit.Assert.assertNotNull(stepExecutionHolder39);
        org.junit.Assert.assertNotNull(stepExecutionHolder43);
        org.junit.Assert.assertNull(exitStatus48);
        org.junit.Assert.assertNotNull(stepExecutionHolder49);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener1 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution2 = null;
        org.springframework.batch.core.ExitStatus exitStatus3 = timedChunkListener1.afterStep(stepExecution2);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedChunkListener1.getStepExecutionHolder();
        timedItemReadListener0.afterRead((java.lang.Object) stepExecutionHolder4);
        org.springframework.batch.core.StepExecution stepExecution6 = null;
        org.springframework.batch.core.ExitStatus exitStatus7 = timedItemReadListener0.afterStep(stepExecution6);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener8 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = timedItemReadListener8.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder10 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemReadListener8.setTimerHolder(timerHolder10);
        timedItemReadListener0.afterRead((java.lang.Object) timedItemReadListener8);
        java.lang.Exception exception13 = null;
        timedItemReadListener8.onReadError(exception13);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder15 = timedItemReadListener8.getStepExecutionHolder();
        org.junit.Assert.assertNull(exitStatus3);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus7);
        org.junit.Assert.assertNotNull(stepExecutionHolder9);
        org.junit.Assert.assertNotNull(stepExecutionHolder15);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener1 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution2 = null;
        org.springframework.batch.core.ExitStatus exitStatus3 = timedChunkListener1.afterStep(stepExecution2);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedChunkListener1.getStepExecutionHolder();
        timedItemReadListener0.afterRead((java.lang.Object) stepExecutionHolder4);
        org.springframework.batch.core.StepExecution stepExecution6 = null;
        org.springframework.batch.core.ExitStatus exitStatus7 = timedItemReadListener0.afterStep(stepExecution6);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener8 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = timedItemReadListener8.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder10 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemReadListener8.setTimerHolder(timerHolder10);
        timedItemReadListener0.afterRead((java.lang.Object) timedItemReadListener8);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener13 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution14 = null;
        org.springframework.batch.core.ExitStatus exitStatus15 = timedChunkListener13.afterStep(stepExecution14);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder16 = timedChunkListener13.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext17 = null;
        timedChunkListener13.beforeChunk(chunkContext17);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext19 = null;
        timedChunkListener13.afterChunkError(chunkContext19);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext21 = null;
        timedChunkListener13.afterChunk(chunkContext21);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener23 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution24 = null;
        org.springframework.batch.core.ExitStatus exitStatus25 = timedChunkListener23.afterStep(stepExecution24);
        org.springframework.batch.core.StepExecution stepExecution26 = null;
        org.springframework.batch.core.ExitStatus exitStatus27 = timedChunkListener23.afterStep(stepExecution26);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder28 = timedChunkListener23.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext29 = null;
        timedChunkListener23.afterChunkError(chunkContext29);
        org.springframework.batch.core.StepExecution stepExecution31 = null;
        org.springframework.batch.core.ExitStatus exitStatus32 = timedChunkListener23.afterStep(stepExecution31);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener33 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder34 = timedItemProcessListener33.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener35 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution36 = null;
        org.springframework.batch.core.ExitStatus exitStatus37 = timedItemProcessListener35.afterStep(stepExecution36);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener38 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder39 = timedItemProcessListener38.getStepExecutionHolder();
        timedItemProcessListener35.setStepExecutionHolder(stepExecutionHolder39);
        timedItemProcessListener33.setStepExecutionHolder(stepExecutionHolder39);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener42 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder43 = timedItemWriteListener42.getStepExecutionHolder();
        java.lang.Exception exception44 = null;
        timedItemProcessListener33.onProcessError((java.lang.Object) stepExecutionHolder43, exception44);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener46 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution47 = null;
        org.springframework.batch.core.ExitStatus exitStatus48 = timedChunkListener46.afterStep(stepExecution47);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder49 = timedChunkListener46.getStepExecutionHolder();
        java.lang.Exception exception50 = null;
        timedItemProcessListener33.onProcessError((java.lang.Object) stepExecutionHolder49, exception50);
        timedChunkListener23.setStepExecutionHolder(stepExecutionHolder49);
        timedChunkListener13.setStepExecutionHolder(stepExecutionHolder49);
        timedItemReadListener8.afterRead((java.lang.Object) timedChunkListener13);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener55 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        timedItemReadListener55.beforeRead();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder57 = timedItemReadListener55.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution58 = null;
        org.springframework.batch.core.ExitStatus exitStatus59 = timedItemReadListener55.afterStep(stepExecution58);
        org.springframework.batch.core.StepExecution stepExecution60 = null;
        org.springframework.batch.core.ExitStatus exitStatus61 = timedItemReadListener55.afterStep(stepExecution60);
        timedItemReadListener55.beforeRead();
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener63 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution64 = null;
        meteredStepExecutionListener63.beforeStep(stepExecution64);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder66 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder66.setGroup("chunk");
        meteredStepExecutionListener63.setMeterHolder(meterHolder66);
        timedItemReadListener55.afterRead((java.lang.Object) meteredStepExecutionListener63);
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener71 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution72 = null;
        meteredStepExecutionListener71.beforeStep(stepExecution72);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder74 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder74.setGroup("chunk");
        meteredStepExecutionListener71.setMeterHolder(meterHolder74);
        meteredStepExecutionListener63.setMeterHolder(meterHolder74);
        timedItemReadListener8.afterRead((java.lang.Object) meterHolder74);
        org.junit.Assert.assertNull(exitStatus3);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus7);
        org.junit.Assert.assertNotNull(stepExecutionHolder9);
        org.junit.Assert.assertNull(exitStatus15);
        org.junit.Assert.assertNotNull(stepExecutionHolder16);
        org.junit.Assert.assertNull(exitStatus25);
        org.junit.Assert.assertNull(exitStatus27);
        org.junit.Assert.assertNotNull(stepExecutionHolder28);
        org.junit.Assert.assertNull(exitStatus32);
        org.junit.Assert.assertNotNull(stepExecutionHolder34);
        org.junit.Assert.assertNull(exitStatus37);
        org.junit.Assert.assertNotNull(stepExecutionHolder39);
        org.junit.Assert.assertNotNull(stepExecutionHolder43);
        org.junit.Assert.assertNull(exitStatus48);
        org.junit.Assert.assertNotNull(stepExecutionHolder49);
        org.junit.Assert.assertNotNull(stepExecutionHolder57);
        org.junit.Assert.assertNull(exitStatus59);
        org.junit.Assert.assertNull(exitStatus61);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedChunkListener0.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder5 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext6 = null;
        timedChunkListener0.beforeChunk(chunkContext6);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext8 = null;
        timedChunkListener0.afterChunkError(chunkContext8);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution11 = stepExecutionHolder10.getCurrent();
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder5);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNull(stepExecution11);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedChunkListener0.afterStep(stepExecution3);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext5 = null;
        timedChunkListener0.afterChunk(chunkContext5);
        org.springframework.batch.core.StepExecution stepExecution7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedChunkListener0.beforeStep(stepExecution7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNull(exitStatus4);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution1);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener3 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder4 = null;
        meteredJobExecutionListener3.setMeterHolder(meterHolder4);
        org.springframework.batch.core.JobExecution jobExecution6 = null;
        meteredJobExecutionListener3.beforeJob(jobExecution6);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder8 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder8.setGroup("");
        meteredJobExecutionListener3.setMeterHolder(meterHolder8);
        meteredStepExecutionListener0.setMeterHolder(meterHolder8);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener13 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution14 = null;
        meteredJobExecutionListener13.beforeJob(jobExecution14);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder16 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        com.codahale.metrics.MetricRegistry metricRegistry17 = null;
        meterHolder16.setMetricRegistry(metricRegistry17);
        meteredJobExecutionListener13.setMeterHolder(meterHolder16);
        meteredStepExecutionListener0.setMeterHolder(meterHolder16);
        org.springframework.batch.core.StepExecution stepExecution21 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution21);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener23 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        timedItemReadListener23.beforeRead();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder25 = timedItemReadListener23.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution26 = null;
        org.springframework.batch.core.ExitStatus exitStatus27 = timedItemReadListener23.afterStep(stepExecution26);
        org.springframework.batch.core.StepExecution stepExecution28 = null;
        org.springframework.batch.core.ExitStatus exitStatus29 = timedItemReadListener23.afterStep(stepExecution28);
        timedItemReadListener23.beforeRead();
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener31 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution32 = null;
        meteredStepExecutionListener31.beforeStep(stepExecution32);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder34 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder34.setGroup("chunk");
        meteredStepExecutionListener31.setMeterHolder(meterHolder34);
        timedItemReadListener23.afterRead((java.lang.Object) meteredStepExecutionListener31);
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener39 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution40 = null;
        meteredStepExecutionListener39.beforeStep(stepExecution40);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder42 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder42.setGroup("chunk");
        meteredStepExecutionListener39.setMeterHolder(meterHolder42);
        meteredStepExecutionListener31.setMeterHolder(meterHolder42);
        meterHolder42.destroy();
        meteredStepExecutionListener0.setMeterHolder(meterHolder42);
        // The following exception was thrown during execution in test generation
        try {
            meterHolder42.mark("process", "read");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder25);
        org.junit.Assert.assertNull(exitStatus27);
        org.junit.Assert.assertNull(exitStatus29);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemProcessListener3.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder4);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener6 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution7 = null;
        org.springframework.batch.core.ExitStatus exitStatus8 = timedItemProcessListener6.afterStep(stepExecution7);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemProcessListener9.getStepExecutionHolder();
        timedItemProcessListener6.setStepExecutionHolder(stepExecutionHolder10);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener12 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution13 = null;
        org.springframework.batch.core.ExitStatus exitStatus14 = timedItemProcessListener12.afterStep(stepExecution13);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder16 = timedItemProcessListener15.getStepExecutionHolder();
        timedItemProcessListener12.setStepExecutionHolder(stepExecutionHolder16);
        timedItemProcessListener6.setStepExecutionHolder(stepExecutionHolder16);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener19 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = timedItemWriteListener19.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder21 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener19.setTimerHolder(timerHolder21);
        timedItemProcessListener0.afterProcess((java.lang.Object) stepExecutionHolder16, (java.lang.Object) timedItemWriteListener19);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener24 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution25 = null;
        org.springframework.batch.core.ExitStatus exitStatus26 = timedChunkListener24.afterStep(stepExecution25);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder27 = timedChunkListener24.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext28 = null;
        timedChunkListener24.beforeChunk(chunkContext28);
        org.springframework.batch.core.StepExecution stepExecution30 = null;
        org.springframework.batch.core.ExitStatus exitStatus31 = timedChunkListener24.afterStep(stepExecution30);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder32 = timedChunkListener24.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder32);
        org.springframework.batch.core.StepExecution stepExecution34 = null;
        org.springframework.batch.core.ExitStatus exitStatus35 = timedItemProcessListener0.afterStep(stepExecution34);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener36 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution37 = null;
        org.springframework.batch.core.ExitStatus exitStatus38 = timedItemProcessListener36.afterStep(stepExecution37);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener39 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder40 = timedChunkListener39.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder41 = timedChunkListener39.getStepExecutionHolder();
        timedItemProcessListener36.setStepExecutionHolder(stepExecutionHolder41);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener43 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        timedItemReadListener43.beforeRead();
        java.lang.Exception exception45 = null;
        timedItemReadListener43.onReadError(exception45);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener47 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution48 = null;
        org.springframework.batch.core.ExitStatus exitStatus49 = timedItemProcessListener47.afterStep(stepExecution48);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener50 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder51 = timedItemProcessListener50.getStepExecutionHolder();
        timedItemProcessListener47.setStepExecutionHolder(stepExecutionHolder51);
        timedItemReadListener43.setStepExecutionHolder(stepExecutionHolder51);
        timedItemProcessListener0.afterProcess((java.lang.Object) timedItemProcessListener36, (java.lang.Object) stepExecutionHolder51);
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus8);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNull(exitStatus14);
        org.junit.Assert.assertNotNull(stepExecutionHolder16);
        org.junit.Assert.assertNotNull(stepExecutionHolder20);
        org.junit.Assert.assertNull(exitStatus26);
        org.junit.Assert.assertNotNull(stepExecutionHolder27);
        org.junit.Assert.assertNull(exitStatus31);
        org.junit.Assert.assertNotNull(stepExecutionHolder32);
        org.junit.Assert.assertNull(exitStatus35);
        org.junit.Assert.assertNull(exitStatus38);
        org.junit.Assert.assertNotNull(stepExecutionHolder40);
        org.junit.Assert.assertNotNull(stepExecutionHolder41);
        org.junit.Assert.assertNull(exitStatus49);
        org.junit.Assert.assertNotNull(stepExecutionHolder51);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemProcessListener3.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder4);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener6 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution7 = null;
        org.springframework.batch.core.ExitStatus exitStatus8 = timedItemProcessListener6.afterStep(stepExecution7);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemProcessListener9.getStepExecutionHolder();
        timedItemProcessListener6.setStepExecutionHolder(stepExecutionHolder10);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener12 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution13 = null;
        org.springframework.batch.core.ExitStatus exitStatus14 = timedItemProcessListener12.afterStep(stepExecution13);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder16 = timedItemProcessListener15.getStepExecutionHolder();
        timedItemProcessListener12.setStepExecutionHolder(stepExecutionHolder16);
        timedItemProcessListener6.setStepExecutionHolder(stepExecutionHolder16);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener19 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = timedItemWriteListener19.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder21 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener19.setTimerHolder(timerHolder21);
        timedItemProcessListener0.afterProcess((java.lang.Object) stepExecutionHolder16, (java.lang.Object) timedItemWriteListener19);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener24 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution25 = null;
        org.springframework.batch.core.ExitStatus exitStatus26 = timedChunkListener24.afterStep(stepExecution25);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder27 = timedChunkListener24.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext28 = null;
        timedChunkListener24.beforeChunk(chunkContext28);
        org.springframework.batch.core.StepExecution stepExecution30 = null;
        org.springframework.batch.core.ExitStatus exitStatus31 = timedChunkListener24.afterStep(stepExecution30);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder32 = timedChunkListener24.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder32);
        org.springframework.batch.core.StepExecution stepExecution34 = null;
        org.springframework.batch.core.ExitStatus exitStatus35 = timedItemProcessListener0.afterStep(stepExecution34);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener36 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder37 = timedItemWriteListener36.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder38 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener36.setTimerHolder(timerHolder38);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener40 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution41 = null;
        org.springframework.batch.core.ExitStatus exitStatus42 = timedItemProcessListener40.afterStep(stepExecution41);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener43 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder44 = timedItemProcessListener43.getStepExecutionHolder();
        timedItemProcessListener40.setStepExecutionHolder(stepExecutionHolder44);
        timedItemWriteListener36.setStepExecutionHolder(stepExecutionHolder44);
        java.util.List list47 = null;
        timedItemWriteListener36.beforeWrite(list47);
        java.lang.Exception exception49 = null;
        timedItemProcessListener0.onProcessError((java.lang.Object) timedItemWriteListener36, exception49);
        org.springframework.batch.core.StepExecution stepExecution51 = null;
        org.springframework.batch.core.ExitStatus exitStatus52 = timedItemWriteListener36.afterStep(stepExecution51);
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus8);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNull(exitStatus14);
        org.junit.Assert.assertNotNull(stepExecutionHolder16);
        org.junit.Assert.assertNotNull(stepExecutionHolder20);
        org.junit.Assert.assertNull(exitStatus26);
        org.junit.Assert.assertNotNull(stepExecutionHolder27);
        org.junit.Assert.assertNull(exitStatus31);
        org.junit.Assert.assertNotNull(stepExecutionHolder32);
        org.junit.Assert.assertNull(exitStatus35);
        org.junit.Assert.assertNotNull(stepExecutionHolder37);
        org.junit.Assert.assertNull(exitStatus42);
        org.junit.Assert.assertNotNull(stepExecutionHolder44);
        org.junit.Assert.assertNull(exitStatus52);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemProcessListener3.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder4);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener6 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution7 = null;
        org.springframework.batch.core.ExitStatus exitStatus8 = timedItemProcessListener6.afterStep(stepExecution7);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemProcessListener9.getStepExecutionHolder();
        timedItemProcessListener6.setStepExecutionHolder(stepExecutionHolder10);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder10);
        com.bazoud.metrics.springbatch.MetricsHelper metricsHelper13 = new com.bazoud.metrics.springbatch.MetricsHelper();
        timedItemProcessListener0.beforeProcess((java.lang.Object) metricsHelper13);
        org.springframework.batch.core.StepExecution stepExecution15 = null;
        org.springframework.batch.core.ExitStatus exitStatus16 = timedItemProcessListener0.afterStep(stepExecution15);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener17 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder18 = timedItemProcessListener17.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder19 = timedItemProcessListener17.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener20 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder21 = timedItemWriteListener20.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder22 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener20.setTimerHolder(timerHolder22);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener24 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution25 = null;
        org.springframework.batch.core.ExitStatus exitStatus26 = timedItemProcessListener24.afterStep(stepExecution25);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener27 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder28 = timedItemProcessListener27.getStepExecutionHolder();
        timedItemProcessListener24.setStepExecutionHolder(stepExecutionHolder28);
        timedItemWriteListener20.setStepExecutionHolder(stepExecutionHolder28);
        java.util.List list31 = null;
        timedItemWriteListener20.afterWrite(list31);
        java.util.List list33 = null;
        timedItemWriteListener20.beforeWrite(list33);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener35 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder36 = timedItemProcessListener35.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener37 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution38 = null;
        org.springframework.batch.core.ExitStatus exitStatus39 = timedItemProcessListener37.afterStep(stepExecution38);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener40 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder41 = timedItemProcessListener40.getStepExecutionHolder();
        timedItemProcessListener37.setStepExecutionHolder(stepExecutionHolder41);
        timedItemProcessListener35.setStepExecutionHolder(stepExecutionHolder41);
        timedItemProcessListener35.beforeProcess((java.lang.Object) 10.0d);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener46 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder47 = timedItemWriteListener46.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder48 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener46.setTimerHolder(timerHolder48);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener50 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution51 = null;
        org.springframework.batch.core.ExitStatus exitStatus52 = timedItemProcessListener50.afterStep(stepExecution51);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener53 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder54 = timedItemProcessListener53.getStepExecutionHolder();
        timedItemProcessListener50.setStepExecutionHolder(stepExecutionHolder54);
        timedItemWriteListener46.setStepExecutionHolder(stepExecutionHolder54);
        timedItemProcessListener35.afterProcess((java.lang.Object) timedItemWriteListener46, (java.lang.Object) 10.0f);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener59 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution60 = null;
        org.springframework.batch.core.ExitStatus exitStatus61 = timedItemProcessListener59.afterStep(stepExecution60);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener62 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder63 = timedItemProcessListener62.getStepExecutionHolder();
        timedItemProcessListener59.setStepExecutionHolder(stepExecutionHolder63);
        timedItemWriteListener46.setStepExecutionHolder(stepExecutionHolder63);
        timedItemProcessListener17.afterProcess((java.lang.Object) timedItemWriteListener20, (java.lang.Object) stepExecutionHolder63);
        timedItemProcessListener0.beforeProcess((java.lang.Object) timedItemWriteListener20);
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus8);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNull(exitStatus16);
        org.junit.Assert.assertNotNull(stepExecutionHolder18);
        org.junit.Assert.assertNotNull(stepExecutionHolder19);
        org.junit.Assert.assertNotNull(stepExecutionHolder21);
        org.junit.Assert.assertNull(exitStatus26);
        org.junit.Assert.assertNotNull(stepExecutionHolder28);
        org.junit.Assert.assertNotNull(stepExecutionHolder36);
        org.junit.Assert.assertNull(exitStatus39);
        org.junit.Assert.assertNotNull(stepExecutionHolder41);
        org.junit.Assert.assertNotNull(stepExecutionHolder47);
        org.junit.Assert.assertNull(exitStatus52);
        org.junit.Assert.assertNotNull(stepExecutionHolder54);
        org.junit.Assert.assertNull(exitStatus61);
        org.junit.Assert.assertNotNull(stepExecutionHolder63);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution1 = null;
        meteredJobExecutionListener0.beforeJob(jobExecution1);
        org.springframework.batch.core.JobExecution jobExecution3 = null;
        meteredJobExecutionListener0.beforeJob(jobExecution3);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener5 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution6 = null;
        meteredJobExecutionListener5.beforeJob(jobExecution6);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder8 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        com.codahale.metrics.MetricRegistry metricRegistry9 = null;
        meterHolder8.setMetricRegistry(metricRegistry9);
        meteredJobExecutionListener5.setMeterHolder(meterHolder8);
        meterHolder8.setGroup("metered");
        meteredJobExecutionListener0.setMeterHolder(meterHolder8);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener15 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution16 = null;
        meteredJobExecutionListener15.beforeJob(jobExecution16);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder18 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        com.codahale.metrics.MetricRegistry metricRegistry19 = null;
        meterHolder18.setMetricRegistry(metricRegistry19);
        meteredJobExecutionListener15.setMeterHolder(meterHolder18);
        meterHolder18.destroy();
        meteredJobExecutionListener0.setMeterHolder(meterHolder18);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener timedStepExecutionListener0 = new com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener1 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemProcessListener1.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution4 = null;
        org.springframework.batch.core.ExitStatus exitStatus5 = timedItemProcessListener3.afterStep(stepExecution4);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener6 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder7 = timedItemProcessListener6.getStepExecutionHolder();
        timedItemProcessListener3.setStepExecutionHolder(stepExecutionHolder7);
        timedItemProcessListener1.setStepExecutionHolder(stepExecutionHolder7);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener10 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder11 = timedItemWriteListener10.getStepExecutionHolder();
        java.lang.Exception exception12 = null;
        timedItemProcessListener1.onProcessError((java.lang.Object) stepExecutionHolder11, exception12);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder16 = timedItemWriteListener15.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder17 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener15.setTimerHolder(timerHolder17);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener19 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = timedItemWriteListener19.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder21 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener19.setTimerHolder(timerHolder21);
        timerHolder21.setGroup("metered");
        timedItemWriteListener15.setTimerHolder(timerHolder21);
        timedItemProcessListener1.afterProcess((java.lang.Object) "step", (java.lang.Object) timerHolder21);
        timedStepExecutionListener0.setTimerHolder(timerHolder21);
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener28 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener29 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder30 = timedItemWriteListener29.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder31 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener29.setTimerHolder(timerHolder31);
        timerHolder31.setGroup("metered");
        timedJobExecutionListener28.setTimerHolder(timerHolder31);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener36 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder37 = timedItemWriteListener36.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder38 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener36.setTimerHolder(timerHolder38);
        timerHolder38.setGroup("metered");
        timedJobExecutionListener28.setTimerHolder(timerHolder38);
        timedStepExecutionListener0.setTimerHolder(timerHolder38);
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener44 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener45 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder46 = timedItemWriteListener45.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder47 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener45.setTimerHolder(timerHolder47);
        timerHolder47.setGroup("metered");
        timedJobExecutionListener44.setTimerHolder(timerHolder47);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener52 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder53 = timedItemWriteListener52.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder54 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener52.setTimerHolder(timerHolder54);
        timerHolder54.setGroup("metered");
        timerHolder54.destroy();
        com.codahale.metrics.MetricRegistry metricRegistry59 = null;
        timerHolder54.setMetricRegistry(metricRegistry59);
        timerHolder54.destroy();
        timedJobExecutionListener44.setTimerHolder(timerHolder54);
        timerHolder54.destroy();
        timedStepExecutionListener0.setTimerHolder(timerHolder54);
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
        org.junit.Assert.assertNull(exitStatus5);
        org.junit.Assert.assertNotNull(stepExecutionHolder7);
        org.junit.Assert.assertNotNull(stepExecutionHolder11);
        org.junit.Assert.assertNotNull(stepExecutionHolder16);
        org.junit.Assert.assertNotNull(stepExecutionHolder20);
        org.junit.Assert.assertNotNull(stepExecutionHolder30);
        org.junit.Assert.assertNotNull(stepExecutionHolder37);
        org.junit.Assert.assertNotNull(stepExecutionHolder46);
        org.junit.Assert.assertNotNull(stepExecutionHolder53);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemWriteListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution4 = null;
        org.springframework.batch.core.ExitStatus exitStatus5 = timedItemProcessListener3.afterStep(stepExecution4);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener6 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder7 = timedItemProcessListener6.getStepExecutionHolder();
        timedItemProcessListener3.setStepExecutionHolder(stepExecutionHolder7);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = null;
        timedItemProcessListener3.setStepExecutionHolder(stepExecutionHolder9);
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder11 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timerHolder11.setGroup("hi!");
        timedItemProcessListener3.setTimerHolder(timerHolder11);
        timerHolder11.setGroup("hi!");
        timedItemWriteListener0.setTimerHolder(timerHolder11);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder18 = timedItemWriteListener0.getStepExecutionHolder();
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNull(exitStatus5);
        org.junit.Assert.assertNotNull(stepExecutionHolder7);
        org.junit.Assert.assertNotNull(stepExecutionHolder18);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution1);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder3 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder3.setGroup("");
        com.codahale.metrics.MetricRegistry metricRegistry6 = null;
        meterHolder3.setMetricRegistry(metricRegistry6);
        meteredStepExecutionListener0.setMeterHolder(meterHolder3);
        // The following exception was thrown during execution in test generation
        try {
            meterHolder3.mark("", "job");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        org.springframework.batch.core.StepExecution stepExecution9 = null;
        org.springframework.batch.core.ExitStatus exitStatus10 = timedItemProcessListener0.afterStep(stepExecution9);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder11 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        com.codahale.metrics.MetricRegistry metricRegistry12 = null;
        meterHolder11.setMetricRegistry(metricRegistry12);
        timedItemProcessListener0.beforeProcess((java.lang.Object) metricRegistry12);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNull(exitStatus10);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder3 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext4 = null;
        timedChunkListener0.beforeChunk(chunkContext4);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener6 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution7 = null;
        org.springframework.batch.core.ExitStatus exitStatus8 = timedChunkListener6.afterStep(stepExecution7);
        org.springframework.batch.core.StepExecution stepExecution9 = null;
        org.springframework.batch.core.ExitStatus exitStatus10 = timedChunkListener6.afterStep(stepExecution9);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder11 = timedChunkListener6.getStepExecutionHolder();
        timedChunkListener0.setStepExecutionHolder(stepExecutionHolder11);
        org.springframework.batch.core.StepExecution stepExecution13 = null;
        org.springframework.batch.core.ExitStatus exitStatus14 = timedChunkListener0.afterStep(stepExecution13);
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder3);
        org.junit.Assert.assertNull(exitStatus8);
        org.junit.Assert.assertNull(exitStatus10);
        org.junit.Assert.assertNotNull(stepExecutionHolder11);
        org.junit.Assert.assertNull(exitStatus14);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext1 = null;
        timedChunkListener0.afterChunkError(chunkContext1);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext3 = null;
        timedChunkListener0.afterChunk(chunkContext3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution6 = null;
        org.springframework.batch.core.ExitStatus exitStatus7 = timedItemProcessListener5.afterStep(stepExecution6);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener8 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = timedItemProcessListener8.getStepExecutionHolder();
        timedItemProcessListener5.setStepExecutionHolder(stepExecutionHolder9);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener11 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution12 = null;
        org.springframework.batch.core.ExitStatus exitStatus13 = timedItemProcessListener11.afterStep(stepExecution12);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener14 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder15 = timedItemProcessListener14.getStepExecutionHolder();
        timedItemProcessListener11.setStepExecutionHolder(stepExecutionHolder15);
        timedItemProcessListener5.setStepExecutionHolder(stepExecutionHolder15);
        timedChunkListener0.setStepExecutionHolder(stepExecutionHolder15);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder19 = null;
        timedChunkListener0.setStepExecutionHolder(stepExecutionHolder19);
        org.junit.Assert.assertNull(exitStatus7);
        org.junit.Assert.assertNotNull(stepExecutionHolder9);
        org.junit.Assert.assertNull(exitStatus13);
        org.junit.Assert.assertNotNull(stepExecutionHolder15);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener timedStepExecutionListener0 = new com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener1 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemProcessListener1.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution4 = null;
        org.springframework.batch.core.ExitStatus exitStatus5 = timedItemProcessListener3.afterStep(stepExecution4);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener6 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder7 = timedItemProcessListener6.getStepExecutionHolder();
        timedItemProcessListener3.setStepExecutionHolder(stepExecutionHolder7);
        timedItemProcessListener1.setStepExecutionHolder(stepExecutionHolder7);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener10 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder11 = timedItemWriteListener10.getStepExecutionHolder();
        java.lang.Exception exception12 = null;
        timedItemProcessListener1.onProcessError((java.lang.Object) stepExecutionHolder11, exception12);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder16 = timedItemWriteListener15.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder17 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener15.setTimerHolder(timerHolder17);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener19 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = timedItemWriteListener19.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder21 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener19.setTimerHolder(timerHolder21);
        timerHolder21.setGroup("metered");
        timedItemWriteListener15.setTimerHolder(timerHolder21);
        timedItemProcessListener1.afterProcess((java.lang.Object) "step", (java.lang.Object) timerHolder21);
        timedStepExecutionListener0.setTimerHolder(timerHolder21);
        timerHolder21.setGroup("job");
        com.codahale.metrics.MetricRegistry metricRegistry30 = null;
        timerHolder21.setMetricRegistry(metricRegistry30);
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
        org.junit.Assert.assertNull(exitStatus5);
        org.junit.Assert.assertNotNull(stepExecutionHolder7);
        org.junit.Assert.assertNotNull(stepExecutionHolder11);
        org.junit.Assert.assertNotNull(stepExecutionHolder16);
        org.junit.Assert.assertNotNull(stepExecutionHolder20);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        timedItemReadListener0.beforeRead();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemReadListener0.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemReadListener0.afterStep(stepExecution3);
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        org.springframework.batch.core.ExitStatus exitStatus6 = timedItemReadListener0.afterStep(stepExecution5);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener7 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener8 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution9 = null;
        org.springframework.batch.core.ExitStatus exitStatus10 = timedChunkListener8.afterStep(stepExecution9);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder11 = timedChunkListener8.getStepExecutionHolder();
        timedItemReadListener7.afterRead((java.lang.Object) stepExecutionHolder11);
        org.springframework.batch.core.StepExecution stepExecution13 = null;
        org.springframework.batch.core.ExitStatus exitStatus14 = timedItemReadListener7.afterStep(stepExecution13);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder16 = timedItemReadListener15.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder17 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemReadListener15.setTimerHolder(timerHolder17);
        timedItemReadListener7.afterRead((java.lang.Object) timedItemReadListener15);
        org.springframework.batch.core.StepExecution stepExecution20 = null;
        org.springframework.batch.core.ExitStatus exitStatus21 = timedItemReadListener15.afterStep(stepExecution20);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener22 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder23 = timedItemWriteListener22.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder24 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener22.setTimerHolder(timerHolder24);
        timerHolder24.setGroup("metered");
        timerHolder24.destroy();
        com.codahale.metrics.MetricRegistry metricRegistry29 = null;
        timerHolder24.setMetricRegistry(metricRegistry29);
        timerHolder24.destroy();
        timedItemReadListener15.setTimerHolder(timerHolder24);
        timedItemReadListener0.afterRead((java.lang.Object) timerHolder24);
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNull(exitStatus6);
        org.junit.Assert.assertNull(exitStatus10);
        org.junit.Assert.assertNotNull(stepExecutionHolder11);
        org.junit.Assert.assertNull(exitStatus14);
        org.junit.Assert.assertNotNull(stepExecutionHolder16);
        org.junit.Assert.assertNull(exitStatus21);
        org.junit.Assert.assertNotNull(stepExecutionHolder23);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        timerHolder2.setGroup("metered");
        timerHolder2.destroy();
        com.codahale.metrics.MetricRegistry metricRegistry7 = null;
        timerHolder2.setMetricRegistry(metricRegistry7);
        timerHolder2.setGroup("chunk");
        timerHolder2.setGroup("timed");
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener4 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder5 = timedItemWriteListener4.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder6 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener4.setTimerHolder(timerHolder6);
        timerHolder6.setGroup("metered");
        timedItemWriteListener0.setTimerHolder(timerHolder6);
        java.util.List list11 = null;
        timedItemWriteListener0.beforeWrite(list11);
        org.springframework.batch.core.StepExecution stepExecution13 = null;
        org.springframework.batch.core.ExitStatus exitStatus14 = timedItemWriteListener0.afterStep(stepExecution13);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder16 = timedItemProcessListener15.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener17 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution18 = null;
        org.springframework.batch.core.ExitStatus exitStatus19 = timedItemProcessListener17.afterStep(stepExecution18);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener20 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder21 = timedItemProcessListener20.getStepExecutionHolder();
        timedItemProcessListener17.setStepExecutionHolder(stepExecutionHolder21);
        timedItemProcessListener15.setStepExecutionHolder(stepExecutionHolder21);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener24 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder25 = timedItemWriteListener24.getStepExecutionHolder();
        java.lang.Exception exception26 = null;
        timedItemProcessListener15.onProcessError((java.lang.Object) stepExecutionHolder25, exception26);
        timedItemProcessListener15.beforeProcess((java.lang.Object) "chunk");
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener30 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener31 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder32 = timedItemWriteListener31.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder33 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener31.setTimerHolder(timerHolder33);
        timerHolder33.setGroup("metered");
        timedJobExecutionListener30.setTimerHolder(timerHolder33);
        timedItemProcessListener15.beforeProcess((java.lang.Object) timedJobExecutionListener30);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener39 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution40 = null;
        org.springframework.batch.core.ExitStatus exitStatus41 = timedItemProcessListener39.afterStep(stepExecution40);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener42 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder43 = timedItemProcessListener42.getStepExecutionHolder();
        timedItemProcessListener39.setStepExecutionHolder(stepExecutionHolder43);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder45 = null;
        timedItemProcessListener39.setStepExecutionHolder(stepExecutionHolder45);
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder47 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timerHolder47.setGroup("hi!");
        timedItemProcessListener39.setTimerHolder(timerHolder47);
        timedJobExecutionListener30.setTimerHolder(timerHolder47);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener52 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder53 = timedItemProcessListener52.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener54 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution55 = null;
        org.springframework.batch.core.ExitStatus exitStatus56 = timedItemProcessListener54.afterStep(stepExecution55);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener57 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder58 = timedItemProcessListener57.getStepExecutionHolder();
        timedItemProcessListener54.setStepExecutionHolder(stepExecutionHolder58);
        timedItemProcessListener52.setStepExecutionHolder(stepExecutionHolder58);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener61 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder62 = timedItemWriteListener61.getStepExecutionHolder();
        java.lang.Exception exception63 = null;
        timedItemProcessListener52.onProcessError((java.lang.Object) stepExecutionHolder62, exception63);
        timedItemProcessListener52.beforeProcess((java.lang.Object) "chunk");
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener67 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener68 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder69 = timedItemWriteListener68.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder70 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener68.setTimerHolder(timerHolder70);
        timerHolder70.setGroup("metered");
        timedJobExecutionListener67.setTimerHolder(timerHolder70);
        timedItemProcessListener52.beforeProcess((java.lang.Object) timedJobExecutionListener67);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener76 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution77 = null;
        org.springframework.batch.core.ExitStatus exitStatus78 = timedItemProcessListener76.afterStep(stepExecution77);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener79 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder80 = timedItemProcessListener79.getStepExecutionHolder();
        timedItemProcessListener76.setStepExecutionHolder(stepExecutionHolder80);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder82 = null;
        timedItemProcessListener76.setStepExecutionHolder(stepExecutionHolder82);
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder84 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timerHolder84.setGroup("hi!");
        timedItemProcessListener76.setTimerHolder(timerHolder84);
        timedJobExecutionListener67.setTimerHolder(timerHolder84);
        timedJobExecutionListener30.setTimerHolder(timerHolder84);
        timedItemWriteListener0.setTimerHolder(timerHolder84);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNotNull(stepExecutionHolder5);
        org.junit.Assert.assertNull(exitStatus14);
        org.junit.Assert.assertNotNull(stepExecutionHolder16);
        org.junit.Assert.assertNull(exitStatus19);
        org.junit.Assert.assertNotNull(stepExecutionHolder21);
        org.junit.Assert.assertNotNull(stepExecutionHolder25);
        org.junit.Assert.assertNotNull(stepExecutionHolder32);
        org.junit.Assert.assertNull(exitStatus41);
        org.junit.Assert.assertNotNull(stepExecutionHolder43);
        org.junit.Assert.assertNotNull(stepExecutionHolder53);
        org.junit.Assert.assertNull(exitStatus56);
        org.junit.Assert.assertNotNull(stepExecutionHolder58);
        org.junit.Assert.assertNotNull(stepExecutionHolder62);
        org.junit.Assert.assertNotNull(stepExecutionHolder69);
        org.junit.Assert.assertNull(exitStatus78);
        org.junit.Assert.assertNotNull(stepExecutionHolder80);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder0 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder0.setGroup("");
        com.codahale.metrics.MetricRegistry metricRegistry3 = null;
        meterHolder0.setMetricRegistry(metricRegistry3);
        meterHolder0.destroy();
        meterHolder0.setGroup("");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedChunkListener0.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder5 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext6 = null;
        timedChunkListener0.beforeChunk(chunkContext6);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext8 = null;
        timedChunkListener0.afterChunkError(chunkContext8);
        org.springframework.batch.core.StepExecution stepExecution10 = null;
        org.springframework.batch.core.ExitStatus exitStatus11 = timedChunkListener0.afterStep(stepExecution10);
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder5);
        org.junit.Assert.assertNull(exitStatus11);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution1);
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution3);
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener5 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution6 = null;
        meteredStepExecutionListener5.beforeStep(stepExecution6);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener8 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder9 = null;
        meteredJobExecutionListener8.setMeterHolder(meterHolder9);
        org.springframework.batch.core.JobExecution jobExecution11 = null;
        meteredJobExecutionListener8.beforeJob(jobExecution11);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder13 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder13.setGroup("");
        meteredJobExecutionListener8.setMeterHolder(meterHolder13);
        meteredStepExecutionListener5.setMeterHolder(meterHolder13);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener18 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution19 = null;
        meteredJobExecutionListener18.beforeJob(jobExecution19);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder21 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        com.codahale.metrics.MetricRegistry metricRegistry22 = null;
        meterHolder21.setMetricRegistry(metricRegistry22);
        meteredJobExecutionListener18.setMeterHolder(meterHolder21);
        meteredStepExecutionListener5.setMeterHolder(meterHolder21);
        org.springframework.batch.core.StepExecution stepExecution26 = null;
        meteredStepExecutionListener5.beforeStep(stepExecution26);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener28 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        timedItemReadListener28.beforeRead();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder30 = timedItemReadListener28.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution31 = null;
        org.springframework.batch.core.ExitStatus exitStatus32 = timedItemReadListener28.afterStep(stepExecution31);
        org.springframework.batch.core.StepExecution stepExecution33 = null;
        org.springframework.batch.core.ExitStatus exitStatus34 = timedItemReadListener28.afterStep(stepExecution33);
        timedItemReadListener28.beforeRead();
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener36 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution37 = null;
        meteredStepExecutionListener36.beforeStep(stepExecution37);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder39 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder39.setGroup("chunk");
        meteredStepExecutionListener36.setMeterHolder(meterHolder39);
        timedItemReadListener28.afterRead((java.lang.Object) meteredStepExecutionListener36);
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener44 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution45 = null;
        meteredStepExecutionListener44.beforeStep(stepExecution45);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder47 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder47.setGroup("chunk");
        meteredStepExecutionListener44.setMeterHolder(meterHolder47);
        meteredStepExecutionListener36.setMeterHolder(meterHolder47);
        meterHolder47.destroy();
        meteredStepExecutionListener5.setMeterHolder(meterHolder47);
        meteredStepExecutionListener0.setMeterHolder(meterHolder47);
        org.springframework.batch.core.StepExecution stepExecution55 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.batch.core.ExitStatus exitStatus56 = meteredStepExecutionListener0.afterStep(stepExecution55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder30);
        org.junit.Assert.assertNull(exitStatus32);
        org.junit.Assert.assertNull(exitStatus34);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder3 = timedChunkListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext5 = null;
        timedChunkListener0.afterChunk(chunkContext5);
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener7 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener8 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = timedItemWriteListener8.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder10 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener8.setTimerHolder(timerHolder10);
        timerHolder10.setGroup("metered");
        timedJobExecutionListener7.setTimerHolder(timerHolder10);
        timerHolder10.destroy();
        timedChunkListener0.setTimerHolder(timerHolder10);
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder3);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNotNull(stepExecutionHolder9);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder3 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext4 = null;
        timedChunkListener0.beforeChunk(chunkContext4);
        org.springframework.batch.core.StepExecution stepExecution6 = null;
        org.springframework.batch.core.ExitStatus exitStatus7 = timedChunkListener0.afterStep(stepExecution6);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder8 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext9 = null;
        timedChunkListener0.afterChunk(chunkContext9);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener11 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder12 = timedItemWriteListener11.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder13 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener11.setTimerHolder(timerHolder13);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution16 = null;
        org.springframework.batch.core.ExitStatus exitStatus17 = timedItemProcessListener15.afterStep(stepExecution16);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener18 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder19 = timedItemProcessListener18.getStepExecutionHolder();
        timedItemProcessListener15.setStepExecutionHolder(stepExecutionHolder19);
        timedItemWriteListener11.setStepExecutionHolder(stepExecutionHolder19);
        org.springframework.batch.core.StepExecution stepExecution22 = null;
        boolean boolean23 = stepExecutionHolder19.after(stepExecution22);
        timedChunkListener0.setStepExecutionHolder(stepExecutionHolder19);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext25 = null;
        timedChunkListener0.beforeChunk(chunkContext25);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener27 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder28 = timedChunkListener27.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener29 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder30 = timedChunkListener29.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder31 = timedChunkListener29.getStepExecutionHolder();
        timedChunkListener27.setStepExecutionHolder(stepExecutionHolder31);
        timedChunkListener0.setStepExecutionHolder(stepExecutionHolder31);
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder3);
        org.junit.Assert.assertNull(exitStatus7);
        org.junit.Assert.assertNotNull(stepExecutionHolder8);
        org.junit.Assert.assertNotNull(stepExecutionHolder12);
        org.junit.Assert.assertNull(exitStatus17);
        org.junit.Assert.assertNotNull(stepExecutionHolder19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(stepExecutionHolder28);
        org.junit.Assert.assertNotNull(stepExecutionHolder30);
        org.junit.Assert.assertNotNull(stepExecutionHolder31);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener1 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution2 = null;
        org.springframework.batch.core.ExitStatus exitStatus3 = timedChunkListener1.afterStep(stepExecution2);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedChunkListener1.getStepExecutionHolder();
        timedItemReadListener0.afterRead((java.lang.Object) stepExecutionHolder4);
        org.springframework.batch.core.StepExecution stepExecution6 = null;
        org.springframework.batch.core.ExitStatus exitStatus7 = timedItemReadListener0.afterStep(stepExecution6);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener8 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = timedItemReadListener8.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder10 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemReadListener8.setTimerHolder(timerHolder10);
        timedItemReadListener0.afterRead((java.lang.Object) timedItemReadListener8);
        java.lang.Exception exception13 = null;
        timedItemReadListener8.onReadError(exception13);
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder15 = null;
        timedItemReadListener8.setTimerHolder(timerHolder15);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener17 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution18 = null;
        org.springframework.batch.core.ExitStatus exitStatus19 = timedChunkListener17.afterStep(stepExecution18);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = timedChunkListener17.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext21 = null;
        timedChunkListener17.beforeChunk(chunkContext21);
        org.springframework.batch.core.StepExecution stepExecution23 = null;
        org.springframework.batch.core.ExitStatus exitStatus24 = timedChunkListener17.afterStep(stepExecution23);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder25 = timedChunkListener17.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener26 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution27 = null;
        org.springframework.batch.core.ExitStatus exitStatus28 = timedChunkListener26.afterStep(stepExecution27);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder29 = timedChunkListener26.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext30 = null;
        timedChunkListener26.beforeChunk(chunkContext30);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext32 = null;
        timedChunkListener26.afterChunkError(chunkContext32);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext34 = null;
        timedChunkListener26.afterChunk(chunkContext34);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder36 = timedChunkListener26.getStepExecutionHolder();
        timedChunkListener17.setStepExecutionHolder(stepExecutionHolder36);
        timedItemReadListener8.setStepExecutionHolder(stepExecutionHolder36);
        org.springframework.batch.core.StepExecution stepExecution39 = null;
        org.springframework.batch.core.ExitStatus exitStatus40 = timedItemReadListener8.afterStep(stepExecution39);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener41 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener42 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution43 = null;
        org.springframework.batch.core.ExitStatus exitStatus44 = timedChunkListener42.afterStep(stepExecution43);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder45 = timedChunkListener42.getStepExecutionHolder();
        timedItemReadListener41.afterRead((java.lang.Object) stepExecutionHolder45);
        org.springframework.batch.core.StepExecution stepExecution47 = null;
        org.springframework.batch.core.ExitStatus exitStatus48 = timedItemReadListener41.afterStep(stepExecution47);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener49 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder50 = timedItemReadListener49.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder51 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemReadListener49.setTimerHolder(timerHolder51);
        timedItemReadListener41.afterRead((java.lang.Object) timedItemReadListener49);
        java.lang.Exception exception54 = null;
        timedItemReadListener49.onReadError(exception54);
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder56 = null;
        timedItemReadListener49.setTimerHolder(timerHolder56);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener58 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution59 = null;
        org.springframework.batch.core.ExitStatus exitStatus60 = timedChunkListener58.afterStep(stepExecution59);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder61 = timedChunkListener58.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext62 = null;
        timedChunkListener58.beforeChunk(chunkContext62);
        org.springframework.batch.core.StepExecution stepExecution64 = null;
        org.springframework.batch.core.ExitStatus exitStatus65 = timedChunkListener58.afterStep(stepExecution64);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder66 = timedChunkListener58.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener67 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution68 = null;
        org.springframework.batch.core.ExitStatus exitStatus69 = timedChunkListener67.afterStep(stepExecution68);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder70 = timedChunkListener67.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext71 = null;
        timedChunkListener67.beforeChunk(chunkContext71);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext73 = null;
        timedChunkListener67.afterChunkError(chunkContext73);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext75 = null;
        timedChunkListener67.afterChunk(chunkContext75);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder77 = timedChunkListener67.getStepExecutionHolder();
        timedChunkListener58.setStepExecutionHolder(stepExecutionHolder77);
        timedItemReadListener49.setStepExecutionHolder(stepExecutionHolder77);
        timedItemReadListener8.afterRead((java.lang.Object) stepExecutionHolder77);
        org.junit.Assert.assertNull(exitStatus3);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus7);
        org.junit.Assert.assertNotNull(stepExecutionHolder9);
        org.junit.Assert.assertNull(exitStatus19);
        org.junit.Assert.assertNotNull(stepExecutionHolder20);
        org.junit.Assert.assertNull(exitStatus24);
        org.junit.Assert.assertNotNull(stepExecutionHolder25);
        org.junit.Assert.assertNull(exitStatus28);
        org.junit.Assert.assertNotNull(stepExecutionHolder29);
        org.junit.Assert.assertNotNull(stepExecutionHolder36);
        org.junit.Assert.assertNull(exitStatus40);
        org.junit.Assert.assertNull(exitStatus44);
        org.junit.Assert.assertNotNull(stepExecutionHolder45);
        org.junit.Assert.assertNull(exitStatus48);
        org.junit.Assert.assertNotNull(stepExecutionHolder50);
        org.junit.Assert.assertNull(exitStatus60);
        org.junit.Assert.assertNotNull(stepExecutionHolder61);
        org.junit.Assert.assertNull(exitStatus65);
        org.junit.Assert.assertNotNull(stepExecutionHolder66);
        org.junit.Assert.assertNull(exitStatus69);
        org.junit.Assert.assertNotNull(stepExecutionHolder70);
        org.junit.Assert.assertNotNull(stepExecutionHolder77);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemProcessListener3.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder4);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener6 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution7 = null;
        org.springframework.batch.core.ExitStatus exitStatus8 = timedItemProcessListener6.afterStep(stepExecution7);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemProcessListener9.getStepExecutionHolder();
        timedItemProcessListener6.setStepExecutionHolder(stepExecutionHolder10);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener12 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution13 = null;
        org.springframework.batch.core.ExitStatus exitStatus14 = timedItemProcessListener12.afterStep(stepExecution13);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder16 = timedItemProcessListener15.getStepExecutionHolder();
        timedItemProcessListener12.setStepExecutionHolder(stepExecutionHolder16);
        timedItemProcessListener6.setStepExecutionHolder(stepExecutionHolder16);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener19 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = timedItemWriteListener19.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder21 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener19.setTimerHolder(timerHolder21);
        timedItemProcessListener0.afterProcess((java.lang.Object) stepExecutionHolder16, (java.lang.Object) timedItemWriteListener19);
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener24 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener25 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder26 = timedItemWriteListener25.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder27 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener25.setTimerHolder(timerHolder27);
        timerHolder27.setGroup("metered");
        timedJobExecutionListener24.setTimerHolder(timerHolder27);
        timedItemWriteListener19.setTimerHolder(timerHolder27);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener33 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution34 = null;
        org.springframework.batch.core.ExitStatus exitStatus35 = timedItemProcessListener33.afterStep(stepExecution34);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener36 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder37 = timedItemProcessListener36.getStepExecutionHolder();
        timedItemProcessListener33.setStepExecutionHolder(stepExecutionHolder37);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener39 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution40 = null;
        org.springframework.batch.core.ExitStatus exitStatus41 = timedItemProcessListener39.afterStep(stepExecution40);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener42 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder43 = timedItemProcessListener42.getStepExecutionHolder();
        timedItemProcessListener39.setStepExecutionHolder(stepExecutionHolder43);
        timedItemProcessListener33.setStepExecutionHolder(stepExecutionHolder43);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder46 = timedItemProcessListener33.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution47 = stepExecutionHolder46.getCurrent();
        timedItemWriteListener19.setStepExecutionHolder(stepExecutionHolder46);
        java.lang.Class<?> wildcardClass49 = stepExecutionHolder46.getClass();
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus8);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNull(exitStatus14);
        org.junit.Assert.assertNotNull(stepExecutionHolder16);
        org.junit.Assert.assertNotNull(stepExecutionHolder20);
        org.junit.Assert.assertNotNull(stepExecutionHolder26);
        org.junit.Assert.assertNull(exitStatus35);
        org.junit.Assert.assertNotNull(stepExecutionHolder37);
        org.junit.Assert.assertNull(exitStatus41);
        org.junit.Assert.assertNotNull(stepExecutionHolder43);
        org.junit.Assert.assertNotNull(stepExecutionHolder46);
        org.junit.Assert.assertNull(stepExecution47);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemWriteListener9.getStepExecutionHolder();
        java.lang.Exception exception11 = null;
        timedItemProcessListener0.onProcessError((java.lang.Object) stepExecutionHolder10, exception11);
        org.springframework.batch.core.StepExecution stepExecution13 = null;
        // The following exception was thrown during execution in test generation
        try {
            stepExecutionHolder10.before(stepExecution13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemWriteListener9.getStepExecutionHolder();
        java.lang.Exception exception11 = null;
        timedItemProcessListener0.onProcessError((java.lang.Object) stepExecutionHolder10, exception11);
        timedItemProcessListener0.beforeProcess((java.lang.Object) "chunk");
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener15 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener16 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder17 = timedItemWriteListener16.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder18 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener16.setTimerHolder(timerHolder18);
        timerHolder18.setGroup("metered");
        timedJobExecutionListener15.setTimerHolder(timerHolder18);
        timedItemProcessListener0.beforeProcess((java.lang.Object) timedJobExecutionListener15);
        org.springframework.batch.core.StepExecution stepExecution24 = null;
        org.springframework.batch.core.ExitStatus exitStatus25 = timedItemProcessListener0.afterStep(stepExecution24);
        org.springframework.batch.core.StepExecution stepExecution26 = null;
        org.springframework.batch.core.ExitStatus exitStatus27 = timedItemProcessListener0.afterStep(stepExecution26);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNotNull(stepExecutionHolder17);
        org.junit.Assert.assertNull(exitStatus25);
        org.junit.Assert.assertNull(exitStatus27);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedItemProcessListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemProcessListener3.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder4);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener6 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution7 = null;
        org.springframework.batch.core.ExitStatus exitStatus8 = timedItemProcessListener6.afterStep(stepExecution7);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemProcessListener9.getStepExecutionHolder();
        timedItemProcessListener6.setStepExecutionHolder(stepExecutionHolder10);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener12 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution13 = null;
        org.springframework.batch.core.ExitStatus exitStatus14 = timedItemProcessListener12.afterStep(stepExecution13);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder16 = timedItemProcessListener15.getStepExecutionHolder();
        timedItemProcessListener12.setStepExecutionHolder(stepExecutionHolder16);
        timedItemProcessListener6.setStepExecutionHolder(stepExecutionHolder16);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener19 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = timedItemWriteListener19.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder21 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener19.setTimerHolder(timerHolder21);
        timedItemProcessListener0.afterProcess((java.lang.Object) stepExecutionHolder16, (java.lang.Object) timedItemWriteListener19);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener24 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution25 = null;
        org.springframework.batch.core.ExitStatus exitStatus26 = timedChunkListener24.afterStep(stepExecution25);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder27 = timedChunkListener24.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext28 = null;
        timedChunkListener24.beforeChunk(chunkContext28);
        org.springframework.batch.core.StepExecution stepExecution30 = null;
        org.springframework.batch.core.ExitStatus exitStatus31 = timedChunkListener24.afterStep(stepExecution30);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder32 = timedChunkListener24.getStepExecutionHolder();
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder32);
        org.springframework.batch.core.StepExecution stepExecution34 = null;
        org.springframework.batch.core.ExitStatus exitStatus35 = timedItemProcessListener0.afterStep(stepExecution34);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder36 = timedItemProcessListener0.getStepExecutionHolder();
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus8);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNull(exitStatus14);
        org.junit.Assert.assertNotNull(stepExecutionHolder16);
        org.junit.Assert.assertNotNull(stepExecutionHolder20);
        org.junit.Assert.assertNull(exitStatus26);
        org.junit.Assert.assertNotNull(stepExecutionHolder27);
        org.junit.Assert.assertNull(exitStatus31);
        org.junit.Assert.assertNotNull(stepExecutionHolder32);
        org.junit.Assert.assertNull(exitStatus35);
        org.junit.Assert.assertNotNull(stepExecutionHolder36);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener1 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution2 = null;
        org.springframework.batch.core.ExitStatus exitStatus3 = timedChunkListener1.afterStep(stepExecution2);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedChunkListener1.getStepExecutionHolder();
        timedItemReadListener0.afterRead((java.lang.Object) stepExecutionHolder4);
        org.springframework.batch.core.StepExecution stepExecution6 = null;
        org.springframework.batch.core.ExitStatus exitStatus7 = timedItemReadListener0.afterStep(stepExecution6);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener8 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = timedItemReadListener8.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder10 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemReadListener8.setTimerHolder(timerHolder10);
        timedItemReadListener0.afterRead((java.lang.Object) timedItemReadListener8);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder13 = timedItemReadListener0.getStepExecutionHolder();
        java.lang.Exception exception14 = null;
        timedItemReadListener0.onReadError(exception14);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener16 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution17 = null;
        org.springframework.batch.core.ExitStatus exitStatus18 = timedItemProcessListener16.afterStep(stepExecution17);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener19 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = timedChunkListener19.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder21 = timedChunkListener19.getStepExecutionHolder();
        timedItemProcessListener16.setStepExecutionHolder(stepExecutionHolder21);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener23 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        timedItemReadListener23.beforeRead();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder25 = timedItemReadListener23.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution26 = null;
        org.springframework.batch.core.ExitStatus exitStatus27 = timedItemReadListener23.afterStep(stepExecution26);
        org.springframework.batch.core.StepExecution stepExecution28 = null;
        org.springframework.batch.core.ExitStatus exitStatus29 = timedItemReadListener23.afterStep(stepExecution28);
        timedItemReadListener23.beforeRead();
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener31 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution32 = null;
        meteredStepExecutionListener31.beforeStep(stepExecution32);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder34 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder34.setGroup("chunk");
        meteredStepExecutionListener31.setMeterHolder(meterHolder34);
        timedItemReadListener23.afterRead((java.lang.Object) meteredStepExecutionListener31);
        java.lang.Exception exception39 = null;
        timedItemProcessListener16.onProcessError((java.lang.Object) timedItemReadListener23, exception39);
        timedItemReadListener0.afterRead((java.lang.Object) exception39);
        org.junit.Assert.assertNull(exitStatus3);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus7);
        org.junit.Assert.assertNotNull(stepExecutionHolder9);
        org.junit.Assert.assertNotNull(stepExecutionHolder13);
        org.junit.Assert.assertNull(exitStatus18);
        org.junit.Assert.assertNotNull(stepExecutionHolder20);
        org.junit.Assert.assertNotNull(stepExecutionHolder21);
        org.junit.Assert.assertNotNull(stepExecutionHolder25);
        org.junit.Assert.assertNull(exitStatus27);
        org.junit.Assert.assertNull(exitStatus29);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution1 = null;
        meteredJobExecutionListener0.beforeJob(jobExecution1);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        timedItemReadListener3.beforeRead();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder5 = timedItemReadListener3.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution6 = null;
        org.springframework.batch.core.ExitStatus exitStatus7 = timedItemReadListener3.afterStep(stepExecution6);
        org.springframework.batch.core.StepExecution stepExecution8 = null;
        org.springframework.batch.core.ExitStatus exitStatus9 = timedItemReadListener3.afterStep(stepExecution8);
        timedItemReadListener3.beforeRead();
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener11 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution12 = null;
        meteredStepExecutionListener11.beforeStep(stepExecution12);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder14 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder14.setGroup("chunk");
        meteredStepExecutionListener11.setMeterHolder(meterHolder14);
        timedItemReadListener3.afterRead((java.lang.Object) meteredStepExecutionListener11);
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener19 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution20 = null;
        meteredStepExecutionListener19.beforeStep(stepExecution20);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder22 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder22.setGroup("chunk");
        meteredStepExecutionListener19.setMeterHolder(meterHolder22);
        meteredStepExecutionListener11.setMeterHolder(meterHolder22);
        meteredJobExecutionListener0.setMeterHolder(meterHolder22);
        meterHolder22.destroy();
        org.junit.Assert.assertNotNull(stepExecutionHolder5);
        org.junit.Assert.assertNull(exitStatus7);
        org.junit.Assert.assertNull(exitStatus9);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener timedStepExecutionListener0 = new com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener1 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder3 = timedItemWriteListener2.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder4 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener2.setTimerHolder(timerHolder4);
        timerHolder4.setGroup("metered");
        timedJobExecutionListener1.setTimerHolder(timerHolder4);
        timedStepExecutionListener0.setTimerHolder(timerHolder4);
        org.springframework.batch.core.StepExecution stepExecution10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedStepExecutionListener0.beforeStep(stepExecution10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder3);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution1 = null;
        meteredJobExecutionListener0.beforeJob(jobExecution1);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder3 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder3.setGroup("");
        meteredJobExecutionListener0.setMeterHolder(meterHolder3);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener9 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder10 = timedItemWriteListener9.getStepExecutionHolder();
        java.lang.Exception exception11 = null;
        timedItemProcessListener0.onProcessError((java.lang.Object) stepExecutionHolder10, exception11);
        timedItemProcessListener0.beforeProcess((java.lang.Object) "chunk");
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener15 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener16 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder17 = timedItemWriteListener16.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder18 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener16.setTimerHolder(timerHolder18);
        timerHolder18.setGroup("metered");
        timedJobExecutionListener15.setTimerHolder(timerHolder18);
        timedItemProcessListener0.beforeProcess((java.lang.Object) timedJobExecutionListener15);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener24 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution25 = null;
        org.springframework.batch.core.ExitStatus exitStatus26 = timedItemProcessListener24.afterStep(stepExecution25);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener27 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder28 = timedItemProcessListener27.getStepExecutionHolder();
        timedItemProcessListener24.setStepExecutionHolder(stepExecutionHolder28);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder30 = null;
        timedItemProcessListener24.setStepExecutionHolder(stepExecutionHolder30);
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder32 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timerHolder32.setGroup("hi!");
        timedItemProcessListener24.setTimerHolder(timerHolder32);
        timedJobExecutionListener15.setTimerHolder(timerHolder32);
        org.springframework.batch.core.JobExecution jobExecution37 = null;
        // The following exception was thrown during execution in test generation
        try {
            timedJobExecutionListener15.beforeJob(jobExecution37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(stepExecutionHolder10);
        org.junit.Assert.assertNotNull(stepExecutionHolder17);
        org.junit.Assert.assertNull(exitStatus26);
        org.junit.Assert.assertNotNull(stepExecutionHolder28);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener0 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener1 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemWriteListener1.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder3 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener1.setTimerHolder(timerHolder3);
        timerHolder3.setGroup("metered");
        timedJobExecutionListener0.setTimerHolder(timerHolder3);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener8 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder9 = timedItemWriteListener8.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder10 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener8.setTimerHolder(timerHolder10);
        timerHolder10.setGroup("metered");
        timerHolder10.destroy();
        com.codahale.metrics.MetricRegistry metricRegistry15 = null;
        timerHolder10.setMetricRegistry(metricRegistry15);
        timerHolder10.destroy();
        timedJobExecutionListener0.setTimerHolder(timerHolder10);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener19 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution20 = null;
        org.springframework.batch.core.ExitStatus exitStatus21 = timedChunkListener19.afterStep(stepExecution20);
        org.springframework.batch.core.StepExecution stepExecution22 = null;
        org.springframework.batch.core.ExitStatus exitStatus23 = timedChunkListener19.afterStep(stepExecution22);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder24 = timedChunkListener19.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext25 = null;
        timedChunkListener19.beforeChunk(chunkContext25);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder27 = timedChunkListener19.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener28 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder29 = timedChunkListener28.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder30 = timedChunkListener28.getStepExecutionHolder();
        timedChunkListener19.setStepExecutionHolder(stepExecutionHolder30);
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener32 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener33 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder34 = timedItemWriteListener33.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder35 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener33.setTimerHolder(timerHolder35);
        timerHolder35.setGroup("metered");
        timedJobExecutionListener32.setTimerHolder(timerHolder35);
        timedChunkListener19.setTimerHolder(timerHolder35);
        timedJobExecutionListener0.setTimerHolder(timerHolder35);
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
        org.junit.Assert.assertNotNull(stepExecutionHolder9);
        org.junit.Assert.assertNull(exitStatus21);
        org.junit.Assert.assertNull(exitStatus23);
        org.junit.Assert.assertNotNull(stepExecutionHolder24);
        org.junit.Assert.assertNotNull(stepExecutionHolder27);
        org.junit.Assert.assertNotNull(stepExecutionHolder29);
        org.junit.Assert.assertNotNull(stepExecutionHolder30);
        org.junit.Assert.assertNotNull(stepExecutionHolder34);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        timedItemReadListener0.beforeRead();
        java.lang.Exception exception2 = null;
        timedItemReadListener0.onReadError(exception2);
        java.lang.Exception exception4 = null;
        timedItemReadListener0.onReadError(exception4);
        timedItemReadListener0.beforeRead();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemWriteListener3.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder5 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener3.setTimerHolder(timerHolder5);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener7 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution8 = null;
        org.springframework.batch.core.ExitStatus exitStatus9 = timedItemProcessListener7.afterStep(stepExecution8);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener10 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder11 = timedItemProcessListener10.getStepExecutionHolder();
        timedItemProcessListener7.setStepExecutionHolder(stepExecutionHolder11);
        timedItemWriteListener3.setStepExecutionHolder(stepExecutionHolder11);
        java.util.List list14 = null;
        timedItemWriteListener3.afterWrite(list14);
        java.util.List list16 = null;
        timedItemWriteListener3.beforeWrite(list16);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener18 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder19 = timedItemProcessListener18.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener20 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution21 = null;
        org.springframework.batch.core.ExitStatus exitStatus22 = timedItemProcessListener20.afterStep(stepExecution21);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener23 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder24 = timedItemProcessListener23.getStepExecutionHolder();
        timedItemProcessListener20.setStepExecutionHolder(stepExecutionHolder24);
        timedItemProcessListener18.setStepExecutionHolder(stepExecutionHolder24);
        timedItemProcessListener18.beforeProcess((java.lang.Object) 10.0d);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener29 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder30 = timedItemWriteListener29.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder31 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener29.setTimerHolder(timerHolder31);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener33 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution34 = null;
        org.springframework.batch.core.ExitStatus exitStatus35 = timedItemProcessListener33.afterStep(stepExecution34);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener36 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder37 = timedItemProcessListener36.getStepExecutionHolder();
        timedItemProcessListener33.setStepExecutionHolder(stepExecutionHolder37);
        timedItemWriteListener29.setStepExecutionHolder(stepExecutionHolder37);
        timedItemProcessListener18.afterProcess((java.lang.Object) timedItemWriteListener29, (java.lang.Object) 10.0f);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener42 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution43 = null;
        org.springframework.batch.core.ExitStatus exitStatus44 = timedItemProcessListener42.afterStep(stepExecution43);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener45 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder46 = timedItemProcessListener45.getStepExecutionHolder();
        timedItemProcessListener42.setStepExecutionHolder(stepExecutionHolder46);
        timedItemWriteListener29.setStepExecutionHolder(stepExecutionHolder46);
        timedItemProcessListener0.afterProcess((java.lang.Object) timedItemWriteListener3, (java.lang.Object) stepExecutionHolder46);
        org.springframework.batch.core.StepExecution stepExecution50 = null;
        org.springframework.batch.core.ExitStatus exitStatus51 = timedItemProcessListener0.afterStep(stepExecution50);
        org.springframework.batch.core.StepExecution stepExecution52 = null;
        org.springframework.batch.core.ExitStatus exitStatus53 = timedItemProcessListener0.afterStep(stepExecution52);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus9);
        org.junit.Assert.assertNotNull(stepExecutionHolder11);
        org.junit.Assert.assertNotNull(stepExecutionHolder19);
        org.junit.Assert.assertNull(exitStatus22);
        org.junit.Assert.assertNotNull(stepExecutionHolder24);
        org.junit.Assert.assertNotNull(stepExecutionHolder30);
        org.junit.Assert.assertNull(exitStatus35);
        org.junit.Assert.assertNotNull(stepExecutionHolder37);
        org.junit.Assert.assertNull(exitStatus44);
        org.junit.Assert.assertNotNull(stepExecutionHolder46);
        org.junit.Assert.assertNull(exitStatus51);
        org.junit.Assert.assertNull(exitStatus53);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemWriteListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder2 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener0.setTimerHolder(timerHolder2);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener4 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        org.springframework.batch.core.ExitStatus exitStatus6 = timedItemProcessListener4.afterStep(stepExecution5);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener7 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder8 = timedItemProcessListener7.getStepExecutionHolder();
        timedItemProcessListener4.setStepExecutionHolder(stepExecutionHolder8);
        timedItemWriteListener0.setStepExecutionHolder(stepExecutionHolder8);
        java.util.List list11 = null;
        timedItemWriteListener0.beforeWrite(list11);
        java.lang.Exception exception13 = null;
        java.util.List list14 = null;
        timedItemWriteListener0.onWriteError(exception13, list14);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus6);
        org.junit.Assert.assertNotNull(stepExecutionHolder8);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        timedItemReadListener0.beforeRead();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemReadListener0.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemReadListener0.afterStep(stepExecution3);
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        org.springframework.batch.core.ExitStatus exitStatus6 = timedItemReadListener0.afterStep(stepExecution5);
        timedItemReadListener0.beforeRead();
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener8 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution9 = null;
        meteredStepExecutionListener8.beforeStep(stepExecution9);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder11 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder11.setGroup("chunk");
        meteredStepExecutionListener8.setMeterHolder(meterHolder11);
        timedItemReadListener0.afterRead((java.lang.Object) meteredStepExecutionListener8);
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener16 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution17 = null;
        meteredStepExecutionListener16.beforeStep(stepExecution17);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder19 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meterHolder19.setGroup("chunk");
        meteredStepExecutionListener16.setMeterHolder(meterHolder19);
        meteredStepExecutionListener8.setMeterHolder(meterHolder19);
        com.codahale.metrics.MetricRegistry metricRegistry24 = null;
        meterHolder19.setMetricRegistry(metricRegistry24);
        com.codahale.metrics.MetricRegistry metricRegistry26 = null;
        meterHolder19.setMetricRegistry(metricRegistry26);
        // The following exception was thrown during execution in test generation
        try {
            meterHolder19.mark("chunk", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNull(exitStatus6);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution1 = null;
        meteredJobExecutionListener0.beforeJob(jobExecution1);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder3 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        com.codahale.metrics.MetricRegistry metricRegistry4 = null;
        meterHolder3.setMetricRegistry(metricRegistry4);
        meteredJobExecutionListener0.setMeterHolder(meterHolder3);
        com.codahale.metrics.MetricRegistry metricRegistry7 = null;
        meterHolder3.setMetricRegistry(metricRegistry7);
        com.codahale.metrics.MetricRegistry metricRegistry9 = null;
        meterHolder3.setMetricRegistry(metricRegistry9);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener timedStepExecutionListener0 = new com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener1 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemProcessListener1.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution4 = null;
        org.springframework.batch.core.ExitStatus exitStatus5 = timedItemProcessListener3.afterStep(stepExecution4);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener6 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder7 = timedItemProcessListener6.getStepExecutionHolder();
        timedItemProcessListener3.setStepExecutionHolder(stepExecutionHolder7);
        timedItemProcessListener1.setStepExecutionHolder(stepExecutionHolder7);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener10 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder11 = timedItemWriteListener10.getStepExecutionHolder();
        java.lang.Exception exception12 = null;
        timedItemProcessListener1.onProcessError((java.lang.Object) stepExecutionHolder11, exception12);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder16 = timedItemWriteListener15.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder17 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener15.setTimerHolder(timerHolder17);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener19 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder20 = timedItemWriteListener19.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder21 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener19.setTimerHolder(timerHolder21);
        timerHolder21.setGroup("metered");
        timedItemWriteListener15.setTimerHolder(timerHolder21);
        timedItemProcessListener1.afterProcess((java.lang.Object) "step", (java.lang.Object) timerHolder21);
        timedStepExecutionListener0.setTimerHolder(timerHolder21);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener28 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder29 = timedItemReadListener28.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder30 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemReadListener28.setTimerHolder(timerHolder30);
        timedStepExecutionListener0.setTimerHolder(timerHolder30);
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener33 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener34 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder35 = timedItemWriteListener34.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder36 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener34.setTimerHolder(timerHolder36);
        timerHolder36.setGroup("metered");
        timedJobExecutionListener33.setTimerHolder(timerHolder36);
        timerHolder36.stop("", "timed", "metered");
        timerHolder36.setGroup("write");
        timerHolder36.stop("chunk", "", "write");
        timedStepExecutionListener0.setTimerHolder(timerHolder36);
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener52 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution53 = null;
        org.springframework.batch.core.ExitStatus exitStatus54 = timedChunkListener52.afterStep(stepExecution53);
        org.springframework.batch.core.StepExecution stepExecution55 = null;
        org.springframework.batch.core.ExitStatus exitStatus56 = timedChunkListener52.afterStep(stepExecution55);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder57 = timedChunkListener52.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext58 = null;
        timedChunkListener52.beforeChunk(chunkContext58);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder60 = timedChunkListener52.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener61 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder62 = timedChunkListener61.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder63 = timedChunkListener61.getStepExecutionHolder();
        timedChunkListener52.setStepExecutionHolder(stepExecutionHolder63);
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener65 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener66 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder67 = timedItemWriteListener66.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder68 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener66.setTimerHolder(timerHolder68);
        timerHolder68.setGroup("metered");
        timedJobExecutionListener65.setTimerHolder(timerHolder68);
        timedChunkListener52.setTimerHolder(timerHolder68);
        timedStepExecutionListener0.setTimerHolder(timerHolder68);
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
        org.junit.Assert.assertNull(exitStatus5);
        org.junit.Assert.assertNotNull(stepExecutionHolder7);
        org.junit.Assert.assertNotNull(stepExecutionHolder11);
        org.junit.Assert.assertNotNull(stepExecutionHolder16);
        org.junit.Assert.assertNotNull(stepExecutionHolder20);
        org.junit.Assert.assertNotNull(stepExecutionHolder29);
        org.junit.Assert.assertNotNull(stepExecutionHolder35);
        org.junit.Assert.assertNull(exitStatus54);
        org.junit.Assert.assertNull(exitStatus56);
        org.junit.Assert.assertNotNull(stepExecutionHolder57);
        org.junit.Assert.assertNotNull(stepExecutionHolder60);
        org.junit.Assert.assertNotNull(stepExecutionHolder62);
        org.junit.Assert.assertNotNull(stepExecutionHolder63);
        org.junit.Assert.assertNotNull(stepExecutionHolder67);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener timedStepExecutionListener0 = new com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener1 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder3 = timedItemWriteListener2.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder4 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener2.setTimerHolder(timerHolder4);
        timerHolder4.setGroup("metered");
        timedJobExecutionListener1.setTimerHolder(timerHolder4);
        timedStepExecutionListener0.setTimerHolder(timerHolder4);
        com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener timedStepExecutionListener10 = new com.bazoud.metrics.springbatch.timer.TimedStepExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener11 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder12 = timedItemProcessListener11.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener13 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution14 = null;
        org.springframework.batch.core.ExitStatus exitStatus15 = timedItemProcessListener13.afterStep(stepExecution14);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener16 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder17 = timedItemProcessListener16.getStepExecutionHolder();
        timedItemProcessListener13.setStepExecutionHolder(stepExecutionHolder17);
        timedItemProcessListener11.setStepExecutionHolder(stepExecutionHolder17);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener20 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder21 = timedItemWriteListener20.getStepExecutionHolder();
        java.lang.Exception exception22 = null;
        timedItemProcessListener11.onProcessError((java.lang.Object) stepExecutionHolder21, exception22);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener25 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder26 = timedItemWriteListener25.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder27 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener25.setTimerHolder(timerHolder27);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener29 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder30 = timedItemWriteListener29.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder31 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener29.setTimerHolder(timerHolder31);
        timerHolder31.setGroup("metered");
        timedItemWriteListener25.setTimerHolder(timerHolder31);
        timedItemProcessListener11.afterProcess((java.lang.Object) "step", (java.lang.Object) timerHolder31);
        timedStepExecutionListener10.setTimerHolder(timerHolder31);
        com.bazoud.metrics.springbatch.timer.TimedItemReadListener timedItemReadListener38 = new com.bazoud.metrics.springbatch.timer.TimedItemReadListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder39 = timedItemReadListener38.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder40 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemReadListener38.setTimerHolder(timerHolder40);
        timedStepExecutionListener10.setTimerHolder(timerHolder40);
        timedStepExecutionListener0.setTimerHolder(timerHolder40);
        org.junit.Assert.assertNotNull(stepExecutionHolder3);
        org.junit.Assert.assertNotNull(stepExecutionHolder12);
        org.junit.Assert.assertNull(exitStatus15);
        org.junit.Assert.assertNotNull(stepExecutionHolder17);
        org.junit.Assert.assertNotNull(stepExecutionHolder21);
        org.junit.Assert.assertNotNull(stepExecutionHolder26);
        org.junit.Assert.assertNotNull(stepExecutionHolder30);
        org.junit.Assert.assertNotNull(stepExecutionHolder39);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener meteredStepExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredStepExecutionListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        meteredStepExecutionListener0.beforeStep(stepExecution1);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder3 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        meteredStepExecutionListener0.setMeterHolder(meterHolder3);
        org.springframework.batch.core.StepExecution stepExecution5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.batch.core.ExitStatus exitStatus6 = meteredStepExecutionListener0.afterStep(stepExecution5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener2 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution3 = null;
        org.springframework.batch.core.ExitStatus exitStatus4 = timedItemProcessListener2.afterStep(stepExecution3);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener5 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder6 = timedItemProcessListener5.getStepExecutionHolder();
        timedItemProcessListener2.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.setStepExecutionHolder(stepExecutionHolder6);
        timedItemProcessListener0.beforeProcess((java.lang.Object) 10.0d);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener11 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder12 = timedItemWriteListener11.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder13 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener11.setTimerHolder(timerHolder13);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener15 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution16 = null;
        org.springframework.batch.core.ExitStatus exitStatus17 = timedItemProcessListener15.afterStep(stepExecution16);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener18 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder19 = timedItemProcessListener18.getStepExecutionHolder();
        timedItemProcessListener15.setStepExecutionHolder(stepExecutionHolder19);
        timedItemWriteListener11.setStepExecutionHolder(stepExecutionHolder19);
        timedItemProcessListener0.afterProcess((java.lang.Object) timedItemWriteListener11, (java.lang.Object) 10.0f);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener24 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution25 = null;
        org.springframework.batch.core.ExitStatus exitStatus26 = timedItemProcessListener24.afterStep(stepExecution25);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener27 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder28 = timedItemProcessListener27.getStepExecutionHolder();
        timedItemProcessListener24.setStepExecutionHolder(stepExecutionHolder28);
        timedItemWriteListener11.setStepExecutionHolder(stepExecutionHolder28);
        com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener timedJobExecutionListener31 = new com.bazoud.metrics.springbatch.timer.TimedJobExecutionListener();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener32 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder33 = timedItemWriteListener32.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder34 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener32.setTimerHolder(timerHolder34);
        timerHolder34.setGroup("metered");
        timedJobExecutionListener31.setTimerHolder(timerHolder34);
        timerHolder34.stop("", "timed", "metered");
        timerHolder34.setGroup("write");
        timedItemWriteListener11.setTimerHolder(timerHolder34);
        java.util.List list46 = null;
        timedItemWriteListener11.afterWrite(list46);
        org.springframework.batch.core.StepExecution stepExecution48 = null;
        org.springframework.batch.core.ExitStatus exitStatus49 = timedItemWriteListener11.afterStep(stepExecution48);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNull(exitStatus4);
        org.junit.Assert.assertNotNull(stepExecutionHolder6);
        org.junit.Assert.assertNotNull(stepExecutionHolder12);
        org.junit.Assert.assertNull(exitStatus17);
        org.junit.Assert.assertNotNull(stepExecutionHolder19);
        org.junit.Assert.assertNull(exitStatus26);
        org.junit.Assert.assertNotNull(stepExecutionHolder28);
        org.junit.Assert.assertNotNull(stepExecutionHolder33);
        org.junit.Assert.assertNull(exitStatus49);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemProcessListener0.getStepExecutionHolder();
        org.springframework.batch.core.StepExecution stepExecution3 = stepExecutionHolder2.getCurrent();
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
        org.junit.Assert.assertNull(stepExecution3);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener0 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder1 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder2 = timedItemProcessListener0.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener3 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder4 = timedItemWriteListener3.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder5 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener3.setTimerHolder(timerHolder5);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener7 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution8 = null;
        org.springframework.batch.core.ExitStatus exitStatus9 = timedItemProcessListener7.afterStep(stepExecution8);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener10 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder11 = timedItemProcessListener10.getStepExecutionHolder();
        timedItemProcessListener7.setStepExecutionHolder(stepExecutionHolder11);
        timedItemWriteListener3.setStepExecutionHolder(stepExecutionHolder11);
        java.util.List list14 = null;
        timedItemWriteListener3.afterWrite(list14);
        java.util.List list16 = null;
        timedItemWriteListener3.beforeWrite(list16);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener18 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder19 = timedItemProcessListener18.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener20 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution21 = null;
        org.springframework.batch.core.ExitStatus exitStatus22 = timedItemProcessListener20.afterStep(stepExecution21);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener23 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder24 = timedItemProcessListener23.getStepExecutionHolder();
        timedItemProcessListener20.setStepExecutionHolder(stepExecutionHolder24);
        timedItemProcessListener18.setStepExecutionHolder(stepExecutionHolder24);
        timedItemProcessListener18.beforeProcess((java.lang.Object) 10.0d);
        com.bazoud.metrics.springbatch.timer.TimedItemWriteListener timedItemWriteListener29 = new com.bazoud.metrics.springbatch.timer.TimedItemWriteListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder30 = timedItemWriteListener29.getStepExecutionHolder();
        com.bazoud.metrics.springbatch.timer.TimerHolder timerHolder31 = new com.bazoud.metrics.springbatch.timer.TimerHolder();
        timedItemWriteListener29.setTimerHolder(timerHolder31);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener33 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution34 = null;
        org.springframework.batch.core.ExitStatus exitStatus35 = timedItemProcessListener33.afterStep(stepExecution34);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener36 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder37 = timedItemProcessListener36.getStepExecutionHolder();
        timedItemProcessListener33.setStepExecutionHolder(stepExecutionHolder37);
        timedItemWriteListener29.setStepExecutionHolder(stepExecutionHolder37);
        timedItemProcessListener18.afterProcess((java.lang.Object) timedItemWriteListener29, (java.lang.Object) 10.0f);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener42 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        org.springframework.batch.core.StepExecution stepExecution43 = null;
        org.springframework.batch.core.ExitStatus exitStatus44 = timedItemProcessListener42.afterStep(stepExecution43);
        com.bazoud.metrics.springbatch.timer.TimedItemProcessListener timedItemProcessListener45 = new com.bazoud.metrics.springbatch.timer.TimedItemProcessListener();
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder46 = timedItemProcessListener45.getStepExecutionHolder();
        timedItemProcessListener42.setStepExecutionHolder(stepExecutionHolder46);
        timedItemWriteListener29.setStepExecutionHolder(stepExecutionHolder46);
        timedItemProcessListener0.afterProcess((java.lang.Object) timedItemWriteListener3, (java.lang.Object) stepExecutionHolder46);
        java.lang.Object obj50 = null;
        java.lang.Exception exception51 = null;
        timedItemProcessListener0.onProcessError(obj50, exception51);
        org.junit.Assert.assertNotNull(stepExecutionHolder1);
        org.junit.Assert.assertNotNull(stepExecutionHolder2);
        org.junit.Assert.assertNotNull(stepExecutionHolder4);
        org.junit.Assert.assertNull(exitStatus9);
        org.junit.Assert.assertNotNull(stepExecutionHolder11);
        org.junit.Assert.assertNotNull(stepExecutionHolder19);
        org.junit.Assert.assertNull(exitStatus22);
        org.junit.Assert.assertNotNull(stepExecutionHolder24);
        org.junit.Assert.assertNotNull(stepExecutionHolder30);
        org.junit.Assert.assertNull(exitStatus35);
        org.junit.Assert.assertNotNull(stepExecutionHolder37);
        org.junit.Assert.assertNull(exitStatus44);
        org.junit.Assert.assertNotNull(stepExecutionHolder46);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.bazoud.metrics.springbatch.timer.TimedChunkListener timedChunkListener0 = new com.bazoud.metrics.springbatch.timer.TimedChunkListener();
        org.springframework.batch.core.StepExecution stepExecution1 = null;
        org.springframework.batch.core.ExitStatus exitStatus2 = timedChunkListener0.afterStep(stepExecution1);
        com.bazoud.metrics.springbatch.timer.StepExecutionHolder stepExecutionHolder3 = timedChunkListener0.getStepExecutionHolder();
        org.springframework.batch.core.scope.context.ChunkContext chunkContext4 = null;
        timedChunkListener0.beforeChunk(chunkContext4);
        org.springframework.batch.core.scope.context.ChunkContext chunkContext6 = null;
        timedChunkListener0.afterChunkError(chunkContext6);
        org.springframework.batch.core.StepExecution stepExecution8 = null;
        org.springframework.batch.core.ExitStatus exitStatus9 = timedChunkListener0.afterStep(stepExecution8);
        org.junit.Assert.assertNull(exitStatus2);
        org.junit.Assert.assertNotNull(stepExecutionHolder3);
        org.junit.Assert.assertNull(exitStatus9);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener0 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution1 = null;
        meteredJobExecutionListener0.beforeJob(jobExecution1);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener3 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution4 = null;
        meteredJobExecutionListener3.beforeJob(jobExecution4);
        org.springframework.batch.core.JobExecution jobExecution6 = null;
        meteredJobExecutionListener3.beforeJob(jobExecution6);
        com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener meteredJobExecutionListener8 = new com.bazoud.metrics.springbatch.meter.MeteredJobExecutionListener();
        org.springframework.batch.core.JobExecution jobExecution9 = null;
        meteredJobExecutionListener8.beforeJob(jobExecution9);
        com.bazoud.metrics.springbatch.meter.MeterHolder meterHolder11 = new com.bazoud.metrics.springbatch.meter.MeterHolder();
        com.codahale.metrics.MetricRegistry metricRegistry12 = null;
        meterHolder11.setMetricRegistry(metricRegistry12);
        meteredJobExecutionListener8.setMeterHolder(meterHolder11);
        meterHolder11.setGroup("metered");
        meteredJobExecutionListener3.setMeterHolder(meterHolder11);
        meteredJobExecutionListener0.setMeterHolder(meterHolder11);
        org.springframework.batch.core.JobExecution jobExecution19 = null;
        // The following exception was thrown during execution in test generation
        try {
            meteredJobExecutionListener0.afterJob(jobExecution19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

