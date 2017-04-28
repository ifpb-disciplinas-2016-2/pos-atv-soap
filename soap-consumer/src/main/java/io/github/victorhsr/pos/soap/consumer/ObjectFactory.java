
package io.github.victorhsr.pos.soap.consumer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.github.victorhsr.pos.soap.consumer package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateTicket_QNAME = new QName("http://resources.agency.pos.victorhsr.github.io/", "createTicket");
    private final static QName _ExcludeTicket_QNAME = new QName("http://resources.agency.pos.victorhsr.github.io/", "excludeTicket");
    private final static QName _Ticket_QNAME = new QName("http://resources.agency.pos.victorhsr.github.io/", "ticket");
    private final static QName _GetTicketsResponse_QNAME = new QName("http://resources.agency.pos.victorhsr.github.io/", "getTicketsResponse");
    private final static QName _GetTickets_QNAME = new QName("http://resources.agency.pos.victorhsr.github.io/", "getTickets");
    private final static QName _GetTicket_QNAME = new QName("http://resources.agency.pos.victorhsr.github.io/", "getTicket");
    private final static QName _UpdateTicket_QNAME = new QName("http://resources.agency.pos.victorhsr.github.io/", "updateTicket");
    private final static QName _GetTicketResponse_QNAME = new QName("http://resources.agency.pos.victorhsr.github.io/", "getTicketResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.github.victorhsr.pos.soap.consumer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTicketsResponse }
     * 
     */
    public GetTicketsResponse createGetTicketsResponse() {
        return new GetTicketsResponse();
    }

    /**
     * Create an instance of {@link GetTickets }
     * 
     */
    public GetTickets createGetTickets() {
        return new GetTickets();
    }

    /**
     * Create an instance of {@link ExcludeTicket }
     * 
     */
    public ExcludeTicket createExcludeTicket() {
        return new ExcludeTicket();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link CreateTicket }
     * 
     */
    public CreateTicket createCreateTicket() {
        return new CreateTicket();
    }

    /**
     * Create an instance of {@link GetTicketResponse }
     * 
     */
    public GetTicketResponse createGetTicketResponse() {
        return new GetTicketResponse();
    }

    /**
     * Create an instance of {@link GetTicket }
     * 
     */
    public GetTicket createGetTicket() {
        return new GetTicket();
    }

    /**
     * Create an instance of {@link UpdateTicket }
     * 
     */
    public UpdateTicket createUpdateTicket() {
        return new UpdateTicket();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.agency.pos.victorhsr.github.io/", name = "createTicket")
    public JAXBElement<CreateTicket> createCreateTicket(CreateTicket value) {
        return new JAXBElement<CreateTicket>(_CreateTicket_QNAME, CreateTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcludeTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.agency.pos.victorhsr.github.io/", name = "excludeTicket")
    public JAXBElement<ExcludeTicket> createExcludeTicket(ExcludeTicket value) {
        return new JAXBElement<ExcludeTicket>(_ExcludeTicket_QNAME, ExcludeTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ticket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.agency.pos.victorhsr.github.io/", name = "ticket")
    public JAXBElement<Ticket> createTicket(Ticket value) {
        return new JAXBElement<Ticket>(_Ticket_QNAME, Ticket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.agency.pos.victorhsr.github.io/", name = "getTicketsResponse")
    public JAXBElement<GetTicketsResponse> createGetTicketsResponse(GetTicketsResponse value) {
        return new JAXBElement<GetTicketsResponse>(_GetTicketsResponse_QNAME, GetTicketsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTickets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.agency.pos.victorhsr.github.io/", name = "getTickets")
    public JAXBElement<GetTickets> createGetTickets(GetTickets value) {
        return new JAXBElement<GetTickets>(_GetTickets_QNAME, GetTickets.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.agency.pos.victorhsr.github.io/", name = "getTicket")
    public JAXBElement<GetTicket> createGetTicket(GetTicket value) {
        return new JAXBElement<GetTicket>(_GetTicket_QNAME, GetTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.agency.pos.victorhsr.github.io/", name = "updateTicket")
    public JAXBElement<UpdateTicket> createUpdateTicket(UpdateTicket value) {
        return new JAXBElement<UpdateTicket>(_UpdateTicket_QNAME, UpdateTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resources.agency.pos.victorhsr.github.io/", name = "getTicketResponse")
    public JAXBElement<GetTicketResponse> createGetTicketResponse(GetTicketResponse value) {
        return new JAXBElement<GetTicketResponse>(_GetTicketResponse_QNAME, GetTicketResponse.class, null, value);
    }

}
