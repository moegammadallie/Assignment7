package service.occupational.impl;

import domain.occupational.OccupationalTherapist;
import service.occupational.OccupationalTherapistService;

import java.util.HashSet;
import java.util.Set;

public class OccupationalTherapistServiceImpl implements OccupationalTherapistService {

    private static OccupationalTherapistServiceImpl repository = null;
    private Set<OccupationalTherapist> OccupationalTherapists;

    private OccupationalTherapistServiceImpl() {
        this.OccupationalTherapists = new HashSet<>();
    }

    public static OccupationalTherapistService getRepository(){
        if(repository == null) repository = new OccupationalTherapistServiceImpl();
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
