package ac.za.cput.project.repository.patientInfo.impl;

import ac.za.cput.project.domain.patientInfo.PatientDiagnosis;
import ac.za.cput.project.repository.patientInfo.PatientDiagnosisRepository;

import java.util.HashSet;
import java.util.Set;

public class PatientDiagnosisRepositoryImpl implements PatientDiagnosisRepository {
    private static  PatientDiagnosisRepositoryImpl repository = null;
    private Set<PatientDiagnosis>  PatientDiagnosisRepositorys;

    private PatientDiagnosisRepositoryImpl() {
        this.PatientDiagnosisRepositorys = new HashSet<>();
    }

    public static PatientDiagnosisRepository getRepository(){
        if(repository == null) repository = new PatientDiagnosisRepositoryImpl();
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
