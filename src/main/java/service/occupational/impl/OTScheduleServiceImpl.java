package service.occupational.impl;

import domain.occupational.OTSchedule;
import repository.occupational.OTScheduleRepository;
import repository.occupational.impl.OTScheduleRepositoryImpl;
import service.occupational.OTScheduleService;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

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
