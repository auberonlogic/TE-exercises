package com.techelevator.services;

import org.springframework.web.client.RestTemplate;

import com.techelevator.model.Auction;

public class AuctionService {

    public final String API_URL;
    public final String API_KEY;
    public RestTemplate restTemplate = new RestTemplate();
    private final ConsoleService console = new ConsoleService();

    public AuctionService(String apiUrl, String apiKey) {
        API_URL = apiUrl;
        API_KEY = apiKey;
    }

    public Auction[] listAllAuctions() {
        Auction[] auctions = restTemplate.getForObject(API_URL + "?apikey=" +  API_KEY, Auction[].class);
        return auctions;
    }

    public Auction listDetailsForAuction(int id) {
        Auction auction = restTemplate.getForObject(API_URL + "/" + id + "?apikey=" +  API_KEY, Auction.class);
        return auction;
    }

    public Auction[] findAuctionsSearchTitle(String title) {
        Auction[] auctions = restTemplate.getForObject(API_URL + "?title_like=" + title + "&apikey=" + API_KEY, Auction[].class);
        return auctions;
    }

    public Auction[] findAuctionsSearchPrice(double price) {
        Auction[] auctions = restTemplate.getForObject(API_URL + "?currentBid_lte=" + price + "&apikey=" + API_KEY, Auction[].class);
        return auctions;
    }
}
