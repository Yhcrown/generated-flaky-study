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
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.NORTH_CAROLINA;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.NORTH_CAROLINA + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.NORTH_CAROLINA));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.HUILA;
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.HUILA + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.HUILA));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.CUNDINAMARCA;
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.CUNDINAMARCA + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.CUNDINAMARCA));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.ATLANTICO;
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.ATLANTICO + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.ATLANTICO));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.lang.String str1 = net.canadensys.utils.StringUtils.unaccent("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.BOLIVAR;
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.BOLIVAR + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.BOLIVAR));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince0 = net.canadensys.vocabulary.stateprovince.BEProvince.EAST_FLANDERS;
        org.junit.Assert.assertTrue("'" + bEProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.BEProvince.EAST_FLANDERS + "'", bEProvince0.equals(net.canadensys.vocabulary.stateprovince.BEProvince.EAST_FLANDERS));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.PUTUMAYO;
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.PUTUMAYO + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.PUTUMAYO));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle4 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("", locale1, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.DISTRITO_CAPITAL_BOGOTA;
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.DISTRITO_CAPITAL_BOGOTA + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.DISTRITO_CAPITAL_BOGOTA));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        net.canadensys.utils.NumberUtils numberUtils0 = new net.canadensys.utils.NumberUtils();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.GUAINIA;
        java.lang.String str1 = cODepartment0.getCode();
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.GUAINIA + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.GUAINIA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CO-GUA" + "'", str1, "CO-GUA");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.WISCONSIN;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.WISCONSIN + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.WISCONSIN));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.UTAH;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.UTAH + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.UTAH));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.NORTH_DAKOTA;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.NORTH_DAKOTA + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.NORTH_DAKOTA));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.KENTUCKY;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.KENTUCKY + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.KENTUCKY));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        int int0 = net.canadensys.lang.RomanNumeral.MAX_VALUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3999 + "'", int0 == 3999);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.lang.String str1 = net.canadensys.utils.StringUtils.unaccent("CO-GUA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CO-GUA" + "'", str1, "CO-GUA");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.TOLIMA;
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.TOLIMA + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.TOLIMA));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.OKLAHOMA;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.OKLAHOMA + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.OKLAHOMA));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.BOYACA;
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.BOYACA + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.BOYACA));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        net.canadensys.vocabulary.Continent continent0 = net.canadensys.vocabulary.Continent.SOUTH_AMERICA;
        org.junit.Assert.assertTrue("'" + continent0 + "' != '" + net.canadensys.vocabulary.Continent.SOUTH_AMERICA + "'", continent0.equals(net.canadensys.vocabulary.Continent.SOUTH_AMERICA));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.ALABAMA;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.ALABAMA + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.ALABAMA));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment1 = net.canadensys.vocabulary.stateprovince.CODepartment.fromCode("hi!");
        org.junit.Assert.assertNull(cODepartment1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.OHIO;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.OHIO + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.OHIO));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        net.canadensys.vocabulary.stateprovince.CAProvince cAProvince0 = net.canadensys.vocabulary.stateprovince.CAProvince.NORTHWEST_TERRITORIES;
        java.lang.String str1 = cAProvince0.getName();
        org.junit.Assert.assertTrue("'" + cAProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.CAProvince.NORTHWEST_TERRITORIES + "'", cAProvince0.equals(net.canadensys.vocabulary.stateprovince.CAProvince.NORTHWEST_TERRITORIES));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Northwest Territories" + "'", str1, "Northwest Territories");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.MISSISSIPPI;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.MISSISSIPPI + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.MISSISSIPPI));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        net.canadensys.vocabulary.stateprovince.CAProvince cAProvince0 = net.canadensys.vocabulary.stateprovince.CAProvince.NEWFOUNDLAND_AND_LABRADOR;
        org.junit.Assert.assertTrue("'" + cAProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.CAProvince.NEWFOUNDLAND_AND_LABRADOR + "'", cAProvince0.equals(net.canadensys.vocabulary.stateprovince.CAProvince.NEWFOUNDLAND_AND_LABRADOR));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.NORTE_DE_SANTANDER;
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.NORTE_DE_SANTANDER + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.NORTE_DE_SANTANDER));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        net.canadensys.vocabulary.stateprovince.CAProvince cAProvince0 = net.canadensys.vocabulary.stateprovince.CAProvince.QUEBEC;
        org.junit.Assert.assertTrue("'" + cAProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.CAProvince.QUEBEC + "'", cAProvince0.equals(net.canadensys.vocabulary.stateprovince.CAProvince.QUEBEC));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = net.canadensys.utils.ZipUtils.unzipFileOrFolder(file0, "CO-GUA");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        net.canadensys.utils.LangUtils langUtils0 = new net.canadensys.utils.LangUtils();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.IDAHO;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.IDAHO + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.IDAHO));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.ANTIOQUIA;
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.ANTIOQUIA + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.ANTIOQUIA));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.NEW_JERSEY;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.NEW_JERSEY + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.NEW_JERSEY));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.GUAVIARE;
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.GUAVIARE + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.GUAVIARE));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.COLORADO;
        java.lang.String str1 = uSState0.getName();
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.COLORADO + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.COLORADO));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Colorado" + "'", str1, "Colorado");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.lang.String str1 = net.canadensys.utils.StringUtils.unaccent("Northwest Territories");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Northwest Territories" + "'", str1, "Northwest Territories");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        net.canadensys.utils.ListUtils listUtils0 = new net.canadensys.utils.ListUtils();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle4 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("Northwest Territories", locale1, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.VAUPES;
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.VAUPES + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.VAUPES));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.MONTANA;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.MONTANA + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.MONTANA));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        net.canadensys.utils.ZipUtils zipUtils0 = new net.canadensys.utils.ZipUtils();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.CALIFORNIA;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.CALIFORNIA + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.CALIFORNIA));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.HAWAII;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.HAWAII + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.HAWAII));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        net.canadensys.vocabulary.stateprovince.CAProvince cAProvince0 = net.canadensys.vocabulary.stateprovince.CAProvince.ALBERTA;
        org.junit.Assert.assertTrue("'" + cAProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.CAProvince.ALBERTA + "'", cAProvince0.equals(net.canadensys.vocabulary.stateprovince.CAProvince.ALBERTA));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        net.canadensys.bundle.UTF8PropertyResourceBundle uTF8PropertyResourceBundle0 = new net.canadensys.bundle.UTF8PropertyResourceBundle();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle4 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("CO-GUA", locale1, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle3 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("Nevada", locale1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.CAQUETA;
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.CAQUETA + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.CAQUETA));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince0 = net.canadensys.vocabulary.stateprovince.BEProvince.LIEGE;
        org.junit.Assert.assertTrue("'" + bEProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.BEProvince.LIEGE + "'", bEProvince0.equals(net.canadensys.vocabulary.stateprovince.BEProvince.LIEGE));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.ARAUCA;
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.ARAUCA + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.ARAUCA));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        net.canadensys.utils.ArrayUtils arrayUtils0 = new net.canadensys.utils.ArrayUtils();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.lang.String str1 = net.canadensys.utils.StringUtils.unaccent("Nevada");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Nevada" + "'", str1, "Nevada");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        net.canadensys.vocabulary.stateprovince.CAProvince cAProvince1 = net.canadensys.vocabulary.stateprovince.CAProvince.fromCode("Antarctica");
        org.junit.Assert.assertNull(cAProvince1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral("Amazonas");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.CAUCA;
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.CAUCA + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.CAUCA));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.CONNECTICUT;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.CONNECTICUT + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.CONNECTICUT));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.TENNESSEE;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.TENNESSEE + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.TENNESSEE));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        net.canadensys.vocabulary.stateprovince.CAProvince cAProvince0 = net.canadensys.vocabulary.stateprovince.CAProvince.NEW_BRUNSWICK;
        java.lang.String str1 = cAProvince0.getName();
        org.junit.Assert.assertTrue("'" + cAProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.CAProvince.NEW_BRUNSWICK + "'", cAProvince0.equals(net.canadensys.vocabulary.stateprovince.CAProvince.NEW_BRUNSWICK));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "New Brunswick" + "'", str1, "New Brunswick");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.ILLINOIS;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.ILLINOIS + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.ILLINOIS));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.GEORGIA;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.GEORGIA + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.GEORGIA));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = net.canadensys.utils.ZipUtils.zipFolder(file0, "Nari\361o");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.RHODE_ISLAND;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.RHODE_ISLAND + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.RHODE_ISLAND));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.PENNSYLVANIA;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.PENNSYLVANIA + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.PENNSYLVANIA));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.LA_GUAJIRA;
        java.lang.String str1 = cODepartment0.getName();
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.LA_GUAJIRA + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.LA_GUAJIRA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "La Guajira" + "'", str1, "La Guajira");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        net.canadensys.utils.StringUtils stringUtils0 = new net.canadensys.utils.StringUtils();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.CESAR;
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.CESAR + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.CESAR));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.TEXAS;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.TEXAS + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.TEXAS));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.DELAWARE;
        java.lang.String str1 = uSState0.getName();
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.DELAWARE + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.DELAWARE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Delaware" + "'", str1, "Delaware");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince0 = net.canadensys.vocabulary.stateprovince.BEProvince.WALLOON_REGION;
        org.junit.Assert.assertTrue("'" + bEProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.BEProvince.WALLOON_REGION + "'", bEProvince0.equals(net.canadensys.vocabulary.stateprovince.BEProvince.WALLOON_REGION));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        net.canadensys.vocabulary.stateprovince.CAProvince cAProvince1 = net.canadensys.vocabulary.stateprovince.CAProvince.fromCode("Delaware");
        org.junit.Assert.assertNull(cAProvince1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.CALDAS;
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.CALDAS + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.CALDAS));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.SOUTH_CAROLINA;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.SOUTH_CAROLINA + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.SOUTH_CAROLINA));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.FLORIDA;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.FLORIDA + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.FLORIDA));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral("Colorado");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Colorado:C");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.KANSAS;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.KANSAS + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.KANSAS));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.VIRGINIA;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.VIRGINIA + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.VIRGINIA));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince1 = net.canadensys.vocabulary.stateprovince.BEProvince.fromCode("Antarctica");
        org.junit.Assert.assertNull(bEProvince1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        net.canadensys.vocabulary.Continent continent1 = net.canadensys.vocabulary.Continent.fromCode("Antarctica");
        org.junit.Assert.assertNull(continent1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.MAINE;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.MAINE + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.MAINE));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray1 = net.canadensys.utils.StringUtils.allUpperCase(strArray0);
        boolean boolean2 = net.canadensys.utils.ArrayUtils.containsOnlyNull((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.NEW_YORK;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.NEW_YORK + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.NEW_YORK));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment1 = net.canadensys.vocabulary.stateprovince.CODepartment.fromCode("US-IN");
        org.junit.Assert.assertNull(cODepartment1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.NARINO;
        java.lang.String str1 = cODepartment0.getName();
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.NARINO + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.NARINO));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Nari\361o" + "'", str1, "Nari\361o");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle2 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("Delaware", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral("New Brunswick");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray1 = net.canadensys.utils.StringUtils.allUpperCase(strArray0);
        boolean boolean2 = net.canadensys.utils.ArrayUtils.containsOnlyNull((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        net.canadensys.vocabulary.stateprovince.CAProvince cAProvince0 = net.canadensys.vocabulary.stateprovince.CAProvince.ONTARIO;
        java.lang.String str1 = cAProvince0.getName();
        org.junit.Assert.assertTrue("'" + cAProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.CAProvince.ONTARIO + "'", cAProvince0.equals(net.canadensys.vocabulary.stateprovince.CAProvince.ONTARIO));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ontario" + "'", str1, "Ontario");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral("Nari\361o");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral("CO-QUI");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: CO-QUI:C");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.WASHINGTON_DC;
        java.lang.String str1 = uSState0.getName();
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.WASHINGTON_DC + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.WASHINGTON_DC));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Washington D.C." + "'", str1, "Washington D.C.");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral((-13));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: -13");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        net.canadensys.vocabulary.stateprovince.CAProvince cAProvince0 = net.canadensys.vocabulary.stateprovince.CAProvince.YUKON;
        org.junit.Assert.assertTrue("'" + cAProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.CAProvince.YUKON + "'", cAProvince0.equals(net.canadensys.vocabulary.stateprovince.CAProvince.YUKON));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = net.canadensys.utils.ZipUtils.zipFolder(file0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.PropertyResourceBundle propertyResourceBundle2 = net.canadensys.bundle.UTF8PropertyResourceBundle.getBundle("", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        net.canadensys.vocabulary.Continent continent1 = net.canadensys.vocabulary.Continent.fromCode("");
        org.junit.Assert.assertNull(continent1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.QUINDIO;
        java.lang.Class<?> wildcardClass1 = cODepartment0.getClass();
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.QUINDIO + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.QUINDIO));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.VICHADA;
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.VICHADA + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.VICHADA));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        net.canadensys.vocabulary.Continent continent0 = net.canadensys.vocabulary.Continent.NORTH_AMERICA;
        java.lang.String str1 = continent0.getTitle();
        org.junit.Assert.assertTrue("'" + continent0 + "' != '" + net.canadensys.vocabulary.Continent.NORTH_AMERICA + "'", continent0.equals(net.canadensys.vocabulary.Continent.NORTH_AMERICA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "North America" + "'", str1, "North America");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.SANTANDER;
        java.lang.Class<?> wildcardClass1 = cODepartment0.getClass();
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.SANTANDER + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.SANTANDER));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.ARKANSAS;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.ARKANSAS + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.ARKANSAS));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.AMAZONAS;
        java.lang.Class<?> wildcardClass1 = cODepartment0.getClass();
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.AMAZONAS + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.AMAZONAS));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral("Brussels-Capital Region");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle4 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("", locale1, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.PR;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.PR + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.PR));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.CORDOBA;
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.CORDOBA + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.CORDOBA));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.NEW_MEXICO;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.NEW_MEXICO + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.NEW_MEXICO));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.AMAZONAS;
        java.lang.Class<?> wildcardClass1 = cODepartment0.getClass();
        net.canadensys.utils.ListUtils listUtils2 = new net.canadensys.utils.ListUtils();
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator4 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator5 = unaccentStringComparator4.reversed();
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator6 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator7 = unaccentStringComparator6.reversed();
        java.util.Comparator<java.lang.String> strComparator8 = unaccentStringComparator4.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator6);
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator9 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator10 = unaccentStringComparator9.reversed();
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator11 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator12 = unaccentStringComparator11.reversed();
        java.util.Comparator<java.lang.String> strComparator13 = unaccentStringComparator9.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator11);
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator14 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator15 = unaccentStringComparator14.reversed();
        java.util.Comparator<java.lang.String> strComparator16 = unaccentStringComparator11.thenComparing(strComparator15);
        java.util.Comparator<java.lang.String> strComparator17 = strComparator8.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator11);
        net.canadensys.vocabulary.stateprovince.USState uSState18 = net.canadensys.vocabulary.stateprovince.USState.NEW_JERSEY;
        net.canadensys.vocabulary.stateprovince.CAProvince cAProvince19 = net.canadensys.vocabulary.stateprovince.CAProvince.NEW_BRUNSWICK;
        java.lang.String str20 = cAProvince19.getName();
        java.lang.Object[] objArray21 = new java.lang.Object[] { wildcardClass1, listUtils2, 'a', unaccentStringComparator11, uSState18, str20 };
        boolean boolean22 = net.canadensys.utils.ArrayUtils.containsOnlyNull(objArray21);
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.AMAZONAS + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.AMAZONAS));
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strComparator5);
        org.junit.Assert.assertNotNull(strComparator7);
        org.junit.Assert.assertNotNull(strComparator8);
        org.junit.Assert.assertNotNull(strComparator10);
        org.junit.Assert.assertNotNull(strComparator12);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertNotNull(strComparator15);
        org.junit.Assert.assertNotNull(strComparator16);
        org.junit.Assert.assertNotNull(strComparator17);
        org.junit.Assert.assertTrue("'" + uSState18 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.NEW_JERSEY + "'", uSState18.equals(net.canadensys.vocabulary.stateprovince.USState.NEW_JERSEY));
        org.junit.Assert.assertTrue("'" + cAProvince19 + "' != '" + net.canadensys.vocabulary.stateprovince.CAProvince.NEW_BRUNSWICK + "'", cAProvince19.equals(net.canadensys.vocabulary.stateprovince.CAProvince.NEW_BRUNSWICK));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "New Brunswick" + "'", str20, "New Brunswick");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.MINNESOTA;
        java.lang.String str1 = uSState0.getName();
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.MINNESOTA + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.MINNESOTA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Minnesota" + "'", str1, "Minnesota");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.ALASKA;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.ALASKA + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.ALASKA));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        net.canadensys.vocabulary.Continent continent0 = net.canadensys.vocabulary.Continent.AFRICA;
        java.lang.String str1 = continent0.getTitle();
        java.lang.String str2 = continent0.getTitle();
        org.junit.Assert.assertTrue("'" + continent0 + "' != '" + net.canadensys.vocabulary.Continent.AFRICA + "'", continent0.equals(net.canadensys.vocabulary.Continent.AFRICA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Africa" + "'", str1, "Africa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Africa" + "'", str2, "Africa");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = net.canadensys.utils.ZipUtils.unzipFileOrFolder(file0, "US-VT");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.lang.String[] strArray10 = new java.lang.String[] { "CO-GUA", "Colorado", "Antarctica", "Nevada", "", "Amazonas", "", "Northwest Territories", "", "CO-GUA" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.List<java.lang.Integer> intList14 = net.canadensys.utils.ListUtils.toIntegerList((java.util.List<java.lang.String>) strList11, false);
        boolean boolean15 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList11);
        java.util.List<java.lang.Integer> intList17 = net.canadensys.utils.ListUtils.toIntegerList((java.util.List<java.lang.String>) strList11, false);
        java.lang.Class<?> wildcardClass18 = strList11.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        int int0 = net.canadensys.lang.RomanNumeral.MIN_VALUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle3 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("CA-BC", locale1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.VALLE_DEL_CAUCA;
        java.lang.String str1 = cODepartment0.getCode();
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.VALLE_DEL_CAUCA + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.VALLE_DEL_CAUCA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CO-VAC" + "'", str1, "CO-VAC");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String[] strArray4 = net.canadensys.utils.StringUtils.allLowerCase(strArray3);
        java.lang.String[] strArray5 = net.canadensys.utils.StringUtils.allLowerCase(strArray4);
        java.lang.String[] strArray6 = net.canadensys.utils.StringUtils.allUpperCase(strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral("CO-GUA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: CO-GUA:C");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.OREGON;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.OREGON + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.OREGON));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.LOUISIANA;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.LOUISIANA + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.LOUISIANA));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = net.canadensys.utils.ZipUtils.unzipFileOrFolder(file0, "New Brunswick");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.WASHINGTON;
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.WASHINGTON + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.WASHINGTON));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.PropertyResourceBundle propertyResourceBundle2 = net.canadensys.bundle.UTF8PropertyResourceBundle.getBundle("CO-VAC", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle3 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("CA-ON", locale1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator0 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator1 = unaccentStringComparator0.reversed();
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator2 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator3 = unaccentStringComparator2.reversed();
        java.util.Comparator<java.lang.String> strComparator4 = unaccentStringComparator0.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator2);
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator5 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator6 = unaccentStringComparator5.reversed();
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator7 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator8 = unaccentStringComparator7.reversed();
        java.util.Comparator<java.lang.String> strComparator9 = unaccentStringComparator5.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator7);
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator10 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator11 = unaccentStringComparator10.reversed();
        java.util.Comparator<java.lang.String> strComparator12 = unaccentStringComparator7.thenComparing(strComparator11);
        java.util.Comparator<java.lang.String> strComparator13 = strComparator4.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator7);
        int int16 = unaccentStringComparator7.compare("Colorado", "Brussels-Capital Region");
        org.junit.Assert.assertNotNull(strComparator1);
        org.junit.Assert.assertNotNull(strComparator3);
        org.junit.Assert.assertNotNull(strComparator4);
        org.junit.Assert.assertNotNull(strComparator6);
        org.junit.Assert.assertNotNull(strComparator8);
        org.junit.Assert.assertNotNull(strComparator9);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertNotNull(strComparator12);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle4 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("US-IN", locale1, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince0 = net.canadensys.vocabulary.stateprovince.BEProvince.LUXEMBOURG;
        java.lang.String str1 = bEProvince0.getName();
        org.junit.Assert.assertTrue("'" + bEProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.BEProvince.LUXEMBOURG + "'", bEProvince0.equals(net.canadensys.vocabulary.stateprovince.BEProvince.LUXEMBOURG));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Luxembourg" + "'", str1, "Luxembourg");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.PropertyResourceBundle propertyResourceBundle2 = net.canadensys.bundle.UTF8PropertyResourceBundle.getBundle("New Brunswick", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = net.canadensys.utils.ZipUtils.zipFolder(file0, "BE-WNA");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince0 = net.canadensys.vocabulary.stateprovince.BEProvince.FLEMISH_REGION;
        org.junit.Assert.assertTrue("'" + bEProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.BEProvince.FLEMISH_REGION + "'", bEProvince0.equals(net.canadensys.vocabulary.stateprovince.BEProvince.FLEMISH_REGION));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.PropertyResourceBundle propertyResourceBundle2 = net.canadensys.bundle.UTF8PropertyResourceBundle.getBundle("Asia", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "Nari\361o", "Brussels-Capital Region" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.Integer> intList8 = net.canadensys.utils.ListUtils.toIntegerList((java.util.List<java.lang.String>) strList5, true);
        java.util.List<java.lang.Integer> intList10 = net.canadensys.utils.ListUtils.toIntegerList((java.util.List<java.lang.String>) strList5, false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle4 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("CO-QUI", locale1, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince0 = net.canadensys.vocabulary.stateprovince.BEProvince.LIMBURG;
        java.lang.String str1 = bEProvince0.getName();
        java.lang.String str2 = bEProvince0.getName();
        org.junit.Assert.assertTrue("'" + bEProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.BEProvince.LIMBURG + "'", bEProvince0.equals(net.canadensys.vocabulary.stateprovince.BEProvince.LIMBURG));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Limburg" + "'", str1, "Limburg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Limburg" + "'", str2, "Limburg");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        net.canadensys.vocabulary.stateprovince.CAProvince cAProvince0 = net.canadensys.vocabulary.stateprovince.CAProvince.PRINCE_EDWARD_ISLAND;
        org.junit.Assert.assertTrue("'" + cAProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.CAProvince.PRINCE_EDWARD_ISLAND + "'", cAProvince0.equals(net.canadensys.vocabulary.stateprovince.CAProvince.PRINCE_EDWARD_ISLAND));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        net.canadensys.vocabulary.Continent continent1 = net.canadensys.vocabulary.Continent.fromCode("Minnesota");
        org.junit.Assert.assertNull(continent1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.PropertyResourceBundle propertyResourceBundle2 = net.canadensys.bundle.UTF8PropertyResourceBundle.getBundle("US-MA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle4 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("CO-QUI", locale1, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.PropertyResourceBundle propertyResourceBundle2 = net.canadensys.bundle.UTF8PropertyResourceBundle.getBundle("Washington D.C.", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = net.canadensys.utils.ZipUtils.zipFolder(file0, "Colorado");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince0 = net.canadensys.vocabulary.stateprovince.BEProvince.BRUSSELS_CAPITAL_REGION;
        java.lang.String str1 = bEProvince0.getCode();
        org.junit.Assert.assertTrue("'" + bEProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.BEProvince.BRUSSELS_CAPITAL_REGION + "'", bEProvince0.equals(net.canadensys.vocabulary.stateprovince.BEProvince.BRUSSELS_CAPITAL_REGION));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "BE-BRU" + "'", str1, "BE-BRU");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.WYOMING;
        java.lang.String str1 = uSState0.getCode();
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.WYOMING + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.WYOMING));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "US-WY" + "'", str1, "US-WY");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.SAN_ANDRES_PROVIDENCIA_SANTA_CATALINA;
        java.lang.String str1 = cODepartment0.getCode();
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.SAN_ANDRES_PROVIDENCIA_SANTA_CATALINA + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.SAN_ANDRES_PROVIDENCIA_SANTA_CATALINA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CO-SAP" + "'", str1, "CO-SAP");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator0 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator1 = unaccentStringComparator0.reversed();
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator2 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator3 = unaccentStringComparator2.reversed();
        java.util.Comparator<java.lang.String> strComparator4 = unaccentStringComparator0.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator2);
        java.lang.Class<?> wildcardClass5 = unaccentStringComparator0.getClass();
        org.junit.Assert.assertNotNull(strComparator1);
        org.junit.Assert.assertNotNull(strComparator3);
        org.junit.Assert.assertNotNull(strComparator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment1 = net.canadensys.vocabulary.stateprovince.CODepartment.fromCode("CA-ON");
        org.junit.Assert.assertNull(cODepartment1);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = net.canadensys.utils.StringUtils.allUpperCase(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        net.canadensys.vocabulary.Continent continent0 = net.canadensys.vocabulary.Continent.ASIA;
        java.lang.String str1 = continent0.getTitle();
        java.lang.String str2 = continent0.getCode();
        org.junit.Assert.assertTrue("'" + continent0 + "' != '" + net.canadensys.vocabulary.Continent.ASIA + "'", continent0.equals(net.canadensys.vocabulary.Continent.ASIA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Asia" + "'", str1, "Asia");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AS" + "'", str2, "AS");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator0 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator1 = unaccentStringComparator0.reversed();
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator2 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator3 = unaccentStringComparator2.reversed();
        java.util.Comparator<java.lang.String> strComparator4 = unaccentStringComparator0.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator2);
        int int7 = unaccentStringComparator0.compare("Washington D.C.", "Delaware");
        org.junit.Assert.assertNotNull(strComparator1);
        org.junit.Assert.assertNotNull(strComparator3);
        org.junit.Assert.assertNotNull(strComparator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        net.canadensys.vocabulary.Continent continent0 = net.canadensys.vocabulary.Continent.EUROPE;
        java.lang.String str1 = continent0.getCode();
        java.lang.Class<?> wildcardClass2 = continent0.getClass();
        org.junit.Assert.assertTrue("'" + continent0 + "' != '" + net.canadensys.vocabulary.Continent.EUROPE + "'", continent0.equals(net.canadensys.vocabulary.Continent.EUROPE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EU" + "'", str1, "EU");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator0 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator1 = unaccentStringComparator0.reversed();
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator2 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator3 = unaccentStringComparator2.reversed();
        java.util.Comparator<java.lang.String> strComparator4 = unaccentStringComparator0.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator2);
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator5 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator6 = unaccentStringComparator5.reversed();
        java.util.Comparator<java.lang.String> strComparator7 = unaccentStringComparator2.thenComparing(strComparator6);
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator8 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator9 = unaccentStringComparator8.reversed();
        int int12 = unaccentStringComparator8.compare("Ontario", "BE-BRU");
        java.util.Comparator<java.lang.String> strComparator13 = strComparator6.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator8);
        java.util.Comparator<java.lang.String> strComparator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Comparator<java.lang.String> strComparator15 = strComparator6.thenComparing(strComparator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparator1);
        org.junit.Assert.assertNotNull(strComparator3);
        org.junit.Assert.assertNotNull(strComparator4);
        org.junit.Assert.assertNotNull(strComparator6);
        org.junit.Assert.assertNotNull(strComparator7);
        org.junit.Assert.assertNotNull(strComparator9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13 + "'", int12 == 13);
        org.junit.Assert.assertNotNull(strComparator13);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = net.canadensys.utils.ZipUtils.unzipFileOrFolder(file0, "Nari\361o");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle4 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("North America", locale1, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral("US-IN");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        net.canadensys.vocabulary.stateprovince.CAProvince cAProvince1 = net.canadensys.vocabulary.stateprovince.CAProvince.fromCode("New Brunswick");
        org.junit.Assert.assertNull(cAProvince1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle4 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("Washington D.C.", locale1, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle3 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("US-WY", locale1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        net.canadensys.vocabulary.Continent continent0 = net.canadensys.vocabulary.Continent.EUROPE;
        java.lang.String str1 = continent0.getTitle();
        org.junit.Assert.assertTrue("'" + continent0 + "' != '" + net.canadensys.vocabulary.Continent.EUROPE + "'", continent0.equals(net.canadensys.vocabulary.Continent.EUROPE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Europe" + "'", str1, "Europe");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray1 = net.canadensys.utils.StringUtils.allUpperCase(strArray0);
        java.lang.String[] strArray2 = net.canadensys.utils.StringUtils.allUpperCase(strArray1);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle4 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("Africa", locale1, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        java.lang.String str0 = net.canadensys.utils.ZipUtils.ZIP_EXT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + ".zip" + "'", str0, ".zip");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        java.lang.String str1 = net.canadensys.utils.StringUtils.unaccent("CA-BC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CA-BC" + "'", str1, "CA-BC");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle4 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("Nari\361o", locale1, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        java.lang.String str1 = net.canadensys.utils.StringUtils.unaccent("US-VT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "US-VT" + "'", str1, "US-VT");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        java.lang.String str1 = net.canadensys.utils.StringUtils.unaccent("Nari\361o");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Narino" + "'", str1, "Narino");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = net.canadensys.utils.ZipUtils.unzipFileOrFolder(file0, "CO-SAP");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.AMAZONAS;
        java.lang.String str1 = cODepartment0.getName();
        java.lang.String str2 = cODepartment0.getName();
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.AMAZONAS + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.AMAZONAS));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Amazonas" + "'", str1, "Amazonas");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Amazonas" + "'", str2, "Amazonas");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle2 = net.canadensys.bundle.InMemoryResourceBundle.getBundle(".zip", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String[] strArray4 = net.canadensys.utils.StringUtils.allLowerCase(strArray3);
        boolean boolean5 = net.canadensys.utils.ArrayUtils.containsOnlyNull((java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = net.canadensys.utils.StringUtils.allUpperCase(strArray4);
        boolean boolean7 = net.canadensys.utils.ArrayUtils.containsOnlyNull((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.NARINO;
        java.lang.String str1 = cODepartment0.getName();
        java.lang.String str2 = cODepartment0.getName();
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.NARINO + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.NARINO));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Nari\361o" + "'", str1, "Nari\361o");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Nari\361o" + "'", str2, "Nari\361o");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        net.canadensys.vocabulary.stateprovince.USState uSState1 = net.canadensys.vocabulary.stateprovince.USState.fromCode("Antarctica");
        org.junit.Assert.assertNull(uSState1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        net.canadensys.vocabulary.stateprovince.CAProvince cAProvince1 = net.canadensys.vocabulary.stateprovince.CAProvince.fromCode("CO-QUI");
        org.junit.Assert.assertNull(cAProvince1);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        net.canadensys.vocabulary.stateprovince.CAProvince cAProvince0 = net.canadensys.vocabulary.stateprovince.CAProvince.NOVA_SCOTIA;
        java.lang.String str1 = cAProvince0.getCode();
        org.junit.Assert.assertTrue("'" + cAProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.CAProvince.NOVA_SCOTIA + "'", cAProvince0.equals(net.canadensys.vocabulary.stateprovince.CAProvince.NOVA_SCOTIA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CA-NS" + "'", str1, "CA-NS");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.MASSACHUSETTS;
        java.lang.String str1 = uSState0.getCode();
        java.lang.String str2 = uSState0.getName();
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.MASSACHUSETTS + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.MASSACHUSETTS));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "US-MA" + "'", str1, "US-MA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Massachusetts" + "'", str2, "Massachusetts");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.IOWA;
        java.lang.String str1 = uSState0.getName();
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.IOWA + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.IOWA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Iowa" + "'", str1, "Iowa");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        net.canadensys.vocabulary.stateprovince.CAProvince cAProvince0 = net.canadensys.vocabulary.stateprovince.CAProvince.ONTARIO;
        java.lang.String str1 = cAProvince0.getCode();
        java.lang.String str2 = cAProvince0.getCode();
        org.junit.Assert.assertTrue("'" + cAProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.CAProvince.ONTARIO + "'", cAProvince0.equals(net.canadensys.vocabulary.stateprovince.CAProvince.ONTARIO));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CA-ON" + "'", str1, "CA-ON");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CA-ON" + "'", str2, "CA-ON");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral("CO-VAC");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: CO-VAC:C");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = net.canadensys.utils.ZipUtils.unzipFileOrFolder(file0, ".zip");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = net.canadensys.utils.ZipUtils.unzipFileOrFolder(file0, "Africa");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        net.canadensys.vocabulary.Continent continent1 = net.canadensys.vocabulary.Continent.fromCode("US-VT");
        org.junit.Assert.assertNull(continent1);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator0 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator1 = unaccentStringComparator0.reversed();
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator2 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator3 = unaccentStringComparator2.reversed();
        java.util.Comparator<java.lang.String> strComparator4 = unaccentStringComparator0.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator2);
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator5 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator6 = unaccentStringComparator5.reversed();
        java.util.Comparator<java.lang.String> strComparator7 = unaccentStringComparator2.thenComparing(strComparator6);
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator8 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator9 = unaccentStringComparator8.reversed();
        int int12 = unaccentStringComparator8.compare("Ontario", "BE-BRU");
        java.util.Comparator<java.lang.String> strComparator13 = strComparator6.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator8);
        int int16 = unaccentStringComparator8.compare("Colorado", "CO-VAC");
        int int19 = unaccentStringComparator8.compare("CA-BC", "BE-BRU");
        org.junit.Assert.assertNotNull(strComparator1);
        org.junit.Assert.assertNotNull(strComparator3);
        org.junit.Assert.assertNotNull(strComparator4);
        org.junit.Assert.assertNotNull(strComparator6);
        org.junit.Assert.assertNotNull(strComparator7);
        org.junit.Assert.assertNotNull(strComparator9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13 + "'", int12 == 13);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        net.canadensys.vocabulary.stateprovince.USState uSState1 = net.canadensys.vocabulary.stateprovince.USState.fromCode("Asia");
        org.junit.Assert.assertNull(uSState1);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        net.canadensys.vocabulary.stateprovince.CAProvince cAProvince0 = net.canadensys.vocabulary.stateprovince.CAProvince.ONTARIO;
        java.lang.String str1 = cAProvince0.getName();
        java.lang.String str2 = cAProvince0.getName();
        org.junit.Assert.assertTrue("'" + cAProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.CAProvince.ONTARIO + "'", cAProvince0.equals(net.canadensys.vocabulary.stateprovince.CAProvince.ONTARIO));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ontario" + "'", str1, "Ontario");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ontario" + "'", str2, "Ontario");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        net.canadensys.vocabulary.Continent continent0 = net.canadensys.vocabulary.Continent.ASIA;
        java.lang.String str1 = continent0.getTitle();
        java.lang.String str2 = continent0.getTitle();
        org.junit.Assert.assertTrue("'" + continent0 + "' != '" + net.canadensys.vocabulary.Continent.ASIA + "'", continent0.equals(net.canadensys.vocabulary.Continent.ASIA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Asia" + "'", str1, "Asia");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia" + "'", str2, "Asia");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.CASANARE;
        java.lang.String str1 = cODepartment0.getName();
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.CASANARE + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.CASANARE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Casanare" + "'", str1, "Casanare");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle3 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("New Brunswick", locale1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle4 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("", locale1, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle3 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("CO-SAP", locale1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        net.canadensys.vocabulary.stateprovince.CAProvince cAProvince0 = net.canadensys.vocabulary.stateprovince.CAProvince.ONTARIO;
        java.lang.String str1 = cAProvince0.getCode();
        java.lang.String str2 = cAProvince0.getName();
        org.junit.Assert.assertTrue("'" + cAProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.CAProvince.ONTARIO + "'", cAProvince0.equals(net.canadensys.vocabulary.stateprovince.CAProvince.ONTARIO));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CA-ON" + "'", str1, "CA-ON");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ontario" + "'", str2, "Ontario");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator0 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator1 = unaccentStringComparator0.reversed();
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator2 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator3 = unaccentStringComparator2.reversed();
        java.util.Comparator<java.lang.String> strComparator4 = unaccentStringComparator0.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator2);
        int int7 = unaccentStringComparator2.compare("Brussels-Capital Region", "Massachusetts");
        org.junit.Assert.assertNotNull(strComparator1);
        org.junit.Assert.assertNotNull(strComparator3);
        org.junit.Assert.assertNotNull(strComparator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-11) + "'", int7 == (-11));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince1 = net.canadensys.vocabulary.stateprovince.BEProvince.fromCode("CA-ON");
        org.junit.Assert.assertNull(bEProvince1);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle3 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("West Flanders", locale1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.lang.String[] strArray12 = new java.lang.String[] { "CO-GUA", "", "Nevada", "CO-GUA", "XCVII", "US-IN", "North America", "AS", "Massachusetts", "CA-NS", "Delaware", "Ontario" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        boolean boolean15 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList13);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator0 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator1 = unaccentStringComparator0.reversed();
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator2 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator3 = unaccentStringComparator2.reversed();
        java.util.Comparator<java.lang.String> strComparator4 = unaccentStringComparator0.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator2);
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator5 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator6 = unaccentStringComparator5.reversed();
        java.util.Comparator<java.lang.String> strComparator7 = unaccentStringComparator2.thenComparing(strComparator6);
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator8 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator9 = unaccentStringComparator8.reversed();
        int int12 = unaccentStringComparator8.compare("Ontario", "BE-BRU");
        java.util.Comparator<java.lang.String> strComparator13 = strComparator6.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator8);
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator14 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator15 = unaccentStringComparator14.reversed();
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator16 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator17 = unaccentStringComparator16.reversed();
        java.util.Comparator<java.lang.String> strComparator18 = unaccentStringComparator14.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator16);
        java.util.Comparator<java.lang.String> strComparator19 = unaccentStringComparator16.reversed();
        java.util.Comparator<java.lang.String> strComparator20 = strComparator19.reversed();
        java.util.Comparator<java.lang.String> strComparator21 = unaccentStringComparator8.thenComparing(strComparator19);
        org.junit.Assert.assertNotNull(strComparator1);
        org.junit.Assert.assertNotNull(strComparator3);
        org.junit.Assert.assertNotNull(strComparator4);
        org.junit.Assert.assertNotNull(strComparator6);
        org.junit.Assert.assertNotNull(strComparator7);
        org.junit.Assert.assertNotNull(strComparator9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13 + "'", int12 == 13);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertNotNull(strComparator15);
        org.junit.Assert.assertNotNull(strComparator17);
        org.junit.Assert.assertNotNull(strComparator18);
        org.junit.Assert.assertNotNull(strComparator19);
        org.junit.Assert.assertNotNull(strComparator20);
        org.junit.Assert.assertNotNull(strComparator21);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince1 = net.canadensys.vocabulary.stateprovince.BEProvince.fromCode("BE-BRU");
        org.junit.Assert.assertTrue("'" + bEProvince1 + "' != '" + net.canadensys.vocabulary.stateprovince.BEProvince.BRUSSELS_CAPITAL_REGION + "'", bEProvince1.equals(net.canadensys.vocabulary.stateprovince.BEProvince.BRUSSELS_CAPITAL_REGION));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        net.canadensys.vocabulary.stateprovince.CAProvince cAProvince1 = net.canadensys.vocabulary.stateprovince.CAProvince.fromCode("CA-BC");
        java.lang.String str2 = cAProvince1.getCode();
        org.junit.Assert.assertTrue("'" + cAProvince1 + "' != '" + net.canadensys.vocabulary.stateprovince.CAProvince.BRITISH_COLUMBIA + "'", cAProvince1.equals(net.canadensys.vocabulary.stateprovince.CAProvince.BRITISH_COLUMBIA));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CA-BC" + "'", str2, "CA-BC");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.INDIANA;
        java.lang.String str1 = uSState0.getCode();
        java.lang.Class<?> wildcardClass2 = uSState0.getClass();
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.INDIANA + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.INDIANA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "US-IN" + "'", str1, "US-IN");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle4 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("West Flanders", locale1, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: -1");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String[] strArray4 = net.canadensys.utils.StringUtils.allLowerCase(strArray3);
        java.lang.String[] strArray5 = net.canadensys.utils.StringUtils.allUpperCase(strArray4);
        java.lang.String[] strArray6 = net.canadensys.utils.StringUtils.allLowerCase(strArray5);
        java.lang.String[] strArray7 = net.canadensys.utils.StringUtils.allLowerCase(strArray5);
        java.lang.String[] strArray8 = net.canadensys.utils.StringUtils.allLowerCase(strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral((int) (short) 1);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String[] strArray4 = net.canadensys.utils.StringUtils.allLowerCase(strArray3);
        boolean boolean5 = net.canadensys.utils.ArrayUtils.containsOnlyNull((java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = net.canadensys.utils.StringUtils.allUpperCase(strArray4);
        boolean boolean7 = net.canadensys.utils.ArrayUtils.containsOnlyNull((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = net.canadensys.utils.ZipUtils.zipFolder(file0, "AN");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String[] strArray4 = net.canadensys.utils.StringUtils.allLowerCase(strArray3);
        java.lang.String[] strArray5 = net.canadensys.utils.StringUtils.allUpperCase(strArray4);
        java.lang.String[] strArray6 = net.canadensys.utils.StringUtils.allLowerCase(strArray5);
        boolean boolean7 = net.canadensys.utils.ArrayUtils.containsOnlyNotNull((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle4 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("Ontario", locale1, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle3 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("Limburg", locale1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral("CA-NS");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: CA-NS:C");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        java.lang.String[] strArray10 = new java.lang.String[] { "CO-GUA", "Colorado", "Antarctica", "Nevada", "", "Amazonas", "", "Northwest Territories", "", "CO-GUA" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.List<java.lang.Integer> intList14 = net.canadensys.utils.ListUtils.toIntegerList((java.util.List<java.lang.String>) strList11, false);
        boolean boolean15 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList11);
        java.util.List<java.lang.Integer> intList17 = net.canadensys.utils.ListUtils.toIntegerList((java.util.List<java.lang.String>) strList11, false);
        boolean boolean18 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList11);
        boolean boolean19 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList11);
        boolean boolean20 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList11);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle4 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("EU", locale1, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.MICHIGAN;
        java.lang.String str1 = uSState0.getName();
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.MICHIGAN + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.MICHIGAN));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Michigan" + "'", str1, "Michigan");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        net.canadensys.vocabulary.Continent continent0 = net.canadensys.vocabulary.Continent.ANTARCTICA;
        java.lang.String str1 = continent0.getTitle();
        java.lang.String str2 = continent0.getTitle();
        org.junit.Assert.assertTrue("'" + continent0 + "' != '" + net.canadensys.vocabulary.Continent.ANTARCTICA + "'", continent0.equals(net.canadensys.vocabulary.Continent.ANTARCTICA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Antarctica" + "'", str1, "Antarctica");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Antarctica" + "'", str2, "Antarctica");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.PropertyResourceBundle propertyResourceBundle2 = net.canadensys.bundle.UTF8PropertyResourceBundle.getBundle("US-WY", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.MASSACHUSETTS;
        java.lang.String str1 = uSState0.getCode();
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.MASSACHUSETTS + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.MASSACHUSETTS));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "US-MA" + "'", str1, "US-MA");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral(3999);
        java.lang.String[] strArray12 = new java.lang.String[] { "CO-GUA", "Colorado", "Antarctica", "Nevada", "", "Amazonas", "", "Northwest Territories", "", "CO-GUA" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.List<java.lang.Integer> intList16 = net.canadensys.utils.ListUtils.toIntegerList((java.util.List<java.lang.String>) strList13, false);
        boolean boolean17 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList13);
        java.util.List<java.lang.Integer> intList19 = net.canadensys.utils.ListUtils.toIntegerList((java.util.List<java.lang.String>) strList13, false);
        boolean boolean20 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList13);
        boolean boolean21 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList13);
        boolean boolean22 = romanNumeral1.equals((java.lang.Object) strList13);
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment23 = net.canadensys.vocabulary.stateprovince.CODepartment.SANTANDER;
        boolean boolean24 = romanNumeral1.equals((java.lang.Object) cODepartment23);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + cODepartment23 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.SANTANDER + "'", cODepartment23.equals(net.canadensys.vocabulary.stateprovince.CODepartment.SANTANDER));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        java.lang.String str1 = net.canadensys.utils.StringUtils.unaccent("CA-ON");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CA-ON" + "'", str1, "CA-ON");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle4 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("XCVII", locale1, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        net.canadensys.vocabulary.Continent continent0 = net.canadensys.vocabulary.Continent.AFRICA;
        java.lang.String str1 = continent0.getCode();
        org.junit.Assert.assertTrue("'" + continent0 + "' != '" + net.canadensys.vocabulary.Continent.AFRICA + "'", continent0.equals(net.canadensys.vocabulary.Continent.AFRICA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AF" + "'", str1, "AF");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral(3999);
        java.lang.String str2 = romanNumeral1.toRomanNumeral();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MMMCMXCIX" + "'", str2, "MMMCMXCIX");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        net.canadensys.vocabulary.stateprovince.CAProvince cAProvince0 = net.canadensys.vocabulary.stateprovince.CAProvince.BRITISH_COLUMBIA;
        java.lang.String str1 = cAProvince0.getCode();
        java.lang.String str2 = cAProvince0.getCode();
        org.junit.Assert.assertTrue("'" + cAProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.CAProvince.BRITISH_COLUMBIA + "'", cAProvince0.equals(net.canadensys.vocabulary.stateprovince.CAProvince.BRITISH_COLUMBIA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CA-BC" + "'", str1, "CA-BC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CA-BC" + "'", str2, "CA-BC");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.RISARALDA;
        java.lang.String str1 = cODepartment0.getName();
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.RISARALDA + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.RISARALDA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Risaralda" + "'", str1, "Risaralda");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator0 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator1 = unaccentStringComparator0.reversed();
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator2 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator3 = unaccentStringComparator2.reversed();
        java.util.Comparator<java.lang.String> strComparator4 = unaccentStringComparator0.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator2);
        int int7 = unaccentStringComparator2.compare("Massachusetts", "CO-QUI");
        org.junit.Assert.assertNotNull(strComparator1);
        org.junit.Assert.assertNotNull(strComparator3);
        org.junit.Assert.assertNotNull(strComparator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince0 = net.canadensys.vocabulary.stateprovince.BEProvince.ANTWERP;
        java.lang.String str1 = bEProvince0.getCode();
        org.junit.Assert.assertTrue("'" + bEProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.BEProvince.ANTWERP + "'", bEProvince0.equals(net.canadensys.vocabulary.stateprovince.BEProvince.ANTWERP));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "BE-VAN" + "'", str1, "BE-VAN");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.NEBRASKA;
        java.lang.String str1 = uSState0.getCode();
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.NEBRASKA + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.NEBRASKA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "US-NE" + "'", str1, "US-NE");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince1 = net.canadensys.vocabulary.stateprovince.BEProvince.fromCode("Africa");
        org.junit.Assert.assertNull(bEProvince1);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String[] strArray4 = net.canadensys.utils.StringUtils.allLowerCase(strArray3);
        java.lang.String[] strArray5 = net.canadensys.utils.StringUtils.allUpperCase(strArray4);
        java.lang.String[] strArray6 = net.canadensys.utils.StringUtils.allLowerCase(strArray5);
        boolean boolean7 = net.canadensys.utils.ArrayUtils.containsOnlyNotNull((java.lang.Object[]) strArray5);
        java.lang.String[] strArray8 = net.canadensys.utils.StringUtils.allUpperCase(strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle2 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("Narino", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince1 = net.canadensys.vocabulary.stateprovince.BEProvince.fromCode("Asia");
        org.junit.Assert.assertNull(bEProvince1);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        net.canadensys.vocabulary.Continent continent0 = net.canadensys.vocabulary.Continent.ANTARCTICA;
        java.lang.String str1 = continent0.getCode();
        org.junit.Assert.assertTrue("'" + continent0 + "' != '" + net.canadensys.vocabulary.Continent.ANTARCTICA + "'", continent0.equals(net.canadensys.vocabulary.Continent.ANTARCTICA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AN" + "'", str1, "AN");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        net.canadensys.vocabulary.Continent continent1 = net.canadensys.vocabulary.Continent.fromCode("BE-VAN");
        org.junit.Assert.assertNull(continent1);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.VERMONT;
        java.lang.String str1 = uSState0.getCode();
        java.lang.String str2 = uSState0.getCode();
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.VERMONT + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.VERMONT));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "US-VT" + "'", str1, "US-VT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "US-VT" + "'", str2, "US-VT");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral(3999);
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince2 = net.canadensys.vocabulary.stateprovince.BEProvince.FLEMISH_BRABANT;
        boolean boolean3 = romanNumeral1.equals((java.lang.Object) bEProvince2);
        boolean boolean5 = romanNumeral1.equals((java.lang.Object) 100.0f);
        int int6 = romanNumeral1.toInt();
        org.junit.Assert.assertTrue("'" + bEProvince2 + "' != '" + net.canadensys.vocabulary.stateprovince.BEProvince.FLEMISH_BRABANT + "'", bEProvince2.equals(net.canadensys.vocabulary.stateprovince.BEProvince.FLEMISH_BRABANT));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3999 + "'", int6 == 3999);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.MARYLAND;
        java.lang.String str1 = uSState0.getName();
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.MARYLAND + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.MARYLAND));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Maryland" + "'", str1, "Maryland");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince1 = net.canadensys.vocabulary.stateprovince.BEProvince.fromCode("Colorado");
        org.junit.Assert.assertNull(bEProvince1);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "Nari\361o", "Brussels-Capital Region" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.Integer> intList8 = net.canadensys.utils.ListUtils.toIntegerList((java.util.List<java.lang.String>) strList5, true);
        boolean boolean9 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(intList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral((int) 'a');
        java.lang.String str2 = romanNumeral1.toRomanNumeral();
        int int3 = romanNumeral1.toInt();
        int int4 = romanNumeral1.toInt();
        net.canadensys.lang.RomanNumeral romanNumeral6 = new net.canadensys.lang.RomanNumeral(3999);
        int int7 = romanNumeral1.compareTo(romanNumeral6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XCVII" + "'", str2, "XCVII");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.NEBRASKA;
        java.lang.String str1 = uSState0.getCode();
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.NEBRASKA + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.NEBRASKA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "US-NE" + "'", str1, "US-NE");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String[] strArray4 = net.canadensys.utils.StringUtils.allLowerCase(strArray3);
        java.lang.String[] strArray5 = net.canadensys.utils.StringUtils.allLowerCase(strArray4);
        boolean boolean6 = net.canadensys.utils.ArrayUtils.containsOnlyNull((java.lang.Object[]) strArray4);
        boolean boolean7 = net.canadensys.utils.ArrayUtils.containsOnlyNotNull((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        java.lang.String[] strArray10 = new java.lang.String[] { "CO-GUA", "Colorado", "Antarctica", "Nevada", "", "Amazonas", "", "Northwest Territories", "", "CO-GUA" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.List<java.lang.Integer> intList14 = net.canadensys.utils.ListUtils.toIntegerList((java.util.List<java.lang.String>) strList11, false);
        java.lang.Class<?> wildcardClass15 = strList11.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.MISSOURI;
        java.lang.String str1 = uSState0.getName();
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.MISSOURI + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.MISSOURI));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Missouri" + "'", str1, "Missouri");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.PropertyResourceBundle propertyResourceBundle2 = net.canadensys.bundle.UTF8PropertyResourceBundle.getBundle("Michigan", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.QUINDIO;
        java.lang.String str1 = cODepartment0.getCode();
        java.lang.String str2 = cODepartment0.getCode();
        java.lang.String str3 = cODepartment0.getName();
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.QUINDIO + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.QUINDIO));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CO-QUI" + "'", str1, "CO-QUI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CO-QUI" + "'", str2, "CO-QUI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Quind\355o" + "'", str3, "Quind\355o");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String[] strArray4 = net.canadensys.utils.StringUtils.allLowerCase(strArray3);
        java.lang.String[] strArray5 = net.canadensys.utils.StringUtils.allLowerCase(strArray4);
        boolean boolean6 = net.canadensys.utils.ArrayUtils.containsOnlyNotNull((java.lang.Object[]) strArray4);
        java.lang.String[] strArray7 = net.canadensys.utils.StringUtils.allUpperCase(strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        net.canadensys.vocabulary.Continent continent0 = net.canadensys.vocabulary.Continent.ANTARCTICA;
        java.lang.String str1 = continent0.getTitle();
        java.lang.String str2 = continent0.getCode();
        java.lang.String str3 = continent0.getCode();
        org.junit.Assert.assertTrue("'" + continent0 + "' != '" + net.canadensys.vocabulary.Continent.ANTARCTICA + "'", continent0.equals(net.canadensys.vocabulary.Continent.ANTARCTICA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Antarctica" + "'", str1, "Antarctica");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AN" + "'", str2, "AN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AN" + "'", str3, "AN");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.ARIZONA;
        java.lang.String str1 = uSState0.getCode();
        java.lang.String str2 = uSState0.getName();
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.ARIZONA + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.ARIZONA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "US-AZ" + "'", str1, "US-AZ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Arizona" + "'", str2, "Arizona");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String[] strArray4 = net.canadensys.utils.StringUtils.allLowerCase(strArray3);
        boolean boolean5 = net.canadensys.utils.ArrayUtils.containsOnlyNotNull((java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = net.canadensys.utils.StringUtils.allLowerCase(strArray4);
        java.lang.String[] strArray7 = net.canadensys.utils.StringUtils.allLowerCase(strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        net.canadensys.vocabulary.Continent continent1 = net.canadensys.vocabulary.Continent.fromCode("Europe");
        org.junit.Assert.assertNull(continent1);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = net.canadensys.utils.ZipUtils.zipFolder(file0, "Maryland");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String[] strArray4 = net.canadensys.utils.StringUtils.allLowerCase(strArray3);
        boolean boolean5 = net.canadensys.utils.ArrayUtils.containsOnlyNotNull((java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = net.canadensys.utils.StringUtils.allUpperCase(strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral(3999);
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince2 = net.canadensys.vocabulary.stateprovince.BEProvince.FLEMISH_BRABANT;
        boolean boolean3 = romanNumeral1.equals((java.lang.Object) bEProvince2);
        java.lang.String str4 = bEProvince2.getCode();
        org.junit.Assert.assertTrue("'" + bEProvince2 + "' != '" + net.canadensys.vocabulary.stateprovince.BEProvince.FLEMISH_BRABANT + "'", bEProvince2.equals(net.canadensys.vocabulary.stateprovince.BEProvince.FLEMISH_BRABANT));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "BE-VBR" + "'", str4, "BE-VBR");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince1 = net.canadensys.vocabulary.stateprovince.BEProvince.fromCode("Amazonas");
        org.junit.Assert.assertNull(bEProvince1);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = net.canadensys.utils.ZipUtils.zipFolder(file0, "CO-VAC");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        net.canadensys.vocabulary.Continent continent1 = net.canadensys.vocabulary.Continent.fromCode("BE-VBR");
        org.junit.Assert.assertNull(continent1);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral(32);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle4 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("Quind\355o", locale1, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment1 = net.canadensys.vocabulary.stateprovince.CODepartment.fromCode("South Dakota");
        org.junit.Assert.assertNull(cODepartment1);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        java.lang.String[] strArray38 = new java.lang.String[] { "Delaware", "US-NE", "", "North America", "CA-ON", "Limburg", "CA-NS", "Colorado", "US-VT", "Choc\363", "Brussels-Capital Region", "Nevada", "AN", "EU", "BE-VAN", "Arizona", "AS", "Arizona", "Michigan", "AF", "Arizona", "Brussels-Capital Region", "AF", "", "Maryland", "La Guajira", "US-NE", "US-AZ", "West Flanders", "Quind\355o", "Nevada", "CA-NU", "Casanare", "Casanare", "Ontario", "CA-NU", "Maryland", "BE-VAN" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.util.List<java.lang.Integer> intList42 = net.canadensys.utils.ListUtils.toIntegerList((java.util.List<java.lang.String>) strList39, true);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(intList42);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = net.canadensys.utils.ZipUtils.unzipFileOrFolder(file0, "Arizona");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String[] strArray4 = net.canadensys.utils.StringUtils.allLowerCase(strArray3);
        java.lang.String[] strArray5 = net.canadensys.utils.StringUtils.allUpperCase(strArray3);
        boolean boolean6 = net.canadensys.utils.ArrayUtils.containsOnlyNull((java.lang.Object[]) strArray3);
        java.lang.String[] strArray7 = net.canadensys.utils.StringUtils.allLowerCase(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.WEST_VIRGINIA;
        java.lang.String str1 = uSState0.getName();
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.WEST_VIRGINIA + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.WEST_VIRGINIA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "West Virginia" + "'", str1, "West Virginia");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince0 = net.canadensys.vocabulary.stateprovince.BEProvince.LIMBURG;
        java.lang.String str1 = bEProvince0.getCode();
        org.junit.Assert.assertTrue("'" + bEProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.BEProvince.LIMBURG + "'", bEProvince0.equals(net.canadensys.vocabulary.stateprovince.BEProvince.LIMBURG));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "BE-VLI" + "'", str1, "BE-VLI");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.SANTANDER;
        java.lang.String str1 = cODepartment0.getCode();
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.SANTANDER + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.SANTANDER));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CO-SAN" + "'", str1, "CO-SAN");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle3 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("BE-VLI", locale1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        net.canadensys.vocabulary.stateprovince.USState uSState1 = net.canadensys.vocabulary.stateprovince.USState.fromCode("Nari\361o");
        org.junit.Assert.assertNull(uSState1);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator0 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator1 = unaccentStringComparator0.reversed();
        int int4 = unaccentStringComparator0.compare("Ontario", "BE-BRU");
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator5 = new net.canadensys.comparator.UnaccentStringComparator();
        int int8 = unaccentStringComparator5.compare("Amazonas", "New Brunswick");
        int int11 = unaccentStringComparator5.compare("Colorado", "BE-VAN");
        java.util.Comparator<java.lang.String> strComparator12 = unaccentStringComparator0.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator5);
        org.junit.Assert.assertNotNull(strComparator1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 13 + "'", int4 == 13);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-13) + "'", int8 == (-13));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strComparator12);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle3 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("", locale1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral(3999);
        int int2 = romanNumeral1.toInt();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3999 + "'", int2 == 3999);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        java.lang.String str1 = net.canadensys.utils.StringUtils.unaccent("CO-VAC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CO-VAC" + "'", str1, "CO-VAC");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator0 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator1 = unaccentStringComparator0.reversed();
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator2 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator3 = unaccentStringComparator2.reversed();
        java.util.Comparator<java.lang.String> strComparator4 = unaccentStringComparator0.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator2);
        java.util.Comparator<java.lang.String> strComparator5 = unaccentStringComparator2.reversed();
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator6 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator7 = unaccentStringComparator6.reversed();
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator8 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator9 = unaccentStringComparator8.reversed();
        java.util.Comparator<java.lang.String> strComparator10 = unaccentStringComparator6.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator8);
        java.util.Comparator<java.lang.String> strComparator11 = unaccentStringComparator8.reversed();
        java.util.Comparator<java.lang.String> strComparator12 = unaccentStringComparator2.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator8);
        int int15 = unaccentStringComparator2.compare("XCVII", ".zip");
        org.junit.Assert.assertNotNull(strComparator1);
        org.junit.Assert.assertNotNull(strComparator3);
        org.junit.Assert.assertNotNull(strComparator4);
        org.junit.Assert.assertNotNull(strComparator5);
        org.junit.Assert.assertNotNull(strComparator7);
        org.junit.Assert.assertNotNull(strComparator9);
        org.junit.Assert.assertNotNull(strComparator10);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertNotNull(strComparator12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 42 + "'", int15 == 42);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.NEVADA;
        java.lang.String str1 = uSState0.getName();
        java.lang.String str2 = uSState0.getName();
        java.lang.String str3 = uSState0.getCode();
        java.lang.String str4 = uSState0.getName();
        java.lang.String str5 = uSState0.getCode();
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.NEVADA + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.NEVADA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Nevada" + "'", str1, "Nevada");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Nevada" + "'", str2, "Nevada");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "US-NV" + "'", str3, "US-NV");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nevada" + "'", str4, "Nevada");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "US-NV" + "'", str5, "US-NV");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle2 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("Antarctica", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        net.canadensys.vocabulary.stateprovince.CAProvince cAProvince1 = net.canadensys.vocabulary.stateprovince.CAProvince.fromCode("West Flanders");
        org.junit.Assert.assertNull(cAProvince1);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.NEVADA;
        java.lang.String str1 = uSState0.getName();
        java.lang.String str2 = uSState0.getCode();
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.NEVADA + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.NEVADA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Nevada" + "'", str1, "Nevada");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "US-NV" + "'", str2, "US-NV");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        java.lang.String[] strArray10 = new java.lang.String[] { "CO-GUA", "Colorado", "Antarctica", "Nevada", "", "Amazonas", "", "Northwest Territories", "", "CO-GUA" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.List<java.lang.Integer> intList14 = net.canadensys.utils.ListUtils.toIntegerList((java.util.List<java.lang.String>) strList11, false);
        boolean boolean15 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList11);
        boolean boolean16 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList11);
        boolean boolean17 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList11);
        boolean boolean18 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList11);
        java.util.List<java.lang.Integer> intList20 = net.canadensys.utils.ListUtils.toIntegerList((java.util.List<java.lang.String>) strList11, true);
        boolean boolean21 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList11);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(intList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String[] strArray4 = net.canadensys.utils.StringUtils.allLowerCase(strArray3);
        boolean boolean5 = net.canadensys.utils.ArrayUtils.containsOnlyNull((java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = net.canadensys.utils.StringUtils.allUpperCase(strArray4);
        boolean boolean7 = net.canadensys.utils.ArrayUtils.containsOnlyNotNull((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince0 = net.canadensys.vocabulary.stateprovince.BEProvince.WEST_FLANDERS;
        java.lang.String str1 = bEProvince0.getName();
        java.lang.String str2 = bEProvince0.getCode();
        org.junit.Assert.assertTrue("'" + bEProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.BEProvince.WEST_FLANDERS + "'", bEProvince0.equals(net.canadensys.vocabulary.stateprovince.BEProvince.WEST_FLANDERS));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "West Flanders" + "'", str1, "West Flanders");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "BE-VWV" + "'", str2, "BE-VWV");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        net.canadensys.vocabulary.stateprovince.USState uSState1 = net.canadensys.vocabulary.stateprovince.USState.fromCode("BE-VBR");
        org.junit.Assert.assertNull(uSState1);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral(3999);
        java.lang.String[] strArray12 = new java.lang.String[] { "CO-GUA", "Colorado", "Antarctica", "Nevada", "", "Amazonas", "", "Northwest Territories", "", "CO-GUA" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.List<java.lang.Integer> intList16 = net.canadensys.utils.ListUtils.toIntegerList((java.util.List<java.lang.String>) strList13, false);
        boolean boolean17 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList13);
        java.util.List<java.lang.Integer> intList19 = net.canadensys.utils.ListUtils.toIntegerList((java.util.List<java.lang.String>) strList13, false);
        boolean boolean20 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList13);
        boolean boolean21 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList13);
        boolean boolean22 = romanNumeral1.equals((java.lang.Object) strList13);
        java.util.List<java.lang.Integer> intList24 = net.canadensys.utils.ListUtils.toIntegerList((java.util.List<java.lang.String>) strList13, true);
        boolean boolean25 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList13);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(intList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = net.canadensys.utils.ZipUtils.zipFolder(file0, "BE-VAN");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle2 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("Quind\355o", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle3 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("AN", locale1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince1 = net.canadensys.vocabulary.stateprovince.BEProvince.fromCode("CO-SAP");
        org.junit.Assert.assertNull(bEProvince1);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.CHOCO;
        java.lang.String str1 = cODepartment0.getName();
        java.lang.String str2 = cODepartment0.getName();
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.CHOCO + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.CHOCO));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Choc\363" + "'", str1, "Choc\363");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Choc\363" + "'", str2, "Choc\363");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle4 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("Colorado", locale1, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        net.canadensys.vocabulary.Continent continent1 = net.canadensys.vocabulary.Continent.fromCode("CO-QUI");
        org.junit.Assert.assertNull(continent1);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.PropertyResourceBundle propertyResourceBundle2 = net.canadensys.bundle.UTF8PropertyResourceBundle.getBundle("CO-SUC", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.PropertyResourceBundle propertyResourceBundle2 = net.canadensys.bundle.UTF8PropertyResourceBundle.getBundle("EU", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        net.canadensys.vocabulary.stateprovince.USState uSState1 = net.canadensys.vocabulary.stateprovince.USState.fromCode("EU");
        org.junit.Assert.assertNull(uSState1);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince1 = net.canadensys.vocabulary.stateprovince.BEProvince.fromCode("");
        org.junit.Assert.assertNull(bEProvince1);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral("AF");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince0 = net.canadensys.vocabulary.stateprovince.BEProvince.WALLOON_BRABANT;
        java.lang.String str1 = bEProvince0.getName();
        org.junit.Assert.assertTrue("'" + bEProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.BEProvince.WALLOON_BRABANT + "'", bEProvince0.equals(net.canadensys.vocabulary.stateprovince.BEProvince.WALLOON_BRABANT));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Walloon Brabant" + "'", str1, "Walloon Brabant");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince0 = net.canadensys.vocabulary.stateprovince.BEProvince.BRUSSELS_CAPITAL_REGION;
        java.lang.String str1 = bEProvince0.getName();
        java.lang.String str2 = bEProvince0.getCode();
        java.lang.String str3 = bEProvince0.getName();
        org.junit.Assert.assertTrue("'" + bEProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.BEProvince.BRUSSELS_CAPITAL_REGION + "'", bEProvince0.equals(net.canadensys.vocabulary.stateprovince.BEProvince.BRUSSELS_CAPITAL_REGION));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Brussels-Capital Region" + "'", str1, "Brussels-Capital Region");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "BE-BRU" + "'", str2, "BE-BRU");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Brussels-Capital Region" + "'", str3, "Brussels-Capital Region");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral((int) ' ');
        net.canadensys.vocabulary.stateprovince.USState uSState2 = net.canadensys.vocabulary.stateprovince.USState.NEVADA;
        boolean boolean3 = romanNumeral1.equals((java.lang.Object) uSState2);
        org.junit.Assert.assertTrue("'" + uSState2 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.NEVADA + "'", uSState2.equals(net.canadensys.vocabulary.stateprovince.USState.NEVADA));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        net.canadensys.vocabulary.stateprovince.CAProvince cAProvince0 = net.canadensys.vocabulary.stateprovince.CAProvince.SASKATCHEWAN;
        java.lang.String str1 = cAProvince0.getName();
        java.lang.String str2 = cAProvince0.getCode();
        org.junit.Assert.assertTrue("'" + cAProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.CAProvince.SASKATCHEWAN + "'", cAProvince0.equals(net.canadensys.vocabulary.stateprovince.CAProvince.SASKATCHEWAN));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Saskatchewan" + "'", str1, "Saskatchewan");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CA-SK" + "'", str2, "CA-SK");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        java.lang.String[] strArray10 = new java.lang.String[] { "CO-GUA", "Colorado", "Antarctica", "Nevada", "", "Amazonas", "", "Northwest Territories", "", "CO-GUA" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.List<java.lang.Integer> intList14 = net.canadensys.utils.ListUtils.toIntegerList((java.util.List<java.lang.String>) strList11, false);
        boolean boolean15 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList11);
        boolean boolean16 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList11);
        boolean boolean17 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList11);
        boolean boolean18 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList11);
        java.util.List<java.lang.Integer> intList20 = net.canadensys.utils.ListUtils.toIntegerList((java.util.List<java.lang.String>) strList11, false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator0 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator1 = unaccentStringComparator0.reversed();
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator2 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator3 = unaccentStringComparator2.reversed();
        java.util.Comparator<java.lang.String> strComparator4 = unaccentStringComparator0.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator2);
        java.util.Comparator<java.lang.String> strComparator5 = unaccentStringComparator2.reversed();
        java.lang.Class<?> wildcardClass6 = strComparator5.getClass();
        org.junit.Assert.assertNotNull(strComparator1);
        org.junit.Assert.assertNotNull(strComparator3);
        org.junit.Assert.assertNotNull(strComparator4);
        org.junit.Assert.assertNotNull(strComparator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = net.canadensys.utils.StringUtils.allLowerCase(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle4 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("Manitoba", locale1, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = net.canadensys.utils.ZipUtils.unzipFileOrFolder(file0, "AF");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String[] strArray4 = net.canadensys.utils.StringUtils.allLowerCase(strArray3);
        java.lang.String[] strArray5 = net.canadensys.utils.StringUtils.allUpperCase(strArray3);
        java.lang.String[] strArray6 = net.canadensys.utils.StringUtils.allLowerCase(strArray3);
        java.lang.String[] strArray7 = net.canadensys.utils.StringUtils.allLowerCase(strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        net.canadensys.vocabulary.stateprovince.CAProvince cAProvince1 = net.canadensys.vocabulary.stateprovince.CAProvince.fromCode("MMMCMXCIX");
        org.junit.Assert.assertNull(cAProvince1);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral((int) ' ');
        int int2 = romanNumeral1.toInt();
        net.canadensys.lang.RomanNumeral romanNumeral4 = new net.canadensys.lang.RomanNumeral(3999);
        java.lang.String[] strArray15 = new java.lang.String[] { "CO-GUA", "Colorado", "Antarctica", "Nevada", "", "Amazonas", "", "Northwest Territories", "", "CO-GUA" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.util.List<java.lang.Integer> intList19 = net.canadensys.utils.ListUtils.toIntegerList((java.util.List<java.lang.String>) strList16, false);
        boolean boolean20 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList16);
        java.util.List<java.lang.Integer> intList22 = net.canadensys.utils.ListUtils.toIntegerList((java.util.List<java.lang.String>) strList16, false);
        boolean boolean23 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList16);
        boolean boolean24 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList16);
        boolean boolean25 = romanNumeral4.equals((java.lang.Object) strList16);
        int int26 = romanNumeral1.compareTo(romanNumeral4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        net.canadensys.vocabulary.stateprovince.CAProvince cAProvince0 = net.canadensys.vocabulary.stateprovince.CAProvince.NUNAVUT;
        java.lang.String str1 = cAProvince0.getCode();
        java.lang.String str2 = cAProvince0.getCode();
        org.junit.Assert.assertTrue("'" + cAProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.CAProvince.NUNAVUT + "'", cAProvince0.equals(net.canadensys.vocabulary.stateprovince.CAProvince.NUNAVUT));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CA-NU" + "'", str1, "CA-NU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CA-NU" + "'", str2, "CA-NU");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        java.lang.String str1 = net.canadensys.utils.StringUtils.unaccent("AN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AN" + "'", str1, "AN");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince0 = net.canadensys.vocabulary.stateprovince.BEProvince.HAINAUT;
        java.lang.String str1 = bEProvince0.getCode();
        org.junit.Assert.assertTrue("'" + bEProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.BEProvince.HAINAUT + "'", bEProvince0.equals(net.canadensys.vocabulary.stateprovince.BEProvince.HAINAUT));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "BE-WHT" + "'", str1, "BE-WHT");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.bundle.InMemoryResourceBundle inMemoryResourceBundle3 = net.canadensys.bundle.InMemoryResourceBundle.getBundle("Massachusetts", locale1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral((int) 'a');
        java.lang.String str2 = romanNumeral1.toRomanNumeral();
        int int3 = romanNumeral1.toInt();
        java.lang.String str4 = romanNumeral1.toRomanNumeral();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XCVII" + "'", str2, "XCVII");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "XCVII" + "'", str4, "XCVII");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        net.canadensys.vocabulary.stateprovince.USState uSState0 = net.canadensys.vocabulary.stateprovince.USState.SOUTH_DAKOTA;
        java.lang.String str1 = uSState0.getName();
        java.lang.String str2 = uSState0.getName();
        org.junit.Assert.assertTrue("'" + uSState0 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.SOUTH_DAKOTA + "'", uSState0.equals(net.canadensys.vocabulary.stateprovince.USState.SOUTH_DAKOTA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "South Dakota" + "'", str1, "South Dakota");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "South Dakota" + "'", str2, "South Dakota");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        net.canadensys.vocabulary.stateprovince.CAProvince cAProvince0 = net.canadensys.vocabulary.stateprovince.CAProvince.NORTHWEST_TERRITORIES;
        java.lang.String str1 = cAProvince0.getCode();
        org.junit.Assert.assertTrue("'" + cAProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.CAProvince.NORTHWEST_TERRITORIES + "'", cAProvince0.equals(net.canadensys.vocabulary.stateprovince.CAProvince.NORTHWEST_TERRITORIES));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CA-NT" + "'", str1, "CA-NT");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        java.lang.String[] strArray60 = new java.lang.String[] { "Ontario", "Meta", "AS", "US-NE", "Iowa", "CO-SAP", "", "CA-SK", "Nari\361o", "Maryland", "Oceania", "Risaralda", "CA-NU", "La Guajira", "XCVII", "EU", "Colorado", "Delaware", "CA-BC", "Nevada", "Brussels-Capital Region", "Oceania", "CA-SK", "BE-BRU", "Africa", "", "Europe", "XCVII", "CO-GUA", "Delaware", "", "Meta", "BE-VAN", "Nevada", "West Virginia", "Europe", "Choc\363", "Manitoba", "Casanare", "AS", "Asia", "Saskatchewan", "Missouri", "La Guajira", "MMMCMXCIX", "hi!", "Choc\363", "US-IN", "BE-VBR", "BE-VBR", "XCVII", "CA-SK", "US-VT", "XCVII", "La Guajira", "BE-WNA", "New Brunswick", "Massachusetts", "AS", "US-VT" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        boolean boolean63 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList61);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String[] strArray4 = net.canadensys.utils.StringUtils.allLowerCase(strArray3);
        java.lang.String[] strArray5 = net.canadensys.utils.StringUtils.allLowerCase(strArray4);
        boolean boolean6 = net.canadensys.utils.ArrayUtils.containsOnlyNull((java.lang.Object[]) strArray4);
        java.lang.String[] strArray7 = net.canadensys.utils.StringUtils.allLowerCase(strArray4);
        java.lang.String[] strArray8 = net.canadensys.utils.StringUtils.allLowerCase(strArray7);
        java.lang.String[] strArray9 = net.canadensys.utils.StringUtils.allLowerCase(strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.META;
        java.lang.String str1 = cODepartment0.getName();
        java.lang.String str2 = cODepartment0.getName();
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.META + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.META));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Meta" + "'", str1, "Meta");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Meta" + "'", str2, "Meta");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment1 = net.canadensys.vocabulary.stateprovince.CODepartment.fromCode("Missouri");
        org.junit.Assert.assertNull(cODepartment1);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator0 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator1 = unaccentStringComparator0.reversed();
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator2 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator3 = unaccentStringComparator2.reversed();
        java.util.Comparator<java.lang.String> strComparator4 = unaccentStringComparator0.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator2);
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator5 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator6 = unaccentStringComparator5.reversed();
        java.util.Comparator<java.lang.String> strComparator7 = unaccentStringComparator2.thenComparing(strComparator6);
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator8 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator9 = strComparator6.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator8);
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator10 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator11 = unaccentStringComparator10.reversed();
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator12 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator13 = unaccentStringComparator12.reversed();
        java.util.Comparator<java.lang.String> strComparator14 = unaccentStringComparator10.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator12);
        java.util.Comparator<java.lang.String> strComparator15 = strComparator9.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator10);
        org.junit.Assert.assertNotNull(strComparator1);
        org.junit.Assert.assertNotNull(strComparator3);
        org.junit.Assert.assertNotNull(strComparator4);
        org.junit.Assert.assertNotNull(strComparator6);
        org.junit.Assert.assertNotNull(strComparator7);
        org.junit.Assert.assertNotNull(strComparator9);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertNotNull(strComparator14);
        org.junit.Assert.assertNotNull(strComparator15);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        net.canadensys.vocabulary.stateprovince.CAProvince cAProvince1 = net.canadensys.vocabulary.stateprovince.CAProvince.fromCode("");
        org.junit.Assert.assertNull(cAProvince1);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral(3999);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String[] strArray6 = net.canadensys.utils.StringUtils.allLowerCase(strArray5);
        java.lang.String[] strArray7 = net.canadensys.utils.StringUtils.allUpperCase(strArray6);
        java.lang.String[] strArray8 = net.canadensys.utils.StringUtils.allLowerCase(strArray7);
        boolean boolean9 = romanNumeral1.equals((java.lang.Object) strArray7);
        java.lang.String[] strArray10 = net.canadensys.utils.StringUtils.allLowerCase(strArray7);
        java.lang.String[] strArray11 = net.canadensys.utils.StringUtils.allUpperCase(strArray10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator0 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator1 = unaccentStringComparator0.reversed();
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator2 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator3 = unaccentStringComparator2.reversed();
        java.util.Comparator<java.lang.String> strComparator4 = unaccentStringComparator0.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator2);
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator5 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator6 = unaccentStringComparator5.reversed();
        java.util.Comparator<java.lang.String> strComparator7 = unaccentStringComparator2.thenComparing(strComparator6);
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator8 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator9 = unaccentStringComparator8.reversed();
        int int12 = unaccentStringComparator8.compare("Ontario", "BE-BRU");
        java.util.Comparator<java.lang.String> strComparator13 = strComparator6.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator8);
        net.canadensys.comparator.UnaccentStringComparator unaccentStringComparator14 = new net.canadensys.comparator.UnaccentStringComparator();
        java.util.Comparator<java.lang.String> strComparator15 = unaccentStringComparator14.reversed();
        java.util.Comparator<java.lang.String> strComparator16 = unaccentStringComparator8.thenComparing((java.util.Comparator<java.lang.String>) unaccentStringComparator14);
        int int19 = unaccentStringComparator14.compare("CO-SAN", "Brussels-Capital Region");
        org.junit.Assert.assertNotNull(strComparator1);
        org.junit.Assert.assertNotNull(strComparator3);
        org.junit.Assert.assertNotNull(strComparator4);
        org.junit.Assert.assertNotNull(strComparator6);
        org.junit.Assert.assertNotNull(strComparator7);
        org.junit.Assert.assertNotNull(strComparator9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13 + "'", int12 == 13);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertNotNull(strComparator15);
        org.junit.Assert.assertNotNull(strComparator16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral(3999);
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince2 = net.canadensys.vocabulary.stateprovince.BEProvince.FLEMISH_BRABANT;
        boolean boolean3 = romanNumeral1.equals((java.lang.Object) bEProvince2);
        boolean boolean5 = romanNumeral1.equals((java.lang.Object) 100.0f);
        net.canadensys.lang.RomanNumeral romanNumeral7 = new net.canadensys.lang.RomanNumeral((int) 'a');
        java.lang.String str8 = romanNumeral7.toRomanNumeral();
        java.lang.String str9 = romanNumeral7.toRomanNumeral();
        java.lang.Object obj10 = null;
        boolean boolean11 = romanNumeral7.equals(obj10);
        int int12 = romanNumeral1.compareTo(romanNumeral7);
        org.junit.Assert.assertTrue("'" + bEProvince2 + "' != '" + net.canadensys.vocabulary.stateprovince.BEProvince.FLEMISH_BRABANT + "'", bEProvince2.equals(net.canadensys.vocabulary.stateprovince.BEProvince.FLEMISH_BRABANT));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "XCVII" + "'", str8, "XCVII");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "XCVII" + "'", str9, "XCVII");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        java.lang.String str1 = net.canadensys.utils.StringUtils.unaccent("AF");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AF" + "'", str1, "AF");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String[] strArray4 = net.canadensys.utils.StringUtils.allLowerCase(strArray3);
        java.lang.String[] strArray5 = net.canadensys.utils.StringUtils.allUpperCase(strArray4);
        boolean boolean6 = net.canadensys.utils.ArrayUtils.containsOnlyNotNull((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince1 = net.canadensys.vocabulary.stateprovince.BEProvince.fromCode("BE-WHT");
        org.junit.Assert.assertTrue("'" + bEProvince1 + "' != '" + net.canadensys.vocabulary.stateprovince.BEProvince.HAINAUT + "'", bEProvince1.equals(net.canadensys.vocabulary.stateprovince.BEProvince.HAINAUT));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        net.canadensys.vocabulary.Continent continent0 = net.canadensys.vocabulary.Continent.OCEANIA;
        java.lang.String str1 = continent0.getTitle();
        java.lang.String str2 = continent0.getCode();
        org.junit.Assert.assertTrue("'" + continent0 + "' != '" + net.canadensys.vocabulary.Continent.OCEANIA + "'", continent0.equals(net.canadensys.vocabulary.Continent.OCEANIA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Oceania" + "'", str1, "Oceania");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OC" + "'", str2, "OC");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = net.canadensys.utils.ZipUtils.unzipFileOrFolder(file0, "Michigan");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = net.canadensys.utils.ZipUtils.unzipFileOrFolder(file0, "CO-SUC");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral(3999);
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince2 = net.canadensys.vocabulary.stateprovince.BEProvince.FLEMISH_BRABANT;
        boolean boolean3 = romanNumeral1.equals((java.lang.Object) bEProvince2);
        net.canadensys.lang.RomanNumeral romanNumeral5 = new net.canadensys.lang.RomanNumeral((int) ' ');
        int int6 = romanNumeral1.compareTo(romanNumeral5);
        org.junit.Assert.assertTrue("'" + bEProvince2 + "' != '" + net.canadensys.vocabulary.stateprovince.BEProvince.FLEMISH_BRABANT + "'", bEProvince2.equals(net.canadensys.vocabulary.stateprovince.BEProvince.FLEMISH_BRABANT));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral((int) ' ');
        int int2 = romanNumeral1.toInt();
        int int3 = romanNumeral1.toInt();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.MAGDALENA;
        java.lang.String str1 = cODepartment0.getName();
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.MAGDALENA + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.MAGDALENA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Magdalena" + "'", str1, "Magdalena");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.META;
        java.lang.String str1 = cODepartment0.getName();
        java.lang.String str2 = cODepartment0.getName();
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.META + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.META));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Meta" + "'", str1, "Meta");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Meta" + "'", str2, "Meta");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral((int) 'a');
        java.lang.String str2 = romanNumeral1.toRomanNumeral();
        java.lang.String str3 = romanNumeral1.toRomanNumeral();
        java.lang.String[] strArray14 = new java.lang.String[] { "CO-GUA", "Colorado", "Antarctica", "Nevada", "", "Amazonas", "", "Northwest Territories", "", "CO-GUA" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<java.lang.Integer> intList18 = net.canadensys.utils.ListUtils.toIntegerList((java.util.List<java.lang.String>) strList15, false);
        boolean boolean19 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.Integer> intList21 = net.canadensys.utils.ListUtils.toIntegerList((java.util.List<java.lang.String>) strList15, false);
        boolean boolean22 = net.canadensys.utils.ListUtils.containsAtLeastOneNonBlank((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.Integer> intList24 = net.canadensys.utils.ListUtils.toIntegerList((java.util.List<java.lang.String>) strList15, false);
        boolean boolean25 = romanNumeral1.equals((java.lang.Object) false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XCVII" + "'", str2, "XCVII");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "XCVII" + "'", str3, "XCVII");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String[] strArray4 = net.canadensys.utils.StringUtils.allLowerCase(strArray3);
        java.lang.String[] strArray5 = net.canadensys.utils.StringUtils.allUpperCase(strArray4);
        java.lang.String[] strArray6 = net.canadensys.utils.StringUtils.allUpperCase(strArray5);
        boolean boolean7 = net.canadensys.utils.ArrayUtils.containsOnlyNotNull((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince0 = net.canadensys.vocabulary.stateprovince.BEProvince.NAMUR;
        java.lang.String str1 = bEProvince0.getCode();
        java.lang.String str2 = bEProvince0.getCode();
        java.lang.String str3 = bEProvince0.getName();
        java.lang.String str4 = bEProvince0.getName();
        org.junit.Assert.assertTrue("'" + bEProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.BEProvince.NAMUR + "'", bEProvince0.equals(net.canadensys.vocabulary.stateprovince.BEProvince.NAMUR));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "BE-WNA" + "'", str1, "BE-WNA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "BE-WNA" + "'", str2, "BE-WNA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Namur" + "'", str3, "Namur");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Namur" + "'", str4, "Namur");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral((int) 'a');
        java.lang.String str2 = romanNumeral1.toRomanNumeral();
        java.lang.String str3 = romanNumeral1.toRomanNumeral();
        java.lang.Object obj4 = null;
        boolean boolean5 = romanNumeral1.equals(obj4);
        int int6 = romanNumeral1.toInt();
        net.canadensys.vocabulary.stateprovince.USState uSState7 = net.canadensys.vocabulary.stateprovince.USState.NEW_HAMPSHIRE;
        boolean boolean8 = romanNumeral1.equals((java.lang.Object) uSState7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XCVII" + "'", str2, "XCVII");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "XCVII" + "'", str3, "XCVII");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + uSState7 + "' != '" + net.canadensys.vocabulary.stateprovince.USState.NEW_HAMPSHIRE + "'", uSState7.equals(net.canadensys.vocabulary.stateprovince.USState.NEW_HAMPSHIRE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral("Northwest Territories");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment0 = net.canadensys.vocabulary.stateprovince.CODepartment.SUCRE;
        java.lang.String str1 = cODepartment0.getCode();
        java.lang.String str2 = cODepartment0.getCode();
        org.junit.Assert.assertTrue("'" + cODepartment0 + "' != '" + net.canadensys.vocabulary.stateprovince.CODepartment.SUCRE + "'", cODepartment0.equals(net.canadensys.vocabulary.stateprovince.CODepartment.SUCRE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CO-SUC" + "'", str1, "CO-SUC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CO-SUC" + "'", str2, "CO-SUC");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test337");
        net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral((int) (byte) 10);
        int int2 = romanNumeral1.toInt();
        java.lang.String str3 = romanNumeral1.toRomanNumeral();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "X" + "'", str3, "X");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test338");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment1 = net.canadensys.vocabulary.stateprovince.CODepartment.fromCode("US-MA");
        org.junit.Assert.assertNull(cODepartment1);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test339");
        net.canadensys.vocabulary.stateprovince.CODepartment cODepartment1 = net.canadensys.vocabulary.stateprovince.CODepartment.fromCode("US-WY");
        org.junit.Assert.assertNull(cODepartment1);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String[] strArray4 = net.canadensys.utils.StringUtils.allLowerCase(strArray3);
        java.lang.String[] strArray5 = net.canadensys.utils.StringUtils.allUpperCase(strArray4);
        java.lang.String[] strArray6 = net.canadensys.utils.StringUtils.allUpperCase(strArray5);
        boolean boolean7 = net.canadensys.utils.ArrayUtils.containsOnlyNull((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test341");
        net.canadensys.vocabulary.stateprovince.CAProvince cAProvince0 = net.canadensys.vocabulary.stateprovince.CAProvince.MANITOBA;
        java.lang.String str1 = cAProvince0.getName();
        java.lang.String str2 = cAProvince0.getCode();
        org.junit.Assert.assertTrue("'" + cAProvince0 + "' != '" + net.canadensys.vocabulary.stateprovince.CAProvince.MANITOBA + "'", cAProvince0.equals(net.canadensys.vocabulary.stateprovince.CAProvince.MANITOBA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Manitoba" + "'", str1, "Manitoba");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CA-MB" + "'", str2, "CA-MB");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test342");
        net.canadensys.vocabulary.Continent continent0 = net.canadensys.vocabulary.Continent.EUROPE;
        java.lang.String str1 = continent0.getCode();
        java.lang.String str2 = continent0.getTitle();
        org.junit.Assert.assertTrue("'" + continent0 + "' != '" + net.canadensys.vocabulary.Continent.EUROPE + "'", continent0.equals(net.canadensys.vocabulary.Continent.EUROPE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EU" + "'", str1, "EU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe" + "'", str2, "Europe");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test343");
        // The following exception was thrown during execution in test generation
        try {
            net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral("Oceania");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }
}

