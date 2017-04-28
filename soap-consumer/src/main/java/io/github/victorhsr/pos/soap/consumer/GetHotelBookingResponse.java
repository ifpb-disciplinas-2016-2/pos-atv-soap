
package io.github.victorhsr.pos.soap.consumer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getHotelBookingResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getHotelBookingResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hotelBooking" type="{http://resources.agency.pos.victorhsr.github.io/}hotelBooking" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHotelBookingResponse", propOrder = {
    "hotelBooking"
})
public class GetHotelBookingResponse {

    protected HotelBooking hotelBooking;

    /**
     * Obtém o valor da propriedade hotelBooking.
     * 
     * @return
     *     possible object is
     *     {@link HotelBooking }
     *     
     */
    public HotelBooking getHotelBooking() {
        return hotelBooking;
    }

    /**
     * Define o valor da propriedade hotelBooking.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelBooking }
     *     
     */
    public void setHotelBooking(HotelBooking value) {
        this.hotelBooking = value;
    }

}
