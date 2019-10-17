package me.moegammadallie.controller.physio;

import me.moegammadallie.domain.physio.PTTools;
import me.moegammadallie.service.physio.PTToolsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/ptTools")
public class PTToolsController {

    @Autowired
    private PTToolsService ptToolsService;

    @PostMapping("/create")
    @ResponseBody
    public PTTools create(PTTools ptTools) {
        return ptToolsService.create(ptTools);
    }

    @PostMapping("/update")
    @ResponseBody
    public PTTools update(PTTools ptTools) {
        return ptToolsService.update(ptTools);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        ptToolsService.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public PTTools read(@PathVariable String id) {
        return ptToolsService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<PTTools> getAll() {
        return ptToolsService.getAll();
    }
}
