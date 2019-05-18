package repository.billing;

import domain.billing.MedicalAid;
import repository.IRepository;

import java.util.Set;

public interface MedicalAidRepository extends IRepository<MedicalAid,String> {
    Set<MedicalAid> getAll();
}

