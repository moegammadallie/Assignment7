package factory;

import domain.services.PatientDiagnosis;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatientDiagnosisFactoryTest {

    @Test
    public void getHospitalDiagnosed() {
        String code = "ADP 2";
        PatientDiagnosis i = PatientDiagnosisFactory.getHospitalDiagnosed(code);
        System.out.println(i);
        Assert.assertNotNull(i.getHospitalDiagnosed());
    }
}