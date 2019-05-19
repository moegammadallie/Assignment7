package service.occupational.impl;

import domain.occupational.OTSchedule;
import service.occupational.OTScheduleService;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

public class OTScheduleServiceImpl implements OTScheduleService {

    private static OTScheduleServiceImpl repository = null;
    private Set<OTSchedule> OTScheduleRepositorys;

    private OTScheduleServiceImpl() {
        this.OTScheduleRepositorys = new HashSet<>();
    }

    public static OTScheduleService getRepository(){
        if(repository == null) repository = new OTScheduleServiceImpl();
        return repository;
    }

    private OTSchedule findOTSchedule(String OTS){
        return this.OTScheduleRepositorys.stream()
                .filter(OTSchedule -> OTSchedule.getOTDate()
                        .equals(OTSchedule)).findAny().orElse(null);
    }

    @Override
    public Set<OTSchedule> getAll() {
        return OTScheduleRepositorys;
    }

    @Override
    public OTSchedule create(OTSchedule otSchedule) {
        this.OTScheduleRepositorys.add(otSchedule);
        return otSchedule;
    }

    @Override
    public OTSchedule update(OTSchedule otSchedule) {
        Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String id = formatter.format(otSchedule.getOTDate());

        OTSchedule pFind = findOTSchedule(id);
        OTScheduleRepositorys.remove(pFind);
        OTScheduleRepositorys.add(otSchedule);
        return null;
    }

    @Override
    public void delete(String s) {
        OTSchedule OTS = findOTSchedule(s);
        OTScheduleRepositorys.remove(OTS);
    }

    @Override
    public OTSchedule read(String s) {
        OTSchedule OTS = findOTSchedule(s);
        return OTS == null ? null : OTS;
    }
}
