package service.actors;

import domain.actors.Login;
import service.IService;

import java.util.Set;

public interface LoginService extends IService<Login,String> {
    Set<Login> getAll();
}
