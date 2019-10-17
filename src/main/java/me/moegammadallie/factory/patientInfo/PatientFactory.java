package me.moegammadallie.factory.patientInfo;

import me.moegammadallie.domain.patientInfo.Patient;

public class PatientFactory {
        public static Patient getPatientID(String patientID){
            return new Patient.Builder().patientID(patientID).build();
        }
}
