package ac.za.cput.project.factory;

import ac.za.cput.project.domain.physio.PhysioTherapist;
import ac.za.cput.project.factory.physio.PhysioTherapistFactory;
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