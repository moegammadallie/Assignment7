package me.moegammadallie.controller.patientInfo;

import me.moegammadallie.domain.Patient;
import me.moegammadallie.domain.access.Person;
import me.moegammadallie.domain.access.Person;
import me.moegammadallie.service.patientInfo.PatientService;
import me.moegammadallie.service.physio.PhysioTherapistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/patient")
@CrossOrigin(origins = "http://localhost:4200")
public class PatientController{

    @Autowired
    private PatientService physioTherapistService;

    @PostMapping("/create")
    public Patient create(@RequestBody Patient physioTherapist) {
        return physioTherapistService.create(physioTherapist);
    }

    @PutMapping("/update")
    public Patient update(@RequestBody Patient physioTherapist) {
        return physioTherapistService.update(physioTherapist);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id) {
        physioTherapistService.delete(id);

    }

    @GetMapping("/read/{id}")
    public Patient read(@PathVariable String id) {
        return physioTherapistService.read(id);
    }

    @GetMapping("/read/all")
    public Set<Patient> getAll() {
        return physioTherapistService.getAll();
    }

}
