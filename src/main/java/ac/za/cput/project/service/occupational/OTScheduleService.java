package ac.za.cput.project.service.occupational;

import ac.za.cput.project.domain.occupational.OTSchedule;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface OTScheduleService extends IService<OTSchedule,String> {
    Set<OTSchedule> getAll();
}
