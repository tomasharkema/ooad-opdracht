package io.harkema.models;

/**
 * Created by tomas on 08-01-17.
 */
public class Partner {
    private int id;
    private String name;
    private String description;
    private User[] users;

    public Partner(int id, String name, String description, User[] users) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.users = users;
    }
}
