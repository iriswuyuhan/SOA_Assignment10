
package cn.edu.nju.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>��Աְ�����͵� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="��Աְ������"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ѧ��"/&gt;
 *     &lt;enumeration value="��ʦ"/&gt;
 *     &lt;enumeration value="ְ��"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "\u4eba\u5458\u804c\u52a1\u7c7b\u578b")
@XmlEnum
public enum ��Աְ������ {

    ѧ��,
    ��ʦ,
    ְ��;

    public String value() {
        return name();
    }

    public static ��Աְ������ fromValue(String v) {
        return valueOf(v);
    }

}
