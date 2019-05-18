package factory.actors;

import domain.actors.Login;

public class LoginFactory {
    public static Login getUsername(String username){
        return new Login.Builder().username(username).build();
    }
    public static Login getPassword(String password){
        return new Login.Builder().password(password).build();
    }
}
