package me.moegammadallie.controller.patientInfo;

import java.util.Date;

import me.moegammadallie.domain.patientInfo.PatientAppointment;
import me.moegammadallie.service.patientInfo.PatientAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/patientAppointment")
public class PatientAppointmentController {

    @Autowired
    private PatientAppointmentService patientAppointmentService;

    @PostMapping("/create")
    @ResponseBody
    public PatientAppointment create(PatientAppointment patientAppointment) {
        return patientAppointmentService.create(patientAppointment);
    }

    @PostMapping("/update")
    @ResponseBody
    public PatientAppointment update(PatientAppointment patientAppointment) {
        return patientAppointmentService.update(patientAppointment);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        patientAppointmentService.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public PatientAppointment read(@PathVariable String id) {
        return patientAppointmentService.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<PatientAppointment> getAll() {
        return patientAppointmentService.getAll();
    }
}
