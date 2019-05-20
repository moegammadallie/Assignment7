package ac.za.cput.project.factory.patientInfo;

import ac.za.cput.project.domain.patientInfo.PatientProgress;

public class PatientProgressFactory {
    public static PatientProgress getProgress(String progres){
        return new PatientProgress.Builder().progress(progres).build();
    }
}

