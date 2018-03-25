
package cn.edu.nju.jw.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>学生信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="学生信息类型"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="学生基本信息" type="{http://jw.nju.edu.cn/schema}学生基本信息类型"/&gt;
 *         &lt;element name="学生成绩" type="{http://jw.nju.edu.cn/schema}学生成绩类型"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5b66\u751f\u4fe1\u606f\u7c7b\u578b", propOrder = {
    "\u5b66\u751f\u57fa\u672c\u4fe1\u606f",
    "\u5b66\u751f\u6210\u7ee9"
})
public class 学生信息类型 {

    @XmlElement(required = true)
    protected 学生基本信息类型 学生基本信息;
    @XmlElement(required = true)
    protected 学生成绩类型 学生成绩;

    /**
     * 获取学生基本信息属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 学生基本信息类型 }
     *     
     */
    public 学生基本信息类型 get学生基本信息() {
        return 学生基本信息;
    }

    /**
     * 设置学生基本信息属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 学生基本信息类型 }
     *     
     */
    public void set学生基本信息(学生基本信息类型 value) {
        this.学生基本信息 = value;
    }

    /**
     * 获取学生成绩属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 学生成绩类型 }
     *     
     */
    public 学生成绩类型 get学生成绩() {
        return 学生成绩;
    }

    /**
     * 设置学生成绩属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 学生成绩类型 }
     *     
     */
    public void set学生成绩(学生成绩类型 value) {
        this.学生成绩 = value;
    }

}
