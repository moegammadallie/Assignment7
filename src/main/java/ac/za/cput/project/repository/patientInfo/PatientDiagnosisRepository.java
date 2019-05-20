package ac.za.cput.project.repository.patientInfo;

import ac.za.cput.project.domain.patientInfo.PatientDiagnosis;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface PatientDiagnosisRepository extends IRepository<PatientDiagnosis,String> {
    Set<PatientDiagnosis> getAll();
}
