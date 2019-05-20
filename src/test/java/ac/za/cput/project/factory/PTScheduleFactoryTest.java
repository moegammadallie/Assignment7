package ac.za.cput.project.factory;

import ac.za.cput.project.domain.physio.PTSchedule;
import ac.za.cput.project.factory.physio.PTScheduleFactory;
import org.junit.Assert;
import org.junit.Test;

public class PTScheduleFactoryTest {

    @Test
    public void getPTTime() {
        int code = 1223;
        PTSchedule i = PTScheduleFactory.getPTTime(code);
        System.out.println(i);
        Assert.assertNotNull(i.getPTTime());
    }
}