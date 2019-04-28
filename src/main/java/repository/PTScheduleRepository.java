package repository;

import domain.services.PTSchedule;

import java.util.Set;

public interface PTScheduleRepository extends IRepository<PTSchedule,String> {
        Set<PTSchedule> getAll();
}
