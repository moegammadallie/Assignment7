package ac.za.cput.project.service.patientInfo.impl;

import ac.za.cput.project.domain.patientInfo.PatientDiagnosis;
import ac.za.cput.project.repository.patientInfo.PatientDiagnosisRepository;
import ac.za.cput.project.repository.patientInfo.impl.PatientDiagnosisRepositoryImpl;
import ac.za.cput.project.service.patientInfo.PatientDiagnosisService;

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
