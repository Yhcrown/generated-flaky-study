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
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.SchedulerProcess schedulerProcess1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.amlinv.javasched.SchedulerProcessExecutionSlip schedulerProcessExecutionSlip2 = roundRobinScheduler0.startProcess(schedulerProcess1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory0 = new com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        int int0 = com.amlinv.javasched.impl.StandardBlockingSchedulerEngine.DEFAULT_MAXIMUM_PROCESSORS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000 + "'", int0 == 1000);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine1 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(0);
        // The following exception was thrown during execution in test generation
        try {
            standardNonBlockingSchedulerEngine1.initiateShutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        // The following exception was thrown during execution in test generation
        try {
            processStepExecutionSlip2.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine1 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(0);
        int int2 = standardNonBlockingSchedulerEngine1.getProcessorCount();
        // The following exception was thrown during execution in test generation
        try {
            standardNonBlockingSchedulerEngine1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: processor count must be positive");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory1 = roundRobinScheduler0.getStepExecutionSlipFactory();
        com.amlinv.javasched.Step step2 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener3 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip4 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step2, processStepExecutionListener3);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess6 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step2, false);
        // The following exception was thrown during execution in test generation
        try {
            com.amlinv.javasched.SchedulerProcessExecutionSlip schedulerProcessExecutionSlip7 = roundRobinScheduler0.startProcess((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine1 = null;
        roundRobinScheduler0.setBlockingEngine(blockingSchedulerEngine1);
        java.lang.Class<?> wildcardClass3 = roundRobinScheduler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        com.amlinv.javasched.SchedulerProcess schedulerProcess0 = null;
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip1 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip(schedulerProcess0);
        standardProcessExecutionSlip1.processStopped();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess5 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, false, 0L, 0L);
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener10 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip11 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip((com.amlinv.javasched.Step) processStepExecutionSlip2, processStepExecutionListener10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = processStepExecutionSlip2.isBlocking();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory1 = roundRobinScheduler0.getStepExecutionSlipFactory();
        com.amlinv.javasched.Step step2 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener3 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip4 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step2, processStepExecutionListener3);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess7 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip4, (long) '4', (long) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.amlinv.javasched.SchedulerProcessExecutionSlip schedulerProcessExecutionSlip8 = roundRobinScheduler0.startProcess((com.amlinv.javasched.SchedulerProcess) rateLimitedSingleRepeatingStepProcess7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = processStepExecutionSlip2.isBlocking();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess5 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, false, 0L, 0L);
        com.amlinv.javasched.Step step10 = rateLimitedSingleRepeatingStepProcess9.getNextStep();
        // The following exception was thrown during execution in test generation
        try {
            step10.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(step10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess4 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step0, true);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip5 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess4);
        standardProcessExecutionSlip5.waitUntilComplete(100L, (long) (byte) 1);
        boolean boolean9 = standardProcessExecutionSlip5.isRunnable();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine1 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(0);
        org.slf4j.Logger logger2 = null;
        standardNonBlockingSchedulerEngine1.setLog(logger2);
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler4 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory5 = roundRobinScheduler4.getStepExecutionSlipFactory();
        com.amlinv.javasched.Step step6 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener7 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip8 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step6, processStepExecutionListener7);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess11 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip8, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess15 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip8, false, 0L, 0L);
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener16 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip17 = processStepExecutionSlipFactory5.createProcessStepExecutionSlip((com.amlinv.javasched.Step) processStepExecutionSlip8, processStepExecutionListener16);
        // The following exception was thrown during execution in test generation
        try {
            standardNonBlockingSchedulerEngine1.submit((com.amlinv.javasched.Step) processStepExecutionSlip17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory5);
        org.junit.Assert.assertNotNull(processStepExecutionSlip17);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess5 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, false, 0L, 0L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = processStepExecutionSlip2.isBlocking();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine1 = null;
        roundRobinScheduler0.setBlockingEngine(blockingSchedulerEngine1);
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler3 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine4 = null;
        roundRobinScheduler3.setBlockingEngine(blockingSchedulerEngine4);
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory6 = roundRobinScheduler3.getStepExecutionSlipFactory();
        roundRobinScheduler0.setStepExecutionSlipFactory(processStepExecutionSlipFactory6);
        com.amlinv.javasched.Step step8 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener9 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip10 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step8, processStepExecutionListener9);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess13 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip10, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess17 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip10, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess17.setRepeatOnlyWhenSignalled(false);
        // The following exception was thrown during execution in test generation
        try {
            com.amlinv.javasched.SchedulerProcessExecutionSlip schedulerProcessExecutionSlip20 = roundRobinScheduler0.startProcess((com.amlinv.javasched.SchedulerProcess) rateLimitedSingleRepeatingStepProcess17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine1 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(0);
        int int2 = standardNonBlockingSchedulerEngine1.getProcessorCount();
        int int3 = standardNonBlockingSchedulerEngine1.getProcessorCount();
        com.amlinv.javasched.Step step4 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener5 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip6 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step4, processStepExecutionListener5);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip6, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess13 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip6, false, 0L, 0L);
        com.amlinv.javasched.Step step14 = rateLimitedSingleRepeatingStepProcess13.getNextStep();
        // The following exception was thrown during execution in test generation
        try {
            standardNonBlockingSchedulerEngine1.submit(step14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(step14);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory1 = roundRobinScheduler0.getStepExecutionSlipFactory();
        java.lang.Class<?> wildcardClass2 = processStepExecutionSlipFactory1.getClass();
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory1 = roundRobinScheduler0.getStepExecutionSlipFactory();
        com.amlinv.javasched.Step step2 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener3 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip4 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step2, processStepExecutionListener3);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess7 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip4, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess11 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip4, false, 0L, 0L);
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener12 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip13 = processStepExecutionSlipFactory1.createProcessStepExecutionSlip((com.amlinv.javasched.Step) processStepExecutionSlip4, processStepExecutionListener12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = processStepExecutionSlip4.isBlocking();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory1);
        org.junit.Assert.assertNotNull(processStepExecutionSlip13);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine1 = null;
        roundRobinScheduler0.setBlockingEngine(blockingSchedulerEngine1);
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory3 = roundRobinScheduler0.getStepExecutionSlipFactory();
        com.amlinv.javasched.NonBlockingSchedulerEngine nonBlockingSchedulerEngine4 = roundRobinScheduler0.getNonBlockingEngine();
        com.amlinv.javasched.Step step5 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener6 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip7 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step5, processStepExecutionListener6);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess10 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip7, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess14 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip7, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess14.setRepeatOnlyWhenSignalled(false);
        com.amlinv.javasched.Step step17 = rateLimitedSingleRepeatingStepProcess14.getNextStep();
        // The following exception was thrown during execution in test generation
        try {
            com.amlinv.javasched.SchedulerProcessExecutionSlip schedulerProcessExecutionSlip18 = roundRobinScheduler0.startProcess((com.amlinv.javasched.SchedulerProcess) rateLimitedSingleRepeatingStepProcess14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory3);
        org.junit.Assert.assertNotNull(nonBlockingSchedulerEngine4);
        org.junit.Assert.assertNotNull(step17);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine1 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(0);
        int int2 = standardNonBlockingSchedulerEngine1.getProcessorCount();
        // The following exception was thrown during execution in test generation
        try {
            standardNonBlockingSchedulerEngine1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: processor count must be positive");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.amlinv.javasched.SchedulerProcess schedulerProcess0 = null;
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip1 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip(schedulerProcess0);
        standardProcessExecutionSlip1.processStarted();
        com.amlinv.javasched.SchedulerProcess schedulerProcess3 = standardProcessExecutionSlip1.getSchedulerProcess();
        org.junit.Assert.assertNull(schedulerProcess3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        long long1 = standardBlockingSchedulerEngine0.getMaxThreadIdleTime();
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            standardBlockingSchedulerEngine0.setMaxThreadIdleTime((long) (byte) 1, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        com.amlinv.javasched.SchedulerProcess schedulerProcess0 = null;
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip1 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip(schedulerProcess0);
        com.amlinv.javasched.SchedulerProcess schedulerProcess2 = standardProcessExecutionSlip1.getSchedulerProcess();
        com.amlinv.javasched.SchedulerProcess schedulerProcess3 = standardProcessExecutionSlip1.getSchedulerProcess();
        standardProcessExecutionSlip1.waitUntilComplete((long) 10, (long) (-1));
        standardProcessExecutionSlip1.waitUntilComplete(1L, 0L);
        com.amlinv.javasched.SchedulerProcess schedulerProcess10 = standardProcessExecutionSlip1.getSchedulerProcess();
        org.junit.Assert.assertNull(schedulerProcess2);
        org.junit.Assert.assertNull(schedulerProcess3);
        org.junit.Assert.assertNull(schedulerProcess10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine1 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(100);
        // The following exception was thrown during execution in test generation
        try {
            standardNonBlockingSchedulerEngine1.initiateShutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        long long1 = standardBlockingSchedulerEngine0.getMaxThreadIdleTime();
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            standardBlockingSchedulerEngine0.setMaxThreadIdleTime((long) (byte) 10, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        int int1 = standardBlockingSchedulerEngine0.getNumStartedThread();
        int int2 = standardBlockingSchedulerEngine0.getMaximumProcessors();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1000 + "'", int2 == 1000);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine1 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(0);
        int int2 = standardNonBlockingSchedulerEngine1.getProcessorCount();
        int int3 = standardNonBlockingSchedulerEngine1.getProcessorCount();
        // The following exception was thrown during execution in test generation
        try {
            standardNonBlockingSchedulerEngine1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: processor count must be positive");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess5 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, false, 0L, 0L);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess10 = new com.amlinv.javasched.process.SingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine1 = null;
        roundRobinScheduler0.setBlockingEngine(blockingSchedulerEngine1);
        // The following exception was thrown during execution in test generation
        try {
            roundRobinScheduler0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        com.amlinv.javasched.Step step1 = stepListSchedulerProcess0.getNextStep();
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip2 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) stepListSchedulerProcess0);
        org.junit.Assert.assertNotNull(step1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        standardBlockingSchedulerEngine0.setMaximumProcessors((int) (byte) -1);
        int int3 = standardBlockingSchedulerEngine0.getNumIdleThread();
        org.slf4j.Logger logger4 = standardBlockingSchedulerEngine0.getLog();
        com.amlinv.javasched.Step step5 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener6 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip7 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step5, processStepExecutionListener6);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess10 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip7, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess14 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip7, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess14.setRepeatOnlyWhenSignalled(false);
        com.amlinv.javasched.Step step17 = rateLimitedSingleRepeatingStepProcess14.getNextStep();
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess19 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step17, true);
        // The following exception was thrown during execution in test generation
        try {
            standardBlockingSchedulerEngine0.submit(step17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertNotNull(step17);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory1 = roundRobinScheduler0.getStepExecutionSlipFactory();
        com.amlinv.javasched.Step step2 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener3 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip4 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step2, processStepExecutionListener3);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess7 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip4, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess11 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip4, false, 0L, 0L);
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener12 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip13 = processStepExecutionSlipFactory1.createProcessStepExecutionSlip((com.amlinv.javasched.Step) processStepExecutionSlip4, processStepExecutionListener12);
        // The following exception was thrown during execution in test generation
        try {
            processStepExecutionSlip13.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory1);
        org.junit.Assert.assertNotNull(processStepExecutionSlip13);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        long long1 = standardBlockingSchedulerEngine0.getMaxThreadIdleTime();
        standardBlockingSchedulerEngine0.setMaximumProcessors((int) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.Step step1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener2 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip3 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step1, processStepExecutionListener2);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess6 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip3, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess10 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip3, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess10.setRepeatOnlyWhenSignalled(false);
        com.amlinv.javasched.Step step13 = rateLimitedSingleRepeatingStepProcess10.getNextStep();
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess15 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step13, true);
        singleRepeatingStepProcess15.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            com.amlinv.javasched.SchedulerProcessExecutionSlip schedulerProcessExecutionSlip17 = roundRobinScheduler0.startProcess((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(step13);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess5 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess9.setRepeatOnlyWhenSignalled(false);
        com.amlinv.javasched.Step step12 = rateLimitedSingleRepeatingStepProcess9.getNextStep();
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess13 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step12);
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener14 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip15 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step12, processStepExecutionListener14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = processStepExecutionSlip15.isBlocking();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(step12);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        com.amlinv.javasched.SchedulerProcess schedulerProcess0 = null;
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip1 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip(schedulerProcess0);
        com.amlinv.javasched.SchedulerProcess schedulerProcess2 = standardProcessExecutionSlip1.getSchedulerProcess();
        com.amlinv.javasched.SchedulerProcess schedulerProcess3 = standardProcessExecutionSlip1.getSchedulerProcess();
        standardProcessExecutionSlip1.waitUntilComplete((long) 10, (long) (-1));
        boolean boolean7 = standardProcessExecutionSlip1.isRunnable();
        org.junit.Assert.assertNull(schedulerProcess2);
        org.junit.Assert.assertNull(schedulerProcess3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory1 = roundRobinScheduler0.getStepExecutionSlipFactory();
        roundRobinScheduler0.start();
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess3 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean4 = stepListSchedulerProcess3.isAutoStop();
        int int5 = stepListSchedulerProcess3.getPendingStepCount();
        com.amlinv.javasched.Step step6 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener7 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip8 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step6, processStepExecutionListener7);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess11 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip8, (long) '4', (long) 100);
        stepListSchedulerProcess3.addStep((com.amlinv.javasched.Step) processStepExecutionSlip8);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip13 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) stepListSchedulerProcess3);
        // The following exception was thrown during execution in test generation
        try {
            com.amlinv.javasched.SchedulerProcessExecutionSlip schedulerProcessExecutionSlip14 = roundRobinScheduler0.startProcess((com.amlinv.javasched.SchedulerProcess) stepListSchedulerProcess3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess5 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess9.setRepeatOnlyWhenSignalled(false);
        com.amlinv.javasched.Step step12 = rateLimitedSingleRepeatingStepProcess9.getNextStep();
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess14 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step12, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = step12.isBlocking();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(step12);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory standardProcessExecutionSlipFactory0 = new com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory();
        com.amlinv.javasched.Step step1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener2 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip3 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step1, processStepExecutionListener2);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess5 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step1, false);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip6 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess5);
        boolean boolean7 = standardProcessExecutionSlip6.isRunnable();
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.amlinv.javasched.SchedulerProcess schedulerProcess0 = null;
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip1 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip(schedulerProcess0);
        com.amlinv.javasched.SchedulerProcess schedulerProcess2 = standardProcessExecutionSlip1.getSchedulerProcess();
        standardProcessExecutionSlip1.waitUntilComplete((-1L), (long) '#');
        boolean boolean6 = standardProcessExecutionSlip1.isRunnable();
        standardProcessExecutionSlip1.processStarted();
        standardProcessExecutionSlip1.waitUntilComplete((long) (short) 0, (long) (byte) -1);
        org.junit.Assert.assertNull(schedulerProcess2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        int int1 = standardBlockingSchedulerEngine0.getNumStartedThread();
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            standardBlockingSchedulerEngine0.setMaxThreadIdleTime((long) 1000, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess4 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step0, true);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip5 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess4);
        com.amlinv.javasched.SchedulerProcess schedulerProcess6 = standardProcessExecutionSlip5.getSchedulerProcess();
        standardProcessExecutionSlip5.waitUntilComplete((long) 'a', (long) 10);
        org.junit.Assert.assertNotNull(schedulerProcess6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory1 = roundRobinScheduler0.getStepExecutionSlipFactory();
        roundRobinScheduler0.start();
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine3 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        long long4 = standardBlockingSchedulerEngine3.getMaxThreadIdleTime();
        roundRobinScheduler0.setBlockingEngine((com.amlinv.javasched.BlockingSchedulerEngine) standardBlockingSchedulerEngine3);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        long long1 = standardBlockingSchedulerEngine0.getMaxThreadIdleTime();
        int int2 = standardBlockingSchedulerEngine0.getNumStartedThread();
        standardBlockingSchedulerEngine0.setMaximumProcessors((int) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine2 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(10);
        org.slf4j.Logger logger3 = standardNonBlockingSchedulerEngine2.getLog();
        standardBlockingSchedulerEngine0.setLog(logger3);
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine5 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        standardBlockingSchedulerEngine5.setMaximumProcessors((int) (byte) -1);
        int int8 = standardBlockingSchedulerEngine5.getNumIdleThread();
        org.slf4j.Logger logger9 = standardBlockingSchedulerEngine5.getLog();
        standardBlockingSchedulerEngine0.setLog(logger9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            standardBlockingSchedulerEngine0.setMaxThreadIdleTime(10L, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(logger9);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean1 = stepListSchedulerProcess0.isAutoStop();
        com.amlinv.javasched.Step step2 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener3 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip4 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step2, processStepExecutionListener3);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess7 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip4, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess11 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip4, false, 0L, 0L);
        stepListSchedulerProcess0.addStep((com.amlinv.javasched.Step) processStepExecutionSlip4);
        int int13 = stepListSchedulerProcess0.getPendingStepCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine1 = null;
        roundRobinScheduler0.setBlockingEngine(blockingSchedulerEngine1);
        com.amlinv.javasched.Step step3 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener4 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip5 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step3, processStepExecutionListener4);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess7 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step3, true);
        // The following exception was thrown during execution in test generation
        try {
            com.amlinv.javasched.SchedulerProcessExecutionSlip schedulerProcessExecutionSlip8 = roundRobinScheduler0.startProcess((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory1 = roundRobinScheduler0.getStepExecutionSlipFactory();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine3 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine((int) (short) 10);
        roundRobinScheduler0.setNonBlockingEngine((com.amlinv.javasched.NonBlockingSchedulerEngine) standardNonBlockingSchedulerEngine3);
        int int5 = standardNonBlockingSchedulerEngine3.getProcessorCount();
        standardNonBlockingSchedulerEngine3.start();
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine1 = null;
        roundRobinScheduler0.setBlockingEngine(blockingSchedulerEngine1);
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory3 = roundRobinScheduler0.getStepExecutionSlipFactory();
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler4 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine5 = null;
        roundRobinScheduler4.setBlockingEngine(blockingSchedulerEngine5);
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory7 = roundRobinScheduler4.getStepExecutionSlipFactory();
        com.amlinv.javasched.Step step8 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener9 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip10 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step8, processStepExecutionListener9);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess13 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip10, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess17 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip10, false, 0L, 0L);
        com.amlinv.javasched.Step step18 = rateLimitedSingleRepeatingStepProcess17.getNextStep();
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener19 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip20 = processStepExecutionSlipFactory7.createProcessStepExecutionSlip(step18, processStepExecutionListener19);
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener21 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip22 = processStepExecutionSlipFactory3.createProcessStepExecutionSlip((com.amlinv.javasched.Step) processStepExecutionSlip20, processStepExecutionListener21);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory3);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory7);
        org.junit.Assert.assertNotNull(step18);
        org.junit.Assert.assertNotNull(processStepExecutionSlip20);
        org.junit.Assert.assertNotNull(processStepExecutionSlip22);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess5 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, false, 0L, 0L);
        // The following exception was thrown during execution in test generation
        try {
            processStepExecutionSlip2.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine1 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine((int) (byte) 1);
        int int2 = standardNonBlockingSchedulerEngine1.getProcessorCount();
        // The following exception was thrown during execution in test generation
        try {
            standardNonBlockingSchedulerEngine1.initiateShutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess4 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step0, true);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip5 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess4);
        com.amlinv.javasched.SchedulerProcess schedulerProcess6 = standardProcessExecutionSlip5.getSchedulerProcess();
        standardProcessExecutionSlip5.waitUntilComplete((long) '4', (long) (short) 1);
        org.junit.Assert.assertNotNull(schedulerProcess6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess5 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, false, 0L, 0L);
        // The following exception was thrown during execution in test generation
        try {
            processStepExecutionSlip2.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine1 = null;
        roundRobinScheduler0.setBlockingEngine(blockingSchedulerEngine1);
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory3 = roundRobinScheduler0.getStepExecutionSlipFactory();
        com.amlinv.javasched.NonBlockingSchedulerEngine nonBlockingSchedulerEngine4 = roundRobinScheduler0.getNonBlockingEngine();
        // The following exception was thrown during execution in test generation
        try {
            roundRobinScheduler0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory3);
        org.junit.Assert.assertNotNull(nonBlockingSchedulerEngine4);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean1 = stepListSchedulerProcess0.isAutoStop();
        int int2 = stepListSchedulerProcess0.getPendingStepCount();
        com.amlinv.javasched.Step step3 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener4 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip5 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step3, processStepExecutionListener4);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess8 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip5, (long) '4', (long) 100);
        stepListSchedulerProcess0.addStep((com.amlinv.javasched.Step) processStepExecutionSlip5);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess10 = new com.amlinv.javasched.process.SingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine();
        standardNonBlockingSchedulerEngine0.start();
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess2 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean3 = stepListSchedulerProcess2.isAutoStop();
        com.amlinv.javasched.Step step4 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener5 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip6 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step4, processStepExecutionListener5);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip6, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess13 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip6, false, 0L, 0L);
        stepListSchedulerProcess2.addStep((com.amlinv.javasched.Step) processStepExecutionSlip6);
        standardNonBlockingSchedulerEngine0.submit((com.amlinv.javasched.Step) processStepExecutionSlip6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = processStepExecutionSlip6.isBlocking();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine1 = roundRobinScheduler0.getBlockingEngine();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine3 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(10);
        org.slf4j.Logger logger4 = standardNonBlockingSchedulerEngine3.getLog();
        roundRobinScheduler0.setNonBlockingEngine((com.amlinv.javasched.NonBlockingSchedulerEngine) standardNonBlockingSchedulerEngine3);
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess6 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean7 = stepListSchedulerProcess6.isAutoStop();
        int int8 = stepListSchedulerProcess6.getPendingStepCount();
        com.amlinv.javasched.Step step9 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener10 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip11 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step9, processStepExecutionListener10);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess14 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip11, (long) '4', (long) 100);
        stepListSchedulerProcess6.addStep((com.amlinv.javasched.Step) processStepExecutionSlip11);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip16 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) stepListSchedulerProcess6);
        com.amlinv.javasched.Step step17 = stepListSchedulerProcess6.getNextStep();
        // The following exception was thrown during execution in test generation
        try {
            com.amlinv.javasched.SchedulerProcessExecutionSlip schedulerProcessExecutionSlip18 = roundRobinScheduler0.startProcess((com.amlinv.javasched.SchedulerProcess) stepListSchedulerProcess6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(blockingSchedulerEngine1);
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(step17);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine1 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(0);
        org.slf4j.Logger logger2 = standardNonBlockingSchedulerEngine1.getLog();
        org.junit.Assert.assertNotNull(logger2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine1 = null;
        roundRobinScheduler0.setBlockingEngine(blockingSchedulerEngine1);
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler3 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine4 = null;
        roundRobinScheduler3.setBlockingEngine(blockingSchedulerEngine4);
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory6 = roundRobinScheduler3.getStepExecutionSlipFactory();
        roundRobinScheduler0.setStepExecutionSlipFactory(processStepExecutionSlipFactory6);
        com.amlinv.javasched.Step step8 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener9 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip10 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step8, processStepExecutionListener9);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess13 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip10, (long) '4', (long) 100);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip14 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) rateLimitedSingleRepeatingStepProcess13);
        // The following exception was thrown during execution in test generation
        try {
            com.amlinv.javasched.SchedulerProcessExecutionSlip schedulerProcessExecutionSlip15 = roundRobinScheduler0.startProcess((com.amlinv.javasched.SchedulerProcess) rateLimitedSingleRepeatingStepProcess13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory6);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine1 = null;
        roundRobinScheduler0.setBlockingEngine(blockingSchedulerEngine1);
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory3 = roundRobinScheduler0.getStepExecutionSlipFactory();
        com.amlinv.javasched.NonBlockingSchedulerEngine nonBlockingSchedulerEngine4 = roundRobinScheduler0.getNonBlockingEngine();
        // The following exception was thrown during execution in test generation
        try {
            roundRobinScheduler0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory3);
        org.junit.Assert.assertNotNull(nonBlockingSchedulerEngine4);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean1 = stepListSchedulerProcess0.isAutoStop();
        boolean boolean2 = stepListSchedulerProcess0.isAutoStop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine1 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(100);
        int int2 = standardNonBlockingSchedulerEngine1.getProcessorCount();
        com.amlinv.javasched.Step step3 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener4 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip5 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step3, processStepExecutionListener4);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess8 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip5, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess12 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip5, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess12.setRepeatOnlyWhenSignalled(false);
        com.amlinv.javasched.Step step15 = rateLimitedSingleRepeatingStepProcess12.getNextStep();
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess16 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step15);
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener17 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip18 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step15, processStepExecutionListener17);
        // The following exception was thrown during execution in test generation
        try {
            standardNonBlockingSchedulerEngine1.submit((com.amlinv.javasched.Step) processStepExecutionSlip18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(step15);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        standardBlockingSchedulerEngine0.setMaximumProcessors((int) (byte) -1);
        int int3 = standardBlockingSchedulerEngine0.getNumIdleThread();
        org.slf4j.Logger logger4 = standardBlockingSchedulerEngine0.getLog();
        // The following exception was thrown during execution in test generation
        try {
            standardBlockingSchedulerEngine0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: scheduler engine needs a positive number of processors to start");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(logger4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess5 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, (long) '4', (long) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = processStepExecutionSlip2.isBlocking();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory1 = roundRobinScheduler0.getStepExecutionSlipFactory();
        java.util.List<com.amlinv.javasched.SchedulerProcess> schedulerProcessList2 = roundRobinScheduler0.getProcessList();
        com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory standardProcessExecutionSlipFactory3 = new com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory();
        com.amlinv.javasched.Step step4 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener5 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip6 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step4, processStepExecutionListener5);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess8 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step4, false);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip9 = standardProcessExecutionSlipFactory3.createSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess8);
        // The following exception was thrown during execution in test generation
        try {
            com.amlinv.javasched.SchedulerProcessExecutionSlip schedulerProcessExecutionSlip10 = roundRobinScheduler0.startProcess((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory1);
        org.junit.Assert.assertNotNull(schedulerProcessList2);
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip9);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        long long1 = standardBlockingSchedulerEngine0.getMaxThreadIdleTime();
        org.slf4j.Logger logger2 = standardBlockingSchedulerEngine0.getLog();
        org.slf4j.Logger logger3 = standardBlockingSchedulerEngine0.getLog();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(logger3);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean1 = stepListSchedulerProcess0.isAutoStop();
        int int2 = stepListSchedulerProcess0.getPendingStepCount();
        com.amlinv.javasched.Step step3 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener4 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip5 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step3, processStepExecutionListener4);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess8 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip5, (long) '4', (long) 100);
        stepListSchedulerProcess0.addStep((com.amlinv.javasched.Step) processStepExecutionSlip5);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip10 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) stepListSchedulerProcess0);
        com.amlinv.javasched.Step step11 = stepListSchedulerProcess0.getNextStep();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = step11.isBlocking();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(step11);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess5 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, false, 0L, 0L);
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener10 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip11 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip((com.amlinv.javasched.Step) processStepExecutionSlip2, processStepExecutionListener10);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess15 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, false, 0L, (long) '#');
        // The following exception was thrown during execution in test generation
        try {
            processStepExecutionSlip2.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory1 = roundRobinScheduler0.getStepExecutionSlipFactory();
        java.util.List<com.amlinv.javasched.SchedulerProcess> schedulerProcessList2 = roundRobinScheduler0.getProcessList();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine3 = roundRobinScheduler0.getBlockingEngine();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine4 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine();
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine5 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine7 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(10);
        org.slf4j.Logger logger8 = standardNonBlockingSchedulerEngine7.getLog();
        standardBlockingSchedulerEngine5.setLog(logger8);
        standardNonBlockingSchedulerEngine4.setLog(logger8);
        roundRobinScheduler0.setNonBlockingEngine((com.amlinv.javasched.NonBlockingSchedulerEngine) standardNonBlockingSchedulerEngine4);
        standardNonBlockingSchedulerEngine4.setProcessorCount((int) (byte) 1);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory1);
        org.junit.Assert.assertNotNull(schedulerProcessList2);
        org.junit.Assert.assertNotNull(blockingSchedulerEngine3);
        org.junit.Assert.assertNotNull(logger8);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine1 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(10);
        org.slf4j.Logger logger2 = standardNonBlockingSchedulerEngine1.getLog();
        org.slf4j.Logger logger3 = standardNonBlockingSchedulerEngine1.getLog();
        com.amlinv.javasched.Step step4 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener5 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip6 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step4, processStepExecutionListener5);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip6, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess13 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip6, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess13.setRepeatOnlyWhenSignalled(false);
        com.amlinv.javasched.Step step16 = rateLimitedSingleRepeatingStepProcess13.getNextStep();
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess19 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess(step16, (long) (short) 10, (long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            standardNonBlockingSchedulerEngine1.submit(step16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(logger3);
        org.junit.Assert.assertNotNull(step16);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        stepListSchedulerProcess0.setAutoStop(false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.amlinv.javasched.SchedulerProcess schedulerProcess0 = null;
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip1 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip(schedulerProcess0);
        standardProcessExecutionSlip1.processStopped();
        com.amlinv.javasched.SchedulerProcess schedulerProcess3 = standardProcessExecutionSlip1.getSchedulerProcess();
        org.junit.Assert.assertNull(schedulerProcess3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        com.amlinv.javasched.SchedulerProcess schedulerProcess0 = null;
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip1 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip(schedulerProcess0);
        com.amlinv.javasched.SchedulerProcess schedulerProcess2 = standardProcessExecutionSlip1.getSchedulerProcess();
        com.amlinv.javasched.SchedulerProcess schedulerProcess3 = standardProcessExecutionSlip1.getSchedulerProcess();
        standardProcessExecutionSlip1.waitUntilComplete((long) (short) 0, (long) 'a');
        org.junit.Assert.assertNull(schedulerProcess2);
        org.junit.Assert.assertNull(schedulerProcess3);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory standardProcessExecutionSlipFactory0 = new com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory();
        com.amlinv.javasched.Step step1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener2 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip3 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step1, processStepExecutionListener2);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess5 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step1, false);
        singleRepeatingStepProcess5.signal();
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip7 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess5);
        com.amlinv.javasched.Step step8 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener9 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip10 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step8, processStepExecutionListener9);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess13 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip10, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess17 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip10, false, 0L, 0L);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip18 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) rateLimitedSingleRepeatingStepProcess17);
        standardProcessExecutionSlip18.processStopped();
        standardProcessExecutionSlip18.waitUntilComplete();
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip7);
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip18);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.amlinv.javasched.SchedulerProcess schedulerProcess0 = null;
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip1 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip(schedulerProcess0);
        com.amlinv.javasched.SchedulerProcess schedulerProcess2 = standardProcessExecutionSlip1.getSchedulerProcess();
        com.amlinv.javasched.SchedulerProcess schedulerProcess3 = standardProcessExecutionSlip1.getSchedulerProcess();
        standardProcessExecutionSlip1.waitUntilComplete((long) 10, (long) (-1));
        standardProcessExecutionSlip1.processStopped();
        standardProcessExecutionSlip1.waitUntilComplete();
        org.junit.Assert.assertNull(schedulerProcess2);
        org.junit.Assert.assertNull(schedulerProcess3);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess5 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess9.setRepeatOnlyWhenSignalled(false);
        com.amlinv.javasched.Step step12 = rateLimitedSingleRepeatingStepProcess9.getNextStep();
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess14 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step12, true);
        singleRepeatingStepProcess14.signal();
        org.junit.Assert.assertNotNull(step12);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory standardProcessExecutionSlipFactory0 = new com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory();
        com.amlinv.javasched.Step step1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener2 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip3 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step1, processStepExecutionListener2);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess5 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step1, false);
        singleRepeatingStepProcess5.signal();
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip7 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess5);
        com.amlinv.javasched.Step step8 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener9 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip10 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step8, processStepExecutionListener9);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess13 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip10, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess17 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip10, false, 0L, 0L);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip18 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) rateLimitedSingleRepeatingStepProcess17);
        standardProcessExecutionSlip18.waitUntilComplete(10L, (long) (short) -1);
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip7);
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip18);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory1 = roundRobinScheduler0.getStepExecutionSlipFactory();
        java.util.List<com.amlinv.javasched.SchedulerProcess> schedulerProcessList2 = roundRobinScheduler0.getProcessList();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine3 = roundRobinScheduler0.getBlockingEngine();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine4 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine();
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine5 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine7 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(10);
        org.slf4j.Logger logger8 = standardNonBlockingSchedulerEngine7.getLog();
        standardBlockingSchedulerEngine5.setLog(logger8);
        standardNonBlockingSchedulerEngine4.setLog(logger8);
        roundRobinScheduler0.setNonBlockingEngine((com.amlinv.javasched.NonBlockingSchedulerEngine) standardNonBlockingSchedulerEngine4);
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess12 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        com.amlinv.javasched.Step step13 = stepListSchedulerProcess12.getNextStep();
        // The following exception was thrown during execution in test generation
        try {
            standardNonBlockingSchedulerEngine4.submit(step13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory1);
        org.junit.Assert.assertNotNull(schedulerProcessList2);
        org.junit.Assert.assertNotNull(blockingSchedulerEngine3);
        org.junit.Assert.assertNotNull(logger8);
        org.junit.Assert.assertNotNull(step13);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine1 = roundRobinScheduler0.getBlockingEngine();
        roundRobinScheduler0.start();
        org.junit.Assert.assertNotNull(blockingSchedulerEngine1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.amlinv.javasched.SchedulerProcess schedulerProcess0 = null;
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip1 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip(schedulerProcess0);
        com.amlinv.javasched.SchedulerProcess schedulerProcess2 = standardProcessExecutionSlip1.getSchedulerProcess();
        standardProcessExecutionSlip1.waitUntilComplete((-1L), (long) '#');
        standardProcessExecutionSlip1.processStopped();
        standardProcessExecutionSlip1.waitUntilComplete();
        standardProcessExecutionSlip1.waitUntilComplete(10L, (long) (short) -1);
        org.junit.Assert.assertNull(schedulerProcess2);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess4 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step0, true);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip5 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess4);
        standardProcessExecutionSlip5.waitUntilComplete(100L, (long) (byte) 1);
        com.amlinv.javasched.SchedulerProcess schedulerProcess9 = standardProcessExecutionSlip5.getSchedulerProcess();
        com.amlinv.javasched.SchedulerProcess schedulerProcess10 = standardProcessExecutionSlip5.getSchedulerProcess();
        org.junit.Assert.assertNotNull(schedulerProcess9);
        org.junit.Assert.assertNotNull(schedulerProcess10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean1 = stepListSchedulerProcess0.isAutoStop();
        int int2 = stepListSchedulerProcess0.getPendingStepCount();
        com.amlinv.javasched.Step step3 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener4 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip5 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step3, processStepExecutionListener4);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess8 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip5, (long) '4', (long) 100);
        stepListSchedulerProcess0.addStep((com.amlinv.javasched.Step) processStepExecutionSlip5);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip10 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) stepListSchedulerProcess0);
        boolean boolean11 = stepListSchedulerProcess0.isStopped();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean1 = stepListSchedulerProcess0.isAutoStop();
        int int2 = stepListSchedulerProcess0.getPendingStepCount();
        com.amlinv.javasched.Step step3 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener4 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip5 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step3, processStepExecutionListener4);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess8 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip5, (long) '4', (long) 100);
        stepListSchedulerProcess0.addStep((com.amlinv.javasched.Step) processStepExecutionSlip5);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip10 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) stepListSchedulerProcess0);
        com.amlinv.javasched.Step step11 = stepListSchedulerProcess0.getNextStep();
        stepListSchedulerProcess0.shutdown();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine14 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(10);
        org.slf4j.Logger logger15 = standardNonBlockingSchedulerEngine14.getLog();
        stepListSchedulerProcess0.setLog(logger15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(step11);
        org.junit.Assert.assertNotNull(logger15);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        stepListSchedulerProcess0.shutdown();
        int int2 = stepListSchedulerProcess0.getPendingStepCount();
        boolean boolean3 = stepListSchedulerProcess0.isAutoStop();
        int int4 = stepListSchedulerProcess0.getPendingStepCount();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine6 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(10);
        org.slf4j.Logger logger7 = standardNonBlockingSchedulerEngine6.getLog();
        stepListSchedulerProcess0.setLog(logger7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(logger7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        standardBlockingSchedulerEngine0.start();
        int int2 = standardBlockingSchedulerEngine0.getNumStartedThread();
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            standardBlockingSchedulerEngine0.setMaxThreadIdleTime((long) 10, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory standardProcessExecutionSlipFactory0 = new com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory();
        com.amlinv.javasched.Step step1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener2 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip3 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step1, processStepExecutionListener2);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess5 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step1, false);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip6 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess5);
        com.amlinv.javasched.Step step7 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener8 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip9 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step7, processStepExecutionListener8);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess12 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip9, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess16 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip9, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess16.setRepeatOnlyWhenSignalled(false);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip19 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) rateLimitedSingleRepeatingStepProcess16);
        boolean boolean20 = rateLimitedSingleRepeatingStepProcess16.isRepeatOnlyWhenSignalled();
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip6);
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess5 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess9.setRepeatOnlyWhenSignalled(false);
        com.amlinv.javasched.Step step12 = rateLimitedSingleRepeatingStepProcess9.getNextStep();
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess13 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step12);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess16 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess(step12, (long) (short) 0, (-1L));
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip17 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) rateLimitedSingleRepeatingStepProcess16);
        org.junit.Assert.assertNotNull(step12);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean1 = stepListSchedulerProcess0.isAutoStop();
        int int2 = stepListSchedulerProcess0.getPendingStepCount();
        com.amlinv.javasched.Step step3 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener4 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip5 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step3, processStepExecutionListener4);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess8 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip5, (long) '4', (long) 100);
        stepListSchedulerProcess0.addStep((com.amlinv.javasched.Step) processStepExecutionSlip5);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip10 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) stepListSchedulerProcess0);
        com.amlinv.javasched.Step step11 = stepListSchedulerProcess0.getNextStep();
        stepListSchedulerProcess0.shutdown();
        stepListSchedulerProcess0.waitUntilFinished();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(step11);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess5 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, false, 0L, 0L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = processStepExecutionSlip2.isBlocking();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        long long1 = standardBlockingSchedulerEngine0.getMaxThreadIdleTime();
        org.slf4j.Logger logger2 = standardBlockingSchedulerEngine0.getLog();
        long long3 = standardBlockingSchedulerEngine0.getTotalStepsStarted();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine1 = roundRobinScheduler0.getBlockingEngine();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine3 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(10);
        org.slf4j.Logger logger4 = standardNonBlockingSchedulerEngine3.getLog();
        roundRobinScheduler0.setNonBlockingEngine((com.amlinv.javasched.NonBlockingSchedulerEngine) standardNonBlockingSchedulerEngine3);
        standardNonBlockingSchedulerEngine3.start();
        org.junit.Assert.assertNotNull(blockingSchedulerEngine1);
        org.junit.Assert.assertNotNull(logger4);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory1 = roundRobinScheduler0.getStepExecutionSlipFactory();
        java.util.List<com.amlinv.javasched.SchedulerProcess> schedulerProcessList2 = roundRobinScheduler0.getProcessList();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine3 = roundRobinScheduler0.getBlockingEngine();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory4 = roundRobinScheduler0.getStepExecutionSlipFactory();
        com.amlinv.javasched.Step step5 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener6 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip7 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step5, processStepExecutionListener6);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess10 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip7, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess14 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip7, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess14.setRepeatOnlyWhenSignalled(false);
        com.amlinv.javasched.Step step17 = rateLimitedSingleRepeatingStepProcess14.getNextStep();
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess18 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step17);
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener19 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip20 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step17, processStepExecutionListener19);
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener21 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip22 = processStepExecutionSlipFactory4.createProcessStepExecutionSlip((com.amlinv.javasched.Step) processStepExecutionSlip20, processStepExecutionListener21);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory1);
        org.junit.Assert.assertNotNull(schedulerProcessList2);
        org.junit.Assert.assertNotNull(blockingSchedulerEngine3);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory4);
        org.junit.Assert.assertNotNull(step17);
        org.junit.Assert.assertNotNull(processStepExecutionSlip22);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean1 = stepListSchedulerProcess0.isAutoStop();
        int int2 = stepListSchedulerProcess0.getPendingStepCount();
        com.amlinv.javasched.Step step3 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener4 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip5 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step3, processStepExecutionListener4);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess8 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip5, (long) '4', (long) 100);
        stepListSchedulerProcess0.addStep((com.amlinv.javasched.Step) processStepExecutionSlip5);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip10 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) stepListSchedulerProcess0);
        com.amlinv.javasched.Step step11 = stepListSchedulerProcess0.getNextStep();
        stepListSchedulerProcess0.shutdown();
        stepListSchedulerProcess0.shutdown();
        boolean boolean14 = stepListSchedulerProcess0.isAutoStop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(step11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine1 = null;
        roundRobinScheduler0.setBlockingEngine(blockingSchedulerEngine1);
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory3 = roundRobinScheduler0.getStepExecutionSlipFactory();
        com.amlinv.javasched.NonBlockingSchedulerEngine nonBlockingSchedulerEngine4 = roundRobinScheduler0.getNonBlockingEngine();
        com.amlinv.javasched.NonBlockingSchedulerEngine nonBlockingSchedulerEngine5 = roundRobinScheduler0.getNonBlockingEngine();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine6 = roundRobinScheduler0.getBlockingEngine();
        com.amlinv.javasched.Step step7 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener8 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip9 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step7, processStepExecutionListener8);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess11 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step7, false);
        singleRepeatingStepProcess11.signal();
        // The following exception was thrown during execution in test generation
        try {
            com.amlinv.javasched.SchedulerProcessExecutionSlip schedulerProcessExecutionSlip13 = roundRobinScheduler0.startProcess((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory3);
        org.junit.Assert.assertNotNull(nonBlockingSchedulerEngine4);
        org.junit.Assert.assertNotNull(nonBlockingSchedulerEngine5);
        org.junit.Assert.assertNull(blockingSchedulerEngine6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine1 = null;
        roundRobinScheduler0.setBlockingEngine(blockingSchedulerEngine1);
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory3 = roundRobinScheduler0.getStepExecutionSlipFactory();
        java.util.List<com.amlinv.javasched.SchedulerProcess> schedulerProcessList4 = roundRobinScheduler0.getProcessList();
        // The following exception was thrown during execution in test generation
        try {
            roundRobinScheduler0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory3);
        org.junit.Assert.assertNotNull(schedulerProcessList4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine1 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(0);
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine2 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        standardBlockingSchedulerEngine2.setMaximumProcessors((int) (byte) -1);
        int int5 = standardBlockingSchedulerEngine2.getNumIdleThread();
        long long6 = standardBlockingSchedulerEngine2.getTotalStepsStarted();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine8 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(10);
        org.slf4j.Logger logger9 = standardNonBlockingSchedulerEngine8.getLog();
        standardBlockingSchedulerEngine2.setLog(logger9);
        standardNonBlockingSchedulerEngine1.setLog(logger9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(logger9);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine2 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(10);
        org.slf4j.Logger logger3 = standardNonBlockingSchedulerEngine2.getLog();
        standardBlockingSchedulerEngine0.setLog(logger3);
        standardBlockingSchedulerEngine0.start();
        // The following exception was thrown during execution in test generation
        try {
            standardBlockingSchedulerEngine0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: already started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(logger3);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine();
        int int1 = standardNonBlockingSchedulerEngine0.getProcessorCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine1 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(0);
        int int2 = standardNonBlockingSchedulerEngine1.getProcessorCount();
        int int3 = standardNonBlockingSchedulerEngine1.getProcessorCount();
        // The following exception was thrown during execution in test generation
        try {
            standardNonBlockingSchedulerEngine1.initiateShutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        int int1 = standardBlockingSchedulerEngine0.getNumStartedThread();
        long long2 = standardBlockingSchedulerEngine0.getMaxThreadIdleTime();
        int int3 = standardBlockingSchedulerEngine0.getMaximumProcessors();
        long long4 = standardBlockingSchedulerEngine0.getTotalStepsStarted();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        com.amlinv.javasched.Step step1 = stepListSchedulerProcess0.getNextStep();
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess3 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step1, false);
        org.junit.Assert.assertNotNull(step1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean1 = stepListSchedulerProcess0.isAutoStop();
        int int2 = stepListSchedulerProcess0.getPendingStepCount();
        com.amlinv.javasched.Step step3 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener4 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip5 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step3, processStepExecutionListener4);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess8 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip5, (long) '4', (long) 100);
        stepListSchedulerProcess0.addStep((com.amlinv.javasched.Step) processStepExecutionSlip5);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip10 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) stepListSchedulerProcess0);
        com.amlinv.javasched.Step step11 = stepListSchedulerProcess0.getNextStep();
        stepListSchedulerProcess0.shutdown();
        stepListSchedulerProcess0.shutdown();
        stepListSchedulerProcess0.shutdown();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(step11);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        stepListSchedulerProcess0.shutdown();
        com.amlinv.javasched.Step step2 = stepListSchedulerProcess0.getNextStep();
        com.amlinv.javasched.Step step3 = stepListSchedulerProcess0.getNextStep();
        org.junit.Assert.assertNull(step2);
        org.junit.Assert.assertNull(step3);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine1 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(100);
        com.amlinv.javasched.Step step2 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener3 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip4 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step2, processStepExecutionListener3);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess7 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip4, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess11 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip4, false, 0L, 0L);
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener12 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip13 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip((com.amlinv.javasched.Step) processStepExecutionSlip4, processStepExecutionListener12);
        // The following exception was thrown during execution in test generation
        try {
            standardNonBlockingSchedulerEngine1.submit((com.amlinv.javasched.Step) processStepExecutionSlip4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory standardProcessExecutionSlipFactory0 = new com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory();
        com.amlinv.javasched.Step step1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener2 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip3 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step1, processStepExecutionListener2);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess5 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step1, false);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip6 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess5);
        com.amlinv.javasched.Step step7 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener8 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip9 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step7, processStepExecutionListener8);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess12 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip9, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess16 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip9, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess16.setRepeatOnlyWhenSignalled(false);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip19 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) rateLimitedSingleRepeatingStepProcess16);
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess20 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean21 = stepListSchedulerProcess20.isAutoStop();
        com.amlinv.javasched.Step step22 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener23 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip24 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step22, processStepExecutionListener23);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess27 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip24, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess31 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip24, false, 0L, 0L);
        stepListSchedulerProcess20.addStep((com.amlinv.javasched.Step) processStepExecutionSlip24);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess34 = new com.amlinv.javasched.process.SingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip24, true);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip35 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess34);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip36 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess34);
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip6);
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip35);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine1 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine((int) (short) 10);
        standardNonBlockingSchedulerEngine1.start();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        long long1 = standardBlockingSchedulerEngine0.getMaxThreadIdleTime();
        org.slf4j.Logger logger2 = standardBlockingSchedulerEngine0.getLog();
        int int3 = standardBlockingSchedulerEngine0.getMaximumProcessors();
        org.slf4j.Logger logger4 = standardBlockingSchedulerEngine0.getLog();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertNotNull(logger4);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory1 = roundRobinScheduler0.getStepExecutionSlipFactory();
        roundRobinScheduler0.start();
        java.util.List<com.amlinv.javasched.SchedulerProcess> schedulerProcessList3 = roundRobinScheduler0.getProcessList();
        java.util.List<com.amlinv.javasched.SchedulerProcess> schedulerProcessList4 = roundRobinScheduler0.getProcessList();
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory1);
        org.junit.Assert.assertNotNull(schedulerProcessList3);
        org.junit.Assert.assertNotNull(schedulerProcessList4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory1 = roundRobinScheduler0.getStepExecutionSlipFactory();
        java.util.List<com.amlinv.javasched.SchedulerProcess> schedulerProcessList2 = roundRobinScheduler0.getProcessList();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine3 = roundRobinScheduler0.getBlockingEngine();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory4 = roundRobinScheduler0.getStepExecutionSlipFactory();
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine5 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        long long6 = standardBlockingSchedulerEngine5.getMaxThreadIdleTime();
        int int7 = standardBlockingSchedulerEngine5.getNumStartedThread();
        roundRobinScheduler0.setBlockingEngine((com.amlinv.javasched.BlockingSchedulerEngine) standardBlockingSchedulerEngine5);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory1);
        org.junit.Assert.assertNotNull(schedulerProcessList2);
        org.junit.Assert.assertNotNull(blockingSchedulerEngine3);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess5 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, (long) '4', (long) 100);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip6 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) rateLimitedSingleRepeatingStepProcess5);
        standardProcessExecutionSlip6.waitUntilComplete(100L, 0L);
        standardProcessExecutionSlip6.processStarted();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine1 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine((int) (byte) 1);
        int int2 = standardNonBlockingSchedulerEngine1.getProcessorCount();
        com.amlinv.javasched.Step step3 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener4 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip5 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step3, processStepExecutionListener4);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess8 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip5, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess12 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip5, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess12.setRepeatOnlyWhenSignalled(false);
        com.amlinv.javasched.Step step15 = rateLimitedSingleRepeatingStepProcess12.getNextStep();
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess18 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess(step15, (long) (short) 10, (long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            standardNonBlockingSchedulerEngine1.submit(step15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(step15);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.amlinv.javasched.SchedulerProcess schedulerProcess0 = null;
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip1 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip(schedulerProcess0);
        com.amlinv.javasched.SchedulerProcess schedulerProcess2 = standardProcessExecutionSlip1.getSchedulerProcess();
        standardProcessExecutionSlip1.waitUntilComplete((-1L), (long) '#');
        boolean boolean6 = standardProcessExecutionSlip1.isRunnable();
        standardProcessExecutionSlip1.processStarted();
        com.amlinv.javasched.SchedulerProcess schedulerProcess8 = standardProcessExecutionSlip1.getSchedulerProcess();
        com.amlinv.javasched.SchedulerProcess schedulerProcess9 = standardProcessExecutionSlip1.getSchedulerProcess();
        org.junit.Assert.assertNull(schedulerProcess2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(schedulerProcess8);
        org.junit.Assert.assertNull(schedulerProcess9);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine2 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(10);
        org.slf4j.Logger logger3 = standardNonBlockingSchedulerEngine2.getLog();
        standardBlockingSchedulerEngine0.setLog(logger3);
        long long5 = standardBlockingSchedulerEngine0.getMaxThreadIdleTime();
        org.junit.Assert.assertNotNull(logger3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean1 = stepListSchedulerProcess0.isAutoStop();
        com.amlinv.javasched.Step step2 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener3 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip4 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step2, processStepExecutionListener3);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess7 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip4, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess11 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip4, false, 0L, 0L);
        stepListSchedulerProcess0.addStep((com.amlinv.javasched.Step) processStepExecutionSlip4);
        boolean boolean13 = stepListSchedulerProcess0.isAutoStop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory1 = roundRobinScheduler0.getStepExecutionSlipFactory();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine3 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine((int) (short) 10);
        roundRobinScheduler0.setNonBlockingEngine((com.amlinv.javasched.NonBlockingSchedulerEngine) standardNonBlockingSchedulerEngine3);
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine6 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(10);
        org.slf4j.Logger logger7 = standardNonBlockingSchedulerEngine6.getLog();
        roundRobinScheduler0.setNonBlockingEngine((com.amlinv.javasched.NonBlockingSchedulerEngine) standardNonBlockingSchedulerEngine6);
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory9 = roundRobinScheduler0.getStepExecutionSlipFactory();
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory1);
        org.junit.Assert.assertNotNull(logger7);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        long long1 = standardBlockingSchedulerEngine0.getMaxThreadIdleTime();
        int int2 = standardBlockingSchedulerEngine0.getNumStartedThread();
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine3 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine5 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(10);
        org.slf4j.Logger logger6 = standardNonBlockingSchedulerEngine5.getLog();
        standardBlockingSchedulerEngine3.setLog(logger6);
        standardBlockingSchedulerEngine0.setLog(logger6);
        standardBlockingSchedulerEngine0.initiateShutdown(true);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(logger6);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean1 = stepListSchedulerProcess0.isAutoStop();
        int int2 = stepListSchedulerProcess0.getPendingStepCount();
        com.amlinv.javasched.Step step3 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener4 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip5 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step3, processStepExecutionListener4);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess8 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip5, (long) '4', (long) 100);
        stepListSchedulerProcess0.addStep((com.amlinv.javasched.Step) processStepExecutionSlip5);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip10 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) stepListSchedulerProcess0);
        com.amlinv.javasched.Step step11 = stepListSchedulerProcess0.getNextStep();
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess13 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step11, true);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess17 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess(step11, false, (long) (short) 100, (long) (-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(step11);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine1 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine((int) (short) 10);
        org.slf4j.Logger logger2 = standardNonBlockingSchedulerEngine1.getLog();
        org.junit.Assert.assertNotNull(logger2);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine();
        standardNonBlockingSchedulerEngine0.start();
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess2 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean3 = stepListSchedulerProcess2.isAutoStop();
        com.amlinv.javasched.Step step4 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener5 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip6 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step4, processStepExecutionListener5);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip6, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess13 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip6, false, 0L, 0L);
        stepListSchedulerProcess2.addStep((com.amlinv.javasched.Step) processStepExecutionSlip6);
        standardNonBlockingSchedulerEngine0.submit((com.amlinv.javasched.Step) processStepExecutionSlip6);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess16 = new com.amlinv.javasched.process.SingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip6);
        com.amlinv.javasched.Step step17 = singleRepeatingStepProcess16.getNextStep();
        com.amlinv.javasched.Step step18 = singleRepeatingStepProcess16.getNextStep();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(step17);
        org.junit.Assert.assertNotNull(step18);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine1 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine((int) (short) 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine1 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine((int) (short) 10);
        com.amlinv.javasched.Step step2 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener3 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip4 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step2, processStepExecutionListener3);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess6 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step2, true);
        singleRepeatingStepProcess6.setRepeatOnlyWhenSignalled(true);
        com.amlinv.javasched.Step step9 = singleRepeatingStepProcess6.getNextStep();
        // The following exception was thrown during execution in test generation
        try {
            standardNonBlockingSchedulerEngine1.submit(step9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(step9);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess4 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step0, true);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip5 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess4);
        singleRepeatingStepProcess4.shutdown();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine1 = roundRobinScheduler0.getBlockingEngine();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine3 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(10);
        org.slf4j.Logger logger4 = standardNonBlockingSchedulerEngine3.getLog();
        roundRobinScheduler0.setNonBlockingEngine((com.amlinv.javasched.NonBlockingSchedulerEngine) standardNonBlockingSchedulerEngine3);
        java.util.List<com.amlinv.javasched.SchedulerProcess> schedulerProcessList6 = roundRobinScheduler0.getProcessList();
        org.junit.Assert.assertNotNull(blockingSchedulerEngine1);
        org.junit.Assert.assertNotNull(logger4);
        org.junit.Assert.assertNotNull(schedulerProcessList6);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine1 = null;
        roundRobinScheduler0.setBlockingEngine(blockingSchedulerEngine1);
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory3 = roundRobinScheduler0.getStepExecutionSlipFactory();
        com.amlinv.javasched.NonBlockingSchedulerEngine nonBlockingSchedulerEngine4 = roundRobinScheduler0.getNonBlockingEngine();
        com.amlinv.javasched.NonBlockingSchedulerEngine nonBlockingSchedulerEngine5 = roundRobinScheduler0.getNonBlockingEngine();
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler6 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory7 = roundRobinScheduler6.getStepExecutionSlipFactory();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine9 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine((int) (short) 10);
        roundRobinScheduler6.setNonBlockingEngine((com.amlinv.javasched.NonBlockingSchedulerEngine) standardNonBlockingSchedulerEngine9);
        com.amlinv.javasched.NonBlockingSchedulerEngine nonBlockingSchedulerEngine11 = roundRobinScheduler6.getNonBlockingEngine();
        roundRobinScheduler0.setNonBlockingEngine(nonBlockingSchedulerEngine11);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory3);
        org.junit.Assert.assertNotNull(nonBlockingSchedulerEngine4);
        org.junit.Assert.assertNotNull(nonBlockingSchedulerEngine5);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory7);
        org.junit.Assert.assertNotNull(nonBlockingSchedulerEngine11);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess4 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step0, true);
        singleRepeatingStepProcess4.setRepeatOnlyWhenSignalled(true);
        com.amlinv.javasched.Step step7 = singleRepeatingStepProcess4.getNextStep();
        singleRepeatingStepProcess4.shutdown();
        org.junit.Assert.assertNotNull(step7);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.amlinv.javasched.SchedulerProcess schedulerProcess0 = null;
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip1 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip(schedulerProcess0);
        com.amlinv.javasched.SchedulerProcess schedulerProcess2 = standardProcessExecutionSlip1.getSchedulerProcess();
        com.amlinv.javasched.SchedulerProcess schedulerProcess3 = standardProcessExecutionSlip1.getSchedulerProcess();
        standardProcessExecutionSlip1.waitUntilComplete((long) 10, (long) (-1));
        standardProcessExecutionSlip1.processStopped();
        standardProcessExecutionSlip1.waitUntilComplete();
        org.junit.Assert.assertNull(schedulerProcess2);
        org.junit.Assert.assertNull(schedulerProcess3);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory1 = roundRobinScheduler0.getStepExecutionSlipFactory();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine3 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine((int) (short) 10);
        roundRobinScheduler0.setNonBlockingEngine((com.amlinv.javasched.NonBlockingSchedulerEngine) standardNonBlockingSchedulerEngine3);
        com.amlinv.javasched.NonBlockingSchedulerEngine nonBlockingSchedulerEngine5 = roundRobinScheduler0.getNonBlockingEngine();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory6 = roundRobinScheduler0.getStepExecutionSlipFactory();
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory1);
        org.junit.Assert.assertNotNull(nonBlockingSchedulerEngine5);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess5 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess8 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, 0L, 0L);
        com.amlinv.javasched.Step step9 = rateLimitedSingleRepeatingStepProcess8.getNextStep();
        org.junit.Assert.assertNotNull(step9);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess5 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, (long) '4', (long) 100);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip6 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) rateLimitedSingleRepeatingStepProcess5);
        boolean boolean7 = rateLimitedSingleRepeatingStepProcess5.isRepeatOnlyWhenSignalled();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess5 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess9.setRepeatOnlyWhenSignalled(false);
        com.amlinv.javasched.Step step12 = rateLimitedSingleRepeatingStepProcess9.getNextStep();
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess14 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step12, true);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess17 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess(step12, (long) (short) 100, (long) 'a');
        org.junit.Assert.assertNotNull(step12);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        int int1 = standardBlockingSchedulerEngine0.getNumStartedThread();
        long long2 = standardBlockingSchedulerEngine0.getMaxThreadIdleTime();
        int int3 = standardBlockingSchedulerEngine0.getMaximumProcessors();
        org.slf4j.Logger logger4 = standardBlockingSchedulerEngine0.getLog();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertNotNull(logger4);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean1 = stepListSchedulerProcess0.isAutoStop();
        boolean boolean2 = stepListSchedulerProcess0.isStopped();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine1 = null;
        roundRobinScheduler0.setBlockingEngine(blockingSchedulerEngine1);
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory3 = roundRobinScheduler0.getStepExecutionSlipFactory();
        com.amlinv.javasched.NonBlockingSchedulerEngine nonBlockingSchedulerEngine4 = roundRobinScheduler0.getNonBlockingEngine();
        com.amlinv.javasched.NonBlockingSchedulerEngine nonBlockingSchedulerEngine5 = roundRobinScheduler0.getNonBlockingEngine();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine6 = roundRobinScheduler0.getBlockingEngine();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine7 = roundRobinScheduler0.getBlockingEngine();
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory3);
        org.junit.Assert.assertNotNull(nonBlockingSchedulerEngine4);
        org.junit.Assert.assertNotNull(nonBlockingSchedulerEngine5);
        org.junit.Assert.assertNull(blockingSchedulerEngine6);
        org.junit.Assert.assertNull(blockingSchedulerEngine7);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        long long1 = standardBlockingSchedulerEngine0.getMaxThreadIdleTime();
        int int2 = standardBlockingSchedulerEngine0.getNumStartedThread();
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine3 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine5 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(10);
        org.slf4j.Logger logger6 = standardNonBlockingSchedulerEngine5.getLog();
        standardBlockingSchedulerEngine3.setLog(logger6);
        standardBlockingSchedulerEngine0.setLog(logger6);
        int int9 = standardBlockingSchedulerEngine0.getNumStartedThread();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(logger6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess5 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess9.setRepeatOnlyWhenSignalled(false);
        com.amlinv.javasched.Step step12 = rateLimitedSingleRepeatingStepProcess9.getNextStep();
        boolean boolean13 = rateLimitedSingleRepeatingStepProcess9.isRepeatOnlyWhenSignalled();
        org.junit.Assert.assertNotNull(step12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory1 = roundRobinScheduler0.getStepExecutionSlipFactory();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine3 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine((int) (short) 10);
        roundRobinScheduler0.setNonBlockingEngine((com.amlinv.javasched.NonBlockingSchedulerEngine) standardNonBlockingSchedulerEngine3);
        int int5 = standardNonBlockingSchedulerEngine3.getProcessorCount();
        standardNonBlockingSchedulerEngine3.start();
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory1 = roundRobinScheduler0.getStepExecutionSlipFactory();
        java.util.List<com.amlinv.javasched.SchedulerProcess> schedulerProcessList2 = roundRobinScheduler0.getProcessList();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine3 = roundRobinScheduler0.getBlockingEngine();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory4 = roundRobinScheduler0.getStepExecutionSlipFactory();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory5 = roundRobinScheduler0.getStepExecutionSlipFactory();
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess6 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean7 = stepListSchedulerProcess6.isAutoStop();
        int int8 = stepListSchedulerProcess6.getPendingStepCount();
        com.amlinv.javasched.Step step9 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener10 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip11 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step9, processStepExecutionListener10);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess14 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip11, (long) '4', (long) 100);
        stepListSchedulerProcess6.addStep((com.amlinv.javasched.Step) processStepExecutionSlip11);
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener16 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip17 = processStepExecutionSlipFactory5.createProcessStepExecutionSlip((com.amlinv.javasched.Step) processStepExecutionSlip11, processStepExecutionListener16);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory1);
        org.junit.Assert.assertNotNull(schedulerProcessList2);
        org.junit.Assert.assertNotNull(blockingSchedulerEngine3);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory4);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(processStepExecutionSlip17);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess5 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, false, 0L, 0L);
        com.amlinv.javasched.Step step10 = rateLimitedSingleRepeatingStepProcess9.getNextStep();
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener11 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip12 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step10, processStepExecutionListener11);
        org.junit.Assert.assertNotNull(step10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.amlinv.javasched.SchedulerProcess schedulerProcess0 = null;
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip1 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip(schedulerProcess0);
        com.amlinv.javasched.SchedulerProcess schedulerProcess2 = standardProcessExecutionSlip1.getSchedulerProcess();
        com.amlinv.javasched.SchedulerProcess schedulerProcess3 = standardProcessExecutionSlip1.getSchedulerProcess();
        standardProcessExecutionSlip1.waitUntilComplete((long) 10, (long) (-1));
        com.amlinv.javasched.SchedulerProcess schedulerProcess7 = standardProcessExecutionSlip1.getSchedulerProcess();
        org.junit.Assert.assertNull(schedulerProcess2);
        org.junit.Assert.assertNull(schedulerProcess3);
        org.junit.Assert.assertNull(schedulerProcess7);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory1 = roundRobinScheduler0.getStepExecutionSlipFactory();
        java.util.List<com.amlinv.javasched.SchedulerProcess> schedulerProcessList2 = roundRobinScheduler0.getProcessList();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine3 = roundRobinScheduler0.getBlockingEngine();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory4 = roundRobinScheduler0.getStepExecutionSlipFactory();
        java.util.List<com.amlinv.javasched.SchedulerProcess> schedulerProcessList5 = roundRobinScheduler0.getProcessList();
        roundRobinScheduler0.start();
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler7 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine8 = null;
        roundRobinScheduler7.setBlockingEngine(blockingSchedulerEngine8);
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory10 = roundRobinScheduler7.getStepExecutionSlipFactory();
        com.amlinv.javasched.Step step11 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener12 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip13 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step11, processStepExecutionListener12);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess16 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip13, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess20 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip13, false, 0L, 0L);
        com.amlinv.javasched.Step step21 = rateLimitedSingleRepeatingStepProcess20.getNextStep();
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener22 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip23 = processStepExecutionSlipFactory10.createProcessStepExecutionSlip(step21, processStepExecutionListener22);
        roundRobinScheduler0.setStepExecutionSlipFactory(processStepExecutionSlipFactory10);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory1);
        org.junit.Assert.assertNotNull(schedulerProcessList2);
        org.junit.Assert.assertNotNull(blockingSchedulerEngine3);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory4);
        org.junit.Assert.assertNotNull(schedulerProcessList5);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory10);
        org.junit.Assert.assertNotNull(step21);
        org.junit.Assert.assertNotNull(processStepExecutionSlip23);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory standardProcessExecutionSlipFactory0 = new com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory();
        com.amlinv.javasched.Step step1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener2 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip3 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step1, processStepExecutionListener2);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess5 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step1, false);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip6 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess5);
        com.amlinv.javasched.Step step7 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener8 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip9 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step7, processStepExecutionListener8);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess12 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip9, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess16 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip9, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess16.setRepeatOnlyWhenSignalled(false);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip19 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) rateLimitedSingleRepeatingStepProcess16);
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine20 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine();
        standardNonBlockingSchedulerEngine20.start();
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess22 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean23 = stepListSchedulerProcess22.isAutoStop();
        com.amlinv.javasched.Step step24 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener25 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip26 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step24, processStepExecutionListener25);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess29 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip26, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess33 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip26, false, 0L, 0L);
        stepListSchedulerProcess22.addStep((com.amlinv.javasched.Step) processStepExecutionSlip26);
        standardNonBlockingSchedulerEngine20.submit((com.amlinv.javasched.Step) processStepExecutionSlip26);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess36 = new com.amlinv.javasched.process.SingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip26);
        singleRepeatingStepProcess36.shutdown();
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip38 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess36);
        singleRepeatingStepProcess36.setRepeatOnlyWhenSignalled(false);
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip6);
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip38);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean1 = stepListSchedulerProcess0.isAutoStop();
        int int2 = stepListSchedulerProcess0.getPendingStepCount();
        com.amlinv.javasched.Step step3 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener4 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip5 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step3, processStepExecutionListener4);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess8 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip5, (long) '4', (long) 100);
        stepListSchedulerProcess0.addStep((com.amlinv.javasched.Step) processStepExecutionSlip5);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip10 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) stepListSchedulerProcess0);
        standardProcessExecutionSlip10.processStopped();
        standardProcessExecutionSlip10.waitUntilComplete((long) (byte) -1, (-1L));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory1 = roundRobinScheduler0.getStepExecutionSlipFactory();
        java.util.List<com.amlinv.javasched.SchedulerProcess> schedulerProcessList2 = roundRobinScheduler0.getProcessList();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine3 = roundRobinScheduler0.getBlockingEngine();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory4 = roundRobinScheduler0.getStepExecutionSlipFactory();
        java.util.List<com.amlinv.javasched.SchedulerProcess> schedulerProcessList5 = roundRobinScheduler0.getProcessList();
        roundRobinScheduler0.start();
        com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory standardProcessExecutionSlipFactory7 = new com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory();
        com.amlinv.javasched.Step step8 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener9 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip10 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step8, processStepExecutionListener9);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess12 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step8, false);
        singleRepeatingStepProcess12.signal();
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip14 = standardProcessExecutionSlipFactory7.createSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess12);
        com.amlinv.javasched.Step step15 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener16 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip17 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step15, processStepExecutionListener16);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess20 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip17, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess24 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip17, false, 0L, 0L);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip25 = standardProcessExecutionSlipFactory7.createSlip((com.amlinv.javasched.SchedulerProcess) rateLimitedSingleRepeatingStepProcess24);
        com.amlinv.javasched.Step step26 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener27 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip28 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step26, processStepExecutionListener27);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess31 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip28, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess35 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip28, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess35.setRepeatOnlyWhenSignalled(false);
        com.amlinv.javasched.Step step38 = rateLimitedSingleRepeatingStepProcess35.getNextStep();
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess39 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step38);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess42 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess(step38, (long) (short) 0, (-1L));
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip43 = standardProcessExecutionSlipFactory7.createSlip((com.amlinv.javasched.SchedulerProcess) rateLimitedSingleRepeatingStepProcess42);
        rateLimitedSingleRepeatingStepProcess42.signal();
        // The following exception was thrown during execution in test generation
        try {
            com.amlinv.javasched.SchedulerProcessExecutionSlip schedulerProcessExecutionSlip45 = roundRobinScheduler0.startProcess((com.amlinv.javasched.SchedulerProcess) rateLimitedSingleRepeatingStepProcess42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory1);
        org.junit.Assert.assertNotNull(schedulerProcessList2);
        org.junit.Assert.assertNotNull(blockingSchedulerEngine3);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory4);
        org.junit.Assert.assertNotNull(schedulerProcessList5);
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip14);
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip25);
        org.junit.Assert.assertNotNull(step38);
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip43);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess5 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess8 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, 0L, 0L);
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener9 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip10 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip((com.amlinv.javasched.Step) processStepExecutionSlip2, processStepExecutionListener9);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess12 = new com.amlinv.javasched.process.SingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip10, false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess5 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess9.setRepeatOnlyWhenSignalled(false);
        rateLimitedSingleRepeatingStepProcess9.signal();
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip13 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) rateLimitedSingleRepeatingStepProcess9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.amlinv.javasched.SchedulerProcess schedulerProcess0 = null;
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip1 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip(schedulerProcess0);
        com.amlinv.javasched.SchedulerProcess schedulerProcess2 = standardProcessExecutionSlip1.getSchedulerProcess();
        standardProcessExecutionSlip1.waitUntilComplete((-1L), (long) '#');
        boolean boolean6 = standardProcessExecutionSlip1.isRunnable();
        standardProcessExecutionSlip1.processStarted();
        standardProcessExecutionSlip1.processStopped();
        org.junit.Assert.assertNull(schedulerProcess2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.amlinv.javasched.SchedulerProcess schedulerProcess0 = null;
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip1 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip(schedulerProcess0);
        com.amlinv.javasched.SchedulerProcess schedulerProcess2 = standardProcessExecutionSlip1.getSchedulerProcess();
        boolean boolean3 = standardProcessExecutionSlip1.isRunnable();
        org.junit.Assert.assertNull(schedulerProcess2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine1 = null;
        roundRobinScheduler0.setBlockingEngine(blockingSchedulerEngine1);
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory3 = roundRobinScheduler0.getStepExecutionSlipFactory();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine4 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine();
        standardNonBlockingSchedulerEngine4.start();
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess6 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean7 = stepListSchedulerProcess6.isAutoStop();
        com.amlinv.javasched.Step step8 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener9 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip10 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step8, processStepExecutionListener9);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess13 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip10, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess17 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip10, false, 0L, 0L);
        stepListSchedulerProcess6.addStep((com.amlinv.javasched.Step) processStepExecutionSlip10);
        standardNonBlockingSchedulerEngine4.submit((com.amlinv.javasched.Step) processStepExecutionSlip10);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess20 = new com.amlinv.javasched.process.SingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip10);
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener21 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip22 = processStepExecutionSlipFactory3.createProcessStepExecutionSlip((com.amlinv.javasched.Step) processStepExecutionSlip10, processStepExecutionListener21);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(processStepExecutionSlip22);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory1 = roundRobinScheduler0.getStepExecutionSlipFactory();
        java.util.List<com.amlinv.javasched.SchedulerProcess> schedulerProcessList2 = roundRobinScheduler0.getProcessList();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine3 = roundRobinScheduler0.getBlockingEngine();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine4 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine();
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine5 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine7 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(10);
        org.slf4j.Logger logger8 = standardNonBlockingSchedulerEngine7.getLog();
        standardBlockingSchedulerEngine5.setLog(logger8);
        standardNonBlockingSchedulerEngine4.setLog(logger8);
        roundRobinScheduler0.setNonBlockingEngine((com.amlinv.javasched.NonBlockingSchedulerEngine) standardNonBlockingSchedulerEngine4);
        roundRobinScheduler0.start();
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory1);
        org.junit.Assert.assertNotNull(schedulerProcessList2);
        org.junit.Assert.assertNotNull(blockingSchedulerEngine3);
        org.junit.Assert.assertNotNull(logger8);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine2 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(10);
        org.slf4j.Logger logger3 = standardNonBlockingSchedulerEngine2.getLog();
        standardBlockingSchedulerEngine0.setLog(logger3);
        long long5 = standardBlockingSchedulerEngine0.getTotalStepsStarted();
        org.junit.Assert.assertNotNull(logger3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory standardProcessExecutionSlipFactory0 = new com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory();
        com.amlinv.javasched.Step step1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener2 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip3 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step1, processStepExecutionListener2);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess5 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step1, false);
        singleRepeatingStepProcess5.signal();
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip7 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess5);
        com.amlinv.javasched.Step step8 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener9 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip10 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step8, processStepExecutionListener9);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess13 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip10, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess17 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip10, false, 0L, 0L);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip18 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) rateLimitedSingleRepeatingStepProcess17);
        com.amlinv.javasched.Step step19 = rateLimitedSingleRepeatingStepProcess17.getNextStep();
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip7);
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip18);
        org.junit.Assert.assertNotNull(step19);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        int int1 = standardBlockingSchedulerEngine0.getNumStartedThread();
        org.slf4j.Logger logger2 = standardBlockingSchedulerEngine0.getLog();
        long long3 = standardBlockingSchedulerEngine0.getMaxThreadIdleTime();
        int int4 = standardBlockingSchedulerEngine0.getNumIdleThread();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess4 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step0, true);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip5 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess4);
        standardProcessExecutionSlip5.waitUntilComplete(100L, (long) (byte) 1);
        com.amlinv.javasched.SchedulerProcess schedulerProcess9 = standardProcessExecutionSlip5.getSchedulerProcess();
        standardProcessExecutionSlip5.waitUntilComplete((long) (byte) 1, (long) (-1));
        org.junit.Assert.assertNotNull(schedulerProcess9);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        long long1 = standardBlockingSchedulerEngine0.getMaxThreadIdleTime();
        int int2 = standardBlockingSchedulerEngine0.getNumStartedThread();
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine3 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine5 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(10);
        org.slf4j.Logger logger6 = standardNonBlockingSchedulerEngine5.getLog();
        standardBlockingSchedulerEngine3.setLog(logger6);
        standardBlockingSchedulerEngine0.setLog(logger6);
        int int9 = standardBlockingSchedulerEngine0.getMaximumProcessors();
        com.amlinv.javasched.Step step10 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener11 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip12 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step10, processStepExecutionListener11);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess15 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip12, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess19 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip12, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess19.setRepeatOnlyWhenSignalled(false);
        com.amlinv.javasched.Step step22 = rateLimitedSingleRepeatingStepProcess19.getNextStep();
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess23 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step22);
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener24 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip25 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step22, processStepExecutionListener24);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess29 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip25, false, (long) (short) 1, (long) (byte) 0);
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener30 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip31 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip((com.amlinv.javasched.Step) processStepExecutionSlip25, processStepExecutionListener30);
        // The following exception was thrown during execution in test generation
        try {
            standardBlockingSchedulerEngine0.submit((com.amlinv.javasched.Step) processStepExecutionSlip31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(logger6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertNotNull(step22);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.amlinv.javasched.SchedulerProcess schedulerProcess0 = null;
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip1 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip(schedulerProcess0);
        com.amlinv.javasched.SchedulerProcess schedulerProcess2 = standardProcessExecutionSlip1.getSchedulerProcess();
        standardProcessExecutionSlip1.waitUntilComplete((-1L), (long) '#');
        standardProcessExecutionSlip1.processStopped();
        standardProcessExecutionSlip1.waitUntilComplete();
        standardProcessExecutionSlip1.processStopped();
        standardProcessExecutionSlip1.waitUntilComplete((long) (short) -1, (long) (byte) -1);
        org.junit.Assert.assertNull(schedulerProcess2);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory standardProcessExecutionSlipFactory0 = new com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory();
        com.amlinv.javasched.Step step1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener2 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip3 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step1, processStepExecutionListener2);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess5 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step1, false);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip6 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess5);
        com.amlinv.javasched.Step step7 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener8 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip9 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step7, processStepExecutionListener8);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess12 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip9, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess16 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip9, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess16.setRepeatOnlyWhenSignalled(false);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip19 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) rateLimitedSingleRepeatingStepProcess16);
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess20 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean21 = stepListSchedulerProcess20.isAutoStop();
        com.amlinv.javasched.Step step22 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener23 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip24 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step22, processStepExecutionListener23);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess27 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip24, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess31 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip24, false, 0L, 0L);
        stepListSchedulerProcess20.addStep((com.amlinv.javasched.Step) processStepExecutionSlip24);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess34 = new com.amlinv.javasched.process.SingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip24, true);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip35 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess34);
        standardProcessExecutionSlip35.processStopped();
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip6);
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip35);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory standardProcessExecutionSlipFactory0 = new com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory();
        com.amlinv.javasched.Step step1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener2 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip3 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step1, processStepExecutionListener2);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess5 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step1, false);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip6 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess5);
        com.amlinv.javasched.Step step7 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener8 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip9 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step7, processStepExecutionListener8);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess12 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip9, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess16 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip9, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess16.setRepeatOnlyWhenSignalled(false);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip19 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) rateLimitedSingleRepeatingStepProcess16);
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess20 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean21 = stepListSchedulerProcess20.isAutoStop();
        com.amlinv.javasched.Step step22 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener23 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip24 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step22, processStepExecutionListener23);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess27 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip24, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess31 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip24, false, 0L, 0L);
        stepListSchedulerProcess20.addStep((com.amlinv.javasched.Step) processStepExecutionSlip24);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess34 = new com.amlinv.javasched.process.SingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip24, true);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip35 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess34);
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess36 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean37 = stepListSchedulerProcess36.isAutoStop();
        int int38 = stepListSchedulerProcess36.getPendingStepCount();
        com.amlinv.javasched.Step step39 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener40 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip41 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step39, processStepExecutionListener40);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess44 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip41, (long) '4', (long) 100);
        stepListSchedulerProcess36.addStep((com.amlinv.javasched.Step) processStepExecutionSlip41);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip46 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) stepListSchedulerProcess36);
        com.amlinv.javasched.Step step47 = stepListSchedulerProcess36.getNextStep();
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip48 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) stepListSchedulerProcess36);
        boolean boolean49 = stepListSchedulerProcess36.isStopped();
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip6);
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(step47);
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory standardProcessExecutionSlipFactory0 = new com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory();
        com.amlinv.javasched.Step step1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener2 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip3 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step1, processStepExecutionListener2);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess5 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step1, false);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip6 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess5);
        standardProcessExecutionSlip6.processStarted();
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip6);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess5 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, (long) '4', (long) 100);
        rateLimitedSingleRepeatingStepProcess5.signal();
        com.amlinv.javasched.Step step7 = rateLimitedSingleRepeatingStepProcess5.getNextStep();
        org.junit.Assert.assertNotNull(step7);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess4 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess(step0, true, (long) (short) 10, (long) (short) -1);
        rateLimitedSingleRepeatingStepProcess4.setRepeatOnlyWhenSignalled(false);
        rateLimitedSingleRepeatingStepProcess4.signal();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess5 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess9.setRepeatOnlyWhenSignalled(false);
        com.amlinv.javasched.Step step12 = rateLimitedSingleRepeatingStepProcess9.getNextStep();
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess14 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step12, true);
        singleRepeatingStepProcess14.shutdown();
        boolean boolean16 = singleRepeatingStepProcess14.isRepeatOnlyWhenSignalled();
        org.junit.Assert.assertNotNull(step12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler1 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine2 = null;
        roundRobinScheduler1.setBlockingEngine(blockingSchedulerEngine2);
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler4 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine5 = null;
        roundRobinScheduler4.setBlockingEngine(blockingSchedulerEngine5);
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory7 = roundRobinScheduler4.getStepExecutionSlipFactory();
        roundRobinScheduler1.setStepExecutionSlipFactory(processStepExecutionSlipFactory7);
        roundRobinScheduler0.setStepExecutionSlipFactory(processStepExecutionSlipFactory7);
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory10 = roundRobinScheduler0.getStepExecutionSlipFactory();
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler11 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory12 = roundRobinScheduler11.getStepExecutionSlipFactory();
        roundRobinScheduler11.start();
        com.amlinv.javasched.NonBlockingSchedulerEngine nonBlockingSchedulerEngine14 = roundRobinScheduler11.getNonBlockingEngine();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine15 = roundRobinScheduler11.getBlockingEngine();
        roundRobinScheduler0.setBlockingEngine(blockingSchedulerEngine15);
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess17 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean18 = stepListSchedulerProcess17.isAutoStop();
        com.amlinv.javasched.Step step19 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener20 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip21 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step19, processStepExecutionListener20);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess24 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip21, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess28 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip21, false, 0L, 0L);
        stepListSchedulerProcess17.addStep((com.amlinv.javasched.Step) processStepExecutionSlip21);
        // The following exception was thrown during execution in test generation
        try {
            com.amlinv.javasched.SchedulerProcessExecutionSlip schedulerProcessExecutionSlip30 = roundRobinScheduler0.startProcess((com.amlinv.javasched.SchedulerProcess) stepListSchedulerProcess17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory7);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory10);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory12);
        org.junit.Assert.assertNotNull(nonBlockingSchedulerEngine14);
        org.junit.Assert.assertNotNull(blockingSchedulerEngine15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        stepListSchedulerProcess0.shutdown();
        int int2 = stepListSchedulerProcess0.getPendingStepCount();
        boolean boolean3 = stepListSchedulerProcess0.isAutoStop();
        boolean boolean4 = stepListSchedulerProcess0.isAutoStop();
        boolean boolean5 = stepListSchedulerProcess0.isAutoStop();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean1 = stepListSchedulerProcess0.isAutoStop();
        int int2 = stepListSchedulerProcess0.getPendingStepCount();
        com.amlinv.javasched.Step step3 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener4 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip5 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step3, processStepExecutionListener4);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess8 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip5, (long) '4', (long) 100);
        stepListSchedulerProcess0.addStep((com.amlinv.javasched.Step) processStepExecutionSlip5);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip10 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) stepListSchedulerProcess0);
        com.amlinv.javasched.Step step11 = stepListSchedulerProcess0.getNextStep();
        com.amlinv.javasched.Step step12 = stepListSchedulerProcess0.getNextStep();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(step11);
        org.junit.Assert.assertNotNull(step12);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        long long1 = standardBlockingSchedulerEngine0.getMaxThreadIdleTime();
        int int2 = standardBlockingSchedulerEngine0.getNumStartedThread();
        org.slf4j.Logger logger3 = standardBlockingSchedulerEngine0.getLog();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(logger3);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine2 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(10);
        org.slf4j.Logger logger3 = standardNonBlockingSchedulerEngine2.getLog();
        standardBlockingSchedulerEngine0.setLog(logger3);
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine5 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        standardBlockingSchedulerEngine5.setMaximumProcessors((int) (byte) -1);
        int int8 = standardBlockingSchedulerEngine5.getNumIdleThread();
        org.slf4j.Logger logger9 = standardBlockingSchedulerEngine5.getLog();
        standardBlockingSchedulerEngine0.setLog(logger9);
        standardBlockingSchedulerEngine0.start();
        org.junit.Assert.assertNotNull(logger3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(logger9);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory standardProcessExecutionSlipFactory0 = new com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory();
        com.amlinv.javasched.Step step1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener2 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip3 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step1, processStepExecutionListener2);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess5 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step1, false);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip6 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess5);
        com.amlinv.javasched.Step step7 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener8 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip9 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step7, processStepExecutionListener8);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess12 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip9, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess16 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip9, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess16.setRepeatOnlyWhenSignalled(false);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip19 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) rateLimitedSingleRepeatingStepProcess16);
        com.amlinv.javasched.Step step20 = rateLimitedSingleRepeatingStepProcess16.getNextStep();
        com.amlinv.javasched.Step step21 = rateLimitedSingleRepeatingStepProcess16.getNextStep();
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip6);
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip19);
        org.junit.Assert.assertNotNull(step20);
        org.junit.Assert.assertNotNull(step21);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory1 = roundRobinScheduler0.getStepExecutionSlipFactory();
        java.util.List<com.amlinv.javasched.SchedulerProcess> schedulerProcessList2 = roundRobinScheduler0.getProcessList();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine3 = roundRobinScheduler0.getBlockingEngine();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory4 = roundRobinScheduler0.getStepExecutionSlipFactory();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory5 = roundRobinScheduler0.getStepExecutionSlipFactory();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine6 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine();
        standardNonBlockingSchedulerEngine6.start();
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess8 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean9 = stepListSchedulerProcess8.isAutoStop();
        com.amlinv.javasched.Step step10 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener11 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip12 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step10, processStepExecutionListener11);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess15 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip12, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess19 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip12, false, 0L, 0L);
        stepListSchedulerProcess8.addStep((com.amlinv.javasched.Step) processStepExecutionSlip12);
        standardNonBlockingSchedulerEngine6.submit((com.amlinv.javasched.Step) processStepExecutionSlip12);
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener22 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip23 = processStepExecutionSlipFactory5.createProcessStepExecutionSlip((com.amlinv.javasched.Step) processStepExecutionSlip12, processStepExecutionListener22);
        // The following exception was thrown during execution in test generation
        try {
            processStepExecutionSlip23.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory1);
        org.junit.Assert.assertNotNull(schedulerProcessList2);
        org.junit.Assert.assertNotNull(blockingSchedulerEngine3);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory4);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(processStepExecutionSlip23);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        stepListSchedulerProcess0.shutdown();
        int int2 = stepListSchedulerProcess0.getPendingStepCount();
        stepListSchedulerProcess0.waitUntilFinished();
        com.amlinv.javasched.Step step4 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener5 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip6 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step4, processStepExecutionListener5);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip6, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess13 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip6, false, 0L, 0L);
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener14 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip15 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip((com.amlinv.javasched.Step) processStepExecutionSlip6, processStepExecutionListener14);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess19 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip6, false, 0L, (long) '#');
        stepListSchedulerProcess0.addStep((com.amlinv.javasched.Step) processStepExecutionSlip6);
        // The following exception was thrown during execution in test generation
        try {
            processStepExecutionSlip6.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        stepListSchedulerProcess0.shutdown();
        com.amlinv.javasched.Step step2 = stepListSchedulerProcess0.getNextStep();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine3 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine();
        standardNonBlockingSchedulerEngine3.start();
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess5 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean6 = stepListSchedulerProcess5.isAutoStop();
        com.amlinv.javasched.Step step7 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener8 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip9 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step7, processStepExecutionListener8);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess12 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip9, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess16 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip9, false, 0L, 0L);
        stepListSchedulerProcess5.addStep((com.amlinv.javasched.Step) processStepExecutionSlip9);
        standardNonBlockingSchedulerEngine3.submit((com.amlinv.javasched.Step) processStepExecutionSlip9);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess19 = new com.amlinv.javasched.process.SingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip9);
        stepListSchedulerProcess0.addStep((com.amlinv.javasched.Step) processStepExecutionSlip9);
        org.junit.Assert.assertNull(step2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess5 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess9.setRepeatOnlyWhenSignalled(false);
        rateLimitedSingleRepeatingStepProcess9.signal();
        rateLimitedSingleRepeatingStepProcess9.signal();
        com.amlinv.javasched.Step step14 = rateLimitedSingleRepeatingStepProcess9.getNextStep();
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess17 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess(step14, (long) (-1), 1L);
        com.amlinv.javasched.Step step18 = rateLimitedSingleRepeatingStepProcess17.getNextStep();
        org.junit.Assert.assertNotNull(step14);
        org.junit.Assert.assertNotNull(step18);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean1 = stepListSchedulerProcess0.isAutoStop();
        int int2 = stepListSchedulerProcess0.getPendingStepCount();
        com.amlinv.javasched.Step step3 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener4 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip5 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step3, processStepExecutionListener4);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess8 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip5, (long) '4', (long) 100);
        stepListSchedulerProcess0.addStep((com.amlinv.javasched.Step) processStepExecutionSlip5);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip10 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) stepListSchedulerProcess0);
        com.amlinv.javasched.Step step11 = stepListSchedulerProcess0.getNextStep();
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler12 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory13 = roundRobinScheduler12.getStepExecutionSlipFactory();
        java.util.List<com.amlinv.javasched.SchedulerProcess> schedulerProcessList14 = roundRobinScheduler12.getProcessList();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine15 = roundRobinScheduler12.getBlockingEngine();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory16 = roundRobinScheduler12.getStepExecutionSlipFactory();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory17 = roundRobinScheduler12.getStepExecutionSlipFactory();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine18 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine();
        standardNonBlockingSchedulerEngine18.start();
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess20 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean21 = stepListSchedulerProcess20.isAutoStop();
        com.amlinv.javasched.Step step22 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener23 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip24 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step22, processStepExecutionListener23);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess27 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip24, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess31 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip24, false, 0L, 0L);
        stepListSchedulerProcess20.addStep((com.amlinv.javasched.Step) processStepExecutionSlip24);
        standardNonBlockingSchedulerEngine18.submit((com.amlinv.javasched.Step) processStepExecutionSlip24);
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener34 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip35 = processStepExecutionSlipFactory17.createProcessStepExecutionSlip((com.amlinv.javasched.Step) processStepExecutionSlip24, processStepExecutionListener34);
        stepListSchedulerProcess0.addStep((com.amlinv.javasched.Step) processStepExecutionSlip24);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(step11);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory13);
        org.junit.Assert.assertNotNull(schedulerProcessList14);
        org.junit.Assert.assertNotNull(blockingSchedulerEngine15);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory16);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(processStepExecutionSlip35);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess4 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step0, true);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip5 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess4);
        boolean boolean6 = singleRepeatingStepProcess4.isRepeatOnlyWhenSignalled();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        standardBlockingSchedulerEngine0.setMaximumProcessors((int) (byte) -1);
        int int3 = standardBlockingSchedulerEngine0.getNumIdleThread();
        long long4 = standardBlockingSchedulerEngine0.getTotalStepsStarted();
        org.slf4j.Logger logger5 = standardBlockingSchedulerEngine0.getLog();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(logger5);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine1 = null;
        roundRobinScheduler0.setBlockingEngine(blockingSchedulerEngine1);
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory3 = roundRobinScheduler0.getStepExecutionSlipFactory();
        com.amlinv.javasched.Step step4 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener5 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip6 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step4, processStepExecutionListener5);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip6, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess13 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip6, false, 0L, 0L);
        com.amlinv.javasched.Step step14 = rateLimitedSingleRepeatingStepProcess13.getNextStep();
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener15 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip16 = processStepExecutionSlipFactory3.createProcessStepExecutionSlip(step14, processStepExecutionListener15);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess17 = new com.amlinv.javasched.process.SingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip16);
        // The following exception was thrown during execution in test generation
        try {
            processStepExecutionSlip16.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory3);
        org.junit.Assert.assertNotNull(step14);
        org.junit.Assert.assertNotNull(processStepExecutionSlip16);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess5 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess8 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, 0L, 0L);
        boolean boolean9 = rateLimitedSingleRepeatingStepProcess8.isRepeatOnlyWhenSignalled();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine1 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine((int) (short) 100);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine1 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(100);
        int int2 = standardNonBlockingSchedulerEngine1.getProcessorCount();
        standardNonBlockingSchedulerEngine1.start();
        org.slf4j.Logger logger4 = standardNonBlockingSchedulerEngine1.getLog();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(logger4);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory standardProcessExecutionSlipFactory0 = new com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory();
        com.amlinv.javasched.Step step1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener2 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip3 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step1, processStepExecutionListener2);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess5 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step1, false);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip6 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess5);
        com.amlinv.javasched.Step step7 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener8 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip9 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step7, processStepExecutionListener8);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess12 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip9, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess16 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip9, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess16.setRepeatOnlyWhenSignalled(false);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip19 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) rateLimitedSingleRepeatingStepProcess16);
        standardProcessExecutionSlip19.waitUntilComplete((long) (short) 10, (long) ' ');
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip6);
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip19);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine1 = null;
        roundRobinScheduler0.setBlockingEngine(blockingSchedulerEngine1);
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory3 = roundRobinScheduler0.getStepExecutionSlipFactory();
        com.amlinv.javasched.Step step4 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener5 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip6 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step4, processStepExecutionListener5);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip6, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess13 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip6, false, 0L, 0L);
        com.amlinv.javasched.Step step14 = rateLimitedSingleRepeatingStepProcess13.getNextStep();
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener15 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip16 = processStepExecutionSlipFactory3.createProcessStepExecutionSlip(step14, processStepExecutionListener15);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess20 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess(step14, false, (long) (byte) 1, (long) (-1));
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener21 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip22 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step14, processStepExecutionListener21);
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory3);
        org.junit.Assert.assertNotNull(step14);
        org.junit.Assert.assertNotNull(processStepExecutionSlip16);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine();
        // The following exception was thrown during execution in test generation
        try {
            standardNonBlockingSchedulerEngine0.initiateShutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.amlinv.javasched.impl.RoundRobinScheduler roundRobinScheduler0 = new com.amlinv.javasched.impl.RoundRobinScheduler();
        com.amlinv.javasched.engine.ProcessStepExecutionSlipFactory processStepExecutionSlipFactory1 = roundRobinScheduler0.getStepExecutionSlipFactory();
        java.util.List<com.amlinv.javasched.SchedulerProcess> schedulerProcessList2 = roundRobinScheduler0.getProcessList();
        com.amlinv.javasched.BlockingSchedulerEngine blockingSchedulerEngine3 = roundRobinScheduler0.getBlockingEngine();
        java.util.List<com.amlinv.javasched.SchedulerProcess> schedulerProcessList4 = roundRobinScheduler0.getProcessList();
        org.junit.Assert.assertNotNull(processStepExecutionSlipFactory1);
        org.junit.Assert.assertNotNull(schedulerProcessList2);
        org.junit.Assert.assertNotNull(blockingSchedulerEngine3);
        org.junit.Assert.assertNotNull(schedulerProcessList4);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory standardProcessExecutionSlipFactory0 = new com.amlinv.javasched.engine.StandardProcessExecutionSlipFactory();
        com.amlinv.javasched.Step step1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener2 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip3 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step1, processStepExecutionListener2);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess5 = new com.amlinv.javasched.process.SingleRepeatingStepProcess(step1, false);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip6 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess5);
        com.amlinv.javasched.Step step7 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener8 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip9 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step7, processStepExecutionListener8);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess12 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip9, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess16 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip9, false, 0L, 0L);
        rateLimitedSingleRepeatingStepProcess16.setRepeatOnlyWhenSignalled(false);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip19 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) rateLimitedSingleRepeatingStepProcess16);
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess20 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean21 = stepListSchedulerProcess20.isAutoStop();
        com.amlinv.javasched.Step step22 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener23 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip24 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step22, processStepExecutionListener23);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess27 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip24, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess31 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip24, false, 0L, 0L);
        stepListSchedulerProcess20.addStep((com.amlinv.javasched.Step) processStepExecutionSlip24);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess34 = new com.amlinv.javasched.process.SingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip24, true);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip35 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) singleRepeatingStepProcess34);
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess36 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean37 = stepListSchedulerProcess36.isAutoStop();
        int int38 = stepListSchedulerProcess36.getPendingStepCount();
        com.amlinv.javasched.Step step39 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener40 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip41 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step39, processStepExecutionListener40);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess44 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip41, (long) '4', (long) 100);
        stepListSchedulerProcess36.addStep((com.amlinv.javasched.Step) processStepExecutionSlip41);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip46 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) stepListSchedulerProcess36);
        com.amlinv.javasched.Step step47 = stepListSchedulerProcess36.getNextStep();
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip48 = standardProcessExecutionSlipFactory0.createSlip((com.amlinv.javasched.SchedulerProcess) stepListSchedulerProcess36);
        standardProcessExecutionSlip48.waitUntilComplete((long) (byte) 10, (long) (byte) 10);
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip6);
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(step47);
        org.junit.Assert.assertNotNull(standardProcessExecutionSlip48);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        stepListSchedulerProcess0.shutdown();
        int int2 = stepListSchedulerProcess0.getPendingStepCount();
        stepListSchedulerProcess0.waitUntilFinished();
        com.amlinv.javasched.Step step4 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener5 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip6 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step4, processStepExecutionListener5);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip6, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess13 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip6, false, 0L, 0L);
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener14 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip15 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip((com.amlinv.javasched.Step) processStepExecutionSlip6, processStepExecutionListener14);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess19 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip6, false, 0L, (long) '#');
        stepListSchedulerProcess0.addStep((com.amlinv.javasched.Step) processStepExecutionSlip6);
        com.amlinv.javasched.process.SingleRepeatingStepProcess singleRepeatingStepProcess21 = new com.amlinv.javasched.process.SingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.amlinv.javasched.Step step0 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener1 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip2 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step0, processStepExecutionListener1);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess5 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess8 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, 0L, 0L);
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener9 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip10 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip((com.amlinv.javasched.Step) processStepExecutionSlip2, processStepExecutionListener9);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess14 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip2, true, (long) (-1), 0L);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.amlinv.javasched.SchedulerProcess schedulerProcess0 = null;
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip1 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip(schedulerProcess0);
        com.amlinv.javasched.SchedulerProcess schedulerProcess2 = standardProcessExecutionSlip1.getSchedulerProcess();
        standardProcessExecutionSlip1.waitUntilComplete((-1L), (long) '#');
        standardProcessExecutionSlip1.processStopped();
        standardProcessExecutionSlip1.waitUntilComplete();
        standardProcessExecutionSlip1.processStopped();
        standardProcessExecutionSlip1.waitUntilComplete();
        org.junit.Assert.assertNull(schedulerProcess2);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean1 = stepListSchedulerProcess0.isAutoStop();
        com.amlinv.javasched.Step step2 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener3 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip4 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step2, processStepExecutionListener3);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess7 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip4, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess11 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip4, false, 0L, 0L);
        stepListSchedulerProcess0.addStep((com.amlinv.javasched.Step) processStepExecutionSlip4);
        stepListSchedulerProcess0.setAutoStop(true);
        com.amlinv.javasched.Step step15 = stepListSchedulerProcess0.getNextStep();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine17 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine((int) ' ');
        org.slf4j.Logger logger18 = standardNonBlockingSchedulerEngine17.getLog();
        stepListSchedulerProcess0.setLog(logger18);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(step15);
        org.junit.Assert.assertNotNull(logger18);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine1 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(0);
        int int2 = standardNonBlockingSchedulerEngine1.getProcessorCount();
        // The following exception was thrown during execution in test generation
        try {
            standardNonBlockingSchedulerEngine1.initiateShutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not yet started");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine0 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine2 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(10);
        org.slf4j.Logger logger3 = standardNonBlockingSchedulerEngine2.getLog();
        standardBlockingSchedulerEngine0.setLog(logger3);
        int int5 = standardBlockingSchedulerEngine0.getMaximumProcessors();
        org.junit.Assert.assertNotNull(logger3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        stepListSchedulerProcess0.shutdown();
        int int2 = stepListSchedulerProcess0.getPendingStepCount();
        stepListSchedulerProcess0.waitUntilFinished();
        com.amlinv.javasched.Step step4 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener5 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip6 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step4, processStepExecutionListener5);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess9 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip6, (long) '4', (long) 100);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess13 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip6, false, 0L, 0L);
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener14 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip15 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip((com.amlinv.javasched.Step) processStepExecutionSlip6, processStepExecutionListener14);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess19 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip6, false, 0L, (long) '#');
        stepListSchedulerProcess0.addStep((com.amlinv.javasched.Step) processStepExecutionSlip6);
        boolean boolean21 = stepListSchedulerProcess0.isAutoStop();
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine22 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        standardBlockingSchedulerEngine22.setMaximumProcessors((int) (byte) -1);
        int int25 = standardBlockingSchedulerEngine22.getNumIdleThread();
        org.slf4j.Logger logger26 = standardBlockingSchedulerEngine22.getLog();
        com.amlinv.javasched.impl.StandardBlockingSchedulerEngine standardBlockingSchedulerEngine27 = new com.amlinv.javasched.impl.StandardBlockingSchedulerEngine();
        standardBlockingSchedulerEngine27.setMaximumProcessors((int) (byte) -1);
        int int30 = standardBlockingSchedulerEngine27.getNumIdleThread();
        long long31 = standardBlockingSchedulerEngine27.getTotalStepsStarted();
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine33 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine(10);
        org.slf4j.Logger logger34 = standardNonBlockingSchedulerEngine33.getLog();
        standardBlockingSchedulerEngine27.setLog(logger34);
        standardBlockingSchedulerEngine22.setLog(logger34);
        stepListSchedulerProcess0.setLog(logger34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(logger26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(logger34);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine standardNonBlockingSchedulerEngine1 = new com.amlinv.javasched.impl.StandardNonBlockingSchedulerEngine((int) (byte) 1);
        int int2 = standardNonBlockingSchedulerEngine1.getProcessorCount();
        standardNonBlockingSchedulerEngine1.start();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.amlinv.javasched.process.StepListSchedulerProcess stepListSchedulerProcess0 = new com.amlinv.javasched.process.StepListSchedulerProcess();
        boolean boolean1 = stepListSchedulerProcess0.isAutoStop();
        int int2 = stepListSchedulerProcess0.getPendingStepCount();
        com.amlinv.javasched.Step step3 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionListener processStepExecutionListener4 = null;
        com.amlinv.javasched.engine.ProcessStepExecutionSlip processStepExecutionSlip5 = new com.amlinv.javasched.engine.ProcessStepExecutionSlip(step3, processStepExecutionListener4);
        com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess rateLimitedSingleRepeatingStepProcess8 = new com.amlinv.javasched.process.RateLimitedSingleRepeatingStepProcess((com.amlinv.javasched.Step) processStepExecutionSlip5, (long) '4', (long) 100);
        stepListSchedulerProcess0.addStep((com.amlinv.javasched.Step) processStepExecutionSlip5);
        com.amlinv.javasched.engine.StandardProcessExecutionSlip standardProcessExecutionSlip10 = new com.amlinv.javasched.engine.StandardProcessExecutionSlip((com.amlinv.javasched.SchedulerProcess) stepListSchedulerProcess0);
        com.amlinv.javasched.SchedulerProcess schedulerProcess11 = standardProcessExecutionSlip10.getSchedulerProcess();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(schedulerProcess11);
    }
}

