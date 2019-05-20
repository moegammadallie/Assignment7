package ac.za.cput.project.factory;

import ac.za.cput.project.domain.billing.PatientBilling;
import ac.za.cput.project.factory.billing.PatientBillingFactory;
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