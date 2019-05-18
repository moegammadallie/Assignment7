package domain.patientInfo;

public class PatientRecovery {
    private String estTime;
    private String recoveryDescrip;

    private PatientRecovery(){}
    private PatientRecovery(Builder builder){
        this.estTime = builder.estTime;
        this.recoveryDescrip = builder.recoveryDescrip;
    }

    public String getEstTime() {
        return estTime;
    }

    public String getRecoveryDescrip() {
        return recoveryDescrip;
    }

    public static class Builder{
        private String estTime;
        private String recoveryDescrip;

        public Builder estTime(String estTime) {
            this.estTime = estTime;
            return this;
        }
        public Builder recoveryDescrip(String recoveryDescrip) {
            this.recoveryDescrip = recoveryDescrip;
            return this;
        }
        public PatientRecovery build() {
            return new PatientRecovery(this);
        }
    }

    @Override
    public String toString() {
        return "PatientRecovery{" +
                "estTime='" + estTime + '\'' +
                ", recoveryDescrip='" + recoveryDescrip + '\'' +
                '}';
    }
}
