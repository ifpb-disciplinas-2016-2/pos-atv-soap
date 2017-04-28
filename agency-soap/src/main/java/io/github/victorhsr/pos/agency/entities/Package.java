/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.victorhsr.pos.agency.entities;

import io.github.victorhsr.pos.agency.adapters.DateAdapter;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 * @author Victor Hugo <victor.hugo.origins@gmail.com>
 */
@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Package implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    private Client client;
    @OneToOne(cascade = CascadeType.ALL)
    private HotelBooking hotelBooking;
    @OneToOne(cascade = CascadeType.ALL)
    private Ticket ticketBooking;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @Temporal(TemporalType.DATE)
    private Date date;

    public Package() {
    }

    public Package(Client client, HotelBooking hotelBooking, Ticket ticketBooking, Date date) {
        this.client = client;
        this.hotelBooking = hotelBooking;
        this.ticketBooking = ticketBooking;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public HotelBooking getHotelBooking() {
        return hotelBooking;
    }

    public void setHotelBooking(HotelBooking hotelBooking) {
        this.hotelBooking = hotelBooking;
    }

    public Ticket getTicketBooking() {
        return ticketBooking;
    }

    public void setTicketBooking(Ticket ticketBooking) {
        this.ticketBooking = ticketBooking;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Package{" + "id=" + id + ", client=" + client + ", hotelBooking=" + hotelBooking + ", ticketBooking=" + ticketBooking + ", date=" + date + '}';
    }

}
