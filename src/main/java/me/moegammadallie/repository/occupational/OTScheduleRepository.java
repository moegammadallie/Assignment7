package me.moegammadallie.repository.occupational;

import me.moegammadallie.domain.occupational.OTSchedule;
import me.moegammadallie.repository.IRepository;

import java.util.Set;

public interface OTScheduleRepository extends IRepository<OTSchedule,String> {
    Set<OTSchedule> getAll();
}
