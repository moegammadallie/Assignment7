package service.occupational;

import domain.occupational.OTSchedule;
import service.IService;

import java.util.Set;

public interface OTScheduleService extends IService<OTSchedule,String> {
    Set<OTSchedule> getAll();
}
