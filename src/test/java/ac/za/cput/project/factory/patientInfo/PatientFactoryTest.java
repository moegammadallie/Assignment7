package ac.za.cput.project.factory.patientInfo;

import ac.za.cput.project.domain.patientInfo.Patient;
import ac.za.cput.project.factory.patientInfo.PatientFactory;
import org.junit.Assert;
import org.junit.Test;

public class PatientFactoryTest {

    @Test
    public void getPatient() {
        String code = "ADP 2";
        Patient i = PatientFactory.getPatientID(code);
        System.out.println(i);
        Assert.assertNotNull(i.getPatientID());
    }
}