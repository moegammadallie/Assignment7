package me.moegammadallie.service.physio;

import me.moegammadallie.domain.physio.PTSchedule;
import me.moegammadallie.service.IService;
import me.moegammadallie.domain.physio.PTSchedule;

import java.util.Set;

public interface PTScheduleService extends IService<PTSchedule,String> {
        Set<PTSchedule> getAll();
}
