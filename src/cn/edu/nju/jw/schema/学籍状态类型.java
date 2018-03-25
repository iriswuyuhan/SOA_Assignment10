
package cn.edu.nju.jw.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>学籍状态类型的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="学籍状态类型"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="有"/&gt;
 *     &lt;enumeration value="无"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "\u5b66\u7c4d\u72b6\u6001\u7c7b\u578b")
@XmlEnum
public enum 学籍状态类型 {

    有,
    无;

    public String value() {
        return name();
    }

    public static 学籍状态类型 fromValue(String v) {
        return valueOf(v);
    }

}
