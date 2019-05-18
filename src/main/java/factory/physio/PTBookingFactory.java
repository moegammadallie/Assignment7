package factory.physio;

import domain.physio.PTBooking;

public class PTBookingFactory {

    public static PTBooking getPTPatientDetails(String patientDetails){
            return new PTBooking.Builder().patientDetails(patientDetails).build();
        }
    }



