package service.physio.impl;

import domain.physio.PTAvailability;
import repository.physio.PTAvailabilityRespository;
import repository.physio.impl.PTAvailabilityRespositoryImpl;
import service.physio.PTAvailabilityService;

import java.util.Set;

public class PTAvailabilityServiceImpl implements PTAvailabilityService {

    private static PTAvailabilityServiceImpl service = null;
    private PTAvailabilityRespository repository;

    private PTAvailabilityServiceImpl() {
        this.repository = PTAvailabilityRespositoryImpl.getRepository();
    }

    public static PTAvailabilityServiceImpl getService(){
        if(service == null) service = new PTAvailabilityServiceImpl();
        return service;
    }

    @Override
    public Set<PTAvailability> getAll() {
        return this.repository.getAll();
    }

    @Override
    public PTAvailability create(PTAvailability pta) {
        return this.repository.create(pta);
    }

    @Override
    public PTAvailability update(PTAvailability pta) {
        return this.repository.update(pta);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public PTAvailability read(String s) {
        return this.repository.read(s);
    }
}
