package ac.za.cput.project.controller.occupational;


import ac.za.cput.project.domain.occupational.OTBooking;
import ac.za.cput.project.service.occupational.OTBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/OTBooking")
public class OTBookingController {

    @Autowired
    @Qualifier("OTBookingServiceImpl")
    private OTBookingService otBookingService;

    @PostMapping("/create")
    @ResponseBody
    public OTBooking create(OTBooking otBooking) {
        return otBookingService.create(otBooking);
    }

    @PostMapping("/update")
    @ResponseBody
    public OTBooking update(OTBooking otBooking) {
        return otBookingService.update(otBooking);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        otBookingService.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public OTBooking read(@PathVariable String id) {
        return otBookingService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<OTBooking> getAll() {
        return otBookingService.getAll();
    }
}
