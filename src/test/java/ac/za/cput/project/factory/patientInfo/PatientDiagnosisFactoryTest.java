package ac.za.cput.project.factory.patientInfo;

import ac.za.cput.project.domain.patientInfo.PatientDiagnosis;
import ac.za.cput.project.factory.patientInfo.PatientDiagnosisFactory;
import org.junit.Assert;
import org.junit.Test;

public class PatientDiagnosisFactoryTest {

    @Test
    public void getHospitalDiagnosed() {
        String code = "ADP 2";
        PatientDiagnosis i = PatientDiagnosisFactory.getHospitalDiagnosed(code);
        System.out.println(i);
        Assert.assertNotNull(i.getHospitalDiagnosed());
    }
}