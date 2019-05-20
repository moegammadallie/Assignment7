package ac.za.cput.project.factory.occupational;

import ac.za.cput.project.domain.occupational.OccupationalTherapist;

public class OccupationalTherapistFactory {
    public static OccupationalTherapist getQualification(String qualification){
        return new OccupationalTherapist.Builder().qualification(qualification).build();
    }
}
