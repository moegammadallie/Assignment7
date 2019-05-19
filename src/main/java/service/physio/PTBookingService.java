package service.physio;

import domain.physio.PTBooking;
import service.IService;

import java.util.Set;

public interface PTBookingService extends IService<PTBooking, String> {
    Set<PTBooking> getAll();
}

