package me.moegammadallie.service.occupational;

import me.moegammadallie.domain.occupational.OccupationalTherapist;
import me.moegammadallie.service.IService;

import java.util.Set;

public interface OccupationalTherapistService extends IService<OccupationalTherapist, String> {
    Set<OccupationalTherapist> getAll();
}
