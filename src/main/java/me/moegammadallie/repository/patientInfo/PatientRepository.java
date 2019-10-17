package me.moegammadallie.repository.patientInfo;

import me.moegammadallie.domain.patientInfo.Patient;
import me.moegammadallie.repository.IRepository;

import java.util.Set;

public interface PatientRepository extends IRepository<Patient, String> {
    Set<Patient> getAll();
}
