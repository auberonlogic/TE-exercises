package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDAO;
import com.techelevator.reservations.dao.MemoryHotelDAO;
import com.techelevator.reservations.dao.MemoryReservationDAO;
import com.techelevator.reservations.dao.ReservationDAO;
import com.techelevator.reservations.models.Hotel;
import com.techelevator.reservations.models.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HotelController {

    private HotelDAO hotelDAO;
    private ReservationDAO reservationDAO;

    public HotelController() {
        this.hotelDAO = new MemoryHotelDAO();
        this.reservationDAO = new MemoryReservationDAO(hotelDAO);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list() { // Request Handlers
        return hotelDAO.list();
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int id) {
        System.out.println("User asked for details on hotel #" + id);
        return hotelDAO.get(id);
    }

    @RequestMapping(path = "/hotels/filter", method = RequestMethod.GET)
    public List<Hotel> filterByCityAndState(@RequestParam(required = false, defaultValue = "all") String city, @RequestParam(required = false, defaultValue = "all") String state) {

        System.out.println("Looking for state = " + state);

        List<Hotel> allHotels = hotelDAO.list();
        List<Hotel> filteredHotels = new ArrayList<>();

        for (Hotel h : allHotels) {
            if(h.getAddress().getState().equalsIgnoreCase(state) || state.equals("all")) {
                filteredHotels.add(h);
            } else if (h.getAddress().getCity().equalsIgnoreCase(city) || city.equals("all")) {
                filteredHotels.add(h);
            }
        }

        return filteredHotels;


    }


}
