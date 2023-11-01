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
        org.seasar.mayaa.impl.engine.specification.serialize.NodeSerializeController nodeSerializeController0 = new org.seasar.mayaa.impl.engine.specification.serialize.NodeSerializeController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.seasar.mayaa.engine.specification.NodeTreeWalker nodeTreeWalker2 = nodeSerializeController0.getNode("welcomeFileName");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl0 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        org.seasar.mayaa.engine.processor.ProcessorTreeWalker processorTreeWalker1 = serviceCycleImpl0.getProcessor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        serviceCycleImpl0.error((int) (short) -1, "notTemplatePathPattern");
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.seasar.mayaa.impl.engine.specification.serialize.NodeSerializeController nodeSerializeController0 = new org.seasar.mayaa.impl.engine.specification.serialize.NodeSerializeController();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nodeSerializeController0.doNotify();
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.seasar.mayaa.impl.engine.specification.serialize.NodeSerializeController nodeSerializeController0 = new org.seasar.mayaa.impl.engine.specification.serialize.NodeSerializeController();
        org.seasar.mayaa.engine.specification.QName qName1 = org.seasar.mayaa.impl.CONST_IMPL.QM_NAME;
        org.seasar.mayaa.engine.specification.SpecificationNode specificationNode6 = org.seasar.mayaa.impl.engine.specification.SpecificationUtil.createSpecificationNode(qName1, "http://www.w3.org/TR/html4/strict.dtd\n", 406, false, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nodeSerializeController0.nodeLoaded(specificationNode6);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        org.seasar.mayaa.impl.engine.specification.NamespaceImpl namespaceImpl0 = new org.seasar.mayaa.impl.engine.specification.NamespaceImpl();
        org.seasar.mayaa.engine.specification.QName qName2 = org.seasar.mayaa.impl.engine.specification.QNameImpl.getInstance("hi!");
        org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl nodeAttributeImpl4 = new org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl(qName2, "datatypes.dtd");
        org.seasar.mayaa.engine.specification.URI uRI5 = qName2.getNamespaceURI();
        namespaceImpl0.setDefaultNamespaceURI(uRI5);
        org.seasar.mayaa.impl.engine.specification.NamespaceImpl namespaceImpl7 = new org.seasar.mayaa.impl.engine.specification.NamespaceImpl();
        org.seasar.mayaa.engine.specification.QName qName9 = org.seasar.mayaa.impl.engine.specification.QNameImpl.getInstance("hi!");
        org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl nodeAttributeImpl11 = new org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl(qName9, "datatypes.dtd");
        org.seasar.mayaa.engine.specification.URI uRI12 = qName9.getNamespaceURI();
        namespaceImpl7.setDefaultNamespaceURI(uRI12);
        namespaceImpl0.setParentSpace((org.seasar.mayaa.engine.specification.Namespace) namespaceImpl7);
        org.seasar.mayaa.impl.engine.specification.NamespaceImpl namespaceImpl15 = new org.seasar.mayaa.impl.engine.specification.NamespaceImpl();
        org.seasar.mayaa.engine.specification.QName qName17 = org.seasar.mayaa.impl.engine.specification.QNameImpl.getInstance("hi!");
        org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl nodeAttributeImpl19 = new org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl(qName17, "datatypes.dtd");
        org.seasar.mayaa.engine.specification.URI uRI20 = qName17.getNamespaceURI();
        namespaceImpl15.setDefaultNamespaceURI(uRI20);
        org.seasar.mayaa.engine.specification.PrefixMapping prefixMapping23 = namespaceImpl0.getMappingFromURI(uRI20, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on namespaceImpl7 and namespaceImpl15", namespaceImpl7.equals(namespaceImpl15) ? namespaceImpl7.hashCode() == namespaceImpl15.hashCode() : true);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        org.seasar.mayaa.engine.specification.QName qName0 = org.seasar.mayaa.impl.CONST_IMPL.QM_NAME;
        org.seasar.mayaa.engine.specification.SpecificationNode specificationNode5 = org.seasar.mayaa.impl.engine.specification.SpecificationUtil.createSpecificationNode(qName0, "http://www.w3.org/TR/html4/strict.dtd\n", 406, false, (int) (byte) 100);
        org.seasar.mayaa.engine.specification.QName qName7 = org.seasar.mayaa.impl.CONST_IMPL.QM_NAME;
        org.seasar.mayaa.engine.specification.SpecificationNode specificationNode12 = org.seasar.mayaa.impl.engine.specification.SpecificationUtil.createSpecificationNode(qName7, "http://www.w3.org/TR/html4/strict.dtd\n", 406, false, (int) (byte) 100);
        boolean boolean13 = org.seasar.mayaa.impl.engine.specification.xpath.XPathUtil.matches(specificationNode5, "_", (org.seasar.mayaa.engine.specification.Namespace) specificationNode12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on specificationNode5 and specificationNode12", specificationNode5.equals(specificationNode12) ? specificationNode5.hashCode() == specificationNode12.hashCode() : true);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl0 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        serviceCycleImpl0.redirect("LibraryDefinition: systemID = /xml.xsd, namespaceUrl = null, assignedURI = (), ");
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        org.seasar.mayaa.impl.engine.processor.AttributeProcessor attributeProcessor0 = new org.seasar.mayaa.impl.engine.processor.AttributeProcessor();
        attributeProcessor0.initialize();
        org.seasar.mayaa.engine.specification.QName qName2 = org.seasar.mayaa.impl.CONST_IMPL.QM_NAME;
        org.seasar.mayaa.engine.specification.SpecificationNode specificationNode7 = org.seasar.mayaa.impl.engine.specification.SpecificationUtil.createSpecificationNode(qName2, "http://www.w3.org/TR/html4/strict.dtd\n", 406, false, (int) (byte) 100);
        attributeProcessor0.setInjectedNode(specificationNode7);
        org.seasar.mayaa.engine.specification.QName qName10 = org.seasar.mayaa.impl.CONST_IMPL.QM_NAME;
        org.seasar.mayaa.engine.specification.SpecificationNode specificationNode15 = org.seasar.mayaa.impl.engine.specification.SpecificationUtil.createSpecificationNode(qName10, "http://www.w3.org/TR/html4/strict.dtd\n", 406, false, (int) (byte) 100);
        java.util.Iterator<?> wildcardItor17 = org.seasar.mayaa.impl.engine.specification.xpath.XPathUtil.selectChildNodes(specificationNode7, "http://xmlns.jcp.org/xml/ns/javaee/web-common_3_1.xsd", (org.seasar.mayaa.engine.specification.Namespace) specificationNode15, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on specificationNode7 and specificationNode15", specificationNode7.equals(specificationNode15) ? specificationNode7.hashCode() == specificationNode15.hashCode() : true);
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test9");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str0 = org.seasar.mayaa.impl.cycle.script.rhino.RhinoUtil.getRhinoVersion();
    }
}

