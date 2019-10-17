package me.moegammadallie.factory.billing;

import me.moegammadallie.domain.billing.MedicalAid;
import me.moegammadallie.domain.billing.MedicalAid;

public class MedicalAidFactory {
    public static MedicalAid getMedicalAidNum(int medicalAidNum){
        return new MedicalAid.Builder().medicalAidNum(medicalAidNum).build();
    }
}
