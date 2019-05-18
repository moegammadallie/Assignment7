package factory;

import domain.actors.Login;
import factory.actors.LoginFactory;
import org.junit.Assert;
import org.junit.Test;

public class LoginFactoryTest {

    @Test
    public void getUsername() {
        String name = "ADP 3";
        Login l = LoginFactory.getUsername(name);
        System.out.println(l);
        Assert.assertNotNull(l.getUsername());
    }

    @Test
    public void getPassword() {
        String name = "ADP 3";
        Login l = LoginFactory.getPassword(name);
        System.out.println(l);
        Assert.assertNotNull(l.getPassword());
    }
}