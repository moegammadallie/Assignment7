package me.moegammadallie.service.occupational.impl;

import me.moegammadallie.domain.occupational.OTSchedule;
import me.moegammadallie.repository.occupational.OTScheduleRepository;
import me.moegammadallie.repository.occupational.impl.OTScheduleRepositoryImpl;
import me.moegammadallie.service.occupational.OTScheduleService;

import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class OTScheduleServiceImpl implements OTScheduleService {

    private static OTScheduleServiceImpl service = null;
    private OTScheduleRepository repository;

    private OTScheduleServiceImpl() {
        this.repository = OTScheduleRepositoryImpl.getRepository();
    }

    public static OTScheduleServiceImpl getServiceOTSchedule(){
        if(service == null) service = new OTScheduleServiceImpl();
        return service;
    }

    @Override
    public Set<OTSchedule> getAll() {
        return this.repository.getAll();
    }

    @Override
    public OTSchedule create(OTSchedule oTSchedule) {
        return this.repository.create(oTSchedule);
    }

    @Override
    public OTSchedule update(OTSchedule oTSchedule) {
        return this.repository.update(oTSchedule);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public OTSchedule read(String s) {
        return this.repository.read(s);
    }
}
