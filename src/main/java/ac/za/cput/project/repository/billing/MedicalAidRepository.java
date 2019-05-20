package ac.za.cput.project.repository.billing;

import ac.za.cput.project.domain.billing.MedicalAid;
import ac.za.cput.project.repository.IRepository;

import java.util.Set;

public interface MedicalAidRepository extends IRepository<MedicalAid,String> {
    Set<MedicalAid> getAll();
}

