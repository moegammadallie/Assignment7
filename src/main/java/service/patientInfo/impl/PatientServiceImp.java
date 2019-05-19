package service.patientInfo.impl;

import domain.patientInfo.Patient;
import repository.patientInfo.PatientRepository;
import repository.patientInfo.impl.PatientRepositoryImp;
import service.patientInfo.PatientService;

import java.util.HashSet;
import java.util.Set;

public class PatientServiceImp implements PatientService {

    private static PatientServiceImp service = null;
    private PatientRepository repository;

    private PatientServiceImp() {
        this.repository = PatientRepositoryImp.getRepository();
    }

    public static PatientServiceImp getService(){
        if(service == null) service = new PatientServiceImp();
        return service;
    }

    @Override
    public Set<Patient> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Patient create(Patient patient) {
        return this.repository.create(patient);
    }

    @Override
    public Patient update(Patient patient) {
        return this.repository.update(patient);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Patient read(String s) {
        return this.repository.read(s);
    }
}
