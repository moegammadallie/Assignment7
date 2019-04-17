package factory;

import domain.services.OTAvailability;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OTAvailabilityFactoryTest {

    @Test
    public void getOTBooked() {
        Boolean code = false;
        OTAvailability i = OTAvailabilityFactory.getOTBooked(code);
        System.out.println(i);
        Assert.assertNotNull(i.getOTBooked());
    }
}