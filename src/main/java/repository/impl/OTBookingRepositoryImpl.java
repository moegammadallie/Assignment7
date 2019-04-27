package repository.impl;

import domain.services.OTBooking;
import repository.OTBookingRepository;

import java.util.HashSet;
import java.util.Set;

public class OTBookingRepositoryImpl implements OTBookingRepository {

    private static OTBookingRepositoryImpl repository = null;
    private Set<OTBooking> OTBookingRepositorys;

    private OTBookingRepositoryImpl() {
        this.OTBookingRepositorys = new HashSet<>();
    }

    public static OTBookingRepository getRepository(){
        if(repository == null) repository = new OTBookingRepositoryImpl();
        return repository;
    }

    private OTBooking findOTBooking(String OTB){
        return this.OTBookingRepositorys.stream()
                .filter(OTBooking -> OTBooking.getOTPatientDetails().trim()
                .equals(OTBooking)).findAny().orElse(null);
    }

    @Override
    public Set<OTBooking> getAll() {
        return OTBookingRepositorys;
    }

    @Override
    public OTBooking create(OTBooking otBooking) {
        this.OTBookingRepositorys.add(otBooking);
        return otBooking;
    }

    @Override
    public OTBooking update(OTBooking otBooking) {
        String id = otBooking.getOTPatientDetails();
        OTBooking pFind = findOTBooking(id);
        OTBookingRepositorys.remove(pFind);
        OTBookingRepositorys.add(otBooking);
        return null;
    }

    @Override
    public void delete(String s) {
        OTBooking otBooking = findOTBooking(s);
        OTBookingRepositorys.remove(otBooking);

    }

    @Override
    public OTBooking read(String s) {
        OTBooking otBooking = findOTBooking(s);
        return otBooking == null ? null : otBooking;
    }
}
