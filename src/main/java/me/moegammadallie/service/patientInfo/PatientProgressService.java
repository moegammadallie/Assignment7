package me.moegammadallie.service.patientInfo;

import me.moegammadallie.domain.patientInfo.PatientProgress;
import me.moegammadallie.service.IService;

import java.util.Set;

public interface PatientProgressService extends IService<PatientProgress,String> {
    Set<PatientProgress> getAll();
}
