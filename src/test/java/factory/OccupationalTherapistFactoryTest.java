package factory;

import domain.actors.OccupationalTherapist;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccupationalTherapistFactoryTest {

    @Test
    public void getOccupationalTherapist() {
        String code = "ADP 2";
        OccupationalTherapist i = OccupationalTherapistFactory.getQualification(code);
        System.out.println(i);
        Assert.assertNotNull(i.getQualification());    }
}