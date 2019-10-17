package me.moegammadallie.service.patientInfo;

import me.moegammadallie.domain.patientInfo.PatientRecovery;
import me.moegammadallie.service.IService;

import java.util.Set;

public interface PatientRecoveryService extends IService<PatientRecovery,String> {
    Set<PatientRecovery> getAll();
}
