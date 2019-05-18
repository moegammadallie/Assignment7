package repository.physio;

import domain.physio.PTSchedule;
import repository.IRepository;

import java.util.Set;

public interface PTScheduleRepository extends IRepository<PTSchedule,String> {
        Set<PTSchedule> getAll();
}
