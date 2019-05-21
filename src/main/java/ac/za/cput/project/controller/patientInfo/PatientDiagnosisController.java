package ac.za.cput.project.controller.patientInfo;

import java.util.Date;

import ac.za.cput.project.domain.patientInfo.PatientDiagnosis;
import ac.za.cput.project.service.patientInfo.PatientDiagnosisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/patientDiagnosis")
public class PatientDiagnosisController {

    @Autowired
    @Qualifier("PatientDiagnosisServiceImpl")
    private PatientDiagnosisService patientDiagnosisService;

    @PostMapping("/create")
    @ResponseBody
    public PatientDiagnosis create(PatientDiagnosis patientDiagnosis) {
        return patientDiagnosisService.create(impediment);
    }

    @PostMapping("/update")
    @ResponseBody
    public PatientDiagnosis update(PatientDiagnosis patientDiagnosis) {
        return patientDiagnosisService.update(impediment);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        patientDiagnosisService.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public PatientDiagnosis read(@PathVariable String id) {
        return patientDiagnosisService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<PatientDiagnosis> getAll() {
        return patientDiagnosisService.getAll();
    }
}
