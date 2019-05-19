package service.patientInfo;

import domain.patientInfo.Patient;
import service.IService;

import java.util.Set;

public interface PatientService extends IService<Patient, String> {
    Set<Patient> getAll();
}
