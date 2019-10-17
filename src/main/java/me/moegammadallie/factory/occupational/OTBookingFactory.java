package me.moegammadallie.factory.occupational;

import me.moegammadallie.domain.occupational.OTBooking;

public class OTBookingFactory {
    public static OTBooking getOTPatientDetails(String patientDetails){
        return new OTBooking.Builder().patientDetails(patientDetails).build();
    }
}

