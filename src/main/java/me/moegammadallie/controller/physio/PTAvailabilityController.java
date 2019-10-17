package me.moegammadallie.controller.physio;
import me.moegammadallie.domain.physio.PTAvailability;
import me.moegammadallie.service.physio.PTAvailabilityService;
import me.moegammadallie.domain.physio.PTAvailability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/ptAvailability")

public class PTAvailabilityController {

    @Autowired
    private PTAvailabilityService ptAvailabilityService;

    @PostMapping("/create")
    @ResponseBody
    public PTAvailability create(PTAvailability ptAvailability) {
        return ptAvailabilityService.create(ptAvailability);
    }

    @PostMapping("/update")
    @ResponseBody
    public PTAvailability update(PTAvailability ptAvailability) {
        return ptAvailabilityService.update(ptAvailability);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        ptAvailabilityService.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public PTAvailability read(@PathVariable String id) {
        return ptAvailabilityService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<PTAvailability> getAll() {
        return ptAvailabilityService.getAll();
    }
}
