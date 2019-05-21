package ac.za.cput.project.service.patientInfo.impl;

import ac.za.cput.project.domain.patientInfo.PatientProgress;
import ac.za.cput.project.repository.patientInfo.PatientProgressRepository;
import ac.za.cput.project.repository.patientInfo.impl.PatientProgressRepositoryImpl;
import ac.za.cput.project.service.patientInfo.PatientProgressService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service("PatientProgressServiceImpl")
public class PatientProgressServiceImpl implements PatientProgressService {

    private static PatientProgressServiceImpl service = null;
    private PatientProgressRepository repository;

    private PatientProgressServiceImpl() {
        this.repository = PatientProgressRepositoryImpl.getRepository();
    }

    public static PatientProgressServiceImpl getService(){
        if(service == null) service = new PatientProgressServiceImpl();
        return service;
    }

    @Override
    public Set<PatientProgress> getAll() {
        return this.repository.getAll();
    }

    @Override
    public PatientProgress create(PatientProgress patientProgress) {
        return this.repository.create(patientProgress);
    }

    @Override
    public PatientProgress update(PatientProgress patientProgress) {
        return this.repository.update(patientProgress);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public PatientProgress read(String s) {
        return this.repository.read(s);
    }
}
