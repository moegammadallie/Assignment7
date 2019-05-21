package ac.za.cput.project.service.patientInfo.impl;

import ac.za.cput.project.domain.patientInfo.PatientRecovery;
import ac.za.cput.project.repository.patientInfo.PatientRecoveryRepository;
import ac.za.cput.project.repository.patientInfo.impl.PatientRecoveryRepositoryImpl;
import ac.za.cput.project.service.patientInfo.PatientRecoveryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service("PatientRecoveryServiceImpl")
public class PatientRecoveryServiceImpl implements PatientRecoveryService {

    private static PatientRecoveryServiceImpl service = null;
    private PatientRecoveryRepository repository;

    private PatientRecoveryServiceImpl() {
        this.repository = PatientRecoveryRepositoryImpl.getRepository();
    }

    public static PatientRecoveryServiceImpl getService(){
        if(service == null) service = new PatientRecoveryServiceImpl();
        return service;
    }

    @Override
    public Set<PatientRecovery> getAll() {
        return this.repository.getAll();
    }

    @Override
    public PatientRecovery create(PatientRecovery pr) {
        return this.repository.create(pr);
    }

    @Override
    public PatientRecovery update(PatientRecovery pr) {
        return this.repository.update(pr);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public PatientRecovery read(String s) {
        return this.repository.read(s);
    }
}
