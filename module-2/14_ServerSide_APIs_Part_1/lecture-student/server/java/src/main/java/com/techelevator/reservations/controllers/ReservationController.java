package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDAO;
import com.techelevator.reservations.dao.MemoryHotelDAO;
import com.techelevator.reservations.dao.MemoryReservationDAO;
import com.techelevator.reservations.dao.ReservationDAO;
import com.techelevator.reservations.models.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReservationController {

    private ReservationDAO reservationDao;
    private HotelDAO hotelDAO;

    public ReservationController() {
        this.hotelDAO = new MemoryHotelDAO();
        this.reservationDao = new MemoryReservationDAO(hotelDAO);
    }

    @RequestMapping(path = "/reservations", method = RequestMethod.GET)
    public List<Reservation> getAllReservations() {
        return reservationDao.findAll();
    }

    @RequestMapping(path = "/reservations/{reservationId}", method = RequestMethod.GET)
    public Reservation getSpecificReservation(@PathVariable int reservationId) {
        return reservationDao.get(reservationId);
    }

    @RequestMapping(path = "/reservations", method = RequestMethod.POST)
    public Reservation createReservation(@RequestBody Reservation newReservation) {
        reservationDao.create(newReservation, newReservation.getHotelID());
        return newReservation;
    }



}
