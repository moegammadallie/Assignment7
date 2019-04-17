package factory;

import domain.actors.Patient;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatientFactoryTest {

    @Test
    public void getPatient() {
        String code = "ADP 2";
        Patient i = PatientFactory.getPatientID(code);
        System.out.println(i);
        Assert.assertNotNull(i.getPatientID());
    }
}