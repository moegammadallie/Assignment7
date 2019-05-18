package repository.physio;

import domain.physio.PTBooking;
import repository.IRepository;

import java.util.Set;

public interface PTBookingRepository extends IRepository<PTBooking, String> {
    Set<PTBooking> getAll();
}

