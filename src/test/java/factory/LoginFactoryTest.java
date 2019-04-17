package factory;

import domain.services.Login;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

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