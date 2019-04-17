package factory;

import domain.services.OTAvailability;

public class OTAvailabilityFactory {
    public static OTAvailability getOTBooked(Boolean booked){
        return new OTAvailability.Builder().booked(booked).build();
    }
}

