package repository;

import domain.physio.PTAvailability;

import java.util.Set;

public interface PTAvailabilityRespository extends IRepository<PTAvailability, String> {
    Set<PTAvailability> getAll();
}
