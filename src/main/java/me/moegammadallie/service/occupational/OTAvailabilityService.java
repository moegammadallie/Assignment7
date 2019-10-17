package me.moegammadallie.service.occupational;

import me.moegammadallie.domain.occupational.OTAvailability;
import me.moegammadallie.service.IService;

import java.util.Set;

public interface OTAvailabilityService extends IService<OTAvailability, String> {
    Set<OTAvailability> getAll();
}
