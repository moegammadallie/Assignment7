package ac.za.cput.project.service.patientInfo;

import ac.za.cput.project.domain.patientInfo.PatientAppointment;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface PatientAppointmentService extends IService<PatientAppointment,String> {
    Set<PatientAppointment> getAll();
}
