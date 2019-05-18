package factory;

import domain.patientInfo.PatientRecovery;
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