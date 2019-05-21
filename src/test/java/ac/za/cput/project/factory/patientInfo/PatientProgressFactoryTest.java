package ac.za.cput.project.factory.patientInfo;

import ac.za.cput.project.domain.patientInfo.PatientProgress;
import ac.za.cput.project.factory.patientInfo.PatientProgressFactory;
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