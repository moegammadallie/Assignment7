package me.moegammadallie.controller.occupational;

import me.moegammadallie.domain.occupational.OTSchedule;
import me.moegammadallie.service.occupational.OTScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/OTSchedule")
public class OTScheduleController {

    @Autowired
    private OTScheduleService otScheduleService;

    @PostMapping("/create")
    @ResponseBody
    public OTSchedule create(OTSchedule otSchedule) {
        return otScheduleService.create(otSchedule);
    }

    @PostMapping("/update")
    @ResponseBody
    public OTSchedule update(OTSchedule otSchedule) {
        return otScheduleService.update(otSchedule);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        otScheduleService.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public OTSchedule read(@PathVariable String id) {
        return otScheduleService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<OTSchedule> getAll() {
        return otScheduleService.getAll();
    }
}
