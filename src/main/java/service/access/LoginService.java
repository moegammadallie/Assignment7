package service.access;

import domain.access.Login;
import service.IService;

import java.util.Set;

public interface LoginService extends IService<Login,String> {
    Set<Login> getAll();
}
