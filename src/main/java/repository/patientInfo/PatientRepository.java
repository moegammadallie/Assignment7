package repository.patientInfo;

import domain.patientInfo.Patient;
import repository.IRepository;

import java.util.Set;

public interface PatientRepository extends IRepository<Patient, String> {
    Set<Patient> getAll();
}
