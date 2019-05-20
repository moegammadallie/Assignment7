package ac.za.cput.project.service.patientInfo;

import ac.za.cput.project.domain.patientInfo.PatientRecovery;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface PatientRecoveryService extends IService<PatientRecovery,String> {
    Set<PatientRecovery> getAll();
}
