
package cn.edu.nju.soa.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>��֤���� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="��֤����"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ѧ��" type="{http://www.nju.edu.cn/schema}�˺�����"/&gt;
 *         &lt;element name="Ȩ��" type="{http://jw.nju.edu.cn/schema}Ȩ�޼���"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u9a8c\u8bc1\u7c7b\u578b", propOrder = {
    "\u5b66\u53f7",
    "\u6743\u9650"
})
public class ��֤���� {

    @XmlElement(required = true)
    protected String ѧ��;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Ȩ�޼��� Ȩ��;

    /**
     * ��ȡѧ�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getѧ��() {
        return ѧ��;
    }

    /**
     * ����ѧ�����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setѧ��(String value) {
        this.ѧ�� = value;
    }

    /**
     * ��ȡȨ�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Ȩ�޼��� }
     *     
     */
    public Ȩ�޼��� getȨ��() {
        return Ȩ��;
    }

    /**
     * ����Ȩ�����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Ȩ�޼��� }
     *     
     */
    public void setȨ��(Ȩ�޼��� value) {
        this.Ȩ�� = value;
    }

}
