package ac.za.cput.project.repository.occupational;

import ac.za.cput.project.domain.occupational.OTBooking;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface OTBookingRepository extends IRepository<OTBooking, String> {
    Set<OTBooking> getAll();
}
