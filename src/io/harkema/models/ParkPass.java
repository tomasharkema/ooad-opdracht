package io.harkema.models;

import java.util.Date;

/**
 * Created by tomas on 08-01-17.
 */
public class ParkPass {
    private int id;
    private Event event;
    private Partner partner;
    private int quantity;
    private String location;
    private User acceptedBy;
    private boolean accepted;
    private Date acceptedDate;

    public ParkPass(Event event, Partner partner, int quantity, String location) {
        this.id = 0;
        this.event = event;
        this.partner = partner;
        this.quantity = quantity;
        this.location = location;
        accepted = false;
        acceptedBy = null;
        acceptedDate = null;
    }

    public void acceptParkPermit(User user) {
        acceptedBy = user;
        accepted = true;
        acceptedDate = new Date();
    }
}
