package ac.za.cput.project.factory.physio;

import ac.za.cput.project.domain.physio.PTAvailability;

public class PTAvailabilityFactory {
    public static PTAvailability getPTBooked(boolean booked){
        return new PTAvailability.Builder().booked(booked).build();
    }
}
