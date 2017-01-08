package io.harkema.models;

import java.util.Date;

/**
 * Created by tomas on 08-01-17.
 */
public class Event {
    private int id;
    private String name;
    private String location;
    private Date date;
    private User[] admins;
    private User[] users;
    private Company company;

    public Event(int id, String name, String location, Date date, User[] admins, User[] users, Company company) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.date = date;
        this.admins = admins;
        this.users = users;
        this.company = company;
    }
}
