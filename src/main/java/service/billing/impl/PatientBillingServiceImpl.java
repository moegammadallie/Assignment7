package service.billing.impl;

import domain.billing.PatientBilling;
import service.billing.PatientBillingService;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PatientBillingServiceImpl implements PatientBillingService {

    private static PatientBillingServiceImpl repository = null;
    private Set<PatientBilling> PatientBillingRepositorys;

    private PatientBillingServiceImpl() {
        this.PatientBillingRepositorys = new HashSet<>();
    }

    public static PatientBillingService getRepository(){
        if(repository == null) repository = new PatientBillingServiceImpl();
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
