package ac.za.cput.project.factory.billing;

import ac.za.cput.project.domain.billing.PatientBilling;

public class PatientBillingFactory {
    public static PatientBilling getHours(int hours){
        return new PatientBilling.Builder().hours(hours).build();
    }
}
