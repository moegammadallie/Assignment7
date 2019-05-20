package ac.za.cput.project.service.access;

import ac.za.cput.project.domain.access.Login;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface LoginService extends IService<Login,String> {
    Set<Login> getAll();
}
