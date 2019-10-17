package me.moegammadallie.repository.physio;

import me.moegammadallie.domain.physio.PTSchedule;
import me.moegammadallie.repository.IRepository;

import java.util.Set;

public interface PTScheduleRepository extends IRepository<PTSchedule,String> {
        Set<PTSchedule> getAll();
}
