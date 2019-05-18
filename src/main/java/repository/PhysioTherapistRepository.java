package repository;

import domain.physio.PhysioTherapist;

import java.util.Set;

public interface PhysioTherapistRepository  extends IRepository<PhysioTherapist, String>{
        Set<PhysioTherapist> getAll();
}
