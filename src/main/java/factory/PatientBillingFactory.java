package factory;

import domain.services.PatientBilling;

public class PatientBillingFactory {
    public static PatientBilling getHours(int hours){
        return new PatientBilling.Builder().hours(hours).build();
    }
}
