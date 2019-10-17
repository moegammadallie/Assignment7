package me.moegammadallie.factory.patientInfo;

import me.moegammadallie.domain.patientInfo.PatientAppointment;
import me.moegammadallie.factory.patientInfo.PatientAppointmentFactory;
import org.junit.Assert;
import org.junit.Test;

public class PatientAppointmentFactoryTest {

    @Test
    public void getAppointmentTime() {
        int code = 1234;
        PatientAppointment i = PatientAppointmentFactory.getAppointmentTime(code);
        System.out.println(i);
        Assert.assertNotNull(i.getAppointmentTime());
    }
}
