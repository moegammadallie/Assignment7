package factory.billing;

import domain.billing.MedicalAid;

public class MedicalAidFactory {
    public static MedicalAid getMedicalAidNum(int medicalAidNum){
        return new MedicalAid.Builder().medicalAidNum(medicalAidNum).build();
    }
}
