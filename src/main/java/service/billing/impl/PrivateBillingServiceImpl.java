package service.billing.impl;

import domain.billing.PrivateBilling;
import service.billing.PrivateBillingService;

import java.util.HashSet;
import java.util.Set;

public class PrivateBillingServiceImpl implements PrivateBillingService {

    private static PrivateBillingServiceImpl repository = null;
    private Set<PrivateBilling> PrivateBillingRepositorys;

    private PrivateBillingServiceImpl() {
        this.PrivateBillingRepositorys = new HashSet<>();
    }

    public static PrivateBillingService getRepository(){
        if(repository == null) repository = new PrivateBillingServiceImpl();
        return repository;
    }

    @Override
    public Set<PrivateBilling> getAll() {
        return PrivateBillingRepositorys;
    }

    @Override
    public PrivateBilling create(PrivateBilling privateBilling) {
        this.PrivateBillingRepositorys.add(privateBilling);
        return privateBilling;
    }

    private PrivateBilling findPrivateBilling(String privateBilling){
        return this.PrivateBillingRepositorys.stream()
                .filter(PrivateBilling -> PrivateBilling.getPaymentMethod().trim()
                        .equals(PrivateBilling)).findAny().orElse(null);
    }

    @Override
    public PrivateBilling update(PrivateBilling privateBilling) {
        String id = privateBilling.getPaymentMethod();
        PrivateBilling pFind = findPrivateBilling(id);
        PrivateBillingRepositorys.remove(pFind);
        PrivateBillingRepositorys.add(privateBilling);
        return null;
    }

    @Override
    public void delete(String s) {
        PrivateBilling privateBilling = findPrivateBilling(s);
        PrivateBillingRepositorys.remove(privateBilling);
    }

    @Override
    public PrivateBilling read(String s) {
        PrivateBilling privateBilling = findPrivateBilling(s);
        return privateBilling == null ? null : privateBilling;
    }
}