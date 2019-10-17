package me.moegammadallie.repository.occupational;

import me.moegammadallie.domain.occupational.OTBooking;
import me.moegammadallie.repository.IRepository;

import java.util.Set;

public interface OTBookingRepository extends IRepository<OTBooking, String> {
    Set<OTBooking> getAll();
}
