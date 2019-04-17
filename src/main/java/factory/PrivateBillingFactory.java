package factory;

import domain.services.PrivateBilling;

public class PrivateBillingFactory {
    public static PrivateBilling getPaymentMethod(String paymentMethod){
        return new PrivateBilling.Builder().paymentMethod(paymentMethod).build();
    }
}

