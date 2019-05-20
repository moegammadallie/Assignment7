package ac.za.cput.project.repository.billing;

import ac.za.cput.project.domain.billing.PrivateBilling;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface PrivateBillingRepository extends IRepository<PrivateBilling,String> {
    Set<PrivateBilling> getAll();
}
