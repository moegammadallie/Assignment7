package repository.impl;

import domain.actors.Login;
import repository.LoginRepository;

import java.util.HashSet;
import java.util.Set;

public class LoginRepositoryImpl implements LoginRepository {

    private static LoginRepositoryImpl repository = null;
    private Set<Login> LoginRepositorys;

    private LoginRepositoryImpl() {
        this.LoginRepositorys = new HashSet<>();
    }

    public static LoginRepository getRepository(){
        if(repository == null) repository = new LoginRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Login> getAll() {
        return LoginRepositorys;
    }

    private Login findLogin(String login){
        return this.LoginRepositorys.stream()
                .filter(Login -> Login.getUsername().trim()
                .equals(Login)).findAny().orElse(null);
    }

    @Override
    public Login create(Login login) {
        this.LoginRepositorys.add(login);
        return login;
    }

    @Override
    public Login update(Login login) {
        String id = login.getUsername();
        Login pFind = findLogin(id);
        LoginRepositorys.remove(pFind);
        LoginRepositorys.add(login);
        return null;
    }

    @Override
    public void delete(String s) {
        Login login = findLogin(s);
        LoginRepositorys.remove(login);
    }

    @Override
    public Login read(String s) {
        Login login = findLogin(s);
        return login == null ? null : login;
    }
}
