package me.moegammadallie.service.physio;

import me.moegammadallie.domain.physio.PTAvailability;
import me.moegammadallie.service.IService;
import me.moegammadallie.domain.physio.PTAvailability;

import java.util.Set;

public interface PTAvailabilityService extends IService<PTAvailability, String> {
    Set<PTAvailability> getAll();
}
