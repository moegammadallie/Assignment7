package service.physio.impl;

import domain.physio.PhysioTherapist;
import service.physio.PhysioTherapistService;

import java.util.HashSet;
import java.util.Set;

public class PhysioTherapistServiceImp implements PhysioTherapistService {

    private static PhysioTherapistServiceImp repository = null;
    private Set<PhysioTherapist> PhysioTherapistRepositorys;

    private PhysioTherapistServiceImp() {
        this.PhysioTherapistRepositorys = new HashSet<>();
    }

    public static PhysioTherapistService getRepository(){
        if(repository == null) repository = new PhysioTherapistServiceImp();
        return repository;
    }

    @Override
    public Set<PhysioTherapist> getAll() {
        return PhysioTherapistRepositorys;
    }

    @Override
    public PhysioTherapist create(PhysioTherapist physioTherapist) {
        this.PhysioTherapistRepositorys.add(physioTherapist);
        return physioTherapist;
    }

    @Override
    public PhysioTherapist update(PhysioTherapist physioTherapist) {
        String id = physioTherapist.getQualification();
        PhysioTherapist ptFind = findPhysioTherapist(id);
        PhysioTherapistRepositorys.remove(ptFind);
        PhysioTherapistRepositorys.add(physioTherapist);

        return null;
    }

    @Override
    public void delete(String s) {
        PhysioTherapist physioTherapist = findPhysioTherapist(s);
        PhysioTherapistRepositorys.remove(physioTherapist);
    }

    private PhysioTherapist findPhysioTherapist(String physioTherapist){
        return this.PhysioTherapistRepositorys.stream()
                .filter(PhysioTherapist -> PhysioTherapist.getQualification().trim()
                .equals(PhysioTherapist)).findAny().orElse(null);
    }

    @Override
    public PhysioTherapist read(String s) {
        PhysioTherapist physioTherapist = findPhysioTherapist(s);
        return physioTherapist == null ? null : physioTherapist;
    }
}
