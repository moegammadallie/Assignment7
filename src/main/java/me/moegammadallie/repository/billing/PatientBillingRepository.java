package me.moegammadallie.repository.billing;

import me.moegammadallie.domain.billing.PatientBilling;
import me.moegammadallie.repository.IRepository;
import me.moegammadallie.domain.billing.PatientBilling;

import java.util.Set;

public interface PatientBillingRepository extends IRepository<PatientBilling,String> {
    Set<PatientBilling> getAll();
}
