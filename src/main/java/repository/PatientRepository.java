package repository;

import domain.patientInfo.Patient;

import java.util.Set;

public interface PatientRepository extends IRepository<Patient, String>{
    Set<Patient> getAll();
}
