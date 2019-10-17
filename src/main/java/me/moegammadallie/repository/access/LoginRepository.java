package me.moegammadallie.repository.access;

import me.moegammadallie.domain.access.Login;
import me.moegammadallie.repository.IRepository;
import me.moegammadallie.domain.access.Login;

import java.util.Set;

public interface LoginRepository extends IRepository<Login,String> {
    Set<Login> getAll();
}
