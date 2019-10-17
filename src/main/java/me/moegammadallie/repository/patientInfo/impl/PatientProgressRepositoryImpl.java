package me.moegammadallie.repository.patientInfo.impl;

import me.moegammadallie.domain.patientInfo.PatientProgress;
import me.moegammadallie.repository.patientInfo.PatientProgressRepository;

import java.util.HashSet;
import java.util.Set;

public class PatientProgressRepositoryImpl implements PatientProgressRepository {

    private static PatientProgressRepositoryImpl repository = null;
    private Set<PatientProgress> PatientProgressRepositorys;

    private PatientProgressRepositoryImpl() {
        this.PatientProgressRepositorys = new HashSet<>();
    }

    public static PatientProgressRepository getRepository(){
        if(repository == null) repository = new PatientProgressRepositoryImpl();
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
