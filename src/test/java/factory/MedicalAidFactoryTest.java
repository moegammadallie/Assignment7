package factory;

import domain.services.MedicalAid;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MedicalAidFactoryTest {

    @Test
    public void getMedicalAidNum() {
        int code = 1234;
        MedicalAid i = MedicalAidFactory.getMedicalAidNum(code);
        System.out.println(i);
        Assert.assertNotNull(i.getMedicalAidNum());
    }
}