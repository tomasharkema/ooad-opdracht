package io.harkema.requests;

import io.harkema.models.Event;
import io.harkema.models.Partner;
import io.harkema.models.User;

import java.util.Date;

/**
 * Created by tomas on 08-01-17.
 */
public class PermitRequest {
    public int quantity;
    public String location;
    public Partner partner;

    public PermitRequest(int quantity, String location, Partner partner) {
        this.quantity = quantity;
        this.location = location;
        this.partner = partner;
    }
}
