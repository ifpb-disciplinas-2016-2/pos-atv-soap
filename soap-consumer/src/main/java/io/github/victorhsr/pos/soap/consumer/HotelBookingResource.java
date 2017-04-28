
package io.github.victorhsr.pos.soap.consumer;

import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebService(name = "HotelBookingResource", targetNamespace = "http://resources.agency.pos.victorhsr.github.io/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HotelBookingResource {


    /**
     * 
     * @param hotelBookingId
     * @return
     *     returns io.github.victorhsr.pos.soap.consumer.HotelBooking
     */
    @WebMethod
    @WebResult(name = "hotelBooking", targetNamespace = "")
    @RequestWrapper(localName = "getHotelBooking", targetNamespace = "http://resources.agency.pos.victorhsr.github.io/", className = "io.github.victorhsr.pos.soap.consumer.GetHotelBooking")
    @ResponseWrapper(localName = "getHotelBookingResponse", targetNamespace = "http://resources.agency.pos.victorhsr.github.io/", className = "io.github.victorhsr.pos.soap.consumer.GetHotelBookingResponse")
    public HotelBooking getHotelBooking(
        @WebParam(name = "hotelBookingId", targetNamespace = "")
        int hotelBookingId);

    /**
     * 
     * @param hotelBooking
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "updateHotelBooking", targetNamespace = "http://resources.agency.pos.victorhsr.github.io/", className = "io.github.victorhsr.pos.soap.consumer.UpdateHotelBooking")
    public void updateHotelBooking(
        @WebParam(name = "hotelBooking", targetNamespace = "")
        HotelBooking hotelBooking);

    /**
     * 
     * @return
     *     returns java.util.List<io.github.victorhsr.pos.soap.consumer.HotelBooking>
     */
    @WebMethod
    @WebResult(name = "hotelBookings", targetNamespace = "")
    @RequestWrapper(localName = "getHotelBookings", targetNamespace = "http://resources.agency.pos.victorhsr.github.io/", className = "io.github.victorhsr.pos.soap.consumer.GetHotelBookings")
    @ResponseWrapper(localName = "getHotelBookingsResponse", targetNamespace = "http://resources.agency.pos.victorhsr.github.io/", className = "io.github.victorhsr.pos.soap.consumer.GetHotelBookingsResponse")
    public List<HotelBooking> getHotelBookings();

    /**
     * 
     * @param hotelBooking
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "createHotelBooking", targetNamespace = "http://resources.agency.pos.victorhsr.github.io/", className = "io.github.victorhsr.pos.soap.consumer.CreateHotelBooking")
    public void createHotelBooking(
        @WebParam(name = "hotelBooking", targetNamespace = "")
        HotelBooking hotelBooking);

    /**
     * 
     * @param hotelBooking
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "excludeHotelBooking", targetNamespace = "http://resources.agency.pos.victorhsr.github.io/", className = "io.github.victorhsr.pos.soap.consumer.ExcludeHotelBooking")
    public void excludeHotelBooking(
        @WebParam(name = "hotelBooking", targetNamespace = "")
        HotelBooking hotelBooking);

}