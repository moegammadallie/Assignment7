package service.physio;

import domain.physio.PhysioTherapist;
import service.IService;

import java.util.Set;

public interface PhysioTherapistService extends IService<PhysioTherapist, String> {
        Set<PhysioTherapist> getAll();
}
