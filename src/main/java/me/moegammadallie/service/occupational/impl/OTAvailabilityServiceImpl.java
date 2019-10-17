package me.moegammadallie.service.occupational.impl;

import me.moegammadallie.domain.occupational.OTAvailability;
import me.moegammadallie.repository.occupational.OTAvailabilityRespository;
import me.moegammadallie.repository.occupational.impl.OTAvailabilityRespositoryImpl;
import me.moegammadallie.repository.occupational.OTAvailabilityRespository;
import me.moegammadallie.repository.occupational.impl.OTAvailabilityRespositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service


public class OTAvailabilityServiceImpl implements OTAvailabilityRespository {

    private static OTAvailabilityServiceImpl service = null;
    private OTAvailabilityRespository repository;

    private OTAvailabilityServiceImpl() {
        this.repository = OTAvailabilityRespositoryImpl.getRepository();
    }

    public static OTAvailabilityServiceImpl getService(){
        if(service == null) service = new OTAvailabilityServiceImpl();
        return service;
    }

    @Override
    public Set<OTAvailability> getAll() {
        return this.repository.getAll();
    }

    @Override
    public OTAvailability create(OTAvailability ota) {
        return this.repository.create(ota);
    }

    @Override
    public OTAvailability update(OTAvailability ota) {
        return this.repository.update(ota);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public OTAvailability read(String s) {
        return this.repository.read(s);
    }
}
