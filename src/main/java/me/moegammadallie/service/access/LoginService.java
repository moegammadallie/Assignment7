package me.moegammadallie.service.access;

import me.moegammadallie.domain.access.Login;
import me.moegammadallie.service.IService;
import me.moegammadallie.domain.access.Login;

import java.util.Set;

public interface LoginService extends IService<Login,String> {
    Set<Login> getAll();
}
