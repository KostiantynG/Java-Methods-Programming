package by.bsu.auction;

import java.util.Random;

/**
 * # 25 # инициализация аукциона и его запуск # AuctionRunner.java
 */
public class AuctionRunner {
    public static void main(String[] args) {
        Auction auction = new Auction();
        int startPrice = new Random().nextInt(100);
        System.out.println("startPrice: " +startPrice);
        for (int i = 0; i < auction.BIDS_NUMBER; i++) {
            Bid thread = new Bid(i, startPrice, auction.getBarrier());
            auction.add(thread);
            thread.start();
        }
    }
}