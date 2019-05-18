package repository.patientInfo;

import domain.patientInfo.Impediment;
import repository.IRepository;

import java.util.Set;

public interface ImpedimentRepository extends IRepository<Impediment, String> {
        Set<Impediment> getAll();
}
