package me.moegammadallie.factory.occupational;

import me.moegammadallie.domain.occupational.OTBooking;
import me.moegammadallie.factory.occupational.OTBookingFactory;
import org.junit.Assert;
import org.junit.Test;

public class OTBookingFactoryTest {

    @Test
    public void getOTPatientDetails() {
        String code = "";
        OTBooking i = OTBookingFactory.getOTPatientDetails(code);
        System.out.println(i);
        Assert.assertNotNull(i.getOTPatientDetails());
    }
}
