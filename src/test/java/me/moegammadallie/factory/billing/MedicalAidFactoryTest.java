package me.moegammadallie.factory.billing;

import me.moegammadallie.domain.billing.MedicalAid;
import me.moegammadallie.factory.billing.MedicalAidFactory;
import me.moegammadallie.domain.billing.MedicalAid;
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
