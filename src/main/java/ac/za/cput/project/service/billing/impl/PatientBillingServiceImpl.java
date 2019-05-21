package ac.za.cput.project.service.billing.impl;

import ac.za.cput.project.domain.billing.PatientBilling;
import ac.za.cput.project.repository.billing.PatientBillingRepository;
import ac.za.cput.project.repository.billing.impl.PatientBillingRepositoryImpl;
import ac.za.cput.project.service.billing.PatientBillingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("PatientBillingServiceImpl")

public class PatientBillingServiceImpl implements PatientBillingService {

    private static PatientBillingServiceImpl service = null;
    private PatientBillingRepository repository;

    private PatientBillingServiceImpl() {
        this.repository = PatientBillingRepositoryImpl.getRepository();
    }

    public static PatientBillingServiceImpl getService() {
        if (service == null) service = new PatientBillingServiceImpl();
        return service;
    }

    @Override
    public Set<PatientBilling> getAll() {
        return this.repository.getAll();
    }

    @Override
    public PatientBilling create(PatientBilling patientBilling) {
        return this.repository.create(patientBilling);
    }

    @Override
    public PatientBilling update(PatientBilling patientBilling) {
        return this.repository.update(patientBilling);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public PatientBilling read(String s) {
        return this.repository.read(s);
    }
}