package me.moegammadallie.controller.physio;

import java.util.Date;

import me.moegammadallie.domain.physio.PTSchedule;
import me.moegammadallie.service.physio.PTScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/ptSchedule")
public class PTScheduleController {

    @Autowired
    private PTScheduleService ptScheduleService;

    @PostMapping("/create")
    @ResponseBody
    public PTSchedule create(PTSchedule ptSchedule) {
        return ptScheduleService.create(ptSchedule);
    }

    @PostMapping("/update")
    @ResponseBody
    public PTSchedule update(PTSchedule ptSchedule) {
        return ptScheduleService.update(ptSchedule);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        ptScheduleService.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public PTSchedule read(@PathVariable String id) {
        return ptScheduleService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<PTSchedule> getAll() {
        return ptScheduleService.getAll();
    }
}
