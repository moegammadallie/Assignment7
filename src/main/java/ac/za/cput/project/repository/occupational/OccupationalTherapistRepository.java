package ac.za.cput.project.repository.occupational;

import ac.za.cput.project.domain.occupational.OccupationalTherapist;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface OccupationalTherapistRepository extends IRepository<OccupationalTherapist, String> {
    Set<OccupationalTherapist> getAll();
}
