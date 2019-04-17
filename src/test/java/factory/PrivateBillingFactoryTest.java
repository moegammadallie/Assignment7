package factory;

import domain.services.PrivateBilling;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrivateBillingFactoryTest {

    @Test
    public void getPaymentMethod() {
        String code = "ADP 2";
        PrivateBilling i = PrivateBillingFactory.getPaymentMethod(code);
        System.out.println(i);
        Assert.assertNotNull(i.getPaymentMethod());
    }
}