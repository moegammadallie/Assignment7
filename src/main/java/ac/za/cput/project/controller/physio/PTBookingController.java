package ac.za.cput.project.controller.physio;

import ac.za.cput.project.domain.physio.PTBooking;
import ac.za.cput.project.service.physio.PTBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/ptBooking")
public class PTBookingController {

    @Autowired
    @Qualifier("ImpedimentServiceImpl")
    private PTBookingService ptBookingService;

    @PostMapping("/create")
    @ResponseBody
    public PTBooking create(PTBooking ptBooking) {
        return ptBookingService.create(ptBooking);
    }

    @PostMapping("/update")
    @ResponseBody
    public PTBooking update(PTBooking ptBooking) {
        return ptBookingService.update(ptBooking);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        ptBookingService.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public PTBooking read(@PathVariable String id) {
        return ptBookingService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<PTBooking> getAll() {
        return ptBookingService.getAll();
    }
}
