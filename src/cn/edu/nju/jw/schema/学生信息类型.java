
package cn.edu.nju.jw.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ѧ����Ϣ���� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ѧ����Ϣ����"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ѧ��������Ϣ" type="{http://jw.nju.edu.cn/schema}ѧ��������Ϣ����"/&gt;
 *         &lt;element name="ѧ���ɼ�" type="{http://jw.nju.edu.cn/schema}ѧ���ɼ�����"/&gt;
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
public class ѧ����Ϣ���� {

    @XmlElement(required = true)
    protected ѧ��������Ϣ���� ѧ��������Ϣ;
    @XmlElement(required = true)
    protected ѧ���ɼ����� ѧ���ɼ�;

    /**
     * ��ȡѧ��������Ϣ���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ѧ��������Ϣ���� }
     *     
     */
    public ѧ��������Ϣ���� getѧ��������Ϣ() {
        return ѧ��������Ϣ;
    }

    /**
     * ����ѧ��������Ϣ���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ѧ��������Ϣ���� }
     *     
     */
    public void setѧ��������Ϣ(ѧ��������Ϣ���� value) {
        this.ѧ��������Ϣ = value;
    }

    /**
     * ��ȡѧ���ɼ����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ѧ���ɼ����� }
     *     
     */
    public ѧ���ɼ����� getѧ���ɼ�() {
        return ѧ���ɼ�;
    }

    /**
     * ����ѧ���ɼ����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ѧ���ɼ����� }
     *     
     */
    public void setѧ���ɼ�(ѧ���ɼ����� value) {
        this.ѧ���ɼ� = value;
    }

}
