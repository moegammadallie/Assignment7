package ac.za.cput.project.service.billing.impl;

import ac.za.cput.project.domain.billing.MedicalAid;
import ac.za.cput.project.repository.billing.MedicalAidRepository;
import ac.za.cput.project.repository.billing.impl.MedicalAidRepositoryImpl;
import ac.za.cput.project.service.billing.MedicalAidService;

import java.util.Set;

public class MedicalAidServiceImpl implements MedicalAidService {
    private static MedicalAidServiceImpl service = null;
    private MedicalAidRepository repository;

    private MedicalAidServiceImpl() {
        this.repository = MedicalAidRepositoryImpl.getRepository();
    }

    public static MedicalAidServiceImpl getService(){
        if(service == null) service = new MedicalAidServiceImpl();
        return service;
    }

    @Override
    public Set<MedicalAid> getAll() {
        return this.repository.getAll();
    }

    @Override
    public MedicalAid create(MedicalAid medicalAid) {
        return this.repository.create(medicalAid);
    }

    @Override
    public MedicalAid update(MedicalAid medicalAid) {
        return this.repository.update(medicalAid);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public MedicalAid read(String s) {
        return this.repository.read(s);
    }
}
