
package cn.edu.nju.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>������Ϣ���� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="������Ϣ����"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="���ű��" type="{http://www.nju.edu.cn/schema}���ű������"/&gt;
 *         &lt;element name="��������" type="{http://www.nju.edu.cn/schema}������������"/&gt;
 *         &lt;element name="���ŵ绰" type="{http://www.nju.edu.cn/schema}�칫�ҵ绰����"/&gt;
 *         &lt;element name="У��" type="{http://www.nju.edu.cn/schema}У������"/&gt;
 *         &lt;element name="���ŵ�ַ" type="{http://www.nju.edu.cn/schema}��ַ����"/&gt;
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
public class ������Ϣ���� {

    @XmlElement(required = true)
    protected String ���ű��;
    @XmlElement(required = true)
    protected String ��������;
    @XmlElement(required = true)
    protected String ���ŵ绰;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected У������ У��;
    @XmlElement(required = true)
    protected String ���ŵ�ַ;

    /**
     * ��ȡ���ű�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get���ű��() {
        return ���ű��;
    }

    /**
     * ���ò��ű�����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set���ű��(String value) {
        this.���ű�� = value;
    }

    /**
     * ��ȡ�����������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get��������() {
        return ��������;
    }

    /**
     * ���ò����������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set��������(String value) {
        this.�������� = value;
    }

    /**
     * ��ȡ���ŵ绰���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get���ŵ绰() {
        return ���ŵ绰;
    }

    /**
     * ���ò��ŵ绰���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set���ŵ绰(String value) {
        this.���ŵ绰 = value;
    }

    /**
     * ��ȡУ�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link У������ }
     *     
     */
    public У������ getУ��() {
        return У��;
    }

    /**
     * ����У�����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link У������ }
     *     
     */
    public void setУ��(У������ value) {
        this.У�� = value;
    }

    /**
     * ��ȡ���ŵ�ַ���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get���ŵ�ַ() {
        return ���ŵ�ַ;
    }

    /**
     * ���ò��ŵ�ַ���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set���ŵ�ַ(String value) {
        this.���ŵ�ַ = value;
    }

}
