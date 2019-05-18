package repository;

import domain.actors.Login;

import java.util.Set;

public interface LoginRepository extends IRepository<Login,String> {
    Set<Login> getAll();
}
