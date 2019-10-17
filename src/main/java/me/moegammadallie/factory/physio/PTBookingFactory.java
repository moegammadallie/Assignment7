package me.moegammadallie.factory.physio;

import me.moegammadallie.domain.patientInfo.Patient;
import me.moegammadallie.domain.physio.PTBooking;
import me.moegammadallie.domain.physio.PTBooking;

public class PTBookingFactory {

    public static PTBooking getPTPatientDetails(Patient patientDetails){
            return new PTBooking.Builder().patientDetails(patientDetails).build();
        }
    }



