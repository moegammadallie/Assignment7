package ac.za.cput.project.factory;

import ac.za.cput.project.domain.patientInfo.Impediment;
import ac.za.cput.project.factory.patientInfo.ImpedimentFactory;
import org.junit.Assert;
import org.junit.Test;

public class ImpedimentFactoryTest {

    @Test
    public void getImpedimentName() {
        String name = "Adhd";
        Impediment i = ImpedimentFactory.getImpedimentName(name);
        System.out.println(i);
        Assert.assertNotNull(i.getImpedimentName());
    }

    @Test
    public void getImpedimentCode() {
        String code = "low tone";
        Impediment i = ImpedimentFactory.getImpedimentCode(code);
        System.out.println(i);
        Assert.assertNotNull(i.getImpedimentCode());
    }

    @Test
    public void getImpedimentDescription() {
        String desc = "Work injury";
        Impediment i = ImpedimentFactory.getImpedimentDescription(desc);
        System.out.println(i);
        Assert.assertNotNull(i.getImpedimentDescription());
    }
}