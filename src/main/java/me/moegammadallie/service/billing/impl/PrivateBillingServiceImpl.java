package me.moegammadallie.service.billing.impl;

import me.moegammadallie.domain.billing.PrivateBilling;
import me.moegammadallie.repository.billing.PrivateBillingRepository;
import me.moegammadallie.repository.billing.impl.PrivateBillingRepositoryImpl;
import me.moegammadallie.service.billing.PrivateBillingService;

import org.springframework.stereotype.Service;

import java.util.Set;
@Service

public class PrivateBillingServiceImpl implements PrivateBillingService {

    private static PrivateBillingServiceImpl service = null;
    private PrivateBillingRepository repository;

    private PrivateBillingServiceImpl() {
        this.repository = PrivateBillingRepositoryImpl.getRepository();
    }

    public static PrivateBillingServiceImpl getService() {
        if (service == null) service = new PrivateBillingServiceImpl();
        return service;
    }

    @Override
    public Set<PrivateBilling> getAll() {
        return this.repository.getAll();
    }

    @Override
    public PrivateBilling create(PrivateBilling privateBilling) {
        return this.repository.create(privateBilling);
    }

    @Override
    public PrivateBilling update(PrivateBilling privateBilling) {
        return this.repository.update(privateBilling);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public PrivateBilling read(String s) {
        return this.repository.read(s);
    }
}
