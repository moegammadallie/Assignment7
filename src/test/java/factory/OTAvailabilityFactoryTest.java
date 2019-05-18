package factory;

import domain.occupational.OTAvailability;
import factory.occupational.OTAvailabilityFactory;
import org.junit.Assert;
import org.junit.Test;

public class OTAvailabilityFactoryTest {

    @Test
    public void getOTBooked() {
        Boolean code = false;
        OTAvailability i = OTAvailabilityFactory.getOTBooked(code);
        System.out.println(i);
        Assert.assertNotNull(i.getOTBooked());
    }
}