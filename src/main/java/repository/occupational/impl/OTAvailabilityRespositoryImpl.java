package repository.occupational.impl;

import domain.occupational.OTAvailability;
import repository.occupational.OTAvailabilityRespository;

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
        this.OTAvailabilityRepositories.add(otAvailability);
        return otAvailability;
    }

    @Override
    public OTAvailability update(OTAvailability otAvailability) {
        String id = String.valueOf(otAvailability.getOTBooked());
        OTAvailability pFind = findOTAvailability(id);
        OTAvailabilityRepositories.remove(pFind);
        OTAvailabilityRepositories.add(otAvailability);
        return null;
    }

    @Override
    public void delete(String s) {
        OTAvailability OTA = findOTAvailability(s);
        OTAvailabilityRepositories.remove(OTA);
    }

    @Override
    public OTAvailability read(String s) {
        OTAvailability OTA = findOTAvailability(s);
        return OTA == null ? null : OTA;
    }
}
