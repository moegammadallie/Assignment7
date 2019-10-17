package me.moegammadallie.factory.physio;

import me.moegammadallie.domain.physio.PhysioTherapist;
import me.moegammadallie.domain.physio.PhysioTherapist;

public class PhysioTherapistFactory {
    public static PhysioTherapist getQualification(String qualification){
        return new PhysioTherapist.Builder().qualification(qualification).build();
    }
}
