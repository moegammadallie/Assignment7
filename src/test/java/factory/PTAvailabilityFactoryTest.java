package factory;

import domain.services.PTAvailability;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PTAvailabilityFactoryTest {

    @Test
    public void getPTBooked() {

        boolean code = true;
        PTAvailability i = PTAvailabilityFactory.getPTBooked(code);
        System.out.println(i);
        Assert.assertNotNull(i.getPTBooked());
    }
}