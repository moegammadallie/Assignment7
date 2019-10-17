package me.moegammadallie.repository.patientInfo;

import me.moegammadallie.domain.patientInfo.PatientAppointment;
import me.moegammadallie.repository.IRepository;

import java.util.Set;

public interface PatientAppointmentRepository extends IRepository<PatientAppointment,String> {
    Set<PatientAppointment> getAll();
}
