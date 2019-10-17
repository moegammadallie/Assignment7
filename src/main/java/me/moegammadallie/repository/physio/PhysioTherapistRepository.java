package me.moegammadallie.repository.physio;

import me.moegammadallie.domain.physio.PhysioTherapist;
import me.moegammadallie.repository.IRepository;

import java.util.Set;

public interface PhysioTherapistRepository  extends IRepository<PhysioTherapist, String> {
        Set<PhysioTherapist> getAll();
}
