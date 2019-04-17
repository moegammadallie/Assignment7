package domain.services;

import java.util.Date;

public class PatientTreatment {
    private Date treatmentStartDate;

    private PatientTreatment(){}
    private PatientTreatment(Builder builder){

        this.treatmentStartDate = builder.treatmentStartDate;
    }

    public Date getTreatmentStartDate() {
        return treatmentStartDate;
    }

    public static class Builder{
        private Date treatmentStartDate;

        public Builder progress(Date treatmentStartDate) {
            this.treatmentStartDate = treatmentStartDate;
            return this;
        }
        public PatientTreatment build() {
            return new PatientTreatment(this);
        }


    }

    @Override
    public String toString() {
        return "PatientTreatment{" +
                "treatmentStartDate=" + treatmentStartDate +
                '}';
    }
}
