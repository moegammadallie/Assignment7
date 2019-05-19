package service.patientInfo.impl;

import domain.patientInfo.PatientProgress;
import service.patientInfo.PatientProgressService;

import java.util.HashSet;
import java.util.Set;

public class PatientProgressServiceImpl implements PatientProgressService {

    private static PatientProgressServiceImpl repository = null;
    private Set<PatientProgress> PatientProgressRepositorys;

    private PatientProgressServiceImpl() {
        this.PatientProgressRepositorys = new HashSet<>();
    }

    public static PatientProgressService getRepository(){
        if(repository == null) repository = new PatientProgressServiceImpl();
        return repository;
    }

    @Override
    public Set<PatientProgress> getAll() {
        return PatientProgressRepositorys;
    }

    @Override
    public PatientProgress create(PatientProgress patientProgress) {
        this.PatientProgressRepositorys.add(patientProgress);
        return patientProgress;
    }

    @Override
    public PatientProgress update(PatientProgress patientProgress) {
        String id = patientProgress.getProgress();
        PatientProgress pFind = findPatientProgress(id);
        PatientProgressRepositorys.remove(pFind);
        PatientProgressRepositorys.add(patientProgress);
        return null;
    }

    @Override
    public void delete(String s) {
        PatientProgress patientProgress = findPatientProgress(s);
        PatientProgressRepositorys.remove(patientProgress);
    }

    private PatientProgress findPatientProgress(String patientProgress){
        return this.PatientProgressRepositorys.stream()
                .filter(PatientProgress -> PatientProgress.getProgress().trim()
                        .equals(PatientProgress)).findAny().orElse(null);
    }

    @Override
    public PatientProgress read(String s) {
        PatientProgress patientProgress = findPatientProgress(s);
        return patientProgress == null ? null : patientProgress;
    }
}
