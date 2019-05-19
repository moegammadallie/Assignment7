package service.patientInfo.impl;

import domain.patientInfo.PatientRecovery;
import service.patientInfo.PatientRecoveryService;

import java.util.HashSet;
import java.util.Set;

public class PatientRecoveryServiceImpl implements PatientRecoveryService {

    private static PatientRecoveryServiceImpl repository = null;
    private Set<PatientRecovery> PatientRecoveryRepositorys;

    private PatientRecoveryServiceImpl() {
        this.PatientRecoveryRepositorys = new HashSet<>();
    }

    public static PatientRecoveryService getRepository(){
        if(repository == null) repository = new PatientRecoveryServiceImpl();
        return repository;
    }

    @Override
    public Set<PatientRecovery> getAll() {
        return PatientRecoveryRepositorys;
    }

    @Override
    public PatientRecovery create(PatientRecovery patientProgress) {
        this.PatientRecoveryRepositorys.add(patientProgress);
        return patientProgress;
    }

    @Override
    public PatientRecovery update(PatientRecovery patientRecovery) {
        String id = patientRecovery.getRecoveryDescrip();
        PatientRecovery pFind = findPatientRecovery(id);
        PatientRecoveryRepositorys.remove(pFind);
        PatientRecoveryRepositorys.add(patientRecovery);
        return null;
    }

    @Override
    public void delete(String s) {
        PatientRecovery patientProgress = findPatientRecovery(s);
        PatientRecoveryRepositorys.remove(patientProgress);
    }

    private PatientRecovery findPatientRecovery(String patientRecovery){
        return this.PatientRecoveryRepositorys.stream()
                .filter(PatientProgress -> PatientProgress.getRecoveryDescrip().trim()
                        .equals(PatientProgress)).findAny().orElse(null);
    }

    @Override
    public PatientRecovery read(String s) {
        PatientRecovery patientRecovery = findPatientRecovery(s);
        return patientRecovery == null ? null : patientRecovery;
    }
}
