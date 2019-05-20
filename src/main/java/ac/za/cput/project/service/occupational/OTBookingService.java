package ac.za.cput.project.service.occupational;

import ac.za.cput.project.domain.occupational.OTBooking;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface OTBookingService extends IService<OTBooking, String> {
    Set<OTBooking> getAll();
}
