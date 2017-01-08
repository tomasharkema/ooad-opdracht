package io.harkema.models;

/**
 * Created by tomas on 08-01-17.
 */
public enum Subscription {
    Small(100, 100_00),
    Big(200, 300_00);

    public int events;
    public int price;

    Subscription(int events, int price) {
        this.events = events;
        this.price = price;
    }
}
