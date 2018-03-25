
package cn.edu.nju.jw.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>学生成绩类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="学生成绩类型"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="8" minOccurs="0"&gt;
 *         &lt;element name="成绩详情" type="{http://jw.nju.edu.cn/schema}成绩详情类型"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5b66\u751f\u6210\u7ee9\u7c7b\u578b", propOrder = {
    "\u6210\u7ee9\u8be6\u60c5"
})
public class 学生成绩类型 {

    protected List<成绩详情类型> 成绩详情;

    /**
     * Gets the value of the 成绩详情 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the 成绩详情 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get成绩详情().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link 成绩详情类型 }
     * 
     * 
     */
    public List<成绩详情类型> get成绩详情() {
        if (成绩详情 == null) {
            成绩详情 = new ArrayList<成绩详情类型>();
        }
        return this.成绩详情;
    }

}
