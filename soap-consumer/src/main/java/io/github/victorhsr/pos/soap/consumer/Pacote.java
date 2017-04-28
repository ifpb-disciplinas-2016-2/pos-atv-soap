
package io.github.victorhsr.pos.soap.consumer;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "pacote", targetNamespace = "http://resources.agency.pos.victorhsr.github.io/", wsdlLocation = "http://localhost:8080/pacote/PackageResources?WSDL")
public class Pacote
    extends Service
{

    private final static URL PACOTE_WSDL_LOCATION;
    private final static WebServiceException PACOTE_EXCEPTION;
    private final static QName PACOTE_QNAME = new QName("http://resources.agency.pos.victorhsr.github.io/", "pacote");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/pacote/PackageResources?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PACOTE_WSDL_LOCATION = url;
        PACOTE_EXCEPTION = e;
    }

    public Pacote() {
        super(__getWsdlLocation(), PACOTE_QNAME);
    }

    public Pacote(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns PackageResources
     */
    @WebEndpoint(name = "PackageResourcesPort")
    public PackageResources getPackageResourcesPort() {
        return super.getPort(new QName("http://resources.agency.pos.victorhsr.github.io/", "PackageResourcesPort"), PackageResources.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PackageResources
     */
    @WebEndpoint(name = "PackageResourcesPort")
    public PackageResources getPackageResourcesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://resources.agency.pos.victorhsr.github.io/", "PackageResourcesPort"), PackageResources.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PACOTE_EXCEPTION!= null) {
            throw PACOTE_EXCEPTION;
        }
        return PACOTE_WSDL_LOCATION;
    }

}
