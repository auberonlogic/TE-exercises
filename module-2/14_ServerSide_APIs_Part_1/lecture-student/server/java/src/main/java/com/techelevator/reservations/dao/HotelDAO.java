package com.techelevator.reservations.dao;

import com.techelevator.reservations.models.Hotel;

import java.util.List;

public interface HotelDAO {


    // Create
    void create(Hotel hotel);

    // Retrieves
    Hotel get(int id);
    List<Hotel> list();
}