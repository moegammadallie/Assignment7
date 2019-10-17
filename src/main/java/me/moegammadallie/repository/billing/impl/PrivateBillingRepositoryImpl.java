package me.moegammadallie.repository.billing.impl;

import me.moegammadallie.domain.billing.PrivateBilling;
import me.moegammadallie.repository.billing.PrivateBillingRepository;

import java.util.HashSet;
import java.util.Set;

public class PrivateBillingRepositoryImpl implements PrivateBillingRepository {

    private static PrivateBillingRepositoryImpl repository = null;
    private Set<PrivateBilling> PrivateBillingRepositorys;

    private PrivateBillingRepositoryImpl() {
        this.PrivateBillingRepositorys = new HashSet<>();
    }

    public static PrivateBillingRepository getRepository(){
        if(repository == null) repository = new PrivateBillingRepositoryImpl();
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
