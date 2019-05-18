package repository.impl;

import domain.physio.PTBooking;
import repository.PTBookingRepository;

import java.util.HashSet;
import java.util.Set;

public class PTBookingRepositoryImpl implements PTBookingRepository {

    private static PTBookingRepositoryImpl repository = null;
    private Set<PTBooking> PTBookingRepositorys;

    private PTBookingRepositoryImpl() {
        this.PTBookingRepositorys = new HashSet<>();
    }

    public static PTBookingRepository getRepository(){
        if(repository == null) repository = new PTBookingRepositoryImpl();
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
