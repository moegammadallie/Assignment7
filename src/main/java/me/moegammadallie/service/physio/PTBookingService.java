package me.moegammadallie.service.physio;

import me.moegammadallie.domain.physio.PTBooking;
import me.moegammadallie.service.IService;
import me.moegammadallie.domain.physio.PTBooking;

import java.util.Set;

public interface PTBookingService extends IService<PTBooking, String> {
    Set<PTBooking> getAll();
}

