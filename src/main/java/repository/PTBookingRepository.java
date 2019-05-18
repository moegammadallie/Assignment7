package repository;

import domain.physio.PTBooking;

import java.util.Set;

public interface PTBookingRepository extends IRepository<PTBooking, String> {
    Set<PTBooking> getAll();
}

