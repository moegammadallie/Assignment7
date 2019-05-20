package ac.za.cput.project.service.patientInfo;

import ac.za.cput.project.domain.patientInfo.PatientProgress;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface PatientProgressService extends IService<PatientProgress,String> {
    Set<PatientProgress> getAll();
}
