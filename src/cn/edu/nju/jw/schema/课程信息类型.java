
package cn.edu.nju.jw.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>�γ���Ϣ���� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="�γ���Ϣ����"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="�γ̱��" type="{http://jw.nju.edu.cn/schema}�γ̱������"/&gt;
 *         &lt;element name="�γ�����" type="{http://jw.nju.edu.cn/schema}�γ���������"/&gt;
 *         &lt;element name="�ڿν�ʦ" type="{http://www.nju.edu.cn/schema}��Ա��������"/&gt;
 *         &lt;element name="�Ͽ�ʱ����ص��" type="{http://jw.nju.edu.cn/schema}�Ͽ�ʱ����ص������"/&gt;
 *         &lt;element name="ѡ������" type="{http://jw.nju.edu.cn/schema}�γ�����"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u8bfe\u7a0b\u4fe1\u606f\u7c7b\u578b", propOrder = {
    "\u8bfe\u7a0b\u7f16\u53f7",
    "\u8bfe\u7a0b\u540d\u79f0",
    "\u6388\u8bfe\u6559\u5e08",
    "\u4e0a\u8bfe\u65f6\u95f4\u4e0e\u5730\u70b9\u8868",
    "\u9009\u8bfe\u7c7b\u578b"
})
public class �γ���Ϣ���� {

    @XmlElement(required = true)
    protected String �γ̱��;
    @XmlElement(required = true)
    protected String �γ�����;
    @XmlElement(required = true)
    protected String �ڿν�ʦ;
    @XmlElement(required = true)
    protected �Ͽ�ʱ����ص������ �Ͽ�ʱ����ص��;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected �γ����� ѡ������;

    /**
     * ��ȡ�γ̱�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get�γ̱��() {
        return �γ̱��;
    }

    /**
     * ���ÿγ̱�����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set�γ̱��(String value) {
        this.�γ̱�� = value;
    }

    /**
     * ��ȡ�γ��������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get�γ�����() {
        return �γ�����;
    }

    /**
     * ���ÿγ��������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set�γ�����(String value) {
        this.�γ����� = value;
    }

    /**
     * ��ȡ�ڿν�ʦ���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get�ڿν�ʦ() {
        return �ڿν�ʦ;
    }

    /**
     * �����ڿν�ʦ���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set�ڿν�ʦ(String value) {
        this.�ڿν�ʦ = value;
    }

    /**
     * ��ȡ�Ͽ�ʱ����ص�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link �Ͽ�ʱ����ص������ }
     *     
     */
    public �Ͽ�ʱ����ص������ get�Ͽ�ʱ����ص��() {
        return �Ͽ�ʱ����ص��;
    }

    /**
     * �����Ͽ�ʱ����ص�����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link �Ͽ�ʱ����ص������ }
     *     
     */
    public void set�Ͽ�ʱ����ص��(�Ͽ�ʱ����ص������ value) {
        this.�Ͽ�ʱ����ص�� = value;
    }

    /**
     * ��ȡѡ���������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link �γ����� }
     *     
     */
    public �γ����� getѡ������() {
        return ѡ������;
    }

    /**
     * ����ѡ���������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link �γ����� }
     *     
     */
    public void setѡ������(�γ����� value) {
        this.ѡ������ = value;
    }

}
