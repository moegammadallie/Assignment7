package ac.za.cput.project.controller.occupational;

import ac.za.cput.project.domain.occupational.OccupationalTherapist;
import ac.za.cput.project.service.occupational.OccupationalTherapistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/occupationalTherapist")
public class OccupationalTherapistController {

    @Autowired
    @Qualifier("OccupationalTherapistServiceImpl")
    private OccupationalTherapistService occupationalTherapistService;

    @PostMapping("/create")
    @ResponseBody
    public OccupationalTherapist create(OccupationalTherapist occupationalTherapist) {
        return occupationalTherapistService.create(occupationalTherapist);
    }

    @PostMapping("/update")
    @ResponseBody
    public OccupationalTherapist update(OccupationalTherapist occupationalTherapist) {
        return occupationalTherapistService.update(occupationalTherapist);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        occupationalTherapistService.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public OccupationalTherapist read(@PathVariable String id) {
        return occupationalTherapistService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<OccupationalTherapist> getAll() {
        return occupationalTherapistService.getAll();
    }
}
