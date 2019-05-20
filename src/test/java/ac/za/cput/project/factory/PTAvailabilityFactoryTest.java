package ac.za.cput.project.factory;

import ac.za.cput.project.domain.physio.PTAvailability;
import ac.za.cput.project.factory.physio.PTAvailabilityFactory;
import org.junit.Assert;
import org.junit.Test;

public class PTAvailabilityFactoryTest {

    @Test
    public void getPTBooked() {

        boolean code = true;
        PTAvailability i = PTAvailabilityFactory.getPTBooked(code);
        System.out.println(i);
        Assert.assertNotNull(i.getPTBooked());
    }
}