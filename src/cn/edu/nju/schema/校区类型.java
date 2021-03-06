
package cn.edu.nju.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>校区类型的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="校区类型"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="鼓楼"/&gt;
 *     &lt;enumeration value="仙林"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "\u6821\u533a\u7c7b\u578b")
@XmlEnum
public enum 校区类型 {

    鼓楼,
    仙林;

    public String value() {
        return name();
    }

    public static 校区类型 fromValue(String v) {
        return valueOf(v);
    }

}
