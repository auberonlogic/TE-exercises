package com.techelevator;


import com.techelevator.model.Hotel;
import com.techelevator.model.Review;
import com.techelevator.services.ConsoleService;
import com.techelevator.services.HotelService;

public class App {

    private final ConsoleService consoleService = new ConsoleService();
    private final HotelService hotelService = new HotelService("https://te-pgh-api.azurewebsites.net/", "03017");

    public static void main(String[] args) {
        App application = new App();
        application.run();
    }

    private void run() {
        Hotel[] hotels = null;
        int menuSelection = 999;

        while(menuSelection != 0) {
            menuSelection = consoleService.printMainMenu();

            System.out.println("");
            if (menuSelection == 1) {
                Hotel[] results = hotelService.listHotels();
                consoleService.printHotels(results);
            } else if (menuSelection == 2) {
                consoleService.printReviews(hotelService.listReviews());
            } else if (menuSelection == 3) {
                Hotel sinkHole = hotelService.getHotelById(4);
                consoleService.printHotel(sinkHole);
            } else if (menuSelection == 4) {
                consoleService.printReviews(hotelService.getReviewsByHotelId(1));
            } else if (menuSelection == 5) {
                consoleService.printHotels(hotelService.getHotelsByStarRating(3));
            } else if (menuSelection == 6) {
                System.out.println("Not implemented - Create a custom Web API query here");
            } else if (menuSelection == 0) {
                continue;
            } else {
                System.out.println("Invalid Selection");
            }
            menuSelection = 999;
            consoleService.next();
        }
    }
}
