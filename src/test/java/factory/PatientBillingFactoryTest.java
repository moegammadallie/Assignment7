package factory;

import domain.actors.Patient;
import domain.services.PatientBilling;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatientBillingFactoryTest {

    @Test
    public void getHours() {
        int code = 1346;
        PatientBilling i = PatientBillingFactory.getHours(code);
        System.out.println(i);
        Assert.assertNotNull(i.getHours());
    }
}