package ac.za.cput.project.service.billing;

import ac.za.cput.project.domain.billing.MedicalAid;
import ac.za.cput.project.service.IService;

import java.util.Set;

public interface MedicalAidService extends IService<MedicalAid,String> {
    Set<MedicalAid> getAll();
}

