package service.physio.impl;

import domain.physio.PTSchedule;
import service.physio.PTScheduleService;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

public class PTScheduleServiceImpl implements PTScheduleService {

    private static PTScheduleServiceImpl repository = null;
    private Set<PTSchedule> PTScheduleRepositorys;

    private PTScheduleServiceImpl() {
        this.PTScheduleRepositorys = new HashSet<>();
    }

    public static PTScheduleService getRepository(){
        if(repository == null) repository = new PTScheduleServiceImpl();
        return repository;
    }

    private PTSchedule findPTSchedule(String PTS){
        return this.PTScheduleRepositorys.stream()
                .filter(PTSchedule -> PTSchedule.getPTDate()
                        .equals(PTSchedule)).findAny().orElse(null);
    }

    @Override
    public Set<PTSchedule> getAll() {
        return PTScheduleRepositorys;
    }

    @Override
    public PTSchedule create(PTSchedule ptSchedule) {
        this.PTScheduleRepositorys.add(ptSchedule);
        return ptSchedule;
    }

    @Override
    public PTSchedule update(PTSchedule ptSchedule) {
        Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String id = formatter.format(ptSchedule.getPTDate());

        PTSchedule pFind = findPTSchedule(id);
        PTScheduleRepositorys.remove(pFind);
        PTScheduleRepositorys.add(ptSchedule);
        return null;
    }

    @Override
    public void delete(String s) {
        PTSchedule PTS = findPTSchedule(s);
        PTScheduleRepositorys.remove(PTS);
    }

    @Override
    public PTSchedule read(String s) {
        PTSchedule PTS = findPTSchedule(s);
        return PTS == null ? null : PTS;
    }
}
