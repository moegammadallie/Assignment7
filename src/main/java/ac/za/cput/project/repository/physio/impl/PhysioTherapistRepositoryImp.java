package ac.za.cput.project.repository.physio.impl;

import ac.za.cput.project.domain.physio.PhysioTherapist;
import ac.za.cput.project.repository.physio.PhysioTherapistRepository;

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
