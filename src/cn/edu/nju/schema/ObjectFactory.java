
package cn.edu.nju.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.edu.nju.model package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of model derived interfaces
 * and classes representing the binding of model
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _部门信息_QNAME = new QName("http://www.nju.edu.cn/model", "\u90e8\u95e8\u4fe1\u606f");
    private final static QName _人员信息_QNAME = new QName("http://www.nju.edu.cn/model", "\u4eba\u5458\u4fe1\u606f");

    /**
     * Create a new ObjectFactory that can be used to create new instances of model derived classes for package: cn.edu.nju.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link 部门信息类型 }
     * 
     */
    public 部门信息类型 create部门信息类型() {
        return new 部门信息类型();
    }

    /**
     * Create an instance of {@link 人员信息类型 }
     * 
     */
    public 人员信息类型 create人员信息类型() {
        return new 人员信息类型();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 部门信息类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nju.edu.cn/model", name = "\u90e8\u95e8\u4fe1\u606f")
    public JAXBElement<部门信息类型> create部门信息(部门信息类型 value) {
        return new JAXBElement<部门信息类型>(_部门信息_QNAME, 部门信息类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 人员信息类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nju.edu.cn/model", name = "\u4eba\u5458\u4fe1\u606f")
    public JAXBElement<人员信息类型> create人员信息(人员信息类型 value) {
        return new JAXBElement<人员信息类型>(_人员信息_QNAME, 人员信息类型.class, null, value);
    }

}
