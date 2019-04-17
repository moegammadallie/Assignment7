package factory;

import domain.actors.Patient;

public class PatientFactory {
        public static Patient getPatientID(String patientID){
            return new Patient.Builder().patientID(patientID).build();
        }
}
