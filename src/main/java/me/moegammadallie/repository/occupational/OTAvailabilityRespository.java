package me.moegammadallie.repository.occupational;

import me.moegammadallie.domain.occupational.OTAvailability;
import me.moegammadallie.repository.IRepository;

import java.util.Set;

public interface OTAvailabilityRespository extends IRepository<OTAvailability, String> {
    Set<OTAvailability> getAll();
}
