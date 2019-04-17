package factory;

import domain.services.OTBooking;

public class OTBookingFactory {
    public static OTBooking getOTPatientDetails(String patientDetails){
        return new OTBooking.Builder().patientDetails(patientDetails).build();
    }
}

