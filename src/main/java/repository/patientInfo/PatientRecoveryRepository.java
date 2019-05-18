package repository.patientInfo;

import domain.patientInfo.PatientRecovery;
import repository.IRepository;

import java.util.Set;

public interface PatientRecoveryRepository extends IRepository<PatientRecovery,String> {
    Set<PatientRecovery> getAll();
}
