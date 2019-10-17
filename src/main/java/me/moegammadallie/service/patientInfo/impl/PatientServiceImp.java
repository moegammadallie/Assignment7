package me.moegammadallie.service.patientInfo.impl;

import me.moegammadallie.domain.Patient;
import me.moegammadallie.repository.PatientRepository;
import me.moegammadallie.repository.patientInfo.impl.PatientRepositoryImp;
import me.moegammadallie.service.patientInfo.PatientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PatientServiceImp implements PatientService {

    private static PatientServiceImp service = null;
    @Autowired
    private PatientRepository repository;

    private PatientServiceImp() {

    }

    public static PatientServiceImp getService(){
        if(service == null) service = new PatientServiceImp();
        return service;
    }

    @Override
    public Set<Patient> getAll() {
        return new HashSet<>((List<Patient>)this.repository.findAll());
    }

    @Override
    public Patient create(Patient patient) {
        return this.repository.save(patient);
    }

    @Override
    public Patient update(Patient patient) {
        return this.repository.save(patient);
    }

    @Override
    public void delete(String s) {
        this.repository.deleteById(s);
    }

    @Override
    public Patient read(String s) {
        return this.repository.findById(s).orElse(null);
    }
}
