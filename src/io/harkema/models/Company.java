package io.harkema.models;

/**
 * Created by tomas on 08-01-17.
 */
public class Company {
    private int id;
    private String name;
    private String kvk;
    private String location;
    private User[] admins;
    private User[] users;
    private Partner[] partners;
    private Subscription subscription;

    public Company(int id, String name, String kvk, String location, User[] admins, User[] users, Partner[] partners, Subscription subscription) {
        this.id = id;
        this.name = name;
        this.kvk = kvk;
        this.location = location;
        this.admins = admins;
        this.users = users;
        this.partners = partners;
        this.subscription = subscription;
    }
}
