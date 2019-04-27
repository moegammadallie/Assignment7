package repository;

import domain.actors.PhysioTherapist;

import java.util.Set;

public interface PhysioTherapistRepository  extends IRepository<PhysioTherapist, String>{
        Set<PhysioTherapist> getAll();
}
