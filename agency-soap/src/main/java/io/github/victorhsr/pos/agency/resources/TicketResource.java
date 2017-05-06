/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.victorhsr.pos.agency.resources;

import io.github.victorhsr.pos.agency.business.TicketManager;
import io.github.victorhsr.pos.agency.entities.Ticket;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author Victor Hugo <victor.hugo.origins@gmail.com>
 */
@WebService(serviceName = "passagem")
@Stateless
public class TicketResource {

    @EJB
    private TicketManager ticketManager;

    @WebResult(name = "tickets")
    @WebMethod
    public List<Ticket> getTickets() {
        return ticketManager.getAll();
    }

    @Oneway
    @WebMethod
    public void createTicket(@WebParam(name = "ticket") Ticket ticket) {
        ticketManager.persistTicket(ticket);
    }

    @WebResult(name = "ticket")
    @WebMethod
    public Ticket getTicket(@WebParam(name = "ticketId") int id) {
        return ticketManager.getTicket(id);
    }

    @Oneway
    @WebMethod
    public void updateTicket(@WebParam(name = "ticket") Ticket ticket) {
        ticketManager.updateTicket(ticket);
    }

    @Oneway
    @WebMethod
    public void excludeTicket(@WebParam(name = "ticket") Ticket ticket) {
        ticketManager.excludeTicket(ticket);
    }

}
