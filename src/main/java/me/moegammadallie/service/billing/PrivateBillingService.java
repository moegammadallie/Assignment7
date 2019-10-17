package me.moegammadallie.service.billing;

import me.moegammadallie.domain.billing.PrivateBilling;
import me.moegammadallie.service.IService;
import me.moegammadallie.domain.billing.PrivateBilling;

import java.util.Set;

public interface PrivateBillingService extends IService<PrivateBilling,String> {
    Set<PrivateBilling> getAll();
}
