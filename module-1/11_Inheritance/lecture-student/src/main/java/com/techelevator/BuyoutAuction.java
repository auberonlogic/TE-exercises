package com.techelevator;

public class BuyoutAuction extends Auction {

    private int buyoutPrice;

    public BuyoutAuction(String item, int buyoutPrice) {
        super(item); // being passed in from parent Auction class
        this.buyoutPrice = buyoutPrice;
    }

    // Need to override placeBid()
    @Override
    public boolean placeBid(Bid theBid) {
        if (theBid.getBidAmount() < buyoutPrice) {
            return super.placeBid(theBid);
        } else {
            // adjust the bid to meet buyout price exactly
            Bid buyoutBid = new Bid(theBid.getBidder(), buyoutPrice);
            return super.placeBid(buyoutBid);
        }
    }

    public int getBuyoutPrice() {
        return buyoutPrice;
    }
}