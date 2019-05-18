package factory;

import domain.patientInfo.Impediment;
import org.junit.Assert;
import org.junit.Test;

public class ImpedimentFactoryTest {

    @Test
    public void getImpedimentName() {
        String name = "ADP 3";
        Impediment i = ImpedimentFactory.getImpedimentName(name);
        System.out.println(i);
        Assert.assertNotNull(i.getImpedimentName());
    }

    @Test
    public void getImpedimentCode() {
        String code = "ADP 2";
        Impediment i = ImpedimentFactory.getImpedimentCode(code);
        System.out.println(i);
        Assert.assertNotNull(i.getImpedimentCode());
    }

    @Test
    public void getImpedimentDescription() {
        String desc = "ADP 2";
        Impediment i = ImpedimentFactory.getImpedimentDescription(desc);
        System.out.println(i);
        Assert.assertNotNull(i.getImpedimentDescription());
    }
}