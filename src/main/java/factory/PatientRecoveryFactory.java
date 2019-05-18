package factory;

import domain.patientInfo.PatientRecovery;

public class PatientRecoveryFactory {
    public static PatientRecovery getEstTime(String estTime){
        return new PatientRecovery.Builder().estTime(estTime).build();
    }
    public static PatientRecovery getRecoveryDescrip(String recoveryDescrip){
        return new PatientRecovery.Builder().recoveryDescrip(recoveryDescrip).build();
    }
}
