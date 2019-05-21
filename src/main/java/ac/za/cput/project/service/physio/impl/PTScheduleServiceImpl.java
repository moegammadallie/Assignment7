package ac.za.cput.project.service.physio.impl;

import ac.za.cput.project.domain.physio.PTSchedule;
import ac.za.cput.project.repository.physio.PTScheduleRepository;
import ac.za.cput.project.repository.physio.impl.PTScheduleRepositoryImpl;
import ac.za.cput.project.service.physio.PTScheduleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("PTScheduleServiceImpl")
public class PTScheduleServiceImpl implements PTScheduleService {

    private static PTScheduleServiceImpl service = null;
    private PTScheduleRepository repository;

    private PTScheduleServiceImpl() {
        this.repository = PTScheduleRepositoryImpl.getRepository();
    }

    public static PTScheduleServiceImpl getService(){
        if(service == null) service = new PTScheduleServiceImpl();
        return service;
    }

    @Override
    public Set<PTSchedule> getAll() {
        return this.repository.getAll();
    }

    @Override
    public PTSchedule create(PTSchedule pts) {
        return this.repository.create(pts);
    }

    @Override
    public PTSchedule update(PTSchedule pts) {
        return this.repository.update(pts);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public PTSchedule read(String s) {
        return this.repository.read(s);
    }
}
