package me.moegammadallie.service.patientInfo;

import me.moegammadallie.domain.Patient;
import me.moegammadallie.service.IService;

import java.util.Set;

public interface PatientService extends IService<Patient, String> {
    Set<Patient> getAll();
}
