package me.moegammadallie.repository.billing;

import me.moegammadallie.domain.billing.PrivateBilling;
import me.moegammadallie.repository.IRepository;
import me.moegammadallie.domain.billing.PrivateBilling;

import java.util.Set;

public interface PrivateBillingRepository extends IRepository<PrivateBilling,String> {
    Set<PrivateBilling> getAll();
}
