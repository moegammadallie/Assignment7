package factory;

import domain.billing.MedicalAid;
import factory.billing.MedicalAidFactory;
import org.junit.Assert;
import org.junit.Test;

public class MedicalAidFactoryTest {

    @Test
    public void getMedicalAidNum() {
        int code = 1234;
        MedicalAid i = MedicalAidFactory.getMedicalAidNum(code);
        System.out.println(i);
        Assert.assertNotNull(i.getMedicalAidNum());
    }
}