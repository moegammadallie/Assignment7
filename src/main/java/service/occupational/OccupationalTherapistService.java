package service.occupational;

import domain.occupational.OccupationalTherapist;
import service.IService;

import java.util.Set;

public interface OccupationalTherapistService extends IService<OccupationalTherapist, String> {
    Set<OccupationalTherapist> getAll();
}
