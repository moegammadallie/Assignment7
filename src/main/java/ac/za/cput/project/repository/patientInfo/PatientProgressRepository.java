package ac.za.cput.project.repository.patientInfo;

import ac.za.cput.project.domain.patientInfo.PatientProgress;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface PatientProgressRepository extends IRepository<PatientProgress,String> {
    Set<PatientProgress> getAll();
}
