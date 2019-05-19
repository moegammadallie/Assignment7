package service.occupational;

import domain.occupational.OTAvailability;
import service.IService;

import java.util.Set;

public interface OTAvailabilityRespository extends IService<OTAvailability, String> {
    Set<OTAvailability> getAll();
}
