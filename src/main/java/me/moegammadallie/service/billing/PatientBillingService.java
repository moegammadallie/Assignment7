package me.moegammadallie.service.billing;

import me.moegammadallie.domain.billing.PatientBilling;
import me.moegammadallie.service.IService;
import me.moegammadallie.domain.billing.PatientBilling;

import java.util.Set;

public interface PatientBillingService extends IService<PatientBilling,String> {
    Set<PatientBilling> getAll();
}
