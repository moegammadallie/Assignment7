package repository;

import domain.occupational.OTBooking;

import java.util.Set;

public interface OTBookingRepository extends IRepository<OTBooking, String> {
    Set<OTBooking> getAll();
}
