package me.moegammadallie.repository.physio;

import me.moegammadallie.domain.physio.PTBooking;
import me.moegammadallie.repository.IRepository;

import java.util.Set;

public interface PTBookingRepository extends IRepository<PTBooking, String> {
    Set<PTBooking> getAll();
}

