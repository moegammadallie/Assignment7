package repository;

import domain.billing.MedicalAid;

import java.util.Set;

public interface MedicalAidRepository extends IRepository<MedicalAid,String> {
    Set<MedicalAid> getAll();
}

