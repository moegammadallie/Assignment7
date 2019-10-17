package me.moegammadallie.service.patientInfo;

import me.moegammadallie.domain.patientInfo.PatientDiagnosis;
import me.moegammadallie.service.IService;

import java.util.Set;

public interface PatientDiagnosisService extends IService<PatientDiagnosis,String> {
    Set<PatientDiagnosis> getAll();
}
