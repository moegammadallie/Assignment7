package factory;

import domain.services.Impediment;

public class ImpedimentFactory {
    public static Impediment getImpedimentName(String impedimentName) {
        return new Impediment.Builder().impedimentName(impedimentName).build();
    }
    public static Impediment getImpedimentCode(String impedimentCode) {
        return new Impediment.Builder().impedimentCode(impedimentCode).build();
    }
    public static Impediment getImpedimentDescription(String impedimentDescription) {
        return new Impediment.Builder().impedimentDescription(impedimentDescription).build();
    }
}
