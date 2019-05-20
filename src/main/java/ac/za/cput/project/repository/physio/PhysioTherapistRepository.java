package ac.za.cput.project.repository.physio;

import ac.za.cput.project.domain.physio.PhysioTherapist;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface PhysioTherapistRepository  extends IRepository<PhysioTherapist, String> {
        Set<PhysioTherapist> getAll();
}
