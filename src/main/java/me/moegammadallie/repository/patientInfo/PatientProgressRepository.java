package me.moegammadallie.repository.patientInfo;

import me.moegammadallie.domain.patientInfo.PatientProgress;
import me.moegammadallie.repository.IRepository;

import java.util.Set;

public interface PatientProgressRepository extends IRepository<PatientProgress,String> {
    Set<PatientProgress> getAll();
}
