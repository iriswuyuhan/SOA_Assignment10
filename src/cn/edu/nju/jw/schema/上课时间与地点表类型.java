
package cn.edu.nju.jw.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>�Ͽ�ʱ����ص������ complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="�Ͽ�ʱ����ص������"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="�Ͽ�ʱ����ص�" type="{http://jw.nju.edu.cn/schema}�Ͽ�ʱ����ص�����"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u4e0a\u8bfe\u65f6\u95f4\u4e0e\u5730\u70b9\u8868\u7c7b\u578b", propOrder = {
    "\u4e0a\u8bfe\u65f6\u95f4\u4e0e\u5730\u70b9"
})
public class �Ͽ�ʱ����ص������ {

    @XmlElement(required = true)
    protected List<String> �Ͽ�ʱ����ص�;

    /**
     * Gets the value of the �Ͽ�ʱ����ص� property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the �Ͽ�ʱ����ص� property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get�Ͽ�ʱ����ص�().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> get�Ͽ�ʱ����ص�() {
        if (�Ͽ�ʱ����ص� == null) {
            �Ͽ�ʱ����ص� = new ArrayList<String>();
        }
        return this.�Ͽ�ʱ����ص�;
    }

}
