package com.heiio.book.caching;

import lombok.Data;

import java.io.Serializable;

@Data
public class TicketModel implements Serializable {
    private String name;
    private String perform;
    private String sponsor;

}
