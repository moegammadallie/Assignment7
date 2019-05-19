package service.occupational.impl;

import domain.occupational.OTBooking;
import repository.occupational.OTBookingRepository;
import repository.occupational.impl.OTBookingRepositoryImpl;
import service.occupational.OTBookingService;

import java.util.HashSet;
import java.util.Set;

public class OTBookingServiceImpl implements OTBookingService {

    private static OTBookingServiceImpl service = null;
    private OTBookingRepository repository;

    private OTBookingServiceImpl() {
        this.repository = OTBookingRepositoryImpl.getRepository();
    }

    public static OTBookingServiceImpl getService(){
        if(service == null) service = new OTBookingServiceImpl();
        return service;
    }

    @Override
    public Set<OTBooking> getAll() {
        return this.repository.getAll();
    }

    @Override
    public OTBooking create(OTBooking oTBooking) {
        return this.repository.create(oTBooking);
    }

    @Override
    public OTBooking update(OTBooking oTBooking) {
        return this.repository.update(oTBooking);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public OTBooking read(String s) {
        return this.repository.read(s);
    }
}
