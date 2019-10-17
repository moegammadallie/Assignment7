package me.moegammadallie.service.patientInfo.impl;

import me.moegammadallie.domain.patientInfo.PatientRecovery;
import me.moegammadallie.repository.patientInfo.PatientRecoveryRepository;
import me.moegammadallie.repository.patientInfo.impl.PatientRecoveryRepositoryImpl;
import me.moegammadallie.service.patientInfo.PatientRecoveryService;

import org.springframework.stereotype.Service;
import java.util.Set;

@Service
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
