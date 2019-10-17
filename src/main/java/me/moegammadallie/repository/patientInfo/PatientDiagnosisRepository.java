package me.moegammadallie.repository.patientInfo;

import me.moegammadallie.domain.patientInfo.PatientDiagnosis;
import me.moegammadallie.repository.IRepository;

import java.util.Set;

public interface PatientDiagnosisRepository extends IRepository<PatientDiagnosis,String> {
    Set<PatientDiagnosis> getAll();
}
