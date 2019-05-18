package repository;

import domain.physio.PTSchedule;

import java.util.Set;

public interface PTScheduleRepository extends IRepository<PTSchedule,String> {
        Set<PTSchedule> getAll();
}
