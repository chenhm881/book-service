package com.heiio.book.caching;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class StoreTicket {

    @Cacheable(cacheNames = "ticket", key="#id")
    public TicketModel getTicket(String id) {
        System.out.println("It is run on getTicket");
        TicketModel ticketModel = new TicketModel();
        ticketModel.setName("Jack");
        ticketModel.setPerform("Mermaid");
        ticketModel.setSponsor("Disney");
        return ticketModel;
    }
}
