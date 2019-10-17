package me.moegammadallie.service.physio;

import me.moegammadallie.domain.Physiotherapist;
import me.moegammadallie.domain.physio.PhysioTherapist;
import me.moegammadallie.service.IService;

import java.util.Set;

public interface PhysioTherapistService extends IService<Physiotherapist, String> {
        Set<Physiotherapist> getAll();
}
