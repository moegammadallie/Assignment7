package service.billing.impl;

import domain.billing.MedicalAid;
import service.billing.MedicalAidService;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class MedicalAidServiceImpl implements MedicalAidService {

    private static MedicalAidServiceImpl repository = null;
    private Set<MedicalAid> MedicalAidRepositorys;

    private MedicalAidServiceImpl() {
        this.MedicalAidRepositorys = new HashSet<>();
    }

    public static MedicalAidService getRepository(){
        if(repository == null) repository = new MedicalAidServiceImpl();
        return repository;
    }

    private MedicalAid findMedicalAid(String medAid){
        return this.MedicalAidRepositorys.stream()
                .filter(MedicalAid -> Objects.equals(MedicalAid.getMedicalAidNum(), MedicalAid)).findAny().orElse(null);
    }

    @Override
    public Set<MedicalAid> getAll() {
        return MedicalAidRepositorys;
    }

    @Override
    public MedicalAid create(MedicalAid medicalAid) {
        this.MedicalAidRepositorys.add(medicalAid);
        return medicalAid;
    }

    @Override
    public MedicalAid update(MedicalAid medicalAid) {
        String id = Integer.toString(medicalAid.getMedicalAidNum());
        MedicalAid pFind = findMedicalAid(id);
        MedicalAidRepositorys.remove(pFind);
        MedicalAidRepositorys.add(medicalAid);
        return null;
    }

    @Override
    public void delete(String s) {
        MedicalAid medicalAid = findMedicalAid(s);
        MedicalAidRepositorys.remove(medicalAid);
    }

    @Override
    public MedicalAid read(String s) {
        MedicalAid medicalAid = findMedicalAid(s);
        return medicalAid == null ? null : medicalAid;
    }


}
