
package cn.edu.nju.jw.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import cn.edu.nju.schema.��Ա�Ա�����;


/**
 * <p>ѧ��������Ϣ���� complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ѧ��������Ϣ����"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ѧ��" type="{http://jw.nju.edu.cn/schema}ѧ������"/&gt;
 *         &lt;element name="����" type="{http://www.nju.edu.cn/schema}��Ա��������"/&gt;
 *         &lt;element name="�Ա�" type="{http://www.nju.edu.cn/schema}��Ա�Ա�����"/&gt;
 *         &lt;element name="��������" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="���֤��" type="{http://www.nju.edu.cn/schema}���֤������"/&gt;
 *         &lt;element name="רҵ" type="{http://www.nju.edu.cn/schema}������������"/&gt;
 *         &lt;element name="��ѧʱ��" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="��ϵ��ʽ" type="{http://www.nju.edu.cn/schema}�ֻ�������"/&gt;
 *         &lt;element name="ѧ��״̬" type="{http://jw.nju.edu.cn/schema}ѧ��״̬����"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5b66\u751f\u57fa\u672c\u4fe1\u606f\u7c7b\u578b", propOrder = {
    "\u5b66\u53f7",
    "\u59d3\u540d",
    "\u6027\u522b",
    "\u51fa\u751f\u65e5\u671f",
    "\u8eab\u4efd\u8bc1\u53f7",
    "\u4e13\u4e1a",
    "\u5165\u5b66\u65f6\u95f4",
    "\u8054\u7cfb\u65b9\u5f0f",
    "\u5b66\u7c4d\u72b6\u6001"
})
public class ѧ��������Ϣ���� {

    @XmlElement(required = true)
    protected String ѧ��;
    @XmlElement(required = true)
    protected String ����;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ��Ա�Ա����� �Ա�;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ��������;
    @XmlElement(required = true)
    protected String ���֤��;
    @XmlElement(required = true)
    protected String רҵ;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ��ѧʱ��;
    @XmlElement(required = true)
    protected String ��ϵ��ʽ;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ѧ��״̬���� ѧ��״̬;

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
     * ��ȡרҵ���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getרҵ() {
        return רҵ;
    }

    /**
     * ����רҵ���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setרҵ(String value) {
        this.רҵ = value;
    }

    /**
     * ��ȡ��ѧʱ�����Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar get��ѧʱ��() {
        return ��ѧʱ��;
    }

    /**
     * ������ѧʱ�����Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void set��ѧʱ��(XMLGregorianCalendar value) {
        this.��ѧʱ�� = value;
    }

    /**
     * ��ȡ��ϵ��ʽ���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get��ϵ��ʽ() {
        return ��ϵ��ʽ;
    }

    /**
     * ������ϵ��ʽ���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set��ϵ��ʽ(String value) {
        this.��ϵ��ʽ = value;
    }

    /**
     * ��ȡѧ��״̬���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ѧ��״̬���� }
     *     
     */
    public ѧ��״̬���� getѧ��״̬() {
        return ѧ��״̬;
    }

    /**
     * ����ѧ��״̬���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ѧ��״̬���� }
     *     
     */
    public void setѧ��״̬(ѧ��״̬���� value) {
        this.ѧ��״̬ = value;
    }

}
