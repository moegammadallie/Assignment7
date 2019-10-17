package me.moegammadallie.factory.occupational;

import me.moegammadallie.domain.occupational.OTSchedule;
import me.moegammadallie.factory.occupational.OTScheduleFactory;
import org.junit.Assert;
import org.junit.Test;

public class OTScheduleFactoryTest {

    @Test
    public void getOTTime() {
        int code = 1234;
        OTSchedule i = OTScheduleFactory.getOTTime(code);
        System.out.println(i);
        Assert.assertNotNull(i.getOTTime());
    }
}
