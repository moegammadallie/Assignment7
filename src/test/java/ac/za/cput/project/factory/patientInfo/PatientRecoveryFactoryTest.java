package ac.za.cput.project.factory.patientInfo;

import ac.za.cput.project.domain.patientInfo.PatientRecovery;
import ac.za.cput.project.factory.patientInfo.PatientRecoveryFactory;
import org.junit.Assert;
import org.junit.Test;

public class PatientRecoveryFactoryTest {

    @Test
    public void getEstTime() {
        String code = "ADP 2";
        PatientRecovery i = PatientRecoveryFactory.getEstTime(code);
        System.out.println(i);
        Assert.assertNotNull(i.getEstTime());
    }
}