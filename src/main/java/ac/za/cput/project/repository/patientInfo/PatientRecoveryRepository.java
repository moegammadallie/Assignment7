package ac.za.cput.project.repository.patientInfo;

import ac.za.cput.project.domain.patientInfo.PatientRecovery;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface PatientRecoveryRepository extends IRepository<PatientRecovery,String> {
    Set<PatientRecovery> getAll();
}
