package service.patientInfo;

import domain.patientInfo.PatientProgress;
import service.IService;

import java.util.Set;

public interface PatientProgressService extends IService<PatientProgress,String> {
    Set<PatientProgress> getAll();
}
