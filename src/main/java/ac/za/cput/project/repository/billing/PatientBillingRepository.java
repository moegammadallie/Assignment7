package ac.za.cput.project.repository.billing;

import ac.za.cput.project.domain.billing.PatientBilling;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface PatientBillingRepository extends IRepository<PatientBilling,String> {
    Set<PatientBilling> getAll();
}
