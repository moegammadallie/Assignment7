package repository.occupational;

import domain.occupational.OccupationalTherapist;
import repository.IRepository;

import java.util.Set;

public interface OccupationalTherapistRepository extends IRepository<OccupationalTherapist, String> {
    Set<OccupationalTherapist> getAll();
}
