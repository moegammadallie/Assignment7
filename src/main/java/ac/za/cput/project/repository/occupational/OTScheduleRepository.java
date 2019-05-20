package ac.za.cput.project.repository.occupational;

import ac.za.cput.project.domain.occupational.OTSchedule;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface OTScheduleRepository extends IRepository<OTSchedule,String> {
    Set<OTSchedule> getAll();
}
