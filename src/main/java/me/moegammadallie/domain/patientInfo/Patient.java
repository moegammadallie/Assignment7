package me.moegammadallie.domain.patientInfo;

import me.moegammadallie.domain.access.Person;
import me.moegammadallie.domain.access.Person;

public class Patient extends Person {
    private String patientID;

    private Patient(){}
    
    private Patient(Builder builder){
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
        public Patient build() {
            return new Patient(this);
        }
    }

    @Override
    public String toString() {
        return "PatientController{" +
                "patientID='" + patientID + '\'' +
                '}';
    }
}
