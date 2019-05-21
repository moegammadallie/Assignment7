package ac.za.cput.project.controller.billing;

import ac.za.cput.project.domain.billing.MedicalAid;
import ac.za.cput.project.service.billing.MedicalAidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/medicalAid")
public class MedicalAidController {

    @Autowired
    @Qualifier("MedicalAidServiceImpl")
    private MedicalAidService medicalAidService;

    @PostMapping("/create")
    @ResponseBody
    public MedicalAid create(MedicalAid medicalAid) {
        return medicalAidService.create(medicalAid);
    }

    @PostMapping("/update")
    @ResponseBody
    public MedicalAid update(MedicalAid medicalAid) {
        return medicalAidService.update(medicalAid);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        medicalAidService.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public MedicalAid read(@PathVariable String id) {
        return medicalAidService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<MedicalAid> getAll() {
        return medicalAidService.getAll();
    }

}
