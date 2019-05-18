package factory;

import domain.billing.PatientBilling;
import factory.billing.PatientBillingFactory;
import org.junit.Assert;
import org.junit.Test;

public class PatientBillingFactoryTest {

    @Test
    public void getHours() {
        int code = 1346;
        PatientBilling i = PatientBillingFactory.getHours(code);
        System.out.println(i);
        Assert.assertNotNull(i.getHours());
    }
}