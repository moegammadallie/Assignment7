package ac.za.cput.project.service.patientInfo;

import ac.za.cput.project.domain.patientInfo.PatientDiagnosis;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface PatientDiagnosisService extends IService<PatientDiagnosis,String> {
    Set<PatientDiagnosis> getAll();
}
