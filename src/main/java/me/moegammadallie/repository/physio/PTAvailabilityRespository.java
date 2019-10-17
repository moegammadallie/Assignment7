package me.moegammadallie.repository.physio;

import me.moegammadallie.domain.physio.PTAvailability;
import me.moegammadallie.repository.IRepository;
import me.moegammadallie.domain.physio.PTAvailability;

import java.util.Set;

public interface PTAvailabilityRespository extends IRepository<PTAvailability, String> {
    Set<PTAvailability> getAll();
}
