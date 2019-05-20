package ac.za.cput.project.repository.physio;

import ac.za.cput.project.domain.physio.PTSchedule;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface PTScheduleRepository extends IRepository<PTSchedule,String> {
        Set<PTSchedule> getAll();
}
