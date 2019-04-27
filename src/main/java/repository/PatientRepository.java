package repository;

import domain.actors.Patient;

import java.util.HashSet;
import java.util.Set;

public interface PatientRepository extends IRepository<Patient, String>{
    Set<Patient> getAll();
}
