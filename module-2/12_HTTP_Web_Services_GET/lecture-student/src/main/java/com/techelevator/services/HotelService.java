package com.techelevator.services;

import com.techelevator.model.City;
import com.techelevator.model.Hotel;
import com.techelevator.model.Review;
import org.springframework.web.client.RestTemplate;

public class HotelService {

    private final String API_BASE_URL;
    private final String API_KEY;
    private RestTemplate restTemplate = new RestTemplate();

    public HotelService(String apiURL, String apiKey) {
        API_BASE_URL = apiURL;
        API_KEY = apiKey;
    }

    public Hotel[] listHotels() {
        Hotel[] output;

        //                                                                                    Reflection --> looks into domain model and sets it up for you
        output = restTemplate.getForObject(API_BASE_URL + "api/hotels?apikey=" + API_KEY, Hotel[].class);

        return output;
    }

    public Review[] listReviews() {
        return restTemplate.getForObject(API_BASE_URL + "api/reviews?apikey=" + API_KEY, Review[].class);
    }

    public Hotel getHotelById(int id) {
        String url = API_BASE_URL + "api/hotels/" + id + "?apikey=/" + API_KEY;
        return restTemplate.getForObject(url, Hotel.class);
    }
    // Representational State Transfer
    // ReST
    // REST -> data: JSON
    // RESTful -> follows REST conventions

    // Competing convention -> SOAP -> Simple Object Access Protocol -> data: XML

    public Review[] getReviewsByHotelId(int hotelID) {
        String url = API_BASE_URL + "api/hotels/" + hotelID + "/reviews?apikey=" + API_KEY;
        return restTemplate.getForObject(url, Review[].class);
    }

    public Hotel[] getHotelsByStarRating(int stars) {
        String url = API_BASE_URL + "api/hotels?&stars=" + stars + "&apikey=" + API_KEY;
        return restTemplate.getForObject(url, Hotel[].class);
    }

    public City getWithCustomQuery(){
        return null;
    }

}
