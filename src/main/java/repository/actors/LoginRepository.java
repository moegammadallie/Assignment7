package repository.actors;

import domain.actors.Login;
import repository.IRepository;

import java.util.Set;

public interface LoginRepository extends IRepository<Login,String> {
    Set<Login> getAll();
}
