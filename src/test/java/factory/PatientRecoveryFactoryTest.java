package factory;

import domain.services.PatientRecovery;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatientRecoveryFactoryTest {

    @Test
    public void getEstTime() {
        String code = "ADP 2";
        PatientRecovery i = PatientRecoveryFactory.getEstTime(code);
        System.out.println(i);
        Assert.assertNotNull(i.getEstTime());
    }
}