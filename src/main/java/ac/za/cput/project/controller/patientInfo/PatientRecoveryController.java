package ac.za.cput.project.controller.patientInfo;

import ac.za.cput.project.domain.patientInfo.PatientRecovery;
import ac.za.cput.project.service.patientInfo.PatientRecoveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/patientRecovery")
public class PatientRecoveryController {

    @Autowired
    @Qualifier("patientRecoveryServiceImpl")
    private PatientRecoveryService patientRecoveryService;

    @PostMapping("/create")
    @ResponseBody
    public PatientRecovery create(PatientRecovery patientRecovery) {
        return patientRecoveryService.create(patientRecovery);
    }

    @PostMapping("/update")
    @ResponseBody
    public PatientRecovery update(PatientRecovery patientRecovery) {
        return patientRecoveryService.update(patientRecovery);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        patientRecoveryService.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public PatientRecovery read(@PathVariable String id) {
        return patientRecoveryService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<PatientRecovery> getAll() {
        return patientRecoveryService.getAll();
    }
}
