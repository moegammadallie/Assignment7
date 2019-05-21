package ac.za.cput.project.controller.billing;

import ac.za.cput.project.domain.billing.PatientBilling;
import ac.za.cput.project.service.billing.PatientBillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/patientBilling")
public class PatientBillingController {

    @Autowired
    @Qualifier("PatientBillingServiceImpl")
    private PatientBillingService patientBillingService;

    @PostMapping("/create")
    @ResponseBody
    public PatientBilling create(PatientBilling patientBilling) {
        return patientBillingService.create(patientBilling);
    }

    @PostMapping("/update")
    @ResponseBody
    public PatientBilling update(PatientBilling patientBilling) {
        return patientBillingService.update(patientBilling);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        patientBillingService.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public PatientBilling read(@PathVariable String id) {
        return patientBillingService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<MedicalAid> getAll() {
        return patientBillingService.getAll();
    }
}
