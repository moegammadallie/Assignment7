package me.moegammadallie.controller.access;


import me.moegammadallie.domain.access.Login;
import me.moegammadallie.service.access.LoginService;
import me.moegammadallie.domain.access.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/access")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/create")
    @ResponseBody
    public Login create(Login login) {
        return loginService.create(login);
    }

    @PostMapping("/update")
    @ResponseBody
    public Login update(Login login) {
        return loginService.update(login);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        loginService.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Login read(@PathVariable String id) {
        return loginService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Login> getAll() {
        return loginService.getAll();
    }
}
