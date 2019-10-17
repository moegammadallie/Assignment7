package me.moegammadallie.controller.occupational;

import me.moegammadallie.domain.occupational.OTAvailability;
import me.moegammadallie.service.occupational.OTAvailabilityService;
import me.moegammadallie.service.occupational.impl.OTAvailabilityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/OTAvailability")
public class OTAvailabilityController {
//
//    @Autowired
//    private OTAvailabilityService otAvailabilityService;
//
//    @PostMapping("/create")
//    @ResponseBody
//    public OTAvailability create(OTAvailability otAvailability) {
//        return otAvailabilityService.create(otAvailability);
//    }
//
//    @PostMapping("/update")
//    @ResponseBody
//    public OTAvailability update(OTAvailability otAvailability) {
//        return otAvailabilityService.update(otAvailability);
//    }
//
//    @GetMapping("/delete/{id}")
//    @ResponseBody
//    public void delete(@PathVariable String id) {
//        otAvailabilityService.delete(id);
//
//    }
//
//    @GetMapping("/read/{id}")
//    @ResponseBody
//    public OTAvailability read(@PathVariable String id) {
//        return otAvailabilityService.read(id);
//    }
//
//    @GetMapping("/read/all")
//    @ResponseBody
//    public Set<OTAvailability> getAll() {
//        return otAvailabilityService.getAll();
//    }
}
