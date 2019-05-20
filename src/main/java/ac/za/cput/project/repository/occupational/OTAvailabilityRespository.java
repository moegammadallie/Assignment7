package ac.za.cput.project.repository.occupational;

import ac.za.cput.project.domain.occupational.OTAvailability;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface OTAvailabilityRespository extends IRepository<OTAvailability, String> {
    Set<OTAvailability> getAll();
}
