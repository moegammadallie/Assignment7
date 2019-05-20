package ac.za.cput.project.repository.patientInfo;

import ac.za.cput.project.domain.patientInfo.Patient;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface PatientRepository extends IRepository<Patient, String> {
    Set<Patient> getAll();
}
