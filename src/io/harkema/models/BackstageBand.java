package io.harkema.models;

import java.util.Date;

/**
 * Created by tomas on 08-01-17.
 */
public class BackstageBand {
    public enum AccessLevel {
        AUTHORITY,
        BAR,
        AID,
        PRESS
    }

    private int id;
    private Event event;
    private Partner partner;
    private int quantity;
    private AccessLevel accessLevel;
    private User acceptedBy;
    private boolean accepted;
    private Date acceptedDate;

    public BackstageBand(Event event, Partner partner, int quantity, AccessLevel accessLevel) {
        this.event = event;
        this.partner = partner;
        this.quantity = quantity;
        this.accessLevel = accessLevel;
    }

    public void acceptBandRequest(User user) {
        accepted = true;
        acceptedBy = user;
        acceptedDate = new Date();
    }
}
