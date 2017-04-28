/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loader;

import io.github.victorhsr.pos.soap.consumer.HotelBooking;
import io.github.victorhsr.pos.soap.consumer.HotelBookingResource;
import io.github.victorhsr.pos.soap.consumer.ReservaHotel;
import java.util.List;

/**
 *
 * @author Victor Hugo <victor.hugo.origins@gmail.com>
 */
public class HotelBookingLoader {

    private final HotelBookingResource hotelBookingService = new ReservaHotel().getHotelBookingResourcePort();

    public List<HotelBooking> getAll() {
        return hotelBookingService.getHotelBookings();
    }

    public void createHotelBooking(HotelBooking hotelBooking) {
        hotelBookingService.createHotelBooking(hotelBooking);
    }

    public HotelBooking getHotelBooking(int id) {
        return hotelBookingService.getHotelBooking(id);
    }

    public void updateHotelBooking(HotelBooking hotelBooking) {
        hotelBookingService.updateHotelBooking(hotelBooking);
    }

    public void excludeHotelBooking(HotelBooking hotelBooking) {
        hotelBookingService.excludeHotelBooking(hotelBooking);
    }

}
