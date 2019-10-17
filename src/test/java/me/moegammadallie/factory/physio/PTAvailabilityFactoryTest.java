package me.moegammadallie.factory.physio;

import me.moegammadallie.domain.physio.PTAvailability;
import me.moegammadallie.factory.physio.PTAvailabilityFactory;
import me.moegammadallie.domain.physio.PTAvailability;
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
