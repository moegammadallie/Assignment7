package ac.za.cput.project.controller.billing;

import ac.za.cput.project.domain.billing.PrivateBilling;
import ac.za.cput.project.service.billing.PrivateBillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/privateBilling")
public class PrivateBillingController {

    @Autowired
    @Qualifier("PatientBillingServiceImpl")
    private PrivateBillingService privateBillingService;

    @PostMapping("/create")
    @ResponseBody
    public PrivateBilling create(PrivateBilling privateBilling) {
        return privateBillingService.create(privateBilling);
    }

    @PostMapping("/update")
    @ResponseBody
    public PrivateBilling update(PrivateBilling privateBilling) {
        return privateBillingService.update(privateBilling);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        privateBillingService.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public PrivateBilling read(@PathVariable String id) {
        return privateBillingService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<PrivateBilling> getAll() {
        return privateBillingService.getAll();
    }

}
