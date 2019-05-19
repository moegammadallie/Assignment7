package service.patientInfo;

import domain.patientInfo.PatientAppointment;
import service.IService;

import java.util.Set;

public interface PatientAppointmentService extends IService<PatientAppointment,String> {
    Set<PatientAppointment> getAll();
}
