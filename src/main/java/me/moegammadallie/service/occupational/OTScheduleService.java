package me.moegammadallie.service.occupational;

import me.moegammadallie.domain.occupational.OTSchedule;
import me.moegammadallie.service.IService;

import java.util.Set;

public interface OTScheduleService extends IService<OTSchedule,String> {
    Set<OTSchedule> getAll();
}
