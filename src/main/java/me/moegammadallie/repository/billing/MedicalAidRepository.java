package me.moegammadallie.repository.billing;

import me.moegammadallie.domain.billing.MedicalAid;
import me.moegammadallie.repository.IRepository;
import me.moegammadallie.domain.billing.MedicalAid;

import java.util.Set;

public interface MedicalAidRepository extends IRepository<MedicalAid,String> {
    Set<MedicalAid> getAll();
}

