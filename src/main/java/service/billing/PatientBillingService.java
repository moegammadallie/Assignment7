package service.billing;

import domain.billing.PatientBilling;
import service.IService;

import java.util.Set;

public interface PatientBillingService extends IService<PatientBilling,String> {
    Set<PatientBilling> getAll();
}
