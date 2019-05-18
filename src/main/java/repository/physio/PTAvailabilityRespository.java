package repository.physio;

import domain.physio.PTAvailability;
import repository.IRepository;

import java.util.Set;

public interface PTAvailabilityRespository extends IRepository<PTAvailability, String> {
    Set<PTAvailability> getAll();
}
