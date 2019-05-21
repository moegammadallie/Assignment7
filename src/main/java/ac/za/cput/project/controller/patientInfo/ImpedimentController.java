package ac.za.cput.project.controller.patientInfo;

import ac.za.cput.project.domain.patientInfo.Impediment;
import ac.za.cput.project.service.patientInfo.ImpedimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/impediment")
public class ImpedimentController {

    @Autowired
    @Qualifier("ImpedimentServiceImpl")
    private ImpedimentService impedimentService;

    @PostMapping("/create")
    @ResponseBody
    public Impediment create(Impediment impediment) {
        return impedimentService.create(impediment);
    }

    @PostMapping("/update")
    @ResponseBody
    public Impediment update(Impediment impediment) {
        return impedimentService.update(impediment);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        impedimentService.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Impediment read(@PathVariable String id) {
        return impedimentService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Impediment> getAll() {
        return impedimentService.getAll();
    }
}
