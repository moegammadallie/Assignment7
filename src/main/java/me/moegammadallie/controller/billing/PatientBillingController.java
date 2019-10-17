package me.moegammadallie.controller.billing;

import me.moegammadallie.domain.billing.PatientBilling;
import me.moegammadallie.service.billing.PatientBillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/patientBilling")
public class PatientBillingController {

    @Autowired
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
    public Set<PatientBilling> getAll() {
        return patientBillingService.getAll();
    }
}
