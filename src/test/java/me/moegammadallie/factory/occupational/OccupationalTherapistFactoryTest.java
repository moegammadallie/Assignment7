package me.moegammadallie.factory.occupational;

import me.moegammadallie.domain.occupational.OccupationalTherapist;
import me.moegammadallie.factory.occupational.OccupationalTherapistFactory;
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
