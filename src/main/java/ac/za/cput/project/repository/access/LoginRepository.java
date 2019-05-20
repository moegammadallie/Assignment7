package ac.za.cput.project.repository.access;

import ac.za.cput.project.domain.access.Login;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface LoginRepository extends IRepository<Login,String> {
    Set<Login> getAll();
}
