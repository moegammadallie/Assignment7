package ac.za.cput.project.factory;

import ac.za.cput.project.domain.occupational.OccupationalTherapist;
import ac.za.cput.project.factory.occupational.OccupationalTherapistFactory;
import org.junit.Assert;
import org.junit.Test;

public class OccupationalTherapistFactoryTest {

    @Test
    public void getOccupationalTherapist() {
        String code = "ADP 2";
        OccupationalTherapist i = OccupationalTherapistFactory.getQualification(code);
        System.out.println(i);
        Assert.assertNotNull(i.getQualification());    }
}