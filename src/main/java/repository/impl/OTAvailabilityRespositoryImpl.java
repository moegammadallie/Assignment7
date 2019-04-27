package repository.impl;

import domain.services.OTAvailability;
import repository.OTAvailabilityRespository;

import java.util.HashSet;
import java.util.Set;

public class OTAvailabilityRespositoryImpl implements OTAvailabilityRespository {

    private static OTAvailabilityRespositoryImpl repository = null;
    private Set<OTAvailability> OTAvailabilityRepositories;

    private OTAvailabilityRespositoryImpl() {
        this.OTAvailabilityRepositories = new HashSet<>();
    }

    public static OTAvailabilityRespository getRepository(){
        if(repository == null) repository = new OTAvailabilityRespositoryImpl();
        return repository;
    }

    @Override
    public Set<OTAvailability> getAll() {
        return OTAvailabilityRepositories;
    }

    private OTAvailability findOTAvailability(String OTA){
        return this.OTAvailabilityRepositories.stream()
                .filter(OTAvailability -> OTAvailability.getOTBooked()
                .equals(OTAvailability)).findAny().orElse(null);
    }

    @Override
    public OTAvailability create(OTAvailability otAvailability) {
        return null;
    }

    @Override
    public OTAvailability update(OTAvailability otAvailability) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public OTAvailability read(String s) {
        return null;
    }
}
