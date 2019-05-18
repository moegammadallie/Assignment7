package repository.patientInfo;

import domain.patientInfo.PatientProgress;
import repository.IRepository;

import java.util.Set;

public interface PatientProgressRepository extends IRepository<PatientProgress,String> {
    Set<PatientProgress> getAll();
}
