package factory;

import domain.actors.PhysioTherapist;

public class PhysioTherapistFactory {
    public static PhysioTherapist getQualification(String qualification){
        return new PhysioTherapist.Builder().qualification(qualification).build();
    }
}
