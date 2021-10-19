package com.techelevator.dao;

import com.techelevator.model.City;

import java.util.List;

public interface CityDao {

    // SELECT
    City getCity(long cityId);
    List<City> getCitiesByState(String stateAbbreviation);

    // INSERT UPDATE DELETE
    City createCity(City city);
    void updateCity(City city);
    void deleteCity(long cityId);
}
