package service.patientInfo.impl;

import domain.patientInfo.PatientDiagnosis;
import repository.patientInfo.PatientDiagnosisRepository;
import repository.patientInfo.impl.PatientDiagnosisRepositoryImpl;
import service.patientInfo.PatientDiagnosisService;

import java.util.HashSet;
import java.util.Set;

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
