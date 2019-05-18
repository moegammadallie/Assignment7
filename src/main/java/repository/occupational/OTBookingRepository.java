package repository.occupational;

import domain.occupational.OTBooking;
import repository.IRepository;

import java.util.Set;

public interface OTBookingRepository extends IRepository<OTBooking, String> {
    Set<OTBooking> getAll();
}
