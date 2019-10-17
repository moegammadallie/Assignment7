package me.moegammadallie.repository.billing.impl;

import me.moegammadallie.domain.billing.PatientBilling;
import me.moegammadallie.repository.billing.PatientBillingRepository;
import me.moegammadallie.domain.billing.PatientBilling;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PatientBillingRepositoryImpl implements PatientBillingRepository {

    private static PatientBillingRepositoryImpl repository = null;
    private Set<PatientBilling> PatientBillingRepositorys;

    private PatientBillingRepositoryImpl() {
        this.PatientBillingRepositorys = new HashSet<>();
    }

    public static PatientBillingRepository getRepository(){
        if(repository == null) repository = new PatientBillingRepositoryImpl();
        return repository;
    }

    private PatientBilling findPatientBilling(String medAid){
        return this.PatientBillingRepositorys.stream()
                .filter(PatientBilling -> Objects.equals(PatientBilling.getClass(), PatientBilling)).findAny().orElse(null);
    }

    @Override
    public Set<PatientBilling> getAll() {
        return PatientBillingRepositorys;
    }

    @Override
    public PatientBilling create(PatientBilling patientBilling) {
        this.PatientBillingRepositorys.add(patientBilling);
        return patientBilling;
    }

    @Override
    public PatientBilling update(PatientBilling patientBilling) {
        String id = Integer.toString(patientBilling.getHours());
        PatientBilling pFind = findPatientBilling(id);
        PatientBillingRepositorys.remove(pFind);
        PatientBillingRepositorys.add(patientBilling);
        return null;
    }

    @Override
    public void delete(String s) {
        PatientBilling patientBilling = findPatientBilling(s);
        PatientBillingRepositorys.remove(patientBilling);
    }

    @Override
    public PatientBilling read(String s) {
        PatientBilling patientBilling = findPatientBilling(s);
        return patientBilling == null ? null : patientBilling;
    }
}
