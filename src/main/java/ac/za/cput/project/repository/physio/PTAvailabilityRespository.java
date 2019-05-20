package ac.za.cput.project.repository.physio;

import ac.za.cput.project.domain.physio.PTAvailability;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface PTAvailabilityRespository extends IRepository<PTAvailability, String> {
    Set<PTAvailability> getAll();
}
