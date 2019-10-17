package me.moegammadallie.repository.occupational;

import me.moegammadallie.domain.occupational.OccupationalTherapist;
import me.moegammadallie.repository.IRepository;

import java.util.Set;

public interface OccupationalTherapistRepository extends IRepository<OccupationalTherapist, String> {
    Set<OccupationalTherapist> getAll();
}
