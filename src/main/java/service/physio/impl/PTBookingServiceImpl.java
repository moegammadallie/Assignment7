package service.physio.impl;

import domain.physio.PTBooking;
import service.physio.PTBookingService;

import java.util.HashSet;
import java.util.Set;

public class PTBookingServiceImpl implements PTBookingService {

    private static PTBookingServiceImpl repository = null;
    private Set<PTBooking> PTBookingRepositorys;

    private PTBookingServiceImpl() {
        this.PTBookingRepositorys = new HashSet<>();
    }

    public static PTBookingService getRepository(){
        if(repository == null) repository = new PTBookingServiceImpl();
        return repository;
    }

    private PTBooking findPTBooking(String PTB){
        return this.PTBookingRepositorys.stream().filter(PTBooking -> PTBooking.getPTPatientDetails()
            .equals(PTBooking)).findAny().orElse(null);
    }

    @Override
    public Set<PTBooking> getAll() {
        return PTBookingRepositorys;
    }

    @Override
    public PTBooking create(PTBooking ptBooking) {
        this.PTBookingRepositorys.add(ptBooking);
        return ptBooking;
    }

    @Override
    public PTBooking update(PTBooking ptBooking) {
        String id = ptBooking.getPTPatientDetails().getPatientID();
        PTBooking pFind = findPTBooking(id);
        PTBookingRepositorys.remove(pFind);
        PTBookingRepositorys.add(ptBooking);
        return null;
    }

    @Override
    public void delete(String s) {
        PTBooking ptBooking = findPTBooking(s);
        PTBookingRepositorys.remove(ptBooking);
    }

    @Override
    public PTBooking read(String s) {
        PTBooking ptBooking = findPTBooking(s);
        return ptBooking == null ? null : ptBooking;
    }
}
