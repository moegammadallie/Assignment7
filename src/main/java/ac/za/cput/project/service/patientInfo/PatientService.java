package ac.za.cput.project.service.patientInfo;

import ac.za.cput.project.domain.patientInfo.Patient;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface PatientService extends IService<Patient, String> {
    Set<Patient> getAll();
}
