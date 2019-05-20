package ac.za.cput.project.factory.patientInfo;

import ac.za.cput.project.domain.patientInfo.Patient;

public class PatientFactory {
        public static Patient getPatientID(String patientID){
            return new Patient.Builder().patientID(patientID).build();
        }
}
