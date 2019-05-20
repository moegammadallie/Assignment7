package ac.za.cput.project.factory.physio;

import ac.za.cput.project.domain.patientInfo.Patient;
import ac.za.cput.project.domain.physio.PTBooking;

public class PTBookingFactory {

    public static PTBooking getPTPatientDetails(Patient patientDetails){
            return new PTBooking.Builder().patientDetails(patientDetails).build();
        }
    }



