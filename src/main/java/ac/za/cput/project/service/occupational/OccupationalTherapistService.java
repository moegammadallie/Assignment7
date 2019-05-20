package ac.za.cput.project.service.occupational;

import ac.za.cput.project.domain.occupational.OccupationalTherapist;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface OccupationalTherapistService extends IService<OccupationalTherapist, String> {
    Set<OccupationalTherapist> getAll();
}
