package ac.za.cput.project.repository.patientInfo;

import ac.za.cput.project.domain.patientInfo.PatientAppointment;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface PatientAppointmentRepository extends IRepository<PatientAppointment,String> {
    Set<PatientAppointment> getAll();
}
