/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.victorhsr.pos.agency.business;

import io.github.victorhsr.pos.agency.entities.HotelBooking;
import java.util.List;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Victor Hugo <victor.hugo.origins@gmail.com>
 */
@Stateless
public class HotelBookingManager {

    @PersistenceContext
    private EntityManager em;

    public List<HotelBooking> getAll() {
        return em.createNativeQuery("SELECT * FROM HotelBooking", HotelBooking.class).getResultList();
    }

    public void persistHotelBooking(HotelBooking hotelBooking) {
        em.merge(hotelBooking);
    }

    public HotelBooking getHotelBooking(int id) {
        return em.find(HotelBooking.class, id);
    }

    public void updateHotelBooking(HotelBooking hotelBooking) {
        em.merge(hotelBooking);
    }

    public void excluirReservaHotel(HotelBooking hotelBooking) {
        em.remove(em.merge(hotelBooking));
    }

}
