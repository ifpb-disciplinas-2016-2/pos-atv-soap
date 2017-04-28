
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
@WebServiceClient(name = "reserva_hotel", targetNamespace = "http://resources.agency.pos.victorhsr.github.io/", wsdlLocation = "http://localhost:8080/reserva_hotel/HotelBookingResource?WSDL")
public class ReservaHotel
    extends Service
{

    private final static URL RESERVAHOTEL_WSDL_LOCATION;
    private final static WebServiceException RESERVAHOTEL_EXCEPTION;
    private final static QName RESERVAHOTEL_QNAME = new QName("http://resources.agency.pos.victorhsr.github.io/", "reserva_hotel");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/reserva_hotel/HotelBookingResource?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RESERVAHOTEL_WSDL_LOCATION = url;
        RESERVAHOTEL_EXCEPTION = e;
    }

    public ReservaHotel() {
        super(__getWsdlLocation(), RESERVAHOTEL_QNAME);
    }

    public ReservaHotel(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns HotelBookingResource
     */
    @WebEndpoint(name = "HotelBookingResourcePort")
    public HotelBookingResource getHotelBookingResourcePort() {
        return super.getPort(new QName("http://resources.agency.pos.victorhsr.github.io/", "HotelBookingResourcePort"), HotelBookingResource.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HotelBookingResource
     */
    @WebEndpoint(name = "HotelBookingResourcePort")
    public HotelBookingResource getHotelBookingResourcePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://resources.agency.pos.victorhsr.github.io/", "HotelBookingResourcePort"), HotelBookingResource.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RESERVAHOTEL_EXCEPTION!= null) {
            throw RESERVAHOTEL_EXCEPTION;
        }
        return RESERVAHOTEL_WSDL_LOCATION;
    }

}