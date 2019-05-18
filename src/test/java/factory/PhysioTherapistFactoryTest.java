package factory;

import domain.physio.PhysioTherapist;
import factory.physio.PhysioTherapistFactory;
import org.junit.Assert;
import org.junit.Test;

public class PhysioTherapistFactoryTest {

    @Test
    public void getQualification() {
        String code = "ADP 2";
        PhysioTherapist i = PhysioTherapistFactory.getQualification(code);
        System.out.println(i);
        Assert.assertNotNull(i.getQualification());
    }
}