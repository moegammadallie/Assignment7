package repository.occupational;

import domain.occupational.OTAvailability;
import repository.IRepository;

import java.util.Set;

public interface OTAvailabilityRespository extends IRepository<OTAvailability, String> {
    Set<OTAvailability> getAll();
}
