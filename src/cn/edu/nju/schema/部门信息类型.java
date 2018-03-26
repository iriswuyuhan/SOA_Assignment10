
package cn.edu.nju.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>部门信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="部门信息类型"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="部门编号" type="{http://www.nju.edu.cn/schema}部门编号类型"/&gt;
 *         &lt;element name="部门名称" type="{http://www.nju.edu.cn/schema}部门名称类型"/&gt;
 *         &lt;element name="部门电话" type="{http://www.nju.edu.cn/schema}办公室电话类型"/&gt;
 *         &lt;element name="校区" type="{http://www.nju.edu.cn/schema}校区类型"/&gt;
 *         &lt;element name="部门地址" type="{http://www.nju.edu.cn/schema}地址类型"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u90e8\u95e8\u4fe1\u606f\u7c7b\u578b", propOrder = {
    "\u90e8\u95e8\u7f16\u53f7",
    "\u90e8\u95e8\u540d\u79f0",
    "\u90e8\u95e8\u7535\u8bdd",
    "\u6821\u533a",
    "\u90e8\u95e8\u5730\u5740"
})
public class 部门信息类型 {

    @XmlElement(required = true)
    protected String 部门编号;
    @XmlElement(required = true)
    protected String 部门名称;
    @XmlElement(required = true)
    protected String 部门电话;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected 校区类型 校区;
    @XmlElement(required = true)
    protected String 部门地址;

    /**
     * 获取部门编号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get部门编号() {
        return 部门编号;
    }

    /**
     * 设置部门编号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set部门编号(String value) {
        this.部门编号 = value;
    }

    /**
     * 获取部门名称属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get部门名称() {
        return 部门名称;
    }

    /**
     * 设置部门名称属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set部门名称(String value) {
        this.部门名称 = value;
    }

    /**
     * 获取部门电话属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get部门电话() {
        return 部门电话;
    }

    /**
     * 设置部门电话属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set部门电话(String value) {
        this.部门电话 = value;
    }

    /**
     * 获取校区属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 校区类型 }
     *     
     */
    public 校区类型 get校区() {
        return 校区;
    }

    /**
     * 设置校区属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 校区类型 }
     *     
     */
    public void set校区(校区类型 value) {
        this.校区 = value;
    }

    /**
     * 获取部门地址属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get部门地址() {
        return 部门地址;
    }

    /**
     * 设置部门地址属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set部门地址(String value) {
        this.部门地址 = value;
    }

}
