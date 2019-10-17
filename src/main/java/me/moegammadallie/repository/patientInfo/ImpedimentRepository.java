package me.moegammadallie.repository.patientInfo;

import me.moegammadallie.domain.patientInfo.Impediment;
import me.moegammadallie.repository.IRepository;

import java.util.Set;

public interface ImpedimentRepository extends IRepository<Impediment, String> {
        Set<Impediment> getAll();
}
