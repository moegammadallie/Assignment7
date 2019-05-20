package ac.za.cput.project.service.billing;

import ac.za.cput.project.domain.billing.PatientBilling;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface PatientBillingService extends IService<PatientBilling,String> {
    Set<PatientBilling> getAll();
}
