package me.moegammadallie.controller.occupational;

import me.moegammadallie.domain.occupational.OTTools;
import me.moegammadallie.service.occupational.OTToolsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/OTTools")
public class OTToolsController {

    @Autowired
    private OTToolsService otToolsService;

    @PostMapping("/create")
    @ResponseBody
    public OTTools create(OTTools otTools) {
        return otToolsService.create(otTools);
    }

    @PostMapping("/update")
    @ResponseBody
    public OTTools update(OTTools otTools) {
        return otToolsService.update(otTools);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        otToolsService.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public OTTools read(@PathVariable String id) {
        return otToolsService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<OTTools> getAll() {
        return otToolsService.getAll();
    }
}
