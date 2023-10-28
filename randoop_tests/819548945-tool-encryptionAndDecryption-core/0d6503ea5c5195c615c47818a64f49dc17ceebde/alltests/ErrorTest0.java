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
        byte[] byteArray1 = new byte[] { (byte) -1 };
        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);
        byte[] byteArray4 = new byte[] { (byte) -1 };
        java.security.PublicKey publicKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.security.PrivateKey privateKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toGMPrivateKey(byteArray1, byteArray4);
    }
}

