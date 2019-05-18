package repository.physio;

import domain.physio.PhysioTherapist;
import repository.IRepository;

import java.util.Set;

public interface PhysioTherapistRepository  extends IRepository<PhysioTherapist, String> {
        Set<PhysioTherapist> getAll();
}
