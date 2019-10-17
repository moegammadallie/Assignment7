package me.moegammadallie.factory.patientInfo;

import me.moegammadallie.domain.patientInfo.PatientDiagnosis;

import java.util.Date;

public class PatientDiagnosisFactory {
    public static PatientDiagnosis getDateOfDiagnosis(Date dateOfDiagnosis){
        return new PatientDiagnosis.Builder().dateOfDiagnosis(dateOfDiagnosis).build();
    }

    public static PatientDiagnosis getHospitalDiagnosed(String hospitalDiagnosed){
        return new PatientDiagnosis.Builder().hospitalDiagnosed(hospitalDiagnosed).build();
    }

    public static PatientDiagnosis getDoctorDiagnosed(String doctorDiagnosed){
        return new PatientDiagnosis.Builder().doctorDiagnosed(doctorDiagnosed).build();
    }
}


