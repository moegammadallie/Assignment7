package me.moegammadallie.repository.patientInfo;

import me.moegammadallie.domain.patientInfo.PatientRecovery;
import me.moegammadallie.repository.IRepository;

import java.util.Set;

public interface PatientRecoveryRepository extends IRepository<PatientRecovery,String> {
    Set<PatientRecovery> getAll();
}
