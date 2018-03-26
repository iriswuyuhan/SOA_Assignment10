package cn.edu.nju.soa.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;

/**
 * This class was generated by Apache CXF 3.2.3
 * 2018-03-26T19:43:55.961+08:00
 * Generated source version: 3.2.3
 *
 */
@WebService(targetNamespace = "http://jw.nju.edu.cn/wsdl", name = "studentAuthInterface")
@XmlSeeAlso({cn.edu.nju.schema.ObjectFactory.class, cn.edu.nju.jw.schema.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface StudentAuthInterface {

    @WebMethod(action = "verify")
    @Action(input = "verify/verifyRequest", output = "verify/verifyResponse", fault = {})
    @WebResult(name = "验证信息", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "parameters")
    public cn.edu.nju.jw.schema.验证类型 verify(
            @WebParam(partName = "parameters", name = "认证请求", targetNamespace = "http://jw.nju.edu.cn/schema")
                    cn.edu.nju.jw.schema.账号认证类型 parameters
    ) throws IdNotFoundFault, PswErrorFault;
}