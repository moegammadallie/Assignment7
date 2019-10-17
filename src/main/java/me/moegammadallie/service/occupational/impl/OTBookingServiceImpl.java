package me.moegammadallie.service.occupational.impl;

import me.moegammadallie.domain.Booking;

import me.moegammadallie.repository.BookingRepository;
import me.moegammadallie.repository.occupational.OTBookingRepository;
import me.moegammadallie.repository.occupational.impl.OTBookingRepositoryImpl;
import me.moegammadallie.service.occupational.OTBookingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Service

public class OTBookingServiceImpl implements OTBookingService {

    private static OTBookingServiceImpl service = null;
    @Autowired
    private BookingRepository repository;

    private OTBookingServiceImpl() {

    }

    public static OTBookingServiceImpl getService(){
        if(service == null) service = new OTBookingServiceImpl();
        return service;
    }

    @Override
    public Set<Booking> getAll() {
        return new HashSet<>((List<Booking>)this.repository.findAll());
    }

    @Override
    public Booking create(Booking oTBooking) {
        return this.repository.save(oTBooking);
    }

    @Override
    public Booking update(Booking oTBooking) {
        return this.repository.save(oTBooking);
    }

    @Override
    public void delete(String s) {
        this.repository.deleteById(s);
    }

    @Override
    public Booking read(String s) {
        return this.repository.findById(s).orElse(null);
    }
}
