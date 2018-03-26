
package cn.edu.nju.soa.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>账号认证类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="账号认证类型"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="账号" type="{http://www.nju.edu.cn/schema}账号类型"/&gt;
 *         &lt;element name="密码" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u8d26\u53f7\u8ba4\u8bc1\u7c7b\u578b", propOrder = {
    "\u8d26\u53f7",
    "\u5bc6\u7801"
})
public class 账号认证类型 {

    @XmlElement(required = true)
    protected String 账号;
    @XmlElement(required = true)
    protected String 密码;

    /**
     * 获取账号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get账号() {
        return 账号;
    }

    /**
     * 设置账号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set账号(String value) {
        this.账号 = value;
    }

    /**
     * 获取密码属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get密码() {
        return 密码;
    }

    /**
     * 设置密码属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set密码(String value) {
        this.密码 = value;
    }

}
