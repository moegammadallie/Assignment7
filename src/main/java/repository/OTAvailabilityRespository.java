package repository;

import domain.occupational.OTAvailability;

import java.util.Set;

public interface OTAvailabilityRespository extends IRepository<OTAvailability, String> {
    Set<OTAvailability> getAll();
}
