package me.moegammadallie.service.patientInfo;

import me.moegammadallie.domain.patientInfo.Impediment;
import me.moegammadallie.service.IService;

import java.util.Set;

public interface ImpedimentService extends IService<Impediment, String> {
        Set<Impediment> getAll();
}
