package ac.za.cput.project.service.physio;

import ac.za.cput.project.domain.physio.PTSchedule;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface PTScheduleService extends IService<PTSchedule,String> {
        Set<PTSchedule> getAll();
}
