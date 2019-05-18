package repository.occupational;

import domain.occupational.OTSchedule;
import repository.IRepository;

import java.util.Set;

public interface OTScheduleRepository extends IRepository<OTSchedule,String> {
    Set<OTSchedule> getAll();
}
