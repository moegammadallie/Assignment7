package service.billing.impl;

import domain.billing.MedicalAid;
import repository.billing.MedicalAidRepository;
import repository.billing.impl.MedicalAidRepositoryImpl;
import service.billing.MedicalAidService;

import java.util.HashSet;
import java.util.Objects;
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
