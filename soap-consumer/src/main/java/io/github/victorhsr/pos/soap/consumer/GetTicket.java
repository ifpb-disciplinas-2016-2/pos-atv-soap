
package io.github.victorhsr.pos.soap.consumer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getTicket complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getTicket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ticketId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTicket", propOrder = {
    "ticketId"
})
public class GetTicket {

    protected int ticketId;

    /**
     * Obtém o valor da propriedade ticketId.
     * 
     */
    public int getTicketId() {
        return ticketId;
    }

    /**
     * Define o valor da propriedade ticketId.
     * 
     */
    public void setTicketId(int value) {
        this.ticketId = value;
    }

}
