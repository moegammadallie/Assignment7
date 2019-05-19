package service.physio;

import domain.physio.PTSchedule;
import service.IService;

import java.util.Set;

public interface PTScheduleService extends IService<PTSchedule,String> {
        Set<PTSchedule> getAll();
}
