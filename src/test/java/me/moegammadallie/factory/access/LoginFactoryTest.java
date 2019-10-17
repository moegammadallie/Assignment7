package me.moegammadallie.factory.access;

import me.moegammadallie.domain.access.Login;
import me.moegammadallie.factory.access.LoginFactory;
import me.moegammadallie.domain.access.Login;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginFactoryTest {


    @Test
    public void getUsername() {
        String name = "Dr Khan";
        Login l = LoginFactory.getUsername(name);
        System.out.println(l);
        Assert.assertNotNull(l.getUsername());
    }

    @Test
    public void getPassword() {
        String name = "password123";
        Login l = LoginFactory.getPassword(name);
        System.out.println(l);
        Assert.assertNotNull(l.getPassword());
    }
}
