package factory;

import domain.patientInfo.PatientProgress;
import factory.patientInfo.PatientProgressFactory;
import org.junit.Assert;
import org.junit.Test;

public class PatientProgressFactoryTest {

    @Test
    public void getProgress() {
        String code = "ADP 2";
        PatientProgress i = PatientProgressFactory.getProgress(code);
        System.out.println(i);
        Assert.assertNotNull(i.getProgress());
    }
}