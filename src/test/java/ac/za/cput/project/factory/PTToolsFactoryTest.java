package ac.za.cput.project.factory;

import ac.za.cput.project.domain.physio.PTTools;
import ac.za.cput.project.factory.physio.PTToolsFactory;
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