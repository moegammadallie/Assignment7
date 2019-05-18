package factory.physio;

import domain.physio.PhysioTherapist;

public class PhysioTherapistFactory {
    public static PhysioTherapist getQualification(String qualification){
        return new PhysioTherapist.Builder().qualification(qualification).build();
    }
}
