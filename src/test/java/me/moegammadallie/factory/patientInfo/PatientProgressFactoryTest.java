package me.moegammadallie.factory.patientInfo;

import me.moegammadallie.domain.patientInfo.PatientProgress;
import me.moegammadallie.factory.patientInfo.PatientProgressFactory;
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
