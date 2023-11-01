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
        org.la4j.Vector vector1 = org.la4j.Vector.unit((int) (short) 10);
        java.lang.String str2 = vector1.toCSV();
        org.la4j.vector.SparseVector sparseVector3 = vector1.toSparseVector();
        boolean boolean5 = sparseVector3.isZeroAt(52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector1 and sparseVector3", vector1.equals(sparseVector3) ? vector1.hashCode() == sparseVector3.hashCode() : true);
    }
}

