package ac.za.cput.project.service.patientInfo.impl;

import ac.za.cput.project.domain.patientInfo.Patient;
import ac.za.cput.project.repository.patientInfo.PatientRepository;
import ac.za.cput.project.repository.patientInfo.impl.PatientRepositoryImp;
import ac.za.cput.project.service.patientInfo.PatientService;

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
