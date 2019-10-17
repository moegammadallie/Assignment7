package me.moegammadallie.factory.billing;

import me.moegammadallie.domain.billing.PatientBilling;
import me.moegammadallie.domain.billing.PatientBilling;

public class PatientBillingFactory {
    public static PatientBilling getHours(int hours){
        return new PatientBilling.Builder().hours(hours).build();
    }
}
