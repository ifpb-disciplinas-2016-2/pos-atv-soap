
package io.github.victorhsr.pos.soap.consumer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getHotelBooking complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getHotelBooking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hotelBookingId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHotelBooking", propOrder = {
    "hotelBookingId"
})
public class GetHotelBooking {

    protected int hotelBookingId;

    /**
     * Obtém o valor da propriedade hotelBookingId.
     * 
     */
    public int getHotelBookingId() {
        return hotelBookingId;
    }

    /**
     * Define o valor da propriedade hotelBookingId.
     * 
     */
    public void setHotelBookingId(int value) {
        this.hotelBookingId = value;
    }

}
