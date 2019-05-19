package service.patientInfo.impl;

import domain.patientInfo.PatientDiagnosis;
import service.patientInfo.PatientDiagnosisService;

import java.util.HashSet;
import java.util.Set;

public class PatientDiagnosisServiceImpl implements PatientDiagnosisService {
    private static PatientDiagnosisServiceImpl repository = null;
    private Set<PatientDiagnosis>  PatientDiagnosisRepositorys;

    private PatientDiagnosisServiceImpl() {
        this.PatientDiagnosisRepositorys = new HashSet<>();
    }

    public static PatientDiagnosisService getRepository(){
        if(repository == null) repository = new PatientDiagnosisServiceImpl();
        return repository;
    }

    @Override
    public Set<PatientDiagnosis> getAll() {
        return PatientDiagnosisRepositorys;
    }

    @Override
    public PatientDiagnosis create(PatientDiagnosis patientDiagnosis) {
        this.PatientDiagnosisRepositorys.add(patientDiagnosis);
        return patientDiagnosis;
    }

    @Override
    public PatientDiagnosis update(PatientDiagnosis patientDiagnosis) {
        String id = patientDiagnosis.getDoctorDiagnosed();
        PatientDiagnosis pFind = findPatientDiagnosis(id);
        PatientDiagnosisRepositorys.remove(pFind);
        PatientDiagnosisRepositorys.add(patientDiagnosis);
        return null;
    }

    @Override
    public void delete(String s) {
        PatientDiagnosis patient = findPatientDiagnosis(s);
        PatientDiagnosisRepositorys.remove(patient);
    }

    private PatientDiagnosis findPatientDiagnosis(String patientDiagnosis){
        return this.PatientDiagnosisRepositorys.stream()
                .filter(PatientDiagnosis -> PatientDiagnosis.getDoctorDiagnosed().trim()
                        .equals(PatientDiagnosis)).findAny().orElse(null);
    }

    @Override
    public PatientDiagnosis read(String s) {
        PatientDiagnosis patientDiagnosis = findPatientDiagnosis(s);
        return patientDiagnosis == null ? null : patientDiagnosis;
    }
}
