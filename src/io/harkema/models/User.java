package io.harkema.models;

/**
 * Created by tomas on 08-01-17.
 */
public class User {
    private int id;
    private String name;
    private String email;
    private String password;

    public User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
