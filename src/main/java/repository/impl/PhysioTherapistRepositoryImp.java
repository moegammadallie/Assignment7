package repository.impl;

import domain.actors.PhysioTherapist;
import repository.PhysioTherapistRepository;

import java.util.HashSet;
import java.util.Set;

public class PhysioTherapistRepositoryImp implements PhysioTherapistRepository {

    private static PhysioTherapistRepositoryImp repository = null;
    private Set<PhysioTherapist> PhysioTherapistRepositorys;

    private PhysioTherapistRepositoryImp() {
        this.PhysioTherapistRepositorys = new HashSet<>();
    }

    public static PhysioTherapistRepository getRepository(){
        if(repository == null) repository = new PhysioTherapistRepositoryImp();
        return repository;
    }

    @Override
    public Set<PhysioTherapist> getAll() {
        return null;
    }

    @Override
    public PhysioTherapist create(PhysioTherapist physioTherapist) {
        return null;
    }

    @Override
    public PhysioTherapist update(PhysioTherapist physioTherapist) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public PhysioTherapist read(String s) {
        return null;
    }
}
