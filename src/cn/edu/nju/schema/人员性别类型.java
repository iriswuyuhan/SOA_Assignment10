
package cn.edu.nju.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>��Ա�Ա����͵� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="��Ա�Ա�����"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="��"/&gt;
 *     &lt;enumeration value="Ů"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "\u4eba\u5458\u6027\u522b\u7c7b\u578b")
@XmlEnum
public enum ��Ա�Ա����� {

    ��,
    Ů;

    public String value() {
        return name();
    }

    public static ��Ա�Ա����� fromValue(String v) {
        return valueOf(v);
    }

}
