/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.victorhsr.pos.agency.resources;

import io.github.victorhsr.pos.agency.entities.HotelBooking;
import io.github.victorhsr.pos.agency.business.HotelBookingManager;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author Victor Hugo <victor.hugo.origins@gmail.com>
 */
@WebService(serviceName = "reserva_hotel")
@Stateless
public class HotelBookingResource {

    @EJB
    private HotelBookingManager hotelBookingManager;

    @WebResult(name = "hotelBookings")
    public List<HotelBooking> getHotelBookings() {
        return hotelBookingManager.getAll();
    }

    @Oneway
    public void createHotelBooking(@WebParam(name = "hotelBooking") HotelBooking hotelBooking) {
        hotelBookingManager.persistHotelBooking(hotelBooking);
    }

    @WebResult(name = "hotelBooking")
    public HotelBooking getHotelBooking(@WebParam(name = "hotelBookingId") int id) {
        return hotelBookingManager.getHotelBooking(id);
    }

    @Oneway
    public void updateHotelBooking(@WebParam(name = "hotelBooking") HotelBooking hotelBooking) {
        hotelBookingManager.updateHotelBooking(hotelBooking);
    }

    @Oneway
    public void excludeHotelBooking(@WebParam(name = "hotelBooking") HotelBooking hotelBooking) {
        hotelBookingManager.excluirReservaHotel(hotelBooking);
    }

}
