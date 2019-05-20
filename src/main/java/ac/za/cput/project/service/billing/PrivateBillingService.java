package ac.za.cput.project.service.billing;

import ac.za.cput.project.domain.billing.PrivateBilling;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface PrivateBillingService extends IService<PrivateBilling,String> {
    Set<PrivateBilling> getAll();
}
