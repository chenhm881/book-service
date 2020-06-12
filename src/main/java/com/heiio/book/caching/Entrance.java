package com.heiio.book.caching;


public class Entrance {

    public static void main(String[] args) {
        StoreTicket storeTicket = new StoreTicket();
        storeTicket.getTicket("ticket01");
        storeTicket.getTicket("ticket01");
    }
}
