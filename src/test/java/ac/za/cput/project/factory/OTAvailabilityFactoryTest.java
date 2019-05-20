package ac.za.cput.project.factory;

import ac.za.cput.project.domain.occupational.OTAvailability;
import ac.za.cput.project.factory.occupational.OTAvailabilityFactory;
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