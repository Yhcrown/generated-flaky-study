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
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.TRANSACTIONS_COMMITTED();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_EXEC();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.REGR_SXY();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.OR();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.LEAST();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.CONSTRAINTS();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DETACH();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.RULE();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.IDENTIFIED();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.VALIDATOR();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.KILL();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.TRANSACTIONS_COMMITTED();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.SCOPE_SCHEMA();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.SQLWARNING();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        com.ivanceras.keyword.sql.KeywordsStatics keywordsStatics0 = new com.ivanceras.keyword.sql.KeywordsStatics();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.ADA();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.XMLTEXT();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.A();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.INTEGER();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.INHERITS();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.SELECT();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.FALSE();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.IDENTITY();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.OPEN();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.STYLE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DEREF();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.DB();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DYNAMIC_FUNCTION();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.IN();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ILIKE();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.DECIMAL();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.SUBTYPE();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.STABLE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.WHEN();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.OF();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.OTHERS();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.CURRENT_USER();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.ivanceras.keyword.sql.SQL sQL1 = com.ivanceras.keyword.sql.SQLStatics.AVG("");
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.FROM();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.MINUS();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.XMLQUERY();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.XMLBINARY();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.CASCADE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.UNION();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.STARTING();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.NTH_VALUE();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DISCONNECT();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.COMMITTED();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.OPTIONS();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.ASC();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.FLOAT8();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DEGREE();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.MINUS();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.PLI();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.MONTH();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.OF();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.MAX("");
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.BASE64();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.TABLE_NAME();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.OPEN();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.TABLES();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.NEW();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL3.CHARACTERISTICS();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL3.EXCEPTION();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.SERIALIZABLE();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.DIAGNOSTICS();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL0.SQLCODE();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        com.ivanceras.keyword.sql.SQL sQL8 = sQL0.FROM(strArray7);
        com.ivanceras.keyword.sql.SQL sQL9 = com.ivanceras.keyword.sql.SQLStatics.SELECT(strArray7);
        com.ivanceras.keyword.sql.SQL sQL10 = sQL9.UNION();
        com.ivanceras.keyword.sql.SQL sQL11 = sQL9.SELF();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(sQL8);
        org.junit.Assert.assertNotNull(sQL9);
        org.junit.Assert.assertNotNull(sQL10);
        org.junit.Assert.assertNotNull(sQL11);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.START();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.HEADER();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.OPEN();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.TABLES();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.NEW();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL2.TRUNCATE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.EXCLUDE();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.CASCADED();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.NCHAR();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.REPEAT();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DICTIONARY();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ELSEIF();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.comma();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.SUBTYPE();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.NEW();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.INTERSECT();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.UESCAPE();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.GRANT();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.FROM();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.MINUS();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL1.AND_ON("hi!", "hi!");
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.TRANSACTION();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.BETWEEN();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.NATURAL();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.VERSION();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.KILL();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.VARBINARY();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.DATABASES();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.VACUUM();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.COMMIT();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.LIMIT(0);
        com.ivanceras.keyword.sql.SQL sQL4 = sQL3.NCHAR();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL4.NESTING();
        com.ivanceras.keyword.sql.SQL sQL6 = sQL4.DIV();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
        org.junit.Assert.assertNotNull(sQL6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.CORR();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.SETOF();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.WINDOW();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.PRECEDING();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.OWNER();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.CURRENT_PATH();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.DELIMITER();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.FOREIGN();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.FREE();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.LOCALTIME();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.ASYMMETRIC();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.CURRENT_CATALOG();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DAY_HOUR();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.TREAT();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.LAST();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.NFC();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.ROUTINE_SCHEMA();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.XMLBINARY();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.PRESERVE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.MASTER_SSL_VERIFY_SERVER_CERT();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.UNTYPED();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.LN();
        com.ivanceras.keyword.sql.SQL sQL1 = com.ivanceras.keyword.sql.SQLStatics.SUM(sQL0);
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.LOW_PRIORITY();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.MINUTE_SECOND();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.WITHOUT();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.STANDALONE();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.VARIADIC();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.PAD();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL2 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL2.SERIALIZABLE();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL0.AS(sQL2);
        com.ivanceras.keyword.sql.SQL sQL6 = sQL5.DATABASES();
        com.ivanceras.keyword.sql.SQL sQL7 = sQL5.LC_COLLATE();
        com.ivanceras.keyword.sql.SQL sQL8 = sQL7.TEXT();
        com.ivanceras.keyword.sql.SQL sQL9 = sQL8.RETURNED_OCTET_LENGTH();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
        org.junit.Assert.assertNotNull(sQL6);
        org.junit.Assert.assertNotNull(sQL7);
        org.junit.Assert.assertNotNull(sQL8);
        org.junit.Assert.assertNotNull(sQL9);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.USER();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.CLUSTERS();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.MAPPING();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.STATE();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.EXCLUSIVE();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DISABLE();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.MULTISET();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.LEVEL();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.KILL();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.GREATER_THAN_OR_EQUAL();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.RAISE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.FROM();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.CONTAINS();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.MIDDLEINT();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL1.ROUTINE_NAME();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.OIDS();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.MATCHED();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.CONSTRUCTOR();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.EQUALS();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.OVERLAY();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.NFKD();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.COMMENT();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL2 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL2.SERIALIZABLE();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL0.AS(sQL2);
        com.ivanceras.keyword.sql.SQL sQL6 = sQL5.WHEN();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
        org.junit.Assert.assertNotNull(sQL6);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.CLASS_ORIGIN();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ILIKE();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.STORAGE();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.CURSOR_NAME();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.INSERT();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.CREATE();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.TEMPORARY();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.PREPARED();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.PROGRAM();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL0.CREATE_TABLE("");
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL4);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.SERIALIZABLE();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.DATETIME_INTERVAL_PRECISION();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.GLOB();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.PATH();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.RETURNED_LENGTH();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.DELIMITER();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.TRUNCATE_TABLE("hi!");
        com.ivanceras.keyword.sql.SQL sQL4 = sQL0.CONNECTION();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.G();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.TINYINT();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.STDOUT();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.SERIALIZABLE();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.GROUPS();
        com.ivanceras.keyword.sql.SQL sQL5 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL6 = sQL5.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL8 = sQL5.LIMIT(0);
        com.ivanceras.keyword.sql.SQL sQL9 = sQL8.NCHAR();
        com.ivanceras.keyword.sql.SQL sQL10 = sQL3.SET("", (java.lang.Object) sQL8);
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL5);
        org.junit.Assert.assertNotNull(sQL6);
        org.junit.Assert.assertNotNull(sQL8);
        org.junit.Assert.assertNotNull(sQL9);
        org.junit.Assert.assertNotNull(sQL10);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.REINDEX();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.PRECEDING();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.OWNER();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.QUERY();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.CONVERSION();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.IMPORT();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.SCOPE_SCHEMA();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.RLIKE();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.VARCHAR();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.CURSOR();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.XMLPI();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.NULLS();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.FREEZE();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.CALLED();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.BIT();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.LINK();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.ivanceras.keyword.sql.SQL sQL1 = com.ivanceras.keyword.sql.SQLStatics.SUM("hi!");
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.OPEN();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.TABLES();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.NEW();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL3.CHARACTERISTICS();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL4.REGR_COUNT();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.SESSION_USER();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DICTIONARY();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ELSEIF();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL1.VALUE((java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.ivanceras.keyword.sql.SQL sQL1 = com.ivanceras.keyword.sql.SQLStatics.CREATE_TABLE("hi!");
        com.ivanceras.keyword.sql.SQL sQL4 = sQL1.AND_ON("hi!", "hi!");
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL4);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.WHITESPACE();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.DEPTH();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.TABLES();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.EXPRESSION();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.ON("");
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.NULLS();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.FREEZE();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.SQLSTATE();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL2.LEFT_OUTER_JOIN("");
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL4);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.REGR_AVGY();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.DLURLCOMPLETEWRITE();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.CURRENT_TIME();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.GENERATED();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.INTEGRITY();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.LABEL();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.EXPRESSION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.VALUE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.PREPARE();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.STRAIGHT_JOIN();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DAY_HOUR();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.AT();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.MAXVALUE();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.ORDINALITY();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL2.POWER();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.CLUSTERS();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.PROGRAM();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.NORMALIZED();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL3.HOLD();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.WHITESPACE();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.PREPARED();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.NAMES();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.MODULE();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.PRESERVE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.SCOPE_SCHEMA();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ARROW();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.UNTIL();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.LEFT();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.MATERIALIZED();
        com.ivanceras.keyword.sql.SQL sQL2 = com.ivanceras.keyword.sql.KeywordsStatics.DESC();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL1.GREATER_THAN(sQL2);
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.STDDEV_POP();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.PRECEDING();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.OWNER();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.OVERLAY();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL1.UNLINK();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.SYSTEM_USER();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.BIGINT();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DLURLSERVER();
        com.ivanceras.keyword.sql.SQL sQL1 = com.ivanceras.keyword.sql.SQLStatics.ACOS(sQL0);
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.END_PARTITION();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL2 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL2.SERIALIZABLE();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL0.AS(sQL2);
        com.ivanceras.keyword.sql.SQL sQL6 = sQL5.DATABASES();
        com.ivanceras.keyword.sql.SQL sQL7 = sQL5.LC_COLLATE();
        com.ivanceras.keyword.sql.SQL sQL8 = sQL7.NOWAIT();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
        org.junit.Assert.assertNotNull(sQL6);
        org.junit.Assert.assertNotNull(sQL7);
        org.junit.Assert.assertNotNull(sQL8);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.REGR_SLOPE();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.ILIKE();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.OPEN();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.TABLES();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.NFKC();
        com.ivanceras.keyword.sql.SQL sQL4 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL4.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL6 = com.ivanceras.keyword.sql.SQLStatics.ASIN(sQL5);
        com.ivanceras.keyword.sql.SQL sQL7 = sQL3.ACOS(sQL5);
        com.ivanceras.keyword.sql.SQL sQL10 = sQL7.function("hi!", "hi!");
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
        org.junit.Assert.assertNotNull(sQL6);
        org.junit.Assert.assertNotNull(sQL7);
        org.junit.Assert.assertNotNull(sQL10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.SUBTYPE();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.SECOND_MICROSECOND();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.ln();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.ON_UPDATE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.WITHOUT();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.MODULE();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.DB();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.GENERATED();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ILIKE();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.REFERENCING();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.EVENT();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL3.FULLTEXT();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.OPEN();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.TABLES();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.NFKC();
        com.ivanceras.keyword.sql.SQL sQL4 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL4.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL6 = com.ivanceras.keyword.sql.SQLStatics.ASIN(sQL5);
        com.ivanceras.keyword.sql.SQL sQL7 = sQL3.ACOS(sQL5);
        com.ivanceras.keyword.sql.SQL sQL8 = sQL5.SUBSTRING_REGEX();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
        org.junit.Assert.assertNotNull(sQL6);
        org.junit.Assert.assertNotNull(sQL7);
        org.junit.Assert.assertNotNull(sQL8);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.WIDTH_BUCKET();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.COLLECT();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.ivanceras.keyword.sql.SQL sQL0 = new com.ivanceras.keyword.sql.SQL();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DENSE_RANK();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ILIKE();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.DROP_TABLE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.REASSIGN();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.EXPLAIN();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.FROM();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL1.SQL_BIG_RESULT();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL3.NO_WRITE_TO_BINLOG();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL3.AND();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.OPEN();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.TABLES();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.SECOND_MICROSECOND();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL0.REPEATABLE();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL4.RESPECT();
        com.ivanceras.keyword.sql.SQL sQL6 = sQL5.IS_NOT_NULL();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
        org.junit.Assert.assertNotNull(sQL6);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.CAST();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.USER_DEFINED_TYPE_CATALOG();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.CEILING();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.UTC_TIMESTAMP();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.INDEXED();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.PASCAL();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.MINVALUE();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.LC_CTYPE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.REGR_AVGY();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.DLURLCOMPLETEWRITE();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.LINES();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL2 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL2.SERIALIZABLE();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL0.AS(sQL2);
        com.ivanceras.keyword.sql.SQL sQL6 = sQL2.USE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
        org.junit.Assert.assertNotNull(sQL6);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.FLOAT();
        com.ivanceras.keyword.sql.SQL sQL1 = com.ivanceras.keyword.sql.SQLStatics.COS(sQL0);
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.TRIGGER_CATALOG();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.ATOMIC();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.OPEN();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.TABLES();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.NEW();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL3.CHARACTERISTICS();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL3.ABSOLUTE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DAY_HOUR();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.TREAT();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.ESCAPE();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.COLLATE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.ORDINALITY();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.MODULE();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.DB();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.EACH();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.NULLS();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.GREATER_THAN();
        com.ivanceras.keyword.sql.SQL sQL2 = com.ivanceras.keyword.sql.SQLStatics.LOWER(sQL1);
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.P();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL2.VIEW();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.OPEN();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.TABLES();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.SECOND_MICROSECOND();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL0.REPEATABLE();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL4.RESPECT();
        com.ivanceras.keyword.sql.SQL sQL6 = sQL4.XML();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
        org.junit.Assert.assertNotNull(sQL6);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.FORM();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.REQUIRE();
        com.ivanceras.keyword.sql.SQL sQL2 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.OPEN();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL2.TABLES();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL0.UNION(sQL2);
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.LIMIT(0);
        com.ivanceras.keyword.sql.SQL sQL4 = com.ivanceras.keyword.sql.KeywordsStatics.DICTIONARY();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL3.GREATER_THAN(sQL4);
        com.ivanceras.keyword.sql.SQL sQL6 = sQL5.BREADTH();
        com.ivanceras.keyword.sql.SQL sQL7 = sQL5.FREE();
        com.ivanceras.keyword.sql.SQL sQL8 = com.ivanceras.keyword.sql.SQLStatics.ACOS(sQL7);
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
        org.junit.Assert.assertNotNull(sQL6);
        org.junit.Assert.assertNotNull(sQL7);
        org.junit.Assert.assertNotNull(sQL8);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.PURGE();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.BEGIN();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.CONFIGURATION();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.SUBCLASS_ORIGIN();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.SECTION();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.MAX();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        com.ivanceras.keyword.sql.SQL sQL7 = sQL0.FOREIGN_KEY(strArray6);
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(sQL7);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.TRIGGER();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.REASSIGN();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.EXPLAIN();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.LOCATION();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL1.VALID();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ILIKE();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.REFERENCING();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL2.FULL_OUTER_JOIN("");
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL4);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.MAX();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.EQUALS();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.RETURNED_OCTET_LENGTH();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.LIMIT(0);
        com.ivanceras.keyword.sql.SQL sQL4 = sQL3.UNCOMMITTED();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL3.SIMPLE();
        com.ivanceras.keyword.sql.SQL sQL6 = sQL5.OVER();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
        org.junit.Assert.assertNotNull(sQL6);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.VARBINARY();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.SERIALIZABLE();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.DIAGNOSTICS();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL0.INDEXES();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.COST();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.PRECEDING();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.OWNER();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.QUERY();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.CONSTRAINTS();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DESC();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.NATIONAL();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.CHECKPOINT();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.SIZE();
        com.ivanceras.keyword.sql.SQL sQL1 = com.ivanceras.keyword.sql.KeywordsStatics.DAY_HOUR();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.TREAT();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.FOR();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL2.COMMENTS();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL0.AND(sQL2);
        com.ivanceras.keyword.sql.SQL sQL6 = sQL0.VERSIONING();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
        org.junit.Assert.assertNotNull(sQL6);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.OPEN();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.TABLES();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.SECOND_MICROSECOND();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL0.REPEATABLE();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL4.STATE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DAY_HOUR();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.TREAT();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.FOR();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL1.COMMENTS();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL3.EXECUTE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.MIN();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.FROM();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.CONTAINS();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.MIDDLEINT();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.CURRENT_TIMESTAMP();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.EXPLAIN();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.PUBLIC();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.LIMIT(0);
        com.ivanceras.keyword.sql.SQL sQL4 = sQL3.NCHAR();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL4.DEREF();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.INTERSECTION();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.VOLATILE();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.AVG();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.CLUSTER();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.REGR_SXX();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.LAST();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.P();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.SETOF();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.FROM();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.MINUS();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.LINES();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.DLURLCOMPLETEONLY();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.CATALOG_NAME();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.RESET();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.FORM();
        com.ivanceras.keyword.sql.SQL sQL2 = com.ivanceras.keyword.sql.KeywordsStatics.SIZE();
        com.ivanceras.keyword.sql.SQL sQL3 = com.ivanceras.keyword.sql.KeywordsStatics.DAY_HOUR();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL3.TREAT();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL4.FOR();
        com.ivanceras.keyword.sql.SQL sQL6 = sQL4.COMMENTS();
        com.ivanceras.keyword.sql.SQL sQL7 = sQL2.AND(sQL4);
        com.ivanceras.keyword.sql.SQL sQL8 = sQL0.FUNCTION("", sQL4);
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
        org.junit.Assert.assertNotNull(sQL6);
        org.junit.Assert.assertNotNull(sQL7);
        org.junit.Assert.assertNotNull(sQL8);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DAY_HOUR();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.TREAT();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.FOR();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.CEILING();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.BOM();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DEREF();
        com.ivanceras.keyword.sql.SQL sQL1 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL1.SERIALIZABLE();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL1.DIAGNOSTICS();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL1.SQLCODE();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        com.ivanceras.keyword.sql.SQL sQL9 = sQL1.FROM(strArray8);
        com.ivanceras.keyword.sql.SQL sQL10 = com.ivanceras.keyword.sql.SQLStatics.SELECT(strArray8);
        com.ivanceras.keyword.sql.SQL sQL11 = sQL0.IN((java.lang.Object[]) strArray8);
        com.ivanceras.keyword.sql.SQL sQL12 = sQL11.ON();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(sQL9);
        org.junit.Assert.assertNotNull(sQL10);
        org.junit.Assert.assertNotNull(sQL11);
        org.junit.Assert.assertNotNull(sQL12);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DEGREE();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.MINUS();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.DECIMAL();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.PLUS();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.LOOP();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.OPEN();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.TABLES();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.NFKC();
        com.ivanceras.keyword.sql.SQL sQL4 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL4.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL6 = com.ivanceras.keyword.sql.SQLStatics.ASIN(sQL5);
        com.ivanceras.keyword.sql.SQL sQL7 = sQL3.ACOS(sQL5);
        com.ivanceras.keyword.sql.SQL sQL8 = sQL5.SQL_BIG_RESULT();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
        org.junit.Assert.assertNotNull(sQL6);
        org.junit.Assert.assertNotNull(sQL7);
        org.junit.Assert.assertNotNull(sQL8);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.OPEN();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.TABLES();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.NEW();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL3.CHARACTERISTICS();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL4.YEAR();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.ACTION();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.EXCLUDE();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.CASCADED();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.EXP();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.CURRENT_DATE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.BREADTH();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.IF_NOT_EXISTS();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.OPEN();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.ROUTINE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.CONSTRAINT_NAME();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.MODULE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.REPEATABLE();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DAY_HOUR();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.TREAT();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.DATA();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.STARTING();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.ASSERTION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.READ_WRITE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.COLLATION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.OWNED();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.OPTIMIZE();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.LEADING();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.NOCOMPRESS();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.PATH();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.ON("hi!");
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.DELETE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.COVAR_SAMP();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.LIMIT(0);
        com.ivanceras.keyword.sql.SQL sQL4 = sQL3.UNCOMMITTED();
        com.ivanceras.keyword.sql.SQL sQL5 = com.ivanceras.keyword.sql.KeywordsStatics.CURRENT_ROW();
        com.ivanceras.keyword.sql.SQL sQL6 = sQL3.EXISTS(sQL5);
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
        org.junit.Assert.assertNotNull(sQL6);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.XMLBINARY();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.XMLSCHEMA();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.OPEN();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.TABLES();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.NEW();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL3.OVER();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.PURGE();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.BEGIN();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.RANGE();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.UESCAPE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.FORM();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.REQUIRE();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.CONNECTION();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.CEIL();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.WHITESPACE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.REASSIGN();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.EXPLAIN();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.FLAG();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.ENCODING();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.POSITION_REGEX();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.EXCLUDE();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.TIES();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DAY_MINUTE();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DEPTH();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.SETOF();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.COUNT();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.COLAUTH();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.COPY();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.REASSIGN();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.XMLPI();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.FULL();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.SERIALIZABLE();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.GROUPS();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL3.FULL_OUTER_JOIN("hi!");
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL5);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.REGR_AVGY();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.DLURLCOMPLETEWRITE();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.CURRENT_TIME();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.INSTANTIABLE();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL3.ROUTINE_CATALOG();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.LIMIT(0);
        com.ivanceras.keyword.sql.SQL sQL4 = sQL0.RULE();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL0.LONGBLOB();
        java.lang.Class<?> wildcardClass6 = sQL0.getClass();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.OPEN();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.REFERENCING();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.ID();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.VIEW();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.USE();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.OUT();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.SQLSTATE();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.SESSION();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.FORTRAN();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.INSTEAD();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.NULLS();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.GREATER_THAN();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.CONTENT();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.LEFT();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.BACKWARD();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.REASSIGN();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.EXPLAIN();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.FROM();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL1.SQL_BIG_RESULT();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL3.NO_WRITE_TO_BINLOG();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL3.TRIM_ARRAY();
        com.ivanceras.keyword.sql.SQL sQL6 = sQL3.RESTRICT();
        com.ivanceras.keyword.sql.SQL sQL7 = com.ivanceras.keyword.sql.SQLStatics.ASIN(sQL6);
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
        org.junit.Assert.assertNotNull(sQL6);
        org.junit.Assert.assertNotNull(sQL7);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.OPEN();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.NOT_EQUAL_TO_FIELD("");
        com.ivanceras.keyword.sql.SQL sQL4 = com.ivanceras.keyword.sql.KeywordsStatics.DICTIONARY();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL4.ELSEIF();
        com.ivanceras.keyword.sql.SQL sQL6 = sQL3.SIN(sQL4);
        com.ivanceras.keyword.sql.SQL sQL7 = sQL3.ROLLUP();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
        org.junit.Assert.assertNotNull(sQL6);
        org.junit.Assert.assertNotNull(sQL7);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.CURRENT_PATH();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.EXCLUDE();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.SETOF();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.SESSION();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.EXCLUDE();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.CASCADED();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.TIMEZONE_MINUTE();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.CHARACTER_SET_CATALOG();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.TRUSTED();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DAY_HOUR();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.TREAT();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.SQL();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DESC();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.NATIONAL();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.PLACING();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.PROGRAM();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.openParen();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL0.IF_EXISTS();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.ABS();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.UNLOGGED();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.KEY_MEMBER();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.SCOPE_CATALOG();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ALSO();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.WITHIN();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.VARYING();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.NULLS();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.GREATER_THAN();
        com.ivanceras.keyword.sql.SQL sQL2 = com.ivanceras.keyword.sql.SQLStatics.LOWER(sQL1);
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.P();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL2.STORAGE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.INHERIT();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.DELIMITERS();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.WRAPPER();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.RECORD();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.ROUTINE_NAME();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.SCOPE_SCHEMA();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.LC_CTYPE();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.OFF();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.UNION();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL3.NOT_NULL();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL4.TABLE_NAME();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.IS_NULL();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DEGREE();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ITERATE();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.WHEN();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.BY();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.OPTIONALLY();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.NULLS();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.GREATER_THAN();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.FIRST_VALUE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_FRAME();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.PURGE();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.BEGIN();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.FUNCTION();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL1.RECURSIVE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.CYCLE();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.KILL();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.GREATER_THAN_OR_EQUAL();
        com.ivanceras.keyword.sql.SQL sQL3 = com.ivanceras.keyword.sql.KeywordsStatics.DLURLSERVER();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL1.EXCEPT(sQL3);
        com.ivanceras.keyword.sql.SQL sQL5 = sQL3.KEYS();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.MEDIUMBLOB();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.SERIALIZABLE();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.DIAGNOSTICS();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL0.SQLCODE();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL0.FINAL();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.PROGRAM();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.NORMALIZED();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL3.INSTANCE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DAY_HOUR();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.CONNECT();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.RENAME();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.SQLERROR();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.ACCESS();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.UNDER();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.NOT_NULL();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.LINEAR();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        com.ivanceras.keyword.sql.generator.FunctionGenerator functionGenerator0 = new com.ivanceras.keyword.sql.generator.FunctionGenerator();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.SCOPE_SCHEMA();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.RLIKE();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL0.REFERENCES("", "");
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL4);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.KILL();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.GREATER_THAN_OR_EQUAL();
        com.ivanceras.keyword.sql.SQL sQL3 = com.ivanceras.keyword.sql.KeywordsStatics.DLURLSERVER();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL1.EXCEPT(sQL3);
        com.ivanceras.keyword.sql.SQL sQL5 = sQL3.SMALLINT();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.KILL();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.GREATER_THAN_OR_EQUAL();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL1.VACUUM();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.SHOW();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.CONTAINS();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.SQLCODE();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.SERIALIZABLE();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.GROUPS();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL3.LEAKPROOF();
        com.ivanceras.keyword.sql.SQL sQL5 = com.ivanceras.keyword.sql.KeywordsStatics.REGR_AVGY();
        com.ivanceras.keyword.sql.SQL sQL6 = sQL5.DLURLCOMPLETEWRITE();
        com.ivanceras.keyword.sql.SQL sQL7 = sQL4.AND(sQL6);
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
        org.junit.Assert.assertNotNull(sQL6);
        org.junit.Assert.assertNotNull(sQL7);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DESC();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.NATIONAL();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.MASTER_SSL_VERIFY_SERVER_CERT();
        com.ivanceras.keyword.sql.SQL sQL3 = com.ivanceras.keyword.sql.KeywordsStatics.EXCLUDE();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL3.CASCADED();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL4.TEMP();
        com.ivanceras.keyword.sql.SQL sQL6 = sQL4.NFC();
        com.ivanceras.keyword.sql.SQL sQL7 = sQL4.UNLINK();
        com.ivanceras.keyword.sql.SQL sQL8 = sQL2.UPPER(sQL4);
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
        org.junit.Assert.assertNotNull(sQL6);
        org.junit.Assert.assertNotNull(sQL7);
        org.junit.Assert.assertNotNull(sQL8);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.CACHE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.OLD();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.BETWEEN();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.CONTROL();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.SCOPE_SCHEMA();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL2.STATE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.NULLS();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.TIMESTAMP();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL1.OVERLAPS();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.LOCATION();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.DLURLSERVER();
        com.ivanceras.keyword.sql.SQL sQL1 = com.ivanceras.keyword.sql.SQLStatics.ACOS(sQL0);
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.LEADING();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.INCREMENT();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.RIGHT_OUTER_JOIN("hi!");
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL2);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.ATTRIBUTE();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.SECOND();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.UNENCRYPTED();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.OPEN();
        com.ivanceras.keyword.sql.SQL sQL2 = sQL0.TABLES();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.SECOND_MICROSECOND();
        com.ivanceras.keyword.sql.SQL sQL4 = sQL0.ARRAY_AGG();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL2);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.END_PARTITION();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.ROUTINE_NAME();
        com.ivanceras.keyword.sql.SQL sQL3 = sQL0.LIMIT(0);
        com.ivanceras.keyword.sql.SQL sQL4 = com.ivanceras.keyword.sql.KeywordsStatics.DICTIONARY();
        com.ivanceras.keyword.sql.SQL sQL5 = sQL3.GREATER_THAN(sQL4);
        com.ivanceras.keyword.sql.SQL sQL6 = sQL5.BREADTH();
        com.ivanceras.keyword.sql.SQL sQL7 = sQL5.UNENCRYPTED();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
        org.junit.Assert.assertNotNull(sQL3);
        org.junit.Assert.assertNotNull(sQL4);
        org.junit.Assert.assertNotNull(sQL5);
        org.junit.Assert.assertNotNull(sQL6);
        org.junit.Assert.assertNotNull(sQL7);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.BOOLEAN();
        org.junit.Assert.assertNotNull(sQL0);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        com.ivanceras.keyword.sql.SQL sQL0 = com.ivanceras.keyword.sql.KeywordsStatics.FINAL();
        com.ivanceras.keyword.sql.SQL sQL1 = sQL0.TYPE();
        org.junit.Assert.assertNotNull(sQL0);
        org.junit.Assert.assertNotNull(sQL1);
    }
}

