package repository;

import domain.services.OTSchedule;

import java.util.Set;

public interface OTScheduleRepository extends IRepository<OTSchedule,String> {
    Set<OTSchedule> getAll();
}
