package ac.za.cput.project.factory.billing;

import ac.za.cput.project.domain.billing.MedicalAid;

public class MedicalAidFactory {
    public static MedicalAid getMedicalAidNum(int medicalAidNum){
        return new MedicalAid.Builder().medicalAidNum(medicalAidNum).build();
    }
}
