
package cn.edu.nju.jw.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ѧ�����͵� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ѧ������"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="��һ��һѧ��"/&gt;
 *     &lt;enumeration value="��һ�ڶ�ѧ��"/&gt;
 *     &lt;enumeration value="�����һѧ��"/&gt;
 *     &lt;enumeration value="����ڶ�ѧ��"/&gt;
 *     &lt;enumeration value="������һѧ��"/&gt;
 *     &lt;enumeration value="�����ڶ�ѧ��"/&gt;
 *     &lt;enumeration value="���ĵ�һѧ��"/&gt;
 *     &lt;enumeration value="���ĵڶ�ѧ��"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "\u5b66\u671f\u7c7b\u578b")
@XmlEnum
public enum ѧ������ {

    ��һ��һѧ��,
    ��һ�ڶ�ѧ��,
    �����һѧ��,
    ����ڶ�ѧ��,
    ������һѧ��,
    �����ڶ�ѧ��,
    ���ĵ�һѧ��,
    ���ĵڶ�ѧ��;

    public String value() {
        return name();
    }

    public static ѧ������ fromValue(String v) {
        return valueOf(v);
    }

}
