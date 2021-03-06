package cn.edu.nju.soa.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.3
 * 2018-03-26T19:43:56+08:00
 * Generated source version: 3.2.3
 *
 */
@WebServiceClient(name = "studentAuthService",
                  wsdlLocation = "file:./wsdl/Auth.wsdl",
                  targetNamespace = "http://jw.nju.edu.cn/wsdl")
public class StudentAuthService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://jw.nju.edu.cn/wsdl", "studentAuthService");
    public final static QName StudentAuthEndPoin = new QName("http://jw.nju.edu.cn/wsdl", "studentAuthEndPoin");
    static {
        URL url = null;
        try {
            url = new URL("file:./wsdl/Auth.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(StudentAuthService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:./wsdl/Auth.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public StudentAuthService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public StudentAuthService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StudentAuthService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public StudentAuthService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public StudentAuthService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public StudentAuthService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns StudentAuthInterface
     */
    @WebEndpoint(name = "studentAuthEndPoin")
    public StudentAuthInterface getStudentAuthEndPoin() {
        return super.getPort(StudentAuthEndPoin, StudentAuthInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StudentAuthInterface
     */
    @WebEndpoint(name = "studentAuthEndPoin")
    public StudentAuthInterface getStudentAuthEndPoin(WebServiceFeature... features) {
        return super.getPort(StudentAuthEndPoin, StudentAuthInterface.class, features);
    }

}
