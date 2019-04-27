package repository;

import domain.actors.OccupationalTherapist;

import java.util.HashSet;
import java.util.Set;

public interface OccupationalTherapistRepository extends IRepository<OccupationalTherapist, String>{
    Set<OccupationalTherapist> getAll();
}
