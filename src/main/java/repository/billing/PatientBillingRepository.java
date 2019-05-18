package repository.billing;

import domain.billing.PatientBilling;
import repository.IRepository;

import java.util.Set;

public interface PatientBillingRepository extends IRepository<PatientBilling,String> {
    Set<PatientBilling> getAll();
}
