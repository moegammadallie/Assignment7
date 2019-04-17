package factory;

import domain.actors.OccupationalTherapist;

public class OccupationalTherapistFactory {
    public static OccupationalTherapist getQualification(String qualification){
        return new OccupationalTherapist.Builder().qualification(qualification).build();
    }
}
