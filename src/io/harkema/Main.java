package io.harkema;

import io.harkema.models.*;
import io.harkema.requests.BandRequest;
import io.harkema.requests.PermitRequest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    // mock objects
    private static User cocaColaUser = new User(0, "CocaColaUser", "tom@cocacola.nl", "SoMePaSsWoRd");
    private static User idntUser = new User(0, "ID&TUser", "henk@idt.nl", "SoMePaSsWoRd");

    private static Partner cocaColaPartner = new Partner(0, "CocaCola", "Cola provider", new User[]{ cocaColaUser });

    private static Company idnt = new Company(
            0,
            "ID&T",
            "123456789",
            "Amsterdam",
            new User[] { idntUser },
            new User[] { },
            new Partner[] { cocaColaPartner },
            Subscription.Big
    );

    private static Event mysteryland = new Event(
            0,
            "Mysteryland",
            "Haarlemmermeer",
            new Date(),
            new User[] { idntUser },
            new User[] {},
            idnt
    );

    // storage
    private static List<ParkPass> passes = new ArrayList<>();
    private static List<BackstageBand> bands = new ArrayList<>();

    private static ParkPass requestParkPermit(PermitRequest permitRequest, Event event) {
        ParkPass pass = new ParkPass(event, permitRequest.partner, permitRequest.quantity, permitRequest.location);
        passes.add(pass);
        return pass;
    }

    // SEQ1: Aanvragen parkeerpas
    private static void seq1() {
        PermitRequest permitRequest = new PermitRequest(100, "ingang noord", cocaColaPartner);

        ParkPass pass = requestParkPermit(permitRequest, mysteryland);

        // notify

        pass.acceptParkPermit(idntUser);
    }

    private static BackstageBand[] requestBands(Event event, Partner partner, BandRequest[] bandRequests) {
        BackstageBand[] newBands = new BackstageBand[bandRequests.length];
        int i = 0;
        for (BandRequest bandRequest : bandRequests) {
            BackstageBand band = new BackstageBand(event, partner, bandRequest.quantity, bandRequest.accessLevel);

            bands.add(band);
            newBands[i] = band;

            i++;
        }

        return newBands;
    }

    private static void acceptBandRequest(BackstageBand[] bands, User user) {
        for (BackstageBand band : bands) {
            band.acceptBandRequest(user);
        }
    }


    // SEQ4: Aanvragen backstage bandje
    private static void seq4() {
        BandRequest bandRequest1 = new BandRequest();
        BandRequest bandRequest2 = new BandRequest();

        BandRequest[] bandRequests = new BandRequest[] { bandRequest1, bandRequest2 };

        BackstageBand[] bands = requestBands(mysteryland, cocaColaPartner, bandRequests);

        // notify

        acceptBandRequest(bands, idntUser);
    }


    public static void main(String[] args) {
	    seq1();
        seq4();
    }
}
