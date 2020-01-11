
package com.jc.api.service.webservice;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "S_ERPService", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://192.168.190.152:8001/Service/ERPService?wsdl")
public class SERPService
    extends Service
{

    private final static URL SERPSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERPSERVICE_EXCEPTION;
    private final static QName SERPSERVICE_QNAME = new QName("http://tempuri.org/", "S_ERPService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.190.152:8001/Service/ERPService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERPSERVICE_WSDL_LOCATION = url;
        SERPSERVICE_EXCEPTION = e;
    }

    public SERPService() {
        super(__getWsdlLocation(), SERPSERVICE_QNAME);
    }

    public SERPService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERPSERVICE_QNAME, features);
    }

    public SERPService(URL wsdlLocation) {
        super(wsdlLocation, SERPSERVICE_QNAME);
    }

    public SERPService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERPSERVICE_QNAME, features);
    }

    public SERPService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SERPService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IERPService
     */
    @WebEndpoint(name = "BasicHttpBinding_I_ERPService")
    public IERPService getBasicHttpBindingIERPService() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_I_ERPService"), IERPService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IERPService
     */
    @WebEndpoint(name = "BasicHttpBinding_I_ERPService")
    public IERPService getBasicHttpBindingIERPService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_I_ERPService"), IERPService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERPSERVICE_EXCEPTION!= null) {
            throw SERPSERVICE_EXCEPTION;
        }
        return SERPSERVICE_WSDL_LOCATION;
    }

}
