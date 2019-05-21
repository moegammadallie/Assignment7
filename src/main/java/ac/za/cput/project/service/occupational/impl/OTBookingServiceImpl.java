package ac.za.cput.project.service.occupational.impl;

import ac.za.cput.project.domain.occupational.OTBooking;
import ac.za.cput.project.repository.occupational.OTBookingRepository;
import ac.za.cput.project.repository.occupational.impl.OTBookingRepositoryImpl;
import ac.za.cput.project.service.occupational.OTBookingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("OTBookingServiceImpl")

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
