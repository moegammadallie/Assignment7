package repository;

import domain.services.MedicalAid;

import java.util.Set;

public interface MedicalAidRepository extends IRepository<MedicalAid,int> {
    Set<MedicalAid> getAll();
}

