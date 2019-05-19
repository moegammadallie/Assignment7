package service.patientInfo;

import domain.patientInfo.PatientDiagnosis;
import service.IService;

import java.util.Set;

public interface PatientDiagnosisService extends IService<PatientDiagnosis,String> {
    Set<PatientDiagnosis> getAll();
}
