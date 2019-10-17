package me.moegammadallie.service.occupational;

import me.moegammadallie.domain.Booking;
import me.moegammadallie.domain.occupational.OTBooking;
import me.moegammadallie.service.IService;

import java.awt.print.Book;
import java.util.Set;

public interface OTBookingService extends IService<Booking, String> {
    Set<Booking> getAll();
}
