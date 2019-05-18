package repository.billing;

import domain.billing.PrivateBilling;
import repository.IRepository;

import java.util.Set;

public interface PrivateBillingRepository extends IRepository<PrivateBilling,String> {
    Set<PrivateBilling> getAll();
}
