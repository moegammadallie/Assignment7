package ac.za.cput.project.factory.occupational;

import ac.za.cput.project.domain.occupational.OTAvailability;

public class OTAvailabilityFactory {
    public static OTAvailability getOTBooked(Boolean booked){
        return new OTAvailability.Builder().booked(booked).build();
    }
}

