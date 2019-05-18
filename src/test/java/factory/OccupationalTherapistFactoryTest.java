package factory;

import domain.occupational.OccupationalTherapist;
import factory.occupational.OccupationalTherapistFactory;
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