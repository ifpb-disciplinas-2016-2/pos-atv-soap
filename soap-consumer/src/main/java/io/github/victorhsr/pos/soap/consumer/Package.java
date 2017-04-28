
package io.github.victorhsr.pos.soap.consumer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de package complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="package">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="client" type="{http://resources.agency.pos.victorhsr.github.io/}client" minOccurs="0"/>
 *         &lt;element name="hotelBooking" type="{http://resources.agency.pos.victorhsr.github.io/}hotelBooking" minOccurs="0"/>
 *         &lt;element name="ticketBooking" type="{http://resources.agency.pos.victorhsr.github.io/}ticket" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "package", propOrder = {
    "id",
    "client",
    "hotelBooking",
    "ticketBooking",
    "date"
})
public class Package {

    protected int id;
    protected Client client;
    protected HotelBooking hotelBooking;
    protected Ticket ticketBooking;
    @XmlElement(required = true)
    protected String date;

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade client.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClient() {
        return client;
    }

    /**
     * Define o valor da propriedade client.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClient(Client value) {
        this.client = value;
    }

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

    /**
     * Obtém o valor da propriedade ticketBooking.
     * 
     * @return
     *     possible object is
     *     {@link Ticket }
     *     
     */
    public Ticket getTicketBooking() {
        return ticketBooking;
    }

    /**
     * Define o valor da propriedade ticketBooking.
     * 
     * @param value
     *     allowed object is
     *     {@link Ticket }
     *     
     */
    public void setTicketBooking(Ticket value) {
        this.ticketBooking = value;
    }

    /**
     * Obtém o valor da propriedade date.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Define o valor da propriedade date.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

}
