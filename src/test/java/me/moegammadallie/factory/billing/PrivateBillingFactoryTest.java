package me.moegammadallie.factory.billing;

import me.moegammadallie.domain.billing.PrivateBilling;
import me.moegammadallie.factory.billing.PrivateBillingFactory;
import org.junit.Assert;
import org.junit.Test;

public class PrivateBillingFactoryTest {

    @Test
    public void getPaymentMethod() {
        String code = "ADP 2";
        PrivateBilling i = PrivateBillingFactory.getPaymentMethod(code);
        System.out.println(i);
        Assert.assertNotNull(i.getPaymentMethod());
    }
}
