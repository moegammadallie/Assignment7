package repository.patientInfo;

import domain.patientInfo.PatientDiagnosis;
import repository.IRepository;

import java.util.Set;

public interface PatientDiagnosisRepository extends IRepository<PatientDiagnosis,String> {
    Set<PatientDiagnosis> getAll();
}
