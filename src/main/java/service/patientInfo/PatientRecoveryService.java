package service.patientInfo;

import domain.patientInfo.PatientRecovery;
import service.IService;

import java.util.Set;

public interface PatientRecoveryService extends IService<PatientRecovery,String> {
    Set<PatientRecovery> getAll();
}
