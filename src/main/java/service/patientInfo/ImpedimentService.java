package service.patientInfo;

import domain.patientInfo.Impediment;
import service.IService;

import java.util.Set;

public interface ImpedimentService extends IService<Impediment, String> {
        Set<Impediment> getAll();
}
