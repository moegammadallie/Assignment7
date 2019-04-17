package factory;

import domain.services.OTSchedule;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OTScheduleFactoryTest {

    @Test
    public void getOTTime() {
        int code = 1234;
        OTSchedule i = OTScheduleFactory.getOTTime(code);
        System.out.println(i);
        Assert.assertNotNull(i.getOTTime());
    }
}