
package cn.edu.nju.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>У�����͵� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="У������"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="��¥"/&gt;
 *     &lt;enumeration value="����"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "\u6821\u533a\u7c7b\u578b")
@XmlEnum
public enum У������ {

    ��¥,
    ����;

    public String value() {
        return name();
    }

    public static У������ fromValue(String v) {
        return valueOf(v);
    }

}
