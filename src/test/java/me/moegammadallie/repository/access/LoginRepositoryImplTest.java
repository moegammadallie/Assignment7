package me.moegammadallie.repository.access;

import me.moegammadallie.domain.access.Login;
import me.moegammadallie.factory.access.LoginFactory;
import me.moegammadallie.repository.access.impl.LoginRepositoryImpl;
import me.moegammadallie.domain.access.Login;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginRepositoryImplTest {
private LoginRepository repository;
private Login log;

    @Before
    public void setUp() throws Exception{
        this.repository = LoginRepositoryImpl.getRepository();
        this.log = LoginFactory.getPassword("password");

    }
    @Test
    public void create(){
        Login created = this.repository.create(this.log);
        System.out.println("Created: Log In " +created );
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.log);

    }

    @Test
    public void update(){
        Login created = this.repository.create(this.log);
        Login created2 = this.repository.create(this.log);
        Login created3 = this.repository.create(this.log);
        this.repository.create(created);
        this.repository.create(created2);

        Login updated = this.repository.update(created3);
        Assert.assertEquals(created3, updated);
        Assert.assertNotNull(created3);
        System.out.println("Updated" +updated);

    }
    @Test
    public void delete(){

        Login created = this.repository.create(this.log);

        this.repository.create(created);


        this.repository.delete(created.getPassword());

        int a = this.repository.getAll().size();
        Assert.assertNotNull(created);
        Assert.assertEquals(0, a);
        System.out.println("Deleted" +a);
    }

    @Test
    public void read(){
        Login created = this.repository.create(this.log);
        this.repository.create(created);
        Login s = this.repository.read(created.getPassword());

        Assert.assertEquals(created, s);
        Assert.assertNotNull(s);
        System.out.println("Read: " +s);
    }

}
