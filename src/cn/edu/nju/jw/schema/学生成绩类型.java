
package cn.edu.nju.jw.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ѧ���ɼ����� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ѧ���ɼ�����"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="8" minOccurs="0"&gt;
 *         &lt;element name="�ɼ�����" type="{http://jw.nju.edu.cn/schema}�ɼ���������"/&gt;
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
public class ѧ���ɼ����� {

    protected List<�ɼ���������> �ɼ�����;

    /**
     * Gets the value of the �ɼ����� property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the �ɼ����� property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get�ɼ�����().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link �ɼ��������� }
     * 
     * 
     */
    public List<�ɼ���������> get�ɼ�����() {
        if (�ɼ����� == null) {
            �ɼ����� = new ArrayList<�ɼ���������>();
        }
        return this.�ɼ�����;
    }

}
