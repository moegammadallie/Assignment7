package factory;

import domain.services.PTSchedule;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PTScheduleFactoryTest {

    @Test
    public void getPTTime() {
        int code = 1223;
        PTSchedule i = PTScheduleFactory.getPTTime(code);
        System.out.println(i);
        Assert.assertNotNull(i.getPTTime());
    }
}