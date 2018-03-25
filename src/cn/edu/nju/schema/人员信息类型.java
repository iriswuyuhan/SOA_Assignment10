
package cn.edu.nju.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>��Ա��Ϣ���� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="��Ա��Ϣ����"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="����" type="{http://www.nju.edu.cn/schema}��Ա��������"/&gt;
 *         &lt;element name="��Աְ��" type="{http://www.nju.edu.cn/schema}��Աְ������"/&gt;
 *         &lt;element name="��Ա����" type="{http://www.nju.edu.cn/schema}��Ա��������"/&gt;
 *         &lt;element name="��������" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="�Ա�" type="{http://www.nju.edu.cn/schema}��Ա�Ա�����"/&gt;
 *         &lt;element name="���֤��" type="{http://www.nju.edu.cn/schema}���֤������"/&gt;
 *         &lt;element name="�ֻ�������" type="{http://www.nju.edu.cn/schema}�ֻ�������"/&gt;
 *         &lt;element name="��Уʱ��" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="��������" type="{http://www.nju.edu.cn/schema}������������"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u4eba\u5458\u4fe1\u606f\u7c7b\u578b", propOrder = {
    "\u59d3\u540d",
    "\u4eba\u5458\u804c\u52a1",
    "\u4eba\u5458\u5e74\u9f84",
    "\u51fa\u751f\u65e5\u671f",
    "\u6027\u522b",
    "\u8eab\u4efd\u8bc1\u53f7",
    "\u624b\u673a\u53f7\u7c7b\u578b",
    "\u5165\u6821\u65f6\u95f4",
    "\u90e8\u95e8\u540d\u79f0"
})
public class ��Ա��Ϣ���� {

    @XmlElement(required = true)
    protected String ����;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ��Աְ������ ��Աְ��;
    @XmlSchemaType(name = "integer")
    protected int ��Ա����;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ��������;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ��Ա�Ա����� �Ա�;
    @XmlElement(required = true)
    protected String ���֤��;
    @XmlElement(required = true)
    protected String �ֻ�������;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ��Уʱ��;
    @XmlElement(required = true)
    protected String ��������;

    /**
     * ��ȡ�������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get����() {
        return ����;
    }

    /**
     * �����������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set����(String value) {
        this.���� = value;
    }

    /**
     * ��ȡ��Աְ�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ��Աְ������ }
     *     
     */
    public ��Աְ������ get��Աְ��() {
        return ��Աְ��;
    }

    /**
     * ������Աְ�����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ��Աְ������ }
     *     
     */
    public void set��Աְ��(��Աְ������ value) {
        this.��Աְ�� = value;
    }

    /**
     * ��ȡ��Ա�������Ե�ֵ��
     * 
     */
    public int get��Ա����() {
        return ��Ա����;
    }

    /**
     * ������Ա�������Ե�ֵ��
     * 
     */
    public void set��Ա����(int value) {
        this.��Ա���� = value;
    }

    /**
     * ��ȡ�����������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar get��������() {
        return ��������;
    }

    /**
     * ���ó����������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void set��������(XMLGregorianCalendar value) {
        this.�������� = value;
    }

    /**
     * ��ȡ�Ա����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ��Ա�Ա����� }
     *     
     */
    public ��Ա�Ա����� get�Ա�() {
        return �Ա�;
    }

    /**
     * �����Ա����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ��Ա�Ա����� }
     *     
     */
    public void set�Ա�(��Ա�Ա����� value) {
        this.�Ա� = value;
    }

    /**
     * ��ȡ���֤�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get���֤��() {
        return ���֤��;
    }

    /**
     * �������֤�����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set���֤��(String value) {
        this.���֤�� = value;
    }

    /**
     * ��ȡ�ֻ����������Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get�ֻ�������() {
        return �ֻ�������;
    }

    /**
     * �����ֻ����������Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set�ֻ�������(String value) {
        this.�ֻ������� = value;
    }

    /**
     * ��ȡ��Уʱ�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar get��Уʱ��() {
        return ��Уʱ��;
    }

    /**
     * ������Уʱ�����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void set��Уʱ��(XMLGregorianCalendar value) {
        this.��Уʱ�� = value;
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

}
