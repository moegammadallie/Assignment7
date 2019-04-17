package factory;

import domain.services.PatientProgress;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatientProgressFactoryTest {

    @Test
    public void getProgress() {
        String code = "ADP 2";
        PatientProgress i = PatientProgressFactory.getProgress(code);
        System.out.println(i);
        Assert.assertNotNull(i.getProgress());
    }
}