package ac.za.cput.project.service.patientInfo;

import ac.za.cput.project.domain.patientInfo.Impediment;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface ImpedimentService extends IService<Impediment, String> {
        Set<Impediment> getAll();
}
