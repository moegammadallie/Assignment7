package service.patientInfo.impl;

import domain.patientInfo.PatientRecovery;
import repository.patientInfo.PatientRecoveryRepository;
import repository.patientInfo.impl.PatientRecoveryRepositoryImpl;
import service.patientInfo.PatientRecoveryService;

import java.util.HashSet;
import java.util.Set;

public class PatientRecoveryServiceImpl implements PatientRecoveryService {

    private static PatientRecoveryServiceImpl service = null;
    private PatientRecoveryRepository repository;

    private PatientRecoveryServiceImpl() {
        this.repository = PatientRecoveryRepositoryImpl.getRepository();
    }

    public static PatientRecoveryServiceImpl getService(){
        if(service == null) service = new PatientRecoveryServiceImpl();
        return service;
    }

    @Override
    public Set<PatientRecovery> getAll() {
        return this.repository.getAll();
    }

    @Override
    public PatientRecovery create(PatientRecovery pr) {
        return this.repository.create(pr);
    }

    @Override
    public PatientRecovery update(PatientRecovery pr) {
        return this.repository.update(pr);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public PatientRecovery read(String s) {
        return this.repository.read(s);
    }
}
