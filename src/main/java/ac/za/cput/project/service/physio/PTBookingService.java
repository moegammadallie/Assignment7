package ac.za.cput.project.service.physio;

import ac.za.cput.project.domain.physio.PTBooking;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface PTBookingService extends IService<PTBooking, String> {
    Set<PTBooking> getAll();
}

