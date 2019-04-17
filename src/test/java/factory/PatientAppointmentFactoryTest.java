package factory;

import domain.services.PatientAppointment;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatientAppointmentFactoryTest {

    @Test
    public void getAppointmentTime() {
        int code = 1234;
        PatientAppointment i = PatientAppointmentFactory.getAppointmentTime(code);
        System.out.println(i);
        Assert.assertNotNull(i.getAppointmentTime());
    }
}