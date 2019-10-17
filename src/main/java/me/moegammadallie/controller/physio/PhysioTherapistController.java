package me.moegammadallie.controller.physio;
import me.moegammadallie.domain.Physiotherapist;
import me.moegammadallie.domain.access.Therapist;
import me.moegammadallie.domain.physio.PhysioTherapist;
import me.moegammadallie.service.physio.PhysioTherapistService;
import me.moegammadallie.domain.access.Therapist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/physio")
@CrossOrigin(origins = "http://localhost:4200")
public class PhysioTherapistController {

    @Autowired
    private PhysioTherapistService physioTherapistService;

    @PostMapping("/create")
    public Physiotherapist create(@RequestBody Physiotherapist physioTherapist) {
        return physioTherapistService.create(physioTherapist);
    }

    @PutMapping("/update")
    public Physiotherapist update(@RequestBody Physiotherapist physioTherapist) {
        return physioTherapistService.update(physioTherapist);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id) {
        physioTherapistService.delete(id);

    }

    @GetMapping("/read/{id}")
    public Physiotherapist read(@PathVariable String id) {
        return physioTherapistService.read(id);
    }

    @GetMapping("/getall")
    public Set<Physiotherapist> getAll() {
        return physioTherapistService.getAll();
    }
}
