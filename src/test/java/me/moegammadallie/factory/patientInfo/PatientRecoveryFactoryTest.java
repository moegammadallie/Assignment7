package me.moegammadallie.factory.patientInfo;

import me.moegammadallie.domain.patientInfo.PatientRecovery;
import me.moegammadallie.factory.patientInfo.PatientRecoveryFactory;
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
