package factory;

import domain.physio.PTAvailability;
import factory.physio.PTAvailabilityFactory;
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