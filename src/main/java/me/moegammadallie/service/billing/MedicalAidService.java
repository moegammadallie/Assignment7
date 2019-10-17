package me.moegammadallie.service.billing;

import me.moegammadallie.domain.billing.MedicalAid;
import me.moegammadallie.service.IService;
import me.moegammadallie.domain.billing.MedicalAid;

import java.util.Set;

public interface MedicalAidService extends IService<MedicalAid,String> {
    Set<MedicalAid> getAll();
}

