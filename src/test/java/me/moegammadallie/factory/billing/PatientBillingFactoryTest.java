package me.moegammadallie.factory.billing;

import me.moegammadallie.domain.billing.PatientBilling;
import me.moegammadallie.factory.billing.PatientBillingFactory;
import me.moegammadallie.domain.billing.PatientBilling;
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
