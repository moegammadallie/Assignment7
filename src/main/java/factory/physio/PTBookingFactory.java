package factory.physio;

import domain.patientInfo.Patient;
import domain.physio.PTBooking;

public class PTBookingFactory {

    public static PTBooking getPTPatientDetails(Patient patientDetails){
            return new PTBooking.Builder().patientDetails(patientDetails).build();
        }
    }



