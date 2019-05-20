package ac.za.cput.project.domain.patientInfo;

import java.util.Date;

public class PatientDiagnosis {
    private Date dateOfDiagnosis;
    private String hospitalDiagnosed;
    private String doctorDiagnosed;

    private PatientDiagnosis(){}
    private PatientDiagnosis(Builder builder){
        this.dateOfDiagnosis = builder.dateOfDiagnosis;
        this.hospitalDiagnosed = builder.hospitalDiagnosed;
        this.doctorDiagnosed = builder.doctorDiagnosed;
    }

    public Date getDateOfDiagnosis() {
        return dateOfDiagnosis;
    }

    public String getHospitalDiagnosed() {
        return hospitalDiagnosed;
    }

    public String getDoctorDiagnosed() {
        return doctorDiagnosed;
    }

    public static class Builder{
        private Date dateOfDiagnosis;
        private String hospitalDiagnosed;
        private String doctorDiagnosed;

        public Builder dateOfDiagnosis(Date dateOfDiagnosis) {
            this.dateOfDiagnosis = dateOfDiagnosis;
            return this;
        }
        public Builder hospitalDiagnosed(String hospitalDiagnosed) {
            this.hospitalDiagnosed = hospitalDiagnosed;
            return this;
        }
        public Builder doctorDiagnosed(String doctorDiagnosed) {
            this.doctorDiagnosed = doctorDiagnosed;
            return this;
        }
        public PatientDiagnosis build() {
            return new PatientDiagnosis(this);
        }
    }

    @Override
    public String toString() {
        return "PatientDiagnosis{" +
                "dateOfDiagnosis=" + dateOfDiagnosis +
                ", hospitalDiagnosed='" + hospitalDiagnosed + '\'' +
                ", doctorDiagnosed='" + doctorDiagnosed + '\'' +
                '}';
    }
}
