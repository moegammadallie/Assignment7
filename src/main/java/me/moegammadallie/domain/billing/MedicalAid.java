package me.moegammadallie.domain.billing;

public class MedicalAid {
    private int medicalAidNum;

    private MedicalAid(){}
    private MedicalAid(Builder builder){
        this.medicalAidNum = builder.medicalAidNum;
    }

    public int getMedicalAidNum() {
        return medicalAidNum;
    }

    public static class Builder{
        private int medicalAidNum;

        public Builder medicalAidNum(int medicalAidNum) {
            this.medicalAidNum = medicalAidNum;
            return this;
        }
        public MedicalAid build() {
            return new MedicalAid(this);
        }
    }

    @Override
    public String toString() {
        return "MedicalAidController{" +
                "medicalAidNum=" + medicalAidNum +
                '}';
    }
}
