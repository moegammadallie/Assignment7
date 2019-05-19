package service.billing;

import domain.billing.PrivateBilling;
import service.IService;

import java.util.Set;

public interface PrivateBillingService extends IService<PrivateBilling,String> {
    Set<PrivateBilling> getAll();
}
