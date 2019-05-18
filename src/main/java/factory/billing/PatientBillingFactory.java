package factory.billing;

import domain.billing.PatientBilling;

public class PatientBillingFactory {
    public static PatientBilling getHours(int hours){
        return new PatientBilling.Builder().hours(hours).build();
    }
}
