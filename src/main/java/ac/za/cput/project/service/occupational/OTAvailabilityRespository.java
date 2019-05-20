package ac.za.cput.project.service.occupational;

import ac.za.cput.project.domain.occupational.OTAvailability;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface OTAvailabilityRespository extends IService<OTAvailability, String> {
    Set<OTAvailability> getAll();
}
