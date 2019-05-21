package ac.za.cput.project.controller.physio;
import ac.za.cput.project.domain.access.Therapist;
import ac.za.cput.project.domain.physio.PhysioTherapist;
import ac.za.cput.project.service.physio.PhysioTherapistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/physioTherapis")
public class PhysioTherapistController extends Therapist {

    @Autowired
    @Qualifier("PhysioTherapistServiceImpl")
    private PhysioTherapistService physioTherapistService;

    @PostMapping("/create")
    @ResponseBody
    public PhysioTherapist create(PhysioTherapist physioTherapist) {
        return physioTherapistService.create(physioTherapist);
    }

    @PostMapping("/update")
    @ResponseBody
    public PhysioTherapist update(PhysioTherapist physioTherapist) {
        return physioTherapistService.update(physioTherapist);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        physioTherapistService.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public PhysioTherapist read(@PathVariable String id) {
        return physioTherapistService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<PhysioTherapist> getAll() {
        return physioTherapistService.getAll();
    }
}
