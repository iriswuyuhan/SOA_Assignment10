
package cn.edu.nju.jw.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>学期类型的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="学期类型"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="大一第一学期"/&gt;
 *     &lt;enumeration value="大一第二学期"/&gt;
 *     &lt;enumeration value="大二第一学期"/&gt;
 *     &lt;enumeration value="大二第二学期"/&gt;
 *     &lt;enumeration value="大三第一学期"/&gt;
 *     &lt;enumeration value="大三第二学期"/&gt;
 *     &lt;enumeration value="大四第一学期"/&gt;
 *     &lt;enumeration value="大四第二学期"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "\u5b66\u671f\u7c7b\u578b")
@XmlEnum
public enum 学期类型 {

    大一第一学期,
    大一第二学期,
    大二第一学期,
    大二第二学期,
    大三第一学期,
    大三第二学期,
    大四第一学期,
    大四第二学期;

    public String value() {
        return name();
    }

    public static 学期类型 fromValue(String v) {
        return valueOf(v);
    }

}
