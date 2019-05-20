package ac.za.cput.project.repository.patientInfo;

import ac.za.cput.project.domain.patientInfo.Impediment;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface ImpedimentRepository extends IRepository<Impediment, String> {
        Set<Impediment> getAll();
}
