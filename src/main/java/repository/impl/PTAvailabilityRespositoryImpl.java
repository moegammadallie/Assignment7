package repository.impl;

import domain.physio.PTAvailability;
import repository.physio.PTAvailabilityRespository;

import java.util.HashSet;
import java.util.Set;

public class PTAvailabilityRespositoryImpl implements PTAvailabilityRespository {

    private static PTAvailabilityRespositoryImpl repository = null;
    private Set<PTAvailability> PTAvailabilityRepositories;

    private PTAvailabilityRespositoryImpl() {
        this.PTAvailabilityRepositories = new HashSet<>();
    }

    public static PTAvailabilityRespository getRepository(){
        if(repository == null) repository = new PTAvailabilityRespositoryImpl();
        return repository;
    }

    @Override
    public Set<PTAvailability> getAll() {
        return PTAvailabilityRepositories;
    }

    private PTAvailability findPTAvailability(String PTA){
        return this.PTAvailabilityRepositories.stream()
                .filter(PTAvailability -> PTAvailability.getPTBooked()
                        .equals(PTAvailability)).findAny().orElse(null);
    }

    @Override
    public PTAvailability create(PTAvailability ptAvailability) {
        this.PTAvailabilityRepositories.add(ptAvailability);
        return ptAvailability;
    }

    @Override
    public PTAvailability update(PTAvailability ptAvailability) {
        String id = String.valueOf(ptAvailability.getPTBooked());
        PTAvailability pFind = findPTAvailability(id);
        PTAvailabilityRepositories.remove(pFind);
        PTAvailabilityRepositories.add(ptAvailability);
        return null;
    }

    @Override
    public void delete(String s) {
        PTAvailability pta = findPTAvailability(s);
        PTAvailabilityRepositories.remove(pta);
    }

    @Override
    public PTAvailability read(String s) {
        PTAvailability pta = findPTAvailability(s);
        return pta == null ? null : pta;
    }
}
