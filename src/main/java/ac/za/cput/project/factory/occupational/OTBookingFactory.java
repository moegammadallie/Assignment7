package ac.za.cput.project.factory.occupational;

import ac.za.cput.project.domain.occupational.OTBooking;

public class OTBookingFactory {
    public static OTBooking getOTPatientDetails(String patientDetails){
        return new OTBooking.Builder().patientDetails(patientDetails).build();
    }
}

