package repository.impl;

import domain.occupational.OccupationalTherapist;
import repository.OccupationalTherapistRepository;

import java.util.HashSet;
import java.util.Set;

public class OccupationalTherapistRepositoryImpl implements OccupationalTherapistRepository {

    private static OccupationalTherapistRepositoryImpl repository = null;
    private Set<OccupationalTherapist> OccupationalTherapists;

    private OccupationalTherapistRepositoryImpl() {
        this.OccupationalTherapists = new HashSet<>();
    }

    public static OccupationalTherapistRepository getRepository(){
        if(repository == null) repository = new OccupationalTherapistRepositoryImpl();
        return repository;
    }

    @Override
    public Set<OccupationalTherapist> getAll() {
        return this.OccupationalTherapists;
    }

    @Override
    public OccupationalTherapist create(OccupationalTherapist occupationalTherapist) {
        this.OccupationalTherapists.add(occupationalTherapist);
        return occupationalTherapist;
    }

    @Override
    public OccupationalTherapist update(OccupationalTherapist occupationalTherapist) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    private OccupationalTherapist findOT(String OTQualification){
        return this.OccupationalTherapists.stream()
                .filter(OccupationalTherapist -> OccupationalTherapist.getQualification().trim()
                .equals(OTQualification.trim())).findAny().orElse(null);
    }

    @Override
    public OccupationalTherapist read(String s) {
        OccupationalTherapist occupationalTherapist = findOT(s);
        return occupationalTherapist == null ? null :occupationalTherapist;
    }
}
