package service.billing;

import domain.billing.MedicalAid;
import service.IService;

import java.util.Set;

public interface MedicalAidService extends IService<MedicalAid,String> {
    Set<MedicalAid> getAll();
}

