package repository;

import domain.occupational.OccupationalTherapist;

import java.util.Set;

public interface OccupationalTherapistRepository extends IRepository<OccupationalTherapist, String>{
    Set<OccupationalTherapist> getAll();
}
