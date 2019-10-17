package me.moegammadallie.repository.patientInfo.impl;

import me.moegammadallie.domain.patientInfo.Patient;
import me.moegammadallie.repository.patientInfo.PatientRepository;

import java.util.HashSet;
import java.util.Set;

public class PatientRepositoryImp implements PatientRepository {

    private static PatientRepositoryImp repository = null;
    private Set<Patient> PatientRepositorys;

    private PatientRepositoryImp() {
        this.PatientRepositorys = new HashSet<>();
    }

    public static PatientRepository getRepository(){
        if(repository == null) repository = new PatientRepositoryImp();
        return repository;
    }

    @Override
    public Set<Patient> getAll() {
        return PatientRepositorys;
    }

    @Override
    public Patient create(Patient patient) {
        this.PatientRepositorys.add(patient);
        return patient;
    }

    @Override
    public Patient update(Patient patient) {
        String id = patient.getPatientID();
        Patient pFind = findPatient(id);
        PatientRepositorys.remove(pFind);
        PatientRepositorys.add(patient);
        return null;
    }

    @Override
    public void delete(String s) {
        Patient patient = findPatient(s);
        PatientRepositorys.remove(patient);
    }

    private Patient findPatient(String patient){
        return this.PatientRepositorys.stream()
            .filter(Patient -> Patient.getPatientID().trim()
            .equals(Patient)).findAny().orElse(null);
    }

    @Override
    public Patient read(String s) {
        Patient patient = findPatient(s);
        return patient == null ? null : patient;
    }
}
