package ac.za.cput.project.service.physio;

import ac.za.cput.project.domain.physio.PhysioTherapist;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface PhysioTherapistService extends IService<PhysioTherapist, String> {
        Set<PhysioTherapist> getAll();
}
