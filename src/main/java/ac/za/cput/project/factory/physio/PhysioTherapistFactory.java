package ac.za.cput.project.factory.physio;

import ac.za.cput.project.domain.physio.PhysioTherapist;

public class PhysioTherapistFactory {
    public static PhysioTherapist getQualification(String qualification){
        return new PhysioTherapist.Builder().qualification(qualification).build();
    }
}
