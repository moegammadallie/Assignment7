package ac.za.cput.project.factory.billing;

import ac.za.cput.project.domain.billing.PrivateBilling;

public class PrivateBillingFactory {
    public static PrivateBilling getPaymentMethod(String paymentMethod){
        return new PrivateBilling.Builder().paymentMethod(paymentMethod).build();
    }
}

