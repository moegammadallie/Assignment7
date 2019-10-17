package me.moegammadallie.factory.physio;

import me.moegammadallie.domain.physio.PTAvailability;
import me.moegammadallie.domain.physio.PTAvailability;

public class PTAvailabilityFactory {
    public static PTAvailability getPTBooked(boolean booked){
        return new PTAvailability.Builder().booked(booked).build();
    }
}
