package me.moegammadallie.service.patientInfo;

import me.moegammadallie.domain.patientInfo.PatientAppointment;
import me.moegammadallie.service.IService;

import java.util.Set;

public interface PatientAppointmentService extends IService<PatientAppointment,String> {
    Set<PatientAppointment> getAll();
}
