package me.moegammadallie.factory.physio;

import me.moegammadallie.domain.physio.PTTools;
import me.moegammadallie.factory.physio.PTToolsFactory;
import org.junit.Assert;
import org.junit.Test;

public class PTToolsFactoryTest {

    @Test
    public void getPTToolName() {
        String code = "ADP 2";
        PTTools i = PTToolsFactory.getPTToolName(code);
        System.out.println(i);
        Assert.assertNotNull(i.getPTToolName());
    }
}
