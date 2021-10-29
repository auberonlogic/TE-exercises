package com.techelevator.reservations.dao;

import java.util.List;
import com.techelevator.reservations.models.Reservation;

public interface ReservationDAO {



    // Create
    Reservation create(Reservation reservation, int hotelID);

    // Retrieves
    List<Reservation> findAll();
    List<Reservation> findByHotel(int hotelID);
    Reservation get(int reservationID);
}
