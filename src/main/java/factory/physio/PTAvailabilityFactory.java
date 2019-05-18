package factory.physio;

import domain.physio.PTAvailability;

public class PTAvailabilityFactory {
    public static PTAvailability getPTBooked(boolean booked){
        return new PTAvailability.Builder().booked(booked).build();
    }
}
