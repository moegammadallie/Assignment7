package ac.za.cput.project.factory.patientInfo;

import ac.za.cput.project.domain.patientInfo.PatientAppointment;
import ac.za.cput.project.factory.patientInfo.PatientAppointmentFactory;
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