
package cn.edu.nju.jw.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>�ɼ��������� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="�ɼ���������"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="�γ̳ɼ��б�" type="{http://jw.nju.edu.cn/schema}�γ̳ɼ��б�����"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ѧ��" type="{http://jw.nju.edu.cn/schema}ѧ������" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u6210\u7ee9\u8be6\u60c5\u7c7b\u578b", propOrder = {
    "\u8bfe\u7a0b\u6210\u7ee9\u5217\u8868"
})
public class �ɼ��������� {

    @XmlElement(required = true)
    protected �γ̳ɼ��б����� �γ̳ɼ��б�;
    @XmlAttribute
    protected ѧ������ ѧ��;

    /**
     * ��ȡ�γ̳ɼ��б����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link �γ̳ɼ��б����� }
     *     
     */
    public �γ̳ɼ��б����� get�γ̳ɼ��б�() {
        return �γ̳ɼ��б�;
    }

    /**
     * ���ÿγ̳ɼ��б����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link �γ̳ɼ��б����� }
     *     
     */
    public void set�γ̳ɼ��б�(�γ̳ɼ��б����� value) {
        this.�γ̳ɼ��б� = value;
    }

    /**
     * ��ȡѧ�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ѧ������ }
     *     
     */
    public ѧ������ getѧ��() {
        return ѧ��;
    }

    /**
     * ����ѧ�����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ѧ������ }
     *     
     */
    public void setѧ��(ѧ������ value) {
        this.ѧ�� = value;
    }

}
