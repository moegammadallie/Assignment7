package ac.za.cput.project.repository.physio;

import ac.za.cput.project.domain.physio.PTBooking;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface PTBookingRepository extends IRepository<PTBooking, String> {
    Set<PTBooking> getAll();
}

