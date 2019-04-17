package factory;

import domain.services.PTTools;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PTToolsFactoryTest {

    @Test
    public void getPTToolName() {
        String code = "ADP 2";
        PTTools i = PTToolsFactory.getPTToolName(code);
        System.out.println(i);
        Assert.assertNotNull(i.getPTToolName());
    }
}