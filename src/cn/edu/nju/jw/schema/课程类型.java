
package cn.edu.nju.jw.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>课程类型的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="课程类型"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="核心"/&gt;
 *     &lt;enumeration value="平台"/&gt;
 *     &lt;enumeration value="选修"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "\u8bfe\u7a0b\u7c7b\u578b")
@XmlEnum
public enum 课程类型 {

    核心,
    平台,
    选修;

    public String value() {
        return name();
    }

    public static 课程类型 fromValue(String v) {
        return valueOf(v);
    }

}
