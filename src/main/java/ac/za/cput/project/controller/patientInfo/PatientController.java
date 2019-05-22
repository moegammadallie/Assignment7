package ac.za.cput.project.controller.patientInfo;

import ac.za.cput.project.domain.access.Person;

public class PatientController extends Person {
    private String patientID;

    private PatientController(){}
    
    private PatientController(Builder builder){
        this.patientID = builder.patientID;
    }

    public String getPatientID() {
        return patientID;
    }

    public static class Builder{
        private String patientID;

        public Builder patientID(String patientID) {
            this.patientID = patientID;
            return this;
        }
        public PatientController build() {
            return new PatientController(this);
        }
    }

    @Override
    public String toString() {
        return "PatientController{" +
                "patientID='" + patientID + '\'' +
                '}';
    }
}
