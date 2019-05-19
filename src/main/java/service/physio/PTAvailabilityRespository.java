package service.physio;

import domain.physio.PTAvailability;
import service.IService;

import java.util.Set;

public interface PTAvailabilityRespository extends IService<PTAvailability, String> {
    Set<PTAvailability> getAll();
}
