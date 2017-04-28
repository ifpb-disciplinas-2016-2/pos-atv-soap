/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loader;

import io.github.victorhsr.pos.soap.consumer.Passagem;
import io.github.victorhsr.pos.soap.consumer.Ticket;
import io.github.victorhsr.pos.soap.consumer.TicketResource;
import java.util.List;

/**
 *
 * @author Victor Hugo <victor.hugo.origins@gmail.com>
 */
public class TicketLoader {

    private final TicketResource hotelBookingService = new Passagem().getTicketResourcePort();

    public List<Ticket> getAll() {
        return hotelBookingService.getTickets();
    }

    public void createTicket(Ticket ticket) {
        hotelBookingService.createTicket(ticket);
    }

    public Ticket getTicket(int id) {
        return hotelBookingService.getTicket(id);
    }

    public void updateTicket(Ticket ticket) {
        hotelBookingService.updateTicket(ticket);
    }

    public void excludeTicket(Ticket ticket) {
        hotelBookingService.excludeTicket(ticket);
    }

}
