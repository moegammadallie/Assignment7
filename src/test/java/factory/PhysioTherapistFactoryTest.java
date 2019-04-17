package factory;

import domain.actors.PhysioTherapist;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhysioTherapistFactoryTest {

    @Test
    public void getQualification() {
        String code = "ADP 2";
        PhysioTherapist i = PhysioTherapistFactory.getQualification(code);
        System.out.println(i);
        Assert.assertNotNull(i.getQualification());
    }
}