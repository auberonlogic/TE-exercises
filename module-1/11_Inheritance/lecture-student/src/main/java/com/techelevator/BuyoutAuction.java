package com.techelevator;

public class BuyoutAuction extends Auction {

    private int buyoutPrice;

    public BuyoutAuction(String itemForSale, int buyoutPrice) {
        super(itemForSale);
        this.buyoutPrice = buyoutPrice;
    }

    public int getBuyoutPrice() {
        return buyoutPrice;
    }

    // we need to modify the default auction behavior
    // a buyout auction allows one to buy an item outright if one wishes,
    // so we'll need to check if incoming bids higher than the current high bid
    // are equal or greater to the buyout price.
    // if so, that bid wins and the auction is over

    @Override
    public boolean placeBid(Bid theBid) {

        if (theBid.getBidAmount() < buyoutPrice) {
            return super.placeBid(theBid);
        } else {
            // adjust the bid to meet the buyout price (so they don't overpay)
            Bid buyoutBid = new Bid(theBid.getBidder(), buyoutPrice);
            return super.placeBid(buyoutBid);
        }
    }


}
