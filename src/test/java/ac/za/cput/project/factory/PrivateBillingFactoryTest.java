package ac.za.cput.project.factory;

import ac.za.cput.project.domain.billing.PrivateBilling;
import ac.za.cput.project.factory.billing.PrivateBillingFactory;
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