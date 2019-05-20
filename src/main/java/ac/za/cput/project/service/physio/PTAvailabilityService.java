package ac.za.cput.project.service.physio;

import ac.za.cput.project.domain.physio.PTAvailability;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface PTAvailabilityService extends IService<PTAvailability, String> {
    Set<PTAvailability> getAll();
}
