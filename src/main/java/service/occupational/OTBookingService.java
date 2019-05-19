package service.occupational;

import domain.occupational.OTBooking;
import service.IService;

import java.util.Set;

public interface OTBookingService extends IService<OTBooking, String> {
    Set<OTBooking> getAll();
}
