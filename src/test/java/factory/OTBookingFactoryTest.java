package factory;

import domain.actors.Patient;
import domain.services.OTBooking;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OTBookingFactoryTest {

    @Test
    public void getOTPatientDetails() {
        String code = "";
        OTBooking i = OTBookingFactory.getOTPatientDetails(code);
        System.out.println(i);
        Assert.assertNotNull(i.getOTPatientDetails());
    }
}