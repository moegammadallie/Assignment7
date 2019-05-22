package ac.za.cput.project.repository.access.impl;

import ac.za.cput.project.domain.access.Login;
import ac.za.cput.project.repository.access.LoginRepository;

import java.util.*;

public class LoginRepositoryImpl implements LoginRepository {

    private static LoginRepositoryImpl repository = null;
    private Map<String, Login> log;

    private LoginRepositoryImpl(){this.log = new HashMap<>();
    }

    public static LoginRepository getRepository() {
        if (repository == null) repository = new LoginRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Login> getAll()
    {
        Collection<Login> courses = this.log.values();
        Set<Login> set = new HashSet<>();
        set.addAll(courses);
        return set;
    }

 /*   private Login findLogin(String login) {
        return this.LoginRepositorys.stream()
                .filter(Login -> Login.getUsername().trim()
                        .equals(Login)).findAny().orElse(null);
}
*/
        @Override
        public Login create (Login login){
            this.log.put(login.getPassword(), login);
            return login;
        }

        @Override
        public Login update (Login login){
            this.log.replace(login.getPassword(), login);
            return login;
        }

        @Override
        public void delete (String s){
            this.log.remove(s);
        }

        @Override
        public Login read (String s){
            return this.log.remove(s);
        }



}
