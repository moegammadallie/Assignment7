package repository.patientInfo;

import domain.patientInfo.PatientAppointment;
import repository.IRepository;

import java.util.Set;

public interface PatientAppointmentRepository extends IRepository<PatientAppointment,String> {
    Set<PatientAppointment> getAll();
}
