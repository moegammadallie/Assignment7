package me.moegammadallie.service.patientInfo.impl;

import me.moegammadallie.domain.patientInfo.PatientDiagnosis;
import me.moegammadallie.repository.patientInfo.PatientDiagnosisRepository;
import me.moegammadallie.repository.patientInfo.impl.PatientDiagnosisRepositoryImpl;
import me.moegammadallie.service.patientInfo.PatientDiagnosisService;

import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public class PatientDiagnosisServiceImpl implements PatientDiagnosisService {
    private static PatientDiagnosisServiceImpl service = null;
    private PatientDiagnosisRepository repository;

    private PatientDiagnosisServiceImpl() {
        this.repository = PatientDiagnosisRepositoryImpl.getRepository();
    }

    public static PatientDiagnosisServiceImpl getService(){
        if(service == null) service = new PatientDiagnosisServiceImpl();
        return service;
    }

    @Override
    public Set<PatientDiagnosis> getAll() {
        return this.repository.getAll();
    }

    @Override
    public PatientDiagnosis create(PatientDiagnosis pd) {
        return this.repository.create(pd);
    }

    @Override
    public PatientDiagnosis update(PatientDiagnosis pd) {
        return this.repository.update(pd);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public PatientDiagnosis read(String s) {
        return this.repository.read(s);
    }
}
