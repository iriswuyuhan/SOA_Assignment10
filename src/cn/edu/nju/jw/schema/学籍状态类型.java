
package cn.edu.nju.jw.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ѧ��״̬���͵� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ѧ��״̬����"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="��"/&gt;
 *     &lt;enumeration value="��"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "\u5b66\u7c4d\u72b6\u6001\u7c7b\u578b")
@XmlEnum
public enum ѧ��״̬���� {

    ��,
    ��;

    public String value() {
        return name();
    }

    public static ѧ��״̬���� fromValue(String v) {
        return valueOf(v);
    }

}
