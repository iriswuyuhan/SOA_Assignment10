
package cn.edu.nju.jw.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>�ɼ��������͵� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="�ɼ���������"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ƽʱ�ɼ�"/&gt;
 *     &lt;enumeration value="��ҵ�ɼ�"/&gt;
 *     &lt;enumeration value="���гɼ�"/&gt;
 *     &lt;enumeration value="��ĩ�ɼ�"/&gt;
 *     &lt;enumeration value="�����ɼ�"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "\u6210\u7ee9\u6027\u8d28\u7c7b\u578b")
@XmlEnum
public enum �ɼ��������� {

    ƽʱ�ɼ�,
    ��ҵ�ɼ�,
    ���гɼ�,
    ��ĩ�ɼ�,
    �����ɼ�;

    public String value() {
        return name();
    }

    public static �ɼ��������� fromValue(String v) {
        return valueOf(v);
    }

}
