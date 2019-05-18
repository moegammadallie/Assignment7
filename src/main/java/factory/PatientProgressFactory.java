package factory;

import domain.patientInfo.PatientProgress;

public class PatientProgressFactory {
    public static PatientProgress getProgress(String progres){
        return new PatientProgress.Builder().progress(progres).build();
    }
}

