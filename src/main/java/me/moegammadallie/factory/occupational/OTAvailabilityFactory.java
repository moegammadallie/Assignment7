package me.moegammadallie.factory.occupational;

import me.moegammadallie.domain.occupational.OTAvailability;

public class OTAvailabilityFactory {
    public static OTAvailability getOTBooked(Boolean booked){
        return new OTAvailability.Builder().booked(booked).build();
    }
}

