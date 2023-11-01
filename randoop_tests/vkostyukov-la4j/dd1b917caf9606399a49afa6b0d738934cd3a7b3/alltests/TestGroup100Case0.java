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
        org.la4j.LinearAlgebra.InverterFactory inverterFactory0 = org.la4j.LinearAlgebra.INVERTER;
        org.junit.Assert.assertNotNull(inverterFactory0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix1 = org.la4j.Matrix.fromMatrixMarket(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.util.Random random3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.sparse.CCSMatrix cCSMatrix4 = org.la4j.matrix.sparse.CCSMatrix.random((int) 'a', (int) (short) 1, 0.0d, random3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.util.Random random3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.SparseMatrix sparseMatrix4 = org.la4j.matrix.SparseMatrix.random((int) '4', (int) (byte) 1, 100.0d, random3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The density value should be between 0 and 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        int int0 = org.la4j.LinearAlgebra.ROUND_FACTOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 52 + "'", int0 == 52);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        org.la4j.LinearAlgebra.DecompositorFactory decompositorFactory0 = org.la4j.LinearAlgebra.RAW_LU;
        org.la4j.Matrix matrix1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.decomposition.MatrixDecompositor matrixDecompositor2 = decompositorFactory0.create(matrix1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(decompositorFactory0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        org.la4j.Matrix matrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.decomposition.RawLUDecompositor rawLUDecompositor1 = new org.la4j.decomposition.RawLUDecompositor(matrix0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = new org.la4j.matrix.sparse.CRSMatrix((int) '4', 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cardinality should be less then or equal to capacity: 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector1 = org.la4j.Vector.fromArray(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        org.la4j.Matrix matrix0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.decomposition.EigenDecompositor eigenDecompositor1 = new org.la4j.decomposition.EigenDecompositor(matrix0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        org.la4j.LinearAlgebra.DecompositorFactory decompositorFactory0 = org.la4j.LinearAlgebra.LU;
        org.junit.Assert.assertNotNull(decompositorFactory0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        org.la4j.LinearAlgebra.SolverFactory solverFactory0 = org.la4j.LinearAlgebra.SOLVER;
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.linear.LinearSystemSolver linearSystemSolver5 = solverFactory0.create((org.la4j.Matrix) rowMajorSparseMatrix4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Underdetermined system of linear equations can not be solved.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(solverFactory0);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        org.la4j.LinearAlgebra.SolverFactory solverFactory0 = org.la4j.LinearAlgebra.SolverFactory.SQUARE_ROOT;
        org.junit.Assert.assertNotNull(solverFactory0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.util.Random random1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.vector.dense.BasicVector basicVector2 = org.la4j.vector.dense.BasicVector.random((int) ' ', random1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.util.Random random3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.random((int) (byte) 1, 0, (double) 0, random3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Vector vector5 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str6 = vector5.toCSV();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector7 = rowMajorSparseMatrix3.multiply(vector5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given vector should have the same length as number of columns in the given matrix: 10 does not equal to 35.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertNotNull(vector5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000" + "'", str6, "1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.vector.dense.BasicVector basicVector1 = org.la4j.vector.dense.BasicVector.fromCSV("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double7 = rowMajorSparseMatrix3.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix10 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix14 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double18 = rowMajorSparseMatrix14.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix19 = rowMajorSparseMatrix14.toSparseMatrix();
        org.la4j.Matrix matrix22 = org.la4j.Matrix.diagonal((int) (short) 10, (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix23 = org.la4j.matrix.ColumnMajorSparseMatrix.block((org.la4j.Matrix) rowMajorSparseMatrix3, (org.la4j.Matrix) cCSMatrix10, (org.la4j.Matrix) rowMajorSparseMatrix14, matrix22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sides of blocks are incompatible!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(cCSMatrix10);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix14);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix19);
        org.junit.Assert.assertNotNull(matrix22);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = rowMajorSparseMatrix3.get(100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Row '100' is invalid.");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        org.la4j.matrix.functor.MatrixFunction matrixFunction1 = org.la4j.Matrices.asModFunction(0.0d);
        org.junit.Assert.assertNotNull(matrixFunction1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        org.la4j.matrix.functor.MatrixPredicate matrixPredicate0 = org.la4j.Matrices.LOWER_TRIANGULAR_MATRIX;
        org.junit.Assert.assertNotNull(matrixPredicate0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.sparse.CCSMatrix cCSMatrix1 = org.la4j.matrix.sparse.CCSMatrix.fromCSV("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double7 = rowMajorSparseMatrix3.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix8 = rowMajorSparseMatrix3.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct9 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean10 = sparseMatrix8.equals((java.lang.Object) ooPlaceOuterProduct9);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator12 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = sparseMatrix8.foldColumn((int) 'a', vectorAccumulator12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Column '97' is invalid.");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(vectorAccumulator12);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        int int0 = org.la4j.Vectors.ROUND_FACTOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 52 + "'", int0 == 52);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        double[] doubleArray6 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray13 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray20 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray27 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray34 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray35 = new double[][] { doubleArray6, doubleArray13, doubleArray20, doubleArray27, doubleArray34 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix36 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray35);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix39 = basic2DMatrix36.blankOfShape((int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertNotNull(basic2DMatrix36);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        org.la4j.vector.dense.BasicVector basicVector1 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        int int2 = basicVector1.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.util.Random random2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix3 = org.la4j.matrix.ColumnMajorSparseMatrix.randomSymmetric((int) (short) 100, (double) 'a', random2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cardinality should be less then or equal to capacity: 10000.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        org.la4j.vector.functor.VectorPredicate vectorPredicate0 = org.la4j.Vectors.ZERO_VECTOR;
        org.junit.Assert.assertNotNull(vectorPredicate0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random2 = null;
        org.la4j.vector.DenseVector denseVector3 = org.la4j.vector.DenseVector.random(0, random2);
        java.util.Random random5 = null;
        org.la4j.vector.DenseVector denseVector6 = org.la4j.vector.DenseVector.random(0, random5);
        org.la4j.Matrix matrix7 = ooPlaceOuterProduct0.apply(denseVector3, denseVector6);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector9 = denseVector3.sliceLeft((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(denseVector3);
        org.junit.Assert.assertNotNull(denseVector6);
        org.junit.Assert.assertNotNull(matrix7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double7 = rowMajorSparseMatrix3.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix8 = rowMajorSparseMatrix3.toSparseMatrix();
        org.la4j.vector.functor.VectorProcedure vectorProcedure10 = null;
        // The following exception was thrown during execution in test generation
        try {
            sparseMatrix8.eachInRow((int) (short) 100, vectorProcedure10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double7 = rowMajorSparseMatrix3.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix8 = rowMajorSparseMatrix3.toSparseMatrix();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.linear.SweepSolver sweepSolver9 = new org.la4j.linear.SweepSolver((org.la4j.Matrix) rowMajorSparseMatrix3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given coefficient matrix can not be used with this solver.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix8);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        java.lang.String str0 = org.la4j.LinearAlgebra.NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "la4j" + "'", str0, "la4j");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        double[] doubleArray6 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray13 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray20 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray27 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray34 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray35 = new double[][] { doubleArray6, doubleArray13, doubleArray20, doubleArray27, doubleArray34 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix36 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray35);
        basic2DMatrix36.setAll((double) 100);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix43 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double47 = rowMajorSparseMatrix43.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix48 = rowMajorSparseMatrix43.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate49 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean50 = sparseMatrix48.is(advancedMatrixPredicate49);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator52 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double53 = sparseMatrix48.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator52);
        // The following exception was thrown during execution in test generation
        try {
            double double54 = basic2DMatrix36.foldColumn((int) (short) 10, vectorAccumulator52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertNotNull(basic2DMatrix36);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix43);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix48);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(vectorAccumulator52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double7 = rowMajorSparseMatrix3.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix8 = rowMajorSparseMatrix3.toSparseMatrix();
        org.la4j.vector.functor.VectorProcedure vectorProcedure10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rowMajorSparseMatrix3.eachInRow(0, vectorProcedure10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix8);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        org.la4j.Vector vector1 = org.la4j.Vector.unit((int) (short) 10);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct2 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random4 = null;
        org.la4j.vector.DenseVector denseVector5 = org.la4j.vector.DenseVector.random(0, random4);
        java.util.Random random7 = null;
        org.la4j.vector.DenseVector denseVector8 = org.la4j.vector.DenseVector.random(0, random7);
        org.la4j.Matrix matrix9 = ooPlaceOuterProduct2.apply(denseVector5, denseVector8);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector10 = vector1.subtract((org.la4j.Vector) denseVector8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given vectors should have the same length: 10 does not equal to 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector1);
        org.junit.Assert.assertNotNull(denseVector5);
        org.junit.Assert.assertNotNull(denseVector8);
        org.junit.Assert.assertNotNull(matrix9);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix2 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix6 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix7 = rowMajorSparseMatrix6.removeLastRow();
        double double9 = matrix7.maxInColumn((int) (byte) 0);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix13 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix14 = rowMajorSparseMatrix13.removeLastRow();
        double double18 = rowMajorSparseMatrix13.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix22 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double26 = rowMajorSparseMatrix22.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix27 = rowMajorSparseMatrix22.toSparseMatrix();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix28 = org.la4j.matrix.ColumnMajorSparseMatrix.block((org.la4j.Matrix) basic2DMatrix2, matrix7, (org.la4j.Matrix) rowMajorSparseMatrix13, (org.la4j.Matrix) sparseMatrix27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sides of blocks are incompatible!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(basic2DMatrix2);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix6);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.NEGATIVE_INFINITY + "'", double9 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix13);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix27);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        java.lang.String str0 = org.la4j.LinearAlgebra.VERSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "0.5.5" + "'", str0, "0.5.5");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random2 = null;
        org.la4j.vector.DenseVector denseVector3 = org.la4j.vector.DenseVector.random(0, random2);
        java.util.Random random5 = null;
        org.la4j.vector.DenseVector denseVector6 = org.la4j.vector.DenseVector.random(0, random5);
        org.la4j.Matrix matrix7 = ooPlaceOuterProduct0.apply(denseVector3, denseVector6);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = matrix7.get((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(denseVector3);
        org.junit.Assert.assertNotNull(denseVector6);
        org.junit.Assert.assertNotNull(matrix7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        org.la4j.Vector vector1 = org.la4j.Vector.unit((int) (short) 10);
        double double2 = vector1.min();
        org.junit.Assert.assertNotNull(vector1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        org.la4j.operation.VectorVectorOperation<org.la4j.Vector> vectorVectorVectorOperation0 = org.la4j.LinearAlgebra.OO_PLACE_VECTORS_SUBTRACTION;
        org.junit.Assert.assertNotNull(vectorVectorVectorOperation0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator3 = cCSMatrix2.nonZeroColumnMajorIterator();
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation4 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix7 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix8 = cCSMatrix2.apply(matrixMatrixMatrixOperation4, (org.la4j.Matrix) cRSMatrix7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Row '10' is invalid.");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator3);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation4);
        org.junit.Assert.assertNotNull(cRSMatrix7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = new org.la4j.matrix.sparse.CRSMatrix((int) (byte) -1, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong matrix dimensions: -1x100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix4 = rowMajorSparseMatrix3.removeLastRow();
        double double6 = matrix4.maxInColumn((int) (byte) 0);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix10 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix11 = rowMajorSparseMatrix10.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix14 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix17 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.sparse.CRSMatrix cRSMatrix18 = org.la4j.matrix.sparse.CRSMatrix.block(matrix4, matrix11, (org.la4j.Matrix) denseMatrix14, (org.la4j.Matrix) cCSMatrix17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sides of blocks are incompatible!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix10);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(denseMatrix14);
        org.junit.Assert.assertNotNull(cCSMatrix17);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator3 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray4 = cCSMatrix2.foldRows(vectorAccumulator3);
        org.la4j.vector.functor.VectorProcedure vectorProcedure6 = null;
        // The following exception was thrown during execution in test generation
        try {
            cCSMatrix2.eachNonZeroInColumn(0, vectorProcedure6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertNotNull(vectorAccumulator3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        cRSMatrix2.setRow(0, (double) '4');
        org.la4j.vector.functor.VectorProcedure vectorProcedure7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cRSMatrix2.eachNonZeroInRow((int) (short) -1, vectorProcedure7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cRSMatrix2);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.zero(52, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong matrix dimensions: 52x-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = new org.la4j.matrix.sparse.CCSMatrix((int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong matrix dimensions: -1x-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        org.la4j.vector.VectorFactory<?>[] wildcardVectorFactoryArray0 = org.la4j.Vectors.FACTORIES;
        org.junit.Assert.assertNotNull(wildcardVectorFactoryArray0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double7 = rowMajorSparseMatrix3.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix8 = rowMajorSparseMatrix3.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct9 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean10 = sparseMatrix8.equals((java.lang.Object) ooPlaceOuterProduct9);
        org.la4j.vector.SparseVector sparseVector11 = null;
        org.la4j.vector.SparseVector sparseVector12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix13 = ooPlaceOuterProduct9.apply(sparseVector11, sparseVector12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        java.util.Random random1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix2 = org.la4j.matrix.dense.Basic1DMatrix.randomSymmetric((int) (short) 10, random1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        org.la4j.LinearAlgebra.SolverFactory solverFactory0 = org.la4j.LinearAlgebra.SolverFactory.SWEEP;
        org.junit.Assert.assertNotNull(solverFactory0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean3 = cCSMatrix2.isRowMajor();
        org.la4j.Matrix matrix6 = cCSMatrix2.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix7 = matrix6.toRowMajorSparseMatrix();
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(matrix6);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        double[][] doubleArray0 = new double[][] {};
        org.la4j.matrix.DenseMatrix denseMatrix1 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray0);
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation2 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray9 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray16 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray23 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray30 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray37 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray38 = new double[][] { doubleArray9, doubleArray16, doubleArray23, doubleArray30, doubleArray37 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix39 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray38);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation40 = matrixMatrixMatrixOperation2.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix39);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix41 = denseMatrix1.apply(matrixMatrixOperation40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(denseMatrix1);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation2);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertNotNull(basic2DMatrix39);
        org.junit.Assert.assertNotNull(matrixMatrixOperation40);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.util.Random random1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix2 = org.la4j.matrix.dense.Basic1DMatrix.randomSymmetric((-1), random1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong matrix dimensions: -1x-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.vector.sparse.CompressedVector compressedVector2 = new org.la4j.vector.sparse.CompressedVector((int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cardinality should be positive: -1.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        org.la4j.operation.VectorVectorOperation<org.la4j.Vector> vectorVectorVectorOperation0 = org.la4j.LinearAlgebra.OO_PLACE_VECTORS_ADDITION;
        org.la4j.vector.DenseVector denseVector1 = null;
        org.la4j.operation.VectorOperation<org.la4j.Vector> vectorVectorOperation2 = vectorVectorVectorOperation0.partiallyApply(denseVector1);
        org.junit.Assert.assertNotNull(vectorVectorVectorOperation0);
        org.junit.Assert.assertNotNull(vectorVectorOperation2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        org.la4j.LinearAlgebra.DecompositorFactory decompositorFactory0 = org.la4j.LinearAlgebra.DecompositorFactory.SVD;
        org.junit.Assert.assertNotNull(decompositorFactory0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        org.la4j.operation.VectorVectorOperation<java.lang.Double> doubleVectorVectorOperation0 = org.la4j.LinearAlgebra.OO_PLACE_INNER_PRODUCT;
        org.junit.Assert.assertNotNull(doubleVectorVectorOperation0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.vector.SparseVector sparseVector1 = null;
        org.la4j.vector.dense.BasicVector basicVector3 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector4 = basicVector3.copy();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix5 = ooPlaceOuterProduct0.apply(sparseVector1, (org.la4j.vector.DenseVector) basicVector3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix4 = rowMajorSparseMatrix3.removeLastRow();
        double double8 = rowMajorSparseMatrix3.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        org.la4j.Vector vector9 = rowMajorSparseMatrix3.toRowVector();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate10 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix13 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        boolean boolean14 = advancedMatrixPredicate10.test((org.la4j.Matrix) columnMajorSparseMatrix13);
        org.la4j.vector.functor.VectorFunction vectorFunction16 = null;
        org.la4j.Matrix matrix17 = columnMajorSparseMatrix13.transformRow(0, vectorFunction16);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix20 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator21 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray22 = cCSMatrix20.foldRows(vectorAccumulator21);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix26 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix27 = rowMajorSparseMatrix26.removeLastRow();
        double double31 = rowMajorSparseMatrix26.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        org.la4j.Vector vector32 = rowMajorSparseMatrix26.toRowVector();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.SparseMatrix sparseMatrix33 = org.la4j.matrix.SparseMatrix.block((org.la4j.Matrix) rowMajorSparseMatrix3, (org.la4j.Matrix) columnMajorSparseMatrix13, (org.la4j.Matrix) cCSMatrix20, (org.la4j.Matrix) rowMajorSparseMatrix26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sides of blocks are incompatible!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(vector9);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate10);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(matrix17);
        org.junit.Assert.assertNotNull(cCSMatrix20);
        org.junit.Assert.assertNotNull(vectorAccumulator21);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertNotNull(vector32);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        org.la4j.vector.dense.BasicVector basicVector1 = org.la4j.vector.dense.BasicVector.unit((int) (short) 0);
        org.junit.Assert.assertNotNull(basicVector1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        org.la4j.vector.functor.VectorFunction vectorFunction1 = org.la4j.Vectors.asMinusFunction((double) (byte) 100);
        org.junit.Assert.assertNotNull(vectorFunction1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        org.la4j.Matrix matrix0 = null;
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix5 = rowMajorSparseMatrix4.removeLastRow();
        double double9 = rowMajorSparseMatrix4.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        org.la4j.Vector vector10 = rowMajorSparseMatrix4.toRowVector();
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation11 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation12 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray19 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray26 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray33 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray40 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray47 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray48 = new double[][] { doubleArray19, doubleArray26, doubleArray33, doubleArray40, doubleArray47 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix49 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray48);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation50 = matrixMatrixMatrixOperation12.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix49);
        org.la4j.Matrix matrix52 = basic2DMatrix49.blankOfColumns(52);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix56 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix57 = rowMajorSparseMatrix56.removeLastRow();
        org.la4j.matrix.functor.MatrixFunction matrixFunction59 = null;
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator60 = org.la4j.Matrices.asSumFunctionAccumulator((double) (-1), matrixFunction59);
        double double61 = matrix57.fold(matrixAccumulator60);
        double double62 = matrix57.manhattanNorm();
        matrixMatrixMatrixOperation11.ensureApplicableTo(matrix52, matrix57);
        org.la4j.matrix.DenseMatrix denseMatrix65 = org.la4j.matrix.DenseMatrix.identity(100);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.sparse.CRSMatrix cRSMatrix66 = org.la4j.matrix.sparse.CRSMatrix.block(matrix0, (org.la4j.Matrix) rowMajorSparseMatrix4, matrix57, (org.la4j.Matrix) denseMatrix65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix4);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(vector10);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation11);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation12);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(basic2DMatrix49);
        org.junit.Assert.assertNotNull(matrixMatrixOperation50);
        org.junit.Assert.assertNotNull(matrix52);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix56);
        org.junit.Assert.assertNotNull(matrix57);
        org.junit.Assert.assertNotNull(matrixAccumulator60);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1.0d) + "'", double61 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(denseMatrix65);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        double[][] doubleArray0 = new double[][] {};
        org.la4j.matrix.DenseMatrix denseMatrix1 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray0);
        org.la4j.Matrix matrix4 = org.la4j.Matrix.zero(100, 52);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix7 = org.la4j.matrix.ColumnMajorSparseMatrix.diagonal((int) (byte) 10, (double) 0L);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix11 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix12 = rowMajorSparseMatrix11.removeLastRow();
        double double16 = rowMajorSparseMatrix11.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        org.la4j.Vector vector17 = rowMajorSparseMatrix11.toRowVector();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix18 = org.la4j.matrix.RowMajorSparseMatrix.block((org.la4j.Matrix) denseMatrix1, matrix4, (org.la4j.Matrix) columnMajorSparseMatrix7, (org.la4j.Matrix) rowMajorSparseMatrix11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sides of blocks are incompatible!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(denseMatrix1);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix7);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix11);
        org.junit.Assert.assertNotNull(matrix12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(vector17);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.vector.DenseVector denseVector1 = org.la4j.vector.DenseVector.fromMatrixMarket(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix4 = rowMajorSparseMatrix3.removeLastRow();
        org.la4j.matrix.functor.MatrixFunction matrixFunction6 = null;
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator7 = org.la4j.Matrices.asSumFunctionAccumulator((double) (-1), matrixFunction6);
        double double8 = matrix4.fold(matrixAccumulator7);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix10 = matrix4.removeRow((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Illegal row number, must be 0..-1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertNotNull(matrixAccumulator7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.sparse.CCSMatrix cCSMatrix6 = org.la4j.matrix.sparse.CCSMatrix.fromBinary(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not decode CCSMatrix from the given byte array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 10, 100, 10]");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        org.la4j.Vector vector1 = org.la4j.Vector.unit((int) (short) 10);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct2 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix7 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator8 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray9 = cCSMatrix7.foldRows(vectorAccumulator8);
        org.la4j.matrix.DenseMatrix denseMatrix10 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray9);
        org.la4j.vector.dense.BasicVector basicVector11 = new org.la4j.vector.dense.BasicVector(doubleArray9);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix16 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator17 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray18 = cCSMatrix16.foldRows(vectorAccumulator17);
        org.la4j.matrix.DenseMatrix denseMatrix19 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray18);
        org.la4j.vector.dense.BasicVector basicVector20 = new org.la4j.vector.dense.BasicVector(doubleArray18);
        ooPlaceOuterProduct2.ensureApplicableTo((org.la4j.Vector) basicVector11, (org.la4j.Vector) basicVector20);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = vector1.innerProduct((org.la4j.Vector) basicVector20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given vectors should have the same length: 10 does not equal to 52.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector1);
        org.junit.Assert.assertNotNull(cCSMatrix7);
        org.junit.Assert.assertNotNull(vectorAccumulator8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix10);
        org.junit.Assert.assertNotNull(cCSMatrix16);
        org.junit.Assert.assertNotNull(vectorAccumulator17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix19);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation0 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray7 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray14 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray21 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray28 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray35 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray36 = new double[][] { doubleArray7, doubleArray14, doubleArray21, doubleArray28, doubleArray35 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix37 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray36);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation38 = matrixMatrixMatrixOperation0.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix37);
        org.la4j.Matrix matrix40 = basic2DMatrix37.blankOfColumns(52);
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate41 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean42 = matrix40.is(advancedMatrixPredicate41);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(basic2DMatrix37);
        org.junit.Assert.assertNotNull(matrixMatrixOperation38);
        org.junit.Assert.assertNotNull(matrix40);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix1 = org.la4j.matrix.RowMajorSparseMatrix.fromMatrixMarket(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        org.la4j.LinearAlgebra.SolverFactory solverFactory0 = org.la4j.LinearAlgebra.SQUARE_ROOT;
        org.junit.Assert.assertNotNull(solverFactory0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation0 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray7 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray14 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray21 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray28 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray35 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray36 = new double[][] { doubleArray7, doubleArray14, doubleArray21, doubleArray28, doubleArray35 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix37 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray36);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation38 = matrixMatrixMatrixOperation0.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix37);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.decomposition.RawQRDecompositor rawQRDecompositor39 = new org.la4j.decomposition.RawQRDecompositor((org.la4j.Matrix) basic2DMatrix37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given matrix can not be used with this decompositor.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(basic2DMatrix37);
        org.junit.Assert.assertNotNull(matrixMatrixOperation38);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation0 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation1 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray8 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray15 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray22 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray29 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray36 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray37 = new double[][] { doubleArray8, doubleArray15, doubleArray22, doubleArray29, doubleArray36 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix38 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray37);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation39 = matrixMatrixMatrixOperation1.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix38);
        org.la4j.Matrix matrix41 = basic2DMatrix38.blankOfColumns(52);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix45 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix46 = rowMajorSparseMatrix45.removeLastRow();
        org.la4j.matrix.functor.MatrixFunction matrixFunction48 = null;
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator49 = org.la4j.Matrices.asSumFunctionAccumulator((double) (-1), matrixFunction48);
        double double50 = matrix46.fold(matrixAccumulator49);
        double double51 = matrix46.manhattanNorm();
        matrixMatrixMatrixOperation0.ensureApplicableTo(matrix41, matrix46);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix56 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double60 = rowMajorSparseMatrix56.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix61 = rowMajorSparseMatrix56.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate62 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean63 = sparseMatrix61.is(advancedMatrixPredicate62);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator65 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double66 = sparseMatrix61.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator65);
        org.la4j.vector.functor.VectorProcedure vectorProcedure67 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator65);
        double[] doubleArray68 = matrix41.foldRows(vectorAccumulator65);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation0);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation1);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertNotNull(basic2DMatrix38);
        org.junit.Assert.assertNotNull(matrixMatrixOperation39);
        org.junit.Assert.assertNotNull(matrix41);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix45);
        org.junit.Assert.assertNotNull(matrix46);
        org.junit.Assert.assertNotNull(matrixAccumulator49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix56);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix61);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(vectorAccumulator65);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertNotNull(vectorProcedure67);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double7 = rowMajorSparseMatrix3.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix8 = rowMajorSparseMatrix3.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate9 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean10 = sparseMatrix8.is(advancedMatrixPredicate9);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator12 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double13 = sparseMatrix8.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator12);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = sparseMatrix8.getOrElse(52, (int) (short) -1, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Row '52' is invalid.");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix8);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(vectorAccumulator12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation0 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray7 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray14 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray21 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray28 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray35 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray36 = new double[][] { doubleArray7, doubleArray14, doubleArray21, doubleArray28, doubleArray35 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix37 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray36);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation38 = matrixMatrixMatrixOperation0.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix37);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.decomposition.LUDecompositor lUDecompositor39 = new org.la4j.decomposition.LUDecompositor((org.la4j.Matrix) basic2DMatrix37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given matrix can not be used with this decompositor.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(basic2DMatrix37);
        org.junit.Assert.assertNotNull(matrixMatrixOperation38);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        org.la4j.Matrix matrix2 = org.la4j.Matrix.diagonal((int) (short) 10, (double) '#');
        org.la4j.Vector vector3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector4 = matrix2.multiply(vector3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrix2);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double7 = rowMajorSparseMatrix3.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix8 = rowMajorSparseMatrix3.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate9 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean10 = sparseMatrix8.is(advancedMatrixPredicate9);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator12 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double13 = sparseMatrix8.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator12);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.decomposition.RawQRDecompositor rawQRDecompositor14 = new org.la4j.decomposition.RawQRDecompositor((org.la4j.Matrix) sparseMatrix8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given matrix can not be used with this decompositor.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix8);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(vectorAccumulator12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.decomposition.CholeskyDecompositor choleskyDecompositor3 = new org.la4j.decomposition.CholeskyDecompositor((org.la4j.Matrix) cCSMatrix2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given matrix can not be used with this decompositor.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix2);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation0 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray7 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray14 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray21 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray28 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray35 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray36 = new double[][] { doubleArray7, doubleArray14, doubleArray21, doubleArray28, doubleArray35 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix37 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray36);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation38 = matrixMatrixMatrixOperation0.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix37);
        double[][] doubleArray39 = new double[][] {};
        org.la4j.matrix.DenseMatrix denseMatrix40 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray39);
        double[] doubleArray47 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray54 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray61 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray68 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray75 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray76 = new double[][] { doubleArray47, doubleArray54, doubleArray61, doubleArray68, doubleArray75 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix77 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray76);
        basic2DMatrix77.setAll((double) 100);
        org.la4j.Matrix matrix80 = matrixMatrixMatrixOperation0.apply(denseMatrix40, (org.la4j.matrix.DenseMatrix) basic2DMatrix77);
        double double81 = matrix80.diagonalProduct();
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(basic2DMatrix37);
        org.junit.Assert.assertNotNull(matrixMatrixOperation38);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertNotNull(denseMatrix40);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertNotNull(basic2DMatrix77);
        org.junit.Assert.assertNotNull(matrix80);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 1.0E10d + "'", double81 == 1.0E10d);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double7 = rowMajorSparseMatrix3.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix8 = rowMajorSparseMatrix3.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct9 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean10 = sparseMatrix8.equals((java.lang.Object) ooPlaceOuterProduct9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = sparseMatrix8.isZeroAt(52, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector1 = org.la4j.Vector.fromMatrixMarket(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator0 = org.la4j.Matrices.mkInfinityNormAccumulator();
        double double1 = matrixAccumulator0.accumulate();
        double double2 = matrixAccumulator0.accumulate();
        org.junit.Assert.assertNotNull(matrixAccumulator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        org.la4j.matrix.functor.MatrixFunction matrixFunction0 = org.la4j.Matrices.INV_FUNCTION;
        org.junit.Assert.assertNotNull(matrixFunction0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        org.la4j.vector.functor.VectorFunction vectorFunction0 = org.la4j.Vectors.DEC_FUNCTION;
        org.junit.Assert.assertNotNull(vectorFunction0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double7 = rowMajorSparseMatrix3.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix8 = rowMajorSparseMatrix3.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate9 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean10 = sparseMatrix8.is(advancedMatrixPredicate9);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator12 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double13 = sparseMatrix8.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator12);
        org.la4j.vector.functor.VectorProcedure vectorProcedure14 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator12);
        // The following exception was thrown during execution in test generation
        try {
            vectorProcedure14.apply(0, Double.NEGATIVE_INFINITY);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix8);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(vectorAccumulator12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(vectorProcedure14);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.sparse.CCSMatrix> cCSMatrixMatrixFactory0 = org.la4j.Matrices.SPARSE_COLUMN_MAJOR;
        org.junit.Assert.assertNotNull(cCSMatrixMatrixFactory0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation0 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray7 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray14 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray21 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray28 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray35 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray36 = new double[][] { doubleArray7, doubleArray14, doubleArray21, doubleArray28, doubleArray35 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix37 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray36);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation38 = matrixMatrixMatrixOperation0.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix37);
        org.la4j.Matrix matrix40 = basic2DMatrix37.blankOfColumns(52);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.linear.GaussianSolver gaussianSolver41 = new org.la4j.linear.GaussianSolver((org.la4j.Matrix) basic2DMatrix37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given coefficient matrix can not be used with this solver.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(basic2DMatrix37);
        org.junit.Assert.assertNotNull(matrixMatrixOperation38);
        org.junit.Assert.assertNotNull(matrix40);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector1 = org.la4j.Vector.zero((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = new org.la4j.matrix.sparse.CRSMatrix((int) (byte) -1, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong matrix dimensions: -1x100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        java.util.Random random2 = null;
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix3 = org.la4j.matrix.dense.Basic2DMatrix.random((int) (short) 0, 1, random2);
        org.junit.Assert.assertNotNull(basic2DMatrix3);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        java.util.Random random1 = null;
        org.la4j.vector.DenseVector denseVector2 = org.la4j.vector.DenseVector.random(0, random1);
        java.lang.String str3 = denseVector2.toString();
        int[] intArray8 = new int[] { (-1), (byte) 10, 0, 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector9 = denseVector2.select(intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(denseVector2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 10, 0, 10]");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        org.la4j.Vector vector1 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str2 = vector1.toCSV();
        java.text.NumberFormat numberFormat3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = vector1.mkString(numberFormat3, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000" + "'", str2, "1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        org.la4j.Vector vector1 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str2 = vector1.toCSV();
        org.la4j.vector.SparseVector sparseVector3 = vector1.toSparseVector();
        org.junit.Assert.assertNotNull(vector1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000" + "'", str2, "1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000");
        org.junit.Assert.assertNotNull(sparseVector3);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorFunction vectorFunction4 = org.la4j.Vectors.INC_FUNCTION;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix5 = cCSMatrix2.transformRow((int) (byte) 100, vectorFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Row '100' is invalid.");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertNotNull(vectorFunction4);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix5 = rowMajorSparseMatrix3.divide((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            rowMajorSparseMatrix3.setColumn((int) '4', (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Column '52' is invalid.");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertNotNull(matrix5);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        org.la4j.vector.functor.VectorFunction vectorFunction1 = org.la4j.Vectors.asModFunction((double) (byte) 0);
        org.junit.Assert.assertNotNull(vectorFunction1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix6 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator7 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray8 = cCSMatrix6.foldRows(vectorAccumulator7);
        org.la4j.matrix.DenseMatrix denseMatrix9 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray8);
        org.la4j.vector.dense.BasicVector basicVector10 = new org.la4j.vector.dense.BasicVector(doubleArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix11 = new org.la4j.matrix.dense.Basic1DMatrix(0, (-1), doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong matrix dimensions: 0x-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix6);
        org.junit.Assert.assertNotNull(vectorAccumulator7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix4 = rowMajorSparseMatrix3.removeLastRow();
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure5 = null;
        rowMajorSparseMatrix3.eachNonZero(matrixProcedure5);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertNotNull(matrix4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator3 = cRSMatrix2.nonZeroIterator();
        org.la4j.Vector vector5 = cRSMatrix2.getColumn(100);
        boolean boolean8 = cRSMatrix2.nonZeroAt(1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            cRSMatrix2.set(100, (int) (short) 0, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Row '100' is invalid.");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(matrixIterator3);
        org.junit.Assert.assertNotNull(vector5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        double double5 = cCSMatrix2.get((int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cCSMatrix2.nonZeroAt((int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        java.util.Random random2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.vector.sparse.CompressedVector compressedVector3 = org.la4j.vector.sparse.CompressedVector.random((int) (short) 100, (double) 100L, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The density value should be between 0 and 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic2DMatrix> basic2DMatrixMatrixFactory0 = org.la4j.Matrices.BASIC_2D;
        org.junit.Assert.assertNotNull(basic2DMatrixMatrixFactory0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.vector.sparse.CompressedVector compressedVector1 = org.la4j.vector.sparse.CompressedVector.fromMatrixMarket(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator3 = cRSMatrix2.nonZeroIterator();
        org.la4j.Vector vector5 = cRSMatrix2.getColumn(100);
        java.text.NumberFormat numberFormat6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = vector5.mkString(numberFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(matrixIterator3);
        org.junit.Assert.assertNotNull(vector5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix5 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator6 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray7 = cCSMatrix5.foldRows(vectorAccumulator6);
        org.la4j.matrix.DenseMatrix denseMatrix8 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray7);
        org.la4j.vector.dense.BasicVector basicVector9 = new org.la4j.vector.dense.BasicVector(doubleArray7);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix14 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator15 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray16 = cCSMatrix14.foldRows(vectorAccumulator15);
        org.la4j.matrix.DenseMatrix denseMatrix17 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray16);
        org.la4j.vector.dense.BasicVector basicVector18 = new org.la4j.vector.dense.BasicVector(doubleArray16);
        ooPlaceOuterProduct0.ensureApplicableTo((org.la4j.Vector) basicVector9, (org.la4j.Vector) basicVector18);
        org.la4j.Vector vector21 = org.la4j.Vector.unit((int) (short) 10);
        org.la4j.vector.DenseVector denseVector22 = vector21.toDenseVector();
        // The following exception was thrown during execution in test generation
        try {
            double double23 = basicVector18.cosineSimilarity((org.la4j.Vector) denseVector22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given vectors should have the same length: 52 does not equal to 10.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix5);
        org.junit.Assert.assertNotNull(vectorAccumulator6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix8);
        org.junit.Assert.assertNotNull(cCSMatrix14);
        org.junit.Assert.assertNotNull(vectorAccumulator15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix17);
        org.junit.Assert.assertNotNull(vector21);
        org.junit.Assert.assertNotNull(denseVector22);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        double[] doubleArray2 = new double[] { 100.0d, Double.NEGATIVE_INFINITY };
        double[] doubleArray5 = new double[] { 100.0d, Double.NEGATIVE_INFINITY };
        double[] doubleArray8 = new double[] { 100.0d, Double.NEGATIVE_INFINITY };
        double[] doubleArray11 = new double[] { 100.0d, Double.NEGATIVE_INFINITY };
        double[] doubleArray14 = new double[] { 100.0d, Double.NEGATIVE_INFINITY };
        double[] doubleArray17 = new double[] { 100.0d, Double.NEGATIVE_INFINITY };
        double[][] doubleArray18 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix19 = new org.la4j.matrix.dense.Basic2DMatrix(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, -Infinity]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, -Infinity]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, -Infinity]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, -Infinity]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, -Infinity]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, -Infinity]");
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator1 = org.la4j.Vectors.asProductAccumulator((double) '#');
        org.junit.Assert.assertNotNull(vectorAccumulator1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator3 = cCSMatrix2.nonZeroColumnMajorIterator();
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure4 = null;
        // The following exception was thrown during execution in test generation
        try {
            cCSMatrix2.eachNonZero(matrixProcedure4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator3);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator0 = org.la4j.Matrices.mkEuclideanNormAccumulator();
        org.junit.Assert.assertNotNull(matrixAccumulator0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        org.la4j.operation.VectorVectorOperation<org.la4j.Matrix> matrixVectorVectorOperation0 = org.la4j.LinearAlgebra.OO_PLACE_OUTER_PRODUCT;
        org.junit.Assert.assertNotNull(matrixVectorVectorOperation0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        java.util.Random random2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.SparseMatrix sparseMatrix3 = org.la4j.matrix.SparseMatrix.randomSymmetric((int) ' ', (double) 'a', random2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cardinality should be less then or equal to capacity: 1024.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        org.la4j.Vector vector1 = org.la4j.Vector.unit((int) (short) 10);
        org.la4j.vector.DenseVector denseVector2 = vector1.toDenseVector();
        java.text.NumberFormat numberFormat3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = vector1.toCSV(numberFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector1);
        org.junit.Assert.assertNotNull(denseVector2);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix6 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator7 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray8 = cCSMatrix6.foldRows(vectorAccumulator7);
        org.la4j.matrix.DenseMatrix denseMatrix9 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray8);
        org.la4j.vector.dense.BasicVector basicVector10 = new org.la4j.vector.dense.BasicVector(doubleArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.sparse.CCSMatrix cCSMatrix11 = org.la4j.matrix.sparse.CCSMatrix.from1DArray(100, (int) ' ', doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 64");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix6);
        org.junit.Assert.assertNotNull(vectorAccumulator7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        double[] doubleArray3 = new double[] { (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix4 = org.la4j.matrix.dense.Basic2DMatrix.from1DArray((int) (short) 1, (int) 'a', doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0]");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        org.la4j.vector.functor.VectorFunction vectorFunction1 = org.la4j.Vectors.asDivFunction((double) '4');
        org.junit.Assert.assertNotNull(vectorFunction1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        double[][] doubleArray0 = new double[][] {};
        org.la4j.matrix.DenseMatrix denseMatrix1 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix2 = org.la4j.matrix.RowMajorSparseMatrix.from2DArray(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(denseMatrix1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        org.la4j.operation.VectorVectorOperation<org.la4j.Vector> vectorVectorVectorOperation0 = org.la4j.LinearAlgebra.OO_PLACE_VECTOR_HADAMARD_PRODUCT;
        org.junit.Assert.assertNotNull(vectorVectorVectorOperation0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        org.la4j.Vector vector1 = org.la4j.Vector.unit((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector3 = vector1.sliceLeft((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        double[] doubleArray6 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray13 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray20 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray27 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray34 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray35 = new double[][] { doubleArray6, doubleArray13, doubleArray20, doubleArray27, doubleArray34 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix36 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray35);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix37 = new org.la4j.matrix.dense.Basic2DMatrix(doubleArray35);
        double[][] doubleArray38 = basic2DMatrix37.toArray();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertNotNull(basic2DMatrix36);
        org.junit.Assert.assertNotNull(doubleArray38);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator3 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray4 = cCSMatrix2.foldRows(vectorAccumulator3);
        org.la4j.vector.dense.BasicVector basicVector5 = org.la4j.vector.dense.BasicVector.fromArray(doubleArray4);
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertNotNull(vectorAccumulator3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(basicVector5);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        org.la4j.LinearAlgebra.DecompositorFactory decompositorFactory0 = org.la4j.LinearAlgebra.CHOLESKY;
        org.junit.Assert.assertNotNull(decompositorFactory0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix2 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        org.la4j.Matrix matrix4 = basic2DMatrix2.removeColumn((int) (short) 0);
        org.junit.Assert.assertNotNull(basic2DMatrix2);
        org.junit.Assert.assertNotNull(matrix4);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        org.la4j.LinearAlgebra.DecompositorFactory decompositorFactory0 = org.la4j.LinearAlgebra.DecompositorFactory.CHOLESKY;
        org.junit.Assert.assertNotNull(decompositorFactory0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix4 = rowMajorSparseMatrix3.removeLastRow();
        double double8 = rowMajorSparseMatrix3.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        int int9 = rowMajorSparseMatrix3.cardinality();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix12 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator13 = cRSMatrix12.nonZeroIterator();
        org.la4j.Vector vector15 = cRSMatrix12.getColumn(100);
        org.la4j.Matrix matrix18 = org.la4j.Matrix.zero(100, 52);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix21 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (short) 1, 0);
        org.la4j.Matrix matrix22 = rowMajorSparseMatrix21.shuffle();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix23 = org.la4j.matrix.dense.Basic2DMatrix.block((org.la4j.Matrix) rowMajorSparseMatrix3, (org.la4j.Matrix) cRSMatrix12, matrix18, matrix22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sides of blocks are incompatible!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(cRSMatrix12);
        org.junit.Assert.assertNotNull(matrixIterator13);
        org.junit.Assert.assertNotNull(vector15);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix21);
        org.junit.Assert.assertNotNull(matrix22);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random2 = null;
        org.la4j.vector.DenseVector denseVector3 = org.la4j.vector.DenseVector.random(0, random2);
        java.util.Random random5 = null;
        org.la4j.vector.DenseVector denseVector6 = org.la4j.vector.DenseVector.random(0, random5);
        org.la4j.Matrix matrix7 = ooPlaceOuterProduct0.apply(denseVector3, denseVector6);
        java.lang.Class<?> wildcardClass8 = denseVector6.getClass();
        org.junit.Assert.assertNotNull(denseVector3);
        org.junit.Assert.assertNotNull(denseVector6);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator3 = cCSMatrix2.nonZeroColumnMajorIterator();
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure4 = null;
        // The following exception was thrown during execution in test generation
        try {
            cCSMatrix2.eachNonZero(matrixProcedure4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator3);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix2 = org.la4j.matrix.dense.Basic2DMatrix.diagonal((int) (byte) 100, (double) 'a');
        org.junit.Assert.assertNotNull(basic2DMatrix2);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator0 = org.la4j.Vectors.mkMinAccumulator();
        org.junit.Assert.assertNotNull(vectorAccumulator0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        double double0 = org.la4j.Matrices.EPS;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.1102230246251565E-14d + "'", double0 == 1.1102230246251565E-14d);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double8 = rowMajorSparseMatrix4.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix9 = rowMajorSparseMatrix4.toSparseMatrix();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix12 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix13 = ooPlaceMatricesAddition0.apply(rowMajorSparseMatrix4, (org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Row '1' is invalid.");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix9);
        org.junit.Assert.assertNotNull(cRSMatrix12);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        org.la4j.LinearAlgebra.DecompositorFactory decompositorFactory0 = org.la4j.LinearAlgebra.QR;
        org.junit.Assert.assertNotNull(decompositorFactory0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator3 = cRSMatrix2.nonZeroIterator();
        org.la4j.Vector vector5 = cRSMatrix2.getColumn(100);
        boolean boolean8 = cRSMatrix2.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator10 = cRSMatrix2.nonZeroIteratorOfColumn((-1));
        int int11 = vectorIterator10.index();
        int int12 = vectorIterator10.index();
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(matrixIterator3);
        org.junit.Assert.assertNotNull(vector5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(vectorIterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator3 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray4 = cCSMatrix2.foldRows(vectorAccumulator3);
        double double6 = cCSMatrix2.maxInColumn((int) (byte) 1);
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertNotNull(vectorAccumulator3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        org.la4j.LinearAlgebra.SolverFactory solverFactory0 = org.la4j.LinearAlgebra.SolverFactory.FORWARD_BACK_SUBSTITUTION;
        org.junit.Assert.assertNotNull(solverFactory0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        org.la4j.LinearAlgebra.InverterFactory inverterFactory0 = org.la4j.LinearAlgebra.NO_PIVOT_GAUSS;
        org.junit.Assert.assertNotNull(inverterFactory0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        org.la4j.vector.dense.BasicVector basicVector3 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector4 = basicVector3.copy();
        double[] doubleArray5 = basicVector3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.DenseMatrix denseMatrix6 = org.la4j.matrix.DenseMatrix.from1DArray((-1), (int) (short) 1, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong matrix dimensions: -1x1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        org.la4j.LinearAlgebra.DecompositorFactory decompositorFactory0 = org.la4j.LinearAlgebra.RAW_LU;
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition1 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix4 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double5 = cRSMatrix4.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix9 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix10 = rowMajorSparseMatrix9.removeLastRow();
        org.la4j.Matrix matrix11 = ooPlaceMatricesAddition1.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix4, rowMajorSparseMatrix9);
        org.la4j.decomposition.CholeskyDecompositor choleskyDecompositor12 = new org.la4j.decomposition.CholeskyDecompositor((org.la4j.Matrix) cRSMatrix4);
        org.la4j.decomposition.MatrixDecompositor matrixDecompositor13 = decompositorFactory0.create((org.la4j.Matrix) cRSMatrix4);
        org.junit.Assert.assertNotNull(decompositorFactory0);
        org.junit.Assert.assertNotNull(cRSMatrix4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(matrixDecompositor13);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition1 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix4 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double5 = cRSMatrix4.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix9 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix10 = rowMajorSparseMatrix9.removeLastRow();
        org.la4j.Matrix matrix11 = ooPlaceMatricesAddition1.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix4, rowMajorSparseMatrix9);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix14 = org.la4j.matrix.dense.Basic2DMatrix.zero((int) ' ', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ooPlaceMatricesSubtraction0.ensureApplicableTo((org.la4j.Matrix) cRSMatrix4, (org.la4j.Matrix) basic2DMatrix14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given matrices should have the same shape: 10x10 does not equal to 32x97.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cRSMatrix4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(basic2DMatrix14);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.DenseMatrix denseMatrix2 = org.la4j.matrix.DenseMatrix.unit((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator3 = cRSMatrix2.nonZeroIterator();
        org.la4j.Vector vector5 = cRSMatrix2.getColumn(100);
        boolean boolean8 = cRSMatrix2.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator10 = cRSMatrix2.nonZeroIteratorOfColumn((-1));
        java.util.Iterator<java.lang.Integer> intItor11 = cRSMatrix2.iteratorOfNonZeroRows();
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(matrixIterator3);
        org.junit.Assert.assertNotNull(vector5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(vectorIterator10);
        org.junit.Assert.assertNotNull(intItor11);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        org.la4j.LinearAlgebra.DecompositorFactory decompositorFactory0 = org.la4j.LinearAlgebra.RAW_QR;
        org.junit.Assert.assertNotNull(decompositorFactory0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double4 = cRSMatrix3.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix8 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix9 = rowMajorSparseMatrix8.removeLastRow();
        org.la4j.Matrix matrix10 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, rowMajorSparseMatrix8);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix13 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean14 = cCSMatrix13.isRowMajor();
        org.la4j.Matrix matrix17 = cCSMatrix13.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix20 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.Matrix matrix21 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix13, columnMajorSparseMatrix20);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix26 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator27 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray28 = cCSMatrix26.foldRows(vectorAccumulator27);
        org.la4j.matrix.DenseMatrix denseMatrix29 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray28);
        double[] doubleArray36 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray43 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray50 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray57 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray64 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray65 = new double[][] { doubleArray36, doubleArray43, doubleArray50, doubleArray57, doubleArray64 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix66 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray65);
        // The following exception was thrown during execution in test generation
        try {
            ooPlaceMatricesAddition0.ensureApplicableTo((org.la4j.Matrix) denseMatrix29, (org.la4j.Matrix) basic2DMatrix66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given matrices should have the same shape: 0x0 does not equal to 5x6.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cRSMatrix3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(cCSMatrix13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(matrix17);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(cCSMatrix26);
        org.junit.Assert.assertNotNull(vectorAccumulator27);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix29);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertNotNull(basic2DMatrix66);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.SparseMatrix sparseMatrix1 = org.la4j.matrix.SparseMatrix.identity((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double4 = cRSMatrix3.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix8 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix9 = rowMajorSparseMatrix8.removeLastRow();
        org.la4j.Matrix matrix10 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, rowMajorSparseMatrix8);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix14 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix16 = rowMajorSparseMatrix14.divide((double) (-1));
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix20 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double24 = rowMajorSparseMatrix20.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix25 = rowMajorSparseMatrix20.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct26 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean27 = sparseMatrix25.equals((java.lang.Object) ooPlaceOuterProduct26);
        org.la4j.Matrix matrix28 = rowMajorSparseMatrix14.hadamardProduct((org.la4j.Matrix) sparseMatrix25);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition29 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix32 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double33 = cRSMatrix32.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix37 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix38 = rowMajorSparseMatrix37.removeLastRow();
        org.la4j.Matrix matrix39 = ooPlaceMatricesAddition29.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix32, rowMajorSparseMatrix37);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix42 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean43 = cCSMatrix42.isRowMajor();
        org.la4j.Matrix matrix46 = cCSMatrix42.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix49 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.Matrix matrix50 = ooPlaceMatricesAddition29.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix42, columnMajorSparseMatrix49);
        // The following exception was thrown during execution in test generation
        try {
            ooPlaceMatricesAddition0.ensureApplicableTo(matrix28, (org.la4j.Matrix) cCSMatrix42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given matrices should have the same shape: 1x35 does not equal to 52x52.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cRSMatrix3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix14);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertNotNull(cRSMatrix32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix37);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertNotNull(cCSMatrix42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(matrix46);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix49);
        org.junit.Assert.assertNotNull(matrix50);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        java.util.Random random2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.randomSymmetric(10, (double) (-1L), random2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cardinality should be positive: -100.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        org.la4j.vector.functor.VectorFunction vectorFunction2 = org.la4j.Vectors.INC_FUNCTION;
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator3 = org.la4j.Vectors.asProductFunctionAccumulator((double) (byte) 100, vectorFunction2);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator4 = org.la4j.Vectors.asSumFunctionAccumulator((double) 100.0f, vectorFunction2);
        org.junit.Assert.assertNotNull(vectorFunction2);
        org.junit.Assert.assertNotNull(vectorAccumulator3);
        org.junit.Assert.assertNotNull(vectorAccumulator4);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        org.la4j.Matrix matrix2 = org.la4j.Matrix.diagonal((int) (short) 10, (double) '#');
        org.la4j.iterator.VectorIterator vectorIterator4 = matrix2.iteratorOfColumn(1);
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction5 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix9 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix10 = rowMajorSparseMatrix9.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix12 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix13 = ooPlaceMatricesSubtraction5.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix9, denseMatrix12);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix14 = matrix2.insert((org.la4j.Matrix) rowMajorSparseMatrix9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Out of bounds: Cannot add 1 rows and 35 cols at 0, 0 in a 10x10 matrix.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(vectorIterator4);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(denseMatrix12);
        org.junit.Assert.assertNotNull(matrix13);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.sparse.CRSMatrix> cRSMatrixMatrixFactory0 = org.la4j.Matrices.SPARSE_ROW_MAJOR;
        org.junit.Assert.assertNotNull(cRSMatrixMatrixFactory0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        org.la4j.LinearAlgebra.SolverFactory solverFactory0 = org.la4j.LinearAlgebra.SolverFactory.SEIDEL;
        org.junit.Assert.assertNotNull(solverFactory0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix2 = org.la4j.matrix.dense.Basic2DMatrix.zero((int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix2 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double3 = columnMajorSparseMatrix2.determinant();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory4 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix5 = columnMajorSparseMatrix2.to(basic1DMatrixMatrixFactory4);
        byte[] byteArray6 = basic1DMatrix5.toBinary();
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix7 = org.la4j.matrix.dense.Basic1DMatrix.fromBinary(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.sparse.CRSMatrix cRSMatrix8 = org.la4j.matrix.sparse.CRSMatrix.fromBinary(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not decode CRSMatrix from the given byte array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory4);
        org.junit.Assert.assertNotNull(basic1DMatrix5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(basic1DMatrix7);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix5 = rowMajorSparseMatrix4.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix7 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix8 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix4, denseMatrix7);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix11 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean12 = cCSMatrix11.isRowMajor();
        double[] doubleArray19 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray26 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray33 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray40 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray47 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray48 = new double[][] { doubleArray19, doubleArray26, doubleArray33, doubleArray40, doubleArray47 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix49 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray48);
        basic2DMatrix49.setAll((double) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix52 = ooPlaceMatricesSubtraction0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix11, (org.la4j.matrix.DenseMatrix) basic2DMatrix49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix4);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(denseMatrix7);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(cCSMatrix11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(basic2DMatrix49);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix4 = rowMajorSparseMatrix3.removeLastRow();
        double double6 = matrix4.maxInColumn((int) (byte) 0);
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory7 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix8 = matrix4.to(basic1DMatrixMatrixFactory7);
        org.la4j.Matrix matrix9 = basic1DMatrix8.rotate();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix12 = basic1DMatrix8.blankOfShape((int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory7);
        org.junit.Assert.assertNotNull(basic1DMatrix8);
        org.junit.Assert.assertNotNull(matrix9);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix4 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator5 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray6 = cCSMatrix4.foldRows(vectorAccumulator5);
        org.la4j.matrix.DenseMatrix denseMatrix7 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray6);
        org.la4j.vector.dense.BasicVector basicVector8 = new org.la4j.vector.dense.BasicVector(doubleArray6);
        java.lang.String str9 = basicVector8.toString();
        org.junit.Assert.assertNotNull(cCSMatrix4);
        org.junit.Assert.assertNotNull(vectorAccumulator5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000" + "'", str9, "1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000 1.000");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.sparse.CCSMatrix> cCSMatrixMatrixFactory0 = org.la4j.Matrices.CCS;
        org.junit.Assert.assertNotNull(cCSMatrixMatrixFactory0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator3 = cRSMatrix2.nonZeroIterator();
        org.la4j.Vector vector5 = cRSMatrix2.getColumn(100);
        boolean boolean8 = cRSMatrix2.nonZeroAt(1, (int) (short) 0);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation9 = org.la4j.LinearAlgebra.OO_PLACE_MATRIX_BY_ITS_TRANSPOSE_MULTIPLICATION;
        org.la4j.Matrix matrix10 = cRSMatrix2.apply(matrixMatrixOperation9);
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(matrixIterator3);
        org.junit.Assert.assertNotNull(vector5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(matrixMatrixOperation9);
        org.junit.Assert.assertNotNull(matrix10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        java.util.Random random1 = null;
        org.la4j.vector.DenseVector denseVector2 = org.la4j.vector.DenseVector.random(0, random1);
        double double3 = denseVector2.product();
        java.lang.String str4 = denseVector2.toMatrixMarket();
        org.junit.Assert.assertNotNull(denseVector2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "%%MatrixMarket vector array real\n0\n" + "'", str4, "%%MatrixMarket vector array real\n0\n");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix5 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator6 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray7 = cCSMatrix5.foldRows(vectorAccumulator6);
        org.la4j.matrix.DenseMatrix denseMatrix8 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray7);
        org.la4j.vector.dense.BasicVector basicVector9 = new org.la4j.vector.dense.BasicVector(doubleArray7);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix14 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator15 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray16 = cCSMatrix14.foldRows(vectorAccumulator15);
        org.la4j.matrix.DenseMatrix denseMatrix17 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray16);
        org.la4j.vector.dense.BasicVector basicVector18 = new org.la4j.vector.dense.BasicVector(doubleArray16);
        ooPlaceOuterProduct0.ensureApplicableTo((org.la4j.Vector) basicVector9, (org.la4j.Vector) basicVector18);
        org.la4j.Matrix matrix20 = basicVector18.toColumnMatrix();
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation21 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation22 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray29 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray36 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray43 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray50 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray57 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray58 = new double[][] { doubleArray29, doubleArray36, doubleArray43, doubleArray50, doubleArray57 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix59 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray58);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation60 = matrixMatrixMatrixOperation22.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix59);
        org.la4j.Matrix matrix62 = basic2DMatrix59.blankOfColumns(52);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix66 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix67 = rowMajorSparseMatrix66.removeLastRow();
        org.la4j.matrix.functor.MatrixFunction matrixFunction69 = null;
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator70 = org.la4j.Matrices.asSumFunctionAccumulator((double) (-1), matrixFunction69);
        double double71 = matrix67.fold(matrixAccumulator70);
        double double72 = matrix67.manhattanNorm();
        matrixMatrixMatrixOperation21.ensureApplicableTo(matrix62, matrix67);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector74 = basicVector18.multiply(matrix67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given vector should have the same length as number of rows in the given matrix: 52 does not equal to 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix5);
        org.junit.Assert.assertNotNull(vectorAccumulator6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix8);
        org.junit.Assert.assertNotNull(cCSMatrix14);
        org.junit.Assert.assertNotNull(vectorAccumulator15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix17);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation21);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation22);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertNotNull(basic2DMatrix59);
        org.junit.Assert.assertNotNull(matrixMatrixOperation60);
        org.junit.Assert.assertNotNull(matrix62);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix66);
        org.junit.Assert.assertNotNull(matrix67);
        org.junit.Assert.assertNotNull(matrixAccumulator70);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1.0d) + "'", double71 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator3 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray4 = cCSMatrix2.foldRows(vectorAccumulator3);
        org.la4j.Vector vector5 = org.la4j.Vector.fromArray(doubleArray4);
        int[] intArray6 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector7 = vector5.select(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No elements selected.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertNotNull(vectorAccumulator3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(vector5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        org.la4j.LinearAlgebra.InverterFactory inverterFactory0 = org.la4j.LinearAlgebra.GAUSS_JORDAN;
        org.junit.Assert.assertNotNull(inverterFactory0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double4 = cRSMatrix3.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix8 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix9 = rowMajorSparseMatrix8.removeLastRow();
        org.la4j.Matrix matrix10 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, rowMajorSparseMatrix8);
        org.la4j.Vector vector12 = cRSMatrix3.getRow(1);
        boolean boolean13 = cRSMatrix3.isRowMajor();
        org.junit.Assert.assertNotNull(cRSMatrix3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(vector12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        double[] doubleArray6 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray13 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray20 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray27 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray34 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray35 = new double[][] { doubleArray6, doubleArray13, doubleArray20, doubleArray27, doubleArray34 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix36 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray35);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix37 = new org.la4j.matrix.dense.Basic2DMatrix(doubleArray35);
        org.la4j.matrix.functor.MatrixFunction matrixFunction40 = null;
        // The following exception was thrown during execution in test generation
        try {
            basic2DMatrix37.updateAt((int) (byte) 0, 10, matrixFunction40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertNotNull(basic2DMatrix36);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct0 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct1 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix6 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator7 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray8 = cCSMatrix6.foldRows(vectorAccumulator7);
        org.la4j.matrix.DenseMatrix denseMatrix9 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray8);
        org.la4j.vector.dense.BasicVector basicVector10 = new org.la4j.vector.dense.BasicVector(doubleArray8);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix15 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator16 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray17 = cCSMatrix15.foldRows(vectorAccumulator16);
        org.la4j.matrix.DenseMatrix denseMatrix18 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray17);
        org.la4j.vector.dense.BasicVector basicVector19 = new org.la4j.vector.dense.BasicVector(doubleArray17);
        ooPlaceOuterProduct1.ensureApplicableTo((org.la4j.Vector) basicVector10, (org.la4j.Vector) basicVector19);
        org.la4j.Matrix matrix21 = basicVector19.toColumnMatrix();
        org.la4j.vector.SparseVector sparseVector22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double23 = ooPlaceInnerProduct0.applySymmetric((org.la4j.vector.DenseVector) basicVector19, sparseVector22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix6);
        org.junit.Assert.assertNotNull(vectorAccumulator7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix9);
        org.junit.Assert.assertNotNull(cCSMatrix15);
        org.junit.Assert.assertNotNull(vectorAccumulator16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix18);
        org.junit.Assert.assertNotNull(matrix21);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        org.la4j.Matrix matrix2 = org.la4j.Matrix.diagonal((int) (short) 10, (double) '#');
        org.la4j.iterator.VectorIterator vectorIterator4 = matrix2.iteratorOfColumn(1);
        org.la4j.Matrix matrix7 = org.la4j.Matrix.diagonal((int) (short) 10, (double) '#');
        org.la4j.iterator.VectorIterator vectorIterator9 = matrix7.iteratorOfColumn(1);
        org.la4j.iterator.VectorIterator vectorIterator10 = vectorIterator4.orElseAdd(vectorIterator9);
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(vectorIterator4);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(vectorIterator9);
        org.junit.Assert.assertNotNull(vectorIterator10);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        java.util.Random random2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix3 = org.la4j.Matrix.random((int) (short) 1, (int) ' ', random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator3 = cRSMatrix2.nonZeroIterator();
        cRSMatrix2.set(0, 0, (double) 10);
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(matrixIterator3);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        org.la4j.matrix.SparseMatrix sparseMatrix1 = org.la4j.matrix.SparseMatrix.fromCSV("1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000");
        org.junit.Assert.assertNotNull(sparseMatrix1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate0 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix3 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        boolean boolean4 = advancedMatrixPredicate0.test((org.la4j.Matrix) columnMajorSparseMatrix3);
        org.la4j.inversion.NoPivotGaussInverter noPivotGaussInverter5 = new org.la4j.inversion.NoPivotGaussInverter((org.la4j.Matrix) columnMajorSparseMatrix3);
        org.la4j.Matrix matrix6 = noPivotGaussInverter5.inverse();
        org.la4j.Matrix matrix7 = noPivotGaussInverter5.inverse();
        org.junit.Assert.assertNotNull(advancedMatrixPredicate0);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(matrix6);
        org.junit.Assert.assertNotNull(matrix7);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix4 = rowMajorSparseMatrix3.removeLastRow();
        double double8 = rowMajorSparseMatrix3.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        org.la4j.Vector vector9 = rowMajorSparseMatrix3.toRowVector();
        org.la4j.matrix.functor.MatrixFunction matrixFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rowMajorSparseMatrix3.updateAt((int) (byte) 100, (int) (byte) 100, matrixFunction12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(vector9);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator3 = cRSMatrix2.nonZeroIterator();
        org.la4j.Vector vector5 = cRSMatrix2.getColumn(100);
        boolean boolean8 = cRSMatrix2.nonZeroAt(1, (int) (short) 0);
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor9 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) cRSMatrix2);
        org.la4j.Vector vector11 = cRSMatrix2.getColumn((int) (short) 10);
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(matrixIterator3);
        org.junit.Assert.assertNotNull(vector5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(vector11);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        org.la4j.LinearAlgebra.SolverFactory solverFactory0 = org.la4j.LinearAlgebra.SolverFactory.LEAST_SQUARES;
        org.junit.Assert.assertNotNull(solverFactory0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double4 = cRSMatrix3.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix8 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix9 = rowMajorSparseMatrix8.removeLastRow();
        org.la4j.Matrix matrix10 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, rowMajorSparseMatrix8);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix13 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator14 = cRSMatrix13.nonZeroIterator();
        org.la4j.Vector vector16 = cRSMatrix13.getColumn(100);
        boolean boolean19 = cRSMatrix13.nonZeroAt(1, (int) (short) 0);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix22 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator23 = cRSMatrix22.nonZeroIterator();
        org.la4j.Matrix matrix24 = ooPlaceMatricesAddition0.applySymmetric((org.la4j.matrix.SparseMatrix) cRSMatrix13, (org.la4j.matrix.SparseMatrix) cRSMatrix22);
        org.junit.Assert.assertNotNull(cRSMatrix3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(cRSMatrix13);
        org.junit.Assert.assertNotNull(matrixIterator14);
        org.junit.Assert.assertNotNull(vector16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cRSMatrix22);
        org.junit.Assert.assertNotNull(matrixIterator23);
        org.junit.Assert.assertNotNull(matrix24);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        java.lang.String str0 = org.la4j.LinearAlgebra.DATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "March 2015" + "'", str0, "March 2015");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix4 = rowMajorSparseMatrix3.removeLastRow();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.linear.SquareRootSolver squareRootSolver5 = new org.la4j.linear.SquareRootSolver((org.la4j.Matrix) rowMajorSparseMatrix3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given coefficient matrix can not be used with this solver.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertNotNull(matrix4);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix2 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double3 = columnMajorSparseMatrix2.determinant();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory4 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix5 = columnMajorSparseMatrix2.to(basic1DMatrixMatrixFactory4);
        byte[] byteArray6 = basic1DMatrix5.toBinary();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix11 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double15 = rowMajorSparseMatrix11.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix16 = rowMajorSparseMatrix11.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct17 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean18 = sparseMatrix16.equals((java.lang.Object) ooPlaceOuterProduct17);
        org.la4j.vector.DenseVector denseVector20 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random22 = null;
        org.la4j.vector.DenseVector denseVector23 = org.la4j.vector.DenseVector.random(0, random22);
        java.lang.String str24 = denseVector23.toString();
        ooPlaceOuterProduct17.ensureApplicableTo((org.la4j.Vector) denseVector20, (org.la4j.Vector) denseVector23);
        org.la4j.vector.sparse.CompressedVector compressedVector27 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        java.util.Random random29 = null;
        org.la4j.vector.DenseVector denseVector30 = org.la4j.vector.DenseVector.random(0, random29);
        double double31 = denseVector30.product();
        org.la4j.Matrix matrix32 = ooPlaceOuterProduct17.apply((org.la4j.vector.SparseVector) compressedVector27, denseVector30);
        org.la4j.vector.sparse.CompressedVector compressedVector34 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.vector.sparse.CompressedVector compressedVector36 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix37 = ooPlaceOuterProduct17.apply((org.la4j.vector.SparseVector) compressedVector34, (org.la4j.vector.SparseVector) compressedVector36);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix38 = basic1DMatrix5.insertRow((int) ' ', (org.la4j.Vector) compressedVector36);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Illegal row number, must be 0..0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory4);
        org.junit.Assert.assertNotNull(basic1DMatrix5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(denseVector20);
        org.junit.Assert.assertNotNull(denseVector23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(denseVector30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertNotNull(matrix37);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        org.la4j.matrix.SparseMatrix sparseMatrix3 = org.la4j.matrix.SparseMatrix.zero(100, (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertNotNull(sparseMatrix3);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double7 = rowMajorSparseMatrix3.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix8 = rowMajorSparseMatrix3.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct9 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean10 = sparseMatrix8.equals((java.lang.Object) ooPlaceOuterProduct9);
        org.la4j.vector.DenseVector denseVector12 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random14 = null;
        org.la4j.vector.DenseVector denseVector15 = org.la4j.vector.DenseVector.random(0, random14);
        java.lang.String str16 = denseVector15.toString();
        ooPlaceOuterProduct9.ensureApplicableTo((org.la4j.Vector) denseVector12, (org.la4j.Vector) denseVector15);
        org.la4j.vector.sparse.CompressedVector compressedVector19 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        java.util.Random random21 = null;
        org.la4j.vector.DenseVector denseVector22 = org.la4j.vector.DenseVector.random(0, random21);
        double double23 = denseVector22.product();
        org.la4j.Matrix matrix24 = ooPlaceOuterProduct9.apply((org.la4j.vector.SparseVector) compressedVector19, denseVector22);
        org.la4j.vector.sparse.CompressedVector compressedVector26 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.vector.sparse.CompressedVector compressedVector28 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix29 = ooPlaceOuterProduct9.apply((org.la4j.vector.SparseVector) compressedVector26, (org.la4j.vector.SparseVector) compressedVector28);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix31 = org.la4j.matrix.RowMajorSparseMatrix.identity((int) 'a');
        boolean boolean33 = matrix29.equals((org.la4j.Matrix) rowMajorSparseMatrix31, 10.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(denseVector12);
        org.junit.Assert.assertNotNull(denseVector15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(denseVector22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertNotNull(matrix29);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean3 = cCSMatrix2.isRowMajor();
        org.la4j.Matrix matrix6 = cCSMatrix2.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix10 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix11 = rowMajorSparseMatrix10.removeLastRow();
        double double13 = matrix11.maxInColumn((int) (byte) 0);
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory14 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix15 = matrix11.to(basic1DMatrixMatrixFactory14);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix16 = cCSMatrix2.to(basic1DMatrixMatrixFactory14);
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(matrix6);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix10);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.NEGATIVE_INFINITY + "'", double13 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory14);
        org.junit.Assert.assertNotNull(basic1DMatrix15);
        org.junit.Assert.assertNotNull(basic1DMatrix16);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix4 = rowMajorSparseMatrix3.removeLastRow();
        double double8 = rowMajorSparseMatrix3.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        org.la4j.Vector vector9 = rowMajorSparseMatrix3.toRowVector();
        org.la4j.Vector vector11 = rowMajorSparseMatrix3.getColumn((int) (byte) -1);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(vector9);
        org.junit.Assert.assertNotNull(vector11);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double3 = cRSMatrix2.min();
        cRSMatrix2.setAll((double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            cRSMatrix2.set((int) (short) 0, (int) ' ', (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Column '32' is invalid.");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        org.la4j.Vector vector1 = org.la4j.Vector.unit((int) (short) 10);
        org.la4j.vector.DenseVector denseVector2 = vector1.toDenseVector();
        org.la4j.vector.functor.VectorFunction vectorFunction4 = org.la4j.Vectors.asMulFunction((double) (short) 10);
        vector1.update(vectorFunction4);
        org.junit.Assert.assertNotNull(vector1);
        org.junit.Assert.assertNotNull(denseVector2);
        org.junit.Assert.assertNotNull(vectorFunction4);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        double[][] doubleArray0 = new double[][] {};
        org.la4j.matrix.DenseMatrix denseMatrix1 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray0);
        org.la4j.Matrix matrix2 = org.la4j.Matrix.from2DArray(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(denseMatrix1);
        org.junit.Assert.assertNotNull(matrix2);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        java.util.Random random2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.vector.sparse.CompressedVector compressedVector3 = org.la4j.vector.sparse.CompressedVector.random((int) (short) -1, (double) 1, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix3 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator4 = columnMajorSparseMatrix3.nonZeroIterator();
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction5 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix9 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix10 = rowMajorSparseMatrix9.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix12 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix13 = ooPlaceMatricesSubtraction5.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix9, denseMatrix12);
        org.la4j.Matrix matrix14 = ooPlaceMatricesSubtraction0.apply(columnMajorSparseMatrix3, denseMatrix12);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix18 = new org.la4j.matrix.sparse.CRSMatrix((int) '#', 1, 0);
        boolean boolean21 = cRSMatrix18.isZeroAt(10, 0);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix24 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator25 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray26 = cCSMatrix24.foldRows(vectorAccumulator25);
        org.la4j.iterator.VectorIterator vectorIterator28 = cCSMatrix24.iteratorOfColumn((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix29 = ooPlaceMatricesSubtraction0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix18, (org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Row '53' is invalid.");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix3);
        org.junit.Assert.assertNotNull(matrixIterator4);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(denseMatrix12);
        org.junit.Assert.assertNotNull(matrix13);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(cCSMatrix24);
        org.junit.Assert.assertNotNull(vectorAccumulator25);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(vectorIterator28);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double7 = rowMajorSparseMatrix3.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix8 = rowMajorSparseMatrix3.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate9 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean10 = sparseMatrix8.is(advancedMatrixPredicate9);
        double double11 = sparseMatrix8.min();
        org.la4j.vector.functor.VectorFunction vectorFunction13 = org.la4j.Vectors.INC_FUNCTION;
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator14 = org.la4j.Vectors.asProductFunctionAccumulator((double) (byte) 100, vectorFunction13);
        double[] doubleArray15 = sparseMatrix8.foldRows(vectorAccumulator14);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix8);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(vectorFunction13);
        org.junit.Assert.assertNotNull(vectorAccumulator14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0]");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.vector.SparseVector sparseVector1 = org.la4j.vector.SparseVector.fromMatrixMarket(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator3 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray4 = cCSMatrix2.foldRows(vectorAccumulator3);
        org.la4j.iterator.VectorIterator vectorIterator6 = cCSMatrix2.iteratorOfColumn((int) '#');
        boolean boolean9 = cCSMatrix2.nonZeroAt((-1), 1);
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertNotNull(vectorAccumulator3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(vectorIterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator3 = cRSMatrix2.nonZeroIterator();
        org.la4j.Vector vector5 = cRSMatrix2.getColumn(100);
        boolean boolean8 = cRSMatrix2.nonZeroAt(1, (int) (short) 0);
        org.la4j.iterator.VectorIterator vectorIterator10 = cRSMatrix2.nonZeroIteratorOfColumn((-1));
        // The following exception was thrown during execution in test generation
        try {
            vectorIterator10.set((double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Row '-1' is invalid.");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(matrixIterator3);
        org.junit.Assert.assertNotNull(vector5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(vectorIterator10);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        double[] doubleArray6 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray13 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray20 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray27 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray34 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray35 = new double[][] { doubleArray6, doubleArray13, doubleArray20, doubleArray27, doubleArray34 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix36 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray35);
        // The following exception was thrown during execution in test generation
        try {
            basic2DMatrix36.swapRows(10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertNotNull(basic2DMatrix36);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double3 = cRSMatrix2.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator4 = cRSMatrix2.nonZeroRowMajorIterator();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix7 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double8 = cRSMatrix7.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator9 = cRSMatrix7.nonZeroRowMajorIterator();
        org.la4j.iterator.MatrixIterator matrixIterator10 = rowMajorMatrixIterator4.andAlsoDivide((org.la4j.iterator.MatrixIterator) rowMajorMatrixIterator9);
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator4);
        org.junit.Assert.assertNotNull(cRSMatrix7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator9);
        org.junit.Assert.assertNotNull(matrixIterator10);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        org.la4j.matrix.SparseMatrix sparseMatrix1 = org.la4j.matrix.SparseMatrix.identity((int) (byte) 100);
        org.junit.Assert.assertNotNull(sparseMatrix1);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        double[][] doubleArray0 = new double[][] {};
        org.la4j.matrix.DenseMatrix denseMatrix1 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray0);
        org.la4j.Vector vector3 = denseMatrix1.getColumn((int) (short) 100);
        org.la4j.Vector vector5 = denseMatrix1.getColumn((int) '#');
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(denseMatrix1);
        org.junit.Assert.assertNotNull(vector3);
        org.junit.Assert.assertNotNull(vector5);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double4 = cRSMatrix3.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix8 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix9 = rowMajorSparseMatrix8.removeLastRow();
        org.la4j.Matrix matrix10 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, rowMajorSparseMatrix8);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector12 = rowMajorSparseMatrix8.getRow(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cRSMatrix3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(matrix10);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double4 = cRSMatrix3.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix8 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix9 = rowMajorSparseMatrix8.removeLastRow();
        org.la4j.Matrix matrix10 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, rowMajorSparseMatrix8);
        org.la4j.decomposition.CholeskyDecompositor choleskyDecompositor11 = new org.la4j.decomposition.CholeskyDecompositor((org.la4j.Matrix) cRSMatrix3);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix15 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator16 = columnMajorSparseMatrix15.nonZeroIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix21 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double25 = rowMajorSparseMatrix21.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix26 = rowMajorSparseMatrix21.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate27 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean28 = sparseMatrix26.is(advancedMatrixPredicate27);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator30 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double31 = sparseMatrix26.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator30);
        org.la4j.vector.functor.VectorProcedure vectorProcedure32 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator30);
        columnMajorSparseMatrix15.eachNonZeroInRow((-1), vectorProcedure32);
        cRSMatrix3.eachNonZeroInRow((int) (byte) 1, vectorProcedure32);
        org.junit.Assert.assertNotNull(cRSMatrix3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix15);
        org.junit.Assert.assertNotNull(matrixIterator16);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix26);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(vectorAccumulator30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(vectorProcedure32);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.util.Random random1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix2 = org.la4j.matrix.dense.Basic1DMatrix.randomSymmetric((int) (short) 1, random1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        org.la4j.matrix.functor.MatrixPredicate matrixPredicate0 = org.la4j.Matrices.UPPER_TRIANGULAR_MATRIX;
        boolean boolean3 = matrixPredicate0.test((int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(matrixPredicate0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate0 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix3 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        boolean boolean4 = advancedMatrixPredicate0.test((org.la4j.Matrix) columnMajorSparseMatrix3);
        org.la4j.vector.functor.VectorFunction vectorFunction6 = null;
        org.la4j.Matrix matrix7 = columnMajorSparseMatrix3.transformRow(0, vectorFunction6);
        double[] doubleArray14 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray21 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray28 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray35 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray42 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray43 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35, doubleArray42 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix44 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray43);
        basic2DMatrix44.setAll((double) 100);
        org.la4j.matrix.DenseMatrix denseMatrix49 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        double double50 = denseMatrix49.min();
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation51 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray58 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray65 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray72 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray79 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray86 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray87 = new double[][] { doubleArray58, doubleArray65, doubleArray72, doubleArray79, doubleArray86 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix88 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray87);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation89 = matrixMatrixMatrixOperation51.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix88);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.sparse.CRSMatrix cRSMatrix90 = org.la4j.matrix.sparse.CRSMatrix.block(matrix7, (org.la4j.Matrix) basic2DMatrix44, (org.la4j.Matrix) denseMatrix49, (org.la4j.Matrix) basic2DMatrix88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sides of blocks are incompatible!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(advancedMatrixPredicate0);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertNotNull(basic2DMatrix44);
        org.junit.Assert.assertNotNull(denseMatrix49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + Double.POSITIVE_INFINITY + "'", double50 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation51);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertNotNull(basic2DMatrix88);
        org.junit.Assert.assertNotNull(matrixMatrixOperation89);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix2 = org.la4j.matrix.dense.Basic2DMatrix.diagonal((int) (byte) 0, (double) (-1L));
        org.junit.Assert.assertNotNull(basic2DMatrix2);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix4 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator5 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray6 = cCSMatrix4.foldRows(vectorAccumulator5);
        org.la4j.matrix.DenseMatrix denseMatrix7 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray6);
        org.la4j.Vector vector9 = denseMatrix7.getRow((int) (short) 100);
        org.junit.Assert.assertNotNull(cCSMatrix4);
        org.junit.Assert.assertNotNull(vectorAccumulator5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix7);
        org.junit.Assert.assertNotNull(vector9);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        org.la4j.LinearAlgebra.SolverFactory solverFactory0 = org.la4j.LinearAlgebra.JACOBI;
        org.junit.Assert.assertNotNull(solverFactory0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix5 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator6 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray7 = cCSMatrix5.foldRows(vectorAccumulator6);
        org.la4j.matrix.DenseMatrix denseMatrix8 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray7);
        org.la4j.vector.dense.BasicVector basicVector9 = new org.la4j.vector.dense.BasicVector(doubleArray7);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix14 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator15 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray16 = cCSMatrix14.foldRows(vectorAccumulator15);
        org.la4j.matrix.DenseMatrix denseMatrix17 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray16);
        org.la4j.vector.dense.BasicVector basicVector18 = new org.la4j.vector.dense.BasicVector(doubleArray16);
        ooPlaceOuterProduct0.ensureApplicableTo((org.la4j.Vector) basicVector9, (org.la4j.Vector) basicVector18);
        java.lang.String str20 = basicVector9.toMatrixMarket();
        byte[] byteArray21 = basicVector9.toBinary();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.sparse.CCSMatrix cCSMatrix22 = org.la4j.matrix.sparse.CCSMatrix.fromBinary(byteArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not decode CCSMatrix from the given byte array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix5);
        org.junit.Assert.assertNotNull(vectorAccumulator6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix8);
        org.junit.Assert.assertNotNull(cCSMatrix14);
        org.junit.Assert.assertNotNull(vectorAccumulator15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "%%MatrixMarket vector array real\n52\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n" + "'", str20, "%%MatrixMarket vector array real\n52\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n1.000\n");
        org.junit.Assert.assertNotNull(byteArray21);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        double[] doubleArray6 = new double[] { 1.1102230246251565E-14d, 10.0f, 0, 10, (short) 1, (byte) -1 };
        double[] doubleArray13 = new double[] { 1.1102230246251565E-14d, 10.0f, 0, 10, (short) 1, (byte) -1 };
        double[] doubleArray20 = new double[] { 1.1102230246251565E-14d, 10.0f, 0, 10, (short) 1, (byte) -1 };
        double[][] doubleArray21 = new double[][] { doubleArray6, doubleArray13, doubleArray20 };
        org.la4j.matrix.DenseMatrix denseMatrix22 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray21);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.1102230246251565E-14, 10.0, 0.0, 10.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.1102230246251565E-14, 10.0, 0.0, 10.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.1102230246251565E-14, 10.0, 0.0, 10.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(denseMatrix22);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        org.la4j.vector.DenseVector denseVector1 = org.la4j.vector.DenseVector.fromCSV("");
        double[] doubleArray8 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray15 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray22 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray29 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray36 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray37 = new double[][] { doubleArray8, doubleArray15, doubleArray22, doubleArray29, doubleArray36 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix38 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray37);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix39 = new org.la4j.matrix.dense.Basic2DMatrix(doubleArray37);
        double double40 = basic2DMatrix39.product();
        org.la4j.matrix.DenseMatrix denseMatrix41 = basic2DMatrix39.toDenseMatrix();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector42 = denseVector1.multiply((org.la4j.Matrix) basic2DMatrix39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given vector should have the same length as number of rows in the given matrix: 0 does not equal to 5.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(denseVector1);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertNotNull(basic2DMatrix38);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-3.98762104952942E42d) + "'", double40 == (-3.98762104952942E42d));
        org.junit.Assert.assertNotNull(denseMatrix41);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.sparse.CCSMatrix cCSMatrix1 = org.la4j.matrix.sparse.CCSMatrix.fromMatrixMarket(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        org.la4j.matrix.MatrixFactory<?>[] wildcardMatrixFactoryArray0 = org.la4j.Matrices.CONVERTERS;
        org.junit.Assert.assertNotNull(wildcardMatrixFactoryArray0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix1 = org.la4j.matrix.dense.Basic1DMatrix.fromMatrixMarket(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix2 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (short) 1, 0);
        org.la4j.matrix.DenseMatrix denseMatrix5 = org.la4j.matrix.DenseMatrix.diagonal(0, (double) (byte) 10);
        double double6 = denseMatrix5.min();
        org.la4j.Matrix matrix9 = org.la4j.Matrix.zero(100, 52);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition10 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix13 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double14 = cRSMatrix13.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix18 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix19 = rowMajorSparseMatrix18.removeLastRow();
        org.la4j.Matrix matrix20 = ooPlaceMatricesAddition10.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix13, rowMajorSparseMatrix18);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix23 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double24 = cRSMatrix23.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator25 = cRSMatrix23.nonZeroRowMajorIterator();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix28 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double29 = cRSMatrix28.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator30 = cRSMatrix28.nonZeroRowMajorIterator();
        org.la4j.Matrix matrix31 = ooPlaceMatricesAddition10.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix23, (org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix28);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix32 = org.la4j.matrix.RowMajorSparseMatrix.block((org.la4j.Matrix) rowMajorSparseMatrix2, (org.la4j.Matrix) denseMatrix5, matrix9, (org.la4j.Matrix) cRSMatrix28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sides of blocks are incompatible!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix2);
        org.junit.Assert.assertNotNull(denseMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.POSITIVE_INFINITY + "'", double6 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(cRSMatrix13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix18);
        org.junit.Assert.assertNotNull(matrix19);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(cRSMatrix23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator25);
        org.junit.Assert.assertNotNull(cRSMatrix28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator30);
        org.junit.Assert.assertNotNull(matrix31);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix2 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator3 = columnMajorSparseMatrix2.nonZeroIterator();
        org.la4j.Vector vector4 = columnMajorSparseMatrix2.toColumnVector();
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix2);
        org.junit.Assert.assertNotNull(matrixIterator3);
        org.junit.Assert.assertNotNull(vector4);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double4 = cRSMatrix3.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix8 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix9 = rowMajorSparseMatrix8.removeLastRow();
        org.la4j.Matrix matrix10 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, rowMajorSparseMatrix8);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix13 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean14 = cCSMatrix13.isRowMajor();
        org.la4j.Matrix matrix17 = cCSMatrix13.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix20 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.Matrix matrix21 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix13, columnMajorSparseMatrix20);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix24 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator25 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray26 = cCSMatrix24.foldRows(vectorAccumulator25);
        org.la4j.Matrix matrix28 = cCSMatrix24.power((int) '4');
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix31 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double32 = cRSMatrix31.min();
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator33 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray34 = cRSMatrix31.foldNonZeroInColumns(vectorAccumulator33);
        org.la4j.Matrix matrix35 = ooPlaceMatricesAddition0.applySymmetric((org.la4j.matrix.SparseMatrix) cCSMatrix24, (org.la4j.matrix.SparseMatrix) cRSMatrix31);
        org.junit.Assert.assertNotNull(cRSMatrix3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(cCSMatrix13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(matrix17);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(cCSMatrix24);
        org.junit.Assert.assertNotNull(vectorAccumulator25);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertNotNull(cRSMatrix31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(vectorAccumulator33);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(matrix35);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        org.la4j.vector.DenseVector denseVector2 = org.la4j.vector.DenseVector.constant(0, (double) (short) 0);
        org.junit.Assert.assertNotNull(denseVector2);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double7 = rowMajorSparseMatrix3.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix8 = rowMajorSparseMatrix3.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct9 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean10 = sparseMatrix8.equals((java.lang.Object) ooPlaceOuterProduct9);
        org.la4j.vector.DenseVector denseVector12 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random14 = null;
        org.la4j.vector.DenseVector denseVector15 = org.la4j.vector.DenseVector.random(0, random14);
        java.lang.String str16 = denseVector15.toString();
        ooPlaceOuterProduct9.ensureApplicableTo((org.la4j.Vector) denseVector12, (org.la4j.Vector) denseVector15);
        org.la4j.vector.sparse.CompressedVector compressedVector19 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        java.util.Random random21 = null;
        org.la4j.vector.DenseVector denseVector22 = org.la4j.vector.DenseVector.random(0, random21);
        double double23 = denseVector22.product();
        org.la4j.Matrix matrix24 = ooPlaceOuterProduct9.apply((org.la4j.vector.SparseVector) compressedVector19, denseVector22);
        org.la4j.vector.sparse.CompressedVector compressedVector26 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.vector.sparse.CompressedVector compressedVector28 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix29 = ooPlaceOuterProduct9.apply((org.la4j.vector.SparseVector) compressedVector26, (org.la4j.vector.SparseVector) compressedVector28);
        org.la4j.vector.DenseVector denseVector31 = org.la4j.vector.DenseVector.fromCSV("1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct32 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random34 = null;
        org.la4j.vector.DenseVector denseVector35 = org.la4j.vector.DenseVector.random(0, random34);
        java.util.Random random37 = null;
        org.la4j.vector.DenseVector denseVector38 = org.la4j.vector.DenseVector.random(0, random37);
        org.la4j.Matrix matrix39 = ooPlaceOuterProduct32.apply(denseVector35, denseVector38);
        org.la4j.Matrix matrix40 = ooPlaceOuterProduct9.apply(denseVector31, denseVector35);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(denseVector12);
        org.junit.Assert.assertNotNull(denseVector15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(denseVector22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertNotNull(matrix29);
        org.junit.Assert.assertNotNull(denseVector31);
        org.junit.Assert.assertNotNull(denseVector35);
        org.junit.Assert.assertNotNull(denseVector38);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertNotNull(matrix40);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix5 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator6 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray7 = cCSMatrix5.foldRows(vectorAccumulator6);
        org.la4j.matrix.DenseMatrix denseMatrix8 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray7);
        org.la4j.vector.dense.BasicVector basicVector9 = new org.la4j.vector.dense.BasicVector(doubleArray7);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix14 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator15 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray16 = cCSMatrix14.foldRows(vectorAccumulator15);
        org.la4j.matrix.DenseMatrix denseMatrix17 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray16);
        org.la4j.vector.dense.BasicVector basicVector18 = new org.la4j.vector.dense.BasicVector(doubleArray16);
        ooPlaceOuterProduct0.ensureApplicableTo((org.la4j.Vector) basicVector9, (org.la4j.Vector) basicVector18);
        org.la4j.Vector vector21 = basicVector9.copyOfLength((int) (short) 0);
        org.la4j.operation.VectorVectorOperation<org.la4j.Vector> vectorVectorVectorOperation22 = org.la4j.LinearAlgebra.OO_PLACE_VECTORS_ADDITION;
        org.la4j.vector.SparseVector sparseVector23 = null;
        org.la4j.operation.VectorOperation<org.la4j.Vector> vectorVectorOperation24 = vectorVectorVectorOperation22.partiallyApply(sparseVector23);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector25 = basicVector9.apply(vectorVectorOperation24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix5);
        org.junit.Assert.assertNotNull(vectorAccumulator6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix8);
        org.junit.Assert.assertNotNull(cCSMatrix14);
        org.junit.Assert.assertNotNull(vectorAccumulator15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix17);
        org.junit.Assert.assertNotNull(vector21);
        org.junit.Assert.assertNotNull(vectorVectorVectorOperation22);
        org.junit.Assert.assertNotNull(vectorVectorOperation24);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix1 = org.la4j.matrix.dense.Basic1DMatrix.fromCSV("1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000");
        java.text.NumberFormat numberFormat2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = basic1DMatrix1.toMatrixMarket(numberFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(basic1DMatrix1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix3 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double4 = columnMajorSparseMatrix3.determinant();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix8 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double12 = rowMajorSparseMatrix8.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix13 = rowMajorSparseMatrix8.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate14 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean15 = sparseMatrix13.is(advancedMatrixPredicate14);
        org.la4j.Matrix matrix16 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) columnMajorSparseMatrix3, sparseMatrix13);
        org.la4j.linear.SquareRootSolver squareRootSolver17 = new org.la4j.linear.SquareRootSolver(matrix16);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix13);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(matrix16);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        java.util.Random random2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.DenseMatrix denseMatrix3 = org.la4j.matrix.DenseMatrix.random((-1), (int) '4', random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        org.la4j.matrix.functor.MatrixPredicate matrixPredicate0 = org.la4j.Matrices.UPPER_BIDIAGONAL_MATRIX;
        org.junit.Assert.assertNotNull(matrixPredicate0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.vector.DenseVector denseVector1 = org.la4j.vector.DenseVector.unit((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator3 = cCSMatrix2.nonZeroColumnMajorIterator();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = cCSMatrix2.minInColumn((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator3);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct0 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.vector.sparse.CompressedVector compressedVector2 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation3 = ooPlaceInnerProduct0.partiallyApply((org.la4j.vector.SparseVector) compressedVector2);
        double double4 = compressedVector2.density();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix7 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator8 = cRSMatrix7.nonZeroIterator();
        org.la4j.Vector vector10 = cRSMatrix7.getColumn(100);
        org.la4j.vector.VectorFactory<org.la4j.vector.sparse.CompressedVector> compressedVectorVectorFactory11 = org.la4j.Vectors.COMPRESSED;
        org.la4j.vector.sparse.CompressedVector compressedVector12 = vector10.to(compressedVectorVectorFactory11);
        org.la4j.vector.sparse.CompressedVector compressedVector13 = compressedVector2.to(compressedVectorVectorFactory11);
        org.junit.Assert.assertNotNull(doubleVectorOperation3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(cRSMatrix7);
        org.junit.Assert.assertNotNull(matrixIterator8);
        org.junit.Assert.assertNotNull(vector10);
        org.junit.Assert.assertNotNull(compressedVectorVectorFactory11);
        org.junit.Assert.assertNotNull(compressedVector12);
        org.junit.Assert.assertNotNull(compressedVector13);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix2 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double3 = columnMajorSparseMatrix2.determinant();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory4 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix5 = columnMajorSparseMatrix2.to(basic1DMatrixMatrixFactory4);
        byte[] byteArray6 = basic1DMatrix5.toBinary();
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix7 = org.la4j.matrix.dense.Basic1DMatrix.fromBinary(byteArray6);
        basic1DMatrix7.setAll((double) '#');
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory4);
        org.junit.Assert.assertNotNull(basic1DMatrix5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(basic1DMatrix7);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random2 = null;
        org.la4j.vector.DenseVector denseVector3 = org.la4j.vector.DenseVector.random(0, random2);
        java.util.Random random5 = null;
        org.la4j.vector.DenseVector denseVector6 = org.la4j.vector.DenseVector.random(0, random5);
        org.la4j.Matrix matrix7 = ooPlaceOuterProduct0.apply(denseVector3, denseVector6);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix11 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double15 = rowMajorSparseMatrix11.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix16 = rowMajorSparseMatrix11.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct17 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean18 = sparseMatrix16.equals((java.lang.Object) ooPlaceOuterProduct17);
        org.la4j.vector.DenseVector denseVector20 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random22 = null;
        org.la4j.vector.DenseVector denseVector23 = org.la4j.vector.DenseVector.random(0, random22);
        java.lang.String str24 = denseVector23.toString();
        ooPlaceOuterProduct17.ensureApplicableTo((org.la4j.Vector) denseVector20, (org.la4j.Vector) denseVector23);
        org.la4j.vector.sparse.CompressedVector compressedVector27 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        java.util.Random random29 = null;
        org.la4j.vector.DenseVector denseVector30 = org.la4j.vector.DenseVector.random(0, random29);
        double double31 = denseVector30.product();
        org.la4j.Matrix matrix32 = ooPlaceOuterProduct17.apply((org.la4j.vector.SparseVector) compressedVector27, denseVector30);
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct33 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.vector.sparse.CompressedVector compressedVector35 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation36 = ooPlaceInnerProduct33.partiallyApply((org.la4j.vector.SparseVector) compressedVector35);
        org.la4j.Matrix matrix37 = ooPlaceOuterProduct0.apply((org.la4j.vector.SparseVector) compressedVector27, (org.la4j.vector.SparseVector) compressedVector35);
        org.la4j.Matrix matrix38 = compressedVector27.toRowMatrix();
        org.junit.Assert.assertNotNull(denseVector3);
        org.junit.Assert.assertNotNull(denseVector6);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(denseVector20);
        org.junit.Assert.assertNotNull(denseVector23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(denseVector30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertNotNull(doubleVectorOperation36);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(matrix38);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        org.la4j.matrix.functor.MatrixFunction matrixFunction1 = org.la4j.Matrices.asModFunction((double) (byte) 1);
        org.junit.Assert.assertNotNull(matrixFunction1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation0 = org.la4j.LinearAlgebra.OO_PLACE_MATRICES_SUBTRACTION;
        org.la4j.matrix.DenseMatrix denseMatrix2 = org.la4j.matrix.DenseMatrix.fromCSV("1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix5 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator6 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray7 = cCSMatrix5.foldRows(vectorAccumulator6);
        org.la4j.iterator.VectorIterator vectorIterator9 = cCSMatrix5.iteratorOfColumn((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix10 = matrixMatrixMatrixOperation0.apply(denseMatrix2, (org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation0);
        org.junit.Assert.assertNotNull(denseMatrix2);
        org.junit.Assert.assertNotNull(cCSMatrix5);
        org.junit.Assert.assertNotNull(vectorAccumulator6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(vectorIterator9);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix2 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator3 = columnMajorSparseMatrix2.nonZeroIterator();
        // The following exception was thrown during execution in test generation
        try {
            matrixIterator3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: This will be supported in 0.6.0.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix2);
        org.junit.Assert.assertNotNull(matrixIterator3);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        java.lang.String str0 = org.la4j.LinearAlgebra.FULL_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "la4j-0.5.5 (March 2015)" + "'", str0, "la4j-0.5.5 (March 2015)");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        org.la4j.Vector vector2 = org.la4j.Vector.constant(52, (-3.98762104952942E42d));
        org.junit.Assert.assertNotNull(vector2);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        java.util.Random random2 = null;
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.randomSymmetric((int) (byte) 100, (double) 0L, random2);
        java.text.NumberFormat numberFormat4 = null;
        java.lang.String str5 = rowMajorSparseMatrix3.toMatrixMarket(numberFormat4);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "%%MatrixMarket matrix coordinate real general row-major\n100 100 0\n" + "'", str5, "%%MatrixMarket matrix coordinate real general row-major\n100 100 0\n");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        org.la4j.matrix.DenseMatrix denseMatrix1 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation2 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray9 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray16 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray23 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray30 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray37 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray38 = new double[][] { doubleArray9, doubleArray16, doubleArray23, doubleArray30, doubleArray37 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix39 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray38);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation40 = matrixMatrixMatrixOperation2.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix39);
        double[][] doubleArray41 = new double[][] {};
        org.la4j.matrix.DenseMatrix denseMatrix42 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray41);
        double[] doubleArray49 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray56 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray63 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray70 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray77 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray78 = new double[][] { doubleArray49, doubleArray56, doubleArray63, doubleArray70, doubleArray77 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix79 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray78);
        basic2DMatrix79.setAll((double) 100);
        org.la4j.Matrix matrix82 = matrixMatrixMatrixOperation2.apply(denseMatrix42, (org.la4j.matrix.DenseMatrix) basic2DMatrix79);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix85 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator86 = cCSMatrix85.nonZeroColumnMajorIterator();
        double double87 = cCSMatrix85.min();
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation88 = matrixMatrixMatrixOperation2.partiallyApply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix85);
        org.la4j.Matrix matrix89 = denseMatrix1.apply(matrixMatrixOperation88);
        org.la4j.Matrix matrix91 = denseMatrix1.removeColumn((int) (short) 1);
        org.junit.Assert.assertNotNull(denseMatrix1);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation2);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertNotNull(basic2DMatrix39);
        org.junit.Assert.assertNotNull(matrixMatrixOperation40);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertNotNull(denseMatrix42);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertNotNull(basic2DMatrix79);
        org.junit.Assert.assertNotNull(matrix82);
        org.junit.Assert.assertNotNull(cCSMatrix85);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator86);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-1.0d) + "'", double87 == (-1.0d));
        org.junit.Assert.assertNotNull(matrixMatrixOperation88);
        org.junit.Assert.assertNotNull(matrix89);
        org.junit.Assert.assertNotNull(matrix91);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        org.la4j.LinearAlgebra.DecompositorFactory decompositorFactory0 = org.la4j.LinearAlgebra.SVD;
        org.junit.Assert.assertNotNull(decompositorFactory0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        org.la4j.vector.sparse.CompressedVector compressedVector1 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        double double2 = compressedVector1.product();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double7 = rowMajorSparseMatrix3.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix8 = rowMajorSparseMatrix3.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate9 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean10 = sparseMatrix8.is(advancedMatrixPredicate9);
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure11 = null;
        sparseMatrix8.eachNonZero(matrixProcedure11);
        double double13 = sparseMatrix8.density();
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix8);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix2 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double3 = columnMajorSparseMatrix2.determinant();
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory4 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix5 = columnMajorSparseMatrix2.to(basic1DMatrixMatrixFactory4);
        byte[] byteArray6 = basic1DMatrix5.toBinary();
        // The following exception was thrown during execution in test generation
        try {
            basic1DMatrix5.set(52, 10, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Row '52' is invalid.");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory4);
        org.junit.Assert.assertNotNull(basic1DMatrix5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix5 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator6 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray7 = cCSMatrix5.foldRows(vectorAccumulator6);
        org.la4j.matrix.DenseMatrix denseMatrix8 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray7);
        org.la4j.vector.dense.BasicVector basicVector9 = new org.la4j.vector.dense.BasicVector(doubleArray7);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix14 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator15 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray16 = cCSMatrix14.foldRows(vectorAccumulator15);
        org.la4j.matrix.DenseMatrix denseMatrix17 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray16);
        org.la4j.vector.dense.BasicVector basicVector18 = new org.la4j.vector.dense.BasicVector(doubleArray16);
        ooPlaceOuterProduct0.ensureApplicableTo((org.la4j.Vector) basicVector9, (org.la4j.Vector) basicVector18);
        org.la4j.Vector vector21 = basicVector9.copyOfLength((int) (short) 0);
        org.la4j.Vector vector22 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double23 = basicVector9.cosineSimilarity(vector22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix5);
        org.junit.Assert.assertNotNull(vectorAccumulator6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix8);
        org.junit.Assert.assertNotNull(cCSMatrix14);
        org.junit.Assert.assertNotNull(vectorAccumulator15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix17);
        org.junit.Assert.assertNotNull(vector21);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        org.la4j.vector.dense.BasicVector basicVector1 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector2 = basicVector1.copy();
        double double3 = basicVector1.norm();
        org.junit.Assert.assertNotNull(vector2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        org.la4j.vector.DenseVector denseVector1 = org.la4j.vector.DenseVector.fromCSV("1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000");
        org.la4j.Vector vector3 = denseVector1.multiply(1.0E10d);
        org.la4j.vector.DenseVector denseVector4 = vector3.toDenseVector();
        org.junit.Assert.assertNotNull(denseVector1);
        org.junit.Assert.assertNotNull(vector3);
        org.junit.Assert.assertNotNull(denseVector4);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix2 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong matrix dimensions: -1x-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix5 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator6 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray7 = cCSMatrix5.foldRows(vectorAccumulator6);
        org.la4j.matrix.DenseMatrix denseMatrix8 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray7);
        org.la4j.vector.dense.BasicVector basicVector9 = new org.la4j.vector.dense.BasicVector(doubleArray7);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix14 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator15 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray16 = cCSMatrix14.foldRows(vectorAccumulator15);
        org.la4j.matrix.DenseMatrix denseMatrix17 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray16);
        org.la4j.vector.dense.BasicVector basicVector18 = new org.la4j.vector.dense.BasicVector(doubleArray16);
        ooPlaceOuterProduct0.ensureApplicableTo((org.la4j.Vector) basicVector9, (org.la4j.Vector) basicVector18);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct20 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.Vector vector22 = org.la4j.Vector.zero(100);
        org.la4j.Matrix matrix23 = basicVector9.apply((org.la4j.operation.VectorVectorOperation<org.la4j.Matrix>) ooPlaceOuterProduct20, vector22);
        double double24 = vector22.product();
        org.junit.Assert.assertNotNull(cCSMatrix5);
        org.junit.Assert.assertNotNull(vectorAccumulator6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix8);
        org.junit.Assert.assertNotNull(cCSMatrix14);
        org.junit.Assert.assertNotNull(vectorAccumulator15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix17);
        org.junit.Assert.assertNotNull(vector22);
        org.junit.Assert.assertNotNull(matrix23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix2 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator3 = org.la4j.Matrices.mkMinAccumulator();
        double double4 = columnMajorSparseMatrix2.fold(matrixAccumulator3);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix2);
        org.junit.Assert.assertNotNull(matrixAccumulator3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        org.la4j.vector.dense.BasicVector basicVector1 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector2 = basicVector1.copy();
        double[] doubleArray3 = basicVector1.toArray();
        org.la4j.operation.VectorOperation<org.la4j.Vector> vectorVectorOperation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector5 = basicVector1.apply(vectorVectorOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double7 = rowMajorSparseMatrix3.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix8 = rowMajorSparseMatrix3.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct9 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean10 = sparseMatrix8.equals((java.lang.Object) ooPlaceOuterProduct9);
        org.la4j.vector.DenseVector denseVector12 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random14 = null;
        org.la4j.vector.DenseVector denseVector15 = org.la4j.vector.DenseVector.random(0, random14);
        java.lang.String str16 = denseVector15.toString();
        ooPlaceOuterProduct9.ensureApplicableTo((org.la4j.Vector) denseVector12, (org.la4j.Vector) denseVector15);
        org.la4j.vector.sparse.CompressedVector compressedVector19 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        java.util.Random random21 = null;
        org.la4j.vector.DenseVector denseVector22 = org.la4j.vector.DenseVector.random(0, random21);
        double double23 = denseVector22.product();
        org.la4j.Matrix matrix24 = ooPlaceOuterProduct9.apply((org.la4j.vector.SparseVector) compressedVector19, denseVector22);
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct25 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.vector.sparse.CompressedVector compressedVector27 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation28 = ooPlaceInnerProduct25.partiallyApply((org.la4j.vector.SparseVector) compressedVector27);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct29 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random31 = null;
        org.la4j.vector.DenseVector denseVector32 = org.la4j.vector.DenseVector.random(0, random31);
        java.util.Random random34 = null;
        org.la4j.vector.DenseVector denseVector35 = org.la4j.vector.DenseVector.random(0, random34);
        org.la4j.Matrix matrix36 = ooPlaceOuterProduct29.apply(denseVector32, denseVector35);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix40 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double44 = rowMajorSparseMatrix40.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix45 = rowMajorSparseMatrix40.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct46 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean47 = sparseMatrix45.equals((java.lang.Object) ooPlaceOuterProduct46);
        org.la4j.vector.DenseVector denseVector49 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random51 = null;
        org.la4j.vector.DenseVector denseVector52 = org.la4j.vector.DenseVector.random(0, random51);
        java.lang.String str53 = denseVector52.toString();
        ooPlaceOuterProduct46.ensureApplicableTo((org.la4j.Vector) denseVector49, (org.la4j.Vector) denseVector52);
        org.la4j.vector.sparse.CompressedVector compressedVector56 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        java.util.Random random58 = null;
        org.la4j.vector.DenseVector denseVector59 = org.la4j.vector.DenseVector.random(0, random58);
        double double60 = denseVector59.product();
        org.la4j.Matrix matrix61 = ooPlaceOuterProduct46.apply((org.la4j.vector.SparseVector) compressedVector56, denseVector59);
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct62 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.vector.sparse.CompressedVector compressedVector64 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation65 = ooPlaceInnerProduct62.partiallyApply((org.la4j.vector.SparseVector) compressedVector64);
        org.la4j.Matrix matrix66 = ooPlaceOuterProduct29.apply((org.la4j.vector.SparseVector) compressedVector56, (org.la4j.vector.SparseVector) compressedVector64);
        org.la4j.Matrix matrix67 = ooPlaceOuterProduct9.apply((org.la4j.vector.SparseVector) compressedVector27, (org.la4j.vector.SparseVector) compressedVector64);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(denseVector12);
        org.junit.Assert.assertNotNull(denseVector15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(denseVector22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertNotNull(doubleVectorOperation28);
        org.junit.Assert.assertNotNull(denseVector32);
        org.junit.Assert.assertNotNull(denseVector35);
        org.junit.Assert.assertNotNull(matrix36);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix40);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(denseVector49);
        org.junit.Assert.assertNotNull(denseVector52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(denseVector59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertNotNull(matrix61);
        org.junit.Assert.assertNotNull(doubleVectorOperation65);
        org.junit.Assert.assertNotNull(matrix66);
        org.junit.Assert.assertNotNull(matrix67);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        org.la4j.matrix.functor.MatrixPredicate matrixPredicate0 = org.la4j.Matrices.POSITIVE_MATRIX;
        org.junit.Assert.assertNotNull(matrixPredicate0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix5 = rowMajorSparseMatrix4.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix7 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix8 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix4, denseMatrix7);
        double double9 = matrix8.diagonalProduct();
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix4);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(denseMatrix7);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct0 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.vector.sparse.CompressedVector compressedVector2 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation3 = ooPlaceInnerProduct0.partiallyApply((org.la4j.vector.SparseVector) compressedVector2);
        double double4 = compressedVector2.density();
        org.la4j.Vector vector6 = compressedVector2.multiply((double) (byte) 10);
        org.la4j.Matrix matrix7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector8 = vector6.multiply(matrix7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleVectorOperation3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(vector6);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.SparseMatrix sparseMatrix3 = org.la4j.matrix.SparseMatrix.zero(52, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cardinality should be less then or equal to capacity: 52.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix2 = org.la4j.matrix.ColumnMajorSparseMatrix.zero((int) (byte) 10, 100);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix2);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator3 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray4 = cCSMatrix2.foldRows(vectorAccumulator3);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix8 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator9 = columnMajorSparseMatrix8.nonZeroIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix14 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double18 = rowMajorSparseMatrix14.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix19 = rowMajorSparseMatrix14.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate20 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean21 = sparseMatrix19.is(advancedMatrixPredicate20);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator23 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double24 = sparseMatrix19.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator23);
        org.la4j.vector.functor.VectorProcedure vectorProcedure25 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator23);
        columnMajorSparseMatrix8.eachNonZeroInRow((-1), vectorProcedure25);
        cCSMatrix2.eachNonZeroInColumn(10, vectorProcedure25);
        double double29 = cCSMatrix2.maxInColumn((int) '#');
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertNotNull(vectorAccumulator3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix8);
        org.junit.Assert.assertNotNull(matrixIterator9);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix14);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix19);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(vectorAccumulator23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(vectorProcedure25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct0 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.vector.sparse.CompressedVector compressedVector2 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation3 = ooPlaceInnerProduct0.partiallyApply((org.la4j.vector.SparseVector) compressedVector2);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector5 = compressedVector2.blankOfLength((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong vector length: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleVectorOperation3);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.sparse.CCSMatrix cCSMatrix1 = org.la4j.matrix.sparse.CCSMatrix.fromCSV("%%MatrixMarket vector array real\n0\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"%%MatrixMarket\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random2 = null;
        org.la4j.vector.DenseVector denseVector3 = org.la4j.vector.DenseVector.random(0, random2);
        java.util.Random random5 = null;
        org.la4j.vector.DenseVector denseVector6 = org.la4j.vector.DenseVector.random(0, random5);
        org.la4j.Matrix matrix7 = ooPlaceOuterProduct0.apply(denseVector3, denseVector6);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct8 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random10 = null;
        org.la4j.vector.DenseVector denseVector11 = org.la4j.vector.DenseVector.random(0, random10);
        java.util.Random random13 = null;
        org.la4j.vector.DenseVector denseVector14 = org.la4j.vector.DenseVector.random(0, random13);
        org.la4j.Matrix matrix15 = ooPlaceOuterProduct8.apply(denseVector11, denseVector14);
        org.la4j.Vector vector16 = denseVector6.add((org.la4j.Vector) denseVector14);
        org.junit.Assert.assertNotNull(denseVector3);
        org.junit.Assert.assertNotNull(denseVector6);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(denseVector11);
        org.junit.Assert.assertNotNull(denseVector14);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertNotNull(vector16);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double3 = cRSMatrix2.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator4 = cRSMatrix2.nonZeroRowMajorIterator();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate5 = org.la4j.Matrices.DIAGONALLY_DOMINANT_MATRIX;
        boolean boolean6 = cRSMatrix2.non(advancedMatrixPredicate5);
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator4);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        org.la4j.vector.sparse.CompressedVector compressedVector1 = org.la4j.vector.sparse.CompressedVector.zero(52);
        org.junit.Assert.assertNotNull(compressedVector1);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double7 = rowMajorSparseMatrix3.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.functor.MatrixFunction matrixFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rowMajorSparseMatrix3.updateAt((int) (short) 100, (int) (byte) -1, matrixFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        org.la4j.Vector vector1 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str2 = vector1.toCSV();
        double double3 = vector1.sum();
        org.junit.Assert.assertNotNull(vector1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000" + "'", str2, "1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        int int0 = org.la4j.Matrices.ROUND_FACTOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 52 + "'", int0 == 52);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        double double0 = org.la4j.LinearAlgebra.EPS;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.1102230246251565E-14d + "'", double0 == 1.1102230246251565E-14d);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix1 = org.la4j.matrix.dense.Basic2DMatrix.identity((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double3 = cRSMatrix2.min();
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator4 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray5 = cRSMatrix2.foldNonZeroInColumns(vectorAccumulator4);
        int int6 = cRSMatrix2.columns();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix9 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double10 = cRSMatrix9.min();
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator11 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray12 = cRSMatrix9.foldNonZeroInColumns(vectorAccumulator11);
        double[] doubleArray13 = cRSMatrix2.foldNonZeroInRows(vectorAccumulator11);
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(vectorAccumulator4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(cRSMatrix9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(vectorAccumulator11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.vector.sparse.CompressedVector compressedVector1 = org.la4j.vector.sparse.CompressedVector.fromCSV("%%MatrixMarket matrix coordinate real general row-major\n1 35 0\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"%%MatrixMarket\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator3 = cRSMatrix2.nonZeroIterator();
        org.la4j.Vector vector5 = cRSMatrix2.getColumn(100);
        boolean boolean8 = cRSMatrix2.nonZeroAt(1, (int) (short) 0);
        org.la4j.decomposition.RawLUDecompositor rawLUDecompositor9 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) cRSMatrix2);
        org.la4j.Matrix[] matrixArray10 = rawLUDecompositor9.decompose();
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(matrixIterator3);
        org.junit.Assert.assertNotNull(vector5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(matrixArray10);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double4 = cRSMatrix3.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix8 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix9 = rowMajorSparseMatrix8.removeLastRow();
        org.la4j.Matrix matrix10 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, rowMajorSparseMatrix8);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix13 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double14 = cRSMatrix13.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator15 = cRSMatrix13.nonZeroRowMajorIterator();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix18 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double19 = cRSMatrix18.min();
        org.la4j.iterator.RowMajorMatrixIterator rowMajorMatrixIterator20 = cRSMatrix18.nonZeroRowMajorIterator();
        org.la4j.Matrix matrix21 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix13, (org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix18);
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate22 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix25 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        boolean boolean26 = advancedMatrixPredicate22.test((org.la4j.Matrix) columnMajorSparseMatrix25);
        org.la4j.inversion.NoPivotGaussInverter noPivotGaussInverter27 = new org.la4j.inversion.NoPivotGaussInverter((org.la4j.Matrix) columnMajorSparseMatrix25);
        org.la4j.Matrix matrix28 = columnMajorSparseMatrix25.blank();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix31 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator32 = cRSMatrix31.nonZeroIterator();
        org.la4j.Vector vector34 = cRSMatrix31.getColumn(100);
        boolean boolean37 = cRSMatrix31.nonZeroAt(1, (int) (short) 0);
        org.la4j.Matrix matrix38 = ooPlaceMatricesAddition0.apply(columnMajorSparseMatrix25, (org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix31);
        org.junit.Assert.assertNotNull(cRSMatrix3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(cRSMatrix13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator15);
        org.junit.Assert.assertNotNull(cRSMatrix18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorMatrixIterator20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate22);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertNotNull(cRSMatrix31);
        org.junit.Assert.assertNotNull(matrixIterator32);
        org.junit.Assert.assertNotNull(vector34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(matrix38);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        org.la4j.vector.sparse.CompressedVector compressedVector0 = new org.la4j.vector.sparse.CompressedVector();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix1 = org.la4j.Matrix.fromCSV("%%MatrixMarket matrix coordinate real general row-major\n100 100 0\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"%%MatrixMarket\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        org.la4j.LinearAlgebra.DecompositorFactory decompositorFactory0 = org.la4j.LinearAlgebra.DecompositorFactory.LU;
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double8 = rowMajorSparseMatrix4.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix9 = rowMajorSparseMatrix4.toSparseMatrix();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.decomposition.MatrixDecompositor matrixDecompositor10 = decompositorFactory0.create((org.la4j.Matrix) rowMajorSparseMatrix4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given matrix can not be used with this decompositor.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(decompositorFactory0);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix9);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        org.la4j.LinearAlgebra.DecompositorFactory decompositorFactory0 = org.la4j.LinearAlgebra.EIGEN;
        org.junit.Assert.assertNotNull(decompositorFactory0);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        org.la4j.operation.ooplace.OoPlaceKroneckerProduct ooPlaceKroneckerProduct0 = new org.la4j.operation.ooplace.OoPlaceKroneckerProduct();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double4 = cRSMatrix3.min();
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation5 = ooPlaceKroneckerProduct0.partiallyApply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3);
        org.junit.Assert.assertNotNull(cRSMatrix3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(matrixMatrixOperation5);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix4 = rowMajorSparseMatrix3.removeLastRow();
        double double8 = rowMajorSparseMatrix3.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        org.la4j.Vector vector10 = rowMajorSparseMatrix3.getColumn((int) 'a');
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(vector10);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix3 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix7 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double11 = rowMajorSparseMatrix7.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix12 = rowMajorSparseMatrix7.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate13 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean14 = sparseMatrix12.is(advancedMatrixPredicate13);
        java.text.NumberFormat numberFormat15 = null;
        java.lang.String str16 = sparseMatrix12.toMatrixMarket(numberFormat15);
        org.la4j.Matrix matrix17 = ooPlaceMatricesAddition0.applySymmetric((org.la4j.matrix.DenseMatrix) basic2DMatrix3, sparseMatrix12);
        org.junit.Assert.assertNotNull(basic2DMatrix3);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix12);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "%%MatrixMarket matrix coordinate real general row-major\n1 35 0\n" + "'", str16, "%%MatrixMarket matrix coordinate real general row-major\n1 35 0\n");
        org.junit.Assert.assertNotNull(matrix17);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation0 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray7 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray14 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray21 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray28 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray35 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray36 = new double[][] { doubleArray7, doubleArray14, doubleArray21, doubleArray28, doubleArray35 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix37 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray36);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation38 = matrixMatrixMatrixOperation0.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix37);
        double[][] doubleArray39 = new double[][] {};
        org.la4j.matrix.DenseMatrix denseMatrix40 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray39);
        double[] doubleArray47 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray54 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray61 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray68 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray75 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray76 = new double[][] { doubleArray47, doubleArray54, doubleArray61, doubleArray68, doubleArray75 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix77 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray76);
        basic2DMatrix77.setAll((double) 100);
        org.la4j.Matrix matrix80 = matrixMatrixMatrixOperation0.apply(denseMatrix40, (org.la4j.matrix.DenseMatrix) basic2DMatrix77);
        int int81 = matrix80.columns();
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(basic2DMatrix37);
        org.junit.Assert.assertNotNull(matrixMatrixOperation38);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertNotNull(denseMatrix40);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertNotNull(basic2DMatrix77);
        org.junit.Assert.assertNotNull(matrix80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 6 + "'", int81 == 6);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation0 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray7 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray14 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray21 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray28 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray35 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray36 = new double[][] { doubleArray7, doubleArray14, doubleArray21, doubleArray28, doubleArray35 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix37 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray36);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation38 = matrixMatrixMatrixOperation0.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix37);
        double[][] doubleArray39 = new double[][] {};
        org.la4j.matrix.DenseMatrix denseMatrix40 = org.la4j.matrix.DenseMatrix.from2DArray(doubleArray39);
        double[] doubleArray47 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray54 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray61 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray68 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray75 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray76 = new double[][] { doubleArray47, doubleArray54, doubleArray61, doubleArray68, doubleArray75 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix77 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray76);
        basic2DMatrix77.setAll((double) 100);
        org.la4j.Matrix matrix80 = matrixMatrixMatrixOperation0.apply(denseMatrix40, (org.la4j.matrix.DenseMatrix) basic2DMatrix77);
        // The following exception was thrown during execution in test generation
        try {
            basic2DMatrix77.swapRows((int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(basic2DMatrix37);
        org.junit.Assert.assertNotNull(matrixMatrixOperation38);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertNotNull(denseMatrix40);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertNotNull(basic2DMatrix77);
        org.junit.Assert.assertNotNull(matrix80);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        org.la4j.Matrix matrix2 = org.la4j.Matrix.zero((int) (byte) 1, (int) (short) 0);
        org.la4j.matrix.functor.MatrixPredicate matrixPredicate3 = org.la4j.Matrices.NEGATIVE_MATRIX;
        boolean boolean4 = matrix2.is(matrixPredicate3);
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(matrixPredicate3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        org.la4j.operation.ooplace.OoPlaceVectorsAddition ooPlaceVectorsAddition0 = new org.la4j.operation.ooplace.OoPlaceVectorsAddition();
        org.la4j.vector.dense.BasicVector basicVector2 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector3 = basicVector2.copy();
        org.la4j.vector.DenseVector denseVector5 = org.la4j.vector.DenseVector.fromCSV("1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000");
        org.la4j.Vector vector6 = ooPlaceVectorsAddition0.apply((org.la4j.vector.DenseVector) basicVector2, denseVector5);
        org.la4j.Matrix matrix7 = vector6.toRowMatrix();
        org.junit.Assert.assertNotNull(vector3);
        org.junit.Assert.assertNotNull(denseVector5);
        org.junit.Assert.assertNotNull(vector6);
        org.junit.Assert.assertNotNull(matrix7);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        org.la4j.vector.DenseVector denseVector1 = org.la4j.vector.DenseVector.unit((int) (byte) 10);
        org.junit.Assert.assertNotNull(denseVector1);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        java.util.Random random2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix3 = org.la4j.matrix.dense.Basic1DMatrix.random(6, (int) '#', random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        double double4 = cCSMatrix2.maxInColumn((int) (short) 0);
        org.la4j.Matrix matrix5 = cCSMatrix2.transpose();
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(matrix5);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double4 = cRSMatrix3.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix8 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix9 = rowMajorSparseMatrix8.removeLastRow();
        org.la4j.Matrix matrix10 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, rowMajorSparseMatrix8);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix13 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean14 = cCSMatrix13.isRowMajor();
        org.la4j.Matrix matrix17 = cCSMatrix13.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix20 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.Matrix matrix21 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix13, columnMajorSparseMatrix20);
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure22 = null;
        // The following exception was thrown during execution in test generation
        try {
            cCSMatrix13.each(matrixProcedure22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cRSMatrix3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(cCSMatrix13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(matrix17);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix20);
        org.junit.Assert.assertNotNull(matrix21);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix2 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double3 = columnMajorSparseMatrix2.sum();
        org.la4j.iterator.ColumnMajorMatrixIterator columnMajorMatrixIterator4 = columnMajorSparseMatrix2.iterator();
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(columnMajorMatrixIterator4);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix5 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator6 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray7 = cCSMatrix5.foldRows(vectorAccumulator6);
        org.la4j.matrix.DenseMatrix denseMatrix8 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray7);
        org.la4j.vector.dense.BasicVector basicVector9 = new org.la4j.vector.dense.BasicVector(doubleArray7);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix14 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator15 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray16 = cCSMatrix14.foldRows(vectorAccumulator15);
        org.la4j.matrix.DenseMatrix denseMatrix17 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray16);
        org.la4j.vector.dense.BasicVector basicVector18 = new org.la4j.vector.dense.BasicVector(doubleArray16);
        ooPlaceOuterProduct0.ensureApplicableTo((org.la4j.Vector) basicVector9, (org.la4j.Vector) basicVector18);
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct20 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.Vector vector22 = org.la4j.Vector.zero(100);
        org.la4j.Matrix matrix23 = basicVector9.apply((org.la4j.operation.VectorVectorOperation<org.la4j.Matrix>) ooPlaceOuterProduct20, vector22);
        org.la4j.vector.functor.VectorFunction vectorFunction26 = org.la4j.Vectors.asMulFunction((double) (short) 10);
        vector22.updateAt((int) (short) 0, vectorFunction26);
        org.la4j.Matrix matrix28 = vector22.toColumnMatrix();
        org.junit.Assert.assertNotNull(cCSMatrix5);
        org.junit.Assert.assertNotNull(vectorAccumulator6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix8);
        org.junit.Assert.assertNotNull(cCSMatrix14);
        org.junit.Assert.assertNotNull(vectorAccumulator15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix17);
        org.junit.Assert.assertNotNull(vector22);
        org.junit.Assert.assertNotNull(matrix23);
        org.junit.Assert.assertNotNull(vectorFunction26);
        org.junit.Assert.assertNotNull(matrix28);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        double[] doubleArray6 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray13 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray20 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray27 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray34 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray35 = new double[][] { doubleArray6, doubleArray13, doubleArray20, doubleArray27, doubleArray34 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix36 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray35);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix37 = new org.la4j.matrix.dense.Basic2DMatrix(doubleArray35);
        double double38 = basic2DMatrix37.product();
        org.la4j.iterator.VectorIterator vectorIterator40 = basic2DMatrix37.iteratorOfColumn(0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertNotNull(basic2DMatrix36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-3.98762104952942E42d) + "'", double38 == (-3.98762104952942E42d));
        org.junit.Assert.assertNotNull(vectorIterator40);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix4 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix5 = rowMajorSparseMatrix4.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix7 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix8 = ooPlaceMatricesSubtraction0.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix4, denseMatrix7);
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix11 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double12 = cRSMatrix11.min();
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator13 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray14 = cRSMatrix11.foldNonZeroInColumns(vectorAccumulator13);
        double[] doubleArray21 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray28 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray35 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray42 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray49 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray50 = new double[][] { doubleArray21, doubleArray28, doubleArray35, doubleArray42, doubleArray49 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix51 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray50);
        basic2DMatrix51.setAll((double) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix54 = ooPlaceMatricesSubtraction0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix11, (org.la4j.matrix.DenseMatrix) basic2DMatrix51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix4);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(denseMatrix7);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(cRSMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(vectorAccumulator13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertNotNull(basic2DMatrix51);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double7 = rowMajorSparseMatrix3.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix8 = rowMajorSparseMatrix3.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate9 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean10 = sparseMatrix8.is(advancedMatrixPredicate9);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator12 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double13 = sparseMatrix8.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator12);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = sparseMatrix8.minInRow((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix8);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(vectorAccumulator12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix3 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator4 = columnMajorSparseMatrix3.nonZeroIterator();
        org.la4j.operation.ooplace.OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction5 = new org.la4j.operation.ooplace.OoPlaceMatricesSubtraction();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix9 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix10 = rowMajorSparseMatrix9.removeLastRow();
        org.la4j.matrix.DenseMatrix denseMatrix12 = org.la4j.matrix.DenseMatrix.identity(100);
        org.la4j.Matrix matrix13 = ooPlaceMatricesSubtraction5.applySimple((org.la4j.matrix.SparseMatrix) rowMajorSparseMatrix9, denseMatrix12);
        org.la4j.Matrix matrix14 = ooPlaceMatricesSubtraction0.apply(columnMajorSparseMatrix3, denseMatrix12);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix17 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean18 = cCSMatrix17.isRowMajor();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix19 = new org.la4j.matrix.sparse.CCSMatrix();
        org.la4j.Matrix matrix20 = ooPlaceMatricesSubtraction0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix17, (org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix19);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix3);
        org.junit.Assert.assertNotNull(matrixIterator4);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(denseMatrix12);
        org.junit.Assert.assertNotNull(matrix13);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(cCSMatrix17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(matrix20);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        org.la4j.Vector vector1 = org.la4j.Vector.unit((int) (byte) 1);
        org.junit.Assert.assertNotNull(vector1);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator3 = cRSMatrix2.nonZeroIterator();
        org.la4j.Vector vector5 = cRSMatrix2.getColumn(100);
        org.la4j.vector.VectorFactory<org.la4j.vector.sparse.CompressedVector> compressedVectorVectorFactory6 = org.la4j.Vectors.COMPRESSED;
        org.la4j.vector.sparse.CompressedVector compressedVector7 = vector5.to(compressedVectorVectorFactory6);
        byte[] byteArray8 = compressedVector7.toBinary();
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix11 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator12 = columnMajorSparseMatrix11.nonZeroIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix17 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double21 = rowMajorSparseMatrix17.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix22 = rowMajorSparseMatrix17.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate23 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean24 = sparseMatrix22.is(advancedMatrixPredicate23);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator26 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double27 = sparseMatrix22.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator26);
        org.la4j.vector.functor.VectorProcedure vectorProcedure28 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator26);
        columnMajorSparseMatrix11.eachNonZeroInRow((-1), vectorProcedure28);
        compressedVector7.each(vectorProcedure28);
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(matrixIterator3);
        org.junit.Assert.assertNotNull(vector5);
        org.junit.Assert.assertNotNull(compressedVectorVectorFactory6);
        org.junit.Assert.assertNotNull(compressedVector7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[16, 0, 0, 0, 10, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix11);
        org.junit.Assert.assertNotNull(matrixIterator12);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix22);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(vectorAccumulator26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(vectorProcedure28);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix4 = rowMajorSparseMatrix3.removeLastRow();
        double double6 = matrix4.maxInColumn((int) (byte) 0);
        org.la4j.matrix.MatrixFactory<org.la4j.matrix.dense.Basic1DMatrix> basic1DMatrixMatrixFactory7 = org.la4j.Matrices.BASIC_1D;
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix8 = matrix4.to(basic1DMatrixMatrixFactory7);
        org.la4j.Matrix matrix9 = basic1DMatrix8.rotate();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.decomposition.RawLUDecompositor rawLUDecompositor10 = new org.la4j.decomposition.RawLUDecompositor((org.la4j.Matrix) basic1DMatrix8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given matrix can not be used with this decompositor.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(basic1DMatrixMatrixFactory7);
        org.junit.Assert.assertNotNull(basic1DMatrix8);
        org.junit.Assert.assertNotNull(matrix9);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix5 = rowMajorSparseMatrix3.blankOfRows(0);
        java.text.NumberFormat numberFormat6 = null;
        java.lang.String str7 = rowMajorSparseMatrix3.toMatrixMarket(numberFormat6);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "%%MatrixMarket matrix coordinate real general row-major\n1 35 0\n" + "'", str7, "%%MatrixMarket matrix coordinate real general row-major\n1 35 0\n");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator3 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray4 = cCSMatrix2.foldRows(vectorAccumulator3);
        org.la4j.iterator.VectorIterator vectorIterator6 = cCSMatrix2.iteratorOfColumn((int) '#');
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix10 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 100);
        org.la4j.iterator.MatrixIterator matrixIterator11 = columnMajorSparseMatrix10.nonZeroIterator();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix16 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double20 = rowMajorSparseMatrix16.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix21 = rowMajorSparseMatrix16.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate22 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean23 = sparseMatrix21.is(advancedMatrixPredicate22);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator25 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double26 = sparseMatrix21.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator25);
        org.la4j.vector.functor.VectorProcedure vectorProcedure27 = org.la4j.Vectors.asAccumulatorProcedure(vectorAccumulator25);
        columnMajorSparseMatrix10.eachNonZeroInRow((-1), vectorProcedure27);
        cCSMatrix2.eachNonZeroInRow(1, vectorProcedure27);
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertNotNull(vectorAccumulator3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(vectorIterator6);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix10);
        org.junit.Assert.assertNotNull(matrixIterator11);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix16);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix21);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(vectorAccumulator25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(vectorProcedure27);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        org.la4j.Matrix matrix2 = org.la4j.Matrix.zero((int) (byte) 1, (int) (short) 0);
        double double3 = matrix2.sum();
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix2 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (short) 1, 0);
        org.la4j.Matrix matrix3 = rowMajorSparseMatrix2.shuffle();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix8 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double12 = rowMajorSparseMatrix8.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix13 = rowMajorSparseMatrix8.toSparseMatrix();
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate14 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        boolean boolean15 = sparseMatrix13.is(advancedMatrixPredicate14);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator17 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double double18 = sparseMatrix13.foldNonZeroInColumn((int) (byte) 0, vectorAccumulator17);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = matrix3.foldRow((int) (short) 100, vectorAccumulator17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix2);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix13);
        org.junit.Assert.assertNotNull(advancedMatrixPredicate14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(vectorAccumulator17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        org.la4j.Vector vector1 = org.la4j.Vector.unit(10);
        org.la4j.Vector vector2 = vector1.shuffle();
        org.junit.Assert.assertNotNull(vector1);
        org.junit.Assert.assertNotNull(vector2);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation0 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray7 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray14 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray21 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray28 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray35 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray36 = new double[][] { doubleArray7, doubleArray14, doubleArray21, doubleArray28, doubleArray35 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix37 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray36);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation38 = matrixMatrixMatrixOperation0.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix37);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix41 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        double double42 = columnMajorSparseMatrix41.sum();
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation43 = matrixMatrixMatrixOperation0.partiallyApply(columnMajorSparseMatrix41);
        java.util.Iterator<java.lang.Integer> intItor44 = columnMajorSparseMatrix41.iteratorOrNonZeroColumns();
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(basic2DMatrix37);
        org.junit.Assert.assertNotNull(matrixMatrixOperation38);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(matrixMatrixOperation43);
        org.junit.Assert.assertNotNull(intItor44);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = new org.la4j.matrix.sparse.CRSMatrix((int) '#', 1, 0);
        int int4 = cRSMatrix3.columns();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        org.la4j.matrix.functor.MatrixFunction matrixFunction1 = org.la4j.Matrices.asPlusFunction((double) (byte) -1);
        org.junit.Assert.assertNotNull(matrixFunction1);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct0 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.vector.sparse.CompressedVector compressedVector2 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation3 = ooPlaceInnerProduct0.partiallyApply((org.la4j.vector.SparseVector) compressedVector2);
        double double4 = compressedVector2.density();
        org.la4j.Vector vector6 = compressedVector2.multiply((double) (byte) 10);
        double double7 = compressedVector2.min();
        org.junit.Assert.assertNotNull(doubleVectorOperation3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(vector6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix4 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double5 = cRSMatrix4.min();
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator6 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray7 = cRSMatrix4.foldNonZeroInColumns(vectorAccumulator6);
        org.la4j.matrix.DenseMatrix denseMatrix8 = org.la4j.matrix.DenseMatrix.from1DArray(0, 0, doubleArray7);
        org.la4j.decomposition.CholeskyDecompositor choleskyDecompositor9 = new org.la4j.decomposition.CholeskyDecompositor((org.la4j.Matrix) denseMatrix8);
        org.junit.Assert.assertNotNull(cRSMatrix4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(vectorAccumulator6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(denseMatrix8);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix4 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator5 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray6 = cCSMatrix4.foldRows(vectorAccumulator5);
        org.la4j.Vector vector7 = org.la4j.Vector.fromArray(doubleArray6);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix8 = org.la4j.matrix.dense.Basic1DMatrix.from1DArray((int) (short) 10, (int) (byte) 1, doubleArray6);
        org.junit.Assert.assertNotNull(cCSMatrix4);
        org.junit.Assert.assertNotNull(vectorAccumulator5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(vector7);
        org.junit.Assert.assertNotNull(basic1DMatrix8);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation0 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation1 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray8 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray15 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray22 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray29 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray36 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray37 = new double[][] { doubleArray8, doubleArray15, doubleArray22, doubleArray29, doubleArray36 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix38 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray37);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation39 = matrixMatrixMatrixOperation1.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix38);
        org.la4j.Matrix matrix41 = basic2DMatrix38.blankOfColumns(52);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix45 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix46 = rowMajorSparseMatrix45.removeLastRow();
        org.la4j.matrix.functor.MatrixFunction matrixFunction48 = null;
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator49 = org.la4j.Matrices.asSumFunctionAccumulator((double) (-1), matrixFunction48);
        double double50 = matrix46.fold(matrixAccumulator49);
        double double51 = matrix46.manhattanNorm();
        matrixMatrixMatrixOperation0.ensureApplicableTo(matrix41, matrix46);
        org.la4j.matrix.functor.MatrixPredicate matrixPredicate53 = org.la4j.Matrices.UPPER_TRIANGULAR_MATRIX;
        boolean boolean54 = matrix46.is(matrixPredicate53);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation0);
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation1);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertNotNull(basic2DMatrix38);
        org.junit.Assert.assertNotNull(matrixMatrixOperation39);
        org.junit.Assert.assertNotNull(matrix41);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix45);
        org.junit.Assert.assertNotNull(matrix46);
        org.junit.Assert.assertNotNull(matrixAccumulator49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(matrixPredicate53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        double double0 = org.la4j.Vectors.EPS;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.1102230246251565E-14d + "'", double0 == 1.1102230246251565E-14d);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix4 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator5 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray6 = cCSMatrix4.foldRows(vectorAccumulator5);
        org.la4j.Vector vector7 = org.la4j.Vector.fromArray(doubleArray6);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix8 = org.la4j.matrix.dense.Basic1DMatrix.from1DArray((int) (byte) 10, (int) ' ', doubleArray6);
        org.junit.Assert.assertNotNull(cCSMatrix4);
        org.junit.Assert.assertNotNull(vectorAccumulator5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(vector7);
        org.junit.Assert.assertNotNull(basic1DMatrix8);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector1 = org.la4j.Vector.unit((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = new org.la4j.matrix.sparse.CRSMatrix((int) '#', 1, 0);
        boolean boolean6 = cRSMatrix3.isZeroAt(10, 0);
        int[] intArray9 = new int[] { (byte) -1, (short) -1 };
        int[] intArray13 = new int[] { (byte) 0, '4', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix14 = cRSMatrix3.select(intArray9, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Row '-1' is invalid.");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 52, 10]");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix2 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) ' ', (int) '#');
        org.la4j.matrix.functor.MatrixFunction matrixFunction5 = org.la4j.Matrices.asMulFunction((double) 1);
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator6 = org.la4j.Matrices.asSumFunctionAccumulator((double) 0L, matrixFunction5);
        org.la4j.Matrix matrix7 = rowMajorSparseMatrix2.transform(matrixFunction5);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix2);
        org.junit.Assert.assertNotNull(matrixFunction5);
        org.junit.Assert.assertNotNull(matrixAccumulator6);
        org.junit.Assert.assertNotNull(matrix7);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix4 = rowMajorSparseMatrix3.removeLastRow();
        double double8 = rowMajorSparseMatrix3.getOrElse(0, (int) (short) 10, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector10 = rowMajorSparseMatrix3.getRow((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double4 = cRSMatrix3.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix8 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix9 = rowMajorSparseMatrix8.removeLastRow();
        org.la4j.Matrix matrix10 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, rowMajorSparseMatrix8);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix13 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean14 = cCSMatrix13.isRowMajor();
        org.la4j.Matrix matrix17 = cCSMatrix13.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix20 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.Matrix matrix21 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix13, columnMajorSparseMatrix20);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = cCSMatrix13.get((int) (short) -1, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Row '-1' is invalid.");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cRSMatrix3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(cCSMatrix13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(matrix17);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix20);
        org.junit.Assert.assertNotNull(matrix21);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        org.la4j.matrix.functor.AdvancedMatrixPredicate advancedMatrixPredicate0 = org.la4j.Matrices.SYMMETRIC_MATRIX;
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix3 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        boolean boolean4 = advancedMatrixPredicate0.test((org.la4j.Matrix) columnMajorSparseMatrix3);
        org.la4j.inversion.NoPivotGaussInverter noPivotGaussInverter5 = new org.la4j.inversion.NoPivotGaussInverter((org.la4j.Matrix) columnMajorSparseMatrix3);
        org.la4j.Matrix matrix6 = columnMajorSparseMatrix3.blank();
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition7 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix10 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double11 = cRSMatrix10.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix15 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix16 = rowMajorSparseMatrix15.removeLastRow();
        org.la4j.Matrix matrix17 = ooPlaceMatricesAddition7.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix10, rowMajorSparseMatrix15);
        org.la4j.decomposition.CholeskyDecompositor choleskyDecompositor18 = new org.la4j.decomposition.CholeskyDecompositor((org.la4j.Matrix) cRSMatrix10);
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix19 = matrix6.add((org.la4j.Matrix) cRSMatrix10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given matrices should have the same shape: 0x0 does not equal to 10x10.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(advancedMatrixPredicate0);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(matrix6);
        org.junit.Assert.assertNotNull(cRSMatrix10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix15);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(matrix17);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix1 = org.la4j.matrix.RowMajorSparseMatrix.identity((int) 'a');
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix5 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double6 = cRSMatrix5.min();
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator7 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray8 = cRSMatrix5.foldNonZeroInColumns(vectorAccumulator7);
        double double9 = rowMajorSparseMatrix1.foldNonZeroInRow(0, vectorAccumulator7);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix1);
        org.junit.Assert.assertNotNull(cRSMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(vectorAccumulator7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix3 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double7 = rowMajorSparseMatrix3.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix8 = rowMajorSparseMatrix3.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct9 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean10 = sparseMatrix8.equals((java.lang.Object) ooPlaceOuterProduct9);
        org.la4j.vector.DenseVector denseVector12 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random14 = null;
        org.la4j.vector.DenseVector denseVector15 = org.la4j.vector.DenseVector.random(0, random14);
        java.lang.String str16 = denseVector15.toString();
        ooPlaceOuterProduct9.ensureApplicableTo((org.la4j.Vector) denseVector12, (org.la4j.Vector) denseVector15);
        org.la4j.vector.sparse.CompressedVector compressedVector19 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        java.util.Random random21 = null;
        org.la4j.vector.DenseVector denseVector22 = org.la4j.vector.DenseVector.random(0, random21);
        double double23 = denseVector22.product();
        org.la4j.Matrix matrix24 = ooPlaceOuterProduct9.apply((org.la4j.vector.SparseVector) compressedVector19, denseVector22);
        org.la4j.vector.sparse.CompressedVector compressedVector26 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.vector.sparse.CompressedVector compressedVector28 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.Matrix matrix29 = ooPlaceOuterProduct9.apply((org.la4j.vector.SparseVector) compressedVector26, (org.la4j.vector.SparseVector) compressedVector28);
        java.util.Spliterator<java.lang.Double> doubleSpliterator30 = compressedVector28.spliterator();
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(denseVector12);
        org.junit.Assert.assertNotNull(denseVector15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(denseVector22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertNotNull(matrix29);
        org.junit.Assert.assertNotNull(doubleSpliterator30);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        org.la4j.Vector vector1 = org.la4j.Vector.unit((int) (short) 10);
        org.la4j.vector.DenseVector denseVector2 = vector1.toDenseVector();
        java.text.NumberFormat numberFormat3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = denseVector2.mkString(numberFormat3, "%%MatrixMarket matrix coordinate real general row-major\n100 100 0\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector1);
        org.junit.Assert.assertNotNull(denseVector2);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix2 = org.la4j.matrix.dense.Basic1DMatrix.zero((int) (short) 0, 100);
        org.junit.Assert.assertNotNull(basic1DMatrix2);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        org.la4j.matrix.functor.MatrixAccumulator matrixAccumulator0 = org.la4j.Matrices.mkInfinityNormAccumulator();
        double double1 = matrixAccumulator0.accumulate();
        org.la4j.matrix.functor.MatrixProcedure matrixProcedure2 = org.la4j.Matrices.asAccumulatorProcedure(matrixAccumulator0);
        org.junit.Assert.assertNotNull(matrixAccumulator0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertNotNull(matrixProcedure2);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double4 = cRSMatrix3.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix8 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix9 = rowMajorSparseMatrix8.removeLastRow();
        org.la4j.Matrix matrix10 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, rowMajorSparseMatrix8);
        org.la4j.decomposition.CholeskyDecompositor choleskyDecompositor11 = new org.la4j.decomposition.CholeskyDecompositor((org.la4j.Matrix) cRSMatrix3);
        org.la4j.Matrix matrix12 = cRSMatrix3.rotate();
        org.la4j.LinearAlgebra.SolverFactory solverFactory13 = org.la4j.LinearAlgebra.SWEEP;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.linear.LinearSystemSolver linearSystemSolver14 = matrix12.withSolver(solverFactory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Given coefficient matrix can not be used with this solver.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cRSMatrix3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(matrix12);
        org.junit.Assert.assertNotNull(solverFactory13);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random2 = null;
        org.la4j.vector.DenseVector denseVector3 = org.la4j.vector.DenseVector.random(0, random2);
        java.util.Random random5 = null;
        org.la4j.vector.DenseVector denseVector6 = org.la4j.vector.DenseVector.random(0, random5);
        org.la4j.Matrix matrix7 = ooPlaceOuterProduct0.apply(denseVector3, denseVector6);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix11 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double15 = rowMajorSparseMatrix11.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix16 = rowMajorSparseMatrix11.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct17 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean18 = sparseMatrix16.equals((java.lang.Object) ooPlaceOuterProduct17);
        org.la4j.vector.DenseVector denseVector20 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random22 = null;
        org.la4j.vector.DenseVector denseVector23 = org.la4j.vector.DenseVector.random(0, random22);
        java.lang.String str24 = denseVector23.toString();
        ooPlaceOuterProduct17.ensureApplicableTo((org.la4j.Vector) denseVector20, (org.la4j.Vector) denseVector23);
        org.la4j.vector.sparse.CompressedVector compressedVector27 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        java.util.Random random29 = null;
        org.la4j.vector.DenseVector denseVector30 = org.la4j.vector.DenseVector.random(0, random29);
        double double31 = denseVector30.product();
        org.la4j.Matrix matrix32 = ooPlaceOuterProduct17.apply((org.la4j.vector.SparseVector) compressedVector27, denseVector30);
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct33 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.vector.sparse.CompressedVector compressedVector35 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation36 = ooPlaceInnerProduct33.partiallyApply((org.la4j.vector.SparseVector) compressedVector35);
        org.la4j.Matrix matrix37 = ooPlaceOuterProduct0.apply((org.la4j.vector.SparseVector) compressedVector27, (org.la4j.vector.SparseVector) compressedVector35);
        org.la4j.Vector vector39 = compressedVector35.subtract(1.0d);
        org.junit.Assert.assertNotNull(denseVector3);
        org.junit.Assert.assertNotNull(denseVector6);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(denseVector20);
        org.junit.Assert.assertNotNull(denseVector23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(denseVector30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertNotNull(doubleVectorOperation36);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(vector39);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix3 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double4 = cRSMatrix3.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix8 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix9 = rowMajorSparseMatrix8.removeLastRow();
        org.la4j.Matrix matrix10 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix3, rowMajorSparseMatrix8);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix13 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        boolean boolean14 = cCSMatrix13.isRowMajor();
        org.la4j.Matrix matrix17 = cCSMatrix13.blankOfShape((int) '#', (int) (short) 100);
        org.la4j.matrix.ColumnMajorSparseMatrix columnMajorSparseMatrix20 = org.la4j.matrix.ColumnMajorSparseMatrix.zero(0, (int) (short) 0);
        org.la4j.Matrix matrix21 = ooPlaceMatricesAddition0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix13, columnMajorSparseMatrix20);
        org.la4j.operation.ooplace.OoPlaceMatricesAddition ooPlaceMatricesAddition22 = new org.la4j.operation.ooplace.OoPlaceMatricesAddition();
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix25 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        double double26 = cRSMatrix25.min();
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix30 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        org.la4j.Matrix matrix31 = rowMajorSparseMatrix30.removeLastRow();
        org.la4j.Matrix matrix32 = ooPlaceMatricesAddition22.apply((org.la4j.matrix.RowMajorSparseMatrix) cRSMatrix25, rowMajorSparseMatrix30);
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix35 = org.la4j.matrix.dense.Basic2DMatrix.unit((int) (byte) 1, (int) '4');
        org.la4j.Matrix matrix36 = ooPlaceMatricesAddition0.apply(rowMajorSparseMatrix30, (org.la4j.matrix.DenseMatrix) basic2DMatrix35);
        byte[] byteArray37 = basic2DMatrix35.toBinary();
        org.la4j.Matrix matrix40 = basic2DMatrix35.copyOfShape((int) ' ', (int) '#');
        org.junit.Assert.assertNotNull(cRSMatrix3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(cCSMatrix13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(matrix17);
        org.junit.Assert.assertNotNull(columnMajorSparseMatrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(cRSMatrix25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix30);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertNotNull(basic2DMatrix35);
        org.junit.Assert.assertNotNull(matrix36);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertNotNull(matrix40);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix2 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        double double5 = cCSMatrix2.get((int) (byte) 0, (int) (short) 1);
        boolean boolean6 = cCSMatrix2.isRowMajor();
        org.junit.Assert.assertNotNull(cCSMatrix2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        org.la4j.operation.ooplace.OoPlaceKroneckerProduct ooPlaceKroneckerProduct0 = new org.la4j.operation.ooplace.OoPlaceKroneckerProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix1 = new org.la4j.matrix.sparse.CCSMatrix();
        org.la4j.operation.MatrixMatrixOperation<org.la4j.Matrix> matrixMatrixMatrixOperation2 = org.la4j.LinearAlgebra.IN_PLACE_COPY_MATRIX_TO_MATRIX;
        double[] doubleArray9 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray16 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray23 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray30 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[] doubleArray37 = new double[] { '#', 100.0f, '4', '#', (byte) -1, '4' };
        double[][] doubleArray38 = new double[][] { doubleArray9, doubleArray16, doubleArray23, doubleArray30, doubleArray37 };
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix39 = org.la4j.matrix.dense.Basic2DMatrix.from2DArray(doubleArray38);
        org.la4j.operation.MatrixOperation<org.la4j.Matrix> matrixMatrixOperation40 = matrixMatrixMatrixOperation2.partiallyApply((org.la4j.matrix.DenseMatrix) basic2DMatrix39);
        java.util.Spliterator<java.lang.Double> doubleSpliterator41 = basic2DMatrix39.spliterator();
        byte[] byteArray42 = basic2DMatrix39.toBinary();
        org.la4j.Matrix matrix43 = ooPlaceKroneckerProduct0.apply((org.la4j.matrix.ColumnMajorSparseMatrix) cCSMatrix1, (org.la4j.matrix.DenseMatrix) basic2DMatrix39);
        org.la4j.matrix.dense.Basic1DMatrix basic1DMatrix45 = org.la4j.matrix.dense.Basic1DMatrix.fromCSV("1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000");
        org.la4j.matrix.DenseMatrix denseMatrix46 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Matrix matrix47 = ooPlaceKroneckerProduct0.apply((org.la4j.matrix.DenseMatrix) basic1DMatrix45, denseMatrix46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrixMatrixMatrixOperation2);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[35.0, 100.0, 52.0, 35.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertNotNull(basic2DMatrix39);
        org.junit.Assert.assertNotNull(matrixMatrixOperation40);
        org.junit.Assert.assertNotNull(doubleSpliterator41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[16, 0, 0, 0, 5, 0, 0, 0, 6, 64, 65, -128, 0, 0, 0, 0, 0, 64, 89, 0, 0, 0, 0, 0, 0, 64, 74, 0, 0, 0, 0, 0, 0, 64, 65, -128, 0, 0, 0, 0, 0, -65, -16, 0, 0, 0, 0, 0, 0, 64, 74, 0, 0, 0, 0, 0, 0, 64, 65, -128, 0, 0, 0, 0, 0, 64, 89, 0, 0, 0, 0, 0, 0, 64, 74, 0, 0, 0, 0, 0, 0, 64, 65, -128, 0, 0, 0, 0, 0, -65, -16, 0, 0, 0, 0, 0, 0, 64, 74, 0, 0, 0, 0, 0, 0, 64, 65, -128, 0, 0, 0, 0, 0, 64, 89, 0, 0, 0, 0, 0, 0, 64, 74, 0, 0, 0, 0, 0, 0, 64, 65, -128, 0, 0, 0, 0, 0, -65, -16, 0, 0, 0, 0, 0, 0, 64, 74, 0, 0, 0, 0, 0, 0, 64, 65, -128, 0, 0, 0, 0, 0, 64, 89, 0, 0, 0, 0, 0, 0, 64, 74, 0, 0, 0, 0, 0, 0, 64, 65, -128, 0, 0, 0, 0, 0, -65, -16, 0, 0, 0, 0, 0, 0, 64, 74, 0, 0, 0, 0, 0, 0, 64, 65, -128, 0, 0, 0, 0, 0, 64, 89, 0, 0, 0, 0, 0, 0, 64, 74, 0, 0, 0, 0, 0, 0, 64, 65, -128, 0, 0, 0, 0, 0, -65, -16, 0, 0, 0, 0, 0, 0, 64, 74, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(matrix43);
        org.junit.Assert.assertNotNull(basic1DMatrix45);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.vector.dense.BasicVector basicVector1 = org.la4j.vector.dense.BasicVector.fromMatrixMarket(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix5 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator6 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray7 = cCSMatrix5.foldRows(vectorAccumulator6);
        org.la4j.matrix.DenseMatrix denseMatrix8 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray7);
        org.la4j.vector.dense.BasicVector basicVector9 = new org.la4j.vector.dense.BasicVector(doubleArray7);
        org.la4j.matrix.sparse.CCSMatrix cCSMatrix14 = org.la4j.matrix.sparse.CCSMatrix.diagonal((int) '4', (double) (byte) -1);
        org.la4j.vector.functor.VectorAccumulator vectorAccumulator15 = org.la4j.Vectors.mkEuclideanNormAccumulator();
        double[] doubleArray16 = cCSMatrix14.foldRows(vectorAccumulator15);
        org.la4j.matrix.DenseMatrix denseMatrix17 = org.la4j.matrix.DenseMatrix.from1DArray(0, (int) (byte) 0, doubleArray16);
        org.la4j.vector.dense.BasicVector basicVector18 = new org.la4j.vector.dense.BasicVector(doubleArray16);
        ooPlaceOuterProduct0.ensureApplicableTo((org.la4j.Vector) basicVector9, (org.la4j.Vector) basicVector18);
        org.la4j.Matrix matrix20 = basicVector18.toColumnMatrix();
        // The following exception was thrown during execution in test generation
        try {
            basicVector18.swapElements((int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cCSMatrix5);
        org.junit.Assert.assertNotNull(vectorAccumulator6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix8);
        org.junit.Assert.assertNotNull(cCSMatrix14);
        org.junit.Assert.assertNotNull(vectorAccumulator15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(denseMatrix17);
        org.junit.Assert.assertNotNull(matrix20);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct0 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        java.util.Random random2 = null;
        org.la4j.vector.DenseVector denseVector3 = org.la4j.vector.DenseVector.random(0, random2);
        java.util.Random random5 = null;
        org.la4j.vector.DenseVector denseVector6 = org.la4j.vector.DenseVector.random(0, random5);
        org.la4j.Matrix matrix7 = ooPlaceOuterProduct0.apply(denseVector3, denseVector6);
        org.la4j.matrix.RowMajorSparseMatrix rowMajorSparseMatrix11 = org.la4j.matrix.RowMajorSparseMatrix.zero((int) (byte) 1, (int) '#', 10);
        double double15 = rowMajorSparseMatrix11.getOrElse((int) (short) 0, (int) (byte) 1, (double) 1.0f);
        org.la4j.matrix.SparseMatrix sparseMatrix16 = rowMajorSparseMatrix11.toSparseMatrix();
        org.la4j.operation.ooplace.OoPlaceOuterProduct ooPlaceOuterProduct17 = new org.la4j.operation.ooplace.OoPlaceOuterProduct();
        boolean boolean18 = sparseMatrix16.equals((java.lang.Object) ooPlaceOuterProduct17);
        org.la4j.vector.DenseVector denseVector20 = org.la4j.vector.DenseVector.unit((int) (short) 10);
        java.util.Random random22 = null;
        org.la4j.vector.DenseVector denseVector23 = org.la4j.vector.DenseVector.random(0, random22);
        java.lang.String str24 = denseVector23.toString();
        ooPlaceOuterProduct17.ensureApplicableTo((org.la4j.Vector) denseVector20, (org.la4j.Vector) denseVector23);
        org.la4j.vector.sparse.CompressedVector compressedVector27 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        java.util.Random random29 = null;
        org.la4j.vector.DenseVector denseVector30 = org.la4j.vector.DenseVector.random(0, random29);
        double double31 = denseVector30.product();
        org.la4j.Matrix matrix32 = ooPlaceOuterProduct17.apply((org.la4j.vector.SparseVector) compressedVector27, denseVector30);
        org.la4j.operation.ooplace.OoPlaceInnerProduct ooPlaceInnerProduct33 = new org.la4j.operation.ooplace.OoPlaceInnerProduct();
        org.la4j.vector.sparse.CompressedVector compressedVector35 = new org.la4j.vector.sparse.CompressedVector((int) ' ');
        org.la4j.operation.VectorOperation<java.lang.Double> doubleVectorOperation36 = ooPlaceInnerProduct33.partiallyApply((org.la4j.vector.SparseVector) compressedVector35);
        org.la4j.Matrix matrix37 = ooPlaceOuterProduct0.apply((org.la4j.vector.SparseVector) compressedVector27, (org.la4j.vector.SparseVector) compressedVector35);
        org.la4j.Vector vector39 = compressedVector35.add((double) 10.0f);
        org.junit.Assert.assertNotNull(denseVector3);
        org.junit.Assert.assertNotNull(denseVector6);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(rowMajorSparseMatrix11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(sparseMatrix16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(denseVector20);
        org.junit.Assert.assertNotNull(denseVector23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(denseVector30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertNotNull(doubleVectorOperation36);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(vector39);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        org.la4j.matrix.sparse.CRSMatrix cRSMatrix2 = org.la4j.matrix.sparse.CRSMatrix.diagonal(10, (double) 10);
        org.la4j.iterator.MatrixIterator matrixIterator3 = cRSMatrix2.nonZeroIterator();
        org.la4j.iterator.VectorIterator vectorIterator5 = cRSMatrix2.nonZeroIteratorOfRow(0);
        org.junit.Assert.assertNotNull(cRSMatrix2);
        org.junit.Assert.assertNotNull(matrixIterator3);
        org.junit.Assert.assertNotNull(vectorIterator5);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        java.util.Random random2 = null;
        org.la4j.matrix.dense.Basic2DMatrix basic2DMatrix3 = org.la4j.matrix.dense.Basic2DMatrix.random(0, (int) (short) 0, random2);
        org.junit.Assert.assertNotNull(basic2DMatrix3);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        org.la4j.operation.ooplace.OoPlaceVectorsAddition ooPlaceVectorsAddition0 = new org.la4j.operation.ooplace.OoPlaceVectorsAddition();
        org.la4j.vector.dense.BasicVector basicVector2 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector3 = basicVector2.copy();
        org.la4j.vector.DenseVector denseVector5 = org.la4j.vector.DenseVector.fromCSV("1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000");
        org.la4j.Vector vector6 = ooPlaceVectorsAddition0.apply((org.la4j.vector.DenseVector) basicVector2, denseVector5);
        org.la4j.operation.ooplace.OoPlaceVectorsAddition ooPlaceVectorsAddition7 = new org.la4j.operation.ooplace.OoPlaceVectorsAddition();
        org.la4j.vector.dense.BasicVector basicVector9 = new org.la4j.vector.dense.BasicVector((int) (byte) 10);
        org.la4j.Vector vector10 = basicVector9.copy();
        org.la4j.vector.DenseVector denseVector12 = org.la4j.vector.DenseVector.fromCSV("1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000, 1.000");
        org.la4j.Vector vector13 = ooPlaceVectorsAddition7.apply((org.la4j.vector.DenseVector) basicVector9, denseVector12);
        java.util.Random random15 = null;
        org.la4j.vector.DenseVector denseVector16 = org.la4j.vector.DenseVector.random(0, random15);
        double double17 = denseVector16.sum();
        // The following exception was thrown during execution in test generation
        try {
            org.la4j.Vector vector18 = ooPlaceVectorsAddition0.apply((org.la4j.vector.DenseVector) basicVector9, denseVector16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector3);
        org.junit.Assert.assertNotNull(denseVector5);
        org.junit.Assert.assertNotNull(vector6);
        org.junit.Assert.assertNotNull(vector10);
        org.junit.Assert.assertNotNull(denseVector12);
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertNotNull(denseVector16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }
}

