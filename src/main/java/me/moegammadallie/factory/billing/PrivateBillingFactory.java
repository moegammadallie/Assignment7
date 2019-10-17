package me.moegammadallie.factory.billing;

import me.moegammadallie.domain.billing.PrivateBilling;
import me.moegammadallie.domain.billing.PrivateBilling;

public class PrivateBillingFactory {
    public static PrivateBilling getPaymentMethod(String paymentMethod){
        return new PrivateBilling.Builder().paymentMethod(paymentMethod).build();
    }
}

